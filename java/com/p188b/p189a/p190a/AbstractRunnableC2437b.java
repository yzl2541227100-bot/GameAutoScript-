package com.p188b.p189a.p190a;

/* JADX INFO: renamed from: com.b.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC2437b implements Runnable {

    /* JADX INFO: renamed from: b */
    public final String f15131b;

    public AbstractRunnableC2437b(String str, Object... objArr) {
        this.f15131b = C2446c.m12576a(str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo12528b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f15131b);
        try {
            mo12528b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
