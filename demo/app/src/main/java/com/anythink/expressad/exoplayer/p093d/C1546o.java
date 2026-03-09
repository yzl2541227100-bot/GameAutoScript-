package com.anythink.expressad.exoplayer.p093d;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1546o extends Exception {

    /* JADX INFO: renamed from: a */
    public static final int f8022a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f8023b = 2;

    /* JADX INFO: renamed from: c */
    public final int f8024c;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.o$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private C1546o(int i) {
        this.f8024c = i;
    }

    public C1546o(Exception exc) {
        super(exc);
        this.f8024c = 2;
    }
}
