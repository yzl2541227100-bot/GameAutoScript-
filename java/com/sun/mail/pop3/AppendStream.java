package com.sun.mail.pop3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class AppendStream extends OutputStream {
    private long end;
    private RandomAccessFile raf;
    private final long start;

    /* JADX INFO: renamed from: tf */
    private final WritableSharedFile f18031tf;

    public AppendStream(WritableSharedFile writableSharedFile) throws IOException {
        this.f18031tf = writableSharedFile;
        RandomAccessFile writableFile = writableSharedFile.getWritableFile();
        this.raf = writableFile;
        long length = writableFile.length();
        this.start = length;
        this.raf.seek(length);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.end = this.f18031tf.updateLength();
        this.raf = null;
    }

    public synchronized InputStream getInputStream() throws IOException {
        return this.f18031tf.newStream(this.start, this.end);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.raf.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.raf.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.raf.write(bArr, i, i2);
    }
}
