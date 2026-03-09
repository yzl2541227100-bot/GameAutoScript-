package com.anythink.basead.p025ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p025ui.PanelView;
import com.anythink.basead.p025ui.animplayerview.AlbumScaleAnimPlayerView;
import com.anythink.basead.p025ui.animplayerview.BasePlayerView;
import com.anythink.basead.p025ui.animplayerview.EmptyAnimPlayer;
import com.anythink.basead.p025ui.animplayerview.GuideToClickAnimPlayerView;
import com.anythink.basead.p025ui.animplayerview.RedPacketAnimPlayerView;
import com.anythink.basead.p025ui.animplayerview.ViewPagerAnimPlayerView;
import com.anythink.basead.p025ui.animplayerview.WebLandpagePlayerView;
import com.anythink.basead.p025ui.p028c.InterfaceC0995a;
import com.anythink.basead.p025ui.p029d.C0996a;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class FullScreenATView extends BaseScreenATView {
    public static final String TAG = FullScreenATView.class.getSimpleName();

    /* JADX INFO: renamed from: ad */
    private CountDownCloseView f1415ad;

    /* JADX INFO: renamed from: ae */
    private CloseHeaderView f1416ae;

    /* JADX INFO: renamed from: af */
    private PanelView f1417af;

    /* JADX INFO: renamed from: ag */
    private C0996a f1418ag;

    public FullScreenATView(Context context) {
        super(context);
    }

    public FullScreenATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, String str, int i, int i2) {
        super(context, c1248m, abstractC1247l, str, i, i2);
        setId(C1345i.m4154a(getContext(), "myoffer_full_screen_view_id", "id"));
        if (c1248m != null) {
            this.f1418ag = new C0996a(abstractC1247l, c1248m.f4333n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        r1.width = r8.f1269x;
        r1.height = r4;
        r0.setLayoutParams(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m867R() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.FullScreenATView.m867R():void");
    }

    /* JADX INFO: renamed from: S */
    private void m868S() {
        Context context;
        int i;
        if (((BaseScreenATView) this).f1267v == 1 && this.f1240H) {
            RoundImageView roundImageView = new RoundImageView(getContext().getApplicationContext());
            roundImageView.setImageResource(C1345i.m4154a(getContext(), "myoffer_reward_icon", C1875i.f11528c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C1345i.m4153a(getContext(), 60.0f), C1345i.m4153a(getContext(), 60.0f));
            int iIndexOfChild = 2;
            float f = 12.0f;
            if (mo779b(this.f1237E) && ((i = this.f1237E) == 2 || i == 6)) {
                layoutParams.leftMargin = this.f1269x - C1345i.m4153a(getContext(), 330.0f);
                context = getContext();
                f = 22.0f;
            } else {
                layoutParams.leftMargin = C1345i.m4153a(getContext(), 12.0f);
                context = getContext();
            }
            layoutParams.topMargin = C1345i.m4153a(context, f);
            roundImageView.setLayoutParams(layoutParams);
            try {
                iIndexOfChild = this.f1243K.indexOfChild(this.f1245M) + 1;
            } catch (Throwable unused) {
            }
            this.f1243K.addView(roundImageView, iIndexOfChild);
        }
    }

    /* JADX INFO: renamed from: T */
    private boolean m869T() {
        return ((BaseScreenATView) this).f1267v == 1 && this.f1238F != 100;
    }

    /* JADX INFO: renamed from: U */
    private boolean m870U() {
        if (((BaseScreenATView) this).f1267v != 1) {
            return false;
        }
        int i = this.f1238F;
        return i == 1 || i == 101;
    }

    /* JADX INFO: renamed from: V */
    private boolean m871V() {
        return m771M();
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: A */
    public final void mo759A() {
        super.mo759A();
        if (m869T()) {
            if (this.f1238F != 101) {
                CountDownCloseView countDownCloseView = this.f1415ad;
                if (countDownCloseView != null) {
                    countDownCloseView.setVisibility(0);
                    return;
                }
                return;
            }
            CloseHeaderView closeHeaderView = this.f1416ae;
            if (closeHeaderView != null) {
                closeHeaderView.setVisibility(0);
                if (this.f1416ae.getCloseImageView() != null) {
                    this.f1416ae.getCloseImageView().setVisibility(0);
                }
            }
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: B */
    public final void mo760B() {
        int iM3318as = this.f1160b.f4333n.m3318as();
        int i = ((BaseScreenATView) this).f1267v;
        if (i != 1) {
            if (i != 3) {
                m781c(1);
                return;
            }
            if (this.f1239G) {
                m781c(1);
                return;
            }
            m761C();
            if (iM3318as == 1 || iM3318as == 2) {
                m781c(1);
                return;
            }
            if (mo714l()) {
                this.f1176r = true;
            }
            mo786q();
            return;
        }
        if (this.f1176r) {
            m781c(1);
            return;
        }
        if (this.f1240H) {
            if (iM3318as != 1 && iM3318as != 3) {
                m761C();
                if (mo714l()) {
                    this.f1176r = true;
                }
                mo786q();
                return;
            }
        } else {
            if (iM3318as != 1 && iM3318as != 2) {
                double dCeil = Math.ceil(this.f1160b.f4333n.m3357k() / 1000.0d);
                if (this.f1244L != null) {
                    double dCeil2 = Math.ceil(r2.getVideoLength() / 1000.0d);
                    if (dCeil > dCeil2) {
                        dCeil = dCeil2;
                    }
                }
                RewardExitConfirmDialogActivity.m1013a(getContext(), String.valueOf((int) dCeil), new Runnable() { // from class: com.anythink.basead.ui.FullScreenATView.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        FullScreenATView.this.m761C();
                        FullScreenATView.this.m781c(1);
                    }
                }, m869T() ? 2 : 1);
                return;
            }
            try {
                Toast.makeText(getContext(), getContext().getString(C1345i.m4154a(getContext(), "myoffer_reward_exit_tips_msg", C1875i.f11532g)), 0).show();
            } catch (Throwable unused) {
            }
        }
        m761C();
        m781c(1);
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: D */
    public final void mo762D() {
        super.mo762D();
        if (m869T()) {
            m766H();
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: E */
    public final void mo763E() {
        super.mo763E();
        if (this.f1238F != 100) {
            this.f1251S.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: F */
    public void mo764F() {
        super.mo764F();
        C0996a c0996a = this.f1418ag;
        if (c0996a != null) {
            c0996a.m1209a();
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: G */
    public final void mo765G() {
        super.mo765G();
        C0996a c0996a = this.f1418ag;
        if (c0996a != null) {
            c0996a.m1211b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r1.width = r8.f1269x;
        r1.height = r4;
        r0.setLayoutParams(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo768J() {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.FullScreenATView.mo768J():void");
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: K */
    public void mo769K() {
        Context context;
        int i;
        super.mo769K();
        if (((BaseScreenATView) this).f1267v == 1 && this.f1240H) {
            RoundImageView roundImageView = new RoundImageView(getContext().getApplicationContext());
            roundImageView.setImageResource(C1345i.m4154a(getContext(), "myoffer_reward_icon", C1875i.f11528c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C1345i.m4153a(getContext(), 60.0f), C1345i.m4153a(getContext(), 60.0f));
            int iIndexOfChild = 2;
            float f = 12.0f;
            if (mo779b(this.f1237E) && ((i = this.f1237E) == 2 || i == 6)) {
                layoutParams.leftMargin = this.f1269x - C1345i.m4153a(getContext(), 330.0f);
                context = getContext();
                f = 22.0f;
            } else {
                layoutParams.leftMargin = C1345i.m4153a(getContext(), 12.0f);
                context = getContext();
            }
            layoutParams.topMargin = C1345i.m4153a(context, f);
            roundImageView.setLayoutParams(layoutParams);
            try {
                iIndexOfChild = this.f1243K.indexOfChild(this.f1245M) + 1;
            } catch (Throwable unused) {
            }
            this.f1243K.addView(roundImageView, iIndexOfChild);
        }
        if (C0731d.m246b(this.f1161c)) {
            PanelView panelView = this.f1245M;
            if (panelView != null) {
                panelView.setVisibility(8);
            }
            PanelView panelView2 = this.f1417af;
            if (panelView2 != null) {
                panelView2.setVisibility(8);
            }
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: L */
    public final CloseImageView mo770L() {
        if (m869T()) {
            if (this.f1238F == 101) {
                CloseHeaderView closeHeaderView = this.f1416ae;
                if (closeHeaderView != null && closeHeaderView.getCloseImageView() != null) {
                    return this.f1416ae.getCloseImageView();
                }
            } else {
                CountDownCloseView countDownCloseView = this.f1415ad;
                if (countDownCloseView != null) {
                    return countDownCloseView;
                }
            }
        }
        return super.mo770L();
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: N */
    public final ViewGroup mo772N() {
        CloseHeaderView closeHeaderView = this.f1416ae;
        return (closeHeaderView == null || closeHeaderView.getVisibility() != 0 || this.f1416ae.getFeedbackButton() == null) ? super.mo772N() : this.f1416ae.getFeedbackButton();
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: O */
    public final PanelView mo773O() {
        PanelView panelView;
        PanelView panelView2;
        return (C0731d.m245a(this.f1161c, this.f1160b) || (panelView2 = this.f1417af) == null) ? (this.f1239G || this.f1238F == 1 || (panelView = this.f1417af) == null) ? super.mo773O() : panelView : panelView2;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: P */
    public final void mo774P() {
        PanelView panelView;
        if (m771M()) {
            return;
        }
        if (((BaseScreenATView) this).f1267v != 1 || this.f1238F == 100) {
            super.mo774P();
            if (!mo714l() || (panelView = this.f1417af) == null) {
                return;
            }
            panelView.setVisibility(8);
            return;
        }
        BasePlayerView basePlayerView = this.f1244L;
        if (basePlayerView == null || basePlayerView.getParent() == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -getMeasuredWidth(), 0.0f, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.4f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.basead.ui.FullScreenATView.4
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                BasePlayerView basePlayerView2 = FullScreenATView.this.f1244L;
                if (basePlayerView2 != null) {
                    basePlayerView2.post(new Runnable() { // from class: com.anythink.basead.ui.FullScreenATView.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            FullScreenATView.super.mo774P();
                            if (FullScreenATView.this.f1417af != null) {
                                FullScreenATView.this.f1417af.setVisibility(8);
                            }
                        }
                    });
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f1244L.startAnimation(animationSet);
        PanelView panelView2 = this.f1417af;
        if (panelView2 == null || panelView2.getVisibility() != 0) {
            return;
        }
        this.f1417af.startAnimation(animationSet);
    }

    /* JADX INFO: renamed from: Q */
    public final void m874Q() {
        this.f1246N.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (!C0731d.m246b(this.f1161c)) {
            mo773O().setVisibility(0);
        }
        this.f1243K.addView(this.f1246N, 0);
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public void mo669a() {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_full_screen", "layout"), this);
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: a */
    public final void mo775a(long j) {
        int i;
        boolean z = true;
        if (((BaseScreenATView) this).f1267v != 1 || ((i = this.f1238F) != 1 && i != 101)) {
            z = false;
        }
        if (z) {
            return;
        }
        super.mo775a(j);
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final boolean mo705a(String str, IOfferClickHandler iOfferClickHandler) {
        if (!m771M()) {
            return super.mo705a(str, iOfferClickHandler);
        }
        this.f1239G = true;
        boolean zOpenInternalWebView = ((WebLandpagePlayerView) this.f1244L).openInternalWebView(str, iOfferClickHandler);
        if (zOpenInternalWebView) {
            m699a(105);
            C0996a c0996a = this.f1418ag;
            if (c0996a != null) {
                c0996a.m1209a();
            }
        }
        return zOpenInternalWebView;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: b */
    public void mo777b() {
        super.mo777b();
        C0996a c0996a = this.f1418ag;
        if (c0996a != null) {
            c0996a.m1207a(this.f1237E == 8 ? -101 : -100).m1208a(new InterfaceC0995a() { // from class: com.anythink.basead.ui.FullScreenATView.1
                @Override // com.anythink.basead.p025ui.p028c.InterfaceC0995a
                /* JADX INFO: renamed from: a */
                public final void mo672a(int i, int i2) {
                    FullScreenATView.this.mo700a(i, i2);
                }
            }).m1210a(getContext(), this);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: b */
    public final void mo778b(long j) {
        if (!m869T()) {
            super.mo778b(j);
            return;
        }
        CloseHeaderView closeHeaderView = this.f1416ae;
        if (closeHeaderView != null && closeHeaderView.getVisibility() == 0) {
            this.f1416ae.refresh(j);
        }
        CountDownCloseView countDownCloseView = this.f1415ad;
        if (countDownCloseView == null || countDownCloseView.getVisibility() != 0) {
            return;
        }
        this.f1415ad.refresh(j);
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: b */
    public boolean mo779b(int i) {
        return (i == 0 || i == 1 || i == 2 || i == 5 || i == 6) ? C0731d.m244a(this.f1161c) : i == 8;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: c */
    public void mo780c() {
        super.mo780c();
        this.f1415ad = (CountDownCloseView) findViewById(C1345i.m4154a(getContext(), "myoffer_btn_countdown_close_id", "id"));
        this.f1416ae = (CloseHeaderView) findViewById(C1345i.m4154a(getContext(), "myoffer_btn_close_header_view_id", "id"));
        this.f1417af = (PanelView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_view_for_anim_player_id", "id"));
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: c */
    public final void mo782c(long j) {
        if (!m869T()) {
            super.mo782c(j);
            return;
        }
        CloseHeaderView closeHeaderView = this.f1416ae;
        if (closeHeaderView != null && closeHeaderView.getVisibility() == 0) {
            this.f1416ae.setDuration(j);
        }
        CountDownCloseView countDownCloseView = this.f1415ad;
        if (countDownCloseView == null || countDownCloseView.getVisibility() != 0) {
            return;
        }
        this.f1415ad.setDuration(j);
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: d */
    public final void mo783d(int i) {
        if (!m869T()) {
            super.mo783d(i);
        } else {
            this.f1249Q.setVisibility(8);
            this.f1248P.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: n */
    public final int mo716n() {
        return 1;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: o */
    public final void mo784o() {
        super.mo784o();
        if (this.f1244L == null || !m869T()) {
            return;
        }
        Context context = getContext();
        int i = this.f1238F;
        BasePlayerView emptyAnimPlayer = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 101 ? new EmptyAnimPlayer(context) : new WebLandpagePlayerView(context) : new AlbumScaleAnimPlayerView(context) : new ViewPagerAnimPlayerView(context) : new RedPacketAnimPlayerView(context) : new GuideToClickAnimPlayerView(context) : new EmptyAnimPlayer(context);
        emptyAnimPlayer.setVisibility(8);
        ViewGroup viewGroup = (ViewGroup) this.f1244L.getParent();
        viewGroup.addView(emptyAnimPlayer, viewGroup.indexOfChild(this.f1244L), this.f1244L.getLayoutParams());
        viewGroup.removeView(this.f1244L);
        this.f1244L = emptyAnimPlayer;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: q */
    public final void mo786q() {
        if (m771M()) {
            return;
        }
        super.mo786q();
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: r */
    public int mo787r() {
        int i = this.f1237E;
        return i == 8 ? i : this.f1269x < this.f1270y ? this.f1257ab >= this.f1258ac ? 1 : 5 : this.f1257ab < this.f1258ac ? 2 : 6;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: w */
    public final void mo792w() {
        PanelView panelView = this.f1417af;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.f1417af.init(this.f1161c, this.f1160b, this.f1268w, mo713k(), new PanelView.InterfaceC0910a() { // from class: com.anythink.basead.ui.FullScreenATView.2
                @Override // com.anythink.basead.p025ui.PanelView.InterfaceC0910a
                /* JADX INFO: renamed from: a */
                public final void mo798a(int i, int i2) {
                    FullScreenATView.this.mo700a(i, i2);
                }

                @Override // com.anythink.basead.p025ui.PanelView.InterfaceC0910a
                /* JADX INFO: renamed from: a */
                public final boolean mo799a() {
                    if (!FullScreenATView.this.m794y()) {
                        return false;
                    }
                    FullScreenATView.this.mo700a(4, 5);
                    return true;
                }
            });
        }
        super.mo792w();
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: x */
    public void mo793x() {
        super.mo793x();
        if (C0731d.m244a(this.f1161c)) {
            this.f1237E = 0;
        } else {
            this.f1237E = 8;
        }
        PanelView panelView = this.f1245M;
        if (panelView != null) {
            panelView.setLayoutType(this.f1237E);
            if (this.f1237E == 8 && this.f1160b.f4333n.m3251D() == 0) {
                this.f1245M.getCTAButton().setVisibility(8);
            }
        }
        PanelView panelView2 = this.f1417af;
        if (panelView2 != null) {
            panelView2.setLayoutType(this.f1237E);
            if (this.f1237E == 8 && this.f1160b.f4333n.m3251D() == 0) {
                this.f1417af.getCTAButton().setVisibility(8);
            }
        }
    }
}
