package com.anythink.expressad.mbbanner.p139a.p140a;

import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1900a {

    /* JADX INFO: renamed from: a */
    private static final String f11710a = "BannerCallJS";

    /* JADX INFO: renamed from: a */
    public static void m9893a(WebView webView) {
        C1469j.m5701a();
        C1469j.m5704b(webView);
    }

    /* JADX INFO: renamed from: a */
    public static void m9894a(WebView webView, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f);
            jSONObject.put("startY", f2);
            jSONObject.put("scale", C1886t.m9841c(C1175n.m2059a().m2148f()));
            String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a(webView, "webviewshow", strEncodeToString);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m9895a(WebView webView, int i, int i2) {
        try {
            CallMraidJS.getInstance().fireSizeChangeEvent(webView, i, i2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9896a(WebView webView, int i, int i2, int i3, int i4) {
        try {
            int i5 = C1175n.m2059a().m2148f().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i5 == 2 ? "landscape" : i5 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float fM9702e = C1877k.m9702e(C1175n.m2059a().m2148f());
            float fM9705f = C1877k.m9705f(C1175n.m2059a().m2148f());
            HashMap mapM9707g = C1877k.m9707g(C1175n.m2059a().m2148f());
            int iIntValue = ((Integer) mapM9707g.get("width")).intValue();
            int iIntValue2 = ((Integer) mapM9707g.get("height")).intValue();
            HashMap map = new HashMap();
            map.put(CallMraidJS.f6709a, "inline");
            map.put("state", CallMraidJS.f6714f);
            map.put(CallMraidJS.f6711c, "true");
            map.put(CallMraidJS.f6712d, jSONObject);
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            CallMraidJS.getInstance().fireSetDefaultPosition(webView, f, f2, f3, f4);
            CallMraidJS.getInstance().fireSetCurrentPosition(webView, f, f2, f3, f4);
            CallMraidJS.getInstance().fireSetScreenSize(webView, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(webView, iIntValue, iIntValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(webView, map);
            CallMraidJS.getInstance().fireReadyEvent(webView);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9897a(WindVaneWebView windVaneWebView, boolean z) {
        try {
            CallMraidJS.getInstance().fireSetIsViewable(windVaneWebView, z ? "true" : "false");
        } catch (Throwable unused) {
        }
    }
}
