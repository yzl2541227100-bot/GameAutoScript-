package com.p188b.p189a.p190a.p194d;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2579f;
import com.p188b.p199b.InterfaceC2597x;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.a.a.d.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2466f extends AbstractC2462b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2461a f15235d;

    /* JADX INFO: renamed from: e */
    private long f15236e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2466f(C2461a c2461a, long j) {
        super(c2461a, (byte) 0);
        this.f15235d = c2461a;
        this.f15236e = j;
        if (j == 0) {
            m12631a(true);
        }
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) throws ProtocolException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.f15222b) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f15236e;
        if (j2 == 0) {
            return -1L;
        }
        long jMo12513a = this.f15235d.f15218c.mo12513a(c2579f, Math.min(j2, j));
        if (jMo12513a == -1) {
            m12631a(false);
            throw new ProtocolException("unexpected end of stream");
        }
        long j3 = this.f15236e - jMo12513a;
        this.f15236e = j3;
        if (j3 == 0) {
            m12631a(true);
        }
        return jMo12513a;
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15222b) {
            return;
        }
        if (this.f15236e != 0 && !C2446c.m12585a((InterfaceC2597x) this, TimeUnit.MILLISECONDS)) {
            m12631a(false);
        }
        this.f15222b = true;
    }
}
