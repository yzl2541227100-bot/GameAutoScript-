package p285z2;

/* JADX INFO: renamed from: z2.ms */
/* JADX INFO: loaded from: classes2.dex */
public final class C4146ms {
    public static final C4146ms OooO0o = new C4146ms(C4589yr.OooO00o, 3);
    private final int[] OooO00o;
    private final int[] OooO0O0;
    private final C4183ns OooO0OO;
    private final C4183ns OooO0Oo;
    private final int OooO0o0;

    private C4146ms(int i, int i2) {
        this.OooO0o0 = i;
        this.OooO00o = new int[i];
        this.OooO0O0 = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.OooO00o[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.OooO0O0[this.OooO00o[i5]] = i5;
        }
        this.OooO0OO = new C4183ns(this, new int[]{0});
        this.OooO0Oo = new C4183ns(this, new int[]{1});
    }

    public final int OooO(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.OooO00o;
        int[] iArr2 = this.OooO0O0;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.OooO0o0 - 1)];
    }

    public final int OooO00o(int i, int i2) {
        return (i + i2) % this.OooO0o0;
    }

    public final C4183ns OooO0O0(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.OooO0OO;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new C4183ns(this, iArr);
    }

    public final int OooO0OO(int i) {
        return this.OooO00o[i];
    }

    public final C4183ns OooO0Oo() {
        return this.OooO0Oo;
    }

    public final C4183ns OooO0o() {
        return this.OooO0OO;
    }

    public final int OooO0o0() {
        return this.OooO0o0;
    }

    public final int OooO0oO(int i) {
        if (i != 0) {
            return this.OooO00o[(this.OooO0o0 - this.OooO0O0[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public final int OooO0oo(int i) {
        if (i != 0) {
            return this.OooO0O0[i];
        }
        throw new IllegalArgumentException();
    }

    public final int OooOO0(int i, int i2) {
        int i3 = this.OooO0o0;
        return ((i + i3) - i2) % i3;
    }
}
