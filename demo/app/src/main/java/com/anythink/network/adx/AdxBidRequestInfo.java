package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.common.p050a.C1152d;
import com.anythink.core.common.p050a.C1154f;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdxBidRequestInfo extends ATBidRequestInfo {

    /* JADX INFO: renamed from: a */
    public JSONObject f14862a;

    public AdxBidRequestInfo(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        this.f14862a = jSONObject;
        try {
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SUPPORT_TEMPLATE_VERSION, 1);
            C1396f c1396fM5146b = C1398h.m5135a(context).m5146b(str);
            if (c1396fM5146b != null) {
                int iM5065aG = c1396fM5146b.m5065aG();
                if (iM5065aG > 0) {
                    List<C1154f> listM1957a = C1152d.m1954a().m1957a(iM5065aG);
                    if (listM1957a.size() > 0) {
                        this.f14862a.put(C1396f.a.f6027P, m12276a(listM1957a));
                    }
                }
                int iM5064aF = c1396fM5146b.m5064aF();
                if (iM5064aF > 0) {
                    List<C1154f> listM1959b = C1152d.m1954a().m1959b(iM5064aF);
                    if (listM1959b.size() > 0) {
                        this.f14862a.put(C1396f.a.f6026O, m12276a(listM1959b));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m12276a(List<C1154f> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap map = new HashMap();
            for (C1154f c1154f : list) {
                List arrayList = (List) map.get(c1154f.m1965a());
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(c1154f.m1965a(), arrayList);
                }
                arrayList.add(c1154f.m1967b());
            }
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public void fillAdAcceptType() {
        try {
            JSONObject jSONObject = this.f14862a;
            if (jSONObject != null) {
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADP_ACCEPT_TYPE, new JSONArray(ATAdConst.AD_SUPPORT_TYPE_ARRAY));
            }
        } catch (Throwable unused) {
        }
    }

    public void fillBannerData(Map<String, Object> map) {
        try {
            String string = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE).toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split("x");
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            this.f14862a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, i);
            this.f14862a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, i2);
            this.f14862a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ADP_ACCEPT_TYPE, new JSONArray(ATAdConst.AD_SUPPORT_TYPE_ARRAY));
        } catch (Throwable unused) {
        }
    }

    public void fillInterstitial(Map<String, Object> map) {
        try {
            if (map.containsKey("unit_type")) {
                String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_type");
                if (!TextUtils.isEmpty(stringFromMap)) {
                    this.f14862a.put("unit_type", Integer.parseInt(stringFromMap));
                }
                fillAdAcceptType();
            }
        } catch (Throwable unused) {
        }
    }

    public void fillSplashData() {
        try {
            this.f14862a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
            fillAdAcceptType();
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.f14862a;
    }
}
