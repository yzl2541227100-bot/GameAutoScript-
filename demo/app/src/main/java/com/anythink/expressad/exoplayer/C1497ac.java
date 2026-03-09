package com.anythink.expressad.exoplayer;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C1497ac {

    /* JADX INFO: renamed from: a */
    public static final C1497ac f7328a;

    /* JADX INFO: renamed from: b */
    public static final C1497ac f7329b;

    /* JADX INFO: renamed from: c */
    public static final C1497ac f7330c;

    /* JADX INFO: renamed from: d */
    public static final C1497ac f7331d;

    /* JADX INFO: renamed from: e */
    public static final C1497ac f7332e;

    /* JADX INFO: renamed from: f */
    public final long f7333f;

    /* JADX INFO: renamed from: g */
    public final long f7334g;

    static {
        C1497ac c1497ac = new C1497ac(0L, 0L);
        f7328a = c1497ac;
        f7329b = new C1497ac(Long.MAX_VALUE, Long.MAX_VALUE);
        f7330c = new C1497ac(Long.MAX_VALUE, 0L);
        f7331d = new C1497ac(0L, Long.MAX_VALUE);
        f7332e = c1497ac;
    }

    public C1497ac(long j, long j2) {
        C1711a.m8010a(j >= 0);
        C1711a.m8010a(j2 >= 0);
        this.f7333f = j;
        this.f7334g = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1497ac.class == obj.getClass()) {
            C1497ac c1497ac = (C1497ac) obj;
            if (this.f7333f == c1497ac.f7333f && this.f7334g == c1497ac.f7334g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7333f) * 31) + ((int) this.f7334g);
    }
}
