package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class h10 implements Runnable {
    private final o10 OoooOoO = new o10();
    private final j10 OoooOoo;

    public h10(j10 j10Var) {
        this.OoooOoo = j10Var;
    }

    public void OooO00o(t10 t10Var, Object obj) {
        this.OoooOoO.OooO00o(n10.OooO00o(t10Var, obj));
        this.OoooOoo.OooO0oO().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        n10 n10VarOooO0O0 = this.OoooOoO.OooO0O0();
        if (n10VarOooO0O0 == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.OoooOoo.OooOO0O(n10VarOooO0O0);
    }
}
