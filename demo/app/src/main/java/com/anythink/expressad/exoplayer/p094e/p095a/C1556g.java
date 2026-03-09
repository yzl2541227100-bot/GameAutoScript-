package com.anythink.expressad.exoplayer.p094e.p095a;

import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1763t;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p094e.C1570i;
import com.anythink.expressad.exoplayer.p094e.C1571j;
import com.anythink.expressad.exoplayer.p094e.C1573l;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1566e;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1567f;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1568g;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1569h;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1572k;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1574m;
import com.anythink.expressad.exoplayer.p094e.p095a.AbstractC1550a;
import com.anythink.expressad.exoplayer.p094e.p095a.C1551b;
import com.anythink.expressad.exoplayer.p097g.C1582a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1733p;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1556g implements InterfaceC1566e, InterfaceC1572k {

    /* JADX INFO: renamed from: e */
    public static final int f8278e = 1;

    /* JADX INFO: renamed from: f */
    private static final int f8279f = 0;

    /* JADX INFO: renamed from: g */
    private static final int f8280g = 1;

    /* JADX INFO: renamed from: h */
    private static final int f8281h = 2;

    /* JADX INFO: renamed from: j */
    private static final long f8283j = 262144;

    /* JADX INFO: renamed from: k */
    private static final long f8284k = 10485760;

    /* JADX INFO: renamed from: A */
    private long[][] f8285A;

    /* JADX INFO: renamed from: B */
    private int f8286B;

    /* JADX INFO: renamed from: C */
    private long f8287C;

    /* JADX INFO: renamed from: D */
    private boolean f8288D;

    /* JADX INFO: renamed from: l */
    private final int f8289l;

    /* JADX INFO: renamed from: m */
    private final C1736s f8290m;

    /* JADX INFO: renamed from: n */
    private final C1736s f8291n;

    /* JADX INFO: renamed from: o */
    private final C1736s f8292o;

    /* JADX INFO: renamed from: p */
    private final ArrayDeque<AbstractC1550a.a> f8293p;

    /* JADX INFO: renamed from: q */
    private int f8294q;

    /* JADX INFO: renamed from: r */
    private int f8295r;

    /* JADX INFO: renamed from: s */
    private long f8296s;

    /* JADX INFO: renamed from: t */
    private int f8297t;

    /* JADX INFO: renamed from: u */
    private C1736s f8298u;

    /* JADX INFO: renamed from: v */
    private int f8299v;

    /* JADX INFO: renamed from: w */
    private int f8300w;

    /* JADX INFO: renamed from: x */
    private int f8301x;

    /* JADX INFO: renamed from: y */
    private InterfaceC1568g f8302y;

    /* JADX INFO: renamed from: z */
    private b[] f8303z;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC1569h f8277d = new InterfaceC1569h() { // from class: com.anythink.expressad.exoplayer.e.a.g.1
        @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1569h
        /* JADX INFO: renamed from: a */
        public final InterfaceC1566e[] mo6901a() {
            return new InterfaceC1566e[]{new C1556g()};
        }
    };

    /* JADX INFO: renamed from: i */
    private static final int f8282i = C1717af.m8116f("qt  ");

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.g$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.g$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C1559j f8304a;

        /* JADX INFO: renamed from: b */
        public final C1562m f8305b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC1574m f8306c;

        /* JADX INFO: renamed from: d */
        public int f8307d;

        public b(C1559j c1559j, C1562m c1562m, InterfaceC1574m interfaceC1574m) {
            this.f8304a = c1559j;
            this.f8305b = c1562m;
            this.f8306c = interfaceC1574m;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.g$c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public C1556g() {
        this(0);
    }

    public C1556g(int i) {
        this.f8289l = i;
        this.f8292o = new C1736s(16);
        this.f8293p = new ArrayDeque<>();
        this.f8290m = new C1736s(C1733p.f9760a);
        this.f8291n = new C1736s(4);
        this.f8299v = -1;
    }

    /* JADX INFO: renamed from: a */
    private static int m6920a(C1562m c1562m, long j) {
        int iM6956a = c1562m.m6956a(j);
        return iM6956a == -1 ? c1562m.m6957b(j) : iM6956a;
    }

    /* JADX INFO: renamed from: a */
    private static long m6921a(C1562m c1562m, long j, long j2) {
        int iM6920a = m6920a(c1562m, j);
        return iM6920a == -1 ? j2 : Math.min(c1562m.f8354c[iM6920a], j2);
    }

    /* JADX INFO: renamed from: a */
    private ArrayList<C1562m> m6922a(AbstractC1550a.a aVar, C1570i c1570i, boolean z) throws C1763t {
        C1559j c1559jM6835a;
        ArrayList<C1562m> arrayList = new ArrayList<>();
        for (int i = 0; i < aVar.f8138aX.size(); i++) {
            AbstractC1550a.a aVar2 = aVar.f8138aX.get(i);
            if (aVar2.f8135aU == AbstractC1550a.f8045I && (c1559jM6835a = C1551b.m6835a(aVar2, aVar.m6829d(AbstractC1550a.f8044H), C1500b.f7455b, (C1536e) null, z, this.f8288D)) != null) {
                C1562m c1562mM6837a = C1551b.m6837a(c1559jM6835a, aVar2.m6830e(AbstractC1550a.f8046J).m6830e(AbstractC1550a.f8047K).m6830e(AbstractC1550a.f8048L), c1570i);
                if (c1562mM6837a.f8353b != 0) {
                    arrayList.add(c1562mM6837a);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m6923a(AbstractC1550a.a aVar) throws C1763t {
        C1582a c1582aM6838a;
        ArrayList<C1562m> arrayListM6922a;
        ArrayList arrayList = new ArrayList();
        C1570i c1570i = new C1570i();
        AbstractC1550a.b bVarM6829d = aVar.m6829d(AbstractC1550a.f8069aF);
        if (bVarM6829d != null) {
            c1582aM6838a = C1551b.m6838a(bVarM6829d, this.f8288D);
            if (c1582aM6838a != null) {
                c1570i.m6991a(c1582aM6838a);
            }
        } else {
            c1582aM6838a = null;
        }
        int i = 1;
        int i2 = 0;
        try {
            arrayListM6922a = m6922a(aVar, c1570i, (this.f8289l & 1) != 0);
        } catch (C1551b.g unused) {
            c1570i = new C1570i();
            arrayListM6922a = m6922a(aVar, c1570i, true);
        }
        int size = arrayListM6922a.size();
        int size2 = -1;
        long jMax = C1500b.f7455b;
        while (i2 < size) {
            C1562m c1562m = arrayListM6922a.get(i2);
            C1559j c1559j = c1562m.f8352a;
            b bVar = new b(c1559j, c1562m, this.f8302y.mo6985a(i2, c1559j.f8317d));
            C1753m c1753mM8410a = c1559j.f8321h.m8410a(c1562m.f8356e + 30);
            if (c1559j.f8317d == i) {
                if (c1570i.m6990a()) {
                    c1753mM8410a = c1753mM8410a.m8411a(c1570i.f8380b, c1570i.f8381c);
                }
                if (c1582aM6838a != null) {
                    c1753mM8410a = c1753mM8410a.m8414a(c1582aM6838a);
                }
            }
            bVar.f8306c.mo6984a(c1753mM8410a);
            long j = c1559j.f8320g;
            if (j == C1500b.f7455b) {
                j = c1562m.f8359h;
            }
            jMax = Math.max(jMax, j);
            if (c1559j.f8317d == 2 && size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(bVar);
            i2++;
            i = 1;
        }
        this.f8286B = size2;
        this.f8287C = jMax;
        b[] bVarArr = (b[]) arrayList.toArray(new b[arrayList.size()]);
        this.f8303z = bVarArr;
        this.f8285A = m6926a(bVarArr);
        this.f8302y.mo6987c_();
        this.f8302y.mo6986a(this);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6924a(int i) {
        return i == AbstractC1550a.f8059W || i == AbstractC1550a.f8044H || i == AbstractC1550a.f8060X || i == AbstractC1550a.f8061Y || i == AbstractC1550a.f8101ar || i == AbstractC1550a.f8102as || i == AbstractC1550a.f8103at || i == AbstractC1550a.f8058V || i == AbstractC1550a.f8104au || i == AbstractC1550a.f8105av || i == AbstractC1550a.f8106aw || i == AbstractC1550a.f8107ax || i == AbstractC1550a.f8108ay || i == AbstractC1550a.f8056T || i == AbstractC1550a.f8114f || i == AbstractC1550a.f8069aF;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6925a(C1736s c1736s) {
        c1736s.m8272c(8);
        if (c1736s.m8280i() == f8282i) {
            return true;
        }
        c1736s.m8274d(4);
        while (c1736s.m8265a() > 0) {
            if (c1736s.m8280i() == f8282i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static long[][] m6926a(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length][];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            jArr[i] = new long[bVarArr[i].f8305b.f8353b];
            jArr2[i] = bVarArr[i].f8305b.f8357f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < bVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) bVarArr[i3].f8305b.f8355d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = bVarArr[i3].f8305b.f8357f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* JADX INFO: renamed from: b */
    private void m6927b(long j) throws C1763t {
        while (!this.f8293p.isEmpty() && this.f8293p.peek().f8136aV == j) {
            AbstractC1550a.a aVarPop = this.f8293p.pop();
            if (aVarPop.f8135aU == AbstractC1550a.f8043G) {
                m6923a(aVarPop);
                this.f8293p.clear();
                this.f8294q = 2;
            } else if (!this.f8293p.isEmpty()) {
                this.f8293p.peek().m6827a(aVarPop);
            }
        }
        if (this.f8294q != 2) {
            m6933d();
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m6928b(int i) {
        return i == AbstractC1550a.f8043G || i == AbstractC1550a.f8045I || i == AbstractC1550a.f8046J || i == AbstractC1550a.f8047K || i == AbstractC1550a.f8048L || i == AbstractC1550a.f8057U;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m6929b(com.anythink.expressad.exoplayer.p094e.InterfaceC1567f r10) throws com.anythink.expressad.exoplayer.C1763t {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p094e.p095a.C1556g.m6929b(com.anythink.expressad.exoplayer.e.f):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m6930b(com.anythink.expressad.exoplayer.p094e.InterfaceC1567f r10, com.anythink.expressad.exoplayer.p094e.C1571j r11) throws com.anythink.expressad.exoplayer.C1763t {
        /*
            r9 = this;
            long r0 = r9.f8296s
            int r2 = r9.f8297t
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.mo6972c()
            long r2 = r2 + r0
            com.anythink.expressad.exoplayer.k.s r4 = r9.f8298u
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L64
            byte[] r11 = r4.f9792a
            int r4 = r9.f8297t
            int r1 = (int) r0
            r10.mo6970b(r11, r4, r1)
            int r10 = r9.f8295r
            int r11 = com.anythink.expressad.exoplayer.p094e.p095a.AbstractC1550a.f8114f
            if (r10 != r11) goto L47
            com.anythink.expressad.exoplayer.k.s r10 = r9.f8298u
            r11 = 8
            r10.m8272c(r11)
            int r11 = r10.m8280i()
            int r0 = com.anythink.expressad.exoplayer.p094e.p095a.C1556g.f8282i
            if (r11 != r0) goto L30
        L2e:
            r10 = 1
            goto L44
        L30:
            r11 = 4
            r10.m8274d(r11)
        L34:
            int r11 = r10.m8265a()
            if (r11 <= 0) goto L43
            int r11 = r10.m8280i()
            int r0 = com.anythink.expressad.exoplayer.p094e.p095a.C1556g.f8282i
            if (r11 != r0) goto L34
            goto L2e
        L43:
            r10 = 0
        L44:
            r9.f8288D = r10
            goto L6f
        L47:
            java.util.ArrayDeque<com.anythink.expressad.exoplayer.e.a.a$a> r10 = r9.f8293p
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L6f
            java.util.ArrayDeque<com.anythink.expressad.exoplayer.e.a.a$a> r10 = r9.f8293p
            java.lang.Object r10 = r10.peek()
            com.anythink.expressad.exoplayer.e.a.a$a r10 = (com.anythink.expressad.exoplayer.p094e.p095a.AbstractC1550a.a) r10
            com.anythink.expressad.exoplayer.e.a.a$b r11 = new com.anythink.expressad.exoplayer.e.a.a$b
            int r0 = r9.f8295r
            com.anythink.expressad.exoplayer.k.s r1 = r9.f8298u
            r11.<init>(r0, r1)
            r10.m6828a(r11)
            goto L6f
        L64:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L71
            int r11 = (int) r0
            r10.mo6973c(r11)
        L6f:
            r10 = 0
            goto L79
        L71:
            long r7 = r10.mo6972c()
            long r7 = r7 + r0
            r11.f8382a = r7
            r10 = 1
        L79:
            r9.m6927b(r2)
            if (r10 == 0) goto L84
            int r10 = r9.f8294q
            r11 = 2
            if (r10 == r11) goto L84
            return r6
        L84:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p094e.p095a.C1556g.m6930b(com.anythink.expressad.exoplayer.e.f, com.anythink.expressad.exoplayer.e.j):boolean");
    }

    /* JADX INFO: renamed from: c */
    private int m6931c(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z3 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.f8303z;
            if (i3 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i3];
            int i4 = bVar.f8307d;
            C1562m c1562m = bVar.f8305b;
            if (i4 != c1562m.f8353b) {
                long j5 = c1562m.f8354c[i4];
                long j6 = this.f8285A[i3][i4];
                long j7 = j5 - j;
                boolean z4 = j7 < 0 || j7 >= 262144;
                if ((!z4 && z3) || (z4 == z3 && j7 < j4)) {
                    z3 = z4;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z4;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + f8284k) ? i2 : i;
    }

    /* JADX INFO: renamed from: c */
    private int m6932c(InterfaceC1567f interfaceC1567f, C1571j c1571j) {
        int i;
        C1571j c1571j2;
        long jMo6972c = interfaceC1567f.mo6972c();
        if (this.f8299v == -1) {
            int i2 = 0;
            boolean z = true;
            long j = Long.MAX_VALUE;
            boolean z3 = true;
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            long j3 = Long.MAX_VALUE;
            while (true) {
                b[] bVarArr = this.f8303z;
                if (i2 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i2];
                int i5 = bVar.f8307d;
                C1562m c1562m = bVar.f8305b;
                if (i5 != c1562m.f8353b) {
                    long j4 = c1562m.f8354c[i5];
                    long j5 = this.f8285A[i2][i5];
                    long j6 = j4 - jMo6972c;
                    boolean z4 = j6 < 0 || j6 >= 262144;
                    if ((!z4 && z) || (z4 == z && j6 < j3)) {
                        i4 = i2;
                        z = z4;
                        j3 = j6;
                        j2 = j5;
                    }
                    if (j5 < j) {
                        i3 = i2;
                        z3 = z4;
                        j = j5;
                    }
                }
                i2++;
            }
            int i6 = (j == Long.MAX_VALUE || !z3 || j2 < j + f8284k) ? i4 : i3;
            this.f8299v = i6;
            if (i6 == -1) {
                return -1;
            }
        }
        b bVar2 = this.f8303z[this.f8299v];
        InterfaceC1574m interfaceC1574m = bVar2.f8306c;
        int i7 = bVar2.f8307d;
        C1562m c1562m2 = bVar2.f8305b;
        long j7 = c1562m2.f8354c[i7];
        int i8 = c1562m2.f8355d[i7];
        long j8 = (j7 - jMo6972c) + ((long) this.f8300w);
        if (j8 < 0) {
            i = 1;
            c1571j2 = c1571j;
        } else {
            if (j8 < 262144) {
                if (bVar2.f8304a.f8322i == 1) {
                    j8 += 8;
                    i8 -= 8;
                }
                interfaceC1567f.mo6973c((int) j8);
                int i9 = bVar2.f8304a.f8325l;
                if (i9 == 0) {
                    while (true) {
                        int i10 = this.f8300w;
                        if (i10 >= i8) {
                            break;
                        }
                        int iMo6981a = interfaceC1574m.mo6981a(interfaceC1567f, i8 - i10, false);
                        this.f8300w += iMo6981a;
                        this.f8301x -= iMo6981a;
                    }
                } else {
                    byte[] bArr = this.f8291n.f9792a;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i11 = 4 - i9;
                    while (this.f8300w < i8) {
                        int i12 = this.f8301x;
                        if (i12 == 0) {
                            interfaceC1567f.mo6970b(this.f8291n.f9792a, i11, i9);
                            this.f8291n.m8272c(0);
                            this.f8301x = this.f8291n.m8284m();
                            this.f8290m.m8272c(0);
                            interfaceC1574m.mo6983a(this.f8290m, 4);
                            this.f8300w += 4;
                            i8 += i11;
                        } else {
                            int iMo6981a2 = interfaceC1574m.mo6981a(interfaceC1567f, i12, false);
                            this.f8300w += iMo6981a2;
                            this.f8301x -= iMo6981a2;
                        }
                    }
                }
                C1562m c1562m3 = bVar2.f8305b;
                interfaceC1574m.mo6982a(c1562m3.f8357f[i7], c1562m3.f8358g[i7], i8, 0, null);
                bVar2.f8307d++;
                this.f8299v = -1;
                this.f8300w = 0;
                this.f8301x = 0;
                return 0;
            }
            c1571j2 = c1571j;
            i = 1;
        }
        c1571j2.f8382a = j7;
        return i;
    }

    /* JADX INFO: renamed from: d */
    private void m6933d() {
        this.f8294q = 0;
        this.f8297t = 0;
    }

    /* JADX INFO: renamed from: d */
    private void m6934d(long j) {
        for (b bVar : this.f8303z) {
            C1562m c1562m = bVar.f8305b;
            int iM6956a = c1562m.m6956a(j);
            if (iM6956a == -1) {
                iM6956a = c1562m.m6957b(j);
            }
            bVar.f8307d = iM6956a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ec  */
    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1566e
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo6896a(com.anythink.expressad.exoplayer.p094e.InterfaceC1567f r31, com.anythink.expressad.exoplayer.p094e.C1571j r32) throws com.anythink.expressad.exoplayer.C1763t {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p094e.p095a.C1556g.mo6896a(com.anythink.expressad.exoplayer.e.f, com.anythink.expressad.exoplayer.e.j):int");
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1572k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1572k.a mo6820a(long j) {
        long j2;
        long jM6921a;
        long j3;
        long j4;
        int iM6957b;
        b[] bVarArr = this.f8303z;
        if (bVarArr.length == 0) {
            return new InterfaceC1572k.a(C1573l.f8387a);
        }
        int i = this.f8286B;
        if (i != -1) {
            C1562m c1562m = bVarArr[i].f8305b;
            int iM6920a = m6920a(c1562m, j);
            if (iM6920a == -1) {
                return new InterfaceC1572k.a(C1573l.f8387a);
            }
            long j5 = c1562m.f8357f[iM6920a];
            j2 = c1562m.f8354c[iM6920a];
            if (j5 >= j || iM6920a >= c1562m.f8353b - 1 || (iM6957b = c1562m.m6957b(j)) == -1 || iM6957b == iM6920a) {
                j4 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = c1562m.f8357f[iM6957b];
                j4 = c1562m.f8354c[iM6957b];
            }
            jM6921a = j4;
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            jM6921a = -1;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            b[] bVarArr2 = this.f8303z;
            if (i2 >= bVarArr2.length) {
                break;
            }
            if (i2 != this.f8286B) {
                C1562m c1562m2 = bVarArr2[i2].f8305b;
                long jM6921a2 = m6921a(c1562m2, j, j2);
                if (j3 != C1500b.f7455b) {
                    jM6921a = m6921a(c1562m2, j3, jM6921a);
                }
                j2 = jM6921a2;
            }
            i2++;
        }
        C1573l c1573l = new C1573l(j, j2);
        return j3 == C1500b.f7455b ? new InterfaceC1572k.a(c1573l) : new InterfaceC1572k.a(c1573l, new C1573l(j3, jM6921a));
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1566e
    /* JADX INFO: renamed from: a */
    public final void mo6897a(long j, long j2) {
        this.f8293p.clear();
        this.f8297t = 0;
        this.f8299v = -1;
        this.f8300w = 0;
        this.f8301x = 0;
        if (j == 0) {
            m6933d();
            return;
        }
        b[] bVarArr = this.f8303z;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                C1562m c1562m = bVar.f8305b;
                int iM6956a = c1562m.m6956a(j2);
                if (iM6956a == -1) {
                    iM6956a = c1562m.m6957b(j2);
                }
                bVar.f8307d = iM6956a;
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1566e
    /* JADX INFO: renamed from: a */
    public final void mo6898a(InterfaceC1568g interfaceC1568g) {
        this.f8302y = interfaceC1568g;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1572k
    /* JADX INFO: renamed from: a */
    public final boolean mo6821a() {
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1566e
    /* JADX INFO: renamed from: a */
    public final boolean mo6899a(InterfaceC1567f interfaceC1567f) {
        return C1558i.m6947b(interfaceC1567f);
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1572k
    /* JADX INFO: renamed from: b */
    public final long mo6822b() {
        return this.f8287C;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1566e
    /* JADX INFO: renamed from: c */
    public final void mo6900c() {
    }
}
