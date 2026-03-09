package p285z2;

import com.google.zxing.BarcodeFormat;

/* JADX INFO: renamed from: z2.jn */
/* JADX INFO: loaded from: classes2.dex */
public final class C4030jn extends AbstractC4067kn {
    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final C3993in OooOO0O(C3770cm c3770cm) {
        BarcodeFormat barcodeFormatOooO0O0 = c3770cm.OooO0O0();
        if (barcodeFormatOooO0O0 != BarcodeFormat.UPC_A && barcodeFormatOooO0O0 != BarcodeFormat.UPC_E && barcodeFormatOooO0O0 != BarcodeFormat.EAN_8 && barcodeFormatOooO0O0 != BarcodeFormat.EAN_13) {
            return null;
        }
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (AbstractC4067kn.OooO0Oo(strOooO0OO, strOooO0OO.length())) {
            return new C3993in(strOooO0OO, (barcodeFormatOooO0O0 == BarcodeFormat.UPC_E && strOooO0OO.length() == 8) ? C4440uq.OooOOoo(strOooO0OO) : strOooO0OO);
        }
        return null;
    }
}
