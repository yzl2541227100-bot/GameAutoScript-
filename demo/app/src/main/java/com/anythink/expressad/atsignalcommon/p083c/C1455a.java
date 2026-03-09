package com.anythink.expressad.atsignalcommon.p083c;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p120g.p121a.AbstractC1802a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1455a {

    /* JADX INFO: renamed from: b */
    private static int f6696b = 0;

    /* JADX INFO: renamed from: c */
    private static int f6697c = 1;

    /* JADX INFO: renamed from: a */
    private String f6698a;

    /* JADX INFO: renamed from: d */
    private String f6699d;

    /* JADX INFO: renamed from: e */
    private String f6700e;

    /* JADX INFO: renamed from: f */
    private WindVaneWebView f6701f;

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.c.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static C1455a f6702a = new C1455a(0);

        private a() {
        }
    }

    private C1455a() {
        this.f6698a = "ShakeCacheManager";
    }

    public /* synthetic */ C1455a(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C1455a m5629a() {
        return a.f6702a;
    }

    /* JADX INFO: renamed from: a */
    private static void m5630a(Object obj, WebView webView, String str, String str2) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("currentCache", str);
                m5633a(obj, str2, jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5631a(Object obj, WindVaneWebView windVaneWebView) {
        if (windVaneWebView != null) {
            C1469j.m5701a().mo5674a(obj, "releaseShake", "");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5632a(Object obj, WindVaneWebView windVaneWebView, String str, String str2, String str3) {
        if ((str + str2 + str3).equals(this.f6699d)) {
            m5631a(obj, windVaneWebView);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5633a(Object obj, String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f6697c);
            jSONObject2.put("message", str);
            jSONObject2.put("data", jSONObject);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5634a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f6696b);
            jSONObject2.put("message", "");
            jSONObject2.put("data", jSONObject);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e) {
            m5633a(obj, e.getMessage(), new JSONObject());
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m5635b(Object obj) {
        m5634a(obj, new JSONObject());
    }

    /* JADX INFO: renamed from: a */
    public final void m5636a(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractC1802a.f11164a, this.f6700e);
            m5634a(obj, jSONObject);
        } catch (JSONException e) {
            m5633a(obj, e.getMessage(), new JSONObject());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5637a(Object obj, WindVaneWebView windVaneWebView, String str) {
        if (!TextUtils.isEmpty(this.f6700e) && this.f6700e.equals(str)) {
            this.f6700e = "";
            this.f6701f = null;
            m5631a(obj, windVaneWebView);
            m5634a(obj, new JSONObject());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCache", this.f6700e);
            m5633a(obj, "cache is exception", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5638a(Object obj, WindVaneWebView windVaneWebView, String str, String str2) {
        if ((!TextUtils.isEmpty(this.f6700e) && this.f6700e.equals(str)) || (TextUtils.isEmpty(this.f6700e) && TextUtils.isEmpty(str))) {
            this.f6700e = str2;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    this.f6699d = new JSONObject(str2).optString("sid");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            this.f6701f = windVaneWebView;
            m5634a(obj, new JSONObject());
            return;
        }
        String str3 = this.f6700e;
        if (windVaneWebView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("currentCache", str3);
                m5633a(obj, "cache had changed", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
