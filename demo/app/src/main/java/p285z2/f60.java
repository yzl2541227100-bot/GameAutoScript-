package p285z2;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;

/* JADX INFO: loaded from: classes2.dex */
public class f60 extends b60 {
    private final v90 OooO00o;

    public static class OooO0O0 extends PotentialAssignment {
        private final q90 OooO00o;

        private OooO0O0(q90 q90Var) {
            this.OooO00o = q90Var;
        }

        public /* synthetic */ OooO0O0(q90 q90Var, OooO00o oooO00o) {
            this(q90Var);
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public String OooO0O0() throws PotentialAssignment.CouldNotGenerateValueException {
            return this.OooO00o.OooO0o0();
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public Object OooO0OO() throws PotentialAssignment.CouldNotGenerateValueException {
            try {
                return this.OooO00o.OooOOOO(null, new Object[0]);
            } catch (IllegalAccessException unused) {
                throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
            } catch (IllegalArgumentException unused2) {
                throw new RuntimeException("unexpected: argument length is checked");
            } catch (Throwable th) {
                x50 x50Var = (x50) this.OooO00o.OooO00o(x50.class);
                e50.OooO(x50Var == null || !f60.OooOOOO(x50Var.ignoredExceptions(), th));
                throw new PotentialAssignment.CouldNotGenerateValueException(th);
            }
        }
    }

    public f60(v90 v90Var) {
        this.OooO00o = v90Var;
    }

    private void OooO(a60 a60Var, List<PotentialAssignment> list) {
        for (q90 q90Var : OooOOO0(a60Var)) {
            if (a60Var.OooO0O0(q90Var.OooO0o())) {
                list.add(new OooO0O0(q90Var));
            }
        }
    }

    private void OooO0OO(a60 a60Var, String str, List<PotentialAssignment> list, Object obj) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            Object obj2 = Array.get(obj, i);
            if (a60Var.OooO0OO(obj2)) {
                list.add(PotentialAssignment.OooO00o(str + "[" + i + "]", obj2));
            }
        }
    }

    private void OooO0Oo(Class<?> cls, a60 a60Var, String str, List<PotentialAssignment> list, Object obj) {
        if (cls.isArray()) {
            OooO0OO(a60Var, str, list, obj);
        } else if (Iterable.class.isAssignableFrom(cls)) {
            OooO0o0(a60Var, str, list, (Iterable) obj);
        }
    }

    private void OooO0o(a60 a60Var, List<PotentialAssignment> list) {
        for (Field field : OooOO0(a60Var)) {
            OooO0Oo(field.getType(), a60Var, field.getName(), list, OooOOO(field));
        }
    }

    private void OooO0o0(a60 a60Var, String str, List<PotentialAssignment> list, Iterable<?> iterable) {
        int i = 0;
        for (Object obj : iterable) {
            if (a60Var.OooO0OO(obj)) {
                list.add(PotentialAssignment.OooO00o(str + "[" + i + "]", obj));
            }
            i++;
        }
    }

    private void OooO0oO(a60 a60Var, List<PotentialAssignment> list) throws Throwable {
        for (q90 q90Var : OooOO0O(a60Var)) {
            Class<?> clsOooOOO = q90Var.OooOOO();
            if ((clsOooOOO.isArray() && a60Var.OooO0Oo(clsOooOOO.getComponentType())) || Iterable.class.isAssignableFrom(clsOooOOO)) {
                try {
                    OooO0Oo(clsOooOOO, a60Var, q90Var.OooO0o0(), list, q90Var.OooOOOO(null, new Object[0]));
                } catch (Throwable th) {
                    y50 y50Var = (y50) q90Var.OooO00o(y50.class);
                    if (y50Var == null || !OooOOOO(y50Var.ignoredExceptions(), th)) {
                        throw th;
                    }
                    return;
                }
            }
        }
    }

    private void OooO0oo(a60 a60Var, List<PotentialAssignment> list) {
        for (Field field : OooOO0o(a60Var)) {
            Object objOooOOO = OooOOO(field);
            if (a60Var.OooO0OO(objOooOOO)) {
                list.add(PotentialAssignment.OooO00o(field.getName(), objOooOOO));
            }
        }
    }

    private Object OooOOO(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("unexpected: getFields returned an inaccessible field");
        } catch (IllegalArgumentException unused2) {
            throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
        }
    }

    public static boolean OooOOOO(Class<?>[] clsArr, Object obj) {
        for (Class<?> cls : clsArr) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    @Override // p285z2.b60
    public List<PotentialAssignment> OooO00o(a60 a60Var) throws Throwable {
        ArrayList arrayList = new ArrayList();
        OooO0oo(a60Var, arrayList);
        OooO0o(a60Var, arrayList);
        OooO(a60Var, arrayList);
        OooO0oO(a60Var, arrayList);
        return arrayList;
    }

    public Collection<Field> OooOO0(a60 a60Var) {
        List<o90> listOooO0oO = this.OooO00o.OooO0oO(y50.class);
        ArrayList arrayList = new ArrayList();
        Iterator<o90> it = listOooO0oO.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().OooOO0o());
        }
        return arrayList;
    }

    public Collection<q90> OooOO0O(a60 a60Var) {
        return this.OooO00o.OooOO0O(y50.class);
    }

    public Collection<Field> OooOO0o(a60 a60Var) {
        List<o90> listOooO0oO = this.OooO00o.OooO0oO(x50.class);
        ArrayList arrayList = new ArrayList();
        Iterator<o90> it = listOooO0oO.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().OooOO0o());
        }
        return arrayList;
    }

    public Collection<q90> OooOOO0(a60 a60Var) {
        return this.OooO00o.OooOO0O(x50.class);
    }
}
