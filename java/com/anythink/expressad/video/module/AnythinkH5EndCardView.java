package com.anythink.expressad.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.multidex.MultiDexExtractor;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.video.signal.InterfaceC2307f;
import com.anythink.expressad.video.signal.InterfaceC2311h;
import com.anythink.expressad.video.signal.factory.C2309b;
import com.anythink.expressad.videocommon.p178b.C2324i;
import com.anythink.expressad.widget.FeedBackButton;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkH5EndCardView extends AnythinkBaseView implements IMraidJSBridge, InterfaceC2307f, InterfaceC2311h {

    /* JADX INFO: renamed from: A */
    private static final String f13550A = "anythink_reward_endcard_h5";

    /* JADX INFO: renamed from: B */
    private static final String f13551B = "portrait";

    /* JADX INFO: renamed from: C */
    private static final String f13552C = "landscape";

    /* JADX INFO: renamed from: D */
    private static final int f13553D = 1;

    /* JADX INFO: renamed from: E */
    private static final int f13554E = 2;

    /* JADX INFO: renamed from: F */
    private static final int f13555F = 20;

    /* JADX INFO: renamed from: G */
    private static final int f13556G = 15;

    /* JADX INFO: renamed from: Q */
    private static final int f13557Q = 100;

    /* JADX INFO: renamed from: n */
    public static final String f13558n = "orientation";

    /* JADX INFO: renamed from: o */
    public static final String f13559o = "webviewshow";

    /* JADX INFO: renamed from: H */
    private FeedBackButton f13560H;

    /* JADX INFO: renamed from: I */
    private boolean f13561I;

    /* JADX INFO: renamed from: J */
    private boolean f13562J;

    /* JADX INFO: renamed from: K */
    private int f13563K;

    /* JADX INFO: renamed from: L */
    private int f13564L;

    /* JADX INFO: renamed from: M */
    private boolean f13565M;

    /* JADX INFO: renamed from: N */
    private boolean f13566N;

    /* JADX INFO: renamed from: O */
    private int f13567O;

    /* JADX INFO: renamed from: P */
    private long f13568P;

    /* JADX INFO: renamed from: R */
    private boolean f13569R;

    /* JADX INFO: renamed from: S */
    private boolean f13570S;

    /* JADX INFO: renamed from: T */
    private boolean f13571T;

    /* JADX INFO: renamed from: U */
    private boolean f13572U;

    /* JADX INFO: renamed from: V */
    private boolean f13573V;

    /* JADX INFO: renamed from: W */
    private boolean f13574W;

    /* JADX INFO: renamed from: aa */
    private boolean f13575aa;

    /* JADX INFO: renamed from: ab */
    private boolean f13576ab;

    /* JADX INFO: renamed from: ac */
    private String f13577ac;

    /* JADX INFO: renamed from: ad */
    private C2309b f13578ad;

    /* JADX INFO: renamed from: ae */
    private boolean f13579ae;

    /* JADX INFO: renamed from: af */
    private boolean f13580af;

    /* JADX INFO: renamed from: p */
    public View f13581p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f13582q;

    /* JADX INFO: renamed from: r */
    public ImageView f13583r;

    /* JADX INFO: renamed from: s */
    public WindVaneWebView f13584s;

    /* JADX INFO: renamed from: t */
    public Handler f13585t;

    /* JADX INFO: renamed from: u */
    public String f13586u;

    /* JADX INFO: renamed from: v */
    public boolean f13587v;

    /* JADX INFO: renamed from: w */
    public boolean f13588w;

    /* JADX INFO: renamed from: x */
    public String f13589x;

    /* JADX INFO: renamed from: y */
    public Handler f13590y;

    /* JADX INFO: renamed from: z */
    public boolean f13591z;

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$1 */
    public class HandlerC21241 extends Handler {
        public HandlerC21241(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            if (AnythinkH5EndCardView.this.f13569R) {
                AnythinkH5EndCardView.this.f13481e.mo10950a(InterfaceC2174a.f13804H, "");
            }
            AnythinkH5EndCardView.this.f13481e.mo10950a(103, "");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$2 */
    public class ViewOnClickListenerC21252 implements View.OnClickListener {
        public ViewOnClickListenerC21252() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkH5EndCardView.this.onCloseViewClick();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$3 */
    public class C21263 extends C1442b {
        public C21263() {
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void loadingResourceStatus(WebView webView, int i) {
            super.loadingResourceStatus(webView, i);
            AnythinkH5EndCardView.this.f13567O = i;
            if (AnythinkH5EndCardView.this.f13566N) {
                return;
            }
            AnythinkH5EndCardView.m11363d(AnythinkH5EndCardView.this);
            if (i == 1) {
                AnythinkH5EndCardView.this.reportRenderResult("success", 4);
            } else {
                AnythinkH5EndCardView.this.f13481e.mo10950a(127, "");
                AnythinkH5EndCardView.this.reportRenderResult("failed", 6);
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (AnythinkH5EndCardView.this.f13588w) {
                return;
            }
            new StringBuilder("===========finish  loadSuccess:").append(AnythinkH5EndCardView.this.f13587v);
            AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
            anythinkH5EndCardView.f13587v = true;
            anythinkH5EndCardView.f13481e.mo10950a(100, "");
            AnythinkH5EndCardView.this.f13481e.mo10950a(120, "");
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
            if (anythinkH5EndCardView.f13588w) {
                return;
            }
            anythinkH5EndCardView.f13481e.mo10950a(118, "onReceivedError " + i + str);
            AnythinkH5EndCardView.this.reportRenderResult(str, 3);
            AnythinkH5EndCardView.this.f13481e.mo10950a(127, "");
            AnythinkH5EndCardView.this.f13481e.mo10950a(129, "");
            AnythinkH5EndCardView.this.f13588w = true;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void readyState(WebView webView, int i) {
            super.readyState(webView, i);
            StringBuilder sb = new StringBuilder("h5EncardView readyStatus:");
            sb.append(i);
            sb.append("- isError");
            sb.append(AnythinkH5EndCardView.this.f13588w);
            AnythinkH5EndCardView.this.f13567O = i;
            if (AnythinkH5EndCardView.this.f13588w) {
                return;
            }
            AnythinkH5EndCardView.m11357a(AnythinkH5EndCardView.this, System.currentTimeMillis() - AnythinkH5EndCardView.this.f13568P);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$4 */
    public class RunnableC21274 implements Runnable {
        public RunnableC21274() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String string;
            try {
                try {
                    int[] iArr = new int[2];
                    AnythinkH5EndCardView.this.f13584s.getLocationOnScreen(iArr);
                    StringBuilder sb = new StringBuilder("coordinate:");
                    sb.append(iArr[0]);
                    sb.append("--");
                    sb.append(iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    Context contextM2148f = C1175n.m2059a().m2148f();
                    if (contextM2148f != null) {
                        jSONObject.put("startX", C1886t.m9821a(contextM2148f, iArr[0]));
                        jSONObject.put("startY", C1886t.m9821a(contextM2148f, iArr[1]));
                        jSONObject.put(C1801a.f11119ch, C1886t.m9841c(contextM2148f));
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    th.getMessage();
                    string = "";
                }
                String strEncodeToString = Base64.encodeToString(string.toString().getBytes(), 2);
                C1469j.m5701a();
                C1469j.m5703a((WebView) AnythinkH5EndCardView.this.f13584s, "webviewshow", strEncodeToString);
                AnythinkH5EndCardView.this.f13481e.mo10950a(109, "");
                AnythinkH5EndCardView.m11368g(AnythinkH5EndCardView.this);
                AnythinkH5EndCardView.this.startCounterEndCardShowTimer();
                C1469j.m5701a();
                AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                C1469j.m5703a((WebView) anythinkH5EndCardView.f13584s, "oncutoutfetched", Base64.encodeToString(anythinkH5EndCardView.f13577ac.getBytes(), 0));
                AnythinkH5EndCardView.m11372i(AnythinkH5EndCardView.this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$5 */
    public class RunnableC21285 implements Runnable {
        public RunnableC21285() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView.this.f13560H.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$6 */
    public class C21296 implements InterfaceC1798a {
        public C21296() {
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: a */
        public final void mo5503a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) AnythinkH5EndCardView.this.f13584s, AbsFeedBackForH5.f6738a, strEncodeToString);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: b */
        public final void mo5504b() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) AnythinkH5EndCardView.this.f13584s, AbsFeedBackForH5.f6738a, strEncodeToString);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: c */
        public final void mo5505c() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) AnythinkH5EndCardView.this.f13584s, AbsFeedBackForH5.f6738a, strEncodeToString);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$a */
    public class RunnableC2130a implements Runnable {

        /* JADX INFO: renamed from: b */
        private AnythinkH5EndCardView f13599b;

        public RunnableC2130a(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f13599b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            AnythinkH5EndCardView anythinkH5EndCardView = this.f13599b;
            if (anythinkH5EndCardView == null || (handler = anythinkH5EndCardView.f13590y) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$b */
    public class RunnableC2131b implements Runnable {

        /* JADX INFO: renamed from: b */
        private AnythinkH5EndCardView f13601b;

        public RunnableC2131b(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f13601b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f13601b;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.f13566N) {
                return;
            }
            AnythinkH5EndCardView.m11363d(this.f13601b);
            this.f13601b.f13587v = false;
            AnythinkH5EndCardView.this.reportRenderResult("timeout", 5);
            this.f13601b.f13481e.mo10950a(127, "");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$c */
    public static class RunnableC2132c implements Runnable {

        /* JADX INFO: renamed from: a */
        private AnythinkH5EndCardView f13602a;

        /* JADX INFO: renamed from: b */
        private int f13603b;

        public RunnableC2132c(AnythinkH5EndCardView anythinkH5EndCardView, int i) {
            this.f13602a = anythinkH5EndCardView;
            this.f13603b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f13602a;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.f13478b == null) {
                return;
            }
            try {
                if (anythinkH5EndCardView.f13565M) {
                    return;
                }
                AnythinkH5EndCardView.m11379n(this.f13602a);
                if (C1889w.m9868b(this.f13602a.f13478b.m8801I())) {
                    this.f13602a.f13478b.m8801I().contains(MultiDexExtractor.EXTRACTED_SUFFIX);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$d */
    public class RunnableC2133d implements Runnable {

        /* JADX INFO: renamed from: b */
        private AnythinkH5EndCardView f13605b;

        public RunnableC2133d(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f13605b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f13605b;
            if (anythinkH5EndCardView != null) {
                AnythinkH5EndCardView.m11364e(anythinkH5EndCardView);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$e */
    public class RunnableC2134e implements Runnable {

        /* JADX INFO: renamed from: b */
        private AnythinkH5EndCardView f13607b;

        public RunnableC2134e(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f13607b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f13607b;
            if (anythinkH5EndCardView != null) {
                AnythinkH5EndCardView.m11366f(anythinkH5EndCardView);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$f */
    public class RunnableC2135f implements Runnable {

        /* JADX INFO: renamed from: b */
        private AnythinkH5EndCardView f13609b;

        public RunnableC2135f(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f13609b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f13609b;
            if (anythinkH5EndCardView != null) {
                if (!anythinkH5EndCardView.f13575aa) {
                    AnythinkH5EndCardView.this.setCloseVisible(0);
                }
                AnythinkH5EndCardView.m11377l(this.f13609b);
            }
        }
    }

    public AnythinkH5EndCardView(Context context) {
        super(context);
        this.f13561I = false;
        this.f13585t = new Handler();
        this.f13587v = false;
        this.f13588w = false;
        this.f13562J = false;
        this.f13563K = 1;
        this.f13564L = 1;
        this.f13565M = false;
        this.f13566N = false;
        this.f13567O = 1;
        this.f13568P = 0L;
        this.f13569R = false;
        this.f13570S = false;
        this.f13571T = false;
        this.f13572U = false;
        this.f13573V = false;
        this.f13574W = false;
        this.f13575aa = false;
        this.f13576ab = false;
        this.f13577ac = "";
        this.f13590y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            public HandlerC21241(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (AnythinkH5EndCardView.this.f13569R) {
                    AnythinkH5EndCardView.this.f13481e.mo10950a(InterfaceC2174a.f13804H, "");
                }
                AnythinkH5EndCardView.this.f13481e.mo10950a(103, "");
            }
        };
        this.f13579ae = false;
        this.f13580af = false;
        this.f13591z = false;
    }

    public AnythinkH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13561I = false;
        this.f13585t = new Handler();
        this.f13587v = false;
        this.f13588w = false;
        this.f13562J = false;
        this.f13563K = 1;
        this.f13564L = 1;
        this.f13565M = false;
        this.f13566N = false;
        this.f13567O = 1;
        this.f13568P = 0L;
        this.f13569R = false;
        this.f13570S = false;
        this.f13571T = false;
        this.f13572U = false;
        this.f13573V = false;
        this.f13574W = false;
        this.f13575aa = false;
        this.f13576ab = false;
        this.f13577ac = "";
        this.f13590y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            public HandlerC21241(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (AnythinkH5EndCardView.this.f13569R) {
                    AnythinkH5EndCardView.this.f13481e.mo10950a(InterfaceC2174a.f13804H, "");
                }
                AnythinkH5EndCardView.this.f13481e.mo10950a(103, "");
            }
        };
        this.f13579ae = false;
        this.f13580af = false;
        this.f13591z = false;
    }

    /* JADX INFO: renamed from: a */
    private void m11356a(long j, boolean z) {
        try {
            if (this.f13565M) {
                return;
            }
            this.f13565M = true;
            String str = "2";
            if (C1889w.m9868b(this.f13478b.m8801I()) && this.f13478b.m8801I().contains(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                str = "1";
            }
            int i = 10;
            String str2 = "ready yes";
            if (z) {
                i = 12;
                str2 = "ready timeout";
            } else if (this.f13567O == 2) {
                i = 11;
                str2 = "ready no";
            }
            StringBuilder sb = new StringBuilder("insertEndCardReadyState result:");
            sb.append(i);
            sb.append(" endCardLoadTime:");
            sb.append(j);
            sb.append(" endcardurl:");
            sb.append(this.f13478b.m8801I());
            sb.append("  id:");
            sb.append(this.f13478b.m10146aZ());
            sb.append("  unitid:");
            sb.append(this.f13589x);
            sb.append("  reason:");
            sb.append(str2);
            sb.append("  type:");
            sb.append(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11357a(AnythinkH5EndCardView anythinkH5EndCardView, long j) {
        try {
            if (anythinkH5EndCardView.f13565M) {
                return;
            }
            anythinkH5EndCardView.f13565M = true;
            String str = "2";
            if (C1889w.m9868b(anythinkH5EndCardView.f13478b.m8801I()) && anythinkH5EndCardView.f13478b.m8801I().contains(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                str = "1";
            }
            int i = 10;
            String str2 = "ready yes";
            if (anythinkH5EndCardView.f13567O == 2) {
                i = 11;
                str2 = "ready no";
            }
            StringBuilder sb = new StringBuilder("insertEndCardReadyState result:");
            sb.append(i);
            sb.append(" endCardLoadTime:");
            sb.append(j);
            sb.append(" endcardurl:");
            sb.append(anythinkH5EndCardView.f13478b.m8801I());
            sb.append("  id:");
            sb.append(anythinkH5EndCardView.f13478b.m10146aZ());
            sb.append("  unitid:");
            sb.append(anythinkH5EndCardView.f13589x);
            sb.append("  reason:");
            sb.append(str2);
            sb.append("  type:");
            sb.append(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11358a(String str) {
        try {
            String strM8835ad = this.f13478b.m8835ad();
            if (!TextUtils.isEmpty(str)) {
                this.f13478b.m8902p(str);
            }
            new C1405a(getContext(), this.f13589x);
            this.f13478b.m8902p(strM8835ad);
            this.f13481e.mo10950a(126, "");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m11359a(View view) {
        this.f13583r = (ImageView) view.findViewById(findID("anythink_windwv_close"));
        this.f13582q = (RelativeLayout) view.findViewById(findID("anythink_windwv_content_rl"));
        this.f13584s = new WindVaneWebView(getContext());
        this.f13584s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f13582q.addView(this.f13584s);
        return isNotNULL(this.f13583r, this.f13584s);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m11363d(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f13566N = true;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m11364e(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f13573V = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x008a  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11365f() {
        /*
            r7 = this;
            java.lang.String r0 = "wfr=1"
            java.lang.String r1 = "="
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L96
            r7.f13568P = r2     // Catch: java.lang.Throwable -> L96
            com.anythink.expressad.foundation.d.c r2 = r7.f13478b     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = r2.m8801I()     // Catch: java.lang.Throwable -> L96
            com.anythink.expressad.videocommon.e.c r3 = com.anythink.expressad.videocommon.p181e.C2339c.m11994a()     // Catch: java.lang.Throwable -> L96
            com.anythink.expressad.foundation.b.a r4 = com.anythink.expressad.foundation.p113b.C1773a.m8548c()     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = r4.m8558f()     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = r7.f13589x     // Catch: java.lang.Throwable -> L96
            com.anythink.expressad.videocommon.e.d r3 = r3.m11999a(r4, r5)     // Catch: java.lang.Throwable -> L96
            boolean r4 = r7.f13562J     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L95
            boolean r4 = com.anythink.expressad.foundation.p138h.C1889w.m9868b(r2)     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L95
            boolean r4 = r2.contains(r0)     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L3a
            if (r3 == 0) goto L95
            int r4 = r3.m12097o()     // Catch: java.lang.Throwable -> L96
            if (r4 <= 0) goto L95
        L3a:
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L96
            r4 = 20
            if (r0 == 0) goto L7d
            java.lang.String r0 = "&"
            java.lang.String[] r0 = r2.split(r0)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L8a
            int r2 = r0.length     // Catch: java.lang.Throwable -> L96
            if (r2 <= 0) goto L8a
            int r2 = r0.length     // Catch: java.lang.Throwable -> L96
            r3 = 0
        L4f:
            if (r3 >= r2) goto L8a
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L96
            boolean r6 = com.anythink.expressad.foundation.p138h.C1889w.m9868b(r5)     // Catch: java.lang.Throwable -> L96
            if (r6 == 0) goto L7a
            java.lang.String r6 = "to"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L96
            if (r6 == 0) goto L7a
            java.lang.String[] r6 = r5.split(r1)     // Catch: java.lang.Throwable -> L96
            if (r6 == 0) goto L7a
            java.lang.String[] r6 = r5.split(r1)     // Catch: java.lang.Throwable -> L96
            int r6 = r6.length     // Catch: java.lang.Throwable -> L96
            if (r6 <= 0) goto L7a
            java.lang.String[] r0 = r5.split(r1)     // Catch: java.lang.Throwable -> L96
            r1 = 1
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L96
            int r0 = com.anythink.expressad.foundation.p138h.C1886t.m9822a(r0)     // Catch: java.lang.Throwable -> L96
            goto L8c
        L7a:
            int r3 = r3 + 1
            goto L4f
        L7d:
            if (r3 == 0) goto L8a
            int r0 = r3.m12097o()     // Catch: java.lang.Throwable -> L96
            if (r0 <= 0) goto L8a
            int r0 = r3.m12097o()     // Catch: java.lang.Throwable -> L96
            goto L8c
        L8a:
            r0 = 20
        L8c:
            if (r0 < 0) goto L92
            r7.excuteEndCardShowTask(r0)     // Catch: java.lang.Throwable -> L96
            return
        L92:
            r7.excuteEndCardShowTask(r4)     // Catch: java.lang.Throwable -> L96
        L95:
            return
        L96:
            r0 = move-exception
            r0.getMessage()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkH5EndCardView.m11365f():void");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m11366f(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f13574W = true;
        return true;
    }

    /* JADX INFO: renamed from: g */
    private void m11367g() {
        if (this.f13579ae || this.f13571T) {
            return;
        }
        this.f13579ae = true;
        int i = this.f13563K;
        if (i == 0) {
            this.f13573V = true;
            return;
        }
        this.f13573V = false;
        if (i >= 0) {
            this.f13585t.postDelayed(new RunnableC2133d(this), this.f13563K * 1000);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m11368g(AnythinkH5EndCardView anythinkH5EndCardView) {
        C1781c c1781c = anythinkH5EndCardView.f13478b;
        if (c1781c == null || !c1781c.m8800H()) {
            return;
        }
        int i = anythinkH5EndCardView.getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i != 0) {
            if (i == 1) {
                str = f13551B;
            } else if (i == 2) {
                str = f13552C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e) {
            e.printStackTrace();
        }
        HashMap map = new HashMap();
        map.put(CallMraidJS.f6709a, "Interstitial");
        map.put("state", CallMraidJS.f6714f);
        map.put(CallMraidJS.f6711c, "true");
        map.put(CallMraidJS.f6712d, jSONObject);
        if (anythinkH5EndCardView.getContext() instanceof Activity) {
            float fM9702e = C1877k.m9702e(anythinkH5EndCardView.getContext());
            float fM9705f = C1877k.m9705f(anythinkH5EndCardView.getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) anythinkH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.widthPixels;
            float f2 = displayMetrics.heightPixels;
            CallMraidJS.getInstance().fireSetScreenSize(anythinkH5EndCardView.f13584s, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(anythinkH5EndCardView.f13584s, f, f2);
        }
        CallMraidJS.getInstance().fireSetDefaultPosition(anythinkH5EndCardView.f13584s, r7.getLeft(), anythinkH5EndCardView.f13584s.getTop(), anythinkH5EndCardView.f13584s.getWidth(), anythinkH5EndCardView.f13584s.getHeight());
        CallMraidJS.getInstance().fireSetCurrentPosition(anythinkH5EndCardView.f13584s, r13.getLeft(), anythinkH5EndCardView.f13584s.getTop(), anythinkH5EndCardView.f13584s.getWidth(), anythinkH5EndCardView.f13584s.getHeight());
        CallMraidJS.getInstance().fireChangeEventForPropertys(anythinkH5EndCardView.f13584s, map);
        CallMraidJS.getInstance().fireAudioVolumeChange(anythinkH5EndCardView.f13584s, MraidVolumeChangeReceiver.f6725a);
        CallMraidJS.getInstance().fireReadyEvent(anythinkH5EndCardView.f13584s);
    }

    /* JADX INFO: renamed from: h */
    private void m11370h() {
        if (this.f13580af || this.f13571T) {
            return;
        }
        this.f13580af = true;
        int i = this.f13564L;
        if (i == 0) {
            this.f13574W = true;
            return;
        }
        this.f13574W = false;
        if (i >= 0) {
            this.f13585t.postDelayed(new RunnableC2134e(this), this.f13564L * 1000);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m11371i() {
        try {
            if (C1800b.m9367a().m9384b()) {
                C1800b.m9367a().m9385c(this.f13589x + "_1");
                FeedBackButton feedBackButtonM9382b = C1800b.m9367a().m9382b(this.f13589x + "_2");
                this.f13560H = feedBackButtonM9382b;
                if (feedBackButtonM9382b != null) {
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonM9382b.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f13560H);
                    }
                    this.f13582q.addView(this.f13560H);
                    this.f13582q.postDelayed(new RunnableC21285(), 200L);
                }
                this.f13478b.m8891l(this.f13589x);
                C1800b.m9367a().m9379a(this.f13589x + "_2", this.f13478b);
                C1800b.m9367a().m9380a(this.f13589x + "_2", new C21296());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m11372i(AnythinkH5EndCardView anythinkH5EndCardView) {
        try {
            if (C1800b.m9367a().m9384b()) {
                C1800b.m9367a().m9385c(anythinkH5EndCardView.f13589x + "_1");
                FeedBackButton feedBackButtonM9382b = C1800b.m9367a().m9382b(anythinkH5EndCardView.f13589x + "_2");
                anythinkH5EndCardView.f13560H = feedBackButtonM9382b;
                if (feedBackButtonM9382b != null) {
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonM9382b.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(anythinkH5EndCardView.f13560H);
                    }
                    anythinkH5EndCardView.f13582q.addView(anythinkH5EndCardView.f13560H);
                    anythinkH5EndCardView.f13582q.postDelayed(anythinkH5EndCardView.new RunnableC21285(), 200L);
                }
                anythinkH5EndCardView.f13478b.m8891l(anythinkH5EndCardView.f13589x);
                C1800b.m9367a().m9379a(anythinkH5EndCardView.f13589x + "_2", anythinkH5EndCardView.f13478b);
                C1800b.m9367a().m9380a(anythinkH5EndCardView.f13589x + "_2", anythinkH5EndCardView.new C21296());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: j */
    private void m11374j() {
        C1781c c1781c = this.f13478b;
        if (c1781c == null || !c1781c.m8800H()) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i != 0) {
            if (i == 1) {
                str = f13551B;
            } else if (i == 2) {
                str = f13552C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e) {
            e.printStackTrace();
        }
        HashMap map = new HashMap();
        map.put(CallMraidJS.f6709a, "Interstitial");
        map.put("state", CallMraidJS.f6714f);
        map.put(CallMraidJS.f6711c, "true");
        map.put(CallMraidJS.f6712d, jSONObject);
        if (getContext() instanceof Activity) {
            float fM9702e = C1877k.m9702e(getContext());
            float fM9705f = C1877k.m9705f(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.widthPixels;
            float f2 = displayMetrics.heightPixels;
            CallMraidJS.getInstance().fireSetScreenSize(this.f13584s, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(this.f13584s, f, f2);
        }
        CallMraidJS.getInstance().fireSetDefaultPosition(this.f13584s, r7.getLeft(), this.f13584s.getTop(), this.f13584s.getWidth(), this.f13584s.getHeight());
        CallMraidJS.getInstance().fireSetCurrentPosition(this.f13584s, r13.getLeft(), this.f13584s.getTop(), this.f13584s.getWidth(), this.f13584s.getHeight());
        CallMraidJS.getInstance().fireChangeEventForPropertys(this.f13584s, map);
        CallMraidJS.getInstance().fireAudioVolumeChange(this.f13584s, MraidVolumeChangeReceiver.f6725a);
        CallMraidJS.getInstance().fireReadyEvent(this.f13584s);
    }

    /* JADX INFO: renamed from: k */
    private static void m11375k() {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m11377l(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f13570S = true;
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m11379n(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f13565M = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public String mo11313a() {
        C1781c c1781c = this.f13478b;
        if (c1781c == null) {
            this.f13569R = false;
            return null;
        }
        this.f13569R = true;
        if (c1781c.m8800H()) {
            this.f13562J = false;
            String strM8799G = this.f13478b.m8799G();
            if (TextUtils.isEmpty(strM8799G)) {
                return this.f13478b.m8808P();
            }
            File file = new File(strM8799G);
            try {
                strM8799G = (file.exists() && file.isFile() && file.canRead()) ? "file:////".concat(String.valueOf(strM8799G)) : this.f13478b.m8808P();
                return strM8799G;
            } catch (Throwable th) {
                if (!C1404a.f6209a) {
                    return strM8799G;
                }
                th.printStackTrace();
                return strM8799G;
            }
        }
        String strM8801I = this.f13478b.m8801I();
        if (C1889w.m9867a(strM8801I)) {
            this.f13562J = false;
            return this.f13478b.m8808P();
        }
        this.f13562J = true;
        String strM11883c = C2324i.m11867a().m11883c(strM8801I);
        if (!TextUtils.isEmpty(strM11883c)) {
            return strM11883c + "&native_adtype=" + this.f13478b.m8913w();
        }
        try {
            String path = Uri.parse(strM8801I).getPath();
            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                String strM8808P = this.f13478b.m8808P();
                if (TextUtils.isEmpty(strM8808P)) {
                    return null;
                }
                this.f13562J = false;
                excuteTask();
                return strM8808P;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        return strM8801I + "&native_adtype=" + this.f13478b.m8913w();
    }

    /* JADX INFO: renamed from: b */
    public RelativeLayout.LayoutParams mo11314b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    /* JADX INFO: renamed from: c */
    public final void mo11316c() {
        super.mo11316c();
        if (this.f13482f) {
            this.f13583r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.2
                public ViewOnClickListenerC21252() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public boolean canBackPress() {
        ImageView imageView = this.f13583r;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    /* JADX INFO: renamed from: e */
    public void mo11329e() {
        if (this.f13482f) {
            setMatchParent();
        }
    }

    public void excuteEndCardShowTask(int i) {
        this.f13585t.postDelayed(new RunnableC2132c(this, i), i * 1000);
    }

    public void excuteTask() {
        if (this.f13562J || this.f13563K < 0) {
            return;
        }
        this.f13585t.postDelayed(new RunnableC2135f(this), this.f13563K * 1000);
    }

    public void executeEndCardShow(int i) {
        this.f13585t.postDelayed(new RunnableC2131b(this), i * 1000);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void expand(String str, boolean z) {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public C1781c getMraidCampaign() {
        return this.f13478b;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void handlerPlayableException(String str) {
        if (this.f13588w) {
            return;
        }
        this.f13588w = true;
        this.f13587v = false;
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int iFindLayout = findLayout(f13550A);
        if (iFindLayout >= 0) {
            View viewInflate = this.f13479c.inflate(iFindLayout, (ViewGroup) null);
            this.f13581p = viewInflate;
            try {
                this.f13583r = (ImageView) viewInflate.findViewById(findID("anythink_windwv_close"));
                this.f13582q = (RelativeLayout) viewInflate.findViewById(findID("anythink_windwv_content_rl"));
                this.f13584s = new WindVaneWebView(getContext());
                this.f13584s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f13582q.addView(this.f13584s);
                this.f13482f = isNotNULL(this.f13583r, this.f13584s);
            } catch (Exception unused) {
                this.f13482f = false;
            }
            addView(this.f13581p, mo11314b());
            mo11316c();
            mo11329e();
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void install(C1781c c1781c) {
    }

    public boolean isLoadSuccess() {
        return this.f13587v;
    }

    public boolean isPlayable() {
        return this.f13562J;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f13571T = true;
        } else {
            if (i != 1) {
                return;
            }
            this.f13572U = true;
        }
    }

    public void onBackPress() {
        boolean z;
        if (this.f13570S || (((z = this.f13571T) && this.f13572U) || (!(z || !this.f13573V || this.f13591z) || (!z && this.f13574W && this.f13591z)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f13584s == null) {
                this.f13481e.mo10950a(103, "");
                this.f13481e.mo10950a(119, "webview is null when closing webview");
            } else {
                C1469j.m5701a();
                C1469j.m5703a((WebView) this.f13584s, "onSystemDestory", "");
                new Thread(new RunnableC2130a(this)).start();
            }
        } catch (Exception e) {
            this.f13481e.mo10950a(103, "");
            this.f13481e.mo10950a(119, "close webview exception" + e.getMessage());
            e.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0 || this.f13576ab) {
            return;
        }
        this.f13576ab = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C1781c c1781c = this.f13478b;
        if (c1781c == null || !c1781c.m8800H()) {
            return;
        }
        if (z) {
            CallMraidJS.getInstance().fireSetIsViewable(this.f13584s, "true");
        } else {
            CallMraidJS.getInstance().fireSetIsViewable(this.f13584s, "false");
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void open(String str) {
        try {
            String strM8835ad = this.f13478b.m8835ad();
            if (!TextUtils.isEmpty(str)) {
                this.f13478b.m8902p(str);
            }
            new C1405a(getContext(), this.f13589x);
            this.f13478b.m8902p(strM8835ad);
            this.f13481e.mo10950a(126, "");
        } catch (Exception e) {
            try {
                e.getMessage();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", configuration.orientation == 2 ? f13552C : f13551B);
            String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) this.f13584s, "orientation", strEncodeToString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f6 A[Catch: all -> 0x00fe, TryCatch #0 {all -> 0x00fe, blocks: (B:78:0x006c, B:80:0x008e, B:82:0x0094, B:85:0x009c, B:87:0x00a2, B:89:0x00aa, B:91:0x00b2, B:93:0x00b5, B:95:0x00b9, B:97:0x00c1, B:99:0x00c9, B:101:0x00cf, B:103:0x00d6, B:111:0x00f6, B:112:0x00fa, B:104:0x00e2, B:106:0x00e7, B:108:0x00ed), top: B:123:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00fa A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #0 {all -> 0x00fe, blocks: (B:78:0x006c, B:80:0x008e, B:82:0x0094, B:85:0x009c, B:87:0x00a2, B:89:0x00aa, B:91:0x00b2, B:93:0x00b5, B:95:0x00b9, B:97:0x00c1, B:99:0x00c9, B:101:0x00cf, B:103:0x00d6, B:111:0x00f6, B:112:0x00fa, B:104:0x00e2, B:106:0x00e7, B:108:0x00ed), top: B:123:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void preLoadData(com.anythink.expressad.video.signal.factory.C2309b r10) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkH5EndCardView.preLoadData(com.anythink.expressad.video.signal.factory.b):void");
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void readyStatus(int i) {
    }

    public void release() {
        Handler handler = this.f13585t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f13585t = null;
        }
        Handler handler2 = this.f13590y;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.f13590y = null;
        }
        this.f13582q.removeAllViews();
        this.f13584s.release();
        this.f13584s = null;
    }

    public void reportRenderResult(String str, int i) {
    }

    public void setCloseDelayShowTime(int i) {
        this.f13563K = i;
    }

    public void setCloseVisible(int i) {
        if (this.f13482f) {
            this.f13583r.setVisibility(i);
        }
    }

    public void setCloseVisibleForMraid(int i) {
        if (this.f13482f) {
            this.f13575aa = true;
            if (i == 4) {
                this.f13583r.setImageDrawable(new ColorDrawable(ItemTouchHelper.ACTION_MODE_DRAG_MASK));
            } else {
                this.f13583r.setImageResource(findDrawable("anythink_reward_close"));
            }
            this.f13583r.setVisibility(0);
        }
    }

    public void setError(boolean z) {
        this.f13588w = z;
    }

    public void setHtmlSource(String str) {
        this.f13586u = str;
    }

    public void setLoadPlayable(boolean z) {
        this.f13591z = z;
    }

    public void setNotchValue(String str, int i, int i2, int i3, int i4) {
        C1781c c1781c = this.f13478b;
        if (c1781c == null || c1781c.m8872f() == 2) {
            return;
        }
        this.f13577ac = str;
        new StringBuilder("NOTCH H5ENDCARD ").append(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13583r.getLayoutParams();
        int iM9834b = C1886t.m9834b(getContext(), 20.0f);
        int i5 = i3 + iM9834b;
        layoutParams.setMargins(i + iM9834b, i5, i2 + iM9834b, i4 + iM9834b);
        new StringBuilder("NOTCH H5ENDCARD ").append(i5);
        this.f13583r.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i) {
        this.f13564L = i;
    }

    public void setUnitId(String str) {
        this.f13589x = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String strM8801I = this.f13478b.m8801I();
            int iM9822a = 15;
            if (C1889w.m9868b(strM8801I) && strM8801I.contains("wfl=1")) {
                String[] strArrSplit = strM8801I.split("&");
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (String str : strArrSplit) {
                        if (C1889w.m9868b(str) && str.contains("timeout") && str.split("=") != null && str.split("=").length > 0) {
                            iM9822a = C1886t.m9822a((Object) str.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(iM9822a);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void toggleCloseBtn(int i) {
        Handler handler;
        Runnable runnableC2133d;
        int i2;
        int visibility = this.f13583r.getVisibility();
        if (i == 1) {
            this.f13570S = true;
            visibility = 0;
        } else if (i == 2) {
            this.f13570S = false;
            visibility = 8;
            if (this.f13591z) {
                if (!this.f13580af && !this.f13571T) {
                    this.f13580af = true;
                    int i3 = this.f13564L;
                    if (i3 == 0) {
                        this.f13574W = true;
                    } else {
                        this.f13574W = false;
                        if (i3 >= 0) {
                            handler = this.f13585t;
                            runnableC2133d = new RunnableC2134e(this);
                            i2 = this.f13564L;
                            handler.postDelayed(runnableC2133d, i2 * 1000);
                        }
                    }
                }
            } else if (!this.f13579ae && !this.f13571T) {
                this.f13579ae = true;
                int i4 = this.f13563K;
                if (i4 == 0) {
                    this.f13573V = true;
                } else {
                    this.f13573V = false;
                    if (i4 >= 0) {
                        handler = this.f13585t;
                        runnableC2133d = new RunnableC2133d(this);
                        i2 = this.f13563K;
                        handler.postDelayed(runnableC2133d, i2 * 1000);
                    }
                }
            }
        }
        setCloseVisible(visibility);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void unload() {
        close();
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z) {
        try {
            setCloseVisibleForMraid(z ? 4 : 0);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void volumeChange(double d) {
        CallMraidJS.getInstance().fireAudioVolumeChange(this.f13584s, d);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f13584s;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.4
                public RunnableC21274() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String string;
                    try {
                        try {
                            int[] iArr = new int[2];
                            AnythinkH5EndCardView.this.f13584s.getLocationOnScreen(iArr);
                            StringBuilder sb = new StringBuilder("coordinate:");
                            sb.append(iArr[0]);
                            sb.append("--");
                            sb.append(iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            Context contextM2148f = C1175n.m2059a().m2148f();
                            if (contextM2148f != null) {
                                jSONObject.put("startX", C1886t.m9821a(contextM2148f, iArr[0]));
                                jSONObject.put("startY", C1886t.m9821a(contextM2148f, iArr[1]));
                                jSONObject.put(C1801a.f11119ch, C1886t.m9841c(contextM2148f));
                            }
                            string = jSONObject.toString();
                        } catch (Throwable th) {
                            th.getMessage();
                            string = "";
                        }
                        String strEncodeToString = Base64.encodeToString(string.toString().getBytes(), 2);
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkH5EndCardView.this.f13584s, "webviewshow", strEncodeToString);
                        AnythinkH5EndCardView.this.f13481e.mo10950a(109, "");
                        AnythinkH5EndCardView.m11368g(AnythinkH5EndCardView.this);
                        AnythinkH5EndCardView.this.startCounterEndCardShowTimer();
                        C1469j.m5701a();
                        AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                        C1469j.m5703a((WebView) anythinkH5EndCardView.f13584s, "oncutoutfetched", Base64.encodeToString(anythinkH5EndCardView.f13577ac.getBytes(), 0));
                        AnythinkH5EndCardView.m11372i(AnythinkH5EndCardView.this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
