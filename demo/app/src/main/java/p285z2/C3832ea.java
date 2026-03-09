package p285z2;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.ywfzjbcy.R;
import java.io.File;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: z2.ea */
/* JADX INFO: loaded from: classes.dex */
public class C3832ea extends AbstractC3973i3 {
    public static final String Ooooo0o = C3832ea.class.getSimpleName();
    private ScrollView OoooOoO;
    private WebView OoooOoo;
    private TextView Ooooo00;

    private void OooOo() {
        String str;
        File file = new File(getContext().getFilesDir() + File.separator + C3902g6.o0ooOOo, InterfaceC3865f6.OooO0o);
        StringBuilder sb = new StringBuilder();
        sb.append("webViewLoad --> sdCardRtdFile path =");
        sb.append(file.getAbsolutePath());
        sb.toString();
        if (C3718b7.OooO0Oo().OooO0O0) {
            str = "file://" + file.getAbsolutePath();
        } else {
            str = "file:///android_asset/script.rtd";
        }
        if (C3718b7.OooO0Oo().OooO0O0 && (!file.exists() || file.length() == 0)) {
            this.OoooOoO.setVisibility(0);
            this.OoooOoo.setVisibility(8);
        } else {
            this.OoooOoo.setVisibility(0);
            this.OoooOoO.setVisibility(8);
            this.OoooOoo.loadUrl(str);
        }
    }

    private void OooOo0o() {
        if (getView() == null) {
            return;
        }
        View view = getView();
        this.OoooOoO = (ScrollView) view.findViewById(R.id.scrollview_scriptdescription);
        this.OoooOoo = (WebView) view.findViewById(R.id.webview_scriptdescription);
        this.Ooooo00 = (TextView) view.findViewById(R.id.tv_description);
        this.OoooOoo.getSettings().setJavaScriptEnabled(true);
        OooOo();
    }

    @Override // p285z2.AbstractC3973i3
    public int OooOo00() {
        return R.layout.fragment_scriptdescription;
    }

    @Override // p285z2.AbstractC3973i3, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        OooOo0o();
        j10.OooO0o().OooOo00(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        j10.OooO0o().OooOoO0(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C3691ah.OooO0OO(C3832ea.class.getCanonicalName());
    }

    @p10(threadMode = ThreadMode.MAIN)
    public void onReceiveRTDFileUIEvent(C4232p3 c4232p3) {
        C3679a5.OooO0O0(getActivity(), "onReceiveRTDFileUIEvent --> 更新RTDFileUI");
        OooOo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C3691ah.OooO0Oo(C3832ea.class.getCanonicalName());
    }

    @Override // p285z2.AbstractC3973i3, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        setUserVisibleHint(true);
    }
}
