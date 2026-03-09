package p285z2;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;

/* JADX INFO: renamed from: z2.vj */
/* JADX INFO: loaded from: classes2.dex */
public class C4470vj extends AppCompatDialogFragment {
    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC4433uj(getContext(), getTheme());
    }
}
