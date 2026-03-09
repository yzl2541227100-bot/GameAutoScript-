package com.p188b.p189a.p190a.p191a;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2579f;
import com.p188b.p199b.C2598y;
import com.p188b.p199b.InterfaceC2580g;
import com.p188b.p199b.InterfaceC2581h;
import com.p188b.p199b.InterfaceC2597x;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.a.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2429b implements InterfaceC2597x {

    /* JADX INFO: renamed from: a */
    public boolean f15089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2581h f15090b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2430c f15091c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC2580g f15092d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2428a f15093e;

    public C2429b(C2428a c2428a, InterfaceC2581h interfaceC2581h, InterfaceC2430c interfaceC2430c, InterfaceC2580g interfaceC2580g) {
        this.f15093e = c2428a;
        this.f15090b = interfaceC2581h;
        this.f15091c = interfaceC2430c;
        this.f15092d = interfaceC2580g;
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) throws IOException {
        try {
            long jMo12513a = this.f15090b.mo12513a(c2579f, j);
            if (jMo12513a != -1) {
                c2579f.m12997a(this.f15092d.mo13012c(), c2579f.m13006b() - jMo12513a, jMo12513a);
                this.f15092d.mo13039p();
                return jMo12513a;
            }
            if (!this.f15089a) {
                this.f15089a = true;
                this.f15092d.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.f15089a) {
                this.f15089a = true;
            }
            throw e;
        }
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final C2598y mo12514a() {
        return this.f15090b.mo12514a();
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f15089a && !C2446c.m12585a((InterfaceC2597x) this, TimeUnit.MILLISECONDS)) {
            this.f15089a = true;
        }
        this.f15090b.close();
    }
}
