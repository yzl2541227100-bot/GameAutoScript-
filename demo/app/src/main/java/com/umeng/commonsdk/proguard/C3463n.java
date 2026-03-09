package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.proguard.C3459j;
import com.umeng.commonsdk.statistics.common.C3489e;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.n */
/* JADX INFO: loaded from: classes2.dex */
public class C3463n {

    /* JADX INFO: renamed from: a */
    private static final String f18856a = "info";

    /* JADX INFO: renamed from: b */
    private static final String f18857b = "a_na";

    /* JADX INFO: renamed from: c */
    private static final String f18858c = "a_st";

    /* JADX INFO: renamed from: d */
    private static final String f18859d = "a_ad";

    /* JADX INFO: renamed from: e */
    private static final String f18860e = "blueinfo";

    /* JADX INFO: renamed from: f */
    private static final String f18861f = "a_dc";

    /* JADX INFO: renamed from: g */
    private static final String f18862g = "bssid";

    /* JADX INFO: renamed from: h */
    private static final String f18863h = "ssid";

    /* JADX INFO: renamed from: i */
    private static final String f18864i = "a_fcy";

    /* JADX INFO: renamed from: j */
    private static final String f18865j = "a_hssid";

    /* JADX INFO: renamed from: k */
    private static final String f18866k = "a_ip";

    /* JADX INFO: renamed from: l */
    private static final String f18867l = "a_ls";

    /* JADX INFO: renamed from: m */
    private static final String f18868m = "a_mac";

    /* JADX INFO: renamed from: n */
    private static final String f18869n = "a_nid";

    /* JADX INFO: renamed from: o */
    private static final String f18870o = "rssi";

    /* JADX INFO: renamed from: p */
    private static final String f18871p = "sta";

    /* JADX INFO: renamed from: q */
    private static final String f18872q = "ts";

    /* JADX INFO: renamed from: r */
    private static final String f18873r = "wifiinfo";

    /* JADX INFO: renamed from: s */
    private static final String f18874s = "ua";

    /* JADX INFO: renamed from: a */
    public static JSONObject m15968a(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f18856a, 0);
        if (sharedPreferences == null) {
            return null;
        }
        try {
            String string = sharedPreferences.getString(f18860e, null);
            if (string != null) {
                return new JSONObject(string);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15969a(Context context, C3459j.b bVar) {
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f18856a, 0);
            String string = null;
            if (sharedPreferences != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f18857b, bVar.f18827c);
                jSONObject.put(f18858c, bVar.f18826b);
                jSONObject.put(f18859d, bVar.f18825a);
                jSONObject.put("ts", System.currentTimeMillis());
                string = jSONObject.toString();
            }
            if (string != null) {
                sharedPreferences.edit().putString(f18860e, string).commit();
            }
        } catch (Exception e) {
            C3489e.m16350e("saveBluetoothInfo:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15970a(Context context, C3459j.c cVar) {
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f18856a, 0);
            String string = null;
            if (sharedPreferences != null) {
                String string2 = sharedPreferences.getString(f18873r, null);
                JSONArray jSONArray = string2 == null ? new JSONArray() : new JSONArray(string2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f18861f, cVar.f18828a);
                jSONObject.put(f18862g, cVar.f18829b);
                jSONObject.put(f18863h, cVar.f18830c);
                jSONObject.put(f18864i, cVar.f18831d);
                jSONObject.put(f18865j, cVar.f18832e);
                jSONObject.put(f18866k, cVar.f18833f);
                jSONObject.put(f18867l, cVar.f18834g);
                jSONObject.put(f18868m, cVar.f18835h);
                jSONObject.put(f18869n, cVar.f18836i);
                jSONObject.put(f18870o, cVar.f18837j);
                jSONObject.put(f18871p, cVar.f18838k);
                jSONObject.put("ts", cVar.f18839l);
                jSONArray.put(jSONObject);
                string = jSONArray.toString();
            }
            if (string != null) {
                sharedPreferences.edit().putString(f18873r, string).commit();
            }
        } catch (Exception e) {
            C3489e.m16350e(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15971a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f18856a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("ua", str).commit();
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m15972b(Context context) {
        String string;
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f18856a, 0);
            if (sharedPreferences == null || (string = sharedPreferences.getString(f18873r, null)) == null) {
                return null;
            }
            return new JSONArray(string);
        } catch (Exception e) {
            C3489e.m16350e(e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m15973c(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f18856a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(f18873r).commit();
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m15974d(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f18856a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("ua", null);
        }
        return null;
    }
}
