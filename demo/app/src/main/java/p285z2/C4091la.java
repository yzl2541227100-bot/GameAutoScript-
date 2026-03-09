package p285z2;

import android.app.Application;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.http.bean.NotifyMsgBean;
import com.cyjh.http.bean.request.UpdateRequestInfo;
import com.cyjh.http.bean.response.RegCodeStatusInfo;
import com.cyjh.http.bean.response.VersionUpdateInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p285z2.C3982ic;
import p285z2.C4091la;

/* JADX INFO: renamed from: z2.la */
/* JADX INFO: loaded from: classes.dex */
public class C4091la extends AndroidViewModel implements InterfaceC3946hd {
    private static final String Ooooooo = "z2.la";
    public static final int o00O0O = 1008;
    public static final int o0OoOo0 = 1006;
    public static final int ooOO = 1007;
    private ArrayList<NotifyMsgBean> OoooOoO;
    private ArrayList<NotifyMsgBean> OoooOoo;
    private List<String> Ooooo00;
    private ScheduledExecutorService Ooooo0o;
    private ScheduledFuture<?> OooooO0;
    private C4463vc OooooOO;
    private MutableLiveData<VersionUpdateInfo> OooooOo;
    private MutableLiveData<Integer> Oooooo;
    private MutableLiveData<NotifyMsgBean> Oooooo0;
    private MutableLiveData<Boolean> OoooooO;

