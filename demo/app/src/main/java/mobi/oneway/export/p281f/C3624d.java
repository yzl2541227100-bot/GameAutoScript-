package mobi.oneway.export.p281f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.p281f.C3623c;

/* JADX INFO: renamed from: mobi.oneway.export.f.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3624d {

    /* JADX INFO: renamed from: a */
    private static List<C3623c> f19759a;

    /* JADX INFO: renamed from: b */
    private static List<C3627g> f19760b;

    /* JADX INFO: renamed from: c */
    private static String f19761c;

    /* JADX INFO: renamed from: a */
    public static String m16873a() {
        return f19761c;
    }

    /* JADX INFO: renamed from: a */
    public static List<C3613a> m16874a(String str, AdType adType) {
        List<C3613a> listM16876a;
        List<C3623c> list = f19759a;
        if (list != null) {
            for (C3623c c3623c : list) {
                if (str.equals(c3623c.m16855a())) {
                    listM16876a = m16876a(c3623c.m16858b(), str, adType);
                    break;
                }
            }
            listM16876a = null;
        } else {
            listM16876a = null;
        }
        return listM16876a == null ? m16882b(str) : listM16876a;
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m16875a(List<C3613a> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<C3613a> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m16844f());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static List<C3613a> m16876a(List<C3623c.a> list, String str, AdType adType) {
        ArrayList arrayList = null;
        if (f19759a != null && list != null) {
            for (C3623c.a aVar : list) {
                int iM16859a = aVar.m16859a();
                C3627g c3627gM16878a = m16878a(iM16859a);
                if (c3627gM16878a != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    C3613a c3613a = new C3613a(c3627gM16878a, str, iM16859a == 1 ? str : aVar.m16862b());
                    if (c3613a.m16842d(adType)) {
                        arrayList.add(c3613a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static C3613a m16877a(List<C3613a> list, String str) {
        if (list != null) {
            Iterator<C3613a> it = list.iterator();
            if (it.hasNext()) {
                C3613a next = it.next();
                if (next.m16844f().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static C3627g m16878a(int i) {
        List<C3627g> list = f19760b;
        if (list == null) {
            return null;
        }
        for (C3627g c3627g : list) {
            if (c3627g.m16891a() == i) {
                return c3627g;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m16879a(String str) {
        f19761c = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m16880a(C3623c c3623c) {
        if (f19759a == null) {
            f19759a = new ArrayList();
        }
        f19759a.add(c3623c);
    }

    /* JADX INFO: renamed from: a */
    public static void m16881a(C3627g c3627g) {
        if (f19760b == null) {
            f19760b = new ArrayList();
        }
        f19760b.add(c3627g);
    }

    /* JADX INFO: renamed from: b */
    private static List<C3613a> m16882b(String str) {
        C3627g c3627gM16878a = m16878a(1);
        if (c3627gM16878a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3613a(c3627gM16878a, str, str));
        return arrayList;
    }
}
