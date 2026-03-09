package com.anythink.expressad.video.signal.p176a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1868b;
import com.anythink.expressad.foundation.p138h.C1888v;
import com.anythink.expressad.out.C1927b;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2205m extends C2198f {

    /* JADX INFO: renamed from: b */
    private Activity f13960b;

    /* JADX INFO: renamed from: c */
    private AnythinkContainerView f13961c;

    public C2205m(Activity activity, AnythinkContainerView anythinkContainerView) {
        this.f13960b = activity;
        this.f13961c = anythinkContainerView;
    }

    /* JADX INFO: renamed from: a */
    private static String m11621a(List<C1781c> list, String str, String str2, JSONObject jSONObject) {
        try {
            if (list.size() <= 0) {
                return null;
            }
            C1868b c1868b = new C1868b(C1773a.m8548c().m8557e());
            Object objM8705b = C1781c.m8705b(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", objM8705b);
            jSONObject2.put("device", c1868b.mo9675a());
            jSONObject2.put("unit_id", str);
            jSONObject2.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (C1486b.m6002a() != null) {
                C1486b.m6002a();
                String strM6004a = C1486b.m6004a(C1773a.m8548c().m8558f());
                if (!TextUtils.isEmpty(strM6004a)) {
                    JSONObject jSONObject3 = new JSONObject(strM6004a);
                    try {
                        Context contextM8557e = C1773a.m8548c().m8557e();
                        String string = C1888v.m9864b(contextM8557e, "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
                        String string2 = C1888v.m9864b(contextM8557e, "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
                        String string3 = C1888v.m9864b(contextM8557e, "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
                        String string4 = C1888v.m9864b(contextM8557e, "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
                        if (!TextUtils.isEmpty(string)) {
                            jSONObject3.put(C1485b.f7131ct, string);
                        }
                        if (!TextUtils.isEmpty(string2)) {
                            jSONObject3.put(C1485b.f7132cu, string2);
                        }
                        if (!TextUtils.isEmpty(string3)) {
                            jSONObject3.put(C1485b.f7133cv, string3);
                        }
                        if (!TextUtils.isEmpty(string4)) {
                            jSONObject3.put(C1485b.f7135cx, string4);
                        }
                        if (!TextUtils.isEmpty(string4)) {
                            jSONObject3.put(C1485b.f7134cw, string4);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    C1486b.m6002a();
                    String strM6009b = C1486b.m6009b(str);
                    if (!TextUtils.isEmpty(strM6009b)) {
                        jSONObject3.put("ivreward", new JSONObject(strM6009b));
                    }
                    jSONObject2.put("appSetting", jSONObject3);
                }
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m11622a(JSONObject jSONObject, String str) {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            String string = C1888v.m9864b(contextM8557e, "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
            String string2 = C1888v.m9864b(contextM8557e, "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
            String string3 = C1888v.m9864b(contextM8557e, "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
            String string4 = C1888v.m9864b(contextM8557e, "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put(C1485b.f7131ct, string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put(C1485b.f7132cu, string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put(C1485b.f7133cv, string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put(C1485b.f7135cx, string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put(C1485b.f7134cw, string4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private static C2340d m11623c(String str) {
        if (C2339c.m11994a() == null) {
            return null;
        }
        return C2339c.m11994a().m11999a(C1773a.m8548c().m8558f(), str);
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2198f, com.anythink.expressad.video.signal.InterfaceC2312i
    /* JADX INFO: renamed from: a */
    public final String mo11588a() {
        if (this.f13961c == null) {
            super.mo11588a();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f13961c.getCampaign());
                String unitID = this.f13961c.getUnitID();
                String str = C1927b.f11909a + ",3.0.1";
                C2340d c2340dM11999a = C2339c.m11994a() == null ? null : C2339c.m11994a().m11999a(C1773a.m8548c().m8558f(), unitID);
                JSONObject jSONObject = new JSONObject();
                if (c2340dM11999a != null) {
                    jSONObject = c2340dM11999a.m12073R();
                }
                new StringBuilder("getEndScreenInfo success campaign = ").append(this.f13961c.getCampaign());
                return m11621a(arrayList, unitID, str, jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.mo11588a();
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2198f, com.anythink.expressad.video.signal.InterfaceC2312i
    /* JADX INFO: renamed from: a */
    public final void mo11589a(String str) {
        AnythinkContainerView anythinkContainerView;
        super.mo11589a(str);
        try {
            if (this.f13960b == null || TextUtils.isEmpty(str) || !str.equals(C1781c.f10313ca) || (anythinkContainerView = this.f13961c) == null) {
                return;
            }
            anythinkContainerView.triggerCloseBtn(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2198f, com.anythink.expressad.video.signal.InterfaceC2312i
    /* JADX INFO: renamed from: b */
    public final void mo11590b(String str) {
        super.mo11590b(str);
        try {
            if (this.f13960b == null || TextUtils.isEmpty(str)) {
                return;
            }
            if (str.equals("landscape")) {
                this.f13960b.setRequestedOrientation(0);
            } else if (str.equals("portrait")) {
                this.f13960b.setRequestedOrientation(1);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2198f, com.anythink.expressad.video.signal.InterfaceC2312i, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void handlerPlayableException(String str) {
        AnythinkContainerView anythinkContainerView;
        super.handlerPlayableException(str);
        try {
            if (this.f13960b == null || TextUtils.isEmpty(str) || (anythinkContainerView = this.f13961c) == null) {
                return;
            }
            anythinkContainerView.handlerPlayableException(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2198f, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void install(C1781c c1781c) {
        super.install(c1781c);
        AnythinkContainerView anythinkContainerView = this.f13961c;
        if (anythinkContainerView != null) {
            anythinkContainerView.install(c1781c);
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2198f, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void notifyCloseBtn(int i) {
        super.notifyCloseBtn(i);
        AnythinkContainerView anythinkContainerView = this.f13961c;
        if (anythinkContainerView != null) {
            anythinkContainerView.notifyCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2198f, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void orientation(Configuration configuration) {
        super.orientation(configuration);
        try {
            AnythinkContainerView anythinkContainerView = this.f13961c;
            if (anythinkContainerView != null) {
                anythinkContainerView.orientation(configuration);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2198f, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        AnythinkContainerView anythinkContainerView = this.f13961c;
        if (anythinkContainerView != null) {
            anythinkContainerView.toggleCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2198f, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void webviewshow() {
        super.webviewshow();
        try {
            AnythinkContainerView anythinkContainerView = this.f13961c;
            if (anythinkContainerView != null) {
                anythinkContainerView.webviewshow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
