package com.p188b.p189a.p190a.p194d;

import com.p188b.p199b.C2579f;
import com.p188b.p199b.C2584k;
import com.p188b.p199b.C2598y;
import com.p188b.p199b.InterfaceC2596w;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: com.b.a.a.d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2463c implements InterfaceC2596w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2461a f15224a;

    /* JADX INFO: renamed from: b */
    private final C2584k f15225b;

    /* JADX INFO: renamed from: c */
    private boolean f15226c;

    public C2463c(C2461a c2461a) {
        this.f15224a = c2461a;
        this.f15225b = new C2584k(c2461a.f15219d.mo12632a());
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a */
    public final C2598y mo12632a() {
        return this.f15225b;
    }

    @Override // com.p188b.p199b.InterfaceC2596w
    /* JADX INFO: renamed from: a_ */
    public final void mo12633a_(C2579f c2579f, long j) {
        if (this.f15226c) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        this.f15224a.f15219d.mo13031i(j);
        this.f15224a.f15219d.mo13008b(IOUtils.LINE_SEPARATOR_WINDOWS);
        this.f15224a.f15219d.mo12633a_(c2579f, j);
        this.f15224a.f15219d.mo13008b(IOUtils.LINE_SEPARATOR_WINDOWS);
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f15226c) {
            return;
        }
        this.f15226c = true;
        this.f15224a.f15219d.mo13008b("0\r\n\r\n");
        C2461a.m12627a(this.f15225b);
        this.f15224a.f15220e = 3;
    }

    @Override // com.p188b.p199b.InterfaceC2596w, java.io.Flushable
    public final synchronized void flush() {
        if (this.f15226c) {
            return;
        }
        this.f15224a.f15219d.flush();
    }
}
