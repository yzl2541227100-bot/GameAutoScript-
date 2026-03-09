package com.anythink.expressad.foundation.p138h;

import android.content.Context;
import android.content.res.Resources;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.f */
/* JADX INFO: loaded from: classes.dex */
public class C1872f {

    /* JADX INFO: renamed from: a */
    private static String f11523a = "DomainSameSDKTool";

    /* JADX INFO: renamed from: a */
    private static boolean m9679a(Context context) {
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
}
