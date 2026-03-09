package com.iflytek.voiceads.request;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: com.iflytek.voiceads.request.i */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
final class C2982i implements HostnameVerifier {
    C2982i() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
