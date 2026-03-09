package com.tramini.plugin.p261a.p267f;

import android.text.TextUtils;
import com.tramini.plugin.p261a.p265d.C3333a;
import com.tramini.plugin.p261a.p265d.C3335c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.f.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C3349i extends C3346f {
    /* JADX INFO: renamed from: a */
    private static C3333a m15272a(Object obj, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONArray jSONArray) {
        C3333a c3333aM15272a;
        int i;
        Method[] methodArr;
        Object objInvoke;
        Object obj2 = obj;
        if (obj2 == null || !obj.getClass().getName().startsWith(str2)) {
            return null;
        }
        String str5 = str + obj.getClass().getName() + ",";
        try {
            ArrayList arrayList = new ArrayList();
            C3346f.m15235a(obj.getClass(), arrayList);
            int size = arrayList.size();
            Field[] fieldArr = new Field[size];
            arrayList.toArray(fieldArr);
            if (size == 0) {
                return null;
            }
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Field field = fieldArr[i3];
                boolean z = true;
                field.setAccessible(true);
                Object obj3 = field.get(obj2);
                Method[] methodArrM15275c = m15275c(obj3, str3);
                if (obj3 != null && methodArrM15275c != null) {
                    int length = methodArrM15275c.length;
                    int i4 = 0;
                    while (i4 < length) {
                        Method method = methodArrM15275c[i4];
                        method.setAccessible(z);
                        try {
                            objInvoke = method.invoke(obj3, new Object[i2]);
                        } catch (Throwable unused) {
                        }
                        if (objInvoke instanceof JSONObject) {
                            try {
                                if (((JSONObject) objInvoke).has(str4)) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    int i5 = 0;
                                    while (i5 < jSONArray.length()) {
                                        try {
                                            String strOptString = jSONArray.optString(i5);
                                            methodArr = methodArrM15275c;
                                            try {
                                                String strOptString2 = jSONObject.optString(strOptString);
                                                i = length;
                                                try {
                                                    jSONObject2.put(strOptString, TextUtils.equals(strOptString2, "all") ? objInvoke.toString() : m15274a(strOptString2, (JSONObject) objInvoke));
                                                    i5++;
                                                    methodArrM15275c = methodArr;
                                                    length = i;
                                                } catch (Throwable unused2) {
                                                }
                                            } catch (Throwable unused3) {
                                            }
                                        } catch (Throwable unused4) {
                                            methodArr = methodArrM15275c;
                                        }
                                    }
                                    methodArr = methodArrM15275c;
                                    i = length;
                                    C3333a c3333a = new C3333a();
                                    c3333a.f18100a = jSONObject2;
                                    return c3333a;
                                }
                            } catch (Throwable unused5) {
                            }
                        }
                        methodArr = methodArrM15275c;
                        i = length;
                        i4++;
                        methodArrM15275c = methodArr;
                        length = i;
                        z = true;
                        i2 = 0;
                    }
                } else if (obj3 != null && !str5.contains(obj3.getClass().getName()) && (c3333aM15272a = m15272a(obj3, str5, str2, str3, str4, jSONObject, jSONArray)) != null) {
                    return c3333aM15272a;
                }
                i3++;
                obj2 = obj;
                i2 = 0;
            }
            return null;
        } catch (Throwable unused6) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3333a m15273a(JSONObject jSONObject, C3335c c3335c, String str) {
        return m15272a(C3346f.m15232a(jSONObject.optString("in_na"), str), "", jSONObject.optString("pre"), jSONObject.optString("mena"), jSONObject.optString("agu"), jSONObject, c3335c.f18113e);
    }

    /* JADX INFO: renamed from: a */
    private static String m15274a(String str, JSONObject jSONObject) {
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
    private static Method[] m15275c(Object obj, String str) {
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
