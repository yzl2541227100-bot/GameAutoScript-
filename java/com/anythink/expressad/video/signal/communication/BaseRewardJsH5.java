package com.anythink.expressad.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.C1460a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.anythink.expressad.video.signal.p176a.C2202j;
import org.json.JSONException;
import org.json.JSONObject;
import p285z2.C4003ix;

/* JADX INFO: loaded from: classes.dex */
public class BaseRewardJsH5 implements IRewardBridge {

    /* JADX INFO: renamed from: a */
    public static final String f13970a = "JS-Reward-Brigde";

    /* JADX INFO: renamed from: b */
    public IJSFactory f13971b;

    /* JADX INFO: renamed from: a */
    private static String m11627a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void cai(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                String strOptString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(strOptString)) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "packageName is empty");
                }
                int i = C1886t.m9827a(C1175n.m2059a().m2148f(), strOptString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", CommonJSBridgeImpUtils.f6693b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C1796r.f10844ah, i);
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
                    e.getMessage();
                }
            } catch (JSONException e2) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e2.getLocalizedMessage());
            }
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.f13971b;
            if (iJSFactory != null) {
                String strMo11588a = iJSFactory.getIJSRewardVideoV1().mo11588a();
                C1469j.m5701a().mo5673a(obj, !TextUtils.isEmpty(strMo11588a) ? Base64.encodeToString(strMo11588a.getBytes(), 2) : "");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f6693b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", C4003ix.OooOOO);
            jSONObject.put("data", jSONObject2);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
            e.getMessage();
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f13971b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13971b.getIJSRewardVideoV1().handlerPlayableException(new JSONObject(str).optString("msg"));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f13971b = (IJSFactory) context;
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f13971b = (IJSFactory) obj;
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void install(Object obj, String str) {
        C2202j c2202j;
        Context context;
        try {
            if (this.f13971b != null) {
                if (obj != null) {
                    C1460a c1460a = (C1460a) obj;
                    if ((c1460a.f6757a.getObject() instanceof C2202j) && (c2202j = (C2202j) c1460a.f6757a.getObject()) != null && (context = c1460a.f6757a.getContext()) != null && context != context.getApplicationContext()) {
                        c2202j.mo11553a(context);
                    }
                }
                if (this.f13971b.getJSContainerModule().endCardShowing()) {
                    this.f13971b.getJSCommon().click(3, str);
                } else {
                    this.f13971b.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f13971b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13971b.getIJSRewardVideoV1().notifyCloseBtn(new JSONObject(str).optInt("state"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextM2148f == null) {
            try {
                if ((obj instanceof C1460a) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                    contextM2148f = windVaneWebView.getContext();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        if (contextM2148f == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(C1781c.f10246am);
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                C1350n.m4204a(strOptString);
            } else if (iOptInt == 2) {
                C1350n.m4203a(contextM2148f, strOptString);
            }
        } catch (JSONException e2) {
            e2.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f13971b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13971b.getIJSRewardVideoV1().mo11590b(new JSONObject(str).optString("state"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f13971b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13971b.getIJSRewardVideoV1().toggleCloseBtn(new JSONObject(str).optInt("state"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f13971b == null || TextUtils.isEmpty(str)) {
                return;
            }
            C1469j.m5701a().mo5673a(obj, m11627a(0));
            this.f13971b.getIJSRewardVideoV1().mo11589a(new JSONObject(str).optString("state"));
        } catch (Throwable unused) {
            C1469j.m5701a().mo5673a(obj, m11627a(-1));
        }
    }
}
