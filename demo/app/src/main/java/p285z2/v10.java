package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class v10 extends u10 {
    private final y10[] OooO0Oo;

    public v10(Class cls, boolean z, y10[] y10VarArr) {
        super(cls, null, z);
        this.OooO0Oo = y10VarArr;
    }

    @Override // p285z2.w10
    public synchronized r10[] OooO00o() {
        r10[] r10VarArr;
        int length = this.OooO0Oo.length;
        r10VarArr = new r10[length];
        for (int i = 0; i < length; i++) {
            y10 y10Var = this.OooO0Oo[i];
            r10VarArr[i] = OooO0oO(y10Var.OooO00o, y10Var.OooO0OO, y10Var.OooO0O0, y10Var.OooO0Oo, y10Var.OooO0o0);
        }
        return r10VarArr;
    }
}
