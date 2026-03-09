package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.aztec.decoder.Decoder;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: z2.hm */
/* JADX INFO: loaded from: classes2.dex */
public final class C3955hm implements InterfaceC3733bm {
    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO00o(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        C3807dm[] c3807dmArrOooO0O0;
        C3807dm[] c3807dmArrOooO0O02;
        FormatException formatException;
        InterfaceC3844em interfaceC3844em;
        C3918gm c3918gmOooO0O0;
        C4029jm c4029jm = new C4029jm(c4398tl.OooO0O0());
        C3846eo c3846eoOooO0OO = null;
        try {
            c3918gmOooO0O0 = c4029jm.OooO0O0(false);
            c3807dmArrOooO0O0 = c3918gmOooO0O0.OooO0O0();
        } catch (FormatException e) {
            e = e;
            c3807dmArrOooO0O0 = null;
        } catch (NotFoundException e2) {
            e = e2;
            c3807dmArrOooO0O0 = null;
        }
        try {
            c3807dmArrOooO0O02 = c3807dmArrOooO0O0;
            formatException = null;
            c3846eoOooO0OO = new Decoder().OooO0OO(c3918gmOooO0O0);
            e = null;
        } catch (FormatException e3) {
            e = e3;
            c3807dmArrOooO0O02 = c3807dmArrOooO0O0;
            formatException = e;
            e = null;
        } catch (NotFoundException e4) {
            e = e4;
            c3807dmArrOooO0O02 = c3807dmArrOooO0O0;
            formatException = null;
        }
        if (c3846eoOooO0OO == null) {
            try {
                C3918gm c3918gmOooO0O02 = c4029jm.OooO0O0(true);
                c3807dmArrOooO0O02 = c3918gmOooO0O02.OooO0O0();
                c3846eoOooO0OO = new Decoder().OooO0OO(c3918gmOooO0O02);
            } catch (FormatException | NotFoundException e5) {
                if (e != null) {
                    throw e;
                }
                if (formatException != null) {
                    throw formatException;
                }
                throw e5;
            }
        }
        C3807dm[] c3807dmArr = c3807dmArrOooO0O02;
        if (map != null && (interfaceC3844em = (InterfaceC3844em) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (C3807dm c3807dm : c3807dmArr) {
                interfaceC3844em.OooO00o(c3807dm);
            }
        }
        C3770cm c3770cm = new C3770cm(c3846eoOooO0OO.OooOO0(), c3846eoOooO0OO.OooO0oO(), c3846eoOooO0OO.OooO0o0(), c3807dmArr, BarcodeFormat.AZTEC, System.currentTimeMillis());
        List<byte[]> listOooO00o = c3846eoOooO0OO.OooO00o();
        if (listOooO00o != null) {
            c3770cm.OooOO0(ResultMetadataType.BYTE_SEGMENTS, listOooO00o);
        }
        String strOooO0O0 = c3846eoOooO0OO.OooO0O0();
        if (strOooO0O0 != null) {
            c3770cm.OooOO0(ResultMetadataType.ERROR_CORRECTION_LEVEL, strOooO0O0);
        }
        return c3770cm;
    }

    @Override // p285z2.InterfaceC3733bm
    public final C3770cm OooO0O0(C4398tl c4398tl) throws NotFoundException, FormatException {
        return OooO00o(c4398tl, null);
    }

    @Override // p285z2.InterfaceC3733bm
    public final void reset() {
    }
}
