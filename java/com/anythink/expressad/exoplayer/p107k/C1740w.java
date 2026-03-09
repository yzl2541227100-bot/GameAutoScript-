package com.anythink.expressad.exoplayer.p107k;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1740w {

    /* JADX INFO: renamed from: a */
    public static final int f9802a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f9803b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f9804c = 2;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.w$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private C1740w() {
    }

    /* JADX INFO: renamed from: a */
    private static int m8305a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            boolean z = false;
            if (i4 == 0 || (i4 == 1 ? (i2 & 1) != 0 : !(i4 != 2 || (i2 & 2) == 0))) {
                z = true;
            }
            if (z) {
                return i4;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m8306b(int i, int i2) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i2 & 2) != 0 : (i2 & 1) != 0;
        }
        return true;
    }
}
