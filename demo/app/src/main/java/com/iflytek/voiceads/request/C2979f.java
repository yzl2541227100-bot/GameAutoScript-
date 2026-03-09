package com.iflytek.voiceads.request;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.param.C2966a;
import com.iflytek.voiceads.param.C2968c;
import com.iflytek.voiceads.param.UploadData;
import com.iflytek.voiceads.request.C2974a;
import com.iflytek.voiceads.utils.C2985c;
import com.iflytek.voiceads.utils.C2988f;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2993k;
import com.iflytek.voiceads.utils.Encoder;

/* JADX INFO: renamed from: com.iflytek.voiceads.request.f */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2979f {
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.iflytek.voiceads.config.AdError */
    /* JADX INFO: renamed from: a */
    public static void m13529a(Context context, C2966a c2966a, C2974a.a aVar) throws Exception {
        if (c2966a.m13452c("debug_mode")) {
            C2989g.m13556a(true);
            C2988f.m13551a(context);
        }
        if (!C2993k.m13573a(context)) {
            throw new AdError(71003);
        }
        C2989g.m13555a("IFLY_AD_SDK", "requestAd:" + c2966a.m13451c());
        if (TextUtils.isEmpty(c2966a.m13451c())) {
            throw new AdError(71005);
        }
        try {
            UploadData.initParam(context, c2966a);
            byte[] bArrPackageData = Encoder.packageData();
            C2974a c2974a = new C2974a();
            c2974a.m13522a(context);
            c2974a.m13521a(0);
            c2974a.m13526b(1);
            c2974a.m13527c(c2966a.m13453d("http_request_timeout"));
            c2974a.m13524a(C2968c.f16414a, null, bArrPackageData);
            c2974a.m13523a(aVar);
            C2985c.m13542a(context, "adUnitID", c2966a.m13451c());
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "requestAd:" + e.getMessage());
        }
    }
}
