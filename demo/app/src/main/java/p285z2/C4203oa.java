package p285z2;

import android.app.Application;
import android.content.res.AssetManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.anythink.expressad.exoplayer.p097g.p099b.C1594i;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.http.bean.request.BaseRequestValueInfo;
import com.cyjh.http.bean.request.DomainNameRequestParamsInfo;
import com.cyjh.http.bean.request.StartAppRequestInfo;
import com.cyjh.http.bean.response.AppRelatedInfo;
import com.cyjh.http.bean.response.AppStartupResponse;
import com.cyjh.http.bean.response.AuthorRelatedInfo;
import com.cyjh.http.bean.response.BaseResInfo;
import com.cyjh.http.bean.response.DomainResult;
import com.cyjh.http.bean.response.PhoneConfig;
import com.cyjh.http.bean.response.TemplateResponse;
import com.cyjh.mqm.ElfinNativeJni;
import com.ywfzjbcy.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;
import p285z2.C3725be;
import p285z2.C3760cc;
import p285z2.C3940h7;

/* JADX INFO: renamed from: z2.oa */
/* JADX INFO: loaded from: classes.dex */
public class C4203oa extends AndroidViewModel {
    public static final int OooO = 20;
    private static final String OooO0o = "z2.oa";
    public static final int OooO0oO = -1;
    public static final int OooO0oo = 19;
    public static final int OooOO0 = 21;
    public static final int OooOO0O = 100;
    public static final int OooOO0o = 0;
    public static final int OooOOO = 2;
    public static final int OooOOO0 = 1;
    public static final int OooOOOO = 3;
    private long OooO00o;
    private long OooO0O0;
    private MutableLiveData<Oooo0> OooO0OO;
    private MutableLiveData<PhoneConfig> OooO0Oo;
    private int OooO0o0;

    /* JADX INFO: renamed from: z2.oa$OooO */
    public class OooO implements z30<Throwable> {
        public OooO() {
        }

