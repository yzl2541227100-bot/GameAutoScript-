package com.anythink.expressad.exoplayer.p091b;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.anythink.expressad.exoplayer.AbstractC1492a;
import com.anythink.expressad.exoplayer.C1581g;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1754n;
import com.anythink.expressad.exoplayer.C1765v;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1507g;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1508h;
import com.anythink.expressad.exoplayer.p092c.AbstractC1528f;
import com.anythink.expressad.exoplayer.p092c.AbstractC1529g;
import com.anythink.expressad.exoplayer.p092c.C1526d;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p092c.C1530h;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1537f;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1538g;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1540i;
import com.anythink.expressad.exoplayer.p107k.C1715ad;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1731n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1518r extends AbstractC1492a implements InterfaceC1731n {

    /* JADX INFO: renamed from: n */
    private static final int f7769n = 0;

    /* JADX INFO: renamed from: o */
    private static final int f7770o = 1;

    /* JADX INFO: renamed from: p */
    private static final int f7771p = 2;

    /* JADX INFO: renamed from: A */
    private AbstractC1529g<C1527e, ? extends C1530h, ? extends C1505e> f7772A;

    /* JADX INFO: renamed from: B */
    private C1527e f7773B;

    /* JADX INFO: renamed from: C */
    private C1530h f7774C;

    /* JADX INFO: renamed from: D */
    private InterfaceC1537f<InterfaceC1540i> f7775D;

    /* JADX INFO: renamed from: E */
    private InterfaceC1537f<InterfaceC1540i> f7776E;

    /* JADX INFO: renamed from: F */
    private int f7777F;

    /* JADX INFO: renamed from: G */
    private boolean f7778G;

    /* JADX INFO: renamed from: H */
    private boolean f7779H;

    /* JADX INFO: renamed from: I */
    private long f7780I;

    /* JADX INFO: renamed from: J */
    private boolean f7781J;

    /* JADX INFO: renamed from: K */
    private boolean f7782K;

    /* JADX INFO: renamed from: L */
    private boolean f7783L;

    /* JADX INFO: renamed from: M */
    private boolean f7784M;

    /* JADX INFO: renamed from: N */
    private boolean f7785N;

    /* JADX INFO: renamed from: q */
    private final InterfaceC1538g<InterfaceC1540i> f7786q;

    /* JADX INFO: renamed from: r */
    private final boolean f7787r;

    /* JADX INFO: renamed from: s */
    private final InterfaceC1507g.a f7788s;

    /* JADX INFO: renamed from: t */
    private final InterfaceC1508h f7789t;

    /* JADX INFO: renamed from: u */
    private final C1754n f7790u;

    /* JADX INFO: renamed from: v */
    private final C1527e f7791v;

    /* JADX INFO: renamed from: w */
    private C1526d f7792w;

    /* JADX INFO: renamed from: x */
    private C1753m f7793x;

    /* JADX INFO: renamed from: y */
    private int f7794y;

    /* JADX INFO: renamed from: z */
    private int f7795z;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.r$a */
    public final class a implements InterfaceC1508h.c {
        private a() {
        }

        public /* synthetic */ a(AbstractC1518r abstractC1518r, byte b) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h.c
        /* JADX INFO: renamed from: a */
        public final void mo6459a() {
            AbstractC1518r.m6596b(AbstractC1518r.this);
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h.c
        /* JADX INFO: renamed from: a */
        public final void mo6460a(int i) {
            AbstractC1518r.this.f7788s.m6433a(i);
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h.c
        /* JADX INFO: renamed from: a */
        public final void mo6461a(int i, long j, long j2) {
            AbstractC1518r.this.f7788s.m6434a(i, j, j2);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.r$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public AbstractC1518r() {
        this((Handler) null, (InterfaceC1507g) null, new InterfaceC1506f[0]);
    }

    private AbstractC1518r(Handler handler, InterfaceC1507g interfaceC1507g, C1503c c1503c) {
        this(handler, interfaceC1507g, c1503c, null, new InterfaceC1506f[0]);
    }

    private AbstractC1518r(Handler handler, InterfaceC1507g interfaceC1507g, C1503c c1503c, InterfaceC1538g<InterfaceC1540i> interfaceC1538g, InterfaceC1506f... interfaceC1506fArr) {
        this(handler, interfaceC1507g, interfaceC1538g, new C1512l(c1503c, interfaceC1506fArr));
    }

    private AbstractC1518r(Handler handler, InterfaceC1507g interfaceC1507g, InterfaceC1538g<InterfaceC1540i> interfaceC1538g, InterfaceC1508h interfaceC1508h) {
        super(1);
        this.f7786q = interfaceC1538g;
        this.f7787r = false;
        this.f7788s = new InterfaceC1507g.a(handler, interfaceC1507g);
        this.f7789t = interfaceC1508h;
        interfaceC1508h.mo6445a(new a(this, (byte) 0));
        this.f7790u = new C1754n();
        this.f7791v = C1527e.m6658e();
        this.f7777F = 0;
        this.f7779H = true;
    }

    private AbstractC1518r(Handler handler, InterfaceC1507g interfaceC1507g, InterfaceC1506f... interfaceC1506fArr) {
        this(handler, interfaceC1507g, null, null, interfaceC1506fArr);
    }

    /* JADX INFO: renamed from: A */
    private static void m6583A() {
    }

    /* JADX INFO: renamed from: B */
    private C1753m m6584B() {
        C1753m c1753m = this.f7793x;
        return C1753m.m8393a((String) null, C1732o.f9753w, (String) null, -1, c1753m.f9984u, c1753m.f9985v, 2, (List<byte[]>) null, (C1536e) null, (String) null);
    }

    /* JADX INFO: renamed from: C */
    private boolean m6585C() throws C1581g {
        if (this.f7774C == null) {
            C1530h c1530h = (C1530h) this.f7772A.mo6653c();
            this.f7774C = c1530h;
            if (c1530h == null) {
                return false;
            }
            this.f7792w.f7871f += c1530h.f7883b;
        }
        if (this.f7774C.m6641c()) {
            if (this.f7777F == 2) {
                m6590H();
                m6589G();
                this.f7779H = true;
            } else {
                this.f7774C.mo6664e();
                this.f7774C = null;
                m6587E();
            }
            return false;
        }
        if (this.f7779H) {
            C1753m c1753m = this.f7793x;
            C1753m c1753mM8393a = C1753m.m8393a((String) null, C1732o.f9753w, (String) null, -1, c1753m.f9984u, c1753m.f9985v, 2, (List<byte[]>) null, (C1536e) null, (String) null);
            this.f7789t.mo6443a(c1753mM8393a.f9986w, c1753mM8393a.f9984u, c1753mM8393a.f9985v, null, this.f7794y, this.f7795z);
            this.f7779H = false;
        }
        InterfaceC1508h interfaceC1508h = this.f7789t;
        C1530h c1530h2 = this.f7774C;
        if (!interfaceC1508h.mo6447a(c1530h2.f7898c, ((AbstractC1528f) c1530h2).f7882a)) {
            return false;
        }
        this.f7792w.f7870e++;
        this.f7774C.mo6664e();
        this.f7774C = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m6586D() throws com.anythink.expressad.exoplayer.C1581g {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p091b.AbstractC1518r.m6586D():boolean");
    }

    /* JADX INFO: renamed from: E */
    private void m6587E() throws C1581g {
        this.f7784M = true;
        try {
            this.f7789t.mo6450c();
        } catch (InterfaceC1508h.d e) {
            throw C1581g.m7080a(e, m6150s());
        }
    }

    /* JADX INFO: renamed from: F */
    private void m6588F() throws C1581g {
        this.f7785N = false;
        if (this.f7777F != 0) {
            m6590H();
            m6589G();
            return;
        }
        this.f7773B = null;
        C1530h c1530h = this.f7774C;
        if (c1530h != null) {
            c1530h.mo6664e();
            this.f7774C = null;
        }
        this.f7772A.mo6654d();
        this.f7778G = false;
    }

    /* JADX INFO: renamed from: G */
    private void m6589G() throws C1581g {
        if (this.f7772A != null) {
            return;
        }
        InterfaceC1537f<InterfaceC1540i> interfaceC1537f = this.f7776E;
        this.f7775D = interfaceC1537f;
        if (interfaceC1537f != null && interfaceC1537f.mo6729g() == null && this.f7775D.mo6728f() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1715ad.m8040a("createAudioDecoder");
            this.f7772A = m6603x();
            C1715ad.m8039a();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f7788s.m6437a(this.f7772A.m6650a(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f7792w.f7866a++;
        } catch (C1505e e) {
            throw C1581g.m7080a(e, m6150s());
        }
    }

    /* JADX INFO: renamed from: H */
    private void m6590H() {
        AbstractC1529g<C1527e, ? extends C1530h, ? extends C1505e> abstractC1529g = this.f7772A;
        if (abstractC1529g == null) {
            return;
        }
        this.f7773B = null;
        this.f7774C = null;
        abstractC1529g.mo6655e();
        this.f7772A = null;
        this.f7792w.f7867b++;
        this.f7777F = 0;
        this.f7778G = false;
    }

    /* JADX INFO: renamed from: I */
    private void m6591I() {
        long jMo6439a = this.f7789t.mo6439a(mo6569v());
        if (jMo6439a != Long.MIN_VALUE) {
            if (!this.f7782K) {
                jMo6439a = Math.max(this.f7780I, jMo6439a);
            }
            this.f7780I = jMo6439a;
            this.f7782K = false;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6593a(C1527e c1527e) {
        if (!this.f7781J || c1527e.m6640b()) {
            return;
        }
        if (Math.abs(c1527e.f7880f - this.f7780I) > 500000) {
            this.f7780I = c1527e.f7880f;
        }
        this.f7781J = false;
    }

    /* JADX INFO: renamed from: b */
    private void m6594b(C1753m c1753m) throws C1581g {
        C1753m c1753m2 = this.f7793x;
        this.f7793x = c1753m;
        if (!C1717af.m8085a(c1753m.f9974k, c1753m2 == null ? null : c1753m2.f9974k)) {
            if (this.f7793x.f9974k != null) {
                InterfaceC1538g<InterfaceC1540i> interfaceC1538g = this.f7786q;
                if (interfaceC1538g == null) {
                    throw C1581g.m7080a(new IllegalStateException("Media requires a DrmSessionManager"), m6150s());
                }
                InterfaceC1537f<InterfaceC1540i> interfaceC1537fMo6759a = interfaceC1538g.mo6759a(Looper.myLooper(), this.f7793x.f9974k);
                this.f7776E = interfaceC1537fMo6759a;
                if (interfaceC1537fMo6759a == this.f7775D) {
                    this.f7786q.mo6761a(interfaceC1537fMo6759a);
                }
            } else {
                this.f7776E = null;
            }
        }
        if (this.f7778G) {
            this.f7777F = 1;
        } else {
            m6590H();
            m6589G();
            this.f7779H = true;
        }
        this.f7794y = c1753m.f9987x;
        this.f7795z = c1753m.f9988y;
        this.f7788s.m6436a(c1753m);
    }

    /* JADX INFO: renamed from: b */
    private boolean m6595b(int i) {
        return this.f7789t.mo6446a(i);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m6596b(AbstractC1518r abstractC1518r) {
        abstractC1518r.f7782K = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m6597b(boolean z) throws C1581g {
        InterfaceC1537f<InterfaceC1540i> interfaceC1537f = this.f7775D;
        if (interfaceC1537f == null || (!z && this.f7787r)) {
            return false;
        }
        int iMo6727e = interfaceC1537f.mo6727e();
        if (iMo6727e != 1) {
            return iMo6727e != 4;
        }
        throw C1581g.m7080a(this.f7775D.mo6728f(), m6150s());
    }

    /* JADX INFO: renamed from: y */
    private static void m6598y() {
    }

    /* JADX INFO: renamed from: z */
    private static void m6599z() {
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1769z
    /* JADX INFO: renamed from: a */
    public final int mo6600a(C1753m c1753m) {
        int iM6602w = m6602w();
        if (iM6602w <= 2) {
            return iM6602w;
        }
        return iM6602w | (C1717af.f9627a >= 21 ? 32 : 0) | 8;
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: a */
    public final C1765v mo6559a(C1765v c1765v) {
        return this.f7789t.mo6440a(c1765v);
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a, com.anythink.expressad.exoplayer.C1767x.b
    /* JADX INFO: renamed from: a */
    public final void mo6125a(int i, Object obj) {
        if (i == 2) {
            this.f7789t.mo6442a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.mo6125a(i, obj);
        } else {
            this.f7789t.mo6444a((C1502b) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[Catch: d -> 0x01b1, b -> 0x01b3, e | a | b | d -> 0x01b5, e -> 0x01b7, TryCatch #3 {e | a | b | d -> 0x01b5, blocks: (B:19:0x004c, B:20:0x0051, B:22:0x0058, B:24:0x0064, B:39:0x00d9, B:41:0x00dd, B:43:0x00e1, B:46:0x00e7, B:48:0x00eb, B:51:0x00f5, B:53:0x00fa, B:54:0x010c, B:62:0x0121, B:94:0x01ad, B:64:0x012b, B:66:0x0133, B:67:0x013f, B:70:0x014b, B:73:0x0150, B:80:0x016a, B:83:0x016f, B:85:0x017a, B:87:0x0180, B:89:0x0190, B:90:0x0194, B:91:0x0196, B:77:0x015a, B:78:0x0168, B:57:0x0112, B:25:0x006d, B:27:0x0075, B:29:0x0079, B:30:0x0082, B:31:0x008d, B:33:0x0091, B:34:0x00b8, B:36:0x00c6), top: B:108:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[Catch: d -> 0x01b1, b -> 0x01b3, e | a | b | d -> 0x01b5, e -> 0x01b7, TryCatch #3 {e | a | b | d -> 0x01b5, blocks: (B:19:0x004c, B:20:0x0051, B:22:0x0058, B:24:0x0064, B:39:0x00d9, B:41:0x00dd, B:43:0x00e1, B:46:0x00e7, B:48:0x00eb, B:51:0x00f5, B:53:0x00fa, B:54:0x010c, B:62:0x0121, B:94:0x01ad, B:64:0x012b, B:66:0x0133, B:67:0x013f, B:70:0x014b, B:73:0x0150, B:80:0x016a, B:83:0x016f, B:85:0x017a, B:87:0x0180, B:89:0x0190, B:90:0x0194, B:91:0x0196, B:77:0x015a, B:78:0x0168, B:57:0x0112, B:25:0x006d, B:27:0x0075, B:29:0x0079, B:30:0x0082, B:31:0x008d, B:33:0x0091, B:34:0x00b8, B:36:0x00c6), top: B:108:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5 A[Catch: d -> 0x01b1, b -> 0x01b3, e | a | b | d -> 0x01b5, e -> 0x01b7, TryCatch #3 {e | a | b | d -> 0x01b5, blocks: (B:19:0x004c, B:20:0x0051, B:22:0x0058, B:24:0x0064, B:39:0x00d9, B:41:0x00dd, B:43:0x00e1, B:46:0x00e7, B:48:0x00eb, B:51:0x00f5, B:53:0x00fa, B:54:0x010c, B:62:0x0121, B:94:0x01ad, B:64:0x012b, B:66:0x0133, B:67:0x013f, B:70:0x014b, B:73:0x0150, B:80:0x016a, B:83:0x016f, B:85:0x017a, B:87:0x0180, B:89:0x0190, B:90:0x0194, B:91:0x0196, B:77:0x015a, B:78:0x0168, B:57:0x0112, B:25:0x006d, B:27:0x0075, B:29:0x0079, B:30:0x0082, B:31:0x008d, B:33:0x0091, B:34:0x00b8, B:36:0x00c6), top: B:108:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f A[Catch: d -> 0x01b1, b -> 0x01b3, e | a | b | d -> 0x01b5, e -> 0x01b7, TryCatch #3 {e | a | b | d -> 0x01b5, blocks: (B:19:0x004c, B:20:0x0051, B:22:0x0058, B:24:0x0064, B:39:0x00d9, B:41:0x00dd, B:43:0x00e1, B:46:0x00e7, B:48:0x00eb, B:51:0x00f5, B:53:0x00fa, B:54:0x010c, B:62:0x0121, B:94:0x01ad, B:64:0x012b, B:66:0x0133, B:67:0x013f, B:70:0x014b, B:73:0x0150, B:80:0x016a, B:83:0x016f, B:85:0x017a, B:87:0x0180, B:89:0x0190, B:90:0x0194, B:91:0x0196, B:77:0x015a, B:78:0x0168, B:57:0x0112, B:25:0x006d, B:27:0x0075, B:29:0x0079, B:30:0x0082, B:31:0x008d, B:33:0x0091, B:34:0x00b8, B:36:0x00c6), top: B:108:0x004c }] */
    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6601a(long r19, long r21) throws com.anythink.expressad.exoplayer.C1581g {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p091b.AbstractC1518r.mo6601a(long, long):void");
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public final void mo6127a(long j, boolean z) throws C1581g {
        this.f7789t.mo6457i();
        this.f7780I = j;
        this.f7781J = true;
        this.f7782K = true;
        this.f7783L = false;
        this.f7784M = false;
        if (this.f7772A != null) {
            this.f7785N = false;
            if (this.f7777F != 0) {
                m6590H();
                m6589G();
                return;
            }
            this.f7773B = null;
            C1530h c1530h = this.f7774C;
            if (c1530h != null) {
                c1530h.mo6664e();
                this.f7774C = null;
            }
            this.f7772A.mo6654d();
            this.f7778G = false;
        }
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public final void mo6129a(boolean z) {
        C1526d c1526d = new C1526d();
        this.f7792w = c1526d;
        this.f7788s.m6435a(c1526d);
        int i = m6149r().f7327b;
        if (i != 0) {
            this.f7789t.mo6451c(i);
        } else {
            this.f7789t.mo6455g();
        }
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a, com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: c */
    public final InterfaceC1731n mo6136c() {
        return this;
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: d */
    public final long mo6566d() {
        if (mo6132a_() == 2) {
            m6591I();
        }
        return this.f7780I;
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: e */
    public final C1765v mo6567e() {
        return this.f7789t.mo6454f();
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: n */
    public final void mo6145n() {
        this.f7789t.mo6441a();
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: o */
    public final void mo6146o() {
        m6591I();
        this.f7789t.mo6456h();
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: p */
    public final void mo6147p() {
        this.f7793x = null;
        this.f7779H = true;
        this.f7785N = false;
        try {
            m6590H();
            this.f7789t.mo6458j();
            try {
                InterfaceC1537f<InterfaceC1540i> interfaceC1537f = this.f7775D;
                if (interfaceC1537f != null) {
                    this.f7786q.mo6761a(interfaceC1537f);
                }
                try {
                    InterfaceC1537f<InterfaceC1540i> interfaceC1537f2 = this.f7776E;
                    if (interfaceC1537f2 != null && interfaceC1537f2 != this.f7775D) {
                        this.f7786q.mo6761a(interfaceC1537f2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    InterfaceC1537f<InterfaceC1540i> interfaceC1537f3 = this.f7776E;
                    if (interfaceC1537f3 != null && interfaceC1537f3 != this.f7775D) {
                        this.f7786q.mo6761a(interfaceC1537f3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                InterfaceC1537f<InterfaceC1540i> interfaceC1537f4 = this.f7775D;
                if (interfaceC1537f4 != null) {
                    this.f7786q.mo6761a(interfaceC1537f4);
                }
                try {
                    InterfaceC1537f<InterfaceC1540i> interfaceC1537f5 = this.f7776E;
                    if (interfaceC1537f5 != null && interfaceC1537f5 != this.f7775D) {
                        this.f7786q.mo6761a(interfaceC1537f5);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    InterfaceC1537f<InterfaceC1540i> interfaceC1537f6 = this.f7776E;
                    if (interfaceC1537f6 != null && interfaceC1537f6 != this.f7775D) {
                        this.f7786q.mo6761a(interfaceC1537f6);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: u */
    public final boolean mo6568u() {
        if (this.f7789t.mo6453e()) {
            return true;
        }
        if (this.f7793x == null || this.f7785N) {
            return false;
        }
        return m6151t() || this.f7774C != null;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: v */
    public final boolean mo6569v() {
        return this.f7784M && this.f7789t.mo6452d();
    }

    /* JADX INFO: renamed from: w */
    public abstract int m6602w();

    /* JADX INFO: renamed from: x */
    public abstract AbstractC1529g<C1527e, ? extends C1530h, ? extends C1505e> m6603x();
}
