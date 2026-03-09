package com.anythink.expressad.videocommon.p178b;

import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a;
import com.anythink.expressad.foundation.p120g.p135g.C1863c;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2323h {

    /* JADX INFO: renamed from: a */
    private C1863c f14447a;

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static C2323h f14448a = new C2323h(0);

        private a() {
        }
    }

    private C2323h() {
        if (C1773a.m8548c().m8557e() != null) {
            this.f14447a = new C1863c(C1773a.m8548c().m8557e());
        }
    }

    public /* synthetic */ C2323h(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    private static C2323h m11864a() {
        return a.f14448a;
    }

    /* JADX INFO: renamed from: b */
    private void m11865b() {
        if (C1773a.m8548c().m8557e() != null) {
            this.f14447a = new C1863c(C1773a.m8548c().m8557e());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11866a(AbstractRunnableC1861a abstractRunnableC1861a) {
        C1863c c1863c = this.f14447a;
        if (c1863c != null) {
            c1863c.m9653a(abstractRunnableC1861a);
        }
    }
}
