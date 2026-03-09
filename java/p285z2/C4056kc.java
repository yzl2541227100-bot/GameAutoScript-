package p285z2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.cyjh.http.C2619R;
import com.cyjh.http.bean.request.BaseRequestValueInfo;
import com.cyjh.http.bean.response.AppStartupResponse;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.kc */
/* JADX INFO: loaded from: classes2.dex */
public class C4056kc extends AbstractC3871fc {
    private long OooO0O0;
    private InterfaceC3761cd OooO0OO;

    public C4056kc(InterfaceC3761cd interfaceC3761cd) {
        this.OooO0OO = interfaceC3761cd;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        InterfaceC3761cd interfaceC3761cd;
        String string;
        try {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                interfaceC3761cd = this.OooO0OO;
                string = C3834ec.OooO0OO().OooO0O0().getResources().getString(C2619R.string.json_data_null);
            } else {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("Data");
                int i = jSONObject.getInt("Code");
                string = jSONObject.getString(C3902g6.OooO0Oo);
                if (i == 200) {
                    AppStartupResponse appStartupResponse = (AppStartupResponse) C4159n4.OooO0o0(jSONObject2.toString(), AppStartupResponse.class);
                    if (appStartupResponse != null && this.OooO0O0 == appStartupResponse.ClientTimestamp) {
                        this.OooO0OO.OooOOo(appStartupResponse);
                        return;
                    } else {
                        interfaceC3761cd = this.OooO0OO;
                        string = C3834ec.OooO0OO().OooO0O0().getResources().getString(C2619R.string.timestamp_diff_except);
                    }
                } else {
                    interfaceC3761cd = this.OooO0OO;
                }
            }
            interfaceC3761cd.OooOOo0(string);
        } catch (Exception e) {
            this.OooO0OO.OooOOo0(e.getMessage());
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        Log.e("zzz", "com.cyjh.share.AppStartupPresenter--onErrorResponse:" + str);
        this.OooO0OO.OooOOo0(str);
    }

    public void OooO0OO(Context context) {
        try {
            BaseRequestValueInfo baseRequestValueInfoOooO00o = C3834ec.OooO0OO().OooO00o(context);
            this.OooO0O0 = C3834ec.OooO0o;
            String string = C4010j3.OooO0oO(InterfaceC4047k3.OooOo).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, baseRequestValueInfoOooO00o));
        } catch (Exception unused) {
        }
    }

    public void OooO0o() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
        }
    }
}
