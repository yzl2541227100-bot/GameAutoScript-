package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.amap.C3401a;
import com.umeng.commonsdk.amap.C3402b;
import com.umeng.commonsdk.amap.UMAmapConfig;
import com.umeng.commonsdk.framework.C3404b;
import com.umeng.commonsdk.framework.C3405c;
import com.umeng.commonsdk.proguard.C3453d;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.proguard.C3457h;
import com.umeng.commonsdk.proguard.C3459j;
import com.umeng.commonsdk.proguard.C3460k;
import com.umeng.commonsdk.proguard.C3461l;
import com.umeng.commonsdk.proguard.C3467r;
import com.umeng.commonsdk.proguard.C3469t;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.C3489e;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class UMConfigureImpl {

    /* JADX INFO: renamed from: a */
    private static C3402b f18592a;

    /* JADX INFO: renamed from: b */
    private static boolean f18593b;

    /* JADX INFO: renamed from: a */
    private static synchronized void m15634a(Context context) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (new C3401a(applicationContext).m15637a() != null) {
                    String strM15647a = C3404b.m15647a(applicationContext);
                    String packageName = applicationContext.getPackageName();
                    if (!TextUtils.isEmpty(strM15647a) && !TextUtils.isEmpty(packageName) && strM15647a.equals(packageName)) {
                        if (f18592a == null) {
                            f18592a = new C3402b(applicationContext, 1, UMAmapConfig.AMAP_CACHE_WRITE_TIME);
                        }
                        if (f18592a.isAlive()) {
                            C3489e.m16329a("AmapLBS", "[lbs-build] not write start");
                        } else {
                            C3489e.m16329a("AmapLBS", "[lbs-build] begin write LBS");
                            f18592a.start();
                        }
                    }
                } else {
                    C3489e.m16329a("AmapLBS", "[lbs-send] not get AMAP !!!");
                }
            } catch (Throwable th) {
                C3489e.m16341c("AmapLBS", "e is " + th.getMessage());
                C3454e.m15904a(context, th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m15635b(final Context context) {
        if (context != null) {
            try {
                String strM15647a = C3404b.m15647a(context);
                String packageName = context.getPackageName();
                if (TextUtils.isEmpty(strM15647a) || TextUtils.isEmpty(packageName) || !strM15647a.equals(packageName)) {
                    return;
                }
                new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMConfigureImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            JSONObject jSONObjectM15915b = C3457h.m15915b(context);
                            if (jSONObjectM15915b == null || jSONObjectM15915b.length() <= 0) {
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("lbs", jSONObjectM15915b);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("tp", jSONObject);
                            UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                            uMSLEnvelopeBuild.buildSLEnvelope(context, uMSLEnvelopeBuild.buildSLBaseHeader(context), jSONObject2, UMAmapConfig.AMAP_CACHE_PATH);
                        } catch (Exception e) {
                            C3454e.m15904a(context, e);
                        }
                    }
                }).start();
            } catch (Throwable th) {
                C3454e.m15904a(context, th);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static synchronized void m15636c(final Context context) {
        if (context != null) {
            try {
                if (!f18593b) {
                    new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMConfigureImpl.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                String strM15647a = C3404b.m15647a(context);
                                String packageName = context.getPackageName();
                                if (TextUtils.isEmpty(strM15647a) || TextUtils.isEmpty(packageName) || !strM15647a.equals(packageName)) {
                                    return;
                                }
                                try {
                                    C3457h.m15914a(context);
                                } catch (Throwable th) {
                                    C3489e.m16341c(C3405c.f18619d, "e is " + th);
                                }
                                try {
                                    if (!C3461l.m15961a(context).m15963a()) {
                                        C3461l.m15961a(context).m15964b();
                                    }
                                } catch (Throwable th2) {
                                    C3489e.m16341c(C3405c.f18619d, "e is " + th2);
                                    th2.printStackTrace();
                                }
                                try {
                                    C3469t.m16033b(context);
                                } catch (Exception e) {
                                    C3489e.m16341c(C3405c.f18619d, "e is " + e);
                                }
                                try {
                                    C3459j.m15944n(context);
                                } catch (Exception e2) {
                                    C3489e.m16341c(C3405c.f18619d, "e is " + e2);
                                }
                                try {
                                    C3459j.m15929d(context);
                                } catch (Exception e3) {
                                    C3489e.m16341c(C3405c.f18619d, "e is " + e3);
                                }
                                try {
                                    C3467r.m16004b(context);
                                } catch (Exception e4) {
                                    C3489e.m16341c(C3405c.f18619d, "e is " + e4);
                                }
                                try {
                                    C3453d.m15882a(context);
                                } catch (Exception e5) {
                                    C3489e.m16341c(C3405c.f18619d, "e is " + e5);
                                }
                                try {
                                    C3453d.m15886b(context);
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable th3) {
                                C3454e.m15904a(context, th3);
                            }
                        }
                    }).start();
                    String strM15647a = C3404b.m15647a(context);
                    String packageName = context.getPackageName();
                    if (!TextUtils.isEmpty(strM15647a) && !TextUtils.isEmpty(packageName) && strM15647a.equals(packageName)) {
                        try {
                            C3459j.m15948r(context);
                        } catch (Exception e) {
                            C3489e.m16341c(C3405c.f18619d, "e is " + e);
                            C3454e.m15904a(context, e);
                        }
                    }
                    try {
                        if (!C3460k.m15953a(context).m15957a()) {
                            C3460k.m15953a(context).m15958b();
                        }
                    } catch (Throwable th) {
                        C3489e.m16341c(C3405c.f18619d, "e is " + th);
                        C3454e.m15904a(context, th);
                    }
                    f18593b = true;
                }
            } catch (Throwable th2) {
                C3489e.m16341c(C3405c.f18619d, "e is " + th2.getMessage());
                C3454e.m15904a(context, th2);
            }
        }
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        m15634a(applicationContext);
        m15635b(applicationContext);
        m15636c(applicationContext);
    }
}
