package p285z2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.internal.runners.rules.ValidationError;

/* JADX INFO: loaded from: classes2.dex */
public class v70 {
    public static final v70 OooO0Oo;
    public static final v70 OooO0o;
    public static final v70 OooO0o0;
    public static final v70 OooO0oO;
    private final Class<? extends Annotation> OooO00o;
    private final boolean OooO0O0;
    private final List<OooOo00> OooO0OO;

    public static final class OooO implements OooOo00 {
        private OooO() {
        }

        @Override // z2.v70.OooOo00
        public void OooO00o(p90<?> p90Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (v70.OooO0oO(p90Var)) {
                return;
            }
            list.add(new ValidationError(p90Var, cls, "must implement TestRule."));
        }
    }

    public static class OooO0O0 {
        private final Class<? extends Annotation> OooO00o;
        private boolean OooO0O0;
        private final List<OooOo00> OooO0OO;

        private OooO0O0(Class<? extends Annotation> cls) {
            this.OooO00o = cls;
            this.OooO0O0 = false;
            this.OooO0OO = new ArrayList();
        }

        public v70 OooO0Oo() {
            return new v70(this);
        }

        public OooO0O0 OooO0o(OooOo00 oooOo00) {
            this.OooO0OO.add(oooOo00);
            return this;
        }

        public OooO0O0 OooO0o0() {
            this.OooO0O0 = true;
            return this;
        }
    }

    public static final class OooO0OO implements OooOo00 {
        private OooO0OO() {
        }

        private boolean OooO0O0(p90<?> p90Var) {
            return Modifier.isPublic(p90Var.OooO0OO().getModifiers());
        }

        @Override // z2.v70.OooOo00
        public void OooO00o(p90<?> p90Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (OooO0O0(p90Var)) {
                return;
            }
            list.add(new ValidationError(p90Var, cls, "must be declared in a public class."));
        }
    }

    public static final class OooO0o implements OooOo00 {
        private OooO0o() {
        }

        @Override // z2.v70.OooOo00
        public void OooO00o(p90<?> p90Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (v70.OooO0o(p90Var)) {
                return;
            }
            list.add(new ValidationError(p90Var, cls, "must implement MethodRule or TestRule."));
        }
    }

    public static final class OooOO0 implements OooOo00 {
        private OooOO0() {
        }

        @Override // z2.v70.OooOo00
        public void OooO00o(p90<?> p90Var, Class<? extends Annotation> cls, List<Throwable> list) {
            boolean zOooO0o0 = v70.OooO0o0(p90Var);
            boolean z = p90Var.OooO00o(h50.class) != null;
            if (p90Var.OooOO0()) {
                if (zOooO0o0 || !z) {
                    list.add(new ValidationError(p90Var, cls, v70.OooO0o0(p90Var) ? "must not be static." : "must not be static or it must be annotated with @ClassRule."));
                }
            }
        }
    }

    public static final class OooOO0O implements OooOo00 {
        private OooOO0O() {
        }

        @Override // z2.v70.OooOo00
        public void OooO00o(p90<?> p90Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (p90Var.OooO0oO()) {
                return;
            }
            list.add(new ValidationError(p90Var, cls, "must be public."));
        }
    }

    public static final class OooOOO implements OooOo00 {
        private OooOOO() {
        }

        @Override // z2.v70.OooOo00
        public void OooO00o(p90<?> p90Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (v70.OooO0o(p90Var)) {
                return;
            }
            list.add(new ValidationError(p90Var, cls, "must return an implementation of MethodRule or TestRule."));
        }
    }

    public static final class OooOOO0 implements OooOo00 {
        private OooOOO0() {
        }

        @Override // z2.v70.OooOo00
        public void OooO00o(p90<?> p90Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (p90Var.OooOO0()) {
                return;
            }
            list.add(new ValidationError(p90Var, cls, "must be static."));
        }
    }

    public static final class OooOOOO implements OooOo00 {
        private OooOOOO() {
        }

        @Override // z2.v70.OooOo00
        public void OooO00o(p90<?> p90Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (v70.OooO0oO(p90Var)) {
                return;
            }
            list.add(new ValidationError(p90Var, cls, "must return an implementation of TestRule."));
        }
    }

    public interface OooOo00 {
        void OooO00o(p90<?> p90Var, Class<? extends Annotation> cls, List<Throwable> list);
    }

    static {
        OooO0Oo = OooO0Oo().OooO0o(new OooO0OO()).OooO0o(new OooOOO0()).OooO0o(new OooOO0O()).OooO0o(new OooO()).OooO0Oo();
        OooO0o0 = OooO0oo().OooO0o(new OooOO0()).OooO0o(new OooOO0O()).OooO0o(new OooO0o()).OooO0Oo();
        OooO0o = OooO0Oo().OooO0o0().OooO0o(new OooO0OO()).OooO0o(new OooOOO0()).OooO0o(new OooOO0O()).OooO0o(new OooOOOO()).OooO0Oo();
        OooO0oO = OooO0oo().OooO0o0().OooO0o(new OooOO0()).OooO0o(new OooOO0O()).OooO0o(new OooOOO()).OooO0Oo();
    }

    public v70(OooO0O0 oooO0O0) {
        this.OooO00o = oooO0O0.OooO00o;
        this.OooO0O0 = oooO0O0.OooO0O0;
        this.OooO0OO = oooO0O0.OooO0OO;
    }

    private static OooO0O0 OooO0Oo() {
        return new OooO0O0(h50.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean OooO0o(p90<?> p90Var) {
        return OooO0o0(p90Var) || OooO0oO(p90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean OooO0o0(p90<?> p90Var) {
        return i80.class.isAssignableFrom(p90Var.OooO0o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean OooO0oO(p90<?> p90Var) {
        return o80.class.isAssignableFrom(p90Var.OooO0o());
    }

    private static OooO0O0 OooO0oo() {
        return new OooO0O0(k50.class);
    }

    private void OooOO0(p90<?> p90Var, List<Throwable> list) {
        Iterator<OooOo00> it = this.OooO0OO.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(p90Var, this.OooO00o, list);
        }
    }

    public void OooO(v90 v90Var, List<Throwable> list) {
        Iterator it = (this.OooO0O0 ? v90Var.OooOO0O(this.OooO00o) : v90Var.OooO0oO(this.OooO00o)).iterator();
        while (it.hasNext()) {
            OooOO0((p90) it.next(), list);
        }
    }
}
