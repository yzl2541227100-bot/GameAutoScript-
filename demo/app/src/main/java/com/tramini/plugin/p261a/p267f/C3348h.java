package com.tramini.plugin.p261a.p267f;

import android.text.TextUtils;
import com.tramini.plugin.p261a.p265d.C3333a;
import com.tramini.plugin.p261a.p265d.C3335c;
import com.tramini.plugin.p261a.p267f.C3346f;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.f.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C3348h extends C3346f {

    /* JADX INFO: renamed from: com.tramini.plugin.a.f.h$1, reason: invalid class name */
    public class AnonymousClass1 implements C3346f.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18174a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f18175b;

        public AnonymousClass1(String str, String str2) {
            this.f18174a = str;
            this.f18175b = str2;
        }

        @Override // com.tramini.plugin.p261a.p267f.C3346f.c
        /* JADX INFO: renamed from: a */
        public final boolean mo15228a(Object obj) {
            return obj instanceof Map;
        }

        @Override // com.tramini.plugin.p261a.p267f.C3346f.c
        /* JADX INFO: renamed from: b */
        public final C3346f.a mo15229b(Object obj) {
            Object obj2;
            Map map = (Map) obj;
            if (map == null || map.size() == 0) {
                return C3346f.a.m15245a();
            }
            if (map.containsKey(this.f18174a) && (obj2 = map.get(this.f18174a)) != null) {
                return obj2.getClass().getName().contains(this.f18175b) ? C3346f.a.m15246a(obj2) : C3346f.a.m15247b(obj2);
            }
            return C3346f.a.m15245a();
        }
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.f.h$2, reason: invalid class name */
    public class AnonymousClass2 implements C3346f.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18176a;

        public AnonymousClass2(String str) {
            this.f18176a = str;
        }

        @Override // com.tramini.plugin.p261a.p267f.C3346f.c
        /* JADX INFO: renamed from: a */
        public final boolean mo15228a(Object obj) {
            return obj instanceof Map;
        }

        @Override // com.tramini.plugin.p261a.p267f.C3346f.c
        /* JADX INFO: renamed from: b */
        public final C3346f.a mo15229b(Object obj) {
            Object value;
            Map map = (Map) obj;
            if (map == null || map.size() == 0) {
                return C3346f.a.m15245a();
            }
            Iterator it = map.entrySet().iterator();
            if (it.hasNext() && (value = ((Map.Entry) it.next()).getValue()) != null) {
                return value.getClass().getSimpleName().contains(this.f18176a) ? C3346f.a.m15246a(value) : C3346f.a.m15247b(value);
            }
            return C3346f.a.m15245a();
        }
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.f.h$3, reason: invalid class name */
    public class AnonymousClass3 implements C3346f.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18177a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f18178b;

        public AnonymousClass3(String str, String str2) {
            this.f18177a = str;
            this.f18178b = str2;
        }

        @Override // com.tramini.plugin.p261a.p267f.C3346f.c
        /* JADX INFO: renamed from: a */
        public final boolean mo15228a(Object obj) {
            return obj.getClass().getName().startsWith(this.f18177a);
        }

        @Override // com.tramini.plugin.p261a.p267f.C3346f.c
        /* JADX INFO: renamed from: b */
        public final C3346f.a mo15229b(Object obj) {
            try {
                String str = this.f18178b;
                return (str == null || !str.contains(obj.getClass().getName())) ? C3346f.a.m15247b(obj) : C3346f.a.m15246a(obj);
            } catch (Throwable unused) {
                return C3346f.a.m15245a();
            }
        }
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.f.h$4, reason: invalid class name */
    public class AnonymousClass4 implements C3346f.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18179a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f18180b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ StringBuffer f18181c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f18182d;

        public AnonymousClass4(String str, String str2, StringBuffer stringBuffer, String str3) {
            this.f18179a = str;
            this.f18180b = str2;
            this.f18181c = stringBuffer;
            this.f18182d = str3;
        }

        @Override // com.tramini.plugin.p261a.p267f.C3346f.c
        /* JADX INFO: renamed from: a */
        public final boolean mo15228a(Object obj) {
            return obj instanceof Map;
        }

        @Override // com.tramini.plugin.p261a.p267f.C3346f.c
        /* JADX INFO: renamed from: b */
        public final C3346f.a mo15229b(Object obj) {
            Map map;
            Object obj2;
            try {
                map = (Map) obj;
            } catch (Throwable unused) {
            }
            if (map != null && map.size() > 0) {
                if (map.containsKey(this.f18179a) && (obj2 = map.get(this.f18179a)) != null) {
                    Object objM15231a = C3346f.m15231a(obj2, this.f18180b, this.f18181c, new C3346f.c() { // from class: com.tramini.plugin.a.f.h.4.1
                        @Override // com.tramini.plugin.p261a.p267f.C3346f.c
                        /* JADX INFO: renamed from: a */
                        public final boolean mo15228a(Object obj3) {
                            return obj3.getClass().getName().startsWith(AnonymousClass4.this.f18180b);
                        }

                        @Override // com.tramini.plugin.p261a.p267f.C3346f.c
                        /* JADX INFO: renamed from: b */
                        public final C3346f.a mo15229b(Object obj3) {
                            String str = AnonymousClass4.this.f18182d;
                            return (str == null || !str.contains(obj3.getClass().getName())) ? C3346f.a.m15247b(obj3) : C3346f.a.m15246a(obj3);
                        }
                    });
                    if (objM15231a != null) {
                        return C3346f.a.m15246a(objM15231a);
                    }
                    return C3346f.a.m15245a();
                }
                return C3346f.a.m15245a();
            }
            return C3346f.a.m15245a();
        }
    }

    /* JADX INFO: renamed from: a */
    private static C3333a m15266a(Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, JSONObject jSONObject, JSONArray jSONArray) {
        try {
            Object objM15231a = C3346f.m15231a(obj, str, new StringBuffer(), new AnonymousClass1(str5, str2));
            Object objM15231a2 = objM15231a == null ? null : C3346f.m15231a(objM15231a, str, new StringBuffer(), new AnonymousClass2(str3));
            if (objM15231a2 == null) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Object objM15231a3 = C3346f.m15231a(objM15231a2, str4, stringBuffer, new AnonymousClass3(str4, str6));
            if (objM15231a3 == null) {
                objM15231a3 = C3346f.m15231a(objM15231a2, str4, new StringBuffer(), new AnonymousClass4(str5, str4, stringBuffer, str6));
            }
            if (objM15231a3 == null) {
                return null;
            }
            return m15267a(objM15231a3, str7, str8, jSONObject, jSONArray);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static C3333a m15267a(Object obj, String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        Object obj2;
        Object obj3;
        try {
            String[] strArrSplit = str2.split(":");
            if (strArrSplit.length != 2) {
                return null;
            }
            try {
                List list = (List) C3346f.m15236b(obj, str);
                obj2 = null;
                for (int i = 0; i < list.size() && (obj2 = list.get(i)) == null; i++) {
                    try {
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                obj2 = null;
            }
            Object objM15230a = C3346f.m15230a(C3346f.m15236b(obj2, strArrSplit[0]), strArrSplit[1]);
            JSONObject jSONObject2 = new JSONObject();
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                String strOptString = jSONArray.optString(i2);
                String strOptString2 = jSONObject.optString(strOptString);
                if (!TextUtils.isEmpty(strOptString2)) {
                    try {
                        String str3 = (String) C3346f.m15236b(obj, strOptString2);
                        if (TextUtils.isEmpty(str3)) {
                            str3 = (String) C3346f.m15236b(obj2, strOptString2);
                            if (!TextUtils.isEmpty(str3)) {
                                jSONObject2.put(strOptString, str3);
                            } else if (objM15230a instanceof String) {
                                String string = objM15230a.toString();
                                JSONArray jSONArray2 = new JSONArray(strOptString2);
                                int i3 = 0;
                                boolean z = false;
                                while (i3 < jSONArray2.length()) {
                                    Matcher matcher = Pattern.compile(jSONArray2.optString(i3)).matcher(string);
                                    while (true) {
                                        if (!matcher.find()) {
                                            obj3 = objM15230a;
                                            break;
                                        }
                                        String strGroup = matcher.group();
                                        int iIndexOf = strGroup.indexOf(">");
                                        int iIndexOf2 = strGroup.indexOf("<");
                                        obj3 = objM15230a;
                                        if (iIndexOf != -1 && iIndexOf2 != -1) {
                                            try {
                                                String strSubstring = strGroup.substring(iIndexOf + 1, iIndexOf2);
                                                if (!TextUtils.isEmpty(strSubstring)) {
                                                    jSONObject2.put(strOptString, strSubstring);
                                                    z = true;
                                                    break;
                                                }
                                            } catch (Throwable unused3) {
                                            }
                                        }
                                        objM15230a = obj3;
                                    }
                                    if (!z) {
                                        i3++;
                                        objM15230a = obj3;
                                    }
                                }
                            }
                        } else {
                            jSONObject2.put(strOptString, str3);
                        }
                    } catch (Throwable unused4) {
                    }
                    i2++;
                    objM15230a = obj3;
                }
                obj3 = objM15230a;
                i2++;
                objM15230a = obj3;
            }
            if (jSONObject2.length() <= 0) {
                return null;
            }
            C3333a c3333a = new C3333a();
            c3333a.f18100a = jSONObject2;
            return c3333a;
        } catch (Throwable unused5) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3333a m15268a(JSONObject jSONObject, C3335c c3335c, String str) {
        int i;
        int i2;
        String[] strArr;
        String strOptString = jSONObject.optString("pre1");
        String strOptString2 = jSONObject.optString("pre2");
        String strOptString3 = jSONObject.optString("clna");
        String strOptString4 = jSONObject.optString("mena");
        String strOptString5 = jSONObject.optString("adaptna");
        String strOptString6 = jSONObject.optString("ctrlna");
        String strOptString7 = jSONObject.optString("in_na");
        String strOptString8 = jSONObject.optString("objna_arr");
        String strOptString9 = jSONObject.optString("obj2na");
        String strOptString10 = jSONObject.optString(C3341a.f18138b);
        Object objM15271d = m15271d(strOptString7, str);
        String str2 = objM15271d instanceof String ? (String) objM15271d : null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] strArrSplit = strOptString3.split(",");
        int length = strArrSplit.length;
        int i3 = 0;
        while (i3 < length) {
            Object objM15237b = C3346f.m15237b(strArrSplit[i3], strOptString4);
            if (objM15237b != null) {
                i = i3;
                i2 = length;
                strArr = strArrSplit;
                C3333a c3333aM15266a = m15266a(objM15237b, strOptString, strOptString6, strOptString5, strOptString2, str2, strOptString8, strOptString9, strOptString10, jSONObject, c3335c.f18113e);
                if (c3333aM15266a != null) {
                    return c3333aM15266a;
                }
            } else {
                i = i3;
                i2 = length;
                strArr = strArrSplit;
            }
            i3 = i + 1;
            length = i2;
            strArrSplit = strArr;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Object m15269a(Object obj, String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        Object objM15231a = C3346f.m15231a(obj, str, stringBuffer, new AnonymousClass3(str, str3));
        return objM15231a != null ? objM15231a : C3346f.m15231a(obj, str, new StringBuffer(), new AnonymousClass4(str2, str, stringBuffer, str3));
    }

    /* JADX INFO: renamed from: a */
    private static Object m15270a(Object obj, String str, String str2, String str3, String str4) {
        Object objM15231a = C3346f.m15231a(obj, str, new StringBuffer(), new AnonymousClass1(str2, str3));
        if (objM15231a == null) {
            return null;
        }
        return C3346f.m15231a(objM15231a, str, new StringBuffer(), new AnonymousClass2(str4));
    }

    /* JADX INFO: renamed from: d */
    private static Object m15271d(String str, String str2) {
        Map map;
        try {
            Object objInvoke = Class.forName(str).getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field[] declaredFields = objInvoke.getClass().getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    if ((field.get(objInvoke) instanceof Map) && (map = (Map) field.get(objInvoke)) != null && map.containsKey(str2)) {
                        return map.get(str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
