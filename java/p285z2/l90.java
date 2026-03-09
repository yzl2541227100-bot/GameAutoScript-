package p285z2;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l90<T> extends z80 implements b90, c90 {
    private static final List<ea0> OooO0o0 = Arrays.asList(new ca0(), new da0());
    private final v90 OooO0O0;
    private final Object OooO00o = new Object();
    private volatile Collection<T> OooO0OO = null;
    private volatile t90 OooO0Oo = new OooO00o();

    public class OooO00o implements t90 {
        public OooO00o() {
        }

        @Override // p285z2.t90
        public void OooO00o(Runnable runnable) {
            runnable.run();
        }

        @Override // p285z2.t90
        public void OooO0O0() {
        }
    }

    public class OooO0O0 extends u90 {
        public final /* synthetic */ f90 OooO00o;

        public OooO0O0(f90 f90Var) {
            this.OooO00o = f90Var;
        }

        @Override // p285z2.u90
        public void OooO00o() {
            l90.this.OooOo0O(this.OooO00o);
        }
    }

    public class OooO0OO implements Runnable {
        public final /* synthetic */ Object OoooOoO;
        public final /* synthetic */ f90 OoooOoo;

        public OooO0OO(Object obj, f90 f90Var) {
            this.OoooOoO = obj;
            this.OoooOoo = f90Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            l90.this.OooOo0(this.OoooOoO, this.OoooOoo);
        }
    }

    public class OooO0o implements Comparator<T> {
        public final /* synthetic */ d90 OoooOoO;

        public OooO0o(d90 d90Var) {
            this.OoooOoO = d90Var;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return this.OoooOoO.compare(l90.this.OooOOO(t), l90.this.OooOOO(t2));
        }
    }

    public l90(Class<?> cls) throws InitializationError {
        this.OooO0O0 = OooOOO0(cls);
        OooOoO();
    }

    private void OooO0o(List<Throwable> list) {
        if (OooOOoo().OooOO0o() != null) {
            Iterator<ea0> it = OooO0o0.iterator();
            while (it.hasNext()) {
                list.addAll(it.next().OooO00o(OooOOoo()));
            }
        }
    }

    private boolean OooO0oO() {
        Iterator<T> it = OooOOOo().iterator();
        while (it.hasNext()) {
            if (!OooOo00(it.next())) {
                return false;
            }
        }
        return true;
    }

    private Comparator<? super T> OooOO0o(d90 d90Var) {
        return new OooO0o(d90Var);
    }

    private Collection<T> OooOOOo() {
        if (this.OooO0OO == null) {
            synchronized (this.OooO00o) {
                if (this.OooO0OO == null) {
                    this.OooO0OO = Collections.unmodifiableCollection(OooOOOO());
                }
            }
        }
        return this.OooO0OO;
    }

    public void OooOo0O(f90 f90Var) {
        t90 t90Var = this.OooO0Oo;
        try {
            Iterator<T> it = OooOOOo().iterator();
            while (it.hasNext()) {
                t90Var.OooO00o(new OooO0OO(it.next(), f90Var));
            }
        } finally {
            t90Var.OooO0O0();
        }
    }

    private void OooOoO() throws InitializationError {
        ArrayList arrayList = new ArrayList();
        OooOO0O(arrayList);
        if (!arrayList.isEmpty()) {
            throw new InitializationError(arrayList);
        }
    }

    private boolean OooOoO0(a90 a90Var, T t) {
        return a90Var.OooO0o0(OooOOO(t));
    }

    private void OooOoOO(List<Throwable> list) {
        v70.OooO0Oo.OooO(OooOOoo(), list);
        v70.OooO0o.OooO(OooOOoo(), list);
    }

    private u90 OooOooo(u90 u90Var) {
        List<o80> listOooOO0 = OooOO0();
        return listOooOO0.isEmpty() ? u90Var : new k80(u90Var, listOooOO0, getDescription());
    }

    public u90 OooO(f90 f90Var) {
        u90 u90VarOooO0oo = OooO0oo(f90Var);
        return !OooO0oO() ? OooOooo(OooOoo(OooOooO(u90VarOooO0oo))) : u90VarOooO0oo;
    }

    @Override // p285z2.z80
    public void OooO00o(f90 f90Var) {
        t70 t70Var = new t70(f90Var, getDescription());
        try {
            OooO(f90Var).OooO00o();
        } catch (AssumptionViolatedException e) {
            t70Var.OooO00o(e);
        } catch (StoppedByUserException e2) {
            throw e2;
        } catch (Throwable th) {
            t70Var.OooO0O0(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p285z2.b90
    public void OooO0OO(a90 a90Var) throws NoTestsRemainException {
        synchronized (this.OooO00o) {
            ArrayList arrayList = new ArrayList(OooOOOo());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (OooOoO0(a90Var, next)) {
                    try {
                        a90Var.OooO00o(next);
                    } catch (NoTestsRemainException unused) {
                        it.remove();
                    }
                }
                it.remove();
            }
            this.OooO0OO = Collections.unmodifiableCollection(arrayList);
            if (this.OooO0OO.isEmpty()) {
                throw new NoTestsRemainException();
            }
        }
    }

    @Override // p285z2.c90
    public void OooO0Oo(d90 d90Var) {
        synchronized (this.OooO00o) {
            Iterator<T> it = OooOOOo().iterator();
            while (it.hasNext()) {
                d90Var.OooO00o(it.next());
            }
            ArrayList arrayList = new ArrayList(OooOOOo());
            Collections.sort(arrayList, OooOO0o(d90Var));
            this.OooO0OO = Collections.unmodifiableCollection(arrayList);
        }
    }

    public u90 OooO0oo(f90 f90Var) {
        return new OooO0O0(f90Var);
    }

    public List<o80> OooOO0() {
        List<o80> listOooO = this.OooO0O0.OooO(null, h50.class, o80.class);
        listOooO.addAll(this.OooO0O0.OooO0o0(null, h50.class, o80.class));
        return listOooO;
    }

    public void OooOO0O(List<Throwable> list) {
        OooOoo0(g50.class, true, list);
        OooOoo0(c50.class, true, list);
        OooOoOO(list);
        OooO0o(list);
    }

    public abstract Description OooOOO(T t);

    public v90 OooOOO0(Class<?> cls) {
        return new v90(cls);
    }

    public abstract List<T> OooOOOO();

    public Annotation[] OooOOo() {
        return this.OooO0O0.OooO0O0();
    }

    public String OooOOo0() {
        return this.OooO0O0.OooOOO0();
    }

    public final v90 OooOOoo() {
        return this.OooO0O0;
    }

    public void OooOo(t90 t90Var) {
        this.OooO0Oo = t90Var;
    }

    public abstract void OooOo0(T t, f90 f90Var);

    public boolean OooOo00(T t) {
        return false;
    }

    public final void OooOo0o(u90 u90Var, Description description, f90 f90Var) {
        t70 t70Var = new t70(f90Var, description);
        t70Var.OooO0o();
        try {
            try {
                u90Var.OooO00o();
            } catch (AssumptionViolatedException e) {
                t70Var.OooO00o(e);
            } catch (Throwable th) {
                t70Var.OooO0O0(th);
            }
        } finally {
            t70Var.OooO0Oo();
        }
    }

    public u90 OooOoo(u90 u90Var) {
        List<q90> listOooOO0O = this.OooO0O0.OooOO0O(c50.class);
        return listOooOO0O.isEmpty() ? u90Var : new a80(u90Var, listOooOO0O, null);
    }

    public void OooOoo0(Class<? extends Annotation> cls, boolean z, List<Throwable> list) {
        Iterator<q90> it = OooOOoo().OooOO0O(cls).iterator();
        while (it.hasNext()) {
            it.next().OooOo00(z, list);
        }
    }

    public u90 OooOooO(u90 u90Var) {
        List<q90> listOooOO0O = this.OooO0O0.OooOO0O(g50.class);
        return listOooOO0O.isEmpty() ? u90Var : new b80(u90Var, listOooOO0O, null);
    }

    @Override // p285z2.z80, p285z2.u80
    public Description getDescription() {
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(OooOOo0(), OooOOo());
        Iterator<T> it = OooOOOo().iterator();
        while (it.hasNext()) {
            descriptionCreateSuiteDescription.addChild(OooOOO(it.next()));
        }
        return descriptionCreateSuiteDescription;
    }
}
