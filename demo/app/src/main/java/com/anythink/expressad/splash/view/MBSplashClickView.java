package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class MBSplashClickView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private static final String f12813a = "MBSplashClickView";
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* JADX INFO: renamed from: b */
    private String f12814b;

    /* JADX INFO: renamed from: c */
    private String f12815c;

    /* JADX INFO: renamed from: d */
    private String f12816d;

    /* JADX INFO: renamed from: e */
    private final String f12817e;

    /* JADX INFO: renamed from: f */
    private final String f12818f;

    /* JADX INFO: renamed from: g */
    private final String f12819g;

    /* JADX INFO: renamed from: h */
    private final String f12820h;

    /* JADX INFO: renamed from: i */
    private final String f12821i;

    /* JADX INFO: renamed from: j */
    private String f12822j;

    /* JADX INFO: renamed from: k */
    private int f12823k;

    /* JADX INFO: renamed from: l */
    private ImageView f12824l;

    /* JADX INFO: renamed from: m */
    private ImageView f12825m;

    /* JADX INFO: renamed from: n */
    private final RectF f12826n;

    /* JADX INFO: renamed from: o */
    private final Paint f12827o;

    /* JADX INFO: renamed from: p */
    private final Paint f12828p;

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.MBSplashClickView$1 */
    public class AnimationAnimationListenerC20171 implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ScaleAnimation f12829a;

        public AnimationAnimationListenerC20171(ScaleAnimation scaleAnimation) {
            this.f12829a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f12825m.setVisibility(4);
            MBSplashClickView.this.f12825m.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f12825m.startAnimation(AnimationAnimationListenerC20171.this.f12829a);
                }
            }, 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f12825m.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.MBSplashClickView$2 */
    public class RunnableC20182 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ScaleAnimation f12832a;

        public RunnableC20182(ScaleAnimation scaleAnimation) {
            this.f12832a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBSplashClickView.this.f12825m.startAnimation(this.f12832a);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.MBSplashClickView$3 */
    public class AnimationAnimationListenerC20193 implements Animation.AnimationListener {
        public AnimationAnimationListenerC20193() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(final Animation animation) {
            MBSplashClickView.this.f12824l.setVisibility(4);
            MBSplashClickView.this.f12824l.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f12824l.startAnimation(animation);
                }
            }, C1659a.f9130f);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f12824l.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f12814b = "";
        this.f12815c = "";
        this.f12816d = "";
        this.f12817e = "anythink_splash_btn_arrow_right";
        this.f12818f = "anythink_splash_btn_circle";
        this.f12819g = "anythink_splash_btn_finger";
        this.f12820h = "anythink_splash_btn_go";
        this.f12821i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f12826n = new RectF();
        this.f12827o = new Paint();
        this.f12828p = new Paint();
        m10804a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12814b = "";
        this.f12815c = "";
        this.f12816d = "";
        this.f12817e = "anythink_splash_btn_arrow_right";
        this.f12818f = "anythink_splash_btn_circle";
        this.f12819g = "anythink_splash_btn_finger";
        this.f12820h = "anythink_splash_btn_go";
        this.f12821i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f12826n = new RectF();
        this.f12827o = new Paint();
        this.f12828p = new Paint();
        m10804a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12814b = "";
        this.f12815c = "";
        this.f12816d = "";
        this.f12817e = "anythink_splash_btn_arrow_right";
        this.f12818f = "anythink_splash_btn_circle";
        this.f12819g = "anythink_splash_btn_finger";
        this.f12820h = "anythink_splash_btn_go";
        this.f12821i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f12826n = new RectF();
        this.f12827o = new Paint();
        this.f12828p = new Paint();
        m10804a();
    }

    @RequiresApi(api = 21)
    public MBSplashClickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12814b = "";
        this.f12815c = "";
        this.f12816d = "";
        this.f12817e = "anythink_splash_btn_arrow_right";
        this.f12818f = "anythink_splash_btn_circle";
        this.f12819g = "anythink_splash_btn_finger";
        this.f12820h = "anythink_splash_btn_go";
        this.f12821i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f12826n = new RectF();
        this.f12827o = new Paint();
        this.f12828p = new Paint();
    }

    /* JADX INFO: renamed from: a */
    private void m10804a() {
        this.f12827o.setAntiAlias(true);
        this.f12827o.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f12828p.setAntiAlias(true);
        this.f12828p.setColor(-1);
        this.f12814b = getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_shake_view_click_default_view", C1875i.f11532g));
        this.f12815c = getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_shake_view_click_default_open", C1875i.f11532g));
        this.f12816d = getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_shake_view_click_default_inst", C1875i.f11532g));
    }

    /* JADX INFO: renamed from: a */
    private void m10805a(int i) {
        int color = Color.parseColor("#666666");
        int color2 = Color.parseColor("#8FC31F");
        int color3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i == 2) {
            gradientDrawable.setColor(color2);
        } else {
            gradientDrawable.setColor(color3);
            gradientDrawable.setStroke(2, color);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
    }

    /* JADX INFO: renamed from: a */
    private boolean m10806a(String str) {
        int i;
        if (TextUtils.equals(str, this.f12814b)) {
            i = 2;
        } else {
            if (!TextUtils.equals(str, this.f12816d)) {
                if (!TextUtils.equals(str, this.f12815c)) {
                    return false;
                }
                this.f12823k = 1;
                return true;
            }
            i = 3;
        }
        this.f12823k = i;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m10808b() {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.splash.view.MBSplashClickView.m10808b():void");
    }

    /* JADX INFO: renamed from: c */
    private void m10809c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new AnimationAnimationListenerC20171(scaleAnimation2));
        this.f12825m.setVisibility(4);
        this.f12824l.startAnimation(scaleAnimation);
        this.f12825m.postDelayed(new RunnableC20182(scaleAnimation2), 500L);
    }

    /* JADX INFO: renamed from: d */
    private void m10810d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC20193());
        this.f12824l.startAnimation(translateAnimation);
    }

    /* JADX INFO: renamed from: e */
    private void m10811e() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f12824l.startAnimation(scaleAnimation);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f12826n, this.f12828p, 31);
        canvas.drawRoundRect(this.f12826n, 200.0f, 200.0f, this.f12828p);
        canvas.saveLayer(this.f12826n, this.f12827o, 31);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initView(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.splash.view.MBSplashClickView.initView(java.lang.String):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Animation animation;
        super.onAttachedToWindow();
        int i = this.f12823k;
        if (i == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            animation = scaleAnimation;
        } else {
            if (i != 1) {
                if (i == 3) {
                    ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation2.setDuration(400L);
                    scaleAnimation2.setRepeatCount(-1);
                    scaleAnimation2.setRepeatMode(2);
                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation3.setDuration(200L);
                    scaleAnimation3.setAnimationListener(new AnimationAnimationListenerC20171(scaleAnimation3));
                    this.f12825m.setVisibility(4);
                    this.f12824l.startAnimation(scaleAnimation2);
                    this.f12825m.postDelayed(new RunnableC20182(scaleAnimation3), 500L);
                    return;
                }
                return;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new AnimationAnimationListenerC20193());
            animation = translateAnimation;
        }
        this.f12824l.startAnimation(animation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12826n.set(0.0f, 0.0f, getWidth(), getHeight());
    }
}
