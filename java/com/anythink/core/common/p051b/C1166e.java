package com.anythink.core.common.p051b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1392b;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C1166e implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public static final String f3015a = "start_time";

    /* JADX INFO: renamed from: b */
    public static final String f3016b = "end_time";

    /* JADX INFO: renamed from: c */
    public static final String f3017c = "psid";

    /* JADX INFO: renamed from: d */
    public static final String f3018d = "launch_mode";

    /* JADX INFO: renamed from: e */
    public static final int f3019e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f3020f = 1;

    /* JADX INFO: renamed from: g */
    public long f3021g;

    /* JADX INFO: renamed from: i */
    public JSONObject f3023i;

    /* JADX INFO: renamed from: k */
    private final String f3025k = C1166e.class.getName();

    /* JADX INFO: renamed from: j */
    public Runnable f3024j = new Runnable() { // from class: com.anythink.core.common.b.e.1
        @Override // java.lang.Runnable
        public final void run() {
            C1166e.m2030a(C1166e.this);
        }
    };

    /* JADX INFO: renamed from: h */
    public int f3022h = 0;

    /* JADX INFO: renamed from: l */
    private final Handler f3026l = C1335b.m3998a().m4003a(14);

    public C1166e(long j) {
        this.f3021g = j;
    }

    /* JADX INFO: renamed from: a */
    private void m2028a() {
        if (this.f3023i != null) {
            C1355s.m4237a(C1175n.m2059a().m2148f(), C1169h.f3065p, C1175n.m2059a().m2165o() + "playRecord", "");
            this.f3021g = 0L;
            JSONObject jSONObject = this.f3023i;
            long jOptLong = jSONObject.optLong("start_time");
            long jOptLong2 = jSONObject.optLong("end_time");
            String strOptString = jSONObject.optString(f3017c);
            int iOptInt = jSONObject.optInt(f3018d);
            this.f3023i = null;
            C1322e.m3873a(iOptInt == 1 ? 3 : 1, jOptLong, jOptLong2, strOptString);
            new StringBuilder("Time up to send application playTime, reset playStartTime and send agent, playtime:").append((jOptLong2 - jOptLong) / 1000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0091  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2029a(long r17) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p051b.C1166e.m2029a(long):void");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2030a(C1166e c1166e) {
        if (c1166e.f3023i != null) {
            C1355s.m4237a(C1175n.m2059a().m2148f(), C1169h.f3065p, C1175n.m2059a().m2165o() + "playRecord", "");
            c1166e.f3021g = 0L;
            JSONObject jSONObject = c1166e.f3023i;
            long jOptLong = jSONObject.optLong("start_time");
            long jOptLong2 = jSONObject.optLong("end_time");
            String strOptString = jSONObject.optString(f3017c);
            int iOptInt = jSONObject.optInt(f3018d);
            c1166e.f3023i = null;
            C1322e.m3873a(iOptInt == 1 ? 3 : 1, jOptLong, jOptLong2, strOptString);
            new StringBuilder("Time up to send application playTime, reset playStartTime and send agent, playtime:").append((jOptLong2 - jOptLong) / 1000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0091  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m2031a(com.anythink.core.common.p051b.C1166e r16, long r17) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p051b.C1166e.m2031a(com.anythink.core.common.b.e, long):void");
    }

    /* JADX INFO: renamed from: b */
    private void m2032b(long j) {
        String strM2165o = C1175n.m2059a().m2165o();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f3017c, C1175n.m2059a().m2168q());
            jSONObject.put("start_time", this.f3021g);
            jSONObject.put("end_time", System.currentTimeMillis());
            jSONObject.put(f3018d, this.f3022h);
            this.f3023i = jSONObject;
            C1355s.m4237a(C1175n.m2059a().m2148f(), C1169h.f3065p, strM2165o + "playRecord", jSONObject.toString());
            new StringBuilder("onActivityPaused: record leave time:").append(jSONObject.toString());
        } catch (Exception unused) {
        }
        if (C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(strM2165o).m4709F() == 1) {
            this.f3026l.postDelayed(this.f3024j, r0.m4707D());
        }
        new StringBuilder("onActivityPaused: Method use time:").append(System.currentTimeMillis() - j);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2033b(C1166e c1166e, long j) {
        String strM2165o = C1175n.m2059a().m2165o();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f3017c, C1175n.m2059a().m2168q());
            jSONObject.put("start_time", c1166e.f3021g);
            jSONObject.put("end_time", System.currentTimeMillis());
            jSONObject.put(f3018d, c1166e.f3022h);
            c1166e.f3023i = jSONObject;
            C1355s.m4237a(C1175n.m2059a().m2148f(), C1169h.f3065p, strM2165o + "playRecord", jSONObject.toString());
            new StringBuilder("onActivityPaused: record leave time:").append(jSONObject.toString());
        } catch (Exception unused) {
        }
        if (C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(strM2165o).m4709F() == 1) {
            c1166e.f3026l.postDelayed(c1166e.f3024j, r0.m4707D());
        }
        new StringBuilder("onActivityPaused: Method use time:").append(System.currentTimeMillis() - j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.f3026l.post(new Runnable() { // from class: com.anythink.core.common.b.e.3
            @Override // java.lang.Runnable
            public final void run() {
                C1166e.m2033b(C1166e.this, jCurrentTimeMillis);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.f3026l.post(new Runnable() { // from class: com.anythink.core.common.b.e.2
            @Override // java.lang.Runnable
            public final void run() {
                C1166e.m2031a(C1166e.this, jCurrentTimeMillis);
            }
        });
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
