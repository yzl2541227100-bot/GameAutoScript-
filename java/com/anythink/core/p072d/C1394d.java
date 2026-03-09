package com.anythink.core.p072d;

import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.core.d.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1394d {

    /* JADX INFO: renamed from: a */
    private int f5862a = 1;

    /* JADX INFO: renamed from: b */
    private int f5863b = 0;

    /* JADX INFO: renamed from: c */
    private int f5864c = 3;

    /* JADX INFO: renamed from: d */
    private int f5865d = 1;

    /* JADX INFO: renamed from: e */
    private double f5866e = 2.0d;

    /* JADX INFO: renamed from: f */
    private int f5867f = 3;

    /* JADX INFO: renamed from: a */
    public static C1394d m4878a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1394d c1394d = new C1394d();
            c1394d.f5862a = jSONObject.optInt("limit_sw", 1);
            c1394d.f5863b = jSONObject.optInt("latest_day", 0);
            c1394d.f5864c = jSONObject.optInt("max_n", 3);
            c1394d.f5865d = jSONObject.optInt("min_m", 1);
            c1394d.f5866e = jSONObject.optDouble("premium_rate", 2.0d);
            c1394d.f5867f = jSONObject.optInt("premium_level", 3);
            return c1394d;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4879a() {
        return this.f5862a;
    }

    /* JADX INFO: renamed from: b */
    public final int m4880b() {
        return this.f5863b;
    }

    /* JADX INFO: renamed from: c */
    public final int m4881c() {
        return this.f5864c;
    }

    /* JADX INFO: renamed from: d */
    public final int m4882d() {
        return this.f5865d;
    }

    /* JADX INFO: renamed from: e */
    public final double m4883e() {
        return this.f5866e;
    }

    /* JADX INFO: renamed from: f */
    public final int m4884f() {
        return this.f5867f;
    }

    public final String toString() {
        return "DynamicWaterfallStrategy{limitSegmentSwitch=" + this.f5862a + ", latestDay=" + this.f5863b + ", maxCollectCount=" + this.f5864c + ", minCollectCount=" + this.f5865d + ", premiumRate=" + this.f5866e + ", premiumLevel=" + this.f5867f + MessageFormatter.DELIM_STOP;
    }
}
