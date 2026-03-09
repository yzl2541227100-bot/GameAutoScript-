package p285z2;

import android.database.Cursor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class ta0 extends oa0 {
    @Deprecated
    private boolean o00000(sa0 sa0Var, sa0 sa0Var2) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = vb0.OooO0OO().query(o000000(sa0Var, sa0Var2), null, o000000O(sa0Var, sa0Var2), o000000o(sa0Var, sa0Var2), null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        } finally {
            cursorQuery.close();
        }
    }

    private String o000000(sa0 sa0Var, sa0 sa0Var2) {
        return Oooo0oo(sa0Var, sa0Var2.getTableName());
    }

    private String o000000O(sa0 sa0Var, sa0 sa0Var2) {
        return OooO0oo(sa0Var.getTableName()) + " = ? and " + OooO0oo(sa0Var2.getTableName()) + " = ?";
    }

    private String[] o000000o(sa0 sa0Var, sa0 sa0Var2) {
        return new String[]{String.valueOf(sa0Var.getBaseObjId()), String.valueOf(sa0Var2.getBaseObjId())};
    }

    private String o000OOo(mb0 mb0Var) {
        return nc0.OooO0O0(pc0.OooOOO0(mb0Var.OooO0OO()));
    }

    private void o0O0O00(sa0 sa0Var, mb0 mb0Var) {
        sa0Var.addEmptyModelForJoinTable(o000OOo(mb0Var));
    }

    private void o0Oo0oo(Collection<sa0> collection, sa0 sa0Var) {
        if (collection.contains(sa0Var)) {
            return;
        }
        collection.add(sa0Var);
    }

    private void oo0o0Oo(sa0 sa0Var, sa0 sa0Var2) {
        if (sa0Var2.isSaved()) {
            sa0Var.addAssociatedModelForJoinTable(sa0Var2.getTableName(), sa0Var2.getBaseObjId());
        }
    }

    public void o0OO00O(sa0 sa0Var, mb0 mb0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Collection<sa0> collectionOooo00o = Oooo00o(sa0Var, mb0Var);
        o0O0O00(sa0Var, mb0Var);
        if (collectionOooo00o != null) {
            for (sa0 sa0Var2 : collectionOooo00o) {
                Collection<sa0> collectionO00oO0o = o00oO0o(o0ooOOo(sa0Var2, mb0Var), mb0Var.OooO0O0());
                o0Oo0oo(collectionO00oO0o, sa0Var);
                o0OOO0o(sa0Var2, mb0Var, collectionO00oO0o);
                oo0o0Oo(sa0Var, sa0Var2);
            }
        }
    }
}
