package com.anythink.expressad.video.signal.communication;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.p081a.C1441a;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.C1460a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.video.p154bt.p155a.C2023b;
import com.anythink.expressad.video.p154bt.p155a.C2024c;
import com.anythink.expressad.video.signal.InterfaceC2209c;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.anythink.expressad.video.signal.p176a.C2202j;
import com.anythink.expressad.videocommon.p181e.C2339c;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;
import p285z2.C4003ix;

/* JADX INFO: loaded from: classes.dex */
public class BaseVideoBridge extends AbsFeedBackForH5 implements IVideoBridge {

    /* JADX INFO: renamed from: h */
    public static final String f13972h = "JS-Video-Brigde";

    /* JADX INFO: renamed from: j */
    private static final int f13973j = 1;

    /* JADX INFO: renamed from: k */
    private static final int f13974k = 2;

    /* JADX INFO: renamed from: l */
    private static final String f13975l = "showTransparent";

    /* JADX INFO: renamed from: m */
    private static final String f13976m = "mute";

    /* JADX INFO: renamed from: n */
    private static final String f13977n = "closeType";

    /* JADX INFO: renamed from: o */
    private static final String f13978o = "orientationType";

    /* JADX INFO: renamed from: p */
    private static final String f13979p = "type";

    /* JADX INFO: renamed from: q */
    private static final String f13980q = "h5cbp";

    /* JADX INFO: renamed from: r */
    private static final String f13981r = "webfront";

    /* JADX INFO: renamed from: s */
    private static final String f13982s = "showAlertRole";

    /* JADX INFO: renamed from: i */
    public IJSFactory f13983i;

