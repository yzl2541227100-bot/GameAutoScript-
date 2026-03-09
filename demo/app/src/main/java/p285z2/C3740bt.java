package p285z2;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* JADX INFO: renamed from: z2.bt */
/* JADX INFO: loaded from: classes2.dex */
public final class C3740bt {
    private final C4364so OooO00o = new C4364so(C4290qo.OooOO0o);

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

    private C3846eo OooO0Oo(C4590ys c4590ys, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        C3851et c3851etOooO0o0 = c4590ys.OooO0o0();
        ErrorCorrectionLevel errorCorrectionLevelOooO0Oo = c4590ys.OooO0Oo().OooO0Oo();
        C4627zs[] c4627zsArrOooO0O0 = C4627zs.OooO0O0(c4590ys.OooO0OO(), c3851etOooO0o0, errorCorrectionLevelOooO0Oo);
        int iOooO0OO = 0;
        for (C4627zs c4627zs : c4627zsArrOooO0O0) {
            iOooO0OO += c4627zs.OooO0OO();
        }
        byte[] bArr = new byte[iOooO0OO];
        int i = 0;
        for (C4627zs c4627zs2 : c4627zsArrOooO0O0) {
            byte[] bArrOooO00o = c4627zs2.OooO00o();
            int iOooO0OO2 = c4627zs2.OooO0OO();
            OooO00o(bArrOooO00o, iOooO0OO2);
            int i2 = 0;
            while (i2 < iOooO0OO2) {
                bArr[i] = bArrOooO00o[i2];
                i2++;
                i++;
            }
        }
        return C3703at.OooO00o(bArr, c3851etOooO0o0, errorCorrectionLevelOooO0Oo, map);
    }

    public final C3846eo OooO0O0(C3772co c3772co) throws ChecksumException, FormatException {
        return OooO0OO(c3772co, null);
    }

    public final C3846eo OooO0OO(C3772co c3772co, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        ChecksumException e;
        C4590ys c4590ys = new C4590ys(c3772co);
        FormatException formatException = null;
        try {
            return OooO0Oo(c4590ys, map);
        } catch (ChecksumException e2) {
            e = e2;
            try {
                c4590ys.OooO0o();
                c4590ys.OooO0oO(true);
                c4590ys.OooO0o0();
                c4590ys.OooO0Oo();
                c4590ys.OooO0O0();
                C3846eo c3846eoOooO0Oo = OooO0Oo(c4590ys, map);
                c3846eoOooO0Oo.OooOOOO(new C3814dt(true));
                return c3846eoOooO0Oo;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e;
            }
        } catch (FormatException e3) {
            e = null;
            formatException = e3;
            c4590ys.OooO0o();
            c4590ys.OooO0oO(true);
            c4590ys.OooO0o0();
            c4590ys.OooO0Oo();
            c4590ys.OooO0O0();
            C3846eo c3846eoOooO0Oo2 = OooO0Oo(c4590ys, map);
            c3846eoOooO0Oo2.OooOOOO(new C3814dt(true));
            return c3846eoOooO0Oo2;
        }
    }

    public final C3846eo OooO0o(boolean[][] zArr, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        return OooO0OO(C3772co.OooOOOO(zArr), map);
    }

    public final C3846eo OooO0o0(boolean[][] zArr) throws ChecksumException, FormatException {
        return OooO0o(zArr, null);
    }
}
