package com.anythink.expressad.exoplayer.p091b;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1506f;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1511k implements InterfaceC1506f {

    /* JADX INFO: renamed from: b */
    private int f7623b;

    /* JADX INFO: renamed from: c */
    private int f7624c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private int[] f7625d;

    /* JADX INFO: renamed from: e */
    private boolean f7626e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private int[] f7627f;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f7628g;

    /* JADX INFO: renamed from: h */
    private ByteBuffer f7629h;

    /* JADX INFO: renamed from: i */
    private boolean f7630i;

    public C1511k() {
        ByteBuffer byteBuffer = InterfaceC1506f.f7547a;
        this.f7628g = byteBuffer;
        this.f7629h = byteBuffer;
        this.f7623b = -1;
        this.f7624c = -1;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final void mo6421a(ByteBuffer byteBuffer) {
        C1711a.m8012b(this.f7627f != null);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f7623b * 2)) * this.f7627f.length * 2;
        if (this.f7628g.capacity() < length) {
            this.f7628g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f7628g.clear();
        }
        while (iPosition < iLimit) {
            for (int i : this.f7627f) {
                this.f7628g.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f7623b * 2;
        }
        byteBuffer.position(iLimit);
        this.f7628g.flip();
        this.f7629h = this.f7628g;
    }

    /* JADX INFO: renamed from: a */
    public final void m6498a(@Nullable int[] iArr) {
        this.f7625d = iArr;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6422a() {
        return this.f7626e;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: a */
    public final boolean mo6423a(int i, int i2, int i3) throws InterfaceC1506f.a {
        boolean z = !Arrays.equals(this.f7625d, this.f7627f);
        int[] iArr = this.f7625d;
        this.f7627f = iArr;
        if (iArr == null) {
            this.f7626e = false;
            return z;
        }
        if (i3 != 2) {
            throw new InterfaceC1506f.a(i, i2, i3);
        }
        if (!z && this.f7624c == i && this.f7623b == i2) {
            return false;
        }
        this.f7624c = i;
        this.f7623b = i2;
        this.f7626e = i2 != iArr.length;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f7627f;
            if (i4 >= iArr2.length) {
                return true;
            }
            int i5 = iArr2[i4];
            if (i5 >= i2) {
                throw new InterfaceC1506f.a(i, i2, i3);
            }
            this.f7626e = (i5 != i4) | this.f7626e;
            i4++;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: b */
    public final int mo6424b() {
        int[] iArr = this.f7627f;
        return iArr == null ? this.f7623b : iArr.length;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: c */
    public final int mo6425c() {
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: d */
    public final int mo6426d() {
        return this.f7624c;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: e */
    public final void mo6427e() {
        this.f7630i = true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: f */
    public final ByteBuffer mo6428f() {
        ByteBuffer byteBuffer = this.f7629h;
        this.f7629h = InterfaceC1506f.f7547a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: g */
    public final boolean mo6429g() {
        return this.f7630i && this.f7629h == InterfaceC1506f.f7547a;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: h */
    public final void mo6430h() {
        this.f7629h = InterfaceC1506f.f7547a;
        this.f7630i = false;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1506f
    /* JADX INFO: renamed from: i */
    public final void mo6431i() {
        mo6430h();
        this.f7628g = InterfaceC1506f.f7547a;
        this.f7623b = -1;
        this.f7624c = -1;
        this.f7627f = null;
        this.f7625d = null;
        this.f7626e = false;
    }
}
