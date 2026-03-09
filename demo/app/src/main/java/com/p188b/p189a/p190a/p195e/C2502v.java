package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.AbstractRunnableC2437b;
import com.p188b.p189a.p190a.p197g.C2516h;
import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.a.e.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2502v extends AbstractRunnableC2437b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2470ab f15400a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2501u f15401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2502v(C2501u c2501u, String str, Object[] objArr, C2470ab c2470ab) {
        super(str, objArr);
        this.f15401c = c2501u;
        this.f15400a = c2470ab;
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() {
        try {
            this.f15401c.f15399c.f15345c.mo12536a(this.f15400a);
        } catch (IOException e) {
            C2516h.m12773b().mo12753a(4, "Http2Connection.Listener failure for " + this.f15401c.f15399c.f15347e, e);
            try {
                this.f15400a.m12644a(EnumC2482b.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
