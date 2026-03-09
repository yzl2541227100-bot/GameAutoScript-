package p285z2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.experimental.theories.internal.ParameterizedAssertionError;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public class d60 extends i90 {

    public static class OooO00o extends u90 {
        private final q90 OooO0O0;
        private final v90 OooO0OO;
        private int OooO00o = 0;
        private List<AssumptionViolatedException> OooO0Oo = new ArrayList();

        /* JADX INFO: renamed from: z2.d60$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C4723OooO00o extends i90 {
            public final /* synthetic */ g60 OooO0oO;

            /* JADX INFO: renamed from: z2.d60$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C4724OooO00o extends u90 {
                public final /* synthetic */ u90 OooO00o;

                public C4724OooO00o(u90 u90Var) throws Throwable {
                    this.OooO00o = u90Var;
                }

                @Override // p285z2.u90
                public void OooO00o() throws Throwable {
                    try {
                        this.OooO00o.OooO00o();
                        OooO00o.this.OooO0o();
                    } catch (AssumptionViolatedException e) {
                        OooO00o.this.OooO0o0(e);
                    } catch (Throwable th) {
                        C4723OooO00o c4723OooO00o = C4723OooO00o.this;
                        OooO00o oooO00o = OooO00o.this;
                        oooO00o.OooO(th, c4723OooO00o.OooO0oO.OooO0oO(oooO00o.OooO0oo()));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4723OooO00o(Class cls, g60 g60Var) throws Throwable {
                super(cls);
                this.OooO0oO = g60Var;
            }

            @Override // p285z2.i90, p285z2.l90
            public void OooOO0O(List<Throwable> list) {
            }

            @Override // p285z2.i90
            public u90 Oooo(q90 q90Var) {
                return new C4724OooO00o(super.Oooo(q90Var));
            }

            @Override // p285z2.i90
            public Object Oooo00O() throws Exception {
                Object[] objArrOooO0oo = this.OooO0oO.OooO0oo();
                if (!OooO00o.this.OooO0oo()) {
                    e50.OooO0o0(objArrOooO0oo);
                }
                return OooOOoo().OooOOO().newInstance(objArrOooO0oo);
            }

            @Override // p285z2.i90
            public u90 OoooO00(q90 q90Var, Object obj) {
                return OooO00o.this.OooO0oO(q90Var, this.OooO0oO, obj);
            }
        }

        public class OooO0O0 extends u90 {
            public final /* synthetic */ g60 OooO00o;
            public final /* synthetic */ q90 OooO0O0;
            public final /* synthetic */ Object OooO0OO;

            public OooO0O0(g60 g60Var, q90 q90Var, Object obj) throws Throwable {
                this.OooO00o = g60Var;
                this.OooO0O0 = q90Var;
                this.OooO0OO = obj;
            }

            @Override // p285z2.u90
            public void OooO00o() throws Throwable {
                Object[] objArrOooOO0 = this.OooO00o.OooOO0();
                if (!OooO00o.this.OooO0oo()) {
                    e50.OooO0o0(objArrOooOO0);
                }
                this.OooO0O0.OooOOOO(this.OooO0OO, objArrOooOO0);
            }
        }

        public OooO00o(q90 q90Var, v90 v90Var) {
            this.OooO0O0 = q90Var;
            this.OooO0OO = v90Var;
        }

        private v90 OooO0Oo() {
            return this.OooO0OO;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public u90 OooO0oO(q90 q90Var, g60 g60Var, Object obj) {
            return new OooO0O0(g60Var, q90Var, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean OooO0oo() {
            e60 e60Var = (e60) this.OooO0O0.OooOO0o().getAnnotation(e60.class);
            if (e60Var == null) {
                return false;
            }
            return e60Var.nullsAccepted();
        }

        public void OooO(Throwable th, Object... objArr) throws Throwable {
            if (objArr.length != 0) {
                throw new ParameterizedAssertionError(th, this.OooO0O0.OooO0o0(), objArr);
            }
            throw th;
        }

        @Override // p285z2.u90
        public void OooO00o() throws Throwable {
            OooOO0(g60.OooO00o(this.OooO0O0.OooOO0o(), OooO0Oo()));
            boolean z = this.OooO0O0.OooO00o(e60.class) != null;
            if (this.OooO00o == 0 && z) {
                d50.OooooO0("Never found parameters that satisfied method assumptions.  Violated assumptions: " + this.OooO0Oo);
            }
        }

        public void OooO0o() {
            this.OooO00o++;
        }

        public void OooO0o0(AssumptionViolatedException assumptionViolatedException) {
            this.OooO0Oo.add(assumptionViolatedException);
        }

        public void OooOO0(g60 g60Var) throws Throwable {
            if (g60Var.OooOO0o()) {
                OooOO0O(g60Var);
            } else {
                OooOO0o(g60Var);
            }
        }

        public void OooOO0O(g60 g60Var) throws Throwable {
            new C4723OooO00o(OooO0Oo().OooOO0o(), g60Var).Oooo(this.OooO0O0).OooO00o();
        }

        public void OooOO0o(g60 g60Var) throws Throwable {
            Iterator<PotentialAssignment> it = g60Var.OooOOO().iterator();
            while (it.hasNext()) {
                OooOO0(g60Var.OooO0O0(it.next()));
            }
        }
    }

    public d60(Class<?> cls) throws InitializationError {
        super(cls);
    }

    private void Ooooooo(List<Throwable> list) {
        for (Field field : OooOOoo().OooOO0o().getDeclaredFields()) {
            if (field.getAnnotation(x50.class) != null || field.getAnnotation(y50.class) != null) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be static"));
                }
                if (!Modifier.isPublic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be public"));
                }
            }
        }
    }

    private void o0OoOo0(List<Throwable> list) {
        for (Method method : OooOOoo().OooOO0o().getDeclaredMethods()) {
            if (method.getAnnotation(x50.class) != null || method.getAnnotation(y50.class) != null) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be static"));
                }
                if (!Modifier.isPublic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be public"));
                }
            }
        }
    }

    private void ooOO(Class<? extends b60> cls, List<Throwable> list) {
        Error error;
        Constructor<?>[] constructors = cls.getConstructors();
        if (constructors.length != 1) {
            error = new Error("ParameterSupplier " + cls.getName() + " must have only one constructor (either empty or taking only a TestClass)");
        } else {
            Class<?>[] parameterTypes = constructors[0].getParameterTypes();
            if (parameterTypes.length == 0 || parameterTypes[0].equals(v90.class)) {
                return;
            }
            error = new Error("ParameterSupplier " + cls.getName() + " constructor must take either nothing or a single TestClass instance");
        }
        list.add(error);
    }

    @Override // p285z2.i90, p285z2.l90
    public void OooOO0O(List<Throwable> list) {
        super.OooOO0O(list);
        Ooooooo(list);
        o0OoOo0(list);
    }

    @Override // p285z2.i90
    public u90 Oooo(q90 q90Var) {
        return new OooO00o(q90Var, OooOOoo());
    }

    @Override // p285z2.i90
    public List<q90> Oooo000() {
        ArrayList arrayList = new ArrayList(super.Oooo000());
        List<q90> listOooOO0O = OooOOoo().OooOO0O(e60.class);
        arrayList.removeAll(listOooOO0O);
        arrayList.addAll(listOooOO0O);
        return arrayList;
    }

    @Override // p285z2.i90
    public void Ooooo00(List<Throwable> list) {
        for (q90 q90Var : Oooo000()) {
            if (q90Var.OooO00o(e60.class) != null) {
                q90Var.OooOOoo(false, list);
                q90Var.OooOOo(list);
            } else {
                q90Var.OooOo00(false, list);
            }
            Iterator<a60> it = a60.OooOOO0(q90Var.OooOO0o()).iterator();
            while (it.hasNext()) {
                c60 c60Var = (c60) it.next().OooO0o0(c60.class);
                if (c60Var != null) {
                    ooOO(c60Var.value(), list);
                }
            }
        }
    }

    @Override // p285z2.i90
    public void o000oOoO(List<Throwable> list) {
        OoooOoo(list);
    }
}
