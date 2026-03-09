package p285z2;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: z2.hp */
/* JADX INFO: loaded from: classes2.dex */
public final class C3958hp {
    private int OooO;
    private final String OooO00o;
    private SymbolShapeHint OooO0O0;
    private C4435ul OooO0OO;
    private C4435ul OooO0Oo;
    public int OooO0o;
    private final StringBuilder OooO0o0;
    private int OooO0oO;
    private C4069kp OooO0oo;

    public C3958hp(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.OooO00o = sb.toString();
        this.OooO0O0 = SymbolShapeHint.FORCE_NONE;
        this.OooO0o0 = new StringBuilder(str.length());
        this.OooO0oO = -1;
    }

    private int OooO() {
        return this.OooO00o.length() - this.OooO;
    }

    public final int OooO00o() {
        return this.OooO0o0.length();
    }

    public final StringBuilder OooO0O0() {
        return this.OooO0o0;
    }

    public final char OooO0OO() {
        return this.OooO00o.charAt(this.OooO0o);
    }

    public final char OooO0Oo() {
        return this.OooO00o.charAt(this.OooO0o);
    }

    public final int OooO0o() {
        return this.OooO0oO;
    }

    public final String OooO0o0() {
        return this.OooO00o;
    }

    public final int OooO0oO() {
        return OooO() - this.OooO0o;
    }

    public final C4069kp OooO0oo() {
        return this.OooO0oo;
    }

    public final boolean OooOO0() {
        return this.OooO0o < OooO();
    }

    public final void OooOO0O() {
        this.OooO0oO = -1;
    }

    public final void OooOO0o() {
        this.OooO0oo = null;
    }

    public final void OooOOO(int i) {
        this.OooO = i;
    }

    public final void OooOOO0(C4435ul c4435ul, C4435ul c4435ul2) {
        this.OooO0OO = c4435ul;
        this.OooO0Oo = c4435ul2;
    }

    public final void OooOOOO(SymbolShapeHint symbolShapeHint) {
        this.OooO0O0 = symbolShapeHint;
    }

    public final void OooOOOo(int i) {
        this.OooO0oO = i;
    }

    public final void OooOOo(int i) {
        C4069kp c4069kp = this.OooO0oo;
        if (c4069kp == null || i > c4069kp.OooO0O0()) {
            this.OooO0oo = C4069kp.OooOOOO(i, this.OooO0O0, this.OooO0OO, this.OooO0Oo, true);
        }
    }

    public final void OooOOo0() {
        OooOOo(OooO00o());
    }

    public final void OooOOoo(char c) {
        this.OooO0o0.append(c);
    }

    public final void OooOo00(String str) {
        this.OooO0o0.append(str);
    }
}
