package com.anythink.expressad.exoplayer.scheduler;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.scheduler.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1761b {

    /* JADX INFO: renamed from: a */
    private static final String f10048a = "RequirementsWatcher";

    /* JADX INFO: renamed from: b */
    private final Context f10049b;

    /* JADX INFO: renamed from: c */
    private final c f10050c;

    /* JADX INFO: renamed from: d */
    private final C1760a f10051d;

    /* JADX INFO: renamed from: e */
    private b f10052e;

    /* JADX INFO: renamed from: f */
    private boolean f10053f;

    /* JADX INFO: renamed from: g */
    private a f10054g;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.scheduler.b$a */
    @RequiresApi(api = 21)
    public final class a extends ConnectivityManager.NetworkCallback {
        private a() {
        }

        public /* synthetic */ a(C1761b c1761b, byte b) {
            this();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            super.onAvailable(network);
            StringBuilder sb = new StringBuilder();
            sb.append(C1761b.this);
            sb.append(" NetworkCallback.onAvailable");
            C1761b.this.m8490a(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            super.onLost(network);
            StringBuilder sb = new StringBuilder();
            sb.append(C1761b.this);
            sb.append(" NetworkCallback.onLost");
            C1761b.this.m8490a(false);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.scheduler.b$b */
    public class b extends BroadcastReceiver {
        private b() {
        }

        public /* synthetic */ b(C1761b c1761b, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C1761b.this);
            sb.append(" received ");
            sb.append(intent.getAction());
            C1761b.this.m8490a(false);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.scheduler.b$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void m8497a();

        /* JADX INFO: renamed from: b */
        void m8498b();
    }

    private C1761b(Context context, c cVar, C1760a c1760a) {
        this.f10051d = c1760a;
        this.f10050c = cVar;
        this.f10049b = context.getApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" created");
    }

    /* JADX INFO: renamed from: a */
    private void m8488a() {
        String str;
        C1711a.m8005a(Looper.myLooper());
        m8490a(true);
        IntentFilter intentFilter = new IntentFilter();
        byte b2 = 0;
        if (this.f10051d.m8483a() != 0) {
            if (C1717af.f9627a >= 23) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f10049b.getSystemService("connectivity");
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(16).build();
                a aVar = new a(this, b2);
                this.f10054g = aVar;
                connectivityManager.registerNetworkCallback(networkRequestBuild, aVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f10051d.m8485b()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f10051d.m8486c()) {
            if (C1717af.f9627a >= 23) {
                str = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                str = "android.intent.action.SCREEN_OFF";
            }
            intentFilter.addAction(str);
        }
        b bVar = new b(this, b2);
        this.f10052e = bVar;
        this.f10049b.registerReceiver(bVar, intentFilter, null, new Handler());
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" started");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m8490a(boolean z) {
        boolean zM8484a = this.f10051d.m8484a(this.f10049b);
        if (z || zM8484a != this.f10053f) {
            this.f10053f = zM8484a;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m8491b() {
        this.f10049b.unregisterReceiver(this.f10052e);
        this.f10052e = null;
        if (this.f10054g != null && C1717af.f9627a >= 21) {
            ((ConnectivityManager) this.f10049b.getSystemService("connectivity")).unregisterNetworkCallback(this.f10054g);
            this.f10054g = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" stopped");
    }

    /* JADX INFO: renamed from: c */
    private C1760a m8492c() {
        return this.f10051d;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: d */
    private void m8493d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f10049b.getSystemService("connectivity");
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(16).build();
        a aVar = new a(this, (byte) 0);
        this.f10054g = aVar;
        connectivityManager.registerNetworkCallback(networkRequestBuild, aVar);
    }

    /* JADX INFO: renamed from: e */
    private void m8494e() {
        if (C1717af.f9627a >= 21) {
            ((ConnectivityManager) this.f10049b.getSystemService("connectivity")).unregisterNetworkCallback(this.f10054g);
            this.f10054g = null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m8495f() {
    }

    /* JADX INFO: renamed from: g */
    private static /* synthetic */ void m8496g() {
    }

    public final String toString() {
        return super.toString();
    }
}
