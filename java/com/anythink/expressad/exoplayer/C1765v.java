package com.anythink.expressad.exoplayer;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1765v {

    /* JADX INFO: renamed from: a */
    public static final C1765v f10069a = new C1765v(1.0f);

    /* JADX INFO: renamed from: b */
    public final float f10070b;

    /* JADX INFO: renamed from: c */
    public final float f10071c;

    /* JADX INFO: renamed from: d */
    public final boolean f10072d;

    /* JADX INFO: renamed from: e */
    private final int f10073e;

    public C1765v(float f) {
        this(f, 1.0f, false);
    }

    public C1765v(float f, float f2) {
        this(f, f2, false);
    }

    public C1765v(float f, float f2, boolean z) {
        C1711a.m8010a(f > 0.0f);
        C1711a.m8010a(f2 > 0.0f);
        this.f10070b = f;
        this.f10071c = f2;
        this.f10072d = z;
        this.f10073e = Math.round(f * 1000.0f);
    }

    /* JADX INFO: renamed from: a */
    public final long m8506a(long j) {
        return j * ((long) this.f10073e);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1765v.class == obj.getClass()) {
            C1765v c1765v = (C1765v) obj;
            if (this.f10070b == c1765v.f10070b && this.f10071c == c1765v.f10071c && this.f10072d == c1765v.f10072d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Float.floatToRawIntBits(this.f10070b) + 527) * 31) + Float.floatToRawIntBits(this.f10071c)) * 31) + (this.f10072d ? 1 : 0);
    }
}
