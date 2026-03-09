package com.anythink.expressad.exoplayer.p091b;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1575f;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1509i {

    /* JADX INFO: renamed from: a */
    private static final int f7569a = 0;

    /* JADX INFO: renamed from: b */
    private static final int f7570b = 1;

    /* JADX INFO: renamed from: c */
    private static final int f7571c = 2;

    /* JADX INFO: renamed from: d */
    private static final int f7572d = 3;

    /* JADX INFO: renamed from: e */
    private static final int f7573e = 4;

    /* JADX INFO: renamed from: f */
    private static final int f7574f = 5000;

    /* JADX INFO: renamed from: g */
    private static final int f7575g = 10000000;

    /* JADX INFO: renamed from: h */
    private static final int f7576h = 500000;

    /* JADX INFO: renamed from: i */
    private static final int f7577i = 500000;

    /* JADX INFO: renamed from: j */
    @Nullable
    private final a f7578j;

    /* JADX INFO: renamed from: k */
    private int f7579k;

    /* JADX INFO: renamed from: l */
    private long f7580l;

    /* JADX INFO: renamed from: m */
    private long f7581m;

    /* JADX INFO: renamed from: n */
    private long f7582n;

    /* JADX INFO: renamed from: o */
    private long f7583o;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.i$a */
    @TargetApi(19)
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final AudioTrack f7584a;

        /* JADX INFO: renamed from: b */
        private final AudioTimestamp f7585b = new AudioTimestamp();

        /* JADX INFO: renamed from: c */
        private long f7586c;

        /* JADX INFO: renamed from: d */
        private long f7587d;

        /* JADX INFO: renamed from: e */
        private long f7588e;

        public a(AudioTrack audioTrack) {
            this.f7584a = audioTrack;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6471a() {
            boolean timestamp = this.f7584a.getTimestamp(this.f7585b);
            if (timestamp) {
                long j = this.f7585b.framePosition;
                if (this.f7587d > j) {
                    this.f7586c++;
                }
                this.f7587d = j;
                this.f7588e = j + (this.f7586c << 32);
            }
            return timestamp;
        }

        /* JADX INFO: renamed from: b */
        public final long m6472b() {
            return this.f7585b.nanoTime / 1000;
        }

        /* JADX INFO: renamed from: c */
        public final long m6473c() {
            return this.f7588e;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.i$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public C1509i(AudioTrack audioTrack) {
        if (C1717af.f9627a >= 19) {
            this.f7578j = new a(audioTrack);
            m6468e();
        } else {
            this.f7578j = null;
            m6462a(3);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6462a(int i) {
        this.f7579k = i;
        long j = C1575f.f8394a;
        if (i == 0) {
            this.f7582n = 0L;
            this.f7583o = -1L;
            this.f7580l = System.nanoTime() / 1000;
        } else if (i == 1) {
            this.f7581m = C1575f.f8394a;
            return;
        } else if (i == 2 || i == 3) {
            j = 10000000;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            j = 500000;
        }
        this.f7581m = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m6463a() {
        m6462a(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6464a(long r8) {
        /*
            r7 = this;
            com.anythink.expressad.exoplayer.b.i$a r0 = r7.f7578j
            r1 = 0
            if (r0 == 0) goto L71
            long r2 = r7.f7582n
            long r2 = r8 - r2
            long r4 = r7.f7581m
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L10
            goto L71
        L10:
            r7.f7582n = r8
            boolean r0 = r0.m6471a()
            int r2 = r7.f7579k
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L49
            r8 = 2
            if (r2 == r4) goto L33
            if (r2 == r8) goto L30
            if (r2 == r3) goto L2d
            r8 = 4
            if (r2 != r8) goto L27
            goto L70
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L2d:
            if (r0 == 0) goto L70
            goto L45
        L30:
            if (r0 != 0) goto L70
            goto L45
        L33:
            if (r0 == 0) goto L45
            com.anythink.expressad.exoplayer.b.i$a r9 = r7.f7578j
            long r1 = r9.m6473c()
            long r3 = r7.f7583o
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L70
            r7.m6462a(r8)
            goto L70
        L45:
            r7.m6468e()
            goto L70
        L49:
            if (r0 == 0) goto L63
            com.anythink.expressad.exoplayer.b.i$a r8 = r7.f7578j
            long r8 = r8.m6472b()
            long r2 = r7.f7580l
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L71
            com.anythink.expressad.exoplayer.b.i$a r8 = r7.f7578j
            long r8 = r8.m6473c()
            r7.f7583o = r8
            r7.m6462a(r4)
            goto L70
        L63:
            long r1 = r7.f7580l
            long r8 = r8 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L70
            r7.m6462a(r3)
        L70:
            r1 = r0
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p091b.C1509i.m6464a(long):boolean");
    }

    /* JADX INFO: renamed from: b */
    public final void m6465b() {
        if (this.f7579k == 4) {
            m6468e();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6466c() {
        int i = this.f7579k;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6467d() {
        return this.f7579k == 2;
    }

    /* JADX INFO: renamed from: e */
    public final void m6468e() {
        if (this.f7578j != null) {
            m6462a(0);
        }
    }

    /* JADX INFO: renamed from: f */
    public final long m6469f() {
        a aVar = this.f7578j;
        return aVar != null ? aVar.m6472b() : C1500b.f7455b;
    }

    /* JADX INFO: renamed from: g */
    public final long m6470g() {
        a aVar = this.f7578j;
        if (aVar != null) {
            return aVar.m6473c();
        }
        return -1L;
    }
}
