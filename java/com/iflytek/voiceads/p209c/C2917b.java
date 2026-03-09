package com.iflytek.voiceads.p209c;

import android.app.Activity;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.request.C2974a;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.c.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2917b implements C2974a.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2916a f16178a;

    C2917b(C2916a c2916a) {
        this.f16178a = c2916a;
    }

    @Override // com.iflytek.voiceads.request.C2974a.a
    /* JADX INFO: renamed from: a */
    public void mo13286a(Exception exc, int i) {
        this.f16178a.f16177f.m13291a(1, new AdError(i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.iflytek.voiceads.config.AdError */
    @Override // com.iflytek.voiceads.request.C2974a.a
    /* JADX INFO: renamed from: a */
    public void mo13287a(byte[] bArr) {
        try {
            if ((this.f16178a.f16174c instanceof Activity) && ((Activity) this.f16178a.f16174c).isFinishing()) {
                this.f16178a.f16177f.m13291a(1, new AdError(71009));
                C2989g.m13555a("IFLY_AD_SDK", "activity is finishing");
            } else {
                this.f16178a.f16175d.m13296a(new String(bArr, "utf-8"));
                if (70200 == this.f16178a.f16175d.f16228a) {
                    this.f16178a.f16177f.m13291a(0, new C2918c(this.f16178a.f16174c, this.f16178a.f16175d, this.f16178a.f16173b, this.f16178a.f16176e));
                } else {
                    this.f16178a.f16177f.m13291a(1, new AdError(this.f16178a.f16175d.f16228a));
                }
            }
        } catch (AdError e) {
            this.f16178a.f16177f.m13291a(1, e);
        } catch (Exception e2) {
            this.f16178a.f16177f.m13291a(1, new AdError(71003));
            C2989g.m13557b("IFLY_AD_SDK", e2.getMessage());
        }
    }
}
