package com.anythink.expressad.foundation.p116d;

import android.text.TextUtils;
import com.anythink.expressad.p089e.InterfaceC1491b;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1779a implements InterfaceC1491b, Serializable {

    /* JADX INFO: renamed from: a */
    private static final String f10161a = "https://img.toponad.com/sdk/app-permissions.html?key=";

    /* JADX INFO: renamed from: b */
    private static String f10162b = "app_name";

    /* JADX INFO: renamed from: c */
    private static String f10163c = "perm_desc";

    /* JADX INFO: renamed from: d */
    private static String f10164d = "ori_perm_desc";

    /* JADX INFO: renamed from: e */
    private static String f10165e = "ori_perm_all";

    /* JADX INFO: renamed from: f */
    private static String f10166f = "pri_url";

    /* JADX INFO: renamed from: g */
    private static String f10167g = "upd_time";

    /* JADX INFO: renamed from: h */
    private static String f10168h = "app_ver";

    /* JADX INFO: renamed from: i */
    private static String f10169i = "dev_name";

    /* JADX INFO: renamed from: j */
    private String f10170j;

    /* JADX INFO: renamed from: k */
    private String f10171k;

    /* JADX INFO: renamed from: l */
    private ArrayList<String> f10172l = new ArrayList<>(3);

    /* JADX INFO: renamed from: m */
    private ArrayList<String> f10173m = new ArrayList<>(3);

    /* JADX INFO: renamed from: n */
    private ArrayList<String> f10174n = new ArrayList<>(3);

    /* JADX INFO: renamed from: o */
    private String f10175o;

    /* JADX INFO: renamed from: p */
    private String f10176p;

    /* JADX INFO: renamed from: q */
    private String f10177q;

    /* JADX INFO: renamed from: r */
    private String f10178r;

    /* JADX INFO: renamed from: s */
    private String f10179s;

    /* JADX INFO: renamed from: a */
    private static C1779a m8587a(C1779a c1779a) {
        return c1779a == null ? new C1779a() : c1779a;
    }

    /* JADX INFO: renamed from: a */
    public static C1779a m8588a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return m8589a(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static C1779a m8589a(JSONObject jSONObject) {
        StringBuilder sb;
        C1779a c1779aM8587a = null;
        if (jSONObject.has(f10162b)) {
            c1779aM8587a = m8587a((C1779a) null);
            c1779aM8587a.f10171k = jSONObject.optString(f10162b);
        }
        if (jSONObject.has(f10163c)) {
            c1779aM8587a = m8587a(c1779aM8587a);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(f10163c);
            if (jSONArrayOptJSONArray != null) {
                c1779aM8587a.f10172l = m8590a(jSONArrayOptJSONArray);
                ArrayList<String> arrayList = c1779aM8587a.f10174n;
                String string = f10161a;
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    try {
                        if (jSONArrayOptJSONArray.get(i) instanceof String) {
                            if (i == 0) {
                                sb = new StringBuilder();
                                sb.append(string);
                                sb.append(jSONArrayOptJSONArray.optString(i));
                            } else {
                                sb = new StringBuilder();
                                sb.append(string);
                                sb.append(",");
                                sb.append(jSONArrayOptJSONArray.optString(i));
                            }
                            string = sb.toString();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                c1779aM8587a.f10175o = string;
                c1779aM8587a.f10174n = arrayList;
            }
        }
        if (jSONObject.has(f10164d)) {
            c1779aM8587a = m8587a(c1779aM8587a);
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(f10164d);
            if (jSONArrayOptJSONArray2 != null) {
                c1779aM8587a.f10173m = m8590a(jSONArrayOptJSONArray2);
                ArrayList<String> arrayList2 = c1779aM8587a.f10174n;
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    try {
                        Object obj = jSONArrayOptJSONArray2.get(i2);
                        if (obj instanceof String) {
                            arrayList2.add((String) obj);
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                c1779aM8587a.f10174n = arrayList2;
            }
        }
        if (jSONObject.has(f10166f)) {
            c1779aM8587a = m8587a(c1779aM8587a);
            c1779aM8587a.f10176p = jSONObject.optString(f10166f);
        }
        if (jSONObject.has(f10167g)) {
            c1779aM8587a = m8587a(c1779aM8587a);
            c1779aM8587a.f10177q = jSONObject.optString(f10167g);
        }
        if (jSONObject.has(f10168h)) {
            c1779aM8587a = m8587a(c1779aM8587a);
            c1779aM8587a.f10178r = jSONObject.optString(f10168h);
        }
        if (jSONObject.has(f10169i)) {
            c1779aM8587a = m8587a(c1779aM8587a);
            c1779aM8587a.f10179s = jSONObject.optString(f10169i);
        }
        if (c1779aM8587a != null) {
            c1779aM8587a.f10170j = jSONObject.toString();
        }
        return c1779aM8587a;
    }

    /* JADX INFO: renamed from: a */
    private static ArrayList<String> m8590a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m8591a(ArrayList<String> arrayList) {
        this.f10172l = arrayList;
    }

    /* JADX INFO: renamed from: b */
    private void m8592b(String str) {
        this.f10170j = str;
    }

    /* JADX INFO: renamed from: b */
    private void m8593b(ArrayList<String> arrayList) {
        this.f10173m = arrayList;
    }

    /* JADX INFO: renamed from: c */
    private void m8594c(String str) {
        this.f10175o = str;
    }

    /* JADX INFO: renamed from: c */
    private void m8595c(ArrayList<String> arrayList) {
        this.f10174n = arrayList;
    }

    /* JADX INFO: renamed from: d */
    private static JSONArray m8596d(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(arrayList.get(i));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: d */
    private void m8597d(String str) {
        this.f10171k = str;
    }

    /* JADX INFO: renamed from: e */
    private void m8598e(String str) {
        this.f10176p = str;
    }

    /* JADX INFO: renamed from: f */
    private void m8599f(String str) {
        this.f10177q = str;
    }

    /* JADX INFO: renamed from: g */
    private void m8600g(String str) {
        this.f10178r = str;
    }

    /* JADX INFO: renamed from: h */
    private String m8601h() {
        return this.f10170j;
    }

    /* JADX INFO: renamed from: h */
    private void m8602h(String str) {
        this.f10179s = str;
    }

    /* JADX INFO: renamed from: i */
    private ArrayList<String> m8603i() {
        return this.f10172l;
    }

    /* JADX INFO: renamed from: j */
    private ArrayList<String> m8604j() {
        return this.f10173m;
    }

    /* JADX INFO: renamed from: k */
    private ArrayList<String> m8605k() {
        return this.f10174n;
    }

    /* JADX INFO: renamed from: a */
    public final String m8606a() {
        return this.f10175o;
    }

    /* JADX INFO: renamed from: b */
    public final String m8607b() {
        return this.f10171k;
    }

    /* JADX INFO: renamed from: c */
    public final String m8608c() {
        return this.f10176p;
    }

    /* JADX INFO: renamed from: d */
    public final String m8609d() {
        return this.f10177q;
    }

    /* JADX INFO: renamed from: e */
    public final String m8610e() {
        return this.f10178r;
    }

    /* JADX INFO: renamed from: f */
    public final String m8611f() {
        return this.f10179s;
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m8612g() {
        try {
            JSONObject jSONObject = new JSONObject(this.f10170j);
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String toString() {
        return "ApkDisplayInfo{appName='" + this.f10171k + "', permDescJArray=" + this.f10172l + ", permDescOriJArray=" + this.f10173m + ", permDescAll=" + this.f10174n + ", priUrl='" + this.f10176p + "', updateTime='" + this.f10177q + "', appVersion='" + this.f10178r + "', devName='" + this.f10179s + '\'' + MessageFormatter.DELIM_STOP;
    }
}
