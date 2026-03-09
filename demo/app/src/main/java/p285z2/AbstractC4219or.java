package p285z2;

/* JADX INFO: renamed from: z2.or */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4219or extends AbstractC4182nr {
    public AbstractC4219or(C3735bo c3735bo) {
        super(c3735bo);
    }

    public abstract int OooO(int i);

    public abstract void OooO0oo(StringBuilder sb, int i);

    public final void OooOO0(StringBuilder sb, int i, int i2) {
        int iOooO0o = OooO0O0().OooO0o(i, i2);
        OooO0oo(sb, iOooO0o);
        int iOooO = OooO(iOooO0o);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (iOooO / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(iOooO);
    }
}
