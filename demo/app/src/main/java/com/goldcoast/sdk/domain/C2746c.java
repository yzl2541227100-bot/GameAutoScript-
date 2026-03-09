package com.goldcoast.sdk.domain;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: com.goldcoast.sdk.domain.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C2746c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EntryPoint f16055a;

    public C2746c(EntryPoint entryPoint) {
        this.f16055a = entryPoint;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = this.f16055a.f16047v.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        this.f16055a.m13216f();
    }
}
