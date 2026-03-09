package p285z2;

import android.content.Context;
import android.util.Log;
import com.cyjh.http.bean.request.UnbindRegCodeRequestInfo;
import com.cyjh.http.bean.response.RegCodeInfoResponse;

/* JADX INFO: renamed from: z2.yc */
/* JADX INFO: loaded from: classes2.dex */
public class C4574yc extends AbstractC3871fc {
    private InterfaceC4057kd OooO0O0;

    public C4574yc(InterfaceC4057kd interfaceC4057kd) {
        this.OooO0O0 = interfaceC4057kd;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        String str = "UnbindRegisterCodePresenter--uiDataSuccess--" + obj;
        try {
            RegCodeInfoResponse regCodeInfoResponse = (RegCodeInfoResponse) C4159n4.OooO0o0((String) obj, RegCodeInfoResponse.class);
            if (regCodeInfoResponse != null) {
                this.OooO0O0.OooO(regCodeInfoResponse);
            } else {
                this.OooO0O0.OooO0Oo("解绑注册码解析Json异常");
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.OooO0O0.OooO0Oo("解绑注册码解析异常:" + e.getMessage());
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        Log.e("zzz", "UnbindRegisterCodePresenter--onErrorResponse--" + str);
        this.OooO0O0.OooO0Oo(str);
    }

    public void OooO0OO() {
        this.OooO00o.OooOOO(getClass().getCanonicalName());
    }

    public void OooO0o(String str, Context context) {
        try {
            UnbindRegCodeRequestInfo unbindRegCodeRequestInfo = new UnbindRegCodeRequestInfo(C3834ec.OooO0OO().OooO00o(context));
            unbindRegCodeRequestInfo.RegCode = str;
            String string = C4010j3.OooO0oo(InterfaceC4047k3.OoooO00, InterfaceC4047k3.o000oOoO).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, unbindRegCodeRequestInfo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
