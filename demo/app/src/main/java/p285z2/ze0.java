package p285z2;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ze0 {
    private WeakReference<Context> OooO00o;
    private OooO00o OooO0OO;
    public int OooO0Oo = -2;
    public int OooO0o0 = -2;
    private af0 OooO0O0 = af0.OooOOo0();

    public interface OooO00o {
        void OooO00o(qf0 qf0Var, af0 af0Var);
    }

    private ze0(Context context) {
        this.OooO00o = new WeakReference<>(context);
    }

    private Context OooO0o0() {
        WeakReference<Context> weakReference = this.OooO00o;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static ze0 OooOOO(Context context) {
        return new ze0(context);
    }

    public qf0 OooO() {
        return OooOO0o(null);
    }

    public qf0 OooO00o() {
        return new qf0(OooO0o0(), this.OooO0O0, this.OooO0OO, this.OooO0Oo, this.OooO0o0);
    }

    public <C extends af0> ze0 OooO0O0(C c) {
        if (c == null) {
            return this;
        }
        af0 af0Var = this.OooO0O0;
        if (c != af0Var) {
            c.OooOO0o(af0Var.OoooOoO);
        }
        this.OooO0O0 = c;
        return this;
    }

    public ze0 OooO0OO(int i) {
        this.OooO0O0.OooOO0o(i);
        return this;
    }

    public final <C extends af0> C OooO0Oo() {
        return (C) this.OooO0O0;
    }

    public OooO00o OooO0o() {
        return this.OooO0OO;
    }

    public ze0 OooO0oO(int i) {
        this.OooO0o0 = i;
        return this;
    }

    public ze0 OooO0oo(OooO00o oooO00o) {
        this.OooO0OO = oooO00o;
        return this;
    }

    public qf0 OooOO0(int i) {
        qf0 qf0VarOooO00o = OooO00o();
        qf0VarOooO00o.o000O0Oo(i);
        return qf0VarOooO00o;
    }

    public qf0 OooOO0O(int i, int i2) {
        qf0 qf0VarOooO00o = OooO00o();
        qf0VarOooO00o.o000OO0O(i, i2);
        return qf0VarOooO00o;
    }

    public qf0 OooOO0o(View view) {
        qf0 qf0VarOooO00o = OooO00o();
        qf0VarOooO00o.o000O0O0(view);
        return qf0VarOooO00o;
    }

    public ze0 OooOOO0(int i) {
        this.OooO0Oo = i;
        return this;
    }

    @Deprecated
    public ze0 OooOOOO() {
        return OooOOO0(-2).OooO0oO(-2);
    }
}
