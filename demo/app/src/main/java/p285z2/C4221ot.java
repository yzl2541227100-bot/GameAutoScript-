package p285z2;

import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: z2.ot */
/* JADX INFO: loaded from: classes2.dex */
public final class C4221ot {
    private static final int[][] OooO00o = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] OooO0O0 = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] OooO0OO = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, InterfaceC2174a.f13804H, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] OooO0Oo = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    private static final int OooO0o = 1335;
    private static final int OooO0o0 = 7973;
    private static final int OooO0oO = 21522;

    private C4221ot() {
    }

    private static void OooO(int i, int i2, C4110lt c4110lt) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = OooO00o[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                c4110lt.OooO0oO(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void OooO00o(C3735bo c3735bo, ErrorCorrectionLevel errorCorrectionLevel, C3851et c3851et, int i, C4110lt c4110lt) throws WriterException {
        OooO0OO(c4110lt);
        OooO0Oo(c3851et, c4110lt);
        OooOO0o(errorCorrectionLevel, i, c4110lt);
        OooOOoo(c3851et, c4110lt);
        OooO0o(c3735bo, i, c4110lt);
    }

    public static int OooO0O0(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iOooOOO = OooOOO(i2);
        int iOooOOO2 = i << (iOooOOO - 1);
        while (OooOOO(iOooOOO2) >= iOooOOO) {
            iOooOOO2 ^= i2 << (OooOOO(iOooOOO2) - iOooOOO);
        }
        return iOooOOO2;
    }

    public static void OooO0OO(C4110lt c4110lt) {
        c4110lt.OooO00o((byte) -1);
    }

    public static void OooO0Oo(C3851et c3851et, C4110lt c4110lt) throws WriterException {
        OooOO0(c4110lt);
        OooO0o0(c4110lt);
        OooOOo(c3851et, c4110lt);
        OooOO0O(c4110lt);
    }

    public static void OooO0o(C3735bo c3735bo, int i, C4110lt c4110lt) throws WriterException {
        boolean zOooO0oo;
        int iOooO0o0 = c4110lt.OooO0o0() - 1;
        int iOooO0Oo = c4110lt.OooO0Oo() - 1;
        int i2 = 0;
        int i3 = -1;
        while (iOooO0o0 > 0) {
            if (iOooO0o0 == 6) {
                iOooO0o0--;
            }
            while (iOooO0Oo >= 0 && iOooO0Oo < c4110lt.OooO0Oo()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = iOooO0o0 - i4;
                    if (OooOOOO(c4110lt.OooO0O0(i5, iOooO0Oo))) {
                        if (i2 < c3735bo.OooOOO0()) {
                            zOooO0oo = c3735bo.OooO0oo(i2);
                            i2++;
                        } else {
                            zOooO0oo = false;
                        }
                        if (i != -1 && C4184nt.OooO0o(i, i5, iOooO0Oo)) {
                            zOooO0oo = !zOooO0oo;
                        }
                        c4110lt.OooO0oo(i5, iOooO0Oo, zOooO0oo);
                    }
                }
                iOooO0Oo += i3;
            }
            i3 = -i3;
            iOooO0Oo += i3;
            iOooO0o0 -= 2;
        }
        if (i2 == c3735bo.OooOOO0()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i2 + IOUtils.DIR_SEPARATOR_UNIX + c3735bo.OooOOO0());
    }

    private static void OooO0o0(C4110lt c4110lt) throws WriterException {
        if (c4110lt.OooO0O0(8, c4110lt.OooO0Oo() - 8) == 0) {
            throw new WriterException();
        }
        c4110lt.OooO0oO(8, c4110lt.OooO0Oo() - 8, 1);
    }

    private static void OooO0oO(int i, int i2, C4110lt c4110lt) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!OooOOOO(c4110lt.OooO0O0(i4, i2))) {
                throw new WriterException();
            }
            c4110lt.OooO0oO(i4, i2, 0);
        }
    }

    private static void OooO0oo(int i, int i2, C4110lt c4110lt) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = OooO0O0[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                c4110lt.OooO0oO(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void OooOO0(C4110lt c4110lt) throws WriterException {
        int length = OooO00o[0].length;
        OooO(0, 0, c4110lt);
        OooO(c4110lt.OooO0o0() - length, 0, c4110lt);
        OooO(0, c4110lt.OooO0o0() - length, c4110lt);
        OooO0oO(0, 7, c4110lt);
        OooO0oO(c4110lt.OooO0o0() - 8, 7, c4110lt);
        OooO0oO(0, c4110lt.OooO0o0() - 8, c4110lt);
        OooOOO0(7, 0, c4110lt);
        OooOOO0((c4110lt.OooO0Oo() - 7) - 1, 0, c4110lt);
        OooOOO0(7, c4110lt.OooO0Oo() - 7, c4110lt);
    }

    private static void OooOO0O(C4110lt c4110lt) {
        int i = 8;
        while (i < c4110lt.OooO0o0() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (OooOOOO(c4110lt.OooO0O0(i, 6))) {
                c4110lt.OooO0oO(i, 6, i3);
            }
            if (OooOOOO(c4110lt.OooO0O0(6, i))) {
                c4110lt.OooO0oO(6, i, i3);
            }
            i = i2;
        }
    }

    public static void OooOO0o(ErrorCorrectionLevel errorCorrectionLevel, int i, C4110lt c4110lt) throws WriterException {
        C3735bo c3735bo = new C3735bo();
        OooOOOo(errorCorrectionLevel, i, c3735bo);
        for (int i2 = 0; i2 < c3735bo.OooOOO0(); i2++) {
            boolean zOooO0oo = c3735bo.OooO0oo((c3735bo.OooOOO0() - 1) - i2);
            int[] iArr = OooO0Oo[i2];
            c4110lt.OooO0oo(iArr[0], iArr[1], zOooO0oo);
            if (i2 < 8) {
                c4110lt.OooO0oo((c4110lt.OooO0o0() - i2) - 1, 8, zOooO0oo);
            } else {
                c4110lt.OooO0oo(8, (c4110lt.OooO0Oo() - 7) + (i2 - 8), zOooO0oo);
            }
        }
    }

    public static int OooOOO(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    private static void OooOOO0(int i, int i2, C4110lt c4110lt) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!OooOOOO(c4110lt.OooO0O0(i, i4))) {
                throw new WriterException();
            }
            c4110lt.OooO0oO(i, i4, 0);
        }
    }

    private static boolean OooOOOO(int i) {
        return i == -1;
    }

    public static void OooOOOo(ErrorCorrectionLevel errorCorrectionLevel, int i, C3735bo c3735bo) throws WriterException {
        if (!C4258pt.OooO0o(i)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i;
        c3735bo.OooO0OO(bits, 5);
        c3735bo.OooO0OO(OooO0O0(bits, OooO0o), 10);
        C3735bo c3735bo2 = new C3735bo();
        c3735bo2.OooO0OO(OooO0oO, 15);
        c3735bo.OooOo0O(c3735bo2);
        if (c3735bo.OooOOO0() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + c3735bo.OooOOO0());
    }

    private static void OooOOo(C3851et c3851et, C4110lt c4110lt) {
        if (c3851et.OooOO0() < 2) {
            return;
        }
        int[] iArr = OooO0OO[c3851et.OooOO0() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && OooOOOO(c4110lt.OooO0O0(i2, i))) {
                        OooO0oo(i2 - 2, i - 2, c4110lt);
                    }
                }
            }
        }
    }

    public static void OooOOo0(C3851et c3851et, C3735bo c3735bo) throws WriterException {
        c3735bo.OooO0OO(c3851et.OooOO0(), 6);
        c3735bo.OooO0OO(OooO0O0(c3851et.OooOO0(), OooO0o0), 12);
        if (c3735bo.OooOOO0() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + c3735bo.OooOOO0());
    }

    public static void OooOOoo(C3851et c3851et, C4110lt c4110lt) throws WriterException {
        if (c3851et.OooOO0() < 7) {
            return;
        }
        C3735bo c3735bo = new C3735bo();
        OooOOo0(c3851et, c3735bo);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean zOooO0oo = c3735bo.OooO0oo(i);
                i--;
                c4110lt.OooO0oo(i2, (c4110lt.OooO0Oo() - 11) + i3, zOooO0oo);
                c4110lt.OooO0oo((c4110lt.OooO0Oo() - 11) + i3, i2, zOooO0oo);
            }
        }
    }
}
