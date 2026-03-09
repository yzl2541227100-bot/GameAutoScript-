package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.atsignalcommon.p083c.C1455a;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.p119a.C1799a;
import com.anythink.expressad.foundation.p120g.p121a.AbstractC1802a;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.octopus.p222ad.widget.ScrollClickView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsFeedBackForH5 extends AbstractC1471l {

    /* JADX INFO: renamed from: a */
    public static final String f6738a = "onFeedbackAlertStatusNotify";

    /* JADX INFO: renamed from: b */
    public static final String f6739b = "status";

    /* JADX INFO: renamed from: c */
    public static final int f6740c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f6741d = 2;

    /* JADX INFO: renamed from: i */
    private static int f6742i = 0;

    /* JADX INFO: renamed from: j */
    private static int f6743j = 1;

    /* JADX INFO: renamed from: h */
    private String f6744h = "AbsFeedBackForH5";

    public void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f6743j);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f6742i);
            jSONObject.put("message", "");
            jSONObject.put("data", new JSONObject());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            callbackExcep(obj, e.getMessage());
            e.getMessage();
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f6742i);
            jSONObject2.put("message", "");
            jSONObject2.put("data", jSONObject);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e) {
            callbackExcep(obj, e.getMessage());
            e.getMessage();
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("width", -1);
                int iOptInt2 = jSONObject.optInt("height", -1);
                int iOptInt3 = jSONObject.optInt("radius", 20);
                int iOptInt4 = jSONObject.optInt(ScrollClickView.DIR_LEFT, -1);
                int iOptInt5 = jSONObject.optInt("top", -1);
                double dOptDouble = jSONObject.optDouble("opacity", 1.0d);
                String strOptString = jSONObject.optString("fontColor", "");
                String strOptString2 = jSONObject.optString("bgColor", "");
                C1799a c1799aM9376a = C1800b.m9367a().m9376a(jSONObject.optString("key", ""));
                Context contextM2148f = C1175n.m2059a().m2148f();
                c1799aM9376a.m9352a(C1886t.m9834b(contextM2148f, iOptInt4), C1886t.m9834b(contextM2148f, iOptInt5), C1886t.m9834b(contextM2148f, iOptInt), C1886t.m9834b(contextM2148f, iOptInt2), C1886t.m9834b(contextM2148f, iOptInt3), (float) dOptDouble, strOptString, strOptString2);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C1460a c1460a = (C1460a) obj;
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("view_visible", 1);
                String strOptString = jSONObject.optString("key", "");
                C1800b c1800bM9367a = C1800b.m9367a();
                int i = iOptInt == 1 ? 8 : 0;
                WindVaneWebView windVaneWebView = c1460a.f6757a;
                C1799a c1799aM9376a = c1800bM9367a.m9376a(strOptString);
                if (c1799aM9376a.m9358c() != null) {
                    c1799aM9376a.m9351a(i);
                    if (i == 0) {
                        c1800bM9367a.m9378a(strOptString, C1175n.m2059a().m2148f(), windVaneWebView, null, null);
                    }
                }
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("view_visible", 1);
                C1799a c1799aM9376a = C1800b.m9367a().m9376a(jSONObject.optString("key", ""));
                if (iOptInt == 1) {
                    c1799aM9376a.m9356b();
                } else {
                    c1799aM9376a.m9350a();
                }
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void getCacheKey(Object obj, String str) {
        try {
            C1455a.m5629a().m5636a(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void startShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optInt("deviceMotionUpdateInterval", 1);
                C1455a.m5629a().m5638a(obj, ((C1460a) obj).f6757a, jSONObject.optString("oldCache", ""), jSONObject.optString(AbstractC1802a.f11164a, ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void stopShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C1455a.m5629a().m5637a(obj, ((C1460a) obj).f6757a, new JSONObject(str).optString(AbstractC1802a.f11164a, ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }
}
