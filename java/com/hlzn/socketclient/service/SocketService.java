package com.hlzn.socketclient.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.NetworkOnMainThreadException;
import android.text.TextUtils;
import com.hlzn.socketclient.bean.ServiceParam;
import com.hlzn.socketclient.pbmsg.MessageProtobuf;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.Queue;
import p285z2.C3704au;
import p285z2.C3889fu;
import p285z2.C3963hu;
import p285z2.C4000iu;
import p285z2.C4105lo;
import p285z2.C4517wt;
import p285z2.C4554xt;
import p285z2.C4591yt;
import p285z2.C4628zt;
import p285z2.InterfaceC3815du;

/* JADX INFO: loaded from: classes2.dex */
public class SocketService extends Service {
    public static final int oo0o0Oo = 1;
    private Long OoooOoO;
    private String OoooOoo;
    private String Ooooo00;
    private String Ooooo0o;
    private ServiceParam OooooO0;
    private Thread OooooOO;
    private Socket OooooOo;
    private Queue<Long> Oooooo;
    private InetSocketAddress Oooooo0;
    private Queue<Long> OoooooO;
    private Queue<Long> Ooooooo;
    private Queue<Long> o00O0O;
    private Queue<Long> o00Oo0;
    public Thread o00Ooo;
    public Thread o00o0O;
    public Thread o00ooo;
    private File o0OOO0o;
    private Queue<Long> o0OoOo0;
    private C4517wt o0ooOoO;
    private Queue<Long> ooOO;
    private static final String o0Oo0oo = SocketService.class.getSimpleName();
    public static Object o0OO00O = new Object();
    public boolean oo000o = false;
    public boolean o00oO0o = false;
    public boolean o00oO0O = false;
    public Oooo0 o0ooOO0 = new Oooo0(this);
    public boolean o0ooOOo = false;

