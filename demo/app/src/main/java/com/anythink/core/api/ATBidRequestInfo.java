package com.anythink.core.api;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.p072d.C1396f;
import org.json.JSONObject;
import p285z2.InterfaceC4047k3;

/* JADX INFO: loaded from: classes.dex */
public abstract class ATBidRequestInfo {
    public static final String BIDDING_REQUEST_TIMEOUT_TYPE = "Request Timeout.";
    public static final String BIDTOKEN_EMPTY_ERROR_TYPE = "Network BidToken or Custom bid info is Empty.";
    public static final String BIDTOKEN_OBTAIN_TIMEOUT_TYPE = "Request Token or Custom bid info Timeout.";
    public static final String BID_TYPE_ERROR_TYPE = "cpc bid type";
    public static final String INIT_ERROR_TYPE = "Network init error.";
    public static final String LESS_THAN_BID_FLOOR_TYPE = "less than bid floor";
    public static final String NO_ADAPTER_ERROR_TYPE = "There is no Network Adapter.";
    public static final String NO_SUPPORT_BIDDING_TYPE = "This network don't support header bidding in current TopOn's version.";
    public static final String RETURN_PARAMS_ERROR_TYPE = "The parameter is abnormal.";

    public static void fillBaseCommonParams(JSONObject jSONObject, String str, C1396f c1396f, C1229av c1229av) {
        if (jSONObject != null) {
            try {
                if (c1229av.m2730X() != -1) {
                    str = String.valueOf(c1229av.m2730X());
                }
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, str);
                jSONObject.put("ad_source_id", c1229av.m2842u());
                jSONObject.put("nw_firm_id", c1229av.m2784d());
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BIDDING_FLOOR, c1229av.m2752ae());
                if (C1175n.m2059a().m2174u()) {
                    jSONObject.put(InterfaceC4047k3.o0000Ooo, 1);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public abstract JSONObject toRequestJSONObject();
}
