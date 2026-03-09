package com.p188b.p189a.p190a.p198h;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.b.a.a.h.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2522f extends AbstractC2521e {

    /* JADX INFO: renamed from: a */
    private final X509TrustManager f15452a;

    /* JADX INFO: renamed from: b */
    private final Method f15453b;

    public C2522f(X509TrustManager x509TrustManager, Method method) {
        this.f15453b = method;
        this.f15452a = x509TrustManager;
    }

    @Override // com.p188b.p189a.p190a.p198h.AbstractC2521e
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo12786a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f15453b.invoke(this.f15452a, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2522f)) {
            return false;
        }
        C2522f c2522f = (C2522f) obj;
        return this.f15452a.equals(c2522f.f15452a) && this.f15453b.equals(c2522f.f15453b);
    }

    public final int hashCode() {
        return this.f15452a.hashCode() + (this.f15453b.hashCode() * 31);
    }
}
