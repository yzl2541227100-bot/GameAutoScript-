package com.anythink.expressad.exoplayer.p107k;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1711a {
    private C1711a() {
    }

    /* JADX INFO: renamed from: a */
    public static int m8004a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m8005a(@Nullable T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* JADX INFO: renamed from: a */
    private static <T> T m8006a(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: a */
    private static String m8007a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private static String m8008a(@Nullable String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private static void m8009a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8010a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8011a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8012b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8013b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
