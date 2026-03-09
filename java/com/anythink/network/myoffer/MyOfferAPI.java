package com.anythink.network.myoffer;

import android.content.Context;
import com.anythink.basead.p022f.p023a.C0782a;
import com.anythink.basead.p022f.p023a.C0783b;
import com.anythink.core.common.p055f.C1208aa;

/* JADX INFO: loaded from: classes.dex */
public class MyOfferAPI {
    public static boolean checkOffersOutOfCap(Context context, String str) {
        return C0783b.m572a(context).m575a(str);
    }

    public static String getDefaultOfferId(Context context, String str) {
        return C0782a.m563a(context).m569b(str);
    }

    public static String getOutOfCapOfferIds(Context context) {
        return C0783b.m572a(context).m573a();
    }

    public static void preloadTopOnOffer(Context context, C1208aa c1208aa) {
        C0782a.m563a(context).m566a(c1208aa.f3711a);
    }
}
