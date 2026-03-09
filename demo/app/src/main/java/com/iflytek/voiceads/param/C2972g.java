package com.iflytek.voiceads.param;

import com.anythink.core.api.ATAdConst;
import com.iflytek.voiceads.bean.AdDeal;
import com.iflytek.voiceads.bean.AdDebug;
import com.iflytek.voiceads.utils.C2989g;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iflytek.voiceads.param.g */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2972g {

    /* JADX INFO: renamed from: a */
    public static int[] f16420a = {1, 2};

    /* JADX INFO: renamed from: a */
    public static String m13510a(C2966a c2966a) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adunit_id", c2966a.m13445a("adunit_id"));
            JSONArray jSONArray2 = new JSONArray();
            for (int i : f16420a) {
                jSONArray2.put(i);
            }
            jSONObject.put("dp_support_status", jSONArray2);
            jSONObject.put("voice_ad_support_status", 1);
            jSONObject.put("secure", 3);
            if (c2966a.m13445a("debug") != null) {
                AdDebug adDebug = (AdDebug) c2966a.m13445a("debug");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action_type", adDebug.action_type);
                jSONObject2.put("landing_type", adDebug.landing_type);
                jSONObject.put("debug", jSONObject2);
            }
            if (c2966a.m13445a("bid_floor") != null) {
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BIDDING_FLOOR, c2966a.m13454e("bid_floor"));
            }
            Object objM13445a = c2966a.m13445a("pmp");
            if (objM13445a != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (AdDeal adDeal : (List) objM13445a) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", adDeal.id);
                    jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BIDDING_FLOOR, adDeal.bidFloor);
                    jSONArray3.put(jSONObject3);
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("deals", jSONArray3);
                jSONObject.put("pmp", jSONObject4);
            }
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "getImpsInfo:" + e.getMessage());
            return "";
        }
    }
}
