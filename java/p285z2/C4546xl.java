package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: z2.xl */
/* JADX INFO: loaded from: classes2.dex */
public final class C4546xl implements InterfaceC3733bm {
    private Map<DecodeHintType, ?> OooO00o;
    private InterfaceC3733bm[] OooO0O0;

    private C3770cm OooO0OO(C4398tl c4398tl) throws NotFoundException {
        InterfaceC3733bm[] interfaceC3733bmArr = this.OooO0O0;
        if (interfaceC3733bmArr != null) {
            for (InterfaceC3733bm interfaceC3733bm : interfaceC3733bmArr) {
                try {
                    return interfaceC3733bm.OooO00o(c4398tl, this.OooO00o);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO00o(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException {
        OooO0o0(map);
        return OooO0OO(c4398tl);
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO0O0(C4398tl c4398tl) throws NotFoundException {
        OooO0o0(null);
        return OooO0OO(c4398tl);
    }

    public final C3770cm OooO0Oo(C4398tl c4398tl) throws NotFoundException {
        if (this.OooO0O0 == null) {
            OooO0o0(null);
        }
        return OooO0OO(c4398tl);
    }

    public final void OooO0o0(Map<DecodeHintType, ?> map) {
        this.OooO00o = map;
        boolean z = true;
        boolean z3 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(BarcodeFormat.UPC_A) && !collection.contains(BarcodeFormat.UPC_E) && !collection.contains(BarcodeFormat.EAN_13) && !collection.contains(BarcodeFormat.EAN_8) && !collection.contains(BarcodeFormat.CODABAR) && !collection.contains(BarcodeFormat.CODE_39) && !collection.contains(BarcodeFormat.CODE_93) && !collection.contains(BarcodeFormat.CODE_128) && !collection.contains(BarcodeFormat.ITF) && !collection.contains(BarcodeFormat.RSS_14) && !collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z3) {
                arrayList.add(new C4033jq(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new C4516ws());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new C4438uo());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new C3955hm());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new C4626zr());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new C4180np());
            }
            if (z && z3) {
                arrayList.add(new C4033jq(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z3) {
                arrayList.add(new C4033jq(map));
            }
            arrayList.add(new C4516ws());
            arrayList.add(new C4438uo());
            arrayList.add(new C3955hm());
            arrayList.add(new C4626zr());
            arrayList.add(new C4180np());
            if (z3) {
                arrayList.add(new C4033jq(map));
            }
        }
        this.OooO0O0 = (InterfaceC3733bm[]) arrayList.toArray(new InterfaceC3733bm[arrayList.size()]);
    }

    @Override // p285z2.InterfaceC3733bm
    public final void reset() {
        InterfaceC3733bm[] interfaceC3733bmArr = this.OooO0O0;
        if (interfaceC3733bmArr != null) {
            for (InterfaceC3733bm interfaceC3733bm : interfaceC3733bmArr) {
                interfaceC3733bm.reset();
            }
        }
    }
}
