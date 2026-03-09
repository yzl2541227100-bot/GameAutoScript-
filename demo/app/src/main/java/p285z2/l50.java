package p285z2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public class l50 extends t80 {
    private final boolean OooO00o;
    private final boolean OooO0O0;

    public static class OooO00o implements t90 {
        private final ExecutorService OooO00o = Executors.newCachedThreadPool();

        @Override // p285z2.t90
        public void OooO00o(Runnable runnable) {
            this.OooO00o.submit(runnable);
        }

        @Override // p285z2.t90
        public void OooO0O0() {
            try {
                this.OooO00o.shutdown();
                this.OooO00o.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
        }
    }

    public l50(boolean z, boolean z3) {
        this.OooO00o = z;
        this.OooO0O0 = z3;
    }

    public static t80 OooO0Oo() {
        return new l50(true, false);
    }

    private static z80 OooO0o(z80 z80Var) {
        if (z80Var instanceof l90) {
            ((l90) z80Var).OooOo(new OooO00o());
        }
        return z80Var;
    }

    public static t80 OooO0o0() {
        return new l50(false, true);
    }

    @Override // p285z2.t80
    public z80 OooO00o(s90 s90Var, Class<?> cls) throws Throwable {
        z80 z80VarOooO00o = super.OooO00o(s90Var, cls);
        return this.OooO0O0 ? OooO0o(z80VarOooO00o) : z80VarOooO00o;
    }

    @Override // p285z2.t80
    public z80 OooO0O0(s90 s90Var, Class<?>[] clsArr) throws InitializationError {
        z80 z80VarOooO0O0 = super.OooO0O0(s90Var, clsArr);
        return this.OooO00o ? OooO0o(z80VarOooO0O0) : z80VarOooO0O0;
    }
}
