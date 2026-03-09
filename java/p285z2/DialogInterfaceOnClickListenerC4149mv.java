package p285z2;

import android.app.Activity;
import android.content.DialogInterface;

/* JADX INFO: renamed from: z2.mv */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC4149mv implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, Runnable {
    private final Activity OoooOoO;

    public DialogInterfaceOnClickListenerC4149mv(Activity activity) {
        this.OoooOoO = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        run();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        run();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.OoooOoO.finish();
    }
}
