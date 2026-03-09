package com.anythink.expressad.splash.p151c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.p066o.p067a.C1332f;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.p073a.p074a.C1406a;
import com.anythink.expressad.splash.p152d.C1991d;
import com.anythink.expressad.splash.p152d.InterfaceC1988a;
import com.anythink.expressad.splash.p153js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.p153js.SplashJsUtils;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;
import com.anythink.expressad.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.splash.c.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1986d {

    /* JADX INFO: renamed from: d */
    private C1781c f12571d;

    /* JADX INFO: renamed from: e */
    private ATSplashView f12572e;

    /* JADX INFO: renamed from: f */
    private C1991d f12573f;

    /* JADX INFO: renamed from: g */
    private C1405a f12574g;

    /* JADX INFO: renamed from: h */
    private boolean f12575h;

    /* JADX INFO: renamed from: i */
    private TextView f12576i;

    /* JADX INFO: renamed from: j */
    private View f12577j;

    /* JADX INFO: renamed from: k */
    private String f12578k;

    /* JADX INFO: renamed from: l */
    private String f12579l;

    /* JADX INFO: renamed from: n */
    private String f12581n;

    /* JADX INFO: renamed from: o */
    private String f12582o;

    /* JADX INFO: renamed from: p */
    private String f12583p;

    /* JADX INFO: renamed from: q */
    private String f12584q;

    /* JADX INFO: renamed from: r */
    private boolean f12585r;

    /* JADX INFO: renamed from: s */
    private boolean f12586s;

    /* JADX INFO: renamed from: u */
    private Context f12588u;

    /* JADX INFO: renamed from: c */
    private String f12570c = "SplashShowManager";

    /* JADX INFO: renamed from: m */
    private int f12580m = 5;

    /* JADX INFO: renamed from: t */
    private boolean f12587t = false;

    /* JADX INFO: renamed from: v */
    private View.OnClickListener f12589v = new View.OnClickListener() { // from class: com.anythink.expressad.splash.c.d.1
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (C1986d.this.f12575h) {
                C1986d.m10611a(C1986d.this, 1);
                C1986d.m10621b(C1986d.this, -1);
            }
        }
    };

    /* JADX INFO: renamed from: w */
    private C1332f.b f12590w = new C1332f.b();

    /* JADX INFO: renamed from: a */
    public Handler f12568a = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.splash.c.d.2
        public AnonymousClass2(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i != 1) {
                if (i == 2 && C1986d.this.f12571d != null && C1986d.this.f12571d.m8856ay() && C1986d.this.f12572e != null) {
                    C1986d.this.f12572e.getSplashWebview();
                    return;
                }
                return;
            }
            if (C1986d.this.f12587t) {
                return;
            }
            if (C1986d.this.f12572e == null || !C1360x.m4269a(C1986d.this.f12572e, C1986d.this.f12590w)) {
                C1986d.this.f12568a.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
            } else {
                if (C1986d.this.f12580m <= 0) {
                    C1986d.m10611a(C1986d.this, 2);
                    return;
                }
                C1986d.m10631f(C1986d.this);
                C1986d c1986d = C1986d.this;
                C1986d.m10621b(c1986d, c1986d.f12580m);
                C1986d.this.f12568a.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
            }
        }
    };

    /* JADX INFO: renamed from: x */
    private InterfaceC1988a f12591x = new InterfaceC1988a() { // from class: com.anythink.expressad.splash.c.d.3
        public AnonymousClass3() {
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10653a() {
            C1986d.m10611a(C1986d.this, 1);
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10654a(int i) {
            if (C1986d.this.f12572e != null) {
                C1986d.this.f12572e.changeCloseBtnState(i);
            }
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10655a(int i, int i2) {
            if (i == 1) {
                C1986d.this.f12568a.removeMessages(1);
            }
            if (i == 2) {
                C1986d.this.f12580m = i2;
                C1986d.this.f12568a.removeMessages(1);
                C1986d.this.f12568a.sendEmptyMessageDelayed(1, 1000L);
            }
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10656a(C1781c c1781c) {
            C1986d.this.m10645a(c1781c);
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10657a(String str) {
            C1986d.m10612a(C1986d.this, str);
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10658a(boolean z) {
            if (z) {
                C1986d.this.f12568a.removeMessages(1);
            }
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: b */
        public final void mo10659b() {
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: b */
        public final void mo10660b(int i) {
            String unused = C1986d.this.f12570c;
            C1986d.this.f12580m = i;
            C1986d.this.f12568a.removeMessages(1);
            C1986d.this.f12568a.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: b */
        public final void mo10661b(String str) {
            try {
                if (C1986d.this.f12573f != null) {
                    if (TextUtils.isEmpty(str)) {
                        C1986d.this.f12573f.mo10543a(C1986d.this.f12571d);
                        return;
                    }
                    C1781c c1781cM8703b = C1781c.m8703b(C1781c.m8671a(C1986d.this.f12571d));
                    c1781cM8703b.m8902p(str);
                    C1986d.this.m10645a(c1781cM8703b);
                }
            } catch (Exception e) {
                String unused = C1986d.this.f12570c;
                e.getMessage();
            }
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: c */
        public final void mo10662c() {
            C1986d.m10611a(C1986d.this, 1);
        }
    };

    /* JADX INFO: renamed from: b */
    public Rect f12569b = new Rect();

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.d$1 */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (C1986d.this.f12575h) {
                C1986d.m10611a(C1986d.this, 1);
                C1986d.m10621b(C1986d.this, -1);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.d$2 */
    public class AnonymousClass2 extends Handler {
        public AnonymousClass2(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i != 1) {
                if (i == 2 && C1986d.this.f12571d != null && C1986d.this.f12571d.m8856ay() && C1986d.this.f12572e != null) {
                    C1986d.this.f12572e.getSplashWebview();
                    return;
                }
                return;
            }
            if (C1986d.this.f12587t) {
                return;
            }
            if (C1986d.this.f12572e == null || !C1360x.m4269a(C1986d.this.f12572e, C1986d.this.f12590w)) {
                C1986d.this.f12568a.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
            } else {
                if (C1986d.this.f12580m <= 0) {
                    C1986d.m10611a(C1986d.this, 2);
                    return;
                }
                C1986d.m10631f(C1986d.this);
                C1986d c1986d = C1986d.this;
                C1986d.m10621b(c1986d, c1986d.f12580m);
                C1986d.this.f12568a.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.d$3 */
    public class AnonymousClass3 implements InterfaceC1988a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10653a() {
            C1986d.m10611a(C1986d.this, 1);
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10654a(int i) {
            if (C1986d.this.f12572e != null) {
                C1986d.this.f12572e.changeCloseBtnState(i);
            }
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10655a(int i, int i2) {
            if (i == 1) {
                C1986d.this.f12568a.removeMessages(1);
            }
            if (i == 2) {
                C1986d.this.f12580m = i2;
                C1986d.this.f12568a.removeMessages(1);
                C1986d.this.f12568a.sendEmptyMessageDelayed(1, 1000L);
            }
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10656a(C1781c c1781c) {
            C1986d.this.m10645a(c1781c);
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10657a(String str) {
            C1986d.m10612a(C1986d.this, str);
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: a */
        public final void mo10658a(boolean z) {
            if (z) {
                C1986d.this.f12568a.removeMessages(1);
            }
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: b */
        public final void mo10659b() {
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: b */
        public final void mo10660b(int i) {
            String unused = C1986d.this.f12570c;
            C1986d.this.f12580m = i;
            C1986d.this.f12568a.removeMessages(1);
            C1986d.this.f12568a.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: b */
        public final void mo10661b(String str) {
            try {
                if (C1986d.this.f12573f != null) {
                    if (TextUtils.isEmpty(str)) {
                        C1986d.this.f12573f.mo10543a(C1986d.this.f12571d);
                        return;
                    }
                    C1781c c1781cM8703b = C1781c.m8703b(C1781c.m8671a(C1986d.this.f12571d));
                    c1781cM8703b.m8902p(str);
                    C1986d.this.m10645a(c1781cM8703b);
                }
            } catch (Exception e) {
                String unused = C1986d.this.f12570c;
                e.getMessage();
            }
        }

        @Override // com.anythink.expressad.splash.p152d.InterfaceC1988a
        /* JADX INFO: renamed from: c */
        public final void mo10662c() {
            C1986d.m10611a(C1986d.this, 1);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.d$4 */
    public class AnonymousClass4 implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: com.anythink.expressad.splash.c.d$4$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1986d c1986d = C1986d.this;
                if (C1986d.m10616a(c1986d, c1986d.f12572e)) {
                    C1986d.this.m10634g();
                }
            }
        }

        public AnonymousClass4() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            C1175n.m2059a().m2118a(new Runnable() { // from class: com.anythink.expressad.splash.c.d.4.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1986d c1986d = C1986d.this;
                    if (C1986d.m10616a(c1986d, c1986d.f12572e)) {
                        C1986d.this.m10634g();
                    }
                }
            }, 30L);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            C1986d.this.m10650c();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.d$5 */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1986d c1986d = C1986d.this;
            if (C1986d.m10616a(c1986d, c1986d.f12572e)) {
                C1986d.this.m10634g();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.d$6 */
    public class AnonymousClass6 implements InterfaceC1798a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: a */
        public final void mo5503a() {
            String string;
            C1986d.this.m10652e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = C1986d.this.f12570c;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) C1986d.this.f12572e.getSplashWebview(), AbsFeedBackForH5.f6738a, strEncodeToString);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: b */
        public final void mo5504b() {
            String string;
            C1986d.this.m10651d();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = C1986d.this.f12570c;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) C1986d.this.f12572e.getSplashWebview(), AbsFeedBackForH5.f6738a, strEncodeToString);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: c */
        public final void mo5505c() {
            String string;
            C1986d.this.m10651d();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = C1986d.this.f12570c;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) C1986d.this.f12572e.getSplashWebview(), AbsFeedBackForH5.f6738a, strEncodeToString);
        }
    }

    public C1986d(Context context, String str, String str2) {
        this.f12581n = "";
        this.f12582o = "";
        this.f12583p = "";
        this.f12584q = "";
        this.f12578k = str2;
        this.f12579l = str;
        this.f12588u = context;
        int iM9684a = C1875i.m9684a(context.getApplicationContext(), "anythink_splash_count_time_can_skip", C1875i.f11532g);
        int iM9684a2 = C1875i.m9684a(this.f12588u.getApplicationContext(), "anythink_splash_count_time_can_skip_not", C1875i.f11532g);
        int iM9684a3 = C1875i.m9684a(this.f12588u.getApplicationContext(), "anythink_splash_count_time_can_skip_s", C1875i.f11532g);
        this.f12582o = this.f12588u.getResources().getString(iM9684a);
        this.f12584q = this.f12588u.getResources().getString(iM9684a2);
        this.f12583p = this.f12588u.getResources().getString(iM9684a3);
        if (this.f12576i == null) {
            TextView textView = new TextView(context);
            this.f12576i = textView;
            textView.setGravity(1);
            this.f12576i.setTextIsSelectable(false);
            this.f12576i.setPadding(C1886t.m9834b(context, 5.0f), C1886t.m9834b(context, 5.0f), C1886t.m9834b(context, 5.0f), C1886t.m9834b(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12576i.getLayoutParams();
            this.f12576i.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(C1886t.m9834b(context, 100.0f), C1886t.m9834b(context, 50.0f)) : layoutParams);
            Context contextM2148f = C1175n.m2059a().m2148f();
            if (contextM2148f != null) {
                int iM9684a4 = C1875i.m9684a(contextM2148f, "anythink_splash_count_time_can_skip", C1875i.f11532g);
                int iM9684a5 = C1875i.m9684a(contextM2148f, "anythink_splash_count_time_can_skip_not", C1875i.f11532g);
                int iM9684a6 = C1875i.m9684a(contextM2148f, "anythink_splash_count_time_can_skip_s", C1875i.f11532g);
                this.f12582o = contextM2148f.getResources().getString(iM9684a4);
                String string = contextM2148f.getResources().getString(iM9684a5);
                this.f12584q = string;
                this.f12581n = string;
                this.f12583p = contextM2148f.getResources().getString(iM9684a6);
                this.f12576i.setBackgroundResource(C1875i.m9684a(contextM2148f, "anythink_splash_close_bg", C1875i.f11528c));
                this.f12576i.setTextColor(contextM2148f.getResources().getColor(C1875i.m9684a(contextM2148f, "anythink_splash_count_time_skip_text_color", C1875i.f11529d)));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m10610a(C1781c c1781c, Context context, String str) {
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
    public static /* synthetic */ void m10611a(C1986d c1986d, int i) {
        if (c1986d.f12587t) {
            return;
        }
        try {
            c1986d.f12587t = true;
            C1991d c1991d = c1986d.f12573f;
            if (c1991d != null) {
                c1991d.mo10542a(i);
                c1986d.f12573f = null;
            }
            c1986d.f12586s = false;
            ATSplashView aTSplashView = c1986d.f12572e;
            if (aTSplashView != null) {
                aTSplashView.getSplashWebview();
            }
            Handler handler = c1986d.f12568a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10612a(C1986d c1986d, String str) {
        C1991d c1991d = c1986d.f12573f;
        if (c1991d != null) {
            c1991d.mo10544a("web show failed:".concat(String.valueOf(str)));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10613a(String str) {
        C1991d c1991d = this.f12573f;
        if (c1991d != null) {
            c1991d.mo10544a("web show failed:".concat(String.valueOf(str)));
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m10614a(View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(this.f12569b) && ((long) this.f12569b.height()) * ((long) this.f12569b.width()) > 0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m10616a(C1986d c1986d, View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(c1986d.f12569b) && ((long) c1986d.f12569b.height()) * ((long) c1986d.f12569b.width()) > 0;
    }

    /* JADX INFO: renamed from: b */
    private void m10617b(int i) {
        ATSplashView aTSplashView = this.f12572e;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i);
            if (this.f12572e.getSplashJSBridgeImpl() != null) {
                this.f12572e.getSplashJSBridgeImpl().updateCountDown(i);
            }
        }
        if (i < 0) {
            this.f12580m = i;
        } else if (this.f12577j == null) {
            m10638i();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10618b(View view) {
        if (view != null) {
            view.setOnClickListener(this.f12589v);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10619b(C1781c c1781c) {
        boolean z = true;
        if (c1781c.m8908s()) {
            z = false;
        } else {
            m10627c(c1781c, C1175n.m2059a().m2148f(), this.f12578k);
            c1781c.m8865c(true);
            C1807f.m9397a(this.f12578k, c1781c, C1807f.f11182f);
        }
        if (z) {
            m10620b(c1781c, C1175n.m2059a().m2148f(), this.f12578k);
            m10610a(c1781c, C1175n.m2059a().m2148f(), this.f12578k);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m10620b(C1781c c1781c, Context context, String str) {
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
    public static /* synthetic */ void m10621b(C1986d c1986d, int i) {
        ATSplashView aTSplashView = c1986d.f12572e;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i);
            if (c1986d.f12572e.getSplashJSBridgeImpl() != null) {
                c1986d.f12572e.getSplashJSBridgeImpl().updateCountDown(i);
            }
        }
        if (i < 0) {
            c1986d.f12580m = i;
        } else if (c1986d.f12577j == null) {
            c1986d.m10638i();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m10625c(int i) {
        if (this.f12587t) {
            return;
        }
        try {
            this.f12587t = true;
            C1991d c1991d = this.f12573f;
            if (c1991d != null) {
                c1991d.mo10542a(i);
                this.f12573f = null;
            }
            this.f12586s = false;
            ATSplashView aTSplashView = this.f12572e;
            if (aTSplashView != null) {
                aTSplashView.getSplashWebview();
            }
            Handler handler = this.f12568a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m10626c(C1781c c1781c) {
        m10620b(c1781c, C1175n.m2059a().m2148f(), this.f12578k);
        m10627c(c1781c, C1175n.m2059a().m2148f(), this.f12578k);
        m10610a(c1781c, C1175n.m2059a().m2148f(), this.f12578k);
        c1781c.m8865c(true);
        C1807f.m9397a(this.f12578k, c1781c, C1807f.f11182f);
    }

    /* JADX INFO: renamed from: c */
    private static void m10627c(C1781c c1781c, Context context, String str) {
        C1773a.m8548c().m8553b(context);
        if (!TextUtils.isEmpty(c1781c.m8838ag())) {
            C1405a.m5186a(context, c1781c, str, c1781c.m8838ag(), false, true, C1406a.f6269i);
        }
        if (TextUtils.isEmpty(str) || c1781c.m8804L() == null || c1781c.m8804L().m9205o() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, str, c1781c.m8804L().m9205o(), false);
    }

    /* JADX INFO: renamed from: d */
    private void m10629d(C1781c c1781c) {
        C1991d c1991d = this.f12573f;
        if (c1991d != null) {
            c1991d.mo10543a(c1781c);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m10631f(C1986d c1986d) {
        int i = c1986d.f12580m;
        c1986d.f12580m = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: f */
    private void m10632f() {
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (contextM2148f != null) {
            int iM9684a = C1875i.m9684a(contextM2148f, "anythink_splash_count_time_can_skip", C1875i.f11532g);
            int iM9684a2 = C1875i.m9684a(contextM2148f, "anythink_splash_count_time_can_skip_not", C1875i.f11532g);
            int iM9684a3 = C1875i.m9684a(contextM2148f, "anythink_splash_count_time_can_skip_s", C1875i.f11532g);
            this.f12582o = contextM2148f.getResources().getString(iM9684a);
            String string = contextM2148f.getResources().getString(iM9684a2);
            this.f12584q = string;
            this.f12581n = string;
            this.f12583p = contextM2148f.getResources().getString(iM9684a3);
            this.f12576i.setBackgroundResource(C1875i.m9684a(contextM2148f, "anythink_splash_close_bg", C1875i.f11528c));
            this.f12576i.setTextColor(contextM2148f.getResources().getColor(C1875i.m9684a(contextM2148f, "anythink_splash_count_time_skip_text_color", C1875i.f11529d)));
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m10634g() {
        if (this.f12571d != null && !this.f12586s) {
            boolean z = true;
            this.f12586s = true;
            if (this.f12573f != null && this.f12572e != null) {
                Context context = this.f12588u;
                if (context != null && (context instanceof Activity) && ((Activity) context).isFinishing()) {
                    this.f12573f.mo10544a("Activity is finishing");
                    return;
                }
                this.f12573f.mo10541a();
            }
            if (!this.f12571d.m8814V()) {
                if (!this.f12572e.isDynamicView()) {
                    C1781c c1781c = this.f12571d;
                    if (c1781c.m8908s()) {
                        z = false;
                    } else {
                        m10627c(c1781c, C1175n.m2059a().m2148f(), this.f12578k);
                        c1781c.m8865c(true);
                        C1807f.m9397a(this.f12578k, c1781c, C1807f.f11182f);
                    }
                    if (z) {
                        m10620b(c1781c, C1175n.m2059a().m2148f(), this.f12578k);
                        m10610a(c1781c, C1175n.m2059a().m2148f(), this.f12578k);
                    }
                    return;
                }
                C1781c c1781c2 = this.f12571d;
                m10620b(c1781c2, C1175n.m2059a().m2148f(), this.f12578k);
                m10627c(c1781c2, C1175n.m2059a().m2148f(), this.f12578k);
                m10610a(c1781c2, C1175n.m2059a().m2148f(), this.f12578k);
                c1781c2.m8865c(true);
                C1807f.m9397a(this.f12578k, c1781c2, C1807f.f11182f);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m10636h() {
        if (C1800b.m9367a().m9384b() && !this.f12572e.isDynamicView()) {
            C1800b.m9367a().m9380a(this.f12578k, new AnonymousClass6());
            FeedBackButton feedBackButtonM9382b = C1800b.m9367a().m9382b(this.f12578k);
            if (feedBackButtonM9382b != null) {
                RelativeLayout.LayoutParams layoutParams = null;
                try {
                    layoutParams = (RelativeLayout.LayoutParams) feedBackButtonM9382b.getLayoutParams();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(C1800b.f10956a, C1800b.f10957b);
                }
                layoutParams.topMargin = C1886t.m9834b(C1175n.m2059a().m2148f(), 10.0f);
                layoutParams.leftMargin = C1886t.m9834b(C1175n.m2059a().m2148f(), 10.0f);
                ViewGroup viewGroup = (ViewGroup) feedBackButtonM9382b.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(feedBackButtonM9382b);
                }
                this.f12572e.addView(feedBackButtonM9382b, layoutParams);
            }
            this.f12571d.m8891l(this.f12578k);
            C1800b.m9367a().m9379a(this.f12578k, this.f12571d);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m10638i() {
        StringBuilder sb;
        String str;
        if (this.f12575h) {
            sb = new StringBuilder();
            sb.append(this.f12582o);
            sb.append(this.f12580m);
            str = this.f12583p;
        } else {
            sb = new StringBuilder();
            sb.append(this.f12580m);
            str = this.f12584q;
        }
        sb.append(str);
        this.f12576i.setText(sb.toString());
    }

    /* JADX INFO: renamed from: j */
    private void m10639j() {
        ATSplashWebview splashWebview;
        Handler handler;
        this.f12585r = false;
        if (this.f12580m > 0 && (handler = this.f12568a) != null) {
            handler.removeMessages(1);
            this.f12568a.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.f12572e;
        if (aTSplashView == null || (splashWebview = aTSplashView.getSplashWebview()) == null || splashWebview.isDestroyed()) {
            return;
        }
        SplashJsUtils.sendEventToH5(splashWebview, "onInstallAlertHide", "");
    }

    /* JADX INFO: renamed from: k */
    private void m10641k() {
        ATSplashWebview splashWebview;
        Handler handler;
        this.f12585r = true;
        if (this.f12580m > 0 && (handler = this.f12568a) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.f12572e;
        if (aTSplashView == null || (splashWebview = aTSplashView.getSplashWebview()) == null || splashWebview.isDestroyed()) {
            return;
        }
        SplashJsUtils.sendEventToH5(splashWebview, "onInstallAlertShow", "");
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1988a m10642a() {
        return this.f12591x;
    }

    /* JADX INFO: renamed from: a */
    public final void m10643a(int i) {
        this.f12580m = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m10644a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f12589v);
        }
        this.f12577j = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final void m10645a(C1781c c1781c) {
        if (c1781c != null) {
            try {
                c1781c.m8826aA();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        C1991d c1991d = this.f12573f;
        if (c1991d != null) {
            c1991d.mo10543a(c1781c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10646a(C1781c c1781c, ATSplashView aTSplashView) {
        View view;
        m10648a(this.f12575h);
        this.f12571d = c1781c;
        this.f12572e = aTSplashView;
        SplashJSBridgeImpl splashJSBridgeImpl = aTSplashView.getSplashJSBridgeImpl();
        if (splashJSBridgeImpl == null) {
            splashJSBridgeImpl = new SplashJSBridgeImpl(aTSplashView.getContext(), this.f12579l, this.f12578k);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c1781c);
            splashJSBridgeImpl.setCampaignList(arrayList);
        }
        splashJSBridgeImpl.setCountdownS(this.f12580m);
        splashJSBridgeImpl.setAllowSkip(this.f12575h ? 1 : 0);
        splashJSBridgeImpl.setSplashBridgeListener(this.f12591x);
        aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl);
        boolean zM8908s = c1781c.m8908s();
        View view2 = this.f12577j;
        if (view2 == null) {
            if (zM8908s) {
                this.f12576i.setVisibility(8);
            }
            m10638i();
            m10618b(this.f12576i);
            view = this.f12576i;
        } else {
            if (zM8908s) {
                view2.setVisibility(8);
            }
            m10618b(this.f12577j);
            view = this.f12577j;
        }
        aTSplashView.setCloseView(view);
        aTSplashView.show();
        C1781c c1781c2 = this.f12571d;
        if (c1781c2 != null && c1781c2.m8856ay() && aTSplashView != null) {
            aTSplashView.getSplashWebview();
        }
        aTSplashView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.anythink.expressad.splash.c.d.4

            /* JADX INFO: renamed from: com.anythink.expressad.splash.c.d$4$1 */
            public class AnonymousClass1 implements Runnable {
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1986d c1986d = C1986d.this;
                    if (C1986d.m10616a(c1986d, c1986d.f12572e)) {
                        C1986d.this.m10634g();
                    }
                }
            }

            public AnonymousClass4() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view3) {
                C1175n.m2059a().m2118a(new Runnable() { // from class: com.anythink.expressad.splash.c.d.4.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1986d c1986d = C1986d.this;
                        if (C1986d.m10616a(c1986d, c1986d.f12572e)) {
                            C1986d.this.m10634g();
                        }
                    }
                }, 30L);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view3) {
                C1986d.this.m10650c();
            }
        });
        C1175n.m2059a().m2118a(new Runnable() { // from class: com.anythink.expressad.splash.c.d.5
            public AnonymousClass5() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1986d c1986d = C1986d.this;
                if (C1986d.m10616a(c1986d, c1986d.f12572e)) {
                    C1986d.this.m10634g();
                }
            }
        }, 30L);
        C1984b.m10553a(this.f12571d.m10151be());
        this.f12568a.removeMessages(1);
        this.f12568a.sendEmptyMessageDelayed(1, 1000L);
        this.f12568a.sendEmptyMessageDelayed(2, 1000L);
        if (!C1800b.m9367a().m9384b() || this.f12572e.isDynamicView()) {
            return;
        }
        C1800b.m9367a().m9380a(this.f12578k, new AnonymousClass6());
        FeedBackButton feedBackButtonM9382b = C1800b.m9367a().m9382b(this.f12578k);
        if (feedBackButtonM9382b != null) {
            RelativeLayout.LayoutParams layoutParams = null;
            try {
                layoutParams = (RelativeLayout.LayoutParams) feedBackButtonM9382b.getLayoutParams();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(C1800b.f10956a, C1800b.f10957b);
            }
            layoutParams.topMargin = C1886t.m9834b(C1175n.m2059a().m2148f(), 10.0f);
            layoutParams.leftMargin = C1886t.m9834b(C1175n.m2059a().m2148f(), 10.0f);
            ViewGroup viewGroup = (ViewGroup) feedBackButtonM9382b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(feedBackButtonM9382b);
            }
            this.f12572e.addView(feedBackButtonM9382b, layoutParams);
        }
        this.f12571d.m8891l(this.f12578k);
        C1800b.m9367a().m9379a(this.f12578k, this.f12571d);
    }

    /* JADX INFO: renamed from: a */
    public final void m10647a(C1991d c1991d) {
        this.f12573f = c1991d;
    }

    /* JADX INFO: renamed from: a */
    public final void m10648a(boolean z) {
        this.f12575h = z;
        this.f12581n = z ? this.f12582o : this.f12584q;
    }

    /* JADX INFO: renamed from: b */
    public final String m10649b() {
        C1781c c1781c = this.f12571d;
        return (c1781c == null || c1781c.m8818Z() == null) ? "" : this.f12571d.m8818Z();
    }

    /* JADX INFO: renamed from: c */
    public final void m10650c() {
        Handler handler = this.f12568a;
        if (handler != null) {
            handler.removeMessages(1);
            this.f12568a.removeMessages(2);
        }
        if (this.f12573f != null) {
            this.f12573f = null;
        }
        if (this.f12591x != null) {
            this.f12591x = null;
        }
        if (this.f12589v != null) {
            this.f12589v = null;
        }
        ATSplashView aTSplashView = this.f12572e;
        if (aTSplashView != null) {
            aTSplashView.destroy();
        }
        C1800b.m9367a().m9385c(this.f12578k);
    }

    /* JADX INFO: renamed from: d */
    public final void m10651d() {
        Handler handler;
        if (this.f12585r || C1800b.f10958c) {
            return;
        }
        if (this.f12580m > 0 && (handler = this.f12568a) != null) {
            handler.removeMessages(1);
            this.f12568a.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.f12572e;
        if (aTSplashView != null) {
            aTSplashView.onResume();
            ATSplashWebview splashWebview = this.f12572e.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.f12696b, "");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10652e() {
        Handler handler;
        if (this.f12580m > 0 && (handler = this.f12568a) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.f12572e;
        if (aTSplashView != null) {
            aTSplashView.onPause();
            ATSplashWebview splashWebview = this.f12572e.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.f12695a, "");
        }
    }
}
