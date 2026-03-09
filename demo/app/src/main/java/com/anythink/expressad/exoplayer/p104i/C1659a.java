package com.anythink.expressad.exoplayer.p104i;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p101h.C1620ae;
import com.anythink.expressad.exoplayer.p101h.p103b.AbstractC1632i;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1687d;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1720c;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1659a extends AbstractC1660b {

    /* JADX INFO: renamed from: a */
    public static final int f9125a = 10000;

    /* JADX INFO: renamed from: b */
    public static final int f9126b = 25000;

    /* JADX INFO: renamed from: c */
    public static final int f9127c = 25000;

    /* JADX INFO: renamed from: d */
    public static final float f9128d = 0.75f;

    /* JADX INFO: renamed from: e */
    public static final float f9129e = 0.75f;

    /* JADX INFO: renamed from: f */
    public static final long f9130f = 2000;

    /* JADX INFO: renamed from: j */
    private final InterfaceC1687d f9131j;

    /* JADX INFO: renamed from: k */
    private final long f9132k;

    /* JADX INFO: renamed from: l */
    private final long f9133l;

    /* JADX INFO: renamed from: m */
    private final long f9134m;

    /* JADX INFO: renamed from: n */
    private final float f9135n;

    /* JADX INFO: renamed from: o */
    private final float f9136o;

    /* JADX INFO: renamed from: p */
    private final long f9137p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC1720c f9138q;

    /* JADX INFO: renamed from: r */
    private float f9139r;

    /* JADX INFO: renamed from: s */
    private int f9140s;

    /* JADX INFO: renamed from: t */
    private int f9141t;

    /* JADX INFO: renamed from: u */
    private long f9142u;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.a$a */
    public static final class a implements InterfaceC1664f.a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1687d f9143a;

        /* JADX INFO: renamed from: b */
        private final int f9144b;

        /* JADX INFO: renamed from: c */
        private final int f9145c;

        /* JADX INFO: renamed from: d */
        private final int f9146d;

        /* JADX INFO: renamed from: e */
        private final float f9147e;

        /* JADX INFO: renamed from: f */
        private final float f9148f;

        /* JADX INFO: renamed from: g */
        private final long f9149g;

        /* JADX INFO: renamed from: h */
        private final InterfaceC1720c f9150h;

        public a(InterfaceC1687d interfaceC1687d) {
            this(interfaceC1687d, 10000, 25000, 25000, 0.75f, InterfaceC1720c.f9643a);
        }

        private a(InterfaceC1687d interfaceC1687d, int i, int i2, int i3, float f) {
            this(interfaceC1687d, i, i2, i3, f, InterfaceC1720c.f9643a);
        }

        private a(InterfaceC1687d interfaceC1687d, int i, int i2, int i3, float f, InterfaceC1720c interfaceC1720c) {
            this.f9143a = interfaceC1687d;
            this.f9144b = i;
            this.f9145c = i2;
            this.f9146d = i3;
            this.f9147e = f;
            this.f9148f = 0.75f;
            this.f9149g = C1659a.f9130f;
            this.f9150h = interfaceC1720c;
        }

        /* JADX INFO: renamed from: b */
        private C1659a m7575b(C1620ae c1620ae, int... iArr) {
            return new C1659a(c1620ae, iArr, this.f9143a, this.f9144b, this.f9145c, this.f9146d, this.f9147e, this.f9148f, this.f9149g, this.f9150h);
        }

        @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f.a
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1664f mo7576a(C1620ae c1620ae, int[] iArr) {
            return new C1659a(c1620ae, iArr, this.f9143a, this.f9144b, this.f9145c, this.f9146d, this.f9147e, this.f9148f, this.f9149g, this.f9150h);
        }
    }

    private C1659a(C1620ae c1620ae, int[] iArr, InterfaceC1687d interfaceC1687d) {
        this(c1620ae, iArr, interfaceC1687d, UMAmapConfig.AMAP_CACHE_WRITE_TIME, 25000L, 25000L, 0.75f, 0.75f, f9130f, InterfaceC1720c.f9643a);
    }

    public C1659a(C1620ae c1620ae, int[] iArr, InterfaceC1687d interfaceC1687d, long j, long j2, long j3, float f, float f2, long j4, InterfaceC1720c interfaceC1720c) {
        super(c1620ae, iArr);
        this.f9131j = interfaceC1687d;
        this.f9132k = j * 1000;
        this.f9133l = j2 * 1000;
        this.f9134m = j3 * 1000;
        this.f9135n = f;
        this.f9136o = f2;
        this.f9137p = j4;
        this.f9138q = interfaceC1720c;
        this.f9139r = 1.0f;
        this.f9141t = 1;
        this.f9142u = C1500b.f7455b;
        this.f9140s = m7566a(Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: a */
    private int m7566a(long j) {
        long jMo7849a = (long) (this.f9131j.mo7849a() * this.f9135n);
        int i = 0;
        for (int i2 = 0; i2 < this.f9155h; i2++) {
            if (j == Long.MIN_VALUE || !m7581b(i2, j)) {
                if (Math.round(mo7578a(i2).f9967d * this.f9139r) <= jMo7849a) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    private long m7567b(long j) {
        return (j > C1500b.f7455b ? 1 : (j == C1500b.f7455b ? 0 : -1)) != 0 && (j > this.f9132k ? 1 : (j == this.f9132k ? 0 : -1)) <= 0 ? (long) (j * this.f9136o) : this.f9132k;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.AbstractC1660b, com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    public final int mo7568a(long j, List<? extends AbstractC1632i> list) {
        int i;
        int i2;
        long jMo8014a = this.f9138q.mo8014a();
        long j2 = this.f9142u;
        if (j2 != C1500b.f7455b && jMo8014a - j2 < this.f9137p) {
            return list.size();
        }
        this.f9142u = jMo8014a;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (C1717af.m8096b(list.get(size - 1).f8769g - j, this.f9139r) < this.f9134m) {
            return size;
        }
        C1753m c1753mMo7578a = mo7578a(m7566a(jMo8014a));
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1632i abstractC1632i = list.get(i3);
            C1753m c1753m = abstractC1632i.f8766d;
            if (C1717af.m8096b(abstractC1632i.f8769g - j, this.f9139r) >= this.f9134m && c1753m.f9967d < c1753mMo7578a.f9967d && (i = c1753m.f9977n) != -1 && i < 720 && (i2 = c1753m.f9976m) != -1 && i2 < 1280 && i < c1753mMo7578a.f9977n) {
                return i3;
            }
        }
        return size;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.AbstractC1660b, com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    public final void mo7569a() {
        this.f9142u = C1500b.f7455b;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.AbstractC1660b, com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    public final void mo7570a(float f) {
        this.f9139r = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo7571a(long r7, long r9) {
        /*
            r6 = this;
            com.anythink.expressad.exoplayer.k.c r0 = r6.f9138q
            long r0 = r0.mo8014a()
            int r2 = r6.f9140s
            int r3 = r6.m7566a(r0)
            r6.f9140s = r3
            if (r3 != r2) goto L11
            return
        L11:
            boolean r0 = r6.m7581b(r2, r0)
            if (r0 != 0) goto L53
            com.anythink.expressad.exoplayer.m r0 = r6.mo7578a(r2)
            int r1 = r6.f9140s
            com.anythink.expressad.exoplayer.m r1 = r6.mo7578a(r1)
            int r1 = r1.f9967d
            int r0 = r0.f9967d
            if (r1 <= r0) goto L49
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r3 = r6.f9132k
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L38
            r3 = 1
            goto L39
        L38:
            r3 = 0
        L39:
            if (r3 == 0) goto L42
            float r9 = (float) r9
            float r10 = r6.f9136o
            float r9 = r9 * r10
            long r9 = (long) r9
            goto L44
        L42:
            long r9 = r6.f9132k
        L44:
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L49
            goto L51
        L49:
            if (r1 >= r0) goto L53
            long r9 = r6.f9133l
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L53
        L51:
            r6.f9140s = r2
        L53:
            int r7 = r6.f9140s
            if (r7 == r2) goto L5a
            r7 = 3
            r6.f9141t = r7
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p104i.C1659a.mo7571a(long, long):void");
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: b */
    public final int mo7572b() {
        return this.f9140s;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: c */
    public final int mo7573c() {
        return this.f9141t;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object mo7574d() {
        return null;
    }
}
