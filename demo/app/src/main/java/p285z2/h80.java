package p285z2;

import org.junit.runner.Description;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h80 implements o80 {

    public class OooO00o extends u90 {
        public final /* synthetic */ u90 OooO00o;

        public OooO00o(u90 u90Var) throws Throwable {
            this.OooO00o = u90Var;
        }

        @Override // p285z2.u90
        public void OooO00o() throws Throwable {
            h80.this.OooO0OO();
            try {
                this.OooO00o.OooO00o();
            } finally {
                h80.this.OooO0O0();
            }
        }
    }

    private u90 OooO0Oo(u90 u90Var) {
        return new OooO00o(u90Var);
    }

    @Override // p285z2.o80
    public u90 OooO00o(u90 u90Var, Description description) {
        return OooO0Oo(u90Var);
    }

    public void OooO0O0() {
    }

    public void OooO0OO() throws Throwable {
    }
}
