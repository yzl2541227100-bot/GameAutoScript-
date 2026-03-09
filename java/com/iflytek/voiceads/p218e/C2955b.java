package com.iflytek.voiceads.p218e;

import android.app.Activity;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.request.C2974a;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.e.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2955b implements C2974a.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2954a f16354a;

    C2955b(C2954a c2954a) {
        this.f16354a = c2954a;
    }

    @Override // com.iflytek.voiceads.request.C2974a.a
    /* JADX INFO: renamed from: a */
    public void mo13286a(Exception exc, int i) {
        this.f16354a.f16350h.m13431a(1, new AdError(i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.iflytek.voiceads.config.AdError */
    @Override // com.iflytek.voiceads.request.C2974a.a
    /* JADX INFO: renamed from: a */
    public void mo13287a(byte[] bArr) {
        try {
            if ((this.f16354a.f16346d instanceof Activity) && ((Activity) this.f16354a.f16346d).isFinishing()) {
                this.f16354a.f16350h.m13431a(1, new AdError(71009));
                C2989g.m13555a("IFLY_AD_SDK", "activity is finishing");
            } else {
                this.f16354a.f16347e.m13296a(new String(bArr, "utf-8"));
                this.f16354a.f16348f = this.f16354a.f16347e.f16233f;
                this.f16354a.f16352j = new C2960g(this.f16354a.f16348f);
                if (70200 == this.f16354a.f16347e.f16228a) {
                    this.f16354a.f16350h.m13431a(0, new C2958e(this.f16354a.f16346d, this.f16354a.f16347e, this.f16354a.f16345c, this.f16354a.f16349g));
                } else {
                    this.f16354a.f16350h.m13431a(1, new AdError(this.f16354a.f16347e.f16228a));
                }
            }
        } catch (AdError e) {
            this.f16354a.f16350h.m13431a(1, e);
        } catch (Exception e2) {
            this.f16354a.f16350h.m13431a(1, new AdError(71003));
        }
    }
}
