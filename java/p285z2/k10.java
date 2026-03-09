package p285z2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes2.dex */
public class k10 {
    private static final ExecutorService OooOO0o = Executors.newCachedThreadPool();
    public boolean OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public List<Class<?>> OooOO0;
    public List<x10> OooOO0O;
    public boolean OooO00o = true;
    public boolean OooO0O0 = true;
    public boolean OooO0OO = true;
    public boolean OooO0Oo = true;
    public boolean OooO0o = true;
    public ExecutorService OooO = OooOO0o;

    public k10 OooO(boolean z) {
        this.OooO0Oo = z;
        return this;
    }

    public k10 OooO00o(x10 x10Var) {
        if (this.OooOO0O == null) {
            this.OooOO0O = new ArrayList();
        }
        this.OooOO0O.add(x10Var);
        return this;
    }

    public j10 OooO0O0() {
        return new j10(this);
    }

    public k10 OooO0OO(boolean z) {
        this.OooO0o = z;
        return this;
    }

    public k10 OooO0Oo(ExecutorService executorService) {
        this.OooO = executorService;
        return this;
    }

    public j10 OooO0o() {
        j10 j10Var;
        synchronized (j10.class) {
            if (j10.OooOOo != null) {
                throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
            j10.OooOOo = OooO0O0();
            j10Var = j10.OooOOo;
        }
        return j10Var;
    }

    public k10 OooO0o0(boolean z) {
        this.OooO0oO = z;
        return this;
    }

    public k10 OooO0oO(boolean z) {
        this.OooO0O0 = z;
        return this;
    }

    public k10 OooO0oo(boolean z) {
        this.OooO00o = z;
        return this;
    }

    public k10 OooOO0(boolean z) {
        this.OooO0OO = z;
        return this;
    }

    public k10 OooOO0O(Class<?> cls) {
        if (this.OooOO0 == null) {
            this.OooOO0 = new ArrayList();
        }
        this.OooOO0.add(cls);
        return this;
    }

    public k10 OooOO0o(boolean z) {
        this.OooO0oo = z;
        return this;
    }

    public k10 OooOOO0(boolean z) {
        this.OooO0o0 = z;
        return this;
    }
}
