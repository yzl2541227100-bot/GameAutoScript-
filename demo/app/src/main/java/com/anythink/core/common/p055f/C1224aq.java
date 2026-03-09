package com.anythink.core.common.p055f;

/* JADX INFO: renamed from: com.anythink.core.common.f.aq */
/* JADX INFO: loaded from: classes.dex */
public final class C1224aq {

    /* JADX INFO: renamed from: a */
    private String f3881a;

    /* JADX INFO: renamed from: b */
    private boolean f3882b;

    /* JADX INFO: renamed from: c */
    private Boolean f3883c;

    public C1224aq(String str, boolean z) {
        this.f3881a = str;
        this.f3882b = z;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m2630a() {
        return this.f3881a;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2631a(boolean z) {
        this.f3883c = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m2632b() {
        return this.f3882b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Boolean m2633c() {
        return this.f3883c;
    }
}
