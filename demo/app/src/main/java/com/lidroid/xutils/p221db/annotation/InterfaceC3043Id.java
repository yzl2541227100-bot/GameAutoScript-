package com.lidroid.xutils.p221db.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.lidroid.xutils.db.annotation.Id */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC3043Id {
    String column() default "";
}
