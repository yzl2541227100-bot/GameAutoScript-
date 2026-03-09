package p285z2;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class wb0 extends tb0 {
    public static final String OooOOO0 = "Creator";

    private String OoooOoo(fc0 fc0Var) {
        return OoooO0(fc0Var.OooO0o());
    }

    @Override // p285z2.tb0, p285z2.yb0
    public void OooOooO(SQLiteDatabase sQLiteDatabase, boolean z) {
        Iterator<fc0> it = Oooo00o().iterator();
        while (it.hasNext()) {
            OoooOo0(it.next(), sQLiteDatabase, z);
        }
    }

    public void OoooOo0(fc0 fc0Var, SQLiteDatabase sQLiteDatabase, boolean z) throws Throwable {
        Oooo000(Ooooo00(fc0Var, sQLiteDatabase, z), sQLiteDatabase);
        OoooO0O(fc0Var.OooO0o(), 0, sQLiteDatabase);
    }

    public String OoooOoO(fc0 fc0Var) {
        return OoooO00(fc0Var.OooO0o(), fc0Var.OooO0o0(), true);
    }

    public List<String> Ooooo00(fc0 fc0Var, SQLiteDatabase sQLiteDatabase, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(OoooOoo(fc0Var));
        } else if (pc0.OooOo00(fc0Var.OooO0o(), sQLiteDatabase)) {
            return null;
        }
        arrayList.add(OoooOoO(fc0Var));
        return arrayList;
    }
}
