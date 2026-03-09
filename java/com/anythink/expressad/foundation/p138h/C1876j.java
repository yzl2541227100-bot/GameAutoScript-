package com.anythink.expressad.foundation.p138h;

import android.text.TextUtils;
import com.umeng.commonsdk.proguard.C3442bg;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.j */
/* JADX INFO: loaded from: classes.dex */
public class C1876j {

    /* JADX INFO: renamed from: a */
    private static final String f11535a = "j";

    /* JADX INFO: renamed from: b */
    private static Map<Character, Character> f11536b;

    /* JADX INFO: renamed from: c */
    private static Map<Character, Character> f11537c;

    /* JADX INFO: renamed from: d */
    private static char[] f11538d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: e */
    private static byte[] f11539e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, C3442bg.f18781k, C3442bg.f18782l, C3442bg.f18783m, C3442bg.f18784n, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        HashMap map = new HashMap();
        f11537c = map;
        map.put('v', 'A');
        f11537c.put('S', 'B');
        f11537c.put('o', 'C');
        f11537c.put('a', 'D');
        f11537c.put('j', 'E');
        f11537c.put('c', 'F');
        f11537c.put('7', 'G');
        f11537c.put('d', 'H');
        f11537c.put('R', 'I');
        f11537c.put('z', 'J');
        f11537c.put('p', 'K');
        f11537c.put('W', 'L');
        f11537c.put('i', 'M');
        f11537c.put('f', 'N');
        f11537c.put('G', 'O');
        f11537c.put('y', 'P');
        f11537c.put('N', 'Q');
        f11537c.put('x', 'R');
        f11537c.put('Z', 'S');
        f11537c.put('n', 'T');
        f11537c.put('V', 'U');
        f11537c.put('5', 'V');
        f11537c.put('k', 'W');
        f11537c.put('+', 'X');
        f11537c.put('D', 'Y');
        f11537c.put('H', 'Z');
        f11537c.put('L', 'a');
        f11537c.put('Y', 'b');
        f11537c.put('h', 'c');
        f11537c.put('J', 'd');
        f11537c.put('4', 'e');
        f11537c.put('6', 'f');
        f11537c.put('l', 'g');
        f11537c.put('t', 'h');
        f11537c.put('0', 'i');
        f11537c.put('U', 'j');
        f11537c.put('3', 'k');
        f11537c.put('Q', 'l');
        f11537c.put('r', 'm');
        f11537c.put('g', 'n');
        f11537c.put('E', 'o');
        f11537c.put('u', 'p');
        f11537c.put('q', 'q');
        f11537c.put('8', 'r');
        f11537c.put('s', 's');
        f11537c.put('w', 't');
        f11537c.put(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), 'u');
        f11537c.put('X', 'v');
        f11537c.put('M', 'w');
        f11537c.put('e', 'x');
        f11537c.put('B', 'y');
        f11537c.put('A', 'z');
        f11537c.put('T', '0');
        f11537c.put('2', '1');
        f11537c.put('F', '2');
        f11537c.put('b', '3');
        f11537c.put('9', '4');
        f11537c.put('P', '5');
        f11537c.put('1', '6');
        f11537c.put('O', '7');
        f11537c.put('I', '8');
        f11537c.put('K', '9');
        f11537c.put('m', '+');
        f11537c.put('C', Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        HashMap map2 = new HashMap();
        f11536b = map2;
        map2.put('A', 'v');
        f11536b.put('B', 'S');
        f11536b.put('C', 'o');
        f11536b.put('D', 'a');
        f11536b.put('E', 'j');
        f11536b.put('F', 'c');
        f11536b.put('G', '7');
        f11536b.put('H', 'd');
        f11536b.put('I', 'R');
        f11536b.put('J', 'z');
        f11536b.put('K', 'p');
        f11536b.put('L', 'W');
        f11536b.put('M', 'i');
        f11536b.put('N', 'f');
        f11536b.put('O', 'G');
        f11536b.put('P', 'y');
        f11536b.put('Q', 'N');
        f11536b.put('R', 'x');
        f11536b.put('S', 'Z');
        f11536b.put('T', 'n');
        f11536b.put('U', 'V');
        f11536b.put('V', '5');
        f11536b.put('W', 'k');
        f11536b.put('X', '+');
        f11536b.put('Y', 'D');
        f11536b.put('Z', 'H');
        f11536b.put('a', 'L');
        f11536b.put('b', 'Y');
        f11536b.put('c', 'h');
        f11536b.put('d', 'J');
        f11536b.put('e', '4');
        f11536b.put('f', '6');
        f11536b.put('g', 'l');
        f11536b.put('h', 't');
        f11536b.put('i', '0');
        f11536b.put('j', 'U');
        f11536b.put('k', '3');
        f11536b.put('l', 'Q');
        f11536b.put('m', 'r');
        f11536b.put('n', 'g');
        f11536b.put('o', 'E');
        f11536b.put('p', 'u');
        f11536b.put('q', 'q');
        f11536b.put('r', '8');
        f11536b.put('s', 's');
        f11536b.put('t', 'w');
        f11536b.put('u', Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        f11536b.put('v', 'X');
        f11536b.put('w', 'M');
        f11536b.put('x', 'e');
        f11536b.put('y', 'B');
        f11536b.put('z', 'A');
        f11536b.put('0', 'T');
        f11536b.put('1', '2');
        f11536b.put('2', 'F');
        f11536b.put('3', 'b');
        f11536b.put('4', '9');
        f11536b.put('5', 'P');
        f11536b.put('6', '1');
        f11536b.put('7', 'O');
        f11536b.put('8', 'I');
        f11536b.put('9', 'K');
        f11536b.put('+', 'm');
        f11536b.put(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), 'C');
    }

    private C1876j() {
    }

    /* JADX INFO: renamed from: a */
    public static String m9686a(String str) {
        return TextUtils.isEmpty(str) ? "" : C1883q.m9783b(str);
    }

    /* JADX INFO: renamed from: a */
    private static String m9687a(byte[] bArr) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                stringBuffer.append(f11538d[i3 >>> 2]);
                stringBuffer.append(f11538d[(i3 & 3) << 4]);
                str = "==";
            } else {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (i4 == length) {
                    stringBuffer.append(f11538d[i3 >>> 2]);
                    stringBuffer.append(f11538d[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                    stringBuffer.append(f11538d[(i5 & 15) << 2]);
                    str = "=";
                } else {
                    int i6 = i4 + 1;
                    int i7 = bArr[i4] & 255;
                    stringBuffer.append(f11538d[i3 >>> 2]);
                    stringBuffer.append(f11538d[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                    stringBuffer.append(f11538d[((i5 & 15) << 2) | ((i7 & 192) >>> 6)]);
                    stringBuffer.append(f11538d[i7 & 63]);
                    i = i6;
                }
            }
            stringBuffer.append(str);
            break;
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m9688b(String str) {
        return C1883q.m9779a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r2 == (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        r1.write(r2 | ((r5 & 3) << 6));
        r2 = r4;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m9689c(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()
            int r0 = r8.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L82
        Ld:
            byte[] r3 = com.anythink.expressad.foundation.p138h.C1876j.f11539e
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
            byte[] r5 = com.anythink.expressad.foundation.p138h.C1876j.f11539e
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
            byte[] r7 = com.anythink.expressad.foundation.p138h.C1876j.f11539e
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
            byte[] r7 = com.anythink.expressad.foundation.p138h.C1876j.f11539e
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
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1876j.m9689c(java.lang.String):byte[]");
    }
}
