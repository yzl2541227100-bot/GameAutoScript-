package com.anythink.expressad.foundation.p120g.p126f;

import android.os.Handler;
import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.d */
/* JADX INFO: loaded from: classes.dex */
public class C1832d implements InterfaceC1828c {

    /* JADX INFO: renamed from: a */
    private final String f11317a = C1832d.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private final Executor f11318b;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        private final AbstractC1856i f11336b;

        /* JADX INFO: renamed from: c */
        private final C1858k f11337c;

        public a(AbstractC1856i abstractC1856i, C1858k c1858k) {
            this.f11336b = abstractC1856i;
            this.f11337c = c1858k;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f11336b.m9619f()) {
                this.f11336b.m9616c();
                this.f11336b.m9623m();
                return;
            }
            C1858k c1858k = this.f11337c;
            C1824a c1824a = c1858k.f11460b;
            if (c1824a == null) {
                this.f11336b.m9611a(c1858k);
            } else {
                this.f11336b.m9615b(c1824a);
            }
            this.f11336b.m9616c();
            this.f11336b.m9625o();
        }
    }

    public C1832d(final Handler handler) {
        this.f11318b = new Executor() { // from class: com.anythink.expressad.foundation.g.f.d.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1828c
    /* JADX INFO: renamed from: a */
    public final void mo9499a(final AbstractC1856i<?> abstractC1856i) {
        Executor executor = this.f11318b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC1856i.m9625o();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1828c
    /* JADX INFO: renamed from: a */
    public final void mo9500a(final AbstractC1856i<?> abstractC1856i, final long j, final long j2) {
        Executor executor = this.f11318b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.7
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC1856i.m9609a(j, j2);
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1828c
    /* JADX INFO: renamed from: a */
    public final void mo9501a(AbstractC1856i<?> abstractC1856i, C1824a c1824a) {
        if (this.f11318b != null) {
            this.f11318b.execute(new a(abstractC1856i, C1858k.m9634a(c1824a)));
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1828c
    /* JADX INFO: renamed from: a */
    public final void mo9502a(AbstractC1856i<?> abstractC1856i, C1858k<?> c1858k) {
        Executor executor = this.f11318b;
        if (executor != null) {
            executor.execute(new a(abstractC1856i, c1858k));
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1828c
    /* JADX INFO: renamed from: b */
    public final void mo9503b(final AbstractC1856i<?> abstractC1856i) {
        Executor executor = this.f11318b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC1856i.m9623m();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1828c
    /* JADX INFO: renamed from: c */
    public final void mo9504c(final AbstractC1856i<?> abstractC1856i) {
        Executor executor = this.f11318b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC1856i.m9624n();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1828c
    /* JADX INFO: renamed from: d */
    public final void mo9505d(final AbstractC1856i<?> abstractC1856i) {
        Executor executor = this.f11318b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.5
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1828c
    /* JADX INFO: renamed from: e */
    public final void mo9506e(final AbstractC1856i<?> abstractC1856i) {
        Executor executor = this.f11318b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.6
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
