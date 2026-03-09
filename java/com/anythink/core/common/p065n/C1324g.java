package com.anythink.core.common.p065n;

import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1246k;

/* JADX INFO: renamed from: com.anythink.core.common.n.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1324g {
    /* JADX INFO: renamed from: a */
    private static void m3939a(C1243h c1243h, int i, int i2, String str, String str2, int i3, Boolean bool, String str3, boolean z, boolean z3, boolean z4, boolean z5) {
        C1246k c1246k = new C1246k(c1243h.m2679aj(), null);
        c1246k.f4244a = "1004684";
        c1246k.f4245b = c1243h.m2678ai();
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4254k = String.valueOf(i);
        c1246k.f4256m = String.valueOf(i3);
        c1246k.f4257n = String.valueOf(c1243h.m2679aj());
        c1246k.f4258o = z ? "1" : "2";
        c1246k.f4259p = String.valueOf(i2);
        if (!TextUtils.isEmpty(str)) {
            c1246k.f4260q = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            c1246k.f4261r = str2;
        }
        c1246k.f4262s = bool == null ? "0" : bool.booleanValue() ? "1" : "2";
        c1246k.f4263t = str3;
        c1246k.f4264u = z3 ? "1" : "2";
        c1246k.f4265v = z4 ? "1" : "2";
        c1246k.f4266w = String.valueOf(i);
        c1246k.f4267x = z5 ? "1" : "2";
        C1322e.m3929b(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3940a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd baseAd) {
        String str2;
        String string;
        String string2;
        try {
            String strM2168q = C1175n.m2059a().m2168q();
            str2 = "null";
            if (aTBaseAdAdapter != null) {
                String string3 = aTBaseAdAdapter.toString();
                C1243h trackingInfo = aTBaseAdAdapter.getTrackingInfo();
                string2 = trackingInfo != null ? trackingInfo.toString() : "null";
                C1229av unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
                string = unitGroupInfo != null ? unitGroupInfo.toString() : "null";
                str2 = string3;
            } else {
                string = "null";
                string2 = string;
            }
            String str3 = "format: " + str + " | adapter: " + str2 + " | tracking: " + string2 + " | unitGroupInfo: " + string;
            if (baseAd != null) {
                str3 = str3 + " | baseAd: " + baseAd.toString();
            }
            C1322e.m3913a("Empty ATAdInfo", str3, strM2168q);
        } catch (Throwable unused) {
        }
    }
}
