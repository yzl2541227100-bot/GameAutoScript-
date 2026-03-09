package p285z2;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import p285z2.e90;

/* JADX INFO: loaded from: classes2.dex */
@e90.OooO00o
public final class g90 extends e90 {
    private final e90 OooO00o;
    private final Object OooO0O0;

    public g90(e90 e90Var, Object obj) {
        this.OooO00o = e90Var;
        this.OooO0O0 = obj;
    }

    @Override // p285z2.e90
    public void OooO00o(Failure failure) {
        synchronized (this.OooO0O0) {
            this.OooO00o.OooO00o(failure);
        }
    }

    @Override // p285z2.e90
    public void OooO0O0(Failure failure) throws Exception {
        synchronized (this.OooO0O0) {
            this.OooO00o.OooO0O0(failure);
        }
    }

    @Override // p285z2.e90
    public void OooO0OO(Description description) throws Exception {
        synchronized (this.OooO0O0) {
            this.OooO00o.OooO0OO(description);
        }
    }

    @Override // p285z2.e90
    public void OooO0Oo(Description description) throws Exception {
        synchronized (this.OooO0O0) {
            this.OooO00o.OooO0Oo(description);
        }
    }

    @Override // p285z2.e90
    public void OooO0o(Description description) throws Exception {
        synchronized (this.OooO0O0) {
            this.OooO00o.OooO0o(description);
        }
    }

    @Override // p285z2.e90
    public void OooO0o0(Result result) throws Exception {
        synchronized (this.OooO0O0) {
            this.OooO00o.OooO0o0(result);
        }
    }

    @Override // p285z2.e90
    public void OooO0oO(Description description) throws Exception {
        synchronized (this.OooO0O0) {
            this.OooO00o.OooO0oO(description);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g90) {
            return this.OooO00o.equals(((g90) obj).OooO00o);
        }
        return false;
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public String toString() {
        return this.OooO00o.toString() + " (with synchronization wrapper)";
    }
}
