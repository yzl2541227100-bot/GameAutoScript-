package com.anythink.expressad.foundation.p120g.p123c;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.c.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1816f {

    /* JADX INFO: renamed from: a */
    public C1815e f11245a;

    public AbstractC1816f(String str) {
        C1815e c1815e = new C1815e();
        c1815e.m9414a(str);
        c1815e.m9412a(EnumC1811a.AD_ROOT);
        List<C1815e> listMo9402a = mo9402a();
        if (listMo9402a.size() > 0) {
            c1815e.m9415a(listMo9402a);
        }
        this.f11245a = c1815e;
    }

    /* JADX INFO: renamed from: a */
    public static C1815e m9419a(ArrayList<C1815e> arrayList, EnumC1811a enumC1811a, String str) {
        C1815e c1815e = new C1815e();
        c1815e.m9412a(enumC1811a);
        c1815e.m9414a(str);
        arrayList.add(c1815e);
        return c1815e;
    }

    /* JADX INFO: renamed from: a */
    public abstract List<C1815e> mo9402a();

    /* JADX INFO: renamed from: b */
    public final C1815e m9420b() {
        return this.f11245a;
    }
}
