package com.iflytek.voiceads.p218e;

import android.graphics.Bitmap;
import com.iflytek.voiceads.p208b.C2893a;

/* JADX INFO: renamed from: com.iflytek.voiceads.e.d */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2957d implements C2893a.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2954a f16356a;

    C2957d(C2954a c2954a) {
        this.f16356a = c2954a;
    }

    @Override // com.iflytek.voiceads.p208b.C2893a.a
    /* JADX INFO: renamed from: a */
    public void mo13233a(Bitmap bitmap) {
        if (bitmap == null || this.f16356a.f16343a == null) {
            return;
        }
        this.f16356a.f16343a.f16521V.setImageBitmap(bitmap);
    }
}
