package p285z2;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;
import com.cyjh.event.Injector;
import com.cyjh.mobileanjian.ipc.interfaces.BasicScriptListener;
import com.cyjh.mobileanjian.ipc.interfaces.OnKeyEventListener;
import com.cyjh.mobileanjian.ipc.interfaces.OnMqScriptCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnRecordScriptCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnRequestCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnScreenShotCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnScriptListener;
import com.cyjh.mobileanjian.ipc.interfaces.OnScriptMessageCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnUiElementCallback;
import com.cyjh.mobileanjian.ipc.p201ui.C2695j;
import com.cyjh.mobileanjian.ipc.rpc.Invocator;
import com.cyjh.mobileanjian.ipc.share.proto.Ipc;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.cyjh.mobileanjian.ipc.view.ExToast;
import com.cyjh.mqsdk.C2703R;
import com.cyjh.p202mq.sdk.inf.OnElfCallback;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.googlecode.tesseract.android.TessBaseAPI;
import com.ime.input.C3026a;
import com.ime.input.InputKb;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import p285z2.C3690ag;
import p285z2.C3764cg.OooO0O0;
import p285z2.C4317re;
import p285z2.C4354se;
import p285z2.o00O0O0;

/* JADX INFO: renamed from: z2.eg */
/* JADX INFO: loaded from: classes2.dex */
public final class C3838eg {
    private static final int OooO = 2;
    private static final int OooO0oo = 1;
    private static final int OooOO0 = 3;
    private static final int OooOO0O = 4;
    private static final int OooOO0o = 5;
    private static final int OooOOO = 6;
    private static final int OooOOO0 = 10;
    private static final int OooOOOO = 7;
    private static final int OooOOOo = 8;
    private static final int OooOOo = 16;
    private static final int OooOOo0 = 9;
    private static final int OooOOoo = 17;
    private static final int OooOo = 22;
    private static final int OooOo0 = 19;
    private static final int OooOo00 = 18;
    private static final int OooOo0O = 20;
    private static final int OooOo0o = 21;
    private static final int OooOoO = 24;
    private static final int OooOoO0 = 23;
    public Context OooO00o;
    public C3873fe OooO0O0;
    public C3764cg OooO0OO;
    public ViewOnClickListenerC4539xe OooO0Oo;
    private TessBaseAPI OooO0o0 = null;
    private boolean OooO0o = false;
    public Handler OooO0oO = new OooO00o(Looper.getMainLooper());

    /* JADX INFO: renamed from: z2.eg$OooO00o */
    public class OooO00o extends Handler {
        private ExToast OooO00o;

        /* JADX INFO: renamed from: z2.eg$OooO00o$OooO00o */
        public class C4726OooO00o implements C4317re.OooO0o {
            public C4726OooO00o() {
            }

            @Override // p285z2.C4317re.OooO0o
            /* JADX INFO: renamed from: a */
            public final void mo13085a(int i) {
                C3838eg.this.OooO0OO.OooOOOo(Ipc.IpcMessage.newBuilder().setCmd(66).addArg1(i).build());
            }
        }

        /* JADX INFO: renamed from: z2.eg$OooO00o$OooO0O0 */
        public class OooO0O0 implements C4354se.OooO0O0 {
            public OooO0O0() {
            }

            @Override // p285z2.C4354se.OooO0O0
            /* JADX INFO: renamed from: a */
            public final void mo13086a(String str) {
                C3838eg.this.OooO0OO.OooOOOo(Ipc.IpcMessage.newBuilder().setCmd(67).addArg2(str).build());
            }
        }

