package p285z2;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.cyjh.common.C2604R;
import com.cyjh.common.view.SlLoadingView;

/* JADX INFO: renamed from: z2.o3 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC4195o3 extends DialogC4158n3 implements View.OnClickListener {
    public static final String OooooOO = ViewOnClickListenerC4195o3.class.getSimpleName();
    private static final int OooooOo = 19;
    private static final int Oooooo0 = 24;
    public Context Ooooo0o;
    private SlLoadingView OooooO0;

    public ViewOnClickListenerC4195o3(Context context, boolean z) {
        Window window;
        int i;
        super(context, C2604R.style.Theme_Dialog);
        this.Ooooo0o = context;
        if (z) {
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
    }

    private void OooO0o0() {
        this.OooooO0 = (SlLoadingView) findViewById(C2604R.id.slLoadingView);
        setCancelable(false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // p285z2.DialogC4158n3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2604R.layout.dialog_library_ui_loading);
        OooO0O0(0.2f);
        OooO0Oo(0.8f, 0.6f);
        OooO0o0();
    }
}
