package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a */
    private static final String f13449a = "MBridgeAnimationClickView";

    /* JADX INFO: renamed from: b */
    private AnyThinkImageView f13450b;

    /* JADX INFO: renamed from: c */
    private AnyThinkImageView f13451c;

    /* JADX INFO: renamed from: d */
    private TextView f13452d;

    /* JADX INFO: renamed from: e */
    private String f13453e;

    /* JADX INFO: renamed from: f */
    private String f13454f;

    /* JADX INFO: renamed from: g */
    private String f13455g;

    /* JADX INFO: renamed from: h */
    private int f13456h;

    /* JADX INFO: renamed from: i */
    private int f13457i;

    /* JADX INFO: renamed from: j */
    private Animation f13458j;

    /* JADX INFO: renamed from: k */
    private Animation f13459k;

    /* JADX INFO: renamed from: l */
    private Animation f13460l;

    /* JADX INFO: renamed from: m */
    private Animation f13461m;

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView$3 */
    public class AnimationAnimationListenerC21093 implements Animation.AnimationListener {
        public AnimationAnimationListenerC21093() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            if (AnythinkBaitClickView.this.f13451c != null) {
                AnythinkBaitClickView.this.f13451c.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            if (AnythinkBaitClickView.this.f13451c != null) {
                AnythinkBaitClickView.this.f13451c.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView$4 */
    public class AnimationAnimationListenerC21104 implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnimationSet f13467a;

        public AnimationAnimationListenerC21104(AnimationSet animationSet) {
            this.f13467a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.4.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnythinkBaitClickView.this.f13450b != null) {
                        AnythinkBaitClickView.this.f13450b.startAnimation(AnythinkBaitClickView.this.f13458j);
                    }
                }
            }, 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnythinkBaitClickView.this.f13451c != null) {
                        AnythinkBaitClickView.this.f13451c.startAnimation(AnimationAnimationListenerC21104.this.f13467a);
                    }
                }
            }, 550L);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView$5 */
    public class AnimationAnimationListenerC21115 implements Animation.AnimationListener {
        public AnimationAnimationListenerC21115() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.5.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnythinkBaitClickView.this.f13450b != null) {
                        AnythinkBaitClickView.this.f13450b.startAnimation(AnythinkBaitClickView.this.f13458j);
                    }
                }
            }, 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public AnythinkBaitClickView(@NonNull Context context) {
        super(context);
        this.f13453e = "";
        this.f13454f = "";
        this.f13455g = "Click now for details";
        this.f13456h = 1;
        this.f13457i = 1342177280;
    }

    public AnythinkBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13453e = "";
        this.f13454f = "";
        this.f13455g = "Click now for details";
        this.f13456h = 1;
        this.f13457i = 1342177280;
    }

    public AnythinkBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13453e = "";
        this.f13454f = "";
        this.f13455g = "Click now for details";
        this.f13456h = 1;
        this.f13457i = 1342177280;
    }

    @RequiresApi(api = 21)
    public AnythinkBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f13453e = "";
        this.f13454f = "";
        this.f13455g = "Click now for details";
        this.f13456h = 1;
        this.f13457i = 1342177280;
    }

    /* JADX INFO: renamed from: a */
    private void m11304a() {
        try {
            this.f13455g = getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_click_for_detail", C1875i.f11532g));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11306b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f13458j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f13458j.setRepeatCount(-1);
        this.f13458j.setRepeatMode(2);
        AnyThinkImageView anyThinkImageView = this.f13450b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f13458j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f13459k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f13459k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f13460l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f13460l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f13459k);
        animationSet.addAnimation(this.f13460l);
        AnyThinkImageView anyThinkImageView2 = this.f13451c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(animationSet);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m11308c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f13458j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f13458j.setRepeatCount(-1);
        this.f13458j.setRepeatMode(2);
        AnyThinkImageView anyThinkImageView = this.f13450b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f13458j);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m11309d() {
        AnyThinkImageView anyThinkImageView = this.f13451c;
        if (anyThinkImageView != null) {
            anyThinkImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f13458j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f13458j.setRepeatCount(1);
        this.f13458j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f13459k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f13459k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f13460l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f13460l.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f13459k);
        animationSet.addAnimation(this.f13460l);
        this.f13459k.setAnimationListener(new AnimationAnimationListenerC21093());
        this.f13458j.setAnimationListener(new AnimationAnimationListenerC21104(animationSet));
        AnyThinkImageView anyThinkImageView2 = this.f13450b;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(this.f13458j);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m11310e() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f13458j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f13458j.setRepeatCount(1);
        this.f13458j.setAnimationListener(new AnimationAnimationListenerC21115());
        AnyThinkImageView anyThinkImageView = this.f13450b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f13458j);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m11311f() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f13461m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f13461m.setRepeatMode(2);
        this.f13461m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f13459k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f13459k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f13460l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f13460l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f13459k);
        animationSet.addAnimation(this.f13460l);
        AnyThinkImageView anyThinkImageView = this.f13450b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f13461m);
        }
        AnyThinkImageView anyThinkImageView2 = this.f13451c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(animationSet);
        }
    }

    public void init() {
        try {
            setBackgroundColor(this.f13457i);
            try {
                this.f13455g = getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_click_for_detail", C1875i.f11532g));
            } catch (Throwable th) {
                th.getMessage();
            }
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iM9834b = C1886t.m9834b(getContext(), 55.0f);
            int iM9834b2 = C1886t.m9834b(getContext(), 33.0f);
            this.f13451c = new AnyThinkImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM9834b, iM9834b);
            layoutParams.setMargins(iM9834b2, iM9834b2, 0, 0);
            this.f13451c.setLayoutParams(layoutParams);
            final int iM9684a = C1875i.m9684a(getContext(), "anythink_icon_click_circle", C1875i.f11528c);
            if (TextUtils.isEmpty(this.f13454f)) {
                this.f13451c.setImageResource(iM9684a);
            } else {
                C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(this.f13453e, new InterfaceC1819c() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.1
                    @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                    /* JADX INFO: renamed from: a */
                    public final void mo5462a(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        AnythinkBaitClickView.this.f13451c.setImageBitmap(bitmap);
                    }

                    @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                    /* JADX INFO: renamed from: a */
                    public final void mo5463a(String str, String str2) {
                        AnythinkBaitClickView.this.f13451c.setImageResource(iM9684a);
                    }
                });
            }
            int iM9834b3 = C1886t.m9834b(getContext(), 108.0f);
            int iM9834b4 = C1886t.m9834b(getContext(), 35.0f);
            int iM9834b5 = C1886t.m9834b(getContext(), 43.0f);
            this.f13450b = new AnyThinkImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iM9834b3, iM9834b3);
            layoutParams2.setMargins(iM9834b4, iM9834b5, 0, 0);
            this.f13450b.setLayoutParams(layoutParams2);
            final int iM9684a2 = C1875i.m9684a(getContext(), "anythink_icon_click_hand", C1875i.f11528c);
            if (TextUtils.isEmpty(this.f13453e)) {
                this.f13450b.setImageResource(iM9684a2);
            } else {
                C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(this.f13453e, new InterfaceC1819c() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.2
                    @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                    /* JADX INFO: renamed from: a */
                    public final void mo5462a(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        AnythinkBaitClickView.this.f13450b.setImageBitmap(bitmap);
                    }

                    @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                    /* JADX INFO: renamed from: a */
                    public final void mo5463a(String str, String str2) {
                        AnythinkBaitClickView.this.f13450b.setImageResource(iM9684a2);
                    }
                });
            }
            relativeLayout.addView(this.f13451c);
            relativeLayout.addView(this.f13450b);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f13452d = new TextView(getContext());
            this.f13452d.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f13452d.setText(this.f13455g);
            this.f13452d.setTextColor(-1);
            this.f13452d.setGravity(14);
            linearLayout.addView(this.f13452d);
            addView(linearLayout);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void init(int i) {
        this.f13456h = i;
        init();
    }

    public void init(int i, int i2) {
        this.f13457i = i;
        this.f13456h = i2;
        init();
    }

    public void init(int i, int i2, String str, String str2, String str3) {
        this.f13457i = i;
        this.f13456h = i2;
        this.f13453e = str;
        this.f13454f = str2;
        this.f13455g = str3;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f13458j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f13459k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f13460l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f13461m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i = this.f13456h;
        if (i == 2) {
            this.f13451c.setVisibility(4);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f13458j = scaleAnimation;
            scaleAnimation.setDuration(500L);
            this.f13458j.setRepeatCount(-1);
            this.f13458j.setRepeatMode(2);
            AnyThinkImageView anyThinkImageView = this.f13450b;
            if (anyThinkImageView != null) {
                anyThinkImageView.startAnimation(this.f13458j);
                return;
            }
            return;
        }
        if (i == 3) {
            AnyThinkImageView anyThinkImageView2 = this.f13451c;
            if (anyThinkImageView2 != null) {
                anyThinkImageView2.setVisibility(4);
            }
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f13458j = scaleAnimation2;
            scaleAnimation2.setDuration(500L);
            this.f13458j.setRepeatCount(1);
            this.f13458j.setRepeatMode(2);
            ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            this.f13459k = scaleAnimation3;
            scaleAnimation3.setDuration(1000L);
            this.f13459k.setRepeatCount(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            this.f13460l = alphaAnimation;
            alphaAnimation.setDuration(1000L);
            this.f13460l.setRepeatCount(0);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(this.f13459k);
            animationSet.addAnimation(this.f13460l);
            this.f13459k.setAnimationListener(new AnimationAnimationListenerC21093());
            this.f13458j.setAnimationListener(new AnimationAnimationListenerC21104(animationSet));
            AnyThinkImageView anyThinkImageView3 = this.f13450b;
            if (anyThinkImageView3 != null) {
                anyThinkImageView3.startAnimation(this.f13458j);
                return;
            }
            return;
        }
        if (i == 4) {
            this.f13451c.setVisibility(4);
            ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            this.f13458j = scaleAnimation4;
            scaleAnimation4.setDuration(200L);
            this.f13458j.setRepeatCount(1);
            this.f13458j.setAnimationListener(new AnimationAnimationListenerC21115());
            AnyThinkImageView anyThinkImageView4 = this.f13450b;
            if (anyThinkImageView4 != null) {
                anyThinkImageView4.startAnimation(this.f13458j);
                return;
            }
            return;
        }
        if (i != 5) {
            ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f13458j = scaleAnimation5;
            scaleAnimation5.setDuration(200L);
            this.f13458j.setRepeatCount(-1);
            this.f13458j.setRepeatMode(2);
            AnyThinkImageView anyThinkImageView5 = this.f13450b;
            if (anyThinkImageView5 != null) {
                anyThinkImageView5.startAnimation(this.f13458j);
            }
            ScaleAnimation scaleAnimation6 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
            this.f13459k = scaleAnimation6;
            scaleAnimation6.setDuration(400L);
            this.f13459k.setRepeatCount(-1);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.3f);
            this.f13460l = alphaAnimation2;
            alphaAnimation2.setDuration(400L);
            this.f13460l.setRepeatCount(-1);
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.addAnimation(this.f13459k);
            animationSet2.addAnimation(this.f13460l);
            AnyThinkImageView anyThinkImageView6 = this.f13451c;
            if (anyThinkImageView6 != null) {
                anyThinkImageView6.startAnimation(animationSet2);
                return;
            }
            return;
        }
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f13461m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f13461m.setRepeatMode(2);
        this.f13461m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation7 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f13459k = scaleAnimation7;
        scaleAnimation7.setDuration(600L);
        this.f13459k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
        this.f13460l = alphaAnimation3;
        alphaAnimation3.setDuration(600L);
        this.f13460l.setRepeatCount(-1);
        AnimationSet animationSet3 = new AnimationSet(true);
        animationSet3.addAnimation(this.f13459k);
        animationSet3.addAnimation(this.f13460l);
        AnyThinkImageView anyThinkImageView7 = this.f13450b;
        if (anyThinkImageView7 != null) {
            anyThinkImageView7.startAnimation(this.f13461m);
        }
        AnyThinkImageView anyThinkImageView8 = this.f13451c;
        if (anyThinkImageView8 != null) {
            anyThinkImageView8.startAnimation(animationSet3);
        }
    }
}
