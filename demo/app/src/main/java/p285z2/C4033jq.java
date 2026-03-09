package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: z2.jq */
/* JADX INFO: loaded from: classes2.dex */
public final class C4033jq extends AbstractC4107lq {
    private final AbstractC4107lq[] OooO00o;

    public C4033jq(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new C4070kq(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new C4587yp(z));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new C3700aq());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new C4550xp());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new C3959hq());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new C4476vp());
            }
            if (collection.contains(BarcodeFormat.RSS_14)) {
                arrayList.add(new C3701ar());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new C3886fr());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C4070kq(map));
            arrayList.add(new C4587yp());
            arrayList.add(new C4476vp());
            arrayList.add(new C3700aq());
            arrayList.add(new C4550xp());
            arrayList.add(new C3959hq());
            arrayList.add(new C3701ar());
            arrayList.add(new C3886fr());
        }
        this.OooO00o = (AbstractC4107lq[]) arrayList.toArray(new AbstractC4107lq[arrayList.size()]);
    }

    @Override // p285z2.AbstractC4107lq
    public final C3770cm OooO0OO(int i, C3735bo c3735bo, Map<DecodeHintType, ?> map) throws NotFoundException {
        for (AbstractC4107lq abstractC4107lq : this.OooO00o) {
            try {
                return abstractC4107lq.OooO0OO(i, c3735bo, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p285z2.AbstractC4107lq, p285z2.InterfaceC3733bm
    public final void reset() {
        for (AbstractC4107lq abstractC4107lq : this.OooO00o) {
            abstractC4107lq.reset();
        }
    }
}