    /* JADX INFO: renamed from: a */
    private static String m11628a(int i) {
        switch (i) {
            case 1:
                return ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO;
            case 2:
                return "unit_id";
            case 3:
                return "appSetting";
            case 4:
                return "unitSetting";
            case 5:
                return "device";
            case 6:
                return "sdkSetting";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m11629a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("message", "params is null");
                C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m11630b(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void appendSubView(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10875i(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("appendSubView error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void appendViewTo(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10876j(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("appendViewTo error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void bringViewToFront(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10879m(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("bringViewToFront error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void broadcast(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10863M(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("broadcast error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
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

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void clearAllCache(Object obj, String str) {
        try {
            C1175n.m2059a().m2148f().getSharedPreferences(C1801a.f11150p, 0).edit().clear().apply();
            if (obj != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put("message", "Success");
                C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            new StringBuilder("getAllCache error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void click(Object obj, String str) {
        String strOptString;
        int iOptInt;
        C2202j c2202j;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                iOptInt = jSONObject.optInt("type");
                strOptString = jSONObject.optString("pt");
            } catch (JSONException e) {
                e.printStackTrace();
                strOptString = "";
                iOptInt = 1;
            }
            IJSFactory iJSFactory = this.f13983i;
            if (iJSFactory != null) {
                iJSFactory.getJSCommon().click(iOptInt, strOptString);
                return;
            }
            if (obj != null) {
                C1460a c1460a = (C1460a) obj;
                if (!(c1460a.f6757a.getObject() instanceof C2202j) || (c2202j = (C2202j) c1460a.f6757a.getObject()) == null) {
                    return;
                }
                c2202j.click(iOptInt, strOptString);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeAd(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10862L(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("closeAd error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeVideoOperte(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(C1781c.f10318cf);
            int iOptInt2 = jSONObject.optInt("view_visible");
            StringBuilder sb = new StringBuilder("closeVideoOperte,close:");
            sb.append(iOptInt);
            sb.append(",viewVisible:");
            sb.append(iOptInt2);
            this.f13983i.getJSVideoModule().closeVideoOperate(iOptInt, iOptInt2);
            C1469j.m5701a().mo5673a(obj, m11630b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void closeWeb(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("status");
            this.f13983i.getJSContainerModule().hideAlertWebview();
            this.f13983i.getJSVideoModule().hideAlertView(iOptInt);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createNativeEC(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10866Q(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("createNativeEC error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createPlayerView(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10870c(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("createPlayerView error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createSubPlayTemplateView(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10871d(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("createSubPlayTemplateView error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createView(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10867a(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("createWebview error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void createWebview(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10869b(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("createWebview error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void destroyComponent(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10872e(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("destroyComponent error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getAllCache(Object obj, String str) {
        JSONObject jSONObject;
        Throwable th;
        String str2;
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = C1175n.m2059a().m2148f().getSharedPreferences(C1801a.f11150p, 0);
            jSONObject = new JSONObject();
        } catch (Throwable th2) {
            jSONObject = null;
            th = th2;
        }
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            str2 = "getAllCache Success";
        } catch (Throwable th3) {
            th = th3;
            new StringBuilder("getAllCache error ").append(th);
            str2 = "getAllCache Error, reason is : " + th.getMessage();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 0);
            jSONObject2.put("message", str2);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            } else {
                jSONObject2.put("data", MessageFormatter.DELIM_STR);
            }
            if (obj != null) {
                C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
        } catch (Throwable th4) {
            new StringBuilder("getAllCache error ").append(th4);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getAppSetting(Object obj, String str) {
        String str2;
        JSONObject jSONObject;
        try {
            String strOptString = new JSONObject(str).optString("appid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("code", 1);
                str2 = "Get App Setting error, because must give a appId.";
            } else {
                C1486b.m6002a();
                String strM6004a = C1486b.m6004a(strOptString);
                if (TextUtils.isEmpty(strM6004a)) {
                    C1486b.m6002a();
                    jSONObject = new JSONObject(C1486b.m6010c().m5944R());
                } else {
                    jSONObject = new JSONObject(strM6004a);
                    jSONObject.put("isDefault", 0);
                }
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", "Success");
                    jSONObject2.put("data", jSONObject);
                    C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                }
                jSONObject2.put("code", 1);
                str2 = "Get App Setting error, plz try again later.";
            }
            jSONObject2.put("message", str2);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            new StringBuilder("getAppSetting error : ").append(th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getComponentOptions(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a();
            C2024c.m10849f(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("getComponentOptions error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getCurrentProgress(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.f13983i;
            if (iJSFactory != null) {
                String currentProgress = iJSFactory.getJSVideoModule().getCurrentProgress();
                if (!TextUtils.isEmpty(currentProgress)) {
                    currentProgress = Base64.encodeToString(currentProgress.getBytes(), 2);
                }
                C1469j.m5701a().mo5673a(obj, currentProgress);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getCutout(Object obj, String str) {
        try {
            String strMo11581o = this.f13983i.getJSCommon().mo11581o();
            if (obj != null && !TextUtils.isEmpty(strMo11581o)) {
                C1469j.m5701a().mo5673a(obj, Base64.encodeToString(strMo11581o.getBytes(), 2));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("message", "No notch data, plz try again later.");
            C1469j.m5701a().mo5675b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            new StringBuilder("getCutout error : ").append(th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getEncryptPrice(Object obj, String str) {
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getFileInfo(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a();
            C2024c.m10826P(obj, new JSONObject(str));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getRewardSetting(Object obj, String str) {
        try {
            Object objM11993k = C2339c.m11994a().m12002b().m11993k();
            JSONObject jSONObject = new JSONObject();
            String str2 = "message";
            if (obj != null) {
                jSONObject.put("code", 0);
                jSONObject.put("message", "Success");
                str2 = "data";
            } else {
                jSONObject.put("code", 1);
                objM11993k = "Get Reward Setting error, plz try again later.";
            }
            jSONObject.put(str2, objM11993k);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            new StringBuilder("getRewardSetting error : ").append(th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getRewardUnitSetting(Object obj, String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("appid", "");
            String strOptString2 = jSONObject.optString("unitid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                jSONObject2.put("code", 1);
                str2 = "Get reward unit Setting error, because must give appId and unitId.";
            } else {
                JSONObject jSONObjectM12073R = C2339c.m11994a().m11999a(strOptString, strOptString2).m12073R();
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", "Success");
                    jSONObject2.put("data", jSONObjectM12073R);
                    C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                }
                jSONObject2.put("code", 1);
                str2 = "Get Reward Unit Setting error, plz try again later.";
            }
            jSONObject2.put("message", str2);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            new StringBuilder("getRewardUnitSetting error : ").append(th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getSDKInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                C1469j.m5701a().mo5675b(obj, "params is null");
                return;
            }
            JSONArray jSONArray = new JSONObject(str).getJSONArray("type");
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            if (this.f13983i != null) {
                while (i < jSONArray.length()) {
                    int i2 = jSONArray.getInt(i);
                    jSONObject.put(m11628a(i2), this.f13983i.getJSCommon().mo11572h(i2));
                    i++;
                }
            } else if (obj != null) {
                while (i < jSONArray.length()) {
                    int i3 = jSONArray.getInt(i);
                    C1460a c1460a = (C1460a) obj;
                    if (c1460a.f6757a.getObject() instanceof C2202j) {
                        jSONObject.put(m11628a(i3), ((C2202j) c1460a.f6757a.getObject()).mo11572h(i3));
                    }
                    i++;
                }
            }
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
            C1469j.m5701a().mo5675b(obj, "exception");
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void getUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("message", "Get Unit Setting error, RV/IV can not support this method.");
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            new StringBuilder("getUnitSetting error : ").append(th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
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

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void handleNativeObject(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2023b.m10819a().m10821a(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("handleNativeObject error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void handlerH5Exception(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.f13983i.getJSCommon().handlerH5Exception(jSONObject.optInt("code", C2024c.f12852a), jSONObject.optString("message", "h5 error"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void hideView(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10880n(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("hideView error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void increaseOfferFrequence(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a();
            new JSONObject(str);
            C2024c.m10833a(obj);
        } catch (Throwable th) {
            new StringBuilder("increaseOfferFrequence error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void init(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.f13983i;
            int i = 1;
            if (iJSFactory != null) {
                String strMo11574i = iJSFactory.getJSCommon().mo11574i();
                if (!TextUtils.isEmpty(strMo11574i)) {
                    strMo11574i = Base64.encodeToString(strMo11574i.getBytes(), 2);
                }
                C1469j.m5701a().mo5673a(obj, strMo11574i);
                this.f13983i.getJSCommon().mo11573h();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt(f13975l);
                int iOptInt2 = jSONObject.optInt("mute");
                int iOptInt3 = jSONObject.optInt(f13977n);
                int iOptInt4 = jSONObject.optInt(f13978o);
                int iOptInt5 = jSONObject.optInt(f13980q);
                int iOptInt6 = jSONObject.optInt(f13981r);
                int iOptInt7 = jSONObject.optInt(f13982s);
                this.f13983i.getJSCommon().mo11557a(iOptInt == 1);
                this.f13983i.getJSCommon().mo11560b(iOptInt2);
                this.f13983i.getJSCommon().mo11563c(iOptInt3);
                this.f13983i.getJSCommon().mo11565d(iOptInt4);
                this.f13983i.getJSCommon().mo11567e(iOptInt5);
                this.f13983i.getJSCommon().mo11569f(iOptInt6);
                InterfaceC2209c jSCommon = this.f13983i.getJSCommon();
                if (iOptInt7 != 0) {
                    i = iOptInt7;
                }
                jSCommon.mo11575i(i);
                return;
            }
            if (obj != null) {
                C1460a c1460a = (C1460a) obj;
                if (c1460a.f6757a.getObject() instanceof C2202j) {
                    C2202j c2202j = (C2202j) c1460a.f6757a.getObject();
                    String strMo11574i2 = c2202j.mo11574i();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        int iOptInt8 = jSONObject2.optInt(f13975l);
                        int iOptInt9 = jSONObject2.optInt("mute");
                        int iOptInt10 = jSONObject2.optInt(f13977n);
                        int iOptInt11 = jSONObject2.optInt(f13978o);
                        int iOptInt12 = jSONObject2.optInt(f13980q);
                        int iOptInt13 = jSONObject2.optInt(f13981r);
                        int iOptInt14 = jSONObject2.optInt(f13982s);
                        c2202j.mo11557a(iOptInt8 == 1);
                        c2202j.mo11560b(iOptInt9);
                        c2202j.mo11563c(iOptInt10);
                        c2202j.mo11565d(iOptInt11);
                        c2202j.mo11567e(iOptInt12);
                        c2202j.mo11569f(iOptInt13);
                        if (iOptInt14 != 0) {
                            i = iOptInt14;
                        }
                        c2202j.mo11575i(i);
                    }
                    C1469j.m5701a().mo5673a(obj, Base64.encodeToString(strMo11574i2.getBytes(), 2));
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.AbstractC1471l
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        if (obj instanceof IJSFactory) {
            this.f13983i = (IJSFactory) obj;
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void insertViewAbove(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10885s(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("insertViewAbove error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void insertViewBelow(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10886t(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("insertViewBelow error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void isSystemResume(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.f13983i;
            if (iJSFactory != null) {
                C1469j.m5701a().mo5673a(obj, m11630b(iJSFactory.getActivityProxy().mo11548h()));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13983i.getJSContainerModule().ivRewardAdsWithoutVideo(str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void loadads(Object obj, String str) {
        String strOptString;
        int iOptInt;
        int iOptInt2;
        try {
            if (TextUtils.isEmpty(str)) {
                strOptString = "";
                iOptInt = 1;
                iOptInt2 = 1;
            } else {
                JSONObject jSONObject = new JSONObject(str);
                strOptString = jSONObject.optString("unitId");
                iOptInt2 = jSONObject.optInt("type", 1);
                if (iOptInt2 > 2) {
                    iOptInt2 = 1;
                }
                iOptInt = jSONObject.optInt("adtype", 1);
            }
            if (TextUtils.isEmpty(strOptString)) {
                C1469j.m5701a().mo5673a(obj, m11630b(1));
                return;
            }
            if (obj != null) {
                WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
                if ((windVaneWebView instanceof WindVaneWebView) && windVaneWebView.getWebViewListener() != null) {
                    ((C1441a) windVaneWebView.getWebViewListener()).mo5577a(strOptString, iOptInt2, iOptInt);
                }
            }
            C1469j.m5701a().mo5673a(obj, m11630b(0));
        } catch (Throwable unused) {
            C1469j.m5701a().mo5673a(obj, m11630b(1));
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void loadingResourceStatus(Object obj, String str) {
        m11629a(obj, str);
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().loadingResourceStatus(windVaneWebView, iOptInt);
            } catch (Throwable th) {
                new StringBuilder("loadingResourceStatus error ").append(th);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13983i.getJSVideoModule().notifyCloseBtn(new JSONObject(str).optInt("state"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyAppendSubView(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10877k(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("appendSubView error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyAppendViewTo(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10878l(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("appendViewTo error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyInsertViewAbove(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10887u(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("insertViewAbove error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void onlyInsertViewBelow(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10888v(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("insertViewBelow error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void openURL(Object obj, String str) {
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

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playVideoFinishOperate(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13983i.getJSCommon().mo11570g(new JSONObject(str).optInt("type"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerGetMuteState(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10860H(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("playerGetMuteState error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerMute(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10858F(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("playerMute error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerPause(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10855B(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("playerPause error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerPlay(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10854A(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("playerPlay error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerResume(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10856C(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("playerResume error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerSetRenderType(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a();
            C2024c.m10825J(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("playerSetRenderType error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerSetSource(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a();
            C2024c.m10824I(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("playerSetSource error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerStop(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10857D(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("playerStop error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerUnmute(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10859G(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("playerUnmute error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void playerUpdateFrame(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a();
            C2024c.m10823E(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("playerUpdateFrame error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void preloadSubPlayTemplateView(Object obj, String str) {
        m11629a(obj, str);
        try {
            if (this.f13983i != null) {
                C2024c.m10829a().m10861K(obj, new JSONObject(str));
                return;
            }
            WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
            if (!(windVaneWebView instanceof WindVaneWebView) || windVaneWebView.getWebViewListener() == null) {
                return;
            }
            ((C1441a) windVaneWebView.getWebViewListener()).mo5576a(obj, str);
        } catch (Throwable th) {
            new StringBuilder("preloadSubPlayTemplateView error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void progressBarOperate(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13983i.getJSVideoModule().progressBarOperate(new JSONObject(str).optInt("view_visible"));
            C1469j.m5701a().mo5673a(obj, m11630b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void progressOperate(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_PROGRESS);
            int iOptInt2 = jSONObject.optInt("view_visible");
            StringBuilder sb = new StringBuilder("progressOperate,progress:");
            sb.append(iOptInt);
            sb.append(",viewVisible:");
            sb.append(iOptInt2);
            this.f13983i.getJSVideoModule().progressOperate(iOptInt, iOptInt2);
            C1469j.m5701a().mo5673a(obj, m11630b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void reactDeveloper(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                C1469j.m5701a().mo5675b(obj, m11630b(1));
            } else {
                this.f13983i.getJSBTModule().reactDeveloper(obj, str);
            }
        } catch (Throwable th) {
            new StringBuilder("reactDeveloper error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                C1460a c1460a = (C1460a) obj;
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                if (c1460a.f6757a.getObject() instanceof C2202j) {
                    ((C2202j) c1460a.f6757a.getObject()).m11616j(iOptInt);
                }
                WindVaneWebView windVaneWebView = c1460a.f6757a;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, iOptInt);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void removeCacheItem(java.lang.Object r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.anythink.core.common.b.n r2 = com.anythink.core.common.p051b.C1175n.m2059a()     // Catch: java.lang.Throwable -> L39
            android.content.Context r2 = r2.m2148f()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "anythink_h5_cachesp"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)     // Catch: java.lang.Throwable -> L39
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L36
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L39
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L39
            java.lang.String r7 = "key"
            java.lang.String r7 = r3.getString(r7)     // Catch: java.lang.Throwable -> L39
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L32
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L39
            android.content.SharedPreferences$Editor r7 = r2.remove(r7)     // Catch: java.lang.Throwable -> L39
            r7.apply()     // Catch: java.lang.Throwable -> L39
        L32:
            java.lang.String r7 = "Delete Success"
            r2 = 1
            goto L57
        L36:
            java.lang.String r7 = ""
            goto L56
        L39:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "removeCacheItem error "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Delete Error, reason is : "
            r2.<init>(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
        L56:
            r2 = 0
        L57:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L95
            r3.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r4 = "code"
            if (r2 == 0) goto L61
            r0 = 0
        L61:
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = "message"
            r3.put(r0, r7)     // Catch: java.lang.Throwable -> L95
            r7 = 2
            if (r6 == 0) goto L82
            if (r2 == 0) goto L82
            com.anythink.expressad.atsignalcommon.windvane.j r0 = com.anythink.expressad.atsignalcommon.windvane.C1469j.m5701a()     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L95
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = android.util.Base64.encodeToString(r1, r7)     // Catch: java.lang.Throwable -> L95
            r0.mo5673a(r6, r7)     // Catch: java.lang.Throwable -> L95
            return
        L82:
            com.anythink.expressad.atsignalcommon.windvane.j r0 = com.anythink.expressad.atsignalcommon.windvane.C1469j.m5701a()     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L95
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = android.util.Base64.encodeToString(r1, r7)     // Catch: java.lang.Throwable -> L95
            r0.mo5675b(r6, r7)     // Catch: java.lang.Throwable -> L95
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.signal.communication.BaseVideoBridge.removeCacheItem(java.lang.Object, java.lang.String):void");
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void removeFromSuperView(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10874h(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("removeFromSuperView error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void reportUrls(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                C1469j.m5701a().mo5675b(obj, m11630b(1));
            } else {
                C2024c.m10829a();
                C2024c.m10843b(obj, str);
            }
        } catch (Throwable th) {
            new StringBuilder("reportUrls error ").append(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCacheItem(java.lang.Object r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.anythink.core.common.b.n r2 = com.anythink.core.common.p051b.C1175n.m2059a()     // Catch: java.lang.Throwable -> L45
            android.content.Context r2 = r2.m2148f()     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "anythink_h5_cachesp"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)     // Catch: java.lang.Throwable -> L45
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto L42
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L45
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = "key"
            java.lang.String r7 = r3.getString(r7)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "value"
            java.lang.String r3 = r3.getString(r4)     // Catch: java.lang.Throwable -> L45
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L3e
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L3e
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L45
            android.content.SharedPreferences$Editor r7 = r2.putString(r7, r3)     // Catch: java.lang.Throwable -> L45
            r7.apply()     // Catch: java.lang.Throwable -> L45
        L3e:
            java.lang.String r7 = "Save Success"
            r2 = 1
            goto L63
        L42:
            java.lang.String r7 = ""
            goto L62
        L45:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "setCacheItem error "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Save Error, reason is : "
            r2.<init>(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
        L62:
            r2 = 0
        L63:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La1
            r3.<init>()     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = "code"
            if (r2 == 0) goto L6d
            r0 = 0
        L6d:
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = "message"
            r3.put(r0, r7)     // Catch: java.lang.Throwable -> La1
            r7 = 2
            if (r6 == 0) goto L8e
            if (r2 == 0) goto L8e
            com.anythink.expressad.atsignalcommon.windvane.j r0 = com.anythink.expressad.atsignalcommon.windvane.C1469j.m5701a()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> La1
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> La1
            java.lang.String r7 = android.util.Base64.encodeToString(r1, r7)     // Catch: java.lang.Throwable -> La1
            r0.mo5673a(r6, r7)     // Catch: java.lang.Throwable -> La1
            return
        L8e:
            com.anythink.expressad.atsignalcommon.windvane.j r0 = com.anythink.expressad.atsignalcommon.windvane.C1469j.m5701a()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> La1
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> La1
            java.lang.String r7 = android.util.Base64.encodeToString(r1, r7)     // Catch: java.lang.Throwable -> La1
            r0.mo5675b(r6, r7)     // Catch: java.lang.Throwable -> La1
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.signal.communication.BaseVideoBridge.setCacheItem(java.lang.Object, java.lang.String):void");
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setScaleFitXY(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13983i.getJSVideoModule().setScaleFitXY(new JSONObject(str).optInt("fitxy"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setSubPlayTemplateInfo(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10864N(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("setSubPlayTemplateInfo error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewAlpha(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10883q(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("setViewAlpha error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewBgColor(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10882p(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("setViewBgColor error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewRect(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10873g(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("setViewRect error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void setViewScale(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10884r(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("setViewScale error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showAlertView(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13983i.getJSVideoModule().showIVRewardAlertView(str);
            C1469j.m5701a().mo5674a(obj, "showAlertView", "");
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showVideoClickView(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13983i.getJSContainerModule().showVideoClickView(new JSONObject(str).optInt("type"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showVideoLocation(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("margin_top", 0);
            int iOptInt2 = jSONObject.optInt("margin_left", 0);
            int iOptInt3 = jSONObject.optInt("view_width", 0);
            int iOptInt4 = jSONObject.optInt("view_height", 0);
            int iOptInt5 = jSONObject.optInt("radius", 0);
            int iOptInt6 = jSONObject.optInt("border_top", 0);
            int iOptInt7 = jSONObject.optInt("border_left", 0);
            int iOptInt8 = jSONObject.optInt("border_width", 0);
            int iOptInt9 = jSONObject.optInt("border_height", 0);
            StringBuilder sb = new StringBuilder("showVideoLocation,margin_top:");
            sb.append(iOptInt);
            sb.append(",marginLeft:");
            sb.append(iOptInt2);
            sb.append(",viewWidth:");
            sb.append(iOptInt3);
            sb.append(",viewHeight:");
            sb.append(iOptInt4);
            sb.append(",radius:");
            sb.append(iOptInt5);
            sb.append(",borderTop: ");
            sb.append(iOptInt6);
            sb.append(",borderLeft: ");
            sb.append(iOptInt7);
            sb.append(",borderWidth: ");
            sb.append(iOptInt8);
            sb.append(",borderHeight: ");
            sb.append(iOptInt9);
            this.f13983i.getJSVideoModule().showVideoLocation(iOptInt, iOptInt2, iOptInt3, iOptInt4, iOptInt5, iOptInt6, iOptInt7, iOptInt8, iOptInt9);
            this.f13983i.getJSCommon().mo11578l();
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void showView(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10881o(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("showView error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void soundOperate(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("mute");
            int iOptInt2 = jSONObject.optInt("view_visible");
            String strOptString = jSONObject.optString("pt", "");
            StringBuilder sb = new StringBuilder("soundOperate,mute:");
            sb.append(iOptInt);
            sb.append(",viewVisible:");
            sb.append(iOptInt2);
            sb.append(",pt:");
            sb.append(strOptString);
            if (TextUtils.isEmpty(strOptString)) {
                this.f13983i.getJSVideoModule().soundOperate(iOptInt, iOptInt2);
            } else {
                this.f13983i.getJSVideoModule().soundOperate(iOptInt, iOptInt2, strOptString);
            }
            C1469j.m5701a().mo5673a(obj, m11630b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void statistics(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.f13983i.getJSCommon().mo11551a(jSONObject.optInt("type"), jSONObject.optString("data"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            int i = 2;
            if (iOptInt != 1) {
                i = iOptInt == 2 ? 1 : 0;
            }
            this.f13983i.getJSVideoModule().closeVideoOperate(0, i);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str) || !new JSONObject(str).optString("state").equals(C1781c.f10313ca)) {
                return;
            }
            this.f13983i.getJSVideoModule().closeVideoOperate(1, -1);
            C1469j.m5701a().mo5673a(obj, m11630b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void videoOperate(Object obj, String str) {
        try {
            if (this.f13983i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f13983i.getJSVideoModule().videoOperate(new JSONObject(str).optInt("pause_or_resume"));
            C1469j.m5701a().mo5673a(obj, m11630b(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewFireEvent(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10865O(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("setSubPlayTemplateInfo error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewGoBack(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10891y(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("webviewGoBack error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewGoForward(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10892z(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("webviewGoForward error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewLoad(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10889w(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("webviewLoad error ").append(th);
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IVideoBridge
    public void webviewReload(Object obj, String str) {
        m11629a(obj, str);
        try {
            C2024c.m10829a().m10890x(obj, new JSONObject(str));
        } catch (Throwable th) {
            new StringBuilder("webviewReload error ").append(th);
        }
    }
}
