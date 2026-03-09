package com.lidroid.xutils.p221db.sqlite;

import com.lidroid.xutils.exception.DbException;
import com.lidroid.xutils.p221db.table.ColumnUtils;
import com.lidroid.xutils.p221db.table.Foreign;
import com.lidroid.xutils.p221db.table.Table;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ForeignLazyLoader<T> {
    private Object columnValue;
    private final Foreign foreignColumn;

    public ForeignLazyLoader(Foreign foreign, Object obj) {
        this.foreignColumn = foreign;
        this.columnValue = ColumnUtils.convert2DbColumnValueIfNeeded(obj);
    }

    public List<T> getAllFromDb() throws DbException {
        Table table = this.foreignColumn.getTable();
        if (table != null) {
            return table.f16638db.findAll(Selector.from(this.foreignColumn.getForeignEntityType()).where(this.foreignColumn.getForeignColumnName(), "=", this.columnValue));
        }
        return null;
    }

    public Object getColumnValue() {
        return this.columnValue;
    }

    public T getFirstFromDb() throws DbException {
        Table table = this.foreignColumn.getTable();
        if (table != null) {
            return (T) table.f16638db.findFirst(Selector.from(this.foreignColumn.getForeignEntityType()).where(this.foreignColumn.getForeignColumnName(), "=", this.columnValue));
        }
        return null;
    }

    public void setColumnValue(Object obj) {
        this.columnValue = ColumnUtils.convert2DbColumnValueIfNeeded(obj);
    }
}
