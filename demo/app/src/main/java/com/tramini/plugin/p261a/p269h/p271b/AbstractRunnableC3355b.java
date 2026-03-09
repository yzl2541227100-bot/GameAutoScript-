package com.tramini.plugin.p261a.p269h.p271b;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.b.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC3355b implements Runnable {

    /* JADX INFO: renamed from: a */
    private int f18211a = 0;

    /* JADX INFO: renamed from: d */
    public InterfaceC3356c f18212d;

    /* JADX INFO: renamed from: b */
    private int m15293b() {
        return this.f18211a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo15197a();

    /* JADX INFO: renamed from: a */
    public final void m15294a(int i) {
        this.f18211a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        mo15197a();
    }
}