        public OooO00o(Looper looper) {
            super(looper);
            this.OooO00o = null;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            switch (i) {
                case 1:
                    if (this.OooO00o == null) {
                        this.OooO00o = new ExToast(C3838eg.this.OooO00o);
                    }
                    Ipc.IpcMessage ipcMessage = (Ipc.IpcMessage) message.obj;
                    this.OooO00o.show(ipcMessage.getArg2(0), ipcMessage.getArg1(0), ipcMessage.getArg1(1), ipcMessage.getArg1(2));
                    break;
                case 2:
                    BasicScriptListener basicScriptListener = C3838eg.this.OooO0OO.OooOOo0;
                    if (basicScriptListener != null) {
                        basicScriptListener.onStartScript();
                    }
                    OnScriptListener onScriptListener = C3838eg.this.OooO0OO.OooOOo;
                    if (onScriptListener != null) {
                        onScriptListener.onStartScript();
                    }
                    break;
                case 3:
                    Log.d("JAVA_RUNNER", "ScriptRunnerLite WHAT_STOP SCRIPT_STOPPED");
                    ViewOnClickListenerC4539xe viewOnClickListenerC4539xe = C3838eg.this.OooO0Oo;
                    viewOnClickListenerC4539xe.Oooooo.clear();
                    viewOnClickListenerC4539xe.OoooooO.clear();
                    viewOnClickListenerC4539xe.Ooooooo.clear();
                    viewOnClickListenerC4539xe.OooO00o();
                    viewOnClickListenerC4539xe.OoooOoo = 0;
                    viewOnClickListenerC4539xe.ooOO = 1;
                    for (int i2 = 0; i2 < 32; i2++) {
                        viewOnClickListenerC4539xe.OoooOoO[i2] = null;
                        HashMap[] mapArr = viewOnClickListenerC4539xe.OooooOO;
                        if (mapArr[i2] != null) {
                            mapArr[i2].clear();
                        }
                    }
                    viewOnClickListenerC4539xe.OooooOo = new C2695j[32];
                    viewOnClickListenerC4539xe.Oooooo0 = 0;
                    ExToast exToast = this.OooO00o;
                    if (exToast != null) {
                        exToast.hide();
                    }
                    if (C3838eg.this.OooO0OO.OooOOo0 != null) {
                        Log.d("JAVA_RUNNER", "ScriptRunnerLite WHAT_STOP mConnection.getBasicScriptListener()");
                        C3838eg.this.OooO0OO.OooOOo0.onStopScript(message.arg1, (String) message.obj);
                    }
                    if (C3838eg.this.OooO0OO.OooOOo != null) {
                        Log.d("JAVA_RUNNER", "ScriptRunnerLite WHAT_STOP mConnection.getOnScriptListener() != null");
                        C3838eg.this.OooO0OO.OooOOo.onStopScript(message.arg1, (String) message.obj);
                    }
                    break;
                case 4:
                    BasicScriptListener basicScriptListener2 = C3838eg.this.OooO0OO.OooOOo0;
                    if (basicScriptListener2 != null) {
                        basicScriptListener2.onScriptIsRunning();
                    }
                    OnScriptListener onScriptListener2 = C3838eg.this.OooO0OO.OooOOo;
                    if (onScriptListener2 != null) {
                        onScriptListener2.onScriptIsRunning();
                    }
                    break;
                case 5:
                    Object obj = message.obj;
                    if (obj == null) {
                        Toast.makeText(C3838eg.this.OooO00o, message.arg1, 0).show();
                    } else {
                        Toast.makeText(C3838eg.this.OooO00o, (CharSequence) obj, 0).show();
                    }
                    break;
                case 6:
                    Ipc.IpcMessage ipcMessage2 = (Ipc.IpcMessage) message.obj;
                    String arg2 = ipcMessage2.getArg2(0);
                    int arg1 = ipcMessage2.getArg1(0);
                    ipcMessage2.getArg1(0);
                    ipcMessage2.getArg1(0);
                    new C4317re(C3838eg.this.OooO00o, arg2, arg1, new C4726OooO00o()).OooO00o();
                    break;
                case 7:
                    Ipc.IpcMessage ipcMessage3 = (Ipc.IpcMessage) message.obj;
                    String arg22 = ipcMessage3.getArg2(0);
                    ipcMessage3.getArg1(0);
                    ipcMessage3.getArg1(0);
                    new C4354se(C3838eg.this.OooO00o, arg22, new OooO0O0()).OooO0O0();
                    break;
                case 8:
                    BasicScriptListener basicScriptListener3 = C3838eg.this.OooO0OO.OooOOo0;
                    if (basicScriptListener3 != null) {
                        basicScriptListener3.onPause();
                    }
                    OnScriptListener onScriptListener3 = C3838eg.this.OooO0OO.OooOOo;
                    if (onScriptListener3 != null) {
                        onScriptListener3.onPause();
                    }
                    break;
                case 9:
                    BasicScriptListener basicScriptListener4 = C3838eg.this.OooO0OO.OooOOo0;
                    if (basicScriptListener4 != null) {
                        basicScriptListener4.onResume();
                    }
                    OnScriptListener onScriptListener4 = C3838eg.this.OooO0OO.OooOOo;
                    if (onScriptListener4 != null) {
                        onScriptListener4.onResume();
                    }
                    break;
                case 10:
                    ExToast exToast2 = this.OooO00o;
                    if (exToast2 != null) {
                        exToast2.hide();
                    }
                    break;
                default:
                    switch (i) {
                        case 16:
                            OnScriptListener onScriptListener5 = C3838eg.this.OooO0OO.OooOOo;
                            if (onScriptListener5 != null) {
                                onScriptListener5.onUpdateControlBarPos(message.arg1 / 100.0f, message.arg2, ((Integer) message.obj).intValue());
                            }
                            break;
                        case 17:
                            OnKeyEventListener onKeyEventListenerOooO0oO = C4614zf.OooO0oO();
                            if (onKeyEventListenerOooO0oO != null) {
                                onKeyEventListenerOooO0oO.onKeyEvent(message.arg1);
                            }
                            break;
                        case 18:
                            try {
                                UiMessage.CommandToUi from = UiMessage.CommandToUi.parseFrom((ByteString) message.obj);
                                if (from != null) {
                                    C3838eg.this.OooO0Oo.OooO0OO(from);
                                }
                            } catch (InvalidProtocolBufferException e) {
                                e.printStackTrace();
                                return;
                            }
                            break;
                        case 19:
                            OnRequestCallback onRequestCallback = C3838eg.this.OooO0OO.OooOOoo;
                            if (onRequestCallback != null) {
                                onRequestCallback.onCallback(message.arg1, (String) message.obj);
                            }
                            break;
                        case 20:
                            OnMqScriptCallback onMqScriptCallback = C3838eg.this.OooO0OO.OooOo00;
                            if (onMqScriptCallback != null) {
                                onMqScriptCallback.callback((String) message.obj);
                            }
                            break;
                        case 21:
                            OnElfCallback onElfCallback = C3838eg.this.OooO0OO.OooOo0;
                            if (onElfCallback != null) {
                                onElfCallback.callback(message.arg1, (String) message.obj);
                            }
                            break;
                        case 22:
                            OnSpecialMqCmdCallback onSpecialMqCmdCallback = C3838eg.this.OooO0OO.OooOo0o;
                            if (onSpecialMqCmdCallback != null) {
                                onSpecialMqCmdCallback.doSpecialFuction(message.arg1, (String) message.obj);
                            }
                            break;
                        case 23:
                            C4503wf c4503wf = new C4503wf(C3838eg.this.OooO00o);
                            Ipc.IpcMessage ipcMessage4 = (Ipc.IpcMessage) message.obj;
                            c4503wf.OooO0O0(ipcMessage4.getArg1(0), ipcMessage4.getArg1(1), ipcMessage4.getArg2(0));
                            break;
                        case 24:
                            OnScriptListener onScriptListener6 = C3838eg.this.OooO0OO.OooOOo;
                            if (onScriptListener6 != null) {
                                onScriptListener6.onSetControlBarVisiable(message.arg1);
                            }
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: z2.eg$OooO0O0 */
    public static /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] OooO00o;

        static {
            int[] iArr = new int[Ipc.FundType.values().length];
            OooO00o = iArr;
            try {
                iArr[Ipc.FundType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO00o[Ipc.FundType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OooO00o[Ipc.FundType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OooO00o[Ipc.FundType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OooO00o[Ipc.FundType.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OooO00o[Ipc.FundType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C3838eg(Context context, C3764cg c3764cg) {
        this.OooO0OO = null;
        this.OooO00o = context;
        this.OooO0Oo = new ViewOnClickListenerC4539xe(context);
        this.OooO0O0 = new C3873fe(this.OooO00o);
        this.OooO0OO = c3764cg;
        WindowManager windowManager = (WindowManager) this.OooO00o.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.densityDpi;
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        String strOooOO0o = this.OooO0O0.OooOO0o();
        String strOooO = this.OooO0O0.OooO();
        String strOooO0o0 = this.OooO0O0.OooO0o0();
        String str = this.OooO00o.getPackageName() + "/" + InputKb.class.getName();
        C3026a.m13734a().f16625b = strOooO0o0;
        C3026a.m13734a().f16626c = str;
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        String str2 = UUID.randomUUID().toString() + ".tmp";
        strOooOO0o = strOooOO0o == null ? "UNKNOW" : strOooOO0o;
        strOooO = strOooO == null ? "UNKNOW" : strOooO;
        File file = new File(absolutePath, str2);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Ipc.IpcMessage.Builder cmd = Ipc.IpcMessage.newBuilder().setCmd(14);
        cmd.addArg1(i).addArg1(i2).addArg1(i3).addArg2(strOooOO0o).addArg2(strOooO).addArg2(strOooO0o0).addArg2(str).addArg2(str2).addArg2(absolutePath).addArg2(this.OooO00o.getPackageName());
        this.OooO0OO.OooOOOo(cmd.build());
    }

    private boolean OooO() {
        File file = new File(this.OooO00o.getFilesDir().getAbsolutePath() + "/tessdata/", InterfaceC4047k3.o0000O0O);
        File file2 = new File(this.OooO00o.getFilesDir().getAbsolutePath() + "/tessdata/", InterfaceC4047k3.o0000O0);
        boolean z = false;
        if (!file.exists() || !file2.exists()) {
            File file3 = new File(C4614zf.OooOO0O + "/tessdata/", InterfaceC4047k3.o0000O0O);
            File file4 = new File(C4614zf.OooOO0O + "/tessdata/", InterfaceC4047k3.o0000O0);
            if (!file3.exists() || !file4.exists()) {
                return false;
            }
            z = true;
        }
        this.OooO0o0 = new TessBaseAPI();
        boolean zOooOOO = this.OooO0o0.OooOOO(z ? C4614zf.OooOO0O : this.OooO00o.getFilesDir().getAbsolutePath(), "chi_sim+eng");
        Log.d("MqmHandler", "initTessBass: init ret=".concat(String.valueOf(zOooOOO)));
        return zOooOOO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    private void OooO0Oo(Ipc.IpcMessage ipcMessage) throws Throwable {
        int i = Build.VERSION.SDK_INT;
        if (ipcMessage == null) {
        }
        new StringBuilder("handMessage msg.getCmd() -> ").append(ipcMessage.getCmd());
        OnRecordScriptCallback onRecordScriptCallback = this.OooO0OO.OooOOO;
        int cmd = ipcMessage.getCmd();
        if (cmd == 4) {
            this.OooO0OO.OooOO0 = true;
            OooO0OO(C2703R.string.toast_on_start_script);
            this.OooO0oO.sendEmptyMessage(2);
            return;
        }
        if (cmd == 5) {
            this.OooO0oO.sendEmptyMessage(4);
            return;
        }
        if (cmd == 6) {
            this.OooO0O0.OooO00o();
            C3873fe.OooOOo();
            int arg1 = ipcMessage.getArg1(0);
            this.OooO0OO.OooOO0 = false;
            if (arg1 == 105 || arg1 == 0) {
                OooO0OO(C2703R.string.toast_on_stop_script);
            }
            this.OooO0oO.obtainMessage(3, arg1, 0, ipcMessage.getArg2(0)).sendToTarget();
            return;
        }
        if (cmd == 27) {
            OnUiElementCallback onUiElementCallback = this.OooO0OO.OooOo0O;
            if (onUiElementCallback != null) {
                onUiElementCallback.onUiElementback(ipcMessage.getArg2(0));
                return;
            }
            return;
        }
        if (cmd == 28) {
            String strValueOf = String.valueOf((ipcMessage.getArg1(0) << 16) | ipcMessage.getArg1(1));
            OnUiElementCallback onUiElementCallback2 = this.OooO0OO.OooOo0O;
            if (onUiElementCallback2 != null) {
                onUiElementCallback2.onScreenShotDone(strValueOf, ipcMessage.getFileData());
                return;
            }
            return;
        }
        if (cmd == 66) {
            this.OooO0oO.obtainMessage(6, ipcMessage).sendToTarget();
            return;
        }
        if (cmd == 67) {
            this.OooO0oO.obtainMessage(7, ipcMessage).sendToTarget();
            return;
        }
        switch (cmd) {
            case 14:
                C3690ag.OooO0O0 oooO0O0 = new C3690ag.OooO0O0();
                oooO0O0.OooO00o = ipcMessage.getArg1(0);
                oooO0O0.OooO0O0 = ipcMessage.getArg1(1);
                oooO0O0.OooO0OO = ipcMessage.getArg1(2) != 0;
                C3690ag c3690ag = new C3690ag(oooO0O0, (byte) 0);
                C3764cg c3764cg = this.OooO0OO;
                c3764cg.OooOO0O = c3690ag;
                c3764cg.new OooO0O0().start();
                break;
            case 19:
                if (onRecordScriptCallback != null) {
                    onRecordScriptCallback.onOpenRecord();
                }
                break;
            case 21:
                int arg12 = ipcMessage.getArg1(0);
                if (onRecordScriptCallback != null) {
                    onRecordScriptCallback.onStartRecord(arg12);
                }
                break;
            case 23:
                String arg2 = ipcMessage.getArg2(0);
                if (onRecordScriptCallback != null) {
                    onRecordScriptCallback.onFinishRecord(arg2);
                }
                break;
            case 25:
                int arg13 = ipcMessage.getArg1(0);
                int arg14 = ipcMessage.getArg1(1);
                int arg15 = ipcMessage.getArg1(2);
                String strValueOf2 = String.valueOf((arg13 << 16) | arg14);
                C3764cg c3764cg2 = this.OooO0OO;
                OnScreenShotCallback onScreenShotCallback = c3764cg2.OooOOOO;
                if (arg15 == 0) {
                    c3764cg2.OooO = false;
                }
                if (onScreenShotCallback != null) {
                    onScreenShotCallback.onScreenShotDone(strValueOf2, ipcMessage.getFileData());
                }
                break;
            case 48:
                StringBuilder sb = new StringBuilder("RPC_UPWARD  msg.getPkgName() = ");
                sb.append(ipcMessage.getPkgName());
                sb.append(" msg.getMethodName() = ");
                sb.append(ipcMessage.getMethodName());
                sb.append(" msg.getTypesList() = ");
                sb.append(ipcMessage.getTypesList());
                sb.append(" msg.getParamsList() = ");
                sb.append(ipcMessage.getParamsList());
                Object objInvoke = Invocator.invoke(ipcMessage.getPkgName(), ipcMessage.getClassName(), ipcMessage.getMethodName(), ipcMessage.getTypesList(), ipcMessage.getParamsList(), 0);
                new StringBuilder("retObj = ").append(objInvoke);
                if (ipcMessage.getIsSyncCall()) {
                    Ipc.FundType type = ipcMessage.getRetValue().getType();
                    Ipc.ReturnValue.Builder type2 = Ipc.ReturnValue.newBuilder().setType(type);
                    Ipc.IpcMessage.Builder waitId = Ipc.IpcMessage.newBuilder().setCmd(ipcMessage.getCmd()).setIsSyncCall(true).setWaitId(ipcMessage.getWaitId());
                    try {
                        switch (OooO0O0.OooO00o[type.ordinal()]) {
                            case 1:
                                type2.setValBoolean(((Boolean) objInvoke).booleanValue());
                                break;
                            case 2:
                                type2.setValInt(((Integer) objInvoke).intValue());
                                break;
                            case 3:
                                type2.setValLong(((Long) objInvoke).longValue());
                                break;
                            case 4:
                                type2.setValFloat(((Float) objInvoke).floatValue());
                                break;
                            case 5:
                                type2.setValDouble(((Double) objInvoke).doubleValue());
                                break;
                            case 6:
                                type2.setValString(objInvoke == null ? "" : (String) objInvoke);
                                break;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (type != Ipc.FundType.VOID) {
                        waitId.setRetValue(type2.build());
                    }
                    Ipc.IpcMessage ipcMessageBuild = null;
                    try {
                        ipcMessageBuild = waitId.build();
                    } catch (UninitializedMessageException e) {
                        e.printStackTrace();
                    }
                    if (ipcMessageBuild != null) {
                        this.OooO0OO.OooOOOo(ipcMessageBuild);
                    }
                }
                break;
            case 64:
                this.OooO0oO.obtainMessage(18, ipcMessage.getFileData()).sendToTarget();
                break;
            case 81:
                this.OooO0oO.obtainMessage(21, ipcMessage.getArg1(0), 0, ipcMessage.getArg2(0)).sendToTarget();
                break;
            case 96:
                this.OooO0oO.obtainMessage(19, ipcMessage.getArg1(0), 0, ipcMessage.getArg2(0)).sendToTarget();
                break;
            case 129:
                this.OooO0oO.obtainMessage(17, ipcMessage.getArg1(0), 0).sendToTarget();
                break;
            case 257:
                OnScriptMessageCallback onScriptMessageCallback = this.OooO0OO.OooOOOo;
                if (onScriptMessageCallback != null) {
                    onScriptMessageCallback.onDebugMessage(ipcMessage.getFileData());
                }
                break;
            case 288:
                o00O0O0 o00o0o0 = o00O0O0.OooO0O0.OooO00o;
                if (o00o0o0.OooO0OO == null) {
                    o00o0o0.OooO0OO = new o00O0OO0();
                }
                o00O0OO0 o00o0oo0 = o00o0o0.OooO0OO;
                Context applicationContext = C4614zf.OooO0Oo().getApplicationContext();
                o00O0OOO o00o0ooo = o00o0oo0.OooO00o;
                if (o00o0ooo != null) {
                    o00O0O0.OooO0O0.OooO00o.OooO00o().OooO00o(Ipc.IpcMessage.newBuilder().setCmd(288).addArg2(o00OO.OooO00o(o00o0ooo.mo17051a(applicationContext))).build());
                }
                break;
            case 65535:
                this.OooO0OO.OooOoO();
                break;
            default:
                switch (cmd) {
                    case 32:
                        OnScriptMessageCallback onScriptMessageCallback2 = this.OooO0OO.OooOOOo;
                        if (onScriptMessageCallback2 != null) {
                            onScriptMessageCallback2.onTracePrint(ipcMessage.getArg2(0));
                        }
                        break;
                    case 33:
                        this.OooO0oO.obtainMessage(1, ipcMessage).sendToTarget();
                        break;
                    case 34:
                        this.OooO0O0.OooO0O0(ipcMessage.getArg1(0));
                        break;
                    case 35:
                        C3873fe.OooOOO(ipcMessage.getArg2(0));
                        break;
                    case 36:
                        this.OooO0O0.OooO0Oo(ipcMessage.getArg2(0));
                        break;
                    case 37:
                        this.OooO0O0.OooO0o(ipcMessage.getArg1(0));
                        break;
                    case 38:
                        this.OooO0O0.OooOO0O(ipcMessage.getArg2(0));
                        this.OooO0OO.OooOOOo(C4132me.OooO0OO(38));
                        break;
                    case 39:
                        this.OooO0O0.OooO0oo(ipcMessage.getArg2(0));
                        break;
                    case 40:
                        this.OooO0oO.obtainMessage(16, (int) (ipcMessage.getArg3(0) * 100.0f), ipcMessage.getArg1(0), Integer.valueOf(ipcMessage.getArg1(1))).sendToTarget();
                        break;
                    case 41:
                        this.OooO0O0.OooOOOo();
                        break;
                    case 42:
                        this.OooO0oO.sendEmptyMessage(8);
                        break;
                    case 43:
                        this.OooO0oO.sendEmptyMessage(9);
                        break;
                    case 44:
                        this.OooO0oO.obtainMessage(24, Integer.valueOf(ipcMessage.getArg1(0))).sendToTarget();
                        break;
                    default:
                        switch (cmd) {
                            case 50:
                                this.OooO0OO.OooOoO.onRpcReturn(ipcMessage.getArg2(0));
                                break;
                            case 51:
                                C3873fe.OooOOo();
                                break;
                            case 52:
                                C3985if.OooO0o0(this.OooO00o, ipcMessage.getArg2(0), ipcMessage.getArg2(1), ipcMessage.getArg2(2));
                                break;
                            case 53:
                                C3985if.OooO0O0(this.OooO00o, ipcMessage.getArg2(0));
                                break;
                            case 54:
                                C3985if.OooO00o(this.OooO00o);
                                break;
                            case 55:
                                this.OooO0O0.OooOo00();
                                break;
                            case 56:
                                this.OooO0O0.OooOo0();
                                break;
                            case 57:
                                this.OooO0O0.OooOO0(ipcMessage.getArg1(0));
                                break;
                            case 58:
                                this.OooO0O0.OooOOO0(ipcMessage.getArg1(0));
                                break;
                            case 59:
                                this.OooO0O0.OooOOo0(ipcMessage.getArg1(0));
                                break;
                            default:
                                switch (cmd) {
                                    case 98:
                                        this.OooO0oO.obtainMessage(20, ipcMessage.getArg2(0)).sendToTarget();
                                        break;
                                    case 99:
                                        this.OooO0oO.obtainMessage(22, ipcMessage.getArg1(0), 0, ipcMessage.getArg2(0)).sendToTarget();
                                        break;
                                    case 100:
                                        OooO0o(ipcMessage.getArg2(0), ipcMessage.getArg2(1));
                                        break;
                                    case 101:
                                        String arg22 = ipcMessage.getArg2(0);
                                        ipcMessage.getArg2(1);
                                        File file = new File(arg22);
                                        ContentResolver contentResolver = this.OooO00o.getContentResolver();
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("title", file.getName());
                                        contentValues.put("_display_name", file.getName());
                                        contentValues.put("mime_type", "video/3gp");
                                        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                                        contentValues.put("date_modified", Long.valueOf(System.currentTimeMillis()));
                                        contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
                                        contentValues.put("_data", file.getAbsolutePath());
                                        contentValues.put("_size", Long.valueOf(file.length()));
                                        this.OooO00o.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues)));
                                        break;
                                    case 102:
                                        String[] strArr = {ipcMessage.getArg2(0) + "%"};
                                        this.OooO00o.getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_data LIKE ?", strArr);
                                        this.OooO00o.getContentResolver().delete(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, "_data LIKE ?", strArr);
                                        break;
                                    case 103:
                                        ((WifiManager) this.OooO00o.getSystemService("wifi")).setWifiEnabled(ipcMessage.getArg1(0) == 1);
                                        break;
                                    case 104:
                                        Settings.System.putInt(this.OooO0O0.OooO00o.getContentResolver(), "accelerometer_rotation", (ipcMessage.getArg1(0) == 1 ? 1 : 0) ^ 1);
                                        break;
                                    case 105:
                                        ?? r5 = ipcMessage.getArg1(0) != 1 ? 0 : 1;
                                        C3873fe c3873fe = this.OooO0O0;
                                        Settings.System.putInt(c3873fe.OooO00o.getContentResolver(), "airplane_mode_on", r5);
                                        Intent intent = new Intent("android.intent.action.AIRPLANE_MODE");
                                        intent.putExtra("state", (boolean) r5);
                                        c3873fe.OooO00o.sendBroadcast(intent);
                                        break;
                                    case 106:
                                        this.OooO0OO.OooOOOo(Ipc.IpcMessage.newBuilder().setCmd(106).addArg2(this.OooO0O0.OooOo0O()).build());
                                        break;
                                    case 107:
                                        this.OooO0OO.OooOOOo(Ipc.IpcMessage.newBuilder().setCmd(107).addArg2(this.OooO0O0.OooOOOO(ipcMessage.getArg2(0))).build());
                                        break;
                                    case 108:
                                        this.OooO0OO.OooOOOo(Ipc.IpcMessage.newBuilder().setCmd(108).addArg2(this.OooO0O0.OooOo0o()).build());
                                        break;
                                    case 109:
                                        String strOooO0O0 = OooO0O0(ipcMessage.getArg2Bytes(0), ipcMessage.getArg1(0), ipcMessage.getArg1(1), ipcMessage.getArg1(2));
                                        Log.e("GET_OCR_TEXT", "strOrcText:".concat(String.valueOf(strOooO0O0)));
                                        this.OooO0OO.OooOOOo(Ipc.IpcMessage.newBuilder().setCmd(109).addArg2(strOooO0O0).build());
                                        break;
                                    case 110:
                                        this.OooO0oO.obtainMessage(23, ipcMessage).sendToTarget();
                                        break;
                                    case 111:
                                        ipcMessage.getArg1(0);
                                        this.OooO0O0.OooOo();
                                        break;
                                    case 112:
                                        OooO0oO(ipcMessage.getArg2(0), ipcMessage.getArg2(1), ipcMessage.getArg1(0));
                                        break;
                                    case 113:
                                        if (ipcMessage.getArg1(0) == 1) {
                                            C3986ig.OooO0O0(this.OooO00o);
                                        }
                                        break;
                                    default:
                                        switch (cmd) {
                                            case C4095le.o00000oo /* 272 */:
                                                Injector.KeyPressAB(ipcMessage.getArg1(0));
                                                break;
                                            case 273:
                                                Injector.dispatchGestureMoveAB(ipcMessage.getArg2(0));
                                                break;
                                            case C4095le.o0000oo /* 275 */:
                                                if (i >= 24) {
                                                    Injector.SwipeAB(ipcMessage.getArg3(0), ipcMessage.getArg3(1), ipcMessage.getArg3(2), ipcMessage.getArg3(3), ipcMessage.getArg1(0));
                                                }
                                                break;
                                            case C4095le.o0000oO /* 276 */:
                                                if (i >= 24) {
                                                    Injector.TapAB(ipcMessage.getArg3(0), ipcMessage.getArg3(1), ipcMessage.getArg1(0));
                                                }
                                                break;
                                        }
                                        Injector.sendTextAB(ipcMessage.getArg2(0));
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    private void OooO0o0(String str) {
        this.OooO0oO.obtainMessage(5, str).sendToTarget();
    }

    public static void OooO0oO(String str, String str2, int i) {
        C3772co c3772coOooO0O0;
        C4553xs c4553xs = new C4553xs();
        HashMap map = new HashMap();
        map.put(EncodeHintType.CHARACTER_SET, "utf-8");
        map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        map.put(EncodeHintType.MARGIN, 2);
        try {
            c3772coOooO0O0 = c4553xs.OooO0O0(str2, BarcodeFormat.QR_CODE, i, i, map);
        } catch (WriterException e) {
            e.printStackTrace();
            c3772coOooO0O0 = null;
        }
        int[] iArr = new int[i * i];
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (c3772coOooO0O0.OooO0o0(i2, i3)) {
                    iArr[(i2 * i) + i3] = -16777216;
                } else {
                    iArr[(i2 * i) + i3] = -1;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i, i, Bitmap.Config.RGB_565);
        if (bitmapCreateBitmap == null) {
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapCreateBitmap.compress(str.endsWith(".png") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("RootIpcDex", "ImageQREnCode IOException" + e2.toString());
        }
    }

    private void OooO0oo(boolean z) {
        ((WifiManager) this.OooO00o.getSystemService("wifi")).setWifiEnabled(z);
    }

    private void OooOO0O() {
        this.OooO0OO.OooOO0 = true;
        OooO0OO(C2703R.string.toast_on_start_script);
        this.OooO0oO.sendEmptyMessage(2);
    }

    private void OooOO0o(int i) {
        if (i == 1) {
            C3986ig.OooO0O0(this.OooO00o);
        }
    }

    private void OooOOO(String str) {
        File file = new File(str);
        ContentResolver contentResolver = this.OooO00o.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", file.getName());
        contentValues.put("_display_name", file.getName());
        contentValues.put("mime_type", "video/3gp");
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("date_modified", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("_data", file.getAbsolutePath());
        contentValues.put("_size", Long.valueOf(file.length()));
        this.OooO00o.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues)));
    }

    private void OooOOO0(Ipc.IpcMessage ipcMessage) {
        C3690ag.OooO0O0 oooO0O0 = new C3690ag.OooO0O0();
        oooO0O0.OooO00o = ipcMessage.getArg1(0);
        oooO0O0.OooO0O0 = ipcMessage.getArg1(1);
        oooO0O0.OooO0OO = ipcMessage.getArg1(2) != 0;
        this.OooO0OO.OooOO0O = new C3690ag(oooO0O0, (byte) 0);
    }

    private void OooOOOo() {
        this.OooO0oO.sendEmptyMessage(8);
    }

    private void OooOOo(String str) {
        String[] strArr = {str + "%"};
        this.OooO00o.getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_data LIKE ?", strArr);
        this.OooO00o.getContentResolver().delete(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, "_data LIKE ?", strArr);
    }

    private void OooOOo0(Ipc.IpcMessage ipcMessage) {
        this.OooO0O0.OooO00o();
        C3873fe.OooOOo();
        int arg1 = ipcMessage.getArg1(0);
        this.OooO0OO.OooOO0 = false;
        if (arg1 == 105 || arg1 == 0) {
            OooO0OO(C2703R.string.toast_on_stop_script);
        }
        this.OooO0oO.obtainMessage(3, arg1, 0, ipcMessage.getArg2(0)).sendToTarget();
    }

    private void OooOOoo() {
        this.OooO0oO.sendEmptyMessage(9);
    }

    private void OooOo(Ipc.IpcMessage ipcMessage) {
        int arg1 = ipcMessage.getArg1(0);
        int arg12 = ipcMessage.getArg1(1);
        int arg13 = ipcMessage.getArg1(2);
        String strValueOf = String.valueOf((arg1 << 16) | arg12);
        C3764cg c3764cg = this.OooO0OO;
        OnScreenShotCallback onScreenShotCallback = c3764cg.OooOOOO;
        if (arg13 == 0) {
            c3764cg.OooO = false;
        }
        if (onScreenShotCallback != null) {
            onScreenShotCallback.onScreenShotDone(strValueOf, ipcMessage.getFileData());
        }
    }

    private void OooOo0() {
        WindowManager windowManager = (WindowManager) this.OooO00o.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.densityDpi;
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        String strOooOO0o = this.OooO0O0.OooOO0o();
        String strOooO = this.OooO0O0.OooO();
        String strOooO0o0 = this.OooO0O0.OooO0o0();
        String str = this.OooO00o.getPackageName() + "/" + InputKb.class.getName();
        C3026a.m13734a().f16625b = strOooO0o0;
        C3026a.m13734a().f16626c = str;
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        String str2 = UUID.randomUUID().toString() + ".tmp";
        if (strOooOO0o == null) {
            strOooOO0o = "UNKNOW";
        }
        if (strOooO == null) {
            strOooO = "UNKNOW";
        }
        File file = new File(absolutePath, str2);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Ipc.IpcMessage.Builder cmd = Ipc.IpcMessage.newBuilder().setCmd(14);
        cmd.addArg1(i).addArg1(i2).addArg1(i3).addArg2(strOooOO0o).addArg2(strOooO).addArg2(strOooO0o0).addArg2(str).addArg2(str2).addArg2(absolutePath).addArg2(this.OooO00o.getPackageName());
        this.OooO0OO.OooOOOo(cmd.build());
    }

    private void OooOo00(Ipc.IpcMessage ipcMessage) {
        OnScriptMessageCallback onScriptMessageCallback = this.OooO0OO.OooOOOo;
        if (onScriptMessageCallback != null) {
            onScriptMessageCallback.onTracePrint(ipcMessage.getArg2(0));
        }
    }

    private void OooOo0O(Ipc.IpcMessage ipcMessage) {
        OnScriptMessageCallback onScriptMessageCallback = this.OooO0OO.OooOOOo;
        if (onScriptMessageCallback != null) {
            onScriptMessageCallback.onDebugMessage(ipcMessage.getFileData());
        }
    }

    private void OooOo0o() {
        this.OooO0oO.sendEmptyMessage(10);
    }

    private void OooOoO(Ipc.IpcMessage ipcMessage) {
        OnUiElementCallback onUiElementCallback = this.OooO0OO.OooOo0O;
        if (onUiElementCallback != null) {
            onUiElementCallback.onUiElementback(ipcMessage.getArg2(0));
        }
    }

    private void OooOoO0(Ipc.IpcMessage ipcMessage) {
        String strValueOf = String.valueOf((ipcMessage.getArg1(0) << 16) | ipcMessage.getArg1(1));
        OnUiElementCallback onUiElementCallback = this.OooO0OO.OooOo0O;
        if (onUiElementCallback != null) {
            onUiElementCallback.onScreenShotDone(strValueOf, ipcMessage.getFileData());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String OooO0O0(com.google.protobuf.ByteString r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3838eg.OooO0O0(com.google.protobuf.ByteString, int, int, int):java.lang.String");
    }

    public final void OooO0OO(int i) {
        Message messageObtainMessage = this.OooO0oO.obtainMessage(5);
        messageObtainMessage.arg1 = i;
        messageObtainMessage.sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3838eg.OooO0o(java.lang.String, java.lang.String):void");
    }
}
