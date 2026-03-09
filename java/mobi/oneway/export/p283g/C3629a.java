package mobi.oneway.export.p283g;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p285z2.sa0;

/* JADX INFO: renamed from: mobi.oneway.export.g.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3629a {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Cipher> f19780a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private static String m16903a(String str, int i, boolean z) {
        char[] charArray = str.toCharArray();
        char[] cArr = new char[i];
        int i2 = !z ? 1 : 0;
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = charArray[(i3 * 2) + i2];
        }
        return String.valueOf(cArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m16904a(String str, String str2, String str3) {
        String[] strArrM16908a = m16908a(str2, str3);
        return m16910c(str, strArrM16908a[0], strArrM16908a[1]);
    }

    /* JADX INFO: renamed from: a */
    private static Cipher m16905a(String str, String str2, int i) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        String str3 = str + ":" + str2 + ":" + i;
        Map<String, Cipher> map = f19780a;
        Cipher cipher = map.get(str3);
        if (cipher != null) {
            return cipher;
        }
        SecretKeySpec secretKeySpecM16906a = m16906a(str);
        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher2.init(i, secretKeySpecM16906a, new IvParameterSpec(str2.getBytes("utf-8")));
        map.put(str3, cipher2);
        return cipher2;
    }

    /* JADX INFO: renamed from: a */
    private static SecretKeySpec m16906a(String str) throws UnsupportedEncodingException {
        byte[] bytes = str.getBytes("utf-8");
        byte[] bArr = new byte[16];
        for (int i = 0; i < bytes.length && i < 16; i++) {
            bArr[i] = bytes[i];
        }
        return new SecretKeySpec(bArr, sa0.AES);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m16907a(int i) {
        return (i & 1) == 1;
    }

    /* JADX INFO: renamed from: a */
    private static String[] m16908a(String str, String str2) {
        char cCharAt = str.charAt(2);
        char cCharAt2 = str2.charAt(5);
        String strM16903a = m16903a(str2, 8, m16907a(cCharAt));
        String strM16903a2 = m16903a(str, 8, m16907a(cCharAt2));
        return new String[]{strM16903a + strM16903a2, strM16903a2 + strM16903a};
    }

    /* JADX INFO: renamed from: b */
    public static String m16909b(String str, String str2, String str3) {
        String[] strArrM16908a = m16908a(str2, str3);
        return m16911d(str, strArrM16908a[0], strArrM16908a[1]);
    }

    /* JADX INFO: renamed from: c */
    private static String m16910c(String str, String str2, String str3) {
        return new String(C3630b.m16918a(m16905a(str2, str3, 1).doFinal(str.getBytes("utf-8"))), "utf-8");
    }

    /* JADX INFO: renamed from: d */
    private static String m16911d(String str, String str2, String str3) {
        return new String(m16905a(str2, str3, 2).doFinal(C3630b.m16924b(str.getBytes("utf-8"))));
    }
}
