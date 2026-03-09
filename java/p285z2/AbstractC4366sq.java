package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: z2.sq */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4366sq extends AbstractC4107lq {
    public static final int[][] OooO;
    private static final float OooO0Oo = 0.48f;
    private static final float OooO0o0 = 0.7f;
    public static final int[][] OooOO0;
    private final StringBuilder OooO00o = new StringBuilder(20);
    private final C4329rq OooO0O0 = new C4329rq();
    private final C3922gq OooO0OO = new C3922gq();
    public static final int[] OooO0o = {1, 1, 1};
    public static final int[] OooO0oO = {1, 1, 1, 1, 1};
    public static final int[] OooO0oo = {1, 1, 1, 1, 1, 1};

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        OooO = iArr;
        int[][] iArr2 = new int[20][];
        OooOO0 = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = OooO[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            OooOO0[i] = iArr4;
        }
    }

    public static boolean OooO(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return OooOOo(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    public static int OooOO0(C3735bo c3735bo, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        AbstractC4107lq.OooO0o(c3735bo, i, iArr);
        int length = iArr2.length;
        float f = OooO0Oo;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float fOooO0o0 = AbstractC4107lq.OooO0o0(iArr, iArr2[i3], OooO0o0);
            if (fOooO0o0 < f) {
                i2 = i3;
                f = fOooO0o0;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] OooOOO(C3735bo c3735bo, int i, boolean z, int[] iArr) throws NotFoundException {
        return OooOOOO(c3735bo, i, z, iArr, new int[iArr.length]);
    }

    private static int[] OooOOOO(C3735bo c3735bo, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int iOooOOO0 = c3735bo.OooOOO0();
        int iOooOO0o = z ? c3735bo.OooOO0o(i) : c3735bo.OooOO0O(i);
        int length = iArr.length;
        boolean z3 = z;
        int i2 = 0;
        int i3 = iOooOO0o;
        while (iOooOO0o < iOooOOO0) {
            if (c3735bo.OooO0oo(iOooOO0o) != z3) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else {
                    if (AbstractC4107lq.OooO0o0(iArr2, iArr, OooO0o0) < OooO0Oo) {
                        return new int[]{i3, iOooOO0o};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z3 = !z3;
            }
            iOooOO0o++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] OooOOOo(C3735bo c3735bo) throws NotFoundException {
        int[] iArr = new int[OooO0o.length];
        int[] iArrOooOOOO = null;
        boolean zOooOOOO = false;
        int i = 0;
        while (!zOooOOOO) {
            int[] iArr2 = OooO0o;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrOooOOOO = OooOOOO(c3735bo, i, false, iArr2, iArr);
            int i2 = iArrOooOOOO[0];
            int i3 = iArrOooOOOO[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                zOooOOOO = c3735bo.OooOOOO(i4, i2, false);
            }
            i = i3;
        }
        return iArrOooOOOO;
    }

    public static int OooOOo(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i3 += iCharAt2;
        }
        return (1000 - i3) % 10;
    }

    @Override // p285z2.AbstractC4107lq
    public C3770cm OooO0OO(int i, C3735bo c3735bo, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return OooOOO0(i, c3735bo, OooOOOo(c3735bo), map);
    }

    public boolean OooO0oo(String str) throws FormatException {
        return OooO(str);
    }

    public int[] OooOO0O(C3735bo c3735bo, int i) throws NotFoundException {
        return OooOOO(c3735bo, i, false, OooO0o);
    }

    public abstract int OooOO0o(C3735bo c3735bo, int[] iArr, StringBuilder sb) throws NotFoundException;

    public C3770cm OooOOO0(int i, C3735bo c3735bo, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String strOooO0OO;
        InterfaceC3844em interfaceC3844em = map == null ? null : (InterfaceC3844em) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (interfaceC3844em != null) {
            interfaceC3844em.OooO00o(new C3807dm((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.OooO00o;
        sb.setLength(0);
        int iOooOO0o = OooOO0o(c3735bo, iArr, sb);
        if (interfaceC3844em != null) {
            interfaceC3844em.OooO00o(new C3807dm(iOooOO0o, i));
        }
        int[] iArrOooOO0O = OooOO0O(c3735bo, iOooOO0o);
        if (interfaceC3844em != null) {
            interfaceC3844em.OooO00o(new C3807dm((iArrOooOO0O[0] + iArrOooOO0O[1]) / 2.0f, i));
        }
        int i2 = iArrOooOO0O[1];
        int i3 = (i2 - iArrOooOO0O[0]) + i2;
        if (i3 >= c3735bo.OooOOO0() || !c3735bo.OooOOOO(i2, i3, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!OooO0oo(string)) {
            throw ChecksumException.getChecksumInstance();
        }
        BarcodeFormat barcodeFormatOooOOo0 = OooOOo0();
        float f = i;
        C3770cm c3770cm = new C3770cm(string, null, new C3807dm[]{new C3807dm((iArr[1] + iArr[0]) / 2.0f, f), new C3807dm((iArrOooOO0O[1] + iArrOooOO0O[0]) / 2.0f, f)}, barcodeFormatOooOOo0);
        try {
            C3770cm c3770cmOooO00o = this.OooO0O0.OooO00o(i, c3735bo, iArrOooOO0O[1]);
            c3770cm.OooOO0(ResultMetadataType.UPC_EAN_EXTENSION, c3770cmOooO00o.OooO0oO());
            c3770cm.OooO(c3770cmOooO00o.OooO0o0());
            c3770cm.OooO00o(c3770cmOooO00o.OooO0o());
            length = c3770cmOooO00o.OooO0oO().length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    z = false;
                    break;
                }
                if (length == iArr2[i4]) {
                    break;
                }
                i4++;
            }
            if (!z) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if ((barcodeFormatOooOOo0 == BarcodeFormat.EAN_13 || barcodeFormatOooOOo0 == BarcodeFormat.UPC_A) && (strOooO0OO = this.OooO0OO.OooO0OO(string)) != null) {
            c3770cm.OooOO0(ResultMetadataType.POSSIBLE_COUNTRY, strOooO0OO);
        }
        return c3770cm;
    }

    public abstract BarcodeFormat OooOOo0();
}
