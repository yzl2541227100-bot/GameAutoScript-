package p285z2;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import org.greenrobot.eventbus.util.ErrorDialogFragments;
import org.greenrobot.eventbus.util.ErrorDialogManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b20<T> {
    public final a20 OooO00o;

    @TargetApi(11)
    public static class OooO00o extends b20<Fragment> {
        public OooO00o(a20 a20Var) {
            super(a20Var);
        }

        @Override // p285z2.b20
        /* JADX INFO: renamed from: OooO0o0 */
        public Fragment OooO00o(e20 e20Var, Bundle bundle) {
            ErrorDialogFragments.Honeycomb honeycomb = new ErrorDialogFragments.Honeycomb();
            honeycomb.setArguments(bundle);
            return honeycomb;
        }
    }

    public static class OooO0O0 extends b20<androidx.fragment.app.Fragment> {
        public OooO0O0(a20 a20Var) {
            super(a20Var);
        }

        @Override // p285z2.b20
        /* JADX INFO: renamed from: OooO0o0 */
        public androidx.fragment.app.Fragment OooO00o(e20 e20Var, Bundle bundle) {
            ErrorDialogFragments.OooO00o oooO00o = new ErrorDialogFragments.OooO00o();
            oooO00o.setArguments(bundle);
            return oooO00o;
        }
    }

    public b20(a20 a20Var) {
        this.OooO00o = a20Var;
    }

    public abstract T OooO00o(e20 e20Var, Bundle bundle);

    public String OooO0O0(e20 e20Var, Bundle bundle) {
        return this.OooO00o.OooO00o.getString(this.OooO00o.OooO0Oo(e20Var.OooO00o));
    }

    public String OooO0OO(e20 e20Var, Bundle bundle) {
        a20 a20Var = this.OooO00o;
        return a20Var.OooO00o.getString(a20Var.OooO0O0);
    }

    public T OooO0Oo(e20 e20Var, boolean z, Bundle bundle) {
        int i;
        Class<?> cls;
        if (e20Var.OooO0Oo()) {
            return null;
        }
        Bundle bundle2 = bundle != null ? (Bundle) bundle.clone() : new Bundle();
        if (!bundle2.containsKey(ErrorDialogManager.OooO0Oo)) {
            bundle2.putString(ErrorDialogManager.OooO0Oo, OooO0OO(e20Var, bundle2));
        }
        if (!bundle2.containsKey(ErrorDialogManager.OooO0o0)) {
            bundle2.putString(ErrorDialogManager.OooO0o0, OooO0O0(e20Var, bundle2));
        }
        if (!bundle2.containsKey(ErrorDialogManager.OooO0o)) {
            bundle2.putBoolean(ErrorDialogManager.OooO0o, z);
        }
        if (!bundle2.containsKey(ErrorDialogManager.OooO0oo) && (cls = this.OooO00o.OooO) != null) {
            bundle2.putSerializable(ErrorDialogManager.OooO0oo, cls);
        }
        if (!bundle2.containsKey(ErrorDialogManager.OooO0oO) && (i = this.OooO00o.OooO0oo) != 0) {
            bundle2.putInt(ErrorDialogManager.OooO0oO, i);
        }
        return OooO00o(e20Var, bundle2);
    }
}
