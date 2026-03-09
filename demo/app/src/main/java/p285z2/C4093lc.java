package p285z2;

import android.content.Context;
import android.util.Log;
import com.cyjh.http.C2619R;
import com.cyjh.http.bean.request.ScriptStartRunParams;
import com.cyjh.http.bean.request.ScriptStopRunParams;
import com.cyjh.http.bean.request.StatisticsRequestParamsInfo;
import com.cyjh.http.bean.response.ScriptStartRunResponse;

/* JADX INFO: renamed from: z2.lc */
/* JADX INFO: loaded from: classes2.dex */
public class C4093lc extends AbstractC3871fc {
    private static C4093lc OooO0Oo;
    private OooO00o OooO0O0;
    private OooO0O0 OooO0OO;

    /* JADX INFO: renamed from: z2.lc$OooO00o */
    public interface OooO00o {
        void OooO00o(Object obj);
    }

    /* JADX INFO: renamed from: z2.lc$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(Object obj);

        void OooO0O0();
    }

    private C4093lc() {
    }

    private void OooO0OO() {
        OooO0O0 oooO0O0 = this.OooO0OO;
        if (oooO0O0 != null) {
            oooO0O0.OooO0O0();
        }
    }

    public static C4093lc OooO0oo() {
        if (OooO0Oo == null) {
            synchronized (C4093lc.class) {
                if (OooO0Oo == null) {
                    OooO0Oo = new C4093lc();
                }
            }
        }
        return OooO0Oo;
    }

    public void OooO(Context context, int i, int i2, long j) {
        try {
            StatisticsRequestParamsInfo statisticsRequestParamsInfo = new StatisticsRequestParamsInfo(C3834ec.OooO0OO().OooO00o(context));
            statisticsRequestParamsInfo.Action = i2;
            statisticsRequestParamsInfo.BussinessId = i;
            statisticsRequestParamsInfo.RelationId = j;
            statisticsRequestParamsInfo.CloudPhoneType = C3723bc.OooO00o().OooO0O0();
            String string = C4010j3.OooO0oO(InterfaceC4047k3.OooO0oo).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, statisticsRequestParamsInfo));
        } catch (Exception unused) {
        }
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        try {
            OooO00o oooO00o = this.OooO0O0;
            if (oooO00o != null) {
                oooO00o.OooO00o(obj);
            }
            if (this.OooO0OO != null) {
                ScriptStartRunResponse scriptStartRunResponse = (ScriptStartRunResponse) C4159n4.OooO0o0((String) obj, ScriptStartRunResponse.class);
                long j = ScriptStartRunResponse.sClientTime;
                if (j != 0 && j != scriptStartRunResponse.Data.ClientTimestamp) {
                    scriptStartRunResponse.Code = 602;
                    scriptStartRunResponse.Message = C3834ec.OooO0OO().OooO0O0().getResources().getString(C2619R.string.check_sign_fail);
                    obj = C4159n4.OooO0O0(scriptStartRunResponse);
                    ScriptStartRunResponse.sClientTime = 0L;
                }
                this.OooO0OO.OooO00o(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
            OooO0OO();
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        OooO0OO();
    }

    public void OooO0o() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
            this.OooO00o.OooOOO(getClass().getSimpleName());
            this.OooO00o.OooOOO(getClass().getName());
        }
    }

    public void OooO0oO() {
        this.OooO0O0 = null;
        this.OooO0OO = null;
    }

    public void OooOO0(Context context, String str, String str2, String str3) {
        try {
            ScriptStartRunParams scriptStartRunParams = new ScriptStartRunParams(C3834ec.OooO0OO().OooO00o(context));
            scriptStartRunParams.RegCode = str;
            scriptStartRunParams.ScriptId = str2;
            ScriptStartRunResponse.sClientTime = scriptStartRunParams.ClientTimestamp;
            String string = C4010j3.OooO0oo(InterfaceC4047k3.OoooO00, str3).build().toString();
            String str4 = "scriptStartRunParams:" + scriptStartRunParams.toString();
            String str5 = "url1:" + string;
            String str6 = "url222:" + string;
            this.OooO00o.OooOO0(context, getClass().getSimpleName(), string, C3834ec.OooO0OO().OooO(string, scriptStartRunParams));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OooOO0O(Context context, String str) {
        try {
            ScriptStopRunParams scriptStopRunParams = new ScriptStopRunParams(C3834ec.OooO0OO().OooO00o(context));
            scriptStopRunParams.RunGuid = str;
            String string = C4010j3.OooO0oo(InterfaceC4047k3.OoooO00, InterfaceC4047k3.OoooO).build().toString();
            this.OooO00o.OooOO0(context, getClass().getName(), string, C3834ec.OooO0OO().OooO(string, scriptStopRunParams));
        } catch (Exception e) {
            Log.e("zzz", "AppStatisticsPresenter--loadScriptStopRunStatistics:" + e.getMessage());
            OooO0OO();
        }
    }

    public void OooOO0o() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
        }
    }

    public C4093lc OooOOO(OooO0O0 oooO0O0) {
        this.OooO0OO = oooO0O0;
        return this;
    }

    public C4093lc OooOOO0(OooO00o oooO00o) {
        this.OooO0O0 = oooO00o;
        return this;
    }
}
