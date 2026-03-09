package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.analytics.C3375b;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.l */
/* JADX INFO: loaded from: classes2.dex */
public class C3390l {

    /* JADX INFO: renamed from: a */
    private static final int f18562a = 0;

    /* JADX INFO: renamed from: b */
    private static final int f18563b = 1;

    /* JADX INFO: renamed from: c */
    private static final int f18564c = 2;

    /* JADX INFO: renamed from: d */
    private static final int f18565d = 3;

    /* JADX INFO: renamed from: e */
    private final long f18566e;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C3390l f18567a = new C3390l();

        private a() {
        }
    }

    private C3390l() {
        this.f18566e = 60000L;
    }

    public /* synthetic */ C3390l(AnonymousClass1 anonymousClass1) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C3390l m15578a() {
        return a.f18567a;
    }

    /* JADX INFO: renamed from: c */
    private JSONArray m15579c() {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObjectM15433i = C3375b.m15394a().m15433i();
            if (jSONObjectM15433i.length() > 0) {
                jSONObject.put(C3380b.f18375ab, jSONObjectM15433i);
            }
            jSONObject.put(C3380b.f18377ad, C3393o.m15600a().m15614d());
            jSONObject.put(C3380b.f18378ae, jCurrentTimeMillis);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C3380b.f18379af, C3393o.m15600a().m15614d());
            jSONObject2.put(C3380b.f18380ag, jCurrentTimeMillis + 60000);
            if (jSONObjectM15433i.length() > 0) {
                jSONObject2.put(C3380b.f18375ab, jSONObjectM15433i);
            }
            jSONArray.put(jSONObject).put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public int m15580a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    /* JADX INFO: renamed from: a */
    public void m15581a(JSONObject jSONObject, Context context) {
        int iM15580a = m15580a(context);
        if (iM15580a == 1) {
            jSONObject.remove(C3380b.f18371Y);
        } else if (iM15580a == 2) {
            jSONObject.remove(C3380b.f18371Y);
            jSONObject.remove(C3380b.f18376ac);
            jSONObject.remove(C3380b.f18381ah);
            try {
                jSONObject.put(C3380b.f18376ac, m15579c());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            if (iM15580a != 3) {
                return;
            }
            jSONObject.remove(C3380b.f18371Y);
            jSONObject.remove(C3380b.f18376ac);
            jSONObject.remove(C3380b.f18381ah);
        }
        C3385g.m15485a(context).m15509f();
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m15582b() {
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject.put("id", C3393o.m15600a().m15614d());
            jSONObject.put("start_time", jCurrentTimeMillis);
            jSONObject.put("end_time", jCurrentTimeMillis + 60000);
            jSONObject.put("duration", 60000L);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public void m15583b(JSONObject jSONObject, Context context) {
        int iM15580a = m15580a(context);
        if (iM15580a != 1) {
            if (iM15580a == 2) {
                jSONObject.remove(C3380b.f18403n);
                try {
                    jSONObject.put(C3380b.f18403n, m15582b());
                } catch (Exception unused) {
                }
            } else if (iM15580a != 3) {
                return;
            } else {
                jSONObject.remove(C3380b.f18403n);
            }
        }
        jSONObject.remove("error");
        jSONObject.remove(C3380b.f18360N);
        jSONObject.remove(C3380b.f18361O);
        C3385g.m15485a(context).m15500a(false, true);
    }
}
