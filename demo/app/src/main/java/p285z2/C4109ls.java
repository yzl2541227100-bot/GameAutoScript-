package p285z2;

import com.google.zxing.ChecksumException;

/* JADX INFO: renamed from: z2.ls */
/* JADX INFO: loaded from: classes2.dex */
public final class C4109ls {
    private final C4146ms OooO00o = C4146ms.OooO0o;

    private int[] OooO0O0(C4183ns c4183ns) throws ChecksumException {
        int iOooO0o0 = c4183ns.OooO0o0();
        int[] iArr = new int[iOooO0o0];
        int i = 0;
        for (int i2 = 1; i2 < this.OooO00o.OooO0o0() && i < iOooO0o0; i2++) {
            if (c4183ns.OooO0O0(i2) == 0) {
                iArr[i] = this.OooO00o.OooO0oO(i2);
                i++;
            }
        }
        if (i == iOooO0o0) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    private int[] OooO0OO(C4183ns c4183ns, C4183ns c4183ns2, int[] iArr) {
        int iOooO0o0 = c4183ns2.OooO0o0();
        int[] iArr2 = new int[iOooO0o0];
        for (int i = 1; i <= iOooO0o0; i++) {
            iArr2[iOooO0o0 - i] = this.OooO00o.OooO(i, c4183ns2.OooO0OO(i));
        }
        C4183ns c4183ns3 = new C4183ns(this.OooO00o, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int iOooO0oO = this.OooO00o.OooO0oO(iArr[i2]);
            iArr3[i2] = this.OooO00o.OooO(this.OooO00o.OooOO0(0, c4183ns.OooO0O0(iOooO0oO)), this.OooO00o.OooO0oO(c4183ns3.OooO0O0(iOooO0oO)));
        }
        return iArr3;
    }

    private C4183ns[] OooO0Oo(C4183ns c4183ns, C4183ns c4183ns2, int i) throws ChecksumException {
        if (c4183ns.OooO0o0() < c4183ns2.OooO0o0()) {
            c4183ns2 = c4183ns;
            c4183ns = c4183ns2;
        }
        C4183ns c4183nsOooO0o = this.OooO00o.OooO0o();
        C4183ns c4183nsOooO0Oo = this.OooO00o.OooO0Oo();
        while (true) {
            C4183ns c4183ns3 = c4183ns2;
            c4183ns2 = c4183ns;
            c4183ns = c4183ns3;
            C4183ns c4183ns4 = c4183nsOooO0Oo;
            C4183ns c4183ns5 = c4183nsOooO0o;
            c4183nsOooO0o = c4183ns4;
            if (c4183ns.OooO0o0() < i / 2) {
                int iOooO0OO = c4183nsOooO0o.OooO0OO(0);
                if (iOooO0OO == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int iOooO0oO = this.OooO00o.OooO0oO(iOooO0OO);
                return new C4183ns[]{c4183nsOooO0o.OooO0oO(iOooO0oO), c4183ns.OooO0oO(iOooO0oO)};
            }
            if (c4183ns.OooO0o()) {
                throw ChecksumException.getChecksumInstance();
            }
            C4183ns c4183nsOooO0o2 = this.OooO00o.OooO0o();
            int iOooO0oO2 = this.OooO00o.OooO0oO(c4183ns.OooO0OO(c4183ns.OooO0o0()));
            while (c4183ns2.OooO0o0() >= c4183ns.OooO0o0() && !c4183ns2.OooO0o()) {
                int iOooO0o0 = c4183ns2.OooO0o0() - c4183ns.OooO0o0();
                int iOooO = this.OooO00o.OooO(c4183ns2.OooO0OO(c4183ns2.OooO0o0()), iOooO0oO2);
                c4183nsOooO0o2 = c4183nsOooO0o2.OooO00o(this.OooO00o.OooO0O0(iOooO0o0, iOooO));
                c4183ns2 = c4183ns2.OooOO0O(c4183ns.OooO(iOooO0o0, iOooO));
            }
            c4183nsOooO0Oo = c4183nsOooO0o2.OooO0oo(c4183nsOooO0o).OooOO0O(c4183ns5).OooOO0();
        }
    }

    public final int OooO00o(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        C4183ns c4183ns = new C4183ns(this.OooO00o, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int iOooO0O0 = c4183ns.OooO0O0(this.OooO00o.OooO0OO(i2));
            iArr3[i - i2] = iOooO0O0;
            if (iOooO0O0 != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C4183ns c4183nsOooO0Oo = this.OooO00o.OooO0Oo();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int iOooO0OO = this.OooO00o.OooO0OO((iArr.length - 1) - i3);
                C4146ms c4146ms = this.OooO00o;
                c4183nsOooO0Oo = c4183nsOooO0Oo.OooO0oo(new C4183ns(c4146ms, new int[]{c4146ms.OooOO0(0, iOooO0OO), 1}));
            }
        }
        C4183ns[] c4183nsArrOooO0Oo = OooO0Oo(this.OooO00o.OooO0O0(i, 1), new C4183ns(this.OooO00o, iArr3), i);
        C4183ns c4183ns2 = c4183nsArrOooO0Oo[0];
        C4183ns c4183ns3 = c4183nsArrOooO0Oo[1];
        int[] iArrOooO0O0 = OooO0O0(c4183ns2);
        int[] iArrOooO0OO = OooO0OO(c4183ns3, c4183ns2, iArrOooO0O0);
        for (int i4 = 0; i4 < iArrOooO0O0.length; i4++) {
            int length = (iArr.length - 1) - this.OooO00o.OooO0oo(iArrOooO0O0[i4]);
            if (length < 0) {
                throw ChecksumException.getChecksumInstance();
            }
            iArr[length] = this.OooO00o.OooOO0(iArr[length], iArrOooO0OO[i4]);
        }
        return iArrOooO0O0.length;
    }
}
