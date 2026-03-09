package com.umeng.commonsdk.framework;

import android.content.Context;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class UMEnvelopeBuild {
    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        return C3403a.m15642a(context, jSONObject, jSONObject2);
    }

    public static String imprintProperty(Context context, String str, String str2) {
        return C3403a.m15641a(context, str, str2);
    }

    public static boolean isReadyBuild(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        return C3403a.m15643a(context, uMBusinessType);
    }

    public static long lastSuccessfulBuildTime(Context context) {
        return C3403a.m15640a(context);
    }

    public static long maxDataSpace(Context context) {
        return C3403a.m15644b(context);
    }
}
