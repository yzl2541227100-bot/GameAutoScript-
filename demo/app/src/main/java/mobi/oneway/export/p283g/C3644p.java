package mobi.oneway.export.p283g;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: mobi.oneway.export.g.p */
/* JADX INFO: loaded from: classes2.dex */
public class C3644p {
    /* JADX INFO: renamed from: a */
    public static String m17002a(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1024];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    String strM17005b = m17005b(messageDigest.digest());
                    C3638j.m16981a(bufferedInputStream);
                    return strM17005b;
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            C3638j.m16981a(bufferedInputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m17003a(String str) {
        return m17004a(str.getBytes("utf-8"));
    }

    /* JADX INFO: renamed from: a */
    public static String m17004a(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr, 0, bArr.length);
        return m17005b(messageDigest.digest());
    }

    /* JADX INFO: renamed from: b */
    private static String m17005b(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            int i = b & 255;
            if (i <= 15) {
                str = str + "0";
            }
            str = str + Integer.toHexString(i);
        }
        return str;
    }
}
