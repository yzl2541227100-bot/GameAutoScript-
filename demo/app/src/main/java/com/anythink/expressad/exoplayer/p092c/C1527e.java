package com.anythink.expressad.exoplayer.p092c;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.c.e */
/* JADX INFO: loaded from: classes.dex */
public class C1527e extends AbstractC1523a {

    /* JADX INFO: renamed from: a */
    public static final int f7875a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f7876b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f7877c = 2;

    /* JADX INFO: renamed from: d */
    public final C1524b f7878d = new C1524b();

    /* JADX INFO: renamed from: e */
    public ByteBuffer f7879e;

    /* JADX INFO: renamed from: f */
    public long f7880f;

    /* JADX INFO: renamed from: g */
    private final int f7881g;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.c.e$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C1527e(int i) {
        this.f7881g = i;
    }

    /* JADX INFO: renamed from: e */
    public static C1527e m6658e() {
        return new C1527e(0);
    }

    /* JADX INFO: renamed from: e */
    private ByteBuffer m6659e(int i) {
        int i2 = this.f7881g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f7879e;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    @Override // com.anythink.expressad.exoplayer.p092c.AbstractC1523a
    /* JADX INFO: renamed from: a */
    public final void mo6637a() {
        super.mo6637a();
        ByteBuffer byteBuffer = this.f7879e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6660d(int i) {
        ByteBuffer byteBuffer = this.f7879e;
        if (byteBuffer == null) {
            this.f7879e = m6659e(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.f7879e.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            return;
        }
        ByteBuffer byteBufferM6659e = m6659e(i2);
        if (iPosition > 0) {
            this.f7879e.position(0);
            this.f7879e.limit(iPosition);
            byteBufferM6659e.put(this.f7879e);
        }
        this.f7879e = byteBufferM6659e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6661f() {
        return this.f7879e == null && this.f7881g == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6662g() {
        return m6642c(1073741824);
    }

    /* JADX INFO: renamed from: h */
    public final void m6663h() {
        this.f7879e.flip();
    }
}
