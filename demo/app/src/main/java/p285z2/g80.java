package p285z2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class g80 {
    private final List<p20<?>> OooO00o = new ArrayList();

    private p20<Throwable> OooO0O0() {
        return this.OooO00o.size() == 1 ? OooO0Oo(this.OooO00o.get(0)) : i20.OooO00o(OooO0o0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private p20<Throwable> OooO0Oo(p20<?> p20Var) {
        return p20Var;
    }

    private List<p20<? super Throwable>> OooO0o0() {
        return new ArrayList(this.OooO00o);
    }

    public void OooO00o(p20<?> p20Var) {
        this.OooO00o.add(p20Var);
    }

    public p20<Throwable> OooO0OO() {
        return c80.OooOO0(OooO0O0());
    }

    public boolean OooO0o() {
        return !this.OooO00o.isEmpty();
    }
}
