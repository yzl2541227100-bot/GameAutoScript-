package p285z2;

/* JADX INFO: renamed from: z2.it */
/* JADX INFO: loaded from: classes2.dex */
public final class C3999it extends C3807dm {
    private final float OooO0OO;
    private final int OooO0Oo;

    public C3999it(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private C3999it(float f, float f2, float f3, int i) {
        super(f, f2);
        this.OooO0OO = f3;
        this.OooO0Oo = i;
    }

    public final float OooO() {
        return this.OooO0OO;
    }

    public final boolean OooO0o(float f, float f2, float f3) {
        if (Math.abs(f2 - OooO0Oo()) > f || Math.abs(f3 - OooO0OO()) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.OooO0OO);
        return fAbs <= 1.0f || fAbs <= this.OooO0OO;
    }

    public final C3999it OooO0oO(float f, float f2, float f3) {
        int i = this.OooO0Oo;
        int i2 = i + 1;
        float fOooO0OO = (i * OooO0OO()) + f2;
        float f4 = i2;
        return new C3999it(fOooO0OO / f4, ((this.OooO0Oo * OooO0Oo()) + f) / f4, ((this.OooO0Oo * this.OooO0OO) + f3) / f4, i2);
    }

    public final int OooO0oo() {
        return this.OooO0Oo;
    }
}
