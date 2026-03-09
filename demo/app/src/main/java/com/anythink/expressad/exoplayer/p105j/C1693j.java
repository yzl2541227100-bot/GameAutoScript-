package com.anythink.expressad.exoplayer.p105j;

import androidx.annotation.NonNull;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.io.InputStream;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1693j extends InputStream {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1691h f9387a;

    /* JADX INFO: renamed from: b */
    private final C1694k f9388b;

    /* JADX INFO: renamed from: f */
    private long f9392f;

    /* JADX INFO: renamed from: d */
    private boolean f9390d = false;

    /* JADX INFO: renamed from: e */
    private boolean f9391e = false;

    /* JADX INFO: renamed from: c */
    private final byte[] f9389c = new byte[1];

    public C1693j(InterfaceC1691h interfaceC1691h, C1694k c1694k) {
        this.f9387a = interfaceC1691h;
        this.f9388b = c1694k;
    }

    /* JADX INFO: renamed from: c */
    private void m7852c() {
        if (this.f9390d) {
            return;
        }
        this.f9387a.mo7742a(this.f9388b);
        this.f9390d = true;
    }

    /* JADX INFO: renamed from: a */
    public final long m7853a() {
        return this.f9392f;
    }

    /* JADX INFO: renamed from: b */
    public final void m7854b() {
        m7852c();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9391e) {
            return;
        }
        this.f9387a.mo7744b();
        this.f9391e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.f9389c) == -1) {
            return -1;
        }
        return this.f9389c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(@NonNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i, int i2) {
        C1711a.m8012b(!this.f9391e);
        m7852c();
        int iMo7741a = this.f9387a.mo7741a(bArr, i, i2);
        if (iMo7741a == -1) {
            return -1;
        }
        this.f9392f += (long) iMo7741a;
        return iMo7741a;
    }
}
