package com.octopus.p222ad.internal.view;

import android.graphics.Canvas;
import com.octopus.p222ad.internal.view.C3197e;

/* JADX INFO: renamed from: com.octopus.ad.internal.view.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3198f extends AdWebView {

    /* JADX INFO: renamed from: c */
    public C3197e f17789c;

    public C3198f(AdViewImpl adViewImpl, C3197e c3197e) {
        super(adViewImpl);
        this.f17645b = C3197e.f17752a[C3197e.b.STARTING_EXPANDED.ordinal()];
        this.f17789c = c3197e;
    }

    @Override // com.octopus.p222ad.internal.view.AdWebView
    /* JADX INFO: renamed from: e */
    public void mo14748e() {
        super.mo14748e();
        this.f17789c.m14790a();
    }

    @Override // com.octopus.p222ad.internal.view.AdWebView, android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
