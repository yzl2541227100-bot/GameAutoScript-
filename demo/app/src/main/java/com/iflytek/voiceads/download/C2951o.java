package com.iflytek.voiceads.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.iflytek.voiceads.download.C2937d;
import com.iflytek.voiceads.utils.C2989g;
import java.util.Map;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.o */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2951o extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2937d f16340a;

    C2951o(C2937d c2937d) {
        this.f16340a = c2937d;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            C2989g.m13555a("IFLY_AD_SDK", "app add" + intent.getDataString());
            for (Map.Entry entry : this.f16340a.f16283d.entrySet()) {
                if (((C2937d.b) entry.getValue()).f16303h == 1) {
                    C2989g.m13555a("IFLY_AD_SDK", ((C2937d.b) entry.getValue()).f16298c + "//" + intent.getDataString());
                    if (intent.getDataString().contains(((C2937d.b) entry.getValue()).f16298c) || "noPackage".equals(((C2937d.b) entry.getValue()).f16298c)) {
                        ((C2937d.b) entry.getValue()).f16303h = 2;
                        this.f16340a.m13350a(((C2937d.b) entry.getValue()).f16302g);
                    }
                    this.f16340a.f16283d.remove(((C2937d.b) entry.getValue()).f16297b);
                    C2989g.m13555a("IFLY_AD_SDK", "安装完成监控");
                }
            }
            this.f16340a.m13358c();
        }
    }
}
