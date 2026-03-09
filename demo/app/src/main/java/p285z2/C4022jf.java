package p285z2;

import android.content.Context;
import android.os.SystemClock;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.client.HttpRequest;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.jf */
/* JADX INFO: loaded from: classes2.dex */
public final class C4022jf {
    private static final String OooO00o = "http://logapi4.mobileanjian.com/api/SetLog";
    private static final int OooO0O0 = 4;
    private static final String OooO0OO = "RunScriptDurationApi";
    private static String OooO0Oo;

    private static String OooO00o(Context context, long... jArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("AppID", C4207oe.OooO());
            jSONObject2.put("MachineCode", C4429uf.OooO0O0(context));
            jSONObject2.put("AppVersion", C4207oe.OooO0o0());
            jSONObject2.put("IsFree", C4207oe.OooO0Oo() ? "1" : "0");
            jSONObject2.put("UsedTime", String.valueOf((SystemClock.uptimeMillis() - jArr[0]) / 1000));
            jSONObject.put("LogType", "4");
            jSONObject.put("Data", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private static void OooO0O0(Context context, long j) {
        OooO0Oo = OooO00o;
        new StringBuilder("log uri: ").append(OooO0Oo);
        HttpUtils httpUtils = new HttpUtils();
        RequestParams requestParams = new RequestParams();
        requestParams.addQueryStringParameter("Data", OooO00o(context, j));
        httpUtils.send(HttpRequest.HttpMethod.GET, OooO0Oo, requestParams, null);
    }
}
