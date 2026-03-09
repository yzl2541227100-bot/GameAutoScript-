package p285z2;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import com.cyjh.mqsdk.C2703R;

/* JADX INFO: renamed from: z2.se */
/* JADX INFO: loaded from: classes2.dex */
public final class C4354se {
    public View OooO00o;
    public EditText OooO0O0;
    public OooO0O0 OooO0OO;
    public WindowManager OooO0Oo;
    private WindowManager.LayoutParams OooO0o0;

    /* JADX INFO: renamed from: z2.se$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C4354se c4354se = C4354se.this;
            OooO0O0 oooO0O0 = c4354se.OooO0OO;
            if (oooO0O0 != null) {
                oooO0O0.mo13086a(c4354se.OooO0O0.getText().toString());
            }
            C4354se c4354se2 = C4354se.this;
            c4354se2.OooO0Oo.removeView(c4354se2.OooO00o);
        }
    }

    /* JADX INFO: renamed from: z2.se$OooO0O0 */
    public interface OooO0O0 {
        /* JADX INFO: renamed from: a */
        void mo13086a(String str);
    }

    public C4354se(Context context, String str, OooO0O0 oooO0O0) {
        this.OooO0OO = oooO0O0;
        View viewInflate = LayoutInflater.from(context).inflate(C2703R.layout.dialog_input, (ViewGroup) null);
        this.OooO00o = viewInflate;
        ((TextView) viewInflate.findViewById(C2703R.id.prompt)).setText(str);
        this.OooO0O0 = (EditText) this.OooO00o.findViewById(C2703R.id.et_input);
        this.OooO00o.findViewById(C2703R.id.single_ok_button).setOnClickListener(new OooO00o());
        this.OooO0Oo = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.OooO0o0 = layoutParams;
        int i = Build.VERSION.SDK_INT;
        layoutParams.type = i >= 26 ? 2038 : (i < 19 || i >= 24) ? 2002 : 2005;
        layoutParams.format = 1;
        layoutParams.gravity = 17;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.alpha = 1.0f;
        layoutParams.width = -1;
        layoutParams.height = -1;
    }

    private void OooO0Oo() {
        this.OooO0Oo.removeView(this.OooO00o);
    }

    private void OooO0o0() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.OooO0o0 = layoutParams;
        int i = Build.VERSION.SDK_INT;
        layoutParams.type = i >= 26 ? 2038 : (i < 19 || i >= 24) ? 2002 : 2005;
        layoutParams.format = 1;
        layoutParams.gravity = 17;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.alpha = 1.0f;
        layoutParams.width = -1;
        layoutParams.height = -1;
    }

    public final void OooO0O0() {
        this.OooO0Oo.addView(this.OooO00o, this.OooO0o0);
    }
}
