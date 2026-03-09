package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.AbstractRunnableC2437b;
import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.a.e.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2491k extends AbstractRunnableC2437b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15364a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC2482b f15365c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2490j f15366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2491k(C2490j c2490j, String str, Object[] objArr, int i, EnumC2482b enumC2482b) {
        super(str, objArr);
        this.f15366d = c2490j;
        this.f15364a = i;
        this.f15365c = enumC2482b;
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() {
        try {
            this.f15366d.m12735b(this.f15364a, this.f15365c);
        } catch (IOException unused) {
        }
    }
}
