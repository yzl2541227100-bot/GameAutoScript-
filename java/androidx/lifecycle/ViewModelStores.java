package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ViewModelStores {
    private ViewModelStores() {
    }

    @NonNull
    @MainThread
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static ViewModelStore m12of(@NonNull Fragment fragment) {
        return fragment.getViewModelStore();
    }

    @NonNull
    @MainThread
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static ViewModelStore m13of(@NonNull FragmentActivity fragmentActivity) {
        return fragmentActivity.getViewModelStore();
    }
}
