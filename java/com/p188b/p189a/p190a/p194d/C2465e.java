package com.p188b.p189a.p190a.p194d;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2579f;
import com.p188b.p199b.C2584k;
import com.p188b.p199b.C2598y;
import com.p188b.p199b.InterfaceC2596w;
import java.net.ProtocolException;

/* JADX INFO: renamed from: com.b.a.a.d.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2465e implements InterfaceC2596w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2461a f15231a;

    /* JADX INFO: renamed from: b */
    private final C2584k f15232b;

    /* JADX INFO: renamed from: c */
    private boolean f15233c;

    /* JADX INFO: renamed from: d */
    private long f15234d;

    public C2465e(C2461a c2461a, long j) {
        this.f15231a = c2461a;
        this.f15232b = new C2584k(c2461a.f15219d.mo12632a());
        this.f15234d = j;
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a */
    public final C2598y mo12632a() {
        return this.f15232b;
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a_ */
    public final void mo12633a_(C2579f c2579f, long j) throws ProtocolException {
        if (this.f15233c) {
            throw new IllegalStateException("closed");
        }
        C2446c.m12581a(c2579f.m13006b(), j);
        if (j <= this.f15234d) {
            this.f15231a.f15219d.mo12633a_(c2579f, j);
            this.f15234d -= j;
        } else {
            throw new ProtocolException("expected " + this.f15234d + " bytes but received " + j);
        }
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        if (this.f15233c) {
            return;
        }
        this.f15233c = true;
        if (this.f15234d > 0) {
            throw new ProtocolException("unexpected end of stream");
        }
        C2461a.m12627a(this.f15232b);
        this.f15231a.f15220e = 3;
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Flushable
    public final void flush() {
        if (this.f15233c) {
            return;
        }
        this.f15231a.f15219d.flush();
    }
}
