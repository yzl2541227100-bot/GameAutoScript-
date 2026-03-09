package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.AbstractRunnableC2437b;
import com.p188b.p199b.C2579f;
import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.a.e.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2496p extends AbstractRunnableC2437b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15382a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2579f f15383c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f15384d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f15385e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2490j f15386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2496p(C2490j c2490j, String str, Object[] objArr, int i, C2579f c2579f, int i2, boolean z) {
        super(str, objArr);
        this.f15386f = c2490j;
        this.f15382a = i;
        this.f15383c = c2579f;
        this.f15384d = i2;
        this.f15385e = z;
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() {
        try {
            this.f15386f.f15351i.mo12686a(this.f15383c, this.f15384d);
            this.f15386f.f15358p.m12668a(this.f15382a, EnumC2482b.CANCEL);
            synchronized (this.f15386f) {
                this.f15386f.f15360r.remove(Integer.valueOf(this.f15382a));
            }
        } catch (IOException unused) {
        }
    }
}
