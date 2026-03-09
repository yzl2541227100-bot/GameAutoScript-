package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: renamed from: z2.fq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3885fq extends AbstractC4403tq {
    private static final int OooO00o = 67;

    @Override // p285z2.AbstractC4144mq, p285z2.InterfaceC3881fm
    public final C3772co OooO0O0(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.OooO0O0(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p285z2.AbstractC4144mq
    public final boolean[] OooO0Oo(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC4366sq.OooOOo(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!AbstractC4366sq.OooO(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int iOooO0OO = AbstractC4144mq.OooO0OO(zArr, 0, AbstractC4366sq.OooO0o, true) + 0;
        for (int i = 0; i <= 3; i++) {
            iOooO0OO += AbstractC4144mq.OooO0OO(zArr, iOooO0OO, AbstractC4366sq.OooO[Character.digit(str.charAt(i), 10)], false);
        }
        int iOooO0OO2 = iOooO0OO + AbstractC4144mq.OooO0OO(zArr, iOooO0OO, AbstractC4366sq.OooO0oO, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            iOooO0OO2 += AbstractC4144mq.OooO0OO(zArr, iOooO0OO2, AbstractC4366sq.OooO[Character.digit(str.charAt(i2), 10)], true);
        }
        AbstractC4144mq.OooO0OO(zArr, iOooO0OO2, AbstractC4366sq.OooO0o, true);
        return zArr;
    }
}
