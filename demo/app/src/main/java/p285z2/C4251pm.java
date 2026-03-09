package p285z2;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: z2.pm */
/* JADX INFO: loaded from: classes2.dex */
public final class C4251pm {
    public static final C4251pm OooO0o0 = new C4251pm(AbstractC4288qm.OooO0O0, 0, 0, 0);
    private final int OooO00o;
    private final AbstractC4288qm OooO0O0;
    private final int OooO0OO;
    private final int OooO0Oo;

    private C4251pm(AbstractC4288qm abstractC4288qm, int i, int i2, int i3) {
        this.OooO0O0 = abstractC4288qm;
        this.OooO00o = i;
        this.OooO0OO = i2;
        this.OooO0Oo = i3;
    }

    public final C4251pm OooO(int i, int i2) {
        AbstractC4288qm abstractC4288qm = this.OooO0O0;
        int i3 = this.OooO00o;
        int i4 = i3 == 2 ? 4 : 5;
        return new C4251pm(abstractC4288qm.OooO00o(C4177nm.OooOO0[i3][i], i4).OooO00o(i2, 5), this.OooO00o, 0, this.OooO0Oo + i4 + 5);
    }

    public final C4251pm OooO00o(int i) {
        AbstractC4288qm abstractC4288qmOooO00o = this.OooO0O0;
        int i2 = this.OooO00o;
        int i3 = this.OooO0Oo;
        if (i2 == 4 || i2 == 2) {
            int i4 = C4177nm.OooO0oo[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            abstractC4288qmOooO00o = abstractC4288qmOooO00o.OooO00o(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.OooO0OO;
        C4251pm c4251pm = new C4251pm(abstractC4288qmOooO00o, i2, i7 + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return c4251pm.OooO0OO == 2078 ? c4251pm.OooO0O0(i + 1) : c4251pm;
    }

    public final C4251pm OooO0O0(int i) {
        int i2 = this.OooO0OO;
        return i2 == 0 ? this : new C4251pm(this.OooO0O0.OooO0O0(i - i2, i2), this.OooO00o, 0, this.OooO0Oo);
    }

    public final int OooO0OO() {
        return this.OooO0OO;
    }

    public final int OooO0Oo() {
        return this.OooO0Oo;
    }

    public final AbstractC4288qm OooO0o() {
        return this.OooO0O0;
    }

    public final int OooO0o0() {
        return this.OooO00o;
    }

    public final boolean OooO0oO(C4251pm c4251pm) {
        int i;
        int i2 = this.OooO0Oo + (C4177nm.OooO0oo[this.OooO00o][c4251pm.OooO00o] >> 16);
        int i3 = c4251pm.OooO0OO;
        if (i3 > 0 && ((i = this.OooO0OO) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= c4251pm.OooO0Oo;
    }

    public final C4251pm OooO0oo(int i, int i2) {
        int i3 = this.OooO0Oo;
        AbstractC4288qm abstractC4288qmOooO00o = this.OooO0O0;
        int i4 = this.OooO00o;
        if (i != i4) {
            int i5 = C4177nm.OooO0oo[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            abstractC4288qmOooO00o = abstractC4288qmOooO00o.OooO00o(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new C4251pm(abstractC4288qmOooO00o.OooO00o(i2, i8), i, 0, i3 + i8);
    }

    public final C3735bo OooOO0(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (AbstractC4288qm abstractC4288qmOooO0Oo = OooO0O0(bArr.length).OooO0O0; abstractC4288qmOooO0Oo != null; abstractC4288qmOooO0Oo = abstractC4288qmOooO0Oo.OooO0Oo()) {
            linkedList.addFirst(abstractC4288qmOooO0Oo);
        }
        C3735bo c3735bo = new C3735bo();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((AbstractC4288qm) it.next()).OooO0OO(c3735bo, bArr);
        }
        return c3735bo;
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", C4177nm.OooO0O0[this.OooO00o], Integer.valueOf(this.OooO0Oo), Integer.valueOf(this.OooO0OO));
    }
}
