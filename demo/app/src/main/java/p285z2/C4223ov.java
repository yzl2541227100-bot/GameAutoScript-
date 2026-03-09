package p285z2;

/* JADX INFO: renamed from: z2.ov */
/* JADX INFO: loaded from: classes2.dex */
public final class C4223ov extends AbstractC4260pv {
    private final AbstractC4260pv OooO0OO;

    public C4223ov(AbstractC4260pv abstractC4260pv) {
        super(abstractC4260pv.OooO0o0(), abstractC4260pv.OooO0O0());
        this.OooO0OO = abstractC4260pv;
    }

    @Override // p285z2.AbstractC4260pv
    public AbstractC4260pv OooO() {
        return new C4223ov(this.OooO0OO.OooO());
    }

    @Override // p285z2.AbstractC4260pv
    public AbstractC4260pv OooO00o(int i, int i2, int i3, int i4) {
        return new C4223ov(this.OooO0OO.OooO00o(i, i2, i3, i4));
    }

    @Override // p285z2.AbstractC4260pv
    public byte[] OooO0OO() {
        byte[] bArrOooO0OO = this.OooO0OO.OooO0OO();
        int iOooO0o0 = OooO0o0() * OooO0O0();
        byte[] bArr = new byte[iOooO0o0];
        for (int i = 0; i < iOooO0o0; i++) {
            bArr[i] = (byte) (255 - (bArrOooO0OO[i] & 255));
        }
        return bArr;
    }

    @Override // p285z2.AbstractC4260pv
    public byte[] OooO0Oo(int i, byte[] bArr) {
        byte[] bArrOooO0Oo = this.OooO0OO.OooO0Oo(i, bArr);
        int iOooO0o0 = OooO0o0();
        for (int i2 = 0; i2 < iOooO0o0; i2++) {
            bArrOooO0Oo[i2] = (byte) (255 - (bArrOooO0Oo[i2] & 255));
        }
        return bArrOooO0Oo;
    }

    @Override // p285z2.AbstractC4260pv
    public AbstractC4260pv OooO0o() {
        return this.OooO0OO;
    }

    @Override // p285z2.AbstractC4260pv
    public boolean OooO0oO() {
        return this.OooO0OO.OooO0oO();
    }

    @Override // p285z2.AbstractC4260pv
    public boolean OooO0oo() {
        return this.OooO0OO.OooO0oo();
    }

    @Override // p285z2.AbstractC4260pv
    public AbstractC4260pv OooOO0() {
        return new C4223ov(this.OooO0OO.OooOO0());
    }
}
