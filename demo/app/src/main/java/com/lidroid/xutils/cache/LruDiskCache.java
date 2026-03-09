package com.lidroid.xutils.cache;

import com.anythink.expressad.exoplayer.C1500b;
import com.lidroid.xutils.util.IOUtils;
import com.lidroid.xutils.util.LogUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public final class LruDiskCache implements Closeable {
    public static final long ANY_SEQUENCE_NUMBER = -1;
    private static final char CLEAN = 'C';
    private static final char DELETE = 'D';
    private static final char EXPIRY_PREFIX = 't';
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.lidroid.xutils.cache.LruDiskCache.2
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };
    private static final char READ = 'R';
    private static final char UPDATE = 'U';
    public static final String VERSION = "1";
    private final int appVersion;
    private final File directory;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private Writer journalWriter;
    private long maxSize;
    private int redundantOpCount;
    private final int valueCount;
    private long size = 0;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long nextSequenceNumber = 0;
    public final ThreadPoolExecutor executorService = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> cleanupCallable = new Callable<Void>() { // from class: com.lidroid.xutils.cache.LruDiskCache.1
        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (LruDiskCache.this) {
                if (LruDiskCache.this.journalWriter == null) {
                    return null;
                }
                LruDiskCache.this.trimToSize();
                if (LruDiskCache.this.journalRebuildRequired()) {
                    LruDiskCache.this.rebuildJournal();
                    LruDiskCache.this.redundantOpCount = 0;
                }
                return null;
            }
        }
    };
    private FileNameGenerator fileNameGenerator = new MD5FileNameGenerator();

    public final class Editor {
        private boolean committed;
        private final Entry entry;
        private boolean hasErrors;
        private final boolean[] written;

        public class FaultHidingOutputStream extends FilterOutputStream {
            private FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
            }

            public /* synthetic */ FaultHidingOutputStream(Editor editor, OutputStream outputStream, FaultHidingOutputStream faultHidingOutputStream) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (Throwable unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (Throwable unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (Throwable unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                    ((FilterOutputStream) this).out.flush();
                } catch (Throwable unused) {
                    Editor.this.hasErrors = true;
                }
            }
        }

        private Editor(Entry entry) {
            this.entry = entry;
            this.written = entry.readable ? null : new boolean[LruDiskCache.this.valueCount];
        }

        public /* synthetic */ Editor(LruDiskCache lruDiskCache, Entry entry, Editor editor) {
            this(entry);
        }

        public final void abort() throws IOException {
            LruDiskCache.this.completeEdit(this, false);
        }

        public final void abortUnlessCommitted() {
            if (this.committed) {
                return;
            }
            try {
                abort();
            } catch (Throwable unused) {
            }
        }

        public final void commit() throws IOException {
            if (this.hasErrors) {
                LruDiskCache.this.completeEdit(this, false);
                LruDiskCache.this.removeByDiskKey(this.entry.diskKey);
            } else {
                LruDiskCache.this.completeEdit(this, true);
            }
            this.committed = true;
        }

        public final String getString(int i) throws IOException {
            InputStream inputStreamNewInputStream = newInputStream(i);
            if (inputStreamNewInputStream != null) {
                return LruDiskCache.inputStreamToString(inputStreamNewInputStream);
            }
            return null;
        }

        public final InputStream newInputStream(int i) throws IOException {
            synchronized (LruDiskCache.this) {
                if (this.entry.currentEditor != this) {
                    throw new IllegalStateException();
                }
                if (!this.entry.readable) {
                    return null;
                }
                try {
                    return new FileInputStream(this.entry.getCleanFile(i));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public final OutputStream newOutputStream(int i) throws IOException {
            FileOutputStream fileOutputStream;
            FaultHidingOutputStream faultHidingOutputStream;
            synchronized (LruDiskCache.this) {
                if (this.entry.currentEditor != this) {
                    throw new IllegalStateException();
                }
                if (!this.entry.readable) {
                    this.written[i] = true;
                }
                File dirtyFile = this.entry.getDirtyFile(i);
                try {
                    fileOutputStream = new FileOutputStream(dirtyFile);
                } catch (FileNotFoundException unused) {
                    LruDiskCache.this.directory.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(dirtyFile);
                    } catch (FileNotFoundException unused2) {
                        return LruDiskCache.NULL_OUTPUT_STREAM;
                    }
                }
                faultHidingOutputStream = new FaultHidingOutputStream(this, fileOutputStream, null);
            }
            return faultHidingOutputStream;
        }

        public final void set(int i, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                outputStreamWriter = new OutputStreamWriter(newOutputStream(i), "UTF-8");
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStreamWriter.write(str);
                IOUtils.closeQuietly(outputStreamWriter);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                IOUtils.closeQuietly(outputStreamWriter2);
                throw th;
            }
        }

        public final void setEntryExpiryTimestamp(long j) {
            this.entry.expiryTimestamp = j;
        }
    }

    public final class Entry {
        private Editor currentEditor;
        private final String diskKey;
        private long expiryTimestamp;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;

        private Entry(String str) {
            this.expiryTimestamp = Long.MAX_VALUE;
            this.diskKey = str;
            this.lengths = new long[LruDiskCache.this.valueCount];
        }

        public /* synthetic */ Entry(LruDiskCache lruDiskCache, String str, Entry entry) {
            this(str);
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLengths(String[] strArr, int i) throws IOException {
            if (strArr.length - i != LruDiskCache.this.valueCount) {
                throw invalidLengths(strArr);
            }
            for (int i2 = 0; i2 < LruDiskCache.this.valueCount; i2++) {
                try {
                    this.lengths[i2] = Long.parseLong(strArr[i2 + i]);
                } catch (NumberFormatException unused) {
                    throw invalidLengths(strArr);
                }
            }
        }

        public final File getCleanFile(int i) {
            return new File(LruDiskCache.this.directory, String.valueOf(this.diskKey) + "." + i);
        }

        public final File getDirtyFile(int i) {
            return new File(LruDiskCache.this.directory, String.valueOf(this.diskKey) + "." + i + ".tmp");
        }

        public final String getLengths() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.lengths) {
                sb.append(C4196o4.OooO00o.OooO0Oo);
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class Snapshot implements Closeable {
        private final String diskKey;
        private final FileInputStream[] ins;
        private final long[] lengths;
        private final long sequenceNumber;

        private Snapshot(String str, long j, FileInputStream[] fileInputStreamArr, long[] jArr) {
            this.diskKey = str;
            this.sequenceNumber = j;
            this.ins = fileInputStreamArr;
            this.lengths = jArr;
        }

        public /* synthetic */ Snapshot(LruDiskCache lruDiskCache, String str, long j, FileInputStream[] fileInputStreamArr, long[] jArr, Snapshot snapshot) {
            this(str, j, fileInputStreamArr, jArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (FileInputStream fileInputStream : this.ins) {
                IOUtils.closeQuietly(fileInputStream);
            }
        }

        public final Editor edit() throws IOException {
            return LruDiskCache.this.editByDiskKey(this.diskKey, this.sequenceNumber);
        }

        public final FileInputStream getInputStream(int i) {
            return this.ins[i];
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final String getString(int i) throws IOException {
            return LruDiskCache.inputStreamToString(getInputStream(i));
        }
    }

    public class StrictLineReader implements Closeable {

        /* JADX INFO: renamed from: CR */
        private static final byte f16635CR = 13;

        /* JADX INFO: renamed from: LF */
        private static final byte f16636LF = 10;
        private byte[] buf;
        private final Charset charset;
        private int end;

        /* JADX INFO: renamed from: in */
        private final InputStream f16637in;
        private int pos;

        public StrictLineReader(LruDiskCache lruDiskCache, InputStream inputStream) {
            this(inputStream, 8192);
        }

        public StrictLineReader(InputStream inputStream, int i) {
            this.charset = Charset.forName(C1500b.f7493i);
            Objects.requireNonNull(inputStream);
            if (i < 0) {
                throw new IllegalArgumentException("capacity <= 0");
            }
            this.f16637in = inputStream;
            this.buf = new byte[i];
        }

        private void fillBuf() throws IOException {
            InputStream inputStream = this.f16637in;
            byte[] bArr = this.buf;
            int i = inputStream.read(bArr, 0, bArr.length);
            if (i == -1) {
                throw new EOFException();
            }
            this.pos = 0;
            this.end = i;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (this.f16637in) {
                if (this.buf != null) {
                    this.buf = null;
                    this.f16637in.close();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String readLine() throws java.io.IOException {
            /*
                r7 = this;
                java.io.InputStream r0 = r7.f16637in
                monitor-enter(r0)
                byte[] r1 = r7.buf     // Catch: java.lang.Throwable -> L8f
                if (r1 == 0) goto L87
                int r1 = r7.pos     // Catch: java.lang.Throwable -> L8f
                int r2 = r7.end     // Catch: java.lang.Throwable -> L8f
                if (r1 < r2) goto L10
                r7.fillBuf()     // Catch: java.lang.Throwable -> L8f
            L10:
                int r1 = r7.pos     // Catch: java.lang.Throwable -> L8f
            L12:
                int r2 = r7.end     // Catch: java.lang.Throwable -> L8f
                r3 = 10
                if (r1 != r2) goto L5a
                com.lidroid.xutils.cache.LruDiskCache$StrictLineReader$1 r1 = new com.lidroid.xutils.cache.LruDiskCache$StrictLineReader$1     // Catch: java.lang.Throwable -> L8f
                int r2 = r7.end     // Catch: java.lang.Throwable -> L8f
                int r4 = r7.pos     // Catch: java.lang.Throwable -> L8f
                int r2 = r2 - r4
                int r2 = r2 + 80
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L8f
            L24:
                byte[] r2 = r7.buf     // Catch: java.lang.Throwable -> L8f
                int r4 = r7.pos     // Catch: java.lang.Throwable -> L8f
                int r5 = r7.end     // Catch: java.lang.Throwable -> L8f
                int r5 = r5 - r4
                r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L8f
                r2 = -1
                r7.end = r2     // Catch: java.lang.Throwable -> L8f
                r7.fillBuf()     // Catch: java.lang.Throwable -> L8f
                int r2 = r7.pos     // Catch: java.lang.Throwable -> L8f
            L36:
                int r4 = r7.end     // Catch: java.lang.Throwable -> L8f
                if (r2 != r4) goto L3b
                goto L24
            L3b:
                byte[] r4 = r7.buf     // Catch: java.lang.Throwable -> L8f
                r5 = r4[r2]     // Catch: java.lang.Throwable -> L8f
                if (r5 != r3) goto L57
                int r3 = r7.pos     // Catch: java.lang.Throwable -> L8f
                if (r2 == r3) goto L4a
                int r5 = r2 - r3
                r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L8f
            L4a:
                r1.flush()     // Catch: java.lang.Throwable -> L8f
                int r2 = r2 + 1
                r7.pos = r2     // Catch: java.lang.Throwable -> L8f
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8f
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
                return r1
            L57:
                int r2 = r2 + 1
                goto L36
            L5a:
                byte[] r2 = r7.buf     // Catch: java.lang.Throwable -> L8f
                r4 = r2[r1]     // Catch: java.lang.Throwable -> L8f
                if (r4 != r3) goto L84
                int r3 = r7.pos     // Catch: java.lang.Throwable -> L8f
                if (r1 == r3) goto L6d
                int r3 = r1 + (-1)
                r2 = r2[r3]     // Catch: java.lang.Throwable -> L8f
                r4 = 13
                if (r2 != r4) goto L6d
                goto L6e
            L6d:
                r3 = r1
            L6e:
                java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L8f
                byte[] r4 = r7.buf     // Catch: java.lang.Throwable -> L8f
                int r5 = r7.pos     // Catch: java.lang.Throwable -> L8f
                int r3 = r3 - r5
                java.nio.charset.Charset r6 = r7.charset     // Catch: java.lang.Throwable -> L8f
                java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L8f
                r2.<init>(r4, r5, r3, r6)     // Catch: java.lang.Throwable -> L8f
                int r1 = r1 + 1
                r7.pos = r1     // Catch: java.lang.Throwable -> L8f
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
                return r2
            L84:
                int r1 = r1 + 1
                goto L12
            L87:
                java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L8f
                java.lang.String r2 = "LineReader is closed"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L8f
                throw r1     // Catch: java.lang.Throwable -> L8f
            L8f:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lidroid.xutils.cache.LruDiskCache.StrictLineReader.readLine():java.lang.String");
        }
    }

    private LruDiskCache(File file, int i, int i2, long j) {
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
        this.valueCount = i2;
        this.maxSize = j;
    }

    private void checkNotClosed() {
        if (this.journalWriter == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void completeEdit(Editor editor, boolean z) throws IOException {
        Entry entry = editor.entry;
        if (entry.currentEditor != editor) {
            throw new IllegalStateException();
        }
        if (z && !entry.readable) {
            for (int i = 0; i < this.valueCount; i++) {
                if (!editor.written[i]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                }
                if (!entry.getDirtyFile(i).exists()) {
                    editor.abort();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.valueCount; i2++) {
            File dirtyFile = entry.getDirtyFile(i2);
            if (!z) {
                deleteIfExists(dirtyFile);
            } else if (dirtyFile.exists()) {
                File cleanFile = entry.getCleanFile(i2);
                dirtyFile.renameTo(cleanFile);
                long j = entry.lengths[i2];
                long length = cleanFile.length();
                entry.lengths[i2] = length;
                this.size = (this.size - j) + length;
            }
        }
        this.redundantOpCount++;
        entry.currentEditor = null;
        if (entry.readable || z) {
            entry.readable = true;
            this.journalWriter.write("C " + entry.diskKey + " t" + entry.expiryTimestamp + entry.getLengths() + '\n');
            if (z) {
                long j2 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j2;
                entry.sequenceNumber = j2;
            }
        } else {
            this.lruEntries.remove(entry.diskKey);
            this.journalWriter.write("D " + entry.diskKey + '\n');
        }
        this.journalWriter.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            this.executorService.submit(this.cleanupCallable);
        }
    }

    private static void deleteContents(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                deleteContents(file2);
            }
            if (file2.exists() && !file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
            }
        }
    }

    private static void deleteIfExists(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Editor editByDiskKey(String str, long j) throws IOException {
        checkNotClosed();
        Entry entry = this.lruEntries.get(str);
        Entry entry2 = null;
        byte b = 0;
        if (j != -1 && (entry == null || entry.sequenceNumber != j)) {
            return null;
        }
        if (entry == null) {
            entry = new Entry(this, str, entry2);
            this.lruEntries.put(str, entry);
        } else if (entry.currentEditor != null) {
            return null;
        }
        Editor editor = new Editor(this, entry, b == true ? 1 : 0);
        entry.currentEditor = editor;
        this.journalWriter.write("U " + str + '\n');
        this.journalWriter.flush();
        return editor;
    }

    private synchronized Snapshot getByDiskKey(String str) throws IOException {
        checkNotClosed();
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        if (!entry.readable) {
            return null;
        }
        int i = 0;
        if (entry.expiryTimestamp < System.currentTimeMillis()) {
            while (i < this.valueCount) {
                File cleanFile = entry.getCleanFile(i);
                if (cleanFile.exists() && !cleanFile.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(cleanFile)));
                }
                this.size -= entry.lengths[i];
                entry.lengths[i] = 0;
                i++;
            }
            this.redundantOpCount++;
            this.journalWriter.append((CharSequence) ("D " + str + '\n'));
            this.lruEntries.remove(str);
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return null;
        }
        FileInputStream[] fileInputStreamArr = new FileInputStream[this.valueCount];
        for (int i2 = 0; i2 < this.valueCount; i2++) {
            try {
                fileInputStreamArr[i2] = new FileInputStream(entry.getCleanFile(i2));
            } catch (FileNotFoundException unused) {
                while (i < this.valueCount && fileInputStreamArr[i] != null) {
                    IOUtils.closeQuietly(fileInputStreamArr[i]);
                    i++;
                }
                return null;
            }
        }
        this.redundantOpCount++;
        this.journalWriter.append((CharSequence) ("R " + str + '\n'));
        if (journalRebuildRequired()) {
            this.executorService.submit(this.cleanupCallable);
        }
        return new Snapshot(this, str, entry.sequenceNumber, fileInputStreamArr, entry.lengths, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String inputStreamToString(InputStream inputStream) throws IOException {
        return readFully(new InputStreamReader(inputStream, "UTF-8"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    public static LruDiskCache open(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                renameTo(file2, file3, false);
            }
        }
        LruDiskCache lruDiskCache = new LruDiskCache(file, i, i2, j);
        if (lruDiskCache.journalFile.exists()) {
            try {
                lruDiskCache.readJournal();
                lruDiskCache.processJournal();
                lruDiskCache.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(lruDiskCache.journalFile, true), C1500b.f7493i));
                return lruDiskCache;
            } catch (Throwable th) {
                LogUtils.m13791e("DiskLruCache " + file + " is corrupt: " + th.getMessage() + ", removing", th);
                lruDiskCache.delete();
            }
        }
        if (!file.exists() && !file.mkdirs()) {
            return lruDiskCache;
        }
        LruDiskCache lruDiskCache2 = new LruDiskCache(file, i, i2, j);
        lruDiskCache2.rebuildJournal();
        return lruDiskCache2;
    }

    private void processJournal() throws IOException {
        deleteIfExists(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            } else {
                next.currentEditor = null;
                while (i < this.valueCount) {
                    deleteIfExists(next.getCleanFile(i));
                    deleteIfExists(next.getDirtyFile(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private static String readFully(Reader reader) throws Throwable {
        StringWriter stringWriter;
        Throwable th;
        try {
            stringWriter = new StringWriter();
        } catch (Throwable th2) {
            stringWriter = null;
            th = th2;
        }
        try {
            char[] cArr = new char[1024];
            while (true) {
                int i = reader.read(cArr);
                if (i == -1) {
                    String string = stringWriter.toString();
                    IOUtils.closeQuietly(reader);
                    IOUtils.closeQuietly(stringWriter);
                    return string;
                }
                stringWriter.write(cArr, 0, i);
            }
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly(stringWriter);
            throw th;
        }
    }

    private void readJournal() throws Throwable {
        StrictLineReader strictLineReader;
        StrictLineReader strictLineReader2 = null;
        try {
            strictLineReader = new StrictLineReader(this, new FileInputStream(this.journalFile));
        } catch (Throwable th) {
            th = th;
        }
        try {
            String line = strictLineReader.readLine();
            String line2 = strictLineReader.readLine();
            String line3 = strictLineReader.readLine();
            String line4 = strictLineReader.readLine();
            String line5 = strictLineReader.readLine();
            if (!"libcore.io.DiskLruCache".equals(line) || !"1".equals(line2) || !Integer.toString(this.appVersion).equals(line3) || !Integer.toString(this.valueCount).equals(line4) || !"".equals(line5)) {
                throw new IOException("unexpected journal header: [" + line + ", " + line2 + ", " + line4 + ", " + line5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(strictLineReader.readLine());
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    IOUtils.closeQuietly(strictLineReader);
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            strictLineReader2 = strictLineReader;
            IOUtils.closeQuietly(strictLineReader2);
            throw th;
        }
    }

    private void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != 1) {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
        }
        char cCharAt = str.charAt(0);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (cCharAt == 'D') {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        Entry entry = this.lruEntries.get(strSubstring);
        Entry entry2 = null;
        byte b = 0;
        if (entry == null) {
            entry = new Entry(this, strSubstring, entry2);
            this.lruEntries.put(strSubstring, entry);
        }
        if (cCharAt != 'C') {
            if (cCharAt != 'R') {
                if (cCharAt != 'U') {
                    throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
                }
                entry.currentEditor = new Editor(this, entry, b == true ? 1 : 0);
                return;
            }
            return;
        }
        entry.readable = true;
        entry.currentEditor = null;
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(C4196o4.OooO00o.OooO0Oo);
        if (strArrSplit.length > 0) {
            if (strArrSplit[0].charAt(0) == 't') {
                entry.expiryTimestamp = Long.valueOf(strArrSplit[0].substring(1)).longValue();
                entry.setLengths(strArrSplit, 1);
            } else {
                entry.expiryTimestamp = Long.MAX_VALUE;
                entry.setLengths(strArrSplit, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void rebuildJournal() throws IOException {
        BufferedWriter bufferedWriter;
        Throwable th;
        Writer writer = this.journalWriter;
        if (writer != null) {
            IOUtils.closeQuietly(writer);
        }
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), C1500b.f7493i));
        } catch (Throwable th2) {
            bufferedWriter = null;
            th = th2;
        }
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.appVersion));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.valueCount));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (Entry entry : this.lruEntries.values()) {
                bufferedWriter.write(entry.currentEditor != null ? "U " + entry.diskKey + '\n' : "C " + entry.diskKey + " t" + entry.expiryTimestamp + entry.getLengths() + '\n');
            }
            IOUtils.closeQuietly(bufferedWriter);
            if (this.journalFile.exists()) {
                renameTo(this.journalFile, this.journalFileBackup, true);
            }
            renameTo(this.journalFileTmp, this.journalFile, false);
            this.journalFileBackup.delete();
            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), C1500b.f7493i));
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly(bufferedWriter);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean removeByDiskKey(String str) throws IOException {
        checkNotClosed();
        Entry entry = this.lruEntries.get(str);
        if (entry != null && entry.currentEditor == null) {
            for (int i = 0; i < this.valueCount; i++) {
                File cleanFile = entry.getCleanFile(i);
                if (cleanFile.exists() && !cleanFile.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(cleanFile)));
                }
                this.size -= entry.lengths[i];
                entry.lengths[i] = 0;
            }
            this.redundantOpCount++;
            this.journalWriter.append((CharSequence) ("D " + str + '\n'));
            this.lruEntries.remove(str);
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return true;
        }
        return false;
    }

    private static void renameTo(File file, File file2, boolean z) throws IOException {
        if (z) {
            deleteIfExists(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            removeByDiskKey(this.lruEntries.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.journalWriter == null) {
            return;
        }
        for (Entry entry : new ArrayList(this.lruEntries.values())) {
            if (entry.currentEditor != null) {
                entry.currentEditor.abort();
            }
        }
        trimToSize();
        this.journalWriter.close();
        this.journalWriter = null;
    }

    public final void delete() throws IOException {
        IOUtils.closeQuietly(this);
        deleteContents(this.directory);
    }

    public final Editor edit(String str) throws IOException {
        return editByDiskKey(this.fileNameGenerator.generate(str), -1L);
    }

    public final synchronized void flush() throws IOException {
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
    }

    public final Snapshot get(String str) throws IOException {
        return getByDiskKey(this.fileNameGenerator.generate(str));
    }

    public final File getCacheFile(String str, int i) {
        String strGenerate = this.fileNameGenerator.generate(str);
        File file = new File(this.directory, String.valueOf(strGenerate) + "." + i);
        if (file.exists()) {
            return file;
        }
        try {
            remove(str);
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final synchronized long getExpiryTimestamp(String str) throws IOException {
        String strGenerate = this.fileNameGenerator.generate(str);
        checkNotClosed();
        Entry entry = this.lruEntries.get(strGenerate);
        if (entry == null) {
            return 0L;
        }
        return entry.expiryTimestamp;
    }

    public final FileNameGenerator getFileNameGenerator() {
        return this.fileNameGenerator;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final synchronized boolean isClosed() {
        return this.journalWriter == null;
    }

    public final boolean remove(String str) throws IOException {
        return removeByDiskKey(this.fileNameGenerator.generate(str));
    }

    public final void setFileNameGenerator(FileNameGenerator fileNameGenerator) {
        if (fileNameGenerator != null) {
            this.fileNameGenerator = fileNameGenerator;
        }
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        this.executorService.submit(this.cleanupCallable);
    }

    public final synchronized long size() {
        return this.size;
    }
}
