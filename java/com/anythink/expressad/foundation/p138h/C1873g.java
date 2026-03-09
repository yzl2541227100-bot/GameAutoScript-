package com.anythink.expressad.foundation.p138h;

import android.content.Context;
import android.content.res.Resources;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.g */
/* JADX INFO: loaded from: classes.dex */
public class C1873g {

    /* JADX INFO: renamed from: a */
    private static String f11524a = "DomainSameTool";

    /* JADX INFO: renamed from: a */
    public static boolean m9680a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", C3902g6.OooO0O0)) > 0;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m9681b(Context context) {
    }
}
