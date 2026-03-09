package com.anythink.expressad.videocommon.p178b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2326k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    C2320e.m11843a().m11858b();
                } else if (activeNetworkInfo.getType() == 1) {
                    C2320e.m11843a().m11854a(true);
                } else if (activeNetworkInfo.getType() == 0) {
                    C2320e.m11843a().m11861c();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
