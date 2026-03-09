package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: renamed from: z2.cm */
/* JADX INFO: loaded from: classes2.dex */
public final class C3770cm {
    private final String OooO00o;
    private final byte[] OooO0O0;
    private final int OooO0OO;
    private C3807dm[] OooO0Oo;
    private Map<ResultMetadataType, Object> OooO0o;
    private final BarcodeFormat OooO0o0;
    private final long OooO0oO;

    public C3770cm(String str, byte[] bArr, int i, C3807dm[] c3807dmArr, BarcodeFormat barcodeFormat, long j) {
        this.OooO00o = str;
        this.OooO0O0 = bArr;
        this.OooO0OO = i;
        this.OooO0Oo = c3807dmArr;
        this.OooO0o0 = barcodeFormat;
        this.OooO0o = null;
        this.OooO0oO = j;
    }

    public C3770cm(String str, byte[] bArr, C3807dm[] c3807dmArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, c3807dmArr, barcodeFormat, System.currentTimeMillis());
    }

    public C3770cm(String str, byte[] bArr, C3807dm[] c3807dmArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, c3807dmArr, barcodeFormat, j);
    }

    public final void OooO(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.OooO0o;
            if (map2 == null) {
                this.OooO0o = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void OooO00o(C3807dm[] c3807dmArr) {
        C3807dm[] c3807dmArr2 = this.OooO0Oo;
        if (c3807dmArr2 == null) {
            this.OooO0Oo = c3807dmArr;
            return;
        }
        if (c3807dmArr == null || c3807dmArr.length <= 0) {
            return;
        }
        C3807dm[] c3807dmArr3 = new C3807dm[c3807dmArr2.length + c3807dmArr.length];
        System.arraycopy(c3807dmArr2, 0, c3807dmArr3, 0, c3807dmArr2.length);
        System.arraycopy(c3807dmArr, 0, c3807dmArr3, c3807dmArr2.length, c3807dmArr.length);
        this.OooO0Oo = c3807dmArr3;
    }

    public final BarcodeFormat OooO0O0() {
        return this.OooO0o0;
    }

    public final int OooO0OO() {
        return this.OooO0OO;
    }

    public final byte[] OooO0Oo() {
        return this.OooO0O0;
    }

    public final C3807dm[] OooO0o() {
        return this.OooO0Oo;
    }

    public final Map<ResultMetadataType, Object> OooO0o0() {
        return this.OooO0o;
    }

    public final String OooO0oO() {
        return this.OooO00o;
    }

    public final long OooO0oo() {
        return this.OooO0oO;
    }

    public final void OooOO0(ResultMetadataType resultMetadataType, Object obj) {
        if (this.OooO0o == null) {
            this.OooO0o = new EnumMap(ResultMetadataType.class);
        }
        this.OooO0o.put(resultMetadataType, obj);
    }

    public final String toString() {
        return this.OooO00o;
    }
}