    /* JADX INFO: renamed from: z2.la$OooO */
    public class OooO implements Runnable {
        public OooO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strOooOO0 = C3688ae.OooOO0(InterfaceC4047k3.o0OOO0o + C4010j3.OooO0o(), AppContext.OooO00o());
            String strOooOO02 = C3688ae.OooOO0(InterfaceC4047k3.o0Oo0oo + C4010j3.OooO0o(), AppContext.OooO00o());
            String str = "oldFileRegCode:" + strOooOO0;
            String str2 = "json:" + strOooOO02;
            if (TextUtils.isEmpty(strOooOO02)) {
                C4273q7.OooO0o0().OooOOO0(strOooOO0);
                if (TextUtils.isEmpty(strOooOO0)) {
                    return;
                }
            } else {
                RegCodeStatusInfo regCodeStatusInfo = (RegCodeStatusInfo) C4159n4.OooO0o0(strOooOO02, RegCodeStatusInfo.class);
                if (regCodeStatusInfo != null) {
                    C4273q7.OooO0o0().OooOOO0(regCodeStatusInfo.regCode);
                    if (TextUtils.isEmpty(regCodeStatusInfo.regCode) || regCodeStatusInfo.status != 1) {
                        return;
                    }
                } else if (TextUtils.isEmpty(C4273q7.OooO0o0().OooO0o())) {
                    return;
                }
            }
            C4091la.this.Oooooo.postValue(1006);
        }
    }

    /* JADX INFO: renamed from: z2.la$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zOooOoo = C3688ae.OooOoo(InterfaceC4047k3.Oooo0oo, C4091la.this.getApplication());
            String strOooo0 = C3688ae.Oooo0(System.currentTimeMillis() / 1000, C3688ae.OooO0O0);
            if (!zOooOoo) {
                C4093lc.OooO0oo().OooO(C4091la.this.getApplication(), 5, 0, 0L);
                C3688ae.Oooo0OO(InterfaceC4047k3.Oooo0oo, C4091la.this.getApplication(), strOooo0);
            }
            C4091la.this.Oooo0oO((C3688ae.Oooo0O0(strOooo0) - System.currentTimeMillis()) / 1000);
        }
    }

    /* JADX INFO: renamed from: z2.la$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C3688ae.Oooo0OO(InterfaceC4047k3.Oooo0oo, C4091la.this.getApplication(), C3688ae.Oooo0(System.currentTimeMillis() / 1000, C3688ae.OooO0O0));
                C4091la.this.Oooo0oo();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                Log.e("zzz", "ElfinFreeActivity--" + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: z2.la$OooO0OO */
    public class OooO0OO implements C3982ic.OooO00o {
        public OooO0OO() {
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO00o(VersionUpdateInfo versionUpdateInfo) {
            String unused = C4091la.Ooooooo;
            String str = "onConnectStudioSocket IS_SERVICE_START:" + C3765ch.OooOOO0();
            if (C3765ch.OooOOO0()) {
                return;
            }
            AppContext.OooO00o().OoooOoO = versionUpdateInfo.StudioProjectKey;
            C3678a4.Oooo00o(AppContext.OooO00o(), versionUpdateInfo.DeviceName);
            C4091la.this.Oooooo.postValue(1007);
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO0O0(VersionUpdateInfo versionUpdateInfo) {
            int i = versionUpdateInfo.InstanceDataUploadInterval;
            if (i != 0) {
                C3902g6.o0ooOoO = i;
            }
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO0OO(VersionUpdateInfo versionUpdateInfo) {
            if (versionUpdateInfo == null) {
                C4091la.this.OooooOo.postValue(null);
            } else {
                C4091la.this.OooooOo.postValue(versionUpdateInfo);
            }
        }
    }

    /* JADX INFO: renamed from: z2.la$OooO0o */
    public class OooO0o implements InterfaceC4306r3 {
        public OooO0o() {
        }

        @Override // p285z2.InterfaceC4306r3
        public void OooO00o(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            if (arrayList != null) {
                C4091la.this.Oooo00o(arrayList);
            }
        }

        @Override // p285z2.InterfaceC4306r3
        public void error(String str) {
        }
    }

    /* JADX INFO: renamed from: z2.la$OooOO0 */
    public class OooOO0 implements InterfaceC4306r3<Boolean> {
        public OooOO0() {
        }

        @Override // p285z2.InterfaceC4306r3
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public void OooO00o(Boolean bool) {
            C4091la.this.OoooooO.postValue(Boolean.TRUE);
        }

        @Override // p285z2.InterfaceC4306r3
        public void error(String str) {
            C4091la.this.OoooooO.postValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: z2.la$OooOO0O */
    public class OooOO0O implements InterfaceC3876fh {
        public OooOO0O() {
        }

        public static /* synthetic */ void OooO0O0() {
            C3765ch.OooOO0O();
            j10.OooO0o().OooOOOO(new C3839eh(10003, "工作室解绑！"));
        }

        @Override // p285z2.InterfaceC3876fh
        public void OooO00o(C3802dh c3802dh) {
            j10 j10VarOooO0o;
            C3802dh c3802dh2;
            j10 j10VarOooO0o2;
            Object c3802dh3;
            String unused = C4091la.Ooooooo;
            String str = "setElfStudioCallback --> messageEvent" + c3802dh.OooO0oO();
            int iOooO0oO = c3802dh.OooO0oO();
            if (iOooO0oO == -1) {
                String unused2 = C4091la.Ooooooo;
                C4091la.this.Oooooo.postValue(1007);
                return;
            }
            if (iOooO0oO == 10002) {
                String unused3 = C4091la.Ooooooo;
                if (c3802dh.OooO00o() == 0) {
                    C3765ch.OooOOOo(AppContext.OooO00o());
                    return;
                }
                return;
            }
            if (iOooO0oO == 10004) {
                String unused4 = C4091la.Ooooooo;
                if (c3802dh.OooO0oo()) {
                    C3765ch.OooOO0O();
                    return;
                }
                return;
            }
            if (iOooO0oO == 10101) {
                String unused5 = C4091la.Ooooooo;
                j10VarOooO0o = j10.OooO0o();
                c3802dh2 = new C3802dh(10101);
            } else {
                if (iOooO0oO != 10103) {
                    if (iOooO0oO == 10105) {
                        String unused6 = C4091la.Ooooooo;
                        C3755c7.OooO0oo().OooO(AppContext.OooO00o(), C3718b7.OooO0Oo().OooO0oO().getId(), C3755c7.OooO0o).OooO0oO(c3802dh.OooO0Oo());
                        return;
                    }
                    if (iOooO0oO == 10107) {
                        String unused7 = C4091la.Ooooooo;
                        j10VarOooO0o2 = j10.OooO0o();
                        c3802dh3 = new C3802dh(10107, c3802dh.OooO0o0());
                    } else {
                        if (iOooO0oO == 10109) {
                            C4310r7.OooO0o().OooO0oO(7);
                            return;
                        }
                        if (iOooO0oO == 10111) {
                            String unused8 = C4091la.Ooooooo;
                            AppContext.OooO00o().OoooOoO = null;
                            C3765ch.OooO0oo(0, "解绑工作室项目成功！");
                            new Handler().postDelayed(new Runnable() { // from class: z2.ja
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C4091la.OooOO0O.OooO0O0();
                                }
                            }, C2187m.f13871ag);
                            return;
                        }
                        if (iOooO0oO != 10113) {
                            return;
                        }
                        String strOooO0O0 = c3802dh.OooO0O0();
                        if (C3678a4.Oooo00o(AppContext.OooO00o(), strOooO0O0)) {
                            C3765ch.OooO00o(0, "修改成功！");
                        } else {
                            C3765ch.OooO00o(-1, "修改失败！");
                        }
                        j10VarOooO0o2 = j10.OooO0o();
                        c3802dh3 = new C3839eh(10004, strOooO0O0);
                    }
                    j10VarOooO0o2.OooOOOO(c3802dh3);
                    return;
                }
                String unused9 = C4091la.Ooooooo;
                j10VarOooO0o = j10.OooO0o();
                c3802dh2 = new C3802dh(10103);
            }
            j10VarOooO0o.OooOOOO(c3802dh2);
        }
    }

    public C4091la(@NonNull Application application) {
        super(application);
        this.OoooOoO = new ArrayList<>();
        this.OoooOoo = new ArrayList<>();
        this.Ooooo00 = new ArrayList();
        this.Ooooo0o = new ScheduledThreadPoolExecutor(1);
        this.OooooOo = new MutableLiveData<>();
        this.Oooooo0 = new MutableLiveData<>();
        this.Oooooo = new MutableLiveData<>();
        this.OoooooO = new MutableLiveData<>();
        this.OooooOO = new C4463vc(this);
    }

    private void Oooo(boolean z) {
        String strOooO0Oo = C4533x8.OooO0Oo(getApplication(), InterfaceC3865f6.OooO0oo);
        String strOooOO0O = C3678a4.OooOO0O(getApplication());
        UpdateRequestInfo updateRequestInfo = new UpdateRequestInfo();
        updateRequestInfo.ScriptId = C3718b7.OooO0Oo().OooO0oO().getId();
        updateRequestInfo.DeviceName = strOooOO0O;
        updateRequestInfo.ScriptVersion = Integer.parseInt(strOooO0Oo);
        updateRequestInfo.IsScriptHotUpgrade = 1;
        updateRequestInfo.AppVersion = C3678a4.OooO0o0();
        String str = "updateVersionRequest --> 1 ScriptId=" + updateRequestInfo.ScriptId + ",DeviceName=" + updateRequestInfo.DeviceName;
        C3982ic.OooOo00().OooOo0O(new OooO0OO()).OooOo(z, getApplication(), updateRequestInfo);
    }

    private void Oooo0() {
        this.Oooooo0.postValue(this.OoooOoo.get(0));
        C4529x4.OooO0O0().OooO0o(C3902g6.OooO0o0, Boolean.TRUE);
        C4050k6.OooO0Oo().OooO0o0(this.OoooOoo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Oooo00o(ArrayList<NotifyMsgBean> arrayList) {
        this.OoooOoO.clear();
        this.Ooooo00.clear();
        this.OoooOoO.addAll(arrayList);
        Iterator<NotifyMsgBean> it = this.OoooOoO.iterator();
        while (it.hasNext()) {
            this.Ooooo00.add(it.next().f15894ID);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Oooo0oO(long j) {
        if (j <= 0) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.OooooO0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.OooooO0 = null;
        }
        this.OooooO0 = this.Ooooo0o.schedule(new OooO0O0(), j + ((long) (new Random().nextInt(18600) + 600)), TimeUnit.SECONDS);
    }

    @Override // p285z2.InterfaceC3946hd
    public void OooO0o0(List<NotifyMsgBean> list) {
        this.OoooOoo.clear();
        this.OoooOoo.addAll(list);
        if (this.Ooooo00.contains(this.OoooOoo.get(0).f15894ID)) {
            return;
        }
        this.OoooOoO.addAll(0, this.OoooOoo);
        Oooo0();
    }

    public void OooOoO() {
        this.OoooooO.postValue(Boolean.TRUE);
        C3940h7.OooO0o(new OooOO0());
    }

    public void OooOoOO() {
        this.OoooOoO.clear();
        C4050k6.OooO0Oo().OooO0OO();
    }

    public MutableLiveData<Integer> OooOoo() {
        return this.Oooooo;
    }

    public MutableLiveData<Boolean> OooOoo0() {
        return this.OoooooO;
    }

    public ArrayList<NotifyMsgBean> OooOooO() {
        return this.OoooOoO;
    }

    public MutableLiveData<NotifyMsgBean> OooOooo() {
        return this.Oooooo0;
    }

    public MutableLiveData<VersionUpdateInfo> Oooo000() {
        return this.OooooOo;
    }

    public void Oooo00O() {
        this.OooooOO.OooO0OO(getApplication());
    }

    public void Oooo0O0() {
        C4050k6.OooO0Oo().OooO0o(new OooO0o());
    }

    public void Oooo0OO() {
        C4240pb.OooO00o().OooO00o(new OooO());
    }

    public void Oooo0o() {
        C4240pb.OooO00o().OooO00o(new OooO00o());
    }

    public void Oooo0o0() {
    }

    public void Oooo0oo() {
        C4093lc.OooO0oo().OooO(getApplication(), 5, 0, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Oooo0oO((C3688ae.Oooo0O0(C3688ae.Oooo0(jCurrentTimeMillis, C3688ae.OooO0O0)) / 1000) - jCurrentTimeMillis);
    }

    public void OoooO00() {
        if (C4381t4.OooOO0(getApplication())) {
            Oooo(false);
        } else {
            C3753c5.OooO0o0(getApplication(), "当前网络无法访问，请检查网络设置……");
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.OooooOO.OooO0o();
        C3982ic.OooOo00().OooOo0();
        C4093lc.OooO0oo().OooO0o();
        ScheduledFuture<?> scheduledFuture = this.OooooO0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
