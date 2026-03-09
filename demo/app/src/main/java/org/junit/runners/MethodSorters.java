package org.junit.runners;

import java.lang.reflect.Method;
import java.util.Comparator;
import p285z2.r60;

/* JADX INFO: loaded from: classes2.dex */
public enum MethodSorters {
    NAME_ASCENDING(r60.OooO0O0),
    JVM(null),
    DEFAULT(r60.OooO00o);

    private final Comparator<Method> comparator;

    MethodSorters(Comparator comparator) {
        this.comparator = comparator;
    }

    public Comparator<Method> getComparator() {
        return this.comparator;
    }
}
