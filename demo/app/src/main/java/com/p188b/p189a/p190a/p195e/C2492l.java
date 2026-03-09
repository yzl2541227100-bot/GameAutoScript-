package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.AbstractRunnableC2437b;
import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.a.e.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2492l extends AbstractRunnableC2437b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15367a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f15368c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2490j f15369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2492l(C2490j c2490j, String str, Object[] objArr, int i, long j) {
        super(str, objArr);
        this.f15369d = c2490j;
        this.f15367a = i;
        this.f15368c = j;
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() {
        try {
            this.f15369d.f15358p.m12667a(this.f15367a, this.f15368c);
        } catch (IOException unused) {
        }
    }
}
