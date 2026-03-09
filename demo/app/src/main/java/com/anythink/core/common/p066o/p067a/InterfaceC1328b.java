package com.anythink.core.common.p066o.p067a;

import android.view.View;

/* JADX INFO: renamed from: com.anythink.core.common.o.a.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1328b {
    int getImpressionMinPercentageViewed();

    int getImpressionMinTimeViewed();

    Integer getImpressionMinVisiblePx();

    boolean isImpressionRecorded();

    void recordImpression(View view);

    void setImpressionRecorded();
}
