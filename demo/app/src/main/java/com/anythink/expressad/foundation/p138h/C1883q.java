package com.anythink.expressad.foundation.p138h;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1883q {

    /* JADX INFO: renamed from: a */
    public static final int f11591a = 256;

    /* JADX INFO: renamed from: b */
    private static Map<Character, Character> f11592b = null;

    /* JADX INFO: renamed from: c */
    private static Map<Character, Character> f11593c = null;

    /* JADX INFO: renamed from: d */
    private static final char[] f11594d;

    /* JADX INFO: renamed from: e */
    private static char[] f11595e = null;

    /* JADX INFO: renamed from: f */
    private static final char f11596f = '=';

    /* JADX INFO: renamed from: g */
    private static final byte[] f11597g;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};
        f11594d = cArr;
        HashMap map = new HashMap();
        f11592b = map;
        map.put('A', 'v');
        f11592b.put('B', 'S');
        f11592b.put('C', 'o');
        f11592b.put('D', 'a');
        f11592b.put('E', 'j');
        f11592b.put('F', 'c');
        f11592b.put('G', '7');
        f11592b.put('H', 'd');
        f11592b.put('I', 'R');
        f11592b.put('J', 'z');
        f11592b.put('K', 'p');
        f11592b.put('L', 'W');
        f11592b.put('M', 'i');
        f11592b.put('N', 'f');
        f11592b.put('O', 'G');
        f11592b.put('P', 'y');
        f11592b.put('Q', 'N');
        f11592b.put('R', 'x');
        f11592b.put('S', 'Z');
        f11592b.put('T', 'n');
        f11592b.put('U', 'V');
        f11592b.put('V', '5');
        f11592b.put('W', 'k');
        f11592b.put('X', '+');
        f11592b.put('Y', 'D');
        f11592b.put('Z', 'H');
        f11592b.put('a', 'L');
        f11592b.put('b', 'Y');
        f11592b.put('c', 'h');
        f11592b.put('d', 'J');
        f11592b.put('e', '4');
        f11592b.put('f', '6');
        f11592b.put('g', 'l');
        f11592b.put('h', 't');
        f11592b.put('i', '0');
        f11592b.put('j', 'U');
        f11592b.put('k', '3');
        f11592b.put('l', 'Q');
        f11592b.put('m', 'r');
        f11592b.put('n', 'g');
        f11592b.put('o', 'E');
        f11592b.put('p', 'u');
        f11592b.put('q', 'q');
        f11592b.put('r', '8');
        f11592b.put('s', 's');
        f11592b.put('t', 'w');
        f11592b.put('u', Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        f11592b.put('v', 'X');
        f11592b.put('w', 'M');
        f11592b.put('x', 'e');
        f11592b.put('y', 'B');
        f11592b.put('z', 'A');
        f11592b.put('0', 'T');
        f11592b.put('1', '2');
        f11592b.put('2', 'F');
        f11592b.put('3', 'b');
        f11592b.put('4', '9');
        f11592b.put('5', 'P');
        f11592b.put('6', '1');
        f11592b.put('7', 'O');
        f11592b.put('8', 'I');
        f11592b.put('9', 'K');
        f11592b.put('+', 'm');
        f11592b.put(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), 'C');
        f11595e = new char[cArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            char[] cArr2 = f11594d;
            if (i2 >= cArr2.length) {
                break;
            }
            f11595e[i2] = f11592b.get(Character.valueOf(cArr2[i2])).charValue();
            i2++;
        }
        f11597g = new byte[128];
        int i3 = 0;
        while (true) {
            byte[] bArr = f11597g;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = 127;
            i3++;
        }
        while (true) {
            char[] cArr3 = f11595e;
            if (i >= cArr3.length) {
                return;
            }
            f11597g[cArr3[i]] = (byte) i;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m9778a(char[] cArr, byte[] bArr, int i) {
        try {
            char c = cArr[3] == '=' ? (char) 2 : (char) 3;
            if (cArr[2] == '=') {
                c = 1;
            }
            byte[] bArr2 = f11597g;
            byte b = bArr2[cArr[0]];
            byte b2 = bArr2[cArr[1]];
            byte b3 = bArr2[cArr[2]];
            byte b4 = bArr2[cArr[3]];
            if (c == 2) {
                bArr[i] = (byte) ((3 & (b2 >> 4)) | ((b << 2) & 252));
                bArr[i + 1] = (byte) (((b2 << 4) & 240) | ((b3 >> 2) & 15));
                return 2;
            }
            if (c != 3) {
                bArr[i] = (byte) (((b << 2) & 252) | (3 & (b2 >> 4)));
                return 1;
            }
            int i2 = i + 1;
            bArr[i] = (byte) (((b << 2) & 252) | ((b2 >> 4) & 3));
            bArr[i2] = (byte) (((b2 << 4) & 240) | ((b3 >> 2) & 15));
            bArr[i2 + 1] = (byte) ((b4 & 63) | ((b3 << 6) & 192));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m9779a(String str) {
        byte[] bArrM9784c = m9784c(str);
        if (bArrM9784c == null || bArrM9784c.length <= 0) {
            return null;
        }
        return new String(bArrM9784c);
    }

    /* JADX INFO: renamed from: a */
    private static String m9780a(byte[] bArr) {
        return m9781a(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    private static String m9781a(byte[] bArr, int i) {
        if (i <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i / 3) << 2) + 4];
            int i2 = 0;
            int i3 = 0;
            while (i >= 3) {
                int i4 = ((bArr[i2] & 255) << 16) + ((bArr[i2 + 1] & 255) << 8) + (bArr[i2 + 2] & 255);
                int i5 = i3 + 1;
                char[] cArr2 = f11595e;
                cArr[i3] = cArr2[i4 >> 18];
                int i6 = i5 + 1;
                cArr[i5] = cArr2[(i4 >> 12) & 63];
                int i7 = i6 + 1;
                cArr[i6] = cArr2[(i4 >> 6) & 63];
                i3 = i7 + 1;
                cArr[i7] = cArr2[i4 & 63];
                i2 += 3;
                i -= 3;
            }
            if (i == 1) {
                int i8 = bArr[i2] & 255;
                int i9 = i3 + 1;
                char[] cArr3 = f11595e;
                cArr[i3] = cArr3[i8 >> 2];
                int i10 = i9 + 1;
                cArr[i9] = cArr3[(i8 << 4) & 63];
                int i11 = i10 + 1;
                cArr[i10] = f11596f;
                i3 = i11 + 1;
                cArr[i11] = f11596f;
            } else if (i == 2) {
                int i12 = ((bArr[i2] & 255) << 8) + (bArr[i2 + 1] & 255);
                int i13 = i3 + 1;
                char[] cArr4 = f11595e;
                cArr[i3] = cArr4[i12 >> 10];
                int i14 = i13 + 1;
                cArr[i13] = cArr4[(i12 >> 4) & 63];
                int i15 = i14 + 1;
                cArr[i14] = cArr4[(i12 << 2) & 63];
                i3 = i15 + 1;
                cArr[i15] = f11596f;
            }
            return new String(cArr, 0, i3);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0013, B:8:0x0019, B:10:0x001e, B:16:0x0032, B:12:0x0024, B:14:0x002a, B:19:0x0038), top: B:23:0x0001 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m9782a(char[] r11, int r12, int r13) {
        /*
            r0 = 4
            char[] r1 = new char[r0]     // Catch: java.lang.Exception -> L3e
            int r2 = r13 >> 2
            int r2 = r2 * 3
            int r2 = r2 + 3
            byte[] r3 = new byte[r2]     // Catch: java.lang.Exception -> L3e
            r4 = 0
            r5 = r12
            r6 = 0
            r7 = 0
        Lf:
            int r8 = r12 + r13
            if (r5 >= r8) goto L35
            char r8 = r11[r5]     // Catch: java.lang.Exception -> L3e
            r9 = 61
            if (r8 == r9) goto L24
            byte[] r9 = com.anythink.expressad.foundation.p138h.C1883q.f11597g     // Catch: java.lang.Exception -> L3e
            int r10 = r9.length     // Catch: java.lang.Exception -> L3e
            if (r8 >= r10) goto L32
            r9 = r9[r8]     // Catch: java.lang.Exception -> L3e
            r10 = 127(0x7f, float:1.78E-43)
            if (r9 == r10) goto L32
        L24:
            int r9 = r7 + 1
            r1[r7] = r8     // Catch: java.lang.Exception -> L3e
            if (r9 != r0) goto L31
            int r7 = m9778a(r1, r3, r6)     // Catch: java.lang.Exception -> L3e
            int r6 = r6 + r7
            r7 = 0
            goto L32
        L31:
            r7 = r9
        L32:
            int r5 = r5 + 1
            goto Lf
        L35:
            if (r6 != r2) goto L38
            return r3
        L38:
            byte[] r11 = new byte[r6]     // Catch: java.lang.Exception -> L3e
            java.lang.System.arraycopy(r3, r4, r11, r4, r6)     // Catch: java.lang.Exception -> L3e
            return r11
        L3e:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1883q.m9782a(char[], int, int):byte[]");
    }

    /* JADX INFO: renamed from: b */
    public static String m9783b(String str) {
        byte[] bytes = str.getBytes();
        return m9781a(bytes, bytes.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m9784c(java.lang.String r13) {
        /*
            int r0 = r13.length()     // Catch: java.lang.Exception -> L5b
            r1 = 259(0x103, float:3.63E-43)
            if (r0 >= r1) goto L9
            r1 = r0
        L9:
            char[] r1 = new char[r1]     // Catch: java.lang.Exception -> L5b
            int r2 = r0 >> 2
            int r2 = r2 * 3
            int r2 = r2 + 3
            byte[] r3 = new byte[r2]     // Catch: java.lang.Exception -> L5b
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L17:
            if (r5 >= r0) goto L52
            int r8 = r5 + 256
            if (r8 > r0) goto L23
            r13.getChars(r5, r8, r1, r7)     // Catch: java.lang.Exception -> L5b
            int r5 = r7 + 256
            goto L29
        L23:
            r13.getChars(r5, r0, r1, r7)     // Catch: java.lang.Exception -> L5b
            int r5 = r0 - r5
            int r5 = r5 + r7
        L29:
            r9 = r7
        L2a:
            if (r7 >= r5) goto L4f
            char r10 = r1[r7]     // Catch: java.lang.Exception -> L5b
            r11 = 61
            if (r10 == r11) goto L3d
            byte[] r11 = com.anythink.expressad.foundation.p138h.C1883q.f11597g     // Catch: java.lang.Exception -> L5b
            int r12 = r11.length     // Catch: java.lang.Exception -> L5b
            if (r10 >= r12) goto L4c
            r11 = r11[r10]     // Catch: java.lang.Exception -> L5b
            r12 = 127(0x7f, float:1.78E-43)
            if (r11 == r12) goto L4c
        L3d:
            int r11 = r9 + 1
            r1[r9] = r10     // Catch: java.lang.Exception -> L5b
            r9 = 4
            if (r11 != r9) goto L4b
            int r9 = m9778a(r1, r3, r6)     // Catch: java.lang.Exception -> L5b
            int r6 = r6 + r9
            r9 = 0
            goto L4c
        L4b:
            r9 = r11
        L4c:
            int r7 = r7 + 1
            goto L2a
        L4f:
            r5 = r8
            r7 = r9
            goto L17
        L52:
            if (r6 != r2) goto L55
            return r3
        L55:
            byte[] r13 = new byte[r6]     // Catch: java.lang.Exception -> L5b
            java.lang.System.arraycopy(r3, r4, r13, r4, r6)     // Catch: java.lang.Exception -> L5b
            return r13
        L5b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1883q.m9784c(java.lang.String):byte[]");
    }
}
