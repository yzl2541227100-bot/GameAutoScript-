package com.anythink.core.p037a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1239d;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.p072d.C1396f;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C1087b {

    /* JADX INFO: renamed from: c */
    private static volatile C1087b f2516c;

    /* JADX INFO: renamed from: a */
    public final String f2517a = C1087b.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, C1239d> f2518b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static C1087b m1574a() {
        if (f2516c == null) {
            synchronized (C1087b.class) {
                if (f2516c == null) {
                    f2516c = new C1087b();
                }
            }
        }
        return f2516c;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1575a(Context context, String str, C1396f c1396f) {
        if (c1396f.m5103aw() <= 0) {
            return false;
        }
        C1239d c1239d = this.f2518b.get(str);
        if (c1239d == null) {
            String strM4239b = C1355s.m4239b(context, C1169h.f3072w, str, "");
            c1239d = new C1239d();
            if (!TextUtils.isEmpty(strM4239b)) {
                c1239d.m2970a(strM4239b);
            }
            this.f2518b.put(str, c1239d);
        }
        StringBuilder sb = new StringBuilder("Load Cap info:");
        sb.append(str);
        sb.append(":");
        sb.append(c1239d.toString());
        return c1239d.f4109a >= c1396f.m5103aw() && System.currentTimeMillis() - c1239d.f4110b <= c1396f.m5104ax();
    }

    /* JADX INFO: renamed from: b */
    public final void m1576b(Context context, String str, C1396f c1396f) {
        C1239d c1239d = this.f2518b.get(str);
        if (c1239d == null) {
            String strM4239b = C1355s.m4239b(context, C1169h.f3072w, str, "");
            C1239d c1239d2 = new C1239d();
            if (!TextUtils.isEmpty(strM4239b)) {
                c1239d2.m2970a(strM4239b);
            }
            this.f2518b.put(str, c1239d2);
            c1239d = c1239d2;
        }
        if (System.currentTimeMillis() - c1239d.f4110b > c1396f.m5104ax()) {
            c1239d.f4110b = System.currentTimeMillis();
            c1239d.f4109a = 0;
        }
        c1239d.f4109a++;
        StringBuilder sb = new StringBuilder("After save load cap:");
        sb.append(str);
        sb.append(":");
        sb.append(c1239d.toString());
        C1355s.m4237a(context, C1169h.f3072w, str, c1239d.toString());
    }
}
