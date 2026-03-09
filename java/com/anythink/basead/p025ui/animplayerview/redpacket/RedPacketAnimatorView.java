package com.anythink.basead.p025ui.animplayerview.redpacket;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.anythink.basead.p025ui.animplayerview.AbstractC0973a;
import com.anythink.basead.p025ui.animplayerview.InterfaceC0974b;
import java.util.List;
import p285z2.InterfaceC4236p7;

/* JADX INFO: loaded from: classes.dex */
public class RedPacketAnimatorView extends FrameLayout implements Handler.Callback, InterfaceC0974b {

    /* JADX INFO: renamed from: a */
    private final int f1866a;

    /* JADX INFO: renamed from: b */
    private final int f1867b;

    /* JADX INFO: renamed from: c */
    private RedPacketView f1868c;

    /* JADX INFO: renamed from: d */
    private ObjectAnimator f1869d;

    /* JADX INFO: renamed from: e */
    private Bitmap f1870e;

    /* JADX INFO: renamed from: f */
    private boolean f1871f;

    /* JADX INFO: renamed from: g */
    private boolean f1872g;

    /* JADX INFO: renamed from: h */
    private int f1873h;

    /* JADX INFO: renamed from: i */
    private Handler f1874i;

    public RedPacketAnimatorView(Context context) {
        this(context, null);
    }

    public RedPacketAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RedPacketAnimatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1866a = InterfaceC4236p7.OooO0OO;
        this.f1867b = 100;
        this.f1871f = false;
        this.f1872g = false;
        this.f1874i = new Handler(Looper.getMainLooper(), this);
        setClipChildren(false);
        RedPacketView redPacketView = new RedPacketView(getContext());
        this.f1868c = redPacketView;
        addView(redPacketView, new ViewGroup.LayoutParams(-1, -1));
        this.f1868c.setVisibility(4);
    }

    /* JADX INFO: renamed from: a */
    private static ViewGroup.LayoutParams m1118a() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    /* JADX INFO: renamed from: b */
    private void m1119b() {
        RedPacketView redPacketView = this.f1868c;
        if (redPacketView == null) {
            return;
        }
        redPacketView.setTranslationY(-this.f1873h);
        if (this.f1869d == null) {
            this.f1868c.setVisibility(0);
            this.f1868c.initRedPacketList(this.f1870e);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1868c, "translationY", -r4, this.f1873h);
            this.f1869d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.addListener(new AbstractC0973a() { // from class: com.anythink.basead.ui.animplayerview.redpacket.RedPacketAnimatorView.1
                @Override // com.anythink.basead.p025ui.animplayerview.AbstractC0973a, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (RedPacketAnimatorView.this.f1874i != null) {
                        RedPacketAnimatorView.this.f1874i.removeMessages(100);
                        RedPacketAnimatorView.this.f1874i.sendEmptyMessageDelayed(100, 500L);
                    }
                }
            });
            this.f1869d.setRepeatCount(0);
            this.f1869d.setDuration(4000L);
            this.f1869d.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator = this.f1869d;
        if (objectAnimator != null && !objectAnimator.isStarted()) {
            this.f1869d.start();
        }
        this.f1871f = true;
        this.f1872g = false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 100) {
            return false;
        }
        m1119b();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1873h = getMeasuredHeight();
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void pause() {
        Handler handler = this.f1874i;
        if (handler != null) {
            handler.removeMessages(100);
        }
        ObjectAnimator objectAnimator = this.f1869d;
        if (objectAnimator != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                objectAnimator.pause();
            } else {
                stop();
            }
        }
    }

    public void release() {
        if (this.f1872g) {
            return;
        }
        stop();
        RedPacketView redPacketView = this.f1868c;
        if (redPacketView != null) {
            redPacketView.release();
        }
        this.f1872g = true;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void resume() {
        ObjectAnimator objectAnimator = this.f1869d;
        if (objectAnimator != null) {
            if (Build.VERSION.SDK_INT < 19) {
                m1119b();
            } else if (objectAnimator.isPaused()) {
                this.f1869d.resume();
            } else {
                m1119b();
            }
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f1870e = list.get(0);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void start() {
        if (this.f1871f) {
            resume();
            return;
        }
        Handler handler = this.f1874i;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(100, 500L);
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void stop() {
        RedPacketView redPacketView = this.f1868c;
        if (redPacketView != null) {
            redPacketView.setTranslationY(-this.f1873h);
        }
        ObjectAnimator objectAnimator = this.f1869d;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f1869d.cancel();
            this.f1869d = null;
        }
        Handler handler = this.f1874i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f1871f = false;
    }
}
