package com.cyjh.p202mq.sdk;

import android.widget.Toast;
import com.cyjh.mobileanjian.ipc.interfaces.OnMqScriptCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnRequestCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnScreenShotCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback;
import com.cyjh.mobileanjian.ipc.share.proto.Ipc;
import com.cyjh.mqm.MQLanguageStub;
import com.cyjh.mqsdk.C2703R;
import com.cyjh.p202mq.sdk.inf.OnElfCallback;
import p285z2.AbstractC4171ng;
import p285z2.C3764cg;
import p285z2.C3910ge;
import p285z2.C4132me;
import p285z2.C4614zf;
import p285z2.InterfaceC4245pg;

/* JADX INFO: loaded from: classes2.dex */
public class MqRunner extends AbstractC4171ng implements InterfaceC4245pg {
    private OnMqScriptCallback OooOOO;
    private OnElfCallback OooOOO0;
    private int OooOOOo;
    private int OooOOo;
    private int OooOOo0;
    private int OooOOoo;
    private OnScreenShotCallback OooOo00;
    private String OooO = "";
    private String OooOO0 = "";
    private String OooOO0O = "";
    private String OooOO0o = "";
    private boolean OooOOOO = false;

    public static class OooO00o {
        private static final MqRunner OooO00o = new MqRunner();

        private OooO00o() {
        }
    }

    public static synchronized MqRunner getInstance() {
        return OooO00o.OooO00o;
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO00o(String str, String str2, String str3, OnElfCallback onElfCallback) {
        this.OooOO0 = str;
        this.OooOO0O = str2;
        this.OooOO0o = str3;
        this.OooOOO0 = onElfCallback;
        MQLanguageStub.InitElf(C4614zf.OooO0Oo(), str, str2, str3);
        if (this.OooO0o0) {
            this.OooO00o.OooOo0 = onElfCallback;
            OooOO0o(Ipc.IpcMessage.newBuilder().setCmd(80).addArg2(str).addArg2(str2).addArg2(str3).build());
        }
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO0OO(int i, int i2, OnScreenShotCallback onScreenShotCallback) {
        C3764cg c3764cg = this.OooO00o;
        if (c3764cg == null) {
            this.OooOOo = i;
            this.OooOOoo = i2;
            this.OooOo00 = onScreenShotCallback;
        } else {
            c3764cg.OooO = true;
            c3764cg.OooOOOO = onScreenShotCallback;
            this.OooO00o.OooOOOo(Ipc.IpcMessage.newBuilder().setCmd(24).addArg1(i).build());
        }
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO0o(int i, int i2) {
        this.OooOOOo = i;
        this.OooOOo0 = i2;
        if (this.OooO0o0) {
            OooOO0o(Ipc.IpcMessage.newBuilder().setCmd(84).addArg1(i).addArg1(i2).build());
        }
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO0o0(String str) {
        OooOO0o(Ipc.IpcMessage.newBuilder().setCmd(82).addArg2(str).build());
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO0oO(OnSpecialMqCmdCallback onSpecialMqCmdCallback) {
        if (this.OooO0o0) {
            this.OooO00o.OooOo0o = onSpecialMqCmdCallback;
        }
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO0oo(String str) {
        MQLanguageStub.InitHost(str);
        if (this.OooO0o0) {
            OooOO0o(Ipc.IpcMessage.newBuilder().setCmd(83).addArg2(str).build());
        } else {
            this.OooO = str;
        }
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooOO0(OnMqScriptCallback onMqScriptCallback) {
        this.OooOOO = onMqScriptCallback;
        C3764cg c3764cg = this.OooO00o;
        if (c3764cg != null) {
            c3764cg.OooOo00 = onMqScriptCallback;
        }
    }

    @Override // p285z2.InterfaceC4319rg
    /* JADX INFO: renamed from: b */
    public final OnRequestCallback mo13088b() {
        return null;
    }

    @Override // p285z2.InterfaceC4319rg
    /* JADX INFO: renamed from: c */
    public final OnElfCallback mo13089c() {
        return null;
    }

    @Override // p285z2.AbstractC4171ng, com.cyjh.mobileanjian.ipc.interfaces.EngineStateObserver
    public void onConnected(C3764cg c3764cg) {
        super.onConnected(c3764cg);
        c3764cg.OooOo0 = this.OooOOO0;
        OooOO0(this.OooOOO);
        OooOO0o(Ipc.IpcMessage.newBuilder().setCmd(80).addArg2(this.OooOO0).addArg2(this.OooOO0O).addArg2(this.OooOO0o).build());
        OooO0o(this.OooOOOo, this.OooOOo0);
    }

    @Override // com.cyjh.mobileanjian.ipc.interfaces.EngineStateObserver
    public void onCrash(C3910ge c3910ge) {
        this.OooO0o0 = false;
        OooOO0O();
    }

    @Override // com.cyjh.mobileanjian.ipc.interfaces.EngineStateObserver
    public void onExit() {
        this.OooO0o0 = false;
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public void start() {
        if (!this.OooO0o0) {
            Toast.makeText(C4614zf.OooO0o0(), C4614zf.OooO0o0().getString(C2703R.string.toast_script_engine_failed_start), 1).show();
        } else {
            notifyRotationStatus();
            OooOO0o(C4132me.OooO0OO(1));
        }
    }
}
