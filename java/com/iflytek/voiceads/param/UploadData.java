package com.iflytek.voiceads.param;

import android.content.Context;
import com.iflytek.voiceads.utils.C2985c;
import com.iflytek.voiceads.utils.C2989g;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class UploadData {
    public static final String API_VERSION = "3.0.2";
    public static final String SDK_VERSION = "4.0.1";
    public static C2966a mAdParam;
    public static Context mContext;
    private static JSONObject mCurDeviceInfo;
    private static JSONObject mCurExtraInfo;

    public static String getAdStatis() {
        try {
            boolean zM13545c = C2985c.m13545c(mContext, "dataToggle");
            if (mContext == null || !zM13545c) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("last_session_id", C2985c.m13544b(mContext, "sessionID"));
            jSONObject.put("last_adunit_id", C2985c.m13544b(mContext, "adUnitID"));
            jSONObject.put("last_req_duration", C2985c.m13539a(mContext, "reqDuration"));
            jSONObject.put("last_imp_duration", C2985c.m13539a(mContext, "impFailCnt"));
            jSONObject.put("last_clk_duration", C2985c.m13539a(mContext, "clkFailCnt"));
            jSONObject.put("req_fail_cnt", C2985c.m13539a(mContext, "reqFailCnt"));
            jSONObject.put("imp_fail_cnt", C2985c.m13539a(mContext, "impFailCnt"));
            jSONObject.put("clk_fail_cnt", C2985c.m13539a(mContext, "clkFailCnt"));
            return jSONObject.toString();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "getAdStatis error " + e.getMessage());
            return "";
        }
    }

    public static String getApiVer() {
        return API_VERSION;
    }

    public static String getAppInfo() {
        return (mAdParam == null || mAdParam.m13445a("app_ver") == null) ? "" : C2967b.m13456a(mAdParam);
    }

    public static String getCurrency() {
        if (mAdParam == null || mAdParam.m13445a("currency") == null) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str : mAdParam.m13449b("currency").split(",")) {
                jSONArray.put(str);
            }
            return jSONArray.toString();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "getCurrency error " + e.getMessage());
            return "CNY";
        }
    }

    public static String getDevice() {
        if (mContext == null) {
            return "";
        }
        try {
            if (mCurDeviceInfo == null) {
                mCurDeviceInfo = C2969d.m13458a(mContext);
            }
            mCurDeviceInfo.put("ts", C2969d.m13457a());
            return mCurDeviceInfo.toString();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "getDevice error " + e.getMessage());
            return "";
        }
    }

    public static String getExt() {
        return (mAdParam == null || mAdParam.m13445a("ext") == null) ? "" : mAdParam.m13445a("ext").toString();
    }

    public static String getExtraInfo() {
        if (mContext == null) {
            return "";
        }
        try {
            if (mCurExtraInfo == null) {
                mCurExtraInfo = C2970e.m13482a(mContext);
            }
            mCurExtraInfo.put("battery", C2970e.m13483b(mContext));
            return mCurExtraInfo.toString().replaceAll("\"", "\\\\\"");
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "getDevice error " + e.getMessage());
            return "";
        }
    }

    public static String getImps() {
        return mAdParam == null ? "" : C2972g.m13510a(mAdParam);
    }

    public static String getRequestID() {
        return mAdParam == null ? "" : mAdParam.m13449b("request_id");
    }

    public static String getSdkVer() {
        return SDK_VERSION;
    }

    public static void initParam(Context context, C2966a c2966a) {
        mContext = context;
        mAdParam = c2966a;
    }
}
