package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.umeng.commonsdk.proguard.C3471v;
import com.umeng.commonsdk.statistics.C3482a;
import com.umeng.commonsdk.statistics.common.C3488d;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.idtracking.C3498g;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.internal.InterfaceC3517d;
import com.umeng.commonsdk.statistics.internal.StatTracer;

/* JADX INFO: loaded from: classes2.dex */
public class ImLatent implements InterfaceC3517d {
    private static ImLatent instanse;
    private Context context;
    private StatTracer statTracer;
    private C3488d storeHelper;
    private final int _DEFAULT_HOURS = 360;
    private final int _DEFAULT_MIN_HOURS = 36;
    private final int _DEFAULT_MIN_LATENT = 1;
    private final int _DEFAULT_MAX_LATENT = 1800;
    private final long _ONE_HOURS_IN_MS = 3600000;
    private final long _360HOURS_IN_MS = 1296000000;
    private final long _36HOURS_IN_MS = 129600000;
    private final int LATENT_MAX = 1800000;
    private final int LATENT_WINDOW = 10;
    private long latentHour = 1296000000;
    private int latentWindow = 10;
    private long mDelay = 0;
    private long mElapsed = 0;
    private boolean mLatentActivite = false;
    private Object mLatentLock = new Object();

    private ImLatent(Context context, StatTracer statTracer) {
        this.context = context;
        this.storeHelper = C3488d.m16307a(context);
        this.statTracer = statTracer;
    }

    public static synchronized ImLatent getService(Context context, StatTracer statTracer) {
        if (instanse == null) {
            ImLatent imLatent = new ImLatent(context, statTracer);
            instanse = imLatent;
            imLatent.onImprintChanged(C3498g.m16393a(context).m16403b());
        }
        return instanse;
    }

    public long getDelayTime() {
        long j;
        synchronized (this.mLatentLock) {
            j = this.mDelay;
        }
        return j;
    }

    public long getElapsedTime() {
        return this.mElapsed;
    }

    public boolean isLatentActivite() {
        boolean z;
        synchronized (this.mLatentLock) {
            z = this.mLatentActivite;
        }
        return z;
    }

    public void latentDeactivite() {
        synchronized (this.mLatentLock) {
            this.mLatentActivite = false;
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.InterfaceC3517d
    public void onImprintChanged(C3498g.a aVar) {
        int iIntValue = Integer.valueOf(aVar.m16408a("latent_hours", String.valueOf(360))).intValue();
        this.latentHour = ((long) (iIntValue > 36 ? iIntValue : 360)) * 3600000;
        int iIntValue2 = Integer.valueOf(aVar.m16408a(C3471v.f18966at, "0")).intValue();
        if (iIntValue2 < 1 || iIntValue2 > 1800) {
            iIntValue2 = 0;
        }
        if (iIntValue2 == 0 && ((iIntValue2 = C3482a.f19139a) <= 0 || iIntValue2 > 1800000)) {
            iIntValue2 = 10;
        }
        this.latentWindow = iIntValue2;
    }

    public boolean shouldStartLatency() {
        if (this.storeHelper.m16314c() || this.statTracer.isFirstRequest()) {
            return false;
        }
        synchronized (this.mLatentLock) {
            if (this.mLatentActivite) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.statTracer.getLastReqTime();
            if (jCurrentTimeMillis > this.latentHour) {
                String signature = Envelope.getSignature(this.context);
                synchronized (this.mLatentLock) {
                    this.mDelay = DataHelper.random(this.latentWindow, signature);
                    this.mElapsed = jCurrentTimeMillis;
                    this.mLatentActivite = true;
                }
                return true;
            }
            if (jCurrentTimeMillis <= 129600000) {
                return false;
            }
            synchronized (this.mLatentLock) {
                this.mDelay = 0L;
                this.mElapsed = jCurrentTimeMillis;
                this.mLatentActivite = true;
            }
            return true;
        }
    }
}
