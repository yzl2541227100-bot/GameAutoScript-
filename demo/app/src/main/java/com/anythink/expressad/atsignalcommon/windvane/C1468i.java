package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1468i {

    /* JADX INFO: renamed from: a */
    private static HashMap<String, Class> f6779a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private Context f6780b;

    /* JADX INFO: renamed from: c */
    private Object f6781c;

    /* JADX INFO: renamed from: d */
    private WindVaneWebView f6782d;

    public C1468i(Context context, WindVaneWebView windVaneWebView) {
        this.f6780b = context;
        this.f6782d = windVaneWebView;
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.atsignalcommon.bridge.BannerJSPlugin"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.video.signal.communication.RewardJs"));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.video.signal.communication.VideoBridge"));
        } catch (ClassNotFoundException unused3) {
        }
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.atsignalcommon.mraid.MraidJSBridge"));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.splash.js.SplashJs"));
        } catch (ClassNotFoundException unused5) {
        }
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.atsignalcommon.webEnvCheck.WebGLCheckjs"));
        } catch (ClassNotFoundException unused6) {
        }
    }

    /* JADX INFO: renamed from: a */
    private Object m5694a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f6779a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!AbstractC1471l.class.isAssignableFrom(cls)) {
                return null;
            }
            AbstractC1471l abstractC1471l = (AbstractC1471l) cls.newInstance();
            abstractC1471l.initialize(context, windVaneWebView);
            abstractC1471l.initialize(this.f6781c, windVaneWebView);
            return abstractC1471l;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5695a() {
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.atsignalcommon.bridge.BannerJSPlugin"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.video.signal.communication.RewardJs"));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.video.signal.communication.VideoBridge"));
        } catch (ClassNotFoundException unused3) {
        }
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.atsignalcommon.mraid.MraidJSBridge"));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.splash.js.SplashJs"));
        } catch (ClassNotFoundException unused5) {
        }
        try {
            m5696a((Class) Class.forName("com.anythink.expressad.atsignalcommon.webEnvCheck.WebGLCheckjs"));
        } catch (ClassNotFoundException unused6) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5696a(Class cls) {
        if (f6779a == null) {
            f6779a = new HashMap<>();
        }
        f6779a.put(cls.getSimpleName(), cls);
    }

    /* JADX INFO: renamed from: b */
    private static void m5697b(String str) {
        if (f6779a == null) {
            f6779a = new HashMap<>();
        }
        f6779a.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public final Object m5698a(String str) {
        if (f6779a == null) {
            f6779a = new HashMap<>();
        }
        return m5694a(str, this.f6782d, this.f6780b);
    }

    /* JADX INFO: renamed from: a */
    public final void m5699a(Context context) {
        this.f6780b = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m5700a(Object obj) {
        this.f6781c = obj;
    }
}
