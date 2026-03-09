package com.anythink.expressad.splash.p153js;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.p050a.C1159k;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p138h.C1885s;
import com.anythink.expressad.videocommon.p178b.C2316a;
import com.anythink.expressad.videocommon.p178b.C2324i;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SplashJsUtils {

    /* JADX INFO: renamed from: a */
    public static final String f12695a = "onSystemPause";

    /* JADX INFO: renamed from: b */
    public static final String f12696b = "onSystemResume";

    /* JADX INFO: renamed from: c */
    public static final String f12697c = "onSystemDestory";

    /* JADX INFO: renamed from: d */
    private static String f12698d = "SplashJsUtils";

    /* JADX INFO: renamed from: e */
    private static int f12699e = 0;

    /* JADX INFO: renamed from: f */
    private static int f12700f = 1;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10734a(String str, C1781c c1781c) {
        if (C1807f.f11191o == null || TextUtils.isEmpty(c1781c.m10146aZ())) {
            return;
        }
        C1807f.m9397a(str, c1781c, C1807f.f11182f);
    }

    /* JADX INFO: renamed from: b */
    private static void m10735b(String str, C1781c c1781c) {
        if (C1807f.f11191o == null || TextUtils.isEmpty(c1781c.m10146aZ())) {
            return;
        }
        C1807f.m9397a(str, c1781c, C1807f.f11182f);
    }

    public static void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f12700f);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void callbackSuccess(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f12699e);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            callbackExcep(obj, e.getMessage());
            e.getMessage();
        }
    }

    public static String codeToJsonString(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void fireOnJSBridgeConnected(WebView webView) {
        C1469j.m5701a();
        C1469j.m5704b(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static void getFileInfo(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        File file;
        JSONObject jSONObject2 = new JSONObject();
        String str5 = "message";
        String str6 = "code";
        int i = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "params is null");
                C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e) {
                e.getMessage();
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    String strOptString = jSONObject3.optString("ref", "");
                    int i3 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i3 != i || TextUtils.isEmpty(strOptString)) {
                        str3 = str5;
                        str4 = str6;
                        if (i3 == 2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put("path", C2324i.m11867a().m11883c(strOptString) == null ? "" : C2324i.m11867a().m11883c(strOptString));
                            jSONObject4.put(strOptString, jSONObject5);
                        } else if (i3 == 3 && !TextUtils.isEmpty(strOptString)) {
                            try {
                                file = new File(strOptString);
                            } catch (Throwable th) {
                                if (C1404a.f6209a) {
                                    th.printStackTrace();
                                }
                            }
                            String strConcat = (file.exists() && file.isFile() && file.canRead()) ? "file:////".concat(String.valueOf(strOptString)) : "";
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 3);
                            jSONObject6.put("path", strConcat);
                            jSONObject4.put(strOptString, jSONObject6);
                        } else if (i3 == 4 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 4);
                            jSONObject7.put("path", C1885s.m9804a(strOptString) == null ? "" : C1885s.m9804a(strOptString));
                            jSONObject4.put(strOptString, jSONObject7);
                        }
                        jSONArray2.put(jSONObject4);
                    } else {
                        JSONObject jSONObject8 = new JSONObject();
                        C2316a.m11773a();
                        C1159k c1159kM11775b = C2316a.m11775b(strOptString);
                        if (c1159kM11775b != null) {
                            jSONObject8.put("type", i);
                            str3 = str5;
                            str4 = str6;
                            try {
                                jSONObject8.put("videoDataLength", c1159kM11775b.m1993d());
                                String strM1988b = c1159kM11775b.m1988b();
                                if (TextUtils.isEmpty(strM1988b)) {
                                    jSONObject8.put("path", "");
                                    jSONObject8.put("path4Web", "");
                                } else {
                                    jSONObject8.put("path", strM1988b);
                                    jSONObject8.put("path4Web", strM1988b);
                                }
                                if (c1159kM11775b.m1991c() == 100) {
                                    jSONObject8.put("downloaded", 1);
                                } else {
                                    jSONObject8.put("downloaded", 0);
                                }
                                jSONObject4.put(strOptString, jSONObject8);
                                jSONArray2.put(jSONObject4);
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = str4;
                            }
                        } else {
                            str3 = str5;
                            str4 = str6;
                        }
                    }
                    i2++;
                    str6 = str4;
                    str5 = str3;
                    i = 1;
                }
                str3 = str5;
                str4 = str6;
                jSONObject2.put("resource", jSONArray2);
                C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            str3 = "message";
            str2 = "code";
            str = 1;
            try {
                try {
                    jSONObject2.put(str2, 1);
                } catch (JSONException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                    str = str3;
                }
                try {
                    jSONObject2.put(str3, "resource is null");
                    C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e3) {
                    e = e3;
                    e.getMessage();
                    return;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            str = str3;
        } catch (Throwable th5) {
            th = th5;
            str = str5;
            str2 = str6;
        }
        try {
            jSONObject2.put(str2, 1);
            jSONObject2.put(str, th.getLocalizedMessage());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e4) {
            e4.getMessage();
        }
    }

    public static void increaseOfferFrequence(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                callbackExcep(obj, "data is empty");
                return;
            }
            C1781c c1781cM8703b = C1781c.m8703b(jSONObjectOptJSONObject);
            if (c1781cM8703b == null) {
                callbackExcep(obj, "data camapign is empty");
            } else {
                updateFrequence(c1781cM8703b);
                callbackSuccess(obj, "");
            }
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }

    public static void sendEventToH5(WebView webView, String str, String str2) {
        C1469j.m5701a();
        C1469j.m5703a(webView, str, str2);
    }

    public static void updateFrequence(final C1781c c1781c) {
        new Thread(new Runnable() { // from class: com.anythink.expressad.splash.js.SplashJsUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SplashJsUtils.m10734a(c1781c.m8803K(), c1781c);
                } catch (Throwable th) {
                    String unused = SplashJsUtils.f12698d;
                    th.getMessage();
                }
            }
        }).start();
    }
}
