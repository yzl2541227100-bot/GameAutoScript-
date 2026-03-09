package com.umeng.commonsdk.amap;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.stateless.C3476a;
import com.umeng.commonsdk.stateless.C3481f;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.C3489e;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.amap.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3402b extends Thread {

    /* JADX INFO: renamed from: e */
    private static final String f18599e = "info";

    /* JADX INFO: renamed from: f */
    private static final String f18600f = "ts";

    /* JADX INFO: renamed from: g */
    private static final String f18601g = "amap_lbs";

    /* JADX INFO: renamed from: h */
    private static final String f18602h = "tp";

    /* JADX INFO: renamed from: a */
    private Context f18603a;

    /* JADX INFO: renamed from: b */
    private int f18604b;

    /* JADX INFO: renamed from: c */
    private long f18605c;

    /* JADX INFO: renamed from: d */
    private Vector<JSONObject> f18606d;

    /* JADX INFO: renamed from: i */
    private int f18607i = 1;

    /* JADX INFO: renamed from: j */
    private int f18608j = 1;

    public C3402b(Context context, int i, long j) {
        this.f18604b = 0;
        C3489e.m16329a("AmapLBS", "new UMAmapTimer");
        if (context != null) {
            this.f18603a = context.getApplicationContext();
            this.f18604b = i;
            this.f18605c = j;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            if (this.f18603a == null) {
                return;
            }
            while (true) {
                int i = this.f18604b;
                if (i == 1) {
                    if (C3489e.f19173a) {
                        C3489e.m16329a("AmapLBS", "[lbs-build] timer begin : index is " + this.f18607i);
                        this.f18607i = this.f18607i + 1;
                    }
                    byte[] bArrM15638b = new C3401a(this.f18603a).m15638b();
                    if (bArrM15638b != null) {
                        String strTrim = Base64.encodeToString(bArrM15638b, 0).trim();
                        if (TextUtils.isEmpty(strTrim)) {
                            C3489e.m16329a("AmapLBS", "[lbs-build] amap result is empty");
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(f18599e, strTrim);
                                jSONObject.put("ts", System.currentTimeMillis());
                            } catch (Exception unused) {
                            }
                            if (this.f18606d == null) {
                                this.f18606d = new Vector<>();
                            }
                            this.f18606d.add(jSONObject);
                            if (this.f18606d.size() == 30) {
                                C3489e.m16329a("AmapLBS", "[lbs-build] begin build envelope , cache size is " + this.f18606d.size());
                                JSONArray jSONArray = new JSONArray();
                                for (JSONObject jSONObject2 : this.f18606d) {
                                    if (jSONObject2 != null) {
                                        try {
                                            jSONArray.put(jSONObject2);
                                        } catch (Exception unused2) {
                                        }
                                    }
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3.put(f18601g, jSONArray);
                                } catch (Exception unused3) {
                                }
                                JSONObject jSONObject4 = new JSONObject();
                                try {
                                    jSONObject4.put(f18602h, jSONObject3);
                                } catch (Exception unused4) {
                                }
                                Vector<JSONObject> vector = this.f18606d;
                                if (vector != null) {
                                    vector.clear();
                                    this.f18606d = null;
                                }
                                C3481f.m16242a(this.f18603a, this.f18603a.getFilesDir() + "/" + C3476a.f19055c + "/" + Base64.encodeToString(UMAmapConfig.AMAP_CACHE_PATH.getBytes(), 0), 50);
                                StringBuilder sb = new StringBuilder();
                                sb.append("[lbs-build] begin build envelope is ");
                                sb.append(jSONObject4.toString());
                                C3489e.m16329a("AmapLBS", sb.toString());
                                UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                                uMSLEnvelopeBuild.buildSLEnvelope(this.f18603a, uMSLEnvelopeBuild.buildSLBaseHeader(this.f18603a), jSONObject4, UMAmapConfig.AMAP_CACHE_PATH);
                            }
                        }
                    } else {
                        C3489e.m16329a("AmapLBS", "[lbs-build] amap result is null");
                    }
                } else if (i != 2) {
                    return;
                }
                try {
                    Thread.sleep(this.f18605c);
                } catch (Exception e) {
                    C3454e.m15904a(this.f18603a, e);
                }
            }
        } catch (Exception e2) {
            C3454e.m15904a(this.f18603a, e2);
        }
    }
}
