package com.anythink.expressad.video.signal.p176a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2200h extends C2193a {

    /* JADX INFO: renamed from: g */
    private static final String f13926g = "orientation";

    /* JADX INFO: renamed from: h */
    private static final String f13927h = "onSystemPause";

    /* JADX INFO: renamed from: i */
    private static final String f13928i = "onSystemResume";

    /* JADX INFO: renamed from: j */
    private static final String f13929j = "onSystemDestory";

    /* JADX INFO: renamed from: k */
    private static final String f13930k = "onSystemBackPressed";

    /* JADX INFO: renamed from: l */
    private static final String f13931l = "portrait";

    /* JADX INFO: renamed from: m */
    private static final String f13932m = "landscape";

    /* JADX INFO: renamed from: n */
    private WebView f13933n;

    /* JADX INFO: renamed from: o */
    private int f13934o = 0;

    public C2200h(WebView webView) {
        this.f13933n = webView;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2193a, com.anythink.expressad.video.signal.InterfaceC2192a
    /* JADX INFO: renamed from: a */
    public final void mo11539a() {
        super.mo11539a();
        this.f13934o = 1;
        C1469j.m5701a();
        C1469j.m5703a(this.f13933n, "onSystemPause", "");
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2193a, com.anythink.expressad.video.signal.InterfaceC2192a
    /* JADX INFO: renamed from: a */
    public final void mo11540a(int i) {
        super.mo11540a(i);
        this.f13934o = i;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2193a, com.anythink.expressad.video.signal.InterfaceC2192a
    /* JADX INFO: renamed from: a */
    public final void mo11541a(Configuration configuration) {
        super.mo11541a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", configuration.orientation == 2 ? f13932m : f13931l);
            String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a(this.f13933n, "orientation", strEncodeToString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2193a, com.anythink.expressad.video.signal.InterfaceC2192a
    /* JADX INFO: renamed from: b */
    public final void mo11542b() {
        super.mo11542b();
        this.f13934o = 0;
        C1469j.m5701a();
        C1469j.m5703a(this.f13933n, "onSystemResume", "");
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2193a, com.anythink.expressad.video.signal.InterfaceC2192a
    /* JADX INFO: renamed from: c */
    public final void mo11543c() {
        super.mo11543c();
        C1469j.m5701a();
        C1469j.m5703a(this.f13933n, "onSystemDestory", "");
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2193a, com.anythink.expressad.video.signal.InterfaceC2192a
    /* JADX INFO: renamed from: g */
    public final void mo11547g() {
        super.mo11547g();
        C1469j.m5701a();
        C1469j.m5703a(this.f13933n, f13930k, "");
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2193a, com.anythink.expressad.video.signal.InterfaceC2192a
    /* JADX INFO: renamed from: h */
    public final int mo11548h() {
        return this.f13934o;
    }
}
