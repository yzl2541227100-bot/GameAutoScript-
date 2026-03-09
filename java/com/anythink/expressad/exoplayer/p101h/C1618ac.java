package com.anythink.expressad.exoplayer.p101h;

import com.anythink.expressad.exoplayer.C1497ac;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1754n;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1649r;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1651t;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.C1703t;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C1618ac implements InterfaceC1649r, C1703t.a<b> {

    /* JADX INFO: renamed from: i */
    private static final int f8708i = 1024;

    /* JADX INFO: renamed from: b */
    public final C1753m f8710b;

    /* JADX INFO: renamed from: c */
    public final boolean f8711c;

    /* JADX INFO: renamed from: d */
    public boolean f8712d;

    /* JADX INFO: renamed from: e */
    public boolean f8713e;

    /* JADX INFO: renamed from: f */
    public boolean f8714f;

    /* JADX INFO: renamed from: g */
    public byte[] f8715g;

    /* JADX INFO: renamed from: h */
    public int f8716h;

    /* JADX INFO: renamed from: j */
    private final C1694k f8717j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC1691h.a f8718k;

    /* JADX INFO: renamed from: l */
    private final int f8719l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC1651t.a f8720m;

    /* JADX INFO: renamed from: n */
    private final C1621af f8721n;

    /* JADX INFO: renamed from: p */
    private final long f8723p;

    /* JADX INFO: renamed from: q */
    private int f8724q;

    /* JADX INFO: renamed from: o */
    private final ArrayList<a> f8722o = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final C1703t f8709a = new C1703t("Loader:SingleSampleMediaPeriod");

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.ac$a */
    public final class a implements InterfaceC1656y {

        /* JADX INFO: renamed from: b */
        private static final int f8725b = 0;

        /* JADX INFO: renamed from: c */
        private static final int f8726c = 1;

        /* JADX INFO: renamed from: d */
        private static final int f8727d = 2;

        /* JADX INFO: renamed from: e */
        private int f8729e;

        /* JADX INFO: renamed from: f */
        private boolean f8730f;

        private a() {
        }

        public /* synthetic */ a(C1618ac c1618ac, byte b) {
            this();
        }

        /* JADX INFO: renamed from: d */
        private void m7276d() {
            if (this.f8730f) {
                return;
            }
            C1618ac.this.f8720m.m7473a(C1732o.m8205d(C1618ac.this.f8710b.f9971h), C1618ac.this.f8710b, 0, (Object) null, 0L);
            this.f8730f = true;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: a */
        public final int mo7277a(long j) {
            if (j <= 0 || this.f8729e == 2) {
                return 0;
            }
            this.f8729e = 2;
            m7276d();
            return 1;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: a */
        public final int mo7278a(C1754n c1754n, C1527e c1527e, boolean z) {
            int i = this.f8729e;
            if (i == 2) {
                c1527e.m6639b(4);
                return -4;
            }
            if (z || i == 0) {
                c1754n.f9990a = C1618ac.this.f8710b;
                this.f8729e = 1;
                return -5;
            }
            C1618ac c1618ac = C1618ac.this;
            if (!c1618ac.f8713e) {
                return -3;
            }
            if (c1618ac.f8714f) {
                c1527e.f7880f = 0L;
                c1527e.m6639b(1);
                c1527e.m6660d(C1618ac.this.f8716h);
                ByteBuffer byteBuffer = c1527e.f7879e;
                C1618ac c1618ac2 = C1618ac.this;
                byteBuffer.put(c1618ac2.f8715g, 0, c1618ac2.f8716h);
                m7276d();
            } else {
                c1527e.m6639b(4);
            }
            this.f8729e = 2;
            return -4;
        }

        /* JADX INFO: renamed from: a */
        public final void m7279a() {
            if (this.f8729e == 2) {
                this.f8729e = 1;
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: b */
        public final boolean mo7280b() {
            return C1618ac.this.f8713e;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1656y
        /* JADX INFO: renamed from: c */
        public final void mo7281c() throws IOException {
            C1618ac c1618ac = C1618ac.this;
            if (c1618ac.f8711c) {
                return;
            }
            c1618ac.f8709a.mo7915c();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.ac$b */
    public static final class b implements C1703t.c {

        /* JADX INFO: renamed from: a */
        public final C1694k f8731a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC1691h f8732b;

        /* JADX INFO: renamed from: c */
        private int f8733c;

        /* JADX INFO: renamed from: d */
        private byte[] f8734d;

        public b(C1694k c1694k, InterfaceC1691h interfaceC1691h) {
            this.f8731a = c1694k;
            this.f8732b = interfaceC1691h;
        }

        @Override // com.anythink.expressad.exoplayer.p105j.C1703t.c
        /* JADX INFO: renamed from: a */
        public final void mo7284a() {
        }

        @Override // com.anythink.expressad.exoplayer.p105j.C1703t.c
        /* JADX INFO: renamed from: b */
        public final void mo7285b() {
            int iMo7741a = 0;
            this.f8733c = 0;
            try {
                this.f8732b.mo7742a(this.f8731a);
                while (iMo7741a != -1) {
                    int i = this.f8733c + iMo7741a;
                    this.f8733c = i;
                    byte[] bArr = this.f8734d;
                    if (bArr == null) {
                        this.f8734d = new byte[1024];
                    } else if (i == bArr.length) {
                        this.f8734d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    InterfaceC1691h interfaceC1691h = this.f8732b;
                    byte[] bArr2 = this.f8734d;
                    int i2 = this.f8733c;
                    iMo7741a = interfaceC1691h.mo7741a(bArr2, i2, bArr2.length - i2);
                }
            } finally {
                C1717af.m8074a(this.f8732b);
            }
        }
    }

    public C1618ac(C1694k c1694k, InterfaceC1691h.a aVar, C1753m c1753m, long j, int i, InterfaceC1651t.a aVar2, boolean z) {
        this.f8717j = c1694k;
        this.f8718k = aVar;
        this.f8710b = c1753m;
        this.f8723p = j;
        this.f8719l = i;
        this.f8720m = aVar2;
        this.f8711c = z;
        this.f8721n = new C1621af(new C1620ae(c1753m));
        aVar2.m7471a();
    }

    /* JADX INFO: renamed from: a */
    private int m7256a(b bVar, long j, long j2, IOException iOException) {
        int i = this.f8724q + 1;
        this.f8724q = i;
        boolean z = this.f8711c && i >= this.f8719l;
        this.f8720m.m7481a(bVar.f8731a, 1, -1, this.f8710b, 0, null, 0L, this.f8723p, j, j2, bVar.f8733c, iOException, z);
        if (!z) {
            return 0;
        }
        this.f8713e = true;
        return 2;
    }

    /* JADX INFO: renamed from: a */
    private void m7258a(b bVar, long j, long j2) {
        this.f8720m.m7480a(bVar.f8731a, 1, -1, this.f8710b, 0, null, 0L, this.f8723p, j, j2, bVar.f8733c);
        this.f8716h = bVar.f8733c;
        this.f8715g = bVar.f8734d;
        this.f8713e = true;
        this.f8714f = true;
    }

    /* JADX INFO: renamed from: b */
    private void m7259b(b bVar, long j, long j2) {
        this.f8720m.m7486b(bVar.f8731a, 1, -1, null, 0, null, 0L, this.f8723p, j, j2, bVar.f8733c);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ int mo7260a(C1703t.c cVar, long j, long j2, IOException iOException) {
        b bVar = (b) cVar;
        int i = this.f8724q + 1;
        this.f8724q = i;
        boolean z = this.f8711c && i >= this.f8719l;
        this.f8720m.m7481a(bVar.f8731a, 1, -1, this.f8710b, 0, null, 0L, this.f8723p, j, j2, bVar.f8733c, iOException, z);
        if (!z) {
            return 0;
        }
        this.f8713e = true;
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final long mo7261a(long j, C1497ac c1497ac) {
        return j;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final long mo7262a(InterfaceC1664f[] interfaceC1664fArr, boolean[] zArr, InterfaceC1656y[] interfaceC1656yArr, boolean[] zArr2, long j) {
        byte b2 = 0;
        for (int i = 0; i < interfaceC1664fArr.length; i++) {
            if (interfaceC1656yArr[i] != null && (interfaceC1664fArr[i] == null || !zArr[i])) {
                this.f8722o.remove(interfaceC1656yArr[i]);
                interfaceC1656yArr[i] = null;
            }
            if (interfaceC1656yArr[i] == null && interfaceC1664fArr[i] != null) {
                a aVar = new a(this, b2);
                this.f8722o.add(aVar);
                interfaceC1656yArr[i] = aVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7263a() {
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7264a(long j, boolean z) {
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: a */
    public final void mo7265a(InterfaceC1649r.a aVar, long j) {
        aVar.mo7363a((InterfaceC1649r) this);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7266a(C1703t.c cVar, long j, long j2) {
        b bVar = (b) cVar;
        this.f8720m.m7480a(bVar.f8731a, 1, -1, this.f8710b, 0, null, 0L, this.f8723p, j, j2, bVar.f8733c);
        this.f8716h = bVar.f8733c;
        this.f8715g = bVar.f8734d;
        this.f8713e = true;
        this.f8714f = true;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.C1703t.a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7267a(C1703t.c cVar, long j, long j2, boolean z) {
        this.f8720m.m7486b(((b) cVar).f8731a, 1, -1, null, 0, null, 0L, this.f8723p, j, j2, r3.f8733c);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: a_ */
    public final void mo7268a_(long j) {
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: b */
    public final long mo7269b(long j) {
        for (int i = 0; i < this.f8722o.size(); i++) {
            this.f8722o.get(i).m7279a();
        }
        return j;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: b */
    public final C1621af mo7270b() {
        return this.f8721n;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r
    /* JADX INFO: renamed from: c */
    public final long mo7271c() {
        if (this.f8712d) {
            return C1500b.f7455b;
        }
        this.f8720m.m7487c();
        this.f8712d = true;
        return C1500b.f7455b;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: c */
    public final boolean mo7272c(long j) {
        if (this.f8713e || this.f8709a.m7913a()) {
            return false;
        }
        this.f8720m.m7479a(this.f8717j, 1, -1, this.f8710b, 0, null, 0L, this.f8723p, this.f8709a.m7910a(new b(this.f8717j, this.f8718k.mo7851a()), this, this.f8719l));
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: d */
    public final long mo7273d() {
        return this.f8713e ? Long.MIN_VALUE : 0L;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1649r, com.anythink.expressad.exoplayer.p101h.InterfaceC1657z
    /* JADX INFO: renamed from: e */
    public final long mo7274e() {
        return (this.f8713e || this.f8709a.m7913a()) ? Long.MIN_VALUE : 0L;
    }

    /* JADX INFO: renamed from: f */
    public final void m7275f() {
        this.f8709a.m7912a((C1703t.d) null);
        this.f8720m.m7483b();
    }
}
