package com.anythink.core.common.p066o;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.C1197e;
import com.anythink.core.common.C1389w;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1222ao;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1235ba;
import com.anythink.core.common.p055f.C1238c;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.p037a.C1086a;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.o.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1358v {
    /* JADX INFO: renamed from: a */
    public static C1243h m4250a(ATBaseAdAdapter aTBaseAdAdapter, C1243h c1243h, C1229av c1229av) {
        aTBaseAdAdapter.setUnitGroupInfo(c1229av);
        aTBaseAdAdapter.setRefresh(c1243h.m3037N() == 1);
        try {
            c1243h.f4217u = aTBaseAdAdapter.getInternalNetworkSDKVersion();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(c1243h.m2674ae())) {
            c1243h.m2683u(aTBaseAdAdapter.getInternalNetworkName());
        }
        c1243h.m3082e(aTBaseAdAdapter.getClass().getName());
        aTBaseAdAdapter.setTrackingInfo(c1243h);
        return c1243h;
    }

    /* JADX INFO: renamed from: a */
    public static C1243h m4251a(String str, String str2, C1396f c1396f, int i, int i2, Map<String, Object> map, C1238c c1238c) {
        C1243h c1243h = new C1243h();
        c1243h.m2685w(str2);
        c1243h.m2686x(str);
        c1243h.m3138x(i);
        c1243h.f4214r = 0;
        c1243h.f4213q = 2;
        c1243h.f4215s = 0;
        m4255a(c1243h, c1396f);
        c1243h.m2672ac();
        c1243h.m2663L(C1175n.m2059a().m2154i());
        c1243h.m2664M(i2);
        if (c1396f != null) {
            c1243h.m2661J(c1396f.m5114h());
        } else {
            c1243h.m2661J(2);
        }
        m4258a(map, c1243h);
        c1243h.m3054a(c1238c);
        c1243h.m3071c(ATAdxSetting.getInstance().isAdxNetworkMode(str2));
        return c1243h;
    }

    /* JADX INFO: renamed from: a */
    public static void m4252a(Context context, C1243h c1243h) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = Integer.parseInt(c1243h.m2679aj());
        int[] iArrM1573a = C1086a.m1566a(context).m1573a(Integer.parseInt(c1243h.m2679aj()));
        int i2 = iArrM1573a[0];
        int i3 = iArrM1573a[1];
        C1222ao c1222aoM1568a = C1086a.m1566a(context).m1568a(c1243h.m2677ah(), i);
        c1243h.m3101j(i2 + 1);
        c1243h.m3104k(i3 + 1);
        c1243h.m3107l((c1222aoM1568a != null ? c1222aoM1568a.f3862c : 0) + 1);
        c1243h.m3110m((c1222aoM1568a != null ? c1222aoM1568a.f3863d : 0) + 1);
        new StringBuilder("Check cap waite time:").append(System.currentTimeMillis() - jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: a */
    public static void m4253a(C1243h c1243h, C1229av c1229av, int i, boolean z) {
        double dM2754ag;
        C1252q c1252qM2719M;
        C1261z c1261zM5107b;
        String str;
        C1222ao.a aVarM1567a = z ? C1086a.m1566a(C1175n.m2059a().m2148f()).m1567a(c1243h.m2677ah(), c1229av.m2842u(), Integer.parseInt(c1243h.m2679aj())) : null;
        c1243h.m3085f(c1229av.m2733a());
        c1243h.m3080e(c1229av.m2826m());
        c1243h.m3140y(c1229av.m2784d());
        c1243h.m3108l(c1229av.m2842u());
        c1243h.m3119p(c1229av.m2704D());
        c1243h.m3122q(c1229av.m2706E());
        c1243h.m3097i(c1229av.m2726T());
        c1243h.m3128s(i);
        c1243h.m3114n(c1229av.m2804h());
        c1243h.m3132u(aVarM1567a != null ? aVarM1567a.f3872e : 0);
        c1243h.m3134v(aVarM1567a != null ? aVarM1567a.f3871d : 0);
        if (c1229av.m2718L()) {
            c1243h.m3057a(c1229av.m2763ap());
            c1243h.m3084f(c1229av.m2850y());
            dM2754ag = c1229av.m2754ag();
        } else {
            dM2754ag = 0.0d;
            c1243h.m3084f(0.0d);
        }
        c1243h.m3066c(dM2754ag);
        if (c1229av.m2821k()) {
            if (c1229av.m2727U() != 2) {
                if (c1229av.m2748aa()) {
                    C1252q c1252qM2719M2 = c1229av.m2719M();
                    if (c1252qM2719M2 != null) {
                        c1243h.m3073d(c1252qM2719M2.f4446o * c1243h.m3115o());
                        str = c1252qM2719M2.f4447p;
                    }
                } else {
                    c1243h.m3073d(c1229av.m2850y() * c1243h.m3115o());
                    str = "exact";
                }
                c1243h.m3099i(str);
            }
            c1243h.m3049a(c1229av.m2752ae() * c1243h.m3115o());
        } else {
            c1243h.m3073d(c1229av.m2716J());
            String strM2710G = c1229av.m2710G();
            if (TextUtils.isEmpty(strM2710G)) {
                strM2710G = "publisher_defined";
            }
            c1243h.m3099i(strM2710G);
        }
        c1243h.m3125r(c1229av.m2814j());
        c1243h.m3087f(c1229av.m2852z());
        c1243h.f3925an = c1229av.m2844v();
        c1243h.f3926ao = c1229av.m2846w();
        c1243h.f3927ap = c1229av.m2848x();
        c1243h.m3113n(c1229av.m2708F());
        c1243h.m3093h(c1229av.m2727U());
        try {
            JSONObject jSONObject = new JSONObject(c1229av.m2804h());
            JSONObject jSONObject2 = new JSONObject();
            if (35 == c1229av.m2784d()) {
                String strOptString = jSONObject.optString("my_oid");
                C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(c1243h.m2677ah());
                if (c1396fM5139a != null && (c1261zM5107b = c1396fM5139a.m5107b(strOptString)) != null) {
                    jSONObject2.put("o_id", strOptString);
                    jSONObject2.put("c_id", c1261zM5107b.m3231u());
                }
            }
            if ("0".equals(c1243h.m2679aj()) && (3 == c1229av.m2826m() || 7 == c1229av.m2826m())) {
                String strOptString2 = jSONObject.optString("layout_type");
                if (TextUtils.isEmpty(strOptString2) || strOptString2.equals("0")) {
                    strOptString2 = "2";
                }
                jSONObject2.put("tpl_type", strOptString2);
            }
            if (28 == c1229av.m2784d() && (c1252qM2719M = c1229av.m2719M()) != null) {
                jSONObject2.put("origin_price", c1252qM2719M.originPrice);
            }
            c1243h.m3120p(jSONObject2.toString());
        } catch (Throwable unused) {
        }
        C1252q c1252qM2719M3 = c1229av.m2719M();
        c1243h.m3069c(c1252qM2719M3 != null ? c1252qM2719M3.f4438g : "");
        c1243h.m3017A(c1229av.m2730X());
        c1243h.m2683u(c1229av.m2789e());
    }

    /* JADX INFO: renamed from: a */
    private static void m4254a(C1243h c1243h, C1235ba c1235ba) {
        if (c1243h != null) {
            c1243h.m3067c(c1235ba.m2920e());
            c1243h.m3074d(c1235ba.m2921f());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4255a(C1243h c1243h, C1396f c1396f) {
        if (c1243h == null || c1396f == null) {
            return;
        }
        if (c1396f.m5090ah() == Integer.parseInt("1")) {
            c1243h.m3117o("1");
        } else {
            c1243h.m3117o("0");
        }
        c1243h.m2665N(c1396f.m5054Z());
        c1243h.m2684v(c1396f.m5087ae());
        c1243h.m3142z(c1396f.m5097ao());
        c1243h.m2687y(String.valueOf(c1396f.m5090ah()));
        c1243h.m3102j(c1396f.m5050V());
        c1243h.m3105k(c1396f.m5049U());
        c1243h.m3079e(c1396f.m5039K());
        c1243h.m3076d(c1396f.m5040L());
        c1243h.m3070c(c1396f.m5048T());
        c1243h.m3053a(c1396f.m5051W());
        c1243h.m3077d(c1396f.m5052X());
        c1243h.m3067c(c1396f.m5130x());
        c1243h.m3074d(c1396f.m5131y());
        c1243h.m2681s(c1396f.m5123q());
        JSONObject jSONObjectM5067aI = c1396f.m5067aI();
        if (jSONObjectM5067aI != null) {
            c1243h.m2669a(jSONObjectM5067aI);
        }
        c1243h.m2661J(c1396f.m5114h());
        c1243h.m3060b(C1389w.m4583a().m4628c(c1243h.m2677ah()) ? 2 : 1);
        c1243h.m3030H(c1396f.m5078aT());
    }

    /* JADX INFO: renamed from: a */
    public static void m4256a(String str, C1243h c1243h) {
        C1396f c1396fM5139a;
        if (c1243h == null || (c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(str)) == null || !c1396fM5139a.m5082aX()) {
            return;
        }
        m4257a(str, c1396fM5139a, c1243h);
    }

    /* JADX INFO: renamed from: a */
    public static void m4257a(String str, C1396f c1396f, C1243h c1243h) {
        if (c1396f == null || c1243h == null) {
            return;
        }
        C1238c c1238c = new C1238c();
        c1238c.m2967a(str, c1396f.m5097ao(), c1396f.m5054Z());
        c1243h.m3054a(c1238c);
    }

    /* JADX INFO: renamed from: a */
    public static void m4258a(Map<String, Object> map, C1243h c1243h) {
        if (map != null) {
            Object obj = map.get(ATAdConst.KEY.CP_PLACEMENT_ID);
            if (obj != null) {
                c1243h.m2682t(obj.toString());
            }
            Object obj2 = map.get(ATAdConst.KEY.CP_LOAD_MODE);
            if (obj2 instanceof Integer) {
                c1243h.m2662K(Integer.parseInt(obj2.toString()));
            }
            Object obj3 = map.get(C1197e.f3573b);
            if (obj3 != null) {
                c1243h.m2668a(obj3);
            }
        }
    }
}
