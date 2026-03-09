package com.anythink.expressad.foundation.p120g.p121a;

import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1802a<K, V> implements InterfaceC1806e<K, V> {

    /* JADX INFO: renamed from: a */
    public static final String f11164a = "cache";

    /* JADX INFO: renamed from: b */
    private final Map<K, Reference<V>> f11165b = Collections.synchronizedMap(new HashMap());

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a */
    public final Collection<K> mo5248a() {
        HashSet hashSet;
        synchronized (this.f11165b) {
            hashSet = new HashSet(this.f11165b.keySet());
        }
        return hashSet;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a */
    public void mo5249a(K k) {
        this.f11165b.remove(k);
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a */
    public boolean mo5250a(K k, V v) {
        this.f11165b.put(k, mo9387c(v));
        return true;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: b */
    public final V mo5251b(K k) {
        Reference<V> reference = this.f11165b.get(k);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: b */
    public void mo5252b() {
        this.f11165b.clear();
    }

    /* JADX INFO: renamed from: c */
    public abstract Reference<V> mo9387c(V v);
}
