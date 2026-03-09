package com.anythink.core.common.p055f;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.anythink.core.api.ATMediationRequestInfo;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.C1317n;
import com.anythink.core.common.p051b.C1163b;
import com.anythink.core.common.p051b.C1175n;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.f.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1257v {

    /* JADX INFO: renamed from: a */
    public String f4480a;

    /* JADX INFO: renamed from: b */
    public ATMediationRequestInfo f4481b;

    /* JADX INFO: renamed from: c */
    public String f4482c;

    /* JADX INFO: renamed from: d */
    public int f4483d;

    /* JADX INFO: renamed from: e */
    public C1163b f4484e;

    /* JADX INFO: renamed from: f */
    public C1317n f4485f;

    /* JADX INFO: renamed from: g */
    public Map<String, Object> f4486g;

    /* JADX INFO: renamed from: h */
    public int f4487h;

    /* JADX INFO: renamed from: i */
    public C1238c f4488i;

    /* JADX INFO: renamed from: j */
    public boolean f4489j = false;

    /* JADX INFO: renamed from: k */
    public long f4490k = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l */
    public ATAdxBidFloorInfo f4491l;

    /* JADX INFO: renamed from: m */
    private Context f4492m;

    /* JADX INFO: renamed from: n */
    private WeakReference<Activity> f4493n;

    /* JADX INFO: renamed from: d */
    private int m3444d() {
        return this.f4483d;
    }

    /* JADX INFO: renamed from: a */
    public final Context m3445a() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f4493n;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            return activity;
        }
        Activity activityM2100F = C1175n.m2059a().m2100F();
        return activityM2100F != null ? activityM2100F : this.f4492m;
    }

    /* JADX INFO: renamed from: a */
    public final void m3446a(Context context) {
        this.f4492m = C1175n.m2059a().m2148f();
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        this.f4493n = new WeakReference<>((Activity) context);
    }

    /* JADX INFO: renamed from: b */
    public final C1257v m3447b() {
        C1257v c1257v = new C1257v();
        c1257v.f4481b = this.f4481b;
        c1257v.f4482c = this.f4482c;
        c1257v.f4492m = this.f4492m;
        c1257v.f4493n = this.f4493n;
        c1257v.f4483d = this.f4483d;
        c1257v.f4484e = this.f4484e;
        c1257v.f4485f = this.f4485f;
        c1257v.f4486g = this.f4486g;
        c1257v.f4487h = this.f4487h;
        return c1257v;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3448c() {
        int i = this.f4483d;
        return i == 13 || i == 14;
    }
}
