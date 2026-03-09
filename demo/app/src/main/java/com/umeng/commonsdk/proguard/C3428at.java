package com.umeng.commonsdk.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.at */
/* JADX INFO: loaded from: classes2.dex */
public class C3428at extends AbstractC3434az {

    /* JADX INFO: renamed from: d */
    private static final C3440be f18710d = new C3440be("");

    /* JADX INFO: renamed from: e */
    private static final C3429au f18711e = new C3429au("", (byte) 0, 0);

    /* JADX INFO: renamed from: f */
    private static final byte[] f18712f = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};

    /* JADX INFO: renamed from: h */
    private static final byte f18713h = -126;

    /* JADX INFO: renamed from: i */
    private static final byte f18714i = 1;

    /* JADX INFO: renamed from: j */
    private static final byte f18715j = 31;

    /* JADX INFO: renamed from: k */
    private static final byte f18716k = -32;

    /* JADX INFO: renamed from: l */
    private static final int f18717l = 5;

    /* JADX INFO: renamed from: a */
    public byte[] f18718a;

    /* JADX INFO: renamed from: b */
    public byte[] f18719b;

    /* JADX INFO: renamed from: c */
    public byte[] f18720c;

    /* JADX INFO: renamed from: m */
    private C3474y f18721m;

    /* JADX INFO: renamed from: n */
    private short f18722n;

    /* JADX INFO: renamed from: o */
    private C3429au f18723o;

    /* JADX INFO: renamed from: p */
    private Boolean f18724p;

    /* JADX INFO: renamed from: q */
    private final long f18725q;

    /* JADX INFO: renamed from: r */
    private byte[] f18726r;

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.at$a */
    public static class a implements InterfaceC3437bb {

        /* JADX INFO: renamed from: a */
        private final long f18727a;

        public a() {
            this.f18727a = -1L;
        }

        public a(int i) {
            this.f18727a = i;
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3437bb
        /* JADX INFO: renamed from: a */
        public AbstractC3434az mo15825a(AbstractC3449bn abstractC3449bn) {
            return new C3428at(abstractC3449bn, this.f18727a);
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.at$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final byte f18728a = 1;

        /* JADX INFO: renamed from: b */
        public static final byte f18729b = 2;

        /* JADX INFO: renamed from: c */
        public static final byte f18730c = 3;

        /* JADX INFO: renamed from: d */
        public static final byte f18731d = 4;

        /* JADX INFO: renamed from: e */
        public static final byte f18732e = 5;

        /* JADX INFO: renamed from: f */
        public static final byte f18733f = 6;

        /* JADX INFO: renamed from: g */
        public static final byte f18734g = 7;

        /* JADX INFO: renamed from: h */
        public static final byte f18735h = 8;

        /* JADX INFO: renamed from: i */
        public static final byte f18736i = 9;

        /* JADX INFO: renamed from: j */
        public static final byte f18737j = 10;

        /* JADX INFO: renamed from: k */
        public static final byte f18738k = 11;

        /* JADX INFO: renamed from: l */
        public static final byte f18739l = 12;

        private b() {
        }
    }

    public C3428at(AbstractC3449bn abstractC3449bn) {
        this(abstractC3449bn, -1L);
    }

    public C3428at(AbstractC3449bn abstractC3449bn, long j) {
        super(abstractC3449bn);
        this.f18721m = new C3474y(15);
        this.f18722n = (short) 0;
        this.f18723o = null;
        this.f18724p = null;
        this.f18718a = new byte[5];
        this.f18719b = new byte[10];
        this.f18726r = new byte[1];
        this.f18720c = new byte[1];
        this.f18725q = j;
    }

    /* JADX INFO: renamed from: E */
    private int m15826E() throws C3415ag {
        int i = 0;
        if (this.f18755g.mo15874h() >= 5) {
            byte[] bArrMo15872f = this.f18755g.mo15872f();
            int iMo15873g = this.f18755g.mo15873g();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte b2 = bArrMo15872f[iMo15873g + i];
                i2 |= (b2 & 127) << i3;
                if ((b2 & 128) != 128) {
                    this.f18755g.mo15868a(i + 1);
                    return i2;
                }
                i3 += 7;
                i++;
            }
        } else {
            int i4 = 0;
            while (true) {
                byte bMo15819u = mo15819u();
                i |= (bMo15819u & 127) << i4;
                if ((bMo15819u & 128) != 128) {
                    return i;
                }
                i4 += 7;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    private long m15827F() throws C3415ag {
        int i = 0;
        long j = 0;
        if (this.f18755g.mo15874h() >= 10) {
            byte[] bArrMo15872f = this.f18755g.mo15872f();
            int iMo15873g = this.f18755g.mo15873g();
            long j2 = 0;
            int i2 = 0;
            while (true) {
                byte b2 = bArrMo15872f[iMo15873g + i];
                j2 |= ((long) (b2 & 127)) << i2;
                if ((b2 & 128) != 128) {
                    this.f18755g.mo15868a(i + 1);
                    return j2;
                }
                i2 += 7;
                i++;
            }
        } else {
            while (true) {
                byte bMo15819u = mo15819u();
                j |= ((long) (bMo15819u & 127)) << i;
                if ((bMo15819u & 128) != 128) {
                    return j;
                }
                i += 7;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private long m15828a(byte[] bArr) {
        return ((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (255 & ((long) bArr[0]));
    }

    /* JADX INFO: renamed from: a */
    private void m15829a(long j, byte[] bArr, int i) {
        bArr[i + 0] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    /* JADX INFO: renamed from: a */
    private void m15830a(C3429au c3429au, byte b2) throws C3415ag {
        if (b2 == -1) {
            b2 = m15841e(c3429au.f18741b);
        }
        short s = c3429au.f18742c;
        short s2 = this.f18722n;
        if (s <= s2 || s - s2 > 15) {
            m15832b(b2);
            mo15795a(c3429au.f18742c);
        } else {
            m15840d(b2 | ((s - s2) << 4));
        }
        this.f18722n = c3429au.f18742c;
    }

    /* JADX INFO: renamed from: a */
    private void m15831a(byte[] bArr, int i, int i2) throws C3415ag {
        m15833b(i2);
        this.f18755g.mo15865b(bArr, i, i2);
    }

    /* JADX INFO: renamed from: b */
    private void m15832b(byte b2) throws C3415ag {
        byte[] bArr = this.f18726r;
        bArr[0] = b2;
        this.f18755g.m15875b(bArr);
    }

    /* JADX INFO: renamed from: b */
    private void m15833b(int i) throws C3415ag {
        int i2 = 0;
        while ((i & (-128)) != 0) {
            this.f18718a[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i2++;
        }
        byte[] bArr = this.f18718a;
        bArr[i2] = (byte) i;
        this.f18755g.mo15865b(bArr, 0, i2 + 1);
    }

    /* JADX INFO: renamed from: b */
    private void m15834b(long j) throws C3415ag {
        int i = 0;
        while (true) {
            long j2 = (-128) & j;
            byte[] bArr = this.f18719b;
            int i2 = i + 1;
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.f18755g.mo15865b(bArr, 0, i2);
                return;
            } else {
                bArr[i] = (byte) ((127 & j) | 128);
                j >>>= 7;
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private int m15835c(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: c */
    private long m15836c(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: c */
    private boolean m15837c(byte b2) {
        int i = b2 & C3442bg.f18783m;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: d */
    private byte m15838d(byte b2) throws C3436ba {
        byte b3 = (byte) (b2 & C3442bg.f18783m);
        switch (b3) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return C3442bg.f18783m;
            case 10:
                return C3442bg.f18782l;
            case 11:
                return C3442bg.f18781k;
            case 12:
                return (byte) 12;
            default:
                throw new C3436ba("don't know what type: " + ((int) b3));
        }
    }

    /* JADX INFO: renamed from: d */
    private long m15839d(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: d */
    private void m15840d(int i) throws C3415ag {
        m15832b((byte) i);
    }

    /* JADX INFO: renamed from: e */
    private byte m15841e(byte b2) {
        return f18712f[b2];
    }

    /* JADX INFO: renamed from: e */
    private byte[] m15842e(int i) throws C3415ag {
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        this.f18755g.m15876d(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: f */
    private void m15843f(int i) throws C3436ba {
        if (i < 0) {
            throw new C3436ba("Negative length: " + i);
        }
        long j = this.f18725q;
        if (j == -1 || i <= j) {
            return;
        }
        throw new C3436ba("Length exceeded max allowed: " + i);
    }

    /* JADX INFO: renamed from: g */
    private int m15844g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: A */
    public ByteBuffer mo15781A() throws C3415ag {
        int iM15826E = m15826E();
        m15843f(iM15826E);
        if (iM15826E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[iM15826E];
        this.f18755g.m15876d(bArr, 0, iM15826E);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: B */
    public void mo15845B() {
        this.f18721m.m16139c();
        this.f18722n = (short) 0;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15782a() throws C3415ag {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15783a(byte b2) throws C3415ag {
        m15832b(b2);
    }

    /* JADX INFO: renamed from: a */
    public void m15846a(byte b2, int i) throws C3415ag {
        if (i <= 14) {
            m15840d(m15841e(b2) | (i << 4));
        } else {
            m15840d(m15841e(b2) | 240);
            m15833b(i);
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15784a(double d) throws C3415ag {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        m15829a(Double.doubleToLongBits(d), bArr, 0);
        this.f18755g.m15875b(bArr);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15785a(int i) throws C3415ag {
        m15833b(m15835c(i));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15786a(long j) throws C3415ag {
        m15834b(m15836c(j));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15787a(C3429au c3429au) throws C3415ag {
        if (c3429au.f18741b == 2) {
            this.f18723o = c3429au;
        } else {
            m15830a(c3429au, (byte) -1);
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15788a(C3430av c3430av) throws C3415ag {
        m15846a(c3430av.f18743a, c3430av.f18744b);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15789a(C3431aw c3431aw) throws C3415ag {
        int iM15841e;
        int i = c3431aw.f18747c;
        if (i == 0) {
            iM15841e = 0;
        } else {
            m15833b(i);
            iM15841e = m15841e(c3431aw.f18746b) | (m15841e(c3431aw.f18745a) << 4);
        }
        m15840d(iM15841e);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15790a(C3432ax c3432ax) throws C3415ag {
        m15832b(f18713h);
        m15840d(((c3432ax.f18749b << 5) & (-32)) | 1);
        m15833b(c3432ax.f18750c);
        mo15793a(c3432ax.f18748a);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15791a(C3439bd c3439bd) throws C3415ag {
        m15846a(c3439bd.f18768a, c3439bd.f18769b);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15792a(C3440be c3440be) throws C3415ag {
        this.f18721m.m16137a(this.f18722n);
        this.f18722n = (short) 0;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15793a(String str) throws C3415ag {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            m15831a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C3415ag("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15794a(ByteBuffer byteBuffer) throws C3415ag {
        m15831a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15795a(short s) throws C3415ag {
        m15833b(m15835c((int) s));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: a */
    public void mo15796a(boolean z) throws C3415ag {
        C3429au c3429au = this.f18723o;
        if (c3429au == null) {
            m15832b(z ? (byte) 1 : (byte) 2);
        } else {
            m15830a(c3429au, z ? (byte) 1 : (byte) 2);
            this.f18723o = null;
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: b */
    public void mo15798b() throws C3415ag {
        this.f18722n = this.f18721m.m16136a();
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: c */
    public void mo15799c() throws C3415ag {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: d */
    public void mo15801d() throws C3415ag {
        m15832b((byte) 0);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: e */
    public void mo15803e() throws C3415ag {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: f */
    public void mo15804f() throws C3415ag {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: g */
    public void mo15805g() throws C3415ag {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: h */
    public C3432ax mo15806h() throws C3415ag {
        byte bMo15819u = mo15819u();
        if (bMo15819u != -126) {
            throw new C3436ba("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(bMo15819u));
        }
        byte bMo15819u2 = mo15819u();
        byte b2 = (byte) (bMo15819u2 & f18715j);
        if (b2 == 1) {
            return new C3432ax(mo15824z(), (byte) ((bMo15819u2 >> 5) & 3), m15826E());
        }
        throw new C3436ba("Expected version 1 but got " + ((int) b2));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: i */
    public void mo15807i() throws C3415ag {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: j */
    public C3440be mo15808j() throws C3415ag {
        this.f18721m.m16137a(this.f18722n);
        this.f18722n = (short) 0;
        return f18710d;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: k */
    public void mo15809k() throws C3415ag {
        this.f18722n = this.f18721m.m16136a();
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: l */
    public C3429au mo15810l() throws C3415ag {
        byte bMo15819u = mo15819u();
        if (bMo15819u == 0) {
            return f18711e;
        }
        short s = (short) ((bMo15819u & 240) >> 4);
        short sMo15820v = s == 0 ? mo15820v() : (short) (this.f18722n + s);
        byte b2 = (byte) (bMo15819u & C3442bg.f18783m);
        C3429au c3429au = new C3429au("", m15838d(b2), sMo15820v);
        if (m15837c(bMo15819u)) {
            this.f18724p = b2 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.f18722n = c3429au.f18742c;
        return c3429au;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: m */
    public void mo15811m() throws C3415ag {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: n */
    public C3431aw mo15812n() throws C3415ag {
        int iM15826E = m15826E();
        byte bMo15819u = iM15826E == 0 ? (byte) 0 : mo15819u();
        return new C3431aw(m15838d((byte) (bMo15819u >> 4)), m15838d((byte) (bMo15819u & C3442bg.f18783m)), iM15826E);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: o */
    public void mo15813o() throws C3415ag {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: p */
    public C3430av mo15814p() throws C3415ag {
        byte bMo15819u = mo15819u();
        int iM15826E = (bMo15819u >> 4) & 15;
        if (iM15826E == 15) {
            iM15826E = m15826E();
        }
        return new C3430av(m15838d(bMo15819u), iM15826E);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: q */
    public void mo15815q() throws C3415ag {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: r */
    public C3439bd mo15816r() throws C3415ag {
        return new C3439bd(mo15814p());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: s */
    public void mo15817s() throws C3415ag {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: t */
    public boolean mo15818t() throws C3415ag {
        Boolean bool = this.f18724p;
        if (bool == null) {
            return mo15819u() == 1;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.f18724p = null;
        return zBooleanValue;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: u */
    public byte mo15819u() throws C3415ag {
        if (this.f18755g.mo15874h() <= 0) {
            this.f18755g.m15876d(this.f18720c, 0, 1);
            return this.f18720c[0];
        }
        byte b2 = this.f18755g.mo15872f()[this.f18755g.mo15873g()];
        this.f18755g.mo15868a(1);
        return b2;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: v */
    public short mo15820v() throws C3415ag {
        return (short) m15844g(m15826E());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: w */
    public int mo15821w() throws C3415ag {
        return m15844g(m15826E());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: x */
    public long mo15822x() throws C3415ag {
        return m15839d(m15827F());
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: y */
    public double mo15823y() throws C3415ag {
        byte[] bArr = new byte[8];
        this.f18755g.m15876d(bArr, 0, 8);
        return Double.longBitsToDouble(m15828a(bArr));
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: z */
    public String mo15824z() throws C3415ag {
        int iM15826E = m15826E();
        m15843f(iM15826E);
        if (iM15826E == 0) {
            return "";
        }
        try {
            if (this.f18755g.mo15874h() < iM15826E) {
                return new String(m15842e(iM15826E), "UTF-8");
            }
            String str = new String(this.f18755g.mo15872f(), this.f18755g.mo15873g(), iM15826E, "UTF-8");
            this.f18755g.mo15868a(iM15826E);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new C3415ag("UTF-8 not supported!");
        }
    }
}
