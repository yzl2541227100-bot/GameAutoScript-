package p285z2;

import java.util.Comparator;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes2.dex */
public class j70 extends x80 {
    private final x80 OooO00o;
    private final Comparator<Description> OooO0O0;

    public j70(x80 x80Var, Comparator<Description> comparator) {
        this.OooO00o = x80Var;
        this.OooO0O0 = comparator;
    }

    @Override // p285z2.x80
    public z80 OooO0oo() {
        z80 z80VarOooO0oo = this.OooO00o.OooO0oo();
        new d90(this.OooO0O0).OooO00o(z80VarOooO0oo);
        return z80VarOooO0oo;
    }
}
