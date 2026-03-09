package com.anythink.expressad.video.p154bt.p155a;

import android.util.Base64;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.video.p154bt.module.AnythinkBTVideoView;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.video.bt.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C2022a {

    /* JADX INFO: renamed from: c */
    private static final String f12841c = "a";

    /* JADX INFO: renamed from: e */
    private static LinkedHashMap<String, AnythinkBTVideoView> f12842e = new LinkedHashMap<>();

    /* JADX INFO: renamed from: d */
    private String f12845d = "handlerNativeResult";

    /* JADX INFO: renamed from: a */
    public int f12843a = 0;

    /* JADX INFO: renamed from: b */
    public int f12844b = 1;

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.a.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private static C2022a f12846a = new C2022a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2022a m10813a() {
        return a.f12846a;
    }

    /* JADX INFO: renamed from: a */
    private static void m10814a(int i, String str, Object obj) {
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
    public static void m10815a(String str) {
        f12842e.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m10816a(String str, AnythinkBTVideoView anythinkBTVideoView) {
        f12842e.put(str, anythinkBTVideoView);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10817a(java.lang.Object r12, java.lang.String r13, org.json.JSONArray r14) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.p154bt.p155a.C2022a.m10817a(java.lang.Object, java.lang.String, org.json.JSONArray):void");
    }
}
