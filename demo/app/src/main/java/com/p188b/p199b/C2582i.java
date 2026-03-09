package com.p188b.p199b;

import com.umeng.commonsdk.proguard.C3442bg;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.b.b.i */
/* JADX INFO: loaded from: classes.dex */
public class C2582i implements Serializable, Comparable<C2582i> {

    /* JADX INFO: renamed from: a */
    public static final char[] f15821a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final C2582i f15822b = m13042a(new byte[0]);

    /* JADX INFO: renamed from: c */
    public final byte[] f15823c;

    /* JADX INFO: renamed from: d */
    public transient int f15824d;

    /* JADX INFO: renamed from: e */
    public transient String f15825e;

    public C2582i(byte[] bArr) {
        this.f15823c = bArr;
    }

    /* JADX INFO: renamed from: a */
    private static int m13040a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
            }
        }
        return (c - c2) + 10;
    }

    /* JADX INFO: renamed from: a */
    public static C2582i m13041a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C2582i c2582i = new C2582i(str.getBytes(C2574aa.f15811a));
        c2582i.f15825e = str;
        return c2582i;
    }

    /* JADX INFO: renamed from: a */
    public static C2582i m13042a(byte... bArr) {
        if (bArr != null) {
            return new C2582i((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* JADX INFO: renamed from: b */
    public static C2582i m13043b(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m13040a(str.charAt(i2)) << 4) + m13040a(str.charAt(i2 + 1)));
        }
        return m13042a(bArr);
    }

    /* JADX INFO: renamed from: c */
    private C2582i m13044c(String str) {
        try {
            return m13042a(MessageDigest.getInstance(str).digest(this.f15823c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public byte mo13045a(int i) {
        return this.f15823c[i];
    }

    /* JADX INFO: renamed from: a */
    public C2582i mo13046a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f15823c;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f15823c.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new C2582i(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public String mo13047a() {
        String str = this.f15825e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f15823c, C2574aa.f15811a);
        this.f15825e = str2;
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public void mo13048a(C2579f c2579f) {
        byte[] bArr = this.f15823c;
        c2579f.mo13010b(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo13049a(int i, C2582i c2582i, int i2, int i3) {
        return c2582i.mo13050a(0, this.f15823c, 0, i3);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo13050a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f15823c;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C2574aa.m12987a(bArr2, i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: b */
    public String mo13051b() {
        return C2578e.m12988a(this.f15823c);
    }

    /* JADX INFO: renamed from: c */
    public C2582i mo13052c() {
        return m13044c("SHA-1");
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(C2582i c2582i) {
        C2582i c2582i2 = c2582i;
        int iMo13056g = mo13056g();
        int iMo13056g2 = c2582i2.mo13056g();
        int iMin = Math.min(iMo13056g, iMo13056g2);
        for (int i = 0; i < iMin; i++) {
            int iMo13045a = mo13045a(i) & 255;
            int iMo13045a2 = c2582i2.mo13045a(i) & 255;
            if (iMo13045a != iMo13045a2) {
                return iMo13045a < iMo13045a2 ? -1 : 1;
            }
        }
        if (iMo13056g == iMo13056g2) {
            return 0;
        }
        return iMo13056g < iMo13056g2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: d */
    public C2582i mo13053d() {
        return m13044c("SHA-256");
    }

    /* JADX INFO: renamed from: e */
    public String mo13054e() {
        byte[] bArr = this.f15823c;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f15821a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & C3442bg.f18783m];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2582i) {
            C2582i c2582i = (C2582i) obj;
            int iMo13056g = c2582i.mo13056g();
            byte[] bArr = this.f15823c;
            if (iMo13056g == bArr.length && c2582i.mo13050a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C2582i mo13055f() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f15823c;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C2582i(bArr2);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public int mo13056g() {
        return this.f15823c.length;
    }

    /* JADX INFO: renamed from: h */
    public byte[] mo13057h() {
        return (byte[]) this.f15823c.clone();
    }

    public int hashCode() {
        int i = this.f15824d;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f15823c);
        this.f15824d = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            byte[] r0 = r9.f15823c
            int r0 = r0.length
            if (r0 != 0) goto L8
            java.lang.String r0 = "[size=0]"
            return r0
        L8:
            java.lang.String r0 = r9.mo13047a()
            int r1 = r0.length()
            r2 = 0
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 64
            if (r3 >= r1) goto L3c
            if (r4 != r6) goto L1b
            goto L40
        L1b:
            int r7 = r0.codePointAt(r3)
            boolean r8 = java.lang.Character.isISOControl(r7)
            if (r8 == 0) goto L2d
            r8 = 10
            if (r7 == r8) goto L2d
            r8 = 13
            if (r7 != r8) goto L32
        L2d:
            r8 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r8) goto L34
        L32:
            r3 = -1
            goto L40
        L34:
            int r4 = r4 + 1
            int r5 = java.lang.Character.charCount(r7)
            int r3 = r3 + r5
            goto L13
        L3c:
            int r3 = r0.length()
        L40:
            java.lang.String r1 = "…]"
            java.lang.String r4 = "[size="
            java.lang.String r7 = "]"
            if (r3 != r5) goto L82
            byte[] r0 = r9.f15823c
            int r0 = r0.length
            if (r0 > r6) goto L63
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[hex="
            r0.<init>(r1)
            java.lang.String r1 = r9.mo13054e()
            r0.append(r1)
        L5b:
            r0.append(r7)
        L5e:
            java.lang.String r0 = r0.toString()
            return r0
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            byte[] r3 = r9.f15823c
            int r3 = r3.length
            r0.append(r3)
            java.lang.String r3 = " hex="
            r0.append(r3)
            com.b.b.i r2 = r9.mo13046a(r2, r6)
            java.lang.String r2 = r2.mo13054e()
        L7b:
            r0.append(r2)
            r0.append(r1)
            goto L5e
        L82:
            java.lang.String r2 = r0.substring(r2, r3)
            java.lang.String r5 = "\\"
            java.lang.String r6 = "\\\\"
            java.lang.String r2 = r2.replace(r5, r6)
            java.lang.String r5 = "\n"
            java.lang.String r6 = "\\n"
            java.lang.String r2 = r2.replace(r5, r6)
            java.lang.String r5 = "\r"
            java.lang.String r6 = "\\r"
            java.lang.String r2 = r2.replace(r5, r6)
            int r0 = r0.length()
            if (r3 >= r0) goto Lb5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            byte[] r3 = r9.f15823c
            int r3 = r3.length
            r0.append(r3)
            java.lang.String r3 = " text="
            r0.append(r3)
            goto L7b
        Lb5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[text="
            r0.<init>(r1)
            r0.append(r2)
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p199b.C2582i.toString():java.lang.String");
    }
}
