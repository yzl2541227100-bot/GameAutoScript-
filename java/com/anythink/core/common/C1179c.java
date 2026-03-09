package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.p072d.C1396f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.c */
/* JADX INFO: loaded from: classes.dex */
public class C1179c {

    /* JADX INFO: renamed from: a */
    public static String f3449a = "c";

    /* JADX INFO: renamed from: f */
    private static volatile C1179c f3450f;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, Long> f3451b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap<String, Long> f3452c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    public Map<String, a> f3453d = new ConcurrentHashMap(5);

    /* JADX INFO: renamed from: e */
    public Map<String, Map<String, Long>> f3454e;

    /* JADX INFO: renamed from: com.anythink.core.common.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f3455a;

        /* JADX INFO: renamed from: b */
        public long f3456b;
    }

    private C1179c() {
    }

    /* JADX INFO: renamed from: a */
    public static C1179c m2193a() {
        if (f3450f == null) {
            synchronized (C1179c.class) {
                if (f3450f == null) {
                    f3450f = new C1179c();
                }
            }
        }
        return f3450f;
    }

    /* JADX INFO: renamed from: b */
    private void m2194b(String str, long j) {
        this.f3452c.put(str, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    public final void m2195a(String str) {
        this.f3454e = new ConcurrentHashMap(3);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    HashMap map = new HashMap(3);
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    while (itKeys2.hasNext()) {
                        try {
                            String next2 = itKeys2.next();
                            map.put(next2, Long.valueOf(jSONObjectOptJSONObject.getLong(next2)));
                        } catch (Throwable unused) {
                        }
                    }
                    this.f3454e.put(next, map);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2196a(String str, long j) {
        this.f3451b.put(str, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    public final void m2197a(String str, long j, AdError adError) {
        if (TextUtils.equals(adError.getCode(), ErrorCode.noADError)) {
            a aVar = this.f3453d.get(str);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f3455a = adError.getPlatformCode();
            aVar.f3456b = j;
            this.f3453d.put(str, aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2198a(int i, C1396f c1396f, C1229av c1229av) {
        int i2;
        Long l;
        if (this.f3454e == null) {
            return false;
        }
        List<Integer> listM5122p = c1396f.m5122p();
        if (listM5122p.size() == 0) {
            return false;
        }
        a aVar = this.f3453d.get(c1229av.m2842u());
        if (aVar == null) {
            return false;
        }
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i2 = 3;
                break;
            case 2:
            default:
                i2 = 1;
                break;
            case 8:
                i2 = 2;
                break;
        }
        if (listM5122p.contains(Integer.valueOf(i2))) {
            Map<String, Long> map = this.f3454e.get(String.valueOf(c1229av.m2784d()));
            return (map == null || (l = map.get(aVar.f3455a)) == null || aVar.f3456b + l.longValue() < System.currentTimeMillis()) ? false : true;
        }
        StringBuilder sb = new StringBuilder("The current load mode is: ");
        sb.append(i2);
        sb.append(", no need to filter");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2199a(C1229av c1229av) {
        if (c1229av.m2712H() == 0) {
            return false;
        }
        return (this.f3451b.get(c1229av.m2842u()) != null ? this.f3451b.get(c1229av.m2842u()).longValue() : 0L) + c1229av.m2712H() >= System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2200b(C1229av c1229av) {
        if (c1229av.m2826m() == 7) {
            return false;
        }
        if (c1229av.m2714I() == 0) {
            return false;
        }
        return (this.f3452c.get(c1229av.m2842u()) != null ? this.f3452c.get(c1229av.m2842u()).longValue() : 0L) + c1229av.m2714I() >= System.currentTimeMillis();
    }
}
