package com.p188b.p189a.p190a.p197g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.b.a.a.g.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2515g<T> {

    /* JADX INFO: renamed from: a */
    private final Class<?> f15438a;

    /* JADX INFO: renamed from: b */
    private final String f15439b;

    /* JADX INFO: renamed from: c */
    private final Class[] f15440c;

    public C2515g(Class<?> cls, String str, Class... clsArr) {
        this.f15438a = cls;
        this.f15439b = str;
        this.f15440c = clsArr;
    }

    /* JADX INFO: renamed from: a */
    private Method m12765a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f15439b;
        if (str == null) {
            return null;
        }
        Method methodM12766a = m12766a(cls, str, this.f15440c);
        if (methodM12766a == null || (cls2 = this.f15438a) == null || cls2.isAssignableFrom(methodM12766a.getReturnType())) {
            return methodM12766a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Method m12766a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private Object m12767c(T t, Object... objArr) {
        Method methodM12765a = m12765a(t.getClass());
        if (methodM12765a == null) {
            return null;
        }
        try {
            return methodM12765a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private Object m12768d(T t, Object... objArr) {
        Method methodM12765a = m12765a(t.getClass());
        if (methodM12765a != null) {
            try {
                return methodM12765a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(methodM12765a)));
                assertionError.initCause(e);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + this.f15439b + " not supported for object " + t);
    }

    /* JADX INFO: renamed from: a */
    public final Object m12769a(T t, Object... objArr) {
        try {
            return m12767c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12770a(T t) {
        return m12765a(t.getClass()) != null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m12771b(T t, Object... objArr) {
        try {
            return m12768d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
