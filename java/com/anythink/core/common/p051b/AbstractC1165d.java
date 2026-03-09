package com.anythink.core.common.p051b;

import android.app.Activity;
import android.os.Looper;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p066o.p068b.C1335b;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.anythink.core.common.b.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1165d {
    public boolean isRefresh;
    public WeakReference<Activity> mActivityRef;
    private C1243h mTrackingInfo;
    private C1229av mUnitGroupInfo;

    public final C1243h getTrackingInfo() {
        return this.mTrackingInfo;
    }

    public final C1229av getUnitGroupInfo() {
        return this.mUnitGroupInfo;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public final void postOnMainThread(Runnable runnable) {
        C1175n.m2059a().m2135b(runnable);
    }

    public final void postOnMainThreadDelayed(Runnable runnable, long j) {
        C1175n.m2059a().m2118a(runnable, j);
    }

    public final void refreshActivityContext(Activity activity) {
        this.mActivityRef = new WeakReference<>(activity);
    }

    public final void runOnNetworkRequestThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C1335b.m3998a().m4010c(runnable);
        } else {
            runnable.run();
        }
    }

    public final void setRefresh(boolean z) {
        this.isRefresh = z;
    }

    public final void setTrackingInfo(C1243h c1243h) {
        this.mTrackingInfo = c1243h;
    }

    public final void setUnitGroupInfo(C1229av c1229av) {
        this.mUnitGroupInfo = c1229av;
    }
}
