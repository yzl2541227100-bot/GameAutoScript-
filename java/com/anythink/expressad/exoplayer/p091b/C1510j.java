package com.anythink.expressad.exoplayer.p091b;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import javax.mail.UIDFolder;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1510j {

    /* JADX INFO: renamed from: a */
    private static final int f7589a = 1;

    /* JADX INFO: renamed from: b */
    private static final int f7590b = 2;

    /* JADX INFO: renamed from: c */
    private static final int f7591c = 3;

    /* JADX INFO: renamed from: d */
    private static final long f7592d = 5000000;

    /* JADX INFO: renamed from: e */
    private static final long f7593e = 5000000;

    /* JADX INFO: renamed from: f */
    private static final long f7594f = 200;

    /* JADX INFO: renamed from: g */
    private static final int f7595g = 10;

    /* JADX INFO: renamed from: h */
    private static final int f7596h = 30000;

    /* JADX INFO: renamed from: i */
    private static final int f7597i = 500000;

    /* JADX INFO: renamed from: A */
    private long f7598A;

    /* JADX INFO: renamed from: B */
    private long f7599B;

    /* JADX INFO: renamed from: C */
    private int f7600C;

    /* JADX INFO: renamed from: D */
    private int f7601D;

    /* JADX INFO: renamed from: E */
    private long f7602E;

    /* JADX INFO: renamed from: F */
    private long f7603F;

    /* JADX INFO: renamed from: G */
    private long f7604G;

    /* JADX INFO: renamed from: H */
    private long f7605H;

    /* JADX INFO: renamed from: j */
    private final a f7606j;

    /* JADX INFO: renamed from: k */
    private final long[] f7607k;

    /* JADX INFO: renamed from: l */
    private AudioTrack f7608l;

    /* JADX INFO: renamed from: m */
    private int f7609m;

    /* JADX INFO: renamed from: n */
    private int f7610n;

    /* JADX INFO: renamed from: o */
    private C1509i f7611o;

    /* JADX INFO: renamed from: p */
    private int f7612p;

    /* JADX INFO: renamed from: q */
    private boolean f7613q;

    /* JADX INFO: renamed from: r */
    private long f7614r;

    /* JADX INFO: renamed from: s */
    private long f7615s;

    /* JADX INFO: renamed from: t */
    private long f7616t;

    /* JADX INFO: renamed from: u */
    private Method f7617u;

    /* JADX INFO: renamed from: v */
    private long f7618v;

    /* JADX INFO: renamed from: w */
    private boolean f7619w;

    /* JADX INFO: renamed from: x */
    private boolean f7620x;

    /* JADX INFO: renamed from: y */
    private long f7621y;

    /* JADX INFO: renamed from: z */
    private long f7622z;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.j$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo6494a(int i, long j);

        /* JADX INFO: renamed from: a */
        void mo6495a(long j);

        /* JADX INFO: renamed from: a */
        void mo6496a(long j, long j2, long j3, long j4);

        /* JADX INFO: renamed from: b */
        void mo6497b(long j, long j2, long j3, long j4);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.j$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public C1510j(a aVar) {
        this.f7606j = (a) C1711a.m8005a(aVar);
        if (C1717af.f9627a >= 18) {
            try {
                this.f7617u = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7607k = new long[10];
    }

    /* JADX INFO: renamed from: a */
    private void m6474a(long j, long j2) {
        if (this.f7611o.m6464a(j)) {
            long jM6469f = this.f7611o.m6469f();
            long jM6470g = this.f7611o.m6470g();
            if (Math.abs(jM6469f - j) > 5000000) {
                this.f7606j.mo6497b(jM6470g, jM6469f, j, j2);
                this.f7611o.m6463a();
            } else if (Math.abs(m6479g(jM6470g) - j2) <= 5000000) {
                this.f7611o.m6465b();
            } else {
                this.f7606j.mo6496a(jM6470g, jM6469f, j, j2);
                this.f7611o.m6463a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6475a(int i) {
        if (C1717af.f9627a < 23) {
            return i == 5 || i == 6;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private void m6476e() {
        long jM6481h = m6481h();
        if (jM6481h == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f7616t >= 30000) {
            long[] jArr = this.f7607k;
            int i = this.f7600C;
            jArr[i] = jM6481h - jNanoTime;
            this.f7600C = (i + 1) % 10;
            int i2 = this.f7601D;
            if (i2 < 10) {
                this.f7601D = i2 + 1;
            }
            this.f7616t = jNanoTime;
            this.f7615s = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.f7601D;
                if (i3 >= i4) {
                    break;
                }
                this.f7615s += this.f7607k[i3] / ((long) i4);
                i3++;
            }
        }
        if (this.f7613q) {
            return;
        }
        if (this.f7611o.m6464a(jNanoTime)) {
            long jM6469f = this.f7611o.m6469f();
            long jM6470g = this.f7611o.m6470g();
            if (Math.abs(jM6469f - jNanoTime) > 5000000) {
                this.f7606j.mo6497b(jM6470g, jM6469f, jNanoTime, jM6481h);
            } else if (Math.abs(m6479g(jM6470g) - jM6481h) > 5000000) {
                this.f7606j.mo6496a(jM6470g, jM6469f, jNanoTime, jM6481h);
            } else {
                this.f7611o.m6465b();
            }
            this.f7611o.m6463a();
        }
        m6478f(jNanoTime);
    }

    /* JADX INFO: renamed from: f */
    private void m6477f() {
        this.f7615s = 0L;
        this.f7601D = 0;
        this.f7600C = 0;
        this.f7616t = 0L;
    }

    /* JADX INFO: renamed from: f */
    private void m6478f(long j) {
        Method method;
        if (!this.f7620x || (method = this.f7617u) == null || j - this.f7621y < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) method.invoke(this.f7608l, null)).intValue()) * 1000) - this.f7614r;
            this.f7618v = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f7618v = jMax;
            if (jMax > 5000000) {
                this.f7606j.mo6495a(jMax);
                this.f7618v = 0L;
            }
        } catch (Exception unused) {
            this.f7617u = null;
        }
        this.f7621y = j;
    }

    /* JADX INFO: renamed from: g */
    private long m6479g(long j) {
        return (j * 1000000) / ((long) this.f7612p);
    }

    /* JADX INFO: renamed from: g */
    private boolean m6480g() {
        return this.f7613q && this.f7608l.getPlayState() == 2 && m6482i() == 0;
    }

    /* JADX INFO: renamed from: h */
    private long m6481h() {
        return m6479g(m6482i());
    }

    /* JADX INFO: renamed from: i */
    private long m6482i() {
        if (this.f7602E != C1500b.f7455b) {
            return Math.min(this.f7605H, this.f7604G + ((((SystemClock.elapsedRealtime() * 1000) - this.f7602E) * ((long) this.f7612p)) / 1000000));
        }
        int playState = this.f7608l.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = UIDFolder.MAXUID & ((long) this.f7608l.getPlaybackHeadPosition());
        if (this.f7613q) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f7599B = this.f7622z;
            }
            playbackHeadPosition += this.f7599B;
        }
        if (C1717af.f9627a <= 28) {
            if (playbackHeadPosition == 0 && this.f7622z > 0 && playState == 3) {
                if (this.f7603F == C1500b.f7455b) {
                    this.f7603F = SystemClock.elapsedRealtime();
                }
                return this.f7622z;
            }
            this.f7603F = C1500b.f7455b;
        }
        if (this.f7622z > playbackHeadPosition) {
            this.f7598A++;
        }
        this.f7622z = playbackHeadPosition;
        return playbackHeadPosition + (this.f7598A << 32);
    }

    /* JADX INFO: renamed from: a */
    public final long m6483a(boolean z) {
        if (this.f7608l.getPlayState() == 3) {
            long jM6481h = m6481h();
            if (jM6481h != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f7616t >= 30000) {
                    long[] jArr = this.f7607k;
                    int i = this.f7600C;
                    jArr[i] = jM6481h - jNanoTime;
                    this.f7600C = (i + 1) % 10;
                    int i2 = this.f7601D;
                    if (i2 < 10) {
                        this.f7601D = i2 + 1;
                    }
                    this.f7616t = jNanoTime;
                    this.f7615s = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f7601D;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f7615s += this.f7607k[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!this.f7613q) {
                    if (this.f7611o.m6464a(jNanoTime)) {
                        long jM6469f = this.f7611o.m6469f();
                        long jM6470g = this.f7611o.m6470g();
                        if (Math.abs(jM6469f - jNanoTime) > 5000000) {
                            this.f7606j.mo6497b(jM6470g, jM6469f, jNanoTime, jM6481h);
                        } else if (Math.abs(m6479g(jM6470g) - jM6481h) > 5000000) {
                            this.f7606j.mo6496a(jM6470g, jM6469f, jNanoTime, jM6481h);
                        } else {
                            this.f7611o.m6465b();
                        }
                        this.f7611o.m6463a();
                    }
                    m6478f(jNanoTime);
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        if (this.f7611o.m6466c()) {
            long jM6479g = m6479g(this.f7611o.m6470g());
            return !this.f7611o.m6467d() ? jM6479g : jM6479g + (jNanoTime2 - this.f7611o.m6469f());
        }
        long jM6481h2 = this.f7601D == 0 ? m6481h() : this.f7615s + jNanoTime2;
        return !z ? jM6481h2 - this.f7618v : jM6481h2;
    }

    /* JADX INFO: renamed from: a */
    public final void m6484a() {
        this.f7611o.m6468e();
    }

    /* JADX INFO: renamed from: a */
    public final void m6485a(AudioTrack audioTrack, int i, int i2, int i3) {
        this.f7608l = audioTrack;
        this.f7609m = i2;
        this.f7610n = i3;
        this.f7611o = new C1509i(audioTrack);
        this.f7612p = audioTrack.getSampleRate();
        this.f7613q = C1717af.f9627a < 23 && (i == 5 || i == 6);
        boolean zM8101b = C1717af.m8101b(i);
        this.f7620x = zM8101b;
        this.f7614r = zM8101b ? m6479g(i3 / i2) : -9223372036854775807L;
        this.f7622z = 0L;
        this.f7598A = 0L;
        this.f7599B = 0L;
        this.f7619w = false;
        this.f7602E = C1500b.f7455b;
        this.f7603F = C1500b.f7455b;
        this.f7618v = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6486a(long j) {
        a aVar;
        int playState = this.f7608l.getPlayState();
        if (this.f7613q) {
            if (playState == 2) {
                this.f7619w = false;
                return false;
            }
            if (playState == 1 && m6482i() == 0) {
                return false;
            }
        }
        boolean z = this.f7619w;
        boolean zM6493e = m6493e(j);
        this.f7619w = zM6493e;
        if (z && !zM6493e && playState != 1 && (aVar = this.f7606j) != null) {
            aVar.mo6494a(this.f7610n, C1500b.m6396a(this.f7614r));
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m6487b(long j) {
        return this.f7610n - ((int) (j - (m6482i() * ((long) this.f7609m))));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6488b() {
        return this.f7608l.getPlayState() == 3;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6489c() {
        m6477f();
        if (this.f7602E != C1500b.f7455b) {
            return false;
        }
        this.f7611o.m6468e();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6490c(long j) {
        return this.f7603F != C1500b.f7455b && j > 0 && SystemClock.elapsedRealtime() - this.f7603F >= f7594f;
    }

    /* JADX INFO: renamed from: d */
    public final void m6491d() {
        m6477f();
        this.f7608l = null;
        this.f7611o = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m6492d(long j) {
        this.f7604G = m6482i();
        this.f7602E = SystemClock.elapsedRealtime() * 1000;
        this.f7605H = j;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6493e(long j) {
        return j > m6482i() || m6480g();
    }
}
