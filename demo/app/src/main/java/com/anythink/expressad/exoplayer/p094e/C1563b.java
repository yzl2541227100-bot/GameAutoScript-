package com.anythink.expressad.exoplayer.p094e;

import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1563b implements InterfaceC1567f {

    /* JADX INFO: renamed from: a */
    private static final int f8360a = 65536;

    /* JADX INFO: renamed from: b */
    private static final int f8361b = 524288;

    /* JADX INFO: renamed from: c */
    private static final int f8362c = 4096;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1691h f8364e;

    /* JADX INFO: renamed from: f */
    private final long f8365f;

    /* JADX INFO: renamed from: g */
    private long f8366g;

    /* JADX INFO: renamed from: i */
    private int f8368i;

    /* JADX INFO: renamed from: j */
    private int f8369j;

    /* JADX INFO: renamed from: h */
    private byte[] f8367h = new byte[65536];

    /* JADX INFO: renamed from: d */
    private final byte[] f8363d = new byte[4096];

    public C1563b(InterfaceC1691h interfaceC1691h, long j, long j2) {
        this.f8364e = interfaceC1691h;
        this.f8366g = j;
        this.f8365f = j2;
    }

    /* JADX INFO: renamed from: a */
    private int m6958a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, EOFException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iMo7741a = this.f8364e.mo7741a(bArr, i + i3, i2 - i3);
        if (iMo7741a != -1) {
            return i3 + iMo7741a;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: e */
    private int m6959e(byte[] bArr, int i, int i2) {
        int i3 = this.f8369j;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f8367h, 0, bArr, i, iMin);
        m6962h(iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: f */
    private void m6960f(int i) {
        int i2 = this.f8368i + i;
        byte[] bArr = this.f8367h;
        if (i2 > bArr.length) {
            this.f8367h = Arrays.copyOf(this.f8367h, C1717af.m8050a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* JADX INFO: renamed from: g */
    private int m6961g(int i) {
        int iMin = Math.min(this.f8369j, i);
        m6962h(iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: h */
    private void m6962h(int i) {
        int i2 = this.f8369j - i;
        this.f8369j = i2;
        this.f8368i = 0;
        byte[] bArr = this.f8367h;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f8367h = bArr2;
    }

    /* JADX INFO: renamed from: i */
    private void m6963i(int i) {
        if (i != -1) {
            this.f8366g += (long) i;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: a */
    public final int mo6964a(int i) throws InterruptedException, EOFException {
        int iM6961g = m6961g(i);
        if (iM6961g == 0) {
            byte[] bArr = this.f8363d;
            iM6961g = m6958a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m6963i(iM6961g);
        return iM6961g;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: a */
    public final int mo6965a(byte[] bArr, int i, int i2) throws InterruptedException, EOFException {
        int iM6959e = m6959e(bArr, i, i2);
        if (iM6959e == 0) {
            iM6959e = m6958a(bArr, i, i2, 0, true);
        }
        m6963i(iM6959e);
        return iM6959e;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: a */
    public final void mo6966a() {
        this.f8368i = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: a */
    public final <E extends Throwable> void mo6967a(long j, E e) throws E {
        C1711a.m8010a(j >= 0);
        this.f8366g = j;
        throw e;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: a */
    public final boolean mo6968a(byte[] bArr, int i, int i2, boolean z) throws InterruptedException, EOFException {
        int iM6959e = m6959e(bArr, i, i2);
        while (iM6959e < i2 && iM6959e != -1) {
            iM6959e = m6958a(bArr, i, i2, iM6959e, z);
        }
        m6963i(iM6959e);
        return iM6959e != -1;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: b */
    public final long mo6969b() {
        return this.f8366g + ((long) this.f8368i);
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: b */
    public final void mo6970b(byte[] bArr, int i, int i2) throws InterruptedException, EOFException {
        mo6968a(bArr, i, i2, false);
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: b */
    public final boolean mo6971b(int i) throws InterruptedException, EOFException {
        int iM6961g = m6961g(i);
        while (iM6961g < i && iM6961g != -1) {
            iM6961g = m6958a(this.f8363d, -iM6961g, Math.min(i, this.f8363d.length + iM6961g), iM6961g, false);
        }
        m6963i(iM6961g);
        return iM6961g != -1;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: c */
    public final long mo6972c() {
        return this.f8366g;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: c */
    public final void mo6973c(int i) throws InterruptedException, EOFException {
        int iM6961g = m6961g(i);
        while (iM6961g < i && iM6961g != -1) {
            iM6961g = m6958a(this.f8363d, -iM6961g, Math.min(i, this.f8363d.length + iM6961g), iM6961g, false);
        }
        m6963i(iM6961g);
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: c */
    public final boolean mo6974c(byte[] bArr, int i, int i2) {
        if (!mo6977d(i2)) {
            return false;
        }
        System.arraycopy(this.f8367h, this.f8368i - i2, bArr, i, i2);
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: d */
    public final long mo6975d() {
        return this.f8365f;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: d */
    public final void mo6976d(byte[] bArr, int i, int i2) {
        if (mo6977d(i2)) {
            System.arraycopy(this.f8367h, this.f8368i - i2, bArr, i, i2);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: d */
    public final boolean mo6977d(int i) throws InterruptedException, EOFException {
        m6960f(i);
        int iMin = Math.min(this.f8369j - this.f8368i, i);
        while (iMin < i) {
            iMin = m6958a(this.f8367h, this.f8368i, i, iMin, false);
            if (iMin == -1) {
                return false;
            }
        }
        int i2 = this.f8368i + i;
        this.f8368i = i2;
        this.f8369j = Math.max(this.f8369j, i2);
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1567f
    /* JADX INFO: renamed from: e */
    public final void mo6978e(int i) throws InterruptedException, EOFException {
        mo6977d(i);
    }
}
