package com.anythink.core.common.p065n;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.n.a */
/* JADX INFO: loaded from: classes.dex */
public class C1318a {

    /* JADX INFO: renamed from: a */
    private static volatile C1318a f5028a;

    /* JADX INFO: renamed from: b */
    private final Map<String, a> f5029b = new ConcurrentHashMap(2);

    /* JADX INFO: renamed from: com.anythink.core.common.n.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo550a(String str);
    }

    private C1318a() {
    }

    /* JADX INFO: renamed from: a */
    public static C1318a m3818a() {
        if (f5028a == null) {
            synchronized (C1318a.class) {
                if (f5028a == null) {
                    f5028a = new C1318a();
                }
            }
        }
        return f5028a;
    }

    /* JADX INFO: renamed from: a */
    public final void m3819a(String str) {
        a aVarRemove;
        if (TextUtils.isEmpty(str) || (aVarRemove = this.f5029b.remove(str)) == null) {
            return;
        }
        aVarRemove.mo550a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m3820a(String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f5029b.put(str, aVar);
    }
}
