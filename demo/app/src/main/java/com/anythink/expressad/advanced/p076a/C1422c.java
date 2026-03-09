package com.anythink.expressad.advanced.p076a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1877k;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.advanced.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C1422c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static final String f6448a = C1422c.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private WebView f6449b;

    /* JADX INFO: renamed from: c */
    private int f6450c;

    public C1422c(WebView webView) {
        this.f6449b = webView;
    }

    /* JADX INFO: renamed from: a */
    private static void m5404a(WebView webView, int i) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f6626m, i);
                C1469j.m5701a();
                C1469j.m5703a(webView, NativeAdvancedJsUtils.f6625l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5405a() {
        this.f6449b = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                m5404a(this.f6449b, 0);
                return;
            }
            if (!C1801a.f11065bW) {
                m5404a(this.f6449b, 0);
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                m5404a(this.f6449b, 0);
                return;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                if (activeNetworkInfo.getType() == 1) {
                    m5404a(this.f6449b, 9);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    m5404a(this.f6449b, 0);
                    return;
                }
                int networkType = telephonyManager.getNetworkType();
                this.f6450c = networkType;
                int iM9691a = C1877k.m9691a(networkType);
                this.f6450c = iM9691a;
                m5404a(this.f6449b, iM9691a);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
