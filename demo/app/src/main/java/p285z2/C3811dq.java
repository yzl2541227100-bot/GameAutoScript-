package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: renamed from: z2.dq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3811dq extends AbstractC4403tq {
    private static final int OooO00o = 95;

    @Override // p285z2.AbstractC4144mq, p285z2.InterfaceC3881fm
    public final C3772co OooO0O0(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.OooO0O0(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p285z2.AbstractC4144mq
    public final boolean[] OooO0Oo(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + AbstractC4366sq.OooOOo(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!AbstractC4366sq.OooO(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i = C3774cq.OooOO0o[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iOooO0OO = AbstractC4144mq.OooO0OO(zArr, 0, AbstractC4366sq.OooO0o, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iOooO0OO += AbstractC4144mq.OooO0OO(zArr, iOooO0OO, AbstractC4366sq.OooOO0[iDigit], false);
        }
        int iOooO0OO2 = iOooO0OO + AbstractC4144mq.OooO0OO(zArr, iOooO0OO, AbstractC4366sq.OooO0oO, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            iOooO0OO2 += AbstractC4144mq.OooO0OO(zArr, iOooO0OO2, AbstractC4366sq.OooO[Character.digit(str.charAt(i3), 10)], true);
        }
        AbstractC4144mq.OooO0OO(zArr, iOooO0OO2, AbstractC4366sq.OooO0o, true);
        return zArr;
    }
}
