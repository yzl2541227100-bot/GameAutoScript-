package p285z2;

import p285z2.C4623zo;

/* JADX INFO: renamed from: z2.xo */
/* JADX INFO: loaded from: classes2.dex */
public final class C4549xo {
    private final int OooO00o;
    private final byte[] OooO0O0;

    private C4549xo(int i, byte[] bArr) {
        this.OooO00o = i;
        this.OooO0O0 = bArr;
    }

    public static C4549xo[] OooO0O0(byte[] bArr, C4623zo c4623zo) {
        C4623zo.OooO0OO OooO0Oo = c4623zo.OooO0Oo();
        C4623zo.OooO0O0[] oooO0O0ArrOooO00o = OooO0Oo.OooO00o();
        int iOooO00o = 0;
        for (C4623zo.OooO0O0 oooO0O0 : oooO0O0ArrOooO00o) {
            iOooO00o += oooO0O0.OooO00o();
        }
        C4549xo[] c4549xoArr = new C4549xo[iOooO00o];
        int i = 0;
        for (C4623zo.OooO0O0 oooO0O02 : oooO0O0ArrOooO00o) {
            int i2 = 0;
            while (i2 < oooO0O02.OooO00o()) {
                int iOooO0O0 = oooO0O02.OooO0O0();
                c4549xoArr[i] = new C4549xo(iOooO0O0, new byte[OooO0Oo.OooO0O0() + iOooO0O0]);
                i2++;
                i++;
            }
        }
        int length = c4549xoArr[0].OooO0O0.length - OooO0Oo.OooO0O0();
        int i3 = length - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            while (i6 < i) {
                c4549xoArr[i6].OooO0O0[i5] = bArr[i4];
                i6++;
                i4++;
            }
        }
        boolean z = c4623zo.OooO() == 24;
        int i7 = z ? 8 : i;
        int i8 = 0;
        while (i8 < i7) {
            c4549xoArr[i8].OooO0O0[i3] = bArr[i4];
            i8++;
            i4++;
        }
        int length2 = c4549xoArr[0].OooO0O0.length;
        while (length < length2) {
            int i9 = 0;
            while (i9 < i) {
                int i10 = z ? (i9 + 8) % i : i9;
                c4549xoArr[i10].OooO0O0[(!z || i10 <= 7) ? length : length - 1] = bArr[i4];
                i9++;
                i4++;
            }
            length++;
        }
        if (i4 == bArr.length) {
            return c4549xoArr;
        }
        throw new IllegalArgumentException();
    }

    public final byte[] OooO00o() {
        return this.OooO0O0;
    }

    public final int OooO0OO() {
        return this.OooO00o;
    }
}
