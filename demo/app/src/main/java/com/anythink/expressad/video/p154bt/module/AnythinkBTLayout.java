package com.anythink.expressad.video.p154bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.video.p154bt.p155a.C2024c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkBTLayout extends BTBaseView {

    /* JADX INFO: renamed from: p */
    private static final String f12994p = "portrait";

    /* JADX INFO: renamed from: q */
    private static final String f12995q = "landscape";

    /* JADX INFO: renamed from: r */
    private WebView f12996r;

    public AnythinkBTLayout(Context context) {
        super(context);
    }

    public AnythinkBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f12996r != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f13087n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C1469j.m5701a();
                C1469j.m5703a(this.f12996r, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C2024c.m10829a();
                C2024c.m10832a(this.f12996r, "broadcast", getInstanceId());
            }
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void init(Context context) {
    }

    public void notifyEvent(String str) {
        WebView webView = this.f12996r;
        if (webView != null) {
            BTBaseView.m11042a(webView, str, this.f13093d);
        }
    }

    public void onBackPressed() {
        if (this.f12996r != null) {
            C2024c.m10829a();
            C2024c.m10832a(this.f12996r, "onSystemBackPressed", this.f13093d);
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f12996r != null) {
            try {
                C1781c c1781c = this.f13091b;
                if (c1781c == null || !c1781c.m8886j()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("orientation", configuration.orientation == 2 ? f12995q : f12994p);
                    jSONObject.put("instanceId", this.f13093d);
                    String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                    C1469j.m5701a();
                    C1469j.m5703a(this.f12996r, "orientation", strEncodeToString);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void onDestory() {
    }

    public void setWebView(WebView webView) {
        this.f12996r = webView;
    }
}
