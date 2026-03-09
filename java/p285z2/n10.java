package p285z2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n10 {
    private static final List<n10> OooO0Oo = new ArrayList();
    public Object OooO00o;
    public t10 OooO0O0;
    public n10 OooO0OO;

    private n10(Object obj, t10 t10Var) {
        this.OooO00o = obj;
        this.OooO0O0 = t10Var;
    }

    public static n10 OooO00o(t10 t10Var, Object obj) {
        List<n10> list = OooO0Oo;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new n10(obj, t10Var);
            }
            n10 n10VarRemove = list.remove(size - 1);
            n10VarRemove.OooO00o = obj;
            n10VarRemove.OooO0O0 = t10Var;
            n10VarRemove.OooO0OO = null;
            return n10VarRemove;
        }
    }

    public static void OooO0O0(n10 n10Var) {
        n10Var.OooO00o = null;
        n10Var.OooO0O0 = null;
        n10Var.OooO0OO = null;
        List<n10> list = OooO0Oo;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(n10Var);
            }
        }
    }
}
