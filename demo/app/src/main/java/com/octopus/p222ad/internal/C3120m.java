package com.octopus.p222ad.internal;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebView;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.octopus.p222ad.Octopus;
import com.octopus.p222ad.internal.p226b.C3098f;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.SPUtils;
import com.octopus.p222ad.utils.C3264e;
import com.octopus.p222ad.utils.InterfaceC3263d;
import com.octopus.p222ad.utils.ThreadUtils;
import com.octopus.p222ad.utils.p229a.C3226b;
import com.octopus.p222ad.utils.p258b.C3252c;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.octopus.p222ad.utils.p258b.C3257h;
import com.octopus.p222ad.utils.p258b.C3261l;
import com.octopus.p222ad.utils.p258b.RunnableC3251b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: com.octopus.ad.internal.m */
/* JADX INFO: loaded from: classes2.dex */
public class C3120m {

    /* JADX INFO: renamed from: F */
    private static boolean f17167F = true;

    /* JADX INFO: renamed from: G */
    private static boolean f17168G = false;

    /* JADX INFO: renamed from: e */
    public static String f17169e = null;

    /* JADX INFO: renamed from: f */
    public static String f17170f = "";

    /* JADX INFO: renamed from: g */
    public static String f17171g = "";

    /* JADX INFO: renamed from: k */
    private static String f17172k = "USED_AD_UNIT_IDS_KEY";

    /* JADX INFO: renamed from: l */
    private static C3120m f17173l = null;

    /* JADX INFO: renamed from: m */
    private static String f17174m = "OctopusImpl";

    /* JADX INFO: renamed from: p */
    private static String f17175p;

    /* JADX INFO: renamed from: A */
    private boolean f17176A;

    /* JADX INFO: renamed from: B */
    private DisplayMetrics f17177B;

    /* JADX INFO: renamed from: E */
    private C3098f f17180E;

    /* JADX INFO: renamed from: c */
    public String f17183c;

    /* JADX INFO: renamed from: h */
    public Context f17185h;

    /* JADX INFO: renamed from: i */
    public float f17186i;

    /* JADX INFO: renamed from: j */
    public float f17187j;

    /* JADX INFO: renamed from: n */
    private String f17188n;

    /* JADX INFO: renamed from: o */
    private String f17189o;

    /* JADX INFO: renamed from: z */
    private float f17199z;

    /* JADX INFO: renamed from: a */
    public boolean f17181a = false;

    /* JADX INFO: renamed from: b */
    public boolean f17182b = false;

    /* JADX INFO: renamed from: d */
    public HashMap<String, String> f17184d = new HashMap<>();

    /* JADX INFO: renamed from: q */
    private HashSet<String> f17190q = new HashSet<>();

    /* JADX INFO: renamed from: r */
    private HashSet<String> f17191r = new HashSet<>();

    /* JADX INFO: renamed from: s */
    private HashSet<String> f17192s = new HashSet<>();

    /* JADX INFO: renamed from: t */
    private HashSet<String> f17193t = new HashSet<>();

    /* JADX INFO: renamed from: u */
    private HashSet<String> f17194u = new HashSet<>();

    /* JADX INFO: renamed from: v */
    private HashSet<String> f17195v = new HashSet<>();

