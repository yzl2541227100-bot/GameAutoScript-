package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: renamed from: z2.qq */
/* JADX INFO: loaded from: classes2.dex */
public final class C4292qq {
    private static final int[] OooO0OO = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    private final int[] OooO00o = new int[4];
    private final StringBuilder OooO0O0 = new StringBuilder();

    private int OooO00o(C3735bo c3735bo, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.OooO00o;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iOooOOO0 = c3735bo.OooOOO0();
        int iOooOO0o = iArr[1];
        int i = 0;
        for (int i2 = 0; i2 < 5 && iOooOO0o < iOooOOO0; i2++) {
            int iOooOO0 = AbstractC4366sq.OooOO0(c3735bo, iArr2, iOooOO0o, AbstractC4366sq.OooOO0);
            sb.append((char) ((iOooOO0 % 10) + 48));
            for (int i3 : iArr2) {
                iOooOO0o += i3;
            }
            if (iOooOO0 >= 10) {
                i |= 1 << (4 - i2);
            }
            if (i2 != 4) {
                iOooOO0o = c3735bo.OooOO0o(c3735bo.OooOO0O(iOooOO0o));
            }
        }
        if (sb.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (OooO0Oo(sb.toString()) == OooO0OO(i)) {
            return iOooOO0o;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int OooO0OO(int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == OooO0OO[i2]) {
                return i2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int OooO0Oo(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i = length - 2; i >= 0; i -= 2) {
            iCharAt += charSequence.charAt(i) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            iCharAt2 += charSequence.charAt(i2) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    private static Map<ResultMetadataType, Object> OooO0o(String str) {
        String strOooO0o0;
        if (str.length() != 5 || (strOooO0o0 = OooO0o0(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, strOooO0o0);
        return enumMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String OooO0o0(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == r2) goto L50
            r2 = 53
            if (r1 == r2) goto L4d
            r2 = 57
            if (r1 == r2) goto L15
            goto L52
        L15:
            r5.hashCode()
            r1 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case 54118329: goto L38;
                case 54395376: goto L2d;
                case 54395377: goto L22;
                default: goto L20;
            }
        L20:
            r0 = -1
            goto L41
        L22:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2b
            goto L20
        L2b:
            r0 = 2
            goto L41
        L2d:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L36
            goto L20
        L36:
            r0 = 1
            goto L41
        L38:
            java.lang.String r2 = "90000"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L41
            goto L20
        L41:
            switch(r0) {
                case 0: goto L4b;
                case 1: goto L48;
                case 2: goto L45;
                default: goto L44;
            }
        L44:
            goto L52
        L45:
            java.lang.String r5 = "0.00"
            return r5
        L48:
            java.lang.String r5 = "Used"
            return r5
        L4b:
            r5 = 0
            return r5
        L4d:
            java.lang.String r3 = "$"
            goto L52
        L50:
            java.lang.String r3 = "£"
        L52:
            java.lang.String r5 = r5.substring(r4)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L71
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "0"
            java.lang.String r5 = r1.concat(r5)
            goto L75
        L71:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L75:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4292qq.OooO0o0(java.lang.String):java.lang.String");
    }

    public final C3770cm OooO0O0(int i, C3735bo c3735bo, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.OooO0O0;
        sb.setLength(0);
        int iOooO00o = OooO00o(c3735bo, iArr, sb);
        String string = sb.toString();
        Map<ResultMetadataType, Object> mapOooO0o = OooO0o(string);
        float f = i;
        C3770cm c3770cm = new C3770cm(string, null, new C3807dm[]{new C3807dm((iArr[0] + iArr[1]) / 2.0f, f), new C3807dm(iOooO00o, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (mapOooO0o != null) {
            c3770cm.OooO(mapOooO0o);
        }
        return c3770cm;
    }
}
