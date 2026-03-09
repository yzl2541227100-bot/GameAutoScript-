package p285z2;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: z2.nx */
/* JADX INFO: loaded from: classes2.dex */
public final class C4188nx implements InterfaceC4335rw {
    public final C4151mx OoooOoO;
    public final C4559xy OoooOoo;
    public final f00 Ooooo00;

    @Nullable
    private AbstractC3855ex Ooooo0o;
    public final C4225ox OooooO0;
    public final boolean OooooOO;
    private boolean OooooOo;

    /* JADX INFO: renamed from: z2.nx$OooO00o */
    public class OooO00o extends f00 {
        public OooO00o() {
        }

        @Override // p285z2.f00
        public void OooOo0O() {
            C4188nx.this.cancel();
        }
    }

    /* JADX INFO: renamed from: z2.nx$OooO0O0 */
    public final class OooO0O0 extends AbstractRunnableC4521wx {
        public static final /* synthetic */ boolean Ooooo0o = false;
        private final InterfaceC4372sw OoooOoo;

        public OooO0O0(InterfaceC4372sw interfaceC4372sw) {
            super("OkHttp %s", C4188nx.this.OooO0o());
            this.OoooOoo = interfaceC4372sw;
        }

        @Override // p285z2.AbstractRunnableC4521wx
        public void OooOO0o() {
            IOException e;
            C4188nx.this.Ooooo00.OooOOO0();
            boolean z = true;
            try {
                try {
                    C4299qx c4299qxOooO0Oo = C4188nx.this.OooO0Oo();
                    try {
                        if (C4188nx.this.OoooOoo.OooO0Oo()) {
                            this.OoooOoo.onFailure(C4188nx.this, new IOException("Canceled"));
                        } else {
                            this.OoooOoo.onResponse(C4188nx.this, c4299qxOooO0Oo);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        IOException iOExceptionOooO0oo = C4188nx.this.OooO0oo(e);
                        if (z) {
                            C4375sz.OooOO0O().OooOOo(4, "Callback failure for " + C4188nx.this.OooO(), iOExceptionOooO0oo);
                        } else {
                            C4188nx.this.Ooooo0o.OooO0O0(C4188nx.this, iOExceptionOooO0oo);
                            this.OoooOoo.onFailure(C4188nx.this, iOExceptionOooO0oo);
                        }
                    }
                } finally {
                    C4188nx.this.OoooOoO.OooOO0o().OooO0o(this);
                }
            } catch (IOException e3) {
                e = e3;
                z = false;
            }
        }

        public C4188nx OooOOO() {
            return C4188nx.this;
        }

        public void OooOOO0(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    C4188nx.this.Ooooo0o.OooO0O0(C4188nx.this, interruptedIOException);
                    this.OoooOoo.onFailure(C4188nx.this, interruptedIOException);
                    C4188nx.this.OoooOoO.OooOO0o().OooO0o(this);
                }
            } catch (Throwable th) {
                C4188nx.this.OoooOoO.OooOO0o().OooO0o(this);
                throw th;
            }
        }

        public String OooOOOO() {
            return C4188nx.this.OooooO0.OooOO0O().OooOOOo();
        }

        public C4225ox OooOOOo() {
            return C4188nx.this.OooooO0;
        }
    }

    private C4188nx(C4151mx c4151mx, C4225ox c4225ox, boolean z) {
        this.OoooOoO = c4151mx;
        this.OooooO0 = c4225ox;
        this.OooooOO = z;
        this.OoooOoo = new C4559xy(c4151mx, z);
        OooO00o oooO00o = new OooO00o();
        this.Ooooo00 = oooO00o;
        oooO00o.OooO0oo(c4151mx.OooO0o0(), TimeUnit.MILLISECONDS);
    }

    private void OooO0O0() {
        this.OoooOoo.OooO(C4375sz.OooOO0O().OooOOOO("response.body().close()"));
    }

    public static C4188nx OooO0o0(C4151mx c4151mx, C4225ox c4225ox, boolean z) {
        C4188nx c4188nx = new C4188nx(c4151mx, c4225ox, z);
        c4188nx.Ooooo0o = c4151mx.OooOOO().OooO00o(c4188nx);
        return c4188nx;
    }

    public String OooO() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.OooooOO ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(OooO0o());
        return sb.toString();
    }

    @Override // p285z2.InterfaceC4335rw
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C4188nx mo17070clone() {
        return OooO0o0(this.OoooOoO, this.OooooO0, this.OooooOO);
    }

    public C4299qx OooO0Oo() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.OoooOoO.OooOOo());
        arrayList.add(this.OoooOoo);
        arrayList.add(new C4226oy(this.OoooOoO.OooOO0O()));
        arrayList.add(new C3708ay(this.OoooOoO.OooOOoo()));
        arrayList.add(new C4004iy(this.OoooOoO));
        if (!this.OooooOO) {
            arrayList.addAll(this.OoooOoO.OooOo00());
        }
        arrayList.add(new C4263py(this.OooooOO));
        return new C4448uy(arrayList, null, null, null, 0, this.OooooO0, this, this.Ooooo0o, this.OoooOoO.OooO0oO(), this.OoooOoO.OooOoo0(), this.OoooOoO.Oooo000()).OooO0o0(this.OooooO0);
    }

    public String OooO0o() {
        return this.OooooO0.OooOO0O().Oooo0oO();
    }

    public C4189ny OooO0oO() {
        return this.OoooOoo.OooOO0();
    }

    @Nullable
    public IOException OooO0oo(@Nullable IOException iOException) {
        if (!this.Ooooo00.OooOOOo()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // p285z2.InterfaceC4335rw
    public void OooOO0(InterfaceC4372sw interfaceC4372sw) {
        synchronized (this) {
            if (this.OooooOo) {
                throw new IllegalStateException("Already Executed");
            }
            this.OooooOo = true;
        }
        OooO0O0();
        this.Ooooo0o.OooO0OO(this);
        this.OoooOoO.OooOO0o().OooO0O0(new OooO0O0(interfaceC4372sw));
    }

    @Override // p285z2.InterfaceC4335rw
    public void cancel() {
        this.OoooOoo.OooO00o();
    }

    @Override // p285z2.InterfaceC4335rw
    public C4299qx execute() throws IOException {
        synchronized (this) {
            if (this.OooooOo) {
                throw new IllegalStateException("Already Executed");
            }
            this.OooooOo = true;
        }
        OooO0O0();
        this.Ooooo00.OooOOO0();
        this.Ooooo0o.OooO0OO(this);
        try {
            try {
                this.OoooOoO.OooOO0o().OooO0OO(this);
                C4299qx c4299qxOooO0Oo = OooO0Oo();
                if (c4299qxOooO0Oo != null) {
                    return c4299qxOooO0Oo;
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException iOExceptionOooO0oo = OooO0oo(e);
                this.Ooooo0o.OooO0O0(this, iOExceptionOooO0oo);
                throw iOExceptionOooO0oo;
            }
        } finally {
            this.OoooOoO.OooOO0o().OooO0oO(this);
        }
        this.OoooOoO.OooOO0o().OooO0oO(this);
    }

    @Override // p285z2.InterfaceC4335rw
    public boolean isCanceled() {
        return this.OoooOoo.OooO0Oo();
    }

    @Override // p285z2.InterfaceC4335rw
    public synchronized boolean isExecuted() {
        return this.OooooOo;
    }

    @Override // p285z2.InterfaceC4335rw
    public C4225ox request() {
        return this.OooooO0;
    }

    @Override // p285z2.InterfaceC4335rw
    public d10 timeout() {
        return this.Ooooo00;
    }
}
