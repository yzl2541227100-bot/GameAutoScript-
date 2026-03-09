package com.p188b.p199b;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.b.b.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2589p implements InterfaceC2597x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2598y f15840a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InputStream f15841b;

    public C2589p(C2598y c2598y, InputStream inputStream) {
        this.f15840a = c2598y;
        this.f15841b = inputStream;
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return 0L;
        }
        try {
            this.f15840a.mo13067f_();
            C2593t c2593tM13019e = c2579f.m13019e(1);
            int i = this.f15841b.read(c2593tM13019e.f15849a, c2593tM13019e.f15851c, (int) Math.min(j, 8192 - c2593tM13019e.f15851c));
            if (i == -1) {
                return -1L;
            }
            c2593tM13019e.f15851c += i;
            long j2 = i;
            c2579f.f15820b += j2;
            return j2;
        } catch (AssertionError e) {
            if (C2587n.m13074a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final C2598y mo12514a() {
        return this.f15840a;
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15841b.close();
    }

    public final String toString() {
        return "source(" + this.f15841b + ")";
    }
}
