package com.anythink.core.common.p066o;

import android.text.TextUtils;
import com.umeng.commonsdk.proguard.C3442bg;
import java.util.HashMap;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: com.anythink.core.common.o.d */
/* JADX INFO: loaded from: classes.dex */
public class C1340d {

    /* JADX INFO: renamed from: a */
    public static HashMap<Character, Character> f5213a = null;

    /* JADX INFO: renamed from: b */
    private static final String f5214b = "d";

    /* JADX INFO: renamed from: e */
    private static final String f5217e = "ZE1XbmhiZXlLcjBKSXZMTk94M0JGa0V1bWw5Mlk1ZmpTcUdUN1I4cFpWY2lQSEFzdEM0VVhhNlFEdzFnb3orLw==";

    /* JADX INFO: renamed from: c */
    private static final char[] f5215c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: d */
    private static final byte[] f5216d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, C3442bg.f18781k, C3442bg.f18782l, C3442bg.f18783m, C3442bg.f18784n, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: f */
    private static String f5218f = "";

    private C1340d() {
    }

    /* JADX INFO: renamed from: a */
    private static synchronized Character m4027a(char c) {
        if (TextUtils.isEmpty(f5218f)) {
            f5218f = m4030b(f5217e);
        }
        if (f5213a == null) {
            f5213a = new HashMap<>();
            int i = 0;
            while (true) {
                char[] cArr = f5215c;
                if (i >= cArr.length) {
                    break;
                }
                f5213a.put(Character.valueOf(f5218f.charAt(i)), Character.valueOf(cArr[i]));
                i++;
            }
        }
        if (f5213a.containsKey(Character.valueOf(c))) {
            return f5213a.get(Character.valueOf(c));
        }
        return Character.valueOf(c);
    }

    /* JADX INFO: renamed from: a */
    public static String m4028a(String str) {
        return TextUtils.isEmpty(str) ? "" : m4029a(str.getBytes());
    }

    /* JADX INFO: renamed from: a */
    public static String m4029a(byte[] bArr) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                char[] cArr = f5215c;
                stringBuffer.append(cArr[i3 >>> 2]);
                stringBuffer.append(cArr[(i3 & 3) << 4]);
                str = "==";
            } else {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (i4 == length) {
                    char[] cArr2 = f5215c;
                    stringBuffer.append(cArr2[i3 >>> 2]);
                    stringBuffer.append(cArr2[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                    stringBuffer.append(cArr2[(i5 & 15) << 2]);
                    str = "=";
                } else {
                    int i6 = i4 + 1;
                    int i7 = bArr[i4] & 255;
                    char[] cArr3 = f5215c;
                    stringBuffer.append(cArr3[i3 >>> 2]);
                    stringBuffer.append(cArr3[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                    stringBuffer.append(cArr3[((i5 & 15) << 2) | ((i7 & 192) >>> 6)]);
                    stringBuffer.append(cArr3[i7 & 63]);
                    i = i6;
                }
            }
            stringBuffer.append(str);
            break;
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m4030b(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(m4032d(str));
    }

    /* JADX INFO: renamed from: c */
    public static String m4031c(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char[] charArray = str.toCharArray();
            if (charArray != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i = 0; i < charArray.length; i++) {
                    cArr[i] = m4027a(charArray[i]).charValue();
                }
                str2 = new String(cArr);
            }
            return new String(m4032d(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r2 == (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        r1.write(r2 | ((r5 & 3) << 6));
        r2 = r4;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m4032d(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()
            int r0 = r8.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L82
        Ld:
            byte[] r3 = com.anythink.core.common.p066o.C1340d.f5216d
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
            byte[] r5 = com.anythink.core.common.p066o.C1340d.f5216d
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
            byte[] r7 = com.anythink.core.common.p066o.C1340d.f5216d
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
            byte[] r7 = com.anythink.core.common.p066o.C1340d.f5216d
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
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p066o.C1340d.m4032d(java.lang.String):byte[]");
    }
}
