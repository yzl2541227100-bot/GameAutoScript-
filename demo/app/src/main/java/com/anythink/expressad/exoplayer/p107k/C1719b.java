package com.anythink.expressad.exoplayer.p107k;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1719b {

    /* JADX INFO: renamed from: a */
    private static final String f9638a = "AtomicFile";

    /* JADX INFO: renamed from: b */
    private final File f9639b;

    /* JADX INFO: renamed from: c */
    private final File f9640c;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.b$a */
    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: a */
        private final FileOutputStream f9641a;

        /* JADX INFO: renamed from: b */
        private boolean f9642b = false;

        public a(File file) {
            this.f9641a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f9642b) {
                return;
            }
            this.f9642b = true;
            flush();
            try {
                this.f9641a.getFD().sync();
            } catch (IOException e) {
                Log.w(C1719b.f9638a, "Failed to sync file descriptor:", e);
            }
            this.f9641a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f9641a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.f9641a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(@NonNull byte[] bArr) throws IOException {
            this.f9641a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
            this.f9641a.write(bArr, i, i2);
        }
    }

    public C1719b(File file) {
        this.f9639b = file;
        this.f9640c = new File(file.getPath() + ".bak");
    }

    /* JADX INFO: renamed from: d */
    private void m8134d() {
        if (this.f9640c.exists()) {
            this.f9639b.delete();
            this.f9640c.renameTo(this.f9639b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8135a() {
        this.f9639b.delete();
        this.f9640c.delete();
    }

    /* JADX INFO: renamed from: a */
    public final void m8136a(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f9640c.delete();
    }

    /* JADX INFO: renamed from: b */
    public final OutputStream m8137b() throws IOException {
        if (this.f9639b.exists()) {
            if (this.f9640c.exists()) {
                this.f9639b.delete();
            } else if (!this.f9639b.renameTo(this.f9640c)) {
                Log.w(f9638a, "Couldn't rename file " + this.f9639b + " to backup file " + this.f9640c);
            }
        }
        try {
            return new a(this.f9639b);
        } catch (FileNotFoundException e) {
            if (!this.f9639b.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f9639b, e);
            }
            try {
                return new a(this.f9639b);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.f9639b, e2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final InputStream m8138c() {
        if (this.f9640c.exists()) {
            this.f9639b.delete();
            this.f9640c.renameTo(this.f9639b);
        }
        return new FileInputStream(this.f9639b);
    }
}
