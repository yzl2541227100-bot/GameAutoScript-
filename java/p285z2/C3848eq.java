package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.eq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3848eq extends AbstractC4366sq {
    private final int[] OooOO0O = new int[4];

    @Override // p285z2.AbstractC4366sq
    public final int OooOO0o(C3735bo c3735bo, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.OooOO0O;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iOooOOO0 = c3735bo.OooOOO0();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < iOooOOO0; i2++) {
            sb.append((char) (AbstractC4366sq.OooOO0(c3735bo, iArr2, i, AbstractC4366sq.OooO) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = AbstractC4366sq.OooOOO(c3735bo, i, true, AbstractC4366sq.OooO0oO)[1];
        for (int i5 = 0; i5 < 4 && i4 < iOooOOO0; i5++) {
            sb.append((char) (AbstractC4366sq.OooOO0(c3735bo, iArr2, i4, AbstractC4366sq.OooO) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // p285z2.AbstractC4366sq
    public final BarcodeFormat OooOOo0() {
        return BarcodeFormat.EAN_8;
    }
}
