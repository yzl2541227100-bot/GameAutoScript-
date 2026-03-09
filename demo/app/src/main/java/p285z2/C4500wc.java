package p285z2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.cyjh.http.bean.request.QueryRegCodeRequestInfo;
import com.cyjh.http.bean.response.RegCodeInfoResponse;

/* JADX INFO: renamed from: z2.wc */
/* JADX INFO: loaded from: classes2.dex */
public class C4500wc extends AbstractC3871fc {
    private InterfaceC3983id OooO0O0;

    public C4500wc(InterfaceC3983id interfaceC3983id) {
        this.OooO0O0 = interfaceC3983id;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        try {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                this.OooO0O0.OooO0oo("bind getData下发json数据为null");
            } else {
                this.OooO0O0.OooOOOo((RegCodeInfoResponse) C4159n4.OooO0o0(str, RegCodeInfoResponse.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.OooO0O0.OooO0oo("json解析抛异常：" + e.getMessage());
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        this.OooO0O0.OooO0oo(str);
    }

    public void OooO0OO() {
        this.OooO00o.OooOOO(getClass().getCanonicalName());
    }

    public void OooO0o(String str, String str2, Context context) {
        try {
            QueryRegCodeRequestInfo queryRegCodeRequestInfo = new QueryRegCodeRequestInfo(C3834ec.OooO0OO().OooO00o(context));
            queryRegCodeRequestInfo.RegCode = str;
            queryRegCodeRequestInfo.OldRegCode = str2;
            String string = C4010j3.OooO0oo(InterfaceC4047k3.OoooO00, InterfaceC4047k3.OoooOOO).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, queryRegCodeRequestInfo));
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("zzz", "QueryRegCodeInfoPresenter--queryRegCodeInfo--" + e.getMessage());
        }
    }
}
