package p285z2;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: z2.sp */
/* JADX INFO: loaded from: classes2.dex */
public final class C4365sp implements InterfaceC4402tp {
    private static final int OooO0O0 = 100;
    private static final int OooO0OO = 4;
    private final InterfaceC3733bm OooO00o;

    public C4365sp(InterfaceC3733bm interfaceC3733bm) {
        this.OooO00o = interfaceC3733bm;
    }

    private void OooO00o(C4398tl c4398tl, Map<DecodeHintType, ?> map, List<C3770cm> list, int i, int i2, int i3) {
        boolean z;
        float f;
        float f2;
        float f3;
        int i4;
        C4398tl c4398tlOooO00o = c4398tl;
        int i5 = i2;
        for (int i6 = i3; i6 <= 4; i6++) {
            try {
                C3770cm c3770cmOooO00o = this.OooO00o.OooO00o(c4398tlOooO00o, map);
                Iterator<C3770cm> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().OooO0oO().equals(c3770cmOooO00o.OooO0oO())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    list.add(OooO0O0(c3770cmOooO00o, i, i5));
                }
                C3807dm[] c3807dmArrOooO0o = c3770cmOooO00o.OooO0o();
                if (c3807dmArrOooO0o == null || c3807dmArrOooO0o.length == 0) {
                    return;
                }
                int iOooO0o0 = c4398tlOooO00o.OooO0o0();
                int iOooO0Oo = c4398tlOooO00o.OooO0Oo();
                float f4 = iOooO0o0;
                float f5 = 0.0f;
                float f6 = iOooO0Oo;
                float f7 = 0.0f;
                for (C3807dm c3807dm : c3807dmArrOooO0o) {
                    if (c3807dm != null) {
                        float fOooO0OO = c3807dm.OooO0OO();
                        float fOooO0Oo = c3807dm.OooO0Oo();
                        if (fOooO0OO < f4) {
                            f4 = fOooO0OO;
                        }
                        if (fOooO0Oo < f6) {
                            f6 = fOooO0Oo;
                        }
                        if (fOooO0OO > f5) {
                            f5 = fOooO0OO;
                        }
                        if (fOooO0Oo > f7) {
                            f7 = fOooO0Oo;
                        }
                    }
                }
                if (f4 > 100.0f) {
                    f = f7;
                    f2 = f5;
                    f3 = f6;
                    i4 = iOooO0Oo;
                    OooO00o(c4398tlOooO00o.OooO00o(0, 0, (int) f4, iOooO0Oo), map, list, i, i5, i6 + 1);
                } else {
                    f = f7;
                    f2 = f5;
                    f3 = f6;
                    i4 = iOooO0Oo;
                }
                if (f3 > 100.0f) {
                    OooO00o(c4398tlOooO00o.OooO00o(0, 0, iOooO0o0, (int) f3), map, list, i, i5, i6 + 1);
                }
                float f8 = f2;
                if (f8 < iOooO0o0 - 100) {
                    int i7 = (int) f8;
                    OooO00o(c4398tlOooO00o.OooO00o(i7, 0, iOooO0o0 - i7, i4), map, list, i + i7, i5, i6 + 1);
                }
                float f9 = f;
                if (f9 >= i4 - 100) {
                    return;
                }
                int i8 = (int) f9;
                c4398tlOooO00o = c4398tlOooO00o.OooO00o(0, i8, iOooO0o0, i4 - i8);
                i5 += i8;
            } catch (ReaderException unused) {
                return;
            }
        }
    }

    private static C3770cm OooO0O0(C3770cm c3770cm, int i, int i2) {
        C3807dm[] c3807dmArrOooO0o = c3770cm.OooO0o();
        if (c3807dmArrOooO0o == null) {
            return c3770cm;
        }
        C3807dm[] c3807dmArr = new C3807dm[c3807dmArrOooO0o.length];
        for (int i3 = 0; i3 < c3807dmArrOooO0o.length; i3++) {
            C3807dm c3807dm = c3807dmArrOooO0o[i3];
            if (c3807dm != null) {
                c3807dmArr[i3] = new C3807dm(c3807dm.OooO0OO() + i, c3807dm.OooO0Oo() + i2);
            }
        }
        C3770cm c3770cm2 = new C3770cm(c3770cm.OooO0oO(), c3770cm.OooO0Oo(), c3770cm.OooO0OO(), c3807dmArr, c3770cm.OooO0O0(), c3770cm.OooO0oo());
        c3770cm2.OooO(c3770cm.OooO0o0());
        return c3770cm2;
    }

    @Override // p285z2.InterfaceC4402tp
    public final C3770cm[] OooO0OO(C4398tl c4398tl) throws NotFoundException {
        return OooO0Oo(c4398tl, null);
    }

    @Override // p285z2.InterfaceC4402tp
    public final C3770cm[] OooO0Oo(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        OooO00o(c4398tl, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (C3770cm[]) arrayList.toArray(new C3770cm[arrayList.size()]);
    }
}
