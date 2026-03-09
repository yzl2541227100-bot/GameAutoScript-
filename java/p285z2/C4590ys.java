package p285z2;

import com.google.zxing.FormatException;
import com.google.zxing.qrcode.decoder.DataMask;

/* JADX INFO: renamed from: z2.ys */
/* JADX INFO: loaded from: classes2.dex */
public final class C4590ys {
    private final C3772co OooO00o;
    private C3851et OooO0O0;
    private C3777ct OooO0OO;
    private boolean OooO0Oo;

    public C4590ys(C3772co c3772co) throws FormatException {
        int iOooO0oo = c3772co.OooO0oo();
        if (iOooO0oo < 21 || (iOooO0oo & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.OooO00o = c3772co;
    }

    private int OooO00o(int i, int i2, int i3) {
        return this.OooO0Oo ? this.OooO00o.OooO0o0(i2, i) : this.OooO00o.OooO0o0(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public final void OooO0O0() {
        int i = 0;
        while (i < this.OooO00o.OooOOO0()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.OooO00o.OooO0oo(); i3++) {
                if (this.OooO00o.OooO0o0(i, i3) != this.OooO00o.OooO0o0(i3, i)) {
                    this.OooO00o.OooO0Oo(i3, i);
                    this.OooO00o.OooO0Oo(i, i3);
                }
            }
            i = i2;
        }
    }

    public final byte[] OooO0OO() throws FormatException {
        C3777ct c3777ctOooO0Oo = OooO0Oo();
        C3851et c3851etOooO0o0 = OooO0o0();
        DataMask dataMask = DataMask.values()[c3777ctOooO0Oo.OooO0OO()];
        int iOooO0oo = this.OooO00o.OooO0oo();
        dataMask.unmaskBitMatrix(this.OooO00o, iOooO0oo);
        C3772co c3772coOooO00o = c3851etOooO0o0.OooO00o();
        byte[] bArr = new byte[c3851etOooO0o0.OooO0oo()];
        int i = iOooO0oo - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < iOooO0oo; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!c3772coOooO00o.OooO0o0(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.OooO00o.OooO0o0(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == c3851etOooO0o0.OooO0oo()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    public final C3777ct OooO0Oo() throws FormatException {
        C3777ct c3777ct = this.OooO0OO;
        if (c3777ct != null) {
            return c3777ct;
        }
        int iOooO00o = 0;
        int iOooO00o2 = 0;
        for (int i = 0; i < 6; i++) {
            iOooO00o2 = OooO00o(i, 8, iOooO00o2);
        }
        int iOooO00o3 = OooO00o(8, 7, OooO00o(8, 8, OooO00o(7, 8, iOooO00o2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iOooO00o3 = OooO00o(8, i2, iOooO00o3);
        }
        int iOooO0oo = this.OooO00o.OooO0oo();
        int i3 = iOooO0oo - 7;
        for (int i4 = iOooO0oo - 1; i4 >= i3; i4--) {
            iOooO00o = OooO00o(8, i4, iOooO00o);
        }
        for (int i5 = iOooO0oo - 8; i5 < iOooO0oo; i5++) {
            iOooO00o = OooO00o(i5, 8, iOooO00o);
        }
        C3777ct c3777ctOooO00o = C3777ct.OooO00o(iOooO00o3, iOooO00o);
        this.OooO0OO = c3777ctOooO00o;
        if (c3777ctOooO00o != null) {
            return c3777ctOooO00o;
        }
        throw FormatException.getFormatInstance();
    }

    public final void OooO0o() {
        if (this.OooO0OO == null) {
            return;
        }
        DataMask.values()[this.OooO0OO.OooO0OO()].unmaskBitMatrix(this.OooO00o, this.OooO00o.OooO0oo());
    }

    public final C3851et OooO0o0() throws FormatException {
        C3851et c3851et = this.OooO0O0;
        if (c3851et != null) {
            return c3851et;
        }
        int iOooO0oo = this.OooO00o.OooO0oo();
        int i = (iOooO0oo - 17) / 4;
        if (i <= 6) {
            return C3851et.OooO(i);
        }
        int i2 = iOooO0oo - 11;
        int iOooO00o = 0;
        int iOooO00o2 = 0;
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = iOooO0oo - 9; i4 >= i2; i4--) {
                iOooO00o2 = OooO00o(i4, i3, iOooO00o2);
            }
        }
        C3851et c3851etOooO0OO = C3851et.OooO0OO(iOooO00o2);
        if (c3851etOooO0OO != null && c3851etOooO0OO.OooO0o0() == iOooO0oo) {
            this.OooO0O0 = c3851etOooO0OO;
            return c3851etOooO0OO;
        }
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = iOooO0oo - 9; i6 >= i2; i6--) {
                iOooO00o = OooO00o(i5, i6, iOooO00o);
            }
        }
        C3851et c3851etOooO0OO2 = C3851et.OooO0OO(iOooO00o);
        if (c3851etOooO0OO2 == null || c3851etOooO0OO2.OooO0o0() != iOooO0oo) {
            throw FormatException.getFormatInstance();
        }
        this.OooO0O0 = c3851etOooO0OO2;
        return c3851etOooO0OO2;
    }

    public final void OooO0oO(boolean z) {
        this.OooO0O0 = null;
        this.OooO0OO = null;
        this.OooO0Oo = z;
    }
}
