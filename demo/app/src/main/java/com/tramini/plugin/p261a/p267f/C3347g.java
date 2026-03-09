package com.tramini.plugin.p261a.p267f;

import com.tramini.plugin.p261a.p265d.C3333a;
import com.tramini.plugin.p261a.p265d.C3335c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.f.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C3347g extends C3346f {
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[Catch: all -> 0x0112, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0112, blocks: (B:21:0x007b, B:23:0x0081, B:45:0x00bf, B:25:0x0086, B:27:0x008c), top: B:90:0x007b }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.tramini.plugin.p261a.p265d.C3333a m15262a(java.lang.Object r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, org.json.JSONObject r26, org.json.JSONArray r27) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.p261a.p267f.C3347g.m15262a(java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, org.json.JSONArray):com.tramini.plugin.a.d.a");
    }

    /* JADX INFO: renamed from: a */
    public static C3333a m15263a(JSONObject jSONObject, C3335c c3335c, String str) {
        return m15262a(C3346f.m15232a(jSONObject.optString("in_na"), str), "", jSONObject.optString("pre"), jSONObject.optString("mena"), jSONObject.optString("agu"), jSONObject.optString("agu_v2"), jSONObject.optString("agu_v3"), jSONObject, c3335c.f18113e);
    }

    /* JADX INFO: renamed from: a */
    private static String m15264a(String str, JSONObject jSONObject) {
        String[] strArrSplit;
        int i;
        try {
            strArrSplit = str.split(":");
            i = 0;
        } catch (Throwable unused) {
            return "";
        }
        while (i < strArrSplit.length) {
            int i2 = i + 1;
            if (i2 == strArrSplit.length) {
                return jSONObject.optString(strArrSplit[i]);
            }
            try {
                jSONObject = new JSONObject(jSONObject.optString(strArrSplit[i]));
            } catch (JSONException unused2) {
                jSONObject = new JSONArray(jSONObject.optString(strArrSplit[i])).getJSONObject(0);
            }
            i = i2;
            return "";
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    private static Method[] m15265c(Object obj, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Method method : obj.getClass().getDeclaredMethods()) {
                if (method.getGenericReturnType().toString().contains(str)) {
                    arrayList.add(method);
                }
            }
            return (Method[]) arrayList.toArray(new Method[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
