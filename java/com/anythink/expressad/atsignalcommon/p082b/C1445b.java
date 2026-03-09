package com.anythink.expressad.atsignalcommon.p082b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C1445b {

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.b$a */
    public interface a {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.b$b */
    public static abstract class b<T> implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        private T f6659a;

        /* JADX INFO: renamed from: a */
        private T m5586a() {
            return this.f6659a;
        }

        /* JADX INFO: renamed from: a */
        public final void m5587a(T t) {
            this.f6659a = t;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return method.invoke(this.f6659a, objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                throw e3.getTargetException();
            }
        }
    }

    private C1445b() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m5584a(Object obj, b<T> bVar, Class<?>... clsArr) {
        bVar.m5587a(obj);
        return (T) Proxy.newProxyInstance(C1445b.class.getClassLoader(), clsArr, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private static <T> T m5585a(Object obj, Class<T> cls, b<T> bVar) {
        if (obj instanceof a) {
            return obj;
        }
        bVar.m5587a(obj);
        return (T) Proxy.newProxyInstance(C1445b.class.getClassLoader(), new Class[]{cls, a.class}, bVar);
    }
}
