package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.haorui.sdk.core.HRConfig;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3375b;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3385g;
import com.umeng.analytics.pro.C3387i;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3386h {

    /* JADX INFO: renamed from: a */
    public static String f18497a;

    /* JADX INFO: renamed from: f */
    private static JSONObject f18498f = new JSONObject();

    /* JADX INFO: renamed from: g */
    private Application f18503g;

    /* JADX INFO: renamed from: e */
    private final Map<String, Long> f18502e = new HashMap();

    /* JADX INFO: renamed from: b */
    public boolean f18499b = false;

    /* JADX INFO: renamed from: c */
    public boolean f18500c = false;

    /* JADX INFO: renamed from: d */
    public Application.ActivityLifecycleCallbacks f18501d = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.analytics.pro.h.1
        public AnonymousClass1() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C3386h.this.m15517c(activity);
            C3386h.this.f18500c = false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C3386h c3386h = C3386h.this;
            if (c3386h.f18500c) {
                c3386h.f18500c = false;
                if (C3386h.f18497a.equals(activity.getPackageName() + "." + activity.getLocalClassName())) {
                    return;
                } else {
                    c3386h = C3386h.this;
                }
            }
            c3386h.m15514b(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    };

    /* JADX INFO: renamed from: com.umeng.analytics.pro.h$1 */
    public class AnonymousClass1 implements Application.ActivityLifecycleCallbacks {
        public AnonymousClass1() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C3386h.this.m15517c(activity);
            C3386h.this.f18500c = false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C3386h c3386h = C3386h.this;
            if (c3386h.f18500c) {
                c3386h.f18500c = false;
                if (C3386h.f18497a.equals(activity.getPackageName() + "." + activity.getLocalClassName())) {
                    return;
                } else {
                    c3386h = C3386h.this;
                }
            }
            c3386h.m15514b(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public C3386h(Activity activity) {
        this.f18503g = null;
        synchronized (this) {
            if (this.f18503g == null && activity != null) {
                this.f18503g = activity.getApplication();
                m15512a(activity);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m15512a(Activity activity) {
        if (this.f18499b) {
            return;
        }
        this.f18499b = true;
        this.f18503g.registerActivityLifecycleCallbacks(this.f18501d);
        if (f18497a == null) {
            this.f18500c = true;
            m15514b(activity);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15514b(Activity activity) {
        f18497a = activity.getPackageName() + "." + activity.getLocalClassName();
        if (AnalyticsConfig.FLAG_DPLUS) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3380b.f18382ai, f18497a);
                jSONObject.put("_$!ts", System.currentTimeMillis());
                JSONObject jSONObjectM15433i = C3375b.m15394a().m15433i();
                if (jSONObjectM15433i.length() > 0) {
                    jSONObject.put(C3380b.f18375ab, jSONObjectM15433i);
                }
                String strM15612c = C3393o.m15600a().m15612c();
                if (TextUtils.isEmpty(strM15612c)) {
                    strM15612c = HRConfig.GENDER_UNKNOWN;
                }
                jSONObject.put("__ii", strM15612c);
                if (C3393o.m15600a().m15611b()) {
                    jSONObject.put("__ii", HRConfig.GENDER_UNKNOWN);
                }
                UMWorkDispatch.sendEvent(activity.getApplicationContext(), C3387i.a.f18544k, CoreProtocol.getInstance(activity.getApplicationContext()), jSONObject);
            } catch (JSONException unused) {
            }
        }
        synchronized (this.f18502e) {
            this.f18502e.put(f18497a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15515b(Context context) {
        try {
            synchronized (f18498f) {
                if (context != null) {
                    if (f18498f.length() > 0) {
                        C3385g.m15485a(context).m15502a(C3393o.m15600a().m15614d(), f18498f, C3385g.a.AUTOPAGE);
                        f18498f = new JSONObject();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15517c(Activity activity) {
        long jCurrentTimeMillis = 0;
        try {
            synchronized (this.f18502e) {
                if (this.f18502e.containsKey(f18497a)) {
                    jCurrentTimeMillis = System.currentTimeMillis() - this.f18502e.get(f18497a).longValue();
                    this.f18502e.remove(f18497a);
                }
            }
            synchronized (f18498f) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    f18498f = jSONObject;
                    jSONObject.put(C3380b.f18410u, f18497a);
                    f18498f.put("duration", jCurrentTimeMillis);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15518a() {
        this.f18499b = false;
        Application application = this.f18503g;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.f18501d);
            this.f18503g = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15519a(Context context) {
        m15517c(null);
        m15518a();
    }
}
