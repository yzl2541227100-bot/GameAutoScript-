package com.anythink.core.common.res.p070a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.res.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C1377c {

    /* JADX INFO: renamed from: a */
    private static volatile C1377c f5528a;

    /* JADX INFO: renamed from: b */
    private final Map<String, C1375a> f5529b = new HashMap();

    private C1377c() {
    }

    /* JADX INFO: renamed from: a */
    public static C1377c m4478a() {
        if (f5528a == null) {
            synchronized (C1377c.class) {
                if (f5528a == null) {
                    f5528a = new C1377c();
                }
            }
        }
        return f5528a;
    }

    /* JADX INFO: renamed from: a */
    public final C1375a m4479a(String str) {
        C1375a c1375a = this.f5529b.get(str);
        if (c1375a != null) {
            return c1375a;
        }
        C1375a c1375a2 = new C1375a(str);
        this.f5529b.put(str, c1375a2);
        return c1375a2;
    }

    /* JADX INFO: renamed from: b */
    public final void m4480b(String str) {
        if (this.f5529b == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f5529b.remove(str);
    }
}
