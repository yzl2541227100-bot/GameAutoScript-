package p285z2;

import android.content.Context;
import android.util.Log;
import com.cyjh.http.bean.request.BaseRequestValueInfo;
import com.cyjh.http.bean.response.AliCloudServerResponse;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.tc */
/* JADX INFO: loaded from: classes2.dex */
public class C4389tc extends AbstractC3871fc {
    private long OooO0O0;

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject((String) obj);
            JSONObject jSONObject2 = jSONObject.getJSONObject("Data");
            if (jSONObject.getInt("Code") == 200 && C3834ec.OooO0o == this.OooO0O0) {
                C3834ec.OooO0OO().OooO0OO = (AliCloudServerResponse) C4159n4.OooO0o0(jSONObject2.toString(), AliCloudServerResponse.class);
            }
        } catch (Exception e) {
            Log.e("zzz", "GetTokenAliCloudPresenter--uiDataSuccess exception-" + e.getMessage());
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        Log.e("zzz", "GetTokenAliCloudPresenter--onErrorResponse--" + str);
    }

    public void OooO0OO(Context context) {
        try {
            BaseRequestValueInfo baseRequestValueInfoOooO00o = C3834ec.OooO0OO().OooO00o(context);
            this.OooO0O0 = C3834ec.OooO0o;
            String string = C4010j3.OooO0oo(InterfaceC4047k3.OoooOoO, InterfaceC4047k3.OoooOoo).build().toString();
            this.OooO00o.OooOO0(context, C4389tc.class.getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, baseRequestValueInfoOooO00o));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OooO0o() {
        this.OooO00o.OooOOO(C4389tc.class.getCanonicalName());
    }
}
