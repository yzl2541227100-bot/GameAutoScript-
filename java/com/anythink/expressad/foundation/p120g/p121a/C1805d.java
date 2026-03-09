package com.anythink.expressad.foundation.p120g.p121a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1805d implements InterfaceC1806e<String, JSONObject> {

    /* JADX INFO: renamed from: c */
    private int f11176c;

    /* JADX INFO: renamed from: b */
    private final int f11175b = 1000;

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap<String, JSONObject> f11174a = new LinkedHashMap<>(0, 0.75f, true);

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
    private void m9393a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f11176c     // Catch: java.lang.Throwable -> L69
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f11174a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L11
            int r0 = r2.f11176c     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.f11176c     // Catch: java.lang.Throwable -> L69
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f11174a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f11174a     // Catch: java.lang.Throwable -> L69
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
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f11174a     // Catch: java.lang.Throwable -> L46
            r0.remove(r1)     // Catch: java.lang.Throwable -> L46
            int r0 = r2.f11176c     // Catch: java.lang.Throwable -> L46
            int r0 = r0 + (-1)
            r2.f11176c = r0     // Catch: java.lang.Throwable -> L46
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
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p120g.p121a.C1805d.m9393a(int):void");
    }

    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method */
    private void b2(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            if (this.f11174a.remove(str) != null) {
                this.f11176c--;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m9394c() {
        return 1;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a */
    public final Collection<String> mo5248a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f11174a.keySet());
        }
        return hashSet;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final JSONObject mo5251b(String str) {
        JSONObject jSONObject;
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            jSONObject = this.f11174a.get(str);
        }
        return jSONObject;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5249a(String str) {
        String str2 = str;
        Objects.requireNonNull(str2, "key == null");
        synchronized (this) {
            if (this.f11174a.remove(str2) != null) {
                this.f11176c--;
            }
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final boolean mo5250a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f11176c++;
            if (this.f11174a.put(str, jSONObject) != null) {
                this.f11176c--;
            }
        }
        m9393a(this.f11175b);
        return true;
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.InterfaceC1806e
    /* JADX INFO: renamed from: b */
    public final void mo5252b() {
        m9393a(-1);
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f11175b));
    }
}
