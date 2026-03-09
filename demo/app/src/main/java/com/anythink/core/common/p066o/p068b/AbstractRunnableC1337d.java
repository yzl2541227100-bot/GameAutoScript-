package com.anythink.core.common.p066o.p068b;

/* JADX INFO: renamed from: com.anythink.core.common.o.b.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1337d implements Runnable {

    /* JADX INFO: renamed from: d */
    public static final int f5200d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f5201e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f5202f = 3;

    /* JADX INFO: renamed from: h */
    public InterfaceC1338e f5206h;

    /* JADX INFO: renamed from: g */
    public boolean f5205g = true;

    /* JADX INFO: renamed from: i */
    public int f5207i = 1;

    /* JADX INFO: renamed from: a */
    private long f5203a = 0;

    /* JADX INFO: renamed from: b */
    private String f5204b = "anythink_default_thread";

    /* JADX INFO: renamed from: a */
    private void m4012a(InterfaceC1338e interfaceC1338e) {
        this.f5206h = interfaceC1338e;
    }

    /* JADX INFO: renamed from: c */
    private String m4013c() {
        return this.f5204b;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1492a();

    /* JADX INFO: renamed from: a */
    public final void m4014a(long j) {
        this.f5203a = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m4015a(String str) {
        this.f5204b = str;
    }

    /* JADX INFO: renamed from: b */
    public final long m4016b() {
        return this.f5203a;
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread.currentThread().setName(this.f5204b);
        mo1492a();
    }
}
