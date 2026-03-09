package com.anythink.expressad.exoplayer.p107k;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1737t {

    /* JADX INFO: renamed from: a */
    private byte[] f9795a;

    /* JADX INFO: renamed from: b */
    private int f9796b;

    /* JADX INFO: renamed from: c */
    private int f9797c;

    /* JADX INFO: renamed from: d */
    private int f9798d = 0;

    public C1737t(byte[] bArr, int i, int i2) {
        this.f9795a = bArr;
        this.f9797c = i;
        this.f9796b = i2;
        m8293g();
    }

    /* JADX INFO: renamed from: a */
    private void m8288a(byte[] bArr, int i, int i2) {
        this.f9795a = bArr;
        this.f9797c = i;
        this.f9796b = i2;
        this.f9798d = 0;
        m8293g();
    }

    /* JADX INFO: renamed from: c */
    private boolean m8289c(int i) {
        int i2 = this.f9797c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f9798d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f9796b) {
                break;
            }
            if (m8290d(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f9796b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private boolean m8290d(int i) {
        if (2 > i || i >= this.f9796b) {
            return false;
        }
        byte[] bArr = this.f9795a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: e */
    private boolean m8291e() {
        int i = this.f9797c;
        int i2 = this.f9798d;
        int i3 = 0;
        while (this.f9797c < this.f9796b && !m8297b()) {
            i3++;
        }
        boolean z = this.f9797c == this.f9796b;
        this.f9797c = i;
        this.f9798d = i2;
        if (!z) {
            int i4 = (i3 * 2) + 1;
            int i5 = i4 / 8;
            int i6 = i + i5;
            int i7 = (i2 + i4) - (i5 * 8);
            if (i7 > 7) {
                i6++;
                i7 -= 8;
            }
            while (true) {
                i++;
                if (i > i6 || i6 >= this.f9796b) {
                    break;
                }
                if (m8290d(i)) {
                    i6++;
                    i += 2;
                }
            }
            int i8 = this.f9796b;
            if (i6 < i8 || (i6 == i8 && i7 == 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private int m8292f() {
        int i = 0;
        while (!m8297b()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m8296b(i) : 0);
    }

    /* JADX INFO: renamed from: g */
    private void m8293g() {
        int i;
        int i2 = this.f9797c;
        C1711a.m8012b(i2 >= 0 && (i2 < (i = this.f9796b) || (i2 == i && this.f9798d == 0)));
    }

    /* JADX INFO: renamed from: a */
    public final void m8294a() {
        int i = this.f9798d + 1;
        this.f9798d = i;
        if (i == 8) {
            this.f9798d = 0;
            int i2 = this.f9797c;
            this.f9797c = i2 + (m8290d(i2 + 1) ? 2 : 1);
        }
        m8293g();
    }

    /* JADX INFO: renamed from: a */
    public final void m8295a(int i) {
        int i2 = this.f9797c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f9797c = i4;
        int i5 = this.f9798d + (i - (i3 * 8));
        this.f9798d = i5;
        if (i5 > 7) {
            this.f9797c = i4 + 1;
            this.f9798d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f9797c) {
                m8293g();
                return;
            } else if (m8290d(i2)) {
                this.f9797c++;
                i2 += 2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m8296b(int i) {
        int i2;
        this.f9798d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f9798d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f9798d = i4;
            byte[] bArr = this.f9795a;
            int i5 = this.f9797c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!m8290d(i5 + 1)) {
                i = 1;
            }
            this.f9797c = i5 + i;
        }
        byte[] bArr2 = this.f9795a;
        int i6 = this.f9797c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f9798d = 0;
            this.f9797c = i6 + (m8290d(i6 + 1) ? 2 : 1);
        }
        m8293g();
        return i7;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8297b() {
        boolean z = (this.f9795a[this.f9797c] & (128 >> this.f9798d)) != 0;
        m8294a();
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final int m8298c() {
        return m8292f();
    }

    /* JADX INFO: renamed from: d */
    public final int m8299d() {
        int iM8292f = m8292f();
        return (iM8292f % 2 == 0 ? -1 : 1) * ((iM8292f + 1) / 2);
    }
}
