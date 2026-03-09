package p285z2;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p285z2.C4189ny;

/* JADX INFO: renamed from: z2.xw */
/* JADX INFO: loaded from: classes2.dex */
public final class C4557xw {
    private static final Executor OooO0oO = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4558xx.Oooo00o("OkHttp ConnectionPool", true));
    public static final /* synthetic */ boolean OooO0oo = false;
    private final int OooO00o;
    private final long OooO0O0;
    private final Runnable OooO0OO;
    private final Deque<C4078ky> OooO0Oo;
    public boolean OooO0o;
    public final C4115ly OooO0o0;

    /* JADX INFO: renamed from: z2.xw$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long jOooO00o = C4557xw.this.OooO00o(System.nanoTime());
                if (jOooO00o == -1) {
                    return;
                }
                if (jOooO00o > 0) {
                    long j = jOooO00o / 1000000;
                    long j2 = jOooO00o - (1000000 * j);
                    synchronized (C4557xw.this) {
                        try {
                            C4557xw.this.wait(j, (int) j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public C4557xw() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public C4557xw(int i, long j, TimeUnit timeUnit) {
        this.OooO0OO = new OooO00o();
        this.OooO0Oo = new ArrayDeque();
        this.OooO0o0 = new C4115ly();
        this.OooO00o = i;
        this.OooO0O0 = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }

    private int OooO0oo(C4078ky c4078ky, long j) {
        List<Reference<C4189ny>> list = c4078ky.OooOOO;
        int i = 0;
        while (i < list.size()) {
            Reference<C4189ny> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C4375sz.OooOO0O().OooOOoo("A connection to " + c4078ky.OooO0O0().OooO00o().OooOO0o() + " was leaked. Did you forget to close a response body?", ((C4189ny.OooO00o) reference).OooO00o);
                list.remove(i);
                c4078ky.OooOO0O = true;
                if (list.isEmpty()) {
                    c4078ky.OooOOOO = j - this.OooO0O0;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public void OooO(C4078ky c4078ky) {
        if (!this.OooO0o) {
            this.OooO0o = true;
            OooO0oO.execute(this.OooO0OO);
        }
        this.OooO0Oo.add(c4078ky);
    }

    public long OooO00o(long j) {
        synchronized (this) {
            C4078ky c4078ky = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C4078ky c4078ky2 : this.OooO0Oo) {
                if (OooO0oo(c4078ky2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c4078ky2.OooOOOO;
                    if (j3 > j2) {
                        c4078ky = c4078ky2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.OooO0O0;
            if (j2 < j4 && i <= this.OooO00o) {
                if (i > 0) {
                    return j4 - j2;
                }
                if (i2 > 0) {
                    return j4;
                }
                this.OooO0o = false;
                return -1L;
            }
            this.OooO0Oo.remove(c4078ky);
            C4558xx.OooO(c4078ky.OooO0Oo());
            return 0L;
        }
    }

    public boolean OooO0O0(C4078ky c4078ky) {
        if (c4078ky.OooOO0O || this.OooO00o == 0) {
            this.OooO0Oo.remove(c4078ky);
            return true;
        }
        notifyAll();
        return false;
    }

    public synchronized int OooO0OO() {
        return this.OooO0Oo.size();
    }

    @Nullable
    public Socket OooO0Oo(C4187nw c4187nw, C4189ny c4189ny) {
        for (C4078ky c4078ky : this.OooO0Oo) {
            if (c4078ky.OooOOOO(c4187nw, null) && c4078ky.OooOOo0() && c4078ky != c4189ny.OooO0Oo()) {
                return c4189ny.OooOOO0(c4078ky);
            }
        }
        return null;
    }

    @Nullable
    public C4078ky OooO0o(C4187nw c4187nw, C4189ny c4189ny, C4373sx c4373sx) {
        for (C4078ky c4078ky : this.OooO0Oo) {
            if (c4078ky.OooOOOO(c4187nw, c4373sx)) {
                c4189ny.OooO00o(c4078ky, true);
                return c4078ky;
            }
        }
        return null;
    }

    public void OooO0o0() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C4078ky> it = this.OooO0Oo.iterator();
            while (it.hasNext()) {
                C4078ky next = it.next();
                if (next.OooOOO.isEmpty()) {
                    next.OooOO0O = true;
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C4558xx.OooO(((C4078ky) it2.next()).OooO0Oo());
        }
    }

    public synchronized int OooO0oO() {
        int i;
        i = 0;
        Iterator<C4078ky> it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            if (it.next().OooOOO.isEmpty()) {
                i++;
            }
        }
        return i;
    }
}
