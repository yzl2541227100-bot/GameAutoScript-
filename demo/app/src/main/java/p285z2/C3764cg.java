package p285z2;

import android.content.Context;
import android.net.LocalSocket;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.cyjh.mobileanjian.ipc.interfaces.BasicScriptListener;
import com.cyjh.mobileanjian.ipc.interfaces.EngineStateObserver;
import com.cyjh.mobileanjian.ipc.interfaces.OnMqScriptCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnRecordScriptCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnRequestCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnRpcCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnScreenShotCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnScriptListener;
import com.cyjh.mobileanjian.ipc.interfaces.OnScriptMessageCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnUiElementCallback;
import com.cyjh.mobileanjian.ipc.interfaces.ScriptStateObserver;
import com.cyjh.mobileanjian.ipc.share.proto.Ipc;
import com.cyjh.mobileanjian.ipc.view.ExToast;
import com.cyjh.mqsdk.C2703R;
import com.cyjh.p202mq.sdk.MqRunner;
import com.cyjh.p202mq.sdk.MqRunnerLite;
import com.cyjh.p202mq.sdk.inf.OnElfCallback;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import p285z2.o00O0O0;

/* JADX INFO: renamed from: z2.cg */
/* JADX INFO: loaded from: classes2.dex */
public final class C3764cg extends C3727bg {
    private static final int OooOoOO = 4096;
    private static final int OooOoo0 = 1024;
    public boolean OooO;
    public boolean OooO0o;
    public boolean OooO0o0;
    private C3838eg OooO0oO;
    public Context OooO0oo;
    public boolean OooOO0;
    public C3690ag OooOO0O;
    public List<EngineStateObserver> OooOO0o;
    public OnRecordScriptCallback OooOOO;
    private Vector<ScriptStateObserver> OooOOO0;
    public OnScreenShotCallback OooOOOO;
    public OnScriptMessageCallback OooOOOo;
    public OnScriptListener OooOOo;
    public BasicScriptListener OooOOo0;
    public OnRequestCallback OooOOoo;
    public ArrayBlockingQueue<Ipc.IpcMessage> OooOo;
    public OnElfCallback OooOo0;
    public OnMqScriptCallback OooOo00;
    public OnUiElementCallback OooOo0O;
    public OnSpecialMqCmdCallback OooOo0o;
    public OnRpcCallback OooOoO;
    private final Thread OooOoO0;

    /* JADX INFO: renamed from: z2.cg$OooO00o */
    public class OooO00o extends Thread {
        public OooO00o(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            super.run();
            while (true) {
                C3764cg c3764cg = C3764cg.this;
                if (!c3764cg.OooO0o0) {
                    return;
                }
                try {
                    C4132me c4132me = new C4132me(c3764cg.OooOo.take());
                    C3764cg c3764cg2 = C3764cg.this;
                    int length = c4132me.OooO00o().length;
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[length + 4]);
                    byteBufferWrap.putInt(length);
                    byteBufferWrap.put(c4132me.OooO00o());
                    byteBufferWrap.flip();
                    c3764cg2.OooO0OO(byteBufferWrap);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z2.cg$OooO0O0 */
    public class OooO0O0 extends Thread {
        public OooO0O0() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Iterator<EngineStateObserver> it = C3764cg.this.OooOO0o.iterator();
            while (it.hasNext()) {
                it.next().onConnected(C3764cg.this);
            }
            if (C4614zf.OooO() != null) {
                C4614zf.OooO().onEngineStart(C3764cg.this.OooOO0O.OooO00o);
            }
            MqRunner.getInstance().notifyRotationStatus();
            MqRunnerLite.getInstance().notifyRotationStatus();
        }
    }

    /* JADX INFO: renamed from: z2.cg$OooO0OO */
    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OnScriptListener onScriptListener = C3764cg.this.OooOOo;
            if (onScriptListener != null) {
                onScriptListener.onStopScript(1002, "root进程异常终止");
            }
            ExToast.makeText(C3764cg.this.OooO0oo, C2703R.string.toast_engine_crash_then_restart, 2000).show();
        }
    }

    public C3764cg(Context context, LocalSocket localSocket) {
        super(localSocket);
        this.OooO0o0 = true;
        this.OooO0o = false;
        this.OooO0oO = null;
        this.OooO0oo = null;
        this.OooO = false;
        this.OooOO0 = false;
        this.OooOO0o = new ArrayList();
        this.OooOOO0 = new Vector<>();
        this.OooOOO = null;
        this.OooOOOO = null;
        this.OooOOOo = null;
        this.OooOOo0 = null;
        this.OooOOo = null;
        this.OooOo = new ArrayBlockingQueue<>(1024);
        this.OooOoO0 = new OooO00o("send_thread");
        this.OooOoO = null;
        this.OooO0oo = context;
        this.OooO0oO = new C3838eg(context, this);
        o00O0O0.OooO0O0.OooO00o.OooO00o().OooO00o.OooO00o(this);
    }

    private void OooO(OnRpcCallback onRpcCallback) {
        this.OooOoO = onRpcCallback;
    }

    private void OooO0o(OnMqScriptCallback onMqScriptCallback) {
        this.OooOo00 = onMqScriptCallback;
    }

    private void OooO0o0(BasicScriptListener basicScriptListener) {
        this.OooOOo0 = basicScriptListener;
    }

