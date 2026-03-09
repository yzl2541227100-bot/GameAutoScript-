package com.anythink.expressad.exoplayer.p091b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1504d {

    /* JADX INFO: renamed from: a */
    public C1503c f7542a;

    /* JADX INFO: renamed from: b */
    private final Context f7543b;

    /* JADX INFO: renamed from: c */
    private final b f7544c;

    /* JADX INFO: renamed from: d */
    private final BroadcastReceiver f7545d;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.d$a */
    public final class a extends BroadcastReceiver {
        private a() {
        }

        public /* synthetic */ a(C1504d c1504d, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C1503c c1503cM6415a = C1503c.m6415a(intent);
            if (c1503cM6415a.equals(C1504d.this.f7542a)) {
                return;
            }
            C1504d c1504d = C1504d.this;
            c1504d.f7542a = c1503cM6415a;
            b unused = c1504d.f7544c;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m6420a();
    }

    private C1504d(Context context, b bVar) {
        this.f7543b = (Context) C1711a.m8005a(context);
        this.f7544c = (b) C1711a.m8005a(bVar);
        this.f7545d = C1717af.f9627a >= 21 ? new a(this, (byte) 0) : null;
    }

    /* JADX INFO: renamed from: a */
    private C1503c m6417a() {
        BroadcastReceiver broadcastReceiver = this.f7545d;
        C1503c c1503cM6415a = C1503c.m6415a(broadcastReceiver == null ? null : this.f7543b.registerReceiver(broadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
        this.f7542a = c1503cM6415a;
        return c1503cM6415a;
    }

    /* JADX INFO: renamed from: b */
    private void m6419b() {
        BroadcastReceiver broadcastReceiver = this.f7545d;
        if (broadcastReceiver != null) {
            this.f7543b.unregisterReceiver(broadcastReceiver);
        }
    }
}
