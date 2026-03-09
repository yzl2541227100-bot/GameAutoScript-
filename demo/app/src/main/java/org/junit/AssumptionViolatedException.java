package org.junit;

import p285z2.p20;

/* JADX INFO: loaded from: classes2.dex */
public class AssumptionViolatedException extends org.junit.internal.AssumptionViolatedException {
    private static final long serialVersionUID = 1;

    public <T> AssumptionViolatedException(T t, p20<T> p20Var) {
        super((Object) t, (p20<?>) p20Var);
    }

    public AssumptionViolatedException(String str) {
        super(str);
    }

    public <T> AssumptionViolatedException(String str, T t, p20<T> p20Var) {
        super(str, t, p20Var);
    }

    public AssumptionViolatedException(String str, Throwable th) {
        super(str, th);
    }
}
