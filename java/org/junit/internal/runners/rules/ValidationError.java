package org.junit.internal.runners.rules;

import java.lang.annotation.Annotation;
import p285z2.p90;

/* JADX INFO: loaded from: classes2.dex */
public class ValidationError extends Exception {
    public ValidationError(p90<?> p90Var, Class<? extends Annotation> cls, String str) {
        super(String.format("The @%s '%s' %s", cls.getSimpleName(), p90Var.OooO0o0(), str));
    }
}
