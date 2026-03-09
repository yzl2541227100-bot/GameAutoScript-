package p285z2;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cyjh.elfin.entity.Script;
import com.ywfzjbcy.R;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: z2.t6 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC4383t6 extends DialogC4423u9 implements View.OnClickListener {
    private static final String Ooooooo = ViewOnClickListenerC4383t6.class.getName();
    private ImageView Ooooo0o;
    private Button OooooO0;
    private ScrollView OooooOO;
    public Context OooooOo;
    private TextView Oooooo;
    private LinearLayout Oooooo0;
    private InterfaceC4432ui OoooooO;

    /* JADX INFO: renamed from: z2.t6$OooO00o */
    public class OooO00o implements DialogInterface.OnDismissListener {
        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            String unused = ViewOnClickListenerC4383t6.Ooooooo;
            C3977i7.OooO().Oooo0o();
        }
    }

    /* JADX INFO: renamed from: z2.t6$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public final /* synthetic */ float OoooOoO;
        public final /* synthetic */ float OoooOoo;
        public final /* synthetic */ int Ooooo00;
        public final /* synthetic */ boolean Ooooo0o;

        public OooO0O0(float f, float f2, int i, boolean z) {
            this.OoooOoO = f;
            this.OoooOoo = f2;
            this.Ooooo00 = i;
            this.Ooooo0o = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnClickListenerC4383t6.this.OooO0Oo(this.OoooOoO, this.OoooOoo);
            ViewOnClickListenerC4383t6.this.OooOO0(this.Ooooo00, this.Ooooo0o);
            ViewOnClickListenerC4383t6.this.show();
        }
    }

    /* JADX INFO: renamed from: z2.t6$OooO0OO */
    public class OooO0OO implements DialogInterface.OnDismissListener {
        public final /* synthetic */ ViewOnClickListenerC4420u6 OoooOoO;

        public OooO0OO(ViewOnClickListenerC4420u6 viewOnClickListenerC4420u6) {
            this.OoooOoO = viewOnClickListenerC4420u6;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.OoooOoO.OooO0oo()) {
                ViewOnClickListenerC4383t6.this.dismiss();
            }
        }
    }

    public ViewOnClickListenerC4383t6(Context context) {
        Window window;
        int i;
        super(context, R.style.Theme_Dialog);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            window = getWindow();
            i = 2038;
        } else if (i2 < 19 || i2 >= 24) {
            window = getWindow();
            i = 2002;
        } else {
            window = getWindow();
            i = 2005;
        }
        window.setType(i);
    }

    private void OooO() {
        setOnDismissListener(new OooO00o());
    }

    private void OooO0oO(float f, float f2, int i, boolean z) {
        if (isShowing()) {
            dismiss();
            new Handler().postDelayed(new OooO0O0(f, f2, i, z), 500L);
        }
    }

    private void OooO0oo(File file) throws Exception {
        InterfaceC4432ui interfaceC4432ui = this.OoooooO;
        if (interfaceC4432ui != null) {
            interfaceC4432ui.OooO0o0();
        }
    }

    private void OooOO0O() {
        this.Ooooo0o = (ImageView) findViewById(R.id.scriptui_imageview_setting);
        this.OooooO0 = (Button) findViewById(R.id.scriptui_button_savesetting);
        this.OooooOO = (ScrollView) findViewById(R.id.scriptui_scrollview);
        this.Oooooo = (TextView) findViewById(R.id.tv_tip_load);
        this.Ooooo0o.setOnClickListener(this);
        this.OooooO0.setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_dialog_ui_parent);
        this.Oooooo0 = linearLayout;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = (int) (C4491w3.OooOoo0(getContext()).x * 0.9f);
        this.Oooooo0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: OooOO0o */
    public /* synthetic */ LinearLayout OooOOO0() throws Exception {
        return this.OoooooO.read();
    }

    /* JADX INFO: renamed from: OooOOO */
    public /* synthetic */ void OooOOOO(Script script, LinearLayout linearLayout) {
        try {
            this.OoooooO.OooO0Oo();
            this.OoooooO.OooO0o0();
            File file = new File(script.getUipFile().getPath());
            if (!file.exists() || file.length() <= 0) {
                this.OooooOO.removeViewAt(0);
                this.OooooOO.addView(linearLayout);
            } else {
                this.Oooooo0.removeAllViews();
                this.Oooooo0.addView(linearLayout);
            }
            this.Oooooo.setVisibility(8);
            this.OooooO0.setVisibility(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: OooOOOo */
    public /* synthetic */ void OooOOo0(Throwable th) {
        this.Oooooo.setVisibility(8);
        this.OooooO0.setVisibility(0);
    }

    public void OooOO0(int i, boolean z) {
        C3977i7.OooO().Oooo0O0(C3718b7.OooO0Oo().OooO0oO().getLcFile().getAbsolutePath(), C4125m7.OooO0o0().OooO0o(), C4125m7.OooO0o0().OooO0oO(), C3718b7.OooO0Oo().OooO0Oo);
        this.Oooooo.setVisibility(0);
        this.OooooO0.setVisibility(4);
        if (this.Oooooo0.findViewById(this.Oooooo.getId()) == null) {
            this.Oooooo0.addView(this.Oooooo, 0);
        }
        final Script scriptOooO0oO = C3718b7.OooO0Oo().OooO0oO();
        if (this.OoooooO == null) {
            this.OoooooO = C3951hi.OooO0OO(getContext(), scriptOooO0oO.getUiFile().getPath(), scriptOooO0oO.getUipFile().getPath(), scriptOooO0oO.getCfgFile().getPath());
        }
        C3827e5.OooO00o().OooO0oO(new Callable() { // from class: z2.l6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.OoooOoO.OooOOO0();
            }
        }).OooOOO(new w30() { // from class: z2.m6
            @Override // p285z2.w30
            public final void OooO0O0(Object obj) {
                this.OooO00o.OooOOOO(scriptOooO0oO, (LinearLayout) obj);
            }
        }).OooOO0(new z30() { // from class: z2.n6
            @Override // p285z2.z30
            public final void OooO0O0(Object obj) {
                this.OooO00o.OooOOo0((Throwable) obj);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.scriptui_button_savesetting /* 2131297233 */:
                try {
                    OooO0oo(C3718b7.OooO0Oo().OooO0oO().getCfgFile());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C4496w8.OooOO0();
                break;
            case R.id.scriptui_imageview_setting /* 2131297234 */:
                ViewOnClickListenerC4420u6 viewOnClickListenerC4420u6 = new ViewOnClickListenerC4420u6(getContext());
                viewOnClickListenerC4420u6.o00Ooo = this.OooooOo;
                viewOnClickListenerC4420u6.setOnDismissListener(new OooO0OO(viewOnClickListenerC4420u6));
                viewOnClickListenerC4420u6.show();
                break;
            default:
                return;
        }
        dismiss();
    }

    @Override // p285z2.DialogC4423u9, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_scriptui);
        OooO0O0(0.1f);
        OooO0Oo(0.9f, C3681a7.OooO00o().OooO0O0() ? 0.8f : 0.6f);
        OooOO0O();
        OooOO0(1, true);
        OooO();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
