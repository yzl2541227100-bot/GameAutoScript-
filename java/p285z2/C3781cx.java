package p285z2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p285z2.C4188nx;

/* JADX INFO: renamed from: z2.cx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3781cx {
    public static final /* synthetic */ boolean OooO0oo = false;

    @Nullable
    private Runnable OooO0OO;

    @Nullable
    private ExecutorService OooO0Oo;
    private int OooO00o = 64;
    private int OooO0O0 = 5;
    private final Deque<C4188nx.OooO0O0> OooO0o0 = new ArrayDeque();
    private final Deque<C4188nx.OooO0O0> OooO0o = new ArrayDeque();
    private final Deque<C4188nx> OooO0oO = new ArrayDeque();

    public C3781cx() {
    }

    public C3781cx(ExecutorService executorService) {
        this.OooO0Oo = executorService;
    }

    private <T> void OooO0o0(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.OooO0OO;
        }
        if (OooOO0() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private boolean OooOO0() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C4188nx.OooO0O0> it = this.OooO0o0.iterator();
            while (it.hasNext()) {
                C4188nx.OooO0O0 next = it.next();
                if (this.OooO0o.size() >= this.OooO00o) {
                    break;
                }
                if (OooOOOO(next) < this.OooO0O0) {
                    it.remove();
                    arrayList.add(next);
                    this.OooO0o.add(next);
                }
            }
            z = OooOOO() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C4188nx.OooO0O0) arrayList.get(i)).OooOOO0(OooO0Oo());
        }
        return z;
    }

    private int OooOOOO(C4188nx.OooO0O0 oooO0O0) {
        int i = 0;
        for (C4188nx.OooO0O0 oooO0O02 : this.OooO0o) {
            if (!oooO0O02.OooOOO().OooooOO && oooO0O02.OooOOOO().equals(oooO0O0.OooOOOO())) {
                i++;
            }
        }
        return i;
    }

    public synchronized int OooO() {
        return this.OooO0O0;
    }

    public synchronized void OooO00o() {
        Iterator<C4188nx.OooO0O0> it = this.OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().OooOOO().cancel();
        }
        Iterator<C4188nx.OooO0O0> it2 = this.OooO0o.iterator();
        while (it2.hasNext()) {
            it2.next().OooOOO().cancel();
        }
        Iterator<C4188nx> it3 = this.OooO0oO.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public void OooO0O0(C4188nx.OooO0O0 oooO0O0) {
        synchronized (this) {
            this.OooO0o0.add(oooO0O0);
        }
        OooOO0();
    }

    public synchronized void OooO0OO(C4188nx c4188nx) {
        this.OooO0oO.add(c4188nx);
    }

    public synchronized ExecutorService OooO0Oo() {
        if (this.OooO0Oo == null) {
            this.OooO0Oo = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C4558xx.Oooo00o("OkHttp Dispatcher", false));
        }
        return this.OooO0Oo;
    }

    public void OooO0o(C4188nx.OooO0O0 oooO0O0) {
        OooO0o0(this.OooO0o, oooO0O0);
    }

    public void OooO0oO(C4188nx c4188nx) {
        OooO0o0(this.OooO0oO, c4188nx);
    }

    public synchronized int OooO0oo() {
        return this.OooO00o;
    }

    public synchronized List<InterfaceC4335rw> OooOO0O() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<C4188nx.OooO0O0> it = this.OooO0o0.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().OooOOO());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int OooOO0o() {
        return this.OooO0o0.size();
    }

    public synchronized int OooOOO() {
        return this.OooO0o.size() + this.OooO0oO.size();
    }

    public synchronized List<InterfaceC4335rw> OooOOO0() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.OooO0oO);
        Iterator<C4188nx.OooO0O0> it = this.OooO0o.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().OooOOO());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized void OooOOOo(@Nullable Runnable runnable) {
        this.OooO0OO = runnable;
    }

    public void OooOOo(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.OooO0O0 = i;
            }
            OooOO0();
        } else {
            throw new IllegalArgumentException("max < 1: " + i);
        }
    }

    public void OooOOo0(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.OooO00o = i;
            }
            OooOO0();
        } else {
            throw new IllegalArgumentException("max < 1: " + i);
        }
    }
}
