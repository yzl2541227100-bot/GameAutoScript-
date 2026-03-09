package com.anythink.core.common.res;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.anythink.core.common.res.c */
/* JADX INFO: loaded from: classes.dex */
public class C1379c<K, V> {

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap<K, V> f5555a;

    /* JADX INFO: renamed from: b */
    private int f5556b;

    /* JADX INFO: renamed from: c */
    private int f5557c;

    /* JADX INFO: renamed from: d */
    private int f5558d;

    /* JADX INFO: renamed from: e */
    private int f5559e;

    /* JADX INFO: renamed from: f */
    private int f5560f;

    /* JADX INFO: renamed from: g */
    private int f5561g;

    /* JADX INFO: renamed from: h */
    private int f5562h;

    public C1379c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5557c = i;
        this.f5555a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: a */
    private void m4502a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f5557c = i;
        }
        m4505b(i);
    }

    /* JADX INFO: renamed from: b */
    private static V m4503b() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    private V m4504b(K k) {
        V vRemove;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            vRemove = this.f5555a.remove(k);
            if (vRemove != null) {
                this.f5556b -= m4507c(k, vRemove);
            }
        }
        if (vRemove != null) {
            mo4499a(false, k, vRemove, null);
        }
        return vRemove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r5.f5556b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results! --> size: " + r5.f5556b + ", map.isEmpty(): " + r5.f5555a.isEmpty());
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4505b(int r6) {
        /*
            r5 = this;
        L0:
            monitor-enter(r5)
            int r0 = r5.f5556b     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            if (r0 < 0) goto L5b
            java.util.LinkedHashMap<K, V> r0 = r5.f5555a     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            if (r0 == 0) goto L11
            int r0 = r5.f5556b     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            if (r0 != 0) goto L5b
        L11:
            int r0 = r5.f5556b     // Catch: java.lang.Throwable -> L90
            if (r0 > r6) goto L17
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L90
            return
        L17:
            java.util.LinkedHashMap<K, V> r0 = r5.f5555a     // Catch: java.lang.Throwable -> L90
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L90
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L90
            r1 = 0
            if (r0 <= 0) goto L35
            java.util.LinkedHashMap<K, V> r0 = r5.f5555a     // Catch: java.lang.Throwable -> L90
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L90
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L90
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 != 0) goto L3a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L90
            return
        L3a:
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L90
            java.util.LinkedHashMap<K, V> r3 = r5.f5555a     // Catch: java.lang.Throwable -> L90
            r3.remove(r2)     // Catch: java.lang.Throwable -> L90
            int r3 = r5.f5556b     // Catch: java.lang.Throwable -> L90
            int r4 = r5.m4507c(r2, r0)     // Catch: java.lang.Throwable -> L90
            int r3 = r3 - r4
            r5.f5556b = r3     // Catch: java.lang.Throwable -> L90
            int r3 = r5.f5560f     // Catch: java.lang.Throwable -> L90
            r4 = 1
            int r3 = r3 + r4
            r5.f5560f = r3     // Catch: java.lang.Throwable -> L90
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L90
            r5.mo4499a(r4, r2, r0, r1)
            goto L0
        L5b:
            r6 = 0
            r5.f5556b = r6     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r0.<init>()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r0.append(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results! --> size: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            int r1 = r5.f5556b     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r0.append(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.String r1 = ", map.isEmpty(): "
            r0.append(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.util.LinkedHashMap<K, V> r1 = r5.f5555a     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r0.append(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            throw r6     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
        L90:
            r6 = move-exception
            goto L98
        L92:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L90
            return
        L98:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.C1379c.m4505b(int):void");
    }

    /* JADX INFO: renamed from: c */
    private synchronized int m4506c() {
        return this.f5556b;
    }

    /* JADX INFO: renamed from: c */
    private int m4507c(K k, V v) {
        int iMo4498a = mo4498a(k, v);
        if (iMo4498a >= 0) {
            return iMo4498a;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* JADX INFO: renamed from: d */
    private synchronized int m4508d() {
        return this.f5557c;
    }

    /* JADX INFO: renamed from: e */
    private synchronized int m4509e() {
        return this.f5561g;
    }

    /* JADX INFO: renamed from: f */
    private synchronized int m4510f() {
        return this.f5562h;
    }

    /* JADX INFO: renamed from: g */
    private synchronized int m4511g() {
        return this.f5559e;
    }

    /* JADX INFO: renamed from: h */
    private synchronized int m4512h() {
        return this.f5558d;
    }

    /* JADX INFO: renamed from: i */
    private synchronized int m4513i() {
        return this.f5560f;
    }

    /* JADX INFO: renamed from: j */
    private synchronized Map<K, V> m4514j() {
        return new LinkedHashMap(this.f5555a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4515k() {
        /*
            r6 = this;
            java.util.LinkedHashMap<K, V> r0 = r6.f5555a
            monitor-enter(r0)
        L3:
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L86
            int r1 = r6.f5556b     // Catch: java.lang.Throwable -> L83
            if (r1 < 0) goto L64
            java.util.LinkedHashMap<K, V> r1 = r6.f5555a     // Catch: java.lang.Throwable -> L83
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L14
            int r1 = r6.f5556b     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L64
        L14:
            int r1 = r6.f5556b     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L1a
        L18:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L83
            goto L3c
        L1a:
            java.util.LinkedHashMap<K, V> r1 = r6.f5555a     // Catch: java.lang.Throwable -> L83
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L83
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L83
            r2 = 0
            if (r1 <= 0) goto L38
            java.util.LinkedHashMap<K, V> r1 = r6.f5555a     // Catch: java.lang.Throwable -> L83
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L83
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L83
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L83
            goto L39
        L38:
            r1 = r2
        L39:
            if (r1 != 0) goto L43
            goto L18
        L3c:
            java.util.LinkedHashMap<K, V> r1 = r6.f5555a     // Catch: java.lang.Throwable -> L86
            r1.clear()     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            return
        L43:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L83
            java.util.LinkedHashMap<K, V> r4 = r6.f5555a     // Catch: java.lang.Throwable -> L83
            r4.remove(r3)     // Catch: java.lang.Throwable -> L83
            int r4 = r6.f5556b     // Catch: java.lang.Throwable -> L83
            int r5 = r6.m4507c(r3, r1)     // Catch: java.lang.Throwable -> L83
            int r4 = r4 - r5
            r6.f5556b = r4     // Catch: java.lang.Throwable -> L83
            int r4 = r6.f5560f     // Catch: java.lang.Throwable -> L83
            r5 = 1
            int r4 = r4 + r5
            r6.f5560f = r4     // Catch: java.lang.Throwable -> L83
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L83
            r6.mo4499a(r5, r3, r1, r2)     // Catch: java.lang.Throwable -> L86
            goto L3
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r2.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L83
            r2.append(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = ".sizeOf() is reporting inconsistent results!"
            r2.append(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L83
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L83
            throw r1     // Catch: java.lang.Throwable -> L83
        L83:
            r1 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L86
            throw r1     // Catch: java.lang.Throwable -> L86
        L86:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.C1379c.m4515k():void");
    }

    /* JADX INFO: renamed from: a */
    public int mo4498a(K k, V v) {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public final V m4516a(K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f5555a.get(k);
            if (v != null) {
                this.f5561g++;
                return v;
            }
            this.f5562h++;
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4517a() {
        m4505b(-1);
    }

    /* JADX INFO: renamed from: a */
    public void mo4499a(boolean z, K k, V v, V v2) {
    }

    /* JADX INFO: renamed from: b */
    public final V m4518b(K k, V v) {
        V vPut;
        Objects.requireNonNull(k, "key == null || value == null");
        synchronized (this) {
            this.f5558d++;
            this.f5556b += m4507c(k, v);
            vPut = this.f5555a.put(k, v);
            if (vPut != null) {
                this.f5556b -= m4507c(k, vPut);
            }
        }
        if (vPut != null) {
            mo4499a(false, k, vPut, v);
        }
        m4505b(this.f5557c);
        return vPut;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f5561g;
        i2 = this.f5562h + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f5557c), Integer.valueOf(this.f5561g), Integer.valueOf(this.f5562h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
