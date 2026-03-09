package p285z2;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.datamatrix.decoder.DecodedBitStreamParser;

/* JADX INFO: renamed from: z2.yo */
/* JADX INFO: loaded from: classes2.dex */
public final class C4586yo {
    private final C4364so OooO00o = new C4364so(C4290qo.OooOOO0);

    private void OooO00o(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.OooO00o.OooO00o(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public final C3846eo OooO0O0(C3772co c3772co) throws ChecksumException, FormatException {
        C4512wo c4512wo = new C4512wo(c3772co);
        C4549xo[] c4549xoArrOooO0O0 = C4549xo.OooO0O0(c4512wo.OooO0OO(), c4512wo.OooO0O0());
        int iOooO0OO = 0;
        for (C4549xo c4549xo : c4549xoArrOooO0O0) {
            iOooO0OO += c4549xo.OooO0OO();
        }
        byte[] bArr = new byte[iOooO0OO];
        int length = c4549xoArrOooO0O0.length;
        for (int i = 0; i < length; i++) {
            C4549xo c4549xo2 = c4549xoArrOooO0O0[i];
            byte[] bArrOooO00o = c4549xo2.OooO00o();
            int iOooO0OO2 = c4549xo2.OooO0OO();
            OooO00o(bArrOooO00o, iOooO0OO2);
            for (int i2 = 0; i2 < iOooO0OO2; i2++) {
                bArr[(i2 * length) + i] = bArrOooO00o[i2];
            }
        }
        return DecodedBitStreamParser.OooO00o(bArr);
    }

    public final C3846eo OooO0OO(boolean[][] zArr) throws ChecksumException, FormatException {
        return OooO0O0(C3772co.OooOOOO(zArr));
    }
}
