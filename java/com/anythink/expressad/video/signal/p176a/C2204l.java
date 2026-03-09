package com.anythink.expressad.video.signal.p176a;

import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.module.AnythinkVideoView;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2204l extends C2197e {

    /* JADX INFO: renamed from: n */
    private static final String f13952n = "onVideoStatusNotify";

    /* JADX INFO: renamed from: o */
    private static final String f13953o = "onJSClick";

    /* JADX INFO: renamed from: p */
    private static final String f13954p = "onVideoProgressNotify";

    /* JADX INFO: renamed from: q */
    private static final String f13955q = "webviewshow";

    /* JADX INFO: renamed from: r */
    private static final String f13956r = "showDataInfo";

    /* JADX INFO: renamed from: s */
    private static final String f13957s = "portrait";

    /* JADX INFO: renamed from: t */
    private static final String f13958t = "landscape";

    /* JADX INFO: renamed from: u */
    private WebView f13959u;

    public C2204l(WebView webView) {
        this.f13959u = webView;
    }

    /* JADX INFO: renamed from: a */
    private static String m11620a(int i, int i2) {
        if (i2 != 0) {
            double d = i / i2;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(C1886t.m9818a(Double.valueOf(d)));
                return sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i2);
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2197e, com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public final void mo11582a() {
        super.mo11582a();
        C1469j.m5701a();
        C1469j.m5702a(this.f13959u);
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2197e, com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public final void mo11583a(int i) {
        super.mo11583a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a(this.f13959u, f13952n, strEncodeToString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2197e, com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public final void mo11584a(int i, int i2, int i3, int i4) {
        super.mo11584a(i, i2, i3, i4);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = f13958t;
            if (i != 2 ? i2 != 2 : i2 == 1) {
                str = f13957s;
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i3);
            jSONObject2.put("screen_height", i4);
            jSONObject.put("data", jSONObject2);
            String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a(this.f13959u, f13956r, strEncodeToString);
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2197e, com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public final void mo11585a(int i, String str) {
        super.mo11585a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a(this.f13959u, f13953o, strEncodeToString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2197e, com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public final void mo11586a(AnythinkVideoView.C2172a c2172a) {
        super.mo11586a(c2172a);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, m11620a(c2172a.f13780a, c2172a.f13781b));
            jSONObject.put("time", String.valueOf(c2172a.f13780a));
            jSONObject.put("duration", String.valueOf(c2172a.f13781b));
            String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a(this.f13959u, f13954p, strEncodeToString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2197e, com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public final void mo11587a(Object obj) {
        super.mo11587a(obj);
        String strEncodeToString = (obj == null || !(obj instanceof String)) ? "" : Base64.encodeToString(obj.toString().getBytes(), 2);
        C1469j.m5701a();
        C1469j.m5703a(this.f13959u, "webviewshow", strEncodeToString);
    }
}
