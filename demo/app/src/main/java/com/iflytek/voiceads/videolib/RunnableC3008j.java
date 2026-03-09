package com.iflytek.voiceads.videolib;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.j */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class RunnableC3008j implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f16565a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3002d f16566b;

    RunnableC3008j(C3002d c3002d, int i) {
        this.f16566b = c3002d;
        this.f16565a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C3013o.m13684c() == null || this.f16565a != 3) {
            return;
        }
        C3013o.m13684c().m13622l();
    }
}
