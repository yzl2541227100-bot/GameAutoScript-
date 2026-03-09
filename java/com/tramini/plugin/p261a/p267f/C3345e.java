package com.tramini.plugin.p261a.p267f;

import android.text.TextUtils;
import com.tramini.plugin.p261a.p265d.C3333a;
import com.tramini.plugin.p261a.p265d.C3335c;
import com.tramini.plugin.p261a.p267f.C3346f;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.f.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3345e extends C3346f {
    /* JADX INFO: renamed from: a */
    private static C3333a m15226a(Object obj, String str, final String str2, JSONObject jSONObject, JSONArray jSONArray, String str3) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (!TextUtils.equals(str3, "0")) {
                obj = C3346f.m15231a(obj, str, stringBuffer, new C3346f.c() { // from class: com.tramini.plugin.a.f.e.1
                    @Override // com.tramini.plugin.p261a.p267f.C3346f.c
                    /* JADX INFO: renamed from: a */
                    public final boolean mo15228a(Object obj2) {
                        return (obj2 instanceof List) || obj2.getClass().getName().contains(str2);
                    }

                    @Override // com.tramini.plugin.p261a.p267f.C3346f.c
                    /* JADX INFO: renamed from: b */
                    public final C3346f.a mo15229b(Object obj2) {
                        try {
                            if (!(obj2 instanceof List)) {
                                return C3346f.a.m15246a(obj2);
                            }
                            List list = (List) obj2;
                            if (list != null && list.size() > 0) {
                                for (int i = 0; i < list.size(); i++) {
                                    Object obj3 = list.get(i);
                                    if (obj3.getClass().getName().contains(str2)) {
                                        return C3346f.a.m15246a(obj3);
                                    }
                                }
                                return C3346f.a.m15245a();
                            }
                            return C3346f.a.m15245a();
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
            }
            if (obj == null) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String strOptString = jSONArray.optString(i);
                    Object objM15230a = C3346f.m15230a(obj, jSONObject.optString(strOptString));
                    if (objM15230a != null) {
                        String string = objM15230a.toString();
                        if (!TextUtils.isEmpty(string)) {
                            jSONObject2.put(strOptString, string);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (jSONObject2.length() > 0) {
                C3333a c3333a = new C3333a();
                c3333a.f18100a = jSONObject2;
                return c3333a;
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C3333a m15227a(JSONObject jSONObject, C3335c c3335c, String str, String str2) {
        return m15226a(C3346f.m15232a(jSONObject.optString("in_na"), str), jSONObject.optString("pre"), jSONObject.optString("clna"), jSONObject, c3335c.f18113e, str2);
    }
}
