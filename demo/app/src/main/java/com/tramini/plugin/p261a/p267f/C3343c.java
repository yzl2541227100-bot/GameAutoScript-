package com.tramini.plugin.p261a.p267f;

import android.text.TextUtils;
import com.tramini.plugin.p261a.p265d.C3333a;
import com.tramini.plugin.p261a.p265d.C3335c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.f.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C3343c extends C3346f {
    /* JADX INFO: renamed from: a */
    private static C3333a m15219a(Object obj, String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        C3333a c3333aM15219a;
        if (obj == null || !obj.getClass().getName().startsWith(str2)) {
            return null;
        }
        String str3 = str + obj.getClass().getName() + ",";
        try {
            ArrayList arrayList = new ArrayList();
            C3346f.m15235a(obj.getClass(), arrayList);
            int size = arrayList.size();
            Field[] fieldArr = new Field[size];
            arrayList.toArray(fieldArr);
            if (size == 0) {
                return null;
            }
            for (int i = 0; i < size; i++) {
                Field field = fieldArr[i];
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                if (obj2 != null && (obj2 instanceof JSONObject)) {
                    try {
                        String str4 = "";
                        JSONObject jSONObject2 = new JSONObject();
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            String strOptString = jSONArray.optString(i2);
                            String strOptString2 = jSONObject.optString(strOptString);
                            if (TextUtils.equals(strOptString2, "all")) {
                                str4 = strOptString;
                            } else {
                                String strM15221a = m15221a(strOptString2, (JSONObject) obj2);
                                if (!TextUtils.isEmpty(strM15221a)) {
                                    jSONObject2.put(strOptString, strM15221a);
                                }
                            }
                        }
                        if (jSONObject2.length() != 0) {
                            C3333a c3333a = new C3333a();
                            if (!TextUtils.isEmpty(str4)) {
                                jSONObject2.put(str4, obj2.toString());
                            }
                            c3333a.f18100a = jSONObject2;
                            return c3333a;
                        }
                        continue;
                    } catch (Throwable unused) {
                        continue;
                    }
                } else if (obj2 != null && !str3.contains(obj2.getClass().getName()) && (c3333aM15219a = m15219a(obj2, str3, str2, jSONObject, jSONArray)) != null) {
                    return c3333aM15219a;
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3333a m15220a(JSONObject jSONObject, C3335c c3335c, String str) {
        return m15219a(C3346f.m15232a(jSONObject.optString("in_na"), str), "", jSONObject.optString("pre"), jSONObject, c3335c.f18113e);
    }

    /* JADX INFO: renamed from: a */
    private static String m15221a(String str, JSONObject jSONObject) {
        try {
            String[] strArrSplit = str.split(":");
            int i = 0;
            while (i < strArrSplit.length) {
                int i2 = i + 1;
                if (i2 == strArrSplit.length) {
                    return jSONObject.optString(strArrSplit[i]);
                }
                jSONObject = jSONObject.optJSONObject(strArrSplit[i]);
                i = i2;
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
