package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1233az;
import com.anythink.core.common.p066o.C1355s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.x */
/* JADX INFO: loaded from: classes.dex */
public class C1390x {

    /* JADX INFO: renamed from: c */
    private static final String f5679c = "x";

    /* JADX INFO: renamed from: d */
    private static volatile C1390x f5680d;

    /* JADX INFO: renamed from: a */
    public Map<String, C1233az> f5681a;

    /* JADX INFO: renamed from: b */
    public Context f5682b;

    private C1390x(Context context) {
        this.f5682b = context.getApplicationContext();
        m4630a();
    }

    /* JADX INFO: renamed from: a */
    public static C1390x m4629a(Context context) {
        if (f5680d == null) {
            synchronized (C1390x.class) {
                if (f5680d == null) {
                    f5680d = new C1390x(context);
                }
            }
        }
        return f5680d;
    }

    /* JADX INFO: renamed from: a */
    private void m4630a() {
        if (this.f5681a == null) {
            this.f5681a = new ConcurrentHashMap(5);
            try {
                Map<String, ?> mapM4233a = C1355s.m4233a(this.f5682b, C1169h.f3041F);
                if (mapM4233a != null) {
                    for (Map.Entry<String, ?> entry : mapM4233a.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            this.f5681a.put(key, C1233az.m2871a((String) value));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C1233az m4631b(String str) {
        Map<String, C1233az> map = this.f5681a;
        if (map != null) {
            return map.remove(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static void m4632b() {
    }

    /* JADX INFO: renamed from: a */
    public final void m4633a(String str) {
        Map<String, C1233az> map = this.f5681a;
        if (map == null) {
            return;
        }
        try {
            C1233az c1233az = map.get(str);
            if (c1233az != null) {
                C1355s.m4237a(this.f5682b, C1169h.f3041F, str, c1233az.m2880a().toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4634a(String str, String str2, C1233az.a aVar, C1233az.a aVar2) {
        Map<String, C1233az> map = this.f5681a;
        if (map == null) {
            return;
        }
        C1233az c1233az = map.get(str);
        if (c1233az == null) {
            synchronized (this) {
                c1233az = this.f5681a.get(str);
                if (c1233az == null) {
                    c1233az = new C1233az();
                    c1233az.m2885b(str2);
                    this.f5681a.put(str, c1233az);
                }
            }
        }
        if (TextUtils.equals(str2, c1233az.m2883b())) {
            if (aVar != null) {
                c1233az.m2882a(aVar);
                c1233az.m2881a(System.currentTimeMillis());
            }
            if (aVar2 != null) {
                c1233az.m2884b(aVar2);
            }
        }
    }
}
