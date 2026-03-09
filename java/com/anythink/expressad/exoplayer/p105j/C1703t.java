package com.anythink.expressad.exoplayer.p105j;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1715ad;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1703t implements InterfaceC1704u {

    /* JADX INFO: renamed from: a */
    public static final int f9497a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f9498b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f9499c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f9500d = 3;

    /* JADX INFO: renamed from: e */
    private final ExecutorService f9501e;

    /* JADX INFO: renamed from: f */
    private b<? extends c> f9502f;

    /* JADX INFO: renamed from: g */
    private IOException f9503g;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.t$a */
    public interface a<T extends c> {
        /* JADX INFO: renamed from: a */
        int mo7260a(T t, long j, long j2, IOException iOException);

        /* JADX INFO: renamed from: a */
        void mo7266a(T t, long j, long j2);

        /* JADX INFO: renamed from: a */
        void mo7267a(T t, long j, long j2, boolean z);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.t$b */
    @SuppressLint({"HandlerLeak"})
    public final class b<T extends c> extends Handler implements Runnable {

        /* JADX INFO: renamed from: c */
        private static final String f9504c = "LoadTask";

        /* JADX INFO: renamed from: d */
        private static final int f9505d = 0;

        /* JADX INFO: renamed from: e */
        private static final int f9506e = 1;

        /* JADX INFO: renamed from: f */
        private static final int f9507f = 2;

        /* JADX INFO: renamed from: g */
        private static final int f9508g = 3;

        /* JADX INFO: renamed from: h */
        private static final int f9509h = 4;

        /* JADX INFO: renamed from: a */
        public final int f9510a;

        /* JADX INFO: renamed from: i */
        private final T f9512i;

        /* JADX INFO: renamed from: j */
        private final long f9513j;

        /* JADX INFO: renamed from: k */
        @Nullable
        private a<T> f9514k;

        /* JADX INFO: renamed from: l */
        private IOException f9515l;

        /* JADX INFO: renamed from: m */
        private int f9516m;

        /* JADX INFO: renamed from: n */
        private volatile Thread f9517n;

        /* JADX INFO: renamed from: o */
        private volatile boolean f9518o;

        /* JADX INFO: renamed from: p */
        private volatile boolean f9519p;

        public b(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.f9512i = t;
            this.f9514k = aVar;
            this.f9510a = i;
            this.f9513j = j;
        }

        /* JADX INFO: renamed from: a */
        private void m7916a() {
            this.f9515l = null;
            C1703t.this.f9501e.execute(C1703t.this.f9502f);
        }

        /* JADX INFO: renamed from: b */
        private void m7917b() {
            C1703t.this.f9502f = null;
        }

        /* JADX INFO: renamed from: c */
        private long m7918c() {
            return Math.min((this.f9516m - 1) * 1000, 5000);
        }

        /* JADX INFO: renamed from: a */
        public final void m7919a(int i) throws IOException {
            IOException iOException = this.f9515l;
            if (iOException != null && this.f9516m > i) {
                throw iOException;
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m7920a(long j) {
            C1711a.m8012b(C1703t.this.f9502f == null);
            C1703t.this.f9502f = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m7916a();
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m7921a(boolean z) {
            this.f9519p = z;
            this.f9515l = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f9518o = true;
                this.f9512i.mo7284a();
                if (this.f9517n != null) {
                    this.f9517n.interrupt();
                }
            }
            if (z) {
                m7917b();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f9514k.mo7267a((c) this.f9512i, jElapsedRealtime, jElapsedRealtime - this.f9513j, true);
                this.f9514k = null;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f9519p) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                m7916a();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            m7917b();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f9513j;
            if (this.f9518o) {
                this.f9514k.mo7267a((c) this.f9512i, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                this.f9514k.mo7267a((c) this.f9512i, jElapsedRealtime, j, false);
                return;
            }
            if (i2 == 2) {
                try {
                    this.f9514k.mo7266a(this.f9512i, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    Log.e(f9504c, "Unexpected exception handling load completed", e);
                    C1703t.this.f9503g = new g(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f9515l = iOException;
            int iMo7260a = this.f9514k.mo7260a(this.f9512i, jElapsedRealtime, j, iOException);
            if (iMo7260a == 3) {
                C1703t.this.f9503g = this.f9515l;
            } else if (iMo7260a != 2) {
                this.f9516m = iMo7260a == 1 ? 1 : this.f9516m + 1;
                m7920a(Math.min((r12 - 1) * 1000, 5000));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f9517n = Thread.currentThread();
                if (!this.f9518o) {
                    C1715ad.m8040a("load:" + this.f9512i.getClass().getSimpleName());
                    try {
                        this.f9512i.mo7285b();
                        C1715ad.m8039a();
                    } catch (Throwable th) {
                        C1715ad.m8039a();
                        throw th;
                    }
                }
                if (this.f9519p) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.f9519p) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Exception e2) {
                Log.e(f9504c, "Unexpected exception loading stream", e2);
                if (this.f9519p) {
                    return;
                }
                obtainMessage(3, new g(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                Log.e(f9504c, "OutOfMemory error loading stream", e3);
                if (this.f9519p) {
                    return;
                }
                obtainMessage(3, new g(e3)).sendToTarget();
            } catch (Error e4) {
                Log.e(f9504c, "Unexpected error loading stream", e4);
                if (!this.f9519p) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (InterruptedException unused) {
                C1711a.m8012b(this.f9518o);
                if (this.f9519p) {
                    return;
                }
                sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.t$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo7284a();

        /* JADX INFO: renamed from: b */
        void mo7285b();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.t$d */
    public interface d {
        /* JADX INFO: renamed from: g */
        void mo7339g();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.t$e */
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: a */
        private final d f9520a;

        public e(d dVar) {
            this.f9520a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f9520a.mo7339g();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.t$f */
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.t$g */
    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C1703t(String str) {
        this.f9501e = C1717af.m8071a(str);
    }

    /* JADX INFO: renamed from: d */
    private void m7909d() {
        m7912a((d) null);
    }

    /* JADX INFO: renamed from: a */
    public final <T extends c> long m7910a(T t, a<T> aVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        C1711a.m8012b(looperMyLooper != null);
        this.f9503g = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new b(looperMyLooper, t, aVar, i, jElapsedRealtime).m7920a(0L);
        return jElapsedRealtime;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1704u
    /* JADX INFO: renamed from: a */
    public final void mo7911a(int i) throws IOException {
        IOException iOException = this.f9503g;
        if (iOException != null) {
            throw iOException;
        }
        b<? extends c> bVar = this.f9502f;
        if (bVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = bVar.f9510a;
            }
            bVar.m7919a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7912a(@Nullable d dVar) {
        b<? extends c> bVar = this.f9502f;
        if (bVar != null) {
            bVar.m7921a(true);
        }
        if (dVar != null) {
            this.f9501e.execute(new e(dVar));
        }
        this.f9501e.shutdown();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7913a() {
        return this.f9502f != null;
    }

    /* JADX INFO: renamed from: b */
    public final void m7914b() {
        this.f9502f.m7921a(false);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1704u
    /* JADX INFO: renamed from: c */
    public final void mo7915c() throws IOException {
        mo7911a(Integer.MIN_VALUE);
    }
}
