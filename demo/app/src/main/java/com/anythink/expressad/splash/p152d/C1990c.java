package com.anythink.expressad.splash.p152d;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.out.EnumC1945t;
import com.anythink.expressad.out.InterfaceC1929d;
import com.anythink.expressad.out.InterfaceC1930e;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.C1489c;
import com.anythink.expressad.splash.p151c.C1984b;
import com.anythink.expressad.splash.p151c.C1985c;
import com.anythink.expressad.splash.p151c.C1986d;
import com.anythink.expressad.splash.view.ATSplashPopView;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;
import com.anythink.expressad.splash.view.C2021b;

/* JADX INFO: renamed from: com.anythink.expressad.splash.d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1990c implements InterfaceC1157i {

    /* JADX INFO: renamed from: b */
    private static String f12618b = "SplashProvider";

    /* JADX INFO: renamed from: A */
    private Context f12619A;

    /* JADX INFO: renamed from: B */
    private boolean f12620B;

    /* JADX INFO: renamed from: C */
    private C1781c f12621C;

    /* JADX INFO: renamed from: D */
    private ATSplashPopView f12622D;

    /* JADX INFO: renamed from: c */
    private String f12626c;

    /* JADX INFO: renamed from: d */
    private String f12627d;

    /* JADX INFO: renamed from: f */
    private long f12629f;

    /* JADX INFO: renamed from: g */
    private int f12630g;

    /* JADX INFO: renamed from: h */
    private int f12631h;

    /* JADX INFO: renamed from: i */
    private C1985c f12632i;

    /* JADX INFO: renamed from: j */
    private C1986d f12633j;

    /* JADX INFO: renamed from: k */
    private C1989b f12634k;

    /* JADX INFO: renamed from: l */
    private InterfaceC1930e f12635l;

    /* JADX INFO: renamed from: m */
    private C1991d f12636m;

    /* JADX INFO: renamed from: n */
    private ATSplashView f12637n;

    /* JADX INFO: renamed from: o */
    private ATSplashWebview f12638o;

    /* JADX INFO: renamed from: p */
    private ViewGroup f12639p;

    /* JADX INFO: renamed from: q */
    private View f12640q;

    /* JADX INFO: renamed from: r */
    private C1489c f12641r;

    /* JADX INFO: renamed from: s */
    private boolean f12642s;

    /* JADX INFO: renamed from: t */
    private ViewGroup f12643t;

    /* JADX INFO: renamed from: u */
    private boolean f12644u;

    /* JADX INFO: renamed from: w */
    private int f12646w;

    /* JADX INFO: renamed from: x */
    private int f12647x;

    /* JADX INFO: renamed from: e */
    private int f12628e = 5;

    /* JADX INFO: renamed from: v */
    private int f12645v = 1;

    /* JADX INFO: renamed from: y */
    private Object f12648y = new Object();

    /* JADX INFO: renamed from: z */
    private Object f12649z = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f12625a = false;

    /* JADX INFO: renamed from: E */
    private boolean f12623E = false;

    /* JADX INFO: renamed from: F */
    private boolean f12624F = false;

    public C1990c(Context context, String str, String str2) {
        this.f12646w = C1877k.m9702e(C1175n.m2059a().m2148f());
        this.f12647x = C1877k.m9705f(C1175n.m2059a().m2148f());
        this.f12646w = context.getResources().getDisplayMetrics().widthPixels;
        this.f12647x = context.getResources().getDisplayMetrics().heightPixels;
        this.f12627d = str;
        this.f12626c = str2;
        this.f12619A = context;
        if (this.f12633j == null) {
            if (context != null) {
                this.f12633j = new C1986d(context, str, str2);
            } else {
                this.f12633j = new C1986d(C1175n.m2059a().m2148f(), this.f12627d, this.f12626c);
            }
        }
        if (this.f12638o == null) {
            try {
                this.f12638o = context != null ? new ATSplashWebview(context) : new ATSplashWebview(C1175n.m2059a().m2148f());
            } catch (Exception unused) {
            }
            ATSplashWebview aTSplashWebview = this.f12638o;
            if (aTSplashWebview != null) {
                aTSplashWebview.setWebViewClient(new C2021b(this.f12626c, this.f12633j.m10642a()));
            }
        }
        if (this.f12637n == null) {
            if (context != null) {
                this.f12637n = new ATSplashView(context);
            } else {
                this.f12637n = new ATSplashView(C1175n.m2059a().m2148f());
            }
            this.f12637n.setSplashWebview(this.f12638o);
        }
    }

    /* JADX INFO: renamed from: a */
    private ViewGroup m10686a(EnumC1945t enumC1945t) {
        ATSplashPopView aTSplashPopView = new ATSplashPopView(C1175n.m2059a().m2148f(), new ATSplashPopView.C2014a(this.f12627d, this.f12626c, enumC1945t.m10199a(), this.f12621C), this.f12636m);
        this.f12622D = aTSplashPopView;
        return aTSplashPopView;
    }

    /* JADX INFO: renamed from: a */
    private void m10687a(int i, int i2) {
        int iM9702e = C1877k.m9702e(C1175n.m2059a().m2148f());
        int iM9705f = C1877k.m9705f(C1175n.m2059a().m2148f());
        int i3 = this.f12645v;
        if (i3 == 1) {
            if (iM9705f >= i2 * 4) {
                this.f12647x = iM9705f - i2;
                this.f12646w = iM9702e;
                return;
            } else {
                this.f12647x = 0;
                this.f12646w = 0;
                return;
            }
        }
        if (i3 == 2) {
            if (iM9702e >= i * 4) {
                this.f12646w = iM9702e - i;
                this.f12647x = iM9705f;
            } else {
                this.f12647x = 0;
                this.f12646w = 0;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10688a(long j) {
        this.f12629f = j;
    }

    /* JADX INFO: renamed from: a */
    private void m10689a(Context context) {
        if (this.f12633j == null) {
            this.f12633j = context != null ? new C1986d(context, this.f12627d, this.f12626c) : new C1986d(C1175n.m2059a().m2148f(), this.f12627d, this.f12626c);
        }
        if (this.f12638o == null) {
            try {
                this.f12638o = context != null ? new ATSplashWebview(context) : new ATSplashWebview(C1175n.m2059a().m2148f());
            } catch (Exception unused) {
            }
            ATSplashWebview aTSplashWebview = this.f12638o;
            if (aTSplashWebview != null) {
                aTSplashWebview.setWebViewClient(new C2021b(this.f12626c, this.f12633j.m10642a()));
            }
        }
        if (this.f12637n == null) {
            if (context != null) {
                this.f12637n = new ATSplashView(context);
            } else {
                this.f12637n = new ATSplashView(C1175n.m2059a().m2148f());
            }
            this.f12637n.setSplashWebview(this.f12638o);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10690a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f12640q = view;
        if (view != null) {
            m10687a(layoutParams.width, layoutParams.height);
            ATSplashView aTSplashView = this.f12637n;
            if (aTSplashView != null) {
                aTSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10691a(final C1781c c1781c, final int i, final boolean z) {
        if (!C1984b.m10555a(this.f12637n, c1781c)) {
            if (i > 0) {
                this.f12633j.f12568a.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.d.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1990c.this.m10691a(c1781c, i - 1, z);
                    }
                }, 1L);
                return;
            }
            C1991d c1991d = this.f12636m;
            if (c1991d != null) {
                c1991d.mo10544a("campaignEx is not ready");
                return;
            }
            return;
        }
        m10700l();
        this.f12633j.m10643a(this.f12628e);
        this.f12633j.m10644a(this.f12643t);
        this.f12633j.m10647a(this.f12636m);
        ViewGroup viewGroup = this.f12639p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            C1360x.m4265a(this.f12637n);
            this.f12639p.addView(this.f12637n, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f12633j.m10648a(this.f12644u);
        this.f12633j.m10646a(c1781c, this.f12637n);
    }

    /* JADX INFO: renamed from: a */
    private void m10693a(String str, ViewGroup viewGroup) {
        if (!TextUtils.isEmpty(str)) {
            m10703a(viewGroup);
            return;
        }
        InterfaceC1930e interfaceC1930e = this.f12635l;
        if (interfaceC1930e != null) {
            interfaceC1930e.mo477a("token is null or empty");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10694b(ViewGroup viewGroup) {
        this.f12643t = viewGroup;
    }

    /* JADX INFO: renamed from: c */
    private void m10695c(boolean z) {
        this.f12620B = z;
    }

    /* JADX INFO: renamed from: h */
    private String m10696h() {
        if (this.f12625a) {
            C1986d c1986d = this.f12633j;
            return c1986d != null ? c1986d.m10649b() : "";
        }
        C1985c c1985c = this.f12632i;
        return c1985c != null ? c1985c.m10593a() : "";
    }

    /* JADX INFO: renamed from: i */
    private void m10697i() {
        this.f12623E = true;
        ATSplashPopView aTSplashPopView = this.f12622D;
        if (aTSplashPopView != null) {
            aTSplashPopView.startCountDown();
        }
    }

    /* JADX INFO: renamed from: j */
    private void m10698j() {
        this.f12623E = false;
        ATSplashPopView aTSplashPopView = this.f12622D;
        if (aTSplashPopView != null) {
            aTSplashPopView.release();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m10699k() {
        C1986d c1986d = this.f12633j;
        if (c1986d != null) {
            c1986d.m10651d();
        }
        ATSplashPopView aTSplashPopView = this.f12622D;
        if (aTSplashPopView == null || !this.f12623E) {
            return;
        }
        aTSplashPopView.reStartCountDown();
    }

    /* JADX INFO: renamed from: l */
    private void m10700l() {
        ATSplashWebview aTSplashWebview = this.f12638o;
        if (aTSplashWebview != null) {
            aTSplashWebview.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.splash.d.c.3

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f12656a = true;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return !this.f12656a;
                }
            });
        }
        ATSplashView aTSplashView = this.f12637n;
        if (aTSplashView != null) {
            aTSplashView.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.splash.d.c.4

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f12658a = true;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return !this.f12658a;
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    private void m10701m() {
        C1986d c1986d = this.f12633j;
        if (c1986d != null) {
            c1986d.m10652e();
        }
        ATSplashPopView aTSplashPopView = this.f12622D;
        if (aTSplashPopView == null || !this.f12623E) {
            return;
        }
        aTSplashPopView.pauseCountDown();
    }

    /* JADX INFO: renamed from: a */
    public final void m10702a(int i) {
        this.f12645v = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m10703a(ViewGroup viewGroup) {
        this.f12639p = viewGroup;
        ATSplashView aTSplashView = this.f12637n;
        if (aTSplashView != null) {
            aTSplashView.setDevContainer(viewGroup);
        }
        C1985c c1985c = this.f12632i;
        final C1781c c1781cM10604c = c1985c != null ? c1985c.m10604c() : null;
        if (c1781cM10604c == null) {
            InterfaceC1930e interfaceC1930e = this.f12635l;
            if (interfaceC1930e != null) {
                interfaceC1930e.mo477a("campaignEx is vali");
                return;
            }
            return;
        }
        if (this.f12641r == null) {
            C1486b.m6002a();
            this.f12641r = C1486b.m6003a(C1773a.m8548c().m8558f(), this.f12626c);
        }
        C1991d c1991d = new C1991d(this, this.f12635l, this.f12641r.m6088a(), c1781cM10604c);
        this.f12636m = c1991d;
        int i = this.f12628e;
        if (i < 2 || i > 10) {
            this.f12628e = 5;
        }
        if (c1991d != null) {
            c1991d.m10722c();
        }
        viewGroup.post(new Runnable() { // from class: com.anythink.expressad.splash.d.c.1
            @Override // java.lang.Runnable
            public final void run() {
                C1990c.this.m10704a(c1781cM10604c, false);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m10704a(C1781c c1781c, boolean z) {
        if (c1781c != null && z) {
            if (this.f12641r == null) {
                C1486b.m6002a();
                this.f12641r = C1486b.m6003a(C1773a.m8548c().m8558f(), this.f12626c);
            }
            this.f12636m = new C1991d(this, this.f12635l, this.f12641r.m6088a(), c1781c);
        }
        this.f12621C = c1781c;
        ViewGroup viewGroup = this.f12639p;
        if (viewGroup != null) {
            if (this.f12633j == null) {
                this.f12633j = new C1986d(viewGroup.getContext(), this.f12627d, this.f12626c);
            }
            m10691a(c1781c, 0, z);
        } else {
            C1991d c1991d = this.f12636m;
            if (c1991d != null) {
                c1991d.mo10544a("container is null");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10705a(C1782d c1782d) {
        synchronized (this.f12648y) {
            if (this.f12642s) {
                C1989b c1989b = this.f12634k;
                if (c1989b != null) {
                    c1989b.mo10540a("current unit is loading");
                    this.f12642s = true;
                }
                return;
            }
            this.f12642s = true;
            this.f12637n.clearResState();
            this.f12641r = new C1489c();
            if (this.f12632i == null) {
                this.f12632i = new C1985c(this.f12627d, this.f12626c, this.f12629f * 1000);
            }
            C1989b c1989b2 = this.f12634k;
            if (c1989b2 != null) {
                c1989b2.m10685b("");
                this.f12632i.m10598a(this.f12634k);
            }
            this.f12637n.resetLoadState();
            this.f12632i.m10602b(this.f12628e);
            this.f12632i.m10599a(this.f12637n);
            this.f12632i.m10596a(this.f12641r);
            this.f12632i.m10595a(this.f12646w, this.f12647x);
            this.f12632i.m10603b(this.f12644u);
            this.f12632i.m10600a(this.f12624F);
            this.f12632i.m10594a(this.f12645v);
            this.f12632i.m10597a(c1782d);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10706a(InterfaceC1929d interfaceC1929d) {
        if (this.f12634k == null) {
            this.f12634k = new C1989b(this);
        }
        this.f12634k.m10684a(interfaceC1929d);
    }

    /* JADX INFO: renamed from: a */
    public final void m10707a(InterfaceC1930e interfaceC1930e) {
        this.f12635l = interfaceC1930e;
    }

    /* JADX INFO: renamed from: a */
    public final void m10708a(boolean z) {
        this.f12624F = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10709a() {
        return this.f12642s;
    }

    /* JADX INFO: renamed from: b */
    public final void m10710b() {
        this.f12642s = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m10711b(int i) {
        this.f12628e = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m10712b(boolean z) {
        this.f12644u = z;
    }

    /* JADX INFO: renamed from: c */
    public final long m10713c() {
        return this.f12629f;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10714d() {
        return this.f12644u;
    }

    /* JADX INFO: renamed from: e */
    public final int m10715e() {
        return this.f12628e;
    }

    /* JADX INFO: renamed from: f */
    public final void m10716f() {
        m10687a(100, 100);
    }

    /* JADX INFO: renamed from: g */
    public final void m10717g() {
        this.f12621C = null;
        if (this.f12635l != null) {
            this.f12635l = null;
        }
        if (this.f12634k != null) {
            this.f12634k = null;
        }
        if (this.f12636m != null) {
            this.f12636m = null;
        }
        C1985c c1985c = this.f12632i;
        if (c1985c != null) {
            c1985c.m10601b();
        }
        C1986d c1986d = this.f12633j;
        if (c1986d != null) {
            c1986d.m10650c();
        }
        if (this.f12619A != null) {
            this.f12619A = null;
        }
    }

    @Override // com.anythink.core.common.p050a.InterfaceC1157i
    public final boolean isReady() {
        C1985c c1985c = this.f12632i;
        return (c1985c == null || c1985c.m10604c() == null || !C1984b.m10555a(this.f12637n, this.f12632i.m10604c())) ? false : true;
    }
}
