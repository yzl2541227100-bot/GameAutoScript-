package com.anythink.expressad.atsignalcommon.bridge;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.C1460a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p073a.C1405a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class CommonBannerJSBridgeImp implements IBannerJSBridge {

    /* JADX INFO: renamed from: a */
    public static final String f6691a = "CommonBannerJSBridgeImp";

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void cai(Object obj, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "params is null";
        } else {
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
                        return;
                    } catch (Exception e) {
                        CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
                        e.getMessage();
                        return;
                    }
                } catch (JSONException e2) {
                    str2 = "exception: " + e2.getLocalizedMessage();
                }
            } catch (Throwable th) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
                return;
            }
        }
        CommonJSBridgeImpUtils.callbackExcep(obj, str2);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getFileInfo(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getNetstat(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
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
            C1469j.m5701a().mo5673a(obj, CommonJSBridgeImpUtils.codeToJsonString(1));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NativeAdvancedJsUtils.f6626m, C1877k.m9690a());
            String string = jSONObject.toString();
            if (!TextUtils.isEmpty(string)) {
                string = Base64.encodeToString(string.getBytes(), 2);
            }
            C1469j.m5701a().mo5673a(obj, string);
        } catch (Throwable th) {
            th.getMessage();
            C1469j.m5701a().mo5673a(obj, CommonJSBridgeImpUtils.codeToJsonString(1));
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f6693b);
            jSONObject.put("data", new JSONObject());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e.getMessage());
            e.getMessage();
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void increaseOfferFrequence(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                CommonJSBridgeImpUtils.increaseOfferFrequence(obj, new JSONObject(str));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void install(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof C1460a) {
                C1469j.m5701a();
                C1469j.m5704b(((C1460a) obj).f6757a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
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

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void reportUrls(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int iOptInt = jSONObject.optInt("type");
                String strOptString = jSONObject.optString(C1781c.f10246am);
                int iOptInt2 = jSONObject.optInt("report");
                boolean z = true;
                if (iOptInt2 == 0) {
                    Context contextM2148f = C1175n.m2059a().m2148f();
                    if (iOptInt == 0) {
                        z = false;
                    }
                    C1405a.m5185a(contextM2148f, (C1781c) null, "", strOptString, z);
                } else {
                    C1405a.m5186a(C1175n.m2059a().m2148f(), null, "", strOptString, false, iOptInt != 0, iOptInt2);
                }
            }
            C1469j.m5701a().mo5673a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void resetCountdown(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void sendImpressions(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void toggleCloseBtn(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
    }
}
