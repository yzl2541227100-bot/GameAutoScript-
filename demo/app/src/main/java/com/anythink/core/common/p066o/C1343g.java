package com.anythink.core.common.p066o;

import com.umeng.commonsdk.proguard.C3442bg;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: renamed from: com.anythink.core.common.o.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1343g {

    /* JADX INFO: renamed from: a */
    public static final String f5282a = "MD5";

    /* JADX INFO: renamed from: b */
    private static char[] f5283b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m4123a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 240) >>> 4));
                sb.append(Integer.toHexString(b & C3442bg.f18783m));
            }
            return sb.toString().toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m4124a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(Integer.toHexString((b & 240) >>> 4));
            sb.append(Integer.toHexString(b & C3442bg.f18783m));
        }
        return sb.toString().toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: b */
    public static String m4125b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 240) >>> 4));
                sb.append(Integer.toHexString(b & C3442bg.f18783m));
            }
            return sb.toString().toUpperCase(Locale.US);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m4126b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(Integer.toHexString((b & 240) >>> 4));
            sb.append(Integer.toHexString(b & C3442bg.f18783m));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    /* JADX INFO: renamed from: c */
    public static String m4127c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (int i = 0; i < bArrDigest.length; i++) {
                sb.append(f5283b[(bArrDigest[i] & 240) >>> 4]);
                sb.append(f5283b[bArrDigest[i] & C3442bg.f18783m]);
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m4128c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f5283b[(bArr[i] & 240) >>> 4]);
            sb.append(f5283b[bArr[i] & C3442bg.f18783m]);
        }
        return sb.toString();
    }
}
