package p285z2;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.cyjh.feedback.libraryfeedbackinfo.C2618R;
import com.cyjh.http.bean.request.FeedbackRequestInfo;
import com.cyjh.http.oss.MyOSSUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z2.ib */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC3981ib extends DialogC3870fb implements View.OnClickListener, InterfaceC3835ed {
    private static final int o00oO0O = 1;
    private static final int o00oO0o = 2;
    private static final String o00ooo = String.valueOf(0);
    private static final int o0ooOO0 = 0;
    private static final int oo000o = 1;
    private Button OooooO0;
    private Button OooooOO;
    private TextView OooooOo;
    private TextView Oooooo;
    private TextView Oooooo0;
    private TextView OoooooO;
    private FeedbackRequestInfo Ooooooo;
    private C4315rc o00O0O;
    private List<String> o00Oo0;
    private volatile int o00Ooo;
    private OooO0O0 o00o0O;
    private DialogC4018jb o0OoOo0;
    private Context ooOO;

    /* JADX INFO: renamed from: z2.ib$OooO00o */
    public class OooO00o implements MyOSSUtils.UploadFileCallBack {
        public final /* synthetic */ List OooO00o;

        public OooO00o(List list) {
            this.OooO00o = list;
        }

        @Override // com.cyjh.http.oss.MyOSSUtils.UploadFileCallBack
        public void uploadFail(String str) {
            ViewOnClickListenerC3981ib.this.OooOoo(this.OooO00o);
        }

        @Override // com.cyjh.http.oss.MyOSSUtils.UploadFileCallBack
        public void uploadProgress(long j, long j2) {
        }

        @Override // com.cyjh.http.oss.MyOSSUtils.UploadFileCallBack
        public void uploadSuc(String str, String str2) {
            this.OooO00o.add(str2);
            ViewOnClickListenerC3981ib.this.OooOoo(this.OooO00o);
        }
    }

    /* JADX INFO: renamed from: z2.ib$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(int i);
    }

    public ViewOnClickListenerC3981ib(Context context, FeedbackRequestInfo feedbackRequestInfo, List<String> list) {
        super(context, C2618R.style.Theme_Dialog);
        this.o00Ooo = 0;
        this.Ooooooo = feedbackRequestInfo;
        this.ooOO = context;
        this.o00Oo0 = list;
    }

    private SpannableStringBuilder OooOo(String str, String str2) {
        int iIndexOf = str.indexOf(str2);
        int length = str2.length() + iIndexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#3c7ac5")), iIndexOf, length, 34);
        return spannableStringBuilder;
    }

    private void OooOoO() {
        this.OooooOO.setOnClickListener(this);
        this.OooooO0.setOnClickListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void OooOoO0() {
        /*
            r6 = this;
            android.content.Context r0 = r6.ooOO
            int r1 = com.cyjh.feedback.libraryfeedbackinfo.C2618R.string.devices_name
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.cyjh.http.bean.request.FeedbackRequestInfo r4 = r6.Ooooooo
            java.lang.String r4 = r4.DeviceModel
            r5 = 0
            r3[r5] = r4
            java.lang.String r0 = r0.getString(r1, r3)
            android.widget.TextView r1 = r6.OooooOo
            com.cyjh.http.bean.request.FeedbackRequestInfo r3 = r6.Ooooooo
            java.lang.String r3 = r3.DeviceModel
            android.text.SpannableStringBuilder r0 = r6.OooOo(r0, r3)
            r1.setText(r0)
            android.content.Context r0 = r6.ooOO
            int r1 = com.cyjh.feedback.libraryfeedbackinfo.C2618R.string.devices_use_system
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.cyjh.http.bean.request.FeedbackRequestInfo r4 = r6.Ooooooo
            java.lang.String r4 = r4.AndoridVersion
            r3[r5] = r4
            java.lang.String r0 = r0.getString(r1, r3)
            android.widget.TextView r1 = r6.Oooooo0
            com.cyjh.http.bean.request.FeedbackRequestInfo r3 = r6.Ooooooo
            java.lang.String r3 = r3.AndoridVersion
            android.text.SpannableStringBuilder r0 = r6.OooOo(r0, r3)
            r1.setText(r0)
            com.cyjh.http.bean.request.FeedbackRequestInfo r0 = r6.Ooooooo
            int r0 = r0.RootStatus
            if (r0 == r2) goto L59
            r1 = 2
            if (r0 == r1) goto L46
            goto L7a
        L46:
            android.content.Context r0 = r6.ooOO
            int r1 = com.cyjh.feedback.libraryfeedbackinfo.C2618R.string.devices_is_root
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = com.cyjh.feedback.libraryfeedbackinfo.C2618R.string.devices_no_root
            java.lang.String r4 = r0.getString(r3)
            r2[r5] = r4
            java.lang.String r0 = r0.getString(r1, r2)
            goto L6b
        L59:
            android.content.Context r0 = r6.ooOO
            int r1 = com.cyjh.feedback.libraryfeedbackinfo.C2618R.string.devices_is_root
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = com.cyjh.feedback.libraryfeedbackinfo.C2618R.string.devices_yes_root
            java.lang.String r4 = r0.getString(r3)
            r2[r5] = r4
            java.lang.String r0 = r0.getString(r1, r2)
        L6b:
            android.widget.TextView r1 = r6.Oooooo
            android.content.Context r2 = r6.ooOO
            java.lang.String r2 = r2.getString(r3)
            android.text.SpannableStringBuilder r0 = r6.OooOo(r0, r2)
            r1.setText(r0)
        L7a:
            com.cyjh.http.bean.request.FeedbackRequestInfo r0 = r6.Ooooooo
            java.lang.String r0 = r0.Content
            java.lang.String r1 = p285z2.ViewOnClickListenerC3981ib.o00ooo
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8f
            android.widget.TextView r0 = r6.OoooooO
            com.cyjh.http.bean.request.FeedbackRequestInfo r1 = r6.Ooooooo
            java.lang.String r1 = r1.Content
            r0.setText(r1)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.ViewOnClickListenerC3981ib.OooOoO0():void");
    }

    private void OooOoOO() {
        this.OooooOo = (TextView) findViewById(C2618R.id.id_tv_device_name);
        this.Oooooo0 = (TextView) findViewById(C2618R.id.id_tv_device_system);
        this.Oooooo = (TextView) findViewById(C2618R.id.id_tv_device_root);
        this.OoooooO = (TextView) findViewById(C2618R.id.id_tv_feedback_content);
        this.OooooO0 = (Button) findViewById(C2618R.id.id_btn_back);
        this.OooooOO = (Button) findViewById(C2618R.id.id_btn_commit_feedback_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOoo(List<String> list) {
        this.o00Ooo++;
        if (this.o00Ooo == this.o00Oo0.size()) {
            if (list.size() > 0) {
                this.Ooooooo.FreebackImages = (String[]) list.toArray(new String[list.size()]);
            }
            this.o00O0O.OooO0OO(this.ooOO, this.Ooooooo);
        }
    }

    @Override // p285z2.InterfaceC3835ed
    public void OooOO0o(String str) {
        this.o0OoOo0.dismiss();
        OooO0O0 oooO0O0 = this.o00o0O;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(1);
        }
        dismiss();
    }

    public void OooOoo0(OooO0O0 oooO0O0) {
        this.o00o0O = oooO0O0;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.Ooooooo = null;
        this.o00Ooo = 0;
        C4315rc c4315rc = this.o00O0O;
        if (c4315rc != null) {
            c4315rc.OooO0o();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C2618R.id.id_btn_back) {
            dismiss();
            return;
        }
        if (id == C2618R.id.id_btn_commit_feedback_info) {
            try {
                if (!C4425ub.OooO00o(this.ooOO) && !C4425ub.OooO0O0(this.ooOO)) {
                    Context context = this.ooOO;
                    Toast.makeText(context, context.getString(C2618R.string.is_net_open), 1).show();
                    return;
                }
                MyOSSUtils myOSSUtilsBuild = new MyOSSUtils.Builder(this.ooOO, C3834ec.OooO0OO().OooO0OO).build();
                if (myOSSUtilsBuild.isTokenExpireTime()) {
                    Toast.makeText(this.ooOO, "阿里云Token过期，稍后再试！", 1).show();
                    new C4389tc().OooO0OO(this.ooOO);
                    return;
                }
                if (this.o0OoOo0 == null) {
                    this.o0OoOo0 = new DialogC4018jb(this.ooOO);
                }
                this.o0OoOo0.show();
                this.o00O0O = new C4315rc(this);
                if (this.o00Oo0.size() <= 0 || C3834ec.OooO0OO().OooO0OO == null) {
                    this.o00O0O.OooO0OO(this.ooOO, this.Ooooooo);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : this.o00Oo0) {
                    myOSSUtilsBuild.uploadFile(str, C3834ec.OooO0OO().OooO0OO.OssStoragePath + new File(str).getName(), new OooO00o(arrayList));
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("zzz", "FeedBackDialog--提交数据给后台：" + e.getMessage());
            }
        }
    }

    @Override // p285z2.DialogC3870fb, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2618R.layout.dialog_feedback_info);
        OooOo00(0.3f);
        OooOo0O(0.8f, 0.6f);
        OooOoOO();
        OooOoO0();
        OooOoO();
    }

    @Override // p285z2.InterfaceC3835ed
    public void onFail(String str) {
        this.o0OoOo0.dismiss();
        OooO0O0 oooO0O0 = this.o00o0O;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(0);
        }
        dismiss();
    }
}
