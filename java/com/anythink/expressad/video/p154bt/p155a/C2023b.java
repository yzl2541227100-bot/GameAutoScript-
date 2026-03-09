package com.anythink.expressad.video.p154bt.p155a;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p116d.C1796r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.video.bt.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2023b {

    /* JADX INFO: renamed from: c */
    private static final String f12847c = "HandlerH5MessageManager";

    /* JADX INFO: renamed from: a */
    public int f12848a;

    /* JADX INFO: renamed from: b */
    public int f12849b;

    /* JADX INFO: renamed from: d */
    private String f12850d;

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.a.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private static C2023b f12851a = new C2023b(0);

        private a() {
        }
    }

    private C2023b() {
        this.f12850d = "handlerNativeResult";
        this.f12848a = 0;
        this.f12849b = 1;
    }

    public /* synthetic */ C2023b(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C2023b m10819a() {
        return a.f12851a;
    }

    /* JADX INFO: renamed from: a */
    private static void m10820a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            e.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10821a(Object obj, JSONObject jSONObject) {
        int i;
        String message;
        try {
            if (TextUtils.isEmpty(jSONObject.toString())) {
                m10820a(this.f12849b, "params is null", obj);
                return;
            }
            String strOptString = jSONObject.optString("uniqueIdentifier");
            String strOptString2 = jSONObject.optString("name");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C1796r.f10844ah);
                if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.toString())) {
                    jSONObjectOptJSONObject.optInt("type", 0);
                }
                m10820a(this.f12848a, "receivedMessage", obj);
                if (strOptString.equalsIgnoreCase("reporter") || !strOptString.equalsIgnoreCase("MediaPlayer")) {
                    return;
                }
                C2022a.m10813a().m10817a(obj, strOptString2, jSONArrayOptJSONArray);
                return;
            }
            m10820a(this.f12849b, "module or method is null", obj);
        } catch (Exception e) {
            e.getMessage();
            i = this.f12849b;
            message = e.getMessage();
            m10820a(i, message, obj);
        } catch (Throwable th) {
            th.getMessage();
            i = this.f12849b;
            message = th.getMessage();
            m10820a(i, message, obj);
        }
    }
}
