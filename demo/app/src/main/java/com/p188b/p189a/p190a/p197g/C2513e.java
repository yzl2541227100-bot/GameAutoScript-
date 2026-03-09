package com.p188b.p189a.p190a.p197g;

import com.p188b.p189a.EnumC2535al;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.b.a.a.g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2513e extends C2516h {

    /* JADX INFO: renamed from: a */
    private final Method f15430a;

    /* JADX INFO: renamed from: b */
    private final Method f15431b;

    /* JADX INFO: renamed from: c */
    private final Method f15432c;

    /* JADX INFO: renamed from: d */
    private final Class<?> f15433d;

    /* JADX INFO: renamed from: e */
    private final Class<?> f15434e;

    private C2513e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f15430a = method;
        this.f15431b = method2;
        this.f15432c = method3;
        this.f15433d = cls;
        this.f15434e = cls2;
    }

    /* JADX INFO: renamed from: a */
    public static C2516h m12763a() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new C2513e(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final String mo12752a(SSLSocket sSLSocket) {
        try {
            C2514f c2514f = (C2514f) Proxy.getInvocationHandler(this.f15431b.invoke(null, sSLSocket));
            boolean z = c2514f.f15435a;
            if (!z && c2514f.f15436b == null) {
                C2516h.m12773b().mo12753a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z) {
                return null;
            }
            return c2514f.f15436b;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final void mo12756a(SSLSocket sSLSocket, String str, List<EnumC2535al> list) {
        try {
            this.f15430a.invoke(null, sSLSocket, Proxy.newProxyInstance(C2516h.class.getClassLoader(), new Class[]{this.f15433d, this.f15434e}, new C2514f(C2516h.m12772a(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: b */
    public final void mo12764b(SSLSocket sSLSocket) {
        try {
            this.f15432c.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }
}
