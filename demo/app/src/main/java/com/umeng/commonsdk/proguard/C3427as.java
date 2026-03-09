package com.umeng.commonsdk.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.as */
/* JADX INFO: loaded from: classes2.dex */
public class C3427as extends AbstractC3434az {

    /* JADX INFO: renamed from: a */
    public static final int f18692a = -65536;

    /* JADX INFO: renamed from: b */
    public static final int f18693b = -2147418112;

    /* JADX INFO: renamed from: h */
    private static final C3440be f18694h = new C3440be();

    /* JADX INFO: renamed from: c */
    public boolean f18695c;

    /* JADX INFO: renamed from: d */
    public boolean f18696d;

    /* JADX INFO: renamed from: e */
    public int f18697e;

    /* JADX INFO: renamed from: f */
    public boolean f18698f;

    /* JADX INFO: renamed from: i */
    private byte[] f18699i;

    /* JADX INFO: renamed from: j */
    private byte[] f18700j;

    /* JADX INFO: renamed from: k */
    private byte[] f18701k;

    /* JADX INFO: renamed from: l */
    private byte[] f18702l;

    /* JADX INFO: renamed from: m */
    private byte[] f18703m;

    /* JADX INFO: renamed from: n */
    private byte[] f18704n;

    /* JADX INFO: renamed from: o */
    private byte[] f18705o;

    /* JADX INFO: renamed from: p */
    private byte[] f18706p;

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.as$a */
    public static class a implements InterfaceC3437bb {

        /* JADX INFO: renamed from: a */
        public boolean f18707a;

        /* JADX INFO: renamed from: b */
        public boolean f18708b;

        /* JADX INFO: renamed from: c */
        public int f18709c;

        public a() {
            this(false, true);
        }

        public a(boolean z, boolean z3) {
            this(z, z3, 0);
        }

        public a(boolean z, boolean z3, int i) {
            this.f18707a = false;
            this.f18708b = true;
            this.f18707a = z;
            this.f18708b = z3;
            this.f18709c = i;
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3437bb
        /* JADX INFO: renamed from: a */
        public AbstractC3434az mo15825a(AbstractC3449bn abstractC3449bn) {
            C3427as c3427as = new C3427as(abstractC3449bn, this.f18707a, this.f18708b);
            int i = this.f18709c;
            if (i != 0) {
                c3427as.m15800c(i);
            }
            return c3427as;
        }
    }

    public C3427as(AbstractC3449bn abstractC3449bn) {
        this(abstractC3449bn, false, true);
    }

    public C3427as(AbstractC3449bn abstractC3449bn, boolean z, boolean z3) {
        super(abstractC3449bn);
        this.f18695c = false;
        this.f18696d = true;
        this.f18698f = false;
        this.f18699i = new byte[1];
        this.f18700j = new byte[2];
        this.f18701k = new byte[4];
        this.f18702l = new byte[8];
        this.f18703m = new byte[1];
        this.f18704n = new byte[2];
        this.f18705o = new byte[4];
        this.f18706p = new byte[8];
        this.f18695c = z;
        this.f18696d = z3;
    }

