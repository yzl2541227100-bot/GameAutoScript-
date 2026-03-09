package p285z2;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class ua0 extends oa0 {
    private void o000OOo(sa0 sa0Var, sa0 sa0Var2) {
        o00oO0O(sa0Var, sa0Var2);
    }

    private void o0O0O00(Collection<sa0> collection, sa0 sa0Var, sa0 sa0Var2) {
        if (!collection.contains(sa0Var)) {
            collection.add(sa0Var);
        }
        if (sa0Var2.isSaved()) {
            sa0Var.addAssociatedModelWithoutFK(sa0Var2.getTableName(), sa0Var2.getBaseObjId());
        }
    }

    private void o0OO00O(sa0 sa0Var, mb0 mb0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        sa0 sa0VarOooo00O = Oooo00O(sa0Var, mb0Var);
        if (sa0VarOooo00O == null) {
            o0ooOoO(sa0Var, mb0Var);
            return;
        }
        Collection<sa0> collectionO00oO0o = o00oO0o(o0ooOOo(sa0VarOooo00O, mb0Var), mb0Var.OooO0O0());
        o0OOO0o(sa0VarOooo00O, mb0Var, collectionO00oO0o);
        o0O0O00(collectionO00oO0o, sa0Var, sa0VarOooo00O);
    }

    private void oo0o0Oo(sa0 sa0Var, mb0 mb0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Collection<sa0> collectionOooo00o = Oooo00o(sa0Var, mb0Var);
        if (collectionOooo00o == null || collectionOooo00o.isEmpty()) {
            sa0Var.addAssociatedTableNameToClearFK(pc0.OooOOO0(mb0Var.OooO0OO()));
            return;
        }
        for (sa0 sa0Var2 : collectionOooo00o) {
            oo000o(sa0Var, sa0Var2, mb0Var);
            o000OOo(sa0Var, sa0Var2);
        }
    }

    public void o0Oo0oo(sa0 sa0Var, mb0 mb0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (sa0Var.getClassName().equals(mb0Var.OooO0o0())) {
            o0OO00O(sa0Var, mb0Var);
        } else {
            oo0o0Oo(sa0Var, mb0Var);
        }
    }
}
