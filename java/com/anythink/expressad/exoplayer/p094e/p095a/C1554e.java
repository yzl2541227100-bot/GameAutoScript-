package com.anythink.expressad.exoplayer.p094e.p095a;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1763t;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p094e.C1549a;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1566e;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1567f;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1568g;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1569h;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1572k;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1574m;
import com.anythink.expressad.exoplayer.p094e.p095a.AbstractC1550a;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1714ac;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.exoplayer.p107k.C1733p;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1554e implements InterfaceC1566e {

    /* JADX INFO: renamed from: e */
    public static final int f8186e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f8187f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f8188g = 4;

    /* JADX INFO: renamed from: h */
    public static final int f8189h = 16;

    /* JADX INFO: renamed from: i */
    private static final int f8190i = 8;

    /* JADX INFO: renamed from: j */
    private static final String f8191j = "FragmentedMp4Extractor";

    /* JADX INFO: renamed from: n */
    private static final int f8195n = 0;

    /* JADX INFO: renamed from: o */
    private static final int f8196o = 1;

    /* JADX INFO: renamed from: p */
    private static final int f8197p = 2;

    /* JADX INFO: renamed from: q */
    private static final int f8198q = 3;

    /* JADX INFO: renamed from: r */
    private static final int f8199r = 4;

    /* JADX INFO: renamed from: A */
    @Nullable
    private final C1714ac f8200A;

    /* JADX INFO: renamed from: B */
    private final C1736s f8201B;

    /* JADX INFO: renamed from: C */
    private final byte[] f8202C;

    /* JADX INFO: renamed from: D */
    private final ArrayDeque<AbstractC1550a.a> f8203D;

    /* JADX INFO: renamed from: E */
    private final ArrayDeque<b> f8204E;

    /* JADX INFO: renamed from: F */
    @Nullable
    private final InterfaceC1574m f8205F;

    /* JADX INFO: renamed from: G */
    private int f8206G;

    /* JADX INFO: renamed from: H */
    private int f8207H;

    /* JADX INFO: renamed from: I */
    private long f8208I;

    /* JADX INFO: renamed from: J */
    private int f8209J;

    /* JADX INFO: renamed from: K */
    private C1736s f8210K;

    /* JADX INFO: renamed from: L */
    private long f8211L;

    /* JADX INFO: renamed from: M */
    private int f8212M;

    /* JADX INFO: renamed from: N */
    private long f8213N;

    /* JADX INFO: renamed from: O */
    private long f8214O;

    /* JADX INFO: renamed from: P */
    private long f8215P;

    /* JADX INFO: renamed from: Q */
    private c f8216Q;

    /* JADX INFO: renamed from: R */
    private int f8217R;

    /* JADX INFO: renamed from: S */
    private int f8218S;

    /* JADX INFO: renamed from: T */
    private int f8219T;

    /* JADX INFO: renamed from: U */
    private boolean f8220U;

    /* JADX INFO: renamed from: V */
    private InterfaceC1568g f8221V;

    /* JADX INFO: renamed from: W */
    private InterfaceC1574m[] f8222W;

    /* JADX INFO: renamed from: X */
    private InterfaceC1574m[] f8223X;

    /* JADX INFO: renamed from: Y */
    private boolean f8224Y;

    /* JADX INFO: renamed from: s */
    private final int f8225s;

    /* JADX INFO: renamed from: t */
    @Nullable
    private final C1559j f8226t;

    /* JADX INFO: renamed from: u */
    private final List<C1753m> f8227u;

    /* JADX INFO: renamed from: v */
    @Nullable
    private final C1536e f8228v;

    /* JADX INFO: renamed from: w */
    private final SparseArray<c> f8229w;

    /* JADX INFO: renamed from: x */
    private final C1736s f8230x;

    /* JADX INFO: renamed from: y */
    private final C1736s f8231y;

    /* JADX INFO: renamed from: z */
    private final C1736s f8232z;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC1569h f8185d = new InterfaceC1569h() { // from class: com.anythink.expressad.exoplayer.e.a.e.1
        @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1569h
        /* JADX INFO: renamed from: a */
        public final InterfaceC1566e[] mo6901a() {
            return new InterfaceC1566e[]{new C1554e()};
        }
    };

    /* JADX INFO: renamed from: k */
    private static final int f8192k = C1717af.m8116f("seig");

    /* JADX INFO: renamed from: l */
    private static final byte[] f8193l = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: m */
    private static final C1753m f8194m = C1753m.m8387a((String) null, C1732o.f9728ai);

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.e$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final long f8233a;

        /* JADX INFO: renamed from: b */
        public final int f8234b;

        public b(long j, int i) {
            this.f8233a = j;
            this.f8234b = i;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.e$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1574m f8235a;

        /* JADX INFO: renamed from: c */
        public C1559j f8237c;

        /* JADX INFO: renamed from: d */
        public C1552c f8238d;

        /* JADX INFO: renamed from: e */
        public int f8239e;

        /* JADX INFO: renamed from: f */
        public int f8240f;

        /* JADX INFO: renamed from: g */
        public int f8241g;

        /* JADX INFO: renamed from: h */
        public int f8242h;

        /* JADX INFO: renamed from: b */
        public final C1561l f8236b = new C1561l();

        /* JADX INFO: renamed from: i */
        private final C1736s f8243i = new C1736s(1);

        /* JADX INFO: renamed from: j */
        private final C1736s f8244j = new C1736s();

        public c(InterfaceC1574m interfaceC1574m) {
            this.f8235a = interfaceC1574m;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m6902a(c cVar) {
            C1561l c1561l = cVar.f8236b;
            if (c1561l.f8345m) {
                C1736s c1736s = c1561l.f8349q;
                int i = cVar.m6904e().f8331d;
                if (i != 0) {
                    c1736s.m8274d(i);
                }
                if (cVar.f8236b.f8346n[cVar.f8239e]) {
                    c1736s.m8274d(c1736s.m8275e() * 6);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        private void m6903d() {
            C1561l c1561l = this.f8236b;
            if (c1561l.f8345m) {
                C1736s c1736s = c1561l.f8349q;
                int i = m6904e().f8331d;
                if (i != 0) {
                    c1736s.m8274d(i);
                }
                if (this.f8236b.f8346n[this.f8239e]) {
                    c1736s.m8274d(c1736s.m8275e() * 6);
                }
            }
        }

        /* JADX INFO: renamed from: e */
        private C1560k m6904e() {
            C1561l c1561l = this.f8236b;
            int i = c1561l.f8333a.f8174a;
            C1560k c1560k = c1561l.f8347o;
            return c1560k != null ? c1560k : this.f8237c.m6948a(i);
        }

        /* JADX INFO: renamed from: a */
        public final void m6905a() {
            this.f8236b.m6951a();
            this.f8239e = 0;
            this.f8241g = 0;
            this.f8240f = 0;
            this.f8242h = 0;
        }

        /* JADX INFO: renamed from: a */
        public final void m6906a(long j) {
            long jM6396a = C1500b.m6396a(j);
            int i = this.f8239e;
            while (true) {
                C1561l c1561l = this.f8236b;
                if (i >= c1561l.f8338f || c1561l.m6955b(i) >= jM6396a) {
                    return;
                }
                if (this.f8236b.f8344l[i]) {
                    this.f8242h = i;
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m6907a(C1536e c1536e) {
            C1560k c1560kM6948a = this.f8237c.m6948a(this.f8236b.f8333a.f8174a);
            this.f8235a.mo6984a(this.f8237c.f8321h.m8413a(c1536e.m6769a(c1560kM6948a != null ? c1560kM6948a.f8329b : null)));
        }

        /* JADX INFO: renamed from: a */
        public final void m6908a(C1559j c1559j, C1552c c1552c) {
            this.f8237c = (C1559j) C1711a.m8005a(c1559j);
            this.f8238d = (C1552c) C1711a.m8005a(c1552c);
            this.f8235a.mo6984a(c1559j.f8321h);
            m6905a();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m6909b() {
            this.f8239e++;
            int i = this.f8240f + 1;
            this.f8240f = i;
            int[] iArr = this.f8236b.f8340h;
            int i2 = this.f8241g;
            if (i != iArr[i2]) {
                return true;
            }
            this.f8241g = i2 + 1;
            this.f8240f = 0;
            return false;
        }

        /* JADX INFO: renamed from: c */
        public final int m6910c() {
            C1736s c1736s;
            if (!this.f8236b.f8345m) {
                return 0;
            }
            C1560k c1560kM6904e = m6904e();
            int length = c1560kM6904e.f8331d;
            if (length != 0) {
                c1736s = this.f8236b.f8349q;
            } else {
                byte[] bArr = c1560kM6904e.f8332e;
                this.f8244j.m8267a(bArr, bArr.length);
                C1736s c1736s2 = this.f8244j;
                length = bArr.length;
                c1736s = c1736s2;
            }
            boolean z = this.f8236b.f8346n[this.f8239e];
            C1736s c1736s3 = this.f8243i;
            c1736s3.f9792a[0] = (byte) ((z ? 128 : 0) | length);
            c1736s3.m8272c(0);
            this.f8235a.mo6983a(this.f8243i, 1);
            this.f8235a.mo6983a(c1736s, length);
            if (!z) {
                return length + 1;
            }
            C1736s c1736s4 = this.f8236b.f8349q;
            int iM8275e = c1736s4.m8275e();
            c1736s4.m8274d(-2);
            int i = (iM8275e * 6) + 2;
            this.f8235a.mo6983a(c1736s4, i);
            return length + 1 + i;
        }
    }

    public C1554e() {
        this(0);
    }

    public C1554e(int i) {
        this(i, null);
    }

    private C1554e(int i, @Nullable C1714ac c1714ac) {
        this(i, c1714ac, null, null);
    }

    private C1554e(int i, @Nullable C1714ac c1714ac, @Nullable C1559j c1559j, @Nullable C1536e c1536e) {
        this(i, c1714ac, c1559j, c1536e, Collections.emptyList());
    }

    private C1554e(int i, @Nullable C1714ac c1714ac, @Nullable C1559j c1559j, @Nullable C1536e c1536e, List<C1753m> list) {
        this(i, c1714ac, c1559j, c1536e, list, null);
    }

    private C1554e(int i, @Nullable C1714ac c1714ac, @Nullable C1559j c1559j, @Nullable C1536e c1536e, List<C1753m> list, @Nullable InterfaceC1574m interfaceC1574m) {
        this.f8225s = i | (c1559j != null ? 8 : 0);
        this.f8200A = c1714ac;
        this.f8226t = c1559j;
        this.f8228v = c1536e;
        this.f8227u = Collections.unmodifiableList(list);
        this.f8205F = interfaceC1574m;
        this.f8201B = new C1736s(16);
        this.f8230x = new C1736s(C1733p.f9760a);
        this.f8231y = new C1736s(5);
        this.f8232z = new C1736s();
        this.f8202C = new byte[16];
        this.f8203D = new ArrayDeque<>();
        this.f8204E = new ArrayDeque<>();
        this.f8229w = new SparseArray<>();
        this.f8214O = C1500b.f7455b;
        this.f8213N = C1500b.f7455b;
        this.f8215P = C1500b.f7455b;
        m6868a();
    }

    /* JADX INFO: renamed from: a */
    private static int m6862a(c cVar, int i, long j, int i2, C1736s c1736s, int i3) {
        boolean z;
        int iM8284m;
        boolean z3;
        int iM8280i;
        boolean z4;
        boolean z5;
        c1736s.m8272c(8);
        int iM6824b = AbstractC1550a.m6824b(c1736s.m8280i());
        C1559j c1559j = cVar.f8237c;
        C1561l c1561l = cVar.f8236b;
        C1552c c1552c = c1561l.f8333a;
        c1561l.f8340h[i] = c1736s.m8284m();
        long[] jArr = c1561l.f8339g;
        jArr[i] = c1561l.f8335c;
        if ((iM6824b & 1) != 0) {
            jArr[i] = jArr[i] + ((long) c1736s.m8280i());
        }
        boolean z6 = (iM6824b & 4) != 0;
        int iM8284m2 = c1552c.f8177d;
        if (z6) {
            iM8284m2 = c1736s.m8284m();
        }
        boolean z7 = (iM6824b & 256) != 0;
        boolean z8 = (iM6824b & 512) != 0;
        boolean z9 = (iM6824b & 1024) != 0;
        boolean z10 = (iM6824b & 2048) != 0;
        long[] jArr2 = c1559j.f8323j;
        long jM8059a = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            jM8059a = C1717af.m8059a(c1559j.f8324k[0], 1000L, c1559j.f8318e);
        }
        int[] iArr = c1561l.f8341i;
        int[] iArr2 = c1561l.f8342j;
        long[] jArr3 = c1561l.f8343k;
        boolean[] zArr = c1561l.f8344l;
        int i4 = iM8284m2;
        boolean z11 = c1559j.f8317d == 2 && (i2 & 1) != 0;
        int i5 = i3 + c1561l.f8340h[i];
        long j2 = c1559j.f8318e;
        long j3 = jM8059a;
        long j4 = i > 0 ? c1561l.f8351s : j;
        int i6 = i3;
        while (i6 < i5) {
            int iM8284m3 = z7 ? c1736s.m8284m() : c1552c.f8175b;
            if (z8) {
                z = z7;
                iM8284m = c1736s.m8284m();
            } else {
                z = z7;
                iM8284m = c1552c.f8176c;
            }
            if (i6 == 0 && z6) {
                z3 = z6;
                iM8280i = i4;
            } else if (z9) {
                z3 = z6;
                iM8280i = c1736s.m8280i();
            } else {
                z3 = z6;
                iM8280i = c1552c.f8177d;
            }
            boolean z12 = z10;
            if (z10) {
                z4 = z8;
                z5 = z9;
                iArr2[i6] = (int) ((((long) c1736s.m8280i()) * 1000) / j2);
            } else {
                z4 = z8;
                z5 = z9;
                iArr2[i6] = 0;
            }
            jArr3[i6] = C1717af.m8059a(j4, 1000L, j2) - j3;
            iArr[i6] = iM8284m;
            zArr[i6] = ((iM8280i >> 16) & 1) == 0 && (!z11 || i6 == 0);
            i6++;
            j4 += (long) iM8284m3;
            j2 = j2;
            z7 = z;
            z6 = z3;
            z10 = z12;
            z8 = z4;
            z9 = z5;
        }
        c1561l.f8351s = j4;
        return i5;
    }

    /* JADX INFO: renamed from: a */
    private static Pair<Long, C1549a> m6863a(C1736s c1736s, long j) throws C1763t {
        long jM8285n;
        long jM8285n2;
        c1736s.m8272c(8);
        int iM6823a = AbstractC1550a.m6823a(c1736s.m8280i());
        c1736s.m8274d(4);
        long jM8279h = c1736s.m8279h();
        if (iM6823a == 0) {
            jM8285n = c1736s.m8279h();
            jM8285n2 = c1736s.m8279h();
        } else {
            jM8285n = c1736s.m8285n();
            jM8285n2 = c1736s.m8285n();
        }
        long j2 = jM8285n;
        long j3 = j + jM8285n2;
        long jM8059a = C1717af.m8059a(j2, 1000000L, jM8279h);
        c1736s.m8274d(2);
        int iM8275e = c1736s.m8275e();
        int[] iArr = new int[iM8275e];
        long[] jArr = new long[iM8275e];
        long[] jArr2 = new long[iM8275e];
        long[] jArr3 = new long[iM8275e];
        long j4 = j2;
        long j5 = jM8059a;
        int i = 0;
        while (i < iM8275e) {
            int iM8280i = c1736s.m8280i();
            if ((iM8280i & Integer.MIN_VALUE) != 0) {
                throw new C1763t("Unhandled indirect reference");
            }
            long jM8279h2 = c1736s.m8279h();
            iArr[i] = iM8280i & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j5;
            long j6 = j4 + jM8279h2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i2 = iM8275e;
            int[] iArr2 = iArr;
            long jM8059a2 = C1717af.m8059a(j6, 1000000L, jM8279h);
            jArr4[i] = jM8059a2 - jArr5[i];
            c1736s.m8274d(4);
            j3 += (long) iArr2[i];
            i++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iM8275e = i2;
            j4 = j6;
            j5 = jM8059a2;
        }
        return Pair.create(Long.valueOf(jM8059a), new C1549a(iArr, jArr, jArr2, jArr3));
    }

    /* JADX INFO: renamed from: a */
    private static C1536e m6864a(List<AbstractC1550a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractC1550a.b bVar = list.get(i);
            if (bVar.f8135aU == AbstractC1550a.f8062Z) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f8139aV.f9792a;
                UUID uuidM6935a = C1557h.m6935a(bArr);
                if (uuidM6935a == null) {
                    Log.w(f8191j, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C1536e.a(uuidM6935a, C1732o.f9735e, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C1536e(arrayList);
    }

    /* JADX INFO: renamed from: a */
    private static C1552c m6865a(SparseArray<C1552c> sparseArray, int i) {
        return (C1552c) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : C1711a.m8005a(sparseArray.get(i)));
    }

    /* JADX INFO: renamed from: a */
    private static c m6866a(SparseArray<c> sparseArray) {
        int size = sparseArray.size();
        c cVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            c cVarValueAt = sparseArray.valueAt(i);
            int i2 = cVarValueAt.f8241g;
            C1561l c1561l = cVarValueAt.f8236b;
            if (i2 != c1561l.f8337e) {
                long j2 = c1561l.f8339g[i2];
                if (j2 < j) {
                    cVar = cVarValueAt;
                    j = j2;
                }
            }
        }
        return cVar;
    }

    /* JADX INFO: renamed from: a */
    private static c m6867a(C1736s c1736s, SparseArray<c> sparseArray) {
        c1736s.m8272c(8);
        int iM6824b = AbstractC1550a.m6824b(c1736s.m8280i());
        c cVarM6882b = m6882b(sparseArray, c1736s.m8280i());
        if (cVarM6882b == null) {
            return null;
        }
        if ((iM6824b & 1) != 0) {
            long jM8285n = c1736s.m8285n();
            C1561l c1561l = cVarM6882b.f8236b;
            c1561l.f8335c = jM8285n;
            c1561l.f8336d = jM8285n;
        }
        C1552c c1552c = cVarM6882b.f8238d;
        cVarM6882b.f8236b.f8333a = new C1552c((iM6824b & 2) != 0 ? c1736s.m8284m() - 1 : c1552c.f8174a, (iM6824b & 8) != 0 ? c1736s.m8284m() : c1552c.f8175b, (iM6824b & 16) != 0 ? c1736s.m8284m() : c1552c.f8176c, (iM6824b & 32) != 0 ? c1736s.m8284m() : c1552c.f8177d);
        return cVarM6882b;
    }

    /* JADX INFO: renamed from: a */
    private void m6868a() {
        this.f8206G = 0;
        this.f8209J = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m6869a(long j) throws C1763t {
        while (!this.f8203D.isEmpty() && this.f8203D.peek().f8136aV == j) {
            m6870a(this.f8203D.pop());
        }
        m6868a();
    }

    /* JADX INFO: renamed from: a */
    private void m6870a(AbstractC1550a.a aVar) throws C1763t {
        int i = aVar.f8135aU;
        if (i == AbstractC1550a.f8043G) {
            m6885b(aVar);
        } else if (i == AbstractC1550a.f8052P) {
            m6891c(aVar);
        } else {
            if (this.f8203D.isEmpty()) {
                return;
            }
            this.f8203D.peek().m6827a(aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6871a(AbstractC1550a.a aVar, SparseArray<c> sparseArray, int i, byte[] bArr) throws C1763t {
        int size = aVar.f8138aX.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1550a.a aVar2 = aVar.f8138aX.get(i2);
            if (aVar2.f8135aU == AbstractC1550a.f8053Q) {
                m6886b(aVar2, sparseArray, i, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6872a(AbstractC1550a.a aVar, c cVar, long j, int i) {
        List<AbstractC1550a.b> list = aVar.f8137aW;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1550a.b bVar = list.get(i4);
            if (bVar.f8135aU == AbstractC1550a.f8041E) {
                C1736s c1736s = bVar.f8139aV;
                c1736s.m8272c(12);
                int iM8284m = c1736s.m8284m();
                if (iM8284m > 0) {
                    i3 += iM8284m;
                    i2++;
                }
            }
        }
        cVar.f8241g = 0;
        cVar.f8240f = 0;
        cVar.f8239e = 0;
        cVar.f8236b.m6953a(i2, i3);
        int i5 = 0;
        int iM6862a = 0;
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC1550a.b bVar2 = list.get(i6);
            if (bVar2.f8135aU == AbstractC1550a.f8041E) {
                iM6862a = m6862a(cVar, i5, j, i, bVar2.f8139aV, iM6862a);
                i5++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6873a(AbstractC1550a.b bVar, long j) throws C1763t {
        long jM8285n;
        long jM8285n2;
        if (!this.f8203D.isEmpty()) {
            this.f8203D.peek().m6828a(bVar);
            return;
        }
        int i = bVar.f8135aU;
        int i2 = 0;
        if (i != AbstractC1550a.f8042F) {
            if (i == AbstractC1550a.f8075aL) {
                C1736s c1736s = bVar.f8139aV;
                InterfaceC1574m[] interfaceC1574mArr = this.f8222W;
                if (interfaceC1574mArr == null || interfaceC1574mArr.length == 0) {
                    return;
                }
                c1736s.m8272c(12);
                int iM8265a = c1736s.m8265a();
                c1736s.m8287p();
                c1736s.m8287p();
                long jM8059a = C1717af.m8059a(c1736s.m8279h(), 1000000L, c1736s.m8279h());
                for (InterfaceC1574m interfaceC1574m : this.f8222W) {
                    c1736s.m8272c(12);
                    interfaceC1574m.mo6983a(c1736s, iM8265a);
                }
                long j2 = this.f8215P;
                if (j2 == C1500b.f7455b) {
                    this.f8204E.addLast(new b(jM8059a, iM8265a));
                    this.f8212M += iM8265a;
                    return;
                }
                long jM8038b = j2 + jM8059a;
                C1714ac c1714ac = this.f8200A;
                if (c1714ac != null) {
                    jM8038b = c1714ac.m8038b(jM8038b);
                }
                InterfaceC1574m[] interfaceC1574mArr2 = this.f8222W;
                int length = interfaceC1574mArr2.length;
                while (i2 < length) {
                    interfaceC1574mArr2[i2].mo6982a(jM8038b, 1, iM8265a, 0, null);
                    i2++;
                }
                return;
            }
            return;
        }
        C1736s c1736s2 = bVar.f8139aV;
        c1736s2.m8272c(8);
        int iM6823a = AbstractC1550a.m6823a(c1736s2.m8280i());
        c1736s2.m8274d(4);
        long jM8279h = c1736s2.m8279h();
        if (iM6823a == 0) {
            jM8285n = c1736s2.m8279h();
            jM8285n2 = c1736s2.m8279h();
        } else {
            jM8285n = c1736s2.m8285n();
            jM8285n2 = c1736s2.m8285n();
        }
        long j3 = jM8285n;
        long j4 = j + jM8285n2;
        long jM8059a2 = C1717af.m8059a(j3, 1000000L, jM8279h);
        c1736s2.m8274d(2);
        int iM8275e = c1736s2.m8275e();
        int[] iArr = new int[iM8275e];
        long[] jArr = new long[iM8275e];
        long[] jArr2 = new long[iM8275e];
        long[] jArr3 = new long[iM8275e];
        long jM8059a3 = jM8059a2;
        while (i2 < iM8275e) {
            int iM8280i = c1736s2.m8280i();
            if ((iM8280i & Integer.MIN_VALUE) != 0) {
                throw new C1763t("Unhandled indirect reference");
            }
            long jM8279h2 = c1736s2.m8279h();
            iArr[i2] = iM8280i & Integer.MAX_VALUE;
            jArr[i2] = j4;
            jArr3[i2] = jM8059a3;
            long j5 = j3 + jM8279h2;
            int i3 = iM8275e;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int[] iArr2 = iArr;
            jM8059a3 = C1717af.m8059a(j5, 1000000L, jM8279h);
            jArr4[i2] = jM8059a3 - jArr5[i2];
            c1736s2.m8274d(4);
            j4 += (long) iArr2[i2];
            i2++;
            jArr3 = jArr5;
            jArr2 = jArr4;
            iArr = iArr2;
            jArr = jArr;
            j3 = j5;
            iM8275e = i3;
        }
        Pair pairCreate = Pair.create(Long.valueOf(jM8059a2), new C1549a(iArr, jArr, jArr2, jArr3));
        this.f8215P = ((Long) pairCreate.first).longValue();
        this.f8221V.mo6986a((InterfaceC1572k) pairCreate.second);
        this.f8224Y = true;
    }

    /* JADX INFO: renamed from: a */
    private static void m6874a(C1560k c1560k, C1736s c1736s, C1561l c1561l) throws C1763t {
        int i;
        int i2 = c1560k.f8331d;
        c1736s.m8272c(8);
        if ((AbstractC1550a.m6824b(c1736s.m8280i()) & 1) == 1) {
            c1736s.m8274d(8);
        }
        int iM8273d = c1736s.m8273d();
        int iM8284m = c1736s.m8284m();
        if (iM8284m != c1561l.f8338f) {
            throw new C1763t("Length mismatch: " + iM8284m + ", " + c1561l.f8338f);
        }
        if (iM8273d == 0) {
            boolean[] zArr = c1561l.f8346n;
            i = 0;
            for (int i3 = 0; i3 < iM8284m; i3++) {
                int iM8273d2 = c1736s.m8273d();
                i += iM8273d2;
                zArr[i3] = iM8273d2 > i2;
            }
        } else {
            i = (iM8273d * iM8284m) + 0;
            Arrays.fill(c1561l.f8346n, 0, iM8284m, iM8273d > i2);
        }
        c1561l.m6952a(i);
    }

    /* JADX INFO: renamed from: a */
    private void m6875a(C1736s c1736s) {
        InterfaceC1574m[] interfaceC1574mArr = this.f8222W;
        if (interfaceC1574mArr == null || interfaceC1574mArr.length == 0) {
            return;
        }
        c1736s.m8272c(12);
        int iM8265a = c1736s.m8265a();
        c1736s.m8287p();
        c1736s.m8287p();
        long jM8059a = C1717af.m8059a(c1736s.m8279h(), 1000000L, c1736s.m8279h());
        for (InterfaceC1574m interfaceC1574m : this.f8222W) {
            c1736s.m8272c(12);
            interfaceC1574m.mo6983a(c1736s, iM8265a);
        }
        long j = this.f8215P;
        if (j == C1500b.f7455b) {
            this.f8204E.addLast(new b(jM8059a, iM8265a));
            this.f8212M += iM8265a;
            return;
        }
        long jM8038b = j + jM8059a;
        C1714ac c1714ac = this.f8200A;
        if (c1714ac != null) {
            jM8038b = c1714ac.m8038b(jM8038b);
        }
        long j2 = jM8038b;
        for (InterfaceC1574m interfaceC1574m2 : this.f8222W) {
            interfaceC1574m2.mo6982a(j2, 1, iM8265a, 0, null);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6876a(C1736s c1736s, int i, C1561l c1561l) throws C1763t {
        c1736s.m8272c(i + 8);
        int iM6824b = AbstractC1550a.m6824b(c1736s.m8280i());
        if ((iM6824b & 1) != 0) {
            throw new C1763t("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM6824b & 2) != 0;
        int iM8284m = c1736s.m8284m();
        if (iM8284m == c1561l.f8338f) {
            Arrays.fill(c1561l.f8346n, 0, iM8284m, z);
            c1561l.m6952a(c1736s.m8265a());
            c1561l.m6954a(c1736s);
        } else {
            throw new C1763t("Length mismatch: " + iM8284m + ", " + c1561l.f8338f);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6877a(C1736s c1736s, C1561l c1561l) throws C1763t {
        c1736s.m8272c(8);
        int iM8280i = c1736s.m8280i();
        if ((AbstractC1550a.m6824b(iM8280i) & 1) == 1) {
            c1736s.m8274d(8);
        }
        int iM8284m = c1736s.m8284m();
        if (iM8284m != 1) {
            throw new C1763t("Unexpected saio entry count: ".concat(String.valueOf(iM8284m)));
        }
        c1561l.f8336d += AbstractC1550a.m6823a(iM8280i) == 0 ? c1736s.m8279h() : c1736s.m8285n();
    }

    /* JADX INFO: renamed from: a */
    private static void m6878a(C1736s c1736s, C1561l c1561l, byte[] bArr) throws C1763t {
        c1736s.m8272c(8);
        c1736s.m8268a(bArr, 0, 16);
        if (Arrays.equals(bArr, f8193l)) {
            m6876a(c1736s, 16, c1561l);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6879a(C1736s c1736s, C1736s c1736s2, String str, C1561l c1561l) throws C1763t {
        byte[] bArr;
        c1736s.m8272c(8);
        int iM8280i = c1736s.m8280i();
        int iM8280i2 = c1736s.m8280i();
        int i = f8192k;
        if (iM8280i2 != i) {
            return;
        }
        if (AbstractC1550a.m6823a(iM8280i) == 1) {
            c1736s.m8274d(4);
        }
        if (c1736s.m8280i() != 1) {
            throw new C1763t("Entry count in sbgp != 1 (unsupported).");
        }
        c1736s2.m8272c(8);
        int iM8280i3 = c1736s2.m8280i();
        if (c1736s2.m8280i() != i) {
            return;
        }
        int iM6823a = AbstractC1550a.m6823a(iM8280i3);
        if (iM6823a == 1) {
            if (c1736s2.m8279h() == 0) {
                throw new C1763t("Variable length description in sgpd found (unsupported)");
            }
        } else if (iM6823a >= 2) {
            c1736s2.m8274d(4);
        }
        if (c1736s2.m8279h() != 1) {
            throw new C1763t("Entry count in sgpd != 1 (unsupported).");
        }
        c1736s2.m8274d(1);
        int iM8273d = c1736s2.m8273d();
        int i2 = (iM8273d & 240) >> 4;
        int i3 = iM8273d & 15;
        if (c1736s2.m8273d() == 1) {
            int iM8273d2 = c1736s2.m8273d();
            byte[] bArr2 = new byte[16];
            c1736s2.m8268a(bArr2, 0, 16);
            if (iM8273d2 == 0) {
                int iM8273d3 = c1736s2.m8273d();
                byte[] bArr3 = new byte[iM8273d3];
                c1736s2.m8268a(bArr3, 0, iM8273d3);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            c1561l.f8345m = true;
            c1561l.f8347o = new C1560k(true, str, iM8273d2, bArr2, i2, i3, bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6880a(int i) {
        return i == AbstractC1550a.f8060X || i == AbstractC1550a.f8059W || i == AbstractC1550a.f8044H || i == AbstractC1550a.f8042F || i == AbstractC1550a.f8061Y || i == AbstractC1550a.f8038B || i == AbstractC1550a.f8039C || i == AbstractC1550a.f8056T || i == AbstractC1550a.f8040D || i == AbstractC1550a.f8041E || i == AbstractC1550a.f8062Z || i == AbstractC1550a.f8091ah || i == AbstractC1550a.f8092ai || i == AbstractC1550a.f8096am || i == AbstractC1550a.f8095al || i == AbstractC1550a.f8093aj || i == AbstractC1550a.f8094ak || i == AbstractC1550a.f8058V || i == AbstractC1550a.f8055S || i == AbstractC1550a.f8075aL;
    }

    /* JADX INFO: renamed from: b */
    private static Pair<Integer, C1552c> m6881b(C1736s c1736s) {
        c1736s.m8272c(12);
        return Pair.create(Integer.valueOf(c1736s.m8280i()), new C1552c(c1736s.m8284m() - 1, c1736s.m8284m(), c1736s.m8284m(), c1736s.m8280i()));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    private static c m6882b(SparseArray<c> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : sparseArray.get(i);
    }

    /* JADX INFO: renamed from: b */
    private void m6883b() {
        int i;
        if (this.f8222W == null) {
            InterfaceC1574m[] interfaceC1574mArr = new InterfaceC1574m[2];
            this.f8222W = interfaceC1574mArr;
            InterfaceC1574m interfaceC1574m = this.f8205F;
            if (interfaceC1574m != null) {
                interfaceC1574mArr[0] = interfaceC1574m;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.f8225s & 4) != 0) {
                interfaceC1574mArr[i] = this.f8221V.mo6985a(this.f8229w.size(), 4);
                i++;
            }
            InterfaceC1574m[] interfaceC1574mArr2 = (InterfaceC1574m[]) Arrays.copyOf(this.f8222W, i);
            this.f8222W = interfaceC1574mArr2;
            for (InterfaceC1574m interfaceC1574m2 : interfaceC1574mArr2) {
                interfaceC1574m2.mo6984a(f8194m);
            }
        }
        if (this.f8223X == null) {
            this.f8223X = new InterfaceC1574m[this.f8227u.size()];
            for (int i2 = 0; i2 < this.f8223X.length; i2++) {
                InterfaceC1574m interfaceC1574mMo6985a = this.f8221V.mo6985a(this.f8229w.size() + 1 + i2, 3);
                interfaceC1574mMo6985a.mo6984a(this.f8227u.get(i2));
                this.f8223X[i2] = interfaceC1574mMo6985a;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m6884b(long j) {
        while (!this.f8204E.isEmpty()) {
            b bVarRemoveFirst = this.f8204E.removeFirst();
            this.f8212M -= bVarRemoveFirst.f8234b;
            long jM8038b = bVarRemoveFirst.f8233a + j;
            C1714ac c1714ac = this.f8200A;
            if (c1714ac != null) {
                jM8038b = c1714ac.m8038b(jM8038b);
            }
            for (InterfaceC1574m interfaceC1574m : this.f8222W) {
                interfaceC1574m.mo6982a(jM8038b, 1, bVarRemoveFirst.f8234b, this.f8212M, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m6885b(AbstractC1550a.a aVar) throws C1763t {
        int i;
        int i2;
        int i3 = 0;
        C1711a.m8013b(this.f8226t == null, "Unexpected moov box.");
        C1536e c1536eM6864a = this.f8228v;
        if (c1536eM6864a == null) {
            c1536eM6864a = m6864a(aVar.f8137aW);
        }
        AbstractC1550a.a aVarM6830e = aVar.m6830e(AbstractC1550a.f8054R);
        SparseArray sparseArray = new SparseArray();
        int size = aVarM6830e.f8137aW.size();
        long jM6890c = -9223372036854775807L;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1550a.b bVar = aVarM6830e.f8137aW.get(i4);
            int i5 = bVar.f8135aU;
            if (i5 == AbstractC1550a.f8040D) {
                Pair<Integer, C1552c> pairM6881b = m6881b(bVar.f8139aV);
                sparseArray.put(((Integer) pairM6881b.first).intValue(), (C1552c) pairM6881b.second);
            } else if (i5 == AbstractC1550a.f8055S) {
                jM6890c = m6890c(bVar.f8139aV);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar.f8138aX.size();
        int i6 = 0;
        while (i6 < size2) {
            AbstractC1550a.a aVar2 = aVar.f8138aX.get(i6);
            if (aVar2.f8135aU == AbstractC1550a.f8045I) {
                i = i6;
                i2 = size2;
                C1559j c1559jM6835a = C1551b.m6835a(aVar2, aVar.m6829d(AbstractC1550a.f8044H), jM6890c, c1536eM6864a, (this.f8225s & 16) != 0, false);
                if (c1559jM6835a != null) {
                    sparseArray2.put(c1559jM6835a.f8316c, c1559jM6835a);
                }
            } else {
                i = i6;
                i2 = size2;
            }
            i6 = i + 1;
            size2 = i2;
        }
        int size3 = sparseArray2.size();
        if (this.f8229w.size() != 0) {
            C1711a.m8012b(this.f8229w.size() == size3);
            while (i3 < size3) {
                C1559j c1559j = (C1559j) sparseArray2.valueAt(i3);
                this.f8229w.get(c1559j.f8316c).m6908a(c1559j, m6865a((SparseArray<C1552c>) sparseArray, c1559j.f8316c));
                i3++;
            }
            return;
        }
        while (i3 < size3) {
            C1559j c1559j2 = (C1559j) sparseArray2.valueAt(i3);
            c cVar = new c(this.f8221V.mo6985a(i3, c1559j2.f8317d));
            cVar.m6908a(c1559j2, m6865a((SparseArray<C1552c>) sparseArray, c1559j2.f8316c));
            this.f8229w.put(c1559j2.f8316c, cVar);
            this.f8214O = Math.max(this.f8214O, c1559j2.f8320g);
            i3++;
        }
        m6883b();
        this.f8221V.mo6987c_();
    }

    /* JADX INFO: renamed from: b */
    private static void m6886b(AbstractC1550a.a aVar, SparseArray<c> sparseArray, int i, byte[] bArr) throws C1763t {
        c cVarM6867a = m6867a(aVar.m6829d(AbstractC1550a.f8039C).f8139aV, sparseArray);
        if (cVarM6867a == null) {
            return;
        }
        C1561l c1561l = cVarM6867a.f8236b;
        long jM6893d = c1561l.f8351s;
        cVarM6867a.m6905a();
        int i2 = AbstractC1550a.f8038B;
        if (aVar.m6829d(i2) != null && (i & 2) == 0) {
            jM6893d = m6893d(aVar.m6829d(i2).f8139aV);
        }
        m6872a(aVar, cVarM6867a, jM6893d, i);
        C1560k c1560kM6948a = cVarM6867a.f8237c.m6948a(c1561l.f8333a.f8174a);
        AbstractC1550a.b bVarM6829d = aVar.m6829d(AbstractC1550a.f8091ah);
        if (bVarM6829d != null) {
            m6874a(c1560kM6948a, bVarM6829d.f8139aV, c1561l);
        }
        AbstractC1550a.b bVarM6829d2 = aVar.m6829d(AbstractC1550a.f8092ai);
        if (bVarM6829d2 != null) {
            m6877a(bVarM6829d2.f8139aV, c1561l);
        }
        AbstractC1550a.b bVarM6829d3 = aVar.m6829d(AbstractC1550a.f8096am);
        if (bVarM6829d3 != null) {
            m6876a(bVarM6829d3.f8139aV, 0, c1561l);
        }
        AbstractC1550a.b bVarM6829d4 = aVar.m6829d(AbstractC1550a.f8093aj);
        AbstractC1550a.b bVarM6829d5 = aVar.m6829d(AbstractC1550a.f8094ak);
        if (bVarM6829d4 != null && bVarM6829d5 != null) {
            m6879a(bVarM6829d4.f8139aV, bVarM6829d5.f8139aV, c1560kM6948a != null ? c1560kM6948a.f8329b : null, c1561l);
        }
        int size = aVar.f8137aW.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1550a.b bVar = aVar.f8137aW.get(i3);
            if (bVar.f8135aU == AbstractC1550a.f8095al) {
                m6878a(bVar.f8139aV, c1561l, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m6887b(C1736s c1736s, C1561l c1561l) throws C1763t {
        m6876a(c1736s, 0, c1561l);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m6888b(int i) {
        return i == AbstractC1550a.f8043G || i == AbstractC1550a.f8045I || i == AbstractC1550a.f8046J || i == AbstractC1550a.f8047K || i == AbstractC1550a.f8048L || i == AbstractC1550a.f8052P || i == AbstractC1550a.f8053Q || i == AbstractC1550a.f8054R || i == AbstractC1550a.f8057U;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m6889b(com.anythink.expressad.exoplayer.p094e.InterfaceC1567f r9) throws com.anythink.expressad.exoplayer.C1763t {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p094e.p095a.C1554e.m6889b(com.anythink.expressad.exoplayer.e.f):boolean");
    }

    /* JADX INFO: renamed from: c */
    private static long m6890c(C1736s c1736s) {
        c1736s.m8272c(8);
        return AbstractC1550a.m6823a(c1736s.m8280i()) == 0 ? c1736s.m8279h() : c1736s.m8285n();
    }

    /* JADX INFO: renamed from: c */
    private void m6891c(AbstractC1550a.a aVar) throws C1763t {
        m6871a(aVar, this.f8229w, this.f8225s, this.f8202C);
        C1536e c1536eM6864a = this.f8228v != null ? null : m6864a(aVar.f8137aW);
        if (c1536eM6864a != null) {
            int size = this.f8229w.size();
            for (int i = 0; i < size; i++) {
                this.f8229w.valueAt(i).m6907a(c1536eM6864a);
            }
        }
        if (this.f8213N != C1500b.f7455b) {
            int size2 = this.f8229w.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f8229w.valueAt(i2).m6906a(this.f8213N);
            }
            this.f8213N = C1500b.f7455b;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m6892c(InterfaceC1567f interfaceC1567f) throws C1763t {
        long jM8285n;
        long jM8285n2;
        int i = ((int) this.f8208I) - this.f8209J;
        C1736s c1736s = this.f8210K;
        if (c1736s != null) {
            interfaceC1567f.mo6970b(c1736s.f9792a, 8, i);
            AbstractC1550a.b bVar = new AbstractC1550a.b(this.f8207H, this.f8210K);
            long jMo6972c = interfaceC1567f.mo6972c();
            if (this.f8203D.isEmpty()) {
                int i2 = bVar.f8135aU;
                int i3 = 0;
                if (i2 == AbstractC1550a.f8042F) {
                    C1736s c1736s2 = bVar.f8139aV;
                    c1736s2.m8272c(8);
                    int iM6823a = AbstractC1550a.m6823a(c1736s2.m8280i());
                    c1736s2.m8274d(4);
                    long jM8279h = c1736s2.m8279h();
                    if (iM6823a == 0) {
                        jM8285n = c1736s2.m8279h();
                        jM8285n2 = c1736s2.m8279h();
                    } else {
                        jM8285n = c1736s2.m8285n();
                        jM8285n2 = c1736s2.m8285n();
                    }
                    long j = jMo6972c + jM8285n2;
                    long j2 = jM8285n;
                    long jM8059a = C1717af.m8059a(j2, 1000000L, jM8279h);
                    c1736s2.m8274d(2);
                    int iM8275e = c1736s2.m8275e();
                    int[] iArr = new int[iM8275e];
                    long[] jArr = new long[iM8275e];
                    long[] jArr2 = new long[iM8275e];
                    long[] jArr3 = new long[iM8275e];
                    long jM8059a2 = jM8059a;
                    while (i3 < iM8275e) {
                        int iM8280i = c1736s2.m8280i();
                        if ((iM8280i & Integer.MIN_VALUE) != 0) {
                            throw new C1763t("Unhandled indirect reference");
                        }
                        long jM8279h2 = c1736s2.m8279h();
                        iArr[i3] = iM8280i & Integer.MAX_VALUE;
                        jArr[i3] = j;
                        jArr3[i3] = jM8059a2;
                        j2 += jM8279h2;
                        long[] jArr4 = jArr3;
                        long[] jArr5 = jArr2;
                        jM8059a2 = C1717af.m8059a(j2, 1000000L, jM8279h);
                        jArr5[i3] = jM8059a2 - jArr4[i3];
                        c1736s2.m8274d(4);
                        j += (long) iArr[i3];
                        i3++;
                        jArr2 = jArr5;
                        jArr = jArr;
                        jArr3 = jArr4;
                        iM8275e = iM8275e;
                    }
                    Pair pairCreate = Pair.create(Long.valueOf(jM8059a), new C1549a(iArr, jArr, jArr2, jArr3));
                    this.f8215P = ((Long) pairCreate.first).longValue();
                    this.f8221V.mo6986a((InterfaceC1572k) pairCreate.second);
                    this.f8224Y = true;
                } else if (i2 == AbstractC1550a.f8075aL) {
                    C1736s c1736s3 = bVar.f8139aV;
                    InterfaceC1574m[] interfaceC1574mArr = this.f8222W;
                    if (interfaceC1574mArr != null && interfaceC1574mArr.length != 0) {
                        c1736s3.m8272c(12);
                        int iM8265a = c1736s3.m8265a();
                        c1736s3.m8287p();
                        c1736s3.m8287p();
                        long jM8059a3 = C1717af.m8059a(c1736s3.m8279h(), 1000000L, c1736s3.m8279h());
                        for (InterfaceC1574m interfaceC1574m : this.f8222W) {
                            c1736s3.m8272c(12);
                            interfaceC1574m.mo6983a(c1736s3, iM8265a);
                        }
                        long j3 = this.f8215P;
                        if (j3 != C1500b.f7455b) {
                            long jM8038b = j3 + jM8059a3;
                            C1714ac c1714ac = this.f8200A;
                            if (c1714ac != null) {
                                jM8038b = c1714ac.m8038b(jM8038b);
                            }
                            InterfaceC1574m[] interfaceC1574mArr2 = this.f8222W;
                            int length = interfaceC1574mArr2.length;
                            while (i3 < length) {
                                interfaceC1574mArr2[i3].mo6982a(jM8038b, 1, iM8265a, 0, null);
                                i3++;
                            }
                        } else {
                            this.f8204E.addLast(new b(jM8059a3, iM8265a));
                            this.f8212M += iM8265a;
                        }
                    }
                }
            } else {
                this.f8203D.peek().m6828a(bVar);
            }
        } else {
            interfaceC1567f.mo6973c(i);
        }
        m6869a(interfaceC1567f.mo6972c());
    }

    /* JADX INFO: renamed from: d */
    private static long m6893d(C1736s c1736s) {
        c1736s.m8272c(8);
        return AbstractC1550a.m6823a(c1736s.m8280i()) == 1 ? c1736s.m8285n() : c1736s.m8279h();
    }

    /* JADX INFO: renamed from: d */
    private void m6894d(InterfaceC1567f interfaceC1567f) throws C1763t {
        int size = this.f8229w.size();
        c cVarValueAt = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C1561l c1561l = this.f8229w.valueAt(i).f8236b;
            if (c1561l.f8350r) {
                long j2 = c1561l.f8336d;
                if (j2 < j) {
                    cVarValueAt = this.f8229w.valueAt(i);
                    j = j2;
                }
            }
        }
        if (cVarValueAt == null) {
            this.f8206G = 3;
            return;
        }
        int iMo6972c = (int) (j - interfaceC1567f.mo6972c());
        if (iMo6972c < 0) {
            throw new C1763t("Offset to encryption data was negative.");
        }
        interfaceC1567f.mo6973c(iMo6972c);
        C1561l c1561l2 = cVarValueAt.f8236b;
        interfaceC1567f.mo6970b(c1561l2.f8349q.f9792a, 0, c1561l2.f8348p);
        c1561l2.f8349q.m8272c(0);
        c1561l2.f8350r = false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    private boolean m6895e(InterfaceC1567f interfaceC1567f) throws C1763t {
        int i;
        InterfaceC1574m.a aVar;
        int iMo6981a;
        int i2 = 1;
        if (this.f8206G == 3) {
            if (this.f8216Q == null) {
                SparseArray<c> sparseArray = this.f8229w;
                long j = Long.MAX_VALUE;
                int size = sparseArray.size();
                c cVar = null;
                for (int i3 = 0; i3 < size; i3++) {
                    c cVarValueAt = sparseArray.valueAt(i3);
                    int i4 = cVarValueAt.f8241g;
                    C1561l c1561l = cVarValueAt.f8236b;
                    if (i4 != c1561l.f8337e) {
                        long j2 = c1561l.f8339g[i4];
                        if (j2 < j) {
                            cVar = cVarValueAt;
                            j = j2;
                        }
                    }
                }
                if (cVar == null) {
                    int iMo6972c = (int) (this.f8211L - interfaceC1567f.mo6972c());
                    if (iMo6972c < 0) {
                        throw new C1763t("Offset to end of mdat was negative.");
                    }
                    interfaceC1567f.mo6973c(iMo6972c);
                    m6868a();
                    return false;
                }
                int iMo6972c2 = (int) (cVar.f8236b.f8339g[cVar.f8241g] - interfaceC1567f.mo6972c());
                if (iMo6972c2 < 0) {
                    Log.w(f8191j, "Ignoring negative offset to sample data.");
                    iMo6972c2 = 0;
                }
                interfaceC1567f.mo6973c(iMo6972c2);
                this.f8216Q = cVar;
            }
            c cVar2 = this.f8216Q;
            int[] iArr = cVar2.f8236b.f8341i;
            int i5 = cVar2.f8239e;
            int i6 = iArr[i5];
            this.f8217R = i6;
            if (i5 < cVar2.f8242h) {
                interfaceC1567f.mo6973c(i6);
                c.m6902a(this.f8216Q);
                if (!this.f8216Q.m6909b()) {
                    this.f8216Q = null;
                }
                this.f8206G = 3;
                return true;
            }
            if (cVar2.f8237c.f8322i == 1) {
                this.f8217R = i6 - 8;
                interfaceC1567f.mo6973c(8);
            }
            int iM6910c = this.f8216Q.m6910c();
            this.f8218S = iM6910c;
            this.f8217R += iM6910c;
            this.f8206G = 4;
            this.f8219T = 0;
        }
        c cVar3 = this.f8216Q;
        C1561l c1561l2 = cVar3.f8236b;
        C1559j c1559j = cVar3.f8237c;
        InterfaceC1574m interfaceC1574m = cVar3.f8235a;
        int i7 = cVar3.f8239e;
        long jM6955b = c1561l2.m6955b(i7) * 1000;
        C1714ac c1714ac = this.f8200A;
        if (c1714ac != null) {
            jM6955b = c1714ac.m8038b(jM6955b);
        }
        long j3 = jM6955b;
        int i8 = c1559j.f8325l;
        if (i8 == 0) {
            while (true) {
                int i9 = this.f8218S;
                int i10 = this.f8217R;
                if (i9 >= i10) {
                    break;
                }
                this.f8218S += interfaceC1574m.mo6981a(interfaceC1567f, i10 - i9, false);
            }
        } else {
            byte[] bArr = this.f8231y.f9792a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i11 = i8 + 1;
            int i12 = 4 - i8;
            while (this.f8218S < this.f8217R) {
                int i13 = this.f8219T;
                if (i13 == 0) {
                    interfaceC1567f.mo6970b(bArr, i12, i11);
                    this.f8231y.m8272c(0);
                    this.f8219T = this.f8231y.m8284m() - i2;
                    this.f8230x.m8272c(0);
                    interfaceC1574m.mo6983a(this.f8230x, 4);
                    interfaceC1574m.mo6983a(this.f8231y, i2);
                    this.f8220U = this.f8223X.length > 0 && C1733p.m8221a(c1559j.f8321h.f9971h, bArr[4]);
                    this.f8218S += 5;
                    this.f8217R += i12;
                } else {
                    if (this.f8220U) {
                        this.f8232z.m8266a(i13);
                        interfaceC1567f.mo6970b(this.f8232z.f9792a, 0, this.f8219T);
                        interfaceC1574m.mo6983a(this.f8232z, this.f8219T);
                        iMo6981a = this.f8219T;
                        C1736s c1736s = this.f8232z;
                        int iM8215a = C1733p.m8215a(c1736s.f9792a, c1736s.m8269b());
                        this.f8232z.m8272c(C1732o.f9739i.equals(c1559j.f8321h.f9971h) ? 1 : 0);
                        this.f8232z.m8270b(iM8215a);
                    } else {
                        iMo6981a = interfaceC1574m.mo6981a(interfaceC1567f, i13, false);
                    }
                    this.f8218S += iMo6981a;
                    this.f8219T -= iMo6981a;
                    i2 = 1;
                }
            }
        }
        boolean z = c1561l2.f8344l[i7];
        if (c1561l2.f8345m) {
            int i14 = (z ? 1 : 0) | 1073741824;
            C1560k c1560kM6948a = c1561l2.f8347o;
            if (c1560kM6948a == null) {
                c1560kM6948a = c1559j.m6948a(c1561l2.f8333a.f8174a);
            }
            i = i14;
            aVar = c1560kM6948a.f8330c;
        } else {
            i = z ? 1 : 0;
            aVar = null;
        }
        interfaceC1574m.mo6982a(j3, i, this.f8217R, 0, aVar);
        while (!this.f8204E.isEmpty()) {
            b bVarRemoveFirst = this.f8204E.removeFirst();
            this.f8212M -= bVarRemoveFirst.f8234b;
            long jM8038b = j3 + bVarRemoveFirst.f8233a;
            C1714ac c1714ac2 = this.f8200A;
            if (c1714ac2 != null) {
                jM8038b = c1714ac2.m8038b(jM8038b);
            }
            for (InterfaceC1574m interfaceC1574m2 : this.f8222W) {
                interfaceC1574m2.mo6982a(jM8038b, 1, bVarRemoveFirst.f8234b, this.f8212M, null);
            }
        }
        if (!this.f8216Q.m6909b()) {
            this.f8216Q = null;
        }
        this.f8206G = 3;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0192 A[LOOP:10: B:61:0x0192->B:63:0x0198, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1566e
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo6896a(com.anythink.expressad.exoplayer.p094e.InterfaceC1567f r26, com.anythink.expressad.exoplayer.p094e.C1571j r27) throws com.anythink.expressad.exoplayer.C1763t {
        /*
            Method dump skipped, instruction units count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p094e.p095a.C1554e.mo6896a(com.anythink.expressad.exoplayer.e.f, com.anythink.expressad.exoplayer.e.j):int");
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1566e
    /* JADX INFO: renamed from: a */
    public final void mo6897a(long j, long j2) {
        int size = this.f8229w.size();
        for (int i = 0; i < size; i++) {
            this.f8229w.valueAt(i).m6905a();
        }
        this.f8204E.clear();
        this.f8212M = 0;
        this.f8213N = j2;
        this.f8203D.clear();
        m6868a();
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1566e
    /* JADX INFO: renamed from: a */
    public final void mo6898a(InterfaceC1568g interfaceC1568g) {
        this.f8221V = interfaceC1568g;
        C1559j c1559j = this.f8226t;
        if (c1559j != null) {
            c cVar = new c(interfaceC1568g.mo6985a(0, c1559j.f8317d));
            cVar.m6908a(this.f8226t, new C1552c(0, 0, 0, 0));
            this.f8229w.put(0, cVar);
            m6883b();
            this.f8221V.mo6987c_();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1566e
    /* JADX INFO: renamed from: a */
    public final boolean mo6899a(InterfaceC1567f interfaceC1567f) {
        return C1558i.m6945a(interfaceC1567f);
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1566e
    /* JADX INFO: renamed from: c */
    public final void mo6900c() {
    }
}