    /* JADX INFO: renamed from: a */
    private int m15780a(byte[] bArr, int i, int i2) throws C3415ag {
        m15802d(i2);
        return this.f18755g.m15876d(bArr, i, i2);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: A */
    public ByteBuffer mo15781A() throws C3415ag {
        int iMo15821w = mo15821w();
        m15802d(iMo15821w);
        if (this.f18755g.mo15874h() >= iMo15821w) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f18755g.mo15872f(), this.f18755g.mo15873g(), iMo15821w);
            this.f18755g.mo15868a(iMo15821w);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iMo15821w];
        this.f18755g.m15876d(bArr, 0, iMo15821w);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15782a() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15783a(byte b) throws C3415ag {
        byte[] bArr = this.f18699i;
        bArr[0] = b;
        this.f18755g.mo15865b(bArr, 0, 1);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15784a(double d) throws C3415ag {
        mo15786a(Double.doubleToLongBits(d));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15785a(int i) throws C3415ag {
        byte[] bArr = this.f18701k;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f18755g.mo15865b(bArr, 0, 4);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15786a(long j) throws C3415ag {
        byte[] bArr = this.f18702l;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.f18755g.mo15865b(bArr, 0, 8);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15787a(C3429au c3429au) throws C3415ag {
        mo15783a(c3429au.f18741b);
        mo15795a(c3429au.f18742c);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15788a(C3430av c3430av) throws C3415ag {
        mo15783a(c3430av.f18743a);
        mo15785a(c3430av.f18744b);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15789a(C3431aw c3431aw) throws C3415ag {
        mo15783a(c3431aw.f18745a);
        mo15783a(c3431aw.f18746b);
        mo15785a(c3431aw.f18747c);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15790a(C3432ax c3432ax) throws C3415ag {
        if (this.f18696d) {
            mo15785a((-2147418112) | c3432ax.f18749b);
            mo15793a(c3432ax.f18748a);
        } else {
            mo15793a(c3432ax.f18748a);
            mo15783a(c3432ax.f18749b);
        }
        mo15785a(c3432ax.f18750c);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15791a(C3439bd c3439bd) throws C3415ag {
        mo15783a(c3439bd.f18768a);
        mo15785a(c3439bd.f18769b);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15792a(C3440be c3440be) {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15793a(String str) throws C3415ag {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo15785a(bytes.length);
            this.f18755g.mo15865b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C3415ag("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15794a(ByteBuffer byteBuffer) throws C3415ag {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        mo15785a(iLimit);
        this.f18755g.mo15865b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15795a(short s) throws C3415ag {
        byte[] bArr = this.f18700j;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f18755g.mo15865b(bArr, 0, 2);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15796a(boolean z) throws C3415ag {
        mo15783a(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: b */
    public String m15797b(int i) throws C3415ag {
        try {
            m15802d(i);
            byte[] bArr = new byte[i];
            this.f18755g.m15876d(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new C3415ag("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: b */
    public void mo15798b() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: c */
    public void mo15799c() {
    }

    /* JADX INFO: renamed from: c */
    public void m15800c(int i) {
        this.f18697e = i;
        this.f18698f = true;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: d */
    public void mo15801d() throws C3415ag {
        mo15783a((byte) 0);
    }

    /* JADX INFO: renamed from: d */
    public void m15802d(int i) throws C3415ag {
        if (i < 0) {
            throw new C3436ba("Negative length: " + i);
        }
        if (this.f18698f) {
            int i2 = this.f18697e - i;
            this.f18697e = i2;
            if (i2 >= 0) {
                return;
            }
            throw new C3436ba("Message length exceeded: " + i);
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: e */
    public void mo15803e() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: f */
    public void mo15804f() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: g */
    public void mo15805g() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: h */
    public C3432ax mo15806h() throws C3415ag {
        int iMo15821w = mo15821w();
        if (iMo15821w < 0) {
            if (((-65536) & iMo15821w) == -2147418112) {
                return new C3432ax(mo15824z(), (byte) (iMo15821w & 255), mo15821w());
            }
            throw new C3436ba(4, "Bad version in readMessageBegin");
        }
        if (this.f18695c) {
            throw new C3436ba(4, "Missing version in readMessageBegin, old client?");
        }
        return new C3432ax(m15797b(iMo15821w), mo15819u(), mo15821w());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: i */
    public void mo15807i() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: j */
    public C3440be mo15808j() {
        return f18694h;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: k */
    public void mo15809k() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: l */
    public C3429au mo15810l() throws C3415ag {
        byte bMo15819u = mo15819u();
        return new C3429au("", bMo15819u, bMo15819u == 0 ? (short) 0 : mo15820v());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: m */
    public void mo15811m() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: n */
    public C3431aw mo15812n() throws C3415ag {
        return new C3431aw(mo15819u(), mo15819u(), mo15821w());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: o */
    public void mo15813o() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: p */
    public C3430av mo15814p() throws C3415ag {
        return new C3430av(mo15819u(), mo15821w());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: q */
    public void mo15815q() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: r */
    public C3439bd mo15816r() throws C3415ag {
        return new C3439bd(mo15819u(), mo15821w());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: s */
    public void mo15817s() {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: t */
    public boolean mo15818t() throws C3415ag {
        return mo15819u() == 1;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: u */
    public byte mo15819u() throws C3415ag {
        if (this.f18755g.mo15874h() < 1) {
            m15780a(this.f18703m, 0, 1);
            return this.f18703m[0];
        }
        byte b = this.f18755g.mo15872f()[this.f18755g.mo15873g()];
        this.f18755g.mo15868a(1);
        return b;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: v */
    public short mo15820v() throws C3415ag {
        byte[] bArrMo15872f = this.f18704n;
        int iMo15873g = 0;
        if (this.f18755g.mo15874h() >= 2) {
            bArrMo15872f = this.f18755g.mo15872f();
            iMo15873g = this.f18755g.mo15873g();
            this.f18755g.mo15868a(2);
        } else {
            m15780a(this.f18704n, 0, 2);
        }
        return (short) ((bArrMo15872f[iMo15873g + 1] & 255) | ((bArrMo15872f[iMo15873g] & 255) << 8));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: w */
    public int mo15821w() throws C3415ag {
        byte[] bArrMo15872f = this.f18705o;
        int iMo15873g = 0;
        if (this.f18755g.mo15874h() >= 4) {
            bArrMo15872f = this.f18755g.mo15872f();
            iMo15873g = this.f18755g.mo15873g();
            this.f18755g.mo15868a(4);
        } else {
            m15780a(this.f18705o, 0, 4);
        }
        return (bArrMo15872f[iMo15873g + 3] & 255) | ((bArrMo15872f[iMo15873g] & 255) << 24) | ((bArrMo15872f[iMo15873g + 1] & 255) << 16) | ((bArrMo15872f[iMo15873g + 2] & 255) << 8);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: x */
    public long mo15822x() throws C3415ag {
        byte[] bArrMo15872f = this.f18706p;
        int iMo15873g = 0;
        if (this.f18755g.mo15874h() >= 8) {
            bArrMo15872f = this.f18755g.mo15872f();
            iMo15873g = this.f18755g.mo15873g();
            this.f18755g.mo15868a(8);
        } else {
            m15780a(this.f18706p, 0, 8);
        }
        return ((long) (bArrMo15872f[iMo15873g + 7] & 255)) | (((long) (bArrMo15872f[iMo15873g] & 255)) << 56) | (((long) (bArrMo15872f[iMo15873g + 1] & 255)) << 48) | (((long) (bArrMo15872f[iMo15873g + 2] & 255)) << 40) | (((long) (bArrMo15872f[iMo15873g + 3] & 255)) << 32) | (((long) (bArrMo15872f[iMo15873g + 4] & 255)) << 24) | (((long) (bArrMo15872f[iMo15873g + 5] & 255)) << 16) | (((long) (bArrMo15872f[iMo15873g + 6] & 255)) << 8);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: y */
    public double mo15823y() throws C3415ag {
        return Double.longBitsToDouble(mo15822x());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: z */
    public String mo15824z() throws C3415ag {
        int iMo15821w = mo15821w();
        if (this.f18755g.mo15874h() < iMo15821w) {
            return m15797b(iMo15821w);
        }
        try {
            String str = new String(this.f18755g.mo15872f(), this.f18755g.mo15873g(), iMo15821w, "UTF-8");
            this.f18755g.mo15868a(iMo15821w);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C3415ag("JVM DOES NOT SUPPORT UTF-8");
        }
    }
}
