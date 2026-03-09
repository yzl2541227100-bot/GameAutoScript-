package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Map;

/* JADX INFO: renamed from: z2.np */
/* JADX INFO: loaded from: classes2.dex */
public final class C4180np implements InterfaceC3733bm {
    private static final C3807dm[] OooO0O0 = new C3807dm[0];
    private static final int OooO0OO = 30;
    private static final int OooO0Oo = 33;
    private final C4291qp OooO00o = new C4291qp();

    private static C3772co OooO0OO(C3772co c3772co) throws NotFoundException {
        int[] iArrOooO0oO = c3772co.OooO0oO();
        if (iArrOooO0oO == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = iArrOooO0oO[0];
        int i2 = iArrOooO0oO[1];
        int i3 = iArrOooO0oO[2];
        int i4 = iArrOooO0oO[3];
        C3772co c3772co2 = new C3772co(30, 33);
        for (int i5 = 0; i5 < 33; i5++) {
            int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
            for (int i7 = 0; i7 < 30; i7++) {
                if (c3772co.OooO0o0(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                    c3772co2.OooOOo0(i7, i5);
                }
            }
        }
        return c3772co2;
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO00o(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.getNotFoundInstance();
        }
        C3846eo c3846eoOooO0OO = this.OooO00o.OooO0OO(OooO0OO(c4398tl.OooO0O0()), map);
        C3770cm c3770cm = new C3770cm(c3846eoOooO0OO.OooOO0(), c3846eoOooO0OO.OooO0oO(), OooO0O0, BarcodeFormat.MAXICODE);
        String strOooO0O0 = c3846eoOooO0OO.OooO0O0();
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
