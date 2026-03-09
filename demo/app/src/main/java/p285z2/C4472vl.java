package p285z2;

/* JADX INFO: renamed from: z2.vl */
/* JADX INFO: loaded from: classes2.dex */
public final class C4472vl extends AbstractC4509wl {
    private final AbstractC4509wl OooO0OO;

    public C4472vl(AbstractC4509wl abstractC4509wl) {
        super(abstractC4509wl.OooO0o0(), abstractC4509wl.OooO0O0());
        this.OooO0OO = abstractC4509wl;
    }

    @Override // p285z2.AbstractC4509wl
    public final AbstractC4509wl OooO() {
        return new C4472vl(this.OooO0OO.OooO());
    }

    @Override // p285z2.AbstractC4509wl
    public final AbstractC4509wl OooO00o(int i, int i2, int i3, int i4) {
        return new C4472vl(this.OooO0OO.OooO00o(i, i2, i3, i4));
    }

    @Override // p285z2.AbstractC4509wl
    public final byte[] OooO0OO() {
        byte[] bArrOooO0OO = this.OooO0OO.OooO0OO();
        int iOooO0o0 = OooO0o0() * OooO0O0();
        byte[] bArr = new byte[iOooO0o0];
        for (int i = 0; i < iOooO0o0; i++) {
            bArr[i] = (byte) (255 - (bArrOooO0OO[i] & 255));
        }
        return bArr;
    }

    @Override // p285z2.AbstractC4509wl
    public final byte[] OooO0Oo(int i, byte[] bArr) {
        byte[] bArrOooO0Oo = this.OooO0OO.OooO0Oo(i, bArr);
        int iOooO0o0 = OooO0o0();
        for (int i2 = 0; i2 < iOooO0o0; i2++) {
            bArrOooO0Oo[i2] = (byte) (255 - (bArrOooO0Oo[i2] & 255));
        }
        return bArrOooO0Oo;
    }

    @Override // p285z2.AbstractC4509wl
    public final AbstractC4509wl OooO0o() {
        return this.OooO0OO;
    }

    @Override // p285z2.AbstractC4509wl
    public final boolean OooO0oO() {
        return this.OooO0OO.OooO0oO();
    }

    @Override // p285z2.AbstractC4509wl
    public final boolean OooO0oo() {
        return this.OooO0OO.OooO0oo();
    }

    @Override // p285z2.AbstractC4509wl
    public final AbstractC4509wl OooOO0() {
        return new C4472vl(this.OooO0OO.OooOO0());
    }
}
