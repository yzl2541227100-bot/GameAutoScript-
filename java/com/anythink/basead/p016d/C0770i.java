package com.anythink.basead.p016d;

import com.anythink.core.api.BaseAd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.d.i */
/* JADX INFO: loaded from: classes.dex */
public class C0770i {

    /* JADX INFO: renamed from: a */
    public static final String f964a = "i";

    /* JADX INFO: renamed from: b */
    private Map<String, BaseAd> f965b;

    /* JADX INFO: renamed from: com.anythink.basead.d.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C0770i f966a = new C0770i(0);

        private a() {
        }
    }

    private C0770i() {
        this.f965b = new HashMap(2);
    }

    public /* synthetic */ C0770i(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C0770i m538a() {
        return a.f966a;
    }

    /* JADX INFO: renamed from: a */
    public final BaseAd m539a(String str) {
        return this.f965b.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m540a(String str, BaseAd baseAd) {
        this.f965b.put(str, baseAd);
    }
}
