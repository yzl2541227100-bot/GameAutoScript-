package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.datamatrix.detector.Detector;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: z2.uo */
/* JADX INFO: loaded from: classes2.dex */
public final class C4438uo implements InterfaceC3733bm {
    private static final C3807dm[] OooO0O0 = new C3807dm[0];
    private final C4586yo OooO00o = new C4586yo();

    private static C3772co OooO0OO(C3772co c3772co) throws NotFoundException {
        int[] iArrOooOO0o = c3772co.OooOO0o();
        int[] iArrOooO0o = c3772co.OooO0o();
        if (iArrOooOO0o == null || iArrOooO0o == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iOooO0Oo = OooO0Oo(iArrOooOO0o, c3772co);
        int i = iArrOooOO0o[1];
        int i2 = iArrOooO0o[1];
        int i3 = iArrOooOO0o[0];
        int i4 = ((iArrOooO0o[0] - i3) + 1) / iOooO0Oo;
        int i5 = ((i2 - i) + 1) / iOooO0Oo;
        if (i4 <= 0 || i5 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = iOooO0Oo / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C3772co c3772co2 = new C3772co(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * iOooO0Oo) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (c3772co.OooO0o0((i11 * iOooO0Oo) + i8, i10)) {
                    c3772co2.OooOOo0(i11, i9);
                }
            }
        }
        return c3772co2;
    }

    private static int OooO0Oo(int[] iArr, C3772co c3772co) throws NotFoundException {
        int iOooOOO0 = c3772co.OooOOO0();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < iOooOOO0 && c3772co.OooO0o0(i, i2)) {
            i++;
        }
        if (i == iOooOOO0) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i3 = i - iArr[0];
        if (i3 != 0) {
            return i3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO00o(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C3807dm[] c3807dmArrOooO0O0;
        C3846eo c3846eoOooO0O0;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            C3920go c3920goOooO0OO = new Detector(c4398tl.OooO0O0()).OooO0OO();
            C3846eo c3846eoOooO0O02 = this.OooO00o.OooO0O0(c3920goOooO0OO.OooO00o());
            c3807dmArrOooO0O0 = c3920goOooO0OO.OooO0O0();
            c3846eoOooO0O0 = c3846eoOooO0O02;
        } else {
            c3846eoOooO0O0 = this.OooO00o.OooO0O0(OooO0OO(c4398tl.OooO0O0()));
            c3807dmArrOooO0O0 = OooO0O0;
        }
        C3770cm c3770cm = new C3770cm(c3846eoOooO0O0.OooOO0(), c3846eoOooO0O0.OooO0oO(), c3807dmArrOooO0O0, BarcodeFormat.DATA_MATRIX);
        List<byte[]> listOooO00o = c3846eoOooO0O0.OooO00o();
        if (listOooO00o != null) {
            c3770cm.OooOO0(ResultMetadataType.BYTE_SEGMENTS, listOooO00o);
        }
        String strOooO0O0 = c3846eoOooO0O0.OooO0O0();
        if (strOooO0O0 != null) {
            c3770cm.OooOO0(ResultMetadataType.ERROR_CORRECTION_LEVEL, strOooO0O0);
        }
        return c3770cm;
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO0O0(C4398tl c4398tl) throws NotFoundException, ChecksumException, FormatException {
        return OooO00o(c4398tl, null);
    }

    @Override // p285z2.InterfaceC3733bm
    public final void reset() {
    }
}
