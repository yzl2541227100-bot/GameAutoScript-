package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.AbstractRunnableC2437b;
import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.a.e.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2504x extends AbstractRunnableC2437b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2480al f15403a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2501u f15404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2504x(C2501u c2501u, String str, Object[] objArr, C2480al c2480al) {
        super(str, objArr);
        this.f15404c = c2501u;
        this.f15403a = c2480al;
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() {
        try {
            this.f15404c.f15399c.f15358p.m12670a(this.f15403a);
        } catch (IOException unused) {
        }
    }
}
