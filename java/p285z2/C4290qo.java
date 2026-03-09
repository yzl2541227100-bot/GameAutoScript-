package p285z2;

import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;

/* JADX INFO: renamed from: z2.qo */
/* JADX INFO: loaded from: classes2.dex */
public final class C4290qo {
    public static final C4290qo OooOO0;
    public static final C4290qo OooOO0O;
    public static final C4290qo OooOO0o;
    public static final C4290qo OooOOO;
    public static final C4290qo OooOOO0;
    public static final C4290qo OooOOOO;
    private final int[] OooO00o;
    private final int[] OooO0O0;
    private final C4327ro OooO0OO;
    private final C4327ro OooO0Oo;
    private final int OooO0o;
    private final int OooO0o0;
    private final int OooO0oO;
    public static final C4290qo OooO0oo = new C4290qo(4201, 4096, 1);
    public static final C4290qo OooO = new C4290qo(1033, 1024, 1);

    static {
        C4290qo c4290qo = new C4290qo(67, 64, 1);
        OooOO0 = c4290qo;
        OooOO0O = new C4290qo(19, 16, 1);
        OooOO0o = new C4290qo(285, 256, 0);
        C4290qo c4290qo2 = new C4290qo(UiMessage.CommandToUi.Command_Type.SET_ENABLED_VALUE, 256, 1);
        OooOOO0 = c4290qo2;
        OooOOO = c4290qo2;
        OooOOOO = c4290qo;
    }

    public C4290qo(int i, int i2, int i3) {
        this.OooO0o = i;
        this.OooO0o0 = i2;
        this.OooO0oO = i3;
        this.OooO00o = new int[i2];
        this.OooO0O0 = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.OooO00o[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.OooO0O0[this.OooO00o[i6]] = i6;
        }
        this.OooO0OO = new C4327ro(this, new int[]{0});
        this.OooO0Oo = new C4327ro(this, new int[]{1});
    }

    public static int OooO00o(int i, int i2) {
        return i ^ i2;
    }

    public final int OooO(int i) {
        if (i != 0) {
            return this.OooO0O0[i];
        }
        throw new IllegalArgumentException();
    }

    public final C4327ro OooO0O0(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.OooO0OO;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new C4327ro(this, iArr);
    }

    public final int OooO0OO(int i) {
        return this.OooO00o[i];
    }

    public final int OooO0Oo() {
        return this.OooO0oO;
    }

    public final int OooO0o() {
        return this.OooO0o0;
    }

    public final C4327ro OooO0o0() {
        return this.OooO0Oo;
    }

    public final C4327ro OooO0oO() {
        return this.OooO0OO;
    }

    public final int OooO0oo(int i) {
        if (i != 0) {
            return this.OooO00o[(this.OooO0o0 - this.OooO0O0[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public final int OooOO0(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.OooO00o;
        int[] iArr2 = this.OooO0O0;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.OooO0o0 - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.OooO0o) + ',' + this.OooO0o0 + ')';
    }
}
