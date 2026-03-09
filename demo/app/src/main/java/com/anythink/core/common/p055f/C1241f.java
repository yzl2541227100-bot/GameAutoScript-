package com.anythink.core.common.p055f;

import com.anythink.core.common.p055f.C1233az;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.f.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1241f {

    /* JADX INFO: renamed from: a */
    public List<C1234b> f4114a;

    /* JADX INFO: renamed from: b */
    public C1234b f4115b;

    /* JADX INFO: renamed from: c */
    public boolean f4116c;

    /* JADX INFO: renamed from: a */
    public final C1234b m2975a() {
        List<C1234b> list = this.f4114a;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f4114a.get(0);
    }

    /* JADX INFO: renamed from: b */
    public final C1234b m2976b() {
        List<C1234b> list = this.f4114a;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f4114a.get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2977c() {
        return this.f4116c;
    }

    /* JADX INFO: renamed from: d */
    public final int m2978d() {
        List<C1234b> list = this.f4114a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final C1234b m2979e() {
        return this.f4115b;
    }

    /* JADX INFO: renamed from: f */
    public final List<C1233az.a> m2980f() {
        List<C1234b> list = this.f4114a;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C1234b> it = this.f4114a.iterator();
        while (it.hasNext()) {
            C1229av unitGroupInfo = it.next().m2904d().getUnitGroupInfo();
            arrayList.add(new C1233az.a(unitGroupInfo, unitGroupInfo.m2719M()));
        }
        return arrayList;
    }
}
