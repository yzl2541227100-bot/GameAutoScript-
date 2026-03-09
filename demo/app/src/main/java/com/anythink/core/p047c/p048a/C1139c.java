package com.anythink.core.p047c.p048a;

import android.text.TextUtils;
import com.anythink.core.p072d.C1394d;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.c.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1139c {

    /* JADX INFO: renamed from: a */
    public C1394d f2851a;

    /* JADX INFO: renamed from: b */
    public List<C1137a> f2852b;

    /* JADX INFO: renamed from: c */
    public Map<Integer, List<C1137a>> f2853c = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: a */
    private C1394d m1851a() {
        return this.f2851a;
    }

    /* JADX INFO: renamed from: a */
    private void m1852a(List<C1137a> list, C1137a c1137a) {
        boolean z;
        Iterator<C1137a> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else {
                if (TextUtils.equals(it.next().m1820b(), c1137a.m1820b())) {
                    list.set(i, c1137a);
                    z = true;
                    break;
                }
                i++;
            }
        }
        if (!z) {
            list.add(0, c1137a);
        }
        while (list.size() > this.f2851a.m4881c()) {
            list.remove(list.size() - 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final List<C1137a> m1853a(int i) {
        return i == -1 ? this.f2852b : this.f2853c.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public final void m1854a(int i, List<C1137a> list) {
        if (i == -1) {
            this.f2852b = list;
        } else {
            this.f2853c.put(Integer.valueOf(i), list);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1855a(C1137a c1137a) {
        if (this.f2851a == null) {
            return;
        }
        List<C1137a> list = this.f2852b;
        if (list != null) {
            m1852a(list, c1137a);
        }
        List<C1137a> list2 = this.f2853c.get(Integer.valueOf(c1137a.m1815a()));
        if (list2 != null) {
            m1852a(list2, c1137a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1856a(C1394d c1394d) {
        this.f2851a = c1394d;
    }

    /* JADX INFO: renamed from: b */
    public final C1140d m1857b(int i) {
        List<C1137a> list = i == -1 ? this.f2852b : this.f2853c.get(Integer.valueOf(i));
        if (list == null || list.size() < this.f2851a.m4882d()) {
            return null;
        }
        double d = 0.0d;
        String strM1826d = "";
        for (C1137a c1137a : list) {
            double dM1830f = c1137a.m1830f();
            if (dM1830f > d) {
                strM1826d = c1137a.m1826d();
                d = dM1830f;
            }
        }
        return new C1140d(d, strM1826d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1858b(C1394d c1394d) {
        C1394d c1394d2 = this.f2851a;
        return c1394d2 != null && c1394d2.m4880b() == c1394d.m4880b() && this.f2851a.m4879a() == c1394d.m4879a() && this.f2851a.m4881c() == c1394d.m4881c() && this.f2851a.m4882d() == c1394d.m4882d();
    }

    /* JADX INFO: renamed from: c */
    public final void m1859c(int i) {
        List<C1137a> listM1853a = m1853a(i);
        if (this.f2851a == null || listM1853a == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) (((this.f2851a.m4880b() * 24) * 60) * 60)) * 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        Iterator<C1137a> it = listM1853a.iterator();
        while (it.hasNext()) {
            if (it.next().m1831g() < timeInMillis) {
                it.remove();
            }
        }
    }
}
