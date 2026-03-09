package com.anythink.expressad.videocommon.p179c;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C2333c {

    /* JADX INFO: renamed from: a */
    private String f14506a;

    /* JADX INFO: renamed from: b */
    private int f14507b;

    public C2333c(String str, int i) {
        this.f14506a = str;
        this.f14507b = i;
    }

    /* JADX INFO: renamed from: a */
    public static C2333c m11965a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String strOptString = jSONObject.optString("name");
            int iOptInt = jSONObject.optInt("amount");
            jSONObject.optString("id");
            return new C2333c(strOptString, iOptInt);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, C2333c> m11966a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                map.put(jSONObjectOptJSONObject.optString("id"), new C2333c(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optInt("amount")));
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0001, B:5:0x000f, B:12:0x002a, B:8:0x0017, B:10:0x001d), top: B:17:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.anythink.expressad.videocommon.p179c.C2333c m11967b(java.lang.String r3) {
        /*
            r0 = 0
            com.anythink.expressad.videocommon.e.c r1 = com.anythink.expressad.videocommon.p181e.C2339c.m11994a()     // Catch: java.lang.Exception -> L2f
            com.anythink.expressad.videocommon.e.a r1 = r1.m12002b()     // Catch: java.lang.Exception -> L2f
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L15
            com.anythink.expressad.videocommon.c.c r3 = m11968c()     // Catch: java.lang.Exception -> L2f
        L13:
            r0 = r3
            goto L28
        L15:
            if (r1 == 0) goto L28
            java.util.Map r2 = r1.m11992j()     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L28
            java.util.Map r1 = r1.m11992j()     // Catch: java.lang.Exception -> L2f
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Exception -> L2f
            com.anythink.expressad.videocommon.c.c r3 = (com.anythink.expressad.videocommon.p179c.C2333c) r3     // Catch: java.lang.Exception -> L2f
            goto L13
        L28:
            if (r0 != 0) goto L33
            com.anythink.expressad.videocommon.c.c r0 = m11968c()     // Catch: java.lang.Exception -> L2f
            goto L33
        L2f:
            r3 = move-exception
            r3.printStackTrace()
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.p179c.C2333c.m11967b(java.lang.String):com.anythink.expressad.videocommon.c.c");
    }

    /* JADX INFO: renamed from: c */
    private static C2333c m11968c() {
        return new C2333c("Virtual Item", 1);
    }

    /* JADX INFO: renamed from: a */
    public final String m11969a() {
        return this.f14506a;
    }

    /* JADX INFO: renamed from: a */
    public final void m11970a(int i) {
        this.f14507b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m11971a(String str) {
        this.f14506a = str;
    }

    /* JADX INFO: renamed from: b */
    public final int m11972b() {
        return this.f14507b;
    }

    public String toString() {
        return "Reward{name='" + this.f14506a + "', amount=" + this.f14507b + MessageFormatter.DELIM_STOP;
    }
}
