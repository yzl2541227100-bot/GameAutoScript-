package com.p188b.p199b;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: com.b.b.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2594u {

    /* JADX INFO: renamed from: a */
    public static C2593t f15856a;

    /* JADX INFO: renamed from: b */
    public static long f15857b;

    private C2594u() {
    }

    /* JADX INFO: renamed from: a */
    public static C2593t m13081a() {
        synchronized (C2594u.class) {
            C2593t c2593t = f15856a;
            if (c2593t == null) {
                return new C2593t();
            }
            f15856a = c2593t.f15854f;
            c2593t.f15854f = null;
            f15857b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return c2593t;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13082a(C2593t c2593t) {
        if (c2593t.f15854f != null || c2593t.f15855g != null) {
            throw new IllegalArgumentException();
        }
        if (c2593t.f15852d) {
            return;
        }
        synchronized (C2594u.class) {
            long j = f15857b;
            if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI > 65536) {
                return;
            }
            f15857b = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            c2593t.f15854f = f15856a;
            c2593t.f15851c = 0;
            c2593t.f15850b = 0;
            f15856a = c2593t;
        }
    }
}
