package com.anythink.core.common;

import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1182c;
import com.anythink.core.common.p052c.C1187h;
import com.anythink.core.common.p055f.C1258w;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.anythink.core.common.l */
/* JADX INFO: loaded from: classes.dex */
public class C1305l {

    /* JADX INFO: renamed from: c */
    private static volatile C1305l f4964c;

    /* JADX INFO: renamed from: a */
    public C1187h f4965a;

    /* JADX INFO: renamed from: b */
    private final String f4966b = getClass().getSimpleName();

    /* JADX INFO: renamed from: d */
    private ConcurrentHashMap<String, String> f4967d = new ConcurrentHashMap<>(3);

    /* JADX INFO: renamed from: com.anythink.core.common.l$1 */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1305l.this.f4965a.m2246c();
        }
    }

    public C1305l() {
        C1187h c1187hM2243a = C1187h.m2243a(C1182c.m2210a(C1175n.m2059a().m2148f()));
        this.f4965a = c1187hM2243a;
        List<C1258w> listM2247d = c1187hM2243a.m2247d();
        if (listM2247d != null) {
            Iterator<C1258w> it = listM2247d.iterator();
            while (it.hasNext()) {
                this.f4967d.put(it.next().m3450a(), "1");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1305l m3759a() {
        if (f4964c == null) {
            synchronized (C1305l.class) {
                if (f4964c == null) {
                    f4964c = new C1305l();
                }
            }
        }
        return f4964c;
    }

    /* JADX INFO: renamed from: b */
    public static int m3760b() {
        return C1355s.m4238b(C1175n.m2059a().m2148f(), C1169h.f3065p, C1169h.v.f3279q, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m3761a(String str) {
        Map<String, Object> mapM4171c = C1345i.m4171c(C1340d.m4031c(str));
        if (mapM4171c.size() == 0) {
            C1355s.m4235a(C1175n.m2059a().m2148f(), C1169h.f3065p, C1169h.v.f3279q, 0);
            return;
        }
        for (Map.Entry<String, Object> entry : mapM4171c.entrySet()) {
            try {
                if (C1345i.m4160a(C1175n.m2059a().m2148f(), entry.getValue().toString())) {
                    this.f4967d.put(entry.getKey(), "1");
                    this.f4965a.m2245a(entry.getKey());
                }
            } catch (Throwable unused) {
            }
        }
        C1355s.m4235a(C1175n.m2059a().m2148f(), C1169h.f3065p, C1169h.v.f3279q, m3760b() + mapM4171c.size());
        C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.l.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1305l.this.f4965a.m2246c();
            }
        }, 13, true);
    }

    /* JADX INFO: renamed from: c */
    public final JSONArray m3762c() {
        Iterator<Map.Entry<String, String>> it = this.f4967d.entrySet().iterator();
        JSONArray jSONArray = new JSONArray();
        while (it.hasNext()) {
            try {
                jSONArray.put(Long.parseLong(it.next().getKey()));
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }
}
