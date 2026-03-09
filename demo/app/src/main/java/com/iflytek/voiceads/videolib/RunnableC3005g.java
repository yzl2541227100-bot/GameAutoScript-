package com.iflytek.voiceads.videolib;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.g */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class RunnableC3005g implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f16559a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3002d f16560b;

    RunnableC3005g(C3002d c3002d, int i) {
        this.f16560b = c3002d;
        this.f16559a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C3013o.m13684c() != null) {
            C3013o.m13684c().m13614d(this.f16559a);
        }
    }
}