        @Override // p285z2.z30
        /* JADX INFO: renamed from: OooO00o */
        public void OooO0O0(Throwable th) {
            th.printStackTrace();
            String str = "copyFileToAssets START 3:" + th.getMessage();
            C4203oa.this.OooO0OO.postValue(new Oooo0(100));
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooO00o */
    public class OooO00o implements C3725be.OooO0OO {
        public final /* synthetic */ PhoneConfig OooO00o;
        public final /* synthetic */ String OooO0O0;

        public OooO00o(PhoneConfig phoneConfig, String str) {
            this.OooO00o = phoneConfig;
            this.OooO0O0 = str;
        }

        @Override // p285z2.C3725be.OooO0OO
        public void OooO00o(long j, long j2, int i) {
        }

        @Override // p285z2.C3725be.OooO0OO
        public void OooO0O0(Exception exc) {
            C4203oa.this.OooO0Oo.postValue(null);
        }

        @Override // p285z2.C3725be.OooO0OO
        public void OooO0OO(File file) {
            this.OooO00o.setImageUrl(this.OooO0O0);
            C4203oa.this.OooO0Oo.postValue(this.OooO00o);
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooO0O0 */
    public class OooO0O0 implements C3940h7.OooOO0 {

        /* JADX INFO: renamed from: z2.oa$OooO0O0$OooO00o */
        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4496w8.OooO0oO(C4125m7.OooO0o0().OooO0o(), C4125m7.OooO0o0().OooO0oO());
            }
        }

        public OooO0O0() {
        }

        @Override // p285z2.C3940h7.OooOO0
        public void OooO00o(Object obj) {
            C3827e5.OooO00o().OooO0o(new OooO00o());
            C4203oa.this.OooO0OO.postValue(new Oooo0(1));
        }

        @Override // p285z2.C3940h7.OooOO0
        public void OooO0O0() {
            C4203oa.this.OooO0OO.postValue(new Oooo0(1));
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooO0OO */
    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BaseRequestValueInfo baseRequestValueInfoOooO00o = C3834ec.OooO0OO().OooO00o(C4203oa.this.getApplication());
                C4203oa.this.OooO00o = C3834ec.OooO0o;
                String strOooO0O0 = C4159n4.OooO0O0(baseRequestValueInfoOooO00o);
                String str = "acquireAppData --> jsonParams =" + strOooO0O0;
                C4203oa.this.Oooo0oO(C3951hi.OooO00o(strOooO0O0), 19);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooO0o */
    public class OooO0o implements Runnable {

        /* JADX INFO: renamed from: z2.oa$OooO0o$OooO00o */
        public class OooO00o implements C3760cc.OooO0o {
            public OooO00o() {
            }

            @Override // p285z2.C3760cc.OooO0o
            public void OooO00o() {
                String unused = C4203oa.OooO0o;
            }

            @Override // p285z2.C3760cc.OooO0o
            public void OooO0O0(String str) {
                C4382t5.o000oOoO("文字识别库下载失败！");
                String unused = C4203oa.OooO0o;
            }

            @Override // p285z2.C3760cc.OooO0o
            public void OooO0OO() {
                C4382t5.o000oOoO("文字识别库下载成功！");
                String unused = C4203oa.OooO0o;
            }
        }

        public OooO0o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BaseRequestValueInfo baseRequestValueInfoOooO00o = C3834ec.OooO0OO().OooO00o(C4203oa.this.getApplication());
                C4203oa.this.OooO0O0 = C3834ec.OooO0o;
                StartAppRequestInfo startAppRequestInfo = new StartAppRequestInfo(baseRequestValueInfoOooO00o);
                startAppRequestInfo.CloudPhoneType = C3723bc.OooO00o().OooO0O0();
                String strOooOOoo = C3951hi.OooOOoo(C4159n4.OooO0O0(startAppRequestInfo));
                JSONObject jSONObject = new JSONObject(strOooOOoo).getJSONObject("Data").getJSONObject("AppInfo");
                int iOptInt = jSONObject.optInt("IsOcrAutoDownloand", 0);
                String strOptString = jSONObject.optString("OcrDownloandURL", "");
                if (iOptInt == 1 && !TextUtils.isEmpty(strOptString)) {
                    C3760cc.OooO0Oo().OooO0OO(strOptString, new OooO00o());
                }
                C4203oa.this.Oooo0oO(strOooOOoo, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooOO0 */
    public class OooOO0 implements w30<Void> {
        public OooOO0() {
        }

        @Override // p285z2.w30
        /* JADX INFO: renamed from: OooO00o */
        public void OooO0O0(Void r3) {
            C4203oa.this.OooO0OO.postValue(new Oooo0(100));
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooOO0O */
    public class OooOO0O implements Runnable {
        public OooOO0O() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3718b7.OooO0Oo().OooO();
            String strOooOOo0 = C4385t8.OooOOo0(C4203oa.this.getApplication(), InterfaceC3865f6.OooO0oo);
            String strReplaceAll = C4011j4.OooOOo(new File(AppContext.OooO00o().getFilesDir().getPath() + File.separator + InterfaceC3865f6.OooO0oo)).replaceAll("\n", "");
            String str = "AssetsInfo:" + strOooOOo0 + " LocalInfo:" + strReplaceAll;
            if (new File(C4203oa.this.getApplication().getFilesDir().getAbsolutePath(), InterfaceC3865f6.OooO00o).exists() && strOooOOo0.equals(strReplaceAll)) {
                return;
            }
            C4203oa.this.OooOooo();
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooOOO */
    public class OooOOO implements w30<Void> {
        public OooOOO() {
        }

        @Override // p285z2.w30
        /* JADX INFO: renamed from: OooO00o */
        public void OooO0O0(Void r1) {
            String unused = C4203oa.OooO0o;
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooOOO0 */
    public class OooOOO0 implements z30<Throwable> {
        public OooOOO0() {
        }

        @Override // p285z2.z30
        /* JADX INFO: renamed from: OooO00o */
        public void OooO0O0(Throwable th) {
            String unused = C4203oa.OooO0o;
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooOOOO */
    public class OooOOOO implements Runnable {
        public OooOOOO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3688ae.Oooo0o0("checkNetWork.txt", AppContext.OooO00o(), "check start----" + System.currentTimeMillis() + "\n", true);
            boolean zOooO00o = C4607z8.OooO00o("http://auth2.mobileanjian.com/zabbix/zabbix.aspx");
            C3688ae.Oooo0o0("checkNetWork.txt", AppContext.OooO00o(), "     isCheck:" + zOooO00o + C1594i.f8556a + System.currentTimeMillis() + "\n", true);
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooOo */
    public class OooOo implements w30<BaseResInfo> {
        public OooOo() {
        }

        @Override // p285z2.w30
        /* JADX INFO: renamed from: OooO00o */
        public void OooO0O0(BaseResInfo baseResInfo) {
            if (baseResInfo.code != 200) {
                C4203oa.this.OooOoo(0, baseResInfo.message);
            }
        }
    }

    /* JADX INFO: renamed from: z2.oa$OooOo00 */
    public class OooOo00 implements z30<Throwable> {
        public OooOo00() {
        }

        @Override // p285z2.z30
        /* JADX INFO: renamed from: OooO00o */
        public void OooO0O0(Throwable th) {
            C4203oa.this.OooOoo(0, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: z2.oa$Oooo0 */
    public static class Oooo0 {
        public int OooO00o;
        public String OooO0O0;
        public int OooO0OO;

        public Oooo0(int i) {
            this.OooO00o = i;
        }

        public Oooo0(int i, int i2, String str) {
            this.OooO00o = i;
            this.OooO0O0 = str;
            this.OooO0OO = i2;
        }

        public Oooo0(int i, String str) {
            this.OooO00o = i;
            this.OooO0O0 = str;
        }

        public String toString() {
            return "AcquireData{code=" + this.OooO00o + ", message='" + this.OooO0O0 + "', status=" + this.OooO0OO + MessageFormatter.DELIM_STOP;
        }
    }

    /* JADX INFO: renamed from: z2.oa$Oooo000 */
    public class Oooo000 implements Callable<BaseResInfo> {
        public Oooo000() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o */
        public BaseResInfo call() throws Exception {
            BaseRequestValueInfo baseRequestValueInfoOooO00o = C3834ec.OooO0OO().OooO00o(C4203oa.this.getApplication());
            ElfinNativeJni.initBaseParam(C4159n4.OooO0O0(baseRequestValueInfoOooO00o), C4010j3.OooOO0O(), C4010j3.OooOO0());
            DomainNameRequestParamsInfo domainNameRequestParamsInfo = new DomainNameRequestParamsInfo(baseRequestValueInfoOooO00o);
            domainNameRequestParamsInfo.appVersionCode = C4012j5.OooOOo0();
            BaseResInfo baseResInfo = (BaseResInfo) C4159n4.OooO0o0(ElfinNativeJni.requestDomain(C4159n4.OooO0O0(C3834ec.OooO0OO().OooO0oo(InterfaceC4047k3.OooO0O0, domainNameRequestParamsInfo))), BaseResInfo.class);
            if (baseResInfo != null && baseResInfo.code == 200) {
                DomainResult domainResult = (DomainResult) C4159n4.OooO0o0(baseResInfo.message, DomainResult.class);
                if (domainResult == null) {
                    return null;
                }
                ElfinNativeJni.test(domainResult.keys);
                C4125m7.OooO0o0().OooO(domainResult.keys);
                C4010j3.OooO0O0 = domainResult.getApiVersionV();
                C4010j3.OooO0Oo = domainResult.getApiDescKeys();
                C4010j3.OooO0OO = domainResult.getAuthDescKeys();
                C3976i6.OooO0O0 = domainResult.getAppDomainName();
                C3976i6.OooO0OO = domainResult.getAppDomainName();
                C3976i6.OooO0oO = domainResult.getAppDomainName();
                C4010j3.OooOOo(domainResult.getAppDomainName());
                C4010j3.OooOOOo(domainResult.getApp2DomainName());
                C4010j3.OooOOo0(domainResult.getAppDomainName());
                C4496w8.OooO0oo(C4010j3.OooO0O0, C4010j3.OooO0OO, domainResult.keys);
                PhoneConfig phoneConfigOooO0o0 = C3723bc.OooO00o().OooO0o0(C4203oa.this.getApplication(), domainResult.getPhoneConfig());
                if (phoneConfigOooO0o0 != null) {
                    C4203oa.this.Oooo00O(phoneConfigOooO0o0);
                } else {
                    C4019jc.OooO0oO().OooOO0(null);
                    C4203oa.this.OooOoo0();
                }
            }
            return baseResInfo;
        }
    }

    public C4203oa(@NonNull Application application) {
        super(application);
        this.OooO00o = 0L;
        this.OooO0O0 = 0L;
        this.OooO0OO = new MutableLiveData<>();
        this.OooO0Oo = new MutableLiveData<>();
        this.OooO0o0 = 0;
    }

    private void OooOOO(TemplateResponse templateResponse) {
        C3834ec.OooO0OO().OooO0Oo = templateResponse.TemplateType;
        int i = templateResponse.Status;
        if (i == 0 || i == 2) {
            this.OooO0OO.postValue(new Oooo0(i, templateResponse.Remark));
        } else if (i == 1) {
            Oooo0o(21, null);
        } else {
            OooOoo(0, "templateVerifySuccess - fail ");
        }
    }

    private void OooOOo(AppStartupResponse appStartupResponse) {
        AuthorRelatedInfo authorRelatedInfo = appStartupResponse.AuthorInfo;
        int i = authorRelatedInfo.ServicePackStatus;
        if (i == 0) {
            OooOoo(i, authorRelatedInfo.ServicePackPrompt);
            return;
        }
        C4125m7.OooO0o0().OooO0o0 = authorRelatedInfo.EngineToken;
        AppRelatedInfo appRelatedInfo = appStartupResponse.AppInfo;
        C4125m7.OooO0o0().OooO0OO = appRelatedInfo.DailyTryTimes;
        C4125m7.OooO0o0().OooO0O0 = appRelatedInfo.FeedbackTips;
        C4125m7.OooO0o0().OooO0Oo = appRelatedInfo.OnceTryMinute;
        C4125m7.OooO0o0().OooOOO0 = appRelatedInfo.UnbindDeductHours;
        C4246ph.OooO0O0().OooO0o0 = authorRelatedInfo.IsFreeAd;
        if (!TextUtils.isEmpty(appRelatedInfo.ScriptKey)) {
            try {
                C4496w8.OooOOO0(Long.parseLong(appRelatedInfo.ScriptKey));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        C4125m7.OooO0o0().OooO0OO();
        if (appRelatedInfo.BuyRegCodeConfig != null) {
            C4125m7.OooO0o0().OooO0o.addAll(appRelatedInfo.BuyRegCodeConfig);
        }
        if (appRelatedInfo.FlySetting != null) {
            C4246ph.OooO0O0().OooO0OO.addAll(appRelatedInfo.FlySetting);
        }
        if (appRelatedInfo.RecommendSetting != null) {
            C4125m7.OooO0o0().OooO0oo.addAll(appRelatedInfo.RecommendSetting);
        }
        if (authorRelatedInfo.AdList != null) {
            C4246ph.OooO0O0().OooO00o.addAll(authorRelatedInfo.AdList);
        }
        String str = "startupSuc  authorRelatedInfo.ServicePackStatus =" + authorRelatedInfo.ServicePackStatus;
        int i2 = authorRelatedInfo.ServicePackStatus;
        if (i2 == 1) {
            Oooo0OO();
        } else if (i2 == 2) {
            this.OooO0OO.postValue(new Oooo0(3, i2, authorRelatedInfo.ServicePackPrompt));
        }
    }

    private void OooOooO(long j) {
        long j2 = this.OooO00o;
        if (j2 == j || j2 == 0) {
            return;
        }
        OooOoo(0, getApplication().getString(R.string.check_sign_fail));
    }

    public void OooOooo() {
        AssetManager assets = AppContext.OooO00o().getAssets();
        File lcFile = C3718b7.OooO0Oo().OooO0oO().getLcFile();
        File propFile = C3718b7.OooO0Oo().OooO0oO().getPropFile();
        File atcFile = C3718b7.OooO0Oo().OooO0oO().getAtcFile();
        File uipFile = C3718b7.OooO0Oo().OooO0oO().getUipFile();
        File rtdFile = C3718b7.OooO0Oo().OooO0oO().getRtdFile();
        File[] fileArr = {lcFile, propFile, atcFile, uipFile, rtdFile, C3718b7.OooO0Oo().OooO0oO().getInfoFile()};
        String str = "copyFileToAssets copyAssetsToFiles lcFile:" + lcFile.getPath();
        String str2 = "copyFileToAssets copyAssetsToFiles propFile:" + propFile.getPath();
        String str3 = "copyFileToAssets copyAssetsToFiles atcFile:" + atcFile.getPath();
        String str4 = "copyFileToAssets copyAssetsToFiles uipFile:" + uipFile.getPath();
        String str5 = "copyFileToAssets copyAssetsToFiles rtdFile:" + rtdFile.getPath();
        try {
            InputStream[] inputStreamArr = {assets.open(InterfaceC3865f6.OooO00o), assets.open(InterfaceC3865f6.OooO0O0), assets.open(InterfaceC3865f6.OooO0OO), assets.open(InterfaceC3865f6.OooO0o0), assets.open(InterfaceC3865f6.OooO0o), assets.open(InterfaceC3865f6.OooO0oo)};
            for (int i = 0; i < 6; i++) {
                if (inputStreamArr[i] != null) {
                    C4048k4.OooO0O0(inputStreamArr[i], fileArr[i]);
                }
            }
        } catch (IOException e) {
            String str6 = "copyFileToAssets copyAssetsToFiles IOException:" + e.getMessage();
            e.printStackTrace();
        }
    }

    public void Oooo00O(PhoneConfig phoneConfig) {
        C3725be.OooO0oo().OooO0oO(phoneConfig.getImageUrl(), getApplication().getCacheDir().getAbsolutePath(), C4011j4.OooOOO(phoneConfig.getImageUrl()), new OooO00o(phoneConfig, getApplication().getCacheDir() + File.separator + C4011j4.OooOOO(phoneConfig.getImageUrl())));
    }

    private void Oooo00o() {
        C3827e5.OooO00o().OooO0oO(new Oooo000()).OooOOO(new OooOo()).OooOO0(new OooOo00());
    }

    private void Oooo0OO() {
        C3940h7.OooO0Oo(new OooO0O0(), false);
    }

    private void Oooo0o(int i, String str) {
        String str2 = "obtainMessage  --> messageNotify=" + i;
        switch (i) {
            case 19:
                OoooO0(str);
                break;
            case 20:
                OoooO00(str);
                break;
            case 21:
                Oooo0o0();
                break;
        }
    }

    private void Oooo0o0() {
        C3827e5.OooO00o().OooO0o(new OooO0o());
    }

    public void Oooo0oO(String str, int i) throws JSONException {
        String str2 = "parseJson --> templateResponse=" + str + ",messageNotify=" + i;
        if (TextUtils.isEmpty(str)) {
            OooOoo(0, getApplication().getString(R.string.response_data_null));
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("Data");
        int i2 = jSONObject.getInt("Code");
        String string = jSONObject.getString(C3902g6.OooO0Oo);
        String str3 = "parseJson --> code 4=" + i2;
        if ((i2 != 200 || TextUtils.isEmpty(jSONObject2.toString())) && (i2 == 1100 || i2 == 1200 || i2 == 1300 || i2 == 604 || i2 == 602)) {
            OooOoo(0, string);
        } else {
            Oooo0o(i, jSONObject2.toString());
        }
    }

    private void OoooO0(String str) {
        TemplateResponse templateResponse = (TemplateResponse) C4159n4.OooO0o0(str, TemplateResponse.class);
        if (templateResponse == null) {
            OooOoo(0, "模板无数据");
            return;
        }
        long j = this.OooO00o;
        long j2 = templateResponse.ClientTimestamp;
        if (j == j2) {
            OooOOO(templateResponse);
        } else {
            OooOooO(j2);
        }
    }

    private void OoooO00(String str) {
        AppStartupResponse appStartupResponse = (AppStartupResponse) C4159n4.OooO0o0(str, AppStartupResponse.class);
        if (appStartupResponse == null) {
            OooOoo(0, "startupResponse - startup - fail ");
            return;
        }
        long j = this.OooO0O0;
        long j2 = appStartupResponse.ClientTimestamp;
        if (j == j2) {
            OooOOo(appStartupResponse);
        } else {
            OooOooO(j2);
        }
    }

    private void OoooO0O() {
        C3827e5.OooO00o().OooO0o(new OooOOOO()).OooOOO(new OooOOO()).OooOO0(new OooOOO0());
    }

    public void OooOoo(int i, String str) {
        this.OooO0OO.postValue(new Oooo0(0, i, str));
    }

    public void OooOoo0() {
        if (!C4381t4.OooOO0(getApplication())) {
            this.OooO0OO.postValue(new Oooo0(-1));
        } else {
            C3977i7.OooO().OooOOO0(C3718b7.OooO0Oo().OooO0OO(), C3718b7.OooO0Oo().OooO0o0(), C3718b7.OooO0Oo().OooO0o());
            C3827e5.OooO00o().OooO0o(new OooO0OO());
        }
    }

    public void Oooo(int i) {
    }

    public LiveData<Oooo0> Oooo0() {
        return this.OooO0OO;
    }

    public void Oooo000() {
        C3827e5.OooO00o().OooO0o(new OooOO0O()).OooOOO(new OooOO0()).OooOO0(new OooO());
    }

    public MutableLiveData<PhoneConfig> Oooo0O0() {
        return this.OooO0Oo;
    }

    public void Oooo0oo() {
        if (C4381t4.OooOO0(getApplication())) {
            Oooo00o();
        } else {
            this.OooO0OO.postValue(new Oooo0(-1));
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }
}
