package p285z2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.grandcentrix.tray.provider.TrayContract;
import org.litepal.exceptions.DatabaseGenerateException;
import p285z2.C4196o4;
import p285z2.oc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tb0 extends yb0 {
    private void Oooo0o0(Collection<cc0> collection, SQLiteDatabase sQLiteDatabase, boolean z) throws Throwable {
        for (cc0 cc0Var : collection) {
            if (2 == cc0Var.OooO0O0() || 1 == cc0Var.OooO0O0()) {
                Oooo0o(cc0Var.OooO0Oo(), cc0Var.OooO00o(), cc0Var.OooO0OO(), sQLiteDatabase);
            } else if (3 == cc0Var.OooO0O0()) {
                Oooo0oo(cc0Var.OooO0Oo(), cc0Var.OooO00o(), sQLiteDatabase, z);
            }
        }
        Iterator<ec0> it = OooO().iterator();
        while (it.hasNext()) {
            Oooo0oO(it.next(), sQLiteDatabase, z);
        }
    }

    private void Oooo0oO(ec0 ec0Var, SQLiteDatabase sQLiteDatabase, boolean z) throws Throwable {
        String strOooO0O0 = ec0Var.OooO0O0();
        String strOooO0OO = ec0Var.OooO0OO();
        String strOooO0Oo = ec0Var.OooO0Oo();
        String strOooO0o0 = ec0Var.OooO0o0();
        ArrayList arrayList = new ArrayList();
        dc0 dc0Var = new dc0();
        dc0Var.OooO0oO(strOooO0OO);
        dc0Var.OooO0oo(strOooO0Oo);
        dc0 dc0Var2 = new dc0();
        dc0Var2.OooO0oO(strOooO0o0);
        dc0Var2.OooO0oo("integer");
        arrayList.add(dc0Var);
        arrayList.add(dc0Var2);
        ArrayList arrayList2 = new ArrayList();
        if (!pc0.OooOo00(strOooO0O0, sQLiteDatabase)) {
            arrayList2.add(OoooO00(strOooO0O0, arrayList, false));
        } else if (z) {
            arrayList2.add(OoooO0(strOooO0O0));
            arrayList2.add(OoooO00(strOooO0O0, arrayList, false));
        }
        Oooo000(arrayList2, sQLiteDatabase);
        OoooO0O(strOooO0O0, 2, sQLiteDatabase);
    }

    private void Oooo0oo(String str, String str2, SQLiteDatabase sQLiteDatabase, boolean z) throws Throwable {
        ArrayList arrayList = new ArrayList();
        dc0 dc0Var = new dc0();
        dc0Var.OooO0oO(str + TrayContract.Preferences.Columns.f19815ID);
        dc0Var.OooO0oo("integer");
        dc0 dc0Var2 = new dc0();
        dc0Var2.OooO0oO(str2 + TrayContract.Preferences.Columns.f19815ID);
        dc0Var2.OooO0oo("integer");
        arrayList.add(dc0Var);
        arrayList.add(dc0Var2);
        String strOooOO0O = pc0.OooOO0O(str, str2);
        ArrayList arrayList2 = new ArrayList();
        if (!pc0.OooOo00(strOooOO0O, sQLiteDatabase)) {
            arrayList2.add(OoooO00(strOooOO0O, arrayList, false));
        } else if (z) {
            arrayList2.add(OoooO0(strOooOO0O));
            arrayList2.add(OoooO00(strOooOO0O, arrayList, false));
        }
        Oooo000(arrayList2, sQLiteDatabase);
        OoooO0O(strOooOO0O, 1, sQLiteDatabase);
    }

    private boolean OoooO(List<dc0> list) {
        return list.size() == 0 || (list.size() == 1 && OooOOOo(list.get(0).OooO00o())) || (list.size() == 2 && OooOOOo(list.get(0).OooO00o()) && OooOOOo(list.get(1).OooO00o()));
    }

    private boolean OoooOOO(String str) {
        return oc0.OooO0OO.OooO00o.equalsIgnoreCase(str);
    }

    private boolean OoooOOo(Cursor cursor, String str) {
        if (cursor.moveToFirst()) {
            while (!cursor.getString(cursor.getColumnIndexOrThrow("name")).equalsIgnoreCase(str)) {
                if (!cursor.moveToNext()) {
                }
            }
            return true;
        }
        return false;
    }

    private boolean o000oOoO(Cursor cursor, String str) {
        return (OoooOOo(cursor, str) || OoooOOO(str)) ? false : true;
    }

    @Override // p285z2.yb0
    public void OooOoO(SQLiteDatabase sQLiteDatabase, boolean z) {
        Oooo0o0(Oooo00O(), sQLiteDatabase, z);
    }

    @Override // p285z2.yb0
    public abstract void OooOooO(SQLiteDatabase sQLiteDatabase, boolean z);

    public String Oooo(String str, dc0 dc0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("alter table ");
        sb.append(str);
        sb.append(" add column ");
        sb.append(dc0Var.OooO00o());
        sb.append(C4196o4.OooO00o.OooO0Oo);
        sb.append(dc0Var.OooO0O0());
        if (!dc0Var.OooO0o0()) {
            sb.append(" not null");
        }
        if (dc0Var.OooO0o()) {
            sb.append(" unique");
        }
        String strOooO0OO = dc0Var.OooO0OO();
        if (!TextUtils.isEmpty(strOooO0OO)) {
            sb.append(" default ");
            sb.append(strOooO0OO);
        } else if (!dc0Var.OooO0o0()) {
            if ("integer".equalsIgnoreCase(dc0Var.OooO0O0())) {
                strOooO0OO = "0";
            } else if ("text".equalsIgnoreCase(dc0Var.OooO0O0())) {
                strOooO0OO = "''";
            } else if ("real".equalsIgnoreCase(dc0Var.OooO0O0())) {
                strOooO0OO = "0.0";
            }
            sb.append(" default ");
            sb.append(strOooO0OO);
        }
        qc0.OooO00o(yb0.OooOO0o, "add column sql is >> " + ((Object) sb));
        return sb.toString();
    }

    public void Oooo0o(String str, String str2, String str3, SQLiteDatabase sQLiteDatabase) {
        if (!pc0.OooOo00(str, sQLiteDatabase)) {
            throw new DatabaseGenerateException(DatabaseGenerateException.TABLE_DOES_NOT_EXIST + str);
        }
        if (!pc0.OooOo00(str2, sQLiteDatabase)) {
            throw new DatabaseGenerateException(DatabaseGenerateException.TABLE_DOES_NOT_EXIST + str2);
        }
        String strOooO0oo = null;
        if (str.equals(str3)) {
            strOooO0oo = OooO0oo(str2);
        } else if (str2.equals(str3)) {
            strOooO0oo = OooO0oo(str);
        }
        if (pc0.OooOOOo(strOooO0oo, str3, sQLiteDatabase)) {
            qc0.OooO00o(yb0.OooOO0o, "column " + strOooO0oo + " is already exist, no need to add one");
            return;
        }
        dc0 dc0Var = new dc0();
        dc0Var.OooO0oO(strOooO0oo);
        dc0Var.OooO0oo("integer");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Oooo(str3, dc0Var));
        Oooo000(arrayList, sQLiteDatabase);
    }

    public String OoooO0(String str) {
        return "drop table if exists " + str;
    }

    public String OoooO00(String str, List<dc0> list, boolean z) {
        StringBuilder sb = new StringBuilder("create table ");
        sb.append(str);
        sb.append(" (");
        if (z) {
            sb.append("id integer primary key autoincrement,");
        }
        if (OoooO(list)) {
            sb.deleteCharAt(sb.length() - 1);
        }
        boolean z3 = false;
        for (dc0 dc0Var : list) {
            if (!dc0Var.OooO0Oo()) {
                if (z3) {
                    sb.append(", ");
                }
                sb.append(dc0Var.OooO00o());
                sb.append(C4196o4.OooO00o.OooO0Oo);
                sb.append(dc0Var.OooO0O0());
                if (!dc0Var.OooO0o0()) {
                    sb.append(" not null");
                }
                if (dc0Var.OooO0o()) {
                    sb.append(" unique");
                }
                String strOooO0OO = dc0Var.OooO0OO();
                if (!TextUtils.isEmpty(strOooO0OO)) {
                    sb.append(" default ");
                    sb.append(strOooO0OO);
                }
                z3 = true;
            }
        }
        sb.append(")");
        qc0.OooO00o(yb0.OooOO0o, "create table sql is >> " + ((Object) sb));
        return sb.toString();
    }

    public void OoooO0O(String str, int i, SQLiteDatabase sQLiteDatabase) throws Throwable {
        StringBuilder sb = new StringBuilder("select * from ");
        sb.append(oc0.OooO0OO.OooO00o);
        qc0.OooO00o(yb0.OooOO0o, "giveTableSchemaACopy SQL is >> " + ((Object) sb));
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
                try {
                    if (o000oOoO(cursorRawQuery, str)) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("name", nc0.OooO0O0(str));
                        contentValues.put("type", Integer.valueOf(i));
                        sQLiteDatabase.insert(oc0.OooO0OO.OooO00o, null, contentValues);
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Exception e) {
                    e = e;
                    cursor = cursorRawQuery;
                    e.printStackTrace();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public boolean OoooOO0(String str) {
        return (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.US).endsWith(TrayContract.Preferences.Columns.f19815ID) || str.equalsIgnoreCase(TrayContract.Preferences.Columns.f19815ID)) ? false : true;
    }
}
