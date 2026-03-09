package com.anythink.expressad.exoplayer.p091b;

import com.anythink.expressad.exoplayer.p091b.InterfaceC1506f;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1514n implements InterfaceC1506f {

    /* JADX INFO: renamed from: b */
    private static final int f7719b = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: c */
    private static final double f7720c = 4.656612875245797E-10d;

    /* JADX INFO: renamed from: d */
    private int f7721d = -1;

    /* JADX INFO: renamed from: e */
    private int f7722e = -1;

    /* JADX INFO: renamed from: f */
    private int f7723f = 0;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f7724g;

    /* JADX INFO: renamed from: h */
    private ByteBuffer f7725h;

    /* JADX INFO: renamed from: i */
    private boolean f7726i;

    public C1514n() {
        ByteBuffer byteBuffer = InterfaceC1506f.f7547a;
        this.f7724g = byteBuffer;
        this.f7725h = byteBuffer;
    }

    /* JADX INFO: renamed from: a */
    private static void m6543a(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * f7720c));
        if (iFloatToIntBits == f7719b) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final void mo6421a(ByteBuffer byteBuffer) {
        boolean z = this.f7723f == 1073741824;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (!z) {
            i = (i / 3) * 4;
        }
        if (this.f7724g.capacity() < i) {
            this.f7724g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f7724g.clear();
        }
        if (z) {
            while (iPosition < iLimit) {
                m6543a((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), this.f7724g);
                iPosition += 4;
            }
        } else {
            while (iPosition < iLimit) {
                m6543a(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), this.f7724g);
                iPosition += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f7724g.flip();
        this.f7725h = this.f7724g;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6422a() {
        return C1717af.m8106c(this.f7723f);
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6423a(int i, int i2, int i3) throws InterfaceC1506f.a {
        if (!C1717af.m8106c(i3)) {
            throw new InterfaceC1506f.a(i, i2, i3);
        }
        if (this.f7721d == i && this.f7722e == i2 && this.f7723f == i3) {
            return false;
        }
        this.f7721d = i;
        this.f7722e = i2;
        this.f7723f = i3;
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: b */
    public final int mo6424b() {
        return this.f7722e;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: c */
    public final int mo6425c() {
        return 4;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: d */
    public final int mo6426d() {
        return this.f7721d;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: e */
    public final void mo6427e() {
        this.f7726i = true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: f */
    public final ByteBuffer mo6428f() {
        ByteBuffer byteBuffer = this.f7725h;
        this.f7725h = InterfaceC1506f.f7547a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: g */
    public final boolean mo6429g() {
        return this.f7726i && this.f7725h == InterfaceC1506f.f7547a;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: h */
    public final void mo6430h() {
        this.f7725h = InterfaceC1506f.f7547a;
        this.f7726i = false;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: i */
    public final void mo6431i() {
        mo6430h();
        this.f7721d = -1;
        this.f7722e = -1;
        this.f7723f = 0;
        this.f7724g = InterfaceC1506f.f7547a;
    }
}
