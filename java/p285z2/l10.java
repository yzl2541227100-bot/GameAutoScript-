package p285z2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes2.dex */
public final class l10 extends Handler {
    private final o10 OooO00o;
    private final int OooO0O0;
    private final j10 OooO0OO;
    private boolean OooO0Oo;

    public l10(j10 j10Var, Looper looper, int i) {
        super(looper);
        this.OooO0OO = j10Var;
        this.OooO0O0 = i;
        this.OooO00o = new o10();
    }

    public void OooO00o(t10 t10Var, Object obj) {
        n10 n10VarOooO00o = n10.OooO00o(t10Var, obj);
        synchronized (this) {
            this.OooO00o.OooO00o(n10VarOooO00o);
            if (!this.OooO0Oo) {
                this.OooO0Oo = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                n10 n10VarOooO0O0 = this.OooO00o.OooO0O0();
                if (n10VarOooO0O0 == null) {
                    synchronized (this) {
                        n10VarOooO0O0 = this.OooO00o.OooO0O0();
                        if (n10VarOooO0O0 == null) {
                            this.OooO0Oo = false;
                            return;
                        }
                    }
                }
                this.OooO0OO.OooOO0O(n10VarOooO0O0);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.OooO0O0);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.OooO0Oo = true;
        } finally {
            this.OooO0Oo = false;
        }
    }
}
