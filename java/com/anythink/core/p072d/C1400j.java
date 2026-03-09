package com.anythink.core.p072d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.d.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1400j {

    /* JADX INFO: renamed from: a */
    private static final String f6165a = "PlaceStrategySaver";

    /* JADX INFO: renamed from: b */
    private final Context f6166b;

    /* JADX INFO: renamed from: c */
    private final ConcurrentHashMap<String, C1396f> f6167c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    private final ConcurrentHashMap<String, C1396f> f6168d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    private final ConcurrentHashMap<String, C1396f> f6169e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    private final ConcurrentHashMap<String, Integer> f6170f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    private final ConcurrentHashMap<String, Integer> f6171g = new ConcurrentHashMap<>();

    public C1400j(Context context) {
        this.f6166b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m5161b(String str, boolean z) {
        return str + "_" + (z ? C1169h.v.f3266d : C1169h.v.f3265c);
    }

    /* JADX INFO: renamed from: d */
    private boolean m5162d(String str, String str2) {
        return m5164a(str, str2, 0) != null;
    }

    /* JADX INFO: renamed from: a */
    public final C1396f m5163a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        int i = this.f6170f.get(sb.toString()) == null ? 2 : 0;
        C1396f c1396fM5164a = m5164a(str, str2, i);
        return (c1396fM5164a == null && i == 2) ? m5164a(str, str2, 0) : c1396fM5164a == null ? m5164a(str, str2, 2) : c1396fM5164a;
    }

    /* JADX INFO: renamed from: a */
    public final C1396f m5164a(String str, String str2, int i) {
        String str3 = str + str2;
        ConcurrentHashMap<String, C1396f> concurrentHashMap = i == 1 ? this.f6169e : i == 2 ? this.f6167c : this.f6168d;
        C1396f c1396f = concurrentHashMap.get(str3);
        if (c1396f != null) {
            return c1396f;
        }
        if (i == 1) {
            return null;
        }
        String strM4239b = C1355s.m4239b(this.f6166b, C1169h.f3065p, m5161b(str3, i == 2), "");
        if (!TextUtils.isEmpty(strM4239b)) {
            try {
                C1396f c1396fM4919a = C1396f.m4919a(str2, new JSONObject(strM4239b));
                if (c1396fM4919a != null) {
                    c1396fM4919a.m5058a(i);
                    concurrentHashMap.put(str3, c1396fM4919a);
                    return c1396fM4919a;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m5165a(String str, int i) {
        this.f6171g.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public final void m5166a(String str, String str2, C1396f c1396f, final JSONObject jSONObject, int i) {
        if (this.f6166b == null || c1396f == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        final String str3 = str + str2;
        if (i == 1) {
            this.f6169e.put(str3, c1396f);
            return;
        }
        final boolean z = false;
        if (i == 2) {
            this.f6167c.put(str3, c1396f);
            z = true;
        } else {
            this.f6168d.put(str3, c1396f);
        }
        if (c1396f.m5127u() != 1) {
            C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.d.j.1
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject2 = jSONObject;
                    C1355s.m4237a(C1400j.this.f6166b, C1169h.f3065p, C1400j.m5161b(str3, z), jSONObject2 == null ? "" : jSONObject2.toString());
                }
            });
        } else if (C1175n.m2059a().m2102H()) {
            Log.e("anythink", "PreInitNetwork may affect DebuggerMode.It is recommended to disable PreInitNetwork first and then setDebuggerMode.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1396f m5167b(String str, String str2) {
        C1396f c1396fM5164a;
        String str3 = str + str2;
        Integer num = this.f6171g.get(str2);
        int iIntValue = num == null ? 0 : num.intValue();
        return (iIntValue != 1 || (c1396fM5164a = m5164a(str, str2, 0)) == null) ? m5164a(str, str2, iIntValue) : c1396fM5164a;
    }

    /* JADX INFO: renamed from: b */
    public final void m5168b(String str, String str2, int i) {
        String str3 = str + str2;
        if (i == 1) {
            this.f6169e.remove(str3);
        } else {
            C1355s.m4234a(this.f6166b, C1169h.f3065p, m5161b(str3, i == 2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5169c(String str, String str2) {
        String str3 = str + str2;
        Integer num = this.f6170f.get(str3);
        if (num == null) {
            this.f6170f.put(str3, 1);
        } else {
            this.f6170f.put(str3, Integer.valueOf(num.intValue() + 1));
        }
    }
}
