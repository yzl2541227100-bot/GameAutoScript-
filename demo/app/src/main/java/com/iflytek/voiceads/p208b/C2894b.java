package com.iflytek.voiceads.p208b;

import android.graphics.Bitmap;
import com.iflytek.voiceads.p208b.C2897e;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.b.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2894b implements C2897e.b {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2893a f16121a;

    C2894b(C2893a c2893a) {
        this.f16121a = c2893a;
    }

    @Override // com.iflytek.voiceads.p208b.C2897e.b
    /* JADX INFO: renamed from: a */
    public void mo13234a(Bitmap bitmap) {
        this.f16121a.f16116b.sendMessage(this.f16121a.f16116b.obtainMessage(1, bitmap));
        this.f16121a.f16117c.m13240a(bitmap);
    }

    @Override // com.iflytek.voiceads.p208b.C2897e.b
    /* JADX INFO: renamed from: a */
    public void mo13235a(Exception exc) {
        this.f16121a.f16116b.sendMessage(this.f16121a.f16116b.obtainMessage(1, null));
        C2989g.m13557b("IFLY_AD_SDK", "get image from network failed!");
    }
}
