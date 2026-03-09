package com.lidroid.xutils.p221db.table;

import android.text.TextUtils;
import com.lidroid.xutils.p221db.annotation.Check;
import com.lidroid.xutils.p221db.annotation.Column;
import com.lidroid.xutils.p221db.annotation.Finder;
import com.lidroid.xutils.p221db.annotation.Foreign;
import com.lidroid.xutils.p221db.annotation.InterfaceC3043Id;
import com.lidroid.xutils.p221db.annotation.NotNull;
import com.lidroid.xutils.p221db.annotation.Transient;
import com.lidroid.xutils.p221db.annotation.Unique;
import com.lidroid.xutils.p221db.converter.ColumnConverter;
import com.lidroid.xutils.p221db.converter.ColumnConverterFactory;
import com.lidroid.xutils.p221db.sqlite.FinderLazyLoader;
import com.lidroid.xutils.p221db.sqlite.ForeignLazyLoader;
import com.lidroid.xutils.util.LogUtils;
import com.umeng.commonsdk.proguard.C3471v;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ColumnUtils {
    private static final HashSet<String> DB_PRIMITIVE_TYPES;

    static {
        HashSet<String> hashSet = new HashSet<>(14);
        DB_PRIMITIVE_TYPES = hashSet;
        hashSet.add(Integer.TYPE.getName());
        hashSet.add(Long.TYPE.getName());
        hashSet.add(Short.TYPE.getName());
        hashSet.add(Byte.TYPE.getName());
        hashSet.add(Float.TYPE.getName());
        hashSet.add(Double.TYPE.getName());
        hashSet.add(Integer.class.getName());
        hashSet.add(Long.class.getName());
        hashSet.add(Short.class.getName());
        hashSet.add(Byte.class.getName());
        hashSet.add(Float.class.getName());
        hashSet.add(Double.class.getName());
        hashSet.add(String.class.getName());
        hashSet.add(byte[].class.getName());
    }

    private ColumnUtils() {
    }

    public static Object convert2DbColumnValueIfNeeded(Object obj) {
        ColumnConverter columnConverter;
        if (obj == null) {
            return obj;
        }
        Class<?> cls = obj.getClass();
        return (isDbPrimitiveType(cls) || (columnConverter = ColumnConverterFactory.getColumnConverter(cls)) == null) ? obj : columnConverter.fieldValue2ColumnValue(obj);
    }

    private static Method getBooleanColumnGetMethod(Class<?> cls, String str) {
        String str2 = C3471v.f18944Y + str.substring(0, 1).toUpperCase() + str.substring(1);
        if (!isStartWithIs(str)) {
            str = str2;
        }
        try {
            return cls.getDeclaredMethod(str, new Class[0]);
        } catch (NoSuchMethodException unused) {
            LogUtils.m13788d(String.valueOf(str) + " not exist");
            return null;
        }
    }

    private static Method getBooleanColumnSetMethod(Class<?> cls, Field field) {
        StringBuilder sb;
        String strSubstring;
        String name = field.getName();
        if (isStartWithIs(field.getName())) {
            sb = new StringBuilder("set");
            sb.append(name.substring(2, 3).toUpperCase());
            strSubstring = name.substring(3);
        } else {
            sb = new StringBuilder("set");
            sb.append(name.substring(0, 1).toUpperCase());
            strSubstring = name.substring(1);
        }
        sb.append(strSubstring);
        String string = sb.toString();
        try {
            return cls.getDeclaredMethod(string, field.getType());
        } catch (NoSuchMethodException unused) {
            LogUtils.m13788d(String.valueOf(string) + " not exist");
            return null;
        }
    }

    public static String getCheck(Field field) {
        Check check = (Check) field.getAnnotation(Check.class);
        if (check != null) {
            return check.value();
        }
        return null;
    }

    public static String getColumnDefaultValue(Field field) {
        Column column = (Column) field.getAnnotation(Column.class);
        if (column == null || TextUtils.isEmpty(column.defaultValue())) {
            return null;
        }
        return column.defaultValue();
    }

    public static Method getColumnGetMethod(Class<?> cls, Field field) {
        Method booleanColumnGetMethod;
        while (true) {
            String name = field.getName();
            booleanColumnGetMethod = field.getType() == Boolean.TYPE ? getBooleanColumnGetMethod(cls, name) : null;
            if (booleanColumnGetMethod == null) {
                String str = "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
                try {
                    booleanColumnGetMethod = cls.getDeclaredMethod(str, new Class[0]);
                } catch (NoSuchMethodException unused) {
                    LogUtils.m13788d(String.valueOf(str) + " not exist");
                }
            }
            if (booleanColumnGetMethod != null || Object.class.equals(cls.getSuperclass())) {
                break;
            }
            cls = cls.getSuperclass();
        }
        return booleanColumnGetMethod;
    }

    public static String getColumnNameByField(Field field) {
        Column column = (Column) field.getAnnotation(Column.class);
        if (column != null && !TextUtils.isEmpty(column.column())) {
            return column.column();
        }
        InterfaceC3043Id interfaceC3043Id = (InterfaceC3043Id) field.getAnnotation(InterfaceC3043Id.class);
        if (interfaceC3043Id != null && !TextUtils.isEmpty(interfaceC3043Id.column())) {
            return interfaceC3043Id.column();
        }
        Foreign foreign = (Foreign) field.getAnnotation(Foreign.class);
        if (foreign != null && !TextUtils.isEmpty(foreign.column())) {
            return foreign.column();
        }
        return field.getName();
    }

    public static Method getColumnSetMethod(Class<?> cls, Field field) {
        Method booleanColumnSetMethod;
        while (true) {
            String name = field.getName();
            booleanColumnSetMethod = field.getType() == Boolean.TYPE ? getBooleanColumnSetMethod(cls, field) : null;
            if (booleanColumnSetMethod == null) {
                String str = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
                try {
                    booleanColumnSetMethod = cls.getDeclaredMethod(str, field.getType());
                } catch (NoSuchMethodException unused) {
                    LogUtils.m13788d(String.valueOf(str) + " not exist");
                }
            }
            if (booleanColumnSetMethod != null || Object.class.equals(cls.getSuperclass())) {
                break;
            }
            cls = cls.getSuperclass();
        }
        return booleanColumnSetMethod;
    }

    public static Class<?> getFinderTargetEntityType(Finder finder) {
        Class<?> type = finder.getColumnField().getType();
        return (type.equals(FinderLazyLoader.class) || type.equals(List.class)) ? (Class) ((ParameterizedType) finder.getColumnField().getGenericType()).getActualTypeArguments()[0] : type;
    }

    public static String getForeignColumnNameByField(Field field) {
        Foreign foreign = (Foreign) field.getAnnotation(Foreign.class);
        return foreign != null ? foreign.foreign() : field.getName();
    }

    public static Class<?> getForeignEntityType(Foreign foreign) {
        Class<?> type = foreign.getColumnField().getType();
        return (type.equals(ForeignLazyLoader.class) || type.equals(List.class)) ? (Class) ((ParameterizedType) foreign.getColumnField().getGenericType()).getActualTypeArguments()[0] : type;
    }

    public static boolean isDbPrimitiveType(Class<?> cls) {
        return DB_PRIMITIVE_TYPES.contains(cls.getName());
    }

    public static boolean isFinder(Field field) {
        return field.getAnnotation(Finder.class) != null;
    }

    public static boolean isForeign(Field field) {
        return field.getAnnotation(Foreign.class) != null;
    }

    public static boolean isNotNull(Field field) {
        return field.getAnnotation(NotNull.class) != null;
    }

    private static boolean isStartWithIs(String str) {
        return str != null && str.startsWith(C3471v.f18944Y);
    }

    public static boolean isTransient(Field field) {
        return field.getAnnotation(Transient.class) != null;
    }

    public static boolean isUnique(Field field) {
        return field.getAnnotation(Unique.class) != null;
    }
}
