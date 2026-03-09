package com.iflytek.voiceads.request;

import android.content.Context;
import android.content.Intent;
import com.iflytek.voiceads.param.C2966a;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.request.e */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2978e {
    /* JADX INFO: renamed from: a */
    public static void m13528a(Context context, String str, C2966a c2966a, String str2) {
        C2989g.m13555a("IFLY_AD_SDK", "openBrowser");
        Context applicationContext = context.getApplicationContext();
        try {
            Intent intent = new Intent(applicationContext, (Class<?>) IFLYBrowser.class);
            intent.putExtra("url_ad", str);
            intent.putExtra("is_show", c2966a.m13452c("download_alert"));
            intent.putExtra("ad_session_id", str2);
            intent.addFlags(268435456);
            applicationContext.startActivity(intent);
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "openBrowser" + e.getMessage());
        }
    }
}
