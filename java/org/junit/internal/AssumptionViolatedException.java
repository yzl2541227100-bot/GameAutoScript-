package org.junit.internal;

import p285z2.l20;
import p285z2.p20;
import p285z2.r20;
import p285z2.s20;

/* JADX INFO: loaded from: classes2.dex */
public class AssumptionViolatedException extends RuntimeException implements r20 {
    private static final long serialVersionUID = 2;
    private final String fAssumption;
    private final p20<?> fMatcher;
    private final Object fValue;
    private final boolean fValueMatcher;

    @Deprecated
    public AssumptionViolatedException(Object obj, p20<?> p20Var) {
        this(null, true, obj, p20Var);
    }

    @Deprecated
    public AssumptionViolatedException(String str) {
        this(str, false, null, null);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Object obj, p20<?> p20Var) {
        this(str, true, obj, p20Var);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Throwable th) {
        this(str, false, null, null);
        initCause(th);
    }

    @Deprecated
    public AssumptionViolatedException(String str, boolean z, Object obj, p20<?> p20Var) {
        this.fAssumption = str;
        this.fValue = obj;
        this.fMatcher = p20Var;
        this.fValueMatcher = z;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        String str = this.fAssumption;
        if (str != null) {
            l20Var.OooO0Oo(str);
        }
        if (this.fValueMatcher) {
            if (this.fAssumption != null) {
                l20Var.OooO0Oo(": ");
            }
            l20Var.OooO0Oo("got: ");
            l20Var.OooO0o0(this.fValue);
            if (this.fMatcher != null) {
                l20Var.OooO0Oo(", expected: ");
                l20Var.OooO0O0(this.fMatcher);
            }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return s20.OooOOO(this);
    }
}
