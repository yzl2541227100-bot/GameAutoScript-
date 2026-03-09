package com.anythink.expressad.exoplayer.p104i;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p101h.C1620ae;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1662d extends AbstractC1660b {

    /* JADX INFO: renamed from: a */
    private final int f9212a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private final Object f9213b;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.d$a */
    public static final class a implements InterfaceC1664f.a {

        /* JADX INFO: renamed from: a */
        private final int f9214a;

        /* JADX INFO: renamed from: b */
        @Nullable
        private final Object f9215b;

        public a() {
            this.f9214a = 0;
            this.f9215b = null;
        }

        private a(int i, @Nullable Object obj) {
            this.f9214a = i;
            this.f9215b = obj;
        }

        /* JADX INFO: renamed from: b */
        private C1662d m7668b(C1620ae c1620ae, int... iArr) {
            C1711a.m8010a(iArr.length == 1);
            return new C1662d(c1620ae, iArr[0], this.f9214a, this.f9215b);
        }

        @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f.a
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1664f mo7576a(C1620ae c1620ae, int[] iArr) {
            C1711a.m8010a(iArr.length == 1);
            return new C1662d(c1620ae, iArr[0], this.f9214a, this.f9215b);
        }
    }

    public C1662d(C1620ae c1620ae, int i) {
        this(c1620ae, i, 0, null);
    }

    public C1662d(C1620ae c1620ae, int i, int i2, @Nullable Object obj) {
        super(c1620ae, i);
        this.f9212a = i2;
        this.f9213b = obj;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: a */
    public final void mo7571a(long j, long j2) {
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: b */
    public final int mo7572b() {
        return 0;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    /* JADX INFO: renamed from: c */
    public final int mo7573c() {
        return this.f9212a;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.InterfaceC1664f
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object mo7574d() {
        return this.f9213b;
    }
}
