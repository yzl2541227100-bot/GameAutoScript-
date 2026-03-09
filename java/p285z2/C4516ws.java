package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: z2.ws */
/* JADX INFO: loaded from: classes2.dex */
public class C4516ws implements InterfaceC3733bm {
    private static final C3807dm[] OooO0O0 = new C3807dm[0];
    private final C3740bt OooO00o = new C3740bt();

    private static C3772co OooO0o0(C3772co c3772co) throws NotFoundException {
        int[] iArrOooOO0o = c3772co.OooOO0o();
        int[] iArrOooO0o = c3772co.OooO0o();
        if (iArrOooOO0o == null || iArrOooO0o == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float fOooO0oO = OooO0oO(iArrOooOO0o, c3772co);
        int i = iArrOooOO0o[1];
        int i2 = iArrOooO0o[1];
        int i3 = iArrOooOO0o[0];
        int i4 = iArrOooO0o[0];
        if (i3 >= i4 || i >= i2) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i5 = i2 - i;
        if (i5 != i4 - i3 && (i4 = i3 + i5) >= c3772co.OooOOO0()) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iRound = Math.round(((i4 - i3) + 1) / fOooO0oO);
        int iRound2 = Math.round((i5 + 1) / fOooO0oO);
        if (iRound <= 0 || iRound2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (iRound2 != iRound) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = (int) (fOooO0oO / 2.0f);
        int i7 = i + i6;
        int i8 = i3 + i6;
        int i9 = (((int) ((iRound - 1) * fOooO0oO)) + i8) - i4;
        if (i9 > 0) {
            if (i9 > i6) {
                throw NotFoundException.getNotFoundInstance();
            }
            i8 -= i9;
        }
        int i10 = (((int) ((iRound2 - 1) * fOooO0oO)) + i7) - i2;
        if (i10 > 0) {
            if (i10 > i6) {
                throw NotFoundException.getNotFoundInstance();
            }
            i7 -= i10;
        }
        C3772co c3772co2 = new C3772co(iRound, iRound2);
        for (int i11 = 0; i11 < iRound2; i11++) {
            int i12 = ((int) (i11 * fOooO0oO)) + i7;
            for (int i13 = 0; i13 < iRound; i13++) {
                if (c3772co.OooO0o0(((int) (i13 * fOooO0oO)) + i8, i12)) {
                    c3772co2.OooOOo0(i13, i11);
                }
            }
        }
        return c3772co2;
    }

    private static float OooO0oO(int[] iArr, C3772co c3772co) throws NotFoundException {
        int iOooO0oo = c3772co.OooO0oo();
        int iOooOOO0 = c3772co.OooOOO0();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < iOooOOO0 && i2 < iOooO0oo) {
            if (z != c3772co.OooO0o0(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i == iOooOOO0 || i2 == iOooO0oo) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (i - iArr[0]) / 7.0f;
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO00o(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C3807dm[] c3807dmArrOooO0O0;
        C3846eo c3846eoOooO0OO;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            C3920go c3920goOooO0o = new C3962ht(c4398tl.OooO0O0()).OooO0o(map);
            C3846eo c3846eoOooO0OO2 = this.OooO00o.OooO0OO(c3920goOooO0o.OooO00o(), map);
            c3807dmArrOooO0O0 = c3920goOooO0o.OooO0O0();
            c3846eoOooO0OO = c3846eoOooO0OO2;
        } else {
            c3846eoOooO0OO = this.OooO00o.OooO0OO(OooO0o0(c4398tl.OooO0O0()), map);
            c3807dmArrOooO0O0 = OooO0O0;
        }
        if (c3846eoOooO0OO.OooO0o() instanceof C3814dt) {
            ((C3814dt) c3846eoOooO0OO.OooO0o()).OooO00o(c3807dmArrOooO0O0);
        }
        C3770cm c3770cm = new C3770cm(c3846eoOooO0OO.OooOO0(), c3846eoOooO0OO.OooO0oO(), c3807dmArrOooO0O0, BarcodeFormat.QR_CODE);
        List<byte[]> listOooO00o = c3846eoOooO0OO.OooO00o();
        if (listOooO00o != null) {
            c3770cm.OooOO0(ResultMetadataType.BYTE_SEGMENTS, listOooO00o);
        }
        String strOooO0O0 = c3846eoOooO0OO.OooO0O0();
        if (strOooO0O0 != null) {
            c3770cm.OooOO0(ResultMetadataType.ERROR_CORRECTION_LEVEL, strOooO0O0);
        }
        if (c3846eoOooO0OO.OooOO0O()) {
            c3770cm.OooOO0(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c3846eoOooO0OO.OooO()));
            c3770cm.OooOO0(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(c3846eoOooO0OO.OooO0oo()));
        }
        return c3770cm;
    }

    @Override // p285z2.InterfaceC3733bm
    public C3770cm OooO0O0(C4398tl c4398tl) throws NotFoundException, ChecksumException, FormatException {
        return OooO00o(c4398tl, null);
    }

    public final C3740bt OooO0o() {
        return this.OooO00o;
    }

    @Override // p285z2.InterfaceC3733bm
    public void reset() {
    }
}
