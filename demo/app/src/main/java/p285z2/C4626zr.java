package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: z2.zr */
/* JADX INFO: loaded from: classes2.dex */
public final class C4626zr implements InterfaceC3733bm, InterfaceC4402tp {
    private static int OooO(C3807dm c3807dm, C3807dm c3807dm2) {
        if (c3807dm == null || c3807dm2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(c3807dm.OooO0OO() - c3807dm2.OooO0OO());
    }

    private static int OooO0o(C3807dm[] c3807dmArr) {
        return Math.max(Math.max(OooO0oO(c3807dmArr[0], c3807dmArr[4]), (OooO0oO(c3807dmArr[6], c3807dmArr[2]) * 17) / 18), Math.max(OooO0oO(c3807dmArr[1], c3807dmArr[5]), (OooO0oO(c3807dmArr[7], c3807dmArr[3]) * 17) / 18));
    }

    private static C3770cm[] OooO0o0(C4398tl c4398tl, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException, ChecksumException, FormatException {
        ArrayList arrayList = new ArrayList();
        C4257ps c4257psOooO0O0 = C4220os.OooO0O0(c4398tl, map, z);
        for (C3807dm[] c3807dmArr : c4257psOooO0O0.OooO0O0()) {
            C3846eo c3846eoOooO = C4072ks.OooO(c4257psOooO0O0.OooO00o(), c3807dmArr[4], c3807dmArr[5], c3807dmArr[6], c3807dmArr[7], OooO0oo(c3807dmArr), OooO0o(c3807dmArr));
            C3770cm c3770cm = new C3770cm(c3846eoOooO.OooOO0(), c3846eoOooO.OooO0oO(), c3807dmArr, BarcodeFormat.PDF_417);
            c3770cm.OooOO0(ResultMetadataType.ERROR_CORRECTION_LEVEL, c3846eoOooO.OooO0O0());
            C3702as c3702as = (C3702as) c3846eoOooO.OooO0o();
            if (c3702as != null) {
                c3770cm.OooOO0(ResultMetadataType.PDF417_EXTRA_METADATA, c3702as);
            }
            arrayList.add(c3770cm);
        }
        return (C3770cm[]) arrayList.toArray(new C3770cm[arrayList.size()]);
    }

    private static int OooO0oO(C3807dm c3807dm, C3807dm c3807dm2) {
        if (c3807dm == null || c3807dm2 == null) {
            return 0;
        }
        return (int) Math.abs(c3807dm.OooO0OO() - c3807dm2.OooO0OO());
    }

    private static int OooO0oo(C3807dm[] c3807dmArr) {
        return Math.min(Math.min(OooO(c3807dmArr[0], c3807dmArr[4]), (OooO(c3807dmArr[6], c3807dmArr[2]) * 17) / 18), Math.min(OooO(c3807dmArr[1], c3807dmArr[5]), (OooO(c3807dmArr[7], c3807dmArr[3]) * 17) / 18));
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO00o(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C3770cm[] c3770cmArrOooO0o0 = OooO0o0(c4398tl, map, false);
        if (c3770cmArrOooO0o0 == null || c3770cmArrOooO0o0.length == 0 || c3770cmArrOooO0o0[0] == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        return c3770cmArrOooO0o0[0];
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO0O0(C4398tl c4398tl) throws NotFoundException, ChecksumException, FormatException {
        return OooO00o(c4398tl, null);
    }

    @Override // p285z2.InterfaceC4402tp
    public final C3770cm[] OooO0OO(C4398tl c4398tl) throws NotFoundException {
        return OooO0Oo(c4398tl, null);
    }

    @Override // p285z2.InterfaceC4402tp
    public final C3770cm[] OooO0Oo(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException {
        try {
            return OooO0o0(c4398tl, map, true);
        } catch (ChecksumException | FormatException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    @Override // p285z2.InterfaceC3733bm
    public final void reset() {
    }
}
