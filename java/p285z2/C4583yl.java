package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.oned.Code128Writer;
import java.util.Map;

/* JADX INFO: renamed from: z2.yl */
/* JADX INFO: loaded from: classes2.dex */
public final class C4583yl implements InterfaceC3881fm {

    /* JADX INFO: renamed from: z2.yl$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            OooO00o = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO00o[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OooO00o[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OooO00o[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OooO00o[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OooO00o[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OooO00o[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                OooO00o[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                OooO00o[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                OooO00o[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                OooO00o[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                OooO00o[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                OooO00o[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // p285z2.InterfaceC3881fm
    public final C3772co OooO00o(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return OooO0O0(str, barcodeFormat, i, i2, null);
    }

    @Override // p285z2.InterfaceC3881fm
    public final C3772co OooO0O0(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        InterfaceC3881fm c3885fq;
        switch (OooO00o.OooO00o[barcodeFormat.ordinal()]) {
            case 1:
                c3885fq = new C3885fq();
                break;
            case 2:
                c3885fq = new C4477vq();
                break;
            case 3:
                c3885fq = new C3811dq();
                break;
            case 4:
                c3885fq = new C4218oq();
                break;
            case 5:
                c3885fq = new C4553xs();
                break;
            case 6:
                c3885fq = new C4624zp();
                break;
            case 7:
                c3885fq = new C3737bq();
                break;
            case 8:
                c3885fq = new Code128Writer();
                break;
            case 9:
                c3885fq = new C3996iq();
                break;
            case 10:
                c3885fq = new C3739bs();
                break;
            case 11:
                c3885fq = new C4513wp();
                break;
            case 12:
                c3885fq = new C4475vo();
                break;
            case 13:
                c3885fq = new C3992im();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return c3885fq.OooO0O0(str, barcodeFormat, i, i2, map);
    }
}
