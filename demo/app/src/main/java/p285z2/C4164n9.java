package p285z2;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.cyjh.http.bean.NotifyMsgBean;
import com.ywfzjbcy.R;

/* JADX INFO: renamed from: z2.n9 */
/* JADX INFO: loaded from: classes.dex */
public class C4164n9 extends OooOOO0<NotifyMsgBean> {
    public C4164n9(RecyclerView recyclerView, int i) {
        super(recyclerView, i);
    }

    @Override // p285z2.OooOOO0
    /* JADX INFO: renamed from: OooOo0o, reason: merged with bridge method [inline-methods] */
    public void OooO0oO(OooOOOO oooOOOO, int i, NotifyMsgBean notifyMsgBean) {
        if (notifyMsgBean != null) {
            TextView textView = (TextView) oooOOOO.OooO0oO(R.id.id_tv_msg_des);
            ImageView imageView = (ImageView) oooOOOO.OooO0oO(R.id.id_img_msg);
            oooOOOO.OooOoo0(R.id.id_tv_msg_title, notifyMsgBean.NoticeTitle);
            oooOOOO.OooOoo0(R.id.id_tv_msg_time, notifyMsgBean.NoticeTime);
            if (notifyMsgBean.DescriptionType.equals(String.valueOf(1))) {
                oooOOOO.OooOoo0(R.id.id_tv_msg_des, notifyMsgBean.NoticeDescription);
                imageView.setVisibility(8);
                textView.setVisibility(0);
            } else if (notifyMsgBean.DescriptionType.equals(String.valueOf(2))) {
                textView.setVisibility(8);
                imageView.setVisibility(0);
                C4122m4.OooO(this.OooO0O0, notifyMsgBean.NoticeDescription, imageView);
            }
        }
    }
}
