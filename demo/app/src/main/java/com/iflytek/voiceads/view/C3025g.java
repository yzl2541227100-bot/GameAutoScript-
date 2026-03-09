package com.iflytek.voiceads.view;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.iflytek.voiceads.p208b.C2893a;

/* JADX INFO: renamed from: com.iflytek.voiceads.view.g */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C3025g implements C2893a.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ImageView f16618a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ InterstitialAdView f16619b;

    C3025g(InterstitialAdView interstitialAdView, ImageView imageView) {
        this.f16619b = interstitialAdView;
        this.f16618a = imageView;
    }

    @Override // com.iflytek.voiceads.p208b.C2893a.a
    /* JADX INFO: renamed from: a */
    public void mo13233a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f16618a.setImageBitmap(bitmap);
        }
    }
}
