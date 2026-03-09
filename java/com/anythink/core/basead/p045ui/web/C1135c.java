package com.anythink.core.basead.p045ui.web;

import android.webkit.WebView;
import com.anythink.core.common.p055f.AbstractC1247l;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.basead.ui.web.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1135c {

    /* JADX INFO: renamed from: a */
    public AbstractC1247l f2819a;

    /* JADX INFO: renamed from: b */
    public JSONObject f2820b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, Boolean> f2821c = new HashMap<>(3);

    public C1135c(AbstractC1247l abstractC1247l) {
        JSONObject jSONObject;
        this.f2819a = abstractC1247l;
        if (abstractC1247l != null) {
            try {
                jSONObject = new JSONObject(abstractC1247l.m3177Q());
            } catch (Throwable unused) {
                return;
            }
        } else {
            jSONObject = null;
        }
        this.f2820b = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final void m1804a(WebView webView, String str) {
        JSONObject jSONObject = this.f2820b;
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && str != null && str.contains(next) && this.f2821c.get(next) == null) {
                    this.f2821c.put(next, Boolean.TRUE);
                    webView.loadUrl(this.f2820b.optString(next));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
