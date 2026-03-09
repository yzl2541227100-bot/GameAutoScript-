package com.anythink.basead.p025ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class GestureG2CV2View extends BaseG2CV2View {

    /* JADX INFO: renamed from: c */
    public ImageView f2087c;

    /* JADX INFO: renamed from: d */
    public ImageView f2088d;

    /* JADX INFO: renamed from: e */
    public TextView f2089e;

    /* JADX INFO: renamed from: f */
    public Animation f2090f;

    /* JADX INFO: renamed from: g */
    public int f2091g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f2092h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1021d f2093i;

    /* JADX INFO: renamed from: j */
    private boolean f2094j;

    /* JADX INFO: renamed from: k */
    private float f2095k;

    /* JADX INFO: renamed from: l */
    private float f2096l;

    /* JADX INFO: renamed from: m */
    private int f2097m;

    public GestureG2CV2View(Context context) {
        super(context);
        this.f2094j = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ float m1244b(GestureG2CV2View gestureG2CV2View, float f) {
        float f2 = gestureG2CV2View.f2096l + f;
        gestureG2CV2View.f2096l = f2;
        return f2;
    }

    /* JADX INFO: renamed from: c */
    private void m1246c() {
        if (this.f2090f == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -this.f2091g, 0.0f, 0.0f);
            this.f2090f = translateAnimation;
            translateAnimation.setDuration(1000L);
            this.f2090f.setRepeatCount(-1);
            this.f2090f.setRepeatMode(2);
            this.f2087c.startAnimation(this.f2090f);
        }
    }

    /* JADX INFO: renamed from: d */
    private InterfaceC1021d m1247d() {
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
        Animation animation = this.f2090f;
        if (animation != null) {
            animation.start();
        }
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    /* JADX INFO: renamed from: a */
    public final void mo1223a(int i, int i2) {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_g2c_v2_gesture", "layout"), this);
        this.f2097m = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f2087c = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_g2c_slide_finger", "id"));
        this.f2088d = (ImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_g2c_white_line", "id"));
        this.f2089e = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_g2c_slide_hint", "id"));
        this.f2092h = (RelativeLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_g2c_item_container", "id"));
        this.f2091g = C1345i.m4153a(getContext(), 36.0f);
        if (i == 1 || i == 3) {
            this.f2092h.setBackgroundResource(C1345i.m4154a(getContext(), "myoffer_g2c_gesture_bg", C1875i.f11528c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C1345i.m4153a(getContext(), 270.0f), C1345i.m4153a(getContext(), 100.0f));
            layoutParams.addRule(13);
            this.f2092h.setLayoutParams(layoutParams);
            this.f2088d.setVisibility(0);
        } else if (i == 2) {
            this.f2092h.setBackgroundColor(Color.parseColor("#80000000"));
            this.f2088d.setVisibility(0);
            if (this.f2094j) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f2088d.getLayoutParams();
                layoutParams2.width = C1345i.m4153a(getContext(), 240.0f);
                this.f2088d.setLayoutParams(layoutParams2);
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.f2087c.getLayoutParams();
            layoutParams3.height = C1345i.m4153a(getContext(), 24.0f);
            layoutParams3.width = C1345i.m4153a(getContext(), 24.0f);
            this.f2091g = C1345i.m4153a(getContext(), 24.0f);
            this.f2087c.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f2088d.getLayoutParams();
            layoutParams4.width = C1345i.m4153a(getContext(), 150.0f);
            layoutParams4.height = C1345i.m4153a(getContext(), 4.0f);
            layoutParams4.setMargins(layoutParams4.leftMargin, layoutParams4.topMargin, layoutParams4.rightMargin, C1345i.m4153a(getContext(), 8.0f));
            this.f2088d.setLayoutParams(layoutParams4);
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f2089e.getLayoutParams();
            layoutParams5.setMargins(C1345i.m4153a(getContext(), 8.0f), layoutParams5.topMargin, layoutParams5.rightMargin, layoutParams5.bottomMargin);
            this.f2089e.setTextSize(1, 10.0f);
            setBackgroundColor(Color.parseColor("#80000000"));
            post(new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.GestureG2CV2View.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (GestureG2CV2View.this.getMeasuredWidth() < C1345i.m4153a(GestureG2CV2View.this.getContext(), 182.0f)) {
                        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) GestureG2CV2View.this.f2088d.getLayoutParams();
                        layoutParams6.width = -1;
                        GestureG2CV2View.this.f2088d.setLayoutParams(layoutParams6);
                    }
                    GestureG2CV2View.this.f2088d.setVisibility(0);
                }
            });
        }
        if (this.f2090f == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -this.f2091g, 0.0f, 0.0f);
            this.f2090f = translateAnimation;
            translateAnimation.setDuration(1000L);
            this.f2090f.setRepeatCount(-1);
            this.f2090f.setRepeatMode(2);
            this.f2087c.startAnimation(this.f2090f);
        }
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    /* JADX INFO: renamed from: b */
    public final void mo1224b() {
        super.mo1224b();
        Animation animation = this.f2090f;
        if (animation != null) {
            animation.cancel();
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
        this.f2093i = interfaceC1021d;
        if (interfaceC1021d != null) {
            interfaceC1021d.setCallback(new InterfaceC1020c() { // from class: com.anythink.basead.ui.guidetoclickv2.GestureG2CV2View.2
                @Override // com.anythink.basead.p025ui.guidetoclickv2.InterfaceC1020c
                /* JADX INFO: renamed from: a */
                public final boolean mo1240a(MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1) {
                            if (GestureG2CV2View.this.f2096l <= GestureG2CV2View.this.f2097m) {
                                return false;
                            }
                            AbstractC0989b.a aVar = GestureG2CV2View.this.f2057b;
                            if (aVar != null) {
                                aVar.mo534a(11, 15);
                            }
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        GestureG2CV2View.m1244b(GestureG2CV2View.this, Math.abs(motionEvent.getX() - GestureG2CV2View.this.f2095k));
                    }
                    GestureG2CV2View.this.f2095k = motionEvent.getX();
                    return false;
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1021d interfaceC1021d = this.f2093i;
        if (interfaceC1021d != null) {
            interfaceC1021d.setCallback(null);
        }
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        Animation animation = this.f2090f;
        if (animation != null) {
            animation.cancel();
        }
    }

    public void setVerticalLandscape(boolean z) {
        this.f2094j = z;
    }
}
