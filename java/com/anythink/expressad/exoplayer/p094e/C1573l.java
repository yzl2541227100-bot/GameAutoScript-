package com.anythink.expressad.exoplayer.p094e;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1573l {

    /* JADX INFO: renamed from: a */
    public static final C1573l f8387a = new C1573l(0, 0);

    /* JADX INFO: renamed from: b */
    public final long f8388b;

    /* JADX INFO: renamed from: c */
    public final long f8389c;

    public C1573l(long j, long j2) {
        this.f8388b = j;
        this.f8389c = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1573l.class == obj.getClass()) {
            C1573l c1573l = (C1573l) obj;
            if (this.f8388b == c1573l.f8388b && this.f8389c == c1573l.f8389c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f8388b) * 31) + ((int) this.f8389c);
    }

    public final String toString() {
        return "[timeUs=" + this.f8388b + ", position=" + this.f8389c + "]";
    }
}
