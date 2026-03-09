package com.anythink.core.common.p055f;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.basead.adx.api.IATAdxHandler;
import com.anythink.core.common.C1294j;
import com.anythink.core.common.p052c.C1190k;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.p038b.p041c.C1106a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1252q extends C1250o implements Comparable<C1252q> {

    /* JADX INFO: renamed from: a */
    public int f4432a;

    /* JADX INFO: renamed from: b */
    public String f4433b;

    /* JADX INFO: renamed from: c */
    public String f4434c;

    /* JADX INFO: renamed from: d */
    public int f4435d;

    /* JADX INFO: renamed from: e */
    public long f4436e;

    /* JADX INFO: renamed from: f */
    public long f4437f;

    /* JADX INFO: renamed from: g */
    public String f4438g;

    /* JADX INFO: renamed from: h */
    public String f4439h;

    /* JADX INFO: renamed from: i */
    public String f4440i;

    /* JADX INFO: renamed from: j */
    public String f4441j;

    /* JADX INFO: renamed from: k */
    public String f4442k;

    /* JADX INFO: renamed from: l */
    public double f4443l;

    /* JADX INFO: renamed from: m */
    public String f4444m;

    /* JADX INFO: renamed from: n */
    public int f4445n;

    /* JADX INFO: renamed from: o */
    public double f4446o;

    /* JADX INFO: renamed from: p */
    public String f4447p;

    /* JADX INFO: renamed from: q */
    public double f4448q;

    /* JADX INFO: renamed from: r */
    public C1106a f4449r;

    /* JADX INFO: renamed from: s */
    public boolean f4450s;

    /* JADX INFO: renamed from: t */
    public List<C1251p> f4451t;

    /* JADX INFO: renamed from: u */
    public C1237bc f4452u;

    /* JADX INFO: renamed from: v */
    private final String f4453v;

    /* JADX INFO: renamed from: w */
    private boolean f4454w;

    /* JADX INFO: renamed from: x */
    private String f4455x;

    /* JADX INFO: renamed from: y */
    private a f4456y;

    /* JADX INFO: renamed from: z */
    private IATAdxHandler f4457z;

    /* JADX INFO: renamed from: com.anythink.core.common.f.q$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo280a(Map<String, Object> map);

        /* JADX INFO: renamed from: b */
        void mo281b(Map<String, Object> map);
    }

    public C1252q(boolean z, double d, double d2, String str, String str2, String str3, String str4, String str5) {
        super(z, d2, str, str2, str3, str4, str5, ATAdConst.CURRENCY.USD);
        this.f4453v = C1252q.class.getSimpleName() + ":";
        this.sortPrice = d;
    }

    public C1252q(boolean z, double d, String str, String str2, String str3, String str4, String str5) {
        super(z, d, str, str2, str3, str4, str5, ATAdConst.CURRENCY.USD);
        this.f4453v = C1252q.class.getSimpleName() + ":";
    }

    /* JADX INFO: renamed from: a */
    private int m3403a(C1252q c1252q) {
        if (c1252q == null) {
            return -1;
        }
        double d = this.sortPrice;
        double d2 = c1252q.sortPrice;
        if (d > d2) {
            return -1;
        }
        return d == d2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: a */
    public static C1252q m3404a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1252q c1252q = new C1252q(jSONObject.optInt("is_success") == 1, jSONObject.has("price") ? jSONObject.optDouble("price", 0.0d) : 0.0d, jSONObject.optString(C1190k.a.f3534c), jSONObject.optString("nurl"), jSONObject.optString("lurl"), jSONObject.optString("burl"), jSONObject.optString("err_msg"));
            c1252q.f4433b = jSONObject.optString("cur");
            c1252q.f4434c = jSONObject.optString("unit_id");
            c1252q.f4435d = jSONObject.optInt("nw_firm_id");
            c1252q.f4432a = jSONObject.optInt("err_code");
            c1252q.f4436e = jSONObject.optLong("expire");
            c1252q.f4437f = jSONObject.optLong("out_data_time");
            c1252q.f4454w = jSONObject.optBoolean("is_send_winurl");
            c1252q.f4440i = jSONObject.optString(C1190k.a.f3538g);
            c1252q.f4438g = jSONObject.optString(C1233az.f4044m);
            c1252q.f4441j = jSONObject.optString("burl_win");
            c1252q.f4442k = jSONObject.optString("ad_source_id");
            c1252q.f4443l = jSONObject.optDouble("cur_rate", 0.0d);
            c1252q.f4444m = jSONObject.optString("bid_response");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ctrl");
            if (jSONObjectOptJSONObject != null) {
                c1252q.f4445n = jSONObjectOptJSONObject.optInt(C1294j.f4873ag);
            }
            c1252q.f4446o = jSONObject.optDouble("ecpm_api", 0.0d);
            c1252q.f4447p = jSONObject.optString(C1294j.f4853R);
            c1252q.f4448q = jSONObject.optDouble(IATAdxHandler.SECOND_PRICE, 0.0d);
            c1252q.f4439h = jSONObject.optString("req_url", "");
            c1252q.useType = jSONObject.optInt("bd_type", 1);
            double dOptDouble = jSONObject.optDouble(C1294j.f4881ao, c1252q.price);
            c1252q.sortPrice = dOptDouble;
            c1252q.originPrice = jSONObject.optDouble("origin_price", dOptDouble);
            if (c1252q.f4435d == 1) {
                double d = c1252q.f4446o;
                if (d > 0.0d) {
                    c1252q.price = d;
                    c1252q.sortPrice = d;
                }
            }
            Object objOpt = jSONObject.opt("request_id");
            if (objOpt != null) {
                c1252q.f4455x = objOpt.toString();
            }
            return c1252q;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3405a(double d) {
        this.f4448q = d;
    }

    /* JADX INFO: renamed from: a */
    private void m3406a(C1237bc c1237bc) {
        this.f4452u = c1237bc;
    }

    /* JADX INFO: renamed from: j */
    private C1237bc m3407j() {
        return this.f4452u;
    }

    /* JADX INFO: renamed from: a */
    public final void m3408a(IATAdxHandler iATAdxHandler) {
        this.f4457z = iATAdxHandler;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3409a(C1251p c1251p) {
        if (c1251p == null) {
            return;
        }
        if (this.f4451t == null) {
            this.f4451t = Collections.synchronizedList(new ArrayList(4));
        }
        if (!this.f4451t.contains(c1251p)) {
            this.f4451t.add(c1251p);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3410a(a aVar) {
        this.f4456y = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3411a() {
        return this.f4437f < System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final String m3412b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C1190k.a.f3534c, this.token);
            jSONObject.put("cur", this.f4433b);
            jSONObject.put("origin_price", this.originPrice);
            jSONObject.put("price", this.price);
            jSONObject.put("nurl", this.winNoticeUrl);
            jSONObject.put("lurl", this.loseNoticeUrl);
            jSONObject.put("unit_id", this.f4434c);
            jSONObject.put("nw_firm_id", this.f4435d);
            jSONObject.put("is_success", this.isSuccess ? 1 : 0);
            jSONObject.put("err_code", this.f4432a);
            jSONObject.put("err_msg", this.errorMsg);
            jSONObject.put("expire", this.f4436e);
            jSONObject.put("out_data_time", this.f4437f);
            jSONObject.put("is_send_winurl", this.f4454w);
            jSONObject.put(C1233az.f4044m, this.f4438g);
            jSONObject.put("burl", this.displayNoticeUrl);
            jSONObject.put("ad_source_id", this.f4442k);
            jSONObject.put("cur_rate", this.f4443l);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C1294j.f4873ag, this.f4445n);
            jSONObject.put("ctrl", jSONObject2);
            if (!TextUtils.isEmpty(this.f4444m)) {
                jSONObject.put("bid_response", this.f4444m);
            }
            jSONObject.put("ecpm_api", this.f4446o);
            jSONObject.put(C1294j.f4853R, this.f4447p);
            jSONObject.put(IATAdxHandler.SECOND_PRICE, this.f4448q);
            jSONObject.put("req_url", this.f4439h);
            jSONObject.put("bd_type", this.useType);
            jSONObject.put(C1294j.f4881ao, this.sortPrice);
            jSONObject.put("request_id", this.f4455x);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m3413b(String str) {
        this.f4455x = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m3414c() {
        return this.f4455x;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C1252q c1252q) {
        C1252q c1252q2 = c1252q;
        if (c1252q2 == null) {
            return -1;
        }
        double d = this.sortPrice;
        double d2 = c1252q2.sortPrice;
        if (d > d2) {
            return -1;
        }
        return d == d2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m3415d() {
        if (this.f4454w) {
            return true;
        }
        this.f4454w = true;
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m3416e() {
        this.biddingNotice = null;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized C1229av m3417f() {
        C1229av c1229av;
        c1229av = null;
        List<C1251p> list = this.f4451t;
        if (list != null) {
            Iterator<C1251p> it = list.iterator();
            while (it.hasNext()) {
                C1229av c1229avM3392a = it.next().m3392a();
                if (c1229avM3392a != null && C1344h.m4129a(c1229avM3392a) > C1344h.m4129a(c1229av)) {
                    c1229av = c1229avM3392a;
                }
            }
        }
        return c1229av;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m3418g() {
        List<C1251p> list = this.f4451t;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: h */
    public final IATAdxHandler m3419h() {
        return this.f4457z;
    }

    /* JADX INFO: renamed from: i */
    public final a m3420i() {
        return this.f4456y;
    }
}
