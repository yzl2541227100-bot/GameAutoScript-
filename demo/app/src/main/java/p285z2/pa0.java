package p285z2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import com.umeng.commonsdk.proguard.C3471v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.grandcentrix.tray.provider.TrayContract;
import org.litepal.exceptions.DatabaseGenerateException;
import org.litepal.exceptions.LitePalSupportException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pa0 extends ja0 {
    public static final String OooOOO = "DataHandler";
    public SQLiteDatabase OooOO0;
    private sa0 OooOO0O;
    private List<mb0> OooOO0o;
    private List<mb0> OooOOO0;

    public class OooO00o {
        public String OooO00o;
        public Field OooO0O0;

        public OooO00o() {
        }
    }

    private void OooOoO(String str) {
        Collection<mb0> collectionOooO0o0 = OooO0o0(str);
        List<mb0> list = this.OooOO0o;
        if (list == null) {
            this.OooOO0o = new ArrayList();
        } else {
            list.clear();
        }
        List<mb0> list2 = this.OooOOO0;
        if (list2 == null) {
            this.OooOOO0 = new ArrayList();
        } else {
            list2.clear();
        }
        for (mb0 mb0Var : collectionOooO0o0) {
            if (mb0Var.OooO0Oo() == 2 || mb0Var.OooO0Oo() == 1) {
                List<mb0> list3 = mb0Var.OooO0o0().equals(str) ? this.OooOO0o : this.OooOOO0;
                list3.add(mb0Var);
            } else if (mb0Var.OooO0Oo() == 3) {
                list3.add(mb0Var);
            }
        }
    }

    private String OooOooo(Class<?> cls) {
        String str = "get" + (cls.isPrimitive() ? nc0.OooO00o(cls.getName()) : cls.getSimpleName());
        if (!"getBoolean".equals(str)) {
            if ("getChar".equals(str) || "getCharacter".equals(str)) {
                return "getString";
            }
            if ("getDate".equals(str)) {
                return "getLong";
            }
            if (!"getInteger".equals(str)) {
                return "getbyte[]".equalsIgnoreCase(str) ? "getBlob" : str;
            }
        }
        return "getInt";
    }

    private Class<?> Oooo(Class<?> cls) {
        if (cls == null || !cls.isPrimitive()) {
            return null;
        }
        String name = cls.getName();
        if ("int".equals(name)) {
            return Integer.class;
        }
        if ("short".equals(name)) {
            return Short.class;
        }
        if ("long".equals(name)) {
            return Long.class;
        }
        if ("float".equals(name)) {
            return Float.class;
        }
        if ("double".equals(name)) {
            return Double.class;
        }
        if ("boolean".equals(name)) {
            return Boolean.class;
        }
        if ("char".equals(name)) {
            return Character.class;
        }
        return null;
    }

    private String Oooo000(Field field) {
        return OooOooo(OooOOOO(field.getType()) ? OooOO0(field) : field.getType());
    }

    private String[] Oooo0O0(String[] strArr, List<Field> list, List<mb0> list2) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator<Field> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getName());
        }
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (nc0.OooO0Oo(arrayList2, str)) {
                arrayList3.add(Integer.valueOf(i));
            } else if (OooOOOo(str)) {
                if (TrayContract.Preferences.Columns.f19815ID.equalsIgnoreCase(str)) {
                    arrayList.set(i, nc0.OooO0O0("id"));
                }
                z = true;
            }
        }
        for (int size = arrayList3.size() - 1; size >= 0; size--) {
            arrayList4.add((String) arrayList.remove(((Integer) arrayList3.get(size)).intValue()));
        }
        for (Field field : list) {
            if (nc0.OooO0Oo(arrayList4, field.getName())) {
                arrayList5.add(field);
            }
        }
        list.clear();
        list.addAll(arrayList5);
        if (list2 != null && list2.size() > 0) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                arrayList.add(OooO0oo(pc0.OooOOO0(list2.get(i2).OooO0OO())));
            }
        }
        if (!z) {
            arrayList.add(nc0.OooO0O0("id"));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private Object Oooo0oO(Class<?> cls, Class<?> cls2) {
        String name = cls2.getName();
        if ("boolean".equals(name) || "java.lang.Boolean".equals(name)) {
            return Boolean.FALSE;
        }
        if ("float".equals(name) || "java.lang.Float".equals(name)) {
            return Float.valueOf(0.0f);
        }
        if ("double".equals(name) || "java.lang.Double".equals(name)) {
            return Double.valueOf(0.0d);
        }
        if ("int".equals(name) || "java.lang.Integer".equals(name)) {
            return 0;
        }
        if ("long".equals(name) || "java.lang.Long".equals(name)) {
            return 0L;
        }
        if ("short".equals(name) || "java.lang.Short".equals(name)) {
            return 0;
        }
        if ("char".equals(name) || "java.lang.Character".equals(name)) {
            return ' ';
        }
        if ("[B".equals(name) || "[Ljava.lang.Byte;".equals(name)) {
            return new byte[0];
        }
        if ("java.lang.String".equals(name)) {
            return "";
        }
        if (cls == cls2) {
            return null;
        }
        return OooOoOO(cls2);
    }

    private boolean OoooOo0(Field field) {
        String name = field.getType().getName();
        return name.equals("char") || name.endsWith("Character");
    }

    private boolean OoooOoO(sa0 sa0Var, Field field) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        sa0 sa0VarOooo0OO = Oooo0OO(sa0Var);
        Object objOooo0o0 = Oooo0o0(sa0Var, field);
        Object objOooo0o02 = Oooo0o0(sa0VarOooo0OO, field);
        return (objOooo0o0 == null || objOooo0o02 == null) ? objOooo0o0 == objOooo0o02 : objOooo0o0.toString().equals(objOooo0o02.toString());
    }

    private boolean OoooOoo(Field field) {
        return "boolean".equals(field.getType().getName());
    }

    private boolean Ooooo00() {
        return xa0.class.getName().equals(getClass().getName());
    }

    private boolean Ooooo0o() {
        return ya0.class.getName().equals(getClass().getName());
    }

    private String OooooO0(Field field) {
        String str;
        StringBuilder sb;
        String name = field.getName();
        if (OoooOoo(field)) {
            if (name.matches("^is[A-Z]{1}.*$")) {
                name = name.substring(2);
            }
            str = C3471v.f18944Y;
        } else {
            str = "get";
        }
        if (name.matches("^[a-z]{1}[A-Z]{1}.*")) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(name);
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(nc0.OooO00o(name));
        }
        return sb.toString();
    }

    private String OooooOO(Field field) {
        StringBuilder sb;
        String strOooO00o;
        if (OoooOoo(field) && field.getName().matches("^is[A-Z]{1}.*$")) {
            sb = new StringBuilder();
            sb.append("set");
            strOooO00o = field.getName().substring(2);
        } else if (field.getName().matches("^[a-z]{1}[A-Z]{1}.*")) {
            sb = new StringBuilder();
            sb.append("set");
            strOooO00o = field.getName();
        } else {
            sb = new StringBuilder();
            sb.append("set");
            strOooO00o = nc0.OooO00o(field.getName());
        }
        sb.append(strOooO00o);
        return sb.toString();
    }

    private void Ooooooo(sa0 sa0Var, Field field, ContentValues contentValues) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Ooooo0o()) {
            if (OoooOoO(sa0Var, field)) {
                return;
            }
            Oooooo(sa0Var, field, contentValues);
        } else if (Ooooo00()) {
            Oooooo0(sa0Var, field, contentValues);
        }
    }

    private void o00Ooo(Object obj, Field field, int i, String str, Cursor cursor) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object objInvoke = cursor.getClass().getMethod(str, Integer.TYPE).invoke(cursor, Integer.valueOf(i));
        if (field.getType() == Boolean.TYPE || field.getType() == Boolean.class) {
            if ("0".equals(String.valueOf(objInvoke))) {
                objInvoke = Boolean.FALSE;
            } else if ("1".equals(String.valueOf(objInvoke))) {
                objInvoke = Boolean.TRUE;
            }
        } else if (field.getType() == Character.TYPE || field.getType() == Character.class) {
            objInvoke = Character.valueOf(((String) objInvoke).charAt(0));
        } else if (field.getType() == Date.class) {
            long jLongValue = ((Long) objInvoke).longValue();
            objInvoke = jLongValue <= 0 ? null : new Date(jLongValue);
        }
        if (!OooOOOO(field.getType())) {
            na0 na0Var = (na0) field.getAnnotation(na0.class);
            if (na0Var != null && "java.lang.String".equals(field.getType().getName())) {
                objInvoke = OooOoo0(na0Var.algorithm(), objInvoke);
            }
            ra0.OooO0Oo(obj, field.getName(), objInvoke, obj.getClass());
            return;
        }
        Collection arrayList = (Collection) ra0.OooO00o(obj, field.getName(), obj.getClass());
        if (arrayList == null) {
            arrayList = OooOOo0(field.getType()) ? new ArrayList() : new HashSet();
            ra0.OooO0Oo(obj, field.getName(), arrayList, obj.getClass());
        }
        String strOooOO0O = OooOO0O(field);
        if ("java.lang.String".equals(strOooOO0O)) {
            na0 na0Var2 = (na0) field.getAnnotation(na0.class);
            if (na0Var2 != null) {
                objInvoke = OooOoo0(na0Var2.algorithm(), objInvoke);
            }
        } else if (obj.getClass().getName().equals(strOooOO0O) && ((objInvoke instanceof Long) || (objInvoke instanceof Integer))) {
            objInvoke = la0.OooOOo0(obj.getClass(), ((Long) objInvoke).longValue());
        }
        arrayList.add(objInvoke);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ooOO(p285z2.sa0 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.pa0.ooOO(z2.sa0):void");
    }

    public void OooOoO0(sa0 sa0Var, Collection<mb0> collection) {
        try {
            for (mb0 mb0Var : collection) {
                if (mb0Var.OooO0Oo() == 2) {
                    new ua0().o0Oo0oo(sa0Var, mb0Var);
                } else if (mb0Var.OooO0Oo() == 1) {
                    new va0().o0Oo0oo(sa0Var, mb0Var);
                } else if (mb0Var.OooO0Oo() == 3) {
                    new ta0().o0OO00O(sa0Var, mb0Var);
                }
            }
        } catch (Exception e) {
            throw new LitePalSupportException(e.getMessage(), e);
        }
    }

    public Object OooOoOO(Class<?> cls) {
        try {
            Constructor<?> constructorOooOooO = OooOooO(cls);
            return constructorOooOooO.newInstance(Oooo0(cls, constructorOooOooO));
        } catch (Exception e) {
            throw new LitePalSupportException(e.getMessage(), e);
        }
    }

    public Object OooOoo(String str, Object obj) {
        return (str == null || obj == null) ? obj : sa0.AES.equalsIgnoreCase(str) ? tc0.OooO0O0((String) obj) : "MD5".equalsIgnoreCase(str) ? tc0.OooO0OO((String) obj) : obj;
    }

    public Object OooOoo0(String str, Object obj) {
        return (str == null || obj == null || !sa0.AES.equalsIgnoreCase(str)) ? obj : tc0.OooO00o((String) obj);
    }

    public Constructor<?> OooOooO(Class<?> cls) {
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        SparseArray sparseArray = new SparseArray();
        int i = Integer.MAX_VALUE;
        for (Constructor<?> constructor : declaredConstructors) {
            int length = constructor.getParameterTypes().length;
            for (Class<?> cls2 : constructor.getParameterTypes()) {
                if (cls2 == cls || (cls2.getName().startsWith("com.android") && cls2.getName().endsWith("InstantReloadException"))) {
                    length += 10000;
                }
            }
            if (sparseArray.get(length) == null) {
                sparseArray.put(length, constructor);
            }
            if (length < i) {
                i = length;
            }
        }
        Constructor<?> constructor2 = (Constructor) sparseArray.get(i);
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
        return constructor2;
    }

    public Object[] Oooo0(Class<?> cls, Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            objArr[i] = Oooo0oO(cls, parameterTypes[i]);
        }
        return objArr;
    }

    public sa0 Oooo00O(sa0 sa0Var, mb0 mb0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        return (sa0) Oooo0o0(sa0Var, mb0Var.OooO00o());
    }

    public Collection<sa0> Oooo00o(sa0 sa0Var, mb0 mb0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        return (Collection) Oooo0o0(sa0Var, mb0Var.OooO00o());
    }

    public sa0 Oooo0OO(sa0 sa0Var) {
        sa0 sa0Var2 = this.OooOO0O;
        if (sa0Var2 != null) {
            return sa0Var2;
        }
        String className = null;
        try {
            className = sa0Var.getClassName();
            sa0 sa0Var3 = (sa0) Class.forName(className).newInstance();
            this.OooOO0O = sa0Var3;
            return sa0Var3;
        } catch (ClassNotFoundException unused) {
            throw new DatabaseGenerateException(DatabaseGenerateException.CLASS_NOT_FOUND + className);
        } catch (InstantiationException e) {
            throw new LitePalSupportException(className + LitePalSupportException.INSTANTIATION_EXCEPTION, e);
        } catch (Exception e2) {
            throw new LitePalSupportException(e2.getMessage(), e2);
        }
    }

    public List<mb0> Oooo0o(String str, boolean z) {
        if (!z) {
            return null;
        }
        OooOoO(str);
        return this.OooOO0o;
    }

    public Object Oooo0o0(sa0 sa0Var, Field field) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (o00ooo(sa0Var, field)) {
            return ra0.OooO00o(sa0Var, field.getName(), sa0Var.getClass());
        }
        return null;
    }

    public String Oooo0oo(sa0 sa0Var, String str) {
        return nc0.OooO0O0(pc0.OooOO0O(sa0Var.getTableName(), str));
    }

    public String OoooO(String... strArr) {
        if (OoooOOo(strArr) || strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public String OoooO0(Class<?> cls) {
        return nc0.OooO0O0(pc0.OooOOO0(cls.getName()));
    }

    public Class<?>[] OoooO00(Field field, Object obj, Object[] objArr) {
        Class<?>[] clsArr;
        if (OoooOo0(field)) {
            objArr[1] = String.valueOf(obj);
            return new Class[]{String.class, String.class};
        }
        if (field.getType().isPrimitive()) {
            clsArr = new Class[]{String.class, Oooo(field.getType())};
        } else {
            if ("java.util.Date".equals(field.getType().getName())) {
                return new Class[]{String.class, Long.class};
            }
            clsArr = new Class[]{String.class, field.getType()};
        }
        return clsArr;
    }

    public String[] OoooO0O(String... strArr) {
        if (OoooOOo(strArr) || strArr == null || strArr.length <= 1) {
            return null;
        }
        String[] strArr2 = new String[strArr.length - 1];
        System.arraycopy(strArr, 1, strArr2, 0, strArr.length - 1);
        return strArr2;
    }

    public String OoooOO0(Collection<Long> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (z) {
                sb.append(" or ");
            }
            z = true;
            sb.append("id = ");
            sb.append(jLongValue);
        }
        return nc0.OooO0O0(sb.toString());
    }

    public void OoooOOO(sa0 sa0Var, long j) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (j > 0) {
            ra0.OooO0OO(sa0Var, "baseObjId", Long.valueOf(j), sa0.class);
        }
    }

    public boolean OoooOOo(Object... objArr) {
        return objArr != null && objArr.length == 0;
    }

    public <T> T OooooOo(String str, String[] strArr, String[] strArr2, Class<T> cls) throws Throwable {
        nc0.OooO0OO(strArr2);
        Cursor cursor = (T) null;
        try {
            try {
                Cursor cursorQuery = this.OooOO0.query(str, strArr, OoooO(strArr2), OoooO0O(strArr2), null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        cursor = (T) cursorQuery.getClass().getMethod(OooOooo(cls), Integer.TYPE).invoke(cursorQuery, 0);
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return (T) cursor;
                } catch (Exception e) {
                    e = e;
                    cursor = (T) cursorQuery;
                    throw new LitePalSupportException(e.getMessage(), e);
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
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

    public void Oooooo(sa0 sa0Var, Field field, ContentValues contentValues) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object objOooo0o0 = Oooo0o0(sa0Var, field);
        if ("java.util.Date".equals(field.getType().getName()) && objOooo0o0 != null) {
            objOooo0o0 = Long.valueOf(((Date) objOooo0o0).getTime());
        }
        na0 na0Var = (na0) field.getAnnotation(na0.class);
        if (na0Var != null && "java.lang.String".equals(field.getType().getName())) {
            objOooo0o0 = OooOoo(na0Var.algorithm(), objOooo0o0);
        }
        Object[] objArr = {nc0.OooO0O0(pc0.OooO0Oo(field.getName())), objOooo0o0};
        ra0.OooO0O0(contentValues, "put", objArr, contentValues.getClass(), OoooO00(field, objOooo0o0, objArr));
    }

    public void Oooooo0(sa0 sa0Var, Field field, ContentValues contentValues) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object objOooO00o = ra0.OooO00o(sa0Var, field.getName(), sa0Var.getClass());
        if (objOooO00o != null) {
            if ("java.util.Date".equals(field.getType().getName())) {
                objOooO00o = Long.valueOf(((Date) objOooO00o).getTime());
            }
            na0 na0Var = (na0) field.getAnnotation(na0.class);
            if (na0Var != null && "java.lang.String".equals(field.getType().getName())) {
                objOooO00o = OooOoo(na0Var.algorithm(), objOooO00o);
            }
            Object[] objArr = {nc0.OooO0O0(pc0.OooO0Oo(field.getName())), objOooO00o};
            ra0.OooO0O0(contentValues, "put", objArr, contentValues.getClass(), OoooO00(field, objOooO00o, objArr));
        }
    }

    public void OoooooO(sa0 sa0Var, List<Field> list, ContentValues contentValues) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        for (Field field : list) {
            if (!OooOOOo(field.getName())) {
                Ooooooo(sa0Var, field, contentValues);
            }
        }
    }

    public String o000oOoO(long... jArr) {
        StringBuilder sb = new StringBuilder();
        int length = jArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            long j = jArr[i];
            if (z) {
                sb.append(" or ");
            }
            sb.append("id = ");
            sb.append(j);
            i++;
            z = true;
        }
        return nc0.OooO0O0(sb.toString());
    }

    public void o00O0O(sa0 sa0Var, Field field, Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (o00ooo(sa0Var, field)) {
            ra0.OooO0Oo(sa0Var, field.getName(), obj, sa0Var.getClass());
        }
    }

    public void o00Oo0(sa0 sa0Var, List<Field> list, Map<Field, ec0> map) throws Throwable {
        String strOooO0O0;
        String strOooO0o0;
        String strOooO00o;
        String str;
        Cursor cursorQuery;
        String strOooO0Oo;
        String strOooo000;
        for (Field field : list) {
            Cursor cursor = null;
            ec0 ec0Var = map.get(field);
            if (ec0Var == null) {
                if (sa0Var.getClassName().equals(OooOO0O(field))) {
                    strOooO0Oo = pc0.OooOO0o(field);
                    strOooo000 = "getLong";
                } else {
                    strOooO0Oo = pc0.OooO0Oo(field.getName());
                    strOooo000 = Oooo000(field);
                }
                strOooO0O0 = pc0.OooO(sa0Var.getClassName(), field.getName());
                strOooO0o0 = pc0.OooOO0(sa0Var.getClassName());
                ec0 ec0Var2 = new ec0();
                ec0Var2.OooO0oO(strOooO0O0);
                ec0Var2.OooO0oo(strOooO0Oo);
                ec0Var2.OooOO0(strOooO0o0);
                ec0Var2.OooO0o(strOooo000);
                map.put(field, ec0Var2);
                str = strOooO0Oo;
                strOooO00o = strOooo000;
            } else {
                strOooO0O0 = ec0Var.OooO0O0();
                String strOooO0OO = ec0Var.OooO0OO();
                strOooO0o0 = ec0Var.OooO0o0();
                strOooO00o = ec0Var.OooO00o();
                str = strOooO0OO;
            }
            String str2 = strOooO0O0;
            try {
                cursorQuery = this.OooOO0.query(str2, null, strOooO0o0 + " = ?", new String[]{String.valueOf(sa0Var.getBaseObjId())}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    do {
                        int columnIndex = cursorQuery.getColumnIndex(nc0.OooO0O0(str));
                        if (columnIndex != -1) {
                            o00Ooo(sa0Var, field, columnIndex, strOooO00o, cursorQuery);
                        }
                    } while (cursorQuery.moveToNext());
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public void o00o0O(Object obj, List<Field> list, List<mb0> list2, Cursor cursor, SparseArray<OooO00o> sparseArray) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int size = sparseArray.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                OooO00o oooO00o = sparseArray.get(iKeyAt);
                o00Ooo(obj, oooO00o.OooO0O0, iKeyAt, oooO00o.OooO00o, cursor);
            }
        } else {
            for (Field field : list) {
                String strOooo000 = Oooo000(field);
                int columnIndex = cursor.getColumnIndex(nc0.OooO0O0(OooOOOo(field.getName()) ? "id" : pc0.OooO0Oo(field.getName())));
                if (columnIndex != -1) {
                    o00Ooo(obj, field, columnIndex, strOooo000, cursor);
                    OooO00o oooO00o2 = new OooO00o();
                    oooO00o2.OooO00o = strOooo000;
                    oooO00o2.OooO0O0 = field;
                    sparseArray.put(columnIndex, oooO00o2);
                }
            }
        }
        if (list2 != null) {
            for (mb0 mb0Var : list2) {
                int columnIndex2 = cursor.getColumnIndex(OooO0oo(pc0.OooOOO0(mb0Var.OooO0OO())));
                if (columnIndex2 != -1) {
                    try {
                        sa0 sa0Var = (sa0) la0.OooOOo0(Class.forName(mb0Var.OooO0OO()), cursor.getLong(columnIndex2));
                        if (sa0Var != null) {
                            o00O0O((sa0) obj, mb0Var.OooO00o(), sa0Var);
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public boolean o00ooo(sa0 sa0Var, Field field) {
        return (sa0Var == null || field == null) ? false : true;
    }

    public <T> List<T> o0OoOo0(Class<T> cls, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5, List<mb0> list) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                List<Field> listOooOO0o = OooOO0o(cls.getName());
                List<Field> listOooOOO0 = OooOOO0(cls.getName());
                String[] strArrOooO0OO = pc0.OooO0OO(Oooo0O0(strArr, listOooOOO0, list));
                cursorQuery = this.OooOO0.query(OoooO0(cls), strArrOooO0OO, str, strArr2, str2, str3, str4, str5);
                if (cursorQuery.moveToFirst()) {
                    SparseArray<OooO00o> sparseArray = new SparseArray<>();
                    HashMap map = new HashMap();
                    do {
                        Object objOooOoOO = OooOoOO(cls);
                        OoooOOO((sa0) objOooOoOO, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("id")));
                        o00o0O(objOooOoOO, listOooOO0o, list, cursorQuery, sparseArray);
                        o00Oo0((sa0) objOooOoOO, listOooOOO0, map);
                        if (list != null) {
                            ooOO((sa0) objOooOoOO);
                        }
                        arrayList.add(objOooOoOO);
                    } while (cursorQuery.moveToNext());
                    sparseArray.clear();
                    map.clear();
                }
                return arrayList;
            } catch (Exception e) {
                throw new LitePalSupportException(e.getMessage(), e);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }
}
