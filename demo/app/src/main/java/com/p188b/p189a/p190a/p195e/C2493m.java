package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.AbstractRunnableC2437b;
import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.a.e.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2493m extends AbstractRunnableC2437b {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f15371c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f15372d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2490j f15374f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f15370a = true;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2477ai f15373e = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2493m(C2490j c2490j, String str, Object[] objArr, int i, int i2) {
        super(str, objArr);
        this.f15374f = c2490j;
        this.f15371c = i;
        this.f15372d = i2;
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() {
        try {
            C2490j c2490j = this.f15374f;
            boolean z = this.f15370a;
            int i = this.f15371c;
            int i2 = this.f15372d;
            C2477ai c2477ai = this.f15373e;
            synchronized (c2490j.f15358p) {
                if (c2477ai != null) {
                    c2477ai.m12682a();
                    c2490j.f15358p.m12671a(z, i, i2);
                } else {
                    c2490j.f15358p.m12671a(z, i, i2);
                }
            }
        } catch (IOException unused) {
        }
    }
}
