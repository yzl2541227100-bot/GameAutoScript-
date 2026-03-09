package p285z2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p285z2.InterfaceC4040jx;

/* JADX INFO: renamed from: z2.uy */
/* JADX INFO: loaded from: classes2.dex */
public final class C4448uy implements InterfaceC4040jx.OooO00o {
    private final int OooO;
    private final List<InterfaceC4040jx> OooO00o;
    private final C4189ny OooO0O0;
    private final InterfaceC4300qy OooO0OO;
    private final C4078ky OooO0Oo;
    private final C4225ox OooO0o;
    private final int OooO0o0;
    private final InterfaceC4335rw OooO0oO;
    private final AbstractC3855ex OooO0oo;
    private final int OooOO0;
    private final int OooOO0O;
    private int OooOO0o;

    public C4448uy(List<InterfaceC4040jx> list, C4189ny c4189ny, InterfaceC4300qy interfaceC4300qy, C4078ky c4078ky, int i, C4225ox c4225ox, InterfaceC4335rw interfaceC4335rw, AbstractC3855ex abstractC3855ex, int i2, int i3, int i4) {
        this.OooO00o = list;
        this.OooO0Oo = c4078ky;
        this.OooO0O0 = c4189ny;
        this.OooO0OO = interfaceC4300qy;
        this.OooO0o0 = i;
        this.OooO0o = c4225ox;
        this.OooO0oO = interfaceC4335rw;
        this.OooO0oo = abstractC3855ex;
        this.OooO = i2;
        this.OooOO0 = i3;
        this.OooOO0O = i4;
    }

    public AbstractC3855ex OooO() {
        return this.OooO0oo;
    }

    @Override // p285z2.InterfaceC4040jx.OooO00o
    public InterfaceC4040jx.OooO00o OooO00o(int i, TimeUnit timeUnit) {
        return new C4448uy(this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO0oO, this.OooO0oo, this.OooO, this.OooOO0, C4558xx.OooO0o0("timeout", i, timeUnit));
    }

    @Override // p285z2.InterfaceC4040jx.OooO00o
    public int OooO0O0() {
        return this.OooOO0;
    }

    @Override // p285z2.InterfaceC4040jx.OooO00o
    public int OooO0OO() {
        return this.OooOO0O;
    }

    @Override // p285z2.InterfaceC4040jx.OooO00o
    public InterfaceC4040jx.OooO00o OooO0Oo(int i, TimeUnit timeUnit) {
        return new C4448uy(this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO0oO, this.OooO0oo, C4558xx.OooO0o0("timeout", i, timeUnit), this.OooOO0, this.OooOO0O);
    }

    @Override // p285z2.InterfaceC4040jx.OooO00o
    public InterfaceC4520ww OooO0o() {
        return this.OooO0Oo;
    }

    @Override // p285z2.InterfaceC4040jx.OooO00o
    public C4299qx OooO0o0(C4225ox c4225ox) throws IOException {
        return OooOO0O(c4225ox, this.OooO0O0, this.OooO0OO, this.OooO0Oo);
    }

    @Override // p285z2.InterfaceC4040jx.OooO00o
    public InterfaceC4040jx.OooO00o OooO0oO(int i, TimeUnit timeUnit) {
        return new C4448uy(this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO0oO, this.OooO0oo, this.OooO, C4558xx.OooO0o0("timeout", i, timeUnit), this.OooOO0O);
    }

    @Override // p285z2.InterfaceC4040jx.OooO00o
    public int OooO0oo() {
        return this.OooO;
    }

    public InterfaceC4300qy OooOO0() {
        return this.OooO0OO;
    }

    public C4299qx OooOO0O(C4225ox c4225ox, C4189ny c4189ny, InterfaceC4300qy interfaceC4300qy, C4078ky c4078ky) throws IOException {
        if (this.OooO0o0 >= this.OooO00o.size()) {
            throw new AssertionError();
        }
        this.OooOO0o++;
        if (this.OooO0OO != null && !this.OooO0Oo.OooOo0(c4225ox.OooOO0O())) {
            throw new IllegalStateException("network interceptor " + this.OooO00o.get(this.OooO0o0 - 1) + " must retain the same host and port");
        }
        if (this.OooO0OO != null && this.OooOO0o > 1) {
            throw new IllegalStateException("network interceptor " + this.OooO00o.get(this.OooO0o0 - 1) + " must call proceed() exactly once");
        }
        C4448uy c4448uy = new C4448uy(this.OooO00o, c4189ny, interfaceC4300qy, c4078ky, this.OooO0o0 + 1, c4225ox, this.OooO0oO, this.OooO0oo, this.OooO, this.OooOO0, this.OooOO0O);
        InterfaceC4040jx interfaceC4040jx = this.OooO00o.get(this.OooO0o0);
        C4299qx c4299qxIntercept = interfaceC4040jx.intercept(c4448uy);
        if (interfaceC4300qy != null && this.OooO0o0 + 1 < this.OooO00o.size() && c4448uy.OooOO0o != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC4040jx + " must call proceed() exactly once");
        }
        if (c4299qxIntercept == null) {
            throw new NullPointerException("interceptor " + interfaceC4040jx + " returned null");
        }
        if (c4299qxIntercept.OooOO0() != null) {
            return c4299qxIntercept;
        }
        throw new IllegalStateException("interceptor " + interfaceC4040jx + " returned a response with no body");
    }

    public C4189ny OooOO0o() {
        return this.OooO0O0;
    }

    @Override // p285z2.InterfaceC4040jx.OooO00o
    public InterfaceC4335rw call() {
        return this.OooO0oO;
    }

    @Override // p285z2.InterfaceC4040jx.OooO00o
    public C4225ox request() {
        return this.OooO0o;
    }
}
