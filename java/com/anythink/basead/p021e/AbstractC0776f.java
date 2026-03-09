package com.anythink.basead.p021e;

import com.anythink.core.common.p050a.C1152d;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1245j;

/* JADX INFO: renamed from: com.anythink.basead.e.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0776f implements InterfaceC0780j {

    /* JADX INFO: renamed from: a */
    public AbstractC1247l f977a;

    /* JADX INFO: renamed from: b */
    public C1243h f978b;

    public AbstractC0776f(AbstractC1247l abstractC1247l, C1243h c1243h) {
        this.f977a = abstractC1247l;
        this.f978b = c1243h;
    }

    /* JADX INFO: renamed from: a */
    private void m552a() {
        AbstractC1247l abstractC1247l = this.f977a;
        if (abstractC1247l instanceof C1245j) {
            C1245j c1245j = (C1245j) abstractC1247l;
            if (c1245j.m3150c() == 1) {
                C1152d.m1954a().m1961b(c1245j);
            }
        }
    }

    @Override // com.anythink.basead.p021e.InterfaceC0771a
    public void onAdClick(C0779i c0779i) {
        C1243h c1243h = this.f978b;
        if (c1243h != null) {
            c1243h.m3019B(c0779i.f979a);
            this.f978b.m3021C(c0779i.f980b);
        }
    }

    @Override // com.anythink.basead.p021e.InterfaceC0771a
    public void onAdShow(C0779i c0779i) {
        AbstractC1247l abstractC1247l = this.f977a;
        if (abstractC1247l instanceof C1245j) {
            C1245j c1245j = (C1245j) abstractC1247l;
            if (c1245j.m3150c() == 1) {
                C1152d.m1954a().m1961b(c1245j);
            }
        }
        C1243h c1243h = this.f978b;
        if (c1243h == null || c0779i == null) {
            return;
        }
        String strM2679aj = c1243h.m2679aj();
        strM2679aj.hashCode();
        if (strM2679aj.equals("1")) {
            this.f978b.m3116o(c0779i.f981c);
        } else if (strM2679aj.equals("3")) {
            this.f978b.m3050a(c0779i.f982d);
        }
    }
}
