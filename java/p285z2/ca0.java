package p285z2;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ca0 implements ea0 {
    private static final List<OooO0O0<?>> OooO00o;

    public static class OooO extends OooO0O0<q90> {
        private OooO() {
            super();
        }

        @Override // z2.ca0.OooO0O0
        public Iterable<q90> OooO00o(v90 v90Var) {
            return v90Var.OooOO0();
        }

        @Override // z2.ca0.OooO0O0
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public List<Exception> OooO0OO(aa0 aa0Var, q90 q90Var) {
            return aa0Var.OooO0OO(q90Var);
        }
    }

    public static abstract class OooO0O0<T extends n90> {
        private static final ba0 OooO00o = new ba0();

        private OooO0O0() {
        }

        private List<Exception> OooO0O0(T t) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : t.OooO0O0()) {
                fa0 fa0Var = (fa0) annotation.annotationType().getAnnotation(fa0.class);
                if (fa0Var != null) {
                    arrayList.addAll(OooO0OO(OooO00o.OooO00o(fa0Var), t));
                }
            }
            return arrayList;
        }

        public abstract Iterable<T> OooO00o(v90 v90Var);

        public abstract List<Exception> OooO0OO(aa0 aa0Var, T t);

        public List<Exception> OooO0Oo(v90 v90Var) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = OooO00o(v90Var).iterator();
            while (it.hasNext()) {
                arrayList.addAll(OooO0O0(it.next()));
            }
            return arrayList;
        }
    }

    public static class OooO0OO extends OooO0O0<v90> {
        private OooO0OO() {
            super();
        }

        @Override // z2.ca0.OooO0O0
        public Iterable<v90> OooO00o(v90 v90Var) {
            return Collections.singletonList(v90Var);
        }

        @Override // z2.ca0.OooO0O0
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public List<Exception> OooO0OO(aa0 aa0Var, v90 v90Var) {
            return aa0Var.OooO00o(v90Var);
        }
    }

    public static class OooO0o extends OooO0O0<o90> {
        private OooO0o() {
            super();
        }

        @Override // z2.ca0.OooO0O0
        public Iterable<o90> OooO00o(v90 v90Var) {
            return v90Var.OooO0o();
        }

        @Override // z2.ca0.OooO0O0
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public List<Exception> OooO0OO(aa0 aa0Var, o90 o90Var) {
            return aa0Var.OooO0O0(o90Var);
        }
    }

    static {
        OooO00o = Arrays.asList(new OooO0OO(), new OooO(), new OooO0o());
    }

    @Override // p285z2.ea0
    public List<Exception> OooO00o(v90 v90Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<OooO0O0<?>> it = OooO00o.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().OooO0Oo(v90Var));
        }
        return arrayList;
    }
}
