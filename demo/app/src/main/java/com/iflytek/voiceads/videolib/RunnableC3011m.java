package com.iflytek.voiceads.videolib;

import com.iflytek.voiceads.videolib.JZPlayer;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.m */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class RunnableC3011m implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JZPlayer.C2997a f16569a;

    RunnableC3011m(JZPlayer.C2997a c2997a) {
        this.f16569a = c2997a;
    }

    @Override // java.lang.Runnable
    public void run() {
        long jM13586E = JZPlayer.this.m13586E();
        long jM13587F = JZPlayer.this.m13587F();
        JZPlayer.this.m13599a((int) ((jM13586E * 100) / (jM13587F == 0 ? 1L : jM13587F)), jM13586E, jM13587F);
    }
}
