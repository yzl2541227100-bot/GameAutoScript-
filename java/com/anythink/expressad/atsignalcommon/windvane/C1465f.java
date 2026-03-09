package com.anythink.expressad.atsignalcommon.windvane;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.f */
/* JADX INFO: loaded from: classes.dex */
public class C1465f {

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.f$a */
    public interface a {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.f$b */
    public static abstract class b<T> implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        private T f6765a;

        /* JADX INFO: renamed from: a */
        private T m5686a() {
            return this.f6765a;
        }

        /* JADX INFO: renamed from: a */
        public final void m5687a(T t) {
            this.f6765a = t;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return method.invoke(this.f6765a, objArr);
        }
    }

    private C1465f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private static <T> T m5684a(Object obj, b<T> bVar, Class<?>... clsArr) {
        if (Proxy.isProxyClass(obj.getClass())) {
            return obj;
        }
        bVar.m5687a(obj);
        return (T) Proxy.newProxyInstance(C1465f.class.getClassLoader(), clsArr, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private static <T> T m5685a(Object obj, Class<T> cls, b<T> bVar) {
        if (obj instanceof a) {
            return obj;
        }
        bVar.m5687a(obj);
        return (T) Proxy.newProxyInstance(C1465f.class.getClassLoader(), new Class[]{cls, a.class}, bVar);
    }
}
