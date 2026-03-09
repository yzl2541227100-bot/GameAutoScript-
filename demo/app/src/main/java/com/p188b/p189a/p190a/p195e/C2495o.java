package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.AbstractRunnableC2437b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.a.e.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2495o extends AbstractRunnableC2437b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15378a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f15379c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f15380d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2490j f15381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2495o(C2490j c2490j, String str, Object[] objArr, int i, List list, boolean z) {
        super(str, objArr);
        this.f15381e = c2490j;
        this.f15378a = i;
        this.f15379c = list;
        this.f15380d = z;
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() {
        this.f15381e.f15351i.mo12687b();
        try {
            this.f15381e.f15358p.m12668a(this.f15378a, EnumC2482b.CANCEL);
            synchronized (this.f15381e) {
                this.f15381e.f15360r.remove(Integer.valueOf(this.f15378a));
            }
        } catch (IOException unused) {
        }
    }
}
