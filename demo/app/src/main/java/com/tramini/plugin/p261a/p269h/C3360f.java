package com.tramini.plugin.p261a.p269h;

import com.umeng.commonsdk.proguard.C3442bg;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C3360f {

    /* JADX INFO: renamed from: a */
    private static char[] f18227a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m15311a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (int i = 0; i < bArrDigest.length; i++) {
                sb.append(f18227a[(bArrDigest[i] & 240) >>> 4]);
                sb.append(f18227a[bArrDigest[i] & C3442bg.f18783m]);
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m15312a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f18227a[(bArr[i] & 240) >>> 4]);
            sb.append(f18227a[bArr[i] & C3442bg.f18783m]);
        }
        return sb.toString();
    }
}
