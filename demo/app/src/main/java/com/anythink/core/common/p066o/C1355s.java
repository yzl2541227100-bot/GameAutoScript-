package com.anythink.core.common.p066o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.o.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1355s {
    /* JADX INFO: renamed from: a */
    public static Long m4232a(Context context, String str, String str2, Long l) {
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
    public static Map<String, ?> m4233a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getAll();
        } catch (Error | Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4234a(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            context.getSharedPreferences(str, 0).edit().remove(str2).apply();
        } catch (Error | Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4235a(Context context, String str, String str2, int i) {
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
    public static void m4236a(Context context, String str, String str2, long j) {
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
    public static void m4237a(Context context, String str, String str2, String str3) {
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
    public static int m4238b(Context context, String str, String str2, int i) {
        if (context == null) {
            return i;
        }
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (Error | Exception unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m4239b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Error | Exception unused) {
            return str3;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m4240b(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            context.getSharedPreferences(str, 0).edit().clear().apply();
        } catch (Error | Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4241b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putBoolean(str2, false);
            editorEdit.apply();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4242c(Context context, String str, String str2) {
        if (context == null) {
            return true;
        }
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, true);
        } catch (Exception unused) {
            return true;
        }
    }
}
