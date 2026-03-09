package com.anythink.expressad.exoplayer.p091b;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1506f;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1520t implements InterfaceC1506f {

    /* JADX INFO: renamed from: b */
    public static final float f7822b = 8.0f;

    /* JADX INFO: renamed from: c */
    public static final float f7823c = 0.1f;

    /* JADX INFO: renamed from: d */
    public static final float f7824d = 8.0f;

    /* JADX INFO: renamed from: e */
    public static final float f7825e = 0.1f;

    /* JADX INFO: renamed from: f */
    public static final int f7826f = -1;

    /* JADX INFO: renamed from: g */
    private static final float f7827g = 0.01f;

    /* JADX INFO: renamed from: h */
    private static final int f7828h = 1024;

    /* JADX INFO: renamed from: n */
    private int f7834n;

    /* JADX INFO: renamed from: o */
    @Nullable
    private C1519s f7835o;

    /* JADX INFO: renamed from: p */
    private ByteBuffer f7836p;

    /* JADX INFO: renamed from: q */
    private ShortBuffer f7837q;

    /* JADX INFO: renamed from: r */
    private ByteBuffer f7838r;

    /* JADX INFO: renamed from: s */
    private long f7839s;

    /* JADX INFO: renamed from: t */
    private long f7840t;

    /* JADX INFO: renamed from: u */
    private boolean f7841u;

    /* JADX INFO: renamed from: k */
    private float f7831k = 1.0f;

    /* JADX INFO: renamed from: l */
    private float f7832l = 1.0f;

    /* JADX INFO: renamed from: i */
    private int f7829i = -1;

    /* JADX INFO: renamed from: j */
    private int f7830j = -1;

    /* JADX INFO: renamed from: m */
    private int f7833m = -1;

    public C1520t() {
        ByteBuffer byteBuffer = InterfaceC1506f.f7547a;
        this.f7836p = byteBuffer;
        this.f7837q = byteBuffer.asShortBuffer();
        this.f7838r = byteBuffer;
        this.f7834n = -1;
    }

    /* JADX INFO: renamed from: a */
    private void m6626a(int i) {
        this.f7834n = i;
    }

    /* JADX INFO: renamed from: a */
    public final float m6627a(float f) {
        float fM8048a = C1717af.m8048a(f);
        if (this.f7831k != fM8048a) {
            this.f7831k = fM8048a;
            this.f7835o = null;
        }
        mo6430h();
        return fM8048a;
    }

    /* JADX INFO: renamed from: a */
    public final long m6628a(long j) {
        long j2 = this.f7840t;
        if (j2 < 1024) {
            return (long) (((double) this.f7831k) * j);
        }
        int i = this.f7833m;
        int i2 = this.f7830j;
        long j3 = this.f7839s;
        return i == i2 ? C1717af.m8059a(j, j3, j2) : C1717af.m8059a(j, j3 * ((long) i), j2 * ((long) i2));
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final void mo6421a(ByteBuffer byteBuffer) {
        C1711a.m8012b(this.f7835o != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f7839s += (long) iRemaining;
            this.f7835o.m6622a(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iM6625c = this.f7835o.m6625c() * this.f7829i * 2;
        if (iM6625c > 0) {
            if (this.f7836p.capacity() < iM6625c) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iM6625c).order(ByteOrder.nativeOrder());
                this.f7836p = byteBufferOrder;
                this.f7837q = byteBufferOrder.asShortBuffer();
            } else {
                this.f7836p.clear();
                this.f7837q.clear();
            }
            this.f7835o.m6624b(this.f7837q);
            this.f7840t += (long) iM6625c;
            this.f7836p.limit(iM6625c);
            this.f7838r = this.f7836p;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6422a() {
        if (this.f7830j != -1) {
            return Math.abs(this.f7831k - 1.0f) >= 0.01f || Math.abs(this.f7832l - 1.0f) >= 0.01f || this.f7833m != this.f7830j;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6423a(int i, int i2, int i3) throws InterfaceC1506f.a {
        if (i3 != 2) {
            throw new InterfaceC1506f.a(i, i2, i3);
        }
        int i4 = this.f7834n;
        if (i4 == -1) {
            i4 = i;
        }
        if (this.f7830j == i && this.f7829i == i2 && this.f7833m == i4) {
            return false;
        }
        this.f7830j = i;
        this.f7829i = i2;
        this.f7833m = i4;
        this.f7835o = null;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final float m6629b(float f) {
        float fM8048a = C1717af.m8048a(f);
        if (this.f7832l != fM8048a) {
            this.f7832l = fM8048a;
            this.f7835o = null;
        }
        mo6430h();
        return fM8048a;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: b */
    public final int mo6424b() {
        return this.f7829i;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: c */
    public final int mo6425c() {
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: d */
    public final int mo6426d() {
        return this.f7833m;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: e */
    public final void mo6427e() {
        C1711a.m8012b(this.f7835o != null);
        this.f7835o.m6621a();
        this.f7841u = true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: f */
    public final ByteBuffer mo6428f() {
        ByteBuffer byteBuffer = this.f7838r;
        this.f7838r = InterfaceC1506f.f7547a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: g */
    public final boolean mo6429g() {
        if (!this.f7841u) {
            return false;
        }
        C1519s c1519s = this.f7835o;
        return c1519s == null || c1519s.m6625c() == 0;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: h */
    public final void mo6430h() {
        if (mo6422a()) {
            C1519s c1519s = this.f7835o;
            if (c1519s == null) {
                this.f7835o = new C1519s(this.f7830j, this.f7829i, this.f7831k, this.f7832l, this.f7833m);
            } else {
                c1519s.m6623b();
            }
        }
        this.f7838r = InterfaceC1506f.f7547a;
        this.f7839s = 0L;
        this.f7840t = 0L;
        this.f7841u = false;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: i */
    public final void mo6431i() {
        this.f7831k = 1.0f;
        this.f7832l = 1.0f;
        this.f7829i = -1;
        this.f7830j = -1;
        this.f7833m = -1;
        ByteBuffer byteBuffer = InterfaceC1506f.f7547a;
        this.f7836p = byteBuffer;
        this.f7837q = byteBuffer.asShortBuffer();
        this.f7838r = byteBuffer;
        this.f7834n = -1;
        this.f7835o = null;
        this.f7839s = 0L;
        this.f7840t = 0L;
        this.f7841u = false;
    }
}
