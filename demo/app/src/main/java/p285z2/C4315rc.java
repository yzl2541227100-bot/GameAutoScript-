package p285z2;

import android.content.Context;
import android.util.Log;
import com.cyjh.http.bean.request.FeedbackRequestInfo;

/* JADX INFO: renamed from: z2.rc */
/* JADX INFO: loaded from: classes2.dex */
public class C4315rc extends AbstractC3871fc {
    private InterfaceC3835ed OooO0O0;

    public C4315rc(InterfaceC3835ed interfaceC3835ed) {
        this.OooO0O0 = interfaceC3835ed;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        try {
            this.OooO0O0.OooOO0o((String) obj);
        } catch (Exception e) {
            Log.e("zzz", "FeedbackCommitDataPresenter--uiDataSuccess:" + e.getMessage());
            this.OooO0O0.onFail(e.getMessage());
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        Log.e("zzz", "FeedbackCommitDataPresenter--onErrorResponse:" + str);
        this.OooO0O0.onFail(str);
    }

    public void OooO0OO(Context context, FeedbackRequestInfo feedbackRequestInfo) {
        try {
            String string = C4010j3.OooO0oo(InterfaceC4047k3.OooooO0, InterfaceC4047k3.OooooOO).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, feedbackRequestInfo));
        } catch (Exception e) {
            Log.e("zzz", "FeedbackCommitDataPresenter --异常：" + e.getMessage());
        }
    }

    public void OooO0o() {
        this.OooO00o.OooOOO(getClass().getCanonicalName());
    }
}
