package com.iflytek.voiceads.videolib;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.i */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class RunnableC3007i implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f16562a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f16563b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3002d f16564c;

    RunnableC3007i(C3002d c3002d, int i, int i2) {
        this.f16564c = c3002d;
        this.f16562a = i;
        this.f16563b = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C3013o.m13684c() != null) {
            C3013o.m13684c().m13596a(this.f16562a, this.f16563b);
        }
    }
}
