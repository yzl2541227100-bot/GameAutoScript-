package com.iflytek.voiceads.download;

import android.app.Activity;
import com.iflytek.voiceads.download.C2937d;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.f */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class RunnableC2942f implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Activity f16323a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C2937d.b f16324b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C2937d f16325c;

    RunnableC2942f(C2937d c2937d, Activity activity, C2937d.b bVar) {
        this.f16325c = c2937d;
        this.f16323a = activity;
        this.f16324b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16325c.m13338a(this.f16323a, new C2943g(this));
    }
}
