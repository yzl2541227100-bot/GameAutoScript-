package com.anythink.expressad.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.p081a.C1441a;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.C1460a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.signal.p176a.C2202j;
import org.json.JSONException;
import org.json.JSONObject;
import p285z2.C4003ix;

/* JADX INFO: loaded from: classes.dex */
public class BaseRewardJs extends AbsFeedBackForH5 implements IRewardBridge {

    /* JADX INFO: renamed from: h */
    public static final String f13968h = "JS-Reward-Brigde";

    /* JADX INFO: renamed from: i */
    public IRewardBridge f13969i;

    /* JADX INFO: renamed from: a */
    private static String m11626a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", -1);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
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

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(Object obj, String str) {
        try {
            IRewardBridge iRewardBridge = this.f13969i;
            if (iRewardBridge != null) {
                iRewardBridge.getEndScreenInfo(obj, str);
                return;
            }
            if (obj != null) {
                WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
                if (!(windVaneWebView instanceof WindVaneWebView) || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                ((C1441a) windVaneWebView.getWebViewListener()).mo5575a(obj);
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
            if (this.f13969i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13969i.handlerPlayableException(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.AbstractC1471l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        boolean zIsInstance;
        super.initialize(context, windVaneWebView);
        try {
            zIsInstance = Class.forName("com.anythink.expressad.video.signal.factory.IJSFactory").isInstance(context);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            zIsInstance = false;
        }
        try {
            if (zIsInstance) {
                Class<?> cls = Class.forName("com.anythink.expressad.video.signal.communication.BaseRewardJsH5");
                this.f13969i = (IRewardBridge) cls.newInstance();
                cls.getMethod("initialize", Context.class, WindVaneWebView.class).invoke(this.f13969i, context, windVaneWebView);
            } else {
                if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof IRewardBridge)) {
                    return;
                }
                this.f13969i = (IRewardBridge) windVaneWebView.getObject();
            }
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.AbstractC1471l
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        boolean zIsInstance;
        super.initialize(obj, windVaneWebView);
        try {
            zIsInstance = Class.forName("com.anythink.expressad.video.signal.factory.IJSFactory").isInstance(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            zIsInstance = false;
        }
        try {
            if (zIsInstance) {
                Class<?> cls = Class.forName("com.anythink.expressad.video.signal.communication.BaseRewardJsH5");
                this.f13969i = (IRewardBridge) cls.newInstance();
                cls.getMethod("initialize", Object.class, WindVaneWebView.class).invoke(this.f13969i, obj, windVaneWebView);
            } else {
                if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof IRewardBridge)) {
                    return;
                }
                this.f13969i = (IRewardBridge) windVaneWebView.getObject();
            }
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void install(Object obj, String str) {
        try {
            IRewardBridge iRewardBridge = this.f13969i;
            if (iRewardBridge != null) {
                iRewardBridge.install(obj, str);
                return;
            }
            if (TextUtils.isEmpty(str) || obj == null) {
                return;
            }
            C1460a c1460a = (C1460a) obj;
            if (c1460a.f6757a.getObject() instanceof C2202j) {
                C2202j c2202j = (C2202j) c1460a.f6757a.getObject();
                Context context = c1460a.f6757a.getContext();
                if (context != null && context != context.getApplicationContext()) {
                    c2202j.mo11553a(context);
                }
                c2202j.click(1, str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f13969i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13969i.notifyCloseBtn(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void openURL(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(C1781c.f10246am);
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                C1350n.m4204a(strOptString);
            } else if (iOptInt == 2) {
                C1350n.m4203a(this.f6784e, strOptString);
            }
        } catch (JSONException e) {
            e.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f13969i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13969i.setOrientation(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f13969i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13969i.toggleCloseBtn(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f13969i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13969i.triggerCloseBtn(obj, str);
        } catch (Throwable unused) {
            C1469j.m5701a().mo5673a(obj, m11626a());
        }
    }
}
