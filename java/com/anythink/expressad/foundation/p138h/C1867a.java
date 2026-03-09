package com.anythink.expressad.foundation.p138h;

import android.text.TextUtils;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p285z2.C4196o4;
import p285z2.sa0;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1867a {

    /* JADX INFO: renamed from: a */
    private static final String f11494a = "ebmclXzZOhtU2sRlZxGL8A";

    /* JADX INFO: renamed from: b */
    private static byte[] f11495b = new byte[32];

    /* JADX INFO: renamed from: c */
    private static byte[] f11496c = new byte[16];

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.h.a$a */
    public static class a extends Provider {
        public a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    static {
        if (TextUtils.isEmpty(f11494a)) {
            return;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("sha-384").digest(f11494a.getBytes());
            System.arraycopy(bArrDigest, 0, f11495b, 0, 32);
            System.arraycopy(bArrDigest, 32, f11496c, 0, 16);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m9668a(String str) {
        return m9669a(str, f11495b, f11496c);
    }

    /* JADX INFO: renamed from: a */
    private static String m9669a(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, sa0.AES);
            Security.addProvider(new a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 0));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m9670a(byte[] bArr) {
        StringBuilder sb;
        String string = "";
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb = new StringBuilder();
                sb.append(string);
                string = "0";
            } else {
                sb = new StringBuilder();
            }
            sb.append(string);
            sb.append(hexString);
            string = sb.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    private static String m9671b(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, sa0.AES);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m9672b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("sha-384").digest(str.getBytes());
            System.arraycopy(bArrDigest, 0, f11495b, 0, 32);
            System.arraycopy(bArrDigest, 32, f11496c, 0, 16);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m9673c(String str) {
        return m9671b(str, f11495b, f11496c);
    }

    /* JADX INFO: renamed from: d */
    private static byte[] m9674d(String str) {
        String upperCase = str.trim().replace(C4196o4.OooO00o.OooO0Oo, "").toUpperCase(Locale.US);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) (Integer.decode("0x" + upperCase.substring(i2, i3) + upperCase.substring(i3, i3 + 1)).intValue() & 255);
        }
        return bArr;
    }
}
