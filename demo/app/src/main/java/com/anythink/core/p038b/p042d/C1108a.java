package com.anythink.core.p038b.p042d;

import android.text.TextUtils;
import cn.haorui.sdk.core.HRConfig;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1237bc;
import com.anythink.core.common.p055f.C1252q;

/* JADX INFO: renamed from: com.anythink.core.b.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C1108a {

    /* JADX INFO: renamed from: a */
    public static final String f2641a = "a";

    /* JADX INFO: renamed from: a */
    public static double m1654a(double d, double d2) {
        return d2 > 0.0d ? d + (d2 * d) : d;
    }

    /* JADX INFO: renamed from: a */
    public static double m1655a(double d, double d2, double d3) {
        return d3 > 0.0d ? d2 + ((d - d2) * d3) : d2;
    }

    /* JADX INFO: renamed from: a */
    public static double m1656a(C1229av c1229av) {
        int iM2733a = c1229av.m2733a();
        double dM2770aw = iM2733a != 2 ? (iM2733a == 3 || iM2733a == 4 || iM2733a == 5 || iM2733a == 8) ? c1229av.m2770aw() : 0.0d : c1229av.m2768au();
        if (dM2770aw > 0.0d) {
            return dM2770aw;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: a */
    public static int m1657a(boolean z, int i, int i2) {
        return i == i2 ? !z ? 1 : 2 : (i == 67 || i == 35) ? 3 : 4;
    }

    /* JADX INFO: renamed from: a */
    private static String m1658a(int i) {
        return i == 2 ? "102" : "1001";
    }

    /* JADX INFO: renamed from: a */
    public static String m1659a(C1252q c1252q, double d) {
        int i = c1252q.f4435d;
        return (i == 8 || i == 28) ? String.valueOf((int) Math.round(d)) : String.valueOf(d);
    }

    /* JADX INFO: renamed from: a */
    public static String m1660a(C1252q c1252q, C1237bc c1237bc, double d, double d2) {
        String str = c1252q.winNoticeUrl;
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(f2641a);
            sb.append(" [return] getWinUrl, no win notice url, do nothing\n bid id: ");
            sb.append(c1252q.token);
            return null;
        }
        int i = c1252q.f4435d;
        String strReplace = str.replace(C1109b.f2646e, m1659a(c1252q, d2));
        if (i == 28) {
            strReplace = strReplace.replace(C1109b.f2643b, m1659a(c1252q, d));
        } else if (i == 66) {
            String strM2940b = c1237bc.m2940b();
            if (TextUtils.isEmpty(strM2940b)) {
                strM2940b = "";
            }
            strReplace = strReplace.replace(C1109b.f2648g, strM2940b);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f2641a);
        sb2.append(" getWinUrl, \n bid id: ");
        sb2.append(c1252q.token);
        sb2.append("\n origin win notice url: ");
        sb2.append(str);
        sb2.append("\n final win notice url: ");
        sb2.append(strReplace);
        return strReplace;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0078  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m1661a(com.anythink.core.common.p055f.C1252q r3, com.anythink.core.common.p055f.C1260y r4, int r5, boolean r6, double r7, java.lang.String r9) {
        /*
            java.lang.String r0 = r3.loseNoticeUrl
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = com.anythink.core.p038b.p042d.C1108a.f2641a
            r4.append(r5)
            java.lang.String r5 = " [return] getLossUrl, no loss notice url, do nothing\n bid id: "
            r4.append(r5)
            java.lang.String r3 = r3.token
            r4.append(r3)
            r3 = 0
            return r3
        L1e:
            int r1 = r3.f4435d
            java.lang.String r7 = m1659a(r3, r7)
            java.lang.String r8 = "${AUCTION_PRICE}"
            java.lang.String r7 = r0.replace(r8, r7)
            java.lang.String r8 = "${AUCTION_LOSS}"
            java.lang.String r7 = r7.replace(r8, r9)
            r8 = 8
            java.lang.String r9 = ""
            java.lang.String r2 = "${AUCTION_SEAT_ID}"
            if (r1 != r8) goto L51
            if (r5 != r1) goto L40
            if (r6 != 0) goto L3e
            r5 = 1
            goto L4c
        L3e:
            r5 = 4
            goto L4c
        L40:
            r6 = 67
            if (r5 == r6) goto L4b
            r6 = 35
            if (r5 != r6) goto L49
            goto L4b
        L49:
            r5 = 2
            goto L4c
        L4b:
            r5 = 3
        L4c:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L5c
        L51:
            r6 = 29
            if (r1 != r6) goto L61
            if (r1 != r5) goto L5a
            java.lang.String r5 = "1"
            goto L5c
        L5a:
            java.lang.String r5 = "10001"
        L5c:
            java.lang.String r5 = r7.replace(r2, r5)
            goto L65
        L61:
            java.lang.String r5 = r7.replace(r2, r9)
        L65:
            r6 = 6
            if (r1 != r6) goto L74
            com.anythink.core.api.ATAdConst$CURRENCY r6 = com.anythink.core.api.ATAdConst.CURRENCY.USD
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "${AUCTION_CURRENCY}"
            java.lang.String r5 = r5.replace(r7, r6)
        L74:
            r6 = 66
            if (r1 != r6) goto L8d
            java.lang.String r4 = r4.m3457b()
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r7 = "{__BIDDER__}"
            if (r6 != 0) goto L89
            java.lang.String r5 = r5.replace(r7, r4)
            goto L8d
        L89:
            java.lang.String r5 = r5.replace(r7, r9)
        L8d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = com.anythink.core.p038b.p042d.C1108a.f2641a
            r4.append(r6)
            java.lang.String r6 = " getLossUrl, \n bid id: "
            r4.append(r6)
            java.lang.String r3 = r3.token
            r4.append(r3)
            java.lang.String r3 = "\n origin loss notice url: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = "\n final loss notice url: "
            r4.append(r3)
            r4.append(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p038b.p042d.C1108a.m1661a(com.anythink.core.common.f.q, com.anythink.core.common.f.y, int, boolean, double, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    public static String m1662a(boolean z, int i) {
        return i == 3 ? HRConfig.GENDER_UNKNOWN : i == 1 ? "5" : i == 4 ? "2" : z ? "102" : "103";
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0047  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double m1663b(com.anythink.core.common.p055f.C1229av r6) {
        /*
            int r0 = r6.m2733a()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L1a
            r1 = 4
            if (r0 == r1) goto L1a
            r1 = 5
            if (r0 == r1) goto L1a
            r1 = 8
            if (r0 == r1) goto L1a
            goto L47
        L1a:
            double r0 = r6.m2771ax()
            goto L48
        L1f:
            double r0 = r6.m2769av()
            goto L48
        L24:
            int r0 = r6.m2784d()
            r1 = 22
            if (r0 != r1) goto L47
            double r0 = r6.m2769av()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getWinnerPricePrRateForLoss, baidu normal ad requesting, use pr rate: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = ", adSourceId: "
            r4.append(r5)
            java.lang.String r6 = r6.m2842u()
            r4.append(r6)
            goto L48
        L47:
            r0 = r2
        L48:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4d
            return r0
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p038b.p042d.C1108a.m1663b(com.anythink.core.common.f.av):double");
    }

    /* JADX INFO: renamed from: b */
    public static String m1664b(boolean z, int i, int i2) {
        return i == 3 ? HRConfig.GENDER_UNKNOWN : i2 == 8 ? i == 1 ? "5" : "1" : i2 == 29 ? i == 1 ? ErrorCode.adapterNotExistError : "2" : i2 == 34 ? i == 2 ? "102" : "1001" : i2 == 59 ? "102" : (i2 == 66 && i == 1) ? "2" : z ? "102" : "103";
    }

    /* JADX INFO: renamed from: c */
    private static int m1665c(boolean z, int i, int i2) {
        return i == i2 ? !z ? 1 : 4 : (i == 67 || i == 35) ? 3 : 2;
    }
}
