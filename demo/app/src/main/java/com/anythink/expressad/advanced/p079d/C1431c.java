package com.anythink.expressad.advanced.p079d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.advanced.p076a.C1420a;
import com.anythink.expressad.advanced.p078c.C1426a;
import com.anythink.expressad.advanced.p078c.C1427b;
import com.anythink.expressad.advanced.p078c.C1428c;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup;
import com.anythink.expressad.advanced.view.C1440a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1891y;
import com.anythink.expressad.out.InterfaceC1940o;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.C1489c;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.advanced.d.c */
/* JADX INFO: loaded from: classes.dex */
public class C1431c implements InterfaceC1157i {

    /* JADX INFO: renamed from: a */
    public static final int f6544a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f6545b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f6546c = 3;

    /* JADX INFO: renamed from: g */
    private static String f6547g = "NativeAdvancedProvider";

    /* JADX INFO: renamed from: C */
    private JSONObject f6550C;

    /* JADX INFO: renamed from: E */
    private ATOutNativeAdvancedViewGroup f6552E;

    /* JADX INFO: renamed from: F */
    private boolean f6553F;

    /* JADX INFO: renamed from: G */
    private boolean f6554G;

    /* JADX INFO: renamed from: H */
    private boolean f6555H;

    /* JADX INFO: renamed from: e */
    public boolean f6559e;

    /* JADX INFO: renamed from: f */
    public C1782d f6560f;

    /* JADX INFO: renamed from: h */
    private String f6561h;

    /* JADX INFO: renamed from: i */
    private String f6562i;

    /* JADX INFO: renamed from: j */
    private C1426a f6563j;

    /* JADX INFO: renamed from: k */
    private C1427b f6564k;

    /* JADX INFO: renamed from: l */
    private C1430b f6565l;

    /* JADX INFO: renamed from: m */
    private InterfaceC1940o f6566m;

    /* JADX INFO: renamed from: n */
    private C1432d f6567n;

    /* JADX INFO: renamed from: o */
    private ATNativeAdvancedView f6568o;

    /* JADX INFO: renamed from: p */
    private ATNativeAdvancedWebview f6569p;

    /* JADX INFO: renamed from: q */
    private C1440a f6570q;

    /* JADX INFO: renamed from: r */
    private C1489c f6571r;

    /* JADX INFO: renamed from: s */
    private boolean f6572s;

    /* JADX INFO: renamed from: t */
    private int f6573t = -1;

    /* JADX INFO: renamed from: u */
    private boolean f6574u = false;

    /* JADX INFO: renamed from: v */
    private int f6575v = 0;

    /* JADX INFO: renamed from: w */
    private boolean f6576w = false;

    /* JADX INFO: renamed from: x */
    private int f6577x = 0;

    /* JADX INFO: renamed from: y */
    private boolean f6578y = false;

    /* JADX INFO: renamed from: z */
    private int f6579z = 0;

    /* JADX INFO: renamed from: A */
    private int f6548A = 0;

    /* JADX INFO: renamed from: B */
    private Object f6549B = new Object();

    /* JADX INFO: renamed from: D */
    private boolean f6551D = false;

    /* JADX INFO: renamed from: I */
    private boolean f6556I = true;

    /* JADX INFO: renamed from: d */
    public boolean f6558d = false;

