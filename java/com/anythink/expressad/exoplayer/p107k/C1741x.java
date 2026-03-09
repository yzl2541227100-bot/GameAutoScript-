package com.anythink.expressad.exoplayer.p107k;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1741x extends BufferedOutputStream {

    /* JADX INFO: renamed from: a */
    private boolean f9805a;

    public C1741x(OutputStream outputStream) {
        super(outputStream);
    }

    public C1741x(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m8307a(OutputStream outputStream) {
        C1711a.m8012b(this.f9805a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f9805a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f9805a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            C1717af.m8077a(th);
        }
    }
}
