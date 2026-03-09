package org.apache.commons.p284io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class BoundedInputStream extends InputStream {

    /* JADX INFO: renamed from: in */
    private final InputStream f19819in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }

    public BoundedInputStream(InputStream inputStream, long j) {
        this.pos = 0L;
        this.mark = -1L;
        this.propagateClose = true;
        this.max = j;
        this.f19819in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j = this.max;
        if (j < 0 || this.pos < j) {
            return this.f19819in.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.propagateClose) {
            this.f19819in.close();
        }
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.f19819in.mark(i);
        this.mark = this.pos;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f19819in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.max;
        if (j >= 0 && this.pos >= j) {
            return -1;
        }
        int i = this.f19819in.read();
        this.pos++;
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.max;
        if (j >= 0 && this.pos >= j) {
            return -1;
        }
        int i3 = this.f19819in.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - this.pos) : i2));
        if (i3 == -1) {
            return -1;
        }
        this.pos += (long) i3;
        return i3;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f19819in.reset();
        this.pos = this.mark;
    }

    public void setPropagateClose(boolean z) {
        this.propagateClose = z;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = this.max;
        if (j2 >= 0) {
            j = Math.min(j, j2 - this.pos);
        }
        long jSkip = this.f19819in.skip(j);
        this.pos += jSkip;
        return jSkip;
    }

    public String toString() {
        return this.f19819in.toString();
    }
}
