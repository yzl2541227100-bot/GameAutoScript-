package p285z2;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: renamed from: z2.rp */
/* JADX INFO: loaded from: classes2.dex */
public final class C4328rp implements InterfaceC3733bm {
    private final InterfaceC3733bm OooO00o;

    public C4328rp(InterfaceC3733bm interfaceC3733bm) {
        this.OooO00o = interfaceC3733bm;
    }

    private static void OooO0OO(C3807dm[] c3807dmArr, int i, int i2) {
        if (c3807dmArr != null) {
            for (int i3 = 0; i3 < c3807dmArr.length; i3++) {
                C3807dm c3807dm = c3807dmArr[i3];
                c3807dmArr[i3] = new C3807dm(c3807dm.OooO0OO() + i, c3807dm.OooO0Oo() + i2);
            }
        }
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO00o(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int iOooO0o0 = c4398tl.OooO0o0() / 2;
        int iOooO0Oo = c4398tl.OooO0Oo() / 2;
        try {
            try {
                try {
                    try {
                        return this.OooO00o.OooO00o(c4398tl.OooO00o(0, 0, iOooO0o0, iOooO0Oo), map);
                    } catch (NotFoundException unused) {
                        C3770cm c3770cmOooO00o = this.OooO00o.OooO00o(c4398tl.OooO00o(iOooO0o0, 0, iOooO0o0, iOooO0Oo), map);
                        OooO0OO(c3770cmOooO00o.OooO0o(), iOooO0o0, 0);
                        return c3770cmOooO00o;
                    }
                } catch (NotFoundException unused2) {
                    C3770cm c3770cmOooO00o2 = this.OooO00o.OooO00o(c4398tl.OooO00o(0, iOooO0Oo, iOooO0o0, iOooO0Oo), map);
                    OooO0OO(c3770cmOooO00o2.OooO0o(), 0, iOooO0Oo);
                    return c3770cmOooO00o2;
                }
            } catch (NotFoundException unused3) {
                C3770cm c3770cmOooO00o3 = this.OooO00o.OooO00o(c4398tl.OooO00o(iOooO0o0, iOooO0Oo, iOooO0o0, iOooO0Oo), map);
                OooO0OO(c3770cmOooO00o3.OooO0o(), iOooO0o0, iOooO0Oo);
                return c3770cmOooO00o3;
            }
        } catch (NotFoundException unused4) {
            int i = iOooO0o0 / 2;
            int i2 = iOooO0Oo / 2;
            C3770cm c3770cmOooO00o4 = this.OooO00o.OooO00o(c4398tl.OooO00o(i, i2, iOooO0o0, iOooO0Oo), map);
            OooO0OO(c3770cmOooO00o4.OooO0o(), i, i2);
            return c3770cmOooO00o4;
        }
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO0O0(C4398tl c4398tl) throws NotFoundException, ChecksumException, FormatException {
        return OooO00o(c4398tl, null);
    }

    @Override // p285z2.InterfaceC3733bm
    public final void reset() {
        this.OooO00o.reset();
    }
}
