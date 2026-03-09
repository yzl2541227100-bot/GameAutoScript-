package p285z2;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* JADX INFO: renamed from: z2.pt */
/* JADX INFO: loaded from: classes2.dex */
public final class C4258pt {
    public static final int OooO0o = 8;
    private Mode OooO00o;
    private ErrorCorrectionLevel OooO0O0;
    private C3851et OooO0OO;
    private int OooO0Oo = -1;
    private C4110lt OooO0o0;

    public static boolean OooO0o(int i) {
        return i >= 0 && i < 8;
    }

    public final void OooO(C4110lt c4110lt) {
        this.OooO0o0 = c4110lt;
    }

    public final ErrorCorrectionLevel OooO00o() {
        return this.OooO0O0;
    }

    public final int OooO0O0() {
        return this.OooO0Oo;
    }

    public final C4110lt OooO0OO() {
        return this.OooO0o0;
    }

    public final Mode OooO0Oo() {
        return this.OooO00o;
    }

    public final C3851et OooO0o0() {
        return this.OooO0OO;
    }

    public final void OooO0oO(ErrorCorrectionLevel errorCorrectionLevel) {
        this.OooO0O0 = errorCorrectionLevel;
    }

    public final void OooO0oo(int i) {
        this.OooO0Oo = i;
    }

    public final void OooOO0(Mode mode) {
        this.OooO00o = mode;
    }

    public final void OooOO0O(C3851et c3851et) {
        this.OooO0OO = c3851et;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.OooO00o);
        sb.append("\n ecLevel: ");
        sb.append(this.OooO0O0);
        sb.append("\n version: ");
        sb.append(this.OooO0OO);
        sb.append("\n maskPattern: ");
        sb.append(this.OooO0Oo);
        if (this.OooO0o0 == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.OooO0o0);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
