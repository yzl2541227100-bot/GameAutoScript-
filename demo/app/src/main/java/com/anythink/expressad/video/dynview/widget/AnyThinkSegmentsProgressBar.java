package com.anythink.expressad.video.dynview.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnyThinkSegmentsProgressBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final String f13435a;

    /* JADX INFO: renamed from: b */
    private int f13436b;

    /* JADX INFO: renamed from: c */
    private int f13437c;

    /* JADX INFO: renamed from: d */
    private int f13438d;

    /* JADX INFO: renamed from: e */
    private int f13439e;

    /* JADX INFO: renamed from: f */
    private int f13440f;

    /* JADX INFO: renamed from: g */
    private int f13441g;

    /* JADX INFO: renamed from: h */
    private int f13442h;

    /* JADX INFO: renamed from: i */
    private List<ProgressBar> f13443i;

    /* JADX INFO: renamed from: j */
    private TextView f13444j;

    /* JADX INFO: renamed from: k */
    private String f13445k;

    /* JADX INFO: renamed from: l */
    private boolean f13446l;

    public AnyThinkSegmentsProgressBar(Context context) {
        super(context);
        this.f13435a = "AnyThinkSegmentsProgressBar";
        this.f13437c = 1;
        this.f13438d = 20;
        this.f13439e = 10;
        this.f13440f = 1;
        this.f13441g = -1711276033;
        this.f13442h = -1;
        this.f13443i = new ArrayList();
        this.f13446l = false;
    }

    public AnyThinkSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13435a = "AnyThinkSegmentsProgressBar";
        this.f13437c = 1;
        this.f13438d = 20;
        this.f13439e = 10;
        this.f13440f = 1;
        this.f13441g = -1711276033;
        this.f13442h = -1;
        this.f13443i = new ArrayList();
        this.f13446l = false;
    }

    public AnyThinkSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13435a = "AnyThinkSegmentsProgressBar";
        this.f13437c = 1;
        this.f13438d = 20;
        this.f13439e = 10;
        this.f13440f = 1;
        this.f13441g = -1711276033;
        this.f13442h = -1;
        this.f13443i = new ArrayList();
        this.f13446l = false;
    }

    @RequiresApi(api = 21)
    public AnyThinkSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f13435a = "AnyThinkSegmentsProgressBar";
        this.f13437c = 1;
        this.f13438d = 20;
        this.f13439e = 10;
        this.f13440f = 1;
        this.f13441g = -1711276033;
        this.f13442h = -1;
        this.f13443i = new ArrayList();
        this.f13446l = false;
    }

    /* JADX INFO: renamed from: a */
    private StringBuilder m11299a(int i) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f13445k, Integer.valueOf(i), Integer.valueOf(this.f13436b)));
        } catch (Throwable th) {
            sb.append(this.f13436b);
            sb.append("videos, the");
            sb.append(i);
            sb.append(" is playing.");
            th.getMessage();
        }
        return sb;
    }

    /* JADX INFO: renamed from: a */
    private void m11300a() {
        Drawable drawable;
        try {
            if (this.f13437c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f13445k)) {
                    this.f13445k = getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_segment_process_bar_hint_text", C1875i.f11532g));
                }
            }
            if (this.f13437c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f13445k)) {
                    this.f13445k = getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_segment_process_bar_hint_text_lite", C1875i.f11532g));
                }
            }
            this.f13443i.clear();
            removeAllViews();
            setBackgroundDrawable(m11302c());
            TextView textView = new TextView(getContext());
            this.f13444j = textView;
            textView.setTextColor(-1);
            this.f13444j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f13444j.setLayoutParams(layoutParams);
            if (this.f13437c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f13444j;
                int i = this.f13438d;
                textView2.setPadding(i / 2, 15, i / 2, 5);
            }
            if (this.f13437c == 2) {
                this.f13444j.setGravity(16);
                TextView textView3 = this.f13444j;
                int i2 = this.f13438d;
                textView3.setPadding(i2 / 2, 0, i2 / 2, 0);
            }
            try {
                int iM9684a = C1875i.m9684a(getContext(), "anythink_reward_video_icon", C1875i.f11528c);
                if (iM9684a != 0 && (drawable = getContext().getResources().getDrawable(iM9684a)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f13444j.setCompoundDrawables(drawable, null, null, null);
                    this.f13444j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            this.f13444j.setText(m11299a(this.f13440f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i3 = 0; i3 < this.f13436b; i3++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(m11301b());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i4 = this.f13438d;
                layoutParams3.leftMargin = i4 / 2;
                layoutParams3.rightMargin = i4 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f13443i.add(progressBar);
            }
            if (this.f13437c == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f13444j);
                addView(linearLayout);
            }
            if (this.f13437c == 2) {
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.f13444j);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    private LayerDrawable m11301b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f13439e);
        gradientDrawable.setColor(this.f13441g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f13439e);
        gradientDrawable2.setColor(this.f13442h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: c */
    private static GradientDrawable m11302c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setDither(true);
        try {
            if (Build.VERSION.SDK_INT >= 16) {
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawable.setColors(new int[]{0, 1291845632});
            }
        } catch (Throwable unused) {
        }
        return gradientDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                AnyThinkSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i, int i2) {
        this.f13436b = i;
        this.f13437c = i2;
        m11300a();
    }

    public void init(int i, int i2, int i3, int i4) {
        this.f13436b = i;
        this.f13437c = i2;
        this.f13442h = i3;
        this.f13441g = i4;
        m11300a();
    }

    public void init(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f13436b = i;
        this.f13437c = i2;
        this.f13442h = i3;
        this.f13441g = i4;
        this.f13438d = i5;
        this.f13439e = i6;
        m11300a();
    }

    public void setIndicatorText(String str) {
        this.f13445k = str;
    }

    public void setProgress(int i, int i2) {
        try {
            if (this.f13443i.size() == 0) {
                return;
            }
            if (i2 < this.f13443i.size()) {
                this.f13443i.get(i2).setProgress(i);
            }
            int i3 = i2 + 1;
            if (i3 > this.f13440f) {
                this.f13440f = i3;
                TextView textView = this.f13444j;
                if (textView != null) {
                    textView.setText(m11299a(i3));
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
