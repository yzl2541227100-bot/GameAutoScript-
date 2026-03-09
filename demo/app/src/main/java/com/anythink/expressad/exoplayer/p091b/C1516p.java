package com.anythink.expressad.exoplayer.p091b;

import com.anythink.expressad.exoplayer.p091b.InterfaceC1506f;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1516p implements InterfaceC1506f {

    /* JADX INFO: renamed from: b */
    private int f7742b = -1;

    /* JADX INFO: renamed from: c */
    private int f7743c = -1;

    /* JADX INFO: renamed from: d */
    private int f7744d = 0;

    /* JADX INFO: renamed from: e */
    private ByteBuffer f7745e;

    /* JADX INFO: renamed from: f */
    private ByteBuffer f7746f;

    /* JADX INFO: renamed from: g */
    private boolean f7747g;

    public C1516p() {
        ByteBuffer byteBuffer = InterfaceC1506f.f7547a;
        this.f7745e = byteBuffer;
        this.f7746f = byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[ADDED_TO_REGION, LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0
  0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6421a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f7744d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 * 2
        L23:
            java.nio.ByteBuffer r3 = r7.f7745e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f7745e = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.f7745e
            r2.clear()
        L3f:
            int r2 = r7.f7744d
            if (r2 == r5) goto L81
            if (r2 == r6) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f7745e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7745e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f7745e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7745e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f7745e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7745e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f7745e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f7745e
            r7.f7746f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p091b.C1516p.mo6421a(java.nio.ByteBuffer):void");
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6422a() {
        int i = this.f7744d;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6423a(int i, int i2, int i3) throws InterfaceC1506f.a {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new InterfaceC1506f.a(i, i2, i3);
        }
        if (this.f7742b == i && this.f7743c == i2 && this.f7744d == i3) {
            return false;
        }
        this.f7742b = i;
        this.f7743c = i2;
        this.f7744d = i3;
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: b */
    public final int mo6424b() {
        return this.f7743c;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: c */
    public final int mo6425c() {
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: d */
    public final int mo6426d() {
        return this.f7742b;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: e */
    public final void mo6427e() {
        this.f7747g = true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: f */
    public final ByteBuffer mo6428f() {
        ByteBuffer byteBuffer = this.f7746f;
        this.f7746f = InterfaceC1506f.f7547a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: g */
    public final boolean mo6429g() {
        return this.f7747g && this.f7746f == InterfaceC1506f.f7547a;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: h */
    public final void mo6430h() {
        this.f7746f = InterfaceC1506f.f7547a;
        this.f7747g = false;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: i */
    public final void mo6431i() {
        mo6430h();
        this.f7742b = -1;
        this.f7743c = -1;
        this.f7744d = 0;
        this.f7745e = InterfaceC1506f.f7547a;
    }
}
