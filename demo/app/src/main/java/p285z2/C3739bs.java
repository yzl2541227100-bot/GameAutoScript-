package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: renamed from: z2.bs */
/* JADX INFO: loaded from: classes2.dex */
public final class C3739bs implements InterfaceC3881fm {
    private static final int OooO00o = 30;
    private static final int OooO0O0 = 2;

    private static C3772co OooO0OO(byte[][] bArr, int i) {
        int i2 = i * 2;
        C3772co c3772co = new C3772co(bArr[0].length + i2, bArr.length + i2);
        c3772co.OooO0O0();
        int iOooO0oo = (c3772co.OooO0oo() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    c3772co.OooOOo0(i4 + i, iOooO0oo);
                }
            }
            i3++;
            iOooO0oo--;
        }
        return c3772co;
    }

    private static C3772co OooO0Oo(C4405ts c4405ts, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        c4405ts.OooO0o0(str, i);
        byte[][] bArrOooO0OO = c4405ts.OooO0o().OooO0OO(1, 4);
        if ((i3 > i2) != (bArrOooO0OO[0].length < bArrOooO0OO.length)) {
            bArrOooO0OO = OooO0o0(bArrOooO0OO);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / bArrOooO0OO[0].length;
        int length2 = i3 / bArrOooO0OO.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return OooO0OO(bArrOooO0OO, i4);
        }
        byte[][] bArrOooO0OO2 = c4405ts.OooO0o().OooO0OO(length, length << 2);
        if (z) {
            bArrOooO0OO2 = OooO0o0(bArrOooO0OO2);
        }
        return OooO0OO(bArrOooO0OO2, i4);
    }

    private static byte[][] OooO0o0(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) byte.class, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // p285z2.InterfaceC3881fm
    public final C3772co OooO00o(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return OooO0O0(str, barcodeFormat, i, i2, null);
    }

    @Override // p285z2.InterfaceC3881fm
    public final C3772co OooO0O0(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        int i3;
        int i4;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        C4405ts c4405ts = new C4405ts();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                c4405ts.OooO0oo(Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                c4405ts.OooO(Compaction.valueOf(map.get(encodeHintType2).toString()));
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                C4368ss c4368ss = (C4368ss) map.get(encodeHintType3);
                c4405ts.OooOO0(c4368ss.OooO00o(), c4368ss.OooO0OO(), c4368ss.OooO0O0(), c4368ss.OooO0Oo());
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            int i5 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            int i6 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                c4405ts.OooOO0O(Charset.forName(map.get(encodeHintType6).toString()));
            }
            i4 = i5;
            i3 = i6;
        } else {
            i3 = 2;
            i4 = 30;
        }
        return OooO0Oo(c4405ts, str, i3, i, i2, i4);
    }
}
