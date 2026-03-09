package com.tramini.plugin.p261a.p269h;

import android.text.TextUtils;
import com.umeng.commonsdk.proguard.C3442bg;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p284io.IOUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3357c {

    /* JADX INFO: renamed from: b */
    private static final String f18214b = "c";

    /* JADX INFO: renamed from: e */
    private static char[] f18217e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: f */
    private static byte[] f18218f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, C3442bg.f18781k, C3442bg.f18782l, C3442bg.f18783m, C3442bg.f18784n, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: a */
    public static String f18213a = "";

    /* JADX INFO: renamed from: g */
    private static String f18219g = "";

    /* JADX INFO: renamed from: d */
    private static Map<Character, Character> f18216d = new HashMap();

    /* JADX INFO: renamed from: c */
    private static Map<Character, Character> f18215c = new HashMap();

    private C3357c() {
    }

    /* JADX INFO: renamed from: a */
    private static Character m15297a(char c) {
        if (f18216d == null) {
            f18216d = new HashMap();
            for (int i = 0; i < f18213a.length(); i++) {
                f18216d.put(Character.valueOf(f18219g.charAt(i)), Character.valueOf(f18213a.charAt(i)));
            }
        }
        return f18216d.containsKey(Character.valueOf(c)) ? f18216d.get(Character.valueOf(c)) : Character.valueOf(c);
    }

    /* JADX INFO: renamed from: a */
    public static String m15298a(String str) {
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
                    if (f18216d == null) {
                        f18216d = new HashMap();
                        for (int i2 = 0; i2 < f18213a.length(); i2++) {
                            f18216d.put(Character.valueOf(f18219g.charAt(i2)), Character.valueOf(f18213a.charAt(i2)));
                        }
                    }
                    cArr[i] = (f18216d.containsKey(Character.valueOf(c)) ? f18216d.get(Character.valueOf(c)) : Character.valueOf(c)).charValue();
                }
                str2 = new String(cArr);
            }
            return new String(m15303d(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m15299a(byte[] bArr) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                stringBuffer.append(f18217e[i3 >>> 2]);
                stringBuffer.append(f18217e[(i3 & 3) << 4]);
                str = "==";
            } else {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (i4 == length) {
                    stringBuffer.append(f18217e[i3 >>> 2]);
                    stringBuffer.append(f18217e[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                    stringBuffer.append(f18217e[(i5 & 15) << 2]);
                    str = "=";
                } else {
                    int i6 = i4 + 1;
                    int i7 = bArr[i4] & 255;
                    stringBuffer.append(f18217e[i3 >>> 2]);
                    stringBuffer.append(f18217e[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                    stringBuffer.append(f18217e[((i5 & 15) << 2) | ((i7 & 192) >>> 6)]);
                    stringBuffer.append(f18217e[i7 & 63]);
                    i = i6;
                }
            }
            stringBuffer.append(str);
            break;
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    private static Character m15300b(char c) {
        if (f18215c == null) {
            f18215c = new HashMap();
            for (int i = 0; i < f18213a.length(); i++) {
                f18215c.put(Character.valueOf(f18213a.charAt(i)), Character.valueOf(f18219g.charAt(i)));
            }
        }
        return f18215c.containsKey(Character.valueOf(c)) ? f18215c.get(Character.valueOf(c)) : Character.valueOf(c);
    }

    /* JADX INFO: renamed from: b */
    public static String m15301b(String str) {
        char[] charArray;
        try {
            if (TextUtils.isEmpty(str) || (charArray = m15299a(str.getBytes()).toCharArray()) == null || charArray.length <= 0) {
                return "";
            }
            char[] cArr = new char[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                if (f18215c == null) {
                    f18215c = new HashMap();
                    for (int i2 = 0; i2 < f18213a.length(); i2++) {
                        f18215c.put(Character.valueOf(f18213a.charAt(i2)), Character.valueOf(f18219g.charAt(i2)));
                    }
                }
                cArr[i] = (f18215c.containsKey(Character.valueOf(c)) ? f18215c.get(Character.valueOf(c)) : Character.valueOf(c)).charValue();
            }
            return new String(cArr);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m15302c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("k");
            String strOptString2 = jSONObject.optString("v");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            f18213a = strOptString;
            f18219g = strOptString2;
            for (int i = 0; i < f18213a.length(); i++) {
                f18216d.put(Character.valueOf(f18219g.charAt(i)), Character.valueOf(f18213a.charAt(i)));
            }
            for (int i2 = 0; i2 < f18213a.length(); i2++) {
                f18215c.put(Character.valueOf(f18213a.charAt(i2)), Character.valueOf(f18219g.charAt(i2)));
            }
        } catch (Throwable unused) {
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
    private static byte[] m15303d(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()
            int r0 = r8.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L82
        Ld:
            byte[] r3 = com.tramini.plugin.p261a.p269h.C3357c.f18218f
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
            byte[] r5 = com.tramini.plugin.p261a.p269h.C3357c.f18218f
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
            byte[] r7 = com.tramini.plugin.p261a.p269h.C3357c.f18218f
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
            byte[] r7 = com.tramini.plugin.p261a.p269h.C3357c.f18218f
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
        throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.p261a.p269h.C3357c.m15303d(java.lang.String):byte[]");
    }
}
