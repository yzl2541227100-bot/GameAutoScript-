package com.anythink.basead.p022f.p023a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.p010a.C0732e;
import com.anythink.basead.p010a.p012b.C0723b;
import com.anythink.basead.p015c.C0745c;
import com.anythink.basead.p015c.C0748f;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1209ab;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.basead.f.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0782a {

    /* JADX INFO: renamed from: a */
    private static C0782a f983a;

    /* JADX INFO: renamed from: b */
    private Context f984b;

    private C0782a(Context context) {
        this.f984b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static C0782a m563a(Context context) {
        if (f983a == null) {
            f983a = new C0782a(context);
        }
        return f983a;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m564a(C1261z c1261z) {
        List<String> listM2155j = C1175n.m2059a().m2155j();
        if (listM2155j == null) {
            return false;
        }
        Iterator<String> it = listM2155j.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(c1261z.m3167F(), it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final C1261z m565a(String str, String str2) {
        C1396f c1396fM5139a = C1398h.m5135a(this.f984b).m5139a(str);
        if (c1396fM5139a == null) {
            return null;
        }
        return c1396fM5139a.m5107b(str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m566a(String str) {
        List<C1261z> listM5046R;
        C1209ab c1209abM5045Q;
        C1396f c1396fM5139a = C1398h.m5135a(this.f984b).m5139a(str);
        if (c1396fM5139a == null || (listM5046R = c1396fM5139a.m5046R()) == null || (c1209abM5045Q = c1396fM5139a.m5045Q()) == null) {
            return;
        }
        C0732e.m247a();
        if (listM5046R != null) {
            int size = listM5046R.size();
            for (int i = 0; i < size; i++) {
                C1248m c1248m = new C1248m();
                c1248m.f4333n = c1209abM5045Q;
                C0732e.m251a(str, true, listM5046R.get(i), c1248m, null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m567a(String str, C1261z c1261z, C1248m c1248m, C0723b.b bVar) {
        if (m564a(c1261z)) {
            bVar.mo193a(C0748f.m310a(C0748f.f726h, C0748f.f709H));
            return;
        }
        if (C0783b.m572a(this.f984b).m576b(c1261z)) {
            bVar.mo193a(C0748f.m310a(C0748f.f723e, C0748f.f702A));
        } else if (C0783b.m572a(this.f984b).m577c(c1261z)) {
            bVar.mo193a(C0748f.m310a(C0748f.f724f, C0748f.f703B));
        } else {
            C0732e.m247a();
            C0732e.m249a(str, c1261z, c1248m, bVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m568a(C1261z c1261z, C1248m c1248m, boolean z) {
        if (this.f984b == null || c1261z == null || m564a(c1261z)) {
            return false;
        }
        if (z) {
            C0732e.m247a();
            return C0732e.m253a(c1261z, c1248m);
        }
        if (!C0783b.m572a(this.f984b).m576b(c1261z) && !C0783b.m572a(this.f984b).m577c(c1261z)) {
            C0732e.m247a();
            if (C0732e.m253a(c1261z, c1248m)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final String m569b(String str) {
        C1396f c1396fM5139a = C1398h.m5135a(this.f984b).m5139a(str);
        if (c1396fM5139a == null) {
            return "";
        }
        List<C1261z> listM5046R = c1396fM5139a.m5046R();
        ArrayList arrayList = new ArrayList();
        if (listM5046R == null || listM5046R.size() == 0) {
            return "";
        }
        for (int size = listM5046R.size() - 1; size >= 0; size--) {
            C1261z c1261z = listM5046R.get(size);
            C0732e.m247a();
            if (C0732e.m252a(c1261z, c1396fM5139a.m5090ah(), c1396fM5139a.m5045Q())) {
                arrayList.add(C0783b.m572a(this.f984b).m578d(c1261z));
            } else {
                listM5046R.remove(size);
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        Collections.sort(arrayList, new Comparator<C0745c>() { // from class: com.anythink.basead.f.a.a.1
            /* JADX INFO: renamed from: a */
            private static int m570a(C0745c c0745c, C0745c c0745c2) {
                return Integer.valueOf(c0745c.f694d).compareTo(Integer.valueOf(c0745c2.f694d));
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(C0745c c0745c, C0745c c0745c2) {
                return Integer.valueOf(c0745c.f694d).compareTo(Integer.valueOf(c0745c2.f694d));
            }
        });
        return ((C0745c) arrayList.get(0)).f691a;
    }
}
