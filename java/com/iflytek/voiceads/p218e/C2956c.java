package com.iflytek.voiceads.p218e;

import android.os.Looper;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.download.C2952p;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.e.c */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2956c implements C2952p.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2954a f16355a;

    C2956c(C2954a c2954a) {
        this.f16355a = c2954a;
    }

    @Override // com.iflytek.voiceads.download.C2952p.a
    /* JADX INFO: renamed from: a */
    public void mo13400a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Looper.prepare();
            C2989g.m13555a("IFLY_AD_SDK", "not main thread");
        }
        this.f16355a.f16349g.onAdFailed(new AdError(71008));
    }

    @Override // com.iflytek.voiceads.download.C2952p.a
    /* JADX INFO: renamed from: a */
    public void mo13401a(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Looper.prepare();
            C2989g.m13555a("IFLY_AD_SDK", "not main thread");
        }
        this.f16355a.f16353k = str;
        this.f16355a.f16349g.onVideoCached();
    }
}
