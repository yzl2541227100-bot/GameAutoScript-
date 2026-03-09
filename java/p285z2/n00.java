package p285z2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class n00 extends d10 {
    private d10 OooO0o0;

    public n00(d10 d10Var) {
        if (d10Var == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.OooO0o0 = d10Var;
    }

    @Override // p285z2.d10
    public long OooO() {
        return this.OooO0o0.OooO();
    }

    @Override // p285z2.d10
    public d10 OooO00o() {
        return this.OooO0o0.OooO00o();
    }

    @Override // p285z2.d10
    public d10 OooO0O0() {
        return this.OooO0o0.OooO0O0();
    }

    @Override // p285z2.d10
    public long OooO0Oo() {
        return this.OooO0o0.OooO0Oo();
    }

    @Override // p285z2.d10
    public boolean OooO0o() {
        return this.OooO0o0.OooO0o();
    }

    @Override // p285z2.d10
    public d10 OooO0o0(long j) {
        return this.OooO0o0.OooO0o0(j);
    }

    @Override // p285z2.d10
    public void OooO0oO() throws IOException {
        this.OooO0o0.OooO0oO();
    }

    @Override // p285z2.d10
    public d10 OooO0oo(long j, TimeUnit timeUnit) {
        return this.OooO0o0.OooO0oo(j, timeUnit);
    }

    public final d10 OooOO0O() {
        return this.OooO0o0;
    }

    public final n00 OooOO0o(d10 d10Var) {
        if (d10Var == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.OooO0o0 = d10Var;
        return this;
    }
}
