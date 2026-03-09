package p285z2;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: z2.lo */
/* JADX INFO: loaded from: classes2.dex */
public final class C4105lo {
    private static final String OooO00o;
    public static final String OooO0O0 = "SJIS";
    public static final String OooO0OO = "GB2312";
    private static final String OooO0Oo = "EUC_JP";
    private static final String OooO0o = "ISO8859_1";
    private static final String OooO0o0 = "UTF8";
    private static final boolean OooO0oO;

    static {
        String strName = Charset.defaultCharset().name();
        OooO00o = strName;
        OooO0oO = OooO0O0.equalsIgnoreCase(strName) || OooO0Oo.equalsIgnoreCase(strName);
    }

    private C4105lo() {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007c A[PHI: r10
  0x007c: PHI (r10v6 int) = (r10v1 int), (r10v5 int), (r10v1 int) binds: [B:31:0x005f, B:39:0x0077, B:27:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooO00o(byte[] r19, java.util.Map<com.google.zxing.DecodeHintType, ?> r20) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4105lo.OooO00o(byte[], java.util.Map):java.lang.String");
    }
}
