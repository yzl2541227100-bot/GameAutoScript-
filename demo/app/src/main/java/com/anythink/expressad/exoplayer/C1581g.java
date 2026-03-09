package com.anythink.expressad.exoplayer;

import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1581g extends Exception {

    /* JADX INFO: renamed from: a */
    public static final int f8494a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f8495b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f8496c = 2;

    /* JADX INFO: renamed from: d */
    public final int f8497d;

    /* JADX INFO: renamed from: e */
    public final int f8498e;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private C1581g(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.f8497d = i;
        this.f8498e = i2;
    }

    /* JADX INFO: renamed from: a */
    public static C1581g m7079a(IOException iOException) {
        return new C1581g(0, null, iOException, -1);
    }

    /* JADX INFO: renamed from: a */
    public static C1581g m7080a(Exception exc, int i) {
        return new C1581g(1, null, exc, i);
    }

    /* JADX INFO: renamed from: a */
    public static C1581g m7081a(RuntimeException runtimeException) {
        return new C1581g(2, null, runtimeException, -1);
    }

    /* JADX INFO: renamed from: a */
    private IOException m7082a() {
        C1711a.m8012b(this.f8497d == 0);
        return (IOException) getCause();
    }

    /* JADX INFO: renamed from: b */
    private Exception m7083b() {
        C1711a.m8012b(this.f8497d == 1);
        return (Exception) getCause();
    }

    /* JADX INFO: renamed from: c */
    private RuntimeException m7084c() {
        C1711a.m8012b(this.f8497d == 2);
        return (RuntimeException) getCause();
    }
}
