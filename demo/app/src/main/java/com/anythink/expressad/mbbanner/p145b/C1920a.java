package com.anythink.expressad.mbbanner.p145b;

import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p138h.C1891y;
import com.anythink.expressad.mbbanner.p139a.C1899a;
import com.anythink.expressad.mbbanner.p139a.p141b.C1906d;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1909b;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c;
import com.anythink.expressad.mbbanner.p139a.p143d.C1915a;
import com.anythink.expressad.mbbanner.p139a.p143d.C1917c;
import com.anythink.expressad.out.C1934i;
import com.anythink.expressad.out.InterfaceC1933h;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.C1489c;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1920a {

    /* JADX INFO: renamed from: b */
    private static String f11861b = "BannerController";

    /* JADX INFO: renamed from: a */
    public C1934i f11862a;

    /* JADX INFO: renamed from: c */
    private String f11863c;

    /* JADX INFO: renamed from: d */
    private String f11864d;

    /* JADX INFO: renamed from: e */
    private boolean f11865e;

    /* JADX INFO: renamed from: f */
    private int f11866f;

    /* JADX INFO: renamed from: g */
    private TemplateBannerView f11867g;

    /* JADX INFO: renamed from: h */
    private int f11868h;

    /* JADX INFO: renamed from: i */
    private int f11869i;

    /* JADX INFO: renamed from: j */
    private int f11870j;

    /* JADX INFO: renamed from: l */
    private InterfaceC1933h f11872l;

    /* JADX INFO: renamed from: m */
    private C1782d f11873m;

    /* JADX INFO: renamed from: n */
    private C1917c f11874n;

    /* JADX INFO: renamed from: o */
    private C1489c f11875o;

    /* JADX INFO: renamed from: p */
    private boolean f11876p;

    /* JADX INFO: renamed from: q */
    private boolean f11877q;

    /* JADX INFO: renamed from: r */
    private boolean f11878r;

    /* JADX INFO: renamed from: s */
    private boolean f11879s;

    /* JADX INFO: renamed from: t */
    private boolean f11880t;

    /* JADX INFO: renamed from: k */
    private int f11871k = -1;

    /* JADX INFO: renamed from: u */
    private InterfaceC1910c f11881u = new InterfaceC1910c() { // from class: com.anythink.expressad.mbbanner.b.a.1
        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
        /* JADX INFO: renamed from: a */
        public final void mo9963a() {
            if (C1920a.this.f11872l != null) {
                InterfaceC1933h unused = C1920a.this.f11872l;
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
        /* JADX INFO: renamed from: a */
        public final void mo9964a(C1781c c1781c) {
            if (C1920a.this.f11872l != null) {
                C1920a.this.f11872l.mo321a(c1781c);
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
        /* JADX INFO: renamed from: a */
        public final void mo9965a(C1781c c1781c, boolean z) {
            if (C1920a.this.f11872l == null || z) {
                return;
            }
            C1920a.this.f11872l.mo323b();
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
        /* JADX INFO: renamed from: a */
        public final void mo9966a(String str) {
            C1920a.this.m10077a(str);
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
        /* JADX INFO: renamed from: a */
        public final void mo9967a(List<C1781c> list) {
            if (C1920a.this.f11872l != null) {
                C1920a.this.f11872l.mo320a();
            }
            String unused = C1920a.f11861b;
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
        /* JADX INFO: renamed from: a */
        public final void mo9968a(boolean z) {
            C1915a c1915aM9974a;
            int i;
            String str;
            if (z) {
                c1915aM9974a = C1915a.m9974a();
                i = 2;
                String unused = C1920a.this.f11864d;
                str = C1920a.this.f11863c;
            } else {
                c1915aM9974a = C1915a.m9974a();
                i = 3;
                String unused2 = C1920a.this.f11864d;
                str = C1920a.this.f11863c;
                new C1906d(C1920a.this.f11869i + "x" + C1920a.this.f11868h, C1920a.this.f11870j * 1000);
                InterfaceC1909b unused3 = C1920a.this.f11882v;
            }
            c1915aM9974a.m9978a(i, str);
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
        /* JADX INFO: renamed from: b */
        public final void mo9969b() {
            if (C1920a.this.f11872l != null) {
                InterfaceC1933h unused = C1920a.this.f11872l;
                C1920a.this.f11880t = true;
                C1915a c1915aM9974a = C1915a.m9974a();
                String unused2 = C1920a.this.f11864d;
                c1915aM9974a.m9978a(2, C1920a.this.f11863c);
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
        /* JADX INFO: renamed from: c */
        public final void mo9970c() {
            if (C1920a.this.f11872l != null) {
                InterfaceC1933h unused = C1920a.this.f11872l;
                C1920a.this.f11880t = false;
                C1915a c1915aM9974a = C1915a.m9974a();
                String unused2 = C1920a.this.f11864d;
                String str = C1920a.this.f11863c;
                new C1906d(C1920a.this.f11869i + "x" + C1920a.this.f11868h, C1920a.this.f11870j * 1000);
                InterfaceC1909b unused3 = C1920a.this.f11882v;
                c1915aM9974a.m9978a(3, str);
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c
        /* JADX INFO: renamed from: d */
        public final void mo9971d() {
            if (C1920a.this.f11872l != null) {
                C1920a.this.f11872l.mo327f();
            }
        }
    };

    /* JADX INFO: renamed from: v */
    private InterfaceC1909b f11882v = new InterfaceC1909b() { // from class: com.anythink.expressad.mbbanner.b.a.2
        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1909b
        /* JADX INFO: renamed from: a */
        public final void mo9959a() {
            C1782d unused = C1920a.this.f11873m;
            if (C1920a.this.f11867g != null) {
                try {
                    C1920a.this.f11879s = true;
                    C1920a.this.m10090h();
                } catch (Throwable th) {
                    C1920a.this.f11879s = false;
                    if (C1920a.this.f11872l != null) {
                        C1920a.this.f11872l.mo322a("startShowBanner fail:" + th.getMessage());
                    }
                    String unused2 = C1920a.f11861b;
                    new StringBuilder("onResourceSuccess but startShowBanner fail:").append(th.getMessage());
                }
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1909b
        /* JADX INFO: renamed from: a */
        public final void mo9960a(C1782d c1782d) {
            C1920a.this.f11873m = c1782d;
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1909b
        /* JADX INFO: renamed from: a */
        public final void mo9961a(String str) {
            if (C1920a.this.f11872l != null) {
                C1920a.this.f11872l.mo322a(str);
            }
            String unused = C1920a.f11861b;
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1909b
        /* JADX INFO: renamed from: b */
        public final void mo9962b() {
            if (C1920a.this.f11872l != null) {
                C1920a.this.f11872l.mo322a(C1899a.f11698c);
            }
            String unused = C1920a.f11861b;
        }
    };

    public C1920a(TemplateBannerView templateBannerView, C1934i c1934i, String str, String str2) {
        this.f11867g = templateBannerView;
        if (c1934i != null) {
            this.f11868h = c1934i.m10121a();
            this.f11869i = c1934i.m10122b();
        }
        this.f11862a = c1934i;
        this.f11863c = str2;
        this.f11864d = str;
        C1486b.m6002a();
        C1489c c1489cM6011c = C1486b.m6011c(C1773a.m8548c().m8558f(), this.f11863c);
        this.f11875o = c1489cM6011c;
        if (c1489cM6011c == null) {
            this.f11875o = C1489c.m6069c(this.f11863c);
        }
        if (this.f11871k == -1) {
            int iM6092b = this.f11875o.m6092b();
            if (iM6092b > 0) {
                if (iM6092b < 10) {
                    iM6092b = 10;
                } else if (iM6092b > 180) {
                    iM6092b = 180;
                }
            }
            this.f11870j = iM6092b;
        }
        if (this.f11866f == 0) {
            boolean z = this.f11875o.m6097d() == 1;
            this.f11865e = z;
            C1917c c1917c = this.f11874n;
            if (c1917c != null) {
                c1917c.m10046a(z);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m10073a(int i) {
        if (i <= 0) {
            return i;
        }
        if (i < 10) {
            return 10;
        }
        if (i > 180) {
            return 180;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10077a(String str) {
        InterfaceC1933h interfaceC1933h = this.f11872l;
        if (interfaceC1933h != null) {
            interfaceC1933h.mo322a(str);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m10086f() {
        C1486b.m6002a();
        C1489c c1489cM6011c = C1486b.m6011c(C1773a.m8548c().m8558f(), this.f11863c);
        this.f11875o = c1489cM6011c;
        if (c1489cM6011c == null) {
            this.f11875o = C1489c.m6069c(this.f11863c);
        }
        if (this.f11871k == -1) {
            int iM6092b = this.f11875o.m6092b();
            if (iM6092b > 0) {
                if (iM6092b < 10) {
                    iM6092b = 10;
                } else if (iM6092b > 180) {
                    iM6092b = 180;
                }
            }
            this.f11870j = iM6092b;
        }
        if (this.f11866f == 0) {
            boolean z = this.f11875o.m6097d() == 1;
            this.f11865e = z;
            C1917c c1917c = this.f11874n;
            if (c1917c != null) {
                c1917c.m10046a(z);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m10088g() {
        C1486b.m6002a();
        C1489c c1489cM6011c = C1486b.m6011c(C1773a.m8548c().m8558f(), this.f11863c);
        this.f11875o = c1489cM6011c;
        if (c1489cM6011c == null) {
            this.f11875o = C1489c.m6069c(this.f11863c);
        }
        if (this.f11871k == -1) {
            int iM6092b = this.f11875o.m6092b();
            if (iM6092b > 0) {
                if (iM6092b < 10) {
                    iM6092b = 10;
                } else if (iM6092b > 180) {
                    iM6092b = 180;
                }
            }
            this.f11870j = iM6092b;
        }
        if (this.f11866f == 0) {
            boolean z = this.f11875o.m6097d() == 1;
            this.f11865e = z;
            C1917c c1917c = this.f11874n;
            if (c1917c != null) {
                c1917c.m10046a(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m10090h() throws Throwable {
        if (this.f11878r || !this.f11879s) {
            return;
        }
        if (this.f11873m != null) {
            if (this.f11874n == null) {
                this.f11874n = new C1917c(this.f11867g, this.f11881u, this.f11864d, this.f11863c, this.f11865e, this.f11875o);
            }
            this.f11874n.m10045a(this.f11862a);
            this.f11874n.m10048b(this.f11876p);
            this.f11874n.m10049c(this.f11877q);
            this.f11874n.m10047a(this.f11865e, this.f11866f);
            this.f11874n.m10044a(this.f11873m);
        } else {
            m10077a(C1899a.f11703h);
        }
        this.f11879s = false;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m10092i() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    private static void m10093j() {
    }

    /* JADX INFO: renamed from: k */
    private void m10095k() {
        C1915a c1915aM9974a;
        int i;
        String str;
        TemplateBannerView templateBannerView = this.f11867g;
        if (templateBannerView != null) {
            if (!this.f11876p || !this.f11877q || this.f11880t || C1891y.m9874a(templateBannerView)) {
                c1915aM9974a = C1915a.m9974a();
                i = 2;
                str = this.f11863c;
            } else {
                c1915aM9974a = C1915a.m9974a();
                i = 3;
                str = this.f11863c;
                new C1906d(this.f11869i + "x" + this.f11868h, this.f11870j * 1000);
            }
            c1915aM9974a.m9978a(i, str);
            if (this.f11876p) {
                return;
            }
            C1915a.m9974a().m9978a(4, this.f11863c);
            C1915a.m9974a().m9979a(this.f11863c);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m10096l() {
        m10095k();
        C1917c c1917c = this.f11874n;
        if (c1917c != null) {
            c1917c.m10048b(this.f11876p);
            this.f11874n.m10049c(this.f11877q);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m10097a() {
        C1782d c1782d = this.f11873m;
        return (c1782d == null || c1782d.m9024f() == null) ? "" : this.f11873m.m9024f();
    }

    /* JADX INFO: renamed from: a */
    public final void m10098a(int i, int i2, int i3, int i4) {
        C1917c c1917c = this.f11874n;
        if (c1917c != null) {
            c1917c.m10042a(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10099a(C1782d c1782d) {
        this.f11873m = c1782d;
        C1915a.m9974a().m9980a(this.f11863c, c1782d, this.f11882v);
    }

    /* JADX INFO: renamed from: a */
    public final void m10100a(InterfaceC1933h interfaceC1933h) {
        this.f11872l = interfaceC1933h;
    }

    /* JADX INFO: renamed from: a */
    public final void m10101a(C1934i c1934i) {
        if (c1934i != null) {
            this.f11868h = c1934i.m10121a();
            this.f11869i = c1934i.m10122b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10102a(boolean z) {
        this.f11865e = z;
        this.f11866f = z ? 1 : 2;
    }

    /* JADX INFO: renamed from: b */
    public final void m10103b() {
        this.f11878r = true;
        if (this.f11872l != null) {
            this.f11872l = null;
        }
        if (this.f11882v != null) {
            this.f11882v = null;
        }
        if (this.f11881u != null) {
            this.f11881u = null;
        }
        if (this.f11867g != null) {
            this.f11867g = null;
        }
        C1915a.m9974a().m9978a(4, this.f11863c);
        C1915a.m9974a().m9979a(this.f11863c);
        C1915a.m9974a().m9981b();
        C1917c c1917c = this.f11874n;
        if (c1917c != null) {
            c1917c.m10041a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10104b(boolean z) {
        this.f11876p = z;
        m10096l();
        m10090h();
    }

    /* JADX INFO: renamed from: c */
    public final void m10105c() {
        C1915a c1915aM9974a = C1915a.m9974a();
        String str = this.f11863c;
        new C1906d(this.f11869i + "x" + this.f11868h, this.f11870j * 1000);
        c1915aM9974a.m9978a(4, str);
    }

    /* JADX INFO: renamed from: c */
    public final void m10106c(boolean z) {
        this.f11877q = z;
        m10096l();
    }

    /* JADX INFO: renamed from: d */
    public final void m10107d() {
        C1915a c1915aM9974a = C1915a.m9974a();
        String str = this.f11863c;
        new C1906d(this.f11869i + "x" + this.f11868h, this.f11870j * 1000);
        c1915aM9974a.m9978a(3, str);
    }
}
