package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.a.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2567u {

    /* JADX INFO: renamed from: c */
    private Runnable f15790c;

    /* JADX INFO: renamed from: d */
    private ExecutorService f15791d;

    /* JADX INFO: renamed from: a */
    private int f15788a = 64;

    /* JADX INFO: renamed from: b */
    private int f15789b = 5;

    /* JADX INFO: renamed from: e */
    private final Deque<C2537an> f15792e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    private final Deque<C2537an> f15793f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    private final Deque<C2536am> f15794g = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    private synchronized ExecutorService m12958a() {
        if (this.f15791d == null) {
            this.f15791d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C2446c.m12580a("OkHttp Dispatcher", false));
        }
        return this.f15791d;
    }

    /* JADX INFO: renamed from: a */
    private <T> void m12959a(Deque<T> deque, T t, boolean z) {
        int iM12961c;
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (z) {
                m12960b();
            }
            iM12961c = m12961c();
            runnable = this.f15790c;
        }
        if (iM12961c != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: b */
    private void m12960b() {
        if (this.f15793f.size() < this.f15788a && !this.f15792e.isEmpty()) {
            Iterator<C2537an> it = this.f15792e.iterator();
            while (it.hasNext()) {
                C2537an next = it.next();
                if (m12962c(next) < this.f15789b) {
                    it.remove();
                    this.f15793f.add(next);
                    m12958a().execute(next);
                }
                if (this.f15793f.size() >= this.f15788a) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private synchronized int m12961c() {
        return this.f15793f.size() + this.f15794g.size();
    }

    /* JADX INFO: renamed from: c */
    private int m12962c(C2537an c2537an) {
        Iterator<C2537an> it = this.f15793f.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m12863a().equals(c2537an.m12863a())) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12963a(C2536am c2536am) {
        this.f15794g.add(c2536am);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12964a(C2537an c2537an) {
        if (this.f15793f.size() >= this.f15788a || m12962c(c2537an) >= this.f15789b) {
            this.f15792e.add(c2537an);
        } else {
            this.f15793f.add(c2537an);
            m12958a().execute(c2537an);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12965b(C2536am c2536am) {
        m12959a(this.f15794g, c2536am, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m12966b(C2537an c2537an) {
        m12959a(this.f15793f, c2537an, true);
    }
}
