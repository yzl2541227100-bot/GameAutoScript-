package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.expressad.advanced.p076a.C1422c;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes.dex */
public class ATNativeAdvancedWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: a */
    private static final String f6645a = ATNativeAdvancedWebview.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private C1422c f6646b;

    public ATNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f6646b == null) {
                this.f6646b = new C1422c(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f6646b, intentFilter);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void unregisterNetWorkReceiver() {
        try {
            C1422c c1422c = this.f6646b;
            if (c1422c != null) {
                c1422c.m5405a();
                getContext().unregisterReceiver(this.f6646b);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
