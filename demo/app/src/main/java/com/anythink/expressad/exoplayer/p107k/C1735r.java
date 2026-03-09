package com.anythink.expressad.exoplayer.p107k;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1735r {

    /* JADX INFO: renamed from: a */
    public byte[] f9788a;

    /* JADX INFO: renamed from: b */
    private int f9789b;

    /* JADX INFO: renamed from: c */
    private int f9790c;

    /* JADX INFO: renamed from: d */
    private int f9791d;

    public C1735r() {
    }

    public C1735r(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private C1735r(byte[] bArr, int i) {
        this.f9788a = bArr;
        this.f9791d = i;
    }

    /* JADX INFO: renamed from: a */
    private void m8228a(C1736s c1736s) {
        m8237a(c1736s.f9792a, c1736s.m8269b());
        m8236a(c1736s.m8271c() * 8);
    }

    /* JADX INFO: renamed from: a */
    private void m8229a(byte[] bArr) {
        m8237a(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    private void m8230a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f9788a;
            int i4 = this.f9789b;
            int i5 = i4 + 1;
            this.f9789b = i5;
            byte b = bArr2[i4];
            int i6 = this.f9790c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
        int i8 = this.f9790c;
        if (i8 + i7 > 8) {
            int i9 = bArr[i3];
            byte[] bArr3 = this.f9788a;
            int i10 = this.f9789b;
            this.f9789b = i10 + 1;
            bArr[i3] = (byte) (i9 | ((bArr3[i10] & 255) << i8));
            this.f9790c = i8 - 8;
        }
        int i11 = this.f9790c + i7;
        this.f9790c = i11;
        byte[] bArr4 = this.f9788a;
        int i12 = this.f9789b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i7))) | bArr[i3]);
        if (i11 == 8) {
            this.f9790c = 0;
            this.f9789b = i12 + 1;
        }
        m8234g();
    }

    /* JADX INFO: renamed from: b */
    private void m8231b(byte[] bArr, int i, int i2) {
        C1711a.m8012b(this.f9790c == 0);
        System.arraycopy(this.f9788a, this.f9789b, bArr, i, i2);
        this.f9789b += i2;
        m8234g();
    }

    /* JADX INFO: renamed from: e */
    private void m8232e(int i) {
        C1711a.m8012b(this.f9790c == 0);
        this.f9789b += i;
        m8234g();
    }

    /* JADX INFO: renamed from: f */
    private int m8233f() {
        C1711a.m8012b(this.f9790c == 0);
        return this.f9789b;
    }

    /* JADX INFO: renamed from: g */
    private void m8234g() {
        int i;
        int i2 = this.f9789b;
        C1711a.m8012b(i2 >= 0 && (i2 < (i = this.f9791d) || (i2 == i && this.f9790c == 0)));
    }

    /* JADX INFO: renamed from: a */
    public final int m8235a() {
        return ((this.f9791d - this.f9789b) * 8) - this.f9790c;
    }

    /* JADX INFO: renamed from: a */
    public final void m8236a(int i) {
        int i2 = i / 8;
        this.f9789b = i2;
        this.f9790c = i - (i2 * 8);
        m8234g();
    }

    /* JADX INFO: renamed from: a */
    public final void m8237a(byte[] bArr, int i) {
        this.f9788a = bArr;
        this.f9789b = 0;
        this.f9790c = 0;
        this.f9791d = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m8238b() {
        return (this.f9789b * 8) + this.f9790c;
    }

    /* JADX INFO: renamed from: b */
    public final void m8239b(int i) {
        int i2 = i / 8;
        int i3 = this.f9789b + i2;
        this.f9789b = i3;
        int i4 = this.f9790c + (i - (i2 * 8));
        this.f9790c = i4;
        if (i4 > 7) {
            this.f9789b = i3 + 1;
            this.f9790c = i4 - 8;
        }
        m8234g();
    }

    /* JADX INFO: renamed from: c */
    public final int m8240c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f9790c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f9790c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f9790c = i4;
            byte[] bArr = this.f9788a;
            int i5 = this.f9789b;
            this.f9789b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f9788a;
        int i6 = this.f9789b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f9790c = 0;
            this.f9789b = i6 + 1;
        }
        m8234g();
        return i7;
    }

    /* JADX INFO: renamed from: c */
    public final void m8241c() {
        int i = this.f9790c + 1;
        this.f9790c = i;
        if (i == 8) {
            this.f9790c = 0;
            this.f9789b++;
        }
        m8234g();
    }

    /* JADX INFO: renamed from: d */
    public final void m8242d(int i) {
        int i2 = i & 16383;
        int iMin = Math.min(8 - this.f9790c, 14);
        int i3 = this.f9790c;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f9788a;
        int i5 = this.f9789b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = 14 - iMin;
        bArr[i5] = (byte) (((i2 >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f9788a[i7] = (byte) (i2 >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f9788a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i2 & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        m8239b(14);
        m8234g();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8243d() {
        boolean z = (this.f9788a[this.f9789b] & (128 >> this.f9790c)) != 0;
        m8241c();
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m8244e() {
        if (this.f9790c == 0) {
            return;
        }
        this.f9790c = 0;
        this.f9789b++;
        m8234g();
    }
}
