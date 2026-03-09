package com.anythink.expressad.exoplayer.p101h;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1648q extends AbstractC1637f<Void> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1650s f9005a;

    /* JADX INFO: renamed from: b */
    private final int f9006b;

    /* JADX INFO: renamed from: c */
    private int f9007c;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.q$a */
    public static final class a extends AbstractC1647p {
        public a(AbstractC1499ae abstractC1499ae) {
            super(abstractC1499ae);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1647p, com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: a */
        public final int mo6356a(int i, int i2, boolean z) {
            int iMo6356a = this.f9004b.mo6356a(i, i2, z);
            return iMo6356a == -1 ? mo6368b(z) : iMo6356a;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1647p, com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: b */
        public final int mo6367b(int i, int i2, boolean z) {
            int iMo6367b = this.f9004b.mo6367b(i, i2, z);
            return iMo6367b == -1 ? mo6359a(z) : iMo6367b;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.q$b */
    public static final class b extends AbstractC1611a {

        /* JADX INFO: renamed from: b */
        private final AbstractC1499ae f9008b;

        /* JADX INFO: renamed from: c */
        private final int f9009c;

        /* JADX INFO: renamed from: d */
        private final int f9010d;

        /* JADX INFO: renamed from: e */
        private final int f9011e;

        public b(AbstractC1499ae abstractC1499ae, int i) {
            super(false, new InterfaceC1616aa.b(i));
            this.f9008b = abstractC1499ae;
            int iMo6370c = abstractC1499ae.mo6370c();
            this.f9009c = iMo6370c;
            this.f9010d = abstractC1499ae.mo6366b();
            this.f9011e = i;
            if (iMo6370c > 0) {
                C1711a.m8013b(i <= Integer.MAX_VALUE / iMo6370c, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: a */
        public final int mo7176a(int i) {
            return i / this.f9009c;
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: b */
        public final int mo6366b() {
            return this.f9010d * this.f9011e;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: b */
        public final int mo7177b(int i) {
            return i / this.f9010d;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: b */
        public final int mo7178b(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
        /* JADX INFO: renamed from: c */
        public final int mo6370c() {
            return this.f9009c * this.f9011e;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: c */
        public final AbstractC1499ae mo7179c(int i) {
            return this.f9008b;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: d */
        public final int mo7180d(int i) {
            return i * this.f9009c;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: e */
        public final int mo7181e(int i) {
            return i * this.f9010d;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1611a
        /* JADX INFO: renamed from: f */
        public final Object mo7182f(int i) {
            return Integer.valueOf(i);
        }
    }

    private C1648q(InterfaceC1650s interfaceC1650s) {
        this(interfaceC1650s, (byte) 0);
    }

    private C1648q(InterfaceC1650s interfaceC1650s, byte b2) {
        C1711a.m8010a(true);
        this.f9005a = interfaceC1650s;
        this.f9006b = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: b */
    private void m7462b(AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
        this.f9007c = abstractC1499ae.mo6370c();
        m7355a(this.f9006b != Integer.MAX_VALUE ? new b(abstractC1499ae, this.f9006b) : new a(abstractC1499ae), obj);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r mo7225a(InterfaceC1650s.a aVar, InterfaceC1685b interfaceC1685b) {
        InterfaceC1650s interfaceC1650s;
        if (this.f9006b != Integer.MAX_VALUE) {
            interfaceC1650s = this.f9005a;
            aVar = aVar.m7463a(aVar.f9012a % this.f9007c);
        } else {
            interfaceC1650s = this.f9005a;
        }
        return interfaceC1650s.mo7225a(aVar, interfaceC1685b);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7227a() {
        super.mo7227a();
        this.f9007c = 0;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7228a(InterfaceC1649r interfaceC1649r) {
        this.f9005a.mo7228a(interfaceC1649r);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7229a(InterfaceC1610h interfaceC1610h, boolean z) {
        super.mo7229a(interfaceC1610h, z);
        m7374a((Object) null, this.f9005a);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7230a(Void r1, InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
        this.f9007c = abstractC1499ae.mo6370c();
        m7355a(this.f9006b != Integer.MAX_VALUE ? new b(abstractC1499ae, this.f9006b) : new a(abstractC1499ae), obj);
    }
}
