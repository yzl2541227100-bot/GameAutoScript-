package p285z2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.view.WindowManager;
import p285z2.ViewOnClickListenerC4497w9;

/* JADX INFO: renamed from: z2.w7 */
/* JADX INFO: loaded from: classes.dex */
public class C4495w7 {
    private static volatile C4495w7 OooO0o = null;
    private static final String OooO0o0 = "FloatWindowManager";
    private boolean OooO00o = true;
    private WindowManager OooO0O0 = null;
    private WindowManager.LayoutParams OooO0OO = null;
    private ViewOnClickListenerC4497w9 OooO0Oo;

    /* JADX INFO: renamed from: z2.w7$OooO */
    public class OooO implements OooOOO0 {
        public final /* synthetic */ Context OooO00o;

        public OooO(Context context) {
            this.OooO00o = context;
        }

        @Override // p285z2.C4495w7.OooOOO0
        public void OooO00o(boolean z) {
            if (z) {
                C3682a8.OooO00o(this.OooO00o);
            } else {
                Log.e(C4495w7.OooO0o0, "ROM:miui, user manually refuse OVERLAY_PERMISSION");
            }
        }
    }

    /* JADX INFO: renamed from: z2.w7$OooO00o */
    public class OooO00o implements OooOOO0 {
        public final /* synthetic */ Context OooO00o;

        public OooO00o(Context context) {
            this.OooO00o = context;
        }

        @Override // p285z2.C4495w7.OooOOO0
        public void OooO00o(boolean z) {
            if (z) {
                C3719b8.OooO00o(this.OooO00o);
            } else {
                Log.e(C4495w7.OooO0o0, "ROM:360, user manually refuse OVERLAY_PERMISSION");
            }
        }
    }

    /* JADX INFO: renamed from: z2.w7$OooO0O0 */
    public class OooO0O0 implements OooOOO0 {
        public final /* synthetic */ Context OooO00o;

        public OooO0O0(Context context) {
            this.OooO00o = context;
        }

        @Override // p285z2.C4495w7.OooOOO0
        public void OooO00o(boolean z) {
            if (z) {
                C4532x7.OooO00o(this.OooO00o);
            } else {
                Log.e(C4495w7.OooO0o0, "ROM:huawei, user manually refuse OVERLAY_PERMISSION");
            }
        }
    }

    /* JADX INFO: renamed from: z2.w7$OooO0OO */
    public class OooO0OO implements OooOOO0 {
        public final /* synthetic */ Context OooO00o;

        public OooO0OO(Context context) {
            this.OooO00o = context;
        }

        @Override // p285z2.C4495w7.OooOOO0
        public void OooO00o(boolean z) {
            if (z) {
                C4569y7.OooO00o(this.OooO00o);
            } else {
                Log.e(C4495w7.OooO0o0, "ROM:meizu, user manually refuse OVERLAY_PERMISSION");
            }
        }
    }

    /* JADX INFO: renamed from: z2.w7$OooO0o */
    public class OooO0o implements OooOOO0 {
        public final /* synthetic */ Context OooO00o;

        public OooO0o(Context context) {
            this.OooO00o = context;
        }

        @Override // p285z2.C4495w7.OooOOO0
        public void OooO00o(boolean z) throws Throwable {
            if (z) {
                C4606z7.OooO00o(this.OooO00o);
            } else {
                Log.e(C4495w7.OooO0o0, "ROM:miui, user manually refuse OVERLAY_PERMISSION");
            }
        }
    }

    /* JADX INFO: renamed from: z2.w7$OooOO0 */
    public class OooOO0 implements OooOOO0 {
        public final /* synthetic */ Context OooO00o;

        public OooOO0(Context context) {
            this.OooO00o = context;
        }

        @Override // p285z2.C4495w7.OooOOO0
        public void OooO00o(boolean z) {
            if (z) {
                try {
                    C4495w7.OooO0oO(this.OooO00o);
                } catch (Exception e) {
                    Log.e(C4495w7.OooO0o0, Log.getStackTraceString(e));
                }
            }
        }
    }

    /* JADX INFO: renamed from: z2.w7$OooOO0O */
    public class OooOO0O implements ViewOnClickListenerC4497w9.OooO00o {
        public final /* synthetic */ OooOOO0 OooO00o;

        public OooOO0O(OooOOO0 oooOOO0) {
            this.OooO00o = oooOOO0;
        }

