package com.goldcoast.sdk.p206c;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p285z2.sa0;

/* JADX INFO: renamed from: com.goldcoast.sdk.c.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2735a {

    /* JADX INFO: renamed from: a */
    private static String f15997a = "";

    /* JADX INFO: renamed from: a */
    public static String m13151a(String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            int blockSize = cipher.getBlockSize();
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            if (length % blockSize != 0) {
                length += blockSize - (length % blockSize);
            }
            byte[] bArr = new byte[length];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            if (f15997a.equals("")) {
                f15997a = new String(Base64.decode("Y2NiOWRmN2IyYjA5M2E2Yw==\n".getBytes(), 0));
            }
            cipher.init(1, new SecretKeySpec(f15997a.getBytes("UTF-8"), sa0.AES), new IvParameterSpec(f15997a.getBytes()));
            return Base64.encodeToString(cipher.doFinal(bArr), 4).trim();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m13152b(String str) {
        if (f15997a.equals("")) {
            f15997a = new String(Base64.decode("Y2NiOWRmN2IyYjA5M2E2Yw==\n".getBytes(), 0));
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(f15997a.getBytes("UTF-8"), sa0.AES), new IvParameterSpec(f15997a.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str, 4)), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
