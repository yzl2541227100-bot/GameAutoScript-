package com.anythink.expressad.exoplayer.p104i;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p101h.C1620ae;
import com.anythink.expressad.exoplayer.p101h.p103b.AbstractC1632i;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1660b implements InterfaceC1664f {

    /* JADX INFO: renamed from: a */
    private final C1753m[] f9151a;

    /* JADX INFO: renamed from: b */
    private final long[] f9152b;

    /* JADX INFO: renamed from: c */
    private int f9153c;

    /* JADX INFO: renamed from: g */
    public final C1620ae f9154g;

    /* JADX INFO: renamed from: h */
    public final int f9155h;

    /* JADX INFO: renamed from: i */
    public final int[] f9156i;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.b$a */
    public static final class a implements Comparator<C1753m> {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private static int m7588a(C1753m c1753m, C1753m c1753m2) {
            return c1753m2.f9967d - c1753m.f9967d;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C1753m c1753m, C1753m c1753m2) {
            return c1753m2.f9967d - c1753m.f9967d;
        }
    }

    public AbstractC1660b(C1620ae c1620ae, int... iArr) {
        int i = 0;
        byte b = 0;
        C1711a.m8012b(iArr.length > 0);
        this.f9154g = (C1620ae) C1711a.m8005a(c1620ae);
        int length = iArr.length;
        this.f9155h = length;
        this.f9151a = new C1753m[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f9151a[i2] = c1620ae.m7294a(iArr[i2]);
        }
        Arrays.sort(this.f9151a, new a(b == true ? 1 : 0));
        this.f9156i = new int[this.f9155h];
        while (true) {
            int i3 = this.f9155h;
            if (i >= i3) {
                this.f9152b = new long[i3];
                return;
            } else {
                this.f9156i[i] = c1620ae.m7293a(this.f9151a[i]);
                i++;
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    public int mo7568a(long j, List<? extends AbstractC1632i> list) {
        return list.size();
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    public final int mo7577a(C1753m c1753m) {
        for (int i = 0; i < this.f9155h; i++) {
            if (this.f9151a[i] == c1753m) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    public final C1753m mo7578a(int i) {
        return this.f9151a[i];
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    public void mo7569a() {
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    public void mo7570a(float f) {
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    public final boolean mo7579a(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zM7581b = m7581b(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f9155h && !zM7581b) {
            zM7581b = (i2 == i || m7581b(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zM7581b) {
            return false;
        }
        long[] jArr = this.f9152b;
        jArr[i] = Math.max(jArr[i], jElapsedRealtime + j);
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: b */
    public final int mo7580b(int i) {
        return this.f9156i[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7581b(int i, long j) {
        return this.f9152b[i] > j;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: c */
    public final int mo7582c(int i) {
        for (int i2 = 0; i2 < this.f9155h; i2++) {
            if (this.f9156i[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: e */
    public final void mo7583e() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC1660b abstractC1660b = (AbstractC1660b) obj;
            if (this.f9154g == abstractC1660b.f9154g && Arrays.equals(this.f9156i, abstractC1660b.f9156i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: f */
    public final C1620ae mo7584f() {
        return this.f9154g;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: g */
    public final int mo7585g() {
        return this.f9156i.length;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: h */
    public final C1753m mo7586h() {
        return this.f9151a[mo7572b()];
    }

    public int hashCode() {
        if (this.f9153c == 0) {
            this.f9153c = (System.identityHashCode(this.f9154g) * 31) + Arrays.hashCode(this.f9156i);
        }
        return this.f9153c;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: i */
    public final int mo7587i() {
        return this.f9156i[mo7572b()];
    }
}
