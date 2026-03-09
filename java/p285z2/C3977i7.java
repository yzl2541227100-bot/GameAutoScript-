package p285z2;

import android.app.Application;
import android.content.Intent;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.MsgItem;
import com.cyjh.elfin.entity.Script;
import com.cyjh.elfin.p200ui.activity.ElfinFreeActivity;
import com.cyjh.elfin.tools.utils.BootDexManager;
import com.cyjh.http.bean.request.DeviceInfo;
import com.cyjh.http.bean.request.UpdateRequestInfo;
import com.cyjh.http.bean.response.VersionUpdateInfo;
import com.cyjh.mobileanjian.ipc.rpc.RestartScriptHelper;
import com.rck.p259yt.ten.p260cn.Orcck;
import com.ywfzjbcy.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.function.ToLongFunction;
import org.json.JSONObject;
import p285z2.C3687ad;
import p285z2.C3982ic;

/* JADX INFO: renamed from: z2.i7 */
/* JADX INFO: loaded from: classes.dex */
public class C3977i7 {
    private static final int OooOO0o = 3000;
    private static final C3977i7 OooOOO = new C3977i7();
    private static final String OooOOO0 = "z2.i7";
    private String OooO0O0;
    private int OooO0OO;
    private int OooOO0;
    private boolean OooO00o = false;
    private final Object OooO0Oo = new Object();
    private boolean OooO0o0 = false;
    private final Handler OooO0o = new OooO00o(Looper.getMainLooper());
    private final InterfaceC3988ii OooO0oO = new OooO0O0();
    private boolean OooO0oo = true;
    public boolean OooO = true;
    public boolean OooOO0O = true;

    /* JADX INFO: renamed from: z2.i7$OooO */
    public class OooO implements InterfaceC4306r3<Boolean> {
        public OooO() {
        }

        @Override // p285z2.InterfaceC4306r3
        /* JADX INFO: renamed from: OooO0O0 */
        public void OooO00o(Boolean bool) {
            C3977i7.this.OooO0oo = false;
            C3977i7.this.OooO = bool.booleanValue();
        }

        @Override // p285z2.InterfaceC4306r3
        public void error(String str) {
            C3977i7.this.OooO0oo = true;
        }
    }

    /* JADX INFO: renamed from: z2.i7$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1 || i == 2 || i != 3) {
                return;
            }
            C4173ni.OooO0o().OooO0o0((String) message.obj, C3977i7.this.OooOO0());
        }
    }

    /* JADX INFO: renamed from: z2.i7$OooO0O0 */
    public class OooO0O0 implements InterfaceC3988ii {

        /* JADX INFO: renamed from: z2.i7$OooO0O0$OooO00o */
        public class OooO00o implements C3687ad.OooO00o {
            public OooO00o() {
            }

            @Override // p285z2.C3687ad.OooO00o
            public void OooO00o(int i, String str) {
            }

            @Override // p285z2.C3687ad.OooO00o
            public void onSuccess(String str) {
            }
        }

        public OooO0O0() {
        }

        @Override // p285z2.InterfaceC3988ii
        public void callback(int i, String str) {
            C3977i7.this.OooO0o0(i, str);
        }

        @Override // p285z2.InterfaceC3988ii
        public void doSpecialFuction(int i, String str) {
            Script scriptOooO0oO;
            if (!C3683a9.OooO0oo() || (scriptOooO0oO = C3718b7.OooO0Oo().OooO0oO()) == null) {
                return;
            }
            C3687ad.OooO0o().OooOO0(AppContext.OooO00o(), scriptOooO0oO.getId(), str, new OooO00o());
        }

        @Override // p285z2.InterfaceC3988ii
        public String getForegroundPackage() {
            return C3977i7.this.OooO0oo();
        }

        @Override // p285z2.InterfaceC3988ii
        public String getRunningPackages() {
            return C4173ni.OooO0o().OooO0OO().getRunningPackages();
        }

