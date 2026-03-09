package com.tramini.plugin.p261a.p263b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* JADX INFO: renamed from: com.tramini.plugin.a.b.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3326b {

    /* JADX INFO: renamed from: b */
    private static volatile C3326b f18073b;

    /* JADX INFO: renamed from: a */
    public Context f18074a;

    private C3326b(Context context) {
        this.f18074a = context;
    }

    /* JADX INFO: renamed from: a */
    public static C3326b m15136a(Context context) {
        if (f18073b == null) {
            synchronized (C3326b.class) {
                if (f18073b == null) {
                    f18073b = new C3326b(context.getApplicationContext());
                }
            }
        }
        return f18073b;
    }

    /* JADX INFO: renamed from: a */
    public final void m15137a(BroadcastReceiver broadcastReceiver) {
        try {
            LocalBroadcastManager.getInstance(this.f18074a).unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        try {
            LocalBroadcastManager.getInstance(this.f18074a).unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15138a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            LocalBroadcastManager.getInstance(this.f18074a).registerReceiver(broadcastReceiver, intentFilter);
        } catch (Throwable unused) {
        }
        try {
            LocalBroadcastManager.getInstance(this.f18074a).registerReceiver(broadcastReceiver, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15139a(Intent intent) {
        try {
            LocalBroadcastManager.getInstance(this.f18074a).sendBroadcast(intent);
        } catch (Throwable unused) {
        }
        try {
            LocalBroadcastManager.getInstance(this.f18074a).sendBroadcast(intent);
        } catch (Throwable unused2) {
        }
    }
}
