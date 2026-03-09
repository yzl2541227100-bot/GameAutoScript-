package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1224aq;
import com.anythink.core.common.p066o.C1355s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.v */
/* JADX INFO: loaded from: classes.dex */
public class C1388v {

    /* JADX INFO: renamed from: b */
    private static final String f5624b = "v";

    /* JADX INFO: renamed from: f */
    private static volatile C1388v f5625f;

    /* JADX INFO: renamed from: a */
    public Context f5626a;

    /* JADX INFO: renamed from: c */
    private final Map<String, Integer> f5627c = new ConcurrentHashMap(8);

    /* JADX INFO: renamed from: d */
    private final Map<String, C1224aq> f5628d = new ConcurrentHashMap(8);

    /* JADX INFO: renamed from: e */
    private final Map<String, Boolean> f5629e = new ConcurrentHashMap(8);

    private C1388v(Context context) {
        this.f5626a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static C1388v m4576a(Context context) {
        if (f5625f == null) {
            synchronized (C1388v.class) {
                if (f5625f == null) {
                    f5625f = new C1388v(context);
                }
            }
        }
        return f5625f;
    }

    /* JADX INFO: renamed from: c */
    private boolean m4577c(String str) {
        Boolean boolValueOf = this.f5629e.get(str);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C1355s.m4242c(this.f5626a, C1169h.f3044I, str));
            if (boolValueOf.booleanValue()) {
                StringBuilder sb = new StringBuilder("checkFirstLoadAfterInstall: ");
                sb.append(str);
                sb.append(",  update to false");
                C1355s.m4241b(this.f5626a, C1169h.f3044I, str);
            }
            this.f5629e.put(str, Boolean.FALSE);
        }
        StringBuilder sb2 = new StringBuilder("checkFirstLoadAfterInstall: ");
        sb2.append(str);
        sb2.append(", is first load after install: ");
        sb2.append(boolValueOf);
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final C1224aq m4578a(String str, String str2) {
        Boolean boolValueOf = this.f5629e.get(str);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C1355s.m4242c(this.f5626a, C1169h.f3044I, str));
            if (boolValueOf.booleanValue()) {
                StringBuilder sb = new StringBuilder("checkFirstLoadAfterInstall: ");
                sb.append(str);
                sb.append(",  update to false");
                C1355s.m4241b(this.f5626a, C1169h.f3044I, str);
            }
            this.f5629e.put(str, Boolean.FALSE);
        }
        StringBuilder sb2 = new StringBuilder("checkFirstLoadAfterInstall: ");
        sb2.append(str);
        sb2.append(", is first load after install: ");
        sb2.append(boolValueOf);
        boolean zBooleanValue = boolValueOf.booleanValue();
        C1224aq c1224aqRemove = this.f5628d.remove(str);
        if (c1224aqRemove == null) {
            StringBuilder sb3 = new StringBuilder("placementId: ");
            sb3.append(str);
            sb3.append(", first request after boot");
            c1224aqRemove = new C1224aq("", zBooleanValue);
        } else {
            StringBuilder sb4 = new StringBuilder("placementId: ");
            sb4.append(str);
            sb4.append(", not first request after boot");
        }
        this.f5628d.put(str, new C1224aq(str2, false));
        return c1224aqRemove;
    }

    /* JADX INFO: renamed from: a */
    public final void m4579a(String str) {
        Integer num = this.f5627c.get(str);
        if (num == null) {
            StringBuilder sb = new StringBuilder("updateBidCount: ");
            sb.append(str);
            sb.append(", it is first bid");
            this.f5627c.put(str, 1);
            return;
        }
        StringBuilder sb2 = new StringBuilder("updateBidCount: ");
        sb2.append(str);
        sb2.append(", bid count: ");
        sb2.append(num.intValue() + 1);
        this.f5627c.put(str, Integer.valueOf(num.intValue() + 1));
    }

    /* JADX INFO: renamed from: a */
    public final void m4580a(String str, String str2, boolean z) {
        C1224aq c1224aq;
        if (TextUtils.isEmpty(str) || (c1224aq = this.f5628d.get(str)) == null || !TextUtils.equals(str2, c1224aq.m2630a())) {
            return;
        }
        StringBuilder sb = new StringBuilder("recordLoadResult: ");
        sb.append(str);
        sb.append(", requestId: ");
        sb.append(str2);
        sb.append(", load result: ");
        sb.append(z);
        c1224aq.m2631a(z);
    }

    /* JADX INFO: renamed from: b */
    public final int m4581b(String str) {
        Integer num = this.f5627c.get(str);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }
}
