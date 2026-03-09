package p285z2;

/* JADX INFO: renamed from: z2.om */
/* JADX INFO: loaded from: classes2.dex */
public final class C4215om extends AbstractC4288qm {
    private final short OooO0OO;
    private final short OooO0Oo;

    public C4215om(AbstractC4288qm abstractC4288qm, int i, int i2) {
        super(abstractC4288qm);
        this.OooO0OO = (short) i;
        this.OooO0Oo = (short) i2;
    }

    @Override // p285z2.AbstractC4288qm
    public final void OooO0OO(C3735bo c3735bo, byte[] bArr) {
        c3735bo.OooO0OO(this.OooO0OO, this.OooO0Oo);
    }

    public final String toString() {
        short s = this.OooO0OO;
        short s2 = this.OooO0Oo;
        return "<" + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.OooO0Oo)).substring(1) + '>';
    }
}
