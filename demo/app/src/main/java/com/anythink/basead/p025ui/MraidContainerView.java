package com.anythink.basead.p025ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.anythink.basead.mraid.AbstractC0799b;
import com.anythink.basead.mraid.C0801d;
import com.anythink.basead.mraid.MraidWebView;
import com.anythink.basead.p010a.p012b.C0724c;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p025ui.ClickToReLoadView;
import com.anythink.core.basead.p044b.C1121c;
import com.anythink.core.basead.p045ui.web.WebLandPageActivity;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.res.C1380d;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.mbbanner.p139a.p140a.C1900a;

/* JADX INFO: loaded from: classes.dex */
public class MraidContainerView extends FrameLayout {
    public static final int ENDCARD_INIT = 1;
    public static final int LOAD_RETRY_CLICK = 3;
    public static final int PRE_LOAD = 5;
    public static final int VISIABLE_CLICK = 4;
    public static final int WINDOW_ATTACH_CHECK = 2;

    /* JADX INFO: renamed from: j */
    private static final String f1500j = MraidContainerView.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public AbstractC1247l f1501a;

    /* JADX INFO: renamed from: b */
    public AbstractC1249n f1502b;

    /* JADX INFO: renamed from: c */
    public C1248m f1503c;

    /* JADX INFO: renamed from: d */
    public C0987b f1504d;

    /* JADX INFO: renamed from: e */
    public ClickToReLoadView f1505e;

    /* JADX INFO: renamed from: f */
    public MraidWebView f1506f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0889a f1507g;

    /* JADX INFO: renamed from: h */
    public boolean f1508h;

    /* JADX INFO: renamed from: i */
    public boolean f1509i;

    /* JADX INFO: renamed from: k */
    private boolean f1510k;

    /* JADX INFO: renamed from: l */
    private boolean f1511l;

    /* JADX INFO: renamed from: m */
    private boolean f1512m;

    /* JADX INFO: renamed from: n */
    private boolean f1513n;

    /* JADX INFO: renamed from: com.anythink.basead.ui.MraidContainerView$a */
    public interface InterfaceC0889a {
        /* JADX INFO: renamed from: a */
        void mo890a();

        /* JADX INFO: renamed from: a */
        void mo891a(String str);

        /* JADX INFO: renamed from: b */
        void mo892b();

        /* JADX INFO: renamed from: c */
        void mo893c();
    }

    public MraidContainerView(@NonNull Context context) {
        super(context);
    }

    public MraidContainerView(@NonNull Context context, AbstractC1247l abstractC1247l, C1248m c1248m, InterfaceC0889a interfaceC0889a) {
        super(context);
        this.f1501a = abstractC1247l;
        this.f1502b = c1248m.f4333n;
        this.f1503c = c1248m;
        this.f1507g = interfaceC0889a;
        setBackgroundColor(getResources().getColor(C1345i.m4154a(context, "color_99000000", C1875i.f11529d)));
    }

