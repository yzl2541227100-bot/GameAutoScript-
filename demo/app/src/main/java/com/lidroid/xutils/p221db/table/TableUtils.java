package com.lidroid.xutils.p221db.table;

import android.text.TextUtils;
import com.lidroid.xutils.p221db.annotation.InterfaceC3043Id;
import com.lidroid.xutils.p221db.annotation.Table;
import com.lidroid.xutils.p221db.converter.ColumnConverterFactory;
import com.lidroid.xutils.util.LogUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import net.grandcentrix.tray.provider.TrayContract;
import org.apache.commons.p284io.FilenameUtils;

/* JADX INFO: loaded from: classes2.dex */
public class TableUtils {
    private static ConcurrentHashMap<String, HashMap<String, Column>> entityColumnsMap = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C3044Id> entityIdMap = new ConcurrentHashMap<>();

    private TableUtils() {
    }

    private static void addColumns2Map(Class<?> cls, String str, HashMap<String, Column> map) {
        Column finder;
        String columnName;
        if (Object.class.equals(cls)) {
            return;
        }
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (!ColumnUtils.isTransient(field) && !Modifier.isStatic(field.getModifiers())) {
                    if (ColumnConverterFactory.isSupportColumnConverter(field.getType())) {
                        if (!field.getName().equals(str)) {
                            finder = new Column(cls, field);
                            if (!map.containsKey(finder.getColumnName())) {
                                columnName = finder.getColumnName();
                                map.put(columnName, finder);
                            }
                        }
                    } else if (ColumnUtils.isForeign(field)) {
                        finder = new Foreign(cls, field);
                        if (!map.containsKey(finder.getColumnName())) {
                            columnName = finder.getColumnName();
                            map.put(columnName, finder);
                        }
                    } else if (ColumnUtils.isFinder(field)) {
                        finder = new Finder(cls, field);
                        if (!map.containsKey(finder.getColumnName())) {
                            columnName = finder.getColumnName();
                            map.put(columnName, finder);
                        }
                    }
                }
            }
            if (Object.class.equals(cls.getSuperclass())) {
                return;
            }
            addColumns2Map(cls.getSuperclass(), str, map);
        } catch (Throwable th) {
            LogUtils.m13791e(th.getMessage(), th);
        }
    }

    public static synchronized HashMap<String, Column> getColumnMap(Class<?> cls) {
        if (entityColumnsMap.containsKey(cls.getName())) {
            return entityColumnsMap.get(cls.getName());
        }
        HashMap<String, Column> map = new HashMap<>();
        addColumns2Map(cls, getPrimaryKeyFieldName(cls), map);
        entityColumnsMap.put(cls.getName(), map);
        return map;
    }

    public static Column getColumnOrId(Class<?> cls, String str) {
        return getPrimaryKeyColumnName(cls).equals(str) ? getId(cls) : getColumnMap(cls).get(str);
    }

    public static String getExecAfterTableCreated(Class<?> cls) {
        Table table = (Table) cls.getAnnotation(Table.class);
        if (table != null) {
            return table.execAfterTableCreated();
        }
        return null;
    }

    public static synchronized C3044Id getId(Class<?> cls) {
        if (Object.class.equals(cls)) {
            throw new RuntimeException("field 'id' not found");
        }
        if (entityIdMap.containsKey(cls.getName())) {
            return entityIdMap.get(cls.getName());
        }
        Field field = null;
        Field[] declaredFields = cls.getDeclaredFields();
        if (declaredFields != null) {
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Field field2 = declaredFields[i];
                if (field2.getAnnotation(InterfaceC3043Id.class) != null) {
                    field = field2;
                    break;
                }
                i++;
            }
            if (field == null) {
                for (Field field3 : declaredFields) {
                    if (!"id".equals(field3.getName()) && !TrayContract.Preferences.Columns.f19815ID.equals(field3.getName())) {
                    }
                    field = field3;
                    break;
                }
            }
        }
        if (field == null) {
            return getId(cls.getSuperclass());
        }
        C3044Id c3044Id = new C3044Id(cls, field);
        entityIdMap.put(cls.getName(), c3044Id);
        return c3044Id;
    }

    private static String getPrimaryKeyColumnName(Class<?> cls) {
        C3044Id id = getId(cls);
        if (id == null) {
            return null;
        }
        return id.getColumnName();
    }

    private static String getPrimaryKeyFieldName(Class<?> cls) {
        C3044Id id = getId(cls);
        if (id == null) {
            return null;
        }
        return id.getColumnField().getName();
    }

    public static String getTableName(Class<?> cls) {
        Table table = (Table) cls.getAnnotation(Table.class);
        return (table == null || TextUtils.isEmpty(table.name())) ? cls.getName().replace(FilenameUtils.EXTENSION_SEPARATOR, '_') : table.name();
    }
}
