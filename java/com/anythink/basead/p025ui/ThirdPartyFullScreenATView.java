package com.anythink.basead.p025ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p010a.C0732e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p021e.AbstractC0778h;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p025ui.PanelView;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.p051b.InterfaceC1174m;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceC1312a;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.p066o.C1345i;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class ThirdPartyFullScreenATView extends BaseScreenATView {
    public static final String TAG = ThirdPartyFullScreenATView.class.getSimpleName();

    /* JADX INFO: renamed from: ad */
    public View f1764ad;

    /* JADX INFO: renamed from: ae */
    public Timer f1765ae;

    /* JADX INFO: renamed from: af */
    private BaseAd f1766af;

    /* JADX INFO: renamed from: ag */
    private final InterfaceC1312a f1767ag;

    /* JADX INFO: renamed from: ah */
    private final InterfaceRunnableC1313b f1768ah;

    /* JADX INFO: renamed from: com.anythink.basead.ui.ThirdPartyFullScreenATView$3 */
    public class RunnableC09533 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1771a;

        public RunnableC09533(int i) {
            this.f1771a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f1771a * 1000;
            CountDownView countDownView = ThirdPartyFullScreenATView.this.f1248P;
            if (countDownView != null && countDownView.getVisibility() == 0) {
                ThirdPartyFullScreenATView.this.f1248P.refresh(i);
            }
            ThirdPartyFullScreenATView thirdPartyFullScreenATView = ThirdPartyFullScreenATView.this;
            int i2 = thirdPartyFullScreenATView.f1235C;
            if (i2 < 0 || i < i2) {
                return;
            }
            thirdPartyFullScreenATView.mo767I();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.ThirdPartyFullScreenATView$6 */
    public class C09566 extends TimerTask {
        public C09566() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ThirdPartyFullScreenATView thirdPartyFullScreenATView = ThirdPartyFullScreenATView.this;
            ThirdPartyFullScreenATView.m1065a(thirdPartyFullScreenATView, (int) thirdPartyFullScreenATView.f1766af.getVideoProgress());
        }
    }

    public ThirdPartyFullScreenATView(Context context) {
        super(context);
        this.f1767ag = C1315d.m3806a();
        this.f1768ah = new InterfaceRunnableC1313b() { // from class: com.anythink.basead.ui.ThirdPartyFullScreenATView.1
            @Override // java.lang.Runnable
            public final void run() {
                ThirdPartyFullScreenATView.this.mo767I();
            }
        };
    }

    public ThirdPartyFullScreenATView(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, String str, int i, int i2, BaseAd baseAd) {
        super(context, c1248m, abstractC1247l, str, i, i2);
        this.f1767ag = C1315d.m3806a();
        this.f1768ah = new InterfaceRunnableC1313b() { // from class: com.anythink.basead.ui.ThirdPartyFullScreenATView.1
            @Override // java.lang.Runnable
            public final void run() {
                ThirdPartyFullScreenATView.this.mo767I();
            }
        };
        this.f1766af = baseAd;
        this.f1764ad = baseAd.getAdMediaView(new Object[0]);
        setId(C1345i.m4154a(getContext(), "myoffer_thirdparty_full_screen_view_id", "id"));
    }

    /* JADX INFO: renamed from: Q */
    private void m1056Q() {
        int i = this.f1235C;
        if (i < 0) {
            return;
        }
        if (i > 0) {
            this.f1767ag.mo3800a(this.f1768ah, i, true);
        } else {
            mo767I();
        }
    }

    /* JADX INFO: renamed from: R */
    private void m1057R() {
        View cTAButton;
        ArrayList arrayList = new ArrayList();
        int iM3251D = this.f1160b.f4333n.m3251D();
        if (iM3251D == 0) {
            arrayList.addAll(this.f1245M.getClickViews());
            arrayList.add(this.f1245M);
            cTAButton = this.f1246N;
            if (cTAButton != null) {
                arrayList.add(cTAButton);
            }
        } else if (iM3251D != 1) {
            if (iM3251D == 2) {
                arrayList.addAll(this.f1245M.getClickViews());
                cTAButton = this.f1245M;
                arrayList.add(cTAButton);
            }
        } else if (this.f1245M.getCTAButton() != null) {
            cTAButton = this.f1245M.getCTAButton();
            arrayList.add(cTAButton);
        }
        this.f1766af.registerListener(this, arrayList, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        r0.width = r6.f1269x;
        r0.height = r3;
        r6.f1245M.setLayoutParams(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1058S() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.ThirdPartyFullScreenATView.m1058S():void");
    }

    /* JADX INFO: renamed from: T */
    private void m1059T() {
        this.f1246N.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        mo773O().setVisibility(0);
        this.f1243K.addView(this.f1246N, 1);
    }

    /* JADX INFO: renamed from: U */
    private void m1060U() {
        if (this.f1765ae == null) {
            Timer timer = new Timer();
            this.f1765ae = timer;
            timer.schedule(new C09566(), 0L, 300L);
        }
    }

    /* JADX INFO: renamed from: V */
    private void m1061V() {
        Timer timer = this.f1765ae;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* JADX INFO: renamed from: W */
    private void m1062W() {
        Timer timer = this.f1765ae;
        if (timer != null) {
            timer.cancel();
            this.f1765ae = null;
        }
        this.f1767ag.mo3801b(this.f1768ah);
    }

    /* JADX INFO: renamed from: X */
    private boolean m1063X() {
        BaseAd baseAd = this.f1766af;
        return (baseAd == null || !TextUtils.equals(baseAd.getAdType(), "1") || this.f1764ad == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1064a(ThirdPartyFullScreenATView thirdPartyFullScreenATView) {
        if (thirdPartyFullScreenATView.f1765ae == null) {
            Timer timer = new Timer();
            thirdPartyFullScreenATView.f1765ae = timer;
            timer.schedule(thirdPartyFullScreenATView.new C09566(), 0L, 300L);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1065a(ThirdPartyFullScreenATView thirdPartyFullScreenATView, int i) {
        thirdPartyFullScreenATView.post(thirdPartyFullScreenATView.new RunnableC09533(i));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1066b(ThirdPartyFullScreenATView thirdPartyFullScreenATView) {
        Timer timer = thirdPartyFullScreenATView.f1765ae;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1068e(int i) {
        post(new RunnableC09533(i));
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: B */
    public final void mo760B() {
        super.m781c(1);
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: I */
    public final void mo767I() {
        super.mo767I();
        this.f1767ag.mo3801b(this.f1768ah);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r0.width = r6.f1269x;
        r0.height = r3;
        r6.f1245M.setLayoutParams(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo768J() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.ThirdPartyFullScreenATView.mo768J():void");
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: K */
    public final void mo769K() {
        View view = this.f1764ad;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.f1764ad.getParent()).removeView(this.f1764ad);
        }
        CountDownView countDownView = this.f1248P;
        if (countDownView != null) {
            countDownView.setVisibility(8);
        }
        MuteImageView muteImageView = this.f1251S;
        if (muteImageView != null) {
            muteImageView.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo669a() {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_thirdparty_full_screen", "layout"), this);
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: b */
    public final boolean mo779b(int i) {
        return (i == 0 || i == 1 || i == 2 || i == 5 || i == 6) ? C0731d.m244a(this.f1161c) : i == 8;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView, com.anythink.basead.p025ui.BaseATView
    public void destroy() {
        super.destroy();
        Timer timer = this.f1765ae;
        if (timer != null) {
            timer.cancel();
            this.f1765ae = null;
        }
        this.f1767ag.mo3801b(this.f1768ah);
        BaseAd baseAd = this.f1766af;
        if (baseAd != null) {
            baseAd.clear(this);
            this.f1766af.destroy();
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    public void init() {
        mo777b();
        this.f1236D = mo779b(this.f1237E);
        this.f1766af.setNativeEventListener(new InterfaceC1174m() { // from class: com.anythink.basead.ui.ThirdPartyFullScreenATView.2
            @Override // com.anythink.core.common.p051b.InterfaceC1174m
            /* JADX INFO: renamed from: a */
            public final void mo1069a(String str, String str2) {
                ThirdPartyFullScreenATView.this.mo786q();
                ThirdPartyFullScreenATView.this.m776a(C0748f.m310a(str, str2));
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdClicked(View view) {
                AbstractC0778h abstractC0778h = ThirdPartyFullScreenATView.this.f1252T;
                if (abstractC0778h != null) {
                    abstractC0778h.mo463b(new C0779i().m559a(1, 13));
                }
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdDislikeButtonClick() {
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdImpressed() {
                AbstractC0778h abstractC0778h = ThirdPartyFullScreenATView.this.f1252T;
                if (abstractC0778h != null) {
                    abstractC0778h.mo460a(new C0779i());
                }
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdVideoEnd() {
                ThirdPartyFullScreenATView.m1066b(ThirdPartyFullScreenATView.this);
                ThirdPartyFullScreenATView.this.mo767I();
                AbstractC0778h abstractC0778h = ThirdPartyFullScreenATView.this.f1252T;
                if (abstractC0778h != null) {
                    abstractC0778h.mo462b();
                }
                ThirdPartyFullScreenATView.this.mo786q();
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdVideoProgress(int i) {
                ThirdPartyFullScreenATView.m1066b(ThirdPartyFullScreenATView.this);
                ThirdPartyFullScreenATView.m1065a(ThirdPartyFullScreenATView.this, i);
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onAdVideoStart() {
                ThirdPartyFullScreenATView.m1064a(ThirdPartyFullScreenATView.this);
                AbstractC0778h abstractC0778h = ThirdPartyFullScreenATView.this.f1252T;
                if (abstractC0778h != null) {
                    abstractC0778h.mo458a();
                }
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onDeeplinkCallback(boolean z) {
            }

            @Override // com.anythink.core.common.p051b.InterfaceC1173l
            public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            }
        });
        if (!this.f1239G) {
            int i = ((BaseScreenATView) this).f1267v;
            if (1 == i || 3 != i) {
                return;
            }
            if (m1063X()) {
                mo785p();
                int i2 = this.f1235C;
                if (i2 >= 0) {
                    if (i2 > 0) {
                        this.f1767ag.mo3800a(this.f1768ah, i2, true);
                        return;
                    } else {
                        mo767I();
                        return;
                    }
                }
                return;
            }
        }
        mo786q();
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: p */
    public final void mo785p() {
        View view = this.f1764ad;
        if (view != null) {
            this.f1243K.addView(view, 0, new RelativeLayout.LayoutParams(-1, -1));
            mo782c(((int) this.f1766af.getVideoDuration()) * 1000);
            mo763E();
            m1057R();
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: r */
    public final int mo787r() {
        int i = this.f1237E;
        return i == 8 ? i : this.f1269x < this.f1270y ? this.f1255W >= this.f1256aa ? 1 : 5 : this.f1255W < this.f1256aa ? 2 : 6;
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: v */
    public final void mo791v() {
        String strM3239y = this.f1161c.m3239y();
        if (TextUtils.isEmpty(strM3239y)) {
            return;
        }
        C0732e.m247a();
        int[] iArrM4026a = C1339c.m4026a(C0732e.m248a(2, strM3239y));
        if (iArrM4026a != null) {
            int i = iArrM4026a[0];
            this.f1257ab = i;
            int i2 = iArrM4026a[1];
            this.f1258ac = i2;
            this.f1255W = i;
            this.f1256aa = i2;
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: w */
    public final void mo792w() {
        PanelView panelView = this.f1245M;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.f1245M.init(this.f1161c, this.f1160b, this.f1268w, false, new PanelView.InterfaceC0910a() { // from class: com.anythink.basead.ui.ThirdPartyFullScreenATView.4
                @Override // com.anythink.basead.p025ui.PanelView.InterfaceC0910a
                /* JADX INFO: renamed from: a */
                public final void mo798a(int i, int i2) {
                }

                @Override // com.anythink.basead.p025ui.PanelView.InterfaceC0910a
                /* JADX INFO: renamed from: a */
                public final boolean mo799a() {
                    return false;
                }
            });
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: x */
    public final void mo793x() {
        super.mo793x();
        if (this.f1245M != null) {
            if (C0731d.m244a(this.f1161c)) {
                this.f1237E = 0;
            } else {
                this.f1237E = 8;
            }
            this.f1245M.setLayoutType(this.f1237E);
            if (this.f1237E == 8 && this.f1160b.f4333n.m3251D() == 0) {
                this.f1245M.getCTAButton().setVisibility(8);
            }
            this.f1245M.setVisibility(0);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseScreenATView
    /* JADX INFO: renamed from: z */
    public final void mo795z() {
        MuteImageView muteImageView = this.f1251S;
        if (muteImageView == null) {
            return;
        }
        muteImageView.setMute(this.f1241I);
        this.f1251S.setVisibility(4);
        this.f1251S.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.ThirdPartyFullScreenATView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdPartyFullScreenATView thirdPartyFullScreenATView = ThirdPartyFullScreenATView.this;
                if (thirdPartyFullScreenATView.f1764ad == null || thirdPartyFullScreenATView.f1251S == null || thirdPartyFullScreenATView.f1766af == null) {
                    return;
                }
                ThirdPartyFullScreenATView thirdPartyFullScreenATView2 = ThirdPartyFullScreenATView.this;
                boolean z = !thirdPartyFullScreenATView2.f1241I;
                thirdPartyFullScreenATView2.f1241I = z;
                thirdPartyFullScreenATView2.f1251S.setMute(z);
                ThirdPartyFullScreenATView.this.f1766af.setVideoMute(ThirdPartyFullScreenATView.this.f1241I);
            }
        });
    }
}
