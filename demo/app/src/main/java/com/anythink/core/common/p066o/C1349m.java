package com.anythink.core.common.p066o;

import com.umeng.commonsdk.proguard.C3442bg;

/* JADX INFO: renamed from: com.anythink.core.common.o.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1349m {

    /* JADX INFO: renamed from: a */
    private static final char[] f5305a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    private static final char[] f5306b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C1349m() {
    }

    /* JADX INFO: renamed from: a */
    public static String m4199a(byte[] bArr) {
        return new String(m4200a(bArr, true));
    }

    /* JADX INFO: renamed from: a */
    private static char[] m4200a(byte[] bArr, boolean z) {
        return m4201a(bArr, z ? f5306b : f5305a);
    }

    /* JADX INFO: renamed from: a */
    private static char[] m4201a(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & C3442bg.f18783m];
        }
        return cArr2;
    }

    /* JADX INFO: renamed from: b */
    private static char[] m4202b(byte[] bArr) {
        return m4200a(bArr, false);
    }
}
