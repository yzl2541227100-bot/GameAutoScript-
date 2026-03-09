package com.tramini.plugin.p261a.p269h;

import android.content.Context;
import android.net.Proxy;
import android.os.Build;
import android.text.TextUtils;
import cn.haorui.sdk.core.HRConfig;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C3362h {
    /* JADX INFO: renamed from: a */
    public static boolean m15315a(Context context) {
        try {
            return m15316b(context);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m15316b(Context context) {
        int port;
        String property;
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                property = System.getProperty("http.proxyHost");
                String property2 = System.getProperty("http.proxyPort");
                if (property2 == null) {
                    property2 = HRConfig.GENDER_UNKNOWN;
                }
                port = Integer.parseInt(property2);
            } else {
                String host = Proxy.getHost(context);
                port = Proxy.getPort(context);
                property = host;
            }
        } catch (Throwable unused) {
        }
        return (TextUtils.isEmpty(property) || port == -1) ? false : true;
    }
}
