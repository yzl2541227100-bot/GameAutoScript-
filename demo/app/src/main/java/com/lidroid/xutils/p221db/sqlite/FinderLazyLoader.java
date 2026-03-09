package com.lidroid.xutils.p221db.sqlite;

import com.lidroid.xutils.exception.DbException;
import com.lidroid.xutils.p221db.table.ColumnUtils;
import com.lidroid.xutils.p221db.table.Finder;
import com.lidroid.xutils.p221db.table.Table;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FinderLazyLoader<T> {
    private final Finder finderColumn;
    private final Object finderValue;

    public FinderLazyLoader(Finder finder, Object obj) {
        this.finderColumn = finder;
        this.finderValue = ColumnUtils.convert2DbColumnValueIfNeeded(obj);
    }

    public List<T> getAllFromDb() throws DbException {
        Table table = this.finderColumn.getTable();
        if (table != null) {
            return table.f16638db.findAll(Selector.from(this.finderColumn.getTargetEntityType()).where(this.finderColumn.getTargetColumnName(), "=", this.finderValue));
        }
        return null;
    }

    public T getFirstFromDb() throws DbException {
        Table table = this.finderColumn.getTable();
        if (table != null) {
            return (T) table.f16638db.findFirst(Selector.from(this.finderColumn.getTargetEntityType()).where(this.finderColumn.getTargetColumnName(), "=", this.finderValue));
        }
        return null;
    }
}
