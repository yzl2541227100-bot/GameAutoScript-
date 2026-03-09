package com.anythink.core.common;

import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.p072d.C1396f;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.e */
/* JADX INFO: loaded from: classes.dex */
public class C1197e {

    /* JADX INFO: renamed from: a */
    public static String f3572a = "e";

    /* JADX INFO: renamed from: b */
    public static final String f3573b = "cp_event_callback_info";

    /* JADX INFO: renamed from: c */
    public static final String f3574c = "type_start_load";

    /* JADX INFO: renamed from: a */
    private static JSONObject m2306a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C1396f.a.f6031T, str);
                jSONObject.put("request_id", str2);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2307a(Object obj, String str, C1243h c1243h) {
        if (c1243h == null) {
            return;
        }
        m2308a(obj, str, c1243h.m2677ah(), c1243h.m2670aa(), c1243h.m2678ai());
    }

    /* JADX INFO: renamed from: a */
    private static void m2308a(Object obj, String str, String str2, String str3, String str4) {
        if (obj == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("sendEventCallbackInfo------ enter: placementId: ");
        sb.append(str2);
        sb.append(", \neventType: ");
        sb.append(str);
        sb.append(", cpEventMap: ");
        sb.append(obj);
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                JSONObject jSONObjectM2306a = m2306a(str3, str4);
                if (jSONObjectM2306a != null) {
                    map.put(str, jSONObjectM2306a);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2309a(Map<String, Object> map, String str, String str2, String str3, String str4) {
        if (map == null) {
            return;
        }
        m2308a(map.get(f3573b), str, str2, str3, str4);
    }
}
