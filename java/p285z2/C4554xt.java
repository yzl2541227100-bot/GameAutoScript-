package p285z2;

import android.content.Context;
import com.hlzn.socketclient.bean.ServiceParam;

/* JADX INFO: renamed from: z2.xt */
/* JADX INFO: loaded from: classes2.dex */
public class C4554xt {
    private static C4554xt OooO0OO;
    private Context OooO00o;
    private InterfaceC3741bu OooO0O0;

    private C4554xt() {
    }

    public static C4554xt OooOO0() {
        if (OooO0OO == null) {
            synchronized (C4554xt.class) {
                if (OooO0OO == null) {
                    OooO0OO = new C4554xt();
                }
            }
        }
        return OooO0OO;
    }

    public void OooO() {
        C3926gu.OooO0O0(this.OooO00o, C4628zt.OooOO0o);
    }

    public void OooO00o(int i, String str) {
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setCmdRenameDeviceNameCode(i);
        serviceParam.setCmdRenameDeviceNameResult(str);
        C3926gu.OooO0OO(this.OooO00o, C4628zt.OooOO0O, serviceParam);
    }

    public void OooO0O0(int i, String str) {
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setCmdScreenCaptureCode(i);
        serviceParam.setCmdScreenCaptureResult(str);
        C3926gu.OooO0OO(this.OooO00o, C4628zt.OooO, serviceParam);
    }

    public void OooO0OO(int i, String str) {
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setCmdScriptSettingsCode(i);
        serviceParam.setCmdScriptSettingsResult(str);
        C3926gu.OooO0OO(this.OooO00o, C4628zt.OooO0oo, serviceParam);
    }

    public void OooO0Oo(int i, String str) {
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setCmdScriptStartCode(i);
        serviceParam.setCmdScriptStartResult(str);
        C3926gu.OooO0OO(this.OooO00o, C4628zt.OooO0o0, serviceParam);
    }

    public void OooO0o(int i, String str) {
        OooO0oO(i, str, str);
    }

    public void OooO0o0(int i, String str) {
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setCmdScriptStopCode(i);
        serviceParam.setCmdScriptStopResult(str);
        C3926gu.OooO0OO(this.OooO00o, C4628zt.OooO0o, serviceParam);
    }

    public void OooO0oO(int i, String str, String str2) {
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setScriptId(str2);
        serviceParam.setCmdScriptUpgradeCode(i);
        serviceParam.setCmdScriptUpgradeResult(str);
        C3926gu.OooO0OO(this.OooO00o, C4628zt.OooO0oO, serviceParam);
    }

    public void OooO0oo(int i, String str) {
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setCmdUnBindStudioProjectCode(i);
        serviceParam.setCmdUnBindStudioProjectResult(str);
        C3926gu.OooO0OO(this.OooO00o, C4628zt.OooOO0, serviceParam);
    }

    public InterfaceC3741bu OooOO0O() {
        return this.OooO0O0;
    }

    public void OooOO0o(Context context) {
        this.OooO00o = context;
    }

    public void OooOOO() {
        if (C4628zt.OooOo0O) {
            ServiceParam serviceParam = new ServiceParam();
            serviceParam.setScriptRunning(false);
            C3926gu.OooO0OO(this.OooO00o, C4628zt.OooO0Oo, serviceParam);
        }
    }

    public void OooOOO0() {
        if (C4628zt.OooOo0O) {
            ServiceParam serviceParam = new ServiceParam();
            serviceParam.setScriptRunning(true);
            C3926gu.OooO0OO(this.OooO00o, C4628zt.OooO0OO, serviceParam);
        }
    }

    public void OooOOOO() {
        C3926gu.OooO0O0(this.OooO00o, C4628zt.OooO0O0);
    }

    public void OooOOOo(InterfaceC3741bu interfaceC3741bu) {
        this.OooO0O0 = interfaceC3741bu;
    }
}
