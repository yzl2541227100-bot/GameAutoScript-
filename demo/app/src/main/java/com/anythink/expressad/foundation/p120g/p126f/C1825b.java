package com.anythink.expressad.foundation.p120g.p126f;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1825b implements InterfaceC1859l {

    /* JADX INFO: renamed from: a */
    private int f11294a;

    /* JADX INFO: renamed from: b */
    private int f11295b;

    /* JADX INFO: renamed from: c */
    private final int f11296c;

    /* JADX INFO: renamed from: d */
    private int f11297d;

    /* JADX INFO: renamed from: e */
    private int f11298e;

    /* JADX INFO: renamed from: f */
    private int f11299f;

    /* JADX INFO: renamed from: g */
    private int f11300g;

    /* JADX INFO: renamed from: h */
    private int f11301h;

    public C1825b() {
        this((byte) 0);
    }

    private C1825b(byte b) {
        this.f11297d = 2;
        this.f11298e = 0;
        this.f11299f = 0;
        this.f11300g = 0;
        this.f11301h = 0;
        this.f11294a = 30000;
        this.f11296c = 0;
    }

    private C1825b(int i, int i2, int i3, int i4, int i5) {
        this.f11297d = 2;
        this.f11298e = 0;
        this.f11299f = 0;
        this.f11300g = 0;
        this.f11301h = 0;
        this.f11298e = Math.max(i, 0);
        this.f11299f = Math.max(i2, 0);
        this.f11300g = Math.max(i3, 0);
        this.f11301h = Math.max(i4, 0);
        this.f11296c = Math.max(i5, 0);
    }

    private C1825b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f11297d = 2;
        this.f11298e = 0;
        this.f11299f = 0;
        this.f11300g = 0;
        this.f11301h = 0;
        this.f11298e = Math.max(i, 0);
        this.f11299f = Math.max(i2, 0);
        this.f11300g = Math.max(i3, 0);
        this.f11301h = Math.max(i4, 0);
        this.f11296c = Math.max(i5, 0);
        this.f11297d = i6;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l
    /* JADX INFO: renamed from: a */
    public final int mo9490a() {
        return this.f11296c;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l
    /* JADX INFO: renamed from: b */
    public final int mo9491b() {
        return this.f11294a;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l
    /* JADX INFO: renamed from: c */
    public final int mo9492c() {
        return this.f11295b;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l
    /* JADX INFO: renamed from: d */
    public final boolean mo9493d() {
        int i = this.f11295b + 1;
        this.f11295b = i;
        return i <= this.f11296c;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l
    /* JADX INFO: renamed from: e */
    public final int mo9494e() {
        return this.f11298e;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l
    /* JADX INFO: renamed from: f */
    public final int mo9495f() {
        return this.f11299f;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l
    /* JADX INFO: renamed from: g */
    public final int mo9496g() {
        return this.f11300g;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l
    /* JADX INFO: renamed from: h */
    public final int mo9497h() {
        return this.f11301h;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1859l
    /* JADX INFO: renamed from: i */
    public final int mo9498i() {
        return this.f11297d;
    }
}
