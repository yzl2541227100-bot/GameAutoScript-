package com.iflytek.voiceads.request;

import com.iflytek.voiceads.utils.C2989g;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: renamed from: com.iflytek.voiceads.request.g */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2980g {

    /* JADX INFO: renamed from: a */
    public static HostnameVerifier f16442a = new C2982i();

    /* JADX INFO: renamed from: a */
    public static SSLContext m13530a() {
        SSLContext sSLContext;
        Exception e;
        try {
            sSLContext = SSLContext.getInstance("TLS");
        } catch (Exception e2) {
            sSLContext = null;
            e = e2;
        }
        try {
            sSLContext.init(null, new TrustManager[]{new C2981h()}, new SecureRandom());
        } catch (Exception e3) {
            e = e3;
            C2989g.m13557b("IFLY_AD_SDK", "getSLLContext:" + e.getMessage());
        }
        return sSLContext;
    }
}
