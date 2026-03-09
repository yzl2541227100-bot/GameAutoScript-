package p285z2;

import android.os.Message;
import com.anythink.core.common.p051b.C1169h;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: z2.ac */
/* JADX INFO: loaded from: classes2.dex */
public class C3686ac {
    private static String OooO0Oo = "ac";
    public static final int OooO0o = 1000;
    private static C3686ac OooO0o0 = null;
    public static final int OooO0oO = 180000;
    public static final int OooO0oo = 7200000;
    private OooO0O0 OooO00o;
    private Timer OooO0O0;
    private OooO0OO OooO0OO;

    /* JADX INFO: renamed from: z2.ac$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(Message message);
    }

    /* JADX INFO: renamed from: z2.ac$OooO0OO */
    public class OooO0OO extends TimerTask {
        private OooO0OO() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Message message = new Message();
            message.what = 1000;
            if (C3686ac.this.OooO00o != null) {
                C3686ac.this.OooO00o.OooO00o(message);
            }
        }
    }

    private C3686ac() {
    }

    public static C3686ac OooO0O0() {
        if (OooO0o0 == null) {
            synchronized (C3686ac.class) {
                if (OooO0o0 == null) {
                    OooO0o0 = new C3686ac();
                }
            }
        }
        return OooO0o0;
    }

    public C3686ac OooO0OO(OooO0O0 oooO0O0) {
        this.OooO00o = oooO0O0;
        return this;
    }

    public void OooO0Oo() {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new Timer();
            this.OooO0OO = new OooO0OO();
        }
        this.OooO0O0.schedule(this.OooO0OO, 180000L, C1169h.h.f3149a);
    }

    public void OooO0o0() {
        Timer timer = this.OooO0O0;
        if (timer != null) {
            timer.cancel();
            this.OooO0O0 = null;
        }
    }
}
