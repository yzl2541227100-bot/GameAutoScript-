package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p189a.p190a.p192b.C2440c;
import com.p188b.p189a.p190a.p192b.C2441d;
import com.p188b.p189a.p190a.p192b.C2444g;
import com.p188b.p189a.p190a.p192b.C2445h;
import com.p188b.p189a.p190a.p197g.C2516h;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.a.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2560n {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f15753c = true;

    /* JADX INFO: renamed from: d */
    private static final Executor f15754d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C2446c.m12580a("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: a */
    public final C2441d f15755a;

    /* JADX INFO: renamed from: b */
    public boolean f15756b;

    /* JADX INFO: renamed from: e */
    private final int f15757e;

    /* JADX INFO: renamed from: f */
    private final long f15758f;

    /* JADX INFO: renamed from: g */
    private final Runnable f15759g;

    /* JADX INFO: renamed from: h */
    private final Deque<C2440c> f15760h;

    public C2560n() {
        this(TimeUnit.MINUTES);
    }

    private C2560n(TimeUnit timeUnit) {
        this.f15759g = new RunnableC2561o(this);
        this.f15760h = new ArrayDeque();
        this.f15755a = new C2441d();
        this.f15757e = 5;
        this.f15758f = timeUnit.toNanos(5L);
    }

    /* JADX INFO: renamed from: a */
    public final long m12936a(long j) {
        int size;
        synchronized (this) {
            C2440c c2440c = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C2440c c2440c2 : this.f15760h) {
                List<Reference<C2444g>> list = c2440c2.f15140d;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        size = list.size();
                        break;
                    }
                    Reference<C2444g> reference = list.get(i3);
                    if (reference.get() == null) {
                        C2516h.m12773b().mo12754a("A connection to " + c2440c2.mo12534a().f15597a.f15076a + " was leaked. Did you forget to close a response body?", ((C2445h) reference).f15174a);
                        list.remove(i3);
                        c2440c2.f15137a = true;
                        if (list.isEmpty()) {
                            c2440c2.f15141e = j - this.f15758f;
                            size = 0;
                            break;
                        }
                    } else {
                        i3++;
                    }
                }
                if (size > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c2440c2.f15141e;
                    if (j3 > j2) {
                        c2440c = c2440c2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f15758f;
            if (j2 < j4 && i <= this.f15757e) {
                if (i > 0) {
                    return j4 - j2;
                }
                if (i2 > 0) {
                    return j4;
                }
                this.f15756b = false;
                return -1L;
            }
            this.f15760h.remove(c2440c);
            C2446c.m12583a(c2440c.m12540b());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C2440c m12937a(C2426a c2426a, C2444g c2444g) {
        if (!f15753c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (C2440c c2440c : this.f15760h) {
            if (c2440c.m12538a(c2426a)) {
                c2444g.m12562a(c2440c);
                return c2440c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m12938a(C2440c c2440c) {
        if (!f15753c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f15756b) {
            this.f15756b = true;
            f15754d.execute(this.f15759g);
        }
        this.f15760h.add(c2440c);
    }

    /* JADX INFO: renamed from: b */
    public final Socket m12939b(C2426a c2426a, C2444g c2444g) {
        if (!f15753c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (C2440c c2440c : this.f15760h) {
            if (c2440c.m12538a(c2426a) && c2440c.m12542d() && c2440c != c2444g.m12565b()) {
                return c2444g.m12566b(c2440c);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12940b(C2440c c2440c) {
        if (!f15753c && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (c2440c.f15137a || this.f15757e == 0) {
            this.f15760h.remove(c2440c);
            return true;
        }
        notifyAll();
        return false;
    }
}