        @Override // p285z2.InterfaceC3988ii
        public void inputText(String str) {
            Intent intent = new Intent("_VA_" + C3977i7.this.OooO0oo());
            intent.putExtra(C3751c3.OooO00o, 1);
            intent.putExtra(C3751c3.OooO0o0, str);
            AppContext.OooO00o().sendBroadcast(intent);
        }

        @Override // p285z2.InterfaceC3988ii
        public void keyPress(int i) {
            Intent intent = new Intent("_VA_" + C3977i7.this.OooO0oo());
            intent.putExtra(C3751c3.OooO00o, 2);
            intent.putExtra(C3751c3.OooO0Oo, i);
            AppContext.OooO00o().sendBroadcast(intent);
        }

        @Override // p285z2.InterfaceC3988ii
        public void killApp(String str) {
            C4173ni.OooO0o().OooO0OO().OooO00o(str, C3977i7.this.OooOO0());
        }

        @Override // p285z2.InterfaceC3988ii
        public void launchApp(String str) {
            Message messageObtainMessage = C3977i7.this.OooO0o.obtainMessage();
            messageObtainMessage.what = 3;
            messageObtainMessage.obj = str;
            C3977i7.this.OooO0o.sendMessage(messageObtainMessage);
        }

        @Override // p285z2.InterfaceC3988ii
        public void onEngineStart(int i) {
            C3977i7.this.OooOOo(i);
        }

        @Override // p285z2.InterfaceC3988ii
        public void onKeyEvent(int i) {
            String str = "onKeyEvent1: -- " + i;
            C3977i7.this.OooOOoo(i);
        }

        @Override // p285z2.InterfaceC3988ii
        public void onPause() {
            C3977i7.this.OooOo00();
        }

        @Override // p285z2.InterfaceC3988ii
        public void onResume() {
            C3977i7.this.OooOo0();
        }

        @Override // p285z2.InterfaceC3988ii
        public void onScriptIsRunning() {
            C3977i7.this.OooOo0O();
        }

        @Override // p285z2.InterfaceC3988ii
        public void onSetControlBarVisiable(int i) {
            C3977i7.this.OooOo0o(i);
        }

        @Override // p285z2.InterfaceC3988ii
        public void onStartScript() {
            C3977i7.this.OooOo();
        }

        @Override // p285z2.InterfaceC3988ii
        public void onStopScript(int i, String str) {
            C3977i7.this.OooOoO0(i, str);
        }

        @Override // p285z2.InterfaceC3988ii
        public void onUpdateControlBarPos(float f, int i, int i2) {
            C3977i7.this.OooOoO(f, i, i2);
        }
    }

    /* JADX INFO: renamed from: z2.i7$OooO0OO */
    public class OooO0OO implements Runnable {
        public final /* synthetic */ String OoooOoO;
        public final /* synthetic */ String OoooOoo;
        public final /* synthetic */ String Ooooo00;
        public final /* synthetic */ long Ooooo0o;

