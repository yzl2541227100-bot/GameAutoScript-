package p285z2;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.cyjh.http.bean.response.NoticeBean;
import com.ywfzjbcy.R;

/* JADX INFO: renamed from: z2.fa */
/* JADX INFO: loaded from: classes.dex */
public class C3869fa extends AbstractC3973i3 implements InterfaceC3909gd {
    private TextView OoooOoO;
    private TextView OoooOoo;
    private WebView Ooooo00;
    private LinearLayout Ooooo0o;
    private C4426uc OooooO0;

    private void OooOo(View view) {
        this.OoooOoO = (TextView) view.findViewById(R.id.id_tv_msg_title);
        this.OoooOoo = (TextView) view.findViewById(R.id.id_tv_msg_time);
        this.Ooooo00 = (WebView) view.findViewById(R.id.id_msg_web_view);
        this.Ooooo0o = (LinearLayout) view.findViewById(R.id.incl_loading);
    }

    private void OooOo0o(NoticeBean noticeBean) {
        this.OoooOoO.setText(noticeBean.NoticeTitle);
        this.OoooOoo.setText(C3688ae.Oooo0(noticeBean.NoticeTime, "yyyy-MM-dd HH:mm:ss"));
        this.Ooooo00.loadDataWithBaseURL(null, noticeBean.NoticeContent, "text/html", "utf-8", null);
        this.Ooooo00.getSettings().setJavaScriptEnabled(true);
        this.Ooooo00.setWebChromeClient(new WebChromeClient());
    }

    public static C3869fa OooOoO0(long j) {
        C3869fa c3869fa = new C3869fa();
        Bundle bundle = new Bundle();
        bundle.putLong(C3869fa.class.getCanonicalName(), j);
        c3869fa.setArguments(bundle);
        return c3869fa;
    }

    @Override // p285z2.InterfaceC3909gd
    public void OooO0OO(NoticeBean noticeBean) {
        OooOo0o(noticeBean);
        this.Ooooo0o.setVisibility(8);
    }

    @Override // p285z2.AbstractC3973i3
    public int OooOo00() {
        return R.layout.fragment_msg_detail;
    }

    @Override // p285z2.AbstractC3973i3, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getArguments() != null) {
            long j = getArguments().getLong(C3869fa.class.getCanonicalName());
            if (j != 0) {
                C4426uc c4426uc = new C4426uc(this);
                this.OooooO0 = c4426uc;
                c4426uc.OooO0OO(getActivity(), j);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C4426uc c4426uc = this.OooooO0;
        if (c4426uc != null) {
            c4426uc.OooO0o();
        }
    }

    @Override // p285z2.InterfaceC3909gd
    public void onFail() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C3691ah.OooO0OO(C3869fa.class.getCanonicalName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C3691ah.OooO0Oo(C3869fa.class.getCanonicalName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        OooOo(view);
    }
}
