package com.anythink.core.common.p055f;

import com.anythink.core.p072d.C1396f;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.f.ap */
/* JADX INFO: loaded from: classes.dex */
public final class C1223ap {

    /* JADX INFO: renamed from: a */
    public C1396f f3874a;

    /* JADX INFO: renamed from: b */
    public C1243h f3875b;

    /* JADX INFO: renamed from: c */
    public List<C1229av> f3876c;

    /* JADX INFO: renamed from: d */
    public List<C1229av> f3877d;

    /* JADX INFO: renamed from: e */
    public List<C1229av> f3878e;

    /* JADX INFO: renamed from: f */
    public List<C1229av> f3879f;

    /* JADX INFO: renamed from: g */
    public int f3880g;

    public C1223ap(C1396f c1396f, C1243h c1243h, int i) {
        this.f3880g = 0;
        this.f3874a = c1396f;
        this.f3875b = c1243h;
        this.f3880g = i;
    }

    /* JADX INFO: renamed from: a */
    public final C1396f m2618a() {
        return this.f3874a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2619a(List<C1229av> list) {
        this.f3876c = list;
    }

    /* JADX INFO: renamed from: b */
    public final int m2620b() {
        return this.f3880g;
    }

    /* JADX INFO: renamed from: b */
    public final void m2621b(List<C1229av> list) {
        this.f3877d = list;
    }

    /* JADX INFO: renamed from: c */
    public final C1243h m2622c() {
        return this.f3875b;
    }

    /* JADX INFO: renamed from: c */
    public final void m2623c(List<C1229av> list) {
        this.f3878e = list;
    }

    /* JADX INFO: renamed from: d */
    public final List<C1229av> m2624d() {
        return this.f3876c;
    }

    /* JADX INFO: renamed from: d */
    public final void m2625d(List<C1229av> list) {
        this.f3879f = list;
    }

    /* JADX INFO: renamed from: e */
    public final List<C1229av> m2626e() {
        return this.f3877d;
    }

    /* JADX INFO: renamed from: f */
    public final List<C1229av> m2627f() {
        return this.f3878e;
    }

    /* JADX INFO: renamed from: g */
    public final List<C1229av> m2628g() {
        return this.f3879f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2629h() {
        List<C1229av> list = this.f3876c;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<C1229av> list2 = this.f3877d;
        if (list2 != null && list2.size() > 0) {
            return true;
        }
        List<C1229av> list3 = this.f3878e;
        if (list3 != null && list3.size() > 0) {
            return true;
        }
        List<C1229av> list4 = this.f3879f;
        return list4 != null && list4.size() > 0;
    }
}
