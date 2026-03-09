package p285z2;

import com.google.zxing.BarcodeFormat;

/* JADX INFO: renamed from: z2.gn */
/* JADX INFO: loaded from: classes2.dex */
public final class C3919gn extends AbstractC4067kn {
    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final C3882fn OooOO0O(C3770cm c3770cm) {
        if (c3770cm.OooO0O0() != BarcodeFormat.EAN_13) {
            return null;
        }
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (strOooO0OO.length() != 13) {
            return null;
        }
        if (strOooO0OO.startsWith("978") || strOooO0OO.startsWith("979")) {
            return new C3882fn(strOooO0OO);
        }
        return null;
    }
}
