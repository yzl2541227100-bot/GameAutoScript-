package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* JADX INFO: renamed from: com.umeng.analytics.pro.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C3398t {

    /* JADX INFO: renamed from: a */
    private static C3398t f18587a = null;

    /* JADX INFO: renamed from: b */
    private static Context f18588b = null;

    /* JADX INFO: renamed from: c */
    private static String f18589c = null;

    /* JADX INFO: renamed from: d */
    private static final String f18590d = "mobclick_agent_user_";

    /* JADX INFO: renamed from: com.umeng.analytics.pro.t$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private static final C3398t f18591a = new C3398t();

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C3398t m15624a(Context context) {
        if (f18588b == null && context != null) {
            f18588b = context.getApplicationContext();
        }
        if (f18588b != null) {
            f18589c = context.getPackageName();
        }
        return a.f18591a;
    }

    /* JADX INFO: renamed from: e */
    private SharedPreferences m15625e() {
        Context context = f18588b;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(f18590d + f18589c, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m15626a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18588b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15627a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18588b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15628a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = m15625e().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public String[] m15629a() {
        SharedPreferences sharedPreferencesM15625e = m15625e();
        if (sharedPreferencesM15625e == null) {
            return null;
        }
        String string = sharedPreferencesM15625e.getString("au_p", null);
        String string2 = sharedPreferencesM15625e.getString("au_u", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        return new String[]{string, string2};
    }

    /* JADX INFO: renamed from: b */
    public void m15630b() {
        SharedPreferences sharedPreferencesM15625e = m15625e();
        if (sharedPreferencesM15625e != null) {
            sharedPreferencesM15625e.edit().remove("au_p").remove("au_u").commit();
        }
    }

    /* JADX INFO: renamed from: c */
    public String m15631c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18588b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public int m15632d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18588b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }
}
