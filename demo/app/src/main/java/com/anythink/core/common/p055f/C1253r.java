package com.anythink.core.common.p055f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.f.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1253r {

    /* JADX INFO: renamed from: a */
    public HashMap<String, List<C1252q>> f4458a = new HashMap<>(2);

    /* JADX INFO: renamed from: a */
    public final synchronized C1252q m3421a(String str) {
        HashMap<String, List<C1252q>> map = this.f4458a;
        C1252q c1252q = null;
        if (map == null) {
            return null;
        }
        List<C1252q> list = map.get(str);
        if (list != null && list.size() != 0) {
            for (C1252q c1252q2 : list) {
                StringBuilder sb = new StringBuilder("CacehMotify: Query Adx/Direcyly BiddingCache price:");
                sb.append(c1252q2.price);
                sb.append(", AdSourceId:");
                sb.append(c1252q2.f4442k);
                if (c1252q == null || c1252q2.price > c1252q.price) {
                    c1252q = c1252q2;
                }
            }
            if (c1252q != null) {
                list.remove(c1252q);
                StringBuilder sb2 = new StringBuilder("CacehMotify: Adx/Direcyly BiddingCache Max price:");
                sb2.append(c1252q.price);
                sb2.append(", AdSourceId:");
                sb2.append(c1252q.f4442k);
            }
            return c1252q;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3422a(String str, C1252q c1252q) {
        List<C1252q> arrayList = this.f4458a.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f4458a.put(str, arrayList);
        }
        arrayList.add(c1252q);
    }
}
