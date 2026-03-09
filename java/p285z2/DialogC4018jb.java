package p285z2;

import android.content.Context;
import android.os.Bundle;
import com.cyjh.feedback.libraryfeedbackinfo.C2618R;

/* JADX INFO: renamed from: z2.jb */
/* JADX INFO: loaded from: classes.dex */
public class DialogC4018jb extends DialogC3870fb {
    public DialogC4018jb(Context context) {
        super(context, C2618R.style.Theme_Dialog);
    }

    @Override // p285z2.DialogC3870fb, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2618R.layout.dialog_loading);
        OooOo00(0.3f);
        OooOo0O(1.0f, 1.0f);
    }
}
