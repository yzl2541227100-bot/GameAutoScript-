package com.anythink.expressad.foundation.p138h;

import com.umeng.commonsdk.proguard.C3442bg;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.l */
/* JADX INFO: loaded from: classes.dex */
public class C1878l {

    /* JADX INFO: renamed from: a */
    public static char[] f11559a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static MessageDigest f11560b = null;

    /* JADX INFO: renamed from: c */
    private static String f11561c = "SameFileMD5";

    static {
        f11560b = null;
        try {
            f11560b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println(C1878l.class.getName() + "Init fail,MessageDigest not support MD5Util.");
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m9723a(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            f11560b.update(fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length()));
            byte[] bArrDigest = f11560b.digest();
            String strM9726a = m9726a(bArrDigest, bArrDigest.length);
            fileInputStream.close();
            return strM9726a;
        } catch (Exception unused2) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 == null) {
                return "";
            }
            fileInputStream2.close();
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m9724a(String str) {
        return m9723a(new File(str));
    }

    /* JADX INFO: renamed from: a */
    private static String m9725a(byte[] bArr) {
        return m9726a(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    private static String m9726a(byte[] bArr, int i) {
        StringBuffer stringBuffer = new StringBuffer(i * 2);
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            m9727a(bArr[i3], stringBuffer);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m9727a(byte b, StringBuffer stringBuffer) {
        char[] cArr = f11559a;
        char c = cArr[(b & 240) >> 4];
        char c2 = cArr[b & C3442bg.f18783m];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }
}
