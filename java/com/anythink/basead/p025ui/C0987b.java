package com.anythink.basead.p025ui;

import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: renamed from: com.anythink.basead.ui.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0987b {

    /* JADX INFO: renamed from: a */
    private ViewGroup f1961a;

    /* JADX INFO: renamed from: b */
    private ImageView f1962b;

    /* JADX INFO: renamed from: c */
    private int f1963c;

    /* JADX INFO: renamed from: com.anythink.basead.ui.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (C0987b.this.f1961a instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C0987b.this.f1963c, C0987b.this.f1963c);
                    layoutParams.addRule(13);
                    C0987b.this.f1961a.addView(C0987b.this.f1962b, layoutParams);
                } else if (C0987b.this.f1961a instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C0987b.this.f1963c, C0987b.this.f1963c);
                    layoutParams2.gravity = 17;
                    C0987b.this.f1961a.addView(C0987b.this.f1962b, layoutParams2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C0987b(ViewGroup viewGroup) {
        this.f1961a = viewGroup;
        ImageView imageView = new ImageView(this.f1961a.getContext());
        this.f1962b = imageView;
        imageView.setId(C1345i.m4154a(this.f1961a.getContext(), "myoffer_loading_id", "id"));
        this.f1962b.setImageResource(C1345i.m4154a(this.f1961a.getContext(), "myoffer_loading", C1875i.f11528c));
        this.f1963c = (int) TypedValue.applyDimension(1, 50.0f, this.f1961a.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: d */
    private void m1167d() {
        ImageView imageView = this.f1962b;
        if (imageView != null) {
            this.f1961a.removeView(imageView);
        }
        this.f1961a.post(new AnonymousClass1());
    }

    /* JADX INFO: renamed from: a */
    public final void m1168a() {
        this.f1963c = (int) TypedValue.applyDimension(1, 30.0f, this.f1961a.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: b */
    public final void m1169b() {
        ImageView imageView = this.f1962b;
        if (imageView != null) {
            this.f1961a.removeView(imageView);
        }
        this.f1961a.post(new AnonymousClass1());
        this.f1962b.post(new Runnable() { // from class: com.anythink.basead.ui.b.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C0987b.this.f1962b.setAlpha(1.0f);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(1000L);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    rotateAnimation.setRepeatCount(-1);
                    C0987b.this.f1962b.startAnimation(rotateAnimation);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m1170c() {
        if (this.f1962b != null) {
            this.f1961a.post(new Runnable() { // from class: com.anythink.basead.ui.b.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C0987b.this.f1962b.clearAnimation();
                        C0987b.this.f1962b.setAlpha(0.0f);
                        C0987b.this.f1961a.removeView(C0987b.this.f1962b);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
