package com.anythink.core.common.res;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.core.common.res.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1374a implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final String f5474a = "journal";

    /* JADX INFO: renamed from: b */
    public static final String f5475b = "journal.tmp";

    /* JADX INFO: renamed from: c */
    public static final String f5476c = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: d */
    public static final String f5477d = "1";

    /* JADX INFO: renamed from: e */
    public static final long f5478e = -1;

    /* JADX INFO: renamed from: f */
    private static final String f5479f = "CLEAN";

    /* JADX INFO: renamed from: g */
    private static final String f5480g = "DIRTY";

    /* JADX INFO: renamed from: h */
    private static final String f5481h = "REMOVE";

    /* JADX INFO: renamed from: i */
    private static final String f5482i = "READ";

    /* JADX INFO: renamed from: j */
    private static final Charset f5483j = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: k */
    private static final int f5484k = 8192;

    /* JADX INFO: renamed from: l */
    private final File f5485l;

    /* JADX INFO: renamed from: m */
    private final File f5486m;

    /* JADX INFO: renamed from: n */
    private final File f5487n;

    /* JADX INFO: renamed from: p */
    private final long f5489p;

    /* JADX INFO: renamed from: s */
    private Writer f5492s;

    /* JADX INFO: renamed from: u */
    private int f5494u;

    /* JADX INFO: renamed from: r */
    private long f5491r = 0;

    /* JADX INFO: renamed from: t */
    private final LinkedHashMap<String, b> f5493t = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: v */
    private long f5495v = 0;

    /* JADX INFO: renamed from: w */
    private final ExecutorService f5496w = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: x */
    private final Callable<Void> f5497x = new Callable<Void>() { // from class: com.anythink.core.common.res.a.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C1374a.this) {
                if (C1374a.this.f5492s == null) {
                    return null;
                }
                C1374a.this.m4433l();
                if (C1374a.this.m4429h()) {
                    C1374a.this.m4419d();
                    C1374a.m4422e(C1374a.this);
                }
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: o */
    private final int f5488o = 1;

    /* JADX INFO: renamed from: q */
    private final int f5490q = 1;

    /* JADX INFO: renamed from: com.anythink.core.common.res.a$a */
    public final class a {

        /* JADX INFO: renamed from: b */
        private final b f5500b;

        /* JADX INFO: renamed from: c */
        private boolean f5501c;

        /* JADX INFO: renamed from: com.anythink.core.common.res.a$a$a, reason: collision with other inner class name */
        public class C4668a extends FilterOutputStream {
            private C4668a(OutputStream outputStream) {
                super(outputStream);
            }

            public /* synthetic */ C4668a(a aVar, OutputStream outputStream, byte b) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    a.m4442b(a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    a.m4442b(a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    a.m4442b(a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    a.m4442b(a.this);
                }
            }
        }

        private a(b bVar) {
            this.f5500b = bVar;
        }

        public /* synthetic */ a(C1374a c1374a, b bVar, byte b) {
            this(bVar);
        }

        /* JADX INFO: renamed from: a */
        private void m4440a(int i, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                outputStreamWriter = new OutputStreamWriter(m4444a(i), C1374a.f5483j);
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStreamWriter.write(str);
                C1374a.m4409a(outputStreamWriter);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                C1374a.m4409a(outputStreamWriter2);
                throw th;
            }
        }

        /* JADX INFO: renamed from: b */
        private InputStream m4441b(int i) {
            synchronized (C1374a.this) {
                if (this.f5500b.f5507e != this) {
                    throw new IllegalStateException();
                }
                if (!this.f5500b.f5506d) {
                    return null;
                }
                return new FileInputStream(this.f5500b.m4458a(i));
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m4442b(a aVar) {
            aVar.f5501c = true;
            return true;
        }

        /* JADX INFO: renamed from: c */
        private String m4443c(int i) {
            InputStream inputStreamM4441b = m4441b(i);
            if (inputStreamM4441b != null) {
                return C1374a.m4404a(inputStreamM4441b);
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public final OutputStream m4444a(int i) {
            C4668a c4668a;
            synchronized (C1374a.this) {
                if (this.f5500b.f5507e != this) {
                    throw new IllegalStateException();
                }
                c4668a = new C4668a(this, new FileOutputStream(this.f5500b.m4460b(i)), (byte) 0);
            }
            return c4668a;
        }

        /* JADX INFO: renamed from: a */
        public final void m4445a() {
            if (!this.f5501c) {
                C1374a.this.m4407a(this, true);
            } else {
                C1374a.this.m4407a(this, false);
                C1374a.this.m4437c(this.f5500b.f5504b);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m4446b() {
            C1374a.this.m4407a(this, false);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.res.a$b */
    public final class b {

        /* JADX INFO: renamed from: b */
        private final String f5504b;

        /* JADX INFO: renamed from: c */
        private final long[] f5505c;

        /* JADX INFO: renamed from: d */
        private boolean f5506d;

        /* JADX INFO: renamed from: e */
        private a f5507e;

        /* JADX INFO: renamed from: f */
        private long f5508f;

        private b(String str) {
            this.f5504b = str;
            this.f5505c = new long[C1374a.this.f5490q];
        }

        public /* synthetic */ b(C1374a c1374a, String str, byte b) {
            this(str);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m4449a(b bVar, String[] strArr) throws IOException {
            if (strArr.length != C1374a.this.f5490q) {
                throw m4453b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    bVar.f5505c[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m4453b(strArr);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private void m4450a(String[] strArr) throws IOException {
            if (strArr.length != C1374a.this.f5490q) {
                throw m4453b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f5505c[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m4453b(strArr);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m4451a(b bVar) {
            bVar.f5506d = true;
            return true;
        }

        /* JADX INFO: renamed from: b */
        private static IOException m4453b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: renamed from: a */
        public final File m4458a(int i) {
            return new File(C1374a.this.f5485l, this.f5504b + "." + i);
        }

        /* JADX INFO: renamed from: a */
        public final String m4459a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f5505c) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: b */
        public final File m4460b(int i) {
            return new File(C1374a.this.f5485l, this.f5504b + "." + i + ".tmp");
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.res.a$c */
    public final class c implements Closeable {

        /* JADX INFO: renamed from: b */
        private final String f5510b;

        /* JADX INFO: renamed from: c */
        private final long f5511c;

        /* JADX INFO: renamed from: d */
        private final InputStream[] f5512d;

        private c(String str, long j, InputStream[] inputStreamArr) {
            this.f5510b = str;
            this.f5511c = j;
            this.f5512d = inputStreamArr;
        }

        public /* synthetic */ c(C1374a c1374a, String str, long j, InputStream[] inputStreamArr, byte b) {
            this(str, j, inputStreamArr);
        }

        /* JADX INFO: renamed from: a */
        private String m4461a(int i) {
            return C1374a.m4404a(this.f5512d[i]);
        }

        /* JADX INFO: renamed from: b */
        private a m4462b() {
            return C1374a.this.m4401a(this.f5510b, this.f5511c);
        }

        /* JADX INFO: renamed from: a */
        public final InputStream m4463a() {
            return this.f5512d[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f5512d) {
                C1374a.m4409a((Closeable) inputStream);
            }
        }
    }

    private C1374a(File file, long j) {
        this.f5485l = file;
        this.f5486m = new File(file, "journal");
        this.f5487n = new File(file, "journal.tmp");
        this.f5489p = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized a m4401a(String str, long j) {
        m4431j();
        m4424e(str);
        b bVar = this.f5493t.get(str);
        if (j != -1 && (bVar == null || bVar.f5508f != j)) {
            return null;
        }
        byte b2 = 0;
        if (bVar == null) {
            bVar = new b(this, str, b2);
            this.f5493t.put(str, bVar);
        } else if (bVar.f5507e != null) {
            return null;
        }
        a aVar = new a(this, bVar, b2);
        bVar.f5507e = aVar;
        this.f5492s.write("DIRTY " + str + '\n');
        this.f5492s.flush();
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public static C1374a m4402a(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        C1374a c1374a = new C1374a(file, j);
        if (c1374a.f5486m.exists()) {
            try {
                c1374a.m4413b();
                c1374a.m4417c();
                c1374a.f5492s = new BufferedWriter(new FileWriter(c1374a.f5486m, true), 8192);
                return c1374a;
            } catch (IOException unused) {
                c1374a.close();
                m4410a(c1374a.f5485l);
            }
        }
        file.mkdirs();
        C1374a c1374a2 = new C1374a(file, j);
        c1374a2.m4419d();
        return c1374a2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m4404a(InputStream inputStream) {
        return m4405a((Reader) new InputStreamReader(inputStream, f5483j));
    }

    /* JADX INFO: renamed from: a */
    private static String m4405a(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i = reader.read(cArr);
                if (i == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i);
            }
        } finally {
            reader.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m4407a(a aVar, boolean z) {
        b bVar = aVar.f5500b;
        if (bVar.f5507e != aVar) {
            throw new IllegalStateException();
        }
        if (z && !bVar.f5506d) {
            for (int i = 0; i < this.f5490q; i++) {
                if (!bVar.m4460b(i).exists()) {
                    aVar.m4446b();
                    throw new IllegalStateException("edit didn't create file ".concat(String.valueOf(i)));
                }
            }
        }
        for (int i2 = 0; i2 < this.f5490q; i2++) {
            File fileM4460b = bVar.m4460b(i2);
            if (!z) {
                m4415b(fileM4460b);
            } else if (fileM4460b.exists()) {
                File fileM4458a = bVar.m4458a(i2);
                fileM4460b.renameTo(fileM4458a);
                long j = bVar.f5505c[i2];
                long length = fileM4458a.length();
                bVar.f5505c[i2] = length;
                this.f5491r = (this.f5491r - j) + length;
            }
        }
        this.f5494u++;
        bVar.f5507e = null;
        if (bVar.f5506d || z) {
            b.m4451a(bVar);
            this.f5492s.write("CLEAN " + bVar.f5504b + bVar.m4459a() + '\n');
            if (z) {
                long j2 = this.f5495v;
                this.f5495v = 1 + j2;
                bVar.f5508f = j2;
            }
        } else {
            this.f5493t.remove(bVar.f5504b);
            this.f5492s.write("REMOVE " + bVar.f5504b + '\n');
        }
        this.f5492s.flush();
        if (this.f5491r > this.f5489p || m4429h()) {
            this.f5496w.submit(this.f5497x);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4409a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4410a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IllegalArgumentException("not a directory: ".concat(String.valueOf(file)));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m4410a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static <T> T[] m4411a(T[] tArr, int i) {
        int length = tArr.length;
        if (2 > i) {
            throw new IllegalArgumentException();
        }
        if (2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i - 2;
        int iMin = Math.min(i2, length - 2);
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
        System.arraycopy(tArr, 2, tArr2, 0, iMin);
        return tArr2;
    }

    /* JADX INFO: renamed from: b */
    private static String m4412b(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int i = inputStream.read();
            if (i == -1) {
                throw new EOFException();
            }
            if (i == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i2 = length - 1;
                    if (sb.charAt(i2) == '\r') {
                        sb.setLength(i2);
                    }
                }
                return sb.toString();
            }
            sb.append((char) i);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4413b() {
        String strM4412b;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f5486m), 8192);
        try {
            String strM4412b2 = m4412b(bufferedInputStream);
            String strM4412b3 = m4412b(bufferedInputStream);
            String strM4412b4 = m4412b(bufferedInputStream);
            String strM4412b5 = m4412b(bufferedInputStream);
            String strM4412b6 = m4412b(bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(strM4412b2) || !"1".equals(strM4412b3) || !Integer.toString(this.f5488o).equals(strM4412b4) || !Integer.toString(this.f5490q).equals(strM4412b5) || !"".equals(strM4412b6)) {
                throw new IOException("unexpected journal header: [" + strM4412b2 + ", " + strM4412b3 + ", " + strM4412b5 + ", " + strM4412b6 + "]");
            }
            while (true) {
                try {
                    strM4412b = m4412b(bufferedInputStream);
                    String[] strArrSplit = strM4412b.split(C4196o4.OooO00o.OooO0Oo);
                    if (strArrSplit.length < 2) {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(strM4412b)));
                    }
                    String str = strArrSplit[1];
                    byte b2 = 0;
                    if (strArrSplit[0].equals(f5481h) && strArrSplit.length == 2) {
                        this.f5493t.remove(str);
                    } else {
                        b bVar = this.f5493t.get(str);
                        if (bVar == null) {
                            bVar = new b(this, str, b2);
                            this.f5493t.put(str, bVar);
                        }
                        if (strArrSplit[0].equals(f5479f) && strArrSplit.length == this.f5490q + 2) {
                            b.m4451a(bVar);
                            bVar.f5507e = null;
                            int length = strArrSplit.length;
                            int length2 = strArrSplit.length;
                            if (2 > length) {
                                throw new IllegalArgumentException();
                            }
                            if (2 > length2) {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                            int i = length - 2;
                            int iMin = Math.min(i, length2 - 2);
                            Object[] objArr = (Object[]) Array.newInstance(strArrSplit.getClass().getComponentType(), i);
                            System.arraycopy(strArrSplit, 2, objArr, 0, iMin);
                            b.m4449a(bVar, (String[]) objArr);
                        } else if (strArrSplit[0].equals(f5480g) && strArrSplit.length == 2) {
                            bVar.f5507e = new a(this, bVar, b2);
                        } else if (!strArrSplit[0].equals(f5482i) || strArrSplit.length != 2) {
                            break;
                        }
                    }
                } catch (EOFException unused) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(String.valueOf(strM4412b)));
        } finally {
            m4409a((Closeable) bufferedInputStream);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m4415b(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m4416c(InputStream inputStream) {
        return m4405a((Reader) new InputStreamReader(inputStream, f5483j));
    }

    /* JADX INFO: renamed from: c */
    private void m4417c() throws IOException {
        m4415b(this.f5487n);
        Iterator<b> it = this.f5493t.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i = 0;
            if (next.f5507e == null) {
                while (i < this.f5490q) {
                    this.f5491r += next.f5505c[i];
                    i++;
                }
            } else {
                next.f5507e = null;
                while (i < this.f5490q) {
                    m4415b(next.m4458a(i));
                    m4415b(next.m4460b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public synchronized void m4419d() {
        Writer writer = this.f5492s;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f5487n), 8192);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f5488o));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f5490q));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.f5493t.values()) {
            bufferedWriter.write(bVar.f5507e != null ? "DIRTY " + bVar.f5504b + '\n' : "CLEAN " + bVar.f5504b + bVar.m4459a() + '\n');
        }
        bufferedWriter.close();
        this.f5487n.renameTo(this.f5486m);
        this.f5492s = new BufferedWriter(new FileWriter(this.f5486m, true), 8192);
    }

    /* JADX INFO: renamed from: d */
    private void m4421d(String str) throws IOException {
        String[] strArrSplit = str.split(C4196o4.OooO00o.OooO0Oo);
        if (strArrSplit.length < 2) {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
        }
        String str2 = strArrSplit[1];
        byte b2 = 0;
        if (strArrSplit[0].equals(f5481h) && strArrSplit.length == 2) {
            this.f5493t.remove(str2);
            return;
        }
        b bVar = this.f5493t.get(str2);
        if (bVar == null) {
            bVar = new b(this, str2, b2);
            this.f5493t.put(str2, bVar);
        }
        if (!strArrSplit[0].equals(f5479f) || strArrSplit.length != this.f5490q + 2) {
            if (strArrSplit[0].equals(f5480g) && strArrSplit.length == 2) {
                bVar.f5507e = new a(this, bVar, b2);
                return;
            } else {
                if (!strArrSplit[0].equals(f5482i) || strArrSplit.length != 2) {
                    throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
                }
                return;
            }
        }
        b.m4451a(bVar);
        bVar.f5507e = null;
        int length = strArrSplit.length;
        int length2 = strArrSplit.length;
        if (2 > length) {
            throw new IllegalArgumentException();
        }
        if (2 > length2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i = length - 2;
        int iMin = Math.min(i, length2 - 2);
        Object[] objArr = (Object[]) Array.newInstance(strArrSplit.getClass().getComponentType(), i);
        System.arraycopy(strArrSplit, 2, objArr, 0, iMin);
        b.m4449a(bVar, (String[]) objArr);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m4422e(C1374a c1374a) {
        c1374a.f5494u = 0;
        return 0;
    }

    /* JADX INFO: renamed from: e */
    private File m4423e() {
        return this.f5485l;
    }

    /* JADX INFO: renamed from: e */
    private static void m4424e(String str) {
        if (str.contains(C4196o4.OooO00o.OooO0Oo) || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    /* JADX INFO: renamed from: f */
    private long m4426f() {
        return this.f5489p;
    }

    /* JADX INFO: renamed from: g */
    private synchronized long m4427g() {
        return this.f5491r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public boolean m4429h() {
        int i = this.f5494u;
        return i >= 2000 && i >= this.f5493t.size();
    }

    /* JADX INFO: renamed from: i */
    private boolean m4430i() {
        return this.f5492s == null;
    }

    /* JADX INFO: renamed from: j */
    private void m4431j() {
        if (this.f5492s == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: k */
    private synchronized void m4432k() {
        m4431j();
        m4433l();
        this.f5492s.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m4433l() {
        while (this.f5491r > this.f5489p) {
            m4437c(this.f5493t.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: renamed from: m */
    private void m4434m() throws IOException {
        close();
        m4410a(this.f5485l);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized c m4435a(String str) {
        m4431j();
        m4424e(str);
        b bVar = this.f5493t.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f5506d) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f5490q];
        for (int i = 0; i < this.f5490q; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(bVar.m4458a(i));
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.f5494u++;
        this.f5492s.append((CharSequence) ("READ " + str + '\n'));
        if (m4429h()) {
            this.f5496w.submit(this.f5497x);
        }
        this.f5492s.flush();
        return new c(this, str, bVar.f5508f, inputStreamArr, (byte) 0);
    }

    /* JADX INFO: renamed from: b */
    public final a m4436b(String str) {
        return m4401a(str, -1L);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m4437c(String str) {
        m4431j();
        m4424e(str);
        b bVar = this.f5493t.get(str);
        if (bVar != null && bVar.f5507e == null) {
            for (int i = 0; i < this.f5490q; i++) {
                File fileM4458a = bVar.m4458a(i);
                if (!fileM4458a.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(fileM4458a)));
                }
                this.f5491r -= bVar.f5505c[i];
                bVar.f5505c[i] = 0;
            }
            this.f5494u++;
            this.f5492s.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f5493t.remove(str);
            if (m4429h()) {
                this.f5496w.submit(this.f5497x);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f5492s == null) {
            return;
        }
        for (b bVar : new ArrayList(this.f5493t.values())) {
            if (bVar.f5507e != null) {
                bVar.f5507e.m4446b();
            }
        }
        m4433l();
        this.f5492s.close();
        this.f5492s = null;
    }
}
