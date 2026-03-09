package p285z2;

/* JADX INFO: renamed from: z2.lm */
/* JADX INFO: loaded from: classes2.dex */
public final class C4103lm extends AbstractC4288qm {
    private final short OooO0OO;
    private final short OooO0Oo;

    public C4103lm(AbstractC4288qm abstractC4288qm, int i, int i2) {
        super(abstractC4288qm);
        this.OooO0OO = (short) i;
        this.OooO0Oo = (short) i2;
    }

    @Override // p285z2.AbstractC4288qm
    public final void OooO0OO(C3735bo c3735bo, byte[] bArr) {
        int i;
        int i2 = 0;
        while (true) {
            short s = this.OooO0Oo;
            if (i2 >= s) {
                return;
            }
            if (i2 == 0 || (i2 == 31 && s <= 62)) {
                int i3 = 5;
                c3735bo.OooO0OO(31, 5);
                short s2 = this.OooO0Oo;
                if (s2 > 62) {
                    i = s2 - 31;
                    i3 = 16;
                } else if (i2 == 0) {
                    c3735bo.OooO0OO(Math.min((int) s2, 31), 5);
                } else {
                    i = s2 - 31;
                }
                c3735bo.OooO0OO(i, i3);
            }
            c3735bo.OooO0OO(bArr[this.OooO0OO + i2], 8);
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.OooO0OO);
        sb.append("::");
        sb.append((this.OooO0OO + this.OooO0Oo) - 1);
        sb.append('>');
        return sb.toString();
    }
}
