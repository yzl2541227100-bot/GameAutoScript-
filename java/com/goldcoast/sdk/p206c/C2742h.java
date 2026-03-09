package com.goldcoast.sdk.p206c;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.goldcoast.sdk.c.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C2742h {

    /* JADX INFO: renamed from: a */
    private static SharedPreferences f16010a;

    /* JADX INFO: renamed from: b */
    private static C2742h f16011b;

    /* JADX INFO: renamed from: c */
    private static Context f16012c;

    private C2742h() {
    }

    /* JADX INFO: renamed from: a */
    public static C2742h m13179a() {
        if (f16011b == null) {
            f16011b = new C2742h();
        }
        return f16011b;
    }

    /* JADX INFO: renamed from: a */
    public static String m13180a(String str) {
        return TextUtils.isEmpty(str) ? "" : f16010a.getString(str, "");
    }

    /* JADX INFO: renamed from: a */
    public static void m13181a(Context context) {
        f16012c = context;
        if (f16010a == null) {
            f16010a = context.getSharedPreferences("dispatch_log", 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13182a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = f16010a.edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }
}
