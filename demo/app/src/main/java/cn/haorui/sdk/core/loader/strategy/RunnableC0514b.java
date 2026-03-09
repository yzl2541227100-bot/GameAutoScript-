package cn.haorui.sdk.core.loader.strategy;

import android.os.SystemClock;
import android.text.TextUtils;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.loadbean.C0512a;
import cn.haorui.sdk.core.utils.DefaultHttpGetWithNoHandlerCallback;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.MacroUtil;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.strategy.b */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0514b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0515c f160a;

    public RunnableC0514b(C0515c c0515c) {
        this.f160a = c0515c;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0515c c0515c = this.f160a;
        c0515c.getClass();
        if (SystemClock.uptimeMillis() - c0515c.f171k <= c0515c.f176p) {
            if (c0515c.f165e.size() > c0515c.f164d) {
                for (C0512a c0512a : c0515c.f165e.get(c0515c.f164d)) {
                    int i = c0512a.f154c;
                    if (i == 1 || i == 4) {
                        synchronized (c0512a) {
                            c0512a.f154c = 5;
                        }
                        c0512a.f155d = 2;
                    }
                }
            }
            c0515c.m65f();
            return;
        }
        c0515c.f181u = true;
        c0515c.m61c();
        for (int i2 = 0; i2 < c0515c.f166f.size(); i2++) {
            C0512a c0512a2 = c0515c.f166f.get(i2);
            SdkAdInfo sdkAdInfo = c0512a2.f152a;
            if (sdkAdInfo != null) {
                String err = sdkAdInfo.getErr();
                if (err.contains("__MS_ERRNO__")) {
                    String strReplace = err.replace("__MS_ERRNO__", "1025").replace("__TIMEOUT__", String.valueOf(10));
                    c0512a2.f152a.setErr(strReplace);
                    if (!TextUtils.isEmpty(strReplace)) {
                        HttpUtil.asyncGetWithWebViewUA(c0515c.f161a.getContext().getApplicationContext(), MacroUtil.replaceExposureMacros(strReplace), new DefaultHttpGetWithNoHandlerCallback());
                    }
                }
            }
        }
    }
}
