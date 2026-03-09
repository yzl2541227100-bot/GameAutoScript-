package p285z2;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;

/* JADX INFO: renamed from: z2.rq */
/* JADX INFO: loaded from: classes2.dex */
public final class C4329rq {
    private static final int[] OooO0OO = {1, 1, 2};
    private final C4255pq OooO00o = new C4255pq();
    private final C4292qq OooO0O0 = new C4292qq();

    public final C3770cm OooO00o(int i, C3735bo c3735bo, int i2) throws NotFoundException {
        int[] iArrOooOOO = AbstractC4366sq.OooOOO(c3735bo, i2, false, OooO0OO);
        try {
            return this.OooO0O0.OooO0O0(i, c3735bo, iArrOooOOO);
        } catch (ReaderException unused) {
            return this.OooO00o.OooO0O0(i, c3735bo, iArrOooOOO);
        }
    }
}
