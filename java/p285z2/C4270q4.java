package p285z2;

import com.umeng.commonsdk.proguard.C3442bg;
import java.security.MessageDigest;

/* JADX INFO: renamed from: z2.q4 */
/* JADX INFO: loaded from: classes.dex */
public class C4270q4 {
    public static final String OooO00o(String str) {
        if (str == null) {
            return null;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i = 0;
            for (byte b : bArrDigest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & C3442bg.f18783m];
            }
            return new String(cArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
