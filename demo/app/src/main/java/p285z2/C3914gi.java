package p285z2;

import android.app.Application;
import com.cyjh.mobileanjian.ipc.interfaces.OnEngineStartCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnKeyEventListener;
import com.cyjh.mobileanjian.ipc.interfaces.OnScriptListener;
import com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback;
import com.cyjh.mobileanjian.ipc.interfaces.RootProgressListener;
import com.cyjh.p202mq.sdk.MqBridge;
import com.cyjh.p202mq.sdk.inf.OnElfCallback;
import com.goldcoast.sdk.domain.EntryPoint;
import java.io.File;

/* JADX INFO: renamed from: z2.gi */
/* JADX INFO: loaded from: classes2.dex */
public final class C3914gi {
    private static final C3914gi OooOOO = new C3914gi();
    private AbstractC3877fi OooO0O0;
    private int OooO0OO;
    private boolean OooO0Oo;
    private C4062ki OooO0o;
    private C4025ji OooO0o0;
    private InterfaceC3988ii OooO0oO;
    private boolean OooO00o = false;
    private OnKeyEventListener OooO0oo = new OooO00o();
    private RootProgressListener OooO = new OooO0O0();
    private OnEngineStartCallback OooOO0 = new OooO0OO();
    private OnScriptListener OooOO0O = new OooO0o();
    private OnElfCallback OooOO0o = new OooO();
    private OnSpecialMqCmdCallback OooOOO0 = new OooOO0();

    /* JADX INFO: renamed from: z2.gi$OooO */
    public class OooO implements OnElfCallback {
        public OooO() {
        }

