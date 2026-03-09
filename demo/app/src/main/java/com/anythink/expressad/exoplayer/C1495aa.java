package com.anythink.expressad.exoplayer;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1495aa {

    /* JADX INFO: renamed from: a */
    public static final C1495aa f7326a = new C1495aa(0);

    /* JADX INFO: renamed from: b */
    public final int f7327b;

    public C1495aa(int i) {
        this.f7327b = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1495aa.class == obj.getClass() && this.f7327b == ((C1495aa) obj).f7327b;
    }

    public final int hashCode() {
        return this.f7327b;
    }
}
