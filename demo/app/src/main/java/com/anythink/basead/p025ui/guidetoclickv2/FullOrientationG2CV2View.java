package com.anythink.basead.p025ui.guidetoclickv2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class FullOrientationG2CV2View extends BaseG2CV2View {

    /* JADX INFO: renamed from: c */
    public ValueAnimator f2075c;

    /* JADX INFO: renamed from: d */
    public ImageView f2076d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1021d f2077e;

    /* JADX INFO: renamed from: f */
    private int f2078f;

    /* JADX INFO: renamed from: g */
    private float f2079g;

    /* JADX INFO: renamed from: h */
    private float f2080h;

    /* JADX INFO: renamed from: i */
    private float f2081i;

    /* JADX INFO: renamed from: j */
    private float f2082j;

    /* JADX INFO: renamed from: k */
    private int f2083k;

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.FullOrientationG2CV2View$1 */
    public class C10031 implements ValueAnimator.AnimatorUpdateListener {
        public C10031() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (FullOrientationG2CV2View.this.f2076d != null) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = FullOrientationG2CV2View.this.f2078f % 4;
                if (i == 1) {
                    FullOrientationG2CV2View.this.f2076d.setTranslationY(fFloatValue);
                    return;
                }
                if (i == 2) {
                    FullOrientationG2CV2View.this.f2076d.setTranslationX(-fFloatValue);
                } else if (i != 3) {
                    FullOrientationG2CV2View.this.f2076d.setTranslationY(-fFloatValue);
                } else {
                    FullOrientationG2CV2View.this.f2076d.setTranslationX(fFloatValue);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.FullOrientationG2CV2View$2 */
    public class C10042 extends AnimatorListenerAdapter {
        public C10042() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            FullOrientationG2CV2View.m1230b(FullOrientationG2CV2View.this);
        }
    }

    public FullOrientationG2CV2View(Context context) {
        super(context);
        this.f2078f = 0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m1230b(FullOrientationG2CV2View fullOrientationG2CV2View) {
        int i = fullOrientationG2CV2View.f2078f;
        fullOrientationG2CV2View.f2078f = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ float m1232c(FullOrientationG2CV2View fullOrientationG2CV2View, float f) {
        float f2 = fullOrientationG2CV2View.f2081i + f;
        fullOrientationG2CV2View.f2081i = f2;
        return f2;
    }

    /* JADX INFO: renamed from: c */
    private void m1233c() {
        if (this.f2075c == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, C1345i.m4153a(getContext(), 12.0f), 0.0f);
            this.f2075c = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(500L);
            this.f2075c.setRepeatCount(-1);
            this.f2075c.addUpdateListener(new C10031());
            this.f2075c.addListener(new C10042());
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ float m1235d(FullOrientationG2CV2View fullOrientationG2CV2View, float f) {
        float f2 = fullOrientationG2CV2View.f2082j + f;
        fullOrientationG2CV2View.f2082j = f2;
        return f2;
    }

    /* JADX INFO: renamed from: d */
    private InterfaceC1021d m1236d() {
        for (ViewParent parent = getParent(); parent.getParent() != null; parent = parent.getParent()) {
            if (parent instanceof InterfaceC1021d) {
                return (InterfaceC1021d) parent;
            }
        }
        return null;
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    /* JADX INFO: renamed from: a */
    public final void mo1222a() {
        super.mo1222a();
        ValueAnimator valueAnimator = this.f2075c;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    /* JADX INFO: renamed from: a */
    public final void mo1223a(int i, int i2) {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_g2c_v2_full_orientation", "layout"), this);
        this.f2083k = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f2076d = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_g2c_fullori_finger", "id"));
        if (this.f2075c == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, C1345i.m4153a(getContext(), 12.0f), 0.0f);
            this.f2075c = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(500L);
            this.f2075c.setRepeatCount(-1);
            this.f2075c.addUpdateListener(new C10031());
            this.f2075c.addListener(new C10042());
        }
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    /* JADX INFO: renamed from: b */
    public final void mo1224b() {
        super.mo1224b();
        ValueAnimator valueAnimator = this.f2075c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        InterfaceC1021d interfaceC1021d;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent.getParent() == null) {
                interfaceC1021d = null;
                break;
            } else {
                if (parent instanceof InterfaceC1021d) {
                    interfaceC1021d = (InterfaceC1021d) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        this.f2077e = interfaceC1021d;
        if (interfaceC1021d != null) {
            interfaceC1021d.setCallback(new InterfaceC1020c() { // from class: com.anythink.basead.ui.guidetoclickv2.FullOrientationG2CV2View.3
                @Override // com.anythink.basead.p025ui.guidetoclickv2.InterfaceC1020c
                /* JADX INFO: renamed from: a */
                public final boolean mo1240a(MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1) {
                            if (FullOrientationG2CV2View.this.f2081i + FullOrientationG2CV2View.this.f2082j <= FullOrientationG2CV2View.this.f2083k) {
                                return false;
                            }
                            AbstractC0989b.a aVar = FullOrientationG2CV2View.this.f2057b;
                            if (aVar != null) {
                                aVar.mo534a(11, 21);
                            }
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        float x = motionEvent.getX() - FullOrientationG2CV2View.this.f2079g;
                        float y = motionEvent.getY() - FullOrientationG2CV2View.this.f2080h;
                        FullOrientationG2CV2View.m1232c(FullOrientationG2CV2View.this, Math.abs(x));
                        FullOrientationG2CV2View.m1235d(FullOrientationG2CV2View.this, Math.abs(y));
                    }
                    FullOrientationG2CV2View.this.f2079g = motionEvent.getX();
                    FullOrientationG2CV2View.this.f2080h = motionEvent.getY();
                    return false;
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1021d interfaceC1021d = this.f2077e;
        if (interfaceC1021d != null) {
            interfaceC1021d.setCallback(null);
        }
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        ValueAnimator valueAnimator = this.f2075c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
