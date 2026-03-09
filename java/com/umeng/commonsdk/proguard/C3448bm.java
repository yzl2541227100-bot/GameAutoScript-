package com.umeng.commonsdk.proguard;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.bm */
/* JADX INFO: loaded from: classes2.dex */
public final class C3448bm extends AbstractC3449bn {

    /* JADX INFO: renamed from: a */
    private byte[] f18787a;

    /* JADX INFO: renamed from: b */
    private int f18788b;

    /* JADX INFO: renamed from: c */
    private int f18789c;

    public C3448bm() {
    }

    public C3448bm(byte[] bArr) {
        m15869a(bArr);
    }

    public C3448bm(byte[] bArr, int i, int i2) {
        m15870c(bArr, i, i2);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: a */
    public int mo15862a(byte[] bArr, int i, int i2) throws C3450bo {
        int iMo15874h = mo15874h();
        if (i2 > iMo15874h) {
            i2 = iMo15874h;
        }
        if (i2 > 0) {
            System.arraycopy(this.f18787a, this.f18788b, bArr, i, i2);
            mo15868a(i2);
        }
        return i2;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: a */
    public void mo15868a(int i) {
        this.f18788b += i;
    }

    /* JADX INFO: renamed from: a */
    public void m15869a(byte[] bArr) {
        m15870c(bArr, 0, bArr.length);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: a */
    public boolean mo15863a() {
        return true;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: b */
    public void mo15864b() throws C3450bo {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: b */
    public void mo15865b(byte[] bArr, int i, int i2) throws C3450bo {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: c */
    public void mo15866c() {
    }

    /* JADX INFO: renamed from: c */
    public void m15870c(byte[] bArr, int i, int i2) {
        this.f18787a = bArr;
        this.f18788b = i;
        this.f18789c = i + i2;
    }

    /* JADX INFO: renamed from: e */
    public void m15871e() {
        this.f18787a = null;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: f */
    public byte[] mo15872f() {
        return this.f18787a;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: g */
    public int mo15873g() {
        return this.f18788b;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: h */
    public int mo15874h() {
        return this.f18789c - this.f18788b;
    }
}
