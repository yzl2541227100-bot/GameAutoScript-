package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public final class t10 {
    public final Object OooO00o;
    public final r10 OooO0O0;
    public volatile boolean OooO0OO = true;

    public t10(Object obj, r10 r10Var) {
        this.OooO00o = obj;
        this.OooO0O0 = r10Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t10)) {
            return false;
        }
        t10 t10Var = (t10) obj;
        return this.OooO00o == t10Var.OooO00o && this.OooO0O0.equals(t10Var.OooO0O0);
    }

    public int hashCode() {
        return this.OooO00o.hashCode() + this.OooO0O0.OooO0o.hashCode();
    }
}
