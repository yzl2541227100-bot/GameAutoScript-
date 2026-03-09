package p285z2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.ywfzjbcy.R;

/* JADX INFO: renamed from: z2.x9 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC4534x9 extends DialogC4423u9 {
    private Button Ooooo0o;

    /* JADX INFO: renamed from: z2.x9$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC4534x9.this.dismiss();
        }
    }

    public DialogC4534x9(Context context) {
        super(context, R.style.Theme_Dialog);
    }

    @Override // p285z2.DialogC4423u9, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_no_root);
        OooO0Oo(0.8f, 0.4f);
        OooO0O0(0.5f);
        setCanceledOnTouchOutside(false);
        Button button = (Button) findViewById(R.id.id_btn_sure);
        this.Ooooo0o = button;
        button.setOnClickListener(new OooO00o());
    }
}
