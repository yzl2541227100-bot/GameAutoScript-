package com.p188b.p189a.p190a.p197g;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.b.a.a.g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2511c {

    /* JADX INFO: renamed from: a */
    private final Method f15425a;

    /* JADX INFO: renamed from: b */
    private final Method f15426b;

    /* JADX INFO: renamed from: c */
    private final Method f15427c;

    private C2511c(Method method, Method method2, Method method3) {
        this.f15425a = method;
        this.f15426b = method2;
        this.f15427c = method3;
    }

    /* JADX INFO: renamed from: a */
    public static C2511c m12759a() throws NoSuchMethodException {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        return new C2511c(method3, method2, method);
    }

    /* JADX INFO: renamed from: a */
    public final Object m12760a(String str) {
        Method method = this.f15425a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                this.f15426b.invoke(objInvoke, str);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12761a(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            this.f15427c.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
