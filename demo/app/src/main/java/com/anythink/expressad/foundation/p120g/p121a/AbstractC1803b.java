package com.anythink.expressad.foundation.p120g.p121a;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.a.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1803b<K, V> extends AbstractC1802a<K, V> {

    /* JADX INFO: renamed from: b */
    private static final int f11166b = 16;

    /* JADX INFO: renamed from: c */
    private static final int f11167c = 16777216;

    /* JADX INFO: renamed from: d */
    private final int f11168d;

    /* JADX INFO: renamed from: f */
    private final List<V> f11170f = Collections.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: e */
    private final AtomicInteger f11169e = new AtomicInteger();

    private AbstractC1803b(int i) {
        this.f11168d = i;
        if (i > 16777216) {
            Log.w(AbstractC1802a.f11164a, String.format("You set too large memory cache size (more than %1$d Mb)", 16));
        }
    }

    /* JADX INFO: renamed from: e */
    private int m9388e() {
        return this.f11168d;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.AbstractC1802a, com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a */
    public final void mo5249a(K k) {
        Object objMo5251b = super.mo5251b(k);
        if (objMo5251b != null && this.f11170f.remove(objMo5251b)) {
            this.f11169e.addAndGet(-m9389c());
        }
        super.mo5249a(k);
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.AbstractC1802a, com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a */
    public final boolean mo5250a(K k, V v) {
        boolean z;
        int iM9389c = m9389c();
        int i = this.f11168d;
        int iAddAndGet = this.f11169e.get();
        if (iM9389c < i) {
            while (iAddAndGet + iM9389c > i) {
                if (this.f11170f.remove(m9390d())) {
                    iAddAndGet = this.f11169e.addAndGet(-m9389c());
                }
            }
            this.f11170f.add(v);
            this.f11169e.addAndGet(iM9389c);
            z = true;
        } else {
            z = false;
        }
        super.mo5250a(k, v);
        return z;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.AbstractC1802a, com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: b */
    public final void mo5252b() {
        this.f11170f.clear();
        this.f11169e.set(0);
        super.mo5252b();
    }

    /* JADX INFO: renamed from: c */
    public abstract int m9389c();

    /* JADX INFO: renamed from: d */
    public abstract V m9390d();
}
