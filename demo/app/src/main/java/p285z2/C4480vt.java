package p285z2;

import com.anythink.expressad.exoplayer.C1575f;
import com.hlzn.socketclient.service.SocketService;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: z2.vt */
/* JADX INFO: loaded from: classes2.dex */
public class C4480vt extends Timer {
    public static final String OooO0o0 = C4480vt.class.getSimpleName();
    private String OooO00o;
    private int OooO0O0;
    private OooO0O0 OooO0OO;
    private SocketService OooO0Oo;

    /* JADX INFO: renamed from: z2.vt$OooO0O0 */
    public class OooO0O0 extends TimerTask {
        private OooO0O0() {
        }

        public /* synthetic */ OooO0O0(C4480vt c4480vt, OooO00o oooO00o) {
            this();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (C4480vt.this.OooO0Oo.Oooo000()) {
                if (C4480vt.this.OooO0Oo.OooOoo0() != null) {
                    C4480vt.this.OooO0Oo.OooOoo0().OooO0O0(C4480vt.this.OooO00o);
                    return;
                }
                return;
            }
            C4480vt.OooO0o0(C4480vt.this);
            if (C4480vt.this.OooO0O0 > C4480vt.this.OooO0Oo.OooOoo()) {
                try {
                    C4480vt.this.OooO0Oo.OooOoo0().OooO0O0(String.valueOf(C4480vt.this.OooO00o));
                } finally {
                    C4480vt.this.OooO0Oo.Oooo0O0();
                    C4480vt.this.OooO0O0 = 0;
                }
            }
        }
    }

    public C4480vt(SocketService socketService, String str) {
        this.OooO0Oo = socketService;
        this.OooO00o = str;
        OooO0O0 oooO0O0 = new OooO0O0();
        this.OooO0OO = oooO0O0;
        schedule(oooO0O0, 1000L, C1575f.f8394a);
    }

    public static /* synthetic */ int OooO0o0(C4480vt c4480vt) {
        int i = c4480vt.OooO0O0;
        c4480vt.OooO0O0 = i + 1;
        return i;
    }
}
