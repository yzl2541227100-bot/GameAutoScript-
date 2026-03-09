package com.anythink.expressad.splash.view;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes.dex */
public class ATSplashWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: a */
    private static final String f12811a = ATSplashWebview.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private String f12812b;

    public ATSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public String getRequestId() {
        return this.f12812b;
    }

    public void setRequestId(String str) {
        this.f12812b = str;
    }
}
