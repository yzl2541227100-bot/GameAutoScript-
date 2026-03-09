package com.anythink.expressad.foundation.p120g.p123c;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1812b extends AbstractC1816f {

    /* JADX INFO: renamed from: b */
    private static final String f11219b = "anythink_template/";

    /* JADX INFO: renamed from: c */
    private static final String f11220c = "anythink_template/res/Movies";

    /* JADX INFO: renamed from: d */
    private static final String f11221d = "anythink_template/res";

    /* JADX INFO: renamed from: e */
    private static final String f11222e = "anythink_template/res/.Anythink_VC";

    /* JADX INFO: renamed from: f */
    private static final String f11223f = "anythink_template/res/.anythink700";

    /* JADX INFO: renamed from: g */
    private static final String f11224g = "anythink_template/res/img";

    /* JADX INFO: renamed from: h */
    private static final String f11225h = "anythink_template/crashinfo";

    /* JADX INFO: renamed from: i */
    private static final String f11226i = "anythink_template/other";

    /* JADX INFO: renamed from: j */
    private static final String f11227j = "anythink_template/res/xml";

    /* JADX INFO: renamed from: k */
    private static final String f11228k = "anythink_template/anythink/config";

    /* JADX INFO: renamed from: l */
    private static final String f11229l = "anythink_template/res/res";

    /* JADX INFO: renamed from: m */
    private static final String f11230m = "anythink_template/res/html";

    public C1812b(String str) {
        super(str);
    }

    @Override // com.anythink.expressad.foundation.p120g.p123c.AbstractC1816f
    /* JADX INFO: renamed from: a */
    public final List<C1815e> mo9402a() {
        ArrayList arrayList = new ArrayList();
        AbstractC1816f.m9419a(arrayList, EnumC1811a.ANYTHINK_RES_MANAGER_DIR, f11221d);
        AbstractC1816f.m9419a(arrayList, EnumC1811a.AD_MOVIES, f11220c).m9413a(EnumC1811a.ANYTHINK_VC, f11222e);
        C1815e c1815eM9419a = AbstractC1816f.m9419a(arrayList, EnumC1811a.AD_ANYTHINK_700, f11223f);
        c1815eM9419a.m9413a(EnumC1811a.ANYTHINK_700_IMG, f11224g);
        c1815eM9419a.m9413a(EnumC1811a.ANYTHINK_700_XML, f11227j);
        c1815eM9419a.m9413a(EnumC1811a.MBRIDGE_700_CONFIG, f11228k);
        c1815eM9419a.m9413a(EnumC1811a.ANYTHINK_700_RES, f11229l);
        c1815eM9419a.m9413a(EnumC1811a.ANYTHINK_700_HTML, f11230m);
        EnumC1811a enumC1811a = EnumC1811a.ANYTHINK_OTHER;
        AbstractC1816f.m9419a(arrayList, enumC1811a, f11226i);
        AbstractC1816f.m9419a(arrayList, EnumC1811a.ANYTHINK_CRASH_INFO, f11225h);
        AbstractC1816f.m9419a(arrayList, enumC1811a, f11226i);
        return arrayList;
    }
}
