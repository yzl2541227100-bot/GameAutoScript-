package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p054e.C1200c;
import com.anythink.core.common.p055f.C1255t;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import com.anythink.core.p072d.C1396f;

/* JADX INFO: renamed from: com.anythink.core.common.h */
/* JADX INFO: loaded from: classes.dex */
public class C1267h {

    /* JADX INFO: renamed from: a */
    private static volatile C1267h f4591a;

    private C1267h() {
    }

    /* JADX INFO: renamed from: a */
    public static C1267h m3614a() {
        if (f4591a == null) {
            synchronized (C1267h.class) {
                if (f4591a == null) {
                    f4591a = new C1267h();
                }
            }
        }
        return f4591a;
    }

    /* JADX INFO: renamed from: a */
    public static String m3615a(C1396f c1396f) {
        String strM5033E = c1396f.m5033E();
        return TextUtils.isEmpty(strM5033E) ? "" : strM5033E;
    }

    /* JADX INFO: renamed from: a */
    public static String m3616a(C1396f c1396f, boolean z) {
        if (!C1200c.m2314a().m2336b() && z) {
            String strM5037I = c1396f.m5037I();
            c1396f.m5106az();
            if (!TextUtils.isEmpty(strM5037I)) {
                return strM5037I;
            }
        }
        C1255t c1255tM4775t = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o()).m4775t();
        String str = m3631m() ? C1169h.e.f3141y : C1169h.e.f3127k;
        return c1255tM4775t != null ? m3618a(c1255tM4775t.m3434c(), str) : str;
    }

    /* JADX INFO: renamed from: a */
    private static String m3617a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: a */
    private static String m3618a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* JADX INFO: renamed from: b */
    public static String m3619b() {
        return C1200c.m2314a().m2333a(m3631m() ? C1169h.e.f3136t : C1169h.e.f3122f);
    }

    /* JADX INFO: renamed from: b */
    public static String m3620b(C1396f c1396f) {
        return c1396f.m5032D();
    }

    /* JADX INFO: renamed from: c */
    public static String m3621c() {
        return C1200c.m2314a().m2333a(m3631m() ? C1169h.e.f3137u : C1169h.e.f3123g);
    }

    /* JADX INFO: renamed from: d */
    public static String m3622d() {
        return m3631m() ? C1169h.e.f3140x : C1169h.e.f3126j;
    }

    /* JADX INFO: renamed from: e */
    public static String m3623e() {
        return m3631m() ? C1169h.e.f3116D : C1169h.e.f3133q;
    }

    /* JADX INFO: renamed from: f */
    public static String m3624f() {
        C1255t c1255tM4775t = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o()).m4775t();
        String str = m3631m() ? C1169h.e.f3142z : C1169h.e.f3128l;
        return c1255tM4775t != null ? m3618a(c1255tM4775t.m3432b(), str) : str;
    }

    /* JADX INFO: renamed from: g */
    public static String m3625g() {
        C1255t c1255tM4775t = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o()).m4775t();
        String str = m3631m() ? C1169h.e.f3113A : C1169h.e.f3129m;
        return c1255tM4775t != null ? m3618a(c1255tM4775t.m3436d(), str) : str;
    }

    /* JADX INFO: renamed from: h */
    public static String m3626h() {
        C1255t c1255tM4775t = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o()).m4775t();
        String str = m3631m() ? C1169h.e.f3114B : C1169h.e.f3130n;
        return c1255tM4775t != null ? m3618a(c1255tM4775t.m3430a(), str) : str;
    }

    /* JADX INFO: renamed from: i */
    public static String m3627i() {
        C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
        String str = m3631m() ? C1169h.e.f3115C : C1169h.e.f3132p;
        return c1391aM4865b != null ? m3618a(c1391aM4865b.m4772q(), str) : str;
    }

    /* JADX INFO: renamed from: j */
    public static String m3628j() {
        C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
        String str = m3631m() ? C1169h.e.f3139w : C1169h.e.f3125i;
        return c1391aM4865b != null ? m3618a(c1391aM4865b.m4735ab(), str) : str;
    }

    /* JADX INFO: renamed from: k */
    public static String m3629k() {
        C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
        String str = m3631m() ? C1169h.e.f3138v : C1169h.e.f3124h;
        return c1391aM4865b != null ? m3618a(c1391aM4865b.m4740ag(), str) : str;
    }

    /* JADX INFO: renamed from: l */
    public static String m3630l() {
        C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
        return c1391aM4865b != null ? m3618a(c1391aM4865b.m4727X(), "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html") : "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html";
    }

    /* JADX INFO: renamed from: m */
    private static boolean m3631m() {
        return C1175n.m2059a().m2098D() && C1175n.m2059a().m2097C();
    }
}
