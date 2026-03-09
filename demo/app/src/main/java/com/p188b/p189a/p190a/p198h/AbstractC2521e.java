package com.p188b.p189a.p190a.p198h;

import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.b.a.a.h.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2521e {
    /* JADX INFO: renamed from: a */
    public static AbstractC2521e m12785a(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C2522f(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new C2523g(x509TrustManager.getAcceptedIssuers());
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract X509Certificate mo12786a(X509Certificate x509Certificate);
}
