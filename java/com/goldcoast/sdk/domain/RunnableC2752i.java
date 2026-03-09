package com.goldcoast.sdk.domain;

import android.text.TextUtils;
import com.goldcoast.sdk.p206c.C2742h;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.goldcoast.sdk.domain.i */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2752i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EntryPoint f16069a;

    public RunnableC2752i(EntryPoint entryPoint) {
        this.f16069a = entryPoint;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2742h.m13179a();
        String strM13180a = C2742h.m13180a("refer");
        if (TextUtils.isEmpty(strM13180a)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM13180a);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f16069a.m13197a(jSONArray.get(i).toString(), i, 2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
