package com.anythink.core.common.p062k;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1233az;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p057g.InterfaceC1265c;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.k.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1304d implements InterfaceC1265c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m3758b(String str, String str2, long j, long j2, C1243h c1243h, ATBaseAdAdapter aTBaseAdAdapter, Object obj) {
        Map<String, Object> networkInfoMap;
        try {
            networkInfoMap = aTBaseAdAdapter.getNetworkInfoMap();
        } catch (Throwable unused) {
        }
        String string = networkInfoMap != null ? new JSONObject(networkInfoMap).toString() : "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pl_id", str);
            jSONObject.put("req_id", c1243h.m2678ai());
            jSONObject.put("show_id", c1243h.m3129t());
            jSONObject.put("unit_id", c1243h.m3026F());
            jSONObject.put("nw_firm_id", c1243h.m3039P());
            jSONObject.put("scenario_id", c1243h.f4134B);
            jSONObject.put("rv_start_ts", j);
            jSONObject.put("r_callback_ts", j2);
            jSONObject.put("rv_play_dur", j2 - j);
            jSONObject.put(C1233az.f4044m, c1243h.m3109m());
            jSONObject.put("extra_info", string);
            jSONObject.put("user_id", aTBaseAdAdapter.getUserId());
            jSONObject.put("extra_data", aTBaseAdAdapter.getUserCustomData());
            jSONObject.put("curr_ts", System.currentTimeMillis());
            jSONObject.put("api_c", obj);
            jSONObject.put(C1396f.a.f6110i, C1171j.m2049a(c1243h, aTBaseAdAdapter).toString());
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(C1396f.a.f6078an, str2);
            }
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    @Override // com.anythink.core.common.p057g.InterfaceC1265c
    /* JADX INFO: renamed from: a */
    public final void mo3612a(final long j, final long j2, final ATBaseAdAdapter aTBaseAdAdapter, final C1243h c1243h) {
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.common.k.d.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    final String strM2677ah = c1243h.m2677ah();
                    String strM3078e = c1243h.m3078e();
                    String str = "";
                    if (TextUtils.isEmpty(strM3078e) || TextUtils.equals(strM2677ah, strM3078e)) {
                        strM3078e = strM2677ah;
                    } else {
                        str = strM2677ah;
                    }
                    C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(strM3078e);
                    if (c1396fM5139a.m5119m() != 1) {
                        return;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = j2;
                    long j4 = (j3 == 0 || jElapsedRealtime < j3) ? jElapsedRealtime : j3;
                    JSONObject jSONObject = new JSONObject(C1301a.m3749a(c1396fM5139a.m5036H()));
                    int iOptInt = jSONObject.optInt("a");
                    String strOptString = jSONObject.optString("b");
                    Object objOpt = jSONObject.opt("api_c");
                    if (objOpt == null) {
                        objOpt = new JSONObject();
                    }
                    C1302b c1302bM3747a = C1301a.m3747a(strOptString, C1304d.m3758b(strM3078e, str, j, j4, c1243h, aTBaseAdAdapter, objOpt));
                    if (TextUtils.isEmpty(c1302bM3747a.m3752a())) {
                        C1322e.m3908a(strM3078e, str, c1243h, c1396fM5139a, "", c1302bM3747a.m3754b());
                    } else {
                        new C1303c(C1175n.m2059a().m2148f(), iOptInt, c1302bM3747a.m3752a(), c1243h, c1396fM5139a, strM3078e, str).mo3639a(0, new InterfaceC1283k() { // from class: com.anythink.core.common.k.d.1.1
                            @Override // com.anythink.core.common.p058h.InterfaceC1283k
                            public final void onLoadCanceled(int i) {
                            }

                            @Override // com.anythink.core.common.p058h.InterfaceC1283k
                            public final void onLoadError(int i, String str2, AdError adError) {
                                Log.e("anythink_s2s_reward", "S2S reward error! PlacementId: " + strM2677ah + ", " + adError.printStackTrace());
                            }

                            @Override // com.anythink.core.common.p058h.InterfaceC1283k
                            public final void onLoadFinish(int i, Object obj) {
                                if (C1175n.m2059a().m2095A()) {
                                    Log.i("anythink_s2s_reward", "S2S reward succeeded. PlacementId: " + strM2677ah);
                                }
                            }

                            @Override // com.anythink.core.common.p058h.InterfaceC1283k
                            public final void onLoadStart(int i) {
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
            }
        }, 2, true);
    }
}
