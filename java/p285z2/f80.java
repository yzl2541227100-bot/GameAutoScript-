package p285z2;

import org.junit.runner.Description;

/* JADX INFO: loaded from: classes2.dex */
public class f80 implements o80 {
    private final g80 OooO00o = new g80();
    private String OooO0O0 = "Expected test to throw %s";

    public class OooO00o extends u90 {
        private final u90 OooO00o;

        public OooO00o(u90 u90Var) {
            this.OooO00o = u90Var;
        }

        @Override // p285z2.u90
        public void OooO00o() throws Throwable {
            try {
                this.OooO00o.OooO00o();
                if (f80.this.OooOOO()) {
                    f80.this.OooOO0();
                }
            } catch (Throwable th) {
                f80.this.OooOOO0(th);
            }
        }
    }

    private f80() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOO0() throws AssertionError {
        d50.OooooO0(OooOOOO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean OooOOO() {
        return this.OooO00o.OooO0o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOOO0(Throwable th) throws Throwable {
        if (!OooOOO()) {
            throw th;
        }
        d50.OoooOOO(th, this.OooO00o.OooO0OO());
    }

    private String OooOOOO() {
        return String.format(this.OooO0O0, s20.OooOOOO(this.OooO00o.OooO0OO()));
    }

    public static f80 OooOOOo() {
        return new f80();
    }

    public void OooO(p20<String> p20Var) {
        OooO0o(f70.OooO0oO(p20Var));
    }

    @Override // p285z2.o80
    public u90 OooO00o(u90 u90Var, Description description) {
        return new OooO00o(u90Var);
    }

    public void OooO0o(p20<?> p20Var) {
        this.OooO00o.OooO00o(p20Var);
    }

    public void OooO0o0(Class<? extends Throwable> cls) {
        OooO0o(i20.OooOoo(cls));
    }

    public void OooO0oO(p20<? extends Throwable> p20Var) {
        OooO0o(e70.OooO0oO(p20Var));
    }

    public void OooO0oo(String str) {
        OooO(i20.OooOOoo(str));
    }

    @Deprecated
    public f80 OooOO0O() {
        return this;
    }

    @Deprecated
    public f80 OooOO0o() {
        return this;
    }

    public f80 OooOOo0(String str) {
        this.OooO0O0 = str;
        return this;
    }
}
