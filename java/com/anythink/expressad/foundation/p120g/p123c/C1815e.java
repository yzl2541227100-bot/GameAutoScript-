package com.anythink.expressad.foundation.p120g.p123c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.c.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1815e {

    /* JADX INFO: renamed from: a */
    private EnumC1811a f11241a;

    /* JADX INFO: renamed from: b */
    private String f11242b;

    /* JADX INFO: renamed from: c */
    private C1815e f11243c;

    /* JADX INFO: renamed from: d */
    private List<C1815e> f11244d;

    /* JADX INFO: renamed from: a */
    private void m9409a(C1815e c1815e) {
        this.f11243c = c1815e;
    }

    /* JADX INFO: renamed from: b */
    private void m9410b(C1815e c1815e) {
        if (this.f11244d == null) {
            this.f11244d = new ArrayList();
        }
        c1815e.f11243c = this;
        this.f11244d.add(c1815e);
    }

    /* JADX INFO: renamed from: a */
    public final EnumC1811a m9411a() {
        return this.f11241a;
    }

    /* JADX INFO: renamed from: a */
    public final void m9412a(EnumC1811a enumC1811a) {
        this.f11241a = enumC1811a;
    }

    /* JADX INFO: renamed from: a */
    public final void m9413a(EnumC1811a enumC1811a, String str) {
        C1815e c1815e = new C1815e();
        c1815e.f11241a = enumC1811a;
        c1815e.f11242b = str;
        m9410b(c1815e);
    }

    /* JADX INFO: renamed from: a */
    public final void m9414a(String str) {
        this.f11242b = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m9415a(List<C1815e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<C1815e> it = list.iterator();
        while (it.hasNext()) {
            m9410b(it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m9416b() {
        return this.f11242b;
    }

    /* JADX INFO: renamed from: c */
    public final C1815e m9417c() {
        return this.f11243c;
    }

    /* JADX INFO: renamed from: d */
    public final List<C1815e> m9418d() {
        return this.f11244d;
    }
}
