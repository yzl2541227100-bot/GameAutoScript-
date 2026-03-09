package com.anythink.core.common.p066o;

import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceC1312a;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;

/* JADX INFO: renamed from: com.anythink.core.common.o.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1326a {

    /* JADX INFO: renamed from: a */
    private boolean f5134a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1312a f5135b = C1315d.m3806a();

    /* JADX INFO: renamed from: c */
    private final InterfaceRunnableC1313b f5136c = new InterfaceRunnableC1313b() { // from class: com.anythink.core.common.o.a.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                if (!AbstractC1326a.this.f5134a) {
                    AbstractC1326a.m3955b(AbstractC1326a.this);
                    AbstractC1326a.this.mo1626b();
                }
            }
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m3955b(AbstractC1326a abstractC1326a) {
        abstractC1326a.f5134a = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    private boolean m3956c() {
        return this.f5134a;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3957a() {
        this.f5135b.mo3801b(this.f5136c);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3958a(long j) {
        this.f5135b.mo3800a(this.f5136c, j, false);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1626b();
}
