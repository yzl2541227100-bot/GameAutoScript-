package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: renamed from: z2.nq */
/* JADX INFO: loaded from: classes2.dex */
public final class C4181nq extends AbstractC4366sq {
    private final AbstractC4366sq OooOO0O = new C3774cq();

    private static C3770cm OooOOoo(C3770cm c3770cm) throws FormatException {
        String strOooO0oO = c3770cm.OooO0oO();
        if (strOooO0oO.charAt(0) != '0') {
            throw FormatException.getFormatInstance();
        }
        C3770cm c3770cm2 = new C3770cm(strOooO0oO.substring(1), null, c3770cm.OooO0o(), BarcodeFormat.UPC_A);
        if (c3770cm.OooO0o0() != null) {
            c3770cm2.OooO(c3770cm.OooO0o0());
        }
        return c3770cm2;
    }

    @Override // p285z2.AbstractC4107lq, p285z2.InterfaceC3733bm
    public final C3770cm OooO00o(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return OooOOoo(this.OooOO0O.OooO00o(c4398tl, map));
    }

    @Override // p285z2.AbstractC4107lq, p285z2.InterfaceC3733bm
    public final C3770cm OooO0O0(C4398tl c4398tl) throws NotFoundException, FormatException {
        return OooOOoo(this.OooOO0O.OooO0O0(c4398tl));
    }

    @Override // p285z2.AbstractC4366sq, p285z2.AbstractC4107lq
    public final C3770cm OooO0OO(int i, C3735bo c3735bo, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return OooOOoo(this.OooOO0O.OooO0OO(i, c3735bo, map));
    }

    @Override // p285z2.AbstractC4366sq
    public final int OooOO0o(C3735bo c3735bo, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.OooOO0O.OooOO0o(c3735bo, iArr, sb);
    }

    @Override // p285z2.AbstractC4366sq
    public final C3770cm OooOOO0(int i, C3735bo c3735bo, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return OooOOoo(this.OooOO0O.OooOOO0(i, c3735bo, iArr, map));
    }

    @Override // p285z2.AbstractC4366sq
    public final BarcodeFormat OooOOo0() {
        return BarcodeFormat.UPC_A;
    }
}
