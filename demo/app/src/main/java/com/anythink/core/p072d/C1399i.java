package com.anythink.core.p072d;

import android.content.Context;
import android.util.Log;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p055f.C1220am;
import com.anythink.core.common.p058h.C1284l;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.p072d.C1396f;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.d.i */
/* JADX INFO: loaded from: classes.dex */
public class C1399i {

    /* JADX INFO: renamed from: a */
    private static final String f6161a = "i";

    /* JADX INFO: renamed from: b */
    private final C1398h f6162b;

    public C1399i(C1398h c1398h) {
        this.f6162b = c1398h;
    }

    /* JADX INFO: renamed from: a */
    public static void m5157a(Context context, C1220am c1220am, InterfaceC1283k interfaceC1283k) {
        new StringBuilder("startRequest() >>> ").append(c1220am);
        new C1284l(context, c1220am).mo3639a(0, interfaceC1283k);
    }

    /* JADX INFO: renamed from: a */
    public final void m5158a(Context context, final C1220am c1220am) {
        if (c1220am == null) {
            return;
        }
        m5157a(context, c1220am, new InterfaceC1283k() { // from class: com.anythink.core.d.i.1
            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadCanceled(int i) {
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadError(int i, String str, AdError adError) {
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadFinish(int i, Object obj) {
                C1396f c1396fM5140a;
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    try {
                        jSONObject.put(C1396f.a.f6067ac, System.currentTimeMillis());
                        int iOptInt = jSONObject.optInt(C1396f.a.f6086av, 0);
                        if (C1399i.this.f6162b != null && (c1396fM5140a = C1399i.this.f6162b.m5140a(c1220am.m2594c(), iOptInt)) != null) {
                            c1396fM5140a.m4872a(jSONObject, c1220am.m2594c());
                        }
                    } catch (Throwable th) {
                        Log.e(C1399i.f6161a, "parse place strategy error:" + th.getMessage());
                    }
                    C1396f c1396fM4919a = C1396f.m4919a(c1220am.m2594c(), jSONObject);
                    if (C1399i.this.f6162b == null || c1396fM4919a == null) {
                        return;
                    }
                    String unused = C1399i.f6161a;
                    StringBuilder sb = new StringBuilder("onLoadFinish() >>> placeId: ");
                    sb.append(c1220am.m2594c());
                    sb.append(" fistReqPlaceStrategyFlag: ");
                    sb.append(c1220am.m2598g());
                    sb.append(" strategyType: ");
                    sb.append(c1396fM4919a.m5076aR());
                    C1398h c1398h = C1399i.this.f6162b;
                    String strM2594c = c1220am.m2594c();
                    if (c1396fM4919a.m5092aj() != 1) {
                        jSONObject = null;
                    }
                    c1398h.m5145a(strM2594c, c1396fM4919a, jSONObject, c1396fM4919a.m5076aR());
                }
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadStart(int i) {
            }
        });
    }
}
