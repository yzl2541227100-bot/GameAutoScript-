package p285z2;

import android.content.Context;
import com.cyjh.http.bean.request.BindRegCodeRequestInfo;
import com.cyjh.http.bean.response.BaseResponseInfo;
import com.cyjh.http.bean.response.BindRegCodeResponse;

/* JADX INFO: renamed from: z2.nc */
/* JADX INFO: loaded from: classes2.dex */
public class C4167nc extends AbstractC3871fc {
    private InterfaceC3798dd OooO0O0;

    public C4167nc(InterfaceC3798dd interfaceC3798dd) {
        this.OooO0O0 = interfaceC3798dd;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        try {
            BindRegCodeResponse bindRegCodeResponse = (BindRegCodeResponse) C4159n4.OooO0o0((String) obj, BindRegCodeResponse.class);
            if (bindRegCodeResponse == null) {
                this.OooO0O0.OooOOOO(new BaseResponseInfo(-1, "getData下发json数据为null"));
            } else {
                this.OooO0O0.OooOOoo(bindRegCodeResponse);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.OooO0O0.OooOOOO(new BaseResponseInfo(-1, e.getMessage()));
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        this.OooO0O0.OooOOOO(new BaseResponseInfo(-1, str));
    }

    public void OooO0OO(String str, Context context, int i, String str2) {
        try {
            BindRegCodeRequestInfo bindRegCodeRequestInfo = new BindRegCodeRequestInfo(C3834ec.OooO0OO().OooO00o(context));
            bindRegCodeRequestInfo.RegCode = str;
            bindRegCodeRequestInfo.OldRegCode = str2;
            bindRegCodeRequestInfo.IsSuperpose = i;
            String string = C4010j3.OooO0oo(InterfaceC4047k3.OoooO00, InterfaceC4047k3.OoooOO0).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, bindRegCodeRequestInfo));
            String str3 = "BindRegisterCodePresenter--bindRegCode--" + string;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OooO0o() {
        this.OooO00o.OooOOO(getClass().getCanonicalName());
    }
}
