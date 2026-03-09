package com.anythink.expressad.exoplayer.p104i;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1665g {

    /* JADX INFO: renamed from: a */
    public final int f9228a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1664f[] f9229b;

    /* JADX INFO: renamed from: c */
    private int f9230c;

    public C1665g(InterfaceC1664f... interfaceC1664fArr) {
        this.f9229b = interfaceC1664fArr;
        this.f9228a = interfaceC1664fArr.length;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InterfaceC1664f m7687a(int i) {
        return this.f9229b[i];
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1664f[] m7688a() {
        return (InterfaceC1664f[]) this.f9229b.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1665g.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9229b, ((C1665g) obj).f9229b);
    }

    public final int hashCode() {
        if (this.f9230c == 0) {
            this.f9230c = Arrays.hashCode(this.f9229b) + 527;
        }
        return this.f9230c;
    }
}
