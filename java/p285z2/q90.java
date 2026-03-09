package p285z2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class q90 extends p90<q90> {
    private final Method OooO00o;

    public class OooO00o extends u70 {
        public final /* synthetic */ Object OooO00o;
        public final /* synthetic */ Object[] OooO0O0;

        public OooO00o(Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            this.OooO00o = obj;
            this.OooO0O0 = objArr;
        }

        @Override // p285z2.u70
        public Object OooO0O0() throws Throwable {
            return q90.this.OooO00o.invoke(this.OooO00o, this.OooO0O0);
        }
    }

    public q90(Method method) {
        Objects.requireNonNull(method, "FrameworkMethod cannot be created without an underlying method.");
        this.OooO00o = method;
    }

    private Class<?>[] OooOOO0() {
        return this.OooO00o.getParameterTypes();
    }

    @Override // p285z2.n90
    public <T extends Annotation> T OooO00o(Class<T> cls) {
        return (T) this.OooO00o.getAnnotation(cls);
    }

    @Override // p285z2.n90
    public Annotation[] OooO0O0() {
        return this.OooO00o.getAnnotations();
    }

    @Override // p285z2.p90
    public Class<?> OooO0OO() {
        return this.OooO00o.getDeclaringClass();
    }

    @Override // p285z2.p90
    public int OooO0Oo() {
        return this.OooO00o.getModifiers();
    }

    @Override // p285z2.p90
    public Class<?> OooO0o() {
        return OooOOO();
    }

    @Override // p285z2.p90
    public String OooO0o0() {
        return this.OooO00o.getName();
    }

    public Method OooOO0o() {
        return this.OooO00o;
    }

    public Class<?> OooOOO() {
        return this.OooO00o.getReturnType();
    }

    public Object OooOOOO(Object obj, Object... objArr) throws Throwable {
        return new OooO00o(obj, objArr).OooO00o();
    }

    @Override // p285z2.p90
    /* JADX INFO: renamed from: OooOOOo */
    public boolean OooO(q90 q90Var) {
        if (!q90Var.OooO0o0().equals(OooO0o0()) || q90Var.OooOOO0().length != OooOOO0().length) {
            return false;
        }
        for (int i = 0; i < q90Var.OooOOO0().length; i++) {
            if (!q90Var.OooOOO0()[i].equals(OooOOO0()[i])) {
                return false;
            }
        }
        return true;
    }

    public void OooOOo(List<Throwable> list) {
        new r90(this.OooO00o).OooO00o(list);
    }

    @Deprecated
    public boolean OooOOo0(Type type) {
        return OooOOO0().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(this.OooO00o.getReturnType());
    }

    public void OooOOoo(boolean z, List<Throwable> list) {
        if (OooOO0() != z) {
            list.add(new Exception("Method " + this.OooO00o.getName() + "() " + (z ? "should" : "should not") + " be static"));
        }
        if (!OooO0oO()) {
            list.add(new Exception("Method " + this.OooO00o.getName() + "() should be public"));
        }
        if (this.OooO00o.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.OooO00o.getName() + "() should be void"));
        }
    }

    public void OooOo00(boolean z, List<Throwable> list) {
        OooOOoo(z, list);
        if (this.OooO00o.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.OooO00o.getName() + " should have no parameters"));
        }
    }

    public boolean equals(Object obj) {
        if (q90.class.isInstance(obj)) {
            return ((q90) obj).OooO00o.equals(this.OooO00o);
        }
        return false;
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public String toString() {
        return this.OooO00o.toString();
    }
}
