package p285z2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.litepal.exceptions.LitePalSupportException;

/* JADX INFO: loaded from: classes2.dex */
public class xa0 extends pa0 {
    private ContentValues OooOOOO = new ContentValues();

    public xa0(SQLiteDatabase sQLiteDatabase) {
        this.OooOO0 = sQLiteDatabase;
    }

    private long o00000(sa0 sa0Var, ContentValues contentValues) {
        if (contentValues.size() == 0) {
            contentValues.putNull("id");
        }
        return this.OooOO0.insert(sa0Var.getTableName(), null, contentValues);
    }

    private void o000000o(ContentValues contentValues, sa0 sa0Var) {
        Map<String, Long> associatedModelsMapWithoutFK = sa0Var.getAssociatedModelsMapWithoutFK();
        for (String str : associatedModelsMapWithoutFK.keySet()) {
            contentValues.put(OooO0oo(str), associatedModelsMapWithoutFK.get(str));
        }
    }

    private void o00000O(long j) {
        if (j == -1) {
            throw new LitePalSupportException(LitePalSupportException.SAVE_FAILED);
        }
    }

    private boolean o00000O0(String str, Class<?> cls, long j) {
        return (str == null || cls == null || j <= 0) ? false : true;
    }

    private void o00000OO(sa0 sa0Var) {
        Map<String, Set<Long>> associatedModelsMapWithFK = sa0Var.getAssociatedModelsMapWithFK();
        ContentValues contentValues = new ContentValues();
        for (String str : associatedModelsMapWithFK.keySet()) {
            contentValues.clear();
            contentValues.put(OooO0oo(sa0Var.getTableName()), Long.valueOf(sa0Var.getBaseObjId()));
            Set<Long> set = associatedModelsMapWithFK.get(str);
            if (set != null && !set.isEmpty()) {
                this.OooOO0.update(str, contentValues, OoooOO0(set), null);
            }
        }
    }

