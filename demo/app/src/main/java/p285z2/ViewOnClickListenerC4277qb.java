package p285z2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.Formatter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.cyjh.feedback.lib.activity.ImageSelectActivity;
import com.cyjh.feedback.libraryfeedbackinfo.C2618R;
import com.cyjh.http.bean.request.FeedbackRequestInfo;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Marker;
import p285z2.C3833eb;
import p285z2.ViewOnClickListenerC3981ib;

/* JADX INFO: renamed from: z2.qb */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC4277qb extends AbstractC3907gb implements View.OnClickListener {
    private static final int o00Ooo = 1;
    private static final int o00o0O = 2;
    private static final int o00oO0O = 16;
    private static final int o00oO0o = 8;
    private static final int o00ooo = 3;
    public static final String o0OO00O = "isPhoneRoot";
    public static final int o0OOO0o = 0;
    public static final String o0Oo0oo = "feedbackTips";
    public static final int o0ooOO0 = 256;
    public static final int o0ooOOo = 0;
    public static final int o0ooOoO = 1;
    private static final int oo000o = 4;
    private static final int oo0o0Oo = 4;
    private GridView OoooOoo;
    private C3833eb Ooooo00;
    private List<String> Ooooo0o = new ArrayList();
    private EditText OooooO0;
    private EditText OooooOO;
    private TextView OooooOo;
    private DialogC4018jb Oooooo;
    private TextView Oooooo0;
    private FeedbackRequestInfo OoooooO;
    private TextView Ooooooo;
    private String o00O0O;
    private boolean o00Oo0;
    private View o0OoOo0;
    private C4389tc ooOO;

    /* JADX INFO: renamed from: z2.qb$OooO00o */
    public class OooO00o implements ViewOnClickListenerC3981ib.OooO0O0 {
        public OooO00o() {
        }

        @Override // p285z2.ViewOnClickListenerC3981ib.OooO0O0
        public void OooO00o(int i) {
            FragmentActivity activity;
            int i2;
            if (ViewOnClickListenerC4277qb.this.getActivity() != null) {
                ViewOnClickListenerC4277qb.this.Ooooo0o.clear();
                if (i == 1) {
                    activity = ViewOnClickListenerC4277qb.this.getActivity();
                    i2 = -1;
                } else {
                    activity = ViewOnClickListenerC4277qb.this.getActivity();
                    i2 = 0;
                }
                activity.setResult(i2);
                ViewOnClickListenerC4277qb.this.getActivity().finish();
            }
        }
    }

    /* JADX INFO: renamed from: z2.qb$OooO0O0 */
    public class OooO0O0 implements TextWatcher {
        public OooO0O0() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ViewOnClickListenerC4277qb.this.Oooooo0.setText(ViewOnClickListenerC4277qb.this.getString(C2618R.string.feedback_num_hint, Integer.valueOf(charSequence.length())));
        }
    }

    /* JADX INFO: renamed from: z2.qb$OooO0OO */
    public class OooO0OO implements AdapterView.OnItemClickListener {
        public OooO0OO() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == ViewOnClickListenerC4277qb.this.Ooooo0o.size()) {
                ViewOnClickListenerC4277qb.this.startActivityForResult(new Intent(ViewOnClickListenerC4277qb.this.getActivity(), (Class<?>) ImageSelectActivity.class), 256);
            }
        }
    }

    /* JADX INFO: renamed from: z2.qb$OooO0o */
    public class OooO0o implements C3833eb.OooO0O0 {
        public OooO0o() {
        }

        @Override // p285z2.C3833eb.OooO0O0
        public void OooO00o(int i) {
            ViewOnClickListenerC4277qb.this.OooooOo.setText(ViewOnClickListenerC4277qb.this.getString(C2618R.string.image_add, Integer.valueOf(i)));
        }
    }

    private String OooOo(int i) {
        int i2;
        if (i == 1) {
            i2 = C2618R.string.cpu_core_one;
        } else if (i == 2) {
            i2 = C2618R.string.cpu_core_two;
        } else if (i == 3) {
            i2 = C2618R.string.cpu_core_three;
        } else if (i == 4) {
            i2 = C2618R.string.cpu_core_four;
        } else if (i == 8) {
            i2 = C2618R.string.cpu_core_eight;
        } else {
            if (i != 16) {
                return null;
            }
            i2 = C2618R.string.cpu_core_sixteen;
        }
        return getString(i2);
    }

    private void OooOoO() {
        this.Oooooo = new DialogC4018jb(getActivity());
        if (TextUtils.isEmpty(this.o00O0O)) {
            this.Ooooooo.setVisibility(8);
            this.o0OoOo0.setVisibility(8);
        } else {
            this.o0OoOo0.setVisibility(0);
            this.Ooooooo.setText(this.o00O0O);
            this.Ooooooo.setVisibility(0);
        }
    }

    private void OooOoO0() {
        String strTrim = this.OooooO0.getText().toString().trim();
        String strTrim2 = this.OooooOO.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2)) {
            Toast.makeText(getActivity(), getString(C2618R.string.no_fill_info), 1).show();
            return;
        }
        if (this.OoooooO == null) {
            this.OoooooO = new FeedbackRequestInfo(C3834ec.OooO0OO().OooO00o(getActivity()));
        }
        FeedbackRequestInfo feedbackRequestInfo = this.OoooooO;
        feedbackRequestInfo.Contact = strTrim;
        feedbackRequestInfo.Content = strTrim2;
        feedbackRequestInfo.AndoridVersion = Build.VERSION.RELEASE;
        feedbackRequestInfo.DeviceModel = Build.MODEL;
        if (this.o00Oo0) {
            feedbackRequestInfo.RootStatus = 1;
        } else {
            feedbackRequestInfo.RootStatus = 0;
        }
        int i = C3688ae.OooOo0o(getActivity()).x;
        int i2 = C3688ae.OooOo0o(getActivity()).y;
        this.OoooooO.Resolution = i + Marker.ANY_MARKER + i2;
        this.OoooooO.RAM = Formatter.formatFileSize(getActivity(), C3688ae.OooOoOO(getActivity()));
        this.OoooooO.DPI = C3688ae.OooOo(getActivity());
        this.OoooooO.SerialNumber = C3688ae.OooOoO();
        this.OoooooO.CoreVersion = C3688ae.OooOO0o();
        this.OoooooO.SystemVersion = C3688ae.OooOo0O();
        String strOooOo = OooOo(C4351sb.OooO0o0());
        String strOooO0OO = C4351sb.OooO0OO();
        String strValueOf = String.valueOf(0);
        if (!TextUtils.isEmpty(strOooOo) && !TextUtils.isEmpty(strOooO0OO)) {
            strOooOo = strOooOo + "，CPU型号：" + strOooO0OO;
        } else if (TextUtils.isEmpty(strOooOo) || !TextUtils.isEmpty(strOooO0OO)) {
            if (!TextUtils.isEmpty(strOooOo) || TextUtils.isEmpty(strOooO0OO)) {
                strOooOo = strValueOf;
            } else {
                strOooOo = "CPU型号：" + strOooO0OO;
            }
        }
        this.OoooooO.Processor = strOooOo;
    }

    private void OooOoOO() {
        this.OooooOO.addTextChangedListener(new OooO0O0());
        this.OoooOoo.setOnItemClickListener(new OooO0OO());
        this.Ooooo00.OooO0Oo(new OooO0o());
    }

    public static ViewOnClickListenerC4277qb OooOoo(String str, boolean z) {
        ViewOnClickListenerC4277qb viewOnClickListenerC4277qb = new ViewOnClickListenerC4277qb();
        Bundle bundle = new Bundle();
        bundle.putString(o0Oo0oo, str);
        bundle.putBoolean(o0OO00O, z);
        viewOnClickListenerC4277qb.setArguments(bundle);
        return viewOnClickListenerC4277qb;
    }

    private void OooOoo0(View view) {
        this.OoooOoo = (GridView) view.findViewById(C2618R.id.grid_view);
        this.OooooO0 = (EditText) view.findViewById(C2618R.id.id_et_qq_phone);
        this.OooooOO = (EditText) view.findViewById(C2618R.id.id_et_feedback);
        this.OooooOo = (TextView) view.findViewById(C2618R.id.id_tv_image_num);
        Button button = (Button) view.findViewById(C2618R.id.id_btn_commit_feedback);
        this.Oooooo0 = (TextView) view.findViewById(C2618R.id.id_tv_feedback_input_font_num);
        C3833eb c3833eb = new C3833eb(getActivity(), null);
        this.Ooooo00 = c3833eb;
        this.OoooOoo.setAdapter((ListAdapter) c3833eb);
        button.setOnClickListener(this);
        this.OooooOo.setText(getString(C2618R.string.image_add, Integer.valueOf(this.Ooooo0o.size())));
        this.Oooooo0.setText(getString(C2618R.string.feedback_num_hint, 0));
        this.Ooooooo = (TextView) view.findViewById(C2618R.id.id_complaints_qq);
        this.o0OoOo0 = view.findViewById(C2618R.id.id_line);
    }

    private void OooOooO() {
        ViewOnClickListenerC3981ib viewOnClickListenerC3981ib = new ViewOnClickListenerC3981ib(getActivity(), this.OoooooO, this.Ooooo0o);
        viewOnClickListenerC3981ib.show();
        viewOnClickListenerC3981ib.OooOoo0(new OooO00o());
    }

    private void OooOooo() {
        FeedbackRequestInfo feedbackRequestInfo = this.OoooooO;
        if (feedbackRequestInfo == null) {
            this.Oooooo.dismiss();
            return;
        }
        if (TextUtils.isEmpty(feedbackRequestInfo.Contact)) {
            this.OoooooO.Contact = String.valueOf(0);
        }
        if (TextUtils.isEmpty(this.OoooooO.Content)) {
            this.OoooooO.Content = String.valueOf(0);
        }
        if (TextUtils.isEmpty(this.OoooooO.AndoridVersion)) {
            this.OoooooO.AndoridVersion = String.valueOf(0);
        }
        if (TextUtils.isEmpty(this.OoooooO.CoreVersion)) {
            this.OoooooO.CoreVersion = String.valueOf(0);
        }
        if (TextUtils.isEmpty(this.OoooooO.SerialNumber)) {
            this.OoooooO.SerialNumber = String.valueOf(0);
        }
        this.Oooooo.dismiss();
        OooOooO();
    }

    @Override // p285z2.AbstractC3907gb
    public int OooOo00() {
        return C2618R.layout.fragment_feedback_info;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        C4389tc c4389tc = new C4389tc();
        this.ooOO = c4389tc;
        c4389tc.OooO0OO(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringArrayList;
        super.onActivityResult(i, i2, intent);
        if (i != 256 || i2 != -1 || intent == null || (stringArrayList = intent.getBundleExtra("bundle").getStringArrayList(C1781c.c.f10525e)) == null) {
            return;
        }
        int size = this.Ooooo0o.size();
        if (stringArrayList.size() + size > 4) {
            Toast.makeText(getActivity(), getString(C2618R.string.img_num_limit, Integer.valueOf(size), Integer.valueOf(4 - size)), 1).show();
            stringArrayList.clear();
            return;
        }
        for (String str : stringArrayList) {
            if (!this.Ooooo0o.contains(str)) {
                this.Ooooo0o.add(str);
            }
        }
        this.OooooOo.setText(getString(C2618R.string.image_add, Integer.valueOf(this.Ooooo0o.size())));
        this.Ooooo00.OooO0OO(this.Ooooo0o);
        this.OoooOoo.setAdapter((ListAdapter) this.Ooooo00);
        this.Ooooo00.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C2618R.id.id_btn_commit_feedback) {
            this.Oooooo.show();
            OooOoO0();
            OooOooo();
        }
    }

    @Override // p285z2.AbstractC3907gb, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.o00O0O = getArguments().getString(o0Oo0oo);
            this.o00Oo0 = getArguments().getBoolean(o0OO00O);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C4389tc c4389tc = this.ooOO;
        if (c4389tc != null) {
            c4389tc.OooO0o();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C3691ah.OooO0OO(ViewOnClickListenerC4277qb.class.getCanonicalName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C3691ah.OooO0Oo(ViewOnClickListenerC4277qb.class.getCanonicalName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        OooOoo0(view);
        OooOoO();
        OooOoOO();
    }
}
