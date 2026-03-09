package com.octopus.p222ad.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.octopus.p222ad.utils.p258b.C3255f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.octopus.ad.utils.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3265f {

    /* JADX INFO: renamed from: f */
    private String f17919f;

    /* JADX INFO: renamed from: i */
    private InterfaceC3263d f17922i;

    /* JADX INFO: renamed from: a */
    private String f17914a = "OnLineStateClass";

    /* JADX INFO: renamed from: b */
    private int f17915b = 0;

    /* JADX INFO: renamed from: c */
    private boolean f17916c = true;

    /* JADX INFO: renamed from: d */
    private boolean f17917d = false;

    /* JADX INFO: renamed from: e */
    private boolean f17918e = false;

    /* JADX INFO: renamed from: g */
    private Map<String, String> f17920g = new HashMap();

    /* JADX INFO: renamed from: h */
    private long f17921h = 0;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m15028d(C3265f c3265f) {
        int i = c3265f.f17915b;
        c3265f.f17915b = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m15032h(C3265f c3265f) {
        int i = c3265f.f17915b;
        c3265f.f17915b = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public void m15035a(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.f17921h = System.currentTimeMillis() / 1000;
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.octopus.ad.utils.f.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C3265f.this.f17919f = activity.getClass().getSimpleName();
                C3265f.this.f17920g.put(C3265f.this.f17919f, C3265f.this.f17919f);
                C3265f.this.f17916c = true;
                C3265f.this.f17917d = false;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                C3265f.this.f17920g.remove(activity.getClass().getSimpleName());
                if (C3265f.this.f17920g.size() == 0 && C3265f.this.f17916c) {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    if (C3265f.this.f17922i != null) {
                        long unused = C3265f.this.f17921h;
                        C3265f.this.f17922i.mo14453a(jCurrentTimeMillis, C3265f.this.f17921h);
                        C3265f.this.f17921h = System.currentTimeMillis() / 1000;
                    }
                    C3265f.this.f17916c = false;
                }
                if (C3265f.this.f17920g.size() == 0) {
                    C3265f.this.f17918e = true;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                C3265f.this.f17917d = !activity.getClass().getSimpleName().equals(C3265f.this.f17919f);
                C3265f.this.f17919f = activity.getClass().getSimpleName();
                if (!C3265f.this.f17916c || C3265f.this.f17918e) {
                    C3265f.this.f17918e = false;
                    if (C3265f.this.f17922i != null) {
                        C3265f.this.f17922i.mo14452a();
                    }
                    C3265f.this.f17921h = System.currentTimeMillis() / 1000;
                    C3265f.this.f17916c = true;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                C3255f.m14981a(C3265f.this.f17914a, "onActivityStarted");
                C3265f.m15028d(C3265f.this);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                C3255f.m14981a(C3265f.this.f17914a, "onActivityStopped");
                C3265f.m15032h(C3265f.this);
                if (activity.getClass().getSimpleName().equals(C3265f.this.f17919f)) {
                    if (!C3265f.this.f17917d || C3265f.this.f17920g.size() == 1) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        if (C3265f.this.f17922i != null) {
                            long unused = C3265f.this.f17921h;
                            C3265f.this.f17922i.mo14453a(C3265f.this.f17921h, jCurrentTimeMillis);
                            C3265f.this.f17921h = System.currentTimeMillis() / 1000;
                        }
                        C3265f.this.f17916c = false;
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m15036a(InterfaceC3263d interfaceC3263d) {
        this.f17922i = interfaceC3263d;
    }
}