    private void OooO0oO(OnRecordScriptCallback onRecordScriptCallback) {
        this.OooOOO = onRecordScriptCallback;
    }

    private void OooO0oo(OnRequestCallback onRequestCallback) {
        this.OooOOoo = onRequestCallback;
    }

    private void OooOO0(OnScreenShotCallback onScreenShotCallback) {
        this.OooOOOO = onScreenShotCallback;
    }

    private void OooOO0O(OnScriptListener onScriptListener) {
        this.OooOOo = onScriptListener;
    }

    private void OooOO0o(OnScriptMessageCallback onScriptMessageCallback) {
        this.OooOOOo = onScriptMessageCallback;
    }

    private void OooOOO(OnUiElementCallback onUiElementCallback) {
        this.OooOo0O = onUiElementCallback;
    }

    private void OooOOO0(OnSpecialMqCmdCallback onSpecialMqCmdCallback) {
        this.OooOo0o = onSpecialMqCmdCallback;
    }

    private void OooOOOO(ScriptStateObserver scriptStateObserver) {
        this.OooOOO0.add(scriptStateObserver);
    }

    private void OooOOo(OnElfCallback onElfCallback) {
        this.OooOo0 = onElfCallback;
    }

    private void OooOOo0(C3690ag c3690ag) {
        this.OooOO0O = c3690ag;
    }

    private void OooOOoo(List<EngineStateObserver> list) {
        this.OooOO0o = list;
    }

    private void OooOo(boolean z) {
        this.OooO = z;
    }

    private void OooOo00(boolean z) {
        this.OooOO0 = z;
    }

    private int OooOoo() {
        byte[] bArr = new byte[4];
        if (OooO00o(bArr) < 0) {
            return -1;
        }
        return ByteBuffer.wrap(bArr).getInt();
    }

    private boolean OooOoo0() {
        return this.OooO0o;
    }

    private OnScriptMessageCallback Oooo() {
        return this.OooOOOo;
    }

    private boolean Oooo0() {
        return this.OooOO0;
    }

    private Ipc.IpcMessage Oooo000() {
        byte[] bArr = new byte[4];
        int i = OooO00o(bArr) < 0 ? -1 : ByteBuffer.wrap(bArr).getInt();
        if (i >= 0) {
            byte[] bArr2 = new byte[i];
            if (OooO00o(bArr2) >= 0) {
                try {
                    return Ipc.IpcMessage.parseFrom(bArr2);
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        OooO0O0();
        o000oOoO();
        return null;
    }

    private OnRpcCallback Oooo00O() {
        return this.OooOoO;
    }

    private C3690ag Oooo00o() {
        return this.OooOO0O;
    }

    private boolean Oooo0O0() {
        return this.OooO;
    }

    private Vector<ScriptStateObserver> Oooo0OO() {
        return this.OooOOO0;
    }

    private OnScriptListener Oooo0o() {
        return this.OooOOo;
    }

    private BasicScriptListener Oooo0o0() {
        return this.OooOOo0;
    }

    private OnRecordScriptCallback Oooo0oO() {
        return this.OooOOO;
    }

    private OnScreenShotCallback Oooo0oo() {
        return this.OooOOOO;
    }

    private OnUiElementCallback OoooO() {
        return this.OooOo0O;
    }

    private OnMqScriptCallback OoooO0() {
        return this.OooOo00;
    }

    private OnRequestCallback OoooO00() {
        return this.OooOOoo;
    }

    private OnElfCallback OoooO0O() {
        return this.OooOo0;
    }

    private void OoooOO0() {
        new OooO0O0().start();
    }

    private OnSpecialMqCmdCallback OoooOOO() {
        return this.OooOo0o;
    }

    private void o000oOoO() {
        OnScreenShotCallback onScreenShotCallback;
        C3910ge c3910ge = new C3910ge();
        c3910ge.OooO00o = MqRunner.getInstance().isScriptStarted();
        if (MqRunner.getInstance().isScriptStarted()) {
            this.OooO0oO.OooO0oO.sendEmptyMessage(10);
            if (this.OooOOo0 != null) {
                Log.d("JAVA_RUNNER", "ScriptRunnerLite WHAT_STOP root进程异常终止");
                this.OooOOo0.onStopScript(1002, "root进程异常终止");
            }
            new Handler(Looper.getMainLooper()).post(new OooO0OO());
        }
        if (this.OooO && (onScreenShotCallback = this.OooOOOO) != null) {
            this.OooO = false;
            onScreenShotCallback.onScreenShotFailed(1002);
        }
        Iterator<EngineStateObserver> it = this.OooOO0o.iterator();
        while (it.hasNext()) {
            it.next().onCrash(c3910ge);
        }
    }

    @Override // p285z2.C3727bg
    public final void OooO0O0() {
        super.OooO0O0();
        this.OooO0o0 = false;
        OooOOOo(C4132me.OooO0OO(3));
    }

    public final synchronized void OooOOOo(Ipc.IpcMessage ipcMessage) {
        this.OooOo.add(ipcMessage);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0042. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void OooOo0o() {
        /*
            Method dump skipped, instruction units count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3764cg.OooOo0o():void");
    }

    public final void OooOoO() {
        Iterator<EngineStateObserver> it = this.OooOO0o.iterator();
        while (it.hasNext()) {
            it.next().onExit();
        }
    }
}
