package p285z2;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class v60 extends s90 {
    private final boolean OooO0O0;

    public v60(boolean z) {
        this.OooO0O0 = z;
    }

    public x60 OooO() {
        return new x60();
    }

    @Override // p285z2.s90
    public z80 OooO0OO(Class<?> cls) throws Throwable {
        Iterator it = Arrays.asList(OooO(), OooO0oo(), OooOO0o(), OooOO0(), OooOO0O()).iterator();
        while (it.hasNext()) {
            z80 z80VarOooO0oO = ((s90) it.next()).OooO0oO(cls);
            if (z80VarOooO0oO != null) {
                return z80VarOooO0oO;
            }
        }
        return null;
    }

    public w60 OooO0oo() {
        return new w60(this);
    }

    public z60 OooOO0() {
        return new z60();
    }

    public a70 OooOO0O() {
        return new a70();
    }

    public s90 OooOO0o() {
        return this.OooO0O0 ? new c70() : new b70();
    }
}
