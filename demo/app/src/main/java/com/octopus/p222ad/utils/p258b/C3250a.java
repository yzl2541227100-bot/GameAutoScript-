package com.octopus.p222ad.utils.p258b;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p285z2.sa0;

/* JADX INFO: renamed from: com.octopus.ad.utils.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3250a {
    /* JADX INFO: renamed from: a */
    public static String m14967a(String str, String str2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec("abcdefgh1jklmnop".getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), sa0.AES);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(str2.getBytes()), 2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m14968b(String str, String str2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec("abcdefgh1jklmnop".getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), sa0.AES);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str2, 0)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
