package com.anythink.core.common.p051b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1167f implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public int f3032a;

    /* JADX INFO: renamed from: d */
    public boolean f3035d;

    /* JADX INFO: renamed from: c */
    public boolean f3034c = false;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, Boolean> f3033b = new ConcurrentHashMap<>(3);

    public C1167f(boolean z) {
        this.f3035d = false;
        if (z) {
            this.f3035d = true;
            m2034a();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2034a() {
        C1322e.m3871a();
        C1320c.m3839a(C1175n.m2059a().m2148f()).m3851a(21, new C1243h());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f3035d) {
            return;
        }
        this.f3035d = true;
        m2034a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C1175n.m2059a().m2110a(activity);
        this.f3032a++;
        this.f3033b.put(activity.toString(), Boolean.TRUE);
        if (this.f3032a != 1 || this.f3035d) {
            return;
        }
        this.f3035d = true;
        m2034a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f3032a--;
        boolean zContainsKey = this.f3033b.containsKey(activity.toString());
        if (!this.f3034c && !zContainsKey) {
            this.f3034c = true;
            this.f3032a++;
        }
        if (zContainsKey) {
            try {
                this.f3033b.remove(activity.toString());
            } catch (Throwable unused) {
            }
        }
        if (this.f3032a == 0) {
            this.f3035d = false;
        }
    }
}
