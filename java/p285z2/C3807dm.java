package p285z2;

/* JADX INFO: renamed from: z2.dm */
/* JADX INFO: loaded from: classes2.dex */
public class C3807dm {
    private final float OooO00o;
    private final float OooO0O0;

    public C3807dm(float f, float f2) {
        this.OooO00o = f;
        this.OooO0O0 = f2;
    }

    private static float OooO00o(C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3) {
        float f = c3807dm2.OooO00o;
        float f2 = c3807dm2.OooO0O0;
        return ((c3807dm3.OooO00o - f) * (c3807dm.OooO0O0 - f2)) - ((c3807dm3.OooO0O0 - f2) * (c3807dm.OooO00o - f));
    }

    public static float OooO0O0(C3807dm c3807dm, C3807dm c3807dm2) {
        return C4142mo.OooO00o(c3807dm.OooO00o, c3807dm.OooO0O0, c3807dm2.OooO00o, c3807dm2.OooO0O0);
    }

    public static void OooO0o0(C3807dm[] c3807dmArr) {
        C3807dm c3807dm;
        C3807dm c3807dm2;
        C3807dm c3807dm3;
        float fOooO0O0 = OooO0O0(c3807dmArr[0], c3807dmArr[1]);
        float fOooO0O02 = OooO0O0(c3807dmArr[1], c3807dmArr[2]);
        float fOooO0O03 = OooO0O0(c3807dmArr[0], c3807dmArr[2]);
        if (fOooO0O02 >= fOooO0O0 && fOooO0O02 >= fOooO0O03) {
            c3807dm = c3807dmArr[0];
            c3807dm2 = c3807dmArr[1];
            c3807dm3 = c3807dmArr[2];
        } else if (fOooO0O03 < fOooO0O02 || fOooO0O03 < fOooO0O0) {
            c3807dm = c3807dmArr[2];
            c3807dm2 = c3807dmArr[0];
            c3807dm3 = c3807dmArr[1];
        } else {
            c3807dm = c3807dmArr[1];
            c3807dm2 = c3807dmArr[0];
            c3807dm3 = c3807dmArr[2];
        }
        if (OooO00o(c3807dm2, c3807dm, c3807dm3) < 0.0f) {
            C3807dm c3807dm4 = c3807dm3;
            c3807dm3 = c3807dm2;
            c3807dm2 = c3807dm4;
        }
        c3807dmArr[0] = c3807dm2;
        c3807dmArr[1] = c3807dm;
        c3807dmArr[2] = c3807dm3;
    }

    public final float OooO0OO() {
        return this.OooO00o;
    }

    public final float OooO0Oo() {
        return this.OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3807dm) {
            C3807dm c3807dm = (C3807dm) obj;
            if (this.OooO00o == c3807dm.OooO00o && this.OooO0O0 == c3807dm.OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.OooO00o) * 31) + Float.floatToIntBits(this.OooO0O0);
    }

    public final String toString() {
        return "(" + this.OooO00o + ',' + this.OooO0O0 + ')';
    }
}
