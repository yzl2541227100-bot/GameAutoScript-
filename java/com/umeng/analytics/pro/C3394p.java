package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3385g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.p */
/* JADX INFO: loaded from: classes2.dex */
public class C3394p {

    /* JADX INFO: renamed from: a */
    private static JSONObject f18584a = new JSONObject();

    /* JADX INFO: renamed from: b */
    private final Map<String, Long> f18585b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m15616a(Context context) {
        if (context != null) {
            try {
                synchronized (f18584a) {
                    if (f18584a.length() > 0) {
                        C3385g.m15485a(context).m15502a(C3393o.m15600a().m15614d(), f18584a, C3385g.a.PAGE);
                        f18584a = new JSONObject();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15617a() {
        String key;
        synchronized (this.f18585b) {
            key = null;
            long j = 0;
            for (Map.Entry<String, Long> entry : this.f18585b.entrySet()) {
                if (entry.getValue().longValue() > j) {
                    long jLongValue = entry.getValue().longValue();
                    key = entry.getKey();
                    j = jLongValue;
                }
            }
        }
        if (key != null) {
            m15619b(key);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15618a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f18585b) {
            this.f18585b.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15619b(String str) {
        Long l;
        if (TextUtils.isEmpty(str) || !this.f18585b.containsKey(str)) {
            return;
        }
        synchronized (this.f18585b) {
            l = this.f18585b.get(str);
        }
        if (l == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        synchronized (f18584a) {
            try {
                JSONObject jSONObject = new JSONObject();
                f18584a = jSONObject;
                jSONObject.put(C3380b.f18410u, str);
                f18584a.put("duration", jCurrentTimeMillis);
            } catch (Throwable unused) {
            }
        }
    }
}
