package com.anythink.core.common.p055f.p056a;

import android.util.Log;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.f.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C1204b extends AbstractC1247l implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f3703a;

    public C1204b(C1207e c1207e) {
        String simpleName = C1204b.class.getSimpleName();
        this.f3703a = simpleName;
        m3221o(c1207e.getIconImageUrl());
        m3203i(c1207e.getStarRating().intValue());
        m3224q(c1207e.getMainImageUrl());
        m3216m(c1207e.getTitle());
        m3228s(c1207e.getCallToActionText());
        m3219n(c1207e.getDescriptionText());
        m3226r(c1207e.getAdChoiceIconUrl());
        m3185a(c1207e.getAdLogo());
        ATAdAppInfo adAppInfo = c1207e.getAdAppInfo();
        if (adAppInfo != null) {
            if (C1175n.m2059a().m2095A()) {
                Log.i(simpleName, "AdAppInfo:" + c1207e.getAdAppInfo().toString());
            }
            m3242z(adAppInfo.getPublisher());
            m3158A(adAppInfo.getAppVersion());
            m3160B(adAppInfo.getAppPrivacyUrl());
            m3162C(adAppInfo.getAppPermissonUrl());
            m3188c(adAppInfo.getFunctionUrl());
        }
    }

    @Override // com.anythink.core.common.p055f.AbstractC1247l
    /* JADX INFO: renamed from: P */
    public final boolean mo2424P() {
        return true;
    }

    @Override // com.anythink.core.common.p055f.AbstractC1247l
    /* JADX INFO: renamed from: b */
    public final List<String> mo2425b(AbstractC1249n abstractC1249n) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m3239y());
        return arrayList;
    }

    @Override // com.anythink.core.common.p055f.AbstractC1247l
    /* JADX INFO: renamed from: d */
    public final int mo2426d() {
        return 10;
    }

    @Override // com.anythink.core.common.p055f.AbstractC1247l
    /* JADX INFO: renamed from: q */
    public final String mo2427q() {
        return "";
    }
}
