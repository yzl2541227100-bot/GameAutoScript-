package com.tramini.plugin.p261a.p267f;

import android.text.TextUtils;
import com.tramini.plugin.p261a.p265d.C3333a;
import com.tramini.plugin.p261a.p265d.C3335c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.f.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C3344d extends C3346f {
    /* JADX INFO: renamed from: a */
    private static C3333a m15222a(Object obj, String str, String str2, String str3, JSONObject jSONObject, JSONArray jSONArray) {
        C3333a c3333aM15222a;
        Object objInvoke;
        if (obj == null || !obj.getClass().getName().startsWith(str2)) {
            return null;
        }
        String str4 = str + obj.getClass().getName() + ",";
        try {
            ArrayList arrayList = new ArrayList();
            C3346f.m15235a(obj.getClass(), arrayList);
            int size = arrayList.size();
            Field[] fieldArr = new Field[size];
            arrayList.toArray(fieldArr);
            if (size == 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Field field = fieldArr[i2];
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                Method methodM15224c = m15224c(obj2, str3);
                if (obj2 == null || methodM15224c == null) {
                    if (obj2 != null && !str4.contains(obj2.getClass().getName()) && (c3333aM15222a = m15222a(obj2, str4, str2, str3, jSONObject, jSONArray)) != null) {
                        return c3333aM15222a;
                    }
                } else {
                    methodM15224c.setAccessible(true);
                    try {
                        objInvoke = methodM15224c.invoke(obj2, new Object[i]);
                    } catch (Throwable unused) {
                    }
                    if (objInvoke instanceof JSONObject) {
                        String str5 = "";
                        JSONObject jSONObject2 = new JSONObject();
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            try {
                                String strOptString = jSONArray.optString(i3);
                                try {
                                    String strOptString2 = jSONObject.optString(strOptString);
                                    if (TextUtils.equals(strOptString2, "all")) {
                                        str5 = strOptString;
                                    } else {
                                        String strM15225d = m15225d(objInvoke, strOptString2);
                                        if (!TextUtils.isEmpty(strM15225d)) {
                                            jSONObject2.put(strOptString, strM15225d);
                                        }
                                    }
                                } catch (Throwable unused2) {
                                }
                            } catch (Throwable unused3) {
                            }
                        }
                        try {
                            if (jSONObject2.length() > 0) {
                                C3333a c3333a = new C3333a();
                                if (!TextUtils.isEmpty(str5)) {
                                    jSONObject2.put(str5, objInvoke.toString());
                                }
                                c3333a.f18100a = jSONObject2;
                                return c3333a;
                            }
                            continue;
                        } catch (Throwable unused4) {
                            continue;
                        }
                    }
                }
                i2++;
                i = 0;
            }
            return null;
        } catch (Throwable unused5) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3333a m15223a(JSONObject jSONObject, C3335c c3335c, String str) {
        return m15222a(C3346f.m15232a(jSONObject.optString("in_na"), str), "", jSONObject.optString("pre"), jSONObject.optString("mena"), jSONObject, c3335c.f18113e);
    }

    /* JADX INFO: renamed from: c */
    private static Method m15224c(Object obj, String str) {
        try {
            ArrayList<Method> arrayList = new ArrayList();
            C3346f.m15240b(obj.getClass(), arrayList);
            for (Method method : arrayList) {
                if (method.getGenericReturnType().toString().contains(str)) {
                    return method;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m15225d(Object obj, String str) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            if (jSONObject.has(str)) {
                return jSONObject.optString(str);
            }
            while (itKeys.hasNext()) {
                Object objOpt = jSONObject.opt(itKeys.next());
                if ((objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
                    String strM15225d = m15225d(objOpt, str);
                    if (!TextUtils.isEmpty(strM15225d)) {
                        return strM15225d;
                    }
                }
            }
        }
        if (!(obj instanceof JSONArray)) {
            return null;
        }
        int i = 0;
        while (true) {
            JSONArray jSONArray = (JSONArray) obj;
            if (i >= jSONArray.length()) {
                return null;
            }
            Object objOpt2 = jSONArray.opt(i);
            if ((objOpt2 instanceof JSONObject) || (objOpt2 instanceof JSONArray)) {
                String strM15225d2 = m15225d(objOpt2, str);
                if (!TextUtils.isEmpty(strM15225d2)) {
                    return strM15225d2;
                }
            }
            i++;
        }
    }
}
