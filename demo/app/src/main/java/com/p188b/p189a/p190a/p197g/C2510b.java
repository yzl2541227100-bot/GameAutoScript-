package com.p188b.p189a.p190a.p197g;

import com.p188b.p189a.p190a.p198h.AbstractC2518b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: com.b.a.a.g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2510b extends AbstractC2518b {

    /* JADX INFO: renamed from: a */
    private final Object f15423a;

    /* JADX INFO: renamed from: b */
    private final Method f15424b;

    public C2510b(Object obj, Method method) {
        this.f15423a = obj;
        this.f15424b = method;
    }

    @Override // com.p188b.p189a.p190a.p198h.AbstractC2518b
    /* JADX INFO: renamed from: a */
    public final List<Certificate> mo12758a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        try {
            return (List) this.f15424b.invoke(this.f15423a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof C2510b;
    }

    public final int hashCode() {
        return 0;
    }
}
