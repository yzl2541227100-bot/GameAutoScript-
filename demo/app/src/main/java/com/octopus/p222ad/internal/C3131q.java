package com.octopus.p222ad.internal;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.octopus.ad.internal.q */
/* JADX INFO: loaded from: classes2.dex */
public class C3131q {
    /* JADX INFO: renamed from: a */
    public static <T> T m14593a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: a */
    public static String m14594a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static void m14595a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14596a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
