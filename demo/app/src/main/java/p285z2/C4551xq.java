package p285z2;

/* JADX INFO: renamed from: z2.xq */
/* JADX INFO: loaded from: classes2.dex */
public class C4551xq {
    private final int OooO00o;
    private final int OooO0O0;

    public C4551xq(int i, int i2) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
    }

    public final int OooO00o() {
        return this.OooO0O0;
    }

    public final int OooO0O0() {
        return this.OooO00o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4551xq)) {
            return false;
        }
        C4551xq c4551xq = (C4551xq) obj;
        return this.OooO00o == c4551xq.OooO00o && this.OooO0O0 == c4551xq.OooO0O0;
    }

    public final int hashCode() {
        return this.OooO00o ^ this.OooO0O0;
    }

    public final String toString() {
        return this.OooO00o + "(" + this.OooO0O0 + ')';
    }
}
