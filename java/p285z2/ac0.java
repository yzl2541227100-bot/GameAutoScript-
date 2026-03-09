package p285z2;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ac0 extends ub0 {
    public fc0 OooOOo;
    public fc0 OooOOo0;
    private boolean OooOOoo;

    private List<String> o00000() {
        String strOooooo = Oooooo(this.OooOOo0.OooO0o());
        String strOoooOoO = OoooOoO(this.OooOOo0);
        List<String> listO000000O = o000000O();
        String strOoooooo = Ooooooo(this.OooOOo);
        String strO0OoOo0 = o0OoOo0(this.OooOOo0.OooO0o());
        ArrayList arrayList = new ArrayList();
        arrayList.add(strOooooo);
        arrayList.add(strOoooOoO);
        arrayList.addAll(listO000000O);
        arrayList.add(strOoooooo);
        arrayList.add(strO0OoOo0);
        qc0.OooO00o(ub0.OooOOOo, "generateChangeConstraintSQL >> ");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qc0.OooO00o(ub0.OooOOOo, (String) it.next());
        }
        qc0.OooO00o(ub0.OooOOOo, "<< generateChangeConstraintSQL");
        return arrayList;
    }

    private String o000000(dc0 dc0Var) {
        return Oooo(this.OooOOo0.OooO0o(), dc0Var);
    }

    private List<String> o000000O() {
        ArrayList arrayList = new ArrayList();
        for (String str : ooOO(this.OooOOo0)) {
            if (!this.OooOOo0.OooO0O0(str)) {
                dc0 dc0Var = new dc0();
                dc0Var.OooO0oO(str);
                dc0Var.OooO0oo("integer");
                arrayList.add(Oooo(this.OooOOo0.OooO0o(), dc0Var));
            }
        }
        return arrayList;
    }

    private List<String> o000000o(List<dc0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<dc0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(o000000(it.next()));
        }
        return arrayList;
    }

    private boolean o00000O(String str) {
        return (!o00000OO(str) || OooOOOo(str) || o00o0O(this.OooOOo0, str)) ? false : true;
    }

    private boolean o00000O0() {
        for (dc0 dc0Var : this.OooOOo0.OooO0o0()) {
            dc0 dc0VarOooO0Oo = this.OooOOo.OooO0Oo(dc0Var.OooO00o());
            if (dc0Var.OooO0o() && (dc0VarOooO0Oo == null || !dc0VarOooO0Oo.OooO0o())) {
                return true;
            }
            if (dc0VarOooO0Oo != null && !dc0Var.OooO0o0() && dc0VarOooO0Oo.OooO0o0()) {
                return true;
            }
        }
        return false;
    }

    private boolean o00000OO(String str) {
        return !this.OooOOo0.OooO0O0(str);
    }

    private void o00000Oo(List<String> list) {
        qc0.OooO00o(ub0.OooOOOo, "do removeColumns " + list);
        o00oO0o(list, this.OooOOo0.OooO0o());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.OooOOo.OooO0oO(it.next());
        }
    }

    private void o00000o0() throws Throwable {
        if (!o00000O0()) {
            this.OooOOoo = false;
            o00000Oo(o000OOo());
            o0OOO0o(o0O0O00());
            o0OO00O(oo0o0Oo());
            o0Oo0oo();
            return;
        }
        OoooOo0(this.OooOOo0, this.OooOOOO, true);
        for (mb0 mb0Var : OooO0o0(this.OooOOo0.OooO0OO())) {
            if (mb0Var.OooO0Oo() == 2 || mb0Var.OooO0Oo() == 1) {
                if (mb0Var.OooO0o0().equalsIgnoreCase(this.OooOOo0.OooO0OO())) {
                    Oooo0o(this.OooOOo0.OooO0o(), pc0.OooOOO0(mb0Var.OooO0OO()), this.OooOOo0.OooO0o(), this.OooOOOO);
                }
            }
        }
    }

    private List<String> o000OOo() {
        String strOooO0o = this.OooOOo0.OooO0o();
        ArrayList arrayList = new ArrayList();
        Iterator<dc0> it = this.OooOOo.OooO0o0().iterator();
        while (it.hasNext()) {
            String strOooO00o = it.next().OooO00o();
            if (o00000O(strOooO00o)) {
                arrayList.add(strOooO00o);
            }
        }
        qc0.OooO00o(ub0.OooOOOo, "remove columns from " + strOooO0o + " >> " + arrayList);
        return arrayList;
    }

    private List<dc0> o0O0O00() {
        ArrayList arrayList = new ArrayList();
        for (dc0 dc0Var : this.OooOOo0.OooO0o0()) {
            if (!this.OooOOo.OooO0O0(dc0Var.OooO00o())) {
                arrayList.add(dc0Var);
            }
        }
        return arrayList;
    }

    private void o0OO00O(List<dc0> list) {
        qc0.OooO00o(ub0.OooOOOo, "do changeColumnsType");
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<dc0> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().OooO00o());
            }
        }
        o00000Oo(arrayList);
        o0OOO0o(list);
    }

    private void o0OOO0o(List<dc0> list) {
        qc0.OooO00o(ub0.OooOOOo, "do addColumn");
        Oooo000(o000000o(list), this.OooOOOO);
        Iterator<dc0> it = list.iterator();
        while (it.hasNext()) {
            this.OooOOo.OooO00o(it.next());
        }
    }

    private void o0Oo0oo() {
        if (this.OooOOoo) {
            qc0.OooO00o(ub0.OooOOOo, "do changeColumnsConstraints");
            Oooo000(o00000(), this.OooOOOO);
        }
    }

    private List<dc0> oo0o0Oo() {
        ArrayList arrayList = new ArrayList();
        for (dc0 dc0Var : this.OooOOo.OooO0o0()) {
            for (dc0 dc0Var2 : this.OooOOo0.OooO0o0()) {
                if (dc0Var.OooO00o().equalsIgnoreCase(dc0Var2.OooO00o())) {
                    if (!dc0Var.OooO0O0().equalsIgnoreCase(dc0Var2.OooO0O0()) && (!dc0Var2.OooO0O0().equalsIgnoreCase("blob") || !TextUtils.isEmpty(dc0Var.OooO0O0()))) {
                        arrayList.add(dc0Var2);
                    }
                    if (!this.OooOOoo) {
                        qc0.OooO00o(ub0.OooOOOo, "default value db is:" + dc0Var.OooO0OO() + ", default value is:" + dc0Var2.OooO0OO());
                        if (dc0Var.OooO0o0() != dc0Var2.OooO0o0() || !dc0Var.OooO0OO().equalsIgnoreCase(dc0Var2.OooO0OO()) || (dc0Var.OooO0o() && !dc0Var2.OooO0o())) {
                            this.OooOOoo = true;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // p285z2.ub0, p285z2.wb0, p285z2.tb0, p285z2.yb0
    public void OooOooO(SQLiteDatabase sQLiteDatabase, boolean z) {
        this.OooOOOO = sQLiteDatabase;
        for (fc0 fc0Var : Oooo00o()) {
            this.OooOOo0 = fc0Var;
            this.OooOOo = o00Oo0(fc0Var.OooO0o());
            qc0.OooO00o(ub0.OooOOOo, "createOrUpgradeTable: model is " + this.OooOOo0.OooO0o());
            o00000o0();
        }
    }
}
