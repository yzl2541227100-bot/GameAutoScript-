package p285z2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.junit.internal.runners.InitializationError;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.Failure;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class n70 extends z80 implements b90, c90 {
    private final List<Method> OooO00o = OooO();
    private r70 OooO0O0;

    public class OooO00o implements Runnable {
        public final /* synthetic */ f90 OoooOoO;

        public OooO00o(f90 f90Var) {
            this.OoooOoO = f90Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            n70.this.OooOO0o(this.OoooOoO);
        }
    }

    public class OooO0O0 implements Comparator<Method> {
        public final /* synthetic */ d90 OoooOoO;

        public OooO0O0(d90 d90Var) {
            this.OoooOoO = d90Var;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public int compare(Method method, Method method2) {
            return this.OoooOoO.compare(n70.this.OooOO0O(method), n70.this.OooOO0O(method2));
        }
    }

    public n70(Class<?> cls) throws InitializationError {
        this.OooO0O0 = new r70(cls);
        OooOOOo();
    }

    private void OooOOO0(f90 f90Var, Description description, Throwable th) {
        f90Var.OooOO0o(description);
        f90Var.OooO0o(new Failure(description, th));
        f90Var.OooO0oo(description);
    }

    public List<Method> OooO() {
        return this.OooO0O0.OooO0oo();
    }

    @Override // p285z2.z80
    public void OooO00o(f90 f90Var) {
        new k70(f90Var, this.OooO0O0, getDescription(), new OooO00o(f90Var)).OooO0Oo();
    }

    @Override // p285z2.b90
    public void OooO0OO(a90 a90Var) throws NoTestsRemainException {
        Iterator<Method> it = this.OooO00o.iterator();
        while (it.hasNext()) {
            if (!a90Var.OooO0o0(OooOO0O(it.next()))) {
                it.remove();
            }
        }
        if (this.OooO00o.isEmpty()) {
            throw new NoTestsRemainException();
        }
    }

    @Override // p285z2.c90
    public void OooO0Oo(d90 d90Var) {
        Collections.sort(this.OooO00o, new OooO0O0(d90Var));
    }

    public Object OooO0o() throws Exception {
        return OooO0oo().OooO0Oo().newInstance(new Object[0]);
    }

    public Annotation[] OooO0o0() {
        return this.OooO0O0.OooO0o0().getAnnotations();
    }

    public String OooO0oO() {
        return OooO0oo().OooO0o();
    }

    public r70 OooO0oo() {
        return this.OooO0O0;
    }

    public void OooOO0(Method method, f90 f90Var) {
        Description descriptionOooOO0O = OooOO0O(method);
        try {
            new o70(OooO0o(), OooOOo0(method), f90Var, descriptionOooOO0O).OooO0O0();
        } catch (InvocationTargetException e) {
            OooOOO0(f90Var, descriptionOooOO0O, e.getCause());
        } catch (Exception e2) {
            OooOOO0(f90Var, descriptionOooOO0O, e2);
        }
    }

    public Description OooOO0O(Method method) {
        return Description.createTestDescription(OooO0oo().OooO0o0(), OooOOOO(method), OooOOO(method));
    }

    public void OooOO0o(f90 f90Var) {
        Iterator<Method> it = this.OooO00o.iterator();
        while (it.hasNext()) {
            OooOO0(it.next(), f90Var);
        }
    }

    public Annotation[] OooOOO(Method method) {
        return method.getAnnotations();
    }

    public String OooOOOO(Method method) {
        return method.getName();
    }

    public void OooOOOo() throws InitializationError {
        p70 p70Var = new p70(this.OooO0O0);
        p70Var.OooO0OO();
        p70Var.OooO00o();
    }

    public s70 OooOOo0(Method method) {
        return new s70(method, this.OooO0O0);
    }

    @Override // p285z2.z80, p285z2.u80
    public Description getDescription() {
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(OooO0oO(), OooO0o0());
        Iterator<Method> it = this.OooO00o.iterator();
        while (it.hasNext()) {
            descriptionCreateSuiteDescription.addChild(OooOO0O(it.next()));
        }
        return descriptionCreateSuiteDescription;
    }
}
