package p285z2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.litepal.exceptions.LitePalSupportException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oa0 extends pa0 {
    private String o0ooOO0(mb0 mb0Var) {
        return OooO0oo(pc0.OooOOO0(mb0Var.OooO0OO()));
    }

    public void o00oO0O(sa0 sa0Var, sa0 sa0Var2) {
        if (sa0Var2 != null) {
            if (sa0Var2.isSaved()) {
                sa0Var.addAssociatedModelWithFK(sa0Var2.getTableName(), sa0Var2.getBaseObjId());
            } else if (sa0Var.isSaved()) {
                sa0Var2.addAssociatedModelWithoutFK(sa0Var.getTableName(), sa0Var.getBaseObjId());
            }
        }
    }

    public Collection<sa0> o00oO0o(Collection<sa0> collection, Field field) {
        Collection<sa0> hashSet;
        if (OooOOo0(field.getType())) {
            hashSet = new ArrayList<>();
        } else {
            if (!OooOo00(field.getType())) {
                throw new LitePalSupportException(LitePalSupportException.WRONG_FIELD_TYPE_FOR_ASSOCIATIONS);
            }
            hashSet = new HashSet<>();
        }
        if (collection != null) {
            hashSet.addAll(collection);
        }
        return hashSet;
    }

    public void o0OOO0o(sa0 sa0Var, mb0 mb0Var, Collection<sa0> collection) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o00O0O(sa0Var, mb0Var.OooO0O0(), collection);
    }

    public Collection<sa0> o0ooOOo(sa0 sa0Var, mb0 mb0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        return (Collection) Oooo0o0(sa0Var, mb0Var.OooO0O0());
    }

    public void o0ooOoO(sa0 sa0Var, mb0 mb0Var) {
        sa0Var.addFKNameToClearSelf(o0ooOO0(mb0Var));
    }

    public void oo000o(sa0 sa0Var, sa0 sa0Var2, mb0 mb0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o00O0O(sa0Var2, mb0Var.OooO0O0(), sa0Var);
    }
}
