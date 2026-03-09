package com.cyjh.p202mq.service;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import androidx.annotation.Nullable;
import com.cyjh.event.Injector;
import com.cyjh.mobileanjian.ipc.rpc.AndroidHelper;
import com.cyjh.mobileanjian.ipc.utils.FileUtils;
import com.cyjh.mobileanjian.ipc.utils.RomUtils;
import com.cyjh.mobileanjian.screencap.ScreenShoterV3;
import com.cyjh.mqsdk.C2703R;
import com.cyjh.p202mq.sdk.MqRunner;
import com.cyjh.p202mq.sdk.MqRunnerLite;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.UUID;
import p285z2.C3801dg;
import p285z2.C3984ie;
import p285z2.C4429uf;
import p285z2.C4430ug;
import p285z2.C4614zf;
import p285z2.o00O0O00;

/* JADX INFO: loaded from: classes2.dex */
public class IpcService extends Service {
    private static final String OooooOO = "mqm_engine";
    private static final String OooooOo = "ipc_server_port";
    private static final String Oooooo = "/system/bin/app_process64";
    private static final String Oooooo0 = "/system/bin/app_process32";
    private static final String OoooooO = "elfinject";
    private static final String Ooooooo = "model";
    private static final String o00O0O = "mycache";
    private static final String o00Oo0 = "dalvik-cache";
    private static final String o0OoOo0 = "code_cache";
    private static final String ooOO = "secondary-dexes";
    private int OoooOoo;
    private C3801dg OooooO0;
    private String OoooOoO = null;
    private String Ooooo00 = "";
    private String Ooooo0o = "";

    public class OooO00o extends HandlerThread {
        public OooO00o(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            IpcService ipcService = IpcService.this;
            ipcService.OooooO0 = new C3801dg(ipcService);
            C3801dg c3801dg = IpcService.this.OooooO0;
            c3801dg.OooO0o0.add(MqRunner.getInstance());
            IpcService.this.OooooO0.OooO0O0(IpcService.this.OoooOoO, IpcService.this.OoooOoo);
        }
    }

    public class OooO0O0 extends Thread {
        public OooO0O0(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws Throwable {
            super.run();
            IpcService.OooO(IpcService.this);
            IpcService.OooOO0O(IpcService.this);
            IpcService.OooOOO0(IpcService.this);
            C3984ie.OooO00o().OooO0o(MqRunner.getInstance());
        }
    }

