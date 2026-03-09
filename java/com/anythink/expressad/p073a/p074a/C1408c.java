package com.anythink.expressad.p073a.p074a;

import com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.anythink.expressad.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1408c implements InterfaceC1806e<String, C1407b> {

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap<String, C1407b> f6295a;

    /* JADX INFO: renamed from: b */
    private final int f6296b;

    /* JADX INFO: renamed from: c */
    private int f6297c;

    public C1408c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f6296b = i;
        this.f6295a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5246a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f6297c     // Catch: java.lang.Throwable -> L69
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<java.lang.String, com.anythink.expressad.a.a.b> r0 = r2.f6295a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L11
            int r0 = r2.f6297c     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.f6297c     // Catch: java.lang.Throwable -> L69
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<java.lang.String, com.anythink.expressad.a.a.b> r0 = r2.f6295a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<java.lang.String, com.anythink.expressad.a.a.b> r0 = r2.f6295a     // Catch: java.lang.Throwable -> L69
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L32
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            return
        L32:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L69
            r0.getValue()     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashMap<java.lang.String, com.anythink.expressad.a.a.b> r0 = r2.f6295a     // Catch: java.lang.Throwable -> L46
            r0.remove(r1)     // Catch: java.lang.Throwable -> L46
            int r0 = r2.f6297c     // Catch: java.lang.Throwable -> L46
            int r0 = r0 + (-1)
            r2.f6297c = r0     // Catch: java.lang.Throwable -> L46
        L46:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L69
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.p073a.p074a.C1408c.m5246a(int):void");
    }

    /* JADX INFO: renamed from: c */
    private static int m5247c() {
        return 1;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final C1407b mo5251b(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            C1407b c1407b = this.f6295a.get(str);
            if (c1407b != null) {
                return c1407b;
            }
            return null;
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a */
    public final Collection<String> mo5248a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f6295a.keySet());
        }
        return hashSet;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final boolean mo5250a(String str, C1407b c1407b) {
        if (str == null || c1407b == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f6297c++;
            if (this.f6295a.put(str, c1407b) != null) {
                this.f6297c--;
            }
        }
        m5246a(this.f6296b);
        return true;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: b */
    public final void mo5252b() {
        m5246a(-1);
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void mo5249a(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            if (this.f6295a.remove(str) != null) {
                this.f6297c--;
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f6296b));
    }
}
