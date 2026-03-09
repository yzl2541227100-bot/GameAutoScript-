package p285z2;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cyjh.mqsdk.C2703R;

/* JADX INFO: renamed from: z2.re */
/* JADX INFO: loaded from: classes2.dex */
public final class C4317re {
    public static final int OooOO0o = 0;
    public static final int OooOOO = 2;
    public static final int OooOOO0 = 1;
    public static final int OooOOOO = 3;
    public static final int OooOOOo = 0;
    public static final int OooOOo = 2;
    public static final int OooOOo0 = 1;
    public static final int OooOOoo = 3;
    private Button OooO;
    private WindowManager OooO00o;
    private WindowManager.LayoutParams OooO0O0;
    private View OooO0OO;
    public OooO0o OooO0Oo;
    private int OooO0o;
    private int OooO0o0;
    private LinearLayout OooO0oO;
    private LinearLayout OooO0oo;
    private Button OooOO0;
    private Button OooOO0O;

    /* JADX INFO: renamed from: z2.re$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public final /* synthetic */ int OoooOoO;

        public OooO00o(int i) {
            this.OoooOoO = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooO0o oooO0o = C4317re.this.OooO0Oo;
            if (oooO0o != null) {
                int i = this.OoooOoO;
                oooO0o.mo13085a((i == 0 || i == 1) ? 0 : 2);
            }
            C4317re.OooO0O0(C4317re.this);
        }
    }

    /* JADX INFO: renamed from: z2.re$OooO0O0 */
    public class OooO0O0 implements View.OnClickListener {
        public final /* synthetic */ int OoooOoO;

        public OooO0O0(int i) {
            this.OoooOoO = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooO0o oooO0o = C4317re.this.OooO0Oo;
            if (oooO0o != null) {
                oooO0o.mo13085a(this.OoooOoO != 1 ? 3 : 1);
            }
            C4317re.OooO0O0(C4317re.this);
        }
    }

    /* JADX INFO: renamed from: z2.re$OooO0OO */
    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooO0o oooO0o = C4317re.this.OooO0Oo;
            if (oooO0o != null) {
                oooO0o.mo13085a(1);
            }
            C4317re.OooO0O0(C4317re.this);
        }
    }

    /* JADX INFO: renamed from: z2.re$OooO0o */
    public interface OooO0o {
        /* JADX INFO: renamed from: a */
        void mo13085a(int i);
    }

    public C4317re(Context context, String str, int i, OooO0o oooO0o) {
        this.OooO0Oo = oooO0o;
        this.OooO00o = (WindowManager) context.getSystemService("window");
        View viewInflate = LayoutInflater.from(context).inflate(C2703R.layout.dialog_alert, (ViewGroup) null);
        this.OooO0OO = viewInflate;
        ((TextView) viewInflate.findViewById(C2703R.id.prompt)).setText(str);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.OooO0O0 = layoutParams;
        int i2 = Build.VERSION.SDK_INT;
        layoutParams.type = i2 >= 26 ? 2038 : (i2 < 19 || i2 >= 24) ? 2002 : 2005;
        layoutParams.format = 1;
        layoutParams.gravity = 16;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.alpha = 1.0f;
        layoutParams.width = -1;
        layoutParams.height = -1;
        if (i == 1) {
            this.OooO0OO.findViewById(C2703R.id.single_ok_button).setVisibility(8);
            this.OooO0OO.findViewById(C2703R.id.layout_type3).setVisibility(8);
            this.OooO = (Button) this.OooO0OO.findViewById(C2703R.id.positive_button);
            this.OooOO0 = (Button) this.OooO0OO.findViewById(C2703R.id.negative_button);
        } else if (i == 2) {
            this.OooO0OO.findViewById(C2703R.id.single_ok_button).setVisibility(8);
            this.OooO0OO.findViewById(C2703R.id.layout_type3).setVisibility(8);
            this.OooO = (Button) this.OooO0OO.findViewById(C2703R.id.positive_button);
            this.OooOO0 = (Button) this.OooO0OO.findViewById(C2703R.id.negative_button);
            this.OooO.setText(C2703R.string.dialog_yes_button);
            this.OooOO0.setText(C2703R.string.dialog_no_button);
        } else if (i != 3) {
            this.OooO0OO.findViewById(C2703R.id.layout_type2).setVisibility(8);
            this.OooO0OO.findViewById(C2703R.id.layout_type3).setVisibility(8);
            this.OooO = (Button) this.OooO0OO.findViewById(C2703R.id.single_ok_button);
        } else {
            this.OooO0OO.findViewById(C2703R.id.single_ok_button).setVisibility(8);
            this.OooO0OO.findViewById(C2703R.id.layout_type2).setVisibility(8);
            this.OooO = (Button) this.OooO0OO.findViewById(C2703R.id.yes_button);
            this.OooOO0 = (Button) this.OooO0OO.findViewById(C2703R.id.no_button);
            this.OooOO0O = (Button) this.OooO0OO.findViewById(C2703R.id.cancel_button);
        }
        Button button = this.OooO;
        if (button != null) {
            button.setOnClickListener(new OooO00o(i));
        }
        Button button2 = this.OooOO0;
        if (button2 != null) {
            button2.setOnClickListener(new OooO0O0(i));
        }
        Button button3 = this.OooOO0O;
        if (button3 != null) {
            button3.setOnClickListener(new OooO0OO());
        }
    }

    public static /* synthetic */ void OooO0O0(C4317re c4317re) {
        c4317re.OooO00o.removeView(c4317re.OooO0OO);
    }

    private void OooO0Oo() {
        this.OooO00o.removeView(this.OooO0OO);
    }

    private void OooO0o0() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.OooO0O0 = layoutParams;
        int i = Build.VERSION.SDK_INT;
        layoutParams.type = i >= 26 ? 2038 : (i < 19 || i >= 24) ? 2002 : 2005;
        layoutParams.format = 1;
        layoutParams.gravity = 16;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.alpha = 1.0f;
        layoutParams.width = -1;
        layoutParams.height = -1;
    }

    public final void OooO00o() {
        this.OooO00o.addView(this.OooO0OO, this.OooO0O0);
    }
}
