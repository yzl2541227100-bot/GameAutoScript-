package cn.haorui.sdk.core.utils;

import java.text.DecimalFormat;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes.dex */
public class StringUtils {

    /* JADX INFO: renamed from: G */
    private static final long f281G = 1073741824;

    /* JADX INFO: renamed from: K */
    private static final long f282K = 1024;

    /* JADX INFO: renamed from: M */
    private static final long f283M = 1048576;

    /* JADX INFO: renamed from: T */
    private static final long f284T = 1099511627776L;

    public static String byte2hex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String upperCase = Integer.toHexString(b & 255).toUpperCase();
            if (upperCase.length() == 1) {
                sb.append("0");
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    public static String bytesToHuman(long j) {
        long[] jArr = {1099511627776L, 1073741824, 1048576, 1024, 1};
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j < 1) {
            return "0 " + strArr[4];
        }
        for (int i = 0; i < 5; i++) {
            long j2 = jArr[i];
            if (j >= j2) {
                return format(j, j2, strArr[i]);
            }
        }
        return null;
    }

    private static String format(long j, long j2, String str) {
        double d = j;
        if (j2 > 1) {
            d /= j2;
        }
        return new DecimalFormat("#.##").format(d) + C4196o4.OooO00o.OooO0Oo + str;
    }
}
