package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: z2.kq */
/* JADX INFO: loaded from: classes2.dex */
public final class C4070kq extends AbstractC4107lq {
    private final AbstractC4366sq[] OooO00o;

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4070kq(java.util.Map<com.google.zxing.DecodeHintType, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L7
            r3 = 0
            goto Lf
        L7:
            com.google.zxing.DecodeHintType r0 = com.google.zxing.DecodeHintType.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            z2.cq r1 = new z2.cq
            r1.<init>()
        L23:
            r0.add(r1)
            goto L35
        L27:
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L35
            z2.nq r1 = new z2.nq
            r1.<init>()
            goto L23
        L35:
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L45
            z2.eq r1 = new z2.eq
            r1.<init>()
            r0.add(r1)
        L45:
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L55
            z2.uq r3 = new z2.uq
            r3.<init>()
            r0.add(r3)
        L55:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L73
            z2.cq r3 = new z2.cq
            r3.<init>()
            r0.add(r3)
            z2.eq r3 = new z2.eq
            r3.<init>()
            r0.add(r3)
            z2.uq r3 = new z2.uq
            r3.<init>()
            r0.add(r3)
        L73:
            int r3 = r0.size()
            z2.sq[] r3 = new p285z2.AbstractC4366sq[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            z2.sq[] r3 = (p285z2.AbstractC4366sq[]) r3
            r2.OooO00o = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4070kq.<init>(java.util.Map):void");
    }

    @Override // p285z2.AbstractC4107lq
    public final C3770cm OooO0OO(int i, C3735bo c3735bo, Map<DecodeHintType, ?> map) throws NotFoundException {
        int[] iArrOooOOOo = AbstractC4366sq.OooOOOo(c3735bo);
        for (AbstractC4366sq abstractC4366sq : this.OooO00o) {
            try {
                C3770cm c3770cmOooOOO0 = abstractC4366sq.OooOOO0(i, c3735bo, iArrOooOOOo, map);
                boolean z = c3770cmOooOOO0.OooO0O0() == BarcodeFormat.EAN_13 && c3770cmOooOOO0.OooO0oO().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                boolean z3 = collection == null || collection.contains(BarcodeFormat.UPC_A);
                if (!z || !z3) {
                    return c3770cmOooOOO0;
                }
                C3770cm c3770cm = new C3770cm(c3770cmOooOOO0.OooO0oO().substring(1), c3770cmOooOOO0.OooO0Oo(), c3770cmOooOOO0.OooO0o(), BarcodeFormat.UPC_A);
                c3770cm.OooO(c3770cmOooOOO0.OooO0o0());
                return c3770cm;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p285z2.AbstractC4107lq, p285z2.InterfaceC3733bm
    public final void reset() {
        for (AbstractC4366sq abstractC4366sq : this.OooO00o) {
            abstractC4366sq.reset();
        }
    }
}
