package p285z2;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import p285z2.C3851et;

/* JADX INFO: renamed from: z2.zs */
/* JADX INFO: loaded from: classes2.dex */
public final class C4627zs {
    private final int OooO00o;
    private final byte[] OooO0O0;

    private C4627zs(int i, byte[] bArr) {
        this.OooO00o = i;
        this.OooO0O0 = bArr;
    }

    public static C4627zs[] OooO0O0(byte[] bArr, C3851et c3851et, ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length != c3851et.OooO0oo()) {
            throw new IllegalArgumentException();
        }
        C3851et.OooO0O0 oooO0O0OooO0o = c3851et.OooO0o(errorCorrectionLevel);
        C3851et.OooO00o[] oooO00oArrOooO00o = oooO0O0OooO0o.OooO00o();
        int iOooO00o = 0;
        for (C3851et.OooO00o oooO00o : oooO00oArrOooO00o) {
            iOooO00o += oooO00o.OooO00o();
        }
        C4627zs[] c4627zsArr = new C4627zs[iOooO00o];
        int i = 0;
        for (C3851et.OooO00o oooO00o2 : oooO00oArrOooO00o) {
            int i2 = 0;
            while (i2 < oooO00o2.OooO00o()) {
                int iOooO0O0 = oooO00o2.OooO0O0();
                c4627zsArr[i] = new C4627zs(iOooO0O0, new byte[oooO0O0OooO0o.OooO0O0() + iOooO0O0]);
                i2++;
                i++;
            }
        }
        int length = c4627zsArr[0].OooO0O0.length;
        int i3 = iOooO00o - 1;
        while (i3 >= 0 && c4627zsArr[i3].OooO0O0.length != length) {
            i3--;
        }
        int i4 = i3 + 1;
        int iOooO0O02 = length - oooO0O0OooO0o.OooO0O0();
        int i5 = 0;
        for (int i6 = 0; i6 < iOooO0O02; i6++) {
            int i7 = 0;
            while (i7 < i) {
                c4627zsArr[i7].OooO0O0[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        int i8 = i4;
        while (i8 < i) {
            c4627zsArr[i8].OooO0O0[iOooO0O02] = bArr[i5];
            i8++;
            i5++;
        }
        int length2 = c4627zsArr[0].OooO0O0.length;
        while (iOooO0O02 < length2) {
            int i9 = 0;
            while (i9 < i) {
                c4627zsArr[i9].OooO0O0[i9 < i4 ? iOooO0O02 : iOooO0O02 + 1] = bArr[i5];
                i9++;
                i5++;
            }
            iOooO0O02++;
        }
        return c4627zsArr;
    }

    public final byte[] OooO00o() {
        return this.OooO0O0;
    }

    public final int OooO0OO() {
        return this.OooO00o;
    }
}