    public static /* synthetic */ void OooO(IpcService ipcService) {
        File dir = ipcService.getDir("model", 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        try {
            for (String str : ipcService.getResources().getAssets().list("model")) {
                File file = new File(dir, str);
                FileUtils.copyAssetsFile(ipcService, new File("model", str).getPath(), file.getAbsolutePath());
                if (file.exists()) {
                    file.setReadable(true, false);
                }
            }
            File file2 = new File(ipcService.getFilesDir(), C4614zf.OooO0o0);
            FileUtils.copyAssetsFile(ipcService, C4614zf.OooO0o0, file2.getAbsolutePath());
            file2.setReadable(true, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void OooO0OO() {
        String absolutePath = getApplicationContext().getFilesDir().getAbsolutePath();
        o00O0O00.OooO0Oo = absolutePath;
        new File(absolutePath).setExecutable(true, false);
        this.OoooOoO = UUID.randomUUID().toString();
        this.OoooOoo = OooOOO();
        StringBuilder sb = new StringBuilder("mLocalServerAddr:");
        sb.append(this.OoooOoO);
        sb.append(", mPort:");
        sb.append(this.OoooOoo);
        String str = getFilesDir().getAbsolutePath() + File.separator + C4614zf.OooO0o0;
        String strMakeAbsolutePath = FileUtils.makeAbsolutePath(getApplicationInfo().dataDir, "lib", C4614zf.OooO0o);
        String str2 = getApplicationInfo().nativeLibraryDir + "/" + C4614zf.OooO0o;
        o00O0O00.OooO0O0 = getApplicationInfo().nativeLibraryDir;
        String str3 = Oooooo0;
        if (!new File(Oooooo0).exists()) {
            str3 = "app_process";
        }
        if (Build.VERSION.SDK_INT >= 23 && Process.is64Bit() && new File(Oooooo).exists()) {
            str3 = Oooooo;
        }
        File file = new File(FileUtils.makeAbsolutePath(getApplicationInfo().dataDir, o00O0O, o00Oo0));
        file.mkdirs();
        file.setReadable(true, false);
        file.setWritable(true, false);
        file.setExecutable(true, false);
        file.getParentFile().setReadable(true, false);
        file.getParentFile().setWritable(true, false);
        file.getParentFile().setExecutable(true, false);
        this.Ooooo00 = "export CLASSPATH=" + str + "\n" + String.format("exec %s %s %s %s %s %s %s %s &\n", str3, absolutePath, C4614zf.OooO0Oo, this.OoooOoO, strMakeAbsolutePath, Integer.valueOf(this.OoooOoo), getApplicationContext().getPackageName(), str2);
        if (RomUtils.isOppoR9S()) {
            this.Ooooo00 = "export CLASSPATH=" + str + "\n" + String.format("exec %s -Xnodex2oat %s %s %s %s %s %s %s &\n", str3, absolutePath, C4614zf.OooO0Oo, this.OoooOoO, strMakeAbsolutePath, Integer.valueOf(this.OoooOoo), getApplicationContext().getPackageName(), str2);
        }
        this.Ooooo0o = "export ANDROID_DATA=" + file.getParent() + "\n" + this.Ooooo00 + "\necho Okay";
    }

    private void OooO0o0() {
        File dir = getDir("model", 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        try {
            for (String str : getResources().getAssets().list("model")) {
                File file = new File(dir, str);
                FileUtils.copyAssetsFile(this, new File("model", str).getPath(), file.getAbsolutePath());
                if (file.exists()) {
                    file.setReadable(true, false);
                }
            }
            File file2 = new File(getFilesDir(), C4614zf.OooO0o0);
            FileUtils.copyAssetsFile(this, C4614zf.OooO0o0, file2.getAbsolutePath());
            file2.setReadable(true, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void OooO0oO() throws Throwable {
        FileUtils.copyRawFile(this, C4429uf.OooO0o0(this) ? C2703R.raw.elfinject_x86 : C2703R.raw.elfinject_arm, getFilesDir().getAbsolutePath() + File.separator + OoooooO);
    }

    private void OooO0oo() {
        File externalFilesDir;
        File filesDir = getFilesDir();
        File file = new File(filesDir, C4614zf.OooO00o);
        FileUtils.writeStringToFile(file, this.Ooooo0o);
        file.setReadable(true, false);
        file.setExecutable(true, false);
        new StringBuilder("execute command mRootScriptContent: ").append(this.Ooooo00);
        FileUtils.writeStringToFile(new File(filesDir, C4614zf.OooO0O0), this.Ooooo00);
        C4614zf.OooO0o().setExecutable(true, false);
        if (Build.VERSION.SDK_INT < 23 || (externalFilesDir = getExternalFilesDir(null)) == null || !externalFilesDir.exists()) {
            return;
        }
        FileUtils.writeStringToFile(new File(externalFilesDir, C4614zf.OooO00o), this.Ooooo0o);
    }

    private void OooOO0() {
        new OooO00o("ipcserver_thread").start();
    }

    public static /* synthetic */ void OooOO0O(IpcService ipcService) throws Throwable {
        FileUtils.copyRawFile(ipcService, C4429uf.OooO0o0(ipcService) ? C2703R.raw.elfinject_x86 : C2703R.raw.elfinject_arm, ipcService.getFilesDir().getAbsolutePath() + File.separator + OoooooO);
    }

    private void OooOO0o() {
        new OooO0O0("startRootRequest").start();
    }

    private static int OooOOO() {
        int i = C4430ug.OooO;
        for (int i2 = 0; i2 < 9; i2++) {
            try {
                new ServerSocket(i).close();
                break;
            } catch (UnknownHostException e) {
                i++;
                e.printStackTrace();
            } catch (IOException e2) {
                i++;
                e2.printStackTrace();
            }
        }
        return i;
    }

    public static /* synthetic */ void OooOOO0(IpcService ipcService) {
        File externalFilesDir;
        File filesDir = ipcService.getFilesDir();
        File file = new File(filesDir, C4614zf.OooO00o);
        FileUtils.writeStringToFile(file, ipcService.Ooooo0o);
        file.setReadable(true, false);
        file.setExecutable(true, false);
        new StringBuilder("execute command mRootScriptContent: ").append(ipcService.Ooooo00);
        FileUtils.writeStringToFile(new File(filesDir, C4614zf.OooO0O0), ipcService.Ooooo00);
        C4614zf.OooO0o().setExecutable(true, false);
        if (Build.VERSION.SDK_INT < 23 || (externalFilesDir = ipcService.getExternalFilesDir(null)) == null || !externalFilesDir.exists()) {
            return;
        }
        FileUtils.writeStringToFile(new File(externalFilesDir, C4614zf.OooO00o), ipcService.Ooooo0o);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MqRunner.getInstance().notifyRotationStatus();
        MqRunnerLite.getInstance().notifyRotationStatus();
        ScreenShoterV3.getInstance().updateScreenSize();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        AndroidHelper.init(getApplicationContext());
        Injector.init(getApplicationContext());
        String absolutePath = getApplicationContext().getFilesDir().getAbsolutePath();
        o00O0O00.OooO0Oo = absolutePath;
        new File(absolutePath).setExecutable(true, false);
        this.OoooOoO = UUID.randomUUID().toString();
        this.OoooOoo = OooOOO();
        StringBuilder sb = new StringBuilder("mLocalServerAddr:");
        sb.append(this.OoooOoO);
        sb.append(", mPort:");
        sb.append(this.OoooOoo);
        String str = getFilesDir().getAbsolutePath() + File.separator + C4614zf.OooO0o0;
        String strMakeAbsolutePath = FileUtils.makeAbsolutePath(getApplicationInfo().dataDir, "lib", C4614zf.OooO0o);
        String str2 = getApplicationInfo().nativeLibraryDir + "/" + C4614zf.OooO0o;
        o00O0O00.OooO0O0 = getApplicationInfo().nativeLibraryDir;
        String str3 = Oooooo0;
        if (!new File(Oooooo0).exists()) {
            str3 = "app_process";
        }
        if (Build.VERSION.SDK_INT >= 23 && Process.is64Bit() && new File(Oooooo).exists()) {
            str3 = Oooooo;
        }
        File file = new File(FileUtils.makeAbsolutePath(getApplicationInfo().dataDir, o00O0O, o00Oo0));
        file.mkdirs();
        file.setReadable(true, false);
        file.setWritable(true, false);
        file.setExecutable(true, false);
        file.getParentFile().setReadable(true, false);
        file.getParentFile().setWritable(true, false);
        file.getParentFile().setExecutable(true, false);
        this.Ooooo00 = "export CLASSPATH=" + str + "\n" + String.format("exec %s %s %s %s %s %s %s %s &\n", str3, absolutePath, C4614zf.OooO0Oo, this.OoooOoO, strMakeAbsolutePath, Integer.valueOf(this.OoooOoo), getApplicationContext().getPackageName(), str2);
        if (RomUtils.isOppoR9S()) {
            this.Ooooo00 = "export CLASSPATH=" + str + "\n" + String.format("exec %s -Xnodex2oat %s %s %s %s %s %s %s &\n", str3, absolutePath, C4614zf.OooO0Oo, this.OoooOoO, strMakeAbsolutePath, Integer.valueOf(this.OoooOoo), getApplicationContext().getPackageName(), str2);
        }
        this.Ooooo0o = "export ANDROID_DATA=" + file.getParent() + "\n" + this.Ooooo00 + "\necho Okay";
        new OooO00o("ipcserver_thread").start();
        new OooO0O0("startRootRequest").start();
        Log.d("VERSION", "build info: build on 2025-10-14 13:14:14");
    }

    @Override // android.app.Service
    public void onDestroy() {
        C3801dg c3801dg = this.OooooO0;
        if (c3801dg != null) {
            c3801dg.onAppQuit();
        }
        super.onDestroy();
        C3984ie c3984ieOooO00o = C3984ie.OooO00o();
        if (c3984ieOooO00o.OooO0OO) {
            c3984ieOooO00o.OooO0oo("exit");
            if (c3984ieOooO00o.OooO0O0.isAlive()) {
                c3984ieOooO00o.OooO0O0.interrupt();
            }
            try {
                c3984ieOooO00o.OooO0Oo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        C3984ie.OooO0oo = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
