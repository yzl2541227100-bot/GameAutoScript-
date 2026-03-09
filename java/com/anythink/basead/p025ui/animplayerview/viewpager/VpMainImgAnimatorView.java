package com.anythink.basead.p025ui.animplayerview.viewpager;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.p025ui.WrapRoundImageView;
import com.anythink.basead.p025ui.animplayerview.InterfaceC0975c;
import com.anythink.core.common.p066o.C1345i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class VpMainImgAnimatorView extends RelativeLayout implements InterfaceC0975c {

    /* JADX INFO: renamed from: a */
    private static final String f1940a = "VpMainImgView";

    /* JADX INFO: renamed from: b */
    private static final int f1941b = 100;

    /* JADX INFO: renamed from: c */
    private static final int f1942c = 1500;

    /* JADX INFO: renamed from: d */
    private static final int f1943d = 500;

    /* JADX INFO: renamed from: e */
    private static final int f1944e = 8;

    /* JADX INFO: renamed from: f */
    private WrapRoundImageView f1945f;

    /* JADX INFO: renamed from: g */
    private WrapRoundImageView f1946g;

    /* JADX INFO: renamed from: h */
    private CircleIndicatorView f1947h;

    /* JADX INFO: renamed from: i */
    private CircleIndicatorView f1948i;

    /* JADX INFO: renamed from: j */
    private int f1949j;

    /* JADX INFO: renamed from: k */
    private float f1950k;

    /* JADX INFO: renamed from: l */
    private float f1951l;

    /* JADX INFO: renamed from: m */
    private final Handler f1952m;

    /* JADX INFO: renamed from: n */
    private ObjectAnimator f1953n;

    /* JADX INFO: renamed from: o */
    private ObjectAnimator f1954o;

    /* JADX INFO: renamed from: p */
    private AnimatorSet f1955p;

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView$2 */
    public class RunnableC09842 implements Runnable {
        public RunnableC09842() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VpMainImgAnimatorView.this.m1162d();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView$a */
    public class C0986a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b */
        private final View f1960b;

        public C0986a(View view) {
            this.f1960b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f1960b;
            if (view == null || view.getTranslationX() >= 0.0f) {
                return;
            }
            this.f1960b.setTranslationX(VpMainImgAnimatorView.this.f1951l);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public VpMainImgAnimatorView(Context context) {
        this(context, null);
    }

    public VpMainImgAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VpMainImgAnimatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1952m = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 100) {
                    VpMainImgAnimatorView.m1155a(VpMainImgAnimatorView.this);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private ObjectAnimator m1153a(ObjectAnimator objectAnimator, View view, float f, float f2) {
        if (objectAnimator == null) {
            objectAnimator = new ObjectAnimator();
            objectAnimator.setPropertyName("translationX");
            objectAnimator.addListener(new C0986a(view));
        }
        objectAnimator.setTarget(view);
        objectAnimator.setFloatValues(f, f2);
        return objectAnimator;
    }

    /* JADX INFO: renamed from: a */
    private void m1154a() {
        this.f1947h = new CircleIndicatorView(getContext());
        this.f1948i = new CircleIndicatorView(getContext());
        int iM4153a = C1345i.m4153a(getContext(), 8.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM4153a, iM4153a);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM4153a, iM4153a);
        layoutParams2.leftMargin = C1345i.m4153a(getContext(), 4.0f);
        linearLayout.addView(this.f1947h, layoutParams);
        linearLayout.addView(this.f1948i, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(12);
        layoutParams3.addRule(14);
        layoutParams3.bottomMargin = C1345i.m4153a(getContext(), 3.0f);
        addView(linearLayout, layoutParams3);
        m1157b();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1155a(VpMainImgAnimatorView vpMainImgAnimatorView) {
        WrapRoundImageView wrapRoundImageView = vpMainImgAnimatorView.f1945f;
        if (wrapRoundImageView == null || vpMainImgAnimatorView.f1946g == null) {
            return;
        }
        if (vpMainImgAnimatorView.f1949j == 0) {
            wrapRoundImageView.post(vpMainImgAnimatorView.new RunnableC09842());
        } else {
            vpMainImgAnimatorView.m1162d();
        }
    }

    /* JADX INFO: renamed from: a */
    private float[] m1156a(View view) {
        float[] fArr = new float[2];
        float translationX = view.getTranslationX();
        float f = this.f1950k;
        if (translationX != f) {
            f = this.f1951l;
        }
        fArr[0] = f;
        float translationX2 = view.getTranslationX();
        float f2 = this.f1950k;
        if (translationX2 == f2) {
            f2 = -this.f1951l;
        }
        fArr[1] = f2;
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m1157b() {
        WrapRoundImageView wrapRoundImageView;
        if (this.f1947h == null || this.f1948i == null || (wrapRoundImageView = this.f1945f) == null) {
            return;
        }
        if (wrapRoundImageView.getTranslationX() == this.f1950k) {
            this.f1947h.setSelectStatus(true);
            this.f1948i.setSelectStatus(false);
        } else {
            this.f1947h.setSelectStatus(false);
            this.f1948i.setSelectStatus(true);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m1159c() {
        WrapRoundImageView wrapRoundImageView = this.f1945f;
        if (wrapRoundImageView == null || this.f1946g == null) {
            return;
        }
        if (this.f1949j == 0) {
            wrapRoundImageView.post(new RunnableC09842());
        } else {
            m1162d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m1162d() {
        float[] fArrM1156a = m1156a(this.f1945f);
        float[] fArrM1156a2 = m1156a(this.f1946g);
        this.f1953n = m1153a(this.f1953n, this.f1945f, fArrM1156a[0], fArrM1156a[1]);
        this.f1954o = m1153a(this.f1954o, this.f1946g, fArrM1156a2[0], fArrM1156a2[1]);
        if (this.f1955p == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1955p = animatorSet;
            animatorSet.playTogether(this.f1953n, this.f1954o);
            this.f1955p.setDuration(500L);
            this.f1955p.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f1955p.addListener(new Animator.AnimatorListener() { // from class: com.anythink.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView.3
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    VpMainImgAnimatorView.this.m1157b();
                    if (VpMainImgAnimatorView.this.f1952m != null) {
                        VpMainImgAnimatorView.this.f1952m.removeMessages(100);
                        VpMainImgAnimatorView.this.f1952m.sendEmptyMessageDelayed(100, 1500L);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
        }
        this.f1955p.start();
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0975c
    public void addMainView(Bitmap bitmap, WrapRoundImageView... wrapRoundImageViewArr) {
        if (wrapRoundImageViewArr == null || bitmap == null || wrapRoundImageViewArr.length < 2) {
            return;
        }
        removeAllViews();
        this.f1945f = wrapRoundImageViewArr[0];
        this.f1946g = wrapRoundImageViewArr[1];
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams2.addRule(13);
        this.f1945f.setLayoutParams(layoutParams);
        this.f1946g.setLayoutParams(layoutParams2);
        addView(this.f1945f);
        addView(this.f1946g);
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        int i2 = getContext().getResources().getDisplayMetrics().heightPixels;
        this.f1945f.setBitmapAndResize(bitmap, i, i2);
        this.f1946g.setBitmapAndResize(bitmap, i, i2);
        ViewGroup.LayoutParams layoutParams3 = this.f1945f.getLayoutParams();
        this.f1949j = layoutParams3.width;
        int i3 = layoutParams3.height;
        ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        layoutParams4.width = this.f1949j;
        layoutParams4.height = i3;
        setLayoutParams(layoutParams4);
        float translationX = this.f1945f.getTranslationX();
        this.f1950k = translationX;
        float f = translationX + this.f1949j;
        this.f1951l = f;
        this.f1946g.setTranslationX(f);
        this.f1947h = new CircleIndicatorView(getContext());
        this.f1948i = new CircleIndicatorView(getContext());
        int iM4153a = C1345i.m4153a(getContext(), 8.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(iM4153a, iM4153a);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(iM4153a, iM4153a);
        layoutParams6.leftMargin = C1345i.m4153a(getContext(), 4.0f);
        linearLayout.addView(this.f1947h, layoutParams5);
        linearLayout.addView(this.f1948i, layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(12);
        layoutParams7.addRule(14);
        layoutParams7.bottomMargin = C1345i.m4153a(getContext(), 3.0f);
        addView(linearLayout, layoutParams7);
        m1157b();
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void pause() {
        AnimatorSet animatorSet = this.f1955p;
        if (animatorSet != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                animatorSet.pause();
                return;
            }
            stop();
            WrapRoundImageView wrapRoundImageView = this.f1945f;
            if (wrapRoundImageView != null) {
                wrapRoundImageView.setTranslationX(this.f1950k);
            }
            WrapRoundImageView wrapRoundImageView2 = this.f1946g;
            if (wrapRoundImageView2 != null) {
                wrapRoundImageView2.setTranslationX(this.f1951l);
            }
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0975c
    public void release() {
        stop();
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void resume() {
        AnimatorSet animatorSet = this.f1955p;
        if (animatorSet == null) {
            Handler handler = this.f1952m;
            if (handler != null) {
                handler.removeMessages(100);
                this.f1952m.sendEmptyMessageDelayed(100, 1500L);
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            animatorSet.resume();
            return;
        }
        Handler handler2 = this.f1952m;
        if (handler2 != null) {
            handler2.removeMessages(100);
            this.f1952m.sendEmptyMessageDelayed(100, 1500L);
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void setBitmapResources(List<Bitmap> list) {
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void start() {
        if (this.f1955p != null) {
            resume();
            return;
        }
        Handler handler = this.f1952m;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(100, 1500L);
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void stop() {
        Handler handler = this.f1952m;
        if (handler != null) {
            handler.removeMessages(100);
        }
        ObjectAnimator objectAnimator = this.f1953n;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f1953n = null;
        }
        ObjectAnimator objectAnimator2 = this.f1954o;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.f1954o = null;
        }
        AnimatorSet animatorSet = this.f1955p;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f1955p.cancel();
            this.f1955p = null;
        }
    }
}
