package com.anythink.basead.p025ui.specialnote;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.basead.p010a.C0737j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.p067a.AbstractC1327a;
import com.anythink.core.common.p066o.p067a.C1329c;
import com.anythink.core.common.p066o.p067a.C1332f;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSpecialNoteView extends LinearLayout {
    public static final long SEPECIAL_NOTE_INTERVAL_TIME = 500;

    /* JADX INFO: renamed from: a */
    public final String f2209a;

    /* JADX INFO: renamed from: b */
    public final long f2210b;

    /* JADX INFO: renamed from: c */
    public final int f2211c;

    /* JADX INFO: renamed from: d */
    public long f2212d;

    /* JADX INFO: renamed from: e */
    public long f2213e;

    /* JADX INFO: renamed from: f */
    public long f2214f;

    /* JADX INFO: renamed from: g */
    public long f2215g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1032a f2216h;

    /* JADX INFO: renamed from: i */
    public Runnable f2217i;

    /* JADX INFO: renamed from: j */
    public C1329c f2218j;

    /* JADX INFO: renamed from: k */
    public C1332f.b f2219k;

    /* JADX INFO: renamed from: l */
    public TextView f2220l;

    /* JADX INFO: renamed from: m */
    public TextView f2221m;

    /* JADX INFO: renamed from: n */
    public String f2222n;

    /* JADX INFO: renamed from: o */
    private View f2223o;

    /* JADX INFO: renamed from: p */
    private int f2224p;

    /* JADX INFO: renamed from: q */
    private boolean f2225q;

    /* JADX INFO: renamed from: com.anythink.basead.ui.specialnote.BaseSpecialNoteView$1 */
    public class RunnableC10261 implements Runnable {
        public RunnableC10261() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSpecialNoteView.m1309a(BaseSpecialNoteView.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.specialnote.BaseSpecialNoteView$2 */
    public class ViewOnClickListenerC10272 implements View.OnClickListener {
        public ViewOnClickListenerC10272() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.specialnote.BaseSpecialNoteView$3 */
    public class ViewOnClickListenerC10283 implements View.OnClickListener {
        public ViewOnClickListenerC10283() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseSpecialNoteView.this.release();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.specialnote.BaseSpecialNoteView$4 */
    public class C10294 extends AbstractC1327a {
        public C10294() {
        }

        @Override // com.anythink.core.common.p066o.p067a.AbstractC1327a, com.anythink.core.common.p066o.p067a.InterfaceC1328b
        public final int getImpressionMinPercentageViewed() {
            return 50;
        }

        @Override // com.anythink.core.common.p066o.p067a.AbstractC1327a, com.anythink.core.common.p066o.p067a.InterfaceC1328b
        public final void recordImpression(View view) {
            BaseSpecialNoteView.this.m1311e();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.specialnote.BaseSpecialNoteView$5 */
    public class C10305 implements ValueAnimator.AnimatorUpdateListener {
        public C10305() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseSpecialNoteView.this.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.specialnote.BaseSpecialNoteView$6 */
    public class C10316 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ValueAnimator f2231a;

        public C10316(ValueAnimator valueAnimator) {
            valueAnimator = valueAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            BaseSpecialNoteView.this.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            BaseSpecialNoteView.this.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            BaseSpecialNoteView.this.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.specialnote.BaseSpecialNoteView$a */
    public interface InterfaceC1032a {
        /* JADX INFO: renamed from: a */
        void mo1198a(int i);
    }

    public BaseSpecialNoteView(Context context) {
        super(context);
        this.f2209a = getClass().getSimpleName();
        this.f2210b = 500L;
        this.f2211c = 50;
        this.f2222n = "";
        this.f2225q = false;
    }

    public BaseSpecialNoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2209a = getClass().getSimpleName();
        this.f2210b = 500L;
        this.f2211c = 50;
        this.f2222n = "";
        this.f2225q = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1309a(BaseSpecialNoteView baseSpecialNoteView) {
        if (baseSpecialNoteView.getWindowVisibility() == 0) {
            if (baseSpecialNoteView.m1316j()) {
                long j = baseSpecialNoteView.f2213e;
                if (j > 0) {
                    baseSpecialNoteView.f2213e = j - 500;
                } else {
                    long j2 = baseSpecialNoteView.f2215g;
                    if (j2 > 0) {
                        baseSpecialNoteView.f2215g = j2 - 500;
                    }
                }
                baseSpecialNoteView.m1314h();
                baseSpecialNoteView.m1311e();
                return;
            }
        } else if (baseSpecialNoteView.mo1321d()) {
            baseSpecialNoteView.m1317k();
        }
        View view = baseSpecialNoteView.f2223o;
        if (view != null) {
            baseSpecialNoteView.f2218j.m3964a(view, baseSpecialNoteView.new C10294());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1311e() {
        if (this.f2216h == null) {
            return;
        }
        postDelayed(this.f2217i, 500L);
    }

    /* JADX INFO: renamed from: f */
    private void m1312f() {
        View view = this.f2223o;
        if (view == null) {
            return;
        }
        this.f2218j.m3964a(view, new C10294());
    }

    /* JADX INFO: renamed from: g */
    private void m1313g() {
        if (getWindowVisibility() == 0) {
            if (m1316j()) {
                long j = this.f2213e;
                if (j > 0) {
                    this.f2213e = j - 500;
                } else {
                    long j2 = this.f2215g;
                    if (j2 > 0) {
                        this.f2215g = j2 - 500;
                    }
                }
                m1314h();
                m1311e();
                return;
            }
        } else if (mo1321d()) {
            m1317k();
        }
        View view = this.f2223o;
        if (view != null) {
            this.f2218j.m3964a(view, new C10294());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m1314h() {
        if (this.f2213e > 0) {
            if (getVisibility() == 0) {
                setVisibility(4);
                return;
            }
            return;
        }
        long j = this.f2215g;
        if (j <= 0) {
            m1315i();
            return;
        }
        this.f2220l.setText(Html.fromHtml(String.format(this.f2222n, Integer.valueOf(((int) (j / 1000)) + 1))));
        if (getVisibility() != 0) {
            this.f2225q = true;
            mo1320c();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m1315i() {
        if (this.f2223o == null) {
            return;
        }
        new StringBuilder("SpecialNote do action,type:").append(this.f2224p);
        InterfaceC1032a interfaceC1032a = this.f2216h;
        if (interfaceC1032a != null) {
            interfaceC1032a.mo1198a(this.f2224p);
        }
        release();
    }

    /* JADX INFO: renamed from: j */
    private boolean m1316j() {
        View view = this.f2223o;
        if (view != null && view.getParent() != null) {
            Object parent = this.f2223o.getParent();
            if (parent instanceof View) {
                return this.f2219k.m3987a((View) parent, this.f2223o, 50, 0);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    private void m1317k() {
        this.f2213e = this.f2212d;
        this.f2215g = this.f2214f;
        setVisibility(4);
        this.f2225q = false;
    }

    /* JADX INFO: renamed from: a */
    public void mo1318a() {
        this.f2222n = getContext().getString(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_special_note_delay_click", C1875i.f11532g));
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1319b();

    /* JADX INFO: renamed from: c */
    public void mo1320c() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.2f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.5
            public C10305() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseSpecialNoteView.this.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.6

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ValueAnimator f2231a;

            public C10316(ValueAnimator valueAnimatorOfFloat2) {
                valueAnimator = valueAnimatorOfFloat2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                BaseSpecialNoteView.this.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                BaseSpecialNoteView.this.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                BaseSpecialNoteView.this.setVisibility(0);
            }
        });
        valueAnimatorOfFloat2.start();
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo1321d();

    public boolean hasBeenShow() {
        return this.f2225q;
    }

    public void initSetting(View view, int i, InterfaceC1032a interfaceC1032a, long j, long j2) {
        this.f2224p = i;
        mo1318a();
        mo1319b();
        setVisibility(4);
        this.f2218j = C0737j.m274a().m275b();
        this.f2219k = C0737j.m274a().m276c();
        this.f2223o = view;
        this.f2216h = interfaceC1032a;
        this.f2212d = j;
        this.f2214f = j2;
        this.f2213e = j;
        this.f2215g = j2;
        this.f2217i = new Runnable() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.1
            public RunnableC10261() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseSpecialNoteView.m1309a(BaseSpecialNoteView.this);
            }
        };
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.2
            public ViewOnClickListenerC10272() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        TextView textView = this.f2221m;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.3
                public ViewOnClickListenerC10283() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseSpecialNoteView.this.release();
                }
            });
        }
        TextView textView2 = this.f2220l;
        if (textView2 != null) {
            textView2.setText(Html.fromHtml(String.format(this.f2222n, Integer.valueOf(((int) (this.f2215g / 1000)) + 1))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pause();
    }

    public void pause() {
        setVisibility(4);
        Runnable runnable = this.f2217i;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        View view = this.f2223o;
        if (view != null) {
            this.f2218j.m3963a(view);
        }
    }

    public void release() {
        if (this.f2216h != null) {
            pause();
            this.f2216h = null;
            this.f2223o = null;
        }
    }

    public void reset(int i, long j, long j2) {
        this.f2224p = i;
        this.f2212d = j;
        this.f2214f = j2;
        m1317k();
    }

    public void resume() {
        if (m1316j()) {
            m1314h();
        }
        m1311e();
    }
}
