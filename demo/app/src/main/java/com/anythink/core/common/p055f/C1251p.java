package com.anythink.core.common.p055f;

import android.text.TextUtils;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.expressad.foundation.p116d.C1781c;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.core.common.f.p */
/* JADX INFO: loaded from: classes.dex */
public class C1251p {

    /* JADX INFO: renamed from: a */
    public static final String f4413a = "reqId";

    /* JADX INFO: renamed from: b */
    public static final String f4414b = "hasShow";

    /* JADX INFO: renamed from: c */
    public static final String f4415c = "hasClick";

    /* JADX INFO: renamed from: d */
    public static final String f4416d = "price";

    /* JADX INFO: renamed from: e */
    public static final String f4417e = "networkFirmId";

    /* JADX INFO: renamed from: f */
    public static final String f4418f = "isHB";

    /* JADX INFO: renamed from: g */
    public static final String f4419g = "adsListType";

    /* JADX INFO: renamed from: h */
    public static final String f4420h = "tpBidId";

    /* JADX INFO: renamed from: i */
    private static String f4421i = "p";

    /* JADX INFO: renamed from: j */
    private boolean f4422j;

    /* JADX INFO: renamed from: k */
    private String f4423k;

    /* JADX INFO: renamed from: l */
    private boolean f4424l;

    /* JADX INFO: renamed from: m */
    private boolean f4425m;

    /* JADX INFO: renamed from: n */
    private C1229av f4426n;

    /* JADX INFO: renamed from: o */
    private int f4427o;

    /* JADX INFO: renamed from: p */
    private double f4428p;

    /* JADX INFO: renamed from: q */
    private boolean f4429q;

    /* JADX INFO: renamed from: r */
    private int f4430r;

    /* JADX INFO: renamed from: s */
    private String f4431s;

    public C1251p(String str) {
        this.f4423k = str;
    }

    /* JADX INFO: renamed from: a */
    private static int m3389a(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i == 4 || i == 5) {
                    return 4;
                }
                if (i != 7) {
                    if (i != 8 && i != 11) {
                        return 1;
                    }
                }
            }
            return 2;
        }
        return 3;
    }

    /* JADX INFO: renamed from: a */
    public static C1251p m3390a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1251p c1251p = new C1251p(jSONObject.getString("reqId"));
            c1251p.f4422j = true;
            c1251p.f4424l = jSONObject.optBoolean(f4414b);
            c1251p.f4425m = jSONObject.optBoolean(f4415c);
            c1251p.f4428p = jSONObject.optDouble("price", -1.0d);
            c1251p.f4427o = jSONObject.optInt("networkFirmId");
            c1251p.f4429q = jSONObject.optBoolean(f4418f);
            c1251p.f4430r = jSONObject.optInt(f4419g);
            c1251p.f4431s = jSONObject.optString(f4420h);
            return c1251p;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m3391k() {
        return this.f4422j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C1229av m3392a() {
        return this.f4426n;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3393a(C1229av c1229av) {
        new StringBuilder("refresh: ").append(c1229av);
        this.f4426n = c1229av;
    }

    /* JADX INFO: renamed from: b */
    public final String m3394b() {
        return this.f4423k;
    }

    /* JADX INFO: renamed from: c */
    public final void m3395c() {
        this.f4424l = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m3396d() {
        this.f4425m = true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3397e() {
        return this.f4424l;
    }

    /* JADX INFO: renamed from: f */
    public final String m3398f() {
        double dM4129a;
        int iM2784d;
        int iM3389a;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            int i = 1;
            int i2 = this.f4424l ? 1 : 0;
            if (!this.f4425m) {
                i = 0;
            }
            if (this.f4422j) {
                dM4129a = this.f4428p;
                iM2784d = this.f4427o;
                iM3389a = m3389a(this.f4430r);
                str = this.f4431s;
            } else {
                dM4129a = C1344h.m4129a(this.f4426n);
                iM2784d = this.f4426n.m2784d();
                C1252q c1252qM2719M = this.f4426n.m2719M();
                int iM3389a2 = m3389a(this.f4426n.m2733a());
                if (c1252qM2719M == null || TextUtils.isEmpty(c1252qM2719M.f4438g)) {
                    iM3389a = iM3389a2;
                    str = "";
                } else {
                    str = c1252qM2719M.f4438g;
                    iM3389a = iM3389a2;
                }
            }
            jSONObject.put("price", dM4129a);
            jSONObject.put("networkFirmId", iM2784d);
            jSONObject.put(C1233az.f4043l, iM3389a);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(C1233az.f4044m, str);
            }
            jSONObject.put("imp", i2);
            jSONObject.put(C1781c.f10313ca, i);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized JSONObject m3399g() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("reqId", this.f4423k);
            jSONObject.put(f4414b, this.f4424l);
            jSONObject.put(f4415c, this.f4425m);
            C1229av c1229av = this.f4426n;
            if (c1229av != null) {
                jSONObject.put("price", C1344h.m4129a(c1229av));
                jSONObject.put("networkFirmId", this.f4426n.m2784d());
                jSONObject.put(f4418f, this.f4426n.m2821k());
                jSONObject.put(f4419g, this.f4426n.m2733a());
                C1252q c1252qM2719M = this.f4426n.m2719M();
                if (c1252qM2719M != null && !TextUtils.isEmpty(c1252qM2719M.f4438g)) {
                    jSONObject.put(f4420h, c1252qM2719M.f4438g);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public final double m3400h() {
        if (this.f4422j) {
            return this.f4428p;
        }
        C1229av c1229av = this.f4426n;
        if (c1229av != null) {
            return C1344h.m4129a(c1229av);
        }
        return -1.0d;
    }

    /* JADX INFO: renamed from: i */
    public final int m3401i() {
        if (this.f4422j) {
            return this.f4427o;
        }
        C1229av c1229av = this.f4426n;
        if (c1229av != null) {
            return c1229av.m2784d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3402j() {
        if (this.f4422j) {
            return this.f4429q;
        }
        C1229av c1229av = this.f4426n;
        if (c1229av != null) {
            return c1229av.m2821k();
        }
        return false;
    }

    public String toString() {
        String str;
        if (this.f4422j) {
            str = ", priceInDisk=" + this.f4428p + ", networkFirmIdInDisk=" + this.f4427o + ", winnerIsHBInDisk=" + this.f4429q + ", adsListTypeInDisk=" + this.f4430r + ", tpBidIdInDisk=" + this.f4431s;
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder("BiddingRecorder{fromLocalDisk=");
        sb.append(this.f4422j);
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", requestId=");
        sb.append(this.f4423k);
        sb.append(", hasShow=");
        sb.append(this.f4424l);
        sb.append(", hasClick=");
        sb.append(this.f4425m);
        sb.append(", loadedMaxPriceUgInMemory=");
        sb.append(this.f4426n);
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
