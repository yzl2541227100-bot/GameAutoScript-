package p285z2;

import android.content.Context;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.cyjh.mobileanjian.ipc.interfaces.AppQuitListener;
import com.cyjh.mobileanjian.ipc.interfaces.EngineStateObserver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z2.dg */
/* JADX INFO: loaded from: classes2.dex */
public final class C3801dg implements AppQuitListener {
    private static final int OooO0o = 10092;
    private Context OooO0OO;
    private LocalServerSocket OooO00o = null;
    private C3764cg OooO0O0 = null;
    private boolean OooO0Oo = false;
    public List<EngineStateObserver> OooO0o0 = new ArrayList();

    public C3801dg(Context context) {
        this.OooO0OO = null;
        this.OooO0OO = context;
    }

    private void OooO00o(EngineStateObserver engineStateObserver) {
        this.OooO0o0.add(engineStateObserver);
    }

    private void OooO0OO(EngineStateObserver engineStateObserver) {
        this.OooO0o0.remove(engineStateObserver);
    }

    public final void OooO0O0(String str, int i) {
        StringBuilder sb = new StringBuilder("IpcServer listen start-1 ");
        sb.append(i);
        sb.append(", name:");
        sb.append(Thread.currentThread().getName());
        try {
            this.OooO00o = new LocalServerSocket(str);
            StringBuilder sb2 = new StringBuilder("IpcServer listen start-5 ");
            sb2.append(i);
            sb2.append(", name:");
            sb2.append(Thread.currentThread().getName());
            while (!this.OooO0Oo) {
                StringBuilder sb3 = new StringBuilder("IpcServer listen start-6 ");
                sb3.append(i);
                sb3.append(", name:");
                sb3.append(Thread.currentThread().getName());
                LocalSocket localSocketAccept = this.OooO00o.accept();
                StringBuilder sb4 = new StringBuilder("IpcServer listen start-7 ");
                sb4.append(i);
                sb4.append(", name:");
                sb4.append(Thread.currentThread().getName());
                C3764cg c3764cg = this.OooO0O0;
                if (c3764cg == null || !c3764cg.OooO0o) {
                    C3764cg c3764cg2 = new C3764cg(this.OooO0OO, localSocketAccept);
                    this.OooO0O0 = c3764cg2;
                    c3764cg2.OooOO0o = this.OooO0o0;
                    c3764cg2.OooOo0o();
                } else {
                    c3764cg.OooO0O0();
                }
            }
            this.OooO00o.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // com.cyjh.mobileanjian.ipc.interfaces.AppQuitListener
    public final void onAppQuit() {
        if (this.OooO0Oo) {
            return;
        }
        this.OooO0Oo = true;
        try {
            C3764cg c3764cg = this.OooO0O0;
            if (c3764cg != null) {
                c3764cg.OooOOOo(C4132me.OooO0OO(65535));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
