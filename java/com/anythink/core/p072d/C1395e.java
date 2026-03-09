package com.anythink.core.p072d;

import android.text.TextUtils;
import com.anythink.core.common.p066o.C1345i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.d.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1395e {

    /* JADX INFO: renamed from: m */
    private static String f5868m = "ofm_logger";

    /* JADX INFO: renamed from: n */
    private static String f5869n = "ofm_tk_sw";

    /* JADX INFO: renamed from: o */
    private static String f5870o = "ofm_da_sw";

    /* JADX INFO: renamed from: p */
    private static String f5871p = "tk_address";

    /* JADX INFO: renamed from: q */
    private static String f5872q = "tk_max_amount";

    /* JADX INFO: renamed from: r */
    private static String f5873r = "tk_interval";

    /* JADX INFO: renamed from: s */
    private static String f5874s = "da_rt_keys_ft";

    /* JADX INFO: renamed from: t */
    private static String f5875t = "tk_no_t_ft";

    /* JADX INFO: renamed from: u */
    private static String f5876u = "da_not_keys_ft";

    /* JADX INFO: renamed from: v */
    private static String f5877v = "ofm_system";

    /* JADX INFO: renamed from: w */
    private static String f5878w = "ofm_tid";

    /* JADX INFO: renamed from: x */
    private static String f5879x = "ofm_firm_info";

    /* JADX INFO: renamed from: y */
    private static String f5880y = "ofm_st_vt";

    /* JADX INFO: renamed from: a */
    public String f5881a = String.valueOf(hashCode());

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f5882b;

    /* JADX INFO: renamed from: c */
    private boolean f5883c;

    /* JADX INFO: renamed from: d */
    private int f5884d;

    /* JADX INFO: renamed from: e */
    private int f5885e;

    /* JADX INFO: renamed from: f */
    private long f5886f;

    /* JADX INFO: renamed from: g */
    private int f5887g;

    /* JADX INFO: renamed from: h */
    private int f5888h;

    /* JADX INFO: renamed from: i */
    private String f5889i;

    /* JADX INFO: renamed from: j */
    private int f5890j;

    /* JADX INFO: renamed from: k */
    private long f5891k;

    /* JADX INFO: renamed from: l */
    private Map<String, String> f5892l;

    /* JADX INFO: renamed from: a */
    public static C1395e m4885a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C1395e c1395e = new C1395e();
            JSONObject jSONObject = new JSONObject(str);
            c1395e.f5884d = jSONObject.optInt(f5877v);
            c1395e.f5885e = jSONObject.optInt(f5878w);
            c1395e.f5886f = jSONObject.optLong(f5880y);
            c1395e.f5882b = C1345i.m4171c(jSONObject.optString(f5879x));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f5868m);
            if (jSONObjectOptJSONObject != null) {
                c1395e.f5887g = jSONObjectOptJSONObject.optInt(f5869n);
                c1395e.f5888h = jSONObjectOptJSONObject.optInt(f5870o);
                c1395e.f5889i = jSONObjectOptJSONObject.optString(f5871p);
                c1395e.f5890j = jSONObjectOptJSONObject.optInt(f5872q);
                c1395e.f5891k = jSONObjectOptJSONObject.optLong(f5873r);
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString(f5875t));
                    Iterator<String> itKeys = jSONObject2.keys();
                    HashMap map = new HashMap();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject2.optString(next));
                    }
                    c1395e.f5892l = map;
                } catch (Throwable unused) {
                }
            }
            return c1395e;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private int m4886b() {
        return this.f5884d;
    }

    /* JADX INFO: renamed from: b */
    private Map<String, Object> m4887b(String str) {
        try {
            Map<String, Object> map = this.f5882b;
            if (map != null) {
                return C1345i.m4171c(map.get(str).toString());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private int m4888c() {
        return this.f5885e;
    }

    /* JADX INFO: renamed from: c */
    private static C1395e m4889c(String str) {
        try {
            C1395e c1395e = new C1395e();
            JSONObject jSONObject = new JSONObject(str);
            c1395e.f5883c = true;
            c1395e.f5884d = jSONObject.optInt(f5877v);
            c1395e.f5882b = C1345i.m4171c(jSONObject.optString(f5879x));
            c1395e.f5887g = 1;
            c1395e.f5888h = 1;
            return c1395e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private int m4890d() {
        return this.f5887g;
    }

    /* JADX INFO: renamed from: e */
    private int m4891e() {
        return this.f5888h;
    }

    /* JADX INFO: renamed from: f */
    private String m4892f() {
        return this.f5889i;
    }

    /* JADX INFO: renamed from: g */
    private int m4893g() {
        return this.f5890j;
    }

    /* JADX INFO: renamed from: h */
    private long m4894h() {
        return this.f5891k;
    }

    /* JADX INFO: renamed from: i */
    private Map<String, String> m4895i() {
        return this.f5892l;
    }

    /* JADX INFO: renamed from: j */
    private String m4896j() {
        return this.f5881a;
    }

    /* JADX INFO: renamed from: k */
    private boolean m4897k() {
        return this.f5883c;
    }

    /* JADX INFO: renamed from: a */
    public final long m4898a() {
        return this.f5886f;
    }
}
