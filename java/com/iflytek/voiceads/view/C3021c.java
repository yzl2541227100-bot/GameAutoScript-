package com.iflytek.voiceads.view;

import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.request.C2974a;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.view.c */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C3021c implements C2974a.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AdView f16614a;

    C3021c(AdView adView) {
        this.f16614a = adView;
    }

    @Override // com.iflytek.voiceads.request.C2974a.a
    /* JADX INFO: renamed from: a */
    public void mo13286a(Exception exc, int i) {
        this.f16614a.f16587l.m13730a(5, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.iflytek.voiceads.config.AdError */
    @Override // com.iflytek.voiceads.request.C2974a.a
    /* JADX INFO: renamed from: a */
    public void mo13287a(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f16614a.m13691b(new String(bArr, "utf-8"));
            } else {
                C2989g.m13557b("IFLY_AD_SDK", "Invalid response data!");
            }
        } catch (AdError e) {
            this.f16614a.f16587l.m13730a(5, e.getErrorCode());
        } catch (Exception e2) {
            this.f16614a.f16587l.m13730a(5, 71003);
            C2989g.m13557b("IFLY_AD_SDK", "html parse1:" + e2.getMessage());
        }
    }
}
