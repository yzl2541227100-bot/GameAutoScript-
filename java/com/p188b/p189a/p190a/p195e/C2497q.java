package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.AbstractRunnableC2437b;

/* JADX INFO: renamed from: com.b.a.a.e.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2497q extends AbstractRunnableC2437b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15387a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC2482b f15388c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2490j f15389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2497q(C2490j c2490j, String str, Object[] objArr, int i, EnumC2482b enumC2482b) {
        super(str, objArr);
        this.f15389d = c2490j;
        this.f15387a = i;
        this.f15388c = enumC2482b;
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() {
        this.f15389d.f15351i.mo12688c();
        synchronized (this.f15389d) {
            this.f15389d.f15360r.remove(Integer.valueOf(this.f15387a));
        }
    }
}
