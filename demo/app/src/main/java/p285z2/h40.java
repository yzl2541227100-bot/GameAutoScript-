package p285z2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.jdeferred.Promise;
import org.jdeferred.android.AndroidExecutionScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
public class h40<D, F, P> extends q40<D, F, P> {
    private static final OooO OooOO0O = new OooO();
    private static final int OooOO0o = 1;
    private static final int OooOOO = 3;
    private static final int OooOOO0 = 2;
    private static final int OooOOOO = 4;
    public final Logger OooO;
    private final AndroidExecutionScope OooOO0;

    public static class OooO extends Handler {
        public OooO() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            OooO0o oooO0o = (OooO0o) message.obj;
            int i = message.what;
            if (i == 1) {
                ((w30) oooO0o.OooO0O0).OooO0O0(oooO0o.OooO0OO);
                return;
            }
            if (i == 2) {
                ((c40) oooO0o.OooO0O0).OooO0O0(oooO0o.OooO0o0);
            } else if (i == 3) {
                ((z30) oooO0o.OooO0O0).OooO0O0(oooO0o.OooO0Oo);
            } else {
                if (i != 4) {
                    return;
                }
                ((r30) oooO0o.OooO0O0).OooO0O0(oooO0o.OooO0o, oooO0o.OooO0OO, oooO0o.OooO0Oo);
            }
        }
    }

    public class OooO00o implements z30<F> {
        public OooO00o() {
        }

        @Override // p285z2.z30
        public void OooO0O0(F f) {
            h40.this.OooOo0o(f);
        }
    }

    public class OooO0O0 implements c40<P> {
        public OooO0O0() {
        }

        @Override // p285z2.c40
        public void OooO0O0(P p) {
            h40.this.OooOO0O(p);
        }
    }

    public class OooO0OO implements w30<D> {
        public OooO0OO() {
        }

        @Override // p285z2.w30
        public void OooO0O0(D d) {
            h40.this.OooOo0O(d);
        }
    }

    public static class OooO0o<Callback, D, F, P> {
        public final s30 OooO00o;
        public final Callback OooO0O0;
        public final D OooO0OO;
        public final F OooO0Oo;
        public final Promise.State OooO0o;
        public final P OooO0o0;

        public OooO0o(s30 s30Var, Callback callback, Promise.State state, D d, F f, P p) {
            this.OooO00o = s30Var;
            this.OooO0O0 = callback;
            this.OooO0o = state;
            this.OooO0OO = d;
            this.OooO0Oo = f;
            this.OooO0o0 = p;
        }
    }

    public h40(Promise<D, F, P> promise) {
        this(promise, AndroidExecutionScope.UI);
    }

    public h40(Promise<D, F, P> promise, AndroidExecutionScope androidExecutionScope) {
        this.OooO = LoggerFactory.getLogger(h40.class);
        this.OooOO0 = androidExecutionScope;
        promise.OooOOO(new OooO0OO()).OooO00o(new OooO0O0()).OooOO0(new OooO00o());
    }

    @Override // p285z2.o40
    public void OooOo(r30<D, F> r30Var, Promise.State state, D d, F f) {
        if (Oooo000(r30Var) == AndroidExecutionScope.UI) {
            Oooo00O(4, r30Var, state, d, f, null);
        } else {
            super.OooOo(r30Var, state, d, f);
        }
    }

    @Override // p285z2.o40
    public void OooOoOO(w30<D> w30Var, D d) {
        if (Oooo000(w30Var) == AndroidExecutionScope.UI) {
            Oooo00O(1, w30Var, Promise.State.RESOLVED, d, null, null);
        } else {
            super.OooOoOO(w30Var, d);
        }
    }

    @Override // p285z2.o40
    public void OooOoo(z30<F> z30Var, F f) {
        if (Oooo000(z30Var) == AndroidExecutionScope.UI) {
            Oooo00O(3, z30Var, Promise.State.REJECTED, null, f, null);
        } else {
            super.OooOoo(z30Var, f);
        }
    }

    @Override // p285z2.o40
    public void OooOooo(c40<P> c40Var, P p) {
        if (Oooo000(c40Var) == AndroidExecutionScope.UI) {
            Oooo00O(2, c40Var, Promise.State.PENDING, null, null, p);
        } else {
            super.OooOooo(c40Var, p);
        }
    }

    public AndroidExecutionScope Oooo000(Object obj) {
        AndroidExecutionScope androidExecutionScopeOooO00o = obj instanceof j40 ? ((j40) obj).OooO00o() : null;
        return androidExecutionScopeOooO00o == null ? this.OooOO0 : androidExecutionScopeOooO00o;
    }

    public <Callback> void Oooo00O(int i, Callback callback, Promise.State state, D d, F f, P p) {
        OooOO0O.obtainMessage(i, new OooO0o(this, callback, state, d, f, p)).sendToTarget();
    }
}
