package com.anythink.expressad.atsignalcommon.bridge;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p138h.C1886t;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CommonJSBridgeImpUtils {

    /* JADX INFO: renamed from: a */
    public static final String f6692a = "CommonJSBridgeImpUtils";

    /* JADX INFO: renamed from: b */
    public static int f6693b = 0;

    /* JADX INFO: renamed from: c */
    public static int f6694c = 1;

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils$1 */
    public class RunnableC14541 implements Runnable {
        public RunnableC14541() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CommonJSBridgeImpUtils.m5627a(c1781c.m8803K(), c1781c);
            } catch (Throwable th) {
                String str = CommonJSBridgeImpUtils.f6692a;
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5627a(String str, C1781c c1781c) {
        if (C1807f.f11190n == null || TextUtils.isEmpty(c1781c.m10146aZ())) {
            return;
        }
        C1807f.m9397a(str, c1781c, C1807f.f11181e);
    }

    /* JADX INFO: renamed from: b */
    private static void m5628b(String str, C1781c c1781c) {
        if (C1807f.f11190n == null || TextUtils.isEmpty(c1781c.m10146aZ())) {
            return;
        }
        C1807f.m9397a(str, c1781c, C1807f.f11181e);
    }

    public static String buildClickJsonObject(float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C1801a.f11114cc, C1886t.m9821a(C1175n.m2059a().m2148f(), f));
            jSONObject2.put(C1801a.f11115cd, C1886t.m9821a(C1175n.m2059a().m2148f(), f2));
            jSONObject2.put(C1801a.f11117cf, 0);
            jSONObject2.put(C1801a.f11118cg, C1175n.m2059a().m2148f().getResources().getConfiguration().orientation);
            jSONObject2.put(C1801a.f11119ch, C1886t.m9841c(C1175n.m2059a().m2148f()));
            jSONObject.put(C1801a.f11116ce, jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f6694c);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void callbackSuccess(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f6693b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            callbackExcep(obj, e.getMessage());
            e.getMessage();
        }
    }

    public static String codeToJsonString(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void increaseOfferFrequence(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                callbackExcep(obj, "data is empty");
                return;
            }
            C1781c c1781cM8703b = C1781c.m8703b(jSONObjectOptJSONObject);
            if (c1781cM8703b == null) {
                callbackExcep(obj, "data camapign is empty");
            } else {
                updateFrequence(c1781cM8703b);
                callbackSuccess(obj, "");
            }
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }

    public static void updateFrequence(C1781c c1781c) {
        new Thread(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils.1
            public RunnableC14541() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    CommonJSBridgeImpUtils.m5627a(c1781c.m8803K(), c1781c);
                } catch (Throwable th) {
                    String str = CommonJSBridgeImpUtils.f6692a;
                    th.getMessage();
                }
            }
        }).start();
    }
}
