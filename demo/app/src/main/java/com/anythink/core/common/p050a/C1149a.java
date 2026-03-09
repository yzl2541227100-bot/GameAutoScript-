package com.anythink.core.common.p050a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1182c;
import com.anythink.core.common.p052c.C1190k;
import com.anythink.core.common.p053d.C1195b;
import com.anythink.core.common.p053d.C1196c;
import com.anythink.core.common.p055f.C1214ag;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1253r;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1149a {

    /* JADX INFO: renamed from: b */
    private static volatile C1149a f2914b;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, C1253r> f2915a;

    /* JADX INFO: renamed from: c */
    private C1190k f2916c;

    private C1149a() {
        if (C1175n.m2059a().m2148f() != null) {
            this.f2916c = C1190k.m2266a(C1182c.m2210a(C1175n.m2059a().m2148f()));
        }
        this.f2915a = new ConcurrentHashMap<>(3);
    }

    /* JADX INFO: renamed from: a */
    public static C1149a m1921a() {
        if (f2914b == null) {
            synchronized (C1149a.class) {
                if (f2914b == null) {
                    f2914b = new C1149a();
                }
            }
        }
        return f2914b;
    }

    /* JADX INFO: renamed from: b */
    private static void m1924b(C1252q c1252q) {
        if (TextUtils.isEmpty(c1252q.f4440i)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(c1252q.f4440i);
            C1245j c1245jM1964a = C1153e.m1964a(c1252q.token, jSONObject, c1252q.f4435d, true);
            if (c1245jM1964a == null) {
                c1252q.f4440i = "";
                return;
            }
            c1252q.f4440i = jSONObject.toString();
            c1245jM1964a.m2494c(c1252q.f4437f);
            if (c1252q.f4435d == 67) {
                C1196c.m2305a(C1175n.m2059a().m2148f()).m2302a(c1245jM1964a.m3229t(), c1245jM1964a.m2478Z());
                C1195b.m2304a(C1175n.m2059a().m2148f()).m2302a(c1245jM1964a.m3231u(), c1245jM1964a.m2478Z());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1925c(Context context, String str) {
        C1355s.m4235a(context, C1169h.f3038C, str + C1169h.v.f3278p, 1);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m1926d(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C1169h.v.f3278p);
        return C1355s.m4238b(context, C1169h.f3038C, sb.toString(), 0) == 1;
    }

    /* JADX INFO: renamed from: a */
    public final C1214ag m1927a(Context context, String str) {
        if (this.f2916c == null) {
            this.f2916c = C1190k.m2266a(C1182c.m2210a(context.getApplicationContext()));
        }
        return this.f2916c.m2273c(str);
    }

    /* JADX INFO: renamed from: a */
    public final C1252q m1928a(String str, String str2) {
        C1253r c1253rM2272b = this.f2915a.get(str);
        if (c1253rM2272b == null) {
            c1253rM2272b = this.f2916c.m2272b(str);
            this.f2915a.put(str, c1253rM2272b);
        }
        return c1253rM2272b.m3421a(str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1929a(Context context, String str, String str2, String str3) {
        if (this.f2916c == null) {
            this.f2916c = C1190k.m2266a(C1182c.m2210a(context.getApplicationContext()));
        }
        this.f2916c.m2270a(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final void m1930a(final C1252q c1252q) {
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.common.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (C1149a.this.f2916c == null) {
                    C1149a.this.f2916c = C1190k.m2266a(C1182c.m2210a(C1175n.m2059a().m2148f()));
                }
                C1149a.this.f2916c.m2268a(c1252q);
            }
        }, 2, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m1931a(String str, C1252q c1252q) {
        if (this.f2916c == null) {
            this.f2916c = C1190k.m2266a(C1182c.m2210a(C1175n.m2059a().m2148f()));
        }
        if (!TextUtils.isEmpty(c1252q.f4440i)) {
            try {
                JSONObject jSONObject = new JSONObject(c1252q.f4440i);
                C1245j c1245jM1964a = C1153e.m1964a(c1252q.token, jSONObject, c1252q.f4435d, true);
                if (c1245jM1964a == null) {
                    c1252q.f4440i = "";
                } else {
                    c1252q.f4440i = jSONObject.toString();
                    c1245jM1964a.m2494c(c1252q.f4437f);
                    if (c1252q.f4435d == 67) {
                        C1196c.m2305a(C1175n.m2059a().m2148f()).m2302a(c1245jM1964a.m3229t(), c1245jM1964a.m2478Z());
                        C1195b.m2304a(C1175n.m2059a().m2148f()).m2302a(c1245jM1964a.m3231u(), c1245jM1964a.m2478Z());
                    }
                }
            } catch (Throwable unused) {
            }
        }
        this.f2916c.m2269a(str, c1252q);
    }

    /* JADX INFO: renamed from: b */
    public final void m1932b(final Context context, final String str) {
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.common.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (C1149a.this.f2916c == null) {
                    C1149a.this.f2916c = C1190k.m2266a(C1182c.m2210a(context.getApplicationContext()));
                }
                C1149a.this.f2916c.m2271a(str);
            }
        }, 2, true);
        C1355s.m4234a(context, C1169h.f3038C, str + C1169h.v.f3278p);
    }
}
