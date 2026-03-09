package com.anythink.expressad.exoplayer.p091b;

import com.anythink.expressad.exoplayer.p091b.InterfaceC1506f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1517q implements InterfaceC1506f {

    /* JADX INFO: renamed from: b */
    private static final long f7748b = 150000;

    /* JADX INFO: renamed from: c */
    private static final long f7749c = 20000;

    /* JADX INFO: renamed from: d */
    private static final short f7750d = 1024;

    /* JADX INFO: renamed from: e */
    private static final byte f7751e = 4;

    /* JADX INFO: renamed from: f */
    private static final int f7752f = 0;

    /* JADX INFO: renamed from: g */
    private static final int f7753g = 1;

    /* JADX INFO: renamed from: h */
    private static final int f7754h = 2;

    /* JADX INFO: renamed from: i */
    private int f7755i;

    /* JADX INFO: renamed from: j */
    private int f7756j;

    /* JADX INFO: renamed from: k */
    private int f7757k;

    /* JADX INFO: renamed from: l */
    private boolean f7758l;

    /* JADX INFO: renamed from: m */
    private ByteBuffer f7759m;

    /* JADX INFO: renamed from: n */
    private ByteBuffer f7760n;

    /* JADX INFO: renamed from: o */
    private boolean f7761o;

    /* JADX INFO: renamed from: p */
    private byte[] f7762p;

    /* JADX INFO: renamed from: q */
    private byte[] f7763q;

    /* JADX INFO: renamed from: r */
    private int f7764r;

    /* JADX INFO: renamed from: s */
    private int f7765s;

    /* JADX INFO: renamed from: t */
    private int f7766t;

    /* JADX INFO: renamed from: u */
    private boolean f7767u;

    /* JADX INFO: renamed from: v */
    private long f7768v;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.q$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C1517q() {
        ByteBuffer byteBuffer = InterfaceC1506f.f7547a;
        this.f7759m = byteBuffer;
        this.f7760n = byteBuffer;
        this.f7755i = -1;
        this.f7756j = -1;
        this.f7762p = new byte[0];
        this.f7763q = new byte[0];
    }

    /* JADX INFO: renamed from: a */
    private int m6571a(long j) {
        return (int) ((j * ((long) this.f7756j)) / 1000000);
    }

    /* JADX INFO: renamed from: a */
    private void m6572a(int i) {
        if (this.f7759m.capacity() < i) {
            this.f7759m = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f7759m.clear();
        }
        if (i > 0) {
            this.f7767u = true;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6573a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f7766t);
        int i2 = this.f7766t - iMin;
        System.arraycopy(bArr, i - i2, this.f7763q, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f7763q, i2, iMin);
    }

    /* JADX INFO: renamed from: a */
    private void m6574a(byte[] bArr, int i) {
        m6572a(i);
        this.f7759m.put(bArr, 0, i);
        this.f7759m.flip();
        this.f7760n = this.f7759m;
    }

    /* JADX INFO: renamed from: b */
    private void m6575b(ByteBuffer byteBuffer) {
        int iPosition;
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f7762p.length));
        int iLimit2 = byteBuffer.limit() - 1;
        while (true) {
            if (iLimit2 < byteBuffer.position()) {
                iPosition = byteBuffer.position();
                break;
            } else {
                if (Math.abs((int) byteBuffer.get(iLimit2)) > 4) {
                    int i = this.f7757k;
                    iPosition = ((iLimit2 / i) * i) + i;
                    break;
                }
                iLimit2 -= 2;
            }
        }
        if (iPosition == byteBuffer.position()) {
            this.f7764r = 1;
        } else {
            byteBuffer.limit(iPosition);
            m6572a(byteBuffer.remaining());
            this.f7759m.put(byteBuffer);
            this.f7759m.flip();
            this.f7760n = this.f7759m;
        }
        byteBuffer.limit(iLimit);
    }

    /* JADX INFO: renamed from: c */
    private void m6576c(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iM6579f = m6579f(byteBuffer);
        int iPosition = iM6579f - byteBuffer.position();
        byte[] bArr = this.f7762p;
        int length = bArr.length;
        int i = this.f7765s;
        int i2 = length - i;
        if (iM6579f < iLimit && iPosition < i2) {
            m6574a(bArr, i);
            this.f7765s = 0;
            this.f7764r = 0;
            return;
        }
        int iMin = Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f7762p, this.f7765s, iMin);
        int i3 = this.f7765s + iMin;
        this.f7765s = i3;
        byte[] bArr2 = this.f7762p;
        if (i3 == bArr2.length) {
            if (this.f7767u) {
                m6574a(bArr2, this.f7766t);
                this.f7768v += (long) ((this.f7765s - (this.f7766t * 2)) / this.f7757k);
            } else {
                this.f7768v += (long) ((i3 - this.f7766t) / this.f7757k);
            }
            m6573a(byteBuffer, this.f7762p, this.f7765s);
            this.f7765s = 0;
            this.f7764r = 2;
        }
        byteBuffer.limit(iLimit);
    }

    /* JADX INFO: renamed from: d */
    private void m6577d(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iM6579f = m6579f(byteBuffer);
        byteBuffer.limit(iM6579f);
        this.f7768v += (long) (byteBuffer.remaining() / this.f7757k);
        m6573a(byteBuffer, this.f7763q, this.f7766t);
        if (iM6579f < iLimit) {
            m6574a(this.f7763q, this.f7766t);
            this.f7764r = 0;
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m6578e(ByteBuffer byteBuffer) {
        m6572a(byteBuffer.remaining());
        this.f7759m.put(byteBuffer);
        this.f7759m.flip();
        this.f7760n = this.f7759m;
    }

    /* JADX INFO: renamed from: f */
    private int m6579f(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.get(iPosition)) > 4) {
                int i = this.f7757k;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    /* JADX INFO: renamed from: g */
    private int m6580g(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (Math.abs((int) byteBuffer.get(iLimit)) > 4) {
                int i = this.f7757k;
                return ((iLimit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final void mo6421a(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f7760n.hasRemaining()) {
            int i = this.f7764r;
            if (i == 0) {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f7762p.length));
                int iLimit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.get(iLimit2)) > 4) {
                            int i2 = this.f7757k;
                            iPosition = ((iLimit2 / i2) * i2) + i2;
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f7764r = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    m6572a(byteBuffer.remaining());
                    this.f7759m.put(byteBuffer);
                    this.f7759m.flip();
                    this.f7760n = this.f7759m;
                }
            } else if (i == 1) {
                iLimit = byteBuffer.limit();
                int iM6579f = m6579f(byteBuffer);
                int iPosition2 = iM6579f - byteBuffer.position();
                byte[] bArr = this.f7762p;
                int length = bArr.length;
                int i3 = this.f7765s;
                int i4 = length - i3;
                if (iM6579f >= iLimit || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f7762p, this.f7765s, iMin);
                    int i5 = this.f7765s + iMin;
                    this.f7765s = i5;
                    byte[] bArr2 = this.f7762p;
                    if (i5 == bArr2.length) {
                        if (this.f7767u) {
                            m6574a(bArr2, this.f7766t);
                            this.f7768v += (long) ((this.f7765s - (this.f7766t * 2)) / this.f7757k);
                        } else {
                            this.f7768v += (long) ((i5 - this.f7766t) / this.f7757k);
                        }
                        m6573a(byteBuffer, this.f7762p, this.f7765s);
                        this.f7765s = 0;
                        this.f7764r = 2;
                    }
                } else {
                    m6574a(bArr, i3);
                    this.f7765s = 0;
                    this.f7764r = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                iLimit = byteBuffer.limit();
                int iM6579f2 = m6579f(byteBuffer);
                byteBuffer.limit(iM6579f2);
                this.f7768v += (long) (byteBuffer.remaining() / this.f7757k);
                m6573a(byteBuffer, this.f7763q, this.f7766t);
                if (iM6579f2 < iLimit) {
                    m6574a(this.f7763q, this.f7766t);
                    this.f7764r = 0;
                }
            }
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6581a(boolean z) {
        this.f7758l = z;
        mo6430h();
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6422a() {
        return this.f7756j != -1 && this.f7758l;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6423a(int i, int i2, int i3) throws InterfaceC1506f.a {
        if (i3 != 2) {
            throw new InterfaceC1506f.a(i, i2, i3);
        }
        if (this.f7756j == i && this.f7755i == i2) {
            return false;
        }
        this.f7756j = i;
        this.f7755i = i2;
        this.f7757k = i2 * 2;
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: b */
    public final int mo6424b() {
        return this.f7755i;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: c */
    public final int mo6425c() {
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: d */
    public final int mo6426d() {
        return this.f7756j;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: e */
    public final void mo6427e() {
        this.f7761o = true;
        int i = this.f7765s;
        if (i > 0) {
            m6574a(this.f7762p, i);
        }
        if (this.f7767u) {
            return;
        }
        this.f7768v += (long) (this.f7766t / this.f7757k);
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: f */
    public final ByteBuffer mo6428f() {
        ByteBuffer byteBuffer = this.f7760n;
        this.f7760n = InterfaceC1506f.f7547a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: g */
    public final boolean mo6429g() {
        return this.f7761o && this.f7760n == InterfaceC1506f.f7547a;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: h */
    public final void mo6430h() {
        if (mo6422a()) {
            int iM6571a = m6571a(f7748b) * this.f7757k;
            if (this.f7762p.length != iM6571a) {
                this.f7762p = new byte[iM6571a];
            }
            int iM6571a2 = m6571a(f7749c) * this.f7757k;
            this.f7766t = iM6571a2;
            if (this.f7763q.length != iM6571a2) {
                this.f7763q = new byte[iM6571a2];
            }
        }
        this.f7764r = 0;
        this.f7760n = InterfaceC1506f.f7547a;
        this.f7761o = false;
        this.f7768v = 0L;
        this.f7765s = 0;
        this.f7767u = false;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: i */
    public final void mo6431i() {
        this.f7758l = false;
        mo6430h();
        this.f7759m = InterfaceC1506f.f7547a;
        this.f7755i = -1;
        this.f7756j = -1;
        this.f7766t = 0;
        this.f7762p = new byte[0];
        this.f7763q = new byte[0];
    }

    /* JADX INFO: renamed from: j */
    public final long m6582j() {
        return this.f7768v;
    }
}
