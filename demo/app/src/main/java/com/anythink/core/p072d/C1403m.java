package com.anythink.core.p072d;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATCustomAdapterConfig;
import com.anythink.core.common.C1294j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p053d.C1196c;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.p072d.C1396f;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mobi.oneway.export.p283g.C3637i;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.d.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1403m {
    /* JADX INFO: renamed from: a */
    private static C1229av m5173a(int i, int i2, JSONObject jSONObject) {
        ATCustomAdapterConfig aTCustomAdapterConfigM2131b;
        JSONArray jSONArrayOptJSONArray;
        int i3 = (i2 == 0 || i2 == 4 || i2 == 8) ? 0 : 1;
        C1229av c1229av = new C1229av(i);
        c1229av.m2791e(i2);
        c1229av.m2786d(i3);
        if (jSONObject.isNull(C1294j.f4837B)) {
            c1229av.m2783c("");
        } else {
            c1229av.m2783c(jSONObject.optString(C1294j.f4837B));
        }
        if (jSONObject.isNull(C1294j.f4916y)) {
            c1229av.m2776b(-1);
        } else {
            c1229av.m2776b(jSONObject.optInt(C1294j.f4916y));
        }
        if (jSONObject.isNull(C1294j.f4917z)) {
            c1229av.m2781c(-1);
        } else {
            c1229av.m2781c(jSONObject.optInt(C1294j.f4917z));
        }
        if (jSONObject.isNull("content")) {
            c1229av.m2778b("");
        } else {
            c1229av.m2778b(jSONObject.optString("content"));
        }
        if (jSONObject.isNull("nw_firm_id")) {
            c1229av.m2735a(-1);
        } else {
            c1229av.m2735a(jSONObject.optInt("nw_firm_id"));
        }
        if (jSONObject.isNull(C1294j.f4915x)) {
            c1229av.m2740a("");
        } else {
            c1229av.m2740a(jSONObject.optString(C1294j.f4915x));
        }
        c1229av.m2788d(jSONObject.isNull(C1294j.f4838C) ? "unknown" : jSONObject.optString(C1294j.f4838C));
        if (jSONObject.isNull(C1294j.f4913v)) {
            c1229av.m2782c(0L);
        } else {
            c1229av.m2782c(jSONObject.optInt(C1294j.f4913v));
        }
        if (jSONObject.isNull(C1294j.f4911t)) {
            c1229av.m2787d(0L);
        } else {
            c1229av.m2787d(jSONObject.optInt(C1294j.f4911t));
        }
        if (jSONObject.isNull(C1294j.f4912u)) {
            c1229av.m2806h(1);
        } else {
            c1229av.m2806h(jSONObject.optInt(C1294j.f4912u));
        }
        if (jSONObject.isNull("pacing")) {
            c1229av.m2792e(-1L);
        } else {
            c1229av.m2792e(jSONObject.optLong("pacing"));
        }
        if (jSONObject.isNull("unit_id")) {
            c1229av.m2793e("");
        } else {
            c1229av.m2793e(jSONObject.optString("unit_id"));
        }
        if (jSONObject.isNull(C1294j.f4841F)) {
            c1229av.m2734a(0.0d);
        } else {
            c1229av.m2734a(jSONObject.optDouble(C1294j.f4841F, 0.0d));
        }
        c1229av.m2797f(jSONObject.isNull(C1294j.f4842G) ? C1659a.f9130f : jSONObject.optInt(C1294j.f4842G));
        if (jSONObject.isNull(C1294j.f4844I)) {
            c1229av.m2798f("");
        } else {
            c1229av.m2798f(jSONObject.optString(C1294j.f4844I));
        }
        if (jSONObject.isNull(C1294j.f4845J)) {
            c1229av.m2811i(0);
        } else {
            c1229av.m2811i(jSONObject.optInt(C1294j.f4845J));
        }
        c1229av.m2815j(jSONObject.isNull(C1294j.f4846K) ? 3000 : jSONObject.optInt(C1294j.f4846K));
        if (jSONObject.isNull("payload")) {
            c1229av.m2803g("");
        } else {
            c1229av.m2803g(jSONObject.optString("payload"));
        }
        if (jSONObject.isNull("error")) {
            c1229av.m2808h("");
        } else {
            c1229av.m2808h(jSONObject.optString("error"));
        }
        c1229av.m2802g(jSONObject.isNull(C1294j.f4847L) ? 1800000L : jSONObject.optLong(C1294j.f4847L));
        if (jSONObject.isNull(C1294j.f4848M)) {
            c1229av.m2807h(-1L);
        } else {
            c1229av.m2807h(jSONObject.optLong(C1294j.f4848M));
        }
        c1229av.m2777b(jSONObject.isNull(C1294j.f4849N) ? 1800000L : jSONObject.optLong(C1294j.f4849N));
        c1229av.m2801g(jSONObject.isNull(C1294j.f4877ak) ? i3 ^ 1 : jSONObject.optInt(C1294j.f4877ak));
        if (jSONObject.isNull(C1294j.f4850O)) {
            c1229av.m2818k(1);
        } else {
            c1229av.m2818k(jSONObject.optInt(C1294j.f4850O));
        }
        if (jSONObject.isNull(C1294j.f4851P)) {
            c1229av.m2823l(1);
        } else {
            c1229av.m2823l(jSONObject.optInt(C1294j.f4851P));
        }
        if (jSONObject.isNull(C1294j.f4852Q)) {
            c1229av.m2827m(-1);
        } else {
            c1229av.m2827m(jSONObject.optInt(C1294j.f4852Q));
        }
        c1229av.m2813i(jSONObject.isNull(C1294j.f4853R) ? "publisher_defined" : jSONObject.optString(C1294j.f4853R));
        if (jSONObject.isNull(C1294j.f4854S)) {
            c1229av.m2812i(0L);
        } else {
            c1229av.m2812i(jSONObject.optLong(C1294j.f4854S));
        }
        if (jSONObject.isNull(C1294j.f4855T)) {
            c1229av.m2816j(0L);
        } else {
            c1229av.m2816j(jSONObject.optLong(C1294j.f4855T));
        }
        if (jSONObject.isNull(C1294j.f4856U)) {
            c1229av.m2775b(0.0d);
        } else {
            c1229av.m2775b(jSONObject.optDouble(C1294j.f4856U, 0.0d));
        }
        if (jSONObject.isNull(C1294j.f4857V)) {
            c1229av.m2829n(1);
        } else {
            c1229av.m2829n(jSONObject.optInt(C1294j.f4857V));
        }
        if (jSONObject.isNull(C1294j.f4858W)) {
            c1229av.m2831o(1);
        } else {
            c1229av.m2831o(jSONObject.optInt(C1294j.f4858W));
        }
        if (jSONObject.isNull(C1294j.f4859X)) {
            c1229av.m2833p(2);
        } else {
            c1229av.m2833p(jSONObject.optInt(C1294j.f4859X));
        }
        if (jSONObject.isNull(C1294j.f4860Y)) {
            c1229av.m2796f(1);
        } else {
            c1229av.m2796f(jSONObject.optInt(C1294j.f4860Y));
        }
        if (jSONObject.isNull("s2s_sw")) {
            c1229av.m2835q(2);
        } else {
            c1229av.m2835q(jSONObject.optInt("s2s_sw"));
        }
        if (jSONObject.isNull(C1294j.f4861Z)) {
            c1229av.m2839s(2);
        } else {
            c1229av.m2839s(jSONObject.optInt(C1294j.f4861Z));
        }
        if (jSONObject.isNull(C1294j.f4867aa)) {
            c1229av.m2837r(0);
        } else {
            c1229av.m2837r(jSONObject.optInt(C1294j.f4867aa));
        }
        if (jSONObject.isNull(C1294j.f4869ac)) {
            c1229av.m2841t(1);
        } else {
            c1229av.m2841t(jSONObject.optInt(C1294j.f4869ac));
        }
        if (jSONObject.isNull(C1294j.f4872af)) {
            c1229av.m2817j("");
        } else {
            c1229av.m2817j(jSONObject.optString(C1294j.f4872af));
        }
        if (i2 == 7) {
            C1196c.m2305a(C1175n.m2059a().m2148f()).m2303a(c1229av.m2842u(), c1229av.m2728V());
        }
        if (jSONObject.isNull(C1294j.f4870ad)) {
            c1229av.m2843u(2);
        } else {
            c1229av.m2843u(jSONObject.optInt(C1294j.f4870ad));
        }
        if (jSONObject.isNull("ad_type")) {
            c1229av.m2845v(-1);
        } else {
            c1229av.m2845v(jSONObject.optInt("ad_type", -1));
        }
        if (jSONObject.isNull(C1294j.f4873ag)) {
            c1229av.m2847w(-1);
        } else {
            c1229av.m2847w(jSONObject.optInt(C1294j.f4873ag, -1));
        }
        c1229av.m2737a((c1229av.m2826m() == 2 && c1229av.m2784d() == 22) ? ATAdConst.CURRENCY.RMB_CENT : ATAdConst.CURRENCY.USD);
        if (jSONObject.isNull(C1294j.f4874ah)) {
            c1229av.m2851y(0);
        } else {
            c1229av.m2851y(jSONObject.optInt(C1294j.f4874ah, 0));
        }
        if (jSONObject.isNull("bid_floor")) {
            c1229av.m2780c(0.0d);
        } else {
            c1229av.m2780c(jSONObject.optDouble("bid_floor", 0.0d));
        }
        if (jSONObject.isNull(C1294j.f4880an)) {
            c1229av.m2853z(-1);
        } else {
            c1229av.m2853z(jSONObject.optInt(C1294j.f4880an, -1));
        }
        boolean zIsNull = jSONObject.isNull(C1294j.f4881ao);
        double dM2850y = c1229av.m2850y();
        if (!zIsNull) {
            dM2850y = jSONObject.optDouble(C1294j.f4881ao, dM2850y);
        }
        c1229av.m2785d(dM2850y);
        c1229av.m2820k(jSONObject.isNull(C1294j.f4882ap) ? "CNY" : jSONObject.optString(C1294j.f4882ap, "CNY"));
        if (jSONObject.isNull(C1294j.f4883aq)) {
            c1229av.m2699A(2);
        } else {
            c1229av.m2699A(jSONObject.optInt(C1294j.f4883aq, 2));
        }
        if (jSONObject.isNull(C1294j.f4884ar)) {
            c1229av.m2705D(1);
        } else {
            c1229av.m2705D(jSONObject.optInt(C1294j.f4884ar));
        }
        if (jSONObject.isNull(C1294j.f4885as)) {
            c1229av.m2707E(2);
        } else {
            c1229av.m2707E(jSONObject.optInt(C1294j.f4885as, 2));
        }
        c1229av.m2825l(!jSONObject.has(C1294j.f4886at) ? "TopOn" : jSONObject.optString(C1294j.f4886at));
        c1229av.m2824l(jSONObject.optLong(C1294j.f4887au, C3637i.f19800f));
        int[] iArr = null;
        if (!jSONObject.isNull(C1396f.a.f6082ar) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(C1396f.a.f6082ar)) != null && jSONArrayOptJSONArray.length() > 0) {
            try {
                iArr = new int[jSONArrayOptJSONArray.length()];
                for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                    iArr[i4] = jSONArrayOptJSONArray.getInt(i4);
                }
            } catch (Exception unused) {
            }
        }
        c1229av.m2742a(iArr);
        c1229av.m2795f(jSONObject.optDouble(C1294j.f4888av, 0.0d) / 100.0d);
        c1229av.m2800g(jSONObject.optDouble(C1294j.f4889aw, 0.0d) / 100.0d);
        c1229av.m2805h(jSONObject.optDouble(C1294j.f4890ax, 0.0d) / 100.0d);
        c1229av.m2810i(jSONObject.optDouble(C1294j.f4891ay, 0.0d) / 100.0d);
        c1229av.m2709F(jSONObject.optInt(C1294j.f4892az, 1));
        c1229av.m2711G(jSONObject.optInt(C1294j.f4863aA, 1));
        if (!jSONObject.isNull(C1294j.f4864aB)) {
            c1229av.m2741a(jSONObject.optJSONArray(C1294j.f4864aB));
        }
        if (!jSONObject.isNull(C1294j.f4865aC)) {
            c1229av.m2713H(jSONObject.optInt(C1294j.f4865aC));
        }
        if (!jSONObject.isNull("ad_s_reqf_mode")) {
            c1229av.m2715I(jSONObject.optInt("ad_s_reqf_mode"));
        }
        if (c1229av.m2784d() >= 100000 && (aTCustomAdapterConfigM2131b = C1175n.m2059a().m2131b(c1229av.m2809i())) != null) {
            c1229av.m2796f(aTCustomAdapterConfigM2131b.isRealTimeBidSwitch() ? 2 : 1);
            c1229av.m2782c(aTCustomAdapterConfigM2131b.getAdCacheTime());
            if (aTCustomAdapterConfigM2131b.getLossNoticePostion() > 0) {
                c1229av.m2853z(aTCustomAdapterConfigM2131b.getLossNoticePostion());
            }
        }
        return c1229av;
    }

    /* JADX INFO: renamed from: a */
    public static List<C1229av> m5174a(C1396f c1396f) {
        List<C1229av> listM5176a = m5176a(c1396f, c1396f.m5100ar(), 1, 3);
        List<C1229av> listM5176a2 = m5176a(c1396f, c1396f.m5044P(), 3, 4);
        List<C1229av> listM5176a3 = m5176a(c1396f, c1396f.m5101as(), 2, 2);
        List<C1229av> listM5176a4 = m5176a(c1396f, c1396f.m5042N(), 5, 7);
        List<C1229av> listM5176a5 = m5176a(c1396f, c1396f.m5034F(), 6, 11);
        List<C1229av> listM5176a6 = m5176a(c1396f, c1396f.m5059aA(), 7, 8);
        List<C1229av> listM5176a7 = m5176a(c1396f, c1396f.m5060aB(), 3, 5);
        listM5176a.addAll(listM5176a2);
        listM5176a.addAll(listM5176a3);
        listM5176a.addAll(listM5176a4);
        listM5176a.addAll(listM5176a5);
        listM5176a.addAll(listM5176a6);
        listM5176a.addAll(listM5176a7);
        return listM5176a;
    }

    /* JADX INFO: renamed from: a */
    public static List<C1229av> m5175a(C1396f c1396f, String str) {
        return m5176a(c1396f, str, 3, 4);
    }

    /* JADX INFO: renamed from: a */
    private static List<C1229av> m5176a(C1396f c1396f, String str, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                if (jSONObject != null) {
                    C1229av c1229avM5173a = m5173a(i2, i, jSONObject);
                    m5177a(c1396f, c1229avM5173a);
                    arrayList.add(c1229avM5173a);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static void m5177a(C1396f c1396f, C1229av c1229av) {
        if (c1229av.m2752ae() > 0.0d || c1396f == null) {
            return;
        }
        double dM5063aE = c1396f.m5063aE();
        if (dM5063aE > 0.0d) {
            c1229av.m2780c(dM5063aE);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5178a(C1396f c1396f, Map<String, C1229av> map, List<C1229av> list) {
        m5179a(c1396f, map, list, c1396f.m5098ap(), 0, 1);
        m5179a(c1396f, map, list, c1396f.m5099aq(), 0, 6);
        m5179a(c1396f, map, list, c1396f.m5100ar(), 1, 3);
        m5179a(c1396f, map, list, c1396f.m5044P(), 3, 4);
        m5179a(c1396f, map, list, c1396f.m5101as(), 2, 2);
        m5179a(c1396f, map, list, c1396f.m5042N(), 5, 7);
        m5179a(c1396f, map, list, c1396f.m5034F(), 6, 11);
        m5179a(c1396f, map, list, c1396f.m5059aA(), 7, 8);
        m5179a(c1396f, map, list, c1396f.m5060aB(), 3, 5);
        m5179a(c1396f, map, list, c1396f.m5029A(), 8, 10);
        m5179a(c1396f, map, list, c1396f.m5126t(), 2, 9);
    }

    /* JADX INFO: renamed from: a */
    private static void m5179a(C1396f c1396f, Map<String, C1229av> map, List<C1229av> list, String str, int i, int i2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    C1229av c1229avM5173a = m5173a(i2, i, jSONObjectOptJSONObject);
                    map.put(c1229avM5173a.m2842u(), c1229avM5173a);
                    if (c1229avM5173a.m2784d() == 35) {
                        list.add(c1229avM5173a);
                    }
                    m5177a(c1396f, c1229avM5173a);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<C1229av> m5180b(C1396f c1396f) {
        List<C1229av> listM5176a = m5176a(c1396f, c1396f.m5098ap(), 0, 1);
        listM5176a.addAll(m5176a(c1396f, c1396f.m5099aq(), 4, 6));
        Collections.sort(listM5176a);
        return listM5176a;
    }

    /* JADX INFO: renamed from: c */
    public static List<C1229av> m5181c(C1396f c1396f) {
        return m5176a(c1396f, c1396f.m5029A(), 8, 10);
    }

    /* JADX INFO: renamed from: d */
    public static List<C1229av> m5182d(C1396f c1396f) {
        List<C1229av> listM5176a = m5176a(c1396f, c1396f.m5126t(), 2, 9);
        Iterator<C1229av> it = listM5176a.iterator();
        while (it.hasNext()) {
            it.next().m2757aj();
        }
        return listM5176a;
    }
}
