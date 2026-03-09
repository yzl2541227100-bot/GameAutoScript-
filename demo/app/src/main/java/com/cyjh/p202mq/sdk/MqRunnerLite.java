package com.cyjh.p202mq.sdk;

import com.cyjh.mobileanjian.ipc.interfaces.OnMqScriptCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnRequestCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnScreenShotCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnScriptListener;
import com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback;
import com.cyjh.p202mq.sdk.inf.IRunner;
import com.cyjh.p202mq.sdk.inf.OnElfCallback;
import com.google.protobuf.ByteString;
import p285z2.C3836ee;
import p285z2.C3836ee.OooO0O0;
import p285z2.C3836ee.OooO0o;
import p285z2.C4209og;
import p285z2.InterfaceC4245pg;
import p285z2.InterfaceC4282qg;

/* JADX INFO: loaded from: classes2.dex */
public class MqRunnerLite implements InterfaceC4245pg, InterfaceC4282qg {
    private C4209og OooO00o;
    private C3836ee OooO0O0;
    public OnScriptListener OooO0OO;
    public OnElfCallback OooO0Oo;
    public boolean OooO0o;
    public OnRequestCallback OooO0o0;
    public OnSpecialMqCmdCallback OooO0oO;
    public OnMqScriptCallback OooO0oo;

    public static class OooO0O0 {
        private static final MqRunnerLite OooO00o = new MqRunnerLite(0);

        private OooO0O0() {
        }
    }

    private MqRunnerLite() {
        this.OooO0Oo = null;
        this.OooO0o0 = null;
        this.OooO0o = true;
        this.OooO0O0 = new C3836ee();
    }

    public /* synthetic */ MqRunnerLite(byte b) {
        this();
    }

    public static synchronized MqRunnerLite getInstance() {
        return OooO0O0.OooO00o;
    }

    @Override // p285z2.InterfaceC4319rg
    public final void OooO(ByteString byteString) {
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO00o(String str, String str2, String str3, OnElfCallback onElfCallback) {
        this.OooO0Oo = onElfCallback;
        C3836ee c3836ee = this.OooO0O0;
        try {
            c3836ee.OooO0oo.put(c3836ee.new OooO0O0(2, "", str, str2, str3, 0, 0, ""));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override // p285z2.InterfaceC4319rg
    public final void OooO0O0(ByteString byteString) {
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO0OO(int i, int i2, OnScreenShotCallback onScreenShotCallback) {
    }

    @Override // p285z2.InterfaceC4319rg
    public final void OooO0Oo(ByteString byteString) {
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO0o(int i, int i2) {
        C3836ee c3836ee = this.OooO0O0;
        try {
            c3836ee.OooO0oo.put(c3836ee.new OooO0O0(3, "", "", "", "", i, i2, ""));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO0o0(String str) {
        C3836ee c3836ee = this.OooO0O0;
        try {
            c3836ee.OooO0oo.put(c3836ee.new OooO0O0(4, "", "", "", "", 0, 0, str));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO0oO(OnSpecialMqCmdCallback onSpecialMqCmdCallback) {
        this.OooO0oO = onSpecialMqCmdCallback;
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooO0oo(String str) {
        C3836ee c3836ee = this.OooO0O0;
        try {
            if (!c3836ee.OooO0OO) {
                C3836ee.OooO0o oooO0o = c3836ee.new OooO0o("ScriptRunnerLite_Request");
                c3836ee.OooO0Oo = oooO0o;
                oooO0o.start();
            }
            c3836ee.OooO0oo.put(c3836ee.new OooO0O0(1, str, "", "", "", 0, 0, ""));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override // p285z2.InterfaceC4245pg
    public void OooOO0(OnMqScriptCallback onMqScriptCallback) {
        this.OooO0oo = onMqScriptCallback;
    }

    @Override // p285z2.InterfaceC4319rg
    /* JADX INFO: renamed from: a */
    public final void mo13090a(String str) {
    }

    @Override // p285z2.InterfaceC4282qg
    /* JADX INFO: renamed from: a */
    public final boolean mo13091a() {
        return this.OooO0o;
    }

    @Override // p285z2.InterfaceC4319rg
    /* JADX INFO: renamed from: b */
    public final OnRequestCallback mo13088b() {
        return this.OooO0o0;
    }

    @Override // p285z2.InterfaceC4319rg
    /* JADX INFO: renamed from: c */
    public final OnElfCallback mo13089c() {
        return this.OooO0Oo;
    }

    @Override // p285z2.InterfaceC4282qg
    /* JADX INFO: renamed from: d */
    public final OnScriptListener mo13092d() {
        return this.OooO0OO;
    }

    @Override // p285z2.InterfaceC4282qg
    /* JADX INFO: renamed from: e */
    public final OnSpecialMqCmdCallback mo13093e() {
        return this.OooO0oO;
    }

    @Override // p285z2.InterfaceC4282qg
    /* JADX INFO: renamed from: f */
    public final OnMqScriptCallback mo13094f() {
        return this.OooO0oo;
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public boolean isScriptStarted() {
        C3836ee c3836ee = this.OooO0O0;
        if (c3836ee == null) {
            return false;
        }
        return c3836ee.OooOOo();
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public void notifyRotationStatus() {
        this.OooO0O0.OooOOo0();
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public void pause() {
        C3836ee c3836ee = this.OooO0O0;
        if (c3836ee != null) {
            c3836ee.OooOOO().Pause();
        }
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public void resume() {
        C3836ee c3836ee = this.OooO0O0;
        if (c3836ee != null) {
            c3836ee.OooOOO().Resume();
        }
    }

    public void setImageCrop(boolean z, int i, int i2, int i3, int i4) {
        this.OooO0O0.OooOOOo().SetImageCrop(z, i, i2, i3, i4);
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public IRunner setOnScriptListener(OnScriptListener onScriptListener) {
        this.OooO0OO = onScriptListener;
        C3836ee c3836ee = this.OooO0O0;
        if (c3836ee != null && onScriptListener != null) {
            c3836ee.OooO0oO = onScriptListener;
        }
        return this;
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public IRunner setScript(C4209og c4209og) {
        this.OooO00o = c4209og;
        C3836ee c3836ee = this.OooO0O0;
        if (c3836ee != null && c4209og != null) {
            c3836ee.OooO0o0 = c4209og;
        }
        return this;
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public void start() {
        C3836ee c3836ee = this.OooO0O0;
        if (c3836ee != null) {
            if (!c3836ee.OooO00o) {
                new C3836ee.OooO0OO(c3836ee, (byte) 0).start();
                return;
            }
            OnScriptListener onScriptListener = c3836ee.OooO0oO;
            if (onScriptListener != null) {
                onScriptListener.onScriptIsRunning();
            }
        }
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public void stop() {
        C3836ee c3836ee = this.OooO0O0;
        if (c3836ee != null) {
            new StringBuilder("stop: ").append(c3836ee.getClass().getSimpleName());
            c3836ee.OooOOO().Stop();
        }
    }
}
