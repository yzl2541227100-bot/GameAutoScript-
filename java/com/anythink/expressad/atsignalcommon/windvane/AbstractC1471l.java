package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1471l {

    /* JADX INFO: renamed from: e */
    public Context f6784e;

    /* JADX INFO: renamed from: f */
    public Object f6785f;

    /* JADX INFO: renamed from: g */
    public WindVaneWebView f6786g;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f6784e = context;
        this.f6786g = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f6785f = obj;
        this.f6786g = windVaneWebView;
    }
}
