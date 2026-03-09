package p285z2;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.multi.qrcode.detector.MultiFinderPatternFinder;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: z2.up */
/* JADX INFO: loaded from: classes2.dex */
public final class C4439up extends C3962ht {
    private static final C3920go[] OooO0OO = new C3920go[0];

    public C4439up(C3772co c3772co) {
        super(c3772co);
    }

    public final C3920go[] OooOOO(Map<DecodeHintType, ?> map) throws NotFoundException {
        C4036jt[] c4036jtArrOooOOo = new MultiFinderPatternFinder(OooO0oo(), map == null ? null : (InterfaceC3844em) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)).OooOOo(map);
        if (c4036jtArrOooOOo.length == 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        ArrayList arrayList = new ArrayList();
        for (C4036jt c4036jt : c4036jtArrOooOOo) {
            try {
                arrayList.add(OooOO0(c4036jt));
            } catch (ReaderException unused) {
            }
        }
        return arrayList.isEmpty() ? OooO0OO : (C3920go[]) arrayList.toArray(new C3920go[arrayList.size()]);
    }
}
