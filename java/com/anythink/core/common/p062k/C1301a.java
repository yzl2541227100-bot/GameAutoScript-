package com.anythink.core.common.p062k;

import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.proguard.C3442bg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: com.anythink.core.common.k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1301a {

    /* JADX INFO: renamed from: a */
    private static Map<Character, Character> f4940a;

    /* JADX INFO: renamed from: b */
    private static char[] f4941b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: c */
    private static char[] f4942c = {'5', 'P', 'V', 'u', '3', 'J', 'j', 'l', 'e', 'Q', 'b', 'H', '9', 'A', 'v', 'h', 't', 's', 'g', 'W', 'I', 'C', 'U', 'i', 'F', '2', 'a', 'd', 'M', '8', 'D', 'y', 'Z', 'O', 'N', 'k', IOUtils.DIR_SEPARATOR_UNIX, '4', 'R', '7', '0', 'f', 'n', '+', 'z', 'G', 'Y', 'L', 'X', 'p', 'm', '1', 'E', 'K', 'S', 'T', 'o', 'x', '6', 'q', 'w', 'r', 'c', 'B'};

    /* JADX INFO: renamed from: d */
    private static byte[] f4943d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, C3442bg.f18781k, C3442bg.f18782l, C3442bg.f18783m, C3442bg.f18784n, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: a */
    public static C1302b m3747a(String str, String str2) {
        C1302b c1302b = new C1302b();
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 2)));
            int iBitLength = publicKeyGeneratePublic instanceof RSAPublicKey ? ((RSAPublicKey) publicKeyGeneratePublic).getModulus().bitLength() : 0;
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyGeneratePublic);
            int i = (iBitLength / 8) - 11;
            c1302b.m3753a(new String(Base64.encode(i > 0 ? m3750a(cipher, str2.getBytes(), i) : cipher.doFinal(str2.getBytes()), 2)));
        } catch (Throwable th) {
            c1302b.m3755b(th.getMessage());
        }
        return c1302b;
    }

    /* JADX INFO: renamed from: a */
    private static Character m3748a(char c) {
        if (f4940a == null) {
            f4940a = new HashMap();
            for (int i = 0; i < f4941b.length; i++) {
                f4940a.put(Character.valueOf(f4942c[i]), Character.valueOf(f4941b[i]));
            }
        }
        return f4940a.containsKey(Character.valueOf(c)) ? f4940a.get(Character.valueOf(c)) : Character.valueOf(c);
    }

    /* JADX INFO: renamed from: a */
    public static String m3749a(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char[] charArray = str.toCharArray();
            if (charArray != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i = 0; i < charArray.length; i++) {
                    char c = charArray[i];
                    if (f4940a == null) {
                        f4940a = new HashMap();
                        for (int i2 = 0; i2 < f4941b.length; i2++) {
                            f4940a.put(Character.valueOf(f4942c[i2]), Character.valueOf(f4941b[i2]));
                        }
                    }
                    cArr[i] = (f4940a.containsKey(Character.valueOf(c)) ? f4940a.get(Character.valueOf(c)) : Character.valueOf(c)).charValue();
                }
                str2 = new String(cArr);
            }
            return new String(m3751b(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m3750a(Cipher cipher, byte[] bArr, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = length - i2;
            if (i4 <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byte[] bArrDoFinal = i4 > i ? cipher.doFinal(bArr, i2, i) : cipher.doFinal(bArr, i2, i4);
            byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
            i3++;
            i2 = i3 * i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r2 == (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        r1.write(r2 | ((r5 & 3) << 6));
        r2 = r4;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m3751b(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()
            int r0 = r8.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L82
        Ld:
            byte[] r3 = com.anythink.core.common.p062k.C1301a.f4943d
            int r4 = r2 + 1
            r2 = r8[r2]
            r2 = r3[r2]
            r3 = -1
            if (r4 >= r0) goto L1d
            if (r2 == r3) goto L1b
            goto L1d
        L1b:
            r2 = r4
            goto Ld
        L1d:
            if (r2 == r3) goto L82
        L1f:
            byte[] r5 = com.anythink.core.common.p062k.C1301a.f4943d
            int r6 = r4 + 1
            r4 = r8[r4]
            r4 = r5[r4]
            if (r6 >= r0) goto L2e
            if (r4 == r3) goto L2c
            goto L2e
        L2c:
            r4 = r6
            goto L1f
        L2e:
            if (r4 == r3) goto L82
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            r1.write(r2)
        L3a:
            int r2 = r6 + 1
            r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L47
            byte[] r8 = r1.toByteArray()
            return r8
        L47:
            byte[] r7 = com.anythink.core.common.p062k.C1301a.f4943d
            r5 = r7[r5]
            if (r2 >= r0) goto L52
            if (r5 == r3) goto L50
            goto L52
        L50:
            r6 = r2
            goto L3a
        L52:
            if (r5 == r3) goto L82
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r1.write(r4)
        L60:
            int r4 = r2 + 1
            r2 = r8[r2]
            if (r2 != r6) goto L6b
            byte[] r8 = r1.toByteArray()
            return r8
        L6b:
            byte[] r7 = com.anythink.core.common.p062k.C1301a.f4943d
            r2 = r7[r2]
            if (r4 >= r0) goto L76
            if (r2 == r3) goto L74
            goto L76
        L74:
            r2 = r4
            goto L60
        L76:
            if (r2 == r3) goto L82
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            r1.write(r2)
            r2 = r4
            goto Lb
        L82:
            byte[] r8 = r1.toByteArray()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p062k.C1301a.m3751b(java.lang.String):byte[]");
    }
}
