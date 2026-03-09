package com.anythink.basead.p025ui.animplayerview.scale;

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
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.basead.p025ui.WrapRoundImageView;
import com.anythink.basead.p025ui.animplayerview.AbstractC0973a;
import com.anythink.basead.p025ui.animplayerview.InterfaceC0974b;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.expressad.p086d.C1486b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AlbumScaleMainView extends FrameLayout implements Handler.Callback, InterfaceC0974b {
    public static final int MAIN_VIEW_INIT_HEIGHT = 42;
    public static final int MAIN_VIEW_INIT_WIDTH = 90;

    /* JADX INFO: renamed from: a */
    private final int f1919a;

    /* JADX INFO: renamed from: b */
    private final int f1920b;

    /* JADX INFO: renamed from: c */
    private RoundImageView f1921c;

    /* JADX INFO: renamed from: d */
    private WrapRoundImageView f1922d;

    /* JADX INFO: renamed from: e */
    private AlbumScaleMainView f1923e;

    /* JADX INFO: renamed from: f */
    private AnimatorSet f1924f;

    /* JADX INFO: renamed from: g */
    private AnimatorSet f1925g;

    /* JADX INFO: renamed from: h */
    private Handler f1926h;

    /* JADX INFO: renamed from: i */
    private long f1927i;

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView$3 */
    public class C09813 extends AbstractC0973a {
        public C09813() {
        }

        @Override // com.anythink.basead.p025ui.animplayerview.AbstractC0973a, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AlbumScaleMainView.this.f1926h.sendEmptyMessageDelayed(100, 500L);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView$4 */
    public class C09824 extends AbstractC0973a {
        public C09824() {
        }

        @Override // com.anythink.basead.p025ui.animplayerview.AbstractC0973a, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (AlbumScaleMainView.this.f1926h != null) {
                AlbumScaleMainView.this.f1926h.sendEmptyMessageDelayed(100, 500L);
            }
        }
    }

    public AlbumScaleMainView(Context context) {
        this(context, null);
    }

    public AlbumScaleMainView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleMainView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1919a = 100;
        this.f1920b = C1486b.f7228b;
        this.f1921c = new RoundImageView(context);
        this.f1922d = new WrapRoundImageView(context);
        this.f1921c.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f1922d.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(this.f1921c, layoutParams);
        addView(this.f1922d, layoutParams2);
        this.f1926h = new Handler(Looper.getMainLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    private void m1147a() {
        float mainViewScale = getMainViewScale();
        if (mainViewScale == 1.0f) {
            return;
        }
        if (this.f1924f == null) {
            this.f1924f = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, mainViewScale);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, mainViewScale);
            long j = this.f1927i;
            if (j > 0) {
                this.f1924f.setStartDelay(j);
            }
            this.f1924f.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            this.f1924f.setDuration(4000L);
            this.f1924f.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f1924f.addListener(new C09813());
        }
        this.f1924f.start();
    }

    /* JADX INFO: renamed from: b */
    private void m1149b() {
        AlbumScaleMainView albumScaleMainView = this.f1923e;
        if (albumScaleMainView == null) {
            return;
        }
        if (albumScaleMainView.getVisibility() != 0) {
            this.f1923e.setVisibility(0);
        }
        if (this.f1925g == null) {
            this.f1925g = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1923e, "scaleX", 1.0f, 1.3f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f1923e, "scaleY", 1.0f, 1.3f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f1923e, "alpha", 0.4f, 0.0f);
            this.f1925g.setDuration(500L);
            this.f1925g.setInterpolator(new LinearInterpolator());
            this.f1925g.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            this.f1925g.addListener(new C09824());
        }
        AnimatorSet animatorSet = this.f1925g;
        if (animatorSet == null || animatorSet.isStarted()) {
            return;
        }
        this.f1925g.start();
    }

    public float getMainViewScale() {
        if (getLayoutParams() == null) {
            return 1.0f;
        }
        return Math.min(getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels) / Math.min(r0.width, r0.height);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AlbumScaleMainView albumScaleMainView;
        if (message.what == 100 && (albumScaleMainView = this.f1923e) != null) {
            if (albumScaleMainView.getVisibility() != 0) {
                this.f1923e.setVisibility(0);
            }
            if (this.f1925g == null) {
                this.f1925g = new AnimatorSet();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1923e, "scaleX", 1.0f, 1.3f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f1923e, "scaleY", 1.0f, 1.3f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f1923e, "alpha", 0.4f, 0.0f);
                this.f1925g.setDuration(500L);
                this.f1925g.setInterpolator(new LinearInterpolator());
                this.f1925g.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                this.f1925g.addListener(new C09824());
            }
            AnimatorSet animatorSet = this.f1925g;
            if (animatorSet != null && !animatorSet.isStarted()) {
                this.f1925g.start();
            }
        }
        return false;
    }

    public void initView(final Bitmap bitmap, boolean z) {
        C1339c.m4025a(getContext(), bitmap, new C1339c.a() { // from class: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView.1
            @Override // com.anythink.core.common.p066o.C1339c.a
            /* JADX INFO: renamed from: a */
            public final void mo673a() {
            }

            @Override // com.anythink.core.common.p066o.C1339c.a
            /* JADX INFO: renamed from: a */
            public final void mo674a(Bitmap bitmap2) {
                AlbumScaleMainView.this.f1921c.setImageBitmap(bitmap2);
            }
        });
        this.f1922d.post(new Runnable() { // from class: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView.2
            @Override // java.lang.Runnable
            public final void run() {
                AlbumScaleMainView.this.f1922d.setBitmapAndResize(bitmap, AlbumScaleMainView.this.getWidth(), AlbumScaleMainView.this.getHeight());
            }
        });
        if (z) {
            AlbumScaleMainView albumScaleMainView = new AlbumScaleMainView(getContext());
            this.f1923e = albumScaleMainView;
            albumScaleMainView.initView(bitmap, false);
            this.f1923e.setVisibility(4);
            addView(this.f1923e, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void pause() {
        AnimatorSet animatorSet = this.f1924f;
        if (animatorSet != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                animatorSet.pause();
            } else {
                stop();
            }
        }
    }

    public void release() {
        stop();
        removeAllViews();
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void resume() {
        AnimatorSet animatorSet = this.f1924f;
        if (animatorSet != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                animatorSet.resume();
            } else {
                start();
            }
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void setBitmapResources(List<Bitmap> list) {
    }

    public void setStartDelay(long j) {
        this.f1927i = j;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void start() {
        float mainViewScale = getMainViewScale();
        if (mainViewScale != 1.0f) {
            if (this.f1924f == null) {
                this.f1924f = new AnimatorSet();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, mainViewScale);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, mainViewScale);
                long j = this.f1927i;
                if (j > 0) {
                    this.f1924f.setStartDelay(j);
                }
                this.f1924f.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                this.f1924f.setDuration(4000L);
                this.f1924f.setInterpolator(new AccelerateDecelerateInterpolator());
                this.f1924f.addListener(new C09813());
            }
            this.f1924f.start();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void stop() {
        AnimatorSet animatorSet = this.f1924f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f1924f.cancel();
            this.f1924f = null;
        }
        AnimatorSet animatorSet2 = this.f1925g;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
            this.f1925g.cancel();
            this.f1925g = null;
        }
        Handler handler = this.f1926h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
