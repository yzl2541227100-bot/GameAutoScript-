package com.octopus.p222ad;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.octopus.p222ad.internal.C3114g;
import com.octopus.p222ad.internal.nativead.NativeAdShownListener;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.view.AdViewImpl;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class BannerAdView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final AdViewImpl f16653a;

    public BannerAdView(Context context, AdViewImpl adViewImpl) {
        super(context);
        this.f16653a = adViewImpl;
        m13823a();
    }

    /* JADX INFO: renamed from: a */
    private void m13823a() {
        setBackgroundColor(0);
        setPadding(0, 0, 0, 0);
        addView(this.f16653a);
    }

    public void checkShow() {
        C3114g.m14411a(this, new NativeAdShownListener() { // from class: com.octopus.ad.BannerAdView.1
            @Override // com.octopus.p222ad.internal.nativead.NativeAdShownListener
            public void onAdShown() {
                AdViewImpl adViewImpl = BannerAdView.this.f16653a;
                if (adViewImpl != null) {
                    adViewImpl.onBannerAdShow();
                }
            }
        });
    }

    public C3064a getAdSize() {
        return this.f16653a.getAdSize();
    }

    public boolean getResizeAdToFitContainer() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AdViewImpl adViewImpl = this.f16653a;
        if (adViewImpl != null) {
            adViewImpl.activityOnDestroy();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM13841a;
        if (getResizeAdToFitContainer()) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(iMakeMeasureSpec) / 6, 1073741824));
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            C3064a adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                HaoboLog.m14610e(HaoboLog.baseLogTag, "Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int iM13843b = adSize.m13843b(context);
                iM13841a = adSize.m13841a(context);
                measuredWidth = iM13843b;
            } else {
                iM13841a = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            iM13841a = childAt.getMeasuredHeight();
        }
        int iMax = Math.max(measuredWidth, getSuggestedMinimumWidth());
        int iMax2 = Math.max(iM13841a, getSuggestedMinimumHeight());
        if (mode == 1073741824) {
            iMax = View.MeasureSpec.getSize(i);
        }
        if (mode2 == 1073741824) {
            iMax2 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(View.resolveSize(iMax, i), View.resolveSize(iMax2, i2));
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        if (i == 8) {
            this.f16653a.activityOnPause();
        } else {
            this.f16653a.activityOnResume();
        }
    }
}
