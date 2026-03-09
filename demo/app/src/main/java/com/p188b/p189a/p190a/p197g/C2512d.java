package com.p188b.p189a.p190a.p197g;

import com.p188b.p189a.EnumC2535al;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.b.a.a.g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2512d extends C2516h {

    /* JADX INFO: renamed from: a */
    public final Method f15428a;

    /* JADX INFO: renamed from: b */
    public final Method f15429b;

    private C2512d(Method method, Method method2) {
        this.f15428a = method;
        this.f15429b = method2;
    }

    /* JADX INFO: renamed from: a */
    public static C2512d m12762a() {
        try {
            return new C2512d(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final String mo12752a(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f15429b.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.p188b.p189a.p190a.p197g.C2516h
    /* JADX INFO: renamed from: a */
    public final void mo12756a(SSLSocket sSLSocket, String str, List<EnumC2535al> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> listM12772a = C2516h.m12772a(list);
            this.f15428a.invoke(sSLParameters, listM12772a.toArray(new String[listM12772a.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }
}
