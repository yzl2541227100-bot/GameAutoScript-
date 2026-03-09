package com.octopus.p222ad.internal.p226b;

import java.util.Objects;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C3103k {
    /* JADX INFO: renamed from: a */
    public static <T> T m14329a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m14330a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* JADX INFO: renamed from: a */
    public static void m14331a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14332a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14333a(Object... objArr) {
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
        }
    }
}
