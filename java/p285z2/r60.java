package p285z2;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class r60 {
    public static final Comparator<Method> OooO00o = new OooO00o();
    public static final Comparator<Method> OooO0O0 = new OooO0O0();

    public static class OooO00o implements Comparator<Method> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: OooO00o */
        public int compare(Method method, Method method2) {
            int iHashCode = method.getName().hashCode();
            int iHashCode2 = method2.getName().hashCode();
            return iHashCode != iHashCode2 ? iHashCode < iHashCode2 ? -1 : 1 : r60.OooO0O0.compare(method, method2);
        }
    }

    public static class OooO0O0 implements Comparator<Method> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: OooO00o */
        public int compare(Method method, Method method2) {
            int iCompareTo = method.getName().compareTo(method2.getName());
            return iCompareTo != 0 ? iCompareTo : method.toString().compareTo(method2.toString());
        }
    }

    private r60() {
    }

    public static Method[] OooO00o(Class<?> cls) {
        Comparator<Method> comparatorOooO0O0 = OooO0O0((i50) cls.getAnnotation(i50.class));
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (comparatorOooO0O0 != null) {
            Arrays.sort(declaredMethods, comparatorOooO0O0);
        }
        return declaredMethods;
    }

    private static Comparator<Method> OooO0O0(i50 i50Var) {
        return i50Var == null ? OooO00o : i50Var.value().getComparator();
    }
}
