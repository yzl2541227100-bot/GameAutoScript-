package com.iflytek.voiceads.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iflytek.voiceads.listener.InternalListener;
import com.iflytek.voiceads.p208b.C2893a;
import com.iflytek.voiceads.param.C2969d;
import com.iflytek.voiceads.utils.C2983a;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class InterstitialAdView extends AdView {

    /* JADX INFO: renamed from: t */
    private Context f16604t;

    /* JADX INFO: renamed from: u */
    private final String f16605u;

    public InterstitialAdView(Context context) {
        super(context);
        this.f16605u = "close_widget";
    }

    public InterstitialAdView(Context context, RelativeLayout relativeLayout, String str, InternalListener internalListener) {
        super(context, relativeLayout, str, C2983a.a.INTERSTITIAL, internalListener);
        this.f16605u = "close_widget";
        this.f16604t = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private void m13723a(ImageView imageView) {
        new C2893a(this.f16604t.getApplicationContext(), this.f16582g.f16196I).m13232a(new C3025g(this, imageView));
    }

    @Override // com.iflytek.voiceads.view.AdView
    /* JADX INFO: renamed from: j */
    public void mo13719j() {
        if (this.f16582g == null || TextUtils.isEmpty(this.f16582g.f16196I)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            C2989g.m13555a("IFLY_AD_SDK", "adview parent is null");
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if ("close_widget".equals(viewGroup.getChildAt(i).getTag())) {
                return;
            }
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        int iMin = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) - 40;
        int i2 = (int) (25.0f * f);
        int i3 = (int) (0.3d * ((double) i2));
        ImageView imageView = new ImageView(this.f16604t);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, (int) (f * 25.0f));
        layoutParams.topMargin = i3;
        layoutParams.leftMargin = (iMin - i2) - i3;
        imageView.setTag("close_widget");
        viewGroup.addView(imageView, layoutParams);
        m13723a(imageView);
        imageView.setOnClickListener(new ViewOnClickListenerC3024f(this));
    }

    @Override // com.iflytek.voiceads.view.AdView
    /* JADX INFO: renamed from: k */
    public void mo13720k() {
        int iMin = Math.min(C2969d.m13461c(this.f16604t), C2969d.m13463d(this.f16604t)) - 40;
        int iM13448b = (this.f16580e.m13448b() * iMin) / this.f16580e.m13444a();
        C2989g.m13555a("IFLY_AD_SDK", "InterstitialAdView adWidth=" + iMin + ", adHeight=" + iM13448b);
        this.f16577b.setGravity(17);
        m13702a(iMin, iM13448b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
