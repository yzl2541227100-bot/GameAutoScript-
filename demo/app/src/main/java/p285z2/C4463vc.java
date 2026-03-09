package p285z2;

import android.content.Context;
import android.util.Log;
import com.cyjh.http.bean.NotifyMsgBean;
import com.cyjh.http.bean.request.BaseRequestValueInfo;
import com.cyjh.http.bean.response.NoticeBean;
import com.cyjh.http.bean.response.NoticeListBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.vc */
/* JADX INFO: loaded from: classes2.dex */
public class C4463vc extends AbstractC3871fc {
    private InterfaceC3946hd OooO0O0;
    private long OooO0OO;

    public C4463vc(InterfaceC3946hd interfaceC3946hd) {
        this.OooO0O0 = interfaceC3946hd;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        NoticeListBean noticeListBean;
        List<NoticeBean> list;
        try {
            String str = (String) obj;
            String str2 = "com.cyjh.share.NoticeListPresenter--uiDataSuccess1:" + str;
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("Data");
            if (jSONObject.getInt("Code") != 200 || (noticeListBean = (NoticeListBean) C4159n4.OooO0o0(jSONObject2.toString(), NoticeListBean.class)) == null || (list = noticeListBean.NoticeList) == null || list.size() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (NoticeBean noticeBean : noticeListBean.NoticeList) {
                NotifyMsgBean notifyMsgBean = new NotifyMsgBean();
                notifyMsgBean.f15894ID = String.valueOf(noticeBean.NoticeId);
                notifyMsgBean.NoticeTitle = noticeBean.NoticeTitle;
                notifyMsgBean.NoticeContent = noticeBean.NoticeContent;
                notifyMsgBean.NoticeTime = C3688ae.Oooo0(noticeBean.NoticeTime, "yyyy-MM-dd HH:mm:ss");
                notifyMsgBean.DescriptionType = String.valueOf(noticeBean.DescriptionType);
                notifyMsgBean.NoticeDescription = noticeBean.NoticeDescription;
                boolean z = true;
                if (noticeBean.IsShowNoticeBar != 1) {
                    z = false;
                }
                notifyMsgBean.IsSendMessage = z;
                arrayList.add(notifyMsgBean);
            }
            this.OooO0O0.OooO0o0(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("zzz", "com.cyjh.share.NoticeListPresenter--uiDataSuccess2:" + e.getMessage());
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        Log.e("zzz", "com.cyjh.share.NoticeListPresenter--onErrorResponse:" + str);
    }

    public void OooO0OO(Context context) {
        try {
            BaseRequestValueInfo baseRequestValueInfoOooO00o = C3834ec.OooO0OO().OooO00o(context);
            String string = C4010j3.OooO0oo(InterfaceC4047k3.Oooo0, "List").build().toString();
            Map<String, String> mapOooO = C3834ec.OooO0OO().OooO(string, baseRequestValueInfoOooO00o);
            this.OooO0OO = C3834ec.OooO0o;
            String str = "com.cyjh.share.NoticeListPresenter--loadAd:" + string;
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, mapOooO);
        } catch (Exception e) {
            Log.e("zzz", "com.cyjh.share.NoticeListPresenter--loadAd:" + e.getMessage());
        }
    }

    public void OooO0o() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
        }
    }
}
