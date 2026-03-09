package com.anythink.core.p047c.p048a;

import android.text.TextUtils;
import com.anythink.core.common.C1294j;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.core.c.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1137a {

    /* JADX INFO: renamed from: a */
    public static final int f2833a = 10;

    /* JADX INFO: renamed from: b */
    public static final int f2834b = 4;

    /* JADX INFO: renamed from: c */
    private int f2835c;

    /* JADX INFO: renamed from: d */
    private String f2836d;

    /* JADX INFO: renamed from: e */
    private String f2837e;

    /* JADX INFO: renamed from: f */
    private int f2838f;

    /* JADX INFO: renamed from: g */
    private String f2839g;

    /* JADX INFO: renamed from: h */
    private String f2840h;

    /* JADX INFO: renamed from: i */
    private double f2841i;

    /* JADX INFO: renamed from: j */
    private long f2842j;

    /* JADX INFO: renamed from: k */
    private String f2843k;

    /* JADX INFO: renamed from: l */
    private int f2844l;

    /* JADX INFO: renamed from: a */
    private static void m1814a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj == null || TextUtils.isEmpty(str)) {
            return;
        }
        if ((obj instanceof String) && ((String) obj).isEmpty()) {
            return;
        }
        if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
            return;
        }
        if ((obj instanceof Long) && ((Long) obj).longValue() == 0) {
            return;
        }
        if ((obj instanceof Double) && ((Double) obj).doubleValue() == 0.0d) {
            return;
        }
        if (str.equals(C1294j.f4841F)) {
            jSONObject.put(str, String.valueOf(obj));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1815a() {
        return this.f2844l;
    }

    /* JADX INFO: renamed from: a */
    public final void m1816a(double d) {
        this.f2841i = d;
    }

    /* JADX INFO: renamed from: a */
    public final void m1817a(int i) {
        this.f2844l = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1818a(long j) {
        this.f2842j = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m1819a(String str) {
        this.f2837e = str;
    }

    /* JADX INFO: renamed from: b */
    public final String m1820b() {
        return this.f2837e;
    }

    /* JADX INFO: renamed from: b */
    public final void m1821b(int i) {
        this.f2838f = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m1822b(String str) {
        this.f2839g = str;
    }

    /* JADX INFO: renamed from: c */
    public final int m1823c() {
        return this.f2838f;
    }

    /* JADX INFO: renamed from: c */
    public final void m1824c(int i) {
        this.f2835c = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m1825c(String str) {
        this.f2840h = str;
    }

    /* JADX INFO: renamed from: d */
    public final String m1826d() {
        return this.f2839g;
    }

    /* JADX INFO: renamed from: d */
    public final void m1827d(String str) {
        this.f2843k = str;
    }

    /* JADX INFO: renamed from: e */
    public final String m1828e() {
        return this.f2840h;
    }

    /* JADX INFO: renamed from: e */
    public final void m1829e(String str) {
        this.f2836d = str;
    }

    /* JADX INFO: renamed from: f */
    public final double m1830f() {
        return this.f2841i;
    }

    /* JADX INFO: renamed from: g */
    public final long m1831g() {
        return this.f2842j;
    }

    /* JADX INFO: renamed from: h */
    public final String m1832h() {
        return this.f2843k;
    }

    /* JADX INFO: renamed from: i */
    public final JSONObject m1833i() {
        JSONObject jSONObject = new JSONObject();
        try {
            m1814a(jSONObject, "req_id", this.f2837e);
            m1814a(jSONObject, "unit_id", this.f2839g);
            m1814a(jSONObject, "dsp_id", this.f2840h);
            m1814a(jSONObject, C1294j.f4841F, Double.valueOf(this.f2841i));
            m1814a(jSONObject, "ts", Long.valueOf(this.f2842j));
            m1814a(jSONObject, "lc_id", this.f2843k);
            m1814a(jSONObject, "nw_firm_id", Integer.valueOf(this.f2838f));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: j */
    public final String m1834j() {
        return this.f2836d;
    }

    /* JADX INFO: renamed from: k */
    public final int m1835k() {
        return this.f2835c;
    }

    public final String toString() {
        return "PlacementStatisticsBean{requestId='" + this.f2837e + "', networkFirmId=" + this.f2838f + ", adSourceId='" + this.f2839g + "', dspId='" + this.f2840h + "', price=" + this.f2841i + ", recordTime=" + this.f2842j + ", psId='" + this.f2843k + "', placementId='" + this.f2836d + "', type= " + this.f2835c + "', segmentId= " + this.f2844l + MessageFormatter.DELIM_STOP;
    }
}
