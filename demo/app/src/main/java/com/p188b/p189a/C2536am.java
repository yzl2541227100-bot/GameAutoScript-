package com.p188b.p189a;

import com.p188b.p189a.p190a.p191a.C2428a;
import com.p188b.p189a.p190a.p192b.C2438a;
import com.p188b.p189a.p190a.p193c.C2447a;
import com.p188b.p189a.p190a.p193c.C2448b;
import com.p188b.p189a.p190a.p193c.C2454h;
import com.p188b.p189a.p190a.p193c.C2457k;
import com.p188b.p189a.p190a.p197g.C2516h;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.b.a.am */
/* JADX INFO: loaded from: classes.dex */
public final class C2536am implements InterfaceC2553g {

    /* JADX INFO: renamed from: a */
    public final C2532ai f15547a;

    /* JADX INFO: renamed from: b */
    public final C2457k f15548b;

    /* JADX INFO: renamed from: c */
    public final C2538ao f15549c;

    /* JADX INFO: renamed from: d */
    public final boolean f15550d;

    /* JADX INFO: renamed from: e */
    private boolean f15551e;

    public C2536am(C2532ai c2532ai, C2538ao c2538ao, boolean z) {
        this.f15547a = c2532ai;
        this.f15549c = c2538ao;
        this.f15550d = z;
        this.f15548b = new C2457k(c2532ai, z);
    }

    /* JADX INFO: renamed from: d */
    private void m12858d() {
        this.f15548b.m12624a(C2516h.m12773b().mo12751a("response.body().close()"));
    }

    @Override // com.p188b.p189a.InterfaceC2553g
    /* JADX INFO: renamed from: a */
    public final C2542as mo12859a() {
        synchronized (this) {
            if (this.f15551e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f15551e = true;
        }
        m12858d();
        try {
            this.f15547a.f15491c.m12963a(this);
            C2542as c2542asM12862c = m12862c();
            if (c2542asM12862c != null) {
                return c2542asM12862c;
            }
            throw new IOException("Canceled");
        } finally {
            this.f15547a.f15491c.m12965b(this);
        }
    }

    @Override // com.p188b.p189a.InterfaceC2553g
    /* JADX INFO: renamed from: a */
    public final void mo12860a(InterfaceC2554h interfaceC2554h) {
        synchronized (this) {
            if (this.f15551e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f15551e = true;
        }
        m12858d();
        this.f15547a.f15491c.m12964a(new C2537an(this, interfaceC2554h));
    }

    /* JADX INFO: renamed from: b */
    public final String m12861b() {
        C2527ad c2527adM12814d = this.f15549c.f15554a.m12814d("/...");
        c2527adM12814d.f15468b = C2526ac.m12802a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        c2527adM12814d.f15469c = C2526ac.m12802a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return c2527adM12814d.m12831b().toString();
    }

    /* JADX INFO: renamed from: c */
    public final C2542as m12862c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f15547a.f15495g);
        arrayList.add(this.f15548b);
        arrayList.add(new C2447a(this.f15547a.f15498j));
        C2532ai c2532ai = this.f15547a;
        C2550d c2550d = c2532ai.f15499k;
        arrayList.add(new C2428a(c2550d != null ? c2550d.f15608a : c2532ai.f15500l));
        arrayList.add(new C2438a(this.f15547a));
        if (!this.f15550d) {
            arrayList.addAll(this.f15547a.f15496h);
        }
        arrayList.add(new C2448b(this.f15550d));
        return new C2454h(arrayList, null, null, null, 0, this.f15549c).mo12613a(this.f15549c);
    }

    public final /* synthetic */ Object clone() {
        return new C2536am(this.f15547a, this.f15549c, this.f15550d);
    }
}
