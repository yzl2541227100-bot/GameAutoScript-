package p285z2;

import android.app.Activity;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class qe0 {
    private static final String OooO00o = "PopupCompatManager";
    private static final int OooO0O0 = 5894;
    private static final OooO0OO OooO0OO = new OooO0O0();

    public static abstract class OooO00o implements OooO0OO {
        @Override // z2.qe0.OooO0OO
        public void OooO00o(oe0 oe0Var) {
        }

        @Override // z2.qe0.OooO0OO
        public void OooO0O0(oe0 oe0Var, View view, int i, int i2, int i3) {
            if (OooO0Oo(oe0Var)) {
                return;
            }
            Activity activityOooOO0o = oe0Var.OooOO0o(view.getContext());
            if (activityOooOO0o == null) {
                Log.e(qe0.OooO00o, "please make sure that context is instance of activity");
                return;
            }
            OooO0o(oe0Var, activityOooOO0o);
            OooO0oo(activityOooOO0o, oe0Var, view, i, i2, i3);
            OooO0o0(oe0Var, activityOooOO0o);
        }

        @Override // z2.qe0.OooO0OO
        public void OooO0OO(oe0 oe0Var, View view, int i, int i2, int i3) {
            if (OooO0Oo(oe0Var)) {
                return;
            }
            Activity activityOooOO0o = oe0Var.OooOO0o(view.getContext());
            if (activityOooOO0o == null) {
                Log.e(qe0.OooO00o, "please make sure that context is instance of activity");
                return;
            }
            OooO0o(oe0Var, activityOooOO0o);
            OooO0oO(activityOooOO0o, oe0Var, view, i, i2, i3);
            OooO0o0(oe0Var, activityOooOO0o);
        }

        public boolean OooO0Oo(oe0 oe0Var) {
            return oe0Var != null && oe0Var.OooO0OO();
        }

        public void OooO0o(oe0 oe0Var, Activity activity) {
            if (qe0.OooO0OO(activity)) {
                oe0Var.OooO0oo();
            }
        }

        public void OooO0o0(oe0 oe0Var, Activity activity) {
            if (oe0Var.OooOO0()) {
                oe0Var.getContentView().setSystemUiVisibility(qe0.OooO0O0);
                oe0Var.OooOO0O();
            }
        }

        public abstract void OooO0oO(Activity activity, oe0 oe0Var, View view, int i, int i2, int i3);

        public abstract void OooO0oo(Activity activity, oe0 oe0Var, View view, int i, int i2, int i3);
    }

    public static class OooO0O0 extends OooO00o {
        public int[] OooO00o = new int[2];

        @Override // z2.qe0.OooO00o
        public void OooO0oO(Activity activity, oe0 oe0Var, View view, int i, int i2, int i3) {
            if (view != null) {
                view.getLocationInWindow(this.OooO00o);
                int[] iArr = this.OooO00o;
                int i4 = iArr[0];
                i2 = iArr[1] + view.getHeight();
                i = i4;
            }
            oe0Var.OooO0o0(view, 0, i, i2);
        }

        @Override // z2.qe0.OooO00o
        public void OooO0oo(Activity activity, oe0 oe0Var, View view, int i, int i2, int i3) {
            oe0Var.OooO0o0(view, i, i2, i3);
        }
    }

    public interface OooO0OO {
        void OooO00o(oe0 oe0Var);

        void OooO0O0(oe0 oe0Var, View view, int i, int i2, int i3);

        void OooO0OO(oe0 oe0Var, View view, int i, int i2, int i3);
    }

    public static void OooO0O0(oe0 oe0Var) {
        OooO0OO oooO0OO = OooO0OO;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(oe0Var);
        }
    }

    public static boolean OooO0OO(Activity activity) {
        if (activity == null) {
            return false;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i = activity.getWindow().getAttributes().flags;
            int windowSystemUiVisibility = decorView.getWindowSystemUiVisibility();
            if ((i & 1024) != 0) {
                return ((windowSystemUiVisibility & 2) == 0 && (windowSystemUiVisibility & 512) == 0) ? false : true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void OooO0Oo(oe0 oe0Var, View view, int i, int i2, int i3) {
        OooO0OO oooO0OO = OooO0OO;
        if (oooO0OO != null) {
            oooO0OO.OooO0OO(oe0Var, view, i, i2, i3);
        }
    }

    public static void OooO0o0(oe0 oe0Var, View view, int i, int i2, int i3) {
        OooO0OO oooO0OO = OooO0OO;
        if (oooO0OO != null) {
            oooO0OO.OooO0O0(oe0Var, view, i, i2, i3);
        }
    }
}
