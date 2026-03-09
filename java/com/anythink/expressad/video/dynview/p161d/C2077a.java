package com.anythink.expressad.video.dynview.p161d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2077a<K, V> extends HashMap<K, V> {

    /* JADX INFO: renamed from: a */
    private ReferenceQueue<V> f13220a = new ReferenceQueue<>();

    /* JADX INFO: renamed from: b */
    private HashMap<K, C2077a<K, V>.a<K, V>> f13221b = new HashMap<>();

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.d.a$a */
    public class a<K, V> extends SoftReference<V> {

        /* JADX INFO: renamed from: a */
        public K f13222a;

        public a(K k, V v, ReferenceQueue referenceQueue) {
            super(v, referenceQueue);
            this.f13222a = k;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11125a() {
        while (true) {
            a aVar = (a) this.f13220a.poll();
            if (aVar == null) {
                return;
            } else {
                this.f13221b.remove(aVar.f13222a);
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        m11125a();
        return this.f13221b.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        m11125a();
        C2077a<K, V>.a<K, V> aVar = this.f13221b.get(obj);
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m11125a();
        C2077a<K, V>.a<K, V> aVarPut = this.f13221b.put(k, new a<>(k, v, this.f13220a));
        if (aVarPut == null) {
            return null;
        }
        return aVarPut.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m11125a();
        C2077a<K, V>.a<K, V> aVarRemove = this.f13221b.remove(obj);
        if (aVarRemove == null) {
            return null;
        }
        return aVarRemove.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        m11125a();
        return this.f13221b.size();
    }
}
