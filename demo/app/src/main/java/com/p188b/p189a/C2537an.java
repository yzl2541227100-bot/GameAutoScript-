package com.p188b.p189a;

import androidx.core.app.NotificationCompat;
import com.p188b.p189a.p190a.AbstractRunnableC2437b;
import com.p188b.p189a.p190a.p197g.C2516h;
import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.an */
/* JADX INFO: loaded from: classes.dex */
public final class C2537an extends AbstractRunnableC2437b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2536am f15552a;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2554h f15553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2537an(C2536am c2536am, InterfaceC2554h interfaceC2554h) {
        super("OkHttp %s", c2536am.m12861b());
        this.f15552a = c2536am;
        this.f15553c = interfaceC2554h;
    }

    /* JADX INFO: renamed from: a */
    public final String m12863a() {
        return this.f15552a.f15549c.f15554a.f15459b;
    }

    @Override // com.p188b.p189a.p190a.AbstractRunnableC2437b
    /* JADX INFO: renamed from: b */
    public final void mo12528b() {
        IOException e;
        boolean z = true;
        try {
            try {
                C2542as c2542asM12862c = this.f15552a.m12862c();
                try {
                    if (this.f15552a.f15548b.m12625a()) {
                        this.f15553c.mo12929a(new IOException("Canceled"));
                    } else {
                        this.f15553c.mo12928a(c2542asM12862c);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (z) {
                        C2516h c2516hM12773b = C2516h.m12773b();
                        StringBuilder sb = new StringBuilder("Callback failure for ");
                        C2536am c2536am = this.f15552a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c2536am.f15548b.m12625a() ? "canceled " : "");
                        sb2.append(c2536am.f15550d ? "web socket" : NotificationCompat.CATEGORY_CALL);
                        sb2.append(" to ");
                        sb2.append(c2536am.m12861b());
                        sb.append(sb2.toString());
                        c2516hM12773b.mo12753a(4, sb.toString(), e);
                    } else {
                        this.f15553c.mo12929a(e);
                    }
                }
            } catch (IOException e3) {
                e = e3;
                z = false;
            }
        } finally {
            this.f15552a.f15547a.f15491c.m12966b(this);
        }
    }
}
