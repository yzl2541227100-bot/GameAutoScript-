package p285z2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z2.to */
/* JADX INFO: loaded from: classes2.dex */
public final class C4401to {
    private final C4290qo OooO00o;
    private final List<C4327ro> OooO0O0;

    public C4401to(C4290qo c4290qo) {
        this.OooO00o = c4290qo;
        ArrayList arrayList = new ArrayList();
        this.OooO0O0 = arrayList;
        arrayList.add(new C4327ro(c4290qo, new int[]{1}));
    }

    private C4327ro OooO00o(int i) {
        if (i >= this.OooO0O0.size()) {
            List<C4327ro> list = this.OooO0O0;
            C4327ro c4327roOooO = list.get(list.size() - 1);
            for (int size = this.OooO0O0.size(); size <= i; size++) {
                C4290qo c4290qo = this.OooO00o;
                c4327roOooO = c4327roOooO.OooO(new C4327ro(c4290qo, new int[]{1, c4290qo.OooO0OO((size - 1) + c4290qo.OooO0Oo())}));
                this.OooO0O0.add(c4327roOooO);
            }
        }
        return this.OooO0O0.get(i);
    }

    public final void OooO0O0(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        C4327ro c4327roOooO00o = OooO00o(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrOooO0o0 = new C4327ro(this.OooO00o, iArr2).OooOO0(i, 1).OooO0O0(c4327roOooO00o)[1].OooO0o0();
        int length2 = i - iArrOooO0o0.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrOooO0o0, 0, iArr, length + length2, iArrOooO0o0.length);
    }
}
