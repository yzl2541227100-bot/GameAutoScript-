package p285z2;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.cyjh.mobileanjian.ipc.stuff.IntentActions;
import com.cyjh.mobileanjian.ipc.view.ExToast;
import com.cyjh.mqsdk.C2703R;
import com.goldcoast.sdk.domain.AnalyseResult;
import com.goldcoast.sdk.domain.EntryPoint;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.io.File;

/* JADX INFO: renamed from: z2.he */
/* JADX INFO: loaded from: classes2.dex */
public final class C3947he {
    private static C3947he OooO = null;
    public static final int OooO0oO = 1;
    public static final int OooO0oo = 2;
    private static final String OooOO0 = "3rd.need.or.not.m";
    private int OooO0o;
    public boolean OooO0O0 = false;
    private boolean OooO0OO = false;
    public boolean OooO0Oo = false;
    public boolean OooO0o0 = false;
    public Handler OooO00o = new OooO00o(Looper.getMainLooper());

    /* JADX INFO: renamed from: z2.he$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (C4614zf.OooO0oo() != null) {
                C4614zf.OooO0oo().onRootProgress((String) message.obj, message.what);
            }
        }
    }

    /* JADX INFO: renamed from: z2.he$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ExToast.makeText(C4614zf.OooO0o0(), C4614zf.OooO0o0().getString(C2703R.string.toast_script_engine_failed_start), ExToast.LENGTH_LONG).show();
        }
    }

    /* JADX INFO: renamed from: z2.he$OooO0OO */
    public class OooO0OO extends Thread {
        public final /* synthetic */ File OoooOoO;

        /* JADX INFO: renamed from: z2.he$OooO0OO$OooO00o */
        public class OooO00o implements AnalyseResult {
            public OooO00o() {
            }

            @Override // com.goldcoast.sdk.domain.AnalyseResult
            public final void onException(String str) {
                C3947he c3947he = C3947he.this;
                c3947he.OooO0O0 = false;
                if (!c3947he.OooO0o0) {
                    c3947he.OooO00o.obtainMessage(3, str).sendToTarget();
                }
                C3947he.this.OooO0o0 = true;
                C3947he.OooO00o();
            }

            @Override // com.goldcoast.sdk.domain.AnalyseResult
            public final void onFailed(String str) {
                C3947he c3947he = C3947he.this;
                c3947he.OooO0O0 = false;
                if (!c3947he.OooO0o0) {
                    c3947he.OooO00o.obtainMessage(3, str).sendToTarget();
                }
                C3947he.this.OooO0o0 = true;
                C3947he.OooO00o();
            }

            @Override // com.goldcoast.sdk.domain.AnalyseResult
            public final void onProgress(String str) {
            }

            @Override // com.goldcoast.sdk.domain.AnalyseResult
            public final void onSuccess(String str) {
                if (OooO0OO.this.OoooOoO.exists()) {
                    OooO0OO.this.OoooOoO.delete();
                }
                C3947he c3947he = C3947he.this;
                c3947he.OooO0O0 = false;
                c3947he.OooO0o0 = true;
                c3947he.OooO0Oo = true;
                EntryPoint.instance().exec(new String[]{"chmod 677 /dev/input/*", C4614zf.OooO0o().getAbsolutePath()});
                C3947he.this.OooO00o.sendMessageDelayed(C3947he.this.OooO00o.obtainMessage(3, str), UMAmapConfig.AMAP_CACHE_WRITE_TIME);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, File file) {
            super(str);
            this.OoooOoO = file;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (!this.OoooOoO.exists()) {
                    this.OoooOoO.createNewFile();
                }
                EntryPoint.instance().analyse(new OooO00o());
            } catch (Exception unused) {
                C3947he c3947he = C3947he.this;
                c3947he.OooO0O0 = false;
                c3947he.OooO0o0 = true;
                c3947he.OooO00o.obtainMessage(3, "Exception occurs when startThirdRoot()").sendToTarget();
            }
        }
    }

    private C3947he() {
    }

    private static /* synthetic */ boolean OooO(C3947he c3947he) {
        c3947he.OooO0o0 = true;
        return true;
    }

    public static /* synthetic */ void OooO00o() {
        Intent intent = new Intent(IntentActions.TRY_ACTIVE_RUNNER);
        intent.putExtra(IntentActions.EXTRA_ACTIVITE_TYPE, "2");
        intent.putExtra(IntentActions.EXTRA_ACTIVE_RESULT, "0");
        LocalBroadcastManager.getInstance(C4614zf.OooO0Oo()).sendBroadcast(intent);
    }

    private void OooO0O0(int i) {
        this.OooO0o = i;
    }

    private void OooO0OO(String str) {
        this.OooO00o.obtainMessage(2, str).sendToTarget();
        this.OooO00o.removeMessages(3);
    }

    private static void OooO0Oo(boolean z) {
        Intent intent = new Intent(IntentActions.TRY_ACTIVE_RUNNER);
        intent.putExtra(IntentActions.EXTRA_ACTIVITE_TYPE, "2");
        intent.putExtra(IntentActions.EXTRA_ACTIVE_RESULT, z ? "1" : "0");
        LocalBroadcastManager.getInstance(C4614zf.OooO0Oo()).sendBroadcast(intent);
    }

    private static /* synthetic */ boolean OooO0o(C3947he c3947he) {
        c3947he.OooO0O0 = false;
        return false;
    }

    private static boolean OooO0o0(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private static synchronized C3947he OooO0oO() {
        if (OooO == null) {
            OooO = new C3947he();
        }
        return OooO;
    }

    private void OooO0oo(String str) {
        this.OooO00o.obtainMessage(3, str).sendToTarget();
    }

    private boolean OooOO0() {
        return this.OooO0o0 && this.OooO0Oo;
    }

    private static /* synthetic */ boolean OooOO0O(C3947he c3947he) {
        c3947he.OooO0Oo = true;
        return true;
    }

    private void OooOOO() {
        if (this.OooO0O0) {
            this.OooO00o.obtainMessage(1, "3rd root is going on now." + EntryPoint.class.getSimpleName()).sendToTarget();
            return;
        }
        File file = new File(C4614zf.OooO0Oo().getFilesDir(), OooOO0);
        if (!file.exists()) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C4614zf.OooO0Oo().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (this.OooO0o0) {
                    if (this.OooO0Oo) {
                        this.OooO00o.post(new OooO0O0());
                        return;
                    } else {
                        this.OooO00o.obtainMessage(5, C1796r.f10844ah).sendToTarget();
                        return;
                    }
                }
                this.OooO0O0 = true;
                this.OooO00o.obtainMessage(1, "Now start 3rd root using " + EntryPoint.class.getSimpleName()).sendToTarget();
                new OooO0OO("third_root_request", file).start();
                return;
            }
        }
        this.OooO00o.obtainMessage(5, "failed because mark file").sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void OooOOO0() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3947he.OooOOO0():void");
    }
}