        @Override // com.cyjh.p202mq.sdk.inf.OnElfCallback
        public void callback(int i, String str) {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.callback(i, str);
            }
        }
    }

    /* JADX INFO: renamed from: z2.gi$OooO00o */
    public class OooO00o implements OnKeyEventListener {
        public OooO00o() {
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnKeyEventListener
        public void onKeyEvent(int i) {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.onKeyEvent(i);
            }
        }
    }

    /* JADX INFO: renamed from: z2.gi$OooO0O0 */
    public class OooO0O0 implements RootProgressListener {
        public OooO0O0() {
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.RootProgressListener
        public void onRootProgress(String str, int i) {
            InterfaceC3988ii unused = C3914gi.this.OooO0oO;
        }
    }

    /* JADX INFO: renamed from: z2.gi$OooO0OO */
    public class OooO0OO implements OnEngineStartCallback {
        public OooO0OO() {
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnEngineStartCallback
        public void onEngineStart(int i) {
            C3914gi.this.OooO00o = true;
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.onEngineStart(i);
            }
            C3951hi.OooOOO0(C3951hi.OooO00o.getFilesDir() + File.separator + InterfaceC4047k3.o00000OO);
        }
    }

    /* JADX INFO: renamed from: z2.gi$OooO0o */
    public class OooO0o implements OnScriptListener {
        public OooO0o() {
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.BasicScriptListener
        public void onPause() {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.onPause();
            }
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.BasicScriptListener
        public void onResume() {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.onResume();
            }
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.BasicScriptListener
        public void onScriptIsRunning() {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.onScriptIsRunning();
            }
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnScriptListener
        public void onSetControlBarVisiable(int i) {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.onSetControlBarVisiable(i);
            }
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.BasicScriptListener
        public void onStartScript() {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.onStartScript();
            }
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.BasicScriptListener
        public void onStopScript(int i, String str) {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.onStopScript(i, str);
            }
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnScriptListener
        public void onUpdateControlBarPos(float f, int i, int i2) {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.onUpdateControlBarPos(f, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: z2.gi$OooOO0 */
    public class OooOO0 implements OnSpecialMqCmdCallback {
        public OooOO0() {
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback
        public void doSpecialFuction(int i, String str) {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.doSpecialFuction(i, str);
            }
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback
        public String getForegroundPackage() {
            if (C3914gi.this.OooO0oO != null) {
                return C3914gi.this.OooO0oO.getForegroundPackage();
            }
            return null;
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback
        public String getRunningPackages() {
            if (C3914gi.this.OooO0oO != null) {
                return C3914gi.this.OooO0oO.getRunningPackages();
            }
            return null;
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback
        public void inputText(String str) {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.inputText(str);
            }
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback
        public void keyPress(int i) {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.keyPress(i);
            }
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback
        public void killApp(String str) {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.killApp(str);
            }
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback
        public void launchApp(String str) {
            if (C3914gi.this.OooO0oO != null) {
                C3914gi.this.OooO0oO.launchApp(str);
            }
        }
    }

    /* JADX INFO: renamed from: z2.gi$OooOO0O */
    public class OooOO0O implements RootProgressListener {
        public OooOO0O() {
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.RootProgressListener
        public void onRootProgress(String str, int i) {
        }
    }

    public static C3914gi OooO0OO() {
        return OooOOO;
    }

    public void OooO() {
        AbstractC3877fi abstractC3877fi = this.OooO0O0;
        if (abstractC3877fi != null) {
            abstractC3877fi.OooO0Oo();
        }
    }

    public void OooO0Oo(Application application) {
        EntryPoint.init(application, "", null, 10, (byte) 0);
        C4025ji c4025ji = new C4025ji();
        this.OooO0o0 = c4025ji;
        this.OooO0O0 = c4025ji;
    }

    public void OooO0o(String str, String str2, String str3) {
        this.OooO0O0.OooO0O0(str, str2, str3, this.OooOO0o);
    }

    public void OooO0o0(Application application, String str, String str2, String str3, InterfaceC3988ii interfaceC3988ii) {
        this.OooO0oO = interfaceC3988ii;
        MqBridge.init(application, str, str2, str3, this.OooO0oo, new OooOO0O(), this.OooOO0);
        this.OooO0O0.OooO0oo(this.OooOOO0);
        this.OooO0O0.OooO0oO(this.OooOO0O);
    }

    public boolean OooO0oO() {
        return this.OooO00o;
    }

    public boolean OooO0oo() {
        AbstractC3877fi abstractC3877fi = this.OooO0O0;
        if (abstractC3877fi != null) {
            return abstractC3877fi.OooO0OO();
        }
        return false;
    }

    public void OooOO0() {
        AbstractC3877fi abstractC3877fi = this.OooO0O0;
        if (abstractC3877fi != null) {
            abstractC3877fi.OooO0o0();
        }
    }

    public void OooOO0O(boolean z, int i, int i2, int i3, int i4) {
        AbstractC3877fi abstractC3877fi = this.OooO0O0;
        if (abstractC3877fi != null) {
            abstractC3877fi.OooO0o(z, i, i2, i3, i4);
        }
    }

    public void OooOO0o(boolean z) {
        this.OooO00o = z;
    }

    public void OooOOO(int i) {
        AbstractC3877fi abstractC3877fi;
        this.OooO0OO = i;
        if (i == 0) {
            if (this.OooO0o0 == null) {
                this.OooO0o0 = new C4025ji();
            }
            abstractC3877fi = this.OooO0o0;
        } else {
            if (this.OooO0o == null) {
                this.OooO0o = new C4062ki();
            }
            abstractC3877fi = this.OooO0o;
        }
        this.OooO0O0 = abstractC3877fi;
    }

    public void OooOOO0(String str) {
        AbstractC3877fi abstractC3877fi = this.OooO0O0;
        if (abstractC3877fi != null) {
            abstractC3877fi.OooO(str);
        }
    }

    public void OooOOOO(String str, String str2, String str3, int i, long j, String str4, String str5, String str6, String str7) {
        C4209og c4209og = new C4209og();
        c4209og.OooOo0O(str);
        c4209og.OooOo(str2);
        c4209og.OooOOOo(str3);
        c4209og.OooO0oO(str4);
        c4209og.OooO0o0(str5);
        c4209og.OooooOO = i;
        c4209og.Oooooo = j;
        c4209og.Ooooo0o = str6;
        c4209og.OooooO0 = str7;
        c4209og.OoooooO = true;
        AbstractC3877fi abstractC3877fi = this.OooO0O0;
        if (abstractC3877fi != null) {
            abstractC3877fi.OooOO0(c4209og);
        }
    }

    public void OooOOOo(String str, String str2, String str3, String str4, String str5) {
        C4209og c4209og = new C4209og();
        c4209og.OooOo0O(str);
        c4209og.OooOo(str2);
        c4209og.OooOOOo(str3);
        c4209og.OooO0oO(str4);
        c4209og.OooO0o0(str5);
        AbstractC3877fi abstractC3877fi = this.OooO0O0;
        if (abstractC3877fi != null) {
            abstractC3877fi.OooOO0(c4209og);
        }
    }

    public void OooOOo() {
        AbstractC3877fi abstractC3877fi = this.OooO0O0;
        if (abstractC3877fi != null) {
            abstractC3877fi.OooOO0o();
        }
    }

    public void OooOOo0() {
        AbstractC3877fi abstractC3877fi = this.OooO0O0;
        if (abstractC3877fi != null) {
            abstractC3877fi.OooO0oo(this.OooOOO0);
            this.OooO0O0.OooOO0O();
        }
    }
}
