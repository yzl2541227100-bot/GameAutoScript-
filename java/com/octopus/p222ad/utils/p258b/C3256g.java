package com.octopus.p222ad.utils.p258b;

import android.content.Context;
import android.text.TextUtils;
import com.octopus.p222ad.Octopus;
import com.octopus.p222ad.internal.utilities.SPUtils;
import com.octopus.p222ad.utils.p229a.C3226b;
import com.octopus.p222ad.utils.p229a.C3247f;

/* JADX INFO: renamed from: com.octopus.ad.utils.b.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3256g {
    /* JADX INFO: renamed from: a */
    public static String m14985a(Context context) {
        String strM14914b;
        if (Octopus.getCustomController() != null) {
            String oaid = Octopus.getCustomController().getOaid();
            if (!TextUtils.isEmpty(oaid)) {
                C3247f.m14936b("Oaid is Outside Input: " + oaid);
                return oaid;
            }
        }
        return (context == null || Octopus.isLimitPersonalAds() || (strM14914b = C3226b.m14914b(context)) == null) ? "" : strM14914b;
    }

    /* JADX INFO: renamed from: b */
    public static String m14986b(Context context) {
        String str;
        return (context == null || Octopus.isLimitPersonalAds() || (str = (String) SPUtils.getFromGroupSdk(context, "__GAID__", C3226b.m14916c(context))) == null) ? "" : str;
    }
}
