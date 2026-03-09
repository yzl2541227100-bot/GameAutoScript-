package p285z2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cyjh.elfin.entity.MsgItem;
import com.cyjh.elfin.p200ui.activity.MessageDetailActivity;
import com.cyjh.http.bean.NotifyMsgBean;
import com.ywfzjbcy.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: z2.ga */
/* JADX INFO: loaded from: classes.dex */
public class C3906ga extends AbstractC3973i3 {
    private RecyclerView OoooOoO;
    private OooOOO0 OoooOoo;
    private List<NotifyMsgBean> Ooooo00;
    private TextView Ooooo0o;
    private OooOO0 OooooO0 = new OooO00o();

    /* JADX INFO: renamed from: z2.ga$OooO00o */
    public class OooO00o implements OooOO0 {
        public OooO00o() {
        }

        @Override // p285z2.OooOO0
        public void OooO00o(ViewGroup viewGroup, View view, int i) {
            NotifyMsgBean notifyMsgBean = (NotifyMsgBean) C3906ga.this.OoooOoo.getItem(i);
            Intent intent = new Intent(C3906ga.this.getActivity(), (Class<?>) MessageDetailActivity.class);
            intent.putExtra(MessageDetailActivity.class.getCanonicalName(), Long.parseLong(notifyMsgBean.f15894ID));
            C3906ga.this.startActivity(intent);
        }
    }

    private void OooOo(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.id_recycler_view);
        this.OoooOoO = recyclerView;
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        this.OoooOoO.setHasFixedSize(true);
        this.OoooOoO.setLayoutManager(new LinearLayoutManager(getActivity()));
        C4164n9 c4164n9 = new C4164n9(this.OoooOoO, R.layout.adapter_msg_notify);
        this.OoooOoo = c4164n9;
        c4164n9.OooOo0(this.OooooO0);
        this.Ooooo0o = (TextView) view.findViewById(R.id.id_tv_no_msg);
    }

    public static C3906ga OooOoO(ArrayList<NotifyMsgBean> arrayList) {
        C3906ga c3906ga = new C3906ga();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(C3902g6.OooO0OO, arrayList);
        c3906ga.setArguments(bundle);
        return c3906ga;
    }

    private void OooOoO0() {
        List<NotifyMsgBean> list = this.Ooooo00;
        if (list == null || list.size() <= 0) {
            this.Ooooo0o.setVisibility(0);
            this.OoooOoO.setVisibility(8);
        } else {
            this.Ooooo0o.setVisibility(8);
            this.OoooOoO.setVisibility(0);
            this.OoooOoo.OooOOO(this.Ooooo00);
            this.OoooOoO.setAdapter(this.OoooOoo);
        }
    }

    @Override // p285z2.AbstractC3973i3
    public int OooOo00() {
        return R.layout.fragment_msg_push;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        j10.OooO0o().OooOoO0(this);
    }

    @p10(threadMode = ThreadMode.MAIN)
    public void onMessageMainThread(MsgItem msgItem) {
        if (msgItem.getMsgType() != 1002) {
            return;
        }
        this.OoooOoo.OooO0o();
        this.Ooooo0o.setVisibility(0);
        this.OoooOoO.setVisibility(8);
        j10.OooO0o().OooOOOO(new MsgItem(1003));
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C3691ah.OooO0OO(C3906ga.class.getCanonicalName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C3691ah.OooO0Oo(C3906ga.class.getCanonicalName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        j10.OooO0o().OooOo00(this);
        if (arguments != null) {
            this.Ooooo00 = arguments.getParcelableArrayList(C3902g6.OooO0OO);
        }
        OooOo(view);
        OooOoO0();
    }
}
