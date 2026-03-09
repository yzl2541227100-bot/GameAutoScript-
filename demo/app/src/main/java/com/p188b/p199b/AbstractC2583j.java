package com.p188b.p199b;

/* JADX INFO: renamed from: com.b.b.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2583j implements InterfaceC2597x {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2597x f15826a;

    public AbstractC2583j(InterfaceC2597x interfaceC2597x) {
        if (interfaceC2597x == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15826a = interfaceC2597x;
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) {
        return this.f15826a.mo12513a(c2579f, j);
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final C2598y mo12514a() {
        return this.f15826a.mo12514a();
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15826a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f15826a.toString() + ")";
    }
}
