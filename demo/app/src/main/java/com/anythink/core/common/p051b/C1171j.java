package com.anythink.core.common.p051b;

import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.basead.adx.api.IATAdxHandler;
import com.anythink.core.common.C1294j;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p055f.C1233az;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.p072d.C1396f;
import com.umeng.commonsdk.proguard.C3471v;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1171j extends ATAdInfo {

    /* JADX INFO: renamed from: C */
    private Map<String, Object> f3298C;

    /* JADX INFO: renamed from: F */
    private double f3301F;

    /* JADX INFO: renamed from: a */
    private ATBaseAdAdapter f3303a;

    /* JADX INFO: renamed from: x */
    private Map<String, Object> f3326x;

    /* JADX INFO: renamed from: b */
    private int f3304b = -1;

    /* JADX INFO: renamed from: c */
    private String f3305c = "";

    /* JADX INFO: renamed from: d */
    private int f3306d = -1;

    /* JADX INFO: renamed from: e */
    private double f3307e = 0.0d;

    /* JADX INFO: renamed from: f */
    private int f3308f = 0;

    /* JADX INFO: renamed from: g */
    private String f3309g = "";

    /* JADX INFO: renamed from: h */
    private Double f3310h = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: i */
    private String f3311i = "";

    /* JADX INFO: renamed from: j */
    private String f3312j = "";

    /* JADX INFO: renamed from: k */
    private String f3313k = "";

    /* JADX INFO: renamed from: l */
    private String f3314l = "";

    /* JADX INFO: renamed from: m */
    private String f3315m = "unknow";

    /* JADX INFO: renamed from: n */
    private String f3316n = "Network";

    /* JADX INFO: renamed from: o */
    private String f3317o = "";

    /* JADX INFO: renamed from: p */
    private int f3318p = 1;

    /* JADX INFO: renamed from: q */
    private int f3319q = 0;

    /* JADX INFO: renamed from: r */
    private String f3320r = "";

    /* JADX INFO: renamed from: s */
    private String f3321s = "";

    /* JADX INFO: renamed from: t */
    private int f3322t = 0;

    /* JADX INFO: renamed from: u */
    private String f3323u = "";

    /* JADX INFO: renamed from: v */
    private String f3324v = "";

    /* JADX INFO: renamed from: w */
    private Map<String, Object> f3325w = null;

    /* JADX INFO: renamed from: y */
    private String f3327y = "";

    /* JADX INFO: renamed from: z */
    private int f3328z = 0;

    /* JADX INFO: renamed from: A */
    private String f3296A = "";

    /* JADX INFO: renamed from: B */
    private int f3297B = 0;

    /* JADX INFO: renamed from: D */
    private int f3299D = 1;

    /* JADX INFO: renamed from: E */
    private String f3300E = "";

    /* JADX INFO: renamed from: G */
    private IATAdxHandler f3302G = null;

    /* JADX INFO: renamed from: a */
    public static C1171j m2044a(BaseAd baseAd, ATBaseAdAdapter aTBaseAdAdapter) {
        if (baseAd == null) {
            return new C1171j();
        }
        C1243h detail = baseAd.getDetail();
        C1171j c1171jM2048a = m2048a(detail);
        c1171jM2048a.f3326x = baseAd.getNetworkInfoMap();
        if (aTBaseAdAdapter != null && detail != null) {
            try {
                if (detail.m3047X()) {
                    c1171jM2048a.f3302G = aTBaseAdAdapter.getUnitGroupInfo().m2719M().m3419h();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return c1171jM2048a;
    }

    /* JADX INFO: renamed from: a */
    public static C1171j m2045a(AbstractC1165d abstractC1165d) {
        return abstractC1165d != null ? m2046a(m2048a(abstractC1165d.getTrackingInfo()), abstractC1165d) : new C1171j();
    }

    /* JADX INFO: renamed from: a */
    private static C1171j m2046a(C1171j c1171j, AbstractC1165d abstractC1165d) {
        if (abstractC1165d != null && (abstractC1165d instanceof ATBaseAdAdapter)) {
            ATBaseAdAdapter aTBaseAdAdapter = (ATBaseAdAdapter) abstractC1165d;
            c1171j.f3303a = aTBaseAdAdapter;
            c1171j.f3326x = aTBaseAdAdapter.getNetworkInfoMap();
            try {
                if (c1171j.f3303a.getTrackingInfo().m3047X()) {
                    c1171j.f3302G = c1171j.f3303a.getUnitGroupInfo().m2719M().m3419h();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return c1171j;
    }

    /* JADX INFO: renamed from: a */
    private static C1171j m2047a(C1171j c1171j, C1243h c1243h) {
        String str;
        ATRewardInfo aTRewardInfoM3141z;
        ATRewardInfo aTRewardInfo;
        c1171j.f3304b = c1243h.m3039P();
        c1171j.f3305c = c1243h.m3026F();
        c1171j.f3306d = c1243h.m3031I();
        c1171j.f3308f = c1243h.m3022D();
        c1171j.f3307e = c1243h.m3112n();
        c1171j.f3301F = c1243h.m3072d();
        c1171j.f3311i = c1243h.m3118p();
        c1171j.f3309g = c1243h.m3129t();
        c1171j.f3310h = Double.valueOf(c1171j.f3307e / 1000.0d);
        c1171j.f3312j = c1243h.m3135w();
        c1171j.f3314l = C1344h.m4152d(c1243h.m2679aj());
        String strM2677ah = c1243h.m2677ah();
        String strM3078e = c1243h.m3078e();
        if (TextUtils.isEmpty(strM3078e) || TextUtils.equals(strM2677ah, strM3078e)) {
            str = "";
        } else {
            str = strM2677ah;
            strM2677ah = strM3078e;
        }
        c1171j.f3313k = strM2677ah;
        c1171j.f3300E = str;
        c1171j.f3315m = c1243h.m3133v();
        c1171j.f3316n = c1243h.m3039P() == 35 ? "Cross_Promotion" : c1243h.m3039P() == 66 ? "Adx" : "Network";
        c1171j.f3317o = c1243h.m3127s();
        c1171j.f3318p = c1243h.m3131u();
        c1171j.f3319q = c1243h.m3040Q();
        c1171j.f3320r = c1243h.f4134B;
        if (TextUtils.equals(C1169h.j.f3156b, c1171j.f3314l)) {
            Map<String, ATRewardInfo> mapM3139y = c1243h.m3139y();
            if (mapM3139y != null && mapM3139y.containsKey(c1171j.f3320r) && (aTRewardInfo = mapM3139y.get(c1171j.f3320r)) != null) {
                c1171j.f3321s = aTRewardInfo.rewardName;
                c1171j.f3322t = aTRewardInfo.rewardNumber;
            }
            if ((TextUtils.isEmpty(c1171j.f3321s) || c1171j.f3322t == 0) && (aTRewardInfoM3141z = c1243h.m3141z()) != null) {
                c1171j.f3321s = aTRewardInfoM3141z.rewardName;
                c1171j.f3322t = aTRewardInfoM3141z.rewardNumber;
            }
        }
        c1171j.f3324v = C1175n.m2059a().m2161m();
        c1171j.f3323u = C1175n.m2059a().m2163n();
        c1171j.f3325w = c1243h.m3016A();
        c1171j.f3327y = c1243h.m3109m();
        c1171j.f3328z = c1243h.m3044U();
        c1171j.f3296A = c1243h.m2670aa();
        c1171j.f3297B = c1243h.m2675af();
        Map<String, Object> mapM3092h = c1243h.m3092h();
        if (mapM3092h != null) {
            c1171j.f3298C = new HashMap(mapM3092h);
        }
        c1171j.f3299D = c1243h.m3088g();
        return c1171j;
    }

    /* JADX INFO: renamed from: a */
    private static C1171j m2048a(C1243h c1243h) {
        C1171j c1171j = new C1171j();
        return c1243h != null ? m2047a(c1171j, c1243h) : c1171j;
    }

    /* JADX INFO: renamed from: a */
    public static C1171j m2049a(C1243h c1243h, AbstractC1165d abstractC1165d) {
        return m2046a(m2048a(c1243h), abstractC1165d);
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getABTestId() {
        return this.f3297B;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdNetworkType() {
        return this.f3316n;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdsourceId() {
        return this.f3305c;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getAdsourceIndex() {
        return this.f3306d;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final IATAdxHandler getAdxHandler() {
        return this.f3302G;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getBidFloor() {
        return this.f3301F;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getChannel() {
        return this.f3324v;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCountry() {
        return this.f3312j;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCurrency() {
        return this.f3311i;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCustomRule() {
        return this.f3325w != null ? new JSONObject(this.f3325w).toString() : "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getDismissType() {
        return this.f3328z;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getEcpm() {
        return this.f3307e;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getEcpmLevel() {
        return this.f3318p;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getEcpmPrecision() {
        return this.f3315m;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getExtInfoMap() {
        return this.f3326x;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getLocalExtra() {
        return this.f3298C;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getNetworkFirmId() {
        return this.f3304b;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getNetworkPlacementId() {
        return this.f3317o;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getPlacementType() {
        return this.f3299D;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Double getPublisherRevenue() {
        return this.f3310h;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRewardUserCustomData() {
        ATBaseAdAdapter aTBaseAdAdapter = this.f3303a;
        return aTBaseAdAdapter != null ? aTBaseAdAdapter.getUserCustomData() : "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioId() {
        return this.f3320r;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioRewardName() {
        return this.f3321s;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getScenarioRewardNumber() {
        return this.f3322t;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getSegmentId() {
        return this.f3319q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getSharedPlacementId() {
        return this.f3300E;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getShowId() {
        return this.f3309g;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getSubChannel() {
        return this.f3323u;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnAdFormat() {
        return this.f3314l;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnPlacementId() {
        return this.f3313k;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTpBidId() {
        return this.f3327y;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getWaterfallId() {
        return this.f3296A;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int isHeaderBiddingAdsource() {
        return this.f3308f;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f3309g);
            jSONObject.put("publisher_revenue", this.f3310h);
            jSONObject.put("currency", this.f3311i);
            jSONObject.put(C3471v.f18929J, this.f3312j);
            jSONObject.put("adunit_id", this.f3313k);
            jSONObject.put("adunit_format", this.f3314l);
            jSONObject.put(C1294j.f4853R, this.f3315m);
            jSONObject.put("network_type", this.f3316n);
            jSONObject.put("network_placement_id", this.f3317o);
            jSONObject.put(C1294j.f4852Q, this.f3318p);
            jSONObject.put("segment_id", this.f3319q);
            if (!TextUtils.isEmpty(this.f3320r)) {
                jSONObject.put("scenario_id", this.f3320r);
            }
            if (!TextUtils.isEmpty(this.f3321s) && this.f3322t != 0) {
                jSONObject.put("scenario_reward_name", this.f3321s);
                jSONObject.put("scenario_reward_number", this.f3322t);
            }
            if (!TextUtils.isEmpty(this.f3324v)) {
                jSONObject.put("channel", this.f3324v);
            }
            if (!TextUtils.isEmpty(this.f3323u)) {
                jSONObject.put("sub_channel", this.f3323u);
            }
            Map<String, Object> map = this.f3325w;
            if (map != null && map.size() > 0) {
                jSONObject.put("custom_rule", new JSONObject(this.f3325w));
            }
            jSONObject.put("network_firm_id", this.f3304b);
            jSONObject.put("adsource_id", this.f3305c);
            jSONObject.put("adsource_index", this.f3306d);
            jSONObject.put("adsource_price", this.f3307e);
            jSONObject.put("adsource_isheaderbidding", this.f3308f);
            Map<String, Object> map2 = this.f3326x;
            if (map2 != null && map2.size() > 0) {
                jSONObject.put("ext_info", new JSONObject(this.f3326x));
            }
            ATBaseAdAdapter aTBaseAdAdapter = this.f3303a;
            if (aTBaseAdAdapter != null) {
                jSONObject.put("reward_custom_data", aTBaseAdAdapter.getUserCustomData());
            }
            if (!TextUtils.isEmpty(this.f3327y)) {
                jSONObject.put(C1233az.f4044m, this.f3327y);
            }
            int i = this.f3328z;
            if (i != 0) {
                jSONObject.put("dismiss_type", i);
            }
            if (!TextUtils.isEmpty(this.f3296A)) {
                jSONObject.put(C1396f.a.f6031T, this.f3296A);
            }
            jSONObject.put(C1275c.f4645I, this.f3297B);
            Map<String, Object> map3 = this.f3298C;
            if (map3 != null && map3.size() > 0) {
                jSONObject.put("user_load_extra_data", new JSONObject(this.f3298C));
            }
            jSONObject.put("placement_type", this.f3299D);
            if (!TextUtils.isEmpty(this.f3300E)) {
                jSONObject.put("shared_placement_id", this.f3300E);
            }
            jSONObject.put("bid_floor", this.f3301F);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }
}