        public OooO0OO(String str, String str2, String str3, long j) {
            this.OoooOoO = str;
            this.OoooOoo = str2;
            this.Ooooo00 = str3;
            this.Ooooo0o = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C3977i7.this.OooO0Oo) {
                C3951hi.OooOo00(this.OoooOoO, this.OoooOoo, this.Ooooo00, this.Ooooo0o);
            }
        }
    }

    /* JADX INFO: renamed from: z2.i7$OooO0o */
    public class OooO0o implements Runnable {
        public OooO0o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C3977i7.this.OooO0Oo) {
                C3951hi.OooOo0o();
            }
        }
    }

    /* JADX INFO: renamed from: z2.i7$OooOO0 */
    public class OooOO0 implements Runnable {
        public OooOO0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3718b7.OooO0o = false;
        }
    }

    /* JADX INFO: renamed from: z2.i7$OooOO0O */
    public class OooOO0O implements View.OnClickListener {
        public final /* synthetic */ DialogC4608z9 OoooOoO;

        public OooOO0O(DialogC4608z9 dialogC4608z9) {
            this.OoooOoO = dialogC4608z9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.OoooOoO.dismiss();
        }
    }

    /* JADX INFO: renamed from: z2.i7$OooOOO0 */
    public class OooOOO0 implements C3982ic.OooO00o {
        public OooOOO0() {
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO00o(VersionUpdateInfo versionUpdateInfo) {
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO0O0(VersionUpdateInfo versionUpdateInfo) {
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO0OO(VersionUpdateInfo versionUpdateInfo) {
            String unused = C3977i7.OooOOO0;
            if (versionUpdateInfo == null) {
                return;
            }
            Intent intent = new Intent(AppContext.OooO00o(), (Class<?>) ElfinFreeActivity.class);
            intent.putExtra("needUpdate", true);
            AppContext.OooO00o().startActivity(intent);
        }
    }

    public static C3977i7 OooO() {
        return OooOOO;
    }

    private void OooO0o() {
        File[] fileArrListFiles = new File(Environment.getExternalStorageDirectory() + "/Logcat").listFiles();
        Arrays.sort(fileArrListFiles, Comparator.comparingLong(new ToLongFunction() { // from class: z2.e7
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((File) obj).lastModified();
            }
        }));
        if (fileArrListFiles.length > 3) {
            for (int i = 0; i < fileArrListFiles.length - 3; i++) {
                fileArrListFiles[i].delete();
            }
        }
    }

    /* JADX INFO: renamed from: OooOOOO */
    public /* synthetic */ void OooOOOo() {
        while (!this.OooO0o0) {
            SystemClock.sleep(500L);
        }
    }

    private void OooOoo0(String str) {
        if (DialogC4608z9.Ooooo0o && !DialogC4608z9.OooooO0) {
            j10.OooO0o().OooOOOO(new MsgItem(1005));
        }
        if (DialogC4608z9.Ooooo0o) {
            j10.OooO0o().OooOOOO(new MsgItem.UpdateMessageToDialog(str));
            return;
        }
        DialogC4608z9 dialogC4608z9 = new DialogC4608z9(AppContext.OooO00o(), true, str);
        dialogC4608z9.OooO0O0(new OooOO0O(dialogC4608z9));
        dialogC4608z9.show();
    }

    private void Oooo0OO() {
        if (!OooOOO()) {
            C4014j7.OooO0O0().OooO0o(C3793d8.OooOOO);
        } else {
            Oooo0o0();
            C3718b7.OooO0o = false;
        }
    }

    private void Oooo0oO() {
        if (C4605z6.OooO0Oo().OooO0OO() != null) {
            C4605z6.OooO0Oo().OooO0OO().Oooo0();
            C4605z6.OooO0Oo().OooO0OO().Ooooo00();
        }
    }

    public void OooO0o0(int i, String str) {
        String string;
        try {
            String str2 = "code 222:" + i + " , json:" + str;
            if (i == 31) {
                C3688ae.Oooo0o0("heartbeatCheckFree.txt", AppContext.OooO00o(), "callback code:" + i + ", json:" + str, true);
                string = AppContext.OooO00o().getString(R.string.check_heartbeat_failed) + "(" + str + ")";
            } else if (i == 32) {
                string = new JSONObject(str).getString(C3902g6.OooO0Oo);
            } else if (i == 33) {
                string = AppContext.OooO00o().getString(R.string.no_get_heartbeat_time);
            } else if (i == 36) {
                j10.OooO0o().OooOOOO(new MsgItem(2000));
                return;
            } else {
                if (i != 34) {
                    if (i == 37) {
                        C3718b7.OooO0Oo().OooO0OO = 4;
                        return;
                    }
                    return;
                }
                string = new JSONObject(str).getString(C3902g6.OooO0Oo);
            }
            OooOoo0(string);
        } catch (Exception e) {
            e.printStackTrace();
            C3753c5.OooO0OO(AppContext.OooO00o(), e.getMessage());
        }
    }

    public void OooO0oO() {
        this.OooO00o = true;
        Oooo0o0();
    }

    public String OooO0oo() {
        return this.OooO0O0;
    }

    public int OooOO0() {
        return this.OooO0OO;
    }

    public void OooOO0O(Application application) {
        C3951hi.OooO0Oo(application);
    }

    public void OooOO0o() {
        C3951hi.OooO0o0(AppContext.OooO00o(), AppContext.OooO00o().getString(R.string.pay_appid), AppContext.OooO00o().getString(R.string.pay_vsersion), Environment.getExternalStorageDirectory() + File.separator + InterfaceC4047k3.o00000O0, this.OooO0oO);
        Orcck.addOcrTest(AppContext.OooO00o());
        Orcck.init();
    }

    public boolean OooOOO() {
        return C3951hi.OooO0oo();
    }

    public void OooOOO0(String str, String str2, String str3) {
        C3951hi.OooO0o(str, str2, str3);
    }

    public void OooOOo(int i) {
        String str = "onEngineStart:" + i;
        this.OooO0o0 = true;
    }

    public void OooOOoo(int i) {
        AppContext appContextOooO00o;
        int i2;
        if (C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOO0o, Boolean.TRUE) && i == 114) {
            if (!C4381t4.OooOO0(AppContext.OooO00o())) {
                appContextOooO00o = AppContext.OooO00o();
                i2 = R.string.network_off;
            } else if (AppContext.OooO00o().OoooOoo) {
                appContextOooO00o = AppContext.OooO00o();
                i2 = R.string.version_too_low;
            } else if (!AppContext.OooO00o().Ooooo00) {
                appContextOooO00o = AppContext.OooO00o();
                i2 = R.string.volume_run_script_tips;
            } else {
                if (!C3718b7.OooO0o) {
                    C3718b7.OooO0o = true;
                    OooO().Oooo0OO();
                    this.OooO0o.removeCallbacksAndMessages(null);
                    this.OooO0o.postDelayed(new OooOO0(), C2187m.f13871ag);
                    return;
                }
                appContextOooO00o = AppContext.OooO00o();
                i2 = R.string.volume_click_hips;
            }
            C3753c5.OooO0Oo(appContextOooO00o, i2);
        }
    }

    public void OooOo() {
        C4529x4.OooO0O0().OooO0o(InterfaceC3865f6.OooOo, Boolean.TRUE);
        this.OooO00o = false;
        C4014j7.OooO0O0().OooO0o0(4);
        C4273q7.OooO0o0().OooOO0();
        C3718b7.OooO0Oo().OooO0OO = 2;
        this.OooO = false;
        C4529x4 c4529x4OooO0O0 = C4529x4.OooO0O0();
        Boolean bool = Boolean.FALSE;
        if (c4529x4OooO0O0.OooO00o(InterfaceC3865f6.OooOo0, bool)) {
            BootDexManager.OooO0OO().OooO0o();
        }
        if (C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOo, bool)) {
            BootDexManager.OooO0OO().OooO0oO(C4529x4.OooO0O0().OooO0Oo(InterfaceC3865f6.OooOo00, "logcat -v time"));
        }
        C3940h7.OooO0o(new OooO());
        C3792d7.OooO00o().OooO0o0();
        Oooo0oO();
    }

    public void OooOo0() {
        C3718b7.OooO0Oo().OooO0OO = 2;
        Oooo0oO();
        this.OooOO0O = true;
    }

    public void OooOo00() {
        if (4 == C3718b7.OooO0Oo().OooO0OO) {
            C4344s4.OooO00o(AppContext.OooO00o(), AppContext.OooO00o().getString(R.string.script_run_pausing));
            return;
        }
        C3718b7.OooO0Oo().OooO0OO = 3;
        if (this.OooOO0O) {
            Oooo0oO();
            this.OooOO0O = false;
        }
    }

    public void OooOo0O() {
        C3718b7.OooO0Oo().OooO0OO = 2;
    }

    public void OooOo0o(int i) {
        C4605z6.OooO0Oo().OooO0OO().setControlbarVisiable(i);
    }

    public void OooOoO(float f, int i, int i2) {
        Oooo0oO();
        C4605z6.OooO0Oo().OooO0OO().o000oOoO(f, i, i2);
    }

    public void OooOoO0(int i, String str) {
        C4529x4 c4529x4OooO0O0 = C4529x4.OooO0O0();
        Boolean bool = Boolean.FALSE;
        if (c4529x4OooO0O0.OooO00o(InterfaceC3865f6.OooOOoo, bool)) {
            if (i == 115) {
                DialogC4457v6 dialogC4457v6 = new DialogC4457v6(AppContext.OooO00o());
                dialogC4457v6.show();
                dialogC4457v6.OooO0oo("Code:" + i + " \n " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())) + " \nMsg:" + str);
            } else if (i == 1002) {
                String strOooOO0o = C4048k4.OooOO0o(new File("/sdcard/engine_common.txt"));
                if (TextUtils.isEmpty(strOooOO0o)) {
                    strOooOO0o = str;
                }
                DialogC4457v6 dialogC4457v62 = new DialogC4457v6(AppContext.OooO00o());
                dialogC4457v62.show();
                dialogC4457v62.OooO0oo("Code:" + i + " \n " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())) + " \nMsg:" + strOooOO0o);
            }
        }
        String str2 = "onStopScript: returnCode1 = " + i + ", msg:" + str;
        C4529x4.OooO0O0().OooO0o(InterfaceC3865f6.OooOo, bool);
        C4014j7.OooO0O0().OooO0o0(1);
        C3718b7.OooO0Oo().OooO0OO = 1;
        this.OooO = true;
        C3688ae.Oooo0o0("heartbeatCheckFree.txt", AppContext.OooO00o(), "onStopScript - callback code:" + i + "\n", true);
        if (C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOo0, bool)) {
            BootDexManager.OooO0OO().OooO0oo();
        }
        if (C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOo, bool)) {
            BootDexManager.OooO0OO().OooO();
            OooO0o();
        }
        if (TextUtils.isEmpty(C3834ec.OooO0OO().OooO0O0.DeviceId) || TextUtils.isEmpty(C3834ec.OooO0OO().OooO0O0.DeviceCode)) {
            DeviceInfo deviceInfoOooO00o = C3688ae.OooO00o(AppContext.OooO00o());
            C3834ec.OooO0OO().OooO0O0.DeviceId = deviceInfoOooO00o.DeviceId;
            C3834ec.OooO0OO().OooO0O0.DeviceCode = deviceInfoOooO00o.DeviceCode;
        }
        if (!this.OooO0oo && C4125m7.OooO0o0().OooOO0 != null) {
            C3940h7.OooO0oO(null);
        }
        C3792d7.OooO00o().OooO0o0();
        Oooo0oO();
        C4605z6.OooO0Oo().OooO0OO().Oooo0O0();
        if (i == 1003) {
            Toast.makeText(AppContext.OooO00o(), R.string.toast_run_no_permission, 0).show();
        }
        String str3 = "onStopScript RestartScriptHelper.isNeedRestart():" + RestartScriptHelper.isNeedRestart();
        if (this.OooO00o) {
            C3755c7.OooO0oo().OooOO0();
            j10.OooO0o().OooOOOO(new MsgItem(1008));
        } else if (RestartScriptHelper.isNeedRestart().booleanValue()) {
            C3940h7.OooO0o0(null);
        }
    }

    public void OooOoOO() {
        C3951hi.OooO();
    }

    public void OooOoo() {
        C3951hi.OooOO0();
    }

    public void OooOooO(String str) {
        this.OooO0O0 = str;
    }

    public void OooOooo(int i) {
        this.OooOO0 = i;
        C3951hi.OooOOOO(i);
        OooOO0o();
    }

    public void Oooo() {
        if (C3974i4.OooO00o().OooO0O0()) {
            return;
        }
        if (!C4381t4.OooOO0(AppContext.OooO00o())) {
            C3753c5.OooO0O0(AppContext.OooO00o(), R.string.network_off);
            return;
        }
        String strOooO0Oo = C4533x8.OooO0Oo(AppContext.OooO00o(), InterfaceC3865f6.OooO0oo);
        String strOooOO0O = C3678a4.OooOO0O(AppContext.OooO00o());
        UpdateRequestInfo updateRequestInfo = new UpdateRequestInfo();
        updateRequestInfo.ScriptId = C3718b7.OooO0Oo().OooO0oO().getId();
        updateRequestInfo.DeviceName = strOooOO0O;
        updateRequestInfo.ScriptVersion = Integer.parseInt(strOooO0Oo);
        String str = "updateVersionRequest --> 1 ScriptId=" + updateRequestInfo.ScriptId + ",DeviceName=" + updateRequestInfo.DeviceName + ",ScriptVersion=" + updateRequestInfo.ScriptVersion;
        C3982ic.OooOo00().OooOo0O(new OooOOO0()).OooOo(true, AppContext.OooO00o(), updateRequestInfo);
    }

    public void Oooo0() {
        C3951hi.OooOOO0(C3951hi.OooO00o.getFilesDir() + File.separator + InterfaceC4047k3.o00000OO);
        C3951hi.OooOOO(C4273q7.OooO0o0().OooO0o());
        C3718b7.OooO0Oo().OooOO0();
        C3827e5.OooO00o().OooO0o(new Runnable() { // from class: z2.g7
            @Override // java.lang.Runnable
            public final void run() {
                this.OoooOoO.OooOOOo();
            }
        }).OooOOO(new w30() { // from class: z2.f7
            @Override // p285z2.w30
            public final void OooO0O0(Object obj) {
                C3951hi.OooOOo();
            }
        });
    }

    public void Oooo000(String str, String str2, String str3, int i, long j, String str4, String str5, String str6, String str7) {
        C3951hi.OooOOOo(str, str2, str3, i, j, str4, str5, str6, str7);
    }

    public void Oooo00O(String str, String str2, String str3, String str4, String str5) {
        C3951hi.OooOOo0(str, str2, str3, str4, str5);
    }

    public void Oooo00o(int i) {
        this.OooO0OO = i;
    }

    public void Oooo0O0(String str, String str2, String str3, long j) {
        String str4 = "EnginSdk -- 1starLoop " + Thread.currentThread().getName();
        C3827e5.OooO00o().OooO0o(new OooO0OO(str, str2, str3, j));
    }

    public void Oooo0o() {
        C3827e5.OooO00o().OooO0o(new OooO0o());
    }

    public void Oooo0o0() {
        Log.i("EnginSdk", "stop");
        RestartScriptHelper.setNeedRestartValue(Boolean.FALSE);
        C3951hi.OooOo0();
    }

    public void Oooo0oo() {
        if (OooOOO()) {
            return;
        }
        if (C4564y2.OooO0O0(AppContext.OooO00o(), "common_shared_file", C3825e3.OooO0o, 0) != 0) {
            C3951hi.OooOO0O(false, 0, 0, 0, 0);
            return;
        }
        int iOooO0O0 = C4564y2.OooO0O0(AppContext.OooO00o(), C3825e3.OooO0oo, C3825e3.OooOO0, 0);
        int iOooO0O02 = C4564y2.OooO0O0(AppContext.OooO00o(), C3825e3.OooO0oo, C3825e3.OooO, 0);
        C3951hi.OooOO0O(true, C4564y2.OooO0O0(AppContext.OooO00o(), C3825e3.OooO0oo, C3825e3.OooOO0o, 0), C4564y2.OooO0O0(AppContext.OooO00o(), C3825e3.OooO0oo, C3825e3.OooOO0O, 0), iOooO0O0, iOooO0O02);
    }
}
