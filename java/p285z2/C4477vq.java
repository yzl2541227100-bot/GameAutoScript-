package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: renamed from: z2.vq */
/* JADX INFO: loaded from: classes2.dex */
public final class C4477vq extends AbstractC4403tq {
    private static final int OooO00o = 51;

    @Override // p285z2.AbstractC4144mq, p285z2.InterfaceC3881fm
    public final C3772co OooO0O0(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.OooO0O0(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p285z2.AbstractC4144mq
    public final boolean[] OooO0Oo(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC4366sq.OooOOo(C4440uq.OooOOoo(str));
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
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = C4440uq.OooOOO0[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iOooO0OO = AbstractC4144mq.OooO0OO(zArr, 0, AbstractC4366sq.OooO0o, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit2 += 10;
            }
            iOooO0OO += AbstractC4144mq.OooO0OO(zArr, iOooO0OO, AbstractC4366sq.OooOO0[iDigit2], false);
        }
        AbstractC4144mq.OooO0OO(zArr, iOooO0OO, AbstractC4366sq.OooO0oo, false);
        return zArr;
    }
}
