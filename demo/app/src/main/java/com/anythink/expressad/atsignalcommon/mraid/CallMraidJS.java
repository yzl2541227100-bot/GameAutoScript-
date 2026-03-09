package com.anythink.expressad.atsignalcommon.mraid;

import android.webkit.WebView;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CallMraidJS {

    /* JADX INFO: renamed from: a */
    public static final String f6709a = "placementType";

    /* JADX INFO: renamed from: b */
    public static final String f6710b = "state";

    /* JADX INFO: renamed from: c */
    public static final String f6711c = "viewable";

    /* JADX INFO: renamed from: d */
    public static final String f6712d = "currentAppOrientation";

    /* JADX INFO: renamed from: e */
    public static final String f6713e = "loading";

    /* JADX INFO: renamed from: f */
    public static final String f6714f = "default";

    /* JADX INFO: renamed from: g */
    public static final String f6715g = "expanded";

    /* JADX INFO: renamed from: h */
    public static final String f6716h = "hidden";

    /* JADX INFO: renamed from: i */
    public static final String f6717i = "resized";

    /* JADX INFO: renamed from: j */
    public static final String f6718j = "Interstitial";

    /* JADX INFO: renamed from: k */
    public static final String f6719k = "inline";

    public static class SingletonHolder {

        /* JADX INFO: renamed from: a */
        private static final CallMraidJS f6720a = new CallMraidJS();

        private SingletonHolder() {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5663a(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static CallMraidJS getInstance() {
        return SingletonHolder.f6720a;
    }

    public void fireAudioVolumeChange(WebView webView, double d) {
        m5663a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.audioVolumeChange(%s);", Double.valueOf(d)));
    }

    public void fireChangeEventForPropertys(WebView webView, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m5663a(webView, String.format("javascript:window.mraidbridge.fireChangeEvent(%s);", jSONObject.toString()));
    }

    public void fireErrorEvent(WebView webView, String str, String str2) {
        m5663a(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public void fireNativeMethodCompleteEvent(WebView webView, String str) {
        m5663a(webView, String.format("javascript:window.mraidbridge.nativeCallComplete('%s');", str));
    }

    public void fireReadyEvent(WebView webView) {
        m5663a(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    public void fireSetCurrentPosition(WebView webView, float f, float f2, float f3, float f4) {
        m5663a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    public void fireSetDefaultPosition(WebView webView, float f, float f2, float f3, float f4) {
        m5663a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    public void fireSetIsViewable(WebView webView, String str) {
        m5663a(webView, String.format("javascript:window.mraidbridge.setIsViewable(%s);", str));
    }

    public void fireSetMaxSize(WebView webView, float f, float f2) {
        m5663a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    public void fireSetPlacementType(WebView webView, String str) {
        m5663a(webView, String.format("javascript:window.mraidbridge.setPlacementType(%s);", str));
    }

    public void fireSetScreenSize(WebView webView, float f, float f2) {
        m5663a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    public void fireSizeChangeEvent(WebView webView, float f, float f2) {
        m5663a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }
}
