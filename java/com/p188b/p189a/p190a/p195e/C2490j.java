package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2579f;
import com.p188b.p199b.InterfaceC2581h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.a.a.e.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2490j implements Closeable {

    /* JADX INFO: renamed from: b */
    public final boolean f15344b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2499s f15345c;

    /* JADX INFO: renamed from: e */
    public final String f15347e;

    /* JADX INFO: renamed from: f */
    public int f15348f;

    /* JADX INFO: renamed from: g */
    public int f15349g;

    /* JADX INFO: renamed from: h */
    public boolean f15350h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2478aj f15351i;

    /* JADX INFO: renamed from: k */
    public long f15353k;

    /* JADX INFO: renamed from: m */
    public final C2480al f15355m;

    /* JADX INFO: renamed from: n */
    public boolean f15356n;

    /* JADX INFO: renamed from: o */
    public final Socket f15357o;

    /* JADX INFO: renamed from: p */
    public final C2474af f15358p;

    /* JADX INFO: renamed from: q */
    public final C2501u f15359q;

    /* JADX INFO: renamed from: r */
    public final Set<Integer> f15360r;

    /* JADX INFO: renamed from: t */
    private final ExecutorService f15361t;

    /* JADX INFO: renamed from: u */
    private Map<Integer, C2477ai> f15362u;

    /* JADX INFO: renamed from: v */
    private int f15363v;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ boolean f15343s = true;

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f15342a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C2446c.m12580a("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: d */
    public final Map<Integer, C2470ab> f15346d = new LinkedHashMap();

    /* JADX INFO: renamed from: j */
    public long f15352j = 0;

    /* JADX INFO: renamed from: l */
    public C2480al f15354l = new C2480al();

    public C2490j(C2498r c2498r) {
        C2480al c2480al = new C2480al();
        this.f15355m = c2480al;
        this.f15356n = false;
        this.f15360r = new LinkedHashSet();
        this.f15351i = c2498r.f15395f;
        boolean z = c2498r.f15396g;
        this.f15344b = z;
        this.f15345c = c2498r.f15394e;
        int i = z ? 1 : 2;
        this.f15349g = i;
        if (z) {
            this.f15349g = i + 2;
        }
        this.f15363v = z ? 1 : 2;
        if (z) {
            this.f15354l.m12690a(7, 16777216);
        }
        String str = c2498r.f15391b;
        this.f15347e = str;
        this.f15361t = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C2446c.m12580a(C2446c.m12576a("OkHttp %s Push Observer", str), true));
        c2480al.m12690a(7, 65535);
        c2480al.m12690a(5, 16384);
        this.f15353k = c2480al.m12696d();
        this.f15357o = c2498r.f15390a;
        this.f15358p = new C2474af(c2498r.f15393d, z);
        this.f15359q = new C2501u(this, new C2505y(c2498r.f15392c, z));
    }

    /* JADX INFO: renamed from: b */
    private C2470ab m12721b(List<C2483c> list, boolean z) {
        int i;
        C2470ab c2470ab;
        boolean z3;
        boolean z4 = !z;
        synchronized (this.f15358p) {
            synchronized (this) {
                if (this.f15350h) {
                    throw new C2468a();
                }
                i = this.f15349g;
                this.f15349g = i + 2;
                c2470ab = new C2470ab(i, this, z4, false, list);
                z3 = !z || this.f15353k == 0 || c2470ab.f15241b == 0;
                if (c2470ab.m12647a()) {
                    this.f15346d.put(Integer.valueOf(i), c2470ab);
                }
            }
            this.f15358p.m12673a(z4, i, list);
        }
        if (z3) {
            this.f15358p.m12674b();
        }
        return c2470ab;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12722d(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m12723a() {
        return this.f15355m.m12694c();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C2470ab m12724a(int i) {
        return this.f15346d.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public final C2470ab m12725a(List<C2483c> list, boolean z) {
        return m12721b(list, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m12726a(int i, long j) {
        f15342a.execute(new C2492l(this, "OkHttp Window Update %s stream %d", new Object[]{this.f15347e, Integer.valueOf(i)}, i, j));
    }

    /* JADX INFO: renamed from: a */
    public final void m12727a(int i, EnumC2482b enumC2482b) {
        f15342a.execute(new C2491k(this, "OkHttp %s stream %d", new Object[]{this.f15347e, Integer.valueOf(i)}, i, enumC2482b));
    }

    /* JADX INFO: renamed from: a */
    public final void m12728a(int i, InterfaceC2581h interfaceC2581h, int i2, boolean z) throws IOException {
        C2579f c2579f = new C2579f();
        long j = i2;
        interfaceC2581h.mo13004a(j);
        interfaceC2581h.mo12513a(c2579f, j);
        if (c2579f.m13006b() == j) {
            this.f15361t.execute(new C2496p(this, "OkHttp %s Push Data[%s]", new Object[]{this.f15347e, Integer.valueOf(i)}, i, c2579f, i2, z));
            return;
        }
        throw new IOException(c2579f.m13006b() + " != " + i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m12729a(int i, List<C2483c> list) {
        synchronized (this) {
            if (this.f15360r.contains(Integer.valueOf(i))) {
                m12727a(i, EnumC2482b.PROTOCOL_ERROR);
            } else {
                this.f15360r.add(Integer.valueOf(i));
                this.f15361t.execute(new C2494n(this, "OkHttp %s Push Request[%s]", new Object[]{this.f15347e, Integer.valueOf(i)}, i, list));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12730a(int i, List<C2483c> list, boolean z) {
        this.f15361t.execute(new C2495o(this, "OkHttp %s Push Headers[%s]", new Object[]{this.f15347e, Integer.valueOf(i)}, i, list, z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0030, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f15358p.m12676c());
        r6 = r3;
        r8.f15353k -= r6;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12731a(int r9, boolean r10, com.p188b.p199b.C2579f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            com.b.a.a.e.af r12 = r8.f15358p
            r12.m12672a(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L60
            monitor-enter(r8)
        L12:
            long r3 = r8.f15353k     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L30
            java.util.Map<java.lang.Integer, com.b.a.a.e.ab> r3 = r8.f15346d     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L56
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L56
            com.b.a.a.e.af r3 = r8.f15358p     // Catch: java.lang.Throwable -> L56
            int r3 = r3.m12676c()     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.f15353k     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.f15353k = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            com.b.a.a.e.af r4 = r8.f15358p
            if (r10 == 0) goto L51
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            r4.m12672a(r5, r9, r11, r3)
            goto Ld
        L56:
            r9 = move-exception
            goto L5e
        L58:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L5e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p195e.C2490j.m12731a(int, boolean, com.b.b.f, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00a7  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12732a(com.p188b.p189a.p190a.p195e.EnumC2482b r7, com.p188b.p189a.p190a.p195e.EnumC2482b r8) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = com.p188b.p189a.p190a.p195e.C2490j.f15343s
            if (r0 != 0) goto L11
            boolean r0 = java.lang.Thread.holdsLock(r6)
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L11:
            r0 = 0
            com.b.a.a.e.af r1 = r6.f15358p     // Catch: java.io.IOException -> L33
            monitor-enter(r1)     // Catch: java.io.IOException -> L33
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L30
            boolean r2 = r6.f15350h     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L1d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            goto L2b
        L1d:
            r2 = 1
            r6.f15350h = r2     // Catch: java.lang.Throwable -> L2d
            int r2 = r6.f15348f     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            com.b.a.a.e.af r3 = r6.f15358p     // Catch: java.lang.Throwable -> L30
            byte[] r4 = com.p188b.p189a.p190a.C2446c.f15175a     // Catch: java.lang.Throwable -> L30
            r3.m12669a(r2, r7, r4)     // Catch: java.lang.Throwable -> L30
            goto L1b
        L2b:
            r7 = r0
            goto L34
        L2d:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            throw r7     // Catch: java.lang.Throwable -> L30
        L30:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r7     // Catch: java.io.IOException -> L33
        L33:
            r7 = move-exception
        L34:
            monitor-enter(r6)
            java.util.Map<java.lang.Integer, com.b.a.a.e.ab> r1 = r6.f15346d     // Catch: java.lang.Throwable -> La8
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto L57
            java.util.Map<java.lang.Integer, com.b.a.a.e.ab> r1 = r6.f15346d     // Catch: java.lang.Throwable -> La8
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> La8
            java.util.Map<java.lang.Integer, com.b.a.a.e.ab> r2 = r6.f15346d     // Catch: java.lang.Throwable -> La8
            int r2 = r2.size()     // Catch: java.lang.Throwable -> La8
            com.b.a.a.e.ab[] r2 = new com.p188b.p189a.p190a.p195e.C2470ab[r2]     // Catch: java.lang.Throwable -> La8
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: java.lang.Throwable -> La8
            com.b.a.a.e.ab[] r1 = (com.p188b.p189a.p190a.p195e.C2470ab[]) r1     // Catch: java.lang.Throwable -> La8
            java.util.Map<java.lang.Integer, com.b.a.a.e.ab> r2 = r6.f15346d     // Catch: java.lang.Throwable -> La8
            r2.clear()     // Catch: java.lang.Throwable -> La8
            goto L58
        L57:
            r1 = r0
        L58:
            java.util.Map<java.lang.Integer, com.b.a.a.e.ai> r2 = r6.f15362u     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto L71
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> La8
            java.util.Map<java.lang.Integer, com.b.a.a.e.ai> r3 = r6.f15362u     // Catch: java.lang.Throwable -> La8
            int r3 = r3.size()     // Catch: java.lang.Throwable -> La8
            com.b.a.a.e.ai[] r3 = new com.p188b.p189a.p190a.p195e.C2477ai[r3]     // Catch: java.lang.Throwable -> La8
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch: java.lang.Throwable -> La8
            com.b.a.a.e.ai[] r2 = (com.p188b.p189a.p190a.p195e.C2477ai[]) r2     // Catch: java.lang.Throwable -> La8
            r6.f15362u = r0     // Catch: java.lang.Throwable -> La8
            r0 = r2
        L71:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La8
            r2 = 0
            if (r1 == 0) goto L86
            int r3 = r1.length
            r4 = 0
        L77:
            if (r4 >= r3) goto L86
            r5 = r1[r4]
            r5.m12644a(r8)     // Catch: java.io.IOException -> L7f
            goto L83
        L7f:
            r5 = move-exception
            if (r7 == 0) goto L83
            r7 = r5
        L83:
            int r4 = r4 + 1
            goto L77
        L86:
            if (r0 == 0) goto L93
            int r8 = r0.length
        L89:
            if (r2 >= r8) goto L93
            r1 = r0[r2]
            r1.m12684c()
            int r2 = r2 + 1
            goto L89
        L93:
            com.b.a.a.e.af r8 = r6.f15358p     // Catch: java.io.IOException -> L99
            r8.close()     // Catch: java.io.IOException -> L99
            goto L9d
        L99:
            r8 = move-exception
            if (r7 != 0) goto L9d
            r7 = r8
        L9d:
            java.net.Socket r8 = r6.f15357o     // Catch: java.io.IOException -> La3
            r8.close()     // Catch: java.io.IOException -> La3
            goto La4
        La3:
            r7 = move-exception
        La4:
            if (r7 != 0) goto La7
            return
        La7:
            throw r7
        La8:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La8
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p195e.C2490j.m12732a(com.b.a.a.e.b, com.b.a.a.e.b):void");
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C2470ab m12733b(int i) {
        C2470ab c2470abRemove;
        c2470abRemove = this.f15346d.remove(Integer.valueOf(i));
        notifyAll();
        return c2470abRemove;
    }

    /* JADX INFO: renamed from: b */
    public final void m12734b() {
        this.f15358p.m12666a();
        this.f15358p.m12675b(this.f15354l);
        if (this.f15354l.m12696d() != 65535) {
            this.f15358p.m12667a(0, r0 - 65535);
        }
        new Thread(this.f15359q).start();
    }

    /* JADX INFO: renamed from: b */
    public final void m12735b(int i, EnumC2482b enumC2482b) {
        this.f15358p.m12668a(i, enumC2482b);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized C2477ai m12736c(int i) {
        Map<Integer, C2477ai> map = this.f15362u;
        if (map == null) {
            return null;
        }
        return map.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public final void m12737c(int i, EnumC2482b enumC2482b) {
        this.f15361t.execute(new C2497q(this, "OkHttp %s Push Reset[%s]", new Object[]{this.f15347e, Integer.valueOf(i)}, i, enumC2482b));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m12738c() {
        return this.f15350h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m12732a(EnumC2482b.NO_ERROR, EnumC2482b.CANCEL);
    }
}
