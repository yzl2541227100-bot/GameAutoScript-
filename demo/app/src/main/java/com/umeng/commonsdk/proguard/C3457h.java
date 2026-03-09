package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Looper;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.common.C3489e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3457h {

    /* JADX INFO: renamed from: a */
    public static final String f18814a = "umeng_common_config";

    /* JADX INFO: renamed from: b */
    public static final String f18815b = "location_json";

    /* JADX INFO: renamed from: c */
    public static final String f18816c = "lng";

    /* JADX INFO: renamed from: d */
    public static final String f18817d = "lat";

    /* JADX INFO: renamed from: e */
    public static final String f18818e = "ts";

    /* JADX INFO: renamed from: f */
    private static final String f18819f = "UMSysLocationCache";

    /* JADX INFO: renamed from: a */
    public static void m15914a(final Context context) {
        C3489e.m16329a(f18819f, "begin location");
        if (context == null) {
            return;
        }
        try {
            new Thread(new Runnable() { // from class: com.umeng.commonsdk.proguard.h.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Looper.prepare();
                        final C3456g c3456g = new C3456g(context);
                        c3456g.m15913a(new AbstractC3458i() { // from class: com.umeng.commonsdk.proguard.h.1.1
                            @Override // com.umeng.commonsdk.proguard.AbstractC3458i
                            /* JADX INFO: renamed from: a */
                            public void mo15916a(Location location) {
                                if (location != null) {
                                    double longitude = location.getLongitude();
                                    double latitude = location.getLatitude();
                                    C3489e.m16329a(C3457h.f18819f, "lon is " + longitude + ", lat is " + latitude);
                                    if (longitude != 0.0d && latitude != 0.0d) {
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("lng", longitude);
                                            jSONObject.put("lat", latitude);
                                            jSONObject.put("ts", jCurrentTimeMillis);
                                        } catch (JSONException e) {
                                            C3489e.m16329a(C3457h.f18819f, "e is " + e);
                                        }
                                        C3489e.m16329a(C3457h.f18819f, "locationJSONObject is " + jSONObject.toString());
                                        Context context2 = context;
                                        UMWorkDispatch.sendEvent(context2, C3408a.f18658f, C3435b.m15851a(context2).m15852a(), jSONObject.toString());
                                    }
                                }
                                c3456g.m15912a();
                            }
                        });
                        Looper.loop();
                    } catch (Throwable th) {
                        C3454e.m15904a(context, th);
                    }
                }
            }).start();
        } catch (Exception e) {
            C3489e.m16329a(f18819f, "e is " + e);
            C3454e.m15904a(context, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m15915b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f18814a, 0);
        JSONObject jSONObject = null;
        if (sharedPreferences == null) {
            return null;
        }
        try {
            String string = sharedPreferences.getString(f18815b, "");
            if (!TextUtils.isEmpty(string)) {
                jSONObject = new JSONObject(string);
            }
        } catch (JSONException e) {
            e = e;
            C3489e.m16329a(f18819f, "e is " + e);
            C3454e.m15904a(context, e);
        } catch (Throwable th) {
            e = th;
            C3489e.m16329a(f18819f, "e is " + e);
            C3454e.m15904a(context, e);
        }
        if (jSONObject != null) {
            C3489e.m16329a(f18819f, "json str is " + jSONObject.toString());
        }
        m15914a(context);
        return jSONObject;
    }
}
