package p285z2;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: z2.mt */
/* JADX INFO: loaded from: classes2.dex */
public final class C4147mt {
    private static final int[] OooO00o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final String OooO0O0 = "ISO-8859-1";

    /* JADX INFO: renamed from: z2.mt$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        static {
            int[] iArr = new int[Mode.values().length];
            OooO00o = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO00o[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OooO00o[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OooO00o[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private C4147mt() {
    }

    private static int OooO(Mode mode, C3735bo c3735bo, C3735bo c3735bo2, C3851et c3851et) {
        return c3735bo.OooOOO0() + mode.getCharacterCountBits(c3851et) + c3735bo2.OooOOO0();
    }

    public static void OooO00o(String str, C3735bo c3735bo, String str2) throws WriterException {
        try {
            for (byte b : str.getBytes(str2)) {
                c3735bo.OooO0OO(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    public static void OooO0O0(CharSequence charSequence, C3735bo c3735bo) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iOooOOo = OooOOo(charSequence.charAt(i));
            if (iOooOOo == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int iOooOOo2 = OooOOo(charSequence.charAt(i2));
                if (iOooOOo2 == -1) {
                    throw new WriterException();
                }
                c3735bo.OooO0OO((iOooOOo * 45) + iOooOOo2, 11);
                i += 2;
            } else {
                c3735bo.OooO0OO(iOooOOo, 6);
                i = i2;
            }
        }
    }

    public static void OooO0OO(String str, Mode mode, C3735bo c3735bo, String str2) throws WriterException {
        int i = OooO00o.OooO00o[mode.ordinal()];
        if (i == 1) {
            OooO0oo(str, c3735bo);
            return;
        }
        if (i == 2) {
            OooO0O0(str, c3735bo);
        } else if (i == 3) {
            OooO00o(str, c3735bo, str2);
        } else {
            if (i != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            OooO0o0(str, c3735bo);
        }
    }

    private static void OooO0Oo(CharacterSetECI characterSetECI, C3735bo c3735bo) {
        c3735bo.OooO0OO(Mode.ECI.getBits(), 4);
        c3735bo.OooO0OO(characterSetECI.getValue(), 8);
    }

    public static void OooO0o(int i, C3851et c3851et, Mode mode, C3735bo c3735bo) throws WriterException {
        int characterCountBits = mode.getCharacterCountBits(c3851et);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            c3735bo.OooO0OO(i, characterCountBits);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    public static void OooO0o0(String str, C3735bo c3735bo) throws WriterException {
        int i;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = ((bytes[i2] & 255) << 8) | (bytes[i2 + 1] & 255);
                int i4 = 33088;
                if (i3 >= 33088 && i3 <= 40956) {
                    i = i3 - i4;
                } else if (i3 < 57408 || i3 > 60351) {
                    i = -1;
                } else {
                    i4 = 49472;
                    i = i3 - i4;
                }
                if (i == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                c3735bo.OooO0OO(((i >> 8) * 192) + (i & 255), 13);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    public static void OooO0oO(Mode mode, C3735bo c3735bo) {
        c3735bo.OooO0OO(mode.getBits(), 4);
    }

    public static void OooO0oo(CharSequence charSequence, C3735bo c3735bo) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCharAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                c3735bo.OooO0OO((iCharAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    c3735bo.OooO0OO((iCharAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    c3735bo.OooO0OO(iCharAt, 4);
                }
            }
        }
    }

    private static int OooOO0(C4110lt c4110lt) {
        return C4184nt.OooO00o(c4110lt) + C4184nt.OooO0OO(c4110lt) + C4184nt.OooO0Oo(c4110lt) + C4184nt.OooO0o0(c4110lt);
    }

    private static int OooOO0O(C3735bo c3735bo, ErrorCorrectionLevel errorCorrectionLevel, C3851et c3851et, C4110lt c4110lt) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C4221ot.OooO00o(c3735bo, errorCorrectionLevel, c3851et, i3, c4110lt);
            int iOooOO0 = OooOO0(c4110lt);
            if (iOooOO0 < i) {
                i2 = i3;
                i = iOooOO0;
            }
        }
        return i2;
    }

    public static Mode OooOO0o(String str) {
        return OooOOO0(str, null);
    }

    private static C3851et OooOOO(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            C3851et c3851etOooO = C3851et.OooO(i2);
            if (OooOo(i, c3851etOooO, errorCorrectionLevel)) {
                return c3851etOooO;
            }
        }
        throw new WriterException("Data too big");
    }

    private static Mode OooOOO0(String str, String str2) {
        if ("Shift_JIS".equals(str2) && OooOo0(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z3 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z3 = true;
            } else {
                if (OooOOo(cCharAt) == -1) {
                    return Mode.BYTE;
                }
                z = true;
            }
        }
        return z ? Mode.ALPHANUMERIC : z3 ? Mode.NUMERIC : Mode.BYTE;
    }

    public static C4258pt OooOOOO(String str, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        return OooOOOo(str, errorCorrectionLevel, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p285z2.C4258pt OooOOOo(java.lang.String r7, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r8, java.util.Map<com.google.zxing.EncodeHintType, ?> r9) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4147mt.OooOOOo(java.lang.String, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):z2.pt");
    }

    public static int OooOOo(int i) {
        int[] iArr = OooO00o;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    public static byte[] OooOOo0(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C4401to(C4290qo.OooOO0o).OooO0O0(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    public static void OooOOoo(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 >= i3) {
            throw new WriterException("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
        } else {
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    private static boolean OooOo(int i, C3851et c3851et, ErrorCorrectionLevel errorCorrectionLevel) {
        return c3851et.OooO0oo() - c3851et.OooO0o(errorCorrectionLevel).OooO0Oo() >= (i + 7) / 8;
    }

    private static boolean OooOo0(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static C3735bo OooOo00(C3735bo c3735bo, int i, int i2, int i3) throws WriterException {
        if (c3735bo.OooOOO() != i2) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            OooOOoo(i, i2, i3, i5, iArr, iArr2);
            int i6 = iArr[0];
            byte[] bArr = new byte[i6];
            c3735bo.OooOo0(i4 << 3, bArr, 0, i6);
            byte[] bArrOooOOo0 = OooOOo0(bArr, iArr2[0]);
            arrayList.add(new C4073kt(bArr, bArrOooOOo0));
            iMax = Math.max(iMax, i6);
            iMax2 = Math.max(iMax2, bArrOooOOo0.length);
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new WriterException("Data bytes does not match offset");
        }
        C3735bo c3735bo2 = new C3735bo();
        for (int i7 = 0; i7 < iMax; i7++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrOooO00o = ((C4073kt) it.next()).OooO00o();
                if (i7 < bArrOooO00o.length) {
                    c3735bo2.OooO0OO(bArrOooO00o[i7], 8);
                }
            }
        }
        for (int i8 = 0; i8 < iMax2; i8++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrOooO0O0 = ((C4073kt) it2.next()).OooO0O0();
                if (i8 < bArrOooO0O0.length) {
                    c3735bo2.OooO0OO(bArrOooO0O0[i8], 8);
                }
            }
        }
        if (i == c3735bo2.OooOOO()) {
            return c3735bo2;
        }
        throw new WriterException("Interleaving error: " + i + " and " + c3735bo2.OooOOO() + " differ.");
    }

    private static C3851et OooOo0O(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, C3735bo c3735bo, C3735bo c3735bo2) throws WriterException {
        return OooOOO(OooO(mode, c3735bo, c3735bo2, OooOOO(OooO(mode, c3735bo, c3735bo2, C3851et.OooO(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    public static void OooOo0o(int i, C3735bo c3735bo) throws WriterException {
        int i2 = i << 3;
        if (c3735bo.OooOOO0() > i2) {
            throw new WriterException("data bits cannot fit in the QR Code" + c3735bo.OooOOO0() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && c3735bo.OooOOO0() < i2; i3++) {
            c3735bo.OooO00o(false);
        }
        int iOooOOO0 = c3735bo.OooOOO0() & 7;
        if (iOooOOO0 > 0) {
            while (iOooOOO0 < 8) {
                c3735bo.OooO00o(false);
                iOooOOO0++;
            }
        }
        int iOooOOO = i - c3735bo.OooOOO();
        for (int i4 = 0; i4 < iOooOOO; i4++) {
            c3735bo.OooO0OO((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (c3735bo.OooOOO0() != i2) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }
}
