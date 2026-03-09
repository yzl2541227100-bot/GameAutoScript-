package com.p188b.p199b;

import java.util.Objects;

/* JADX INFO: renamed from: com.b.b.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2591r implements InterfaceC2580g {

    /* JADX INFO: renamed from: a */
    public final C2579f f15843a = new C2579f();

    /* JADX INFO: renamed from: b */
    public final InterfaceC2596w f15844b;

    /* JADX INFO: renamed from: c */
    public boolean f15845c;

    public C2591r(InterfaceC2596w interfaceC2596w) {
        Objects.requireNonNull(interfaceC2596w, "sink == null");
        this.f15844b = interfaceC2596w;
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a */
    public final C2598y mo12632a() {
        return this.f15844b.mo12632a();
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a_ */
    public final void mo12633a_(C2579f c2579f, long j) {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        this.f15843a.mo12633a_(c2579f, j);
        mo13039p();
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: b */
    public final InterfaceC2580g mo13008b(String str) {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        this.f15843a.mo13008b(str);
        return mo13039p();
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: b */
    public final InterfaceC2580g mo13009b(byte[] bArr) {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        this.f15843a.mo13009b(bArr);
        return mo13039p();
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: b */
    public final InterfaceC2580g mo13010b(byte[] bArr, int i, int i2) {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        this.f15843a.mo13010b(bArr, i, i2);
        return mo13039p();
    }

    @Override // com.p188b.p199b.InterfaceC2580g, com.p188b.p199b.InterfaceC2581h
    /* JADX INFO: renamed from: c */
    public final C2579f mo13012c() {
        return this.f15843a;
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.f15845c) {
            return;
        }
        Throwable th = null;
        try {
            C2579f c2579f = this.f15843a;
            long j = c2579f.f15820b;
            if (j > 0) {
                this.f15844b.mo12633a_(c2579f, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f15844b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f15845c = true;
        if (th != null) {
            C2574aa.m12986a(th);
        }
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: f */
    public final InterfaceC2580g mo13021f(int i) {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        this.f15843a.mo13021f(i);
        return mo13039p();
    }

    @Override // com.p188b.p199b.InterfaceC2580g, com.p188b.p199b.InterfaceC2596w, java.io.Flushable
    public final void flush() {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        C2579f c2579f = this.f15843a;
        long j = c2579f.f15820b;
        if (j > 0) {
            this.f15844b.mo12633a_(c2579f, j);
        }
        this.f15844b.flush();
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: g */
    public final InterfaceC2580g mo13026g(int i) {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        this.f15843a.mo13026g(i);
        return mo13039p();
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: h */
    public final InterfaceC2580g mo13028h(int i) {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        this.f15843a.mo13028h(i);
        return mo13039p();
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: i */
    public final InterfaceC2580g mo13031i(long j) {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        this.f15843a.mo13031i(j);
        return mo13039p();
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: j */
    public final InterfaceC2580g mo13033j(long j) {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        this.f15843a.mo13033j(j);
        return mo13039p();
    }

    @Override // com.p188b.p199b.InterfaceC2580g
    /* JADX INFO: renamed from: p */
    public final InterfaceC2580g mo13039p() {
        if (this.f15845c) {
            throw new IllegalStateException("closed");
        }
        C2579f c2579f = this.f15843a;
        long j = c2579f.f15820b;
        if (j == 0) {
            j = 0;
        } else {
            C2593t c2593t = c2579f.f15819a.f15855g;
            int i = c2593t.f15851c;
            if (i < 8192 && c2593t.f15853e) {
                j -= (long) (i - c2593t.f15850b);
            }
        }
        if (j > 0) {
            this.f15844b.mo12633a_(c2579f, j);
        }
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f15844b + ")";
    }
}
