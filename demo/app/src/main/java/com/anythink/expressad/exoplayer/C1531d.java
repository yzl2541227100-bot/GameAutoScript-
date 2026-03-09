package com.anythink.expressad.exoplayer;

import com.anythink.expressad.exoplayer.p104i.C1665g;
import com.anythink.expressad.exoplayer.p105j.C1695l;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1739v;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1531d implements InterfaceC1756p {

    /* JADX INFO: renamed from: a */
    public static final int f7900a = 15000;

    /* JADX INFO: renamed from: b */
    public static final int f7901b = 50000;

    /* JADX INFO: renamed from: c */
    public static final int f7902c = 2500;

    /* JADX INFO: renamed from: d */
    public static final int f7903d = 5000;

    /* JADX INFO: renamed from: e */
    public static final int f7904e = -1;

    /* JADX INFO: renamed from: f */
    public static final boolean f7905f = true;

    /* JADX INFO: renamed from: g */
    private final C1695l f7906g;

    /* JADX INFO: renamed from: h */
    private final long f7907h;

    /* JADX INFO: renamed from: i */
    private final long f7908i;

    /* JADX INFO: renamed from: j */
    private final long f7909j;

    /* JADX INFO: renamed from: k */
    private final long f7910k;

    /* JADX INFO: renamed from: l */
    private final int f7911l;

    /* JADX INFO: renamed from: m */
    private final boolean f7912m;

    /* JADX INFO: renamed from: n */
    private final C1739v f7913n;

    /* JADX INFO: renamed from: o */
    private int f7914o;

    /* JADX INFO: renamed from: p */
    private boolean f7915p;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C1695l f7916a = null;

        /* JADX INFO: renamed from: b */
        private int f7917b = 15000;

        /* JADX INFO: renamed from: c */
        private int f7918c = C1531d.f7901b;

        /* JADX INFO: renamed from: d */
        private int f7919d = 2500;

        /* JADX INFO: renamed from: e */
        private int f7920e = 5000;

        /* JADX INFO: renamed from: f */
        private int f7921f = -1;

        /* JADX INFO: renamed from: g */
        private boolean f7922g = true;

        /* JADX INFO: renamed from: h */
        private C1739v f7923h = null;

        /* JADX INFO: renamed from: a */
        private a m6695a(int i) {
            this.f7921f = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private a m6696a(int i, int i2, int i3, int i4) {
            this.f7917b = i;
            this.f7918c = i2;
            this.f7919d = i3;
            this.f7920e = i4;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private a m6697a(C1695l c1695l) {
            this.f7916a = c1695l;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private a m6698a(C1739v c1739v) {
            this.f7923h = c1739v;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private a m6699a(boolean z) {
            this.f7922g = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private C1531d m6700a() {
            if (this.f7916a == null) {
                this.f7916a = new C1695l((byte) 0);
            }
            return new C1531d(this.f7916a, this.f7917b, this.f7918c, this.f7919d, this.f7920e, this.f7921f, this.f7922g, this.f7923h);
        }
    }

    public C1531d() {
        this(new C1695l((byte) 0));
    }

    @Deprecated
    private C1531d(C1695l c1695l) {
        this(c1695l, (byte) 0);
    }

    @Deprecated
    private C1531d(C1695l c1695l, byte b) {
        this(c1695l, 15000, f7901b, 2500, 5000, -1, true, null);
    }

    @Deprecated
    public C1531d(C1695l c1695l, int i, int i2, int i3, int i4, int i5, boolean z, C1739v c1739v) {
        m6683a(i3, 0, "bufferForPlaybackMs", "0");
        m6683a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m6683a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m6683a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m6683a(i2, i, "maxBufferMs", "minBufferMs");
        this.f7906g = c1695l;
        this.f7907h = ((long) i) * 1000;
        this.f7908i = ((long) i2) * 1000;
        this.f7909j = ((long) i3) * 1000;
        this.f7910k = ((long) i4) * 1000;
        this.f7911l = i5;
        this.f7912m = z;
        this.f7913n = c1739v;
    }

    /* JADX INFO: renamed from: a */
    private static void m6683a(int i, int i2, String str, String str2) {
        C1711a.m8011a(i >= i2, str + " cannot be less than " + str2);
    }

    /* JADX INFO: renamed from: a */
    private void m6684a(boolean z) {
        this.f7914o = 0;
        C1739v c1739v = this.f7913n;
        if (c1739v != null && this.f7915p) {
            c1739v.m8304c();
        }
        this.f7915p = false;
        if (z) {
            this.f7906g.m7860e();
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m6685b(InterfaceC1768y[] interfaceC1768yArr, C1665g c1665g) {
        int iM8117g = 0;
        for (int i = 0; i < interfaceC1768yArr.length; i++) {
            if (c1665g.m7687a(i) != null) {
                iM8117g += C1717af.m8117g(interfaceC1768yArr[i].mo6122a());
            }
        }
        return iM8117g;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1756p
    /* JADX INFO: renamed from: a */
    public final void mo6686a() {
        m6684a(false);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1756p
    /* JADX INFO: renamed from: a */
    public final void mo6687a(InterfaceC1768y[] interfaceC1768yArr, C1665g c1665g) {
        int i = this.f7911l;
        if (i == -1) {
            int iM8117g = 0;
            for (int i2 = 0; i2 < interfaceC1768yArr.length; i2++) {
                if (c1665g.m7687a(i2) != null) {
                    iM8117g += C1717af.m8117g(interfaceC1768yArr[i2].mo6122a());
                }
            }
            i = iM8117g;
        }
        this.f7914o = i;
        this.f7906g.m7859a(i);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1756p
    /* JADX INFO: renamed from: a */
    public final boolean mo6688a(long j, float f) {
        boolean z;
        boolean z3 = true;
        boolean z4 = this.f7906g.mo7847c() >= this.f7914o;
        boolean z5 = this.f7915p;
        long jMin = this.f7907h;
        if (f > 1.0f) {
            jMin = Math.min(C1717af.m8057a(jMin, f), this.f7908i);
        }
        if (j < jMin) {
            if (!this.f7912m && z4) {
                z3 = false;
            }
            this.f7915p = z3;
        } else if (j > this.f7908i || z4) {
            this.f7915p = false;
        }
        C1739v c1739v = this.f7913n;
        if (c1739v != null && (z = this.f7915p) != z5) {
            if (z) {
                c1739v.m8301a();
            } else {
                c1739v.m8304c();
            }
        }
        return this.f7915p;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1756p
    /* JADX INFO: renamed from: a */
    public final boolean mo6689a(long j, float f, boolean z) {
        long jM8096b = C1717af.m8096b(j, f);
        long j2 = z ? this.f7910k : this.f7909j;
        if (j2 <= 0 || jM8096b >= j2) {
            return true;
        }
        return !this.f7912m && this.f7906g.mo7847c() >= this.f7914o;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1756p
    /* JADX INFO: renamed from: b */
    public final void mo6690b() {
        m6684a(true);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1756p
    /* JADX INFO: renamed from: c */
    public final void mo6691c() {
        m6684a(true);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1756p
    /* JADX INFO: renamed from: d */
    public final InterfaceC1685b mo6692d() {
        return this.f7906g;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1756p
    /* JADX INFO: renamed from: e */
    public final long mo6693e() {
        return 0L;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1756p
    /* JADX INFO: renamed from: f */
    public final boolean mo6694f() {
        return false;
    }
}
