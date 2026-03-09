package com.anythink.basead.p010a.p011a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.anythink.basead.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0718a<R, E> implements InterfaceC0720c<R, E> {

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f425a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f426b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    private InterfaceC0719b<R, E> f427c;

    @Override // com.anythink.basead.p010a.p011a.InterfaceC0720c
    /* JADX INFO: renamed from: a */
    public final void mo133a() {
        if (!this.f425a.get() && this.f426b.decrementAndGet() == 0) {
            this.f425a.set(true);
            InterfaceC0719b<R, E> interfaceC0719b = this.f427c;
            if (interfaceC0719b != null) {
                interfaceC0719b.mo137a();
            }
        }
    }

    @Override // com.anythink.basead.p010a.p011a.InterfaceC0720c
    /* JADX INFO: renamed from: a */
    public final void mo134a(int i) {
        this.f426b.set(i);
    }

    @Override // com.anythink.basead.p010a.p011a.InterfaceC0720c
    /* JADX INFO: renamed from: a */
    public final void mo135a(InterfaceC0719b<R, E> interfaceC0719b) {
        this.f427c = interfaceC0719b;
    }

    @Override // com.anythink.basead.p010a.p011a.InterfaceC0720c
    /* JADX INFO: renamed from: a */
    public final void mo136a(E e) {
        if (this.f425a.get()) {
            return;
        }
        this.f425a.set(true);
        InterfaceC0719b<R, E> interfaceC0719b = this.f427c;
        if (interfaceC0719b != null) {
            interfaceC0719b.mo138a(e);
        }
    }
}
