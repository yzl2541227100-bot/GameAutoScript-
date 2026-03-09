package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: renamed from: z2.mq */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4144mq implements InterfaceC3881fm {
    public static int OooO0OO(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    private static C3772co OooO0o(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int iMax = Math.max(i, i4);
        int iMax2 = Math.max(1, i2);
        int i5 = iMax / i4;
        int i6 = (iMax - (length * i5)) / 2;
        C3772co c3772co = new C3772co(iMax, iMax2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                c3772co.OooOOo(i6, 0, i5, iMax2);
            }
            i7++;
            i6 += i5;
        }
        return c3772co;
    }

    @Override // p285z2.InterfaceC3881fm
    public final C3772co OooO00o(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return OooO0O0(str, barcodeFormat, i, i2, null);
    }

    @Override // p285z2.InterfaceC3881fm
    public C3772co OooO0O0(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int iOooO0o0 = OooO0o0();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                iOooO0o0 = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        return OooO0o(OooO0Oo(str), i, i2, iOooO0o0);
    }

    public abstract boolean[] OooO0Oo(String str);

    public int OooO0o0() {
        return 10;
    }
}
