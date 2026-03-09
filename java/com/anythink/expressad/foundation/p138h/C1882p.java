package com.anythink.expressad.foundation.p138h;

import android.text.TextUtils;
import com.anythink.expressad.p089e.InterfaceC1491b;
import com.umeng.commonsdk.proguard.C3442bg;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1882p implements InterfaceC1491b {

    /* JADX INFO: renamed from: a */
    public static final String f11590a = "MD5";

    /* JADX INFO: renamed from: a */
    public static String m9771a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
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
    private static String m9772a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = 48;
        }
        byte[] bArr3 = new byte[bArr.length + 1];
        bArr3[0] = 0;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        byte[] bytes = new BigInteger(bArr3).toString(16).getBytes();
        System.arraycopy(bytes, 0, bArr2, length - bytes.length, bytes.length);
        return new String(bArr2);
    }

    /* JADX INFO: renamed from: b */
    private static String m9773b(String str) {
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
    private static String m9774b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(Integer.toHexString((b & 240) >>> 4));
            sb.append(Integer.toHexString(b & C3442bg.f18783m));
        }
        return sb.toString().toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: c */
    private static String m9775c(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-16LE");
            new StringBuilder("b = ").append(m9772a(bytes));
            byte[] bArr = new byte[length];
            int i = 0;
            for (int i2 = 0; i2 < bytes.length; i2 += 2) {
                if (bytes[i2] != -1 && bytes[i2] != -2) {
                    bArr[i] = bytes[i2];
                    i++;
                    if (i == length) {
                        break;
                    }
                }
            }
            new StringBuilder("source = ").append(m9772a(bArr));
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i3 = 0;
            for (byte b : bArrDigest) {
                int i4 = i3 + 1;
                cArr2[i3] = cArr[(b >>> 4) & 15];
                i3 = i4 + 1;
                cArr2[i4] = cArr[b & C3442bg.f18783m];
            }
            return new String(cArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m9776c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(Integer.toHexString((b & 240) >>> 4));
            sb.append(Integer.toHexString(b & C3442bg.f18783m));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    /* JADX INFO: renamed from: d */
    private static byte[] m9777d(String str) throws UnsupportedEncodingException {
        int length = str.length();
        byte[] bytes = str.getBytes("UTF-16LE");
        new StringBuilder("b = ").append(m9772a(bytes));
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i2 = 0; i2 < bytes.length; i2 += 2) {
            if (bytes[i2] != -1 && bytes[i2] != -2) {
                bArr[i] = bytes[i2];
                i++;
                if (i == length) {
                    break;
                }
            }
        }
        new StringBuilder("source = ").append(m9772a(bArr));
        return bArr;
    }
}
