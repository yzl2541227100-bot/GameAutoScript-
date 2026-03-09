package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.stateless.C3476a;
import com.umeng.commonsdk.stateless.C3481f;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3454e {
    /* JADX INFO: renamed from: a */
    public static void m15904a(final Context context, final Throwable th) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.proguard.e.1
            @Override // java.lang.Runnable
            public void run() {
                Throwable th2;
                try {
                    synchronized (this) {
                        if (context != null && (th2 = th) != null) {
                            String strM15905a = C3455f.m15905a(th2);
                            if (!TextUtils.isEmpty(strM15905a)) {
                                C3481f.m16242a(context, context.getFilesDir() + "/" + C3476a.f19055c + "/" + Base64.encodeToString(C3408a.f18654b.getBytes(), 0), 50);
                                UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                                JSONObject jSONObjectBuildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(context);
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("content", strM15905a);
                                    jSONObject.put("ts", System.currentTimeMillis());
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("crash", jSONObject);
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("tp", jSONObject2);
                                    JSONObject jSONObjectBuildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(context, jSONObjectBuildSLBaseHeader, jSONObject3, C3408a.f18653a);
                                    if (jSONObjectBuildSLEnvelope != null) {
                                        jSONObjectBuildSLEnvelope.has("exception");
                                    }
                                } catch (JSONException unused) {
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        }).start();
    }
}
