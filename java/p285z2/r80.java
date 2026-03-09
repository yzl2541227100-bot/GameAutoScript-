package p285z2;

import java.util.concurrent.TimeUnit;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes2.dex */
public class r80 implements o80 {
    private final long OooO00o;
    private final TimeUnit OooO0O0;
    private final boolean OooO0OO;

    public class OooO00o extends u90 {
        public final /* synthetic */ Exception OooO00o;

        public OooO00o(Exception exc) {
            this.OooO00o = exc;
        }

        @Override // p285z2.u90
        public void OooO00o() throws Throwable {
            throw new RuntimeException("Invalid parameters for Timeout", this.OooO00o);
        }
    }

    public static class OooO0O0 {
        private boolean OooO00o = false;
        private long OooO0O0 = 0;
        private TimeUnit OooO0OO = TimeUnit.SECONDS;

        public r80 OooO00o() {
            return new r80(this);
        }

        public boolean OooO0O0() {
            return this.OooO00o;
        }

        public TimeUnit OooO0OO() {
            return this.OooO0OO;
        }

        public long OooO0Oo() {
            return this.OooO0O0;
        }

        public OooO0O0 OooO0o(long j, TimeUnit timeUnit) {
            this.OooO0O0 = j;
            this.OooO0OO = timeUnit;
            return this;
        }

        public OooO0O0 OooO0o0(boolean z) {
            this.OooO00o = z;
            return this;
        }
    }

    @Deprecated
    public r80(int i) {
        this(i, TimeUnit.MILLISECONDS);
    }

    public r80(long j, TimeUnit timeUnit) {
        this.OooO00o = j;
        this.OooO0O0 = timeUnit;
        this.OooO0OO = false;
    }

    public r80(OooO0O0 oooO0O0) {
        this.OooO00o = oooO0O0.OooO0Oo();
        this.OooO0O0 = oooO0O0.OooO0OO();
        this.OooO0OO = oooO0O0.OooO0O0();
    }

    public static OooO0O0 OooO0O0() {
        return new OooO0O0();
    }

    public static r80 OooO0o(long j) {
        return new r80(j, TimeUnit.MILLISECONDS);
    }

    public static r80 OooO0oO(long j) {
        return new r80(j, TimeUnit.SECONDS);
    }

    @Override // p285z2.o80
    public u90 OooO00o(u90 u90Var, Description description) {
        try {
            return OooO0OO(u90Var);
        } catch (Exception e) {
            return new OooO00o(e);
        }
    }

    public u90 OooO0OO(u90 u90Var) throws Exception {
        return y70.OooO0OO().OooO0o(this.OooO00o, this.OooO0O0).OooO0o0(this.OooO0OO).OooO0Oo(u90Var);
    }

    public final boolean OooO0Oo() {
        return this.OooO0OO;
    }

    public final long OooO0o0(TimeUnit timeUnit) {
        return timeUnit.convert(this.OooO00o, this.OooO0O0);
    }
}
