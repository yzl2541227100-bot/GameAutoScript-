package com.anythink.expressad.foundation.p113b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p126f.C1860m;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1884r;
import com.anythink.expressad.out.C1927b;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C1774b {

    /* JADX INFO: renamed from: g */
    private static final String f10139g = "SDKController";

    /* JADX INFO: renamed from: h */
    private static volatile C1774b f10140h;

    /* JADX INFO: renamed from: i */
    private Context f10147i;

    /* JADX INFO: renamed from: m */
    private String f10151m;

    /* JADX INFO: renamed from: n */
    private int f10152n;

    /* JADX INFO: renamed from: j */
    private String f10148j = "";

    /* JADX INFO: renamed from: k */
    private String f10149k = "";

    /* JADX INFO: renamed from: l */
    private boolean f10150l = false;

    /* JADX INFO: renamed from: a */
    public final int f10141a = 1;

    /* JADX INFO: renamed from: b */
    public final int f10142b = 2;

    /* JADX INFO: renamed from: c */
    public final int f10143c = 3;

    /* JADX INFO: renamed from: d */
    public final int f10144d = 4;

    /* JADX INFO: renamed from: e */
    public final int f10145e = 5;

    /* JADX INFO: renamed from: f */
    public final int f10146f = 6;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.b.b$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f10153a;

        public AnonymousClass1(Context context) {
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1877k.m9711i(context);
        }
    }

    private C1774b() {
    }

    /* JADX INFO: renamed from: a */
    public static C1774b m8563a() {
        if (f10140h == null) {
            synchronized (C1774b.class) {
                if (f10140h == null) {
                    f10140h = new C1774b();
                }
            }
        }
        return f10140h;
    }

    /* JADX INFO: renamed from: a */
    private static void m8564a(Context context) {
        String string;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(C1169h.f3036A, 0);
            String str = "";
            if (sharedPreferences != null) {
                String string2 = sharedPreferences.getString(C1169h.v.f3276n, "");
                string = sharedPreferences.getString(C1169h.v.f3277o, "");
                str = string2;
            } else {
                string = "";
            }
            if (TextUtils.isEmpty(C1801a.f11126co) && TextUtils.isEmpty(C1801a.f11127cp)) {
                C1801a.f11126co = str;
                C1801a.f11127cp = string;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m8565b() {
        return C1927b.f11909a;
    }

    /* JADX INFO: renamed from: c */
    private void m8566c() {
        C1773a.m8548c().m8554b(this.f10148j);
        C1773a.m8548c().m8555c(this.f10149k);
        C1773a.m8548c().m8556d();
        m8564a(this.f10147i.getApplicationContext());
        C1884r.m9787a(this.f10147i);
        this.f10150l = true;
    }

    /* JADX INFO: renamed from: d */
    private static void m8567d() {
    }

    /* JADX INFO: renamed from: e */
    private void m8568e() {
        C1773a.m8548c().m8554b(this.f10148j);
        C1773a.m8548c().m8555c(this.f10149k);
        C1773a.m8548c().m8556d();
    }

    /* JADX INFO: renamed from: a */
    public final void m8569a(Map map, Context context) {
        if (context != null) {
            this.f10147i = context.getApplicationContext();
            C1773a.m8548c().m8550a(this.f10147i);
            try {
                C1860m.m9638a(this.f10147i);
            } catch (Exception unused) {
            }
            C1175n.m2059a().m2118a(new Runnable() { // from class: com.anythink.expressad.foundation.b.b.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f10153a;

                public AnonymousClass1(Context context2) {
                    context = context2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1877k.m9711i(context);
                }
            }, 300L);
            if (map != null) {
                if (map.containsKey(C1404a.f6217d)) {
                    this.f10148j = (String) map.get(C1404a.f6217d);
                }
                if (map.containsKey(C1404a.f6218e)) {
                    this.f10149k = (String) map.get(C1404a.f6218e);
                }
                C1773a.m8548c().m8554b(this.f10148j);
                C1773a.m8548c().m8555c(this.f10149k);
                C1773a.m8548c().m8556d();
                m8564a(this.f10147i.getApplicationContext());
                C1884r.m9787a(this.f10147i);
                this.f10150l = true;
            }
        }
    }
}
