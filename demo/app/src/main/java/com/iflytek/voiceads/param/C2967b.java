package com.iflytek.voiceads.param;

import com.iflytek.voiceads.utils.C2989g;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iflytek.voiceads.param.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2967b {
    /* JADX INFO: renamed from: a */
    public static String m13456a(C2966a c2966a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_ver", c2966a.m13445a("app_ver"));
            return jSONObject.toString();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "getAppInfo:" + e.getMessage());
            return "";
        }
    }
}
