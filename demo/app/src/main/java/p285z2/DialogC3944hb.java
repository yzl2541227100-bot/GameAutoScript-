package p285z2;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import com.cyjh.feedback.libraryfeedbackinfo.C2618R;

/* JADX INFO: renamed from: z2.hb */
/* JADX INFO: loaded from: classes.dex */
public class DialogC3944hb extends DialogC3870fb {
    public DialogC3944hb(Context context) {
        super(context, C2618R.style.Theme_Dialog);
    }

    @Override // p285z2.DialogC3870fb, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2618R.layout.dialog_feedback_commit);
        OooOo00(0.5f);
        OooOo0O(1.0f, 1.0f);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        dismiss();
        return true;
    }
}
