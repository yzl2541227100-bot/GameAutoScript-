package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.AbstractRunnableC2437b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.a.e.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2494n extends AbstractRunnableC2437b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15375a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f15376c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2490j f15377d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2494n(C2490j c2490j, String str, Object[] objArr, int i, List list) {
        super(str, objArr);
        this.f15377d = c2490j;
        this.f15375a = i;
        this.f15376c = list;
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() {
        this.f15377d.f15351i.mo12685a();
        try {
            this.f15377d.f15358p.m12668a(this.f15375a, EnumC2482b.CANCEL);
            synchronized (this.f15377d) {
                this.f15377d.f15360r.remove(Integer.valueOf(this.f15375a));
            }
        } catch (IOException unused) {
        }
    }
}
