package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.ho */
/* JADX INFO: loaded from: classes2.dex */
public class C3957ho extends AbstractC4361sl {
    private static final int OooO0Oo = 5;
    private static final int OooO0o = 32;
    private static final int OooO0o0 = 3;
    private static final byte[] OooO0oO = new byte[0];
    private byte[] OooO0O0;
    private final int[] OooO0OO;

    public C3957ho(AbstractC4509wl abstractC4509wl) {
        super(abstractC4509wl);
        this.OooO0O0 = OooO0oO;
        this.OooO0OO = new int[32];
    }

    private static int OooO0oO(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 <= length / 16) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i11 = i3 - 1;
        int i12 = i11;
        int i13 = -1;
        while (i11 > i5) {
            int i14 = i11 - i5;
            int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
            if (i15 > i13) {
                i12 = i11;
                i13 = i15;
            }
            i11--;
        }
        return i12 << 3;
    }

    private void OooO0oo(int i) {
        if (this.OooO0O0.length < i) {
            this.OooO0O0 = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.OooO0OO[i2] = 0;
        }
    }

    @Override // p285z2.AbstractC4361sl
    public AbstractC4361sl OooO00o(AbstractC4509wl abstractC4509wl) {
        return new C3957ho(abstractC4509wl);
    }

    @Override // p285z2.AbstractC4361sl
    public C3772co OooO0O0() throws NotFoundException {
        AbstractC4509wl abstractC4509wlOooO0o0 = OooO0o0();
        int iOooO0o0 = abstractC4509wlOooO0o0.OooO0o0();
        int iOooO0O0 = abstractC4509wlOooO0o0.OooO0O0();
        C3772co c3772co = new C3772co(iOooO0o0, iOooO0O0);
        OooO0oo(iOooO0o0);
        int[] iArr = this.OooO0OO;
        for (int i = 1; i < 5; i++) {
            byte[] bArrOooO0Oo = abstractC4509wlOooO0o0.OooO0Oo((iOooO0O0 * i) / 5, this.OooO0O0);
            int i2 = (iOooO0o0 << 2) / 5;
            for (int i3 = iOooO0o0 / 5; i3 < i2; i3++) {
                int i4 = (bArrOooO0Oo[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int iOooO0oO = OooO0oO(iArr);
        byte[] bArrOooO0OO = abstractC4509wlOooO0o0.OooO0OO();
        for (int i5 = 0; i5 < iOooO0O0; i5++) {
            int i6 = i5 * iOooO0o0;
            for (int i7 = 0; i7 < iOooO0o0; i7++) {
                if ((bArrOooO0OO[i6 + i7] & 255) < iOooO0oO) {
                    c3772co.OooOOo0(i7, i5);
                }
            }
        }
        return c3772co;
    }

    @Override // p285z2.AbstractC4361sl
    public C3735bo OooO0OO(int i, C3735bo c3735bo) throws NotFoundException {
        AbstractC4509wl abstractC4509wlOooO0o0 = OooO0o0();
        int iOooO0o0 = abstractC4509wlOooO0o0.OooO0o0();
        if (c3735bo == null || c3735bo.OooOOO0() < iOooO0o0) {
            c3735bo = new C3735bo(iOooO0o0);
        } else {
            c3735bo.OooO0Oo();
        }
        OooO0oo(iOooO0o0);
        byte[] bArrOooO0Oo = abstractC4509wlOooO0o0.OooO0Oo(i, this.OooO0O0);
        int[] iArr = this.OooO0OO;
        for (int i2 = 0; i2 < iOooO0o0; i2++) {
            int i3 = (bArrOooO0Oo[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int iOooO0oO = OooO0oO(iArr);
        if (iOooO0o0 < 3) {
            for (int i4 = 0; i4 < iOooO0o0; i4++) {
                if ((bArrOooO0Oo[i4] & 255) < iOooO0oO) {
                    c3735bo.OooOOo(i4);
                }
            }
        } else {
            int i5 = 1;
            int i6 = bArrOooO0Oo[0] & 255;
            int i7 = bArrOooO0Oo[1] & 255;
            while (i5 < iOooO0o0 - 1) {
                int i8 = i5 + 1;
                int i9 = bArrOooO0Oo[i8] & 255;
                if ((((i7 << 2) - i6) - i9) / 2 < iOooO0oO) {
                    c3735bo.OooOOo(i5);
                }
                i6 = i7;
                i5 = i8;
                i7 = i9;
            }
        }
        return c3735bo;
    }
}
