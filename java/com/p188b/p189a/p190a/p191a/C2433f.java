package com.p188b.p189a.p190a.p191a;

import com.p188b.p189a.p190a.p196f.InterfaceC2507a;
import com.p188b.p199b.InterfaceC2580g;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.b.a.a.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2433f implements Closeable, Flushable {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2507a f15110b;

    /* JADX INFO: renamed from: c */
    public final int f15111c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2580g f15112d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap<String, C2435h> f15113e;

    /* JADX INFO: renamed from: f */
    public int f15114f;

    /* JADX INFO: renamed from: g */
    public boolean f15115g;

    /* JADX INFO: renamed from: h */
    public boolean f15116h;

    /* JADX INFO: renamed from: i */
    public boolean f15117i;

    /* JADX INFO: renamed from: k */
    private long f15118k;

    /* JADX INFO: renamed from: l */
    private long f15119l;

    /* JADX INFO: renamed from: m */
    private final Executor f15120m;

    /* JADX INFO: renamed from: n */
    private final Runnable f15121n;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ boolean f15109j = true;

    /* JADX INFO: renamed from: a */
    public static final Pattern f15108a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a */
    private boolean m12518a() {
        int i = this.f15114f;
        return i >= 2000 && i >= this.f15113e.size();
    }

    /* JADX INFO: renamed from: a */
    private boolean m12519a(C2435h c2435h) {
        C2434g c2434g = c2435h.f15130f;
        if (c2434g != null && c2434g.f15122a.f15130f == c2434g) {
            int i = 0;
            while (true) {
                C2433f c2433f = c2434g.f15123b;
                if (i >= c2433f.f15111c) {
                    break;
                }
                try {
                    c2433f.f15110b.mo12748a(c2434g.f15122a.f15128d[i]);
                } catch (IOException unused) {
                }
                i++;
            }
            c2434g.f15122a.f15130f = null;
        }
        for (int i2 = 0; i2 < this.f15111c; i2++) {
            this.f15110b.mo12748a(c2435h.f15127c[i2]);
            long j = this.f15119l;
            long[] jArr = c2435h.f15126b;
            this.f15119l = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f15114f++;
        this.f15112d.mo13008b("REMOVE").mo13028h(32).mo13008b(c2435h.f15125a).mo13028h(10);
        this.f15113e.remove(c2435h.f15125a);
        if (m12518a()) {
            this.f15120m.execute(this.f15121n);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private synchronized boolean m12520b() {
        return this.f15116h;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m12521c() {
        if (m12520b()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: d */
    private void m12522d() {
        while (this.f15119l > this.f15118k) {
            m12519a(this.f15113e.values().iterator().next());
        }
        this.f15117i = false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12523a(C2434g c2434g) {
        InterfaceC2580g interfaceC2580g;
        C2435h c2435h = c2434g.f15122a;
        if (c2435h.f15130f != c2434g) {
            throw new IllegalStateException();
        }
        for (int i = 0; i < this.f15111c; i++) {
            this.f15110b.mo12748a(c2435h.f15128d[i]);
        }
        this.f15114f++;
        c2435h.f15130f = null;
        if (false || c2435h.f15129e) {
            c2435h.f15129e = true;
            this.f15112d.mo13008b("CLEAN").mo13028h(32);
            this.f15112d.mo13008b(c2435h.f15125a);
            c2435h.m12525a(this.f15112d);
            interfaceC2580g = this.f15112d;
        } else {
            this.f15113e.remove(c2435h.f15125a);
            this.f15112d.mo13008b("REMOVE").mo13028h(32);
            this.f15112d.mo13008b(c2435h.f15125a);
            interfaceC2580g = this.f15112d;
        }
        interfaceC2580g.mo13028h(10);
        this.f15112d.flush();
        if (this.f15119l > this.f15118k || m12518a()) {
            this.f15120m.execute(this.f15121n);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f15115g && !this.f15116h) {
            for (C2435h c2435h : (C2435h[]) this.f15113e.values().toArray(new C2435h[this.f15113e.size()])) {
                C2434g c2434g = c2435h.f15130f;
                if (c2434g != null) {
                    c2434g.m12524a();
                }
            }
            m12522d();
            this.f15112d.close();
            this.f15112d = null;
            this.f15116h = true;
            return;
        }
        this.f15116h = true;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f15115g) {
            m12521c();
            m12522d();
            this.f15112d.flush();
        }
    }
}
