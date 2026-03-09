package p285z2;

import cn.haorui.sdk.adsail_ad.view.scaleImage.SubsamplingScaleImageView;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: z2.lq */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4107lq implements InterfaceC3733bm {
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p285z2.C3770cm OooO0Oo(p285z2.C4398tl r22, java.util.Map<com.google.zxing.DecodeHintType, ?> r23) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.AbstractC4107lq.OooO0Oo(z2.tl, java.util.Map):z2.cm");
    }

    public static void OooO0o(C3735bo c3735bo, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iOooOOO0 = c3735bo.OooOOO0();
        if (i >= iOooOOO0) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = !c3735bo.OooO0oo(i);
        while (i < iOooOOO0) {
            if (c3735bo.OooO0oo(i) == z) {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            } else {
                iArr[i2] = iArr[i2] + 1;
            }
            i++;
        }
        if (i2 != length) {
            if (i2 != length - 1 || i != iOooOOO0) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static float OooO0o0(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void OooO0oO(C3735bo c3735bo, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean zOooO0oo = c3735bo.OooO0oo(i);
        while (i > 0 && length >= 0) {
            i--;
            if (c3735bo.OooO0oo(i) != zOooO0oo) {
                length--;
                zOooO0oo = !zOooO0oo;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        OooO0o(c3735bo, i + 1, iArr);
    }

    @Override // p285z2.InterfaceC3733bm
    public C3770cm OooO00o(C4398tl c4398tl, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return OooO0Oo(c4398tl, map);
        } catch (NotFoundException e) {
            if (!(map != null && map.containsKey(DecodeHintType.TRY_HARDER)) || !c4398tl.OooO0oO()) {
                throw e;
            }
            C4398tl c4398tlOooO0oo = c4398tl.OooO0oo();
            C3770cm c3770cmOooO0Oo = OooO0Oo(c4398tlOooO0oo, map);
            Map<ResultMetadataType, Object> mapOooO0o0 = c3770cmOooO0Oo.OooO0o0();
            int iIntValue = SubsamplingScaleImageView.ORIENTATION_270;
            if (mapOooO0o0 != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (mapOooO0o0.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) mapOooO0o0.get(resultMetadataType)).intValue() + SubsamplingScaleImageView.ORIENTATION_270) % 360;
                }
            }
            c3770cmOooO0Oo.OooOO0(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            C3807dm[] c3807dmArrOooO0o = c3770cmOooO0Oo.OooO0o();
            if (c3807dmArrOooO0o != null) {
                int iOooO0Oo = c4398tlOooO0oo.OooO0Oo();
                for (int i = 0; i < c3807dmArrOooO0o.length; i++) {
                    c3807dmArrOooO0o[i] = new C3807dm((iOooO0Oo - c3807dmArrOooO0o[i].OooO0Oo()) - 1.0f, c3807dmArrOooO0o[i].OooO0OO());
                }
            }
            return c3770cmOooO0Oo;
        }
    }

    @Override // p285z2.InterfaceC3733bm
    public C3770cm OooO0O0(C4398tl c4398tl) throws NotFoundException, FormatException {
        return OooO00o(c4398tl, null);
    }

    public abstract C3770cm OooO0OO(int i, C3735bo c3735bo, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    @Override // p285z2.InterfaceC3733bm
    public void reset() {
    }
}
