package com.anythink.basead.p021e;

import com.anythink.basead.p015c.C0747e;
import com.anythink.core.common.p050a.C1150b;
import com.anythink.core.common.p065n.C1318a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.e.b */
/* JADX INFO: loaded from: classes.dex */
public class C0772b {

    /* JADX INFO: renamed from: a */
    public static final String f967a = "b";

    /* JADX INFO: renamed from: b */
    private Map<String, b> f968b;

    /* JADX INFO: renamed from: com.anythink.basead.e.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C0772b f969a = new C0772b(0);

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.e.b$b */
    public static abstract class b implements Serializable {

        /* JADX INFO: renamed from: a */
        private Map<String, Object> f970a;

        /* JADX INFO: renamed from: b */
        private int f971b;

        /* JADX INFO: renamed from: c */
        private volatile boolean f972c = false;

        public b() {
        }

        public b(Map<String, Object> map, final String str) {
            this.f970a = map;
            C1318a.m3818a().m3820a(str, new C1318a.a() { // from class: com.anythink.basead.e.b.b.1
                @Override // com.anythink.core.common.p065n.C1318a.a
                /* JADX INFO: renamed from: a */
                public final void mo550a(String str2) {
                    if (!str.equals(str2) || b.this.f972c) {
                        return;
                    }
                    b.this.m548a(3);
                    b.this.mo465d();
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo458a();

        /* JADX INFO: renamed from: a */
        public final void m548a(int i) {
            this.f971b = i;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo459a(C0747e c0747e);

        /* JADX INFO: renamed from: a */
        public abstract void mo460a(C0779i c0779i);

        /* JADX INFO: renamed from: a */
        public abstract void mo461a(boolean z);

        /* JADX INFO: renamed from: b */
        public abstract void mo462b();

        /* JADX INFO: renamed from: b */
        public abstract void mo463b(C0779i c0779i);

        /* JADX INFO: renamed from: c */
        public abstract void mo464c();

        /* JADX INFO: renamed from: d */
        public void mo465d() {
            if (this.f972c) {
                return;
            }
            this.f972c = true;
            Map<String, Object> map = this.f970a;
            if (map != null) {
                map.put(C1150b.b.f2927a, Integer.valueOf(this.f971b));
            }
        }

        /* JADX INFO: renamed from: e */
        public final int m549e() {
            return this.f971b;
        }
    }

    private C0772b() {
        this.f968b = new HashMap(2);
    }

    public /* synthetic */ C0772b(byte b2) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C0772b m542a() {
        return a.f969a;
    }

    /* JADX INFO: renamed from: a */
    public final b m543a(String str) {
        return this.f968b.get(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m544a(String str, b bVar) {
        this.f968b.put(str, bVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m545b(String str) {
        this.f968b.remove(str);
    }
}
