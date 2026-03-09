package p285z2;

import com.anythink.expressad.foundation.p138h.C1879m;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: z2.yp */
/* JADX INFO: loaded from: classes2.dex */
public final class C4587yp extends AbstractC4107lq {
    public static final int[] OooO0o = {52, 289, 97, 352, 49, UiMessage.CommandToUi.Command_Type.SET_TEXT_VALUE, 112, 37, 292, 100, 265, 73, 328, 25, C4095le.o0000O, 88, 13, 268, 76, 28, C4095le.o00000Oo, 67, 322, 19, C4095le.o0000O00, 82, 7, C4095le.o00000oO, 70, 22, 385, 193, C1879m.a.f11569a, 145, 400, UiMessage.CommandToUi.Command_Type.SET_TAB_VALUE, 133, 388, 196, 168, 162, 138, 42};
    public static final String OooO0o0 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
    public static final int OooO0oO = 148;
    private final boolean OooO00o;
    private final boolean OooO0O0;
    private final StringBuilder OooO0OO;
    private final int[] OooO0Oo;

    public C4587yp() {
        this(false);
    }

    public C4587yp(boolean z) {
        this(z, false);
    }

    public C4587yp(boolean z, boolean z3) {
        this.OooO00o = z;
        this.OooO0O0 = z3;
        this.OooO0OO = new StringBuilder(20);
        this.OooO0Oo = new int[9];
    }

    private static int[] OooO(C3735bo c3735bo, int[] iArr) throws NotFoundException {
        int iOooOOO0 = c3735bo.OooOOO0();
        int iOooOO0O = c3735bo.OooOO0O(0);
        int length = iArr.length;
        int i = iOooOO0O;
        boolean z = false;
        int i2 = 0;
        while (iOooOO0O < iOooOOO0) {
            if (c3735bo.OooO0oo(iOooOO0O) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else {
                    if (OooOO0O(iArr) == 148 && c3735bo.OooOOOO(Math.max(0, i - ((iOooOO0O - i) / 2)), i, false)) {
                        return new int[]{i, iOooOO0O};
                    }
                    i += iArr[0] + iArr[1];
                    int i3 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i2] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z = !z;
            }
            iOooOO0O++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String OooO0oo(java.lang.CharSequence r12) throws com.google.zxing.FormatException {
        /*
            int r0 = r12.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto Lb8
            char r4 = r12.charAt(r3)
            r5 = 47
            r6 = 37
            r7 = 36
            r8 = 43
            if (r4 == r8) goto L21
            if (r4 == r7) goto L21
            if (r4 == r6) goto L21
            if (r4 != r5) goto Lac
        L21:
            int r3 = r3 + 1
            char r9 = r12.charAt(r3)
            r10 = 90
            r11 = 65
            if (r4 == r7) goto La5
            r7 = 79
            if (r4 == r6) goto L57
            if (r4 == r8) goto L4b
            if (r4 == r5) goto L38
        L35:
            r4 = 0
            goto Lac
        L38:
            if (r9 < r11) goto L40
            if (r9 > r7) goto L40
            int r9 = r9 + (-32)
            goto Lab
        L40:
            if (r9 != r10) goto L46
            r4 = 58
            goto Lac
        L46:
            com.google.zxing.FormatException r12 = com.google.zxing.FormatException.getFormatInstance()
            throw r12
        L4b:
            if (r9 < r11) goto L52
            if (r9 > r10) goto L52
            int r9 = r9 + 32
            goto Lab
        L52:
            com.google.zxing.FormatException r12 = com.google.zxing.FormatException.getFormatInstance()
            throw r12
        L57:
            if (r9 < r11) goto L60
            r4 = 69
            if (r9 > r4) goto L60
            int r9 = r9 + (-38)
            goto Lab
        L60:
            r4 = 70
            if (r9 < r4) goto L6b
            r4 = 74
            if (r9 > r4) goto L6b
            int r9 = r9 + (-11)
            goto Lab
        L6b:
            r4 = 75
            if (r9 < r4) goto L74
            if (r9 > r7) goto L74
            int r9 = r9 + 16
            goto Lab
        L74:
            r4 = 80
            if (r9 < r4) goto L7f
            r4 = 84
            if (r9 > r4) goto L7f
            int r9 = r9 + 43
            goto Lab
        L7f:
            r4 = 85
            if (r9 != r4) goto L84
            goto L35
        L84:
            r4 = 86
            if (r9 != r4) goto L8b
            r4 = 64
            goto Lac
        L8b:
            r4 = 87
            if (r9 != r4) goto L92
            r4 = 96
            goto Lac
        L92:
            r4 = 88
            if (r9 == r4) goto La2
            r4 = 89
            if (r9 == r4) goto La2
            if (r9 != r10) goto L9d
            goto La2
        L9d:
            com.google.zxing.FormatException r12 = com.google.zxing.FormatException.getFormatInstance()
            throw r12
        La2:
            r4 = 127(0x7f, float:1.78E-43)
            goto Lac
        La5:
            if (r9 < r11) goto Lb3
            if (r9 > r10) goto Lb3
            int r9 = r9 + (-64)
        Lab:
            char r4 = (char) r9
        Lac:
            r1.append(r4)
            int r3 = r3 + 1
            goto Lb
        Lb3:
            com.google.zxing.FormatException r12 = com.google.zxing.FormatException.getFormatInstance()
            throw r12
        Lb8:
            java.lang.String r12 = r1.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4587yp.OooO0oo(java.lang.CharSequence):java.lang.String");
    }

    private static char OooOO0(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = OooO0o;
            if (i2 >= iArr.length) {
                if (i == 148) {
                    return '*';
                }
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i2] == i) {
                return OooO0o0.charAt(i2);
            }
            i2++;
        }
    }

    private static int OooOO0O(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }

    @Override // p285z2.AbstractC4107lq
    public final C3770cm OooO0OO(int i, C3735bo c3735bo, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArr = this.OooO0Oo;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.OooO0OO;
        sb.setLength(0);
        int iOooOO0O = c3735bo.OooOO0O(OooO(c3735bo, iArr)[1]);
        int iOooOOO0 = c3735bo.OooOOO0();
        while (true) {
            AbstractC4107lq.OooO0o(c3735bo, iOooOO0O, iArr);
            int iOooOO0O2 = OooOO0O(iArr);
            if (iOooOO0O2 < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cOooOO0 = OooOO0(iOooOO0O2);
            sb.append(cOooOO0);
            int i2 = iOooOO0O;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int iOooOO0O3 = c3735bo.OooOO0O(i2);
            if (cOooOO0 == '*') {
                sb.setLength(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                int i6 = (iOooOO0O3 - iOooOO0O) - i4;
                if (iOooOO0O3 != iOooOOO0 && (i6 << 1) < i4) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.OooO00o) {
                    int length = sb.length() - 1;
                    int iIndexOf = 0;
                    for (int i7 = 0; i7 < length; i7++) {
                        iIndexOf += OooO0o0.indexOf(this.OooO0OO.charAt(i7));
                    }
                    if (sb.charAt(length) != OooO0o0.charAt(iIndexOf % 43)) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                float f = i;
                return new C3770cm(this.OooO0O0 ? OooO0oo(sb) : sb.toString(), null, new C3807dm[]{new C3807dm((r2[1] + r2[0]) / 2.0f, f), new C3807dm(iOooOO0O + (i4 / 2.0f), f)}, BarcodeFormat.CODE_39);
            }
            iOooOO0O = iOooOO0O3;
        }
    }
}
