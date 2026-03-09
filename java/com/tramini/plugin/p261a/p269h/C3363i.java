package com.tramini.plugin.p261a.p269h;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C3363i {
    /* JADX INFO: renamed from: a */
    public static Long m15317a(Context context, String str, String str2, Long l) {
        if (context == null) {
            return 0L;
        }
        try {
            return Long.valueOf(context.getSharedPreferences(str, 0).getLong(str2, l.longValue()));
        } catch (Error | Exception unused) {
            return l;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m15318a(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            context.getSharedPreferences(str, 0).edit().clear().apply();
        } catch (Error | Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m15319a(Context context, String str, String str2, int i) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putInt(str2, i);
            editorEdit.apply();
        } catch (Error | Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m15320a(Context context, String str, String str2, long j) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putLong(str2, j);
            editorEdit.apply();
        } catch (Error | Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15321a(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, String.valueOf(str3));
            editorEdit.apply();
        } catch (Error | Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m15322b(Context context, String str, String str2, int i) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (Error | Exception unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m15323b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Error | Exception unused) {
            return str3;
        }
    }
}
