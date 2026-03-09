package p285z2;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class od0 extends pd0 {
    public od0(cd0 cd0Var) {
        super(cd0Var);
    }

    @Override // p285z2.pd0
    public void OooO00o() {
        cd0 cd0Var = this.OoooOoO;
        long jOooOoo0 = cd0Var.OooooOo.OooOoo0(cd0Var.OooooOO);
        if (jOooOoo0 >= 0) {
            this.OoooOoO.Ooooo00 = SystemClock.uptimeMillis() + jOooOoo0;
            if (this.OoooOoO.isVisible() && this.OoooOoO.OoooOoo) {
                cd0 cd0Var2 = this.OoooOoO;
                if (!cd0Var2.o0OoOo0) {
                    cd0Var2.OoooOoO.remove(this);
                    cd0 cd0Var3 = this.OoooOoO;
                    cd0Var3.o00Ooo = cd0Var3.OoooOoO.schedule(this, jOooOoo0, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.OoooOoO.Oooooo0.isEmpty() && this.OoooOoO.OooO0oo() == this.OoooOoO.OooooOo.OooOOO() - 1) {
                cd0 cd0Var4 = this.OoooOoO;
                cd0Var4.ooOO.sendEmptyMessageAtTime(cd0Var4.OooO(), this.OoooOoO.Ooooo00);
            }
        } else {
            cd0 cd0Var5 = this.OoooOoO;
            cd0Var5.Ooooo00 = Long.MIN_VALUE;
            cd0Var5.OoooOoo = false;
        }
        if (!this.OoooOoO.isVisible() || this.OoooOoO.ooOO.hasMessages(-1)) {
            return;
        }
        this.OoooOoO.ooOO.sendEmptyMessageAtTime(-1, 0L);
    }
}