        @Override // p285z2.ViewOnClickListenerC4497w9.OooO00o
        public void OooO00o(boolean z) {
            this.OooO00o.OooO00o(z);
            C4495w7.this.OooO0Oo.dismiss();
        }
    }

    /* JADX INFO: renamed from: z2.w7$OooOOO0 */
    public interface OooOOO0 {
        void OooO00o(boolean z);
    }

    private int OooO(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void OooO00o(Context context) {
        OooOo00(context, new OooO00o(context));
    }

    private void OooO0o(Context context) {
        if (C3756c8.OooO0OO()) {
            OooOOO(context);
        } else if (Build.VERSION.SDK_INT >= 23) {
            OooOo00(context, new OooOO0(context));
        }
    }

    public static void OooO0oO(Context context) throws IllegalAccessException, NoSuchFieldException {
        Intent intent = new Intent(Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION").get(null).toString());
        intent.setFlags(268435456);
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    private boolean OooO0oo(Context context) {
        if (C3756c8.OooO0OO()) {
            return OooOOO0(context);
        }
        Boolean bool = Boolean.TRUE;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                bool = (Boolean) Settings.class.getDeclaredMethod("canDrawOverlays", Context.class).invoke(null, context);
            } catch (Exception e) {
                Log.e(OooO0o0, Log.getStackTraceString(e));
            }
        }
        return bool.booleanValue();
    }

    public static C4495w7 OooOO0() {
        if (OooO0o == null) {
            synchronized (C4495w7.class) {
                if (OooO0o == null) {
                    OooO0o = new C4495w7();
                }
            }
        }
        return OooO0o;
    }

    private boolean OooOO0O(Context context) {
        return C4532x7.OooO0O0(context);
    }

    private void OooOO0o(Context context) {
        OooOo00(context, new OooO0O0(context));
    }

    private void OooOOO(Context context) {
        OooOo00(context, new OooO0OO(context));
    }

    private boolean OooOOO0(Context context) {
        return C4569y7.OooO0O0(context);
    }

    private boolean OooOOOO(Context context) {
        return C4606z7.OooO0O0(context);
    }

    private void OooOOOo(Context context) {
        OooOo00(context, new OooO0o(context));
    }

    private boolean OooOOo(Context context) {
        return C3682a8.OooO0O0(context);
    }

    private void OooOOo0(Context context) {
        OooOo00(context, new OooO(context));
    }

    private boolean OooOOoo(Context context) {
        return C3719b8.OooO0O0(context);
    }

    private void OooOo0(Context context, String str, OooOOO0 oooOOO0) {
        ViewOnClickListenerC4497w9 viewOnClickListenerC4497w9 = this.OooO0Oo;
        if (viewOnClickListenerC4497w9 != null && viewOnClickListenerC4497w9.isShowing()) {
            this.OooO0Oo.dismiss();
        }
        ViewOnClickListenerC4497w9 viewOnClickListenerC4497w92 = new ViewOnClickListenerC4497w9(context);
        this.OooO0Oo = viewOnClickListenerC4497w92;
        viewOnClickListenerC4497w92.OooO0o(new OooOO0O(oooOOO0));
        this.OooO0Oo.show();
    }

    private void OooOo00(Context context, OooOOO0 oooOOO0) {
        OooOo0(context, "您的手机没有授予悬浮窗权限，请开启后再试", oooOOO0);
    }

    public void OooO0OO(Context context) {
        if (OooO0o0(context)) {
            return;
        }
        OooO0Oo(context);
    }

    public void OooO0Oo(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            OooO0o(context);
            return;
        }
        if (C3756c8.OooO0Oo()) {
            OooOOOo(context);
            return;
        }
        if (C3756c8.OooO0OO()) {
            OooOOO(context);
            return;
        }
        if (C3756c8.OooO0O0()) {
            OooOO0o(context);
        } else if (C3756c8.OooO00o()) {
            OooO00o(context);
        } else if (C3756c8.OooO0o0()) {
            OooOOo0(context);
        }
    }

    public boolean OooO0o0(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            if (C3756c8.OooO0Oo()) {
                return OooOOOO(context);
            }
            if (C3756c8.OooO0OO()) {
                return OooOOO0(context);
            }
            if (C3756c8.OooO0O0()) {
                return OooOO0O(context);
            }
            if (C3756c8.OooO00o()) {
                return OooOOoo(context);
            }
            if (C3756c8.OooO0o0()) {
                return OooOOo(context);
            }
        }
        return OooO0oo(context);
    }
}
