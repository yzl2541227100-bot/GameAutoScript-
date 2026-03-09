package com.p188b.p189a.p190a.p194d;

import com.p188b.p199b.C2579f;

/* JADX INFO: renamed from: com.b.a.a.d.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2467g extends AbstractC2462b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2461a f15237d;

    /* JADX INFO: renamed from: e */
    private boolean f15238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2467g(C2461a c2461a) {
        super(c2461a, (byte) 0);
        this.f15237d = c2461a;
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.f15222b) {
            throw new IllegalStateException("closed");
        }
        if (this.f15238e) {
            return -1L;
        }
        long jMo12513a = this.f15237d.f15218c.mo12513a(c2579f, j);
        if (jMo12513a != -1) {
            return jMo12513a;
        }
        this.f15238e = true;
        m12631a(true);
        return -1L;
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15222b) {
            return;
        }
        if (!this.f15238e) {
            m12631a(false);
        }
        this.f15222b = true;
    }
}
