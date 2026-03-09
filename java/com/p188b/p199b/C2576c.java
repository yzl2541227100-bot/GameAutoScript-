package com.p188b.p199b;

import java.io.IOException;

/* JADX INFO: renamed from: com.b.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2576c implements InterfaceC2597x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2597x f15814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2573a f15815b;

    public C2576c(C2573a c2573a, InterfaceC2597x interfaceC2597x) {
        this.f15815b = c2573a;
        this.f15814a = interfaceC2597x;
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) throws IOException {
        this.f15815b.m12982c();
        try {
            try {
                long jMo12513a = this.f15814a.mo12513a(c2579f, j);
                this.f15815b.m12979a(true);
                return jMo12513a;
            } catch (IOException e) {
                throw this.f15815b.m12981b(e);
            }
        } catch (Throwable th) {
            this.f15815b.m12979a(false);
            throw th;
        }
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final C2598y mo12514a() {
        return this.f15815b;
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            try {
                this.f15814a.close();
                this.f15815b.m12979a(true);
            } catch (IOException e) {
                throw this.f15815b.m12981b(e);
            }
        } catch (Throwable th) {
            this.f15815b.m12979a(false);
            throw th;
        }
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f15814a + ")";
    }
}
