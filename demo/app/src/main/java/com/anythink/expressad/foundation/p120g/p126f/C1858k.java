package com.anythink.expressad.foundation.p120g.p126f;

import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import com.anythink.expressad.foundation.p120g.p126f.p132f.C1846c;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1858k<T> {

    /* JADX INFO: renamed from: a */
    public T f11459a;

    /* JADX INFO: renamed from: b */
    public C1824a f11460b;

    /* JADX INFO: renamed from: c */
    public C1846c f11461c;

    private C1858k(C1824a c1824a) {
        this.f11459a = null;
        this.f11460b = null;
        this.f11461c = null;
        this.f11460b = c1824a;
    }

    private C1858k(T t, C1846c c1846c) {
        this.f11459a = null;
        this.f11460b = null;
        this.f11461c = null;
        this.f11459a = t;
        this.f11461c = c1846c;
    }

    /* JADX INFO: renamed from: a */
    public static <T> C1858k<T> m9634a(C1824a c1824a) {
        return new C1858k<>(c1824a);
    }

    /* JADX INFO: renamed from: a */
    public static <T> C1858k<T> m9635a(T t, C1846c c1846c) {
        return new C1858k<>(t, c1846c);
    }

    /* JADX INFO: renamed from: a */
    private boolean m9636a() {
        return this.f11460b == null;
    }
}
