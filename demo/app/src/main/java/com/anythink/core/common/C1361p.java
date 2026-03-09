package com.anythink.core.common;

import android.text.TextUtils;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import com.appsflyer.AppsFlyerLib;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.p */
/* JADX INFO: loaded from: classes.dex */
public class C1361p {

    /* JADX INFO: renamed from: c */
    private static volatile C1361p f5355c;

    /* JADX INFO: renamed from: a */
    private final String f5356a = "1";

    /* JADX INFO: renamed from: b */
    private final String f5357b = "2";

    private C1361p() {
    }

    /* JADX INFO: renamed from: a */
    public static C1361p m4272a() {
        if (f5355c == null) {
            synchronized (C1361p.class) {
                if (f5355c == null) {
                    f5355c = new C1361p();
                }
            }
        }
        return f5355c;
    }

    /* JADX INFO: renamed from: a */
    public static void m4273a(C1243h c1243h) {
        if (c1243h == null) {
            return;
        }
        try {
            C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(c1243h.m2677ah());
            if (c1396fM5139a != null) {
                String strM5043O = c1396fM5139a.m5043O();
                if (TextUtils.isEmpty(strM5043O)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(strM5043O);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("1");
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("token");
                    if (!TextUtils.isEmpty(strOptString)) {
                        String strM3137x = c1243h.m3137x();
                        double dM3024E = c1243h.m3024E() / 1000.0d;
                        String strM3129t = c1243h.m3129t();
                        try {
                            AdjustEvent adjustEvent = new AdjustEvent(strOptString);
                            adjustEvent.setRevenue(dM3024E, strM3137x);
                            adjustEvent.setOrderId(strM3129t);
                            Adjust.trackEvent(adjustEvent);
                        } catch (Throwable unused) {
                        }
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("2");
                if (jSONObjectOptJSONObject2 != null) {
                    int iOptInt = jSONObjectOptJSONObject2.optInt("rtye");
                    HashMap map = new HashMap();
                    map.put("af_order_id", c1243h.m3129t());
                    map.put("af_content_id", c1243h.m2677ah());
                    map.put("af_content_type", c1243h.m2679aj());
                    map.put("af_revenue", Double.valueOf(iOptInt == 2 ? c1243h.m3024E() : c1243h.m3024E() / 1000.0d));
                    map.put("af_currency", "USD");
                    AppsFlyerLib.getInstance().trackEvent(C1175n.m2059a().m2148f(), "af_ad_view", map);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4274a(String str, double d, String str2, String str3) {
        try {
            AdjustEvent adjustEvent = new AdjustEvent(str);
            adjustEvent.setRevenue(d, str2);
            adjustEvent.setOrderId(str3);
            Adjust.trackEvent(adjustEvent);
        } catch (Throwable unused) {
        }
    }
}
