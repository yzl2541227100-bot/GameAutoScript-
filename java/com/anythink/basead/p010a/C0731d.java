package com.anythink.basead.p010a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: renamed from: com.anythink.basead.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0731d {
    /* JADX INFO: renamed from: a */
    public static int m243a(Context context, AbstractC1247l abstractC1247l) {
        int iM3169H = abstractC1247l.m3169H();
        return C1345i.m4154a(context, (iM3169H == 1 || iM3169H == 4) ? "myoffer_cta_install_now" : "myoffer_cta_learn_more", C1875i.f11532g);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m244a(AbstractC1247l abstractC1247l) {
        return (TextUtils.isEmpty(abstractC1247l.m3237x()) && TextUtils.isEmpty(abstractC1247l.m3233v()) && TextUtils.isEmpty(abstractC1247l.m3235w())) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m245a(AbstractC1247l abstractC1247l, C1248m c1248m) {
        if (abstractC1247l == null || c1248m == null) {
            return false;
        }
        String strValueOf = String.valueOf(c1248m.f4329j);
        strValueOf.hashCode();
        if (strValueOf.equals("1")) {
            return true;
        }
        return strValueOf.equals("3") && abstractC1247l.m3168G() == 1 && abstractC1247l.m3170I();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m246b(AbstractC1247l abstractC1247l) {
        return abstractC1247l != null && abstractC1247l.m3210k();
    }
}
