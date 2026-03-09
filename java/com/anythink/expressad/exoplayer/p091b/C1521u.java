package com.anythink.expressad.exoplayer.p091b;

import com.anythink.expressad.exoplayer.p091b.InterfaceC1506f;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1521u implements InterfaceC1506f {

    /* JADX INFO: renamed from: b */
    private boolean f7842b;

    /* JADX INFO: renamed from: c */
    private int f7843c;

    /* JADX INFO: renamed from: d */
    private int f7844d;

    /* JADX INFO: renamed from: e */
    private int f7845e;

    /* JADX INFO: renamed from: f */
    private int f7846f;

    /* JADX INFO: renamed from: g */
    private int f7847g;

    /* JADX INFO: renamed from: h */
    private ByteBuffer f7848h;

    /* JADX INFO: renamed from: i */
    private ByteBuffer f7849i;

    /* JADX INFO: renamed from: j */
    private byte[] f7850j;

    /* JADX INFO: renamed from: k */
    private int f7851k;

    /* JADX INFO: renamed from: l */
    private boolean f7852l;

    public C1521u() {
        ByteBuffer byteBuffer = InterfaceC1506f.f7547a;
        this.f7848h = byteBuffer;
        this.f7849i = byteBuffer;
        this.f7845e = -1;
        this.f7846f = -1;
        this.f7850j = new byte[0];
    }

    /* JADX INFO: renamed from: a */
    public final void m6630a(int i, int i2) {
        this.f7843c = i;
        this.f7844d = i2;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final void mo6421a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int iMin = Math.min(i, this.f7847g);
        this.f7847g -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f7847g > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f7851k + i2) - this.f7850j.length;
        if (this.f7848h.capacity() < length) {
            this.f7848h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f7848h.clear();
        }
        int iM8050a = C1717af.m8050a(length, 0, this.f7851k);
        this.f7848h.put(this.f7850j, 0, iM8050a);
        int iM8050a2 = C1717af.m8050a(length - iM8050a, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM8050a2);
        this.f7848h.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM8050a2;
        int i4 = this.f7851k - iM8050a;
        this.f7851k = i4;
        byte[] bArr = this.f7850j;
        System.arraycopy(bArr, iM8050a, bArr, 0, i4);
        byteBuffer.get(this.f7850j, this.f7851k, i3);
        this.f7851k += i3;
        this.f7848h.flip();
        this.f7849i = this.f7848h;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6422a() {
        return this.f7842b;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6423a(int i, int i2, int i3) throws InterfaceC1506f.a {
        if (i3 != 2) {
            throw new InterfaceC1506f.a(i, i2, i3);
        }
        this.f7845e = i2;
        this.f7846f = i;
        int i4 = this.f7844d;
        this.f7850j = new byte[i4 * i2 * 2];
        this.f7851k = 0;
        int i5 = this.f7843c;
        this.f7847g = i2 * i5 * 2;
        boolean z = this.f7842b;
        boolean z3 = (i5 == 0 && i4 == 0) ? false : true;
        this.f7842b = z3;
        return z != z3;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: b */
    public final int mo6424b() {
        return this.f7845e;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: c */
    public final int mo6425c() {
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: d */
    public final int mo6426d() {
        return this.f7846f;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: e */
    public final void mo6427e() {
        this.f7852l = true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: f */
    public final ByteBuffer mo6428f() {
        ByteBuffer byteBuffer = this.f7849i;
        this.f7849i = InterfaceC1506f.f7547a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: g */
    public final boolean mo6429g() {
        return this.f7852l && this.f7849i == InterfaceC1506f.f7547a;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: h */
    public final void mo6430h() {
        this.f7849i = InterfaceC1506f.f7547a;
        this.f7852l = false;
        this.f7847g = 0;
        this.f7851k = 0;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: i */
    public final void mo6431i() {
        mo6430h();
        this.f7848h = InterfaceC1506f.f7547a;
        this.f7845e = -1;
        this.f7846f = -1;
        this.f7850j = new byte[0];
    }
}
