package com.anythink.expressad.videocommon.p178b;

import android.text.TextUtils;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p123c.C1814d;
import com.anythink.expressad.foundation.p120g.p123c.EnumC1811a;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p138h.C1879m;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2327l {

    /* JADX INFO: renamed from: b */
    private static Map<String, Boolean> f14467b = new HashMap();

    /* JADX INFO: renamed from: a */
    private Map<String, Boolean> f14468a;

    /* JADX INFO: renamed from: c */
    private Map<String, Boolean> f14469c;

    /* JADX INFO: renamed from: d */
    private Map<String, Boolean> f14470d;

    /* JADX INFO: renamed from: e */
    private Map<String, Boolean> f14471e;

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static C2327l f14472a = new C2327l(0);

        private a() {
        }
    }

    private C2327l() {
        this.f14468a = new HashMap();
        this.f14469c = new HashMap();
        this.f14470d = new HashMap();
        this.f14471e = new HashMap();
    }

    public /* synthetic */ C2327l(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C2327l m11891a() {
        return a.f14472a;
    }

    /* JADX INFO: renamed from: a */
    private void m11892a(C1781c c1781c) {
        if (c1781c != null) {
            m11896b(c1781c);
            m11899e(c1781c.m10146aZ());
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11893a(C1781c.c cVar) {
        List<C1781c.c.a> listM8958f;
        List<String> list;
        if (cVar != null && (listM8958f = cVar.m8958f()) != null) {
            for (C1781c.c.a aVar : listM8958f) {
                if (aVar != null && (list = aVar.f10534b) != null) {
                    for (String str : list) {
                        boolean zM11894a = m11894a(f14467b, str);
                        if (zM11894a || C1818b.m9427a(C1773a.m8548c().m8557e()).m9444b(str)) {
                            zM11894a = true;
                        }
                        if (!zM11894a) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11894a(Map<String, Boolean> map, String str) {
        Boolean bool = Boolean.FALSE;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (map == null) {
            map = new HashMap<>();
        } else if (map.containsKey(str)) {
            return map.get(str).booleanValue();
        }
        map.put(str, bool);
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m11895a(boolean z, String str) {
        boolean zM11894a = m11894a(this.f14469c, str);
        if (zM11894a || !z || TextUtils.isEmpty(C2324i.m11867a().m11883c(str))) {
            return zM11894a;
        }
        this.f14469c.put(str, Boolean.TRUE);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m11896b(C1781c c1781c) {
        List<C1781c.c.a> listM8958f;
        Boolean bool = Boolean.FALSE;
        if (c1781c != null) {
            String strM8811S = c1781c.m8811S();
            Map<String, Boolean> map = this.f14468a;
            if (map != null && !map.containsKey(strM8811S)) {
                this.f14468a.put(strM8811S, bool);
            }
            String strM8801I = c1781c.m8801I();
            Map<String, Boolean> map2 = this.f14469c;
            if (map2 != null && !map2.containsKey(strM8801I)) {
                this.f14469c.put(strM8801I, bool);
            }
            C1781c.c cVarM8805M = c1781c.m8805M();
            if (cVarM8805M == null || (listM8958f = cVarM8805M.m8958f()) == null) {
                return;
            }
            for (C1781c.c.a aVar : listM8958f) {
                if (aVar != null) {
                    m11897b(aVar.f10534b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m11897b(List<String> list) {
        Map<String, Boolean> map;
        if (list == null || list.size() == 0) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (map = f14467b) != null && !map.containsKey(str)) {
                f14467b.put(str, Boolean.valueOf(C1818b.m9427a(C1773a.m8548c().m8557e()).m9444b(str)));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11898c(String str) {
        if (f14467b == null) {
            f14467b = new HashMap();
        }
        f14467b.put(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    private void m11899e(String str) {
        if (this.f14470d == null) {
            this.f14470d = new HashMap();
        }
        this.f14470d.put(str, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: f */
    private void m11900f(String str) {
        if (this.f14471e.containsKey(str)) {
            this.f14471e.remove(str);
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m11901g(String str) {
        boolean zM11894a = m11894a(f14467b, str);
        if (zM11894a || C1818b.m9427a(C1773a.m8548c().m8557e()).m9444b(str)) {
            return true;
        }
        return zM11894a;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m11902h(String str) {
        File file = new File(C1814d.m9407b(EnumC1811a.ANYTHINK_VC) + File.separator + C1879m.m9748d(str));
        try {
            if (file.exists() && file.isFile()) {
                return file.canRead();
            }
            return false;
        } catch (Throwable th) {
            if (!C1404a.f6209a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11903a(String str, boolean z) {
        if (this.f14468a == null) {
            this.f14468a = new HashMap();
        }
        this.f14468a.put(str, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: a */
    public final void m11904a(List<C1781c> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (C1781c c1781c : list) {
            if (c1781c != null) {
                m11896b(c1781c);
                m11899e(c1781c.m10146aZ());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11905a(String str) {
        if (this.f14468a == null || TextUtils.isEmpty(str) || !this.f14468a.containsKey(str)) {
            return false;
        }
        return this.f14468a.get(str).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m11906b(String str, boolean z) {
        if (this.f14469c == null) {
            this.f14469c = new HashMap();
        }
        this.f14469c.put(str, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11907b(String str) {
        if (this.f14469c == null || TextUtils.isEmpty(str) || !this.f14469c.containsKey(str)) {
            return false;
        }
        return this.f14469c.get(str).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m11908c(String str, boolean z) {
        if (this.f14471e == null) {
            this.f14471e = new HashMap();
        }
        this.f14471e.put(str, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11909d(String str) {
        if (!TextUtils.isEmpty(str) && this.f14471e.containsKey(str)) {
            return this.f14471e.get(str).booleanValue();
        }
        return false;
    }
}
