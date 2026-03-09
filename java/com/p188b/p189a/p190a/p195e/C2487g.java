package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2582i;
import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.a.e.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2487g {

    /* JADX INFO: renamed from: a */
    public static final C2582i f15323a = C2582i.m13041a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: d */
    private static final String[] f15326d = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: b */
    public static final String[] f15324b = new String[64];

    /* JADX INFO: renamed from: c */
    public static final String[] f15325c = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f15325c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C2446c.m12576a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f15324b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 <= 0; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f15324b;
            strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
        }
        String[] strArr4 = f15324b;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f15324b;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = f15324b;
            if (i >= strArr6.length) {
                return;
            }
            if (strArr6[i] == null) {
                strArr6[i] = f15325c[i];
            }
            i++;
        }
    }

    private C2487g() {
    }

    /* JADX INFO: renamed from: a */
    public static IllegalArgumentException m12718a(String str, Object... objArr) {
        throw new IllegalArgumentException(C2446c.m12576a(str, objArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m12719a(boolean r9, int r10, int r11, byte r12, byte r13) {
        /*
            java.lang.String[] r0 = com.p188b.p189a.p190a.p195e.C2487g.f15326d
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r12 >= r1) goto La
            r0 = r0[r12]
            goto L18
        La:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r2] = r1
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = com.p188b.p189a.p190a.C2446c.m12576a(r1, r0)
        L18:
            r1 = 5
            r4 = 3
            r5 = 2
            r6 = 4
            if (r13 != 0) goto L21
            java.lang.String r12 = ""
            goto L67
        L21:
            if (r12 == r5) goto L63
            if (r12 == r4) goto L63
            if (r12 == r6) goto L59
            r7 = 6
            if (r12 == r7) goto L59
            r7 = 7
            if (r12 == r7) goto L63
            r7 = 8
            if (r12 == r7) goto L63
            java.lang.String[] r7 = com.p188b.p189a.p190a.p195e.C2487g.f15324b
            int r8 = r7.length
            if (r13 >= r8) goto L39
            r7 = r7[r13]
            goto L3d
        L39:
            java.lang.String[] r7 = com.p188b.p189a.p190a.p195e.C2487g.f15325c
            r7 = r7[r13]
        L3d:
            if (r12 != r1) goto L4c
            r8 = r13 & 4
            if (r8 == 0) goto L4c
            java.lang.String r12 = "HEADERS"
            java.lang.String r13 = "PUSH_PROMISE"
        L47:
            java.lang.String r12 = r7.replace(r12, r13)
            goto L67
        L4c:
            if (r12 != 0) goto L57
            r12 = r13 & 32
            if (r12 == 0) goto L57
            java.lang.String r12 = "PRIORITY"
            java.lang.String r13 = "COMPRESSED"
            goto L47
        L57:
            r12 = r7
            goto L67
        L59:
            if (r13 != r3) goto L5e
            java.lang.String r12 = "ACK"
            goto L67
        L5e:
            java.lang.String[] r12 = com.p188b.p189a.p190a.p195e.C2487g.f15325c
            r12 = r12[r13]
            goto L67
        L63:
            java.lang.String[] r12 = com.p188b.p189a.p190a.p195e.C2487g.f15325c
            r12 = r12[r13]
        L67:
            java.lang.Object[] r13 = new java.lang.Object[r1]
            if (r9 == 0) goto L6e
            java.lang.String r9 = "<<"
            goto L70
        L6e:
            java.lang.String r9 = ">>"
        L70:
            r13[r2] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r13[r3] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r13[r5] = r9
            r13[r4] = r0
            r13[r6] = r12
            java.lang.String r9 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r9 = com.p188b.p189a.p190a.C2446c.m12576a(r9, r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p195e.C2487g.m12719a(boolean, int, int, byte, byte):java.lang.String");
    }

    /* JADX INFO: renamed from: b */
    public static IOException m12720b(String str, Object... objArr) throws IOException {
        throw new IOException(C2446c.m12576a(str, objArr));
    }
}
