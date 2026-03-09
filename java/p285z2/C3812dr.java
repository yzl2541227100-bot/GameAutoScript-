package p285z2;

/* JADX INFO: renamed from: z2.dr */
/* JADX INFO: loaded from: classes2.dex */
public final class C3812dr {
    private final boolean OooO00o;
    private final C4551xq OooO0O0;
    private final C4551xq OooO0OO;
    private final C4588yq OooO0Oo;

    public C3812dr(C4551xq c4551xq, C4551xq c4551xq2, C4588yq c4588yq, boolean z) {
        this.OooO0O0 = c4551xq;
        this.OooO0OO = c4551xq2;
        this.OooO0Oo = c4588yq;
        this.OooO00o = z;
    }

    private static boolean OooO00o(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static int OooO0o0(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final C4588yq OooO0O0() {
        return this.OooO0Oo;
    }

    public final C4551xq OooO0OO() {
        return this.OooO0O0;
    }

    public final C4551xq OooO0Oo() {
        return this.OooO0OO;
    }

    public final boolean OooO0o() {
        return this.OooO00o;
    }

    public final boolean OooO0oO() {
        return this.OooO0OO == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3812dr)) {
            return false;
        }
        C3812dr c3812dr = (C3812dr) obj;
        return OooO00o(this.OooO0O0, c3812dr.OooO0O0) && OooO00o(this.OooO0OO, c3812dr.OooO0OO) && OooO00o(this.OooO0Oo, c3812dr.OooO0Oo);
    }

    public final int hashCode() {
        return (OooO0o0(this.OooO0O0) ^ OooO0o0(this.OooO0OO)) ^ OooO0o0(this.OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.OooO0O0);
        sb.append(" , ");
        sb.append(this.OooO0OO);
        sb.append(" : ");
        C4588yq c4588yq = this.OooO0Oo;
        sb.append(c4588yq == null ? "null" : Integer.valueOf(c4588yq.OooO0OO()));
        sb.append(" ]");
        return sb.toString();
    }
}
