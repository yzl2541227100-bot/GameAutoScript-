package p285z2;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class va0 extends oa0 {
    private void o0O0O00(sa0 sa0Var, sa0 sa0Var2) {
        o00oO0O(sa0Var, sa0Var2);
    }

    private void o0OO00O(sa0 sa0Var, sa0 sa0Var2) {
        if (sa0Var2.isSaved()) {
            sa0Var.addAssociatedModelWithFK(sa0Var2.getTableName(), sa0Var2.getBaseObjId());
            sa0Var.addAssociatedModelWithoutFK(sa0Var2.getTableName(), sa0Var2.getBaseObjId());
        }
    }

    private void oo0o0Oo(sa0 sa0Var, sa0 sa0Var2, mb0 mb0Var) {
        if (mb0Var.OooO0O0() != null) {
            o0OO00O(sa0Var, sa0Var2);
        } else {
            o0O0O00(sa0Var, sa0Var2);
        }
    }

    public void o0Oo0oo(sa0 sa0Var, mb0 mb0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        sa0 sa0VarOooo00O = Oooo00O(sa0Var, mb0Var);
        if (sa0VarOooo00O == null) {
            sa0Var.addAssociatedTableNameToClearFK(pc0.OooOOO0(mb0Var.OooO0OO()));
        } else {
            oo000o(sa0Var, sa0VarOooo00O, mb0Var);
            oo0o0Oo(sa0Var, sa0VarOooo00O, mb0Var);
        }
    }
}
