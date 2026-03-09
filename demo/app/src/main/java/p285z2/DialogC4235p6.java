package p285z2;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.ywfzjbcy.R;

/* JADX INFO: renamed from: z2.p6 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC4235p6 extends DialogC4423u9 {

    /* JADX INFO: renamed from: z2.p6$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public final /* synthetic */ EditText OoooOoO;

        public OooO00o(EditText editText) {
            this.OoooOoO = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextUtils.isEmpty(this.OoooOoO.getText().toString())) {
                C4382t5.o000oOoO("输入不能为空！");
                return;
            }
            C4529x4.OooO0O0().OooO0oo(InterfaceC3865f6.OooOo00, this.OoooOoO.getText().toString());
            C4382t5.o000oOoO("已保存！");
            DialogC4235p6.this.dismiss();
        }
    }

    public DialogC4235p6(Context context) {
        Window window;
        int i;
        super(context, R.style.Theme_Dialog);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            window = getWindow();
            i = 2038;
        } else if (i2 < 19 || i2 >= 24) {
            if (getWindow() == null) {
                return;
            }
            window = getWindow();
            i = 2002;
        } else {
            if (getWindow() == null) {
                return;
            }
            window = getWindow();
            i = 2005;
        }
        window.setType(i);
    }

    private void OooO0o0() {
        EditText editText = (EditText) findViewById(R.id.et_adb_command);
        editText.setText(C4529x4.OooO0O0().OooO0Oo(InterfaceC3865f6.OooOo00, "logcat -v time"));
        findViewById(R.id.dialog_save_command).setOnClickListener(new OooO00o(editText));
    }

    @Override // p285z2.DialogC4423u9, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_adb_command);
        OooO0O0(0.5f);
        OooO0Oo(0.9f, 0.3f);
        OooO0o0();
    }
}
