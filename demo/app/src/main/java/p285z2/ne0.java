package p285z2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import razerdp.basepopup.BasePopupWindow;
import razerdp.util.log.PopupLog;

/* JADX INFO: loaded from: classes2.dex */
public final class ne0 {
    public OooO0O0 OooO00o;
    private WeakReference<Activity> OooO0O0;
    private int OooO0OO;

    public class OooO00o implements Application.ActivityLifecycleCallbacks {
        public OooO00o() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            ne0.this.OooO0O0 = new WeakReference(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            ne0.OooO0O0(ne0.this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ne0.OooO0OO(ne0.this);
        }
    }

    public class OooO0O0 implements me0 {
        private static final String OooO0OO = "razerdp.basepopup.BasePopupSupporterSupport";
        private static final String OooO0Oo = "razerdp.basepopup.BasePopupSupporterLifeCycle";
        private static final String OooO0o0 = "razerdp.basepopup.BasePopupSupporterX";
        private List<me0> OooO00o = new ArrayList();

        public OooO0O0(Context context) {
            try {
                if (ne0.this.OooO(OooO0OO)) {
                    this.OooO00o.add((me0) Class.forName(OooO0OO).newInstance());
                }
                if (ne0.this.OooO(OooO0Oo)) {
                    this.OooO00o.add((me0) Class.forName(OooO0Oo).newInstance());
                }
                if (ne0.this.OooO(OooO0o0)) {
                    this.OooO00o.add((me0) Class.forName(OooO0o0).newInstance());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InstantiationException e3) {
                e3.printStackTrace();
            }
            PopupLog.OooO0oo(this.OooO00o);
        }

        @Override // p285z2.me0
        public BasePopupWindow OooO00o(BasePopupWindow basePopupWindow, Object obj) {
            if (lf0.OooO0OO(this.OooO00o)) {
                return null;
            }
            for (me0 me0Var : this.OooO00o) {
                if (basePopupWindow.o00O0O == null) {
                    return basePopupWindow;
                }
                me0Var.OooO00o(basePopupWindow, obj);
            }
            return basePopupWindow;
        }

        @Override // p285z2.me0
        public BasePopupWindow OooO0O0(BasePopupWindow basePopupWindow, Object obj) {
            if (lf0.OooO0OO(this.OooO00o)) {
                return null;
            }
            for (me0 me0Var : this.OooO00o) {
                if (basePopupWindow.o00O0O != null) {
                    return basePopupWindow;
                }
                me0Var.OooO0O0(basePopupWindow, obj);
            }
            return basePopupWindow;
        }

        @Override // p285z2.me0
        public View OooO0OO(BasePopupWindow basePopupWindow, Activity activity) {
            if (lf0.OooO0OO(this.OooO00o)) {
                return null;
            }
            Iterator<me0> it = this.OooO00o.iterator();
            while (it.hasNext()) {
                View viewOooO0OO = it.next().OooO0OO(basePopupWindow, activity);
                if (viewOooO0OO != null) {
                    return viewOooO0OO;
                }
            }
            return null;
        }
    }

    public static class OooO0OO {
        private static ne0 OooO00o = new ne0(null);

        private OooO0OO() {
        }
    }

    private ne0() {
        this.OooO0OO = 0;
    }

    public /* synthetic */ ne0(OooO00o oooO00o) {
        this();
    }

    public boolean OooO(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static /* synthetic */ int OooO0O0(ne0 ne0Var) {
        int i = ne0Var.OooO0OO;
        ne0Var.OooO0OO = i + 1;
        return i;
    }

    public static /* synthetic */ int OooO0OO(ne0 ne0Var) {
        int i = ne0Var.OooO0OO;
        ne0Var.OooO0OO = i - 1;
        return i;
    }

    public static ne0 OooO0o0() {
        return OooO0OO.OooO00o;
    }

    private void OooOO0(Application application) {
        application.registerActivityLifecycleCallbacks(new OooO00o());
    }

    public Activity OooO0o() {
        WeakReference<Activity> weakReference = this.OooO0O0;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void OooO0oO(Context context) {
        if (this.OooO00o != null) {
            return;
        }
        OooOO0(context instanceof Application ? (Application) context : (Application) context.getApplicationContext());
        this.OooO00o = new OooO0O0(context);
    }

    public boolean OooO0oo() {
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.OooO0OO <= 0);
        PopupLog.OooO("isAppOnBackground", objArr);
        return this.OooO0OO <= 0;
    }
}
