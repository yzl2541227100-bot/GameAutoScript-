package p285z2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.cyjh.http.C2619R;
import com.cyjh.http.bean.request.BaseRequestValueInfo;
import com.cyjh.http.bean.response.TemplateResponse;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.xc */
/* JADX INFO: loaded from: classes2.dex */
public class C4537xc extends AbstractC3871fc {
    private InterfaceC4020jd OooO0O0;
    private long OooO0OO;

    public C4537xc(InterfaceC4020jd interfaceC4020jd) {
        this.OooO0O0 = interfaceC4020jd;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        InterfaceC4020jd interfaceC4020jd;
        String string;
        try {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                interfaceC4020jd = this.OooO0O0;
                string = C3834ec.OooO0OO().OooO0O0().getResources().getString(C2619R.string.json_data_null);
            } else {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("Data");
                int i = jSONObject.getInt("Code");
                string = jSONObject.getString(C3902g6.OooO0Oo);
                if (i == 200) {
                    TemplateResponse templateResponse = (TemplateResponse) C4159n4.OooO0o0(jSONObject2.toString(), TemplateResponse.class);
                    if (templateResponse != null && this.OooO0OO == templateResponse.ClientTimestamp) {
                        this.OooO0O0.OooOOO(templateResponse);
                        return;
                    } else {
                        interfaceC4020jd = this.OooO0O0;
                        string = C3834ec.OooO0OO().OooO0O0().getResources().getString(C2619R.string.timestamp_diff_except);
                    }
                } else {
                    interfaceC4020jd = this.OooO0O0;
                }
            }
            interfaceC4020jd.OooO0oO(string);
        } catch (Exception e) {
            e.printStackTrace();
            this.OooO0O0.OooO0oO(e.getMessage());
            Log.e("zzz", "com.cyjh.share.TemplateVerifyPresenter--uiDataSuccess:Exception--" + e.getMessage());
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        this.OooO0O0.OooO0oO(str);
    }

    public void OooO0OO(Context context) {
        try {
            BaseRequestValueInfo baseRequestValueInfoOooO00o = C3834ec.OooO0OO().OooO00o(context);
            String string = C4010j3.OooO0oO(InterfaceC4047k3.OooO0oO).build().toString();
            Map<String, String> mapOooO = C3834ec.OooO0OO().OooO(string, baseRequestValueInfoOooO00o);
            this.OooO0OO = C3834ec.OooO0o;
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, mapOooO);
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
