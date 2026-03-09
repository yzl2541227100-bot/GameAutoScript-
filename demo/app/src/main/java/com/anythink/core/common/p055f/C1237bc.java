package com.anythink.core.common.p055f;

import com.anythink.core.api.ATAdConst;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.f.bc */
/* JADX INFO: loaded from: classes.dex */
public final class C1237bc {

    /* JADX INFO: renamed from: a */
    public int f4092a;

    /* JADX INFO: renamed from: b */
    private C1243h f4093b;

    /* JADX INFO: renamed from: c */
    private String f4094c;

    /* JADX INFO: renamed from: d */
    private String f4095d;

    /* JADX INFO: renamed from: e */
    private String f4096e;

    /* JADX INFO: renamed from: f */
    private String f4097f;

    /* JADX INFO: renamed from: g */
    private String f4098g;

    /* JADX INFO: renamed from: h */
    private double f4099h;

    /* JADX INFO: renamed from: i */
    private double f4100i;

    /* JADX INFO: renamed from: j */
    private double f4101j;

    /* JADX INFO: renamed from: k */
    private double f4102k;

    /* JADX INFO: renamed from: l */
    private int f4103l;

    /* JADX INFO: renamed from: m */
    private double f4104m;

    /* JADX INFO: renamed from: n */
    private String f4105n = null;

    /* JADX INFO: renamed from: a */
    private static String m2932a(Map<String, Object> map, String str) {
        if (map == null) {
            return "";
        }
        Object obj = map.get(str);
        return (!(obj instanceof String) && obj == null) ? "" : obj.toString();
    }

    /* JADX INFO: renamed from: a */
    public final double m2933a() {
        return this.f4104m;
    }

    /* JADX INFO: renamed from: a */
    public final void m2934a(double d) {
        this.f4099h = d;
    }

    /* JADX INFO: renamed from: a */
    public final void m2935a(double d, String str) {
        this.f4104m = d;
        this.f4105n = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m2936a(C1229av c1229av) {
        this.f4098g = "0";
        if (c1229av == null) {
            return;
        }
        int iM2826m = c1229av.m2826m();
        this.f4098g = iM2826m != 2 ? (iM2826m == 5 || iM2826m == 6) ? "3" : "1" : "2";
        this.f4103l = c1229av.m2773az();
    }

    /* JADX INFO: renamed from: a */
    public final void m2937a(C1243h c1243h) {
        this.f4093b = c1243h;
    }

    /* JADX INFO: renamed from: a */
    public final void m2938a(String str) {
        this.f4096e = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m2939a(Map<String, Object> map) {
        this.f4094c = m2932a(map, "offer_id");
        this.f4095d = m2932a(map, "dsp_id");
        if (map != null) {
            Object obj = map.get(ATAdConst.NETWORK_CUSTOM_KEY.WS_IMP_SWITCH);
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num.intValue() != 0) {
                    this.f4092a = num.intValue();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m2940b() {
        return this.f4105n;
    }

    /* JADX INFO: renamed from: b */
    public final void m2941b(double d) {
        this.f4100i = d;
    }

    /* JADX INFO: renamed from: b */
    public final void m2942b(String str) {
        this.f4097f = str;
    }

    /* JADX INFO: renamed from: c */
    public final int m2943c() {
        return this.f4092a;
    }

    /* JADX INFO: renamed from: c */
    public final void m2944c(double d) {
        this.f4101j = d;
    }

    /* JADX INFO: renamed from: d */
    public final String m2945d() {
        return this.f4094c;
    }

    /* JADX INFO: renamed from: d */
    public final void m2946d(double d) {
        this.f4102k = d;
    }

    /* JADX INFO: renamed from: e */
    public final String m2947e() {
        return this.f4095d;
    }

    /* JADX INFO: renamed from: f */
    public final String m2948f() {
        return this.f4096e;
    }

    /* JADX INFO: renamed from: g */
    public final String m2949g() {
        return this.f4097f;
    }

    /* JADX INFO: renamed from: h */
    public final String m2950h() {
        C1243h c1243h = this.f4093b;
        return c1243h != null ? c1243h.m3109m() : "";
    }

    /* JADX INFO: renamed from: i */
    public final String m2951i() {
        return this.f4098g;
    }

    /* JADX INFO: renamed from: j */
    public final String m2952j() {
        C1243h c1243h = this.f4093b;
        return c1243h != null ? c1243h.m2678ai() : "";
    }

    /* JADX INFO: renamed from: k */
    public final String m2953k() {
        C1243h c1243h = this.f4093b;
        return c1243h != null ? String.valueOf(c1243h.m3040Q()) : "";
    }

    /* JADX INFO: renamed from: l */
    public final String m2954l() {
        C1243h c1243h = this.f4093b;
        return c1243h != null ? String.valueOf(c1243h.m2675af()) : "";
    }

    /* JADX INFO: renamed from: m */
    public final String m2955m() {
        C1243h c1243h = this.f4093b;
        return c1243h != null ? c1243h.m2677ah() : "";
    }

    /* JADX INFO: renamed from: n */
    public final int m2956n() {
        C1243h c1243h = this.f4093b;
        if (c1243h != null) {
            return c1243h.m3039P();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final String m2957o() {
        C1243h c1243h = this.f4093b;
        return c1243h != null ? c1243h.m3026F() : "";
    }

    /* JADX INFO: renamed from: p */
    public final String m2958p() {
        C1243h c1243h = this.f4093b;
        return c1243h != null ? c1243h.m2676ag() : "";
    }

    /* JADX INFO: renamed from: q */
    public final String m2959q() {
        C1243h c1243h = this.f4093b;
        if (c1243h != null) {
            return c1243h.m2679aj();
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final double m2960r() {
        return this.f4099h;
    }

    /* JADX INFO: renamed from: s */
    public final double m2961s() {
        return this.f4100i;
    }

    /* JADX INFO: renamed from: t */
    public final double m2962t() {
        return this.f4101j;
    }

    /* JADX INFO: renamed from: u */
    public final double m2963u() {
        return this.f4102k;
    }

    /* JADX INFO: renamed from: v */
    public final int m2964v() {
        return this.f4103l;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2965w() {
        return this.f4103l == 1;
    }
}
