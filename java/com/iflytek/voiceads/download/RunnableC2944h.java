package com.iflytek.voiceads.download;

import android.app.Activity;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.h */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class RunnableC2944h implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Activity f16327a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f16328b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C2937d f16329c;

    RunnableC2944h(C2937d c2937d, Activity activity, String str) {
        this.f16329c = c2937d;
        this.f16327a = activity;
        this.f16328b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16329c.m13338a(this.f16327a, new C2945i(this));
    }
}
