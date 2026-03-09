package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Map;

/* JADX INFO: renamed from: z2.vo */
/* JADX INFO: loaded from: classes2.dex */
public final class C4475vo implements InterfaceC3881fm {
    private static C3772co OooO0OO(C4110lt c4110lt, int i, int i2) {
        C3772co c3772co;
        int iOooO0o0 = c4110lt.OooO0o0();
        int iOooO0Oo = c4110lt.OooO0Oo();
        int iMax = Math.max(i, iOooO0o0);
        int iMax2 = Math.max(i2, iOooO0Oo);
        int iMin = Math.min(iMax / iOooO0o0, iMax2 / iOooO0Oo);
        int i3 = (iMax - (iOooO0o0 * iMin)) / 2;
        int i4 = (iMax2 - (iOooO0Oo * iMin)) / 2;
        if (i2 < iOooO0Oo || i < iOooO0o0) {
            c3772co = new C3772co(iOooO0o0, iOooO0Oo);
            i3 = 0;
            i4 = 0;
        } else {
            c3772co = new C3772co(i, i2);
        }
        c3772co.OooO0O0();
        int i5 = 0;
        while (i5 < iOooO0Oo) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < iOooO0o0) {
                if (c4110lt.OooO0O0(i7, i5) == 1) {
                    c3772co.OooOOo(i6, i4, iMin, iMin);
                }
                i7++;
                i6 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return c3772co;
    }

    private static C3772co OooO0Oo(C3847ep c3847ep, C4069kp c4069kp, int i, int i2) {
        int iOooO = c4069kp.OooO();
        int iOooO0oo = c4069kp.OooO0oo();
        C4110lt c4110lt = new C4110lt(c4069kp.OooOO0O(), c4069kp.OooOO0());
        int i3 = 0;
        for (int i4 = 0; i4 < iOooO0oo; i4++) {
            if (i4 % c4069kp.OooO0o0 == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < c4069kp.OooOO0O(); i6++) {
                    c4110lt.OooO0oo(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < iOooO; i8++) {
                if (i8 % c4069kp.OooO0Oo == 0) {
                    c4110lt.OooO0oo(i7, i3, true);
                    i7++;
                }
                c4110lt.OooO0oo(i7, i3, c3847ep.OooO0o0(i8, i4));
                i7++;
                int i9 = c4069kp.OooO0Oo;
                if (i8 % i9 == i9 - 1) {
                    c4110lt.OooO0oo(i7, i3, i4 % 2 == 0);
                    i7++;
                }
            }
            i3++;
            int i10 = c4069kp.OooO0o0;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < c4069kp.OooOO0O(); i12++) {
                    c4110lt.OooO0oo(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return OooO0OO(c4110lt, i, i2);
    }

    @Override // p285z2.InterfaceC3881fm
    public final C3772co OooO00o(String str, BarcodeFormat barcodeFormat, int i, int i2) {
        return OooO0O0(str, barcodeFormat, i, i2, null);
    }

    @Override // p285z2.InterfaceC3881fm
    public final C3772co OooO0O0(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        C4435ul c4435ul;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        C4435ul c4435ul2 = null;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            C4435ul c4435ul3 = (C4435ul) map.get(EncodeHintType.MIN_SIZE);
            if (c4435ul3 == null) {
                c4435ul3 = null;
            }
            c4435ul = (C4435ul) map.get(EncodeHintType.MAX_SIZE);
            if (c4435ul == null) {
                c4435ul = null;
            }
            c4435ul2 = c4435ul3;
        } else {
            c4435ul = null;
        }
        String strOooO0OO = C4032jp.OooO0OO(str, symbolShapeHint, c4435ul2, c4435ul);
        C4069kp c4069kpOooOOOO = C4069kp.OooOOOO(strOooO0OO.length(), symbolShapeHint, c4435ul2, c4435ul, true);
        C3847ep c3847ep = new C3847ep(C3995ip.OooO0OO(strOooO0OO, c4069kpOooOOOO), c4069kpOooOOOO.OooO(), c4069kpOooOOOO.OooO0oo());
        c3847ep.OooOO0O();
        return OooO0Oo(c3847ep, c4069kpOooOOOO, i, i2);
    }
}