    private void o00000Oo(sa0 sa0Var, List<Field> list, long j) throws IllegalAccessException, InvocationTargetException {
        for (Field field : list) {
            na0 na0Var = (na0) field.getAnnotation(na0.class);
            String strOooOO0O = OooOO0O(field);
            String strAlgorithm = (na0Var == null || !"java.lang.String".equals(strOooOO0O)) ? null : na0Var.algorithm();
            char c = 1;
            field.setAccessible(true);
            Collection collection = (Collection) field.get(sa0Var);
            if (collection != null) {
                Log.d(pa0.OooOOO, "updateGenericTables: class name is " + sa0Var.getClassName() + " , field name is " + field.getName());
                String strOooO = pc0.OooO(sa0Var.getClassName(), field.getName());
                String strOooOO0 = pc0.OooOO0(sa0Var.getClassName());
                this.OooOO0.delete(strOooO, strOooOO0 + " = ?", new String[]{String.valueOf(j)});
                for (Object obj : collection) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(strOooOO0, Long.valueOf(j));
                    Object objOooOoo = OooOoo(strAlgorithm, obj);
                    if (sa0Var.getClassName().equals(strOooOO0O)) {
                        sa0 sa0Var2 = (sa0) objOooOoo;
                        if (sa0Var2 != null) {
                            long baseObjId = sa0Var2.getBaseObjId();
                            if (baseObjId > 0) {
                                contentValues.put(pc0.OooOO0o(field), Long.valueOf(baseObjId));
                            }
                        }
                    } else {
                        Object[] objArr = new Object[2];
                        objArr[0] = nc0.OooO0O0(pc0.OooO0Oo(field.getName()));
                        objArr[c] = objOooOoo;
                        Class[] clsArr = new Class[2];
                        clsArr[0] = String.class;
                        clsArr[c] = OooOO0(field);
                        ra0.OooO0O0(contentValues, "put", objArr, contentValues.getClass(), clsArr);
                    }
                    this.OooOO0.insert(strOooO, null, contentValues);
                    c = 1;
                }
            }
        }
    }

    private void o00000o0(sa0 sa0Var, ContentValues contentValues) {
        if (contentValues.size() > 0) {
            this.OooOO0.update(sa0Var.getTableName(), contentValues, "id = ?", new String[]{String.valueOf(sa0Var.getBaseObjId())});
        }
    }

    private void o000OOo(sa0 sa0Var, boolean z) {
        Map<String, List<Long>> associatedModelsMapForJoinTable = sa0Var.getAssociatedModelsMapForJoinTable();
        ContentValues contentValues = new ContentValues();
        for (String str : associatedModelsMapForJoinTable.keySet()) {
            String strOooo0oo = Oooo0oo(sa0Var, str);
            if (z) {
                this.OooOO0.delete(strOooo0oo, oo0o0Oo(sa0Var), new String[]{String.valueOf(sa0Var.getBaseObjId())});
            }
            Iterator<Long> it = associatedModelsMapForJoinTable.get(str).iterator();
            while (it.hasNext()) {
                long jLongValue = it.next().longValue();
                contentValues.clear();
                contentValues.put(OooO0oo(sa0Var.getTableName()), Long.valueOf(sa0Var.getBaseObjId()));
                contentValues.put(OooO0oo(str), Long.valueOf(jLongValue));
                this.OooOO0.insert(strOooo0oo, null, contentValues);
            }
        }
    }

    private void o00oO0O(sa0 sa0Var, Field field, long j) {
        try {
            OoooOOO(sa0Var, j);
            if (field != null) {
                o0O0O00(sa0Var, field.getName(), field.getType(), j);
            }
        } catch (Exception e) {
            throw new LitePalSupportException(e.getMessage(), e);
        }
    }

    private void o00oO0o(sa0 sa0Var, List<Field> list) throws IllegalAccessException, InvocationTargetException {
        o00000Oo(sa0Var, list, sa0Var.getBaseObjId());
        o00000OO(sa0Var);
        o000OOo(sa0Var, true);
        o0ooOoO(sa0Var);
    }

    private void o0O0O00(sa0 sa0Var, String str, Class<?> cls, long j) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object objValueOf;
        if (o00000O0(str, cls, j)) {
            if (cls == Integer.TYPE || cls == Integer.class) {
                objValueOf = Integer.valueOf((int) j);
            } else {
                if (cls != Long.TYPE && cls != Long.class) {
                    throw new LitePalSupportException(LitePalSupportException.ID_TYPE_INVALID_EXCEPTION);
                }
                objValueOf = Long.valueOf(j);
            }
            ra0.OooO0Oo(sa0Var, str, objValueOf, sa0Var.getClass());
        }
    }

    private Field o0OO00O(List<Field> list) {
        for (Field field : list) {
            if (OooOOOo(field.getName())) {
                return field;
            }
        }
        return null;
    }

    private void o0OOO0o(sa0 sa0Var, List<Field> list, List<Field> list2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.OooOOOO.clear();
        o0ooOO0(sa0Var, list, this.OooOOOO);
        oo000o(sa0Var, list, list2, o00000(sa0Var, this.OooOOOO));
    }

    private void o0Oo0oo(sa0 sa0Var, List<Field> list, List<Field> list2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.OooOOOO.clear();
        o0ooOOo(sa0Var, list, this.OooOOOO);
        o00000o0(sa0Var, this.OooOOOO);
        o00oO0o(sa0Var, list2);
    }

    private void o0ooOO0(sa0 sa0Var, List<Field> list, ContentValues contentValues) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OoooooO(sa0Var, list, contentValues);
        o000000o(contentValues, sa0Var);
    }

    private void o0ooOOo(sa0 sa0Var, List<Field> list, ContentValues contentValues) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OoooooO(sa0Var, list, contentValues);
        o000000o(contentValues, sa0Var);
        Iterator<String> it = sa0Var.getListToClearSelfFK().iterator();
        while (it.hasNext()) {
            contentValues.putNull(it.next());
        }
    }

    private void o0ooOoO(sa0 sa0Var) {
        for (String str : sa0Var.getListToClearAssociatedFK()) {
            String strOooO0oo = OooO0oo(sa0Var.getTableName());
            ContentValues contentValues = new ContentValues();
            contentValues.putNull(strOooO0oo);
            this.OooOO0.update(str, contentValues, strOooO0oo + " = " + sa0Var.getBaseObjId(), null);
        }
    }

    private void oo000o(sa0 sa0Var, List<Field> list, List<Field> list2, long j) throws IllegalAccessException, InvocationTargetException {
        o00000O(j);
        o00oO0O(sa0Var, o0OO00O(list), j);
        o00000Oo(sa0Var, list2, j);
        o00000OO(sa0Var);
        o000OOo(sa0Var, false);
    }

    private String oo0o0Oo(sa0 sa0Var) {
        return OooO0oo(sa0Var.getTableName()) + " = ?";
    }

    public void o000000(sa0 sa0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String className = sa0Var.getClassName();
        List<Field> listOooOO0o = OooOO0o(className);
        List<Field> listOooOOO0 = OooOOO0(className);
        Collection<mb0> collectionOooO0o0 = OooO0o0(className);
        boolean zIsSaved = sa0Var.isSaved();
        OooOoO0(sa0Var, collectionOooO0o0);
        if (zIsSaved) {
            o0Oo0oo(sa0Var, listOooOO0o, listOooOOO0);
        } else {
            o0OOO0o(sa0Var, listOooOO0o, listOooOOO0);
            OooOoO0(sa0Var, collectionOooO0o0);
        }
    }

    public <T extends sa0> void o000000O(Collection<T> collection) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (collection == null || collection.size() <= 0) {
            return;
        }
        sa0[] sa0VarArr = (sa0[]) collection.toArray(new sa0[0]);
        String className = sa0VarArr[0].getClassName();
        List<Field> listOooOO0o = OooOO0o(className);
        List<Field> listOooOOO0 = OooOOO0(className);
        Collection<mb0> collectionOooO0o0 = OooO0o0(className);
        for (sa0 sa0Var : sa0VarArr) {
            boolean zIsSaved = sa0Var.isSaved();
            OooOoO0(sa0Var, collectionOooO0o0);
            if (zIsSaved) {
                o0Oo0oo(sa0Var, listOooOO0o, listOooOOO0);
            } else {
                o0OOO0o(sa0Var, listOooOO0o, listOooOOO0);
                OooOoO0(sa0Var, collectionOooO0o0);
            }
            sa0Var.clearAssociatedData();
        }
    }
}
