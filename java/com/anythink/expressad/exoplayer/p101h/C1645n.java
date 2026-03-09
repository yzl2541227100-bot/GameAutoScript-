package com.anythink.expressad.exoplayer.p101h;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1497ac;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1754n;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p094e.C1563b;
import com.anythink.expressad.exoplayer.p094e.C1571j;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1566e;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1567f;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1568g;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1572k;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1574m;
import com.anythink.expressad.exoplayer.p101h.C1655x;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1649r;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1651t;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.C1703t;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1723f;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1645n implements InterfaceC1568g, InterfaceC1649r, C1655x.b, C1703t.a<a>, C1703t.d {

    /* JADX INFO: renamed from: a */
    private static final long f8925a = 10000;

    /* JADX INFO: renamed from: A */
    private C1621af f8926A;

    /* JADX INFO: renamed from: C */
    private boolean[] f8928C;

    /* JADX INFO: renamed from: D */
    private boolean[] f8929D;

    /* JADX INFO: renamed from: E */
    private boolean[] f8930E;

    /* JADX INFO: renamed from: F */
    private boolean f8931F;

    /* JADX INFO: renamed from: H */
    private long f8933H;

    /* JADX INFO: renamed from: J */
    private boolean f8935J;

    /* JADX INFO: renamed from: K */
    private int f8936K;

    /* JADX INFO: renamed from: L */
    private boolean f8937L;

    /* JADX INFO: renamed from: M */
    private boolean f8938M;

    /* JADX INFO: renamed from: b */
    private final Uri f8939b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1691h f8940c;

    /* JADX INFO: renamed from: d */
    private final int f8941d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1651t.a f8942e;

    /* JADX INFO: renamed from: f */
    private final c f8943f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC1685b f8944g;

    /* JADX INFO: renamed from: h */
    @Nullable
    private final String f8945h;

    /* JADX INFO: renamed from: i */
    private final long f8946i;

    /* JADX INFO: renamed from: k */
    private final b f8948k;

    /* JADX INFO: renamed from: p */
    @Nullable
    private InterfaceC1649r.a f8953p;

    /* JADX INFO: renamed from: q */
    private InterfaceC1572k f8954q;

    /* JADX INFO: renamed from: t */
    private boolean f8957t;

    /* JADX INFO: renamed from: u */
    private boolean f8958u;

    /* JADX INFO: renamed from: v */
    private int f8959v;

    /* JADX INFO: renamed from: w */
    private boolean f8960w;

    /* JADX INFO: renamed from: x */
    private boolean f8961x;

    /* JADX INFO: renamed from: y */
    private boolean f8962y;

    /* JADX INFO: renamed from: z */
    private int f8963z;

    /* JADX INFO: renamed from: j */
    private final C1703t f8947j = new C1703t("Loader:ExtractorMediaPeriod");

    /* JADX INFO: renamed from: l */
    private final C1723f f8949l = new C1723f();

    /* JADX INFO: renamed from: m */
    private final Runnable f8950m = new Runnable() { // from class: com.anythink.expressad.exoplayer.h.n.1
        @Override // java.lang.Runnable
        public final void run() {
            C1645n.m7420a(C1645n.this);
        }
    };

    /* JADX INFO: renamed from: n */
    private final Runnable f8951n = new Runnable() { // from class: com.anythink.expressad.exoplayer.h.n.2
        @Override // java.lang.Runnable
        public final void run() {
            if (C1645n.this.f8938M) {
                return;
            }
            C1645n.this.f8953p.mo7364a(C1645n.this);
        }
    };

    /* JADX INFO: renamed from: o */
    private final Handler f8952o = new Handler();

    /* JADX INFO: renamed from: s */
    private int[] f8956s = new int[0];

    /* JADX INFO: renamed from: r */
    private C1655x[] f8955r = new C1655x[0];

    /* JADX INFO: renamed from: I */
    private long f8934I = C1500b.f7455b;

    /* JADX INFO: renamed from: G */
    private long f8932G = -1;

    /* JADX INFO: renamed from: B */
    private long f8927B = C1500b.f7455b;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.n$a */
    public final class a implements C1703t.c {

        /* JADX INFO: renamed from: b */
        private final Uri f8967b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC1691h f8968c;

        /* JADX INFO: renamed from: d */
        private final b f8969d;

        /* JADX INFO: renamed from: e */
        private final C1723f f8970e;

        /* JADX INFO: renamed from: g */
        private volatile boolean f8972g;

        /* JADX INFO: renamed from: i */
        private long f8974i;

        /* JADX INFO: renamed from: j */
        private C1694k f8975j;

        /* JADX INFO: renamed from: l */
        private long f8977l;

        /* JADX INFO: renamed from: f */
        private final C1571j f8971f = new C1571j();

        /* JADX INFO: renamed from: h */
        private boolean f8973h = true;

        /* JADX INFO: renamed from: k */
        private long f8976k = -1;

        public a(Uri uri, InterfaceC1691h interfaceC1691h, b bVar, C1723f c1723f) {
            this.f8967b = (Uri) C1711a.m8005a(uri);
            this.f8968c = (InterfaceC1691h) C1711a.m8005a(interfaceC1691h);
            this.f8969d = (b) C1711a.m8005a(bVar);
            this.f8970e = c1723f;
        }

        @Override // com.anythink.expressad.exoplayer.p105j.C1703t.c
        /* JADX INFO: renamed from: a */
        public final void mo7284a() {
            this.f8972g = true;
        }

        /* JADX INFO: renamed from: a */
        public final void m7448a(long j, long j2) {
            this.f8971f.f8382a = j;
            this.f8974i = j2;
            this.f8973h = true;
        }

        @Override // com.anythink.expressad.exoplayer.p105j.C1703t.c
        /* JADX INFO: renamed from: b */
        public final void mo7285b() throws Throwable {
            long jMo6972c;
            C1563b c1563b;
            int iMo6896a = 0;
            while (iMo6896a == 0 && !this.f8972g) {
                C1563b c1563b2 = null;
                try {
                    jMo6972c = this.f8971f.f8382a;
                    C1694k c1694k = new C1694k(this.f8967b, jMo6972c, C1645n.this.f8945h);
                    this.f8975j = c1694k;
                    long jMo7742a = this.f8968c.mo7742a(c1694k);
                    this.f8976k = jMo7742a;
                    if (jMo7742a != -1) {
                        this.f8976k = jMo7742a + jMo6972c;
                    }
                    c1563b = new C1563b(this.f8968c, jMo6972c, this.f8976k);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    InterfaceC1566e interfaceC1566eM7449a = this.f8969d.m7449a(c1563b, this.f8968c.mo7743a());
                    if (this.f8973h) {
                        interfaceC1566eM7449a.mo6897a(jMo6972c, this.f8974i);
                        this.f8973h = false;
                    }
                    while (iMo6896a == 0 && !this.f8972g) {
                        this.f8970e.m8158c();
                        iMo6896a = interfaceC1566eM7449a.mo6896a(c1563b, this.f8971f);
                        if (c1563b.mo6972c() > C1645n.this.f8946i + jMo6972c) {
                            jMo6972c = c1563b.mo6972c();
                            this.f8970e.m8157b();
                            C1645n.this.f8952o.post(C1645n.this.f8951n);
                        }
                    }
                    if (iMo6896a == 1) {
                        iMo6896a = 0;
                    } else {
                        this.f8971f.f8382a = c1563b.mo6972c();
                        this.f8977l = this.f8971f.f8382a - this.f8975j.f9397e;
                    }
                    C1717af.m8074a(this.f8968c);
                } catch (Throwable th2) {
                    th = th2;
                    c1563b2 = c1563b;
                    if (iMo6896a != 1 && c1563b2 != null) {
                        this.f8971f.f8382a = c1563b2.mo6972c();
                        this.f8977l = this.f8971f.f8382a - this.f8975j.f9397e;
                    }
                    C1717af.m8074a(this.f8968c);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.n$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1566e[] f8978a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC1568g f8979b;

        /* JADX INFO: renamed from: c */
        private InterfaceC1566e f8980c;

        public b(InterfaceC1566e[] interfaceC1566eArr, InterfaceC1568g interfaceC1568g) {
            this.f8978a = interfaceC1566eArr;
            this.f8979b = interfaceC1568g;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC1566e m7449a(InterfaceC1567f interfaceC1567f, Uri uri) throws C1622ag {
            InterfaceC1566e interfaceC1566e = this.f8980c;
            if (interfaceC1566e != null) {
                return interfaceC1566e;
            }
            InterfaceC1566e[] interfaceC1566eArr = this.f8978a;
            int length = interfaceC1566eArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                InterfaceC1566e interfaceC1566e2 = interfaceC1566eArr[i];
                try {
                    if (interfaceC1566e2.mo6899a(interfaceC1567f)) {
                        this.f8980c = interfaceC1566e2;
                        interfaceC1567f.mo6966a();
                        break;
                    }
                    continue;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    interfaceC1567f.mo6966a();
                    throw th;
                }
                interfaceC1567f.mo6966a();
                i++;
            }
            InterfaceC1566e interfaceC1566e3 = this.f8980c;
            if (interfaceC1566e3 != null) {
                interfaceC1566e3.mo6898a(this.f8979b);
                return this.f8980c;
            }
            throw new C1622ag("None of the available extractors (" + C1717af.m8070a(this.f8978a) + ") could read the stream.", uri);
        }

        /* JADX INFO: renamed from: a */
        public final void m7450a() {
            if (this.f8980c != null) {
                this.f8980c = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.n$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo7451a(long j, boolean z);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.n$d */
    public final class d implements InterfaceC1656y {

        /* JADX INFO: renamed from: b */
        private final int f8982b;

        public d(int i) {
            this.f8982b = i;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: a */
        public final int mo7277a(long j) {
            return C1645n.this.m7438a(this.f8982b, j);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: a */
        public final int mo7278a(C1754n c1754n, C1527e c1527e, boolean z) {
            return C1645n.this.m7439a(this.f8982b, c1754n, c1527e, z);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: b */
        public final boolean mo7280b() {
            return C1645n.this.m7440a(this.f8982b);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: c */
        public final void mo7281c() throws IOException {
            C1645n.this.m7442h();
        }
    }

    public C1645n(Uri uri, InterfaceC1691h interfaceC1691h, InterfaceC1566e[] interfaceC1566eArr, int i, InterfaceC1651t.a aVar, c cVar, InterfaceC1685b interfaceC1685b, @Nullable String str, int i2) {
        this.f8939b = uri;
        this.f8940c = interfaceC1691h;
        this.f8941d = i;
        this.f8942e = aVar;
        this.f8943f = cVar;
        this.f8944g = interfaceC1685b;
        this.f8945h = str;
        this.f8946i = i2;
        this.f8948k = new b(interfaceC1566eArr, this);
        this.f8959v = i == -1 ? 3 : i;
        aVar.m7471a();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m7416a(com.anythink.expressad.exoplayer.p101h.C1645n.a r23, long r24, long r26, java.io.IOException r28) {
        /*
            r22 = this;
            r0 = r22
            r12 = r24
            r14 = r26
            r18 = r28
            r1 = r28
            boolean r7 = r1 instanceof com.anythink.expressad.exoplayer.p101h.C1622ag
            r19 = r7
            com.anythink.expressad.exoplayer.h.t$a r1 = r0.f8942e
            com.anythink.expressad.exoplayer.j.k r2 = com.anythink.expressad.exoplayer.p101h.C1645n.a.m7444a(r23)
            long r8 = com.anythink.expressad.exoplayer.p101h.C1645n.a.m7445b(r23)
            long r10 = r0.f8927B
            long r16 = com.anythink.expressad.exoplayer.p101h.C1645n.a.m7446c(r23)
            r3 = 1
            r4 = -1
            r5 = 0
            r6 = 0
            r20 = 0
            r21 = r7
            r7 = r20
            r1.m7481a(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18, r19)
            r22.m7417a(r23)
            if (r21 == 0) goto L32
            r1 = 3
            return r1
        L32:
            int r1 = r22.m7435m()
            int r2 = r0.f8936K
            r3 = 0
            r4 = 1
            if (r1 <= r2) goto L3e
            r2 = 1
            goto L3f
        L3e:
            r2 = 0
        L3f:
            long r5 = r0.f8932G
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L85
            com.anythink.expressad.exoplayer.e.k r5 = r0.f8954q
            if (r5 == 0) goto L59
            long r5 = r5.mo6822b()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L59
            goto L85
        L59:
            boolean r1 = r0.f8958u
            if (r1 == 0) goto L67
            boolean r1 = r22.m7432j()
            if (r1 != 0) goto L67
            r0.f8935J = r4
            r1 = 0
            goto L88
        L67:
            boolean r1 = r0.f8958u
            r0.f8961x = r1
            r5 = 0
            r0.f8933H = r5
            r0.f8936K = r3
            com.anythink.expressad.exoplayer.h.x[] r1 = r0.f8955r
            int r7 = r1.length
            r8 = 0
        L75:
            if (r8 >= r7) goto L7f
            r9 = r1[r8]
            r9.m7535a()
            int r8 = r8 + 1
            goto L75
        L7f:
            r8 = r23
            r8.m7448a(r5, r5)
            goto L87
        L85:
            r0.f8936K = r1
        L87:
            r1 = 1
        L88:
            if (r1 == 0) goto L8e
            if (r2 == 0) goto L8d
            return r4
        L8d:
            return r3
        L8e:
            r1 = 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p101h.C1645n.m7416a(com.anythink.expressad.exoplayer.h.n$a, long, long, java.io.IOException):int");
    }

    /* JADX INFO: renamed from: a */
    private void m7417a(a aVar) {
        if (this.f8932G == -1) {
            this.f8932G = aVar.f8976k;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7418a(a aVar, long j, long j2) {
        if (this.f8927B == C1500b.f7455b) {
            long jM7436n = m7436n();
            long j3 = jM7436n == Long.MIN_VALUE ? 0L : jM7436n + 10000;
            this.f8927B = j3;
            this.f8943f.mo7451a(j3, this.f8954q.mo6821a());
        }
        this.f8942e.m7480a(aVar.f8975j, 1, -1, null, 0, null, aVar.f8974i, this.f8927B, j, j2, aVar.f8977l);
        m7417a(aVar);
        this.f8937L = true;
        this.f8953p.mo7364a(this);
    }

    /* JADX INFO: renamed from: a */
    private void m7419a(a aVar, long j, long j2, boolean z) {
        this.f8942e.m7486b(aVar.f8975j, 1, -1, null, 0, null, aVar.f8974i, this.f8927B, j, j2, aVar.f8977l);
        if (z) {
            return;
        }
        m7417a(aVar);
        for (C1655x c1655x : this.f8955r) {
            c1655x.m7535a();
        }
        if (this.f8963z > 0) {
            this.f8953p.mo7364a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7420a(C1645n c1645n) {
        if (c1645n.f8938M || c1645n.f8958u || c1645n.f8954q == null || !c1645n.f8957t) {
            return;
        }
        for (C1655x c1655x : c1645n.f8955r) {
            if (c1655x.m7545f() == null) {
                return;
            }
        }
        c1645n.f8949l.m8157b();
        int length = c1645n.f8955r.length;
        C1620ae[] c1620aeArr = new C1620ae[length];
        c1645n.f8929D = new boolean[length];
        c1645n.f8928C = new boolean[length];
        c1645n.f8930E = new boolean[length];
        c1645n.f8927B = c1645n.f8954q.mo6822b();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            C1753m c1753mM7545f = c1645n.f8955r[i].m7545f();
            c1620aeArr[i] = new C1620ae(c1753mM7545f);
            String str = c1753mM7545f.f9971h;
            if (!C1732o.m8203b(str) && !C1732o.m8202a(str)) {
                z = false;
            }
            c1645n.f8929D[i] = z;
            c1645n.f8931F = z | c1645n.f8931F;
            i++;
        }
        c1645n.f8926A = new C1621af(c1620aeArr);
        if (c1645n.f8941d == -1 && c1645n.f8932G == -1 && c1645n.f8954q.mo6822b() == C1500b.f7455b) {
            c1645n.f8959v = 6;
        }
        c1645n.f8958u = true;
        c1645n.f8943f.mo7451a(c1645n.f8927B, c1645n.f8954q.mo6821a());
        c1645n.f8953p.mo7363a((InterfaceC1649r) c1645n);
    }

    /* JADX INFO: renamed from: a */
    private boolean m7421a(a aVar, int i) {
        InterfaceC1572k interfaceC1572k;
        if (this.f8932G != -1 || ((interfaceC1572k = this.f8954q) != null && interfaceC1572k.mo6822b() != C1500b.f7455b)) {
            this.f8936K = i;
            return true;
        }
        if (this.f8958u && !m7432j()) {
            this.f8935J = true;
            return false;
        }
        this.f8961x = this.f8958u;
        this.f8933H = 0L;
        this.f8936K = 0;
        for (C1655x c1655x : this.f8955r) {
            c1655x.m7535a();
        }
        aVar.m7448a(0L, 0L);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7422a(IOException iOException) {
        return iOException instanceof C1622ag;
    }

    /* JADX INFO: renamed from: b */
    private void m7423b(int i) {
        if (this.f8930E[i]) {
            return;
        }
        C1753m c1753mM7294a = this.f8926A.m7299a(i).m7294a(0);
        this.f8942e.m7473a(C1732o.m8205d(c1753mM7294a.f9971h), c1753mM7294a, 0, (Object) null, this.f8933H);
        this.f8930E[i] = true;
    }

    /* JADX INFO: renamed from: c */
    private void m7426c(int i) {
        if (this.f8935J && this.f8929D[i] && !this.f8955r[i].m7542c()) {
            this.f8934I = 0L;
            this.f8935J = false;
            this.f8961x = true;
            this.f8933H = 0L;
            this.f8936K = 0;
            for (C1655x c1655x : this.f8955r) {
                c1655x.m7535a();
            }
            this.f8953p.mo7364a(this);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m7428d(long j) {
        int length = this.f8955r.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            C1655x c1655x = this.f8955r[i];
            c1655x.m7548i();
            if (!(c1655x.m7533a(j, false) != -1) && (this.f8929D[i] || !this.f8931F)) {
                break;
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    private boolean m7432j() {
        return this.f8961x || m7437o();
    }

    /* JADX INFO: renamed from: k */
    private void m7433k() {
        if (this.f8938M || this.f8958u || this.f8954q == null || !this.f8957t) {
            return;
        }
        for (C1655x c1655x : this.f8955r) {
            if (c1655x.m7545f() == null) {
                return;
            }
        }
        this.f8949l.m8157b();
        int length = this.f8955r.length;
        C1620ae[] c1620aeArr = new C1620ae[length];
        this.f8929D = new boolean[length];
        this.f8928C = new boolean[length];
        this.f8930E = new boolean[length];
        this.f8927B = this.f8954q.mo6822b();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            C1753m c1753mM7545f = this.f8955r[i].m7545f();
            c1620aeArr[i] = new C1620ae(c1753mM7545f);
            String str = c1753mM7545f.f9971h;
            if (!C1732o.m8203b(str) && !C1732o.m8202a(str)) {
                z = false;
            }
            this.f8929D[i] = z;
            this.f8931F = z | this.f8931F;
            i++;
        }
        this.f8926A = new C1621af(c1620aeArr);
        if (this.f8941d == -1 && this.f8932G == -1 && this.f8954q.mo6822b() == C1500b.f7455b) {
            this.f8959v = 6;
        }
        this.f8958u = true;
        this.f8943f.mo7451a(this.f8927B, this.f8954q.mo6821a());
        this.f8953p.mo7363a((InterfaceC1649r) this);
    }

    /* JADX INFO: renamed from: l */
    private void m7434l() {
        a aVar = new a(this.f8939b, this.f8940c, this.f8948k, this.f8949l);
        if (this.f8958u) {
            C1711a.m8012b(m7437o());
            long j = this.f8927B;
            if (j != C1500b.f7455b && this.f8934I >= j) {
                this.f8937L = true;
                this.f8934I = C1500b.f7455b;
                return;
            } else {
                aVar.m7448a(this.f8954q.mo6820a(this.f8934I).f8383a.f8389c, this.f8934I);
                this.f8934I = C1500b.f7455b;
            }
        }
        this.f8936K = m7435m();
        this.f8942e.m7479a(aVar.f8975j, 1, -1, null, 0, null, aVar.f8974i, this.f8927B, this.f8947j.m7910a(aVar, this, this.f8959v));
    }

    /* JADX INFO: renamed from: m */
    private int m7435m() {
        int iM7540b = 0;
        for (C1655x c1655x : this.f8955r) {
            iM7540b += c1655x.m7540b();
        }
        return iM7540b;
    }

    /* JADX INFO: renamed from: n */
    private long m7436n() {
        long jMax = Long.MIN_VALUE;
        for (C1655x c1655x : this.f8955r) {
            jMax = Math.max(jMax, c1655x.m7546g());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: o */
    private boolean m7437o() {
        return this.f8934I != C1500b.f7455b;
    }

    /* JADX INFO: renamed from: a */
    public final int m7438a(int i, long j) {
        int iM7550k = 0;
        if (m7432j()) {
            return 0;
        }
        C1655x c1655x = this.f8955r[i];
        if (!this.f8937L || j <= c1655x.m7546g()) {
            int iM7533a = c1655x.m7533a(j, true);
            if (iM7533a != -1) {
                iM7550k = iM7533a;
            }
        } else {
            iM7550k = c1655x.m7550k();
        }
        if (iM7550k > 0) {
            m7423b(i);
        } else {
            m7426c(i);
        }
        return iM7550k;
    }

    /* JADX INFO: renamed from: a */
    public final int m7439a(int i, C1754n c1754n, C1527e c1527e, boolean z) {
        if (m7432j()) {
            return -3;
        }
        int iM7534a = this.f8955r[i].m7534a(c1754n, c1527e, z, this.f8937L, this.f8933H);
        if (iM7534a == -4) {
            m7423b(i);
        } else if (iM7534a == -3) {
            m7426c(i);
        }
        return iM7534a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097 A[RETURN] */
    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ int mo7260a(com.anythink.expressad.exoplayer.p105j.C1703t.c r23, long r24, long r26, java.io.IOException r28) {
        /*
            r22 = this;
            r0 = r22
            r12 = r24
            r14 = r26
            r18 = r28
            r7 = r23
            com.anythink.expressad.exoplayer.h.n$a r7 = (com.anythink.expressad.exoplayer.p101h.C1645n.a) r7
            r1 = r28
            boolean r6 = r1 instanceof com.anythink.expressad.exoplayer.p101h.C1622ag
            r19 = r6
            com.anythink.expressad.exoplayer.h.t$a r1 = r0.f8942e
            com.anythink.expressad.exoplayer.j.k r2 = com.anythink.expressad.exoplayer.p101h.C1645n.a.m7444a(r7)
            long r8 = com.anythink.expressad.exoplayer.p101h.C1645n.a.m7445b(r7)
            long r10 = r0.f8927B
            long r16 = com.anythink.expressad.exoplayer.p101h.C1645n.a.m7446c(r7)
            r3 = 1
            r4 = -1
            r5 = 0
            r20 = 0
            r21 = r6
            r6 = r20
            r20 = 0
            r0 = r7
            r7 = r20
            r1.m7481a(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18, r19)
            r1 = r0
            r0 = r22
            r0.m7417a(r1)
            if (r21 == 0) goto L3d
            r1 = 3
            return r1
        L3d:
            int r2 = r22.m7435m()
            int r3 = r0.f8936K
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L49
            r3 = 1
            goto L4a
        L49:
            r3 = 0
        L4a:
            long r6 = r0.f8932G
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L8e
            com.anythink.expressad.exoplayer.e.k r6 = r0.f8954q
            if (r6 == 0) goto L64
            long r6 = r6.mo6822b()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L64
            goto L8e
        L64:
            boolean r2 = r0.f8958u
            if (r2 == 0) goto L72
            boolean r2 = r22.m7432j()
            if (r2 != 0) goto L72
            r0.f8935J = r5
            r1 = 0
            goto L91
        L72:
            boolean r2 = r0.f8958u
            r0.f8961x = r2
            r6 = 0
            r0.f8933H = r6
            r0.f8936K = r4
            com.anythink.expressad.exoplayer.h.x[] r2 = r0.f8955r
            int r8 = r2.length
            r9 = 0
        L80:
            if (r9 >= r8) goto L8a
            r10 = r2[r9]
            r10.m7535a()
            int r9 = r9 + 1
            goto L80
        L8a:
            r1.m7448a(r6, r6)
            goto L90
        L8e:
            r0.f8936K = r2
        L90:
            r1 = 1
        L91:
            if (r1 == 0) goto L97
            if (r3 == 0) goto L96
            return r5
        L96:
            return r4
        L97:
            r1 = 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p101h.C1645n.mo7260a(com.anythink.expressad.exoplayer.j.t$c, long, long, java.io.IOException):int");
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final long mo7261a(long j, C1497ac c1497ac) {
        if (!this.f8954q.mo6821a()) {
            return 0L;
        }
        InterfaceC1572k.a aVarMo6820a = this.f8954q.mo6820a(j);
        return C1717af.m8060a(j, c1497ac, aVarMo6820a.f8383a.f8388b, aVarMo6820a.f8384b.f8388b);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final long mo7262a(InterfaceC1664f[] interfaceC1664fArr, boolean[] zArr, InterfaceC1656y[] interfaceC1656yArr, boolean[] zArr2, long j) {
        C1711a.m8012b(this.f8958u);
        int i = this.f8963z;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC1664fArr.length; i3++) {
            if (interfaceC1656yArr[i3] != null && (interfaceC1664fArr[i3] == null || !zArr[i3])) {
                int i4 = ((d) interfaceC1656yArr[i3]).f8982b;
                C1711a.m8012b(this.f8928C[i4]);
                this.f8963z--;
                this.f8928C[i4] = false;
                interfaceC1656yArr[i3] = null;
            }
        }
        boolean z = !this.f8960w ? j == 0 : i != 0;
        for (int i5 = 0; i5 < interfaceC1664fArr.length; i5++) {
            if (interfaceC1656yArr[i5] == null && interfaceC1664fArr[i5] != null) {
                InterfaceC1664f interfaceC1664f = interfaceC1664fArr[i5];
                C1711a.m8012b(interfaceC1664f.mo7585g() == 1);
                C1711a.m8012b(interfaceC1664f.mo7580b(0) == 0);
                int iM7298a = this.f8926A.m7298a(interfaceC1664f.mo7584f());
                C1711a.m8012b(!this.f8928C[iM7298a]);
                this.f8963z++;
                this.f8928C[iM7298a] = true;
                interfaceC1656yArr[i5] = new d(iM7298a);
                zArr2[i5] = true;
                if (!z) {
                    C1655x c1655x = this.f8955r[iM7298a];
                    c1655x.m7548i();
                    z = c1655x.m7533a(j, true) == -1 && c1655x.m7544e() != 0;
                }
            }
        }
        if (this.f8963z == 0) {
            this.f8935J = false;
            this.f8961x = false;
            if (this.f8947j.m7913a()) {
                C1655x[] c1655xArr = this.f8955r;
                int length = c1655xArr.length;
                while (i2 < length) {
                    c1655xArr[i2].m7549j();
                    i2++;
                }
                this.f8947j.m7914b();
            } else {
                C1655x[] c1655xArr2 = this.f8955r;
                int length2 = c1655xArr2.length;
                while (i2 < length2) {
                    c1655xArr2[i2].m7535a();
                    i2++;
                }
            }
        } else if (z) {
            j = mo7269b(j);
            while (i2 < interfaceC1656yArr.length) {
                if (interfaceC1656yArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f8960w = true;
        return j;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1568g
    /* JADX INFO: renamed from: a */
    public final InterfaceC1574m mo6985a(int i, int i2) {
        int length = this.f8955r.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f8956s[i3] == i) {
                return this.f8955r[i3];
            }
        }
        C1655x c1655x = new C1655x(this.f8944g);
        c1655x.m7539a(this);
        int i4 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f8956s, i4);
        this.f8956s = iArrCopyOf;
        iArrCopyOf[length] = i;
        C1655x[] c1655xArr = (C1655x[]) Arrays.copyOf(this.f8955r, i4);
        this.f8955r = c1655xArr;
        c1655xArr[length] = c1655x;
        return c1655x;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7263a() throws IOException {
        m7442h();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7264a(long j, boolean z) {
        int length = this.f8955r.length;
        for (int i = 0; i < length; i++) {
            this.f8955r[i].m7538a(j, z, this.f8928C[i]);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1568g
    /* JADX INFO: renamed from: a */
    public final void mo6986a(InterfaceC1572k interfaceC1572k) {
        this.f8954q = interfaceC1572k;
        this.f8952o.post(this.f8950m);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7265a(InterfaceC1649r.a aVar, long j) {
        this.f8953p = aVar;
        this.f8949l.m8156a();
        m7434l();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7266a(C1703t.c cVar, long j, long j2) {
        a aVar = (a) cVar;
        if (this.f8927B == C1500b.f7455b) {
            long jM7436n = m7436n();
            long j3 = jM7436n == Long.MIN_VALUE ? 0L : jM7436n + 10000;
            this.f8927B = j3;
            this.f8943f.mo7451a(j3, this.f8954q.mo6821a());
        }
        this.f8942e.m7480a(aVar.f8975j, 1, -1, null, 0, null, aVar.f8974i, this.f8927B, j, j2, aVar.f8977l);
        m7417a(aVar);
        this.f8937L = true;
        this.f8953p.mo7364a(this);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7267a(C1703t.c cVar, long j, long j2, boolean z) {
        a aVar = (a) cVar;
        this.f8942e.m7486b(aVar.f8975j, 1, -1, null, 0, null, aVar.f8974i, this.f8927B, j, j2, aVar.f8977l);
        if (z) {
            return;
        }
        m7417a(aVar);
        for (C1655x c1655x : this.f8955r) {
            c1655x.m7535a();
        }
        if (this.f8963z > 0) {
            this.f8953p.mo7364a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7440a(int i) {
        if (m7432j()) {
            return false;
        }
        return this.f8937L || this.f8955r[i].m7542c();
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: a_ */
    public final void mo7268a_(long j) {
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: b */
    public final long mo7269b(long j) {
        if (!this.f8954q.mo6821a()) {
            j = 0;
        }
        this.f8933H = j;
        this.f8961x = false;
        if (!m7437o() && m7428d(j)) {
            return j;
        }
        this.f8935J = false;
        this.f8934I = j;
        this.f8937L = false;
        if (this.f8947j.m7913a()) {
            this.f8947j.m7914b();
        } else {
            for (C1655x c1655x : this.f8955r) {
                c1655x.m7535a();
            }
        }
        return j;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: b */
    public final C1621af mo7270b() {
        return this.f8926A;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: c */
    public final long mo7271c() {
        if (!this.f8962y) {
            this.f8942e.m7487c();
            this.f8962y = true;
        }
        if (!this.f8961x) {
            return C1500b.f7455b;
        }
        if (!this.f8937L && m7435m() <= this.f8936K) {
            return C1500b.f7455b;
        }
        this.f8961x = false;
        return this.f8933H;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: c */
    public final boolean mo7272c(long j) {
        if (this.f8937L || this.f8935J) {
            return false;
        }
        if (this.f8958u && this.f8963z == 0) {
            return false;
        }
        boolean zM8156a = this.f8949l.m8156a();
        if (this.f8947j.m7913a()) {
            return zM8156a;
        }
        m7434l();
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1568g
    /* JADX INFO: renamed from: c_ */
    public final void mo6987c_() {
        this.f8957t = true;
        this.f8952o.post(this.f8950m);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: d */
    public final long mo7273d() {
        long jM7436n;
        if (this.f8937L) {
            return Long.MIN_VALUE;
        }
        if (m7437o()) {
            return this.f8934I;
        }
        if (this.f8931F) {
            jM7436n = Long.MAX_VALUE;
            int length = this.f8955r.length;
            for (int i = 0; i < length; i++) {
                if (this.f8929D[i]) {
                    jM7436n = Math.min(jM7436n, this.f8955r[i].m7546g());
                }
            }
        } else {
            jM7436n = m7436n();
        }
        return jM7436n == Long.MIN_VALUE ? this.f8933H : jM7436n;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: e */
    public final long mo7274e() {
        if (this.f8963z == 0) {
            return Long.MIN_VALUE;
        }
        return mo7273d();
    }

    /* JADX INFO: renamed from: f */
    public final void m7441f() {
        if (this.f8958u) {
            for (C1655x c1655x : this.f8955r) {
                c1655x.m7549j();
            }
        }
        this.f8947j.m7912a(this);
        this.f8952o.removeCallbacksAndMessages(null);
        this.f8953p = null;
        this.f8938M = true;
        this.f8942e.m7483b();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.d
    /* JADX INFO: renamed from: g */
    public final void mo7339g() {
        for (C1655x c1655x : this.f8955r) {
            c1655x.m7535a();
        }
        this.f8948k.m7450a();
    }

    /* JADX INFO: renamed from: h */
    public final void m7442h() throws IOException {
        this.f8947j.mo7911a(this.f8959v);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.C1655x.b
    /* JADX INFO: renamed from: i */
    public final void mo7443i() {
        this.f8952o.post(this.f8950m);
    }
}
