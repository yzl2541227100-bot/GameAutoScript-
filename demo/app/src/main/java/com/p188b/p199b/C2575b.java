package com.p188b.p199b;

import java.io.IOException;

/* JADX INFO: renamed from: com.b.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2575b implements InterfaceC2596w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2596w f15812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2573a f15813b;

    public C2575b(C2573a c2573a, InterfaceC2596w interfaceC2596w) {
        this.f15813b = c2573a;
        this.f15812a = interfaceC2596w;
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a */
    public final C2598y mo12632a() {
        return this.f15813b;
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a_ */
    public final void mo12633a_(C2579f c2579f, long j) throws IOException {
        C2574aa.m12985a(c2579f.f15820b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                C2593t c2593t = c2579f.f15819a;
                j2 += (long) (c2593t.f15851c - c2593t.f15850b);
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
            }
            this.f15813b.m12982c();
            try {
                try {
                    this.f15812a.mo12633a_(c2579f, j2);
                    j -= j2;
                    this.f15813b.m12979a(true);
                } catch (IOException e) {
                    throw this.f15813b.m12981b(e);
                }
            } catch (Throwable th) {
                this.f15813b.m12979a(false);
                throw th;
            }
        }
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15813b.m12982c();
        try {
            try {
                this.f15812a.close();
                this.f15813b.m12979a(true);
            } catch (IOException e) {
                throw this.f15813b.m12981b(e);
            }
        } catch (Throwable th) {
            this.f15813b.m12979a(false);
            throw th;
        }
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Flushable
    public final void flush() throws IOException {
        this.f15813b.m12982c();
        try {
            try {
                this.f15812a.flush();
                this.f15813b.m12979a(true);
            } catch (IOException e) {
                throw this.f15813b.m12981b(e);
            }
        } catch (Throwable th) {
            this.f15813b.m12979a(false);
            throw th;
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f15812a + ")";
    }
}
