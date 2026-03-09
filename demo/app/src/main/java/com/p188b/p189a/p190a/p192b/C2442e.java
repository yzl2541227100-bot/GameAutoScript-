package com.p188b.p189a.p190a.p192b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.b.a.a.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2442e extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private static final Method f15152a;

    /* JADX INFO: renamed from: b */
    private IOException f15153b;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        f15152a = declaredMethod;
    }

    public C2442e(IOException iOException) {
        super(iOException);
        this.f15153b = iOException;
    }

    /* JADX INFO: renamed from: a */
    public final IOException m12546a() {
        return this.f15153b;
    }

    /* JADX INFO: renamed from: a */
    public final void m12547a(IOException iOException) {
        IOException iOException2 = this.f15153b;
        Method method = f15152a;
        if (method != null) {
            try {
                method.invoke(iOException, iOException2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        this.f15153b = iOException;
    }
}
