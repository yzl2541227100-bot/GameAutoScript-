package p285z2;

import org.junit.internal.AssumptionViolatedException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class q80 implements i80 {

    public class OooO00o extends u90 {
        public final /* synthetic */ q90 OooO00o;
        public final /* synthetic */ u90 OooO0O0;

        public OooO00o(q90 q90Var, u90 u90Var) throws Throwable {
            this.OooO00o = q90Var;
            this.OooO0O0 = u90Var;
        }

        @Override // p285z2.u90
        public void OooO00o() throws Throwable {
            q80.this.OooO0Oo(this.OooO00o);
            try {
                try {
                    this.OooO0O0.OooO00o();
                    q80.this.OooO0o0(this.OooO00o);
                } catch (AssumptionViolatedException e) {
                    throw e;
                } catch (Throwable th) {
                    q80.this.OooO0O0(th, this.OooO00o);
                    throw th;
                }
            } finally {
                q80.this.OooO0OO(this.OooO00o);
            }
        }
    }

    @Override // p285z2.i80
    public u90 OooO00o(u90 u90Var, q90 q90Var, Object obj) {
        return new OooO00o(q90Var, u90Var);
    }

    public void OooO0O0(Throwable th, q90 q90Var) {
    }

    public void OooO0OO(q90 q90Var) {
    }

    public void OooO0Oo(q90 q90Var) {
    }

    public void OooO0o0(q90 q90Var) {
    }
}
