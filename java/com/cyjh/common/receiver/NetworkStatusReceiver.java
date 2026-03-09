package com.cyjh.common.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p285z2.InterfaceC4380t3;

/* JADX INFO: loaded from: classes.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {
    private InterfaceC4380t3 OooO00o;

    public void OooO00o(InterfaceC4380t3 interfaceC4380t3) {
        this.OooO00o = interfaceC4380t3;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        InterfaceC4380t3 interfaceC4380t3 = this.OooO00o;
        if (interfaceC4380t3 != null) {
            interfaceC4380t3.OooO00o(z);
        }
    }
}
