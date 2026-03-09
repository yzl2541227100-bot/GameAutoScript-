package com.anythink.expressad.exoplayer.p094e;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.m */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1574m {

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f8390a;

        /* JADX INFO: renamed from: b */
        public final byte[] f8391b;

        /* JADX INFO: renamed from: c */
        public final int f8392c;

        /* JADX INFO: renamed from: d */
        public final int f8393d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.f8390a = i;
            this.f8391b = bArr;
            this.f8392c = i2;
            this.f8393d = i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f8390a == aVar.f8390a && this.f8392c == aVar.f8392c && this.f8393d == aVar.f8393d && Arrays.equals(this.f8391b, aVar.f8391b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.f8390a * 31) + Arrays.hashCode(this.f8391b)) * 31) + this.f8392c) * 31) + this.f8393d;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo6981a(InterfaceC1567f interfaceC1567f, int i, boolean z);

    /* JADX INFO: renamed from: a */
    void mo6982a(long j, int i, int i2, int i3, a aVar);

    /* JADX INFO: renamed from: a */
    void mo6983a(C1736s c1736s, int i);

    /* JADX INFO: renamed from: a */
    void mo6984a(C1753m c1753m);
}
