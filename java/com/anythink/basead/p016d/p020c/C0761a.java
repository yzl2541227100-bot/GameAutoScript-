package com.anythink.basead.p016d.p020c;

import android.text.TextUtils;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p016d.C0760c;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1218ak;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1248m;

/* JADX INFO: renamed from: com.anythink.basead.d.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0761a {
    /* JADX INFO: renamed from: a */
    private static void m449a(C1218ak c1218ak, C0760c c0760c, boolean z) {
        if (c1218ak == null || c0760c == null) {
            return;
        }
        c1218ak.m3384x(c0760c.m428a());
        if (!z) {
            c1218ak.m3386y(c0760c.m429b());
        }
        c1218ak.m3337e(c0760c.m431d());
        c1218ak.m3372r(c0760c.m430c());
        c1218ak.m3370q(c0760c.m432e());
        c1218ak.m3321b(c0760c.m433f());
        c1218ak.m3368p(c0760c.m434g());
        c1218ak.m3325c(c0760c.m435h());
        c1218ak.m3330d(c0760c.m436i());
        c1218ak.m3342f(c0760c.m437j());
    }

    /* JADX INFO: renamed from: a */
    public static void m450a(C1248m c1248m, AbstractC1217aj abstractC1217aj) {
        AbstractC1249n abstractC1249n;
        if (c1248m == null || abstractC1217aj == null || (abstractC1249n = c1248m.f4333n) == null || !(abstractC1249n instanceof C1218ak)) {
            return;
        }
        AbstractC1249n abstractC1249nM3220o = abstractC1217aj.m3220o();
        if (abstractC1249nM3220o != null) {
            abstractC1249nM3220o.m3384x(abstractC1249n.m3253E());
            abstractC1249nM3220o.m3386y(abstractC1249n.m3255F());
            abstractC1249nM3220o.m3372r(abstractC1249n.m3385y());
            abstractC1249nM3220o.m3337e(abstractC1249n.m3383x());
            abstractC1249nM3220o.m3374s(abstractC1249n.m3387z());
            abstractC1249nM3220o.m3370q(abstractC1249n.m3381w());
            abstractC1249nM3220o.m3321b(abstractC1249n.m3375t());
            abstractC1249nM3220o.m3368p(abstractC1249n.m3379v());
            abstractC1249nM3220o.m3330d(abstractC1249n.m3347h());
            abstractC1249nM3220o.m3325c(abstractC1249n.m3343g());
            abstractC1249nM3220o.m3342f(abstractC1249n.m3265K());
            c1248m.f4333n = abstractC1249nM3220o;
        } else {
            abstractC1217aj.m3186a(c1248m.f4333n);
        }
        if (!abstractC1217aj.m3170I()) {
            AbstractC1249n abstractC1249n2 = c1248m.f4333n;
            abstractC1249n2.m3297a(abstractC1249n2.m3308ai());
        }
        boolean z = !(abstractC1217aj instanceof C1245j) || TextUtils.isEmpty(((C1245j) abstractC1217aj).m3144a());
        if (!C0731d.m245a(abstractC1217aj, c1248m)) {
            c1248m.f4333n.m3355j(2);
        }
        if (z && TextUtils.isEmpty(abstractC1217aj.m3165E())) {
            c1248m.f4333n.m3376t(0);
            c1248m.f4333n.m3380v(0);
            c1248m.f4333n.m3264J(2);
            c1248m.f4333n.m3355j(2);
            c1248m.f4333n.m3250C(1);
            c1248m.f4333n.m3378u(-2);
            c1248m.f4333n.m3328c(false);
            c1248m.f4333n.m3333d(false);
            c1248m.f4333n.m3338e(false);
            c1248m.f4333n.m3290W(2);
            if (abstractC1217aj.m3210k()) {
                c1248m.f4333n.m3382w(1);
            }
        }
        if (c1248m.f4329j != 3 || C0731d.m245a(abstractC1217aj, c1248m)) {
            c1248m.f4333n.m3288V(0);
        }
        if (TextUtils.isEmpty(abstractC1217aj.m3165E())) {
            c1248m.f4333n.m3286U(1);
        }
    }
}
