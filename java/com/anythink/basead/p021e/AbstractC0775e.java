package com.anythink.basead.p021e;

import com.anythink.core.common.p050a.C1152d;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1245j;

/* JADX INFO: renamed from: com.anythink.basead.e.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0775e implements InterfaceC0771a {

    /* JADX INFO: renamed from: a */
    public AbstractC1247l f975a;

    /* JADX INFO: renamed from: b */
    public C1243h f976b;

    public AbstractC0775e(AbstractC1247l abstractC1247l, C1243h c1243h) {
        this.f975a = abstractC1247l;
        this.f976b = c1243h;
    }

    /* JADX INFO: renamed from: a */
    private void m551a() {
        AbstractC1247l abstractC1247l = this.f975a;
        if (abstractC1247l instanceof C1245j) {
            C1245j c1245j = (C1245j) abstractC1247l;
            if (c1245j.m3150c() == 1) {
                C1152d.m1954a().m1961b(c1245j);
            }
        }
    }

    @Override // com.anythink.basead.p021e.InterfaceC0771a
    public void onAdClick(C0779i c0779i) {
        C1243h c1243h = this.f976b;
        if (c1243h != null) {
            c1243h.m3019B(c0779i.f979a);
            this.f976b.m3021C(c0779i.f980b);
        }
    }

    @Override // com.anythink.basead.p021e.InterfaceC0771a
    public void onAdShow(C0779i c0779i) {
        AbstractC1247l abstractC1247l = this.f975a;
        if (abstractC1247l instanceof C1245j) {
            C1245j c1245j = (C1245j) abstractC1247l;
            if (c1245j.m3150c() == 1) {
                C1152d.m1954a().m1961b(c1245j);
            }
        }
    }

    public void updateTrackingInfo(C1243h c1243h) {
        this.f976b = c1243h;
    }
}