    /* JADX INFO: renamed from: w */
    private Handler f17196w = new Handler(Looper.getMainLooper()) { // from class: com.octopus.ad.internal.m.1
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
        }
    };

    /* JADX INFO: renamed from: x */
    private Handler f17197x = null;

    /* JADX INFO: renamed from: y */
    private HandlerThread f17198y = null;

    /* JADX INFO: renamed from: C */
    private boolean f17178C = false;

    /* JADX INFO: renamed from: D */
    private boolean f17179D = false;

    /* JADX INFO: renamed from: com.octopus.ad.internal.m$1 */
    public class AnonymousClass1 extends Handler {
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.m$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f17201a;

        public AnonymousClass2(Context context) {
            context = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = new WebView(context);
            int i = Build.VERSION.SDK_INT;
            if (i >= 11 && i < 19) {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            }
            if (i >= 19) {
                WebView.setWebContentsDebuggingEnabled(false);
            }
            webView.getSettings().setSavePassword(false);
            String userAgentString = webView.getSettings().getUserAgentString();
            if (TextUtils.isEmpty(userAgentString)) {
                return;
            }
            C3120m.this.m14437c(userAgentString);
            SPUtils.put(C3120m.this.f17185h, "userAgent", userAgentString);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.m$3 */
    public class AnonymousClass3 implements InterfaceC3263d {
        public AnonymousClass3() {
        }

        @Override // com.octopus.p222ad.utils.InterfaceC3263d
        /* JADX INFO: renamed from: a */
        public void mo14452a() {
            C3255f.m14981a("octopus", "上报活跃量");
        }

        @Override // com.octopus.p222ad.utils.InterfaceC3263d
        /* JADX INFO: renamed from: a */
        public void mo14453a(long j, long j2) {
            C3255f.m14981a("octopus", "在线时长:" + (j2 - j));
            SPUtils.put(C3120m.this.f17185h, "startTime", Long.valueOf(j));
            SPUtils.put(C3120m.this.f17185h, "endTime", Long.valueOf(j2));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3120m m14425a() {
        C3120m c3120m;
        synchronized (C3120m.class) {
            if (f17173l == null) {
                f17173l = new C3120m();
            }
            c3120m = f17173l;
        }
        return c3120m;
    }

    /* JADX INFO: renamed from: r */
    private C3098f m14426r() {
        Context context = this.f17185h;
        if (context == null) {
            return null;
        }
        return new C3098f.a(context).m14306a(52428800L).m14307a();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: s */
    private void m14427s() {
        try {
            Class.forName("android.content.pm.PackageParser$Package").getDeclaredConstructor(String.class).setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mHiddenApiWarningShown");
            declaredField.setAccessible(true);
            declaredField.setBoolean(objInvoke, true);
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14428a(float f) {
        C3131q.m14595a(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        C3131q.m14594a(f17169e, (Object) "Octopus.initialize() must be called prior to setting the app volume.");
        this.f17199z = f;
    }

    /* JADX INFO: renamed from: a */
    public void m14429a(Context context, String str) {
        synchronized (C3120m.class) {
            try {
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                Log.i("octopus", "SDK_VERSION:1.5.8.9");
                this.f17185h = context.getApplicationContext();
                try {
                    C3257h.m14988b().m14991e().execute(new RunnableC3251b(this.f17185h));
                    Long l = (Long) SPUtils.get(this.f17185h, "duration", Long.valueOf(C1485b.f6999aT));
                    String str2 = (String) SPUtils.get(this.f17185h, "version", "1686041703212");
                    Long l2 = (Long) SPUtils.get(this.f17185h, "lastReqTime", 0L);
                    if (l != null && str2 != null && l2 != null && C3261l.m15005c() - l2.longValue() > l.longValue()) {
                        new AsyncTaskC3117j(C3252c.m14971a("aHR0cDovL3Nka2NmZy5hZGludGwuY24vc2RrL3BrZ0NvbmZpZz92ZXJzaW9uPQ==") + str2).execute(new Void[0]);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (!Octopus.isLimitPersonalAds()) {
                    C3226b.m14913a((Application) this.f17185h);
                }
                HaoboLog.setErrorContext(context.getApplicationContext());
                f17169e = str;
                try {
                    try {
                        String string = SPUtils.getString(this.f17185h, "userAgent");
                        if (TextUtils.isEmpty(string)) {
                            ThreadUtils.runOnUIThread(new Runnable() { // from class: com.octopus.ad.internal.m.2

                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ Context f17201a;

                                public AnonymousClass2(Context context2) {
                                    context = context2;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    WebView webView = new WebView(context);
                                    int i = Build.VERSION.SDK_INT;
                                    if (i >= 11 && i < 19) {
                                        webView.removeJavascriptInterface("searchBoxJavaBridge_");
                                        webView.removeJavascriptInterface("accessibility");
                                        webView.removeJavascriptInterface("accessibilityTraversal");
                                    }
                                    if (i >= 19) {
                                        WebView.setWebContentsDebuggingEnabled(false);
                                    }
                                    webView.getSettings().setSavePassword(false);
                                    String userAgentString = webView.getSettings().getUserAgentString();
                                    if (TextUtils.isEmpty(userAgentString)) {
                                        return;
                                    }
                                    C3120m.this.m14437c(userAgentString);
                                    SPUtils.put(C3120m.this.f17185h, "userAgent", userAgentString);
                                }
                            });
                        } else {
                            m14437c(string);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                this.f17177B = displayMetrics;
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                if (i < i2) {
                    this.f17186i = i / 720.0f;
                    this.f17187j = i2 / 1280.0f;
                } else {
                    this.f17186i = i2 / 720.0f;
                    this.f17187j = i / 1280.0f;
                }
                if (!this.f17179D) {
                    C3264e.m15018a(this.f17185h).m15019a(new InterfaceC3263d() { // from class: com.octopus.ad.internal.m.3
                        public AnonymousClass3() {
                        }

                        @Override // com.octopus.p222ad.utils.InterfaceC3263d
                        /* JADX INFO: renamed from: a */
                        public void mo14452a() {
                            C3255f.m14981a("octopus", "上报活跃量");
                        }

                        @Override // com.octopus.p222ad.utils.InterfaceC3263d
                        /* JADX INFO: renamed from: a */
                        public void mo14453a(long j, long j2) {
                            C3255f.m14981a("octopus", "在线时长:" + (j2 - j));
                            SPUtils.put(C3120m.this.f17185h, "startTime", Long.valueOf(j));
                            SPUtils.put(C3120m.this.f17185h, "endTime", Long.valueOf(j2));
                        }
                    });
                }
                this.f17179D = true;
                if (Build.VERSION.SDK_INT >= 28) {
                    m14427s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14430a(String str) {
        this.f17188n = str;
    }

    /* JADX INFO: renamed from: a */
    public void m14431a(String str, boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public void m14432a(boolean z) {
        C3131q.m14594a(f17169e, (Object) "Octopus.initialize() must be called prior to setting the app volume.");
        this.f17176A = z;
    }

    /* JADX INFO: renamed from: b */
    public C3098f m14433b() {
        if (this.f17185h == null) {
            return null;
        }
        C3098f c3098f = this.f17180E;
        if (c3098f != null) {
            return c3098f;
        }
        C3098f c3098fM14426r = m14426r();
        this.f17180E = c3098fM14426r;
        return c3098fM14426r;
    }

    /* JADX INFO: renamed from: b */
    public void m14434b(String str) {
        this.f17189o = str;
    }

    /* JADX INFO: renamed from: b */
    public void m14435b(boolean z) {
        f17167F = z;
    }

    /* JADX INFO: renamed from: c */
    public Handler m14436c() {
        if (this.f17197x == null) {
            if (this.f17198y == null) {
                HandlerThread handlerThread = new HandlerThread("BackgroundHandler");
                this.f17198y = handlerThread;
                handlerThread.start();
            }
            this.f17197x = new Handler(this.f17198y.getLooper());
        }
        return this.f17197x;
    }

    /* JADX INFO: renamed from: c */
    public void m14437c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17183c = str;
    }

    /* JADX INFO: renamed from: d */
    public String m14438d() {
        return f17169e;
    }

    /* JADX INFO: renamed from: e */
    public String m14439e() {
        return this.f17188n;
    }

    /* JADX INFO: renamed from: f */
    public String m14440f() {
        return this.f17189o;
    }

    /* JADX INFO: renamed from: g */
    public Context m14441g() {
        return this.f17185h;
    }

    /* JADX INFO: renamed from: h */
    public String m14442h() {
        return TextUtils.isEmpty(this.f17183c) ? "application/json; charset=utf-8" : this.f17183c;
    }

    /* JADX INFO: renamed from: i */
    public String m14443i() {
        String strM14971a = C3252c.m14971a("aHR0cDovL3N2LmFkaW50bC5jbg==");
        return TextUtils.isEmpty(strM14971a) ? "" : this.f17181a ? strM14971a.replace("http:", "https:") : strM14971a;
    }

    /* JADX INFO: renamed from: j */
    public String m14444j() {
        String str;
        StringBuilder sb;
        String strM14443i;
        Boolean bool = Boolean.TRUE;
        if (TextUtils.isEmpty(f17175p)) {
            Boolean bool2 = (Boolean) SPUtils.getFromGroupSdk(this.f17185h, "encrypt", bool);
            str = (bool2 == null || bool2.booleanValue()) ? "/api/zysdk?isEncrypt=1" : "/api/zysdk?isEncrypt=0";
            sb = new StringBuilder();
            strM14443i = m14443i();
        } else {
            Boolean bool3 = (Boolean) SPUtils.getFromGroupSdk(this.f17185h, "encrypt", bool);
            str = (bool3 == null || bool3.booleanValue()) ? "/api/zysdk?isEncrypt=1" : "/api/zysdk?isEncrypt=0";
            sb = new StringBuilder();
            strM14443i = f17175p;
        }
        sb.append(strM14443i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public String m14445k() {
        if (!TextUtils.isEmpty(f17175p)) {
            return f17175p;
        }
        String strM14971a = C3252c.m14971a("aHR0cDovL3N2LmFkaW50bC5jbg==");
        return TextUtils.isEmpty(strM14971a) ? "" : this.f17181a ? strM14971a.replace("http:", "https:") : strM14971a;
    }

    /* JADX INFO: renamed from: l */
    public float m14446l() {
        return this.f17186i;
    }

    /* JADX INFO: renamed from: m */
    public float m14447m() {
        return this.f17187j;
    }

    /* JADX INFO: renamed from: n */
    public float m14448n() {
        return Math.max(this.f17186i, this.f17187j);
    }

    /* JADX INFO: renamed from: o */
    public DisplayMetrics m14449o() {
        return this.f17177B;
    }

    /* JADX INFO: renamed from: p */
    public HashSet<String> m14450p() {
        return this.f17195v;
    }

    /* JADX INFO: renamed from: q */
    public boolean m14451q() {
        return f17167F;
    }
}
