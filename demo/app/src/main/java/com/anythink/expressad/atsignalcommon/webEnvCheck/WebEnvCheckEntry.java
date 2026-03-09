package com.anythink.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.p086d.p088b.C1488b;

/* JADX INFO: loaded from: classes.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        try {
            new WindVaneWebView(context).loadDataWithBaseURL(null, "<html><script>" + C1488b.m6027a().m6035b() + "</script></html>", "text/html", "utf-8", null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
