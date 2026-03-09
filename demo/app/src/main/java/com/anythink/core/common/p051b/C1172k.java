package com.anythink.core.common.p051b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* JADX INFO: renamed from: com.anythink.core.common.b.k */
/* JADX INFO: loaded from: classes.dex */
public class C1172k {

    /* JADX INFO: renamed from: b */
    private static volatile C1172k f3329b;

    /* JADX INFO: renamed from: a */
    public Context f3330a;

    private C1172k(Context context) {
        this.f3330a = context;
    }

    /* JADX INFO: renamed from: a */
    public static C1172k m2050a(Context context) {
        if (f3329b == null) {
            synchronized (C1172k.class) {
                if (f3329b == null) {
                    f3329b = new C1172k(context.getApplicationContext());
                }
            }
        }
        return f3329b;
    }

    /* JADX INFO: renamed from: a */
    public final void m2051a(BroadcastReceiver broadcastReceiver) {
        try {
            LocalBroadcastManager.getInstance(this.f3330a).unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        try {
            LocalBroadcastManager.getInstance(this.f3330a).unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2052a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            LocalBroadcastManager.getInstance(this.f3330a).registerReceiver(broadcastReceiver, intentFilter);
        } catch (Throwable unused) {
        }
        try {
            LocalBroadcastManager.getInstance(this.f3330a).registerReceiver(broadcastReceiver, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2053a(Intent intent) {
        try {
            LocalBroadcastManager.getInstance(this.f3330a).sendBroadcast(intent);
        } catch (Throwable unused) {
        }
        try {
            LocalBroadcastManager.getInstance(this.f3330a).sendBroadcast(intent);
        } catch (Throwable unused2) {
        }
    }
}
