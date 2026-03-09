package p285z2;

import android.content.res.Resources;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class a20 {
    public Class<?> OooO;
    public final Resources OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public j10 OooO0o0;
    public String OooO0oO;
    public int OooO0oo;
    public boolean OooO0o = true;
    public final c20 OooO0Oo = new c20();

    public a20(Resources resources, int i, int i2) {
        this.OooO00o = resources;
        this.OooO0O0 = i;
        this.OooO0OO = i2;
    }

    public a20 OooO00o(Class<? extends Throwable> cls, int i) {
        this.OooO0Oo.OooO00o(cls, i);
        return this;
    }

    public void OooO0O0() {
        this.OooO0o = false;
    }

    public j10 OooO0OO() {
        j10 j10Var = this.OooO0o0;
        return j10Var != null ? j10Var : j10.OooO0o();
    }

    public int OooO0Oo(Throwable th) {
        Integer numOooO0O0 = this.OooO0Oo.OooO0O0(th);
        if (numOooO0O0 != null) {
            return numOooO0O0.intValue();
        }
        Log.d(j10.OooOOo0, "No specific message ressource ID found for " + th);
        return this.OooO0OO;
    }

    public void OooO0o(Class<?> cls) {
        this.OooO = cls;
    }

    public void OooO0o0(int i) {
        this.OooO0oo = i;
    }

    public void OooO0oO(j10 j10Var) {
        this.OooO0o0 = j10Var;
    }

    public void OooO0oo(String str) {
        this.OooO0oO = str;
    }
}
