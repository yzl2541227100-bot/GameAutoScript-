package com.anythink.core.common.p066o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.SparseBooleanArray;
import com.anythink.core.common.p066o.C1353q;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.o.t */
/* JADX INFO: loaded from: classes.dex */
public class C1356t {

    /* JADX INFO: renamed from: a */
    private static final int f5343a = 1;

    /* JADX INFO: renamed from: b */
    private static final int f5344b = 2;

    /* JADX INFO: renamed from: c */
    private static final int f5345c = 3;

    /* JADX INFO: renamed from: e */
    private static volatile C1356t f5346e;

    /* JADX INFO: renamed from: d */
    private final SparseBooleanArray f5347d = new SparseBooleanArray(3);

    /* JADX INFO: renamed from: a */
    public static C1356t m4243a() {
        if (f5346e == null) {
            synchronized (C1356t.class) {
                if (f5346e == null) {
                    f5346e = new C1356t();
                }
            }
        }
        return f5346e;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m4244a(Context context) {
        if (this.f5347d.indexOfKey(1) >= 0) {
            return this.f5347d.get(1);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 16) {
            this.f5347d.put(1, false);
            return false;
        }
        try {
            C1353q c1353q = new C1353q(context);
            C1353q.a aVarM4223a = c1353q.m4223a("com.huawei.hwid");
            String strM4224b = c1353q.m4224b("com.huawei.hwid");
            if (aVarM4223a == C1353q.a.ENABLED) {
                if ("B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(strM4224b)) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f5347d.put(1, z);
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m4245b() {
        if (this.f5347d.indexOfKey(3) >= 0) {
            return this.f5347d.get(3);
        }
        boolean z = false;
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            z = true;
        } catch (Exception unused) {
        }
        this.f5347d.put(3, z);
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m4246b(Context context) {
        if (this.f5347d.indexOfKey(2) >= 0) {
            return this.f5347d.get(2);
        }
        boolean z = false;
        try {
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices != null) {
                if (listQueryIntentServices.size() > 0) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f5347d.put(2, z);
        return z;
    }
}
