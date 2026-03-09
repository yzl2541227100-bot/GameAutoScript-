package com.anythink.expressad.exoplayer.p094e.p095a;

import android.util.Log;
import android.util.Pair;
import cn.haorui.sdk.adsail_ad.view.scaleImage.SubsamplingScaleImageView;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1763t;
import com.anythink.expressad.exoplayer.p091b.C1501a;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p094e.C1570i;
import com.anythink.expressad.exoplayer.p094e.p095a.AbstractC1550a;
import com.anythink.expressad.exoplayer.p094e.p095a.C1553d;
import com.anythink.expressad.exoplayer.p097g.C1582a;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1721d;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import com.anythink.expressad.exoplayer.p108l.C1745a;
import com.anythink.expressad.exoplayer.p108l.C1748d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1551b {

    /* JADX INFO: renamed from: a */
    private static final String f8140a = "AtomParsers";

    /* JADX INFO: renamed from: b */
    private static final int f8141b = C1717af.m8116f("vide");

    /* JADX INFO: renamed from: c */
    private static final int f8142c = C1717af.m8116f("soun");

    /* JADX INFO: renamed from: d */
    private static final int f8143d = C1717af.m8116f("text");

    /* JADX INFO: renamed from: e */
    private static final int f8144e = C1717af.m8116f("sbtl");

    /* JADX INFO: renamed from: f */
    private static final int f8145f = C1717af.m8116f("subt");

    /* JADX INFO: renamed from: g */
    private static final int f8146g = C1717af.m8116f("clcp");

    /* JADX INFO: renamed from: h */
    private static final int f8147h = C1717af.m8116f("meta");

    /* JADX INFO: renamed from: i */
    private static final int f8148i = 3;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f8149a;

        /* JADX INFO: renamed from: b */
        public int f8150b;

        /* JADX INFO: renamed from: c */
        public int f8151c;

        /* JADX INFO: renamed from: d */
        public long f8152d;

        /* JADX INFO: renamed from: e */
        private final boolean f8153e;

        /* JADX INFO: renamed from: f */
        private final C1736s f8154f;

        /* JADX INFO: renamed from: g */
        private final C1736s f8155g;

        /* JADX INFO: renamed from: h */
        private int f8156h;

        /* JADX INFO: renamed from: i */
        private int f8157i;

        public a(C1736s c1736s, C1736s c1736s2, boolean z) {
            this.f8155g = c1736s;
            this.f8154f = c1736s2;
            this.f8153e = z;
            c1736s2.m8272c(12);
            this.f8149a = c1736s2.m8284m();
            c1736s.m8272c(12);
            this.f8157i = c1736s.m8284m();
            C1711a.m8013b(c1736s.m8280i() == 1, "first_chunk must be 1");
            this.f8150b = -1;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6854a() {
            int i = this.f8150b + 1;
            this.f8150b = i;
            if (i == this.f8149a) {
                return false;
            }
            this.f8152d = this.f8153e ? this.f8154f.m8285n() : this.f8154f.m8279h();
            if (this.f8150b == this.f8156h) {
                this.f8151c = this.f8155g.m8284m();
                this.f8155g.m8274d(4);
                int i2 = this.f8157i - 1;
                this.f8157i = i2;
                this.f8156h = i2 > 0 ? this.f8155g.m8284m() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        int mo6855a();

        /* JADX INFO: renamed from: b */
        int mo6856b();

        /* JADX INFO: renamed from: c */
        boolean mo6857c();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.b$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final int f8158a = 8;

        /* JADX INFO: renamed from: b */
        public final C1560k[] f8159b;

        /* JADX INFO: renamed from: c */
        public C1753m f8160c;

        /* JADX INFO: renamed from: d */
        public int f8161d;

        /* JADX INFO: renamed from: e */
        public int f8162e = 0;

        public c(int i) {
            this.f8159b = new C1560k[i];
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.b$d */
    public static final class d implements b {

        /* JADX INFO: renamed from: a */
        private final int f8163a;

        /* JADX INFO: renamed from: b */
        private final int f8164b;

        /* JADX INFO: renamed from: c */
        private final C1736s f8165c;

        public d(AbstractC1550a.b bVar) {
            C1736s c1736s = bVar.f8139aV;
            this.f8165c = c1736s;
            c1736s.m8272c(12);
            this.f8163a = c1736s.m8284m();
            this.f8164b = c1736s.m8284m();
        }

        @Override // com.anythink.expressad.exoplayer.p094e.p095a.C1551b.b
        /* JADX INFO: renamed from: a */
        public final int mo6855a() {
            return this.f8164b;
        }

        @Override // com.anythink.expressad.exoplayer.p094e.p095a.C1551b.b
        /* JADX INFO: renamed from: b */
        public final int mo6856b() {
            int i = this.f8163a;
            return i == 0 ? this.f8165c.m8284m() : i;
        }

        @Override // com.anythink.expressad.exoplayer.p094e.p095a.C1551b.b
        /* JADX INFO: renamed from: c */
        public final boolean mo6857c() {
            return this.f8163a != 0;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.b$e */
    public static final class e implements b {

        /* JADX INFO: renamed from: a */
        private final C1736s f8166a;

        /* JADX INFO: renamed from: b */
        private final int f8167b;

        /* JADX INFO: renamed from: c */
        private final int f8168c;

        /* JADX INFO: renamed from: d */
        private int f8169d;

        /* JADX INFO: renamed from: e */
        private int f8170e;

        public e(AbstractC1550a.b bVar) {
            C1736s c1736s = bVar.f8139aV;
            this.f8166a = c1736s;
            c1736s.m8272c(12);
            this.f8168c = c1736s.m8284m() & 255;
            this.f8167b = c1736s.m8284m();
        }

        @Override // com.anythink.expressad.exoplayer.p094e.p095a.C1551b.b
        /* JADX INFO: renamed from: a */
        public final int mo6855a() {
            return this.f8167b;
        }

        @Override // com.anythink.expressad.exoplayer.p094e.p095a.C1551b.b
        /* JADX INFO: renamed from: b */
        public final int mo6856b() {
            int i = this.f8168c;
            if (i == 8) {
                return this.f8166a.m8273d();
            }
            if (i == 16) {
                return this.f8166a.m8275e();
            }
            int i2 = this.f8169d;
            this.f8169d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f8170e & 15;
            }
            int iM8273d = this.f8166a.m8273d();
            this.f8170e = iM8273d;
            return (iM8273d & 240) >> 4;
        }

        @Override // com.anythink.expressad.exoplayer.p094e.p095a.C1551b.b
        /* JADX INFO: renamed from: c */
        public final boolean mo6857c() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.b$f */
    public static final class f {

        /* JADX INFO: renamed from: a */
        private final int f8171a;

        /* JADX INFO: renamed from: b */
        private final long f8172b;

        /* JADX INFO: renamed from: c */
        private final int f8173c;

        public f(int i, long j, int i2) {
            this.f8171a = i;
            this.f8172b = j;
            this.f8173c = i2;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.b$g */
    public static final class g extends C1763t {
    }

    private C1551b() {
    }

    /* JADX INFO: renamed from: a */
    private static int m6831a(C1736s c1736s, int i, int i2) {
        int iM8271c = c1736s.m8271c();
        while (iM8271c - i < i2) {
            c1736s.m8272c(iM8271c);
            int iM8280i = c1736s.m8280i();
            C1711a.m8011a(iM8280i > 0, "childAtomSize should be positive");
            if (c1736s.m8280i() == AbstractC1550a.f8051O) {
                return iM8271c;
            }
            iM8271c += iM8280i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private static long m6832a(C1736s c1736s) {
        c1736s.m8272c(8);
        c1736s.m8274d(AbstractC1550a.m6823a(c1736s.m8280i()) != 0 ? 16 : 8);
        return c1736s.m8279h();
    }

    /* JADX INFO: renamed from: a */
    private static Pair<long[], long[]> m6833a(AbstractC1550a.a aVar) {
        AbstractC1550a.b bVarM6829d;
        if (aVar == null || (bVarM6829d = aVar.m6829d(AbstractC1550a.f8058V)) == null) {
            return Pair.create(null, null);
        }
        C1736s c1736s = bVarM6829d.f8139aV;
        c1736s.m8272c(8);
        int iM6823a = AbstractC1550a.m6823a(c1736s.m8280i());
        int iM8284m = c1736s.m8284m();
        long[] jArr = new long[iM8284m];
        long[] jArr2 = new long[iM8284m];
        for (int i = 0; i < iM8284m; i++) {
            jArr[i] = iM6823a == 1 ? c1736s.m8285n() : c1736s.m8279h();
            jArr2[i] = iM6823a == 1 ? c1736s.m8281j() : c1736s.m8280i();
            if (c1736s.m8277f() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c1736s.m8274d(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:536:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0341  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.anythink.expressad.exoplayer.p094e.p095a.C1551b.c m6834a(com.anythink.expressad.exoplayer.p107k.C1736s r46, int r47, int r48, java.lang.String r49, com.anythink.expressad.exoplayer.p093d.C1536e r50, boolean r51) throws com.anythink.expressad.exoplayer.C1763t {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p094e.p095a.C1551b.m6834a(com.anythink.expressad.exoplayer.k.s, int, int, java.lang.String, com.anythink.expressad.exoplayer.d.e, boolean):com.anythink.expressad.exoplayer.e.a.b$c");
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01c7  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.anythink.expressad.exoplayer.p094e.p095a.C1559j m6835a(com.anythink.expressad.exoplayer.p094e.p095a.AbstractC1550a.a r25, com.anythink.expressad.exoplayer.p094e.p095a.AbstractC1550a.b r26, long r27, com.anythink.expressad.exoplayer.p093d.C1536e r29, boolean r30, boolean r31) throws com.anythink.expressad.exoplayer.C1763t {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p094e.p095a.C1551b.m6835a(com.anythink.expressad.exoplayer.e.a.a$a, com.anythink.expressad.exoplayer.e.a.a$b, long, com.anythink.expressad.exoplayer.d.e, boolean, boolean):com.anythink.expressad.exoplayer.e.a.j");
    }

    /* JADX INFO: renamed from: a */
    private static C1560k m6836a(C1736s c1736s, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            c1736s.m8272c(i5);
            int iM8280i = c1736s.m8280i();
            if (c1736s.m8280i() == AbstractC1550a.f8087ad) {
                int iM6823a = AbstractC1550a.m6823a(c1736s.m8280i());
                c1736s.m8274d(1);
                if (iM6823a == 0) {
                    c1736s.m8274d(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int iM8273d = c1736s.m8273d();
                    i3 = iM8273d & 15;
                    i4 = (iM8273d & 240) >> 4;
                }
                boolean z = c1736s.m8273d() == 1;
                int iM8273d2 = c1736s.m8273d();
                byte[] bArr2 = new byte[16];
                c1736s.m8268a(bArr2, 0, 16);
                if (z && iM8273d2 == 0) {
                    int iM8273d3 = c1736s.m8273d();
                    bArr = new byte[iM8273d3];
                    c1736s.m8268a(bArr, 0, iM8273d3);
                }
                return new C1560k(z, str, iM8273d2, bArr2, i4, i3, bArr);
            }
            i5 += iM8280i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1562m m6837a(C1559j c1559j, AbstractC1550a.a aVar, C1570i c1570i) throws C1763t {
        b eVar;
        boolean z;
        int iM8284m;
        int iM8284m2;
        C1559j c1559j2;
        String str;
        long[] jArr;
        int[] iArr;
        int i;
        long[] jArr2;
        int[] iArr2;
        long j;
        String str2;
        int i2;
        String str3;
        int[] iArr3;
        boolean z3;
        long[] jArr3;
        long[] jArr4;
        int[] iArr4;
        int[] iArr5;
        int i3;
        int[] iArr6;
        int[] iArr7;
        int i4;
        AbstractC1550a.b bVarM6829d = aVar.m6829d(AbstractC1550a.f8105av);
        if (bVarM6829d != null) {
            eVar = new d(bVarM6829d);
        } else {
            AbstractC1550a.b bVarM6829d2 = aVar.m6829d(AbstractC1550a.f8106aw);
            if (bVarM6829d2 == null) {
                throw new C1763t("Track has no sample table size information");
            }
            eVar = new e(bVarM6829d2);
        }
        int iMo6855a = eVar.mo6855a();
        if (iMo6855a == 0) {
            return new C1562m(c1559j, new long[0], new int[0], 0, new long[0], new int[0], C1500b.f7455b);
        }
        AbstractC1550a.b bVarM6829d3 = aVar.m6829d(AbstractC1550a.f8107ax);
        if (bVarM6829d3 == null) {
            bVarM6829d3 = aVar.m6829d(AbstractC1550a.f8108ay);
            z = true;
        } else {
            z = false;
        }
        C1736s c1736s = bVarM6829d3.f8139aV;
        C1736s c1736s2 = aVar.m6829d(AbstractC1550a.f8104au).f8139aV;
        C1736s c1736s3 = aVar.m6829d(AbstractC1550a.f8101ar).f8139aV;
        AbstractC1550a.b bVarM6829d4 = aVar.m6829d(AbstractC1550a.f8102as);
        C1736s c1736s4 = null;
        C1736s c1736s5 = bVarM6829d4 != null ? bVarM6829d4.f8139aV : null;
        AbstractC1550a.b bVarM6829d5 = aVar.m6829d(AbstractC1550a.f8103at);
        C1736s c1736s6 = bVarM6829d5 != null ? bVarM6829d5.f8139aV : null;
        a aVar2 = new a(c1736s2, c1736s, z);
        c1736s3.m8272c(12);
        int iM8284m3 = c1736s3.m8284m() - 1;
        int iM8284m4 = c1736s3.m8284m();
        int iM8284m5 = c1736s3.m8284m();
        if (c1736s6 != null) {
            c1736s6.m8272c(12);
            iM8284m = c1736s6.m8284m();
        } else {
            iM8284m = 0;
        }
        int iM8284m6 = -1;
        if (c1736s5 != null) {
            c1736s5.m8272c(12);
            iM8284m2 = c1736s5.m8284m();
            if (iM8284m2 > 0) {
                iM8284m6 = c1736s5.m8284m() - 1;
                c1736s4 = c1736s5;
            }
        } else {
            c1736s4 = c1736s5;
            iM8284m2 = 0;
        }
        long j2 = 0;
        if (eVar.mo6857c() && C1732o.f9753w.equals(c1559j.f8321h.f9971h) && iM8284m3 == 0 && iM8284m == 0 && iM8284m2 == 0) {
            c1559j2 = c1559j;
            str = f8140a;
            int i5 = aVar2.f8149a;
            long[] jArr5 = new long[i5];
            int[] iArr8 = new int[i5];
            while (aVar2.m6854a()) {
                int i6 = aVar2.f8150b;
                jArr5[i6] = aVar2.f8152d;
                iArr8[i6] = aVar2.f8151c;
            }
            C1753m c1753m = c1559j2.f8321h;
            C1553d.a aVarM6861a = C1553d.m6861a(C1717af.m8092b(c1753m.f9986w, c1753m.f9984u), jArr5, iArr8, iM8284m5);
            jArr = aVarM6861a.f8179a;
            iArr = aVarM6861a.f8180b;
            i = aVarM6861a.f8181c;
            jArr2 = aVarM6861a.f8182d;
            iArr2 = aVarM6861a.f8183e;
            j = aVarM6861a.f8184f;
        } else {
            long[] jArr6 = new long[iMo6855a];
            int[] iArr9 = new int[iMo6855a];
            int i7 = iM8284m2;
            long[] jArr7 = new long[iMo6855a];
            iArr2 = new int[iMo6855a];
            int iM8280i = iM8284m5;
            long j3 = 0;
            long j4 = 0;
            int i8 = iM8284m3;
            int i9 = 0;
            int i10 = 0;
            int iM8284m7 = 0;
            int iM8280i2 = 0;
            int i11 = 0;
            int i12 = i7;
            int iM8284m8 = iM8284m6;
            int i13 = iM8284m;
            int i14 = iM8284m4;
            while (i9 < iMo6855a) {
                while (i11 == 0) {
                    C1711a.m8012b(aVar2.m6854a());
                    j4 = aVar2.f8152d;
                    i11 = aVar2.f8151c;
                    i8 = i8;
                    i14 = i14;
                }
                int i15 = i8;
                int i16 = i14;
                if (c1736s6 != null) {
                    while (iM8284m7 == 0 && i13 > 0) {
                        iM8284m7 = c1736s6.m8284m();
                        iM8280i2 = c1736s6.m8280i();
                        i13--;
                    }
                    iM8284m7--;
                }
                int i17 = iM8280i2;
                jArr6[i9] = j4;
                iArr9[i9] = eVar.mo6856b();
                if (iArr9[i9] > i10) {
                    i10 = iArr9[i9];
                }
                b bVar = eVar;
                long[] jArr8 = jArr6;
                jArr7[i9] = j3 + ((long) i17);
                iArr2[i9] = c1736s4 == null ? 1 : 0;
                if (i9 == iM8284m8) {
                    iArr2[i9] = 1;
                    i12--;
                    if (i12 > 0) {
                        iM8284m8 = c1736s4.m8284m() - 1;
                    }
                }
                j3 += (long) iM8280i;
                int iM8284m9 = i16 - 1;
                if (iM8284m9 == 0 && i15 > 0) {
                    i15--;
                    iM8284m9 = c1736s3.m8284m();
                    iM8280i = c1736s3.m8280i();
                }
                int i18 = iM8284m9;
                j4 += (long) iArr9[i9];
                i11--;
                i9++;
                eVar = bVar;
                jArr6 = jArr8;
                i14 = i18;
                iM8280i2 = i17;
                i8 = i15;
            }
            int i19 = i8;
            int i20 = i14;
            int i21 = iM8280i2;
            long[] jArr9 = jArr6;
            j = j3 + ((long) i21);
            C1711a.m8010a(iM8284m7 == 0);
            while (i13 > 0) {
                C1711a.m8010a(c1736s6.m8284m() == 0);
                c1736s6.m8280i();
                i13--;
            }
            if (i12 == 0 && i20 == 0) {
                i4 = i11;
                if (i4 == 0 && i19 == 0) {
                    c1559j2 = c1559j;
                    str = f8140a;
                }
                iArr = iArr9;
                jArr = jArr9;
                jArr2 = jArr7;
                i = i10;
            } else {
                i4 = i11;
            }
            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
            c1559j2 = c1559j;
            sb.append(c1559j2.f8316c);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i12);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i20);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i4);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i19);
            String string = sb.toString();
            str = f8140a;
            Log.w(str, string);
            iArr = iArr9;
            jArr = jArr9;
            jArr2 = jArr7;
            i = i10;
        }
        long jM8059a = C1717af.m8059a(j, 1000000L, c1559j2.f8318e);
        if (c1559j2.f8323j == null || c1570i.m6990a()) {
            C1717af.m8079a(jArr2, c1559j2.f8318e);
            return new C1562m(c1559j, jArr, iArr, i, jArr2, iArr2, jM8059a);
        }
        long[] jArr10 = c1559j2.f8323j;
        if (jArr10.length == 1 && c1559j2.f8317d == 1 && jArr2.length >= 2) {
            long j5 = c1559j2.f8324k[0];
            str2 = str;
            long jM8059a2 = j5 + C1717af.m8059a(jArr10[0], c1559j2.f8318e, c1559j2.f8319f);
            int length = jArr2.length - 1;
            i2 = iMo6855a;
            if (jArr2[0] <= j5 && j5 < jArr2[C1717af.m8050a(3, 0, length)] && jArr2[C1717af.m8050a(jArr2.length - 3, 0, length)] < jM8059a2 && jM8059a2 <= j) {
                long jM8059a3 = C1717af.m8059a(j5 - jArr2[0], c1559j2.f8321h.f9985v, c1559j2.f8318e);
                long jM8059a4 = C1717af.m8059a(j - jM8059a2, c1559j2.f8321h.f9985v, c1559j2.f8318e);
                if ((jM8059a3 != 0 || jM8059a4 != 0) && jM8059a3 <= 2147483647L && jM8059a4 <= 2147483647L) {
                    c1570i.f8380b = (int) jM8059a3;
                    c1570i.f8381c = (int) jM8059a4;
                    C1717af.m8079a(jArr2, c1559j2.f8318e);
                    return new C1562m(c1559j, jArr, iArr, i, jArr2, iArr2, jM8059a);
                }
            }
        } else {
            str2 = str;
            i2 = iMo6855a;
        }
        long[] jArr11 = c1559j2.f8323j;
        if (jArr11.length == 1 && jArr11[0] == 0) {
            long j6 = c1559j2.f8324k[0];
            for (int i22 = 0; i22 < jArr2.length; i22++) {
                jArr2[i22] = C1717af.m8059a(jArr2[i22] - j6, 1000000L, c1559j2.f8318e);
            }
            return new C1562m(c1559j, jArr, iArr, i, jArr2, iArr2, C1717af.m8059a(j - j6, 1000000L, c1559j2.f8318e));
        }
        boolean z4 = c1559j2.f8317d == 1;
        boolean z5 = false;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            long[] jArr12 = c1559j2.f8323j;
            if (i25 >= jArr12.length) {
                break;
            }
            int[] iArr10 = iArr;
            int i26 = i;
            long j7 = c1559j2.f8324k[i25];
            if (j7 != -1) {
                long jM8059a5 = C1717af.m8059a(jArr12[i25], c1559j2.f8318e, c1559j2.f8319f);
                int iM8056a = C1717af.m8056a(jArr2, j7, true, true);
                int iM8056a2 = C1717af.m8056a(jArr2, j7 + jM8059a5, z4, false);
                i23 += iM8056a2 - iM8056a;
                z5 |= i24 != iM8056a;
                i24 = iM8056a2;
            }
            i25++;
            iArr = iArr10;
            i = i26;
        }
        int[] iArr11 = iArr;
        int i27 = i;
        boolean z6 = z5 | (i23 != i2);
        long[] jArr13 = z6 ? new long[i23] : jArr;
        int[] iArr12 = z6 ? new int[i23] : iArr11;
        if (z6) {
            i27 = 0;
        }
        int[] iArr13 = z6 ? new int[i23] : iArr2;
        long[] jArr14 = new long[i23];
        int i28 = 0;
        int i29 = 0;
        while (true) {
            long[] jArr15 = c1559j2.f8323j;
            if (i29 >= jArr15.length) {
                return new C1562m(c1559j, jArr13, iArr12, i27, jArr14, iArr13, C1717af.m8059a(j2, 1000000L, c1559j2.f8318e));
            }
            int[] iArr14 = iArr11;
            long j8 = c1559j2.f8324k[i29];
            long j9 = jArr15[i29];
            if (j8 != -1) {
                i3 = i29;
                int[] iArr15 = iArr2;
                int[] iArr16 = iArr13;
                long jM8059a6 = C1717af.m8059a(j9, c1559j2.f8318e, c1559j2.f8319f) + j8;
                int iM8056a3 = C1717af.m8056a(jArr2, j8, true, true);
                int iM8056a4 = C1717af.m8056a(jArr2, jM8059a6, z4, false);
                if (z6) {
                    int i30 = iM8056a4 - iM8056a3;
                    System.arraycopy(jArr, iM8056a3, jArr13, i28, i30);
                    iArr3 = iArr14;
                    System.arraycopy(iArr3, iM8056a3, iArr12, i28, i30);
                    jArr3 = jArr;
                    iArr6 = iArr15;
                    jArr4 = jArr13;
                    iArr7 = iArr16;
                    System.arraycopy(iArr6, iM8056a3, iArr7, i28, i30);
                } else {
                    iArr3 = iArr14;
                    jArr3 = jArr;
                    iArr6 = iArr15;
                    jArr4 = jArr13;
                    iArr7 = iArr16;
                }
                if (iM8056a3 < iM8056a4 && (iArr7[i28] & 1) == 0) {
                    Log.w(str2, "Ignoring edit list: edit does not start with a sync sample.");
                    throw new g();
                }
                String str4 = str2;
                z3 = z4;
                int i31 = i27;
                while (iM8056a3 < iM8056a4) {
                    int[] iArr17 = iArr6;
                    int[] iArr18 = iArr7;
                    int i32 = iM8056a4;
                    String str5 = str4;
                    jArr14[i28] = C1717af.m8059a(j2, 1000000L, c1559j2.f8319f) + C1717af.m8059a(jArr2[iM8056a3] - j8, 1000000L, c1559j2.f8318e);
                    if (z6 && iArr12[i28] > i31) {
                        i31 = iArr3[iM8056a3];
                    }
                    i28++;
                    iM8056a3++;
                    iArr7 = iArr18;
                    iM8056a4 = i32;
                    str4 = str5;
                    iArr6 = iArr17;
                }
                iArr4 = iArr6;
                iArr5 = iArr7;
                str3 = str4;
                i27 = i31;
            } else {
                str3 = str2;
                iArr3 = iArr14;
                z3 = z4;
                jArr3 = jArr;
                jArr4 = jArr13;
                iArr4 = iArr2;
                iArr5 = iArr13;
                i3 = i29;
            }
            j2 += j9;
            i29 = i3 + 1;
            iArr13 = iArr5;
            iArr11 = iArr3;
            str2 = str3;
            jArr13 = jArr4;
            z4 = z3;
            jArr = jArr3;
            iArr2 = iArr4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1582a m6838a(AbstractC1550a.b bVar, boolean z) {
        if (z) {
            return null;
        }
        C1736s c1736s = bVar.f8139aV;
        c1736s.m8272c(8);
        while (c1736s.m8265a() >= 8) {
            int iM8271c = c1736s.m8271c();
            int iM8280i = c1736s.m8280i();
            if (c1736s.m8280i() == AbstractC1550a.f8070aG) {
                c1736s.m8272c(iM8271c);
                int i = iM8271c + iM8280i;
                c1736s.m8274d(12);
                while (true) {
                    if (c1736s.m8271c() >= i) {
                        break;
                    }
                    int iM8271c2 = c1736s.m8271c();
                    int iM8280i2 = c1736s.m8280i();
                    if (c1736s.m8280i() == AbstractC1550a.f8071aH) {
                        c1736s.m8272c(iM8271c2);
                        int i2 = iM8271c2 + iM8280i2;
                        c1736s.m8274d(8);
                        ArrayList arrayList = new ArrayList();
                        while (c1736s.m8271c() < i2) {
                            C1582a.a aVarM6911a = C1555f.m6911a(c1736s);
                            if (aVarM6911a != null) {
                                arrayList.add(aVarM6911a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new C1582a(arrayList);
                        }
                    } else {
                        c1736s.m8274d(iM8280i2 - 8);
                    }
                }
                return null;
            }
            c1736s.m8274d(iM8280i - 8);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static C1582a m6839a(C1736s c1736s, int i) {
        c1736s.m8274d(12);
        while (c1736s.m8271c() < i) {
            int iM8271c = c1736s.m8271c();
            int iM8280i = c1736s.m8280i();
            if (c1736s.m8280i() == AbstractC1550a.f8071aH) {
                c1736s.m8272c(iM8271c);
                int i2 = iM8271c + iM8280i;
                c1736s.m8274d(8);
                ArrayList arrayList = new ArrayList();
                while (c1736s.m8271c() < i2) {
                    C1582a.a aVarM6911a = C1555f.m6911a(c1736s);
                    if (aVarM6911a != null) {
                        arrayList.add(aVarM6911a);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new C1582a(arrayList);
            }
            c1736s.m8274d(iM8280i - 8);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static void m6840a(C1736s c1736s, int i, int i2, int i3, int i4, int i5, C1536e c1536e, c cVar, int i6) throws C1763t {
        int i7 = i2;
        C1536e c1536eM6769a = c1536e;
        c1736s.m8272c(i7 + 8 + 8);
        c1736s.m8274d(16);
        int iM8275e = c1736s.m8275e();
        int iM8275e2 = c1736s.m8275e();
        c1736s.m8274d(50);
        int iM8271c = c1736s.m8271c();
        int iIntValue = i;
        if (iIntValue == AbstractC1550a.f8088ae) {
            Pair<Integer, C1560k> pairM6844b = m6844b(c1736s, i7, i3);
            if (pairM6844b != null) {
                iIntValue = ((Integer) pairM6844b.first).intValue();
                c1536eM6769a = c1536eM6769a == null ? null : c1536eM6769a.m6769a(((C1560k) pairM6844b.second).f8329b);
                cVar.f8159b[i6] = (C1560k) pairM6844b.second;
            }
            c1736s.m8272c(iM8271c);
        }
        C1536e c1536e2 = c1536eM6769a;
        String str = null;
        boolean z = false;
        List<byte[]> listSingletonList = null;
        float fM8284m = 1.0f;
        byte[] bArrCopyOfRange = null;
        int i8 = -1;
        while (iM8271c - i7 < i3) {
            c1736s.m8272c(iM8271c);
            int iM8271c2 = c1736s.m8271c();
            int iM8280i = c1736s.m8280i();
            if (iM8280i == 0 && c1736s.m8271c() - i7 == i3) {
                break;
            }
            C1711a.m8011a(iM8280i > 0, "childAtomSize should be positive");
            int iM8280i2 = c1736s.m8280i();
            if (iM8280i2 == AbstractC1550a.f8049M) {
                C1711a.m8012b(str == null);
                c1736s.m8272c(iM8271c2 + 8);
                C1745a c1745aM8319a = C1745a.m8319a(c1736s);
                listSingletonList = c1745aM8319a.f9835a;
                cVar.f8161d = c1745aM8319a.f9836b;
                if (!z) {
                    fM8284m = c1745aM8319a.f9839e;
                }
                str = C1732o.f9738h;
            } else if (iM8280i2 == AbstractC1550a.f8050N) {
                C1711a.m8012b(str == null);
                c1736s.m8272c(iM8271c2 + 8);
                C1748d c1748dM8331a = C1748d.m8331a(c1736s);
                listSingletonList = c1748dM8331a.f9860a;
                cVar.f8161d = c1748dM8331a.f9861b;
                str = C1732o.f9739i;
            } else if (iM8280i2 == AbstractC1550a.f8081aR) {
                C1711a.m8012b(str == null);
                str = iIntValue == AbstractC1550a.f8079aP ? C1732o.f9740j : C1732o.f9741k;
            } else if (iM8280i2 == AbstractC1550a.f8120l) {
                C1711a.m8012b(str == null);
                str = C1732o.f9737g;
            } else if (iM8280i2 == AbstractC1550a.f8051O) {
                C1711a.m8012b(str == null);
                Pair<String, byte[]> pairM6851d = m6851d(c1736s, iM8271c2);
                String str2 = (String) pairM6851d.first;
                listSingletonList = Collections.singletonList((byte[]) pairM6851d.second);
                str = str2;
            } else if (iM8280i2 == AbstractC1550a.f8097an) {
                c1736s.m8272c(iM8271c2 + 8);
                fM8284m = c1736s.m8284m() / c1736s.m8284m();
                z = true;
            } else if (iM8280i2 == AbstractC1550a.f8077aN) {
                int i9 = iM8271c2 + 8;
                while (true) {
                    if (i9 - iM8271c2 >= iM8280i) {
                        bArrCopyOfRange = null;
                        break;
                    }
                    c1736s.m8272c(i9);
                    int iM8280i3 = c1736s.m8280i();
                    if (c1736s.m8280i() == AbstractC1550a.f8078aO) {
                        bArrCopyOfRange = Arrays.copyOfRange(c1736s.f9792a, i9, iM8280i3 + i9);
                        break;
                    }
                    i9 += iM8280i3;
                }
            } else if (iM8280i2 == AbstractC1550a.f8076aM) {
                int iM8273d = c1736s.m8273d();
                c1736s.m8274d(3);
                if (iM8273d == 0) {
                    int iM8273d2 = c1736s.m8273d();
                    if (iM8273d2 == 0) {
                        i8 = 0;
                    } else if (iM8273d2 == 1) {
                        i8 = 1;
                    } else if (iM8273d2 == 2) {
                        i8 = 2;
                    } else if (iM8273d2 == 3) {
                        i8 = 3;
                    }
                }
            }
            iM8271c += iM8280i;
            i7 = i2;
        }
        if (str == null) {
            return;
        }
        cVar.f8160c = C1753m.m8390a(Integer.toString(i4), str, null, -1, -1, iM8275e, iM8275e2, -1.0f, listSingletonList, i5, fM8284m, bArrCopyOfRange, i8, null, c1536e2);
    }

    /* JADX INFO: renamed from: a */
    private static void m6841a(C1736s c1736s, int i, int i2, int i3, int i4, String str, c cVar) {
        c1736s.m8272c(i2 + 8 + 8);
        int i5 = AbstractC1550a.f8098ao;
        String str2 = C1732o.f9718Z;
        List listSingletonList = null;
        long j = Long.MAX_VALUE;
        if (i != i5) {
            if (i == AbstractC1550a.f8109az) {
                int i6 = (i3 - 8) - 8;
                byte[] bArr = new byte[i6];
                c1736s.m8268a(bArr, 0, i6);
                listSingletonList = Collections.singletonList(bArr);
                str2 = C1732o.f9720aa;
            } else if (i == AbstractC1550a.f8064aA) {
                str2 = C1732o.f9721ab;
            } else if (i == AbstractC1550a.f8065aB) {
                j = 0;
            } else {
                if (i != AbstractC1550a.f8066aC) {
                    throw new IllegalStateException();
                }
                cVar.f8162e = 1;
                str2 = C1732o.f9722ac;
            }
        }
        cVar.f8160c = C1753m.m8397a(Integer.toString(i4), str2, (String) null, -1, 0, str, -1, (C1536e) null, j, (List<byte[]>) listSingletonList);
    }

    /* JADX INFO: renamed from: a */
    private static void m6842a(C1736s c1736s, int i, int i2, int i3, int i4, String str, boolean z, C1536e c1536e, c cVar, int i5) {
        int iM8275e;
        int iRound;
        int iM8284m;
        int i6;
        int i7;
        String str2;
        String str3;
        C1536e c1536e2;
        int iM8271c;
        C1753m c1753mM6407b;
        int i8 = i2;
        C1536e c1536eM6769a = c1536e;
        c1736s.m8272c(i8 + 8 + 8);
        if (z) {
            iM8275e = c1736s.m8275e();
            c1736s.m8274d(6);
        } else {
            c1736s.m8274d(8);
            iM8275e = 0;
        }
        if (iM8275e == 0 || iM8275e == 1) {
            int iM8275e2 = c1736s.m8275e();
            c1736s.m8274d(6);
            int iM8282k = c1736s.m8282k();
            if (iM8275e == 1) {
                c1736s.m8274d(16);
            }
            iRound = iM8282k;
            iM8284m = iM8275e2;
        } else {
            if (iM8275e != 2) {
                return;
            }
            c1736s.m8274d(16);
            iRound = (int) Math.round(Double.longBitsToDouble(c1736s.m8281j()));
            iM8284m = c1736s.m8284m();
            c1736s.m8274d(20);
        }
        int iM8271c2 = c1736s.m8271c();
        int iIntValue = i;
        if (iIntValue == AbstractC1550a.f8089af) {
            Pair<Integer, C1560k> pairM6844b = m6844b(c1736s, i8, i3);
            if (pairM6844b != null) {
                iIntValue = ((Integer) pairM6844b.first).intValue();
                c1536eM6769a = c1536eM6769a == null ? null : c1536eM6769a.m6769a(((C1560k) pairM6844b.second).f8329b);
                cVar.f8159b[i5] = (C1560k) pairM6844b.second;
            }
            c1736s.m8272c(iM8271c2);
        }
        C1536e c1536e3 = c1536eM6769a;
        int i9 = AbstractC1550a.f8127s;
        String str4 = C1732o.f9753w;
        String str5 = iIntValue == i9 ? C1732o.f9756z : iIntValue == AbstractC1550a.f8129u ? C1732o.f9693A : iIntValue == AbstractC1550a.f8131w ? C1732o.f9696D : (iIntValue == AbstractC1550a.f8132x || iIntValue == AbstractC1550a.f8133y) ? C1732o.f9697E : iIntValue == AbstractC1550a.f8134z ? C1732o.f9698F : iIntValue == AbstractC1550a.f8067aD ? C1732o.f9701I : iIntValue == AbstractC1550a.f8068aE ? C1732o.f9702J : (iIntValue == AbstractC1550a.f8125q || iIntValue == AbstractC1550a.f8126r) ? C1732o.f9753w : iIntValue == AbstractC1550a.f8123o ? C1732o.f9750t : iIntValue == AbstractC1550a.f8083aT ? C1732o.f9704L : null;
        int iIntValue2 = iM8284m;
        int i10 = iRound;
        int i11 = iM8271c2;
        byte[] bArr = null;
        while (i11 - i8 < i3) {
            c1736s.m8272c(i11);
            int iM8280i = c1736s.m8280i();
            C1711a.m8011a(iM8280i > 0, "childAtomSize should be positive");
            int iM8280i2 = c1736s.m8280i();
            int i12 = AbstractC1550a.f8051O;
            if (iM8280i2 == i12 || (z && iM8280i2 == AbstractC1550a.f8124p)) {
                i6 = iM8280i;
                i7 = i11;
                str2 = str5;
                str3 = str4;
                c1536e2 = c1536e3;
                if (iM8280i2 != i12) {
                    iM8271c = c1736s.m8271c();
                    while (true) {
                        if (iM8271c - i7 >= i6) {
                            iM8271c = -1;
                            break;
                        }
                        c1736s.m8272c(iM8271c);
                        int iM8280i3 = c1736s.m8280i();
                        C1711a.m8011a(iM8280i3 > 0, "childAtomSize should be positive");
                        if (c1736s.m8280i() == AbstractC1550a.f8051O) {
                            break;
                        } else {
                            iM8271c += iM8280i3;
                        }
                    }
                } else {
                    iM8271c = i7;
                }
                if (iM8271c != -1) {
                    Pair<String, byte[]> pairM6851d = m6851d(c1736s, iM8271c);
                    String str6 = (String) pairM6851d.first;
                    byte[] bArr2 = (byte[]) pairM6851d.second;
                    if (C1732o.f9748r.equals(str6)) {
                        Pair<Integer, Integer> pairM8141a = C1721d.m8141a(bArr2);
                        int iIntValue3 = ((Integer) pairM8141a.first).intValue();
                        bArr = bArr2;
                        str5 = str6;
                        iIntValue2 = ((Integer) pairM8141a.second).intValue();
                        i10 = iIntValue3;
                    } else {
                        bArr = bArr2;
                        str5 = str6;
                    }
                }
                i11 = i7 + i6;
                i8 = i2;
                c1536e3 = c1536e2;
                str4 = str3;
            } else {
                if (iM8280i2 == AbstractC1550a.f8128t) {
                    c1736s.m8272c(i11 + 8);
                    c1753mM6407b = C1501a.m6404a(c1736s, Integer.toString(i4), str, c1536e3);
                } else if (iM8280i2 == AbstractC1550a.f8130v) {
                    c1736s.m8272c(i11 + 8);
                    c1753mM6407b = C1501a.m6407b(c1736s, Integer.toString(i4), str, c1536e3);
                } else if (iM8280i2 == AbstractC1550a.f8037A) {
                    i6 = iM8280i;
                    str2 = str5;
                    str3 = str4;
                    c1536e2 = c1536e3;
                    i7 = i11;
                    cVar.f8160c = C1753m.m8395a(Integer.toString(i4), str5, null, -1, iIntValue2, i10, null, c1536e3, str);
                } else {
                    i6 = iM8280i;
                    i7 = i11;
                    str2 = str5;
                    str3 = str4;
                    c1536e2 = c1536e3;
                    if (iM8280i2 == AbstractC1550a.f8083aT) {
                        byte[] bArr3 = new byte[i6];
                        c1736s.m8272c(i7);
                        c1736s.m8268a(bArr3, 0, i6);
                        bArr = bArr3;
                    }
                }
                cVar.f8160c = c1753mM6407b;
                i6 = iM8280i;
                i7 = i11;
                str2 = str5;
                str3 = str4;
                c1536e2 = c1536e3;
            }
            str5 = str2;
            i11 = i7 + i6;
            i8 = i2;
            c1536e3 = c1536e2;
            str4 = str3;
        }
        String str7 = str5;
        String str8 = str4;
        C1536e c1536e4 = c1536e3;
        if (cVar.f8160c != null || str7 == null) {
            return;
        }
        cVar.f8160c = C1753m.m8393a(Integer.toString(i4), str7, (String) null, -1, iIntValue2, i10, str8.equals(str7) ? 2 : -1, (List<byte[]>) (bArr == null ? null : Collections.singletonList(bArr)), c1536e4, str);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6843a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[C1717af.m8050a(3, 0, length)] && jArr[C1717af.m8050a(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    /* JADX INFO: renamed from: b */
    private static Pair<Integer, C1560k> m6844b(C1736s c1736s, int i, int i2) {
        Pair<Integer, C1560k> pairM6849c;
        int iM8271c = c1736s.m8271c();
        while (iM8271c - i < i2) {
            c1736s.m8272c(iM8271c);
            int iM8280i = c1736s.m8280i();
            C1711a.m8011a(iM8280i > 0, "childAtomSize should be positive");
            if (c1736s.m8280i() == AbstractC1550a.f8084aa && (pairM6849c = m6849c(c1736s, iM8271c, iM8280i)) != null) {
                return pairM6849c;
            }
            iM8271c += iM8280i;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static f m6845b(C1736s c1736s) {
        boolean z;
        c1736s.m8272c(8);
        int iM6823a = AbstractC1550a.m6823a(c1736s.m8280i());
        c1736s.m8274d(iM6823a == 0 ? 8 : 16);
        int iM8280i = c1736s.m8280i();
        c1736s.m8274d(4);
        int iM8271c = c1736s.m8271c();
        int i = iM6823a == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            }
            if (c1736s.f9792a[iM8271c + i3] != -1) {
                z = false;
                break;
            }
            i3++;
        }
        long j = C1500b.f7455b;
        if (z) {
            c1736s.m8274d(i);
        } else {
            long jM8279h = iM6823a == 0 ? c1736s.m8279h() : c1736s.m8285n();
            if (jM8279h != 0) {
                j = jM8279h;
            }
        }
        c1736s.m8274d(16);
        int iM8280i2 = c1736s.m8280i();
        int iM8280i3 = c1736s.m8280i();
        c1736s.m8274d(4);
        int iM8280i4 = c1736s.m8280i();
        int iM8280i5 = c1736s.m8280i();
        if (iM8280i2 == 0 && iM8280i3 == 65536 && iM8280i4 == -65536 && iM8280i5 == 0) {
            i2 = 90;
        } else if (iM8280i2 == 0 && iM8280i3 == -65536 && iM8280i4 == 65536 && iM8280i5 == 0) {
            i2 = SubsamplingScaleImageView.ORIENTATION_270;
        } else if (iM8280i2 == -65536 && iM8280i3 == 0 && iM8280i4 == 0 && iM8280i5 == -65536) {
            i2 = 180;
        }
        return new f(iM8280i, j, i2);
    }

    /* JADX INFO: renamed from: b */
    private static C1582a m6846b(C1736s c1736s, int i) {
        c1736s.m8274d(8);
        ArrayList arrayList = new ArrayList();
        while (c1736s.m8271c() < i) {
            C1582a.a aVarM6911a = C1555f.m6911a(c1736s);
            if (aVarM6911a != null) {
                arrayList.add(aVarM6911a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1582a(arrayList);
    }

    /* JADX INFO: renamed from: c */
    private static float m6847c(C1736s c1736s, int i) {
        c1736s.m8272c(i + 8);
        return c1736s.m8284m() / c1736s.m8284m();
    }

    /* JADX INFO: renamed from: c */
    private static int m6848c(C1736s c1736s) {
        c1736s.m8272c(16);
        int iM8280i = c1736s.m8280i();
        if (iM8280i == f8142c) {
            return 1;
        }
        if (iM8280i == f8141b) {
            return 2;
        }
        if (iM8280i == f8143d || iM8280i == f8144e || iM8280i == f8145f || iM8280i == f8146g) {
            return 3;
        }
        return iM8280i == f8147h ? 4 : -1;
    }

    /* JADX INFO: renamed from: c */
    private static Pair<Integer, C1560k> m6849c(C1736s c1736s, int i, int i2) {
        int i3 = i + 8;
        String strM8286o = null;
        Integer numValueOf = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            c1736s.m8272c(i3);
            int iM8280i = c1736s.m8280i();
            int iM8280i2 = c1736s.m8280i();
            if (iM8280i2 == AbstractC1550a.f8090ag) {
                numValueOf = Integer.valueOf(c1736s.m8280i());
            } else if (iM8280i2 == AbstractC1550a.f8085ab) {
                c1736s.m8274d(4);
                strM8286o = c1736s.m8286o();
            } else if (iM8280i2 == AbstractC1550a.f8086ac) {
                i4 = i3;
                i5 = iM8280i;
            }
            i3 += iM8280i;
        }
        if (!C1500b.f7464bd.equals(strM8286o) && !C1500b.f7465be.equals(strM8286o) && !C1500b.f7466bf.equals(strM8286o) && !C1500b.f7467bg.equals(strM8286o)) {
            return null;
        }
        C1711a.m8011a(numValueOf != null, "frma atom is mandatory");
        C1711a.m8011a(i4 != -1, "schi atom is mandatory");
        C1560k c1560kM6836a = m6836a(c1736s, i4, i5, strM8286o);
        C1711a.m8011a(c1560kM6836a != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, c1560kM6836a);
    }

    /* JADX INFO: renamed from: d */
    private static Pair<Long, String> m6850d(C1736s c1736s) {
        c1736s.m8272c(8);
        int iM6823a = AbstractC1550a.m6823a(c1736s.m8280i());
        c1736s.m8274d(iM6823a == 0 ? 8 : 16);
        long jM8279h = c1736s.m8279h();
        c1736s.m8274d(iM6823a == 0 ? 4 : 8);
        int iM8275e = c1736s.m8275e();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((iM8275e >> 10) & 31) + 96));
        sb.append((char) (((iM8275e >> 5) & 31) + 96));
        sb.append((char) ((iM8275e & 31) + 96));
        return Pair.create(Long.valueOf(jM8279h), sb.toString());
    }

    /* JADX INFO: renamed from: d */
    private static Pair<String, byte[]> m6851d(C1736s c1736s, int i) {
        c1736s.m8272c(i + 8 + 4);
        c1736s.m8274d(1);
        m6853e(c1736s);
        c1736s.m8274d(2);
        int iM8273d = c1736s.m8273d();
        if ((iM8273d & 128) != 0) {
            c1736s.m8274d(2);
        }
        if ((iM8273d & 64) != 0) {
            c1736s.m8274d(c1736s.m8275e());
        }
        if ((iM8273d & 32) != 0) {
            c1736s.m8274d(2);
        }
        c1736s.m8274d(1);
        m6853e(c1736s);
        String strM8200a = C1732o.m8200a(c1736s.m8273d());
        if (C1732o.f9750t.equals(strM8200a) || C1732o.f9696D.equals(strM8200a) || C1732o.f9697E.equals(strM8200a)) {
            return Pair.create(strM8200a, null);
        }
        c1736s.m8274d(12);
        c1736s.m8274d(1);
        int iM6853e = m6853e(c1736s);
        byte[] bArr = new byte[iM6853e];
        c1736s.m8268a(bArr, 0, iM6853e);
        return Pair.create(strM8200a, bArr);
    }

    /* JADX INFO: renamed from: d */
    private static byte[] m6852d(C1736s c1736s, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c1736s.m8272c(i3);
            int iM8280i = c1736s.m8280i();
            if (c1736s.m8280i() == AbstractC1550a.f8078aO) {
                return Arrays.copyOfRange(c1736s.f9792a, i3, iM8280i + i3);
            }
            i3 += iM8280i;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static int m6853e(C1736s c1736s) {
        int iM8273d = c1736s.m8273d();
        int i = iM8273d & 127;
        while ((iM8273d & 128) == 128) {
            iM8273d = c1736s.m8273d();
            i = (i << 7) | (iM8273d & 127);
        }
        return i;
    }
}
