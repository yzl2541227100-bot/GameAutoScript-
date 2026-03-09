package p285z2;

import android.content.Context;
import android.util.Log;
import com.cyjh.http.bean.request.BaseRequestValueInfo;
import com.cyjh.http.bean.request.NoticeDetailsRequestParams;
import com.cyjh.http.bean.response.NoticeBean;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.uc */
/* JADX INFO: loaded from: classes2.dex */
public class C4426uc extends AbstractC3871fc {
    private InterfaceC3909gd OooO0O0;
    private long OooO0OO;

    public C4426uc(InterfaceC3909gd interfaceC3909gd) {
        this.OooO0O0 = interfaceC3909gd;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        NoticeBean noticeBean;
        try {
            JSONObject jSONObject = new JSONObject((String) obj);
            JSONObject jSONObject2 = jSONObject.getJSONObject("Data");
            if (jSONObject.getInt("Code") == 200 && (noticeBean = (NoticeBean) C4159n4.OooO0o0(jSONObject2.toString(), NoticeBean.class)) != null && noticeBean.ClientTimestamp == this.OooO0OO) {
                this.OooO0O0.OooO0OO(noticeBean);
            } else {
                InterfaceC3909gd interfaceC3909gd = this.OooO0O0;
                interfaceC3909gd.onFail();
            }
        } catch (Exception e) {
            Log.e("zzz", "com.cyjh.share.NoticeDetailsPresenter--uiDataSuccess:" + e.getMessage());
            this.OooO0O0.onFail();
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        Log.e("zzz", "com.cyjh.share.NoticeDetailsPresenter--onErrorResponse:" + str);
        this.OooO0O0.onFail();
    }

    public void OooO0OO(Context context, long j) {
        try {
            BaseRequestValueInfo baseRequestValueInfoOooO00o = C3834ec.OooO0OO().OooO00o(context);
            this.OooO0OO = C3834ec.OooO0o;
            NoticeDetailsRequestParams noticeDetailsRequestParams = new NoticeDetailsRequestParams(baseRequestValueInfoOooO00o);
            noticeDetailsRequestParams.NoticeId = j;
            String string = C4010j3.OooO0oo(InterfaceC4047k3.Oooo0, "Detail").build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, noticeDetailsRequestParams));
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
