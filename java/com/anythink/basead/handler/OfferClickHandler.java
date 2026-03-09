package com.anythink.basead.handler;

import android.content.Context;
import com.anythink.basead.p010a.C0717a;
import com.anythink.basead.p010a.C0729c;
import com.anythink.basead.p010a.C0735h;
import com.anythink.basead.p015c.C0746d;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;

/* JADX INFO: loaded from: classes.dex */
public class OfferClickHandler extends IOfferClickHandler {
    /* JADX INFO: renamed from: a */
    private static C0746d m643a(AbstractC1247l abstractC1247l) {
        return C0729c.m232a().m233a(abstractC1247l.mo2426d(), abstractC1247l.m3229t());
    }

    @Override // com.anythink.core.api.IOfferClickHandler
    public boolean startDownloadApp(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, String str) {
        return C0717a.m130a(context, c1248m, abstractC1247l, C0729c.m232a().m233a(abstractC1247l.mo2426d(), abstractC1247l.m3229t()), str, new C0735h());
    }
}
