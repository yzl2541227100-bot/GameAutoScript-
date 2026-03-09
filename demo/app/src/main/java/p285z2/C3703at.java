package p285z2;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: z2.at */
/* JADX INFO: loaded from: classes2.dex */
public final class C3703at {
    private static final char[] OooO00o = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int OooO0O0 = 1;

    /* JADX INFO: renamed from: z2.at$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        static {
            int[] iArr = new int[Mode.values().length];
            OooO00o = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO00o[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OooO00o[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OooO00o[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OooO00o[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OooO00o[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OooO00o[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                OooO00o[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                OooO00o[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                OooO00o[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private C3703at() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9 A[LOOP:0: B:52:0x001e->B:49:0x00d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p285z2.C3846eo OooO00o(byte[] r17, p285z2.C3851et r18, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r19, java.util.Map<com.google.zxing.DecodeHintType, ?> r20) throws com.google.zxing.FormatException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3703at.OooO00o(byte[], z2.et, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):z2.eo");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void OooO0O0(p285z2.C3809do r3, java.lang.StringBuilder r4, int r5, boolean r6) throws com.google.zxing.FormatException {
        /*
            int r0 = r4.length()
        L4:
            r1 = 1
            if (r5 <= r1) goto L2d
            int r1 = r3.OooO00o()
            r2 = 11
            if (r1 < r2) goto L28
            int r1 = r3.OooO0Oo(r2)
            int r2 = r1 / 45
            char r2 = OooO0oo(r2)
            r4.append(r2)
            int r1 = r1 % 45
            char r1 = OooO0oo(r1)
            r4.append(r1)
            int r5 = r5 + (-2)
            goto L4
        L28:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.getFormatInstance()
            throw r3
        L2d:
            if (r5 != r1) goto L47
            int r5 = r3.OooO00o()
            r2 = 6
            if (r5 < r2) goto L42
            int r3 = r3.OooO0Oo(r2)
            char r3 = OooO0oo(r3)
            r4.append(r3)
            goto L47
        L42:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.getFormatInstance()
            throw r3
        L47:
            if (r6 == 0) goto L72
        L49:
            int r3 = r4.length()
            if (r0 >= r3) goto L72
            char r3 = r4.charAt(r0)
            r5 = 37
            if (r3 != r5) goto L6f
            int r3 = r4.length()
            int r3 = r3 - r1
            if (r0 >= r3) goto L6a
            int r3 = r0 + 1
            char r6 = r4.charAt(r3)
            if (r6 != r5) goto L6a
            r4.deleteCharAt(r3)
            goto L6f
        L6a:
            r3 = 29
            r4.setCharAt(r0, r3)
        L6f:
            int r0 = r0 + 1
            goto L49
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3703at.OooO0O0(z2.do, java.lang.StringBuilder, int, boolean):void");
    }

    private static void OooO0OO(C3809do c3809do, StringBuilder sb, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        if ((i << 3) > c3809do.OooO00o()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) c3809do.OooO0Oo(8);
        }
        try {
            sb.append(new String(bArr, characterSetECI == null ? C4105lo.OooO00o(bArr, map) : characterSetECI.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    private static void OooO0Oo(C3809do c3809do, StringBuilder sb, int i) throws FormatException {
        if (i * 13 > c3809do.OooO00o()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iOooO0Oo = c3809do.OooO0Oo(13);
            int i3 = (iOooO0Oo % 96) | ((iOooO0Oo / 96) << 8);
            int i4 = i3 + (i3 < 959 ? 41377 : 42657);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, C4105lo.OooO0OO));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    private static void OooO0o(C3809do c3809do, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (c3809do.OooO00o() < 10) {
                throw FormatException.getFormatInstance();
            }
            int iOooO0Oo = c3809do.OooO0Oo(10);
            if (iOooO0Oo >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb.append(OooO0oo(iOooO0Oo / 100));
            sb.append(OooO0oo((iOooO0Oo / 10) % 10));
            sb.append(OooO0oo(iOooO0Oo % 10));
            i -= 3;
        }
        if (i == 2) {
            if (c3809do.OooO00o() < 7) {
                throw FormatException.getFormatInstance();
            }
            int iOooO0Oo2 = c3809do.OooO0Oo(7);
            if (iOooO0Oo2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb.append(OooO0oo(iOooO0Oo2 / 10));
            sb.append(OooO0oo(iOooO0Oo2 % 10));
            return;
        }
        if (i == 1) {
            if (c3809do.OooO00o() < 4) {
                throw FormatException.getFormatInstance();
            }
            int iOooO0Oo3 = c3809do.OooO0Oo(4);
            if (iOooO0Oo3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb.append(OooO0oo(iOooO0Oo3));
        }
    }

    private static void OooO0o0(C3809do c3809do, StringBuilder sb, int i) throws FormatException {
        if (i * 13 > c3809do.OooO00o()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iOooO0Oo = c3809do.OooO0Oo(13);
            int i3 = (iOooO0Oo % 192) | ((iOooO0Oo / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, C4105lo.OooO0O0));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    private static int OooO0oO(C3809do c3809do) throws FormatException {
        int iOooO0Oo = c3809do.OooO0Oo(8);
        if ((iOooO0Oo & 128) == 0) {
            return iOooO0Oo & 127;
        }
        if ((iOooO0Oo & 192) == 128) {
            return c3809do.OooO0Oo(8) | ((iOooO0Oo & 63) << 8);
        }
        if ((iOooO0Oo & 224) == 192) {
            return c3809do.OooO0Oo(16) | ((iOooO0Oo & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    private static char OooO0oo(int i) throws FormatException {
        char[] cArr = OooO00o;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.getFormatInstance();
    }
}
