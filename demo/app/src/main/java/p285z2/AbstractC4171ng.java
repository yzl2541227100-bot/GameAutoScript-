package p285z2;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;
import com.cyjh.mobileanjian.ipc.interfaces.EngineStateObserver;
import com.cyjh.mobileanjian.ipc.interfaces.OnRootApplyCallback;
import com.cyjh.mobileanjian.ipc.interfaces.OnScriptListener;
import com.cyjh.mobileanjian.ipc.share.proto.Ipc;
import com.cyjh.mobileanjian.ipc.utils.RootUtil;
import com.cyjh.mqsdk.C2703R;
import com.cyjh.p202mq.sdk.inf.IRunner;
import com.google.protobuf.ByteString;
import java.io.File;
import org.apache.commons.p284io.FileUtils;
import org.apache.commons.p284io.FilenameUtils;

/* JADX INFO: renamed from: z2.ng */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4171ng implements EngineStateObserver, OnRootApplyCallback, IRunner {
    public static final int OooO0oo = 256;
    public C4209og OooO0O0;
    private OnScriptListener OooO0Oo;
    public C3764cg OooO00o = null;
    public boolean OooO0o0 = false;
    private boolean OooO0o = false;
    public boolean OooO0oO = false;
    public Handler OooO0OO = new OooO00o(Looper.getMainLooper());

    /* JADX INFO: renamed from: z2.ng$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 256 || C4614zf.OooO0oo() == null) {
                return;
            }
            if (message.what == 4) {
                Toast.makeText(C4614zf.OooO0o0(), C4614zf.OooO0Oo().getString(C2703R.string.toast_failed_got_root, new Object[]{C4060kg.OooO00o(C4614zf.OooO0o0())}), 1).show();
            }
            C4614zf.OooO0oo().onRootProgress((String) message.obj, message.what);
        }
    }

    /* JADX INFO: renamed from: z2.ng$OooO0O0 */
    public class OooO0O0 extends AsyncTask<C4209og, Void, C4209og> {
        private OooO0O0() {
        }

        public /* synthetic */ OooO0O0(AbstractC4171ng abstractC4171ng, byte b) {
            this();
        }

        private static C4209og OooO00o(C4209og... c4209ogArr) throws Throwable {
            C4209og c4209og = c4209ogArr[0];
            try {
                File file = new File(C4614zf.OooO0o0().getFilesDir(), "script");
                if (file.exists()) {
                    FileUtils.deleteDirectory(file);
                } else {
                    file.mkdirs();
                    file.setReadable(true, false);
                    file.setExecutable(true, false);
                }
                File[] fileArr = {new File(c4209og.OooO00o()), new File(c4209og.OooOo00()), new File(c4209og.OooO0Oo())};
                File file2 = new File(file, FilenameUtils.getName(c4209og.OooO00o()));
                File file3 = new File(file, FilenameUtils.getName(c4209og.OooOo00()));
                File file4 = new File(file, FilenameUtils.getName(c4209og.OooO0Oo()));
                File[] fileArr2 = new File[3];
                fileArr2[0] = file2;
                fileArr2[1] = file3;
                fileArr2[2] = file4;
                for (int i = 0; i < 3; i++) {
                    if (fileArr[i].exists()) {
                        FileUtils.copyFile(fileArr[i], fileArr2[i]);
                        fileArr2[i].setReadable(true, false);
                    } else {
                        fileArr2[i] = fileArr[i];
                    }
                }
                C4209og c4209ogClone = c4209og.clone();
                c4209ogClone.OooOo0O(file2.getAbsolutePath()).OooOo(file3.getAbsolutePath()).OooOOOo(file4.getAbsolutePath());
                return c4209ogClone;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        private void OooO0O0(C4209og c4209og) {
            if (c4209og != null) {
                AbstractC4171ng.this.OooOO0o(c4209og.OooOOOO(7));
                AbstractC4171ng.this.OooOO0o(c4209og.OooOOOO(1));
            }
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ C4209og doInBackground(C4209og[] c4209ogArr) {
            return OooO00o(c4209ogArr);
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(C4209og c4209og) {
            C4209og c4209og2 = c4209og;
            if (c4209og2 != null) {
                AbstractC4171ng.this.OooOO0o(c4209og2.OooOOOO(7));
                AbstractC4171ng.this.OooOO0o(c4209og2.OooOOOO(1));
            }
        }
    }

    private void OooOOO0(C4209og c4209og) {
        new OooO0O0(this, (byte) 0).execute(c4209og);
    }

    @Override // p285z2.InterfaceC4319rg
    public final void OooO(ByteString byteString) {
        OooOO0o(Ipc.IpcMessage.newBuilder().setCmd(64).setFileData(byteString).build());
    }

    @Override // p285z2.InterfaceC4319rg
    public final void OooO0O0(ByteString byteString) {
        OooOO0o(Ipc.IpcMessage.newBuilder().setCmd(C4095le.o00000o0).setFileData(byteString).build());
    }

    @Override // p285z2.InterfaceC4319rg
    public final void OooO0Oo(ByteString byteString) {
        OooOO0o(Ipc.IpcMessage.newBuilder().setCmd(65).setFileData(byteString).build());
    }

    public final void OooOO0O() {
        if (this.OooO0o) {
            return;
        }
        this.OooO0o = true;
        File fileOooO0o = C4614zf.OooO0o();
        C3984ie.OooO00o().OooO0oo("setenforce 0");
        C3984ie.OooO00o().OooO0oo("chmod 677 /dev/input/*");
        C3984ie.OooO00o().OooO0oo(fileOooO0o.getAbsolutePath());
        this.OooO0OO.sendEmptyMessageDelayed(256, 20000L);
    }

    public final void OooOO0o(Ipc.IpcMessage ipcMessage) {
        if (this.OooO0o0) {
            this.OooO00o.OooOOOo(ipcMessage);
        }
    }

    @Override // p285z2.InterfaceC4319rg
    /* JADX INFO: renamed from: a */
    public final void mo13090a(String str) {
        OooOO0o(Ipc.IpcMessage.newBuilder().setCmd(C4095le.o0000Ooo).addArg2(str).build());
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public boolean isScriptStarted() {
        C3764cg c3764cg = this.OooO00o;
        if (c3764cg == null) {
            return false;
        }
        return c3764cg.OooOO0;
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public void notifyRotationStatus() {
        OooOO0o(Ipc.IpcMessage.newBuilder().setCmd(15).addArg1(((WindowManager) C4614zf.OooO0Oo().getSystemService("window")).getDefaultDisplay().getRotation()).build());
    }

    @Override // com.cyjh.mobileanjian.ipc.interfaces.EngineStateObserver
    public void onConnected(C3764cg c3764cg) {
        this.OooO0OO.removeMessages(256);
        this.OooO0o0 = true;
        this.OooO00o = c3764cg;
        this.OooO0o = false;
        setOnScriptListener(this.OooO0Oo);
    }

    @Override // com.cyjh.mobileanjian.ipc.interfaces.OnRootApplyCallback
    public void onObtained() {
        Log.d("JAVA_RUNNER", "onObtained()1");
        if (RootUtil.isRoot()) {
            this.OooO0OO.obtainMessage(6, "ROOT SUCCESS").sendToTarget();
        }
        OooOO0O();
        this.OooO0oO = false;
    }

    @Override // com.cyjh.mobileanjian.ipc.interfaces.OnRootApplyCallback
    public void onRefused() {
        if (RootUtil.isRoot()) {
            this.OooO0OO.obtainMessage(4, "User refused root.").sendToTarget();
        }
        this.OooO0oO = false;
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public void pause() {
        OooOO0o(C4132me.OooO0OO(2));
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public void resume() {
        OooOO0o(C4132me.OooO0OO(9));
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public IRunner setOnScriptListener(OnScriptListener onScriptListener) {
        this.OooO0Oo = onScriptListener;
        C3764cg c3764cg = this.OooO00o;
        if (c3764cg != null) {
            c3764cg.OooOOo = onScriptListener;
        }
        return this;
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public IRunner setScript(C4209og c4209og) {
        this.OooO0O0 = c4209og;
        OooOO0o(c4209og.OooOOOO(7));
        return this;
    }

    @Override // com.cyjh.p202mq.sdk.inf.IRunner
    public void stop() {
        Log.d("JAVA_RUNNER", "GeneralMqRunner stop");
        OooOO0o(C4132me.OooO0OO(3));
    }
}
