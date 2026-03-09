package com.p188b.p199b;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.b.b.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2588o implements InterfaceC2596w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2598y f15838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OutputStream f15839b;

    public C2588o(C2598y c2598y, OutputStream outputStream) {
        this.f15838a = c2598y;
        this.f15839b = outputStream;
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a */
    public final C2598y mo12632a() {
        return this.f15838a;
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a_ */
    public final void mo12633a_(C2579f c2579f, long j) throws IOException {
        C2574aa.m12985a(c2579f.f15820b, 0L, j);
        while (j > 0) {
            this.f15838a.mo13067f_();
            C2593t c2593t = c2579f.f15819a;
            int iMin = (int) Math.min(j, c2593t.f15851c - c2593t.f15850b);
            this.f15839b.write(c2593t.f15849a, c2593t.f15850b, iMin);
            int i = c2593t.f15850b + iMin;
            c2593t.f15850b = i;
            long j2 = iMin;
            j -= j2;
            c2579f.f15820b -= j2;
            if (i == c2593t.f15851c) {
                c2579f.f15819a = c2593t.m13078a();
                C2594u.m13082a(c2593t);
            }
        }
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15839b.close();
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Flushable
    public final void flush() throws IOException {
        this.f15839b.flush();
    }

    public final String toString() {
        return "sink(" + this.f15839b + ")";
    }
}
