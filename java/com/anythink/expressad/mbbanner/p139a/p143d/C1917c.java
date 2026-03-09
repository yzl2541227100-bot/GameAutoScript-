package com.anythink.expressad.mbbanner.p139a.p143d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1879m;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1891y;
import com.anythink.expressad.mbbanner.p139a.C1899a;
import com.anythink.expressad.mbbanner.p139a.p140a.C1900a;
import com.anythink.expressad.mbbanner.p139a.p140a.C1902c;
import com.anythink.expressad.mbbanner.p139a.p142c.C1912e;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1910c;
import com.anythink.expressad.mbbanner.p139a.p144e.C1919b;
import com.anythink.expressad.mbbanner.view.ATBannerWebView;
import com.anythink.expressad.mbbanner.view.C1921a;
import com.anythink.expressad.out.C1934i;
import com.anythink.expressad.out.C1935j;
import com.anythink.expressad.out.C1941p;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.p073a.p074a.C1406a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.C1489c;
import com.anythink.expressad.videocommon.p178b.C2325j;
import com.anythink.expressad.widget.FeedBackButton;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mobi.oneway.export.p283g.C3637i;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1917c {

    /* JADX INFO: renamed from: c */
    private static String f11802c = "BannerShowManager";

    /* JADX INFO: renamed from: A */
    private float f11803A;

    /* JADX INFO: renamed from: a */
    public C1405a f11807a;

    /* JADX INFO: renamed from: b */
    public C1934i f11808b;

    /* JADX INFO: renamed from: d */
    private InterfaceC1910c f11809d;

    /* JADX INFO: renamed from: e */
    private boolean f11810e;

    /* JADX INFO: renamed from: f */
    private C1781c f11811f;

    /* JADX INFO: renamed from: g */
    private TemplateBannerView f11812g;

    /* JADX INFO: renamed from: h */
    private ImageView f11813h;

    /* JADX INFO: renamed from: i */
    private ATBannerWebView f11814i;

    /* JADX INFO: renamed from: j */
    private ImageView f11815j;

    /* JADX INFO: renamed from: k */
    private boolean f11816k;

    /* JADX INFO: renamed from: l */
    private boolean f11817l;

    /* JADX INFO: renamed from: m */
    private boolean f11818m;

    /* JADX INFO: renamed from: n */
    private boolean f11819n;

    /* JADX INFO: renamed from: o */
    private boolean f11820o;

    /* JADX INFO: renamed from: p */
    private boolean f11821p;

    /* JADX INFO: renamed from: q */
    private boolean f11822q;

    /* JADX INFO: renamed from: r */
    private String f11823r;

    /* JADX INFO: renamed from: s */
    private String f11824s;

    /* JADX INFO: renamed from: t */
    private List<C1781c> f11825t;

    /* JADX INFO: renamed from: u */
    private int f11826u;

    /* JADX INFO: renamed from: w */
    private C1902c f11828w;

    /* JADX INFO: renamed from: z */
    private float f11831z;

    /* JADX INFO: renamed from: v */
    private long f11827v = C3637i.f19800f;

    /* JADX INFO: renamed from: x */
    private Handler f11829x = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.mbbanner.a.d.c.1
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
        }
    };

    /* JADX INFO: renamed from: y */
    private AbstractRunnableC1861a f11830y = new AbstractRunnableC1861a() { // from class: com.anythink.expressad.mbbanner.a.d.c.4
        public AnonymousClass4() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: a */
        public final void mo5269a() {
            C1917c.this.m10004a(C1899a.f11709n);
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: b */
        public final void mo5270b() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: c */
        public final void mo5271c() {
        }
    };

    /* JADX INFO: renamed from: B */
    private View.OnClickListener f11804B = new View.OnClickListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.5
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (C1917c.this.f11822q) {
                C1917c.m10012b(C1917c.this);
            }
        }
    };

    /* JADX INFO: renamed from: C */
    private InterfaceC1908a f11805C = new InterfaceC1908a() { // from class: com.anythink.expressad.mbbanner.a.d.c.6
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: a */
        public final void mo9952a() {
            C1917c.m10012b(C1917c.this);
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: a */
        public final void mo9953a(int i) {
            if (i == 2) {
                C1917c.m10015c(C1917c.this);
            } else {
                C1917c.this.m10033l();
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: a */
        public final void mo9954a(C1781c c1781c) {
            C1917c.this.m10043a(c1781c, false, "");
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: a */
        public final void mo9955a(boolean z) {
            if (C1917c.this.f11809d != null) {
                C1917c.this.f11821p = z;
                if (z) {
                    C1917c.this.f11809d.mo9969b();
                } else {
                    C1917c.this.f11809d.mo9970c();
                }
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: a */
        public final void mo9956a(boolean z, String str) {
            try {
                if (C1917c.this.f11809d != null) {
                    if (TextUtils.isEmpty(str)) {
                        C1917c.this.f11809d.mo9964a(C1917c.this.f11811f);
                        C1917c.this.f11809d.mo9963a();
                    } else {
                        C1781c c1781cM8703b = C1781c.m8703b(C1781c.m8671a(C1917c.this.f11811f));
                        c1781cM8703b.m8902p(str);
                        C1917c.this.m10043a(c1781cM8703b, z, str);
                    }
                }
            } catch (Exception e) {
                String unused = C1917c.f11802c;
                e.getMessage();
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: b */
        public final void mo9957b() {
            C1917c.m10012b(C1917c.this);
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: b */
        public final void mo9958b(int i) {
            if (i != 1) {
                C1917c.this.m10019e();
            } else {
                C1917c.this.m10026h();
                C1917c.m10009b();
            }
        }
    };

    /* JADX INFO: renamed from: D */
    private C1442b f11806D = new C1442b() { // from class: com.anythink.expressad.mbbanner.a.d.c.2
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            C1917c.m10034l(C1917c.this);
            C1900a.m9893a(webView);
            C1917c.m10038n(C1917c.this);
            if (C1917c.this.f11811f == null || C1917c.this.f11811f.m8908s()) {
                return;
            }
            C1917c.this.m10026h();
            C1917c.m10009b();
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C1917c.this.m10004a(str);
            C1917c.m10009b();
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$1 */
    public class AnonymousClass1 extends Handler {
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$10 */
    public class AnonymousClass10 implements Runnable {
        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1917c.this.m10026h();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$11 */
    public class AnonymousClass11 implements C1941p.e {
        public AnonymousClass11() {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10050a(C1781c c1781c, String str) {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10051a(C1935j c1935j) {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10052a(C1935j c1935j, String str) {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final boolean mo10053a() {
            return false;
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: b */
        public final void mo10054b() {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: b */
        public final void mo10055b(C1935j c1935j) {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: b */
        public final void mo10056b(C1935j c1935j, String str) {
        }

        @Override // com.anythink.expressad.out.C1941p.e
        /* JADX INFO: renamed from: c */
        public final void mo10057c() {
            if (C1917c.this.f11809d != null) {
                C1917c.this.f11809d.mo9963a();
            }
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: c */
        public final void mo10058c(C1935j c1935j) {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: d */
        public final void mo10059d(C1935j c1935j) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$2 */
    public class AnonymousClass2 extends C1442b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            C1917c.m10034l(C1917c.this);
            C1900a.m9893a(webView);
            C1917c.m10038n(C1917c.this);
            if (C1917c.this.f11811f == null || C1917c.this.f11811f.m8908s()) {
                return;
            }
            C1917c.this.m10026h();
            C1917c.m10009b();
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C1917c.this.m10004a(str);
            C1917c.m10009b();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$3 */
    public class AnonymousClass3 implements InterfaceC1798a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: a */
        public final void mo5503a() {
            String string;
            C1917c.this.f11812g.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = C1917c.f11802c;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) C1917c.this.f11814i, AbsFeedBackForH5.f6738a, strEncodeToString);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: b */
        public final void mo5504b() {
            String string;
            C1917c.this.f11812g.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = C1917c.f11802c;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) C1917c.this.f11814i, AbsFeedBackForH5.f6738a, strEncodeToString);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: c */
        public final void mo5505c() {
            String string;
            C1917c.this.f11812g.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = C1917c.f11802c;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) C1917c.this.f11814i, AbsFeedBackForH5.f6738a, strEncodeToString);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$4 */
    public class AnonymousClass4 extends AbstractRunnableC1861a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: a */
        public final void mo5269a() {
            C1917c.this.m10004a(C1899a.f11709n);
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: b */
        public final void mo5270b() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
        /* JADX INFO: renamed from: c */
        public final void mo5271c() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$5 */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (C1917c.this.f11822q) {
                C1917c.m10012b(C1917c.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$6 */
    public class AnonymousClass6 implements InterfaceC1908a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: a */
        public final void mo9952a() {
            C1917c.m10012b(C1917c.this);
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: a */
        public final void mo9953a(int i) {
            if (i == 2) {
                C1917c.m10015c(C1917c.this);
            } else {
                C1917c.this.m10033l();
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: a */
        public final void mo9954a(C1781c c1781c) {
            C1917c.this.m10043a(c1781c, false, "");
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: a */
        public final void mo9955a(boolean z) {
            if (C1917c.this.f11809d != null) {
                C1917c.this.f11821p = z;
                if (z) {
                    C1917c.this.f11809d.mo9969b();
                } else {
                    C1917c.this.f11809d.mo9970c();
                }
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: a */
        public final void mo9956a(boolean z, String str) {
            try {
                if (C1917c.this.f11809d != null) {
                    if (TextUtils.isEmpty(str)) {
                        C1917c.this.f11809d.mo9964a(C1917c.this.f11811f);
                        C1917c.this.f11809d.mo9963a();
                    } else {
                        C1781c c1781cM8703b = C1781c.m8703b(C1781c.m8671a(C1917c.this.f11811f));
                        c1781cM8703b.m8902p(str);
                        C1917c.this.m10043a(c1781cM8703b, z, str);
                    }
                }
            } catch (Exception e) {
                String unused = C1917c.f11802c;
                e.getMessage();
            }
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: b */
        public final void mo9957b() {
            C1917c.m10012b(C1917c.this);
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a
        /* JADX INFO: renamed from: b */
        public final void mo9958b(int i) {
            if (i != 1) {
                C1917c.this.m10019e();
            } else {
                C1917c.this.m10026h();
                C1917c.m10009b();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$7 */
    public class AnonymousClass7 implements View.OnTouchListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C1917c.this.f11831z = motionEvent.getRawX();
            C1917c.this.f11803A = motionEvent.getRawY();
            String unused = C1917c.f11802c;
            StringBuilder sb = new StringBuilder();
            sb.append(C1917c.this.f11831z);
            sb.append("  ");
            sb.append(C1917c.this.f11803A);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$8 */
    public class AnonymousClass8 implements View.OnClickListener {
        public AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1917c.this.m10043a(C1919b.m10066a(CommonJSBridgeImpUtils.buildClickJsonObject(C1917c.this.f11831z, C1917c.this.f11803A), C1917c.this.f11811f), false, "");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.c$9 */
    public class AnonymousClass9 implements InterfaceC1819c {
        public AnonymousClass9() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            if (C1917c.this.f11813h != null) {
                C1917c.this.f11813h.setImageBitmap(bitmap);
            }
            C1917c.m10034l(C1917c.this);
            C1917c.m10036m(C1917c.this);
            C1917c.this.m10033l();
            C1917c.this.m10026h();
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
            C1917c.this.m10004a(C1899a.f11705j);
        }
    }

    public C1917c(TemplateBannerView templateBannerView, InterfaceC1910c interfaceC1910c, String str, String str2, boolean z, C1489c c1489c) {
        this.f11810e = z;
        this.f11812g = templateBannerView;
        this.f11823r = str2;
        this.f11824s = str;
        this.f11809d = new C1912e(interfaceC1910c, c1489c);
    }

    /* JADX INFO: renamed from: a */
    private static String m10001a(C1781c c1781c) throws Throwable {
        String strConcat;
        if (c1781c == null) {
            return "";
        }
        String strM11889b = C2325j.m11884a().m11889b(c1781c.m8901p());
        if (TextUtils.isEmpty(strM11889b)) {
            strM11889b = c1781c.m8903q();
            if (c1781c.m8856ay()) {
                try {
                    File file = new File(strM11889b);
                    if (!file.exists()) {
                        return "";
                    }
                    strConcat = C1879m.m9729a(file);
                } catch (Exception unused) {
                    File file2 = new File(strM11889b);
                    if (file2.exists() && file2.isFile() && file2.canRead()) {
                        strConcat = "file:////".concat(String.valueOf(strM11889b));
                    }
                    return strM11889b;
                }
                return strConcat;
            }
            File file3 = new File(strM11889b);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                return "file:////".concat(String.valueOf(strM11889b));
            }
        }
        return strM11889b;
    }

    /* JADX INFO: renamed from: a */
    private static void m10002a(C1781c c1781c, Context context, String str) {
        if (c1781c != null) {
            try {
                List<String> listM8869e = c1781c.m8869e();
                if (listM8869e == null || listM8869e.size() <= 0) {
                    return;
                }
                Iterator<String> it = listM8869e.iterator();
                while (it.hasNext()) {
                    C1405a.m5185a(context, c1781c, str, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10004a(String str) {
        if (this.f11811f == null || m10028i()) {
            return;
        }
        this.f11829x.removeCallbacks(this.f11830y);
        InterfaceC1910c interfaceC1910c = this.f11809d;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9966a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private C1781c m10008b(C1782d c1782d) {
        if (c1782d != null) {
            ArrayList<C1781c> arrayList = c1782d.f10572J;
            this.f11825t = arrayList;
            if (arrayList != null && arrayList.size() > 0) {
                return this.f11825t.get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10009b() {
    }

    /* JADX INFO: renamed from: b */
    private void m10010b(C1781c c1781c) {
        if (c1781c != null) {
            m10014c(c1781c, C1175n.m2059a().m2148f(), this.f11823r);
            m10011b(c1781c, C1175n.m2059a().m2148f(), this.f11823r);
            m10002a(c1781c, C1175n.m2059a().m2148f(), this.f11823r);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m10011b(C1781c c1781c, Context context, String str) {
        if (c1781c != null) {
            try {
                if (TextUtils.isEmpty(c1781c.m8840ai())) {
                    return;
                }
                C1405a.m5186a(context, c1781c, str, c1781c.m8840ai(), false, true, C1406a.f6270j);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10012b(C1917c c1917c) {
        InterfaceC1910c interfaceC1910c = c1917c.f11809d;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9971d();
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m10014c(C1781c c1781c, Context context, String str) {
        if (!TextUtils.isEmpty(c1781c.m8838ag())) {
            C1405a.m5186a(context, c1781c, str, c1781c.m8838ag(), false, true, C1406a.f6269i);
        }
        if (TextUtils.isEmpty(str) || c1781c.m8804L() == null || c1781c.m8804L().m9205o() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, str, c1781c.m8804L().m9205o(), false);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10015c(C1917c c1917c) {
        ImageView imageView;
        if (c1917c.f11810e && (imageView = c1917c.f11815j) != null && imageView.getVisibility() == 0) {
            c1917c.f11815j.setVisibility(8);
            c1917c.f11815j.setOnClickListener(null);
            if (c1917c.f11812g == null || c1917c.f11815j.getParent() == null) {
                return;
            }
            c1917c.f11812g.removeView(c1917c.f11815j);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    private void m10017d(boolean z) {
        if (this.f11812g != null) {
            FeedBackButton feedBackButtonM9382b = C1800b.m9367a().m9382b(this.f11823r);
            if (C1800b.m9367a().m9384b() && z && feedBackButtonM9382b != null) {
                ViewGroup viewGroup = (ViewGroup) feedBackButtonM9382b.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(feedBackButtonM9382b);
                }
                feedBackButtonM9382b.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) feedBackButtonM9382b.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(C1800b.f10956a, C1800b.f10957b);
                }
                layoutParams.addRule(12);
                feedBackButtonM9382b.setLayoutParams(layoutParams);
                this.f11812g.addView(feedBackButtonM9382b);
            }
            C1800b.m9367a().m9380a(this.f11823r, new InterfaceC1798a() { // from class: com.anythink.expressad.mbbanner.a.d.c.3
                public AnonymousClass3() {
                }

                @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
                /* JADX INFO: renamed from: a */
                public final void mo5503a() {
                    String string;
                    C1917c.this.f11812g.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C1175n.m2059a().m2148f() != null) {
                            jSONObject.put("status", 1);
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        String unused = C1917c.f11802c;
                        th.getMessage();
                        string = "";
                    }
                    String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
                    C1469j.m5701a();
                    C1469j.m5703a((WebView) C1917c.this.f11814i, AbsFeedBackForH5.f6738a, strEncodeToString);
                }

                @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
                /* JADX INFO: renamed from: b */
                public final void mo5504b() {
                    String string;
                    C1917c.this.f11812g.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C1175n.m2059a().m2148f() != null) {
                            jSONObject.put("status", 2);
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        String unused = C1917c.f11802c;
                        th.getMessage();
                        string = "";
                    }
                    String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
                    C1469j.m5701a();
                    C1469j.m5703a((WebView) C1917c.this.f11814i, AbsFeedBackForH5.f6738a, strEncodeToString);
                }

                @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
                /* JADX INFO: renamed from: c */
                public final void mo5505c() {
                    String string;
                    C1917c.this.f11812g.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C1175n.m2059a().m2148f() != null) {
                            jSONObject.put("status", 2);
                        }
                        string = jSONObject.toString();
                    } catch (Throwable th) {
                        String unused = C1917c.f11802c;
                        th.getMessage();
                        string = "";
                    }
                    String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
                    C1469j.m5701a();
                    C1469j.m5703a((WebView) C1917c.this.f11814i, AbsFeedBackForH5.f6738a, strEncodeToString);
                }
            });
            this.f11811f.m8891l(this.f11823r);
            C1800b.m9367a().m9379a(this.f11823r, this.f11811f);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m10018d() throws Throwable {
        String strM10001a = m10001a(this.f11811f);
        if (TextUtils.isEmpty(strM10001a)) {
            return false;
        }
        if (this.f11812g == null) {
            m10004a(C1899a.f11704i);
            return true;
        }
        if (this.f11814i == null) {
            ATBannerWebView aTBannerWebView = new ATBannerWebView(C1175n.m2059a().m2148f());
            this.f11814i = aTBannerWebView;
            aTBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f11814i.setWebViewClient(new C1921a(this.f11823r, this.f11825t, this.f11805C));
        }
        ImageView imageView = this.f11813h;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.f11814i.getVisibility() != 0) {
            this.f11814i.setVisibility(0);
        }
        if (this.f11814i.getParent() == null) {
            this.f11812g.addView(this.f11814i);
            m10017d(this.f11811f.m8800H());
        }
        m10033l();
        C1902c c1902c = new C1902c(this.f11812g.getContext(), this.f11824s, this.f11823r);
        this.f11828w = c1902c;
        c1902c.m9914a(this.f11825t);
        this.f11828w.m9913a(this.f11805C);
        this.f11828w.m9912a(this.f11826u);
        this.f11814i.setWebViewListener(this.f11806D);
        this.f11814i.setObject(this.f11828w);
        if (strM10001a.startsWith("file")) {
            this.f11814i.loadUrl(strM10001a);
            return true;
        }
        this.f11814i.loadDataWithBaseURL(this.f11811f.m8901p(), strM10001a, "text/html", "utf-8", null);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: e */
    public void m10019e() {
        if (this.f11812g == null) {
            m10004a(C1899a.f11704i);
            return;
        }
        ATBannerWebView aTBannerWebView = this.f11814i;
        if (aTBannerWebView != null && aTBannerWebView.getParent() != null) {
            this.f11812g.removeView(this.f11814i);
        }
        if (this.f11813h == null) {
            ImageView imageView = new ImageView(C1175n.m2059a().m2148f());
            this.f11813h = imageView;
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.7
                public AnonymousClass7() {
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    C1917c.this.f11831z = motionEvent.getRawX();
                    C1917c.this.f11803A = motionEvent.getRawY();
                    String unused = C1917c.f11802c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C1917c.this.f11831z);
                    sb.append("  ");
                    sb.append(C1917c.this.f11803A);
                    return false;
                }
            });
            this.f11813h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.mbbanner.a.d.c.8
                public AnonymousClass8() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1917c.this.m10043a(C1919b.m10066a(CommonJSBridgeImpUtils.buildClickJsonObject(C1917c.this.f11831z, C1917c.this.f11803A), C1917c.this.f11811f), false, "");
                }
            });
        }
        String strM10151be = this.f11811f.m10151be();
        if (TextUtils.isEmpty(strM10151be)) {
            m10004a(C1899a.f11703h);
        } else {
            C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(strM10151be, new InterfaceC1819c() { // from class: com.anythink.expressad.mbbanner.a.d.c.9
                public AnonymousClass9() {
                }

                @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                /* JADX INFO: renamed from: a */
                public final void mo5462a(Bitmap bitmap, String str) {
                    if (C1917c.this.f11813h != null) {
                        C1917c.this.f11813h.setImageBitmap(bitmap);
                    }
                    C1917c.m10034l(C1917c.this);
                    C1917c.m10036m(C1917c.this);
                    C1917c.this.m10033l();
                    C1917c.this.m10026h();
                }

                @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                /* JADX INFO: renamed from: a */
                public final void mo5463a(String str, String str2) {
                    C1917c.this.m10004a(C1899a.f11705j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    private void m10021f() {
        if (this.f11810e && this.f11815j == null) {
            ImageView imageView = new ImageView(C1175n.m2059a().m2148f());
            this.f11815j = imageView;
            imageView.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_banner_close", C1875i.f11528c));
            this.f11815j.setVisibility(8);
            this.f11815j.setContentDescription("closeButton");
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m10024g() {
        TemplateBannerView templateBannerView = this.f11812g;
        return (templateBannerView == null || C1891y.m9874a(templateBannerView) || this.f11821p) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public void m10026h() {
        TemplateBannerView templateBannerView;
        if (this.f11818m && !this.f11819n && this.f11809d != null) {
            this.f11819n = true;
            this.f11829x.removeCallbacks(this.f11830y);
            C1781c c1781c = this.f11811f;
            if (c1781c != null && !c1781c.m8844am()) {
                this.f11811f.m8845an();
                this.f11809d.mo9967a(this.f11825t);
            }
        }
        if (this.f11818m && this.f11816k && this.f11817l && this.f11819n && this.f11811f != null && !m10028i()) {
            TemplateBannerView templateBannerView2 = this.f11812g;
            boolean z = (templateBannerView2 == null || C1891y.m9874a(templateBannerView2) || this.f11821p) ? false : true;
            if (!z && (templateBannerView = this.f11812g) != null) {
                templateBannerView.postDelayed(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.d.c.10
                    public AnonymousClass10() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1917c.this.m10026h();
                    }
                }, 1000L);
            }
            if (this.f11820o && z) {
                int[] iArr = new int[2];
                this.f11812g.getLocationInWindow(iArr);
                C1900a.m9894a(this.f11814i, iArr[0], iArr[1]);
                C1900a.m9896a(this.f11814i, iArr[0], iArr[1], this.f11812g.getWidth(), this.f11812g.getHeight());
                this.f11820o = false;
                if (!TextUtils.isEmpty(this.f11811f.m10151be())) {
                    C1818b.m9427a(C1175n.m2059a().m2148f()).m9445c(this.f11811f.m10151be());
                }
            }
            new StringBuilder("showSuccessed:").append(this.f11811f.m10146aZ());
            if (!z) {
                this.f11811f.m8865c(false);
                return;
            }
            ImageView imageView = this.f11813h;
            if (imageView == null || imageView.getVisibility() != 0) {
                List<C1781c> list = this.f11825t;
                if (list != null && list.size() > 0) {
                    boolean z3 = false;
                    int i = 0;
                    for (int i2 = 0; i2 < this.f11825t.size(); i2++) {
                        if (!this.f11825t.get(i2).m8908s() && (i2 == 0 || !this.f11825t.get(i2).m8814V())) {
                            m10014c(this.f11825t.get(i2), C1175n.m2059a().m2148f(), this.f11823r);
                            this.f11825t.get(i2).m8865c(true);
                            C1807f.m9397a(this.f11823r, this.f11825t.get(i2), C1807f.f11181e);
                            i = i2;
                            z3 = true;
                        }
                    }
                    if (z3) {
                        m10011b(this.f11825t.get(i), C1175n.m2059a().m2148f(), this.f11823r);
                        m10002a(this.f11825t.get(i), C1175n.m2059a().m2148f(), this.f11823r);
                    }
                }
            } else {
                C1781c c1781c2 = this.f11811f;
                if (c1781c2 != null) {
                    if (c1781c2 != null) {
                        m10014c(c1781c2, C1175n.m2059a().m2148f(), this.f11823r);
                        m10011b(c1781c2, C1175n.m2059a().m2148f(), this.f11823r);
                        m10002a(c1781c2, C1175n.m2059a().m2148f(), this.f11823r);
                    }
                    this.f11811f.m8865c(true);
                    C1807f.m9397a(this.f11823r, this.f11811f, C1807f.f11181e);
                }
            }
            this.f11822q = true;
            InterfaceC1910c interfaceC1910c = this.f11809d;
            if (interfaceC1910c != null) {
                interfaceC1910c.mo9965a(this.f11811f, false);
            }
            this.f11829x.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    /* JADX INFO: renamed from: i */
    private synchronized boolean m10028i() {
        boolean zM8814V;
        zM8814V = this.f11811f.m8814V();
        if (!zM8814V) {
            this.f11811f.m8865c(true);
        }
        return zM8814V;
    }

    /* JADX INFO: renamed from: j */
    private void m10030j() {
        InterfaceC1910c interfaceC1910c = this.f11809d;
        if (interfaceC1910c != null) {
            interfaceC1910c.mo9971d();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m10032k() {
        if (this.f11813h != null) {
            ATBannerWebView aTBannerWebView = this.f11814i;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (this.f11813h.getVisibility() != 0) {
                this.f11813h.setVisibility(0);
            }
            if (this.f11812g != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.f11813h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f11813h.getParent() == null) {
                    this.f11812g.addView(this.f11813h, layoutParams);
                }
                m10017d(true);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m10033l() {
        ImageView imageView;
        if (!this.f11810e || (imageView = this.f11815j) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f11815j.setVisibility(0);
            this.f11815j.setOnClickListener(this.f11804B);
        }
        if (this.f11815j.getParent() != null || this.f11812g == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C1886t.m9834b(C1175n.m2059a().m2148f(), 12.0f), C1886t.m9834b(C1175n.m2059a().m2148f(), 12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f11812g.addView(this.f11815j, layoutParams);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m10034l(C1917c c1917c) {
        c1917c.f11818m = true;
        return true;
    }

    /* JADX INFO: renamed from: m */
    private void m10035m() {
        ImageView imageView;
        if (this.f11810e && (imageView = this.f11815j) != null && imageView.getVisibility() == 0) {
            this.f11815j.setVisibility(8);
            this.f11815j.setOnClickListener(null);
            if (this.f11812g == null || this.f11815j.getParent() == null) {
                return;
            }
            this.f11812g.removeView(this.f11815j);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m10036m(C1917c c1917c) {
        if (c1917c.f11813h != null) {
            ATBannerWebView aTBannerWebView = c1917c.f11814i;
            if (aTBannerWebView != null) {
                aTBannerWebView.setVisibility(8);
            }
            if (c1917c.f11813h.getVisibility() != 0) {
                c1917c.f11813h.setVisibility(0);
            }
            if (c1917c.f11812g != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                c1917c.f11813h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (c1917c.f11813h.getParent() == null) {
                    c1917c.f11812g.addView(c1917c.f11813h, layoutParams);
                }
                c1917c.m10017d(true);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m10037n() {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m10038n(C1917c c1917c) {
        c1917c.f11820o = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m10041a() {
        if (this.f11809d != null) {
            this.f11809d = null;
        }
        ATBannerWebView aTBannerWebView = this.f11814i;
        if (aTBannerWebView != null) {
            aTBannerWebView.setWebViewListener(null);
        }
        if (this.f11806D != null) {
            this.f11806D = null;
        }
        ImageView imageView = this.f11815j;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f11813h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        TemplateBannerView templateBannerView = this.f11812g;
        if (templateBannerView != null) {
            templateBannerView.removeAllViews();
        }
        ATBannerWebView aTBannerWebView2 = this.f11814i;
        if (aTBannerWebView2 != null) {
            aTBannerWebView2.release();
        }
        C1902c c1902c = this.f11828w;
        if (c1902c != null) {
            c1902c.m9911a();
        }
        if (this.f11805C != null) {
            this.f11805C = null;
        }
        C1800b.m9367a().m9385c(this.f11823r);
    }

    /* JADX INFO: renamed from: a */
    public final void m10042a(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        try {
            CallMraidJS.getInstance().fireSizeChangeEvent(this.f11814i, i, i2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10043a(C1781c c1781c, boolean z, String str) {
        if (this.f11822q) {
            if (this.f11807a == null) {
                this.f11807a = new C1405a(C1175n.m2059a().m2148f(), this.f11823r);
            }
            this.f11807a.m5212a(new C1941p.e() { // from class: com.anythink.expressad.mbbanner.a.d.c.11
                public AnonymousClass11() {
                }

                @Override // com.anythink.expressad.out.C1941p.c
                /* JADX INFO: renamed from: a */
                public final void mo10050a(C1781c c1781c2, String str2) {
                }

                @Override // com.anythink.expressad.out.C1941p.c
                /* JADX INFO: renamed from: a */
                public final void mo10051a(C1935j c1935j) {
                }

                @Override // com.anythink.expressad.out.C1941p.c
                /* JADX INFO: renamed from: a */
                public final void mo10052a(C1935j c1935j, String str2) {
                }

                @Override // com.anythink.expressad.out.C1941p.c
                /* JADX INFO: renamed from: a */
                public final boolean mo10053a() {
                    return false;
                }

                @Override // com.anythink.expressad.out.C1941p.c
                /* JADX INFO: renamed from: b */
                public final void mo10054b() {
                }

                @Override // com.anythink.expressad.out.C1941p.c
                /* JADX INFO: renamed from: b */
                public final void mo10055b(C1935j c1935j) {
                }

                @Override // com.anythink.expressad.out.C1941p.c
                /* JADX INFO: renamed from: b */
                public final void mo10056b(C1935j c1935j, String str2) {
                }

                @Override // com.anythink.expressad.out.C1941p.e
                /* JADX INFO: renamed from: c */
                public final void mo10057c() {
                    if (C1917c.this.f11809d != null) {
                        C1917c.this.f11809d.mo9963a();
                    }
                }

                @Override // com.anythink.expressad.out.C1941p.c
                /* JADX INFO: renamed from: c */
                public final void mo10058c(C1935j c1935j) {
                }

                @Override // com.anythink.expressad.out.C1941p.c
                /* JADX INFO: renamed from: d */
                public final void mo10059d(C1935j c1935j) {
                }
            });
            c1781c.m8891l(this.f11823r);
            if (!this.f11811f.m8815W()) {
                this.f11811f.m8816X();
            }
            InterfaceC1910c interfaceC1910c = this.f11809d;
            if (interfaceC1910c != null) {
                interfaceC1910c.mo9964a(c1781c);
            }
            if (z) {
                TextUtils.isEmpty(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0018  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10044a(com.anythink.expressad.foundation.p116d.C1782d r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.mbbanner.p139a.p143d.C1917c.m10044a(com.anythink.expressad.foundation.d.d):void");
    }

    /* JADX INFO: renamed from: a */
    public final void m10045a(C1934i c1934i) {
        this.f11808b = c1934i;
    }

    /* JADX INFO: renamed from: a */
    public final void m10046a(boolean z) {
        this.f11810e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m10047a(boolean z, int i) {
        this.f11826u = i;
        if (i == 0) {
            C1486b.m6002a();
            C1489c c1489cM6011c = C1486b.m6011c(C1773a.m8548c().m8558f(), this.f11823r);
            if (c1489cM6011c == null) {
                return;
            } else {
                z = c1489cM6011c.m6097d() == 1;
            }
        }
        this.f11810e = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m10048b(boolean z) {
        this.f11816k = z;
        m10026h();
    }

    /* JADX INFO: renamed from: c */
    public final void m10049c(boolean z) {
        this.f11817l = z;
        m10026h();
    }
}
