package mobi.oneway.export.p283g;

import android.os.Build;
import mobi.oneway.export.C3580a;
import mobi.oneway.export.p274a.C3582b;
import org.json.JSONObject;
import p285z2.C3902g6;

/* JADX INFO: renamed from: mobi.oneway.export.g.o */
/* JADX INFO: loaded from: classes2.dex */
public class C3643o {
    /* JADX INFO: renamed from: a */
    public static JSONObject m17000a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("publishId", C3582b.m16654b());
            jSONObject.put("bundleId", C3634f.m16932b());
            jSONObject.put("bundleVersion", C3634f.m16933c());
            jSONObject.put("sdkVersion", C3580a.f19599f);
            jSONObject.put("platform", C3902g6.OooO0O0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m17001b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apiLevel", Build.VERSION.SDK_INT);
            jSONObject.put("imei", C3634f.m16929a());
            jSONObject.put("androidId", C3634f.m16935e());
            jSONObject.put("deviceMake", Build.BRAND);
            jSONObject.put("deviceModel", Build.MODEL);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
