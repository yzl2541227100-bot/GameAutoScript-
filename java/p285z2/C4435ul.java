package p285z2;

/* JADX INFO: renamed from: z2.ul */
/* JADX INFO: loaded from: classes2.dex */
public final class C4435ul {
    private final int OooO00o;
    private final int OooO0O0;

    public C4435ul(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException();
        }
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
        if (obj instanceof C4435ul) {
            C4435ul c4435ul = (C4435ul) obj;
            if (this.OooO00o == c4435ul.OooO00o && this.OooO0O0 == c4435ul.OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.OooO00o * 32713) + this.OooO0O0;
    }

    public final String toString() {
        return this.OooO00o + "x" + this.OooO0O0;
    }
}
