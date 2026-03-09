package com.lidroid.xutils.p221db.converter;

import android.database.Cursor;
import com.lidroid.xutils.p221db.sqlite.ColumnDbType;

/* JADX INFO: loaded from: classes2.dex */
public interface ColumnConverter<T> {
    Object fieldValue2ColumnValue(T t);

    ColumnDbType getColumnDbType();

    T getFieldValue(Cursor cursor, int i);

    T getFieldValue(String str);
}
