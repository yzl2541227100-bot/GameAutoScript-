package com.anythink.expressad.exoplayer.p092c;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.c.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1523a {

    /* JADX INFO: renamed from: a */
    private int f7853a;

    /* JADX INFO: renamed from: d */
    private void m6636d(int i) {
        this.f7853a = (~i) & this.f7853a;
    }

    /* JADX INFO: renamed from: a */
    public void mo6637a() {
        this.f7853a = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m6638a(int i) {
        this.f7853a = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m6639b(int i) {
        this.f7853a = i | this.f7853a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6640b() {
        return m6642c(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6641c() {
        return m6642c(4);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6642c(int i) {
        return (this.f7853a & i) == i;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6643d() {
        return m6642c(1);
    }
}
