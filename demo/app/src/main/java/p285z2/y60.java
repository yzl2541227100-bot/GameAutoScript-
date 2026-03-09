package p285z2;

import org.junit.runner.Description;

/* JADX INFO: loaded from: classes2.dex */
public class y60 extends z80 {
    private final Class<?> OooO00o;

    public y60(Class<?> cls) {
        this.OooO00o = cls;
    }

    @Override // p285z2.z80
    public void OooO00o(f90 f90Var) {
        f90Var.OooO(getDescription());
    }

    @Override // p285z2.z80, p285z2.u80
    public Description getDescription() {
        return Description.createSuiteDescription(this.OooO00o);
    }
}
