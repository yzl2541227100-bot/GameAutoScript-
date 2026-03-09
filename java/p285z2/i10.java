package p285z2;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class i10 implements Runnable {
    private final o10 OoooOoO = new o10();
    private final j10 OoooOoo;
    private volatile boolean Ooooo00;

    public i10(j10 j10Var) {
        this.OoooOoo = j10Var;
    }

    public void OooO00o(t10 t10Var, Object obj) {
        n10 n10VarOooO00o = n10.OooO00o(t10Var, obj);
        synchronized (this) {
            this.OoooOoO.OooO00o(n10VarOooO00o);
            if (!this.Ooooo00) {
                this.Ooooo00 = true;
                this.OoooOoo.OooO0oO().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        n10 n10VarOooO0OO;
        while (true) {
            try {
                n10VarOooO0OO = this.OoooOoO.OooO0OO(1000);
            } catch (InterruptedException e) {
                Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                return;
            } finally {
                this.Ooooo00 = false;
            }
            if (n10VarOooO0OO == null) {
                synchronized (this) {
                    n10VarOooO0OO = this.OoooOoO.OooO0O0();
                    if (n10VarOooO0OO == null) {
                        return;
                    }
                    this.Ooooo00 = false;
                }
            }
            this.OoooOoo.OooOO0O(n10VarOooO0OO);
        }
    }
}
