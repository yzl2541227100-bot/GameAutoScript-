package p285z2;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.ywfzjbcy.R;

/* JADX INFO: renamed from: z2.r6 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC4309r6 extends DialogC4423u9 {
    public DialogC4309r6(Context context) {
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
    }

    @Override // p285z2.DialogC4423u9, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_view);
        OooO0O0(0.5f);
        OooO0Oo(0.5f, 0.5f);
        OooO0o0();
        setCanceledOnTouchOutside(false);
    }
}
