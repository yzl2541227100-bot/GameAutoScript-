package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public final class o10 {
    private n10 OooO00o;
    private n10 OooO0O0;

    public synchronized void OooO00o(n10 n10Var) {
        try {
            if (n10Var == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            n10 n10Var2 = this.OooO0O0;
            if (n10Var2 != null) {
                n10Var2.OooO0OO = n10Var;
                this.OooO0O0 = n10Var;
            } else {
                if (this.OooO00o != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.OooO0O0 = n10Var;
                this.OooO00o = n10Var;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized n10 OooO0O0() {
        n10 n10Var;
        n10Var = this.OooO00o;
        if (n10Var != null) {
            n10 n10Var2 = n10Var.OooO0OO;
            this.OooO00o = n10Var2;
            if (n10Var2 == null) {
                this.OooO0O0 = null;
            }
        }
        return n10Var;
    }

    public synchronized n10 OooO0OO(int i) throws InterruptedException {
        if (this.OooO00o == null) {
            wait(i);
        }
        return OooO0O0();
    }
}
