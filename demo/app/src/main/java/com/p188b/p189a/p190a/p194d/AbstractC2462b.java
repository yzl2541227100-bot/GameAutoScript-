package com.p188b.p189a.p190a.p194d;

import com.p188b.p189a.p190a.p192b.C2444g;
import com.p188b.p199b.C2584k;
import com.p188b.p199b.C2598y;
import com.p188b.p199b.InterfaceC2597x;

/* JADX INFO: renamed from: com.b.a.a.d.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2462b implements InterfaceC2597x {

    /* JADX INFO: renamed from: a */
    public final C2584k f15221a;

    /* JADX INFO: renamed from: b */
    public boolean f15222b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2461a f15223c;

    private AbstractC2462b(C2461a c2461a) {
        this.f15223c = c2461a;
        this.f15221a = new C2584k(c2461a.f15218c.mo12514a());
    }

    public /* synthetic */ AbstractC2462b(C2461a c2461a, byte b) {
        this(c2461a);
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final C2598y mo12514a() {
        return this.f15221a;
    }

    /* JADX INFO: renamed from: a */
    public final void m12631a(boolean z) {
        int i = this.f15223c.f15220e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + this.f15223c.f15220e);
        }
        C2461a.m12627a(this.f15221a);
        C2461a c2461a = this.f15223c;
        c2461a.f15220e = 6;
        C2444g c2444g = c2461a.f15217b;
        if (c2444g != null) {
            c2444g.m12564a(!z, c2461a);
        }
    }
}