    /* JADX INFO: renamed from: J */
    private ViewTreeObserver.OnScrollChangedListener f6557J = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.anythink.expressad.advanced.d.c.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            if (C1431c.this.f6556I) {
                C1431c.this.f6556I = false;
                if (C1431c.this.f6552E != null) {
                    C1431c.this.f6552E.postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.d.c.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1431c.this.f6556I = true;
                        }
                    }, 1000L);
                }
                try {
                    C1431c.this.m5534k();
                } catch (Throwable unused) {
                }
            }
        }
    };

    public C1431c(String str, String str2, Context context) {
        C1440a c1440a;
        this.f6562i = str;
        this.f6561h = str2;
        if (this.f6564k == null) {
            C1427b c1427b = new C1427b(C1175n.m2059a().m2148f(), this.f6562i, this.f6561h);
            this.f6564k = c1427b;
            c1427b.m5485a(this);
        }
        if (this.f6569p == null) {
            try {
                this.f6569p = new ATNativeAdvancedWebview(C1175n.m2059a().m2148f());
            } catch (Throwable unused) {
            }
            if (this.f6570q == null) {
                try {
                    this.f6570q = new C1440a(this.f6561h, this.f6564k.m5490b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6569p;
            if (aTNativeAdvancedWebview != null && (c1440a = this.f6570q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(c1440a);
            }
        }
        if (this.f6568o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.f6568o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.f6569p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f6569p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.f6568o.addView(this.f6569p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f6552E == null) {
            this.f6552E = new ATOutNativeAdvancedViewGroup(C1175n.m2059a().m2148f());
            this.f6552E.setLayoutParams((this.f6579z == 0 || this.f6548A == 0) ? new ViewGroup.LayoutParams(-1, -1) : new ViewGroup.LayoutParams(this.f6579z, this.f6548A));
            this.f6552E.setProvider(this);
            this.f6552E.addView(this.f6568o);
            this.f6552E.getViewTreeObserver().addOnScrollChangedListener(this.f6557J);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5517a(Context context) {
        C1440a c1440a;
        if (this.f6564k == null) {
            C1427b c1427b = new C1427b(C1175n.m2059a().m2148f(), this.f6562i, this.f6561h);
            this.f6564k = c1427b;
            c1427b.m5485a(this);
        }
        if (this.f6569p == null) {
            try {
                this.f6569p = new ATNativeAdvancedWebview(C1175n.m2059a().m2148f());
            } catch (Throwable unused) {
            }
            if (this.f6570q == null) {
                try {
                    this.f6570q = new C1440a(this.f6561h, this.f6564k.m5490b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6569p;
            if (aTNativeAdvancedWebview != null && (c1440a = this.f6570q) != null) {
                aTNativeAdvancedWebview.setWebViewClient(c1440a);
            }
        }
        if (this.f6568o == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.f6568o = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.f6569p);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f6569p;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.f6568o.addView(this.f6569p, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f6552E == null) {
            this.f6552E = new ATOutNativeAdvancedViewGroup(C1175n.m2059a().m2148f());
            this.f6552E.setLayoutParams((this.f6579z == 0 || this.f6548A == 0) ? new ViewGroup.LayoutParams(-1, -1) : new ViewGroup.LayoutParams(this.f6579z, this.f6548A));
            this.f6552E.setProvider(this);
            this.f6552E.addView(this.f6568o);
            this.f6552E.getViewTreeObserver().addOnScrollChangedListener(this.f6557J);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5518a(C1781c c1781c) {
        this.f6564k.m5486a(this.f6567n);
        this.f6564k.m5488a(c1781c, this.f6568o, true);
    }

    /* JADX INFO: renamed from: a */
    private void m5519a(JSONObject jSONObject) {
        this.f6551D = true;
        m5524b(jSONObject);
    }

    /* JADX INFO: renamed from: b */
    private void m5523b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f6548A = i;
        this.f6579z = i2;
        this.f6552E.setLayoutParams(new ViewGroup.LayoutParams(i2, i));
    }

    /* JADX INFO: renamed from: b */
    private void m5524b(JSONObject jSONObject) {
        if (this.f6551D) {
            this.f6550C = jSONObject;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6569p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f6569p, NativeAdvancedJsUtils.f6617d, "", jSONObject);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m5526f(int i) {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6569p;
        if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
            return;
        }
        try {
            if (this.f6569p != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f6626m, i);
                C1469j.m5701a();
                C1469j.m5703a((WebView) this.f6569p, NativeAdvancedJsUtils.f6625l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m5528g(int i) {
        if (this.f6574u) {
            this.f6573t = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6569p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            int i2 = this.f6573t;
            if (i2 == 1) {
                this.f6564k.m5489a(true);
                NativeAdvancedJsUtils.sendThirdToH5(this.f6569p, NativeAdvancedJsUtils.f6619f, "", null);
            } else if (i2 == 0) {
                this.f6564k.m5489a(false);
                NativeAdvancedJsUtils.sendThirdToH5(this.f6569p, NativeAdvancedJsUtils.f6620g, "", null);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m5529h() {
        final C1781c[] c1781cArr = new C1781c[1];
        C1426a c1426a = this.f6563j;
        if (c1426a != null) {
            c1781cArr[0] = c1426a.m5459c();
        }
        if (c1781cArr[0] != null) {
            if (this.f6571r == null) {
                C1486b.m6002a();
                this.f6571r = C1486b.m6008b(C1773a.m8548c().m8558f(), this.f6561h);
            }
            this.f6567n = new C1432d(this, this.f6566m, this.f6571r.m6088a(), c1781cArr[0]);
            if (this.f6559e) {
                return;
            }
            this.f6559e = true;
            C1428c.m5511a(this.f6568o, c1781cArr[0], this.f6562i, this.f6561h, this.f6573t, new C1428c.a() { // from class: com.anythink.expressad.advanced.d.c.2
                @Override // com.anythink.expressad.advanced.p078c.C1428c.a
                /* JADX INFO: renamed from: a */
                public final void mo5512a() {
                    String unused = C1431c.f6547g;
                    C1431c.this.m5539a(c1781cArr[0], false);
                }

                @Override // com.anythink.expressad.advanced.p078c.C1428c.a
                /* JADX INFO: renamed from: b */
                public final void mo5513b() {
                    C1431c.this.f6559e = false;
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    private void m5530h(int i) {
        if (this.f6576w) {
            this.f6575v = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6569p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f6569p, NativeAdvancedJsUtils.f6621h, "mute", Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: i */
    private String m5531i() {
        if (this.f6558d) {
            C1427b c1427b = this.f6564k;
            return c1427b != null ? c1427b.m5484a() : "";
        }
        C1426a c1426a = this.f6563j;
        return c1426a != null ? c1426a.m5450a() : "";
    }

    /* JADX INFO: renamed from: i */
    private void m5532i(int i) {
        if (this.f6578y) {
            this.f6577x = i;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6569p;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.f6569p, NativeAdvancedJsUtils.f6623j, NativeAdvancedJsUtils.f6624k, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: j */
    private void m5533j() {
        m5528g(this.f6573t);
        m5530h(this.f6575v);
        m5532i(this.f6577x);
        m5524b(this.f6550C);
        C1175n.m2059a().m2148f();
        m5526f(C1877k.m9690a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m5534k() {
        if (this.f6553F && this.f6554G && this.f6555H && !C1891y.m9874a(this.f6568o.getAdvancedNativeWebview()) && this.f6552E.getAlpha() >= 0.5f && this.f6552E.getVisibility() == 0) {
            C1427b c1427b = this.f6564k;
            if (c1427b != null) {
                c1427b.m5492d();
            }
            m5529h();
        }
    }

    /* JADX INFO: renamed from: l */
    private void m5535l() {
        C1427b c1427b = this.f6564k;
        if (c1427b != null) {
            c1427b.m5493e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m5536a(String str) {
        C1426a c1426a = this.f6563j;
        return c1426a != null ? c1426a.m5451a(str) : "";
    }

    /* JADX INFO: renamed from: a */
    public final void m5537a(int i) {
        this.f6574u = true;
        m5528g(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m5538a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f6548A = i;
        this.f6579z = i2;
        this.f6552E.setLayoutParams(new ViewGroup.LayoutParams(i2, i));
    }

    /* JADX INFO: renamed from: a */
    public final void m5539a(C1781c c1781c, boolean z) {
        m5528g(this.f6573t);
        m5530h(this.f6575v);
        m5532i(this.f6577x);
        m5524b(this.f6550C);
        C1175n.m2059a().m2148f();
        m5526f(C1877k.m9690a());
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.f6552E;
        if (aTOutNativeAdvancedViewGroup == null || aTOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (c1781c != null && z) {
            if (this.f6571r == null) {
                C1486b.m6002a();
                this.f6571r = C1486b.m6008b(C1773a.m8548c().m8558f(), this.f6561h);
            }
            this.f6567n = new C1432d(this, this.f6566m, this.f6571r.m6088a(), c1781c);
        }
        if (this.f6564k == null) {
            C1427b c1427b = new C1427b(C1175n.m2059a().m2148f(), this.f6562i, this.f6561h);
            this.f6564k = c1427b;
            c1427b.m5485a(this);
        }
        this.f6564k.m5486a(this.f6567n);
        this.f6564k.m5488a(c1781c, this.f6568o, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m5540a(C1782d c1782d) {
        this.f6560f = c1782d;
        this.f6556I = true;
        this.f6572s = true;
        this.f6568o.clearResStateAndRemoveClose();
        C1486b.m6002a();
        C1489c c1489cM6014d = C1486b.m6014d(C1773a.m8548c().m8558f(), this.f6561h);
        this.f6571r = c1489cM6014d;
        if (c1489cM6014d == null) {
            this.f6571r = C1489c.m6086y();
        }
        C1430b c1430b = new C1430b(this);
        this.f6565l = c1430b;
        c1430b.m5516a(this.f6566m);
        if (this.f6563j == null) {
            this.f6563j = new C1426a(this.f6562i, this.f6561h);
        }
        C1430b c1430b2 = this.f6565l;
        if (c1430b2 != null) {
            this.f6563j.m5454a(c1430b2);
        }
        this.f6568o.resetLoadState();
        this.f6563j.m5455a(this.f6568o);
        this.f6563j.m5456a(this.f6571r);
        this.f6563j.m5453a(this.f6579z, this.f6548A);
        this.f6563j.m5452a(this.f6573t);
        this.f6563j.m5457a(c1782d);
    }

    /* JADX INFO: renamed from: a */
    public final void m5541a(InterfaceC1940o interfaceC1940o) {
        this.f6566m = interfaceC1940o;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5542a() {
        return this.f6572s;
    }

    /* JADX INFO: renamed from: b */
    public final void m5543b() {
        this.f6572s = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m5544b(int i) {
        this.f6576w = true;
        m5530h(i);
    }

    /* JADX INFO: renamed from: c */
    public final ATOutNativeAdvancedViewGroup m5545c() {
        return this.f6552E;
    }

    /* JADX INFO: renamed from: c */
    public final void m5546c(int i) {
        this.f6578y = true;
        m5532i(i);
    }

    /* JADX INFO: renamed from: d */
    public final int m5547d() {
        return this.f6573t;
    }

    /* JADX INFO: renamed from: d */
    public final void m5548d(int i) {
        if (i == 1) {
            this.f6553F = true;
        } else if (i == 2) {
            this.f6554G = true;
        } else if (i == 3) {
            this.f6555H = true;
        }
        try {
            m5534k();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5549e() {
        if (this.f6566m != null) {
            this.f6566m = null;
        }
        if (this.f6565l != null) {
            this.f6565l = null;
        }
        if (this.f6567n != null) {
            this.f6567n = null;
        }
        C1426a c1426a = this.f6563j;
        if (c1426a != null) {
            c1426a.m5455a((ATNativeAdvancedView) null);
            this.f6563j.m5458b();
        }
        C1427b c1427b = this.f6564k;
        if (c1427b != null) {
            c1427b.m5491c();
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f6568o;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        C1420a.m5402c(this.f6560f.m9024f());
        C1440a c1440a = this.f6570q;
        if (c1440a != null) {
            c1440a.m5572a();
        }
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.f6552E;
        if (aTOutNativeAdvancedViewGroup != null) {
            aTOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.f6557J);
            this.f6552E.removeAllViews();
            this.f6552E = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5550e(int i) {
        if (i == 1) {
            this.f6553F = false;
        } else if (i == 2) {
            this.f6554G = false;
        } else if (i == 3) {
            this.f6555H = false;
        }
        C1427b c1427b = this.f6564k;
        if (c1427b != null) {
            c1427b.m5493e();
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m5551f() {
        C1426a c1426a = this.f6563j;
        C1781c c1781cM5459c = c1426a != null ? c1426a.m5459c() : null;
        if (c1781cM5459c != null) {
            return TextUtils.isEmpty(c1781cM5459c.m8811S()) ? 2 : 1;
        }
        return 0;
    }

    @Override // com.anythink.core.common.p050a.InterfaceC1157i
    public boolean isReady() {
        return true;
    }
}
