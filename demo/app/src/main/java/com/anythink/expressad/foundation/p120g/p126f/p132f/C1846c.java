package com.anythink.expressad.foundation.p120g.p126f.p132f;

import com.anythink.expressad.foundation.p120g.p126f.p129c.C1831c;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.f.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1846c {

    /* JADX INFO: renamed from: a */
    public final int f11382a;

    /* JADX INFO: renamed from: b */
    public final byte[] f11383b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f11384c;

    /* JADX INFO: renamed from: d */
    public final List<C1831c> f11385d;

    public C1846c(int i, byte[] bArr, List<C1831c> list) {
        this(i, bArr, m9569a(list), list);
    }

    private C1846c(int i, byte[] bArr, Map<String, String> map, List<C1831c> list) {
        this.f11382a = i;
        this.f11383b = bArr;
        this.f11384c = map;
        this.f11385d = list == null ? null : Collections.unmodifiableList(list);
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, String> m9569a(List<C1831c> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C1831c c1831c : list) {
            treeMap.put(c1831c.m9517a(), c1831c.m9518b());
        }
        return treeMap;
    }
}
