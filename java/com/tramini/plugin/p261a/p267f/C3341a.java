package com.tramini.plugin.p261a.p267f;

import com.tramini.plugin.p261a.p265d.C3333a;
import com.tramini.plugin.p261a.p265d.C3335c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.f.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3341a extends C3346f {

    /* JADX INFO: renamed from: a */
    public static final String f18137a = "naitve";

    /* JADX INFO: renamed from: b */
    public static final String f18138b = "html";

    /* JADX INFO: renamed from: c */
    public static final String f18139c = "html_background";

    /* JADX INFO: renamed from: d */
    public static final String f18140d = "html_play";

    /* JADX INFO: renamed from: e */
    public static final String f18141e = "html_css";

    /* JADX INFO: renamed from: f */
    public static final String f18142f = "html_x3d";

    /* JADX INFO: renamed from: g */
    public static final String f18143g = "html_doctype";

    /* JADX INFO: renamed from: h */
    public static final String f18144h = "html_doctype_write";

    /* JADX INFO: renamed from: i */
    public static final String f18145i = "html_unknow";

    /* JADX INFO: renamed from: j */
    public static final String f18146j = "0";

    /* JADX INFO: renamed from: k */
    public static final String f18147k = "1";

    /* JADX INFO: renamed from: l */
    public static final String f18148l = "2";

    /* JADX INFO: renamed from: m */
    public static final String f18149m = "3";

    /* JADX INFO: renamed from: n */
    public static final String f18150n = "4";

    /* JADX INFO: renamed from: o */
    public static final String f18151o = "5";

    /* JADX INFO: renamed from: p */
    public static final String f18152p = "6";

    /* JADX INFO: renamed from: q */
    public static final String f18153q = "7";

    /* JADX INFO: renamed from: r */
    public static final String f18154r = "8";

    /* JADX INFO: renamed from: s */
    public static final String f18155s = "9";

    /* JADX INFO: renamed from: t */
    private static final String f18156t = JSONObject.class.getName();

    /* JADX WARN: Removed duplicated region for block: B:69:0x0111 A[PHI: r0
  0x0111: PHI (r0v3 org.json.JSONObject) = (r0v2 org.json.JSONObject), (r0v10 org.json.JSONObject), (r0v10 org.json.JSONObject) binds: [B:72:0x0125, B:13:0x0043, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.tramini.plugin.p261a.p265d.C3333a m15201a(java.lang.Object r17, java.lang.String r18, java.lang.String[] r19, org.json.JSONObject r20, org.json.JSONArray r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.p261a.p267f.C3341a.m15201a(java.lang.Object, java.lang.String, java.lang.String[], org.json.JSONObject, org.json.JSONArray, java.lang.String):com.tramini.plugin.a.d.a");
    }

    /* JADX INFO: renamed from: a */
    public static C3333a m15202a(JSONObject jSONObject, C3335c c3335c, String str, String str2) {
        return m15201a(C3346f.m15232a(jSONObject.optString("in_na"), str), jSONObject.optString("pre"), m15205a(jSONObject.optJSONArray("p_key")), jSONObject, c3335c.f18113e, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m15203a(java.lang.String r4, java.lang.String r5, java.lang.String r6, org.json.JSONObject r7) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.p261a.p267f.C3341a.m15203a(java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject):java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m15204a(Object obj, Set<Object> set, String str, String str2) {
        if (obj != null && !set.contains(obj)) {
            set.add(obj);
            Class<?> superclass = obj.getClass();
            ArrayList<Field> arrayList = new ArrayList();
            do {
                arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
                superclass = superclass.getSuperclass();
            } while (superclass.getName().startsWith(str2));
            for (Field field : arrayList) {
                field.setAccessible(true);
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (field.getType().getName().equals("interface") || obj2.getClass().getName().startsWith(str2)) {
                            JSONObject jSONObjectM15204a = m15204a(obj2, set, str, str2);
                            if (jSONObjectM15204a != null) {
                                return jSONObjectM15204a;
                            }
                        } else if (field.getType().getName().equals(f18156t)) {
                            JSONObject jSONObject = (JSONObject) obj2;
                            if (jSONObject.has(str)) {
                                return jSONObject;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static String[] m15205a(JSONArray jSONArray) {
        try {
            int length = jSONArray.length();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                try {
                    strArr[i] = jSONArray.getString(i);
                } catch (JSONException unused) {
                    return strArr;
                }
            }
            return strArr;
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m15206d(String str, String str2) {
        str2.hashCode();
        switch (str2) {
            case "html_play":
            case "html_x3d":
                return m15209f(C3346f.m15241c(str.replace("\\\\\\\\x", "%").replaceAll("\\\\x", "%").replaceAll("\\\\n", "")));
            case "naitve":
                return str.replace("\\/", "/");
            case "html_doctype_write":
                return m15209f(C3346f.m15241c(str.replace("x22", "\"").replace("x26", "&").replace("x27", "'").replace("x3c", "<").replace("x3d", "=").replace("x3e", ">")));
            default:
                return m15209f(C3346f.m15241c(str));
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m15207e(String str) {
        return str.contains("div id=\"mys-wrapper\" class=\"mys-wrapper\">") ? (str.contains("https://rr") || str.contains(".mp4")) ? f18138b : f18139c : (str.contains("html5AdData") && str.contains("google_template_data")) ? f18140d : (str.contains("<link") && str.contains("type=\"text/css")) ? f18141e : (str.contains("new videoInterstitial") && str.contains("x3c")) ? f18142f : str.contains("<!doctype html>") ? str.contains("doc.write") ? f18144h : f18143g : f18145i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m15208e(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = ""
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L7b
            r6 = 0
            r2 = r0
        L9:
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L7b
            if (r6 >= r3) goto L7b
            org.json.JSONObject r3 = r1.optJSONObject(r6)     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L78
            java.lang.String r4 = "action"
            r5 = -1
            int r4 = r3.optInt(r4, r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "param"
            java.lang.String r3 = r3.optString(r5, r0)     // Catch: java.lang.Throwable -> L7b
            r5 = 11
            if (r4 == r5) goto L67
            r5 = 13
            if (r4 == r5) goto L5c
            r5 = 101(0x65, float:1.42E-43)
            if (r4 == r5) goto L51
            r5 = 102(0x66, float:1.43E-43)
            if (r4 == r5) goto L33
            goto L71
        L33:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L78
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = "'"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "'\\s*:\\s*'(.*?)'"
            r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = com.tramini.plugin.p261a.p267f.C3346f.m15242c(r7, r2)     // Catch: java.lang.Throwable -> L7b
            goto L71
        L51:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L78
            java.lang.String r2 = com.tramini.plugin.p261a.p267f.C3346f.b.m15249a(r7, r3)     // Catch: java.lang.Throwable -> L7b
            goto L71
        L5c:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L78
            java.lang.String r2 = com.tramini.plugin.p261a.p267f.C3346f.d.m15259b(r7, r3)     // Catch: java.lang.Throwable -> L7b
            goto L71
        L67:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L78
            java.lang.String r2 = com.tramini.plugin.p261a.p267f.C3346f.d.m15257a(r7, r3)     // Catch: java.lang.Throwable -> L7b
        L71:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L7b
            if (r3 != 0) goto L78
            return r2
        L78:
            int r6 = r6 + 1
            goto L9
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.p261a.p267f.C3341a.m15208e(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: f */
    private static String m15209f(String str) {
        return str.replaceAll("&amp;", "&").replaceAll("&quot;", "\"");
    }
}
