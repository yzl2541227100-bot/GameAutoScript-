package p285z2;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p285z2.C4196o4;
import p285z2.oc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ub0 extends wb0 {
    public static final String OooOOOo = "AssociationUpdater";
    private Collection<cc0> OooOOO;
    public SQLiteDatabase OooOOOO;

    private List<String> OooooOO(fc0 fc0Var) {
        ArrayList arrayList = new ArrayList();
        List<String> listOoOO = ooOO(fc0Var);
        String strOooO0o = fc0Var.OooO0o();
        for (String str : listOoOO) {
            if (o0ooOoO(strOooO0o, pc0.OooOOO(str))) {
                arrayList.add(str);
            }
        }
        qc0.OooO00o(OooOOOo, "findForeignKeyToRemove >> " + fc0Var.OooO0o() + C4196o4.OooO00o.OooO0Oo + arrayList);
        return arrayList;
    }

    private List<String> OooooOo() {
        ArrayList arrayList = new ArrayList();
        for (String str : pc0.OooO0o(this.OooOOOO)) {
            if (pc0.OooOOo(str, this.OooOOOO)) {
                boolean z = true;
                Iterator<ec0> it = OooO().iterator();
                while (it.hasNext()) {
                    if (str.equalsIgnoreCase(it.next().OooO0O0())) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    private List<String> Oooooo0() {
        ArrayList arrayList = new ArrayList();
        for (String str : pc0.OooO0o(this.OooOOOO)) {
            if (pc0.OooOOoo(str, this.OooOOOO)) {
                boolean z = true;
                for (cc0 cc0Var : this.OooOOO) {
                    if (cc0Var.OooO0O0() == 3 && str.equalsIgnoreCase(pc0.OooOO0O(cc0Var.OooO0Oo(), cc0Var.OooO00o()))) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(str);
                }
            }
        }
        qc0.OooO00o(OooOOOo, "findIntermediateTablesToDrop >> " + arrayList);
        return arrayList;
    }

    private String OoooooO(Collection<String> collection, fc0 fc0Var) {
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            fc0Var.OooO0oO(it.next());
        }
        return OoooOoO(fc0Var);
    }

    private List<String> o00O0O(Collection<String> collection, String str) {
        fc0 fc0VarO00Oo0 = o00Oo0(str);
        String strOooooo = Oooooo(str);
        qc0.OooO00o(OooOOOo, "generateRemoveColumnSQL >> " + strOooooo);
        String strOoooooO = OoooooO(collection, fc0VarO00Oo0);
        qc0.OooO00o(OooOOOo, "generateRemoveColumnSQL >> " + strOoooooO);
        String strOoooooo = Ooooooo(fc0VarO00Oo0);
        qc0.OooO00o(OooOOOo, "generateRemoveColumnSQL >> " + strOoooooo);
        String strO0OoOo0 = o0OoOo0(str);
        qc0.OooO00o(OooOOOo, "generateRemoveColumnSQL >> " + strO0OoOo0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strOooooo);
        arrayList.add(strOoooooO);
        arrayList.add(strOoooooo);
        arrayList.add(strO0OoOo0);
        return arrayList;
    }

    private void o00oO0O() {
        Iterator<String> it = pb0.OooO0oo().OooO0o0().iterator();
        while (it.hasNext()) {
            fc0 fc0VarOooOOO = OooOOO(it.next());
            o00oO0o(OooooOO(fc0VarOooOOO), fc0VarOooOOO.OooO0o());
        }
    }

    private boolean o00ooo(cc0 cc0Var, String str, String str2) {
        return cc0Var.OooO0Oo().equalsIgnoreCase(str) && cc0Var.OooO00o().equalsIgnoreCase(str2);
    }

    private void o0ooOO0() {
        List<String> listOooooOo = OooooOo();
        OooooO0(listOooooOo, this.OooOOOO);
        Ooooo0o(listOooooOo);
    }

    private void o0ooOOo() {
        List<String> listOooooo0 = Oooooo0();
        OooooO0(listOooooo0, this.OooOOOO);
        Ooooo0o(listOooooo0);
    }

    private boolean o0ooOoO(String str, String str2) {
        for (cc0 cc0Var : this.OooOOO) {
            if (cc0Var.OooO0O0() != 1) {
                if (cc0Var.OooO0O0() == 2 && o00ooo(cc0Var, str2, str)) {
                    return false;
                }
            } else if (!str.equalsIgnoreCase(cc0Var.OooO0OO())) {
                continue;
            } else if (cc0Var.OooO0Oo().equalsIgnoreCase(str)) {
                if (o00ooo(cc0Var, str, str2)) {
                    return false;
                }
            } else if (cc0Var.OooO00o().equalsIgnoreCase(str) && o00ooo(cc0Var, str2, str)) {
                return false;
            }
        }
        return true;
    }

    private void oo000o() {
        o00oO0O();
        o0ooOOo();
        o0ooOO0();
    }

    @Override // p285z2.tb0, p285z2.yb0
    public void OooOoO(SQLiteDatabase sQLiteDatabase, boolean z) {
        this.OooOOO = Oooo00O();
        this.OooOOOO = sQLiteDatabase;
        oo000o();
    }

    @Override // p285z2.wb0, p285z2.tb0, p285z2.yb0
    public abstract void OooOooO(SQLiteDatabase sQLiteDatabase, boolean z);

    public void Ooooo0o(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("delete from ");
        sb.append(oc0.OooO0OO.OooO00o);
        sb.append(" where");
        boolean z = false;
        for (String str : list) {
            if (z) {
                sb.append(" or ");
            }
            z = true;
            sb.append(" lower(");
            sb.append("name");
            sb.append(") ");
            sb.append("=");
            sb.append(" lower('");
            sb.append(str);
            sb.append("')");
        }
        qc0.OooO00o(OooOOOo, "clear table schema value sql is " + ((Object) sb));
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb.toString());
        Oooo000(arrayList, this.OooOOOO);
    }

    public void OooooO0(List<String> list, SQLiteDatabase sQLiteDatabase) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(OoooO0(list.get(i)));
        }
        Oooo000(arrayList, sQLiteDatabase);
    }

    public String Oooooo(String str) {
        return "alter table " + str + " rename to " + o00Ooo(str);
    }

    public String Ooooooo(fc0 fc0Var) {
        String strOooO0o = fc0Var.OooO0o();
        List<dc0> listOooO0o0 = fc0Var.OooO0o0();
        if (listOooO0o0.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("insert into ");
        sb.append(strOooO0o);
        sb.append("(");
        boolean z = false;
        boolean z3 = false;
        for (dc0 dc0Var : listOooO0o0) {
            if (z3) {
                sb.append(", ");
            }
            sb.append(dc0Var.OooO00o());
            z3 = true;
        }
        sb.append(") ");
        sb.append("select ");
        for (dc0 dc0Var2 : listOooO0o0) {
            if (z) {
                sb.append(", ");
            }
            sb.append(dc0Var2.OooO00o());
            z = true;
        }
        sb.append(" from ");
        sb.append(o00Ooo(strOooO0o));
        return sb.toString();
    }

    public fc0 o00Oo0(String str) {
        return pc0.OooO0oO(str, this.OooOOOO);
    }

    public String o00Ooo(String str) {
        return str + "_temp";
    }

    public boolean o00o0O(fc0 fc0Var, String str) {
        return nc0.OooO0Oo(ooOO(fc0Var), str);
    }

    public void o00oO0o(Collection<String> collection, String str) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Oooo000(o00O0O(collection, str), this.OooOOOO);
    }

    public String o0OoOo0(String str) {
        return OoooO0(o00Ooo(str));
    }

    public List<String> ooOO(fc0 fc0Var) {
        ArrayList arrayList = new ArrayList();
        for (dc0 dc0Var : o00Oo0(fc0Var.OooO0o()).OooO0o0()) {
            String strOooO00o = dc0Var.OooO00o();
            if (OoooOO0(dc0Var.OooO00o()) && !fc0Var.OooO0O0(strOooO00o)) {
                qc0.OooO00o(OooOOOo, "getForeignKeyColumnNames >> foreign key column is " + strOooO00o);
                arrayList.add(strOooO00o);
            }
        }
        return arrayList;
    }
}