    /* JADX INFO: renamed from: a */
    private void m895a(int i) {
        if (C0724c.m199a(this.f1503c, this.f1501a)) {
            return;
        }
        loadMraidWebView(i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m896a(MraidContainerView mraidContainerView) {
        mraidContainerView.f1512m = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized boolean m898a(String str) {
        boolean z;
        if (this.f1508h) {
            z = false;
        } else {
            C1121c c1121c = new C1121c();
            c1121c.f2751c = this.f1501a;
            c1121c.f2756h = this.f1503c;
            c1121c.f2754f = str;
            c1121c.f2757i = 2;
            WebLandPageActivity.m1779a(C1175n.m2059a().m2148f(), c1121c);
            z = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m899b() {
        MraidWebView mraidWebViewM201b = C0724c.m201b(C0724c.m202b(this.f1503c, this.f1501a));
        this.f1506f = mraidWebViewM201b;
        if (mraidWebViewM201b != null) {
            this.f1513n = true;
            if (this.f1511l) {
                mraidWebViewM201b.setNeedRegisterVolumeChangeReceiver(true);
            }
            this.f1506f.prepare(getContext(), new AbstractC0799b() { // from class: com.anythink.basead.ui.MraidContainerView.1
                @Override // com.anythink.basead.mraid.AbstractC0799b
                /* JADX INFO: renamed from: a */
                public final void mo651a() {
                    InterfaceC0889a interfaceC0889a = MraidContainerView.this.f1507g;
                    if (interfaceC0889a != null) {
                        interfaceC0889a.mo892b();
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
                public final void close() {
                }

                @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
                public final void open(String str) {
                    MraidContainerView mraidContainerView = MraidContainerView.this;
                    if (mraidContainerView.f1507g == null || mraidContainerView.m898a(str)) {
                        return;
                    }
                    MraidContainerView.this.f1507g.mo891a(str);
                    MraidContainerView.this.f1508h = false;
                }
            });
            this.f1506f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.f1506f);
            m901c();
            InterfaceC0889a interfaceC0889a = this.f1507g;
            if (interfaceC0889a != null) {
                interfaceC0889a.mo890a();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m901c() {
        if (this.f1501a.m3196g() <= 0 || this.f1501a.m3199h() <= 0) {
            return;
        }
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.anythink.basead.ui.MraidContainerView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                try {
                    MraidContainerView mraidContainerView = MraidContainerView.this;
                    if (!mraidContainerView.f1509i) {
                        mraidContainerView.f1509i = true;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mraidContainerView.f1506f.getLayoutParams();
                        layoutParams.width = C1345i.m4153a(C1175n.m2059a().m2148f(), MraidContainerView.this.f1501a.m3196g());
                        layoutParams.height = C1345i.m4153a(C1175n.m2059a().m2148f(), MraidContainerView.this.f1501a.m3199h());
                        int width = (MraidContainerView.this.getWidth() - MraidContainerView.this.getPaddingLeft()) - MraidContainerView.this.getPaddingRight();
                        int height = (MraidContainerView.this.getHeight() - MraidContainerView.this.getPaddingBottom()) - MraidContainerView.this.getPaddingTop();
                        float fM3196g = MraidContainerView.this.f1501a.m3196g() / (MraidContainerView.this.f1501a.m3199h() * 1.0f);
                        layoutParams.width = Math.min(width, layoutParams.width);
                        int iMin = Math.min(height, layoutParams.height);
                        layoutParams.height = iMin;
                        int i = layoutParams.width;
                        float f = i / (iMin * 1.0f);
                        if (f > fM3196g) {
                            layoutParams.width = (int) (iMin * fM3196g);
                        } else if (f < fM3196g) {
                            layoutParams.height = (int) (i / fM3196g);
                        }
                        layoutParams.gravity = 17;
                    }
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m903d() {
        if (this.f1505e == null) {
            ClickToReLoadView clickToReLoadView = new ClickToReLoadView(getContext());
            this.f1505e = clickToReLoadView;
            clickToReLoadView.setListener(new ClickToReLoadView.InterfaceC0858a() { // from class: com.anythink.basead.ui.MraidContainerView.4
                @Override // com.anythink.basead.p025ui.ClickToReLoadView.InterfaceC0858a
                /* JADX INFO: renamed from: a */
                public final void mo845a() {
                    MraidContainerView.this.loadMraidWebView(3);
                }
            });
        }
        addView(this.f1505e, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: e */
    private void m905e() {
        ClickToReLoadView clickToReLoadView = this.f1505e;
        if (clickToReLoadView != null) {
            removeView(clickToReLoadView);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m906f() {
        C0987b c0987b = this.f1504d;
        if (c0987b != null) {
            c0987b.m1169b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m907g() {
        C0987b c0987b = this.f1504d;
        if (c0987b != null) {
            c0987b.m1170c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1508h = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void fireAudioVolumeChange(boolean z) {
        try {
            if (!this.f1513n || this.f1506f == null) {
                return;
            }
            if (z) {
                CallMraidJS.getInstance().fireAudioVolumeChange(this.f1506f, 0.0d);
            } else {
                CallMraidJS.getInstance().fireAudioVolumeChange(this.f1506f, 1.0d);
            }
        } catch (Exception unused) {
        }
    }

    public void fireMraidIsViewable(boolean z) {
        MraidWebView mraidWebView;
        try {
            if (!this.f1513n || (mraidWebView = this.f1506f) == null) {
                return;
            }
            if (z) {
                C1900a.m9897a(mraidWebView, true);
            } else {
                C1900a.m9897a(mraidWebView, false);
            }
        } catch (Throwable unused) {
        }
    }

    public void init() {
        if (C0724c.m199a(this.f1503c, this.f1501a)) {
            m899b();
            return;
        }
        C0987b c0987b = new C0987b(this);
        this.f1504d = c0987b;
        c0987b.m1168a();
    }

    public void loadMraidWebView(final int i) {
        if (this.f1512m || this.f1513n) {
            return;
        }
        this.f1512m = true;
        ClickToReLoadView clickToReLoadView = this.f1505e;
        if (clickToReLoadView != null) {
            removeView(clickToReLoadView);
        }
        C0987b c0987b = this.f1504d;
        if (c0987b != null) {
            c0987b.m1169b();
        }
        final String strM662a = C0801d.m662a(this.f1503c, this.f1501a);
        if (!TextUtils.isEmpty(strM662a)) {
            final String strM202b = C0724c.m202b(this.f1503c, this.f1501a);
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.ui.MraidContainerView.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        MraidContainerView.this.f1506f = new MraidWebView(C1175n.m2059a().m2148f());
                        String str = strM202b;
                        String str2 = strM662a;
                        MraidWebView mraidWebView = MraidContainerView.this.f1506f;
                        C0801d.a aVar = new C0801d.a() { // from class: com.anythink.basead.ui.MraidContainerView.3.1
                            @Override // com.anythink.basead.mraid.C0801d.a
                            /* JADX INFO: renamed from: a */
                            public final void mo189a() {
                                String unused = MraidContainerView.f1500j;
                                MraidContainerView.m896a(MraidContainerView.this);
                                MraidContainerView.this.m899b();
                                MraidContainerView.this.m907g();
                            }

                            @Override // com.anythink.basead.mraid.C0801d.a
                            /* JADX INFO: renamed from: a */
                            public final void mo190a(C0747e c0747e) {
                                MraidContainerView.m896a(MraidContainerView.this);
                                String unused = MraidContainerView.f1500j;
                                new StringBuilder("onFailed: ").append(c0747e.m309c());
                                MraidContainerView.this.m903d();
                                MraidContainerView.this.m907g();
                            }
                        };
                        MraidContainerView mraidContainerView = MraidContainerView.this;
                        C0801d.m663a(str, str2, mraidWebView, aVar, mraidContainerView.f1501a, mraidContainerView.f1503c, i);
                    } catch (Throwable th) {
                        MraidContainerView.m896a(MraidContainerView.this);
                        String unused = MraidContainerView.f1500j;
                        new StringBuilder("onFailed with exception: ").append(th.getMessage());
                        MraidContainerView.this.m907g();
                        InterfaceC0889a interfaceC0889a = MraidContainerView.this.f1507g;
                        if (interfaceC0889a != null) {
                            th.getMessage();
                            interfaceC0889a.mo893c();
                        }
                    }
                }
            });
        } else {
            this.f1512m = false;
            m903d();
            m907g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1510k = true;
        m895a(2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1510k = false;
    }

    public void release() {
        MraidWebView mraidWebView;
        try {
            if (this.f1513n && (mraidWebView = this.f1506f) != null) {
                C1360x.m4265a(mraidWebView);
                this.f1506f.release();
                C1380d.m4520a(C1175n.m2059a().m2148f()).m4526a(this.f1503c, this.f1501a);
            }
            C1360x.m4265a(this);
        } catch (Throwable unused) {
        }
    }

    public void setNeedRegisterVolumeChangeReceiver(boolean z) {
        this.f1511l = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f1510k) {
            m895a(4);
        }
    }
}