    public class OooO implements Runnable {
        public OooO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            StringBuilder sb;
            String message;
            try {
                SocketService.this.OooooOo = new Socket();
                SocketService.this.Oooooo0 = new InetSocketAddress(C4628zt.OooOOOo, C4628zt.OooOOo0);
                SocketService.this.OooooOo.connect(SocketService.this.Oooooo0, 20000);
                SocketService.this.OooooOo.setTcpNoDelay(true);
                SocketService.this.OooooOo.setSendBufferSize(10240);
                SocketService.this.OooooOo.setKeepAlive(true);
            } catch (NetworkOnMainThreadException e) {
                e.printStackTrace();
                str = SocketService.o0Oo0oo;
                sb = new StringBuilder();
                sb.append("createConnection --> exception=");
                message = e.getMessage();
                sb.append(message);
                C3963hu.OooO0O0(str, sb.toString());
            } catch (UnknownHostException e2) {
                e2.printStackTrace();
                str = SocketService.o0Oo0oo;
                sb = new StringBuilder();
                sb.append("createConnection --> exception=");
                message = e2.getMessage();
                sb.append(message);
                C3963hu.OooO0O0(str, sb.toString());
            } catch (IOException e3) {
                e3.printStackTrace();
                str = SocketService.o0Oo0oo;
                sb = new StringBuilder();
                sb.append("createConnection --> exception=");
                message = e3.getMessage();
                sb.append(message);
                C3963hu.OooO0O0(str, sb.toString());
            }
        }
    }

    public class OooO00o extends Thread {
        public final /* synthetic */ int OoooOoO;
        public final /* synthetic */ String OoooOoo;

        public OooO00o(int i, String str) {
            this.OoooOoO = i;
            this.OoooOoo = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            if (SocketService.this.o0OoOo0.size() > 0) {
                MessageProtobuf.CmdScriptSettingsResult.Builder builderNewBuilder = MessageProtobuf.CmdScriptSettingsResult.newBuilder();
                builderNewBuilder.setRpcId(((Long) SocketService.this.o0OoOo0.poll()).longValue()).setError(this.OoooOoO).setMessage(this.OoooOoo);
                C3963hu.OooO0OO(SocketService.o0Oo0oo, "cmdScriptSettingsSuccessOperate --> rpcId =" + builderNewBuilder.getRpcId() + ",code=" + this.OoooOoO + ",msg=" + this.OoooOoo);
                C4591yt.OooO0oo().OooO0OO(SocketService.this.OooooOo, builderNewBuilder.build(), 10108);
            }
        }
    }

    public class OooO0O0 extends Thread {
        public final /* synthetic */ int OoooOoO;
        public final /* synthetic */ String OoooOoo;

        public OooO0O0(int i, String str) {
            this.OoooOoO = i;
            this.OoooOoo = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                MessageProtobuf.CmdScreenCaptureResult.Builder builderNewBuilder = MessageProtobuf.CmdScreenCaptureResult.newBuilder();
                builderNewBuilder.setRpcId(((Long) SocketService.this.ooOO.poll()).longValue()).setError(this.OoooOoO).setMessage(this.OoooOoo);
                C3963hu.OooO0OO(SocketService.o0Oo0oo, "cmdScreenCaptureSuccessOperate --> rpcId =" + builderNewBuilder.getRpcId() + ",code=" + this.OoooOoO + ",msg=" + this.OoooOoo);
                C4591yt.OooO0oo().OooO0O0(SocketService.this.OooooOo, builderNewBuilder.build(), 10110);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class OooO0OO extends Thread {
        public final /* synthetic */ int OoooOoO;
        public final /* synthetic */ String OoooOoo;

        public OooO0OO(int i, String str) {
            this.OoooOoO = i;
            this.OoooOoo = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            MessageProtobuf.CmdUnBindStudioProjectResult.Builder builderNewBuilder = MessageProtobuf.CmdUnBindStudioProjectResult.newBuilder();
            builderNewBuilder.setRpcId(((Long) SocketService.this.o00O0O.poll()).longValue()).setError(this.OoooOoO).setMessage(this.OoooOoo);
            C3963hu.OooO0OO(SocketService.o0Oo0oo, "cmdUnBindStudioProjectSuccessOperate --> rpcId =" + builderNewBuilder.getRpcId() + ",code=" + this.OoooOoO + ",msg=" + this.OoooOoo);
            C4591yt.OooO0oo().OooO0oO(SocketService.this.OooooOo, builderNewBuilder.build(), 10112);
        }
    }

    public class OooO0o extends Thread {
        public final /* synthetic */ int OoooOoO;
        public final /* synthetic */ String OoooOoo;

        public OooO0o(int i, String str) {
            this.OoooOoO = i;
            this.OoooOoo = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            MessageProtobuf.CmdRenameDeviceNameResult.Builder builderNewBuilder = MessageProtobuf.CmdRenameDeviceNameResult.newBuilder();
            builderNewBuilder.setRpcId(((Long) SocketService.this.o00Oo0.poll()).longValue()).setError(this.OoooOoO).setMessage(this.OoooOoo);
            C3963hu.OooO0OO(SocketService.o0Oo0oo, "cmdRenameDeviceNameSuccessOperate --> rpcId =" + builderNewBuilder.getRpcId() + ",code=" + this.OoooOoO + ",msg=" + this.OoooOoo);
            C4591yt.OooO0oo().OooO00o(SocketService.this.OooooOo, builderNewBuilder.build(), 10114);
        }
    }

    public class OooOO0 implements Runnable {
        public OooOO0() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:114|214|115|(1:186)(2:119|(7:121|(3:123|124|(2:126|(2:128|(2:130|(2:132|(2:134|(2:136|(2:138|(2:140|(2:206|143))(2:212|148))(2:202|153))(2:198|158))(2:200|163))(2:204|168))(2:210|173))(1:177))(2:196|179))(1:183)|190|208|191|218|217)(1:185))|184|190|208|191|218|217) */
        /* JADX WARN: Code restructure failed: missing block: B:193:0x06ea, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:194:0x06eb, code lost:
        
            r0.printStackTrace();
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 1777
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hlzn.socketclient.service.SocketService.OooOO0.run():void");
        }
    }

    public class OooOO0O implements Runnable {
        public OooOO0O() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (SocketService.this.oo000o) {
                MessageProtobuf.Heartbeat.Builder builderNewBuilder = MessageProtobuf.Heartbeat.newBuilder();
                builderNewBuilder.setRpcId(C3889fu.OooO00o()).setScriptRunning(SocketService.this.o0ooOOo);
                C4591yt.OooO0oo().OooOO0o(SocketService.this.OooooOo, builderNewBuilder.build(), 10003);
                try {
                    Thread.sleep(60000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class OooOOO extends Thread {
        public OooOOO() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            C4591yt.OooO0oo().OooOO0(SocketService.this.OooooOo, MessageProtobuf.ScriptStart.newBuilder().build(), 10005);
        }
    }

    public class OooOOO0 implements Runnable {
        public OooOOO0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageProtobuf.Login.Builder builderNewBuilder = MessageProtobuf.Login.newBuilder();
            builderNewBuilder.setRpcId(C3889fu.OooO00o()).setAppId(SocketService.this.OoooOoO.longValue()).setScriptId(SocketService.this.OoooOoo).setDeviceId(SocketService.this.Ooooo00).setIMToken(SocketService.this.Ooooo0o).setScriptRunning(SocketService.this.o0ooOOo);
            C4591yt.OooO0oo().OooOOO0(SocketService.this.OooooOo, builderNewBuilder.build(), 10001);
        }
    }

    public class OooOOOO extends Thread {
        public OooOOOO() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            C4591yt.OooO0oo().OooOO0O(SocketService.this.OooooOo, MessageProtobuf.ScriptStop.newBuilder().build(), 10006);
        }
    }

    public class OooOo extends Thread {
        public final /* synthetic */ int OoooOoO;
        public final /* synthetic */ String OoooOoo;

        public OooOo(int i, String str) {
            this.OoooOoO = i;
            this.OoooOoo = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            MessageProtobuf.CmdScriptStopResult.Builder builderNewBuilder = MessageProtobuf.CmdScriptStopResult.newBuilder();
            builderNewBuilder.setRpcId(((Long) SocketService.this.OoooooO.poll()).longValue()).setError(this.OoooOoO).setMessage(this.OoooOoo);
            C3963hu.OooO0OO(SocketService.o0Oo0oo, "cmdScriptStopSuccessOperate --> rpcId =" + builderNewBuilder.getRpcId() + ",code=" + this.OoooOoO + ",msg=" + this.OoooOoo);
            C4591yt.OooO0oo().OooO0o0(SocketService.this.OooooOo, builderNewBuilder.build(), 10104);
        }
    }

    public class OooOo00 extends Thread {
        public final /* synthetic */ int OoooOoO;
        public final /* synthetic */ String OoooOoo;

        public OooOo00(int i, String str) {
            this.OoooOoO = i;
            this.OoooOoo = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            MessageProtobuf.CmdScriptStartResult.Builder builderNewBuilder = MessageProtobuf.CmdScriptStartResult.newBuilder();
            builderNewBuilder.setRpcId(((Long) SocketService.this.Oooooo.poll()).longValue()).setError(this.OoooOoO).setMessage(this.OoooOoo);
            C3963hu.OooO0OO(SocketService.o0Oo0oo, "cmdScriptStartSuccessOperate --> rpcId =" + builderNewBuilder.getRpcId() + ",code=" + this.OoooOoO + ",msg=" + this.OoooOoo);
            C4591yt.OooO0oo().OooO0Oo(SocketService.this.OooooOo, builderNewBuilder.build(), 10102);
        }
    }

    public class Oooo0 extends Binder {
        private SocketService OooO00o;
        public InterfaceC3815du OooO0O0;

        public Oooo0(SocketService socketService) {
            this.OooO00o = socketService;
        }

        public void sendMethod(Object obj) {
            this.OooO00o.Oooo0oO(obj);
            this.OooO0O0.OooO00o(obj);
        }

        public void setOnServiceCallBack(InterfaceC3815du interfaceC3815du) {
            this.OooO0O0 = interfaceC3815du;
        }
    }

    public class Oooo000 extends Thread {
        public final /* synthetic */ int OoooOoO;
        public final /* synthetic */ String OoooOoo;

        public Oooo000(int i, String str) {
            this.OoooOoO = i;
            this.OoooOoo = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            MessageProtobuf.CmdScriptUpgradeResult.Builder builderNewBuilder = MessageProtobuf.CmdScriptUpgradeResult.newBuilder();
            builderNewBuilder.setRpcId(((Long) SocketService.this.Ooooooo.poll()).longValue()).setError(this.OoooOoO).setMessage(this.OoooOoo);
            C3963hu.OooO0OO(SocketService.o0Oo0oo, "cmdScriptUpgradeSuccessOperate --> rpcId =" + builderNewBuilder.getRpcId() + ",code=" + this.OoooOoO + ",msg=" + this.OoooOoo);
            C4591yt.OooO0oo().OooO0o(SocketService.this.OooooOo, builderNewBuilder.build(), 10106);
        }
    }

    private void OooOOoo(int i, String str) {
        if (this.o00Oo0.isEmpty()) {
            return;
        }
        new OooO0o(i, str).start();
    }

    private void OooOo(int i, String str) {
        if (this.Ooooooo.isEmpty()) {
            return;
        }
        new Oooo000(i, str).start();
    }

    private void OooOo0(int i, String str) {
        if (this.o0OoOo0.isEmpty()) {
            return;
        }
        new OooO00o(i, str).start();
    }

    private void OooOo00(int i, String str) {
        if (this.ooOO.isEmpty()) {
            return;
        }
        new OooO0O0(i, str).start();
    }

    private void OooOo0O(int i, String str) {
        if (this.Oooooo.isEmpty()) {
            return;
        }
        new OooOo00(i, str).start();
    }

    private void OooOo0o(int i, String str) {
        if (this.OoooooO.isEmpty()) {
            return;
        }
        new OooOo(i, str).start();
    }

    private void OooOoO0(int i, String str) {
        if (this.o00O0O.isEmpty()) {
            return;
        }
        new OooO0OO(i, str).start();
    }

    public static String OooOoOO(String str) {
        try {
            if (str.equals(new String(str.getBytes(C4105lo.OooO0OO), C4105lo.OooO0OO))) {
                return C4105lo.OooO0OO;
            }
        } catch (Exception unused) {
        }
        try {
            if (str.equals(new String(str.getBytes("ISO-8859-1"), "ISO-8859-1"))) {
                return "ISO-8859-1";
            }
        } catch (Exception unused2) {
        }
        try {
            if (str.equals(new String(str.getBytes("UTF-8"), "UTF-8"))) {
                return "UTF-8";
            }
        } catch (Exception unused3) {
        }
        try {
            return str.equals(new String(str.getBytes("GBK"), "GBK")) ? "GBK" : "";
        } catch (Exception unused4) {
            return "";
        }
    }

    private void OooOooO() {
        this.Oooooo = new LinkedList();
        this.OoooooO = new LinkedList();
        this.Ooooooo = new LinkedList();
        this.o0OoOo0 = new LinkedList();
        this.ooOO = new LinkedList();
        this.o00O0O = new LinkedList();
        this.o00Oo0 = new LinkedList();
        C4517wt c4517wt = this.o0ooOoO;
        if (c4517wt != null) {
            c4517wt.OooO0OO();
        }
        this.o0ooOoO = new C4517wt(this);
    }

    private void OooOooo(Intent intent) {
        ServiceParam serviceParam = (ServiceParam) intent.getParcelableExtra(C4628zt.OooOOOO);
        this.OooooO0 = serviceParam;
        if (serviceParam != null) {
            if (!TextUtils.isEmpty(serviceParam.getAppId())) {
                this.OoooOoO = Long.valueOf(Long.parseLong(this.OooooO0.getAppId()));
            }
            if (!TextUtils.isEmpty(this.OooooO0.getScriptId())) {
                this.OoooOoo = this.OooooO0.getScriptId();
            }
            if (!TextUtils.isEmpty(this.OooooO0.getDeviceId())) {
                this.Ooooo00 = this.OooooO0.getDeviceId();
            }
            if (TextUtils.isEmpty(this.OooooO0.getiMToken())) {
                return;
            }
            this.Ooooo0o = this.OooooO0.getiMToken();
        }
    }

    private void Oooo() {
        if (this.OooooOo != null) {
            C4000iu.OooO0o(C4000iu.OooO0OO(this), "stopService --> ", null, true);
            OooOooO();
            C4591yt.OooO0oo().OooOOO(this.OooooOo);
            stopSelf();
            this.OooooOo = null;
            this.o00Ooo = null;
            this.o00o0O = null;
            this.OooooOO = null;
            this.oo000o = false;
            this.o00oO0o = false;
        }
    }

    public void Oooo00o() {
        String str = o0Oo0oo;
        C3963hu.OooO0OO(str, "proxyCreateConnection --> 1 ");
        if (this.o0ooOoO != null) {
            C3963hu.OooO0OO(str, "proxyCreateConnection --> 2 ");
            this.o0ooOoO.OooO00o(String.valueOf(-1));
        }
    }

    private void Oooo0OO() {
        C3963hu.OooO0OO(o0Oo0oo, "scriptStart");
        new OooOOO().start();
    }

    private void Oooo0o0() {
        new OooOOOO().start();
    }

    private void Oooo0oo() {
        if (this.OooooOo != null) {
            C4591yt.OooO0oo().OooOOO(this.OooooOo);
        }
    }

    public void OooOoO() {
        C3963hu.OooO0OO(o0Oo0oo, "createConnection --> IP=" + C4628zt.OooOOOo + ",Port=" + C4628zt.OooOOo0);
        Thread thread = new Thread(new OooO());
        this.OooooOO = thread;
        thread.start();
    }

    public int OooOoo() {
        return 1;
    }

    public C4517wt OooOoo0() {
        return this.o0ooOoO;
    }

    public void Oooo0() {
        C3963hu.OooO0OO(o0Oo0oo, "receiveMsg --> isReceive=" + this.o00oO0o);
        Thread thread = new Thread(new OooOO0());
        this.o00o0O = thread;
        thread.start();
    }

    public boolean Oooo000() {
        Socket socket = this.OooooOo;
        return socket == null || !socket.isConnected();
    }

    public void Oooo00O() {
        C3963hu.OooO0OO(o0Oo0oo, "login --> ");
        C4000iu.OooO0o(C4000iu.OooO0OO(this), "login --> mIMToken=" + this.Ooooo0o, null, true);
        C4628zt.OooOo0 = false;
        if (TextUtils.isEmpty(this.Ooooo0o)) {
            return;
        }
        Thread thread = new Thread(new OooOOO0());
        this.o00ooo = thread;
        thread.start();
    }

    public void Oooo0O0() {
        C3963hu.OooO0OO(o0Oo0oo, "resetConnect -->");
        if (C4628zt.OooOo0) {
            return;
        }
        C4628zt.OooOo0 = true;
        C4000iu.OooO0o(C4000iu.OooO0OO(this), "resetConnect --> IMConfig.IS_RECONNECT=" + C4628zt.OooOo0, null, true);
        this.o00oO0o = false;
        Oooo0oo();
        this.o0ooOoO.OooO0OO();
        C4554xt.OooOO0().OooOO0O().OooO00o(new C3704au(-1, "重连"));
    }

    public void Oooo0o() {
        Thread thread = new Thread(new OooOO0O());
        this.o00Ooo = thread;
        thread.start();
    }

    public void Oooo0oO(Object obj) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.o0ooOO0;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        File fileOooO0OO = C4000iu.OooO0OO(this);
        if (C4000iu.OooO0Oo(fileOooO0OO)) {
            C4000iu.OooO(fileOooO0OO, "", null, false);
        }
        C3963hu.OooO0OO(o0Oo0oo, "onCreate --> ");
        OooOoO();
        Oooo0();
        this.oo000o = true;
        this.o00oO0o = true;
        this.o00oO0O = false;
        OooOooO();
        C4628zt.OooOo0O = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C3963hu.OooO0OO(o0Oo0oo, "onDestroy --> ");
        this.o0ooOoO.OooO0OO();
        if (this.OooooOo != null) {
            C4591yt.OooO0oo().OooOOO(this.OooooOo);
            stopSelf();
            this.o00Ooo = null;
            this.o00o0O = null;
            this.OooooOO = null;
            this.oo000o = false;
            this.o00oO0o = false;
        }
        C4628zt.OooOo0O = false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        C3963hu.OooO0OO(o0Oo0oo, "onStartCommand --> flags=" + i + ",startId=" + i2 + ",isScriptRunning=" + this.o0ooOOo);
        if (intent != null && !TextUtils.isEmpty(intent.getStringExtra(C4628zt.OooOOO))) {
            stringExtra = intent.getStringExtra(C4628zt.OooOOO);
            OooOooo(intent);
            stringExtra.hashCode();
            switch (stringExtra) {
                case "cmd_rename_device_name_success_operate":
                    OooOOoo(this.OooooO0.getCmdRenameDeviceNameCode(), this.OooooO0.getCmdRenameDeviceNameResult());
                    break;
                case "send_heart_operate":
                    Oooo0o();
                    break;
                case "cmd_screen_capture_success_operate":
                    OooOo00(this.OooooO0.getCmdScreenCaptureCode(), this.OooooO0.getCmdScreenCaptureResult());
                    break;
                case "script_start_operate":
                    this.o0ooOOo = this.OooooO0.isScriptRunning();
                    C3963hu.OooO0OO(stringExtra, "mIsScriptRunning:" + this.o0ooOOo);
                    Oooo0OO();
                    break;
                case "cmd_script_upgrade_success_operate":
                    OooOo(this.OooooO0.getCmdScriptUpgradeCode(), this.OooooO0.getCmdScriptUpgradeResult());
                    break;
                case "cmd_script_start_success_operate":
                    OooOo0O(this.OooooO0.getCmdScriptStartCode(), this.OooooO0.getCmdScriptStartResult());
                    break;
                case "cmd_unbind_studio_project_success_operate":
                    OooOoO0(this.OooooO0.getCmdUnBindStudioProjectCode(), this.OooooO0.getCmdUnBindStudioProjectResult());
                    break;
                case "script_stop_operate":
                    this.o0ooOOo = this.OooooO0.isScriptRunning();
                    C3963hu.OooO0OO(stringExtra, "mIsScriptRunning:" + this.o0ooOOo);
                    Oooo0o0();
                    break;
                case "cmd_script_settings_success_operate":
                    OooOo0(this.OooooO0.getCmdScriptSettingsCode(), this.OooooO0.getCmdScriptSettingsResult());
                    break;
                case "stop_service_operate":
                    Oooo();
                    break;
                case "login_operate":
                    this.o00oO0o = true;
                    Oooo00O();
                    break;
                case "shut_down_connection_operate":
                    this.o0ooOOo = this.OooooO0.isScriptRunning();
                    C3963hu.OooO0OO(stringExtra, "mIsScriptRunning:" + this.o0ooOOo);
                    if (this.OooooOo != null) {
                        C4000iu.OooO0o(C4000iu.OooO0OO(this), "SHUT_DOWN_CONNECTION_OPERATE 关闭连接操作 ---> ", null, true);
                        C4591yt.OooO0oo().OooOOO(this.OooooOo);
                        OooOooO();
                        OooOoO();
                        break;
                    }
                    break;
                case "cmd_script_stop_success_operate":
                    OooOo0o(this.OooooO0.getCmdScriptStopCode(), this.OooooO0.getCmdScriptStopResult());
                    break;
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
