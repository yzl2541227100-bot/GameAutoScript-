package com.iflytek.voiceads.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.res.C1380d;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.download.C2937d;
import com.iflytek.voiceads.listener.DialogListener;
import com.iflytek.voiceads.listener.IFLYAdListener;
import com.iflytek.voiceads.listener.InternalListener;
import com.iflytek.voiceads.p210d.C2920a;
import com.iflytek.voiceads.p210d.C2921b;
import com.iflytek.voiceads.p219f.C2962a;
import com.iflytek.voiceads.p219f.C2963b;
import com.iflytek.voiceads.p219f.InterfaceC2964c;
import com.iflytek.voiceads.p219f.InterfaceC2965d;
import com.iflytek.voiceads.param.C2966a;
import com.iflytek.voiceads.request.C2974a;
import com.iflytek.voiceads.request.C2978e;
import com.iflytek.voiceads.request.C2979f;
import com.iflytek.voiceads.utils.C2983a;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2992j;
import com.iflytek.voiceads.view.HandlerC3020b;
import org.json.JSONArray;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public abstract class AdView extends WebView implements HandlerC3020b.a {

    /* JADX INFO: renamed from: a */
    protected Context f16576a;

    /* JADX INFO: renamed from: b */
    protected RelativeLayout f16577b;

    /* JADX INFO: renamed from: c */
    protected C2963b f16578c;

    /* JADX INFO: renamed from: d */
    protected C2962a f16579d;

    /* JADX INFO: renamed from: e */
    protected C2966a f16580e;

    /* JADX INFO: renamed from: f */
    protected C2921b f16581f;

    /* JADX INFO: renamed from: g */
    protected C2920a f16582g;

    /* JADX INFO: renamed from: h */
    protected C2983a.a f16583h;

    /* JADX INFO: renamed from: i */
    protected C2983a.b f16584i;

    /* JADX INFO: renamed from: j */
    protected IFLYAdListener f16585j;

    /* JADX INFO: renamed from: k */
    protected InternalListener f16586k;

    /* JADX INFO: renamed from: l */
    protected HandlerC3020b f16587l;

    /* JADX INFO: renamed from: m */
    protected HandlerThread f16588m;

    /* JADX INFO: renamed from: n */
    protected HandlerC3019a f16589n;

    /* JADX INFO: renamed from: o */
    protected HandlerC3018a f16590o;

    /* JADX INFO: renamed from: p */
    protected int f16591p;

    /* JADX INFO: renamed from: q */
    C2974a.a f16592q;

    /* JADX INFO: renamed from: r */
    InterfaceC2965d f16593r;

    /* JADX INFO: renamed from: s */
    InterfaceC2964c f16594s;

    /* JADX INFO: renamed from: t */
    private int f16595t;

    /* JADX INFO: renamed from: u */
    private boolean f16596u;

    /* JADX INFO: renamed from: v */
    private final int f16597v;

    /* JADX INFO: renamed from: w */
    private final int f16598w;

    /* JADX INFO: renamed from: x */
    private final int f16599x;

    /* JADX INFO: renamed from: com.iflytek.voiceads.view.AdView$a */
    class HandlerC3018a extends Handler {
        private HandlerC3018a(Looper looper) {
            super(looper);
        }

        /* synthetic */ HandlerC3018a(AdView adView, Looper looper, C3021c c3021c) {
            this(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    C2989g.m13555a("IFLY_AD_SDK", "procMsgShow");
                    AdView.this.m13701a(0);
                    AdView.this.m13712d();
                    AdView.this.mo13719j();
                    ViewGroup viewGroup = (ViewGroup) AdView.this.f16577b.getParent();
                    if (viewGroup != null && viewGroup.getVisibility() == 0) {
                        if (AdView.this.f16580e.m13452c("banner_recycle")) {
                            AdView.this.mo13717h();
                        }
                        AdView.this.f16585j.onAdExposure();
                    } else {
                        AdView.this.f16585j.onAdFailed(new AdError(71002));
                        C2989g.m13557b("IFLY_AD_SDK", "Ad is invisible, invalid exposure!");
                    }
                    break;
                case 2:
                    C2989g.m13555a("IFLY_AD_SDK", "procMsgTimeout:" + AdView.this.getProgress() + "% , " + AdView.this.getContentHeight());
                    if (AdView.this.getContentHeight() <= 0 && AdView.this.m13697q() != C2983a.b.success) {
                        if (AdView.this.f16595t >= 2) {
                            AdView.this.f16595t = 0;
                            AdView.this.f16587l.m13730a(5, 71006);
                        } else {
                            AdView.m13692c(AdView.this);
                            AdView.this.m13696p();
                            C2989g.m13555a("IFLY_AD_SDK", "Loading ad timeout, reload again!");
                        }
                        break;
                    }
                    break;
                case 3:
                    try {
                        String strOptString = AdView.this.f16582g.f16206e.optString("adm");
                        if (TextUtils.isEmpty(strOptString)) {
                            AdView.this.f16587l.m13730a(5, 71002);
                        } else {
                            try {
                                AdView.this.loadDataWithBaseURL(null, strOptString, "text/html", "utf-8", null);
                                AdView.this.mo13720k();
                            } catch (Exception e) {
                                AdView.this.f16587l.m13730a(5, 71007);
                                AdView.this.f16586k.onAdDestroy();
                            }
                        }
                    } catch (Exception e2) {
                        AdView.this.f16587l.m13730a(5, 71007);
                        C2989g.m13557b("IFLY_AD_SDK", "html load:" + e2.getMessage());
                        return;
                    }
                    break;
            }
        }
    }

    protected AdView(Context context) {
        super(context);
        this.f16584i = C2983a.b.init;
        this.f16591p = 0;
        this.f16595t = 0;
        this.f16592q = new C3021c(this);
        this.f16596u = false;
        this.f16593r = new C3022d(this);
        this.f16594s = new C3023e(this);
        this.f16597v = 1;
        this.f16598w = 2;
        this.f16599x = 3;
    }

    protected AdView(Context context, RelativeLayout relativeLayout, String str, C2983a.a aVar, InternalListener internalListener) {
        super(context.getApplicationContext());
        this.f16584i = C2983a.b.init;
        this.f16591p = 0;
        this.f16595t = 0;
        this.f16592q = new C3021c(this);
        this.f16596u = false;
        this.f16593r = new C3022d(this);
        this.f16594s = new C3023e(this);
        this.f16597v = 1;
        this.f16598w = 2;
        this.f16599x = 3;
        this.f16576a = context.getApplicationContext();
        this.f16577b = relativeLayout;
        this.f16583h = aVar;
        this.f16586k = internalListener;
        this.f16590o = new HandlerC3018a(this, context.getMainLooper(), null);
        this.f16581f = new C2921b(this.f16576a.getApplicationContext());
        this.f16580e = new C2966a(str);
        m13694n();
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m13688a(C2983a.b bVar) {
        this.f16584i = bVar;
    }

    /* JADX INFO: renamed from: b */
    public void m13691b(String str) throws AdError {
        int iOptInt;
        int iOptInt2;
        this.f16581f.m13296a(str);
        this.f16582g = this.f16581f.f16233f;
        if (70200 != this.f16581f.f16228a) {
            this.f16587l.m13730a(5, this.f16581f.f16228a);
            return;
        }
        try {
            iOptInt = this.f16582g.f16206e.optInt("width");
            iOptInt2 = this.f16582g.f16206e.optInt("height");
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "html parse2:" + e.getMessage());
        }
        if (iOptInt <= 0 || iOptInt2 <= 0) {
            this.f16587l.m13730a(5, 71007);
            return;
        }
        this.f16580e.m13446a(iOptInt);
        this.f16580e.m13450b(iOptInt2);
        this.f16587l.m13730a(2, this.f16581f.f16228a);
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ int m13692c(AdView adView) {
        int i = adView.f16595t;
        adView.f16595t = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: n */
    private void m13694n() {
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        this.f16587l = new HandlerC3020b(m13695o().getLooper(), this);
        this.f16589n = new HandlerC3019a();
        this.f16589n.m13727a(this.f16586k);
        setBackgroundColor(0);
        getSettings().setCacheMode(2);
        if (Build.VERSION.SDK_INT >= 16) {
            getSettings().setAllowUniversalAccessFromFileURLs(true);
        }
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        m13701a(8);
        this.f16578c = new C2963b(this.f16593r);
        setWebViewClient(this.f16578c);
        this.f16579d = new C2962a(this.f16594s);
        setWebChromeClient(this.f16579d);
    }

    /* JADX INFO: renamed from: o */
    private HandlerThread m13695o() {
        this.f16588m = new HandlerThread("" + this.f16583h);
        this.f16588m.start();
        return this.f16588m;
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m13696p() {
        try {
            m13688a(C2983a.b.start);
            Message message = new Message();
            message.obj = this.f16581f;
            message.what = 3;
            this.f16590o.sendMessage(message);
        } catch (Exception e) {
            this.f16587l.m13730a(5, 71007);
            C2989g.m13557b("IFLY_AD_SDK", "ShowAd:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    public synchronized C2983a.b m13697q() {
        return this.f16584i;
    }

    /* JADX INFO: renamed from: r */
    private void m13698r() {
        if (this.f16589n.hasMessages(4)) {
            C2989g.m13555a("IFLY_AD_SDK", "移除关闭广告msg");
            this.f16589n.removeMessages(4);
            this.f16596u = true;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m13699s() {
        if (this.f16596u) {
            C2989g.m13555a("IFLY_AD_SDK", "添加关闭广告msg");
            this.f16589n.m13724a(4, 2000);
        }
    }

    @Override // com.iflytek.voiceads.view.HandlerC3020b.a
    /* JADX INFO: renamed from: a */
    public void mo13700a() {
        m13696p();
    }

    /* JADX INFO: renamed from: a */
    public void m13701a(int i) {
        if (this.f16577b == null) {
            return;
        }
        setVisibility(i);
        this.f16577b.setVisibility(i);
        for (int i2 = 0; i2 < this.f16577b.getChildCount(); i2++) {
            this.f16577b.getChildAt(i2).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m13702a(int i, int i2) {
        C2989g.m13555a("IFLY_AD_SDK", "AdView setLayoutParam()");
        RelativeLayout.LayoutParams layoutParamsM13707b = m13707b(i, i2);
        if (getParent() == null) {
            this.f16577b.removeAllViews();
            this.f16577b.addView(this, layoutParamsM13707b);
        }
    }

    @Override // com.iflytek.voiceads.view.HandlerC3020b.a
    /* JADX INFO: renamed from: a */
    public void mo13703a(Message message) {
        try {
            mo13713d(message);
        } catch (Exception e) {
            this.f16587l.m13730a(5, 71003);
            C2989g.m13557b("IFLY_AD_SDK", "Request:" + e.getMessage());
        } catch (AdError e2) {
            this.f16587l.m13730a(5, e2.getErrorCode());
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void mo13704a(IFLYAdListener iFLYAdListener) {
        if (iFLYAdListener == null) {
            C2989g.m13557b("IFLY_AD_SDK", "invalid IFLYAdListener!");
        } else if (C2983a.c.exit == this.f16587l.m13728a()) {
            C2989g.m13555a("IFLY_AD_SDK", "ad is exited!");
        } else if (C2983a.c.init == this.f16587l.m13728a() || C2983a.c.end == this.f16587l.m13728a()) {
            if (this.f16580e.m13452c("debug_mode")) {
                C2989g.m13556a(true);
            } else {
                C2989g.m13556a(false);
            }
            this.f16585j = iFLYAdListener;
            this.f16589n.m13726a(iFLYAdListener);
            this.f16587l.m13729a(1);
        } else {
            C2989g.m13555a("IFLY_AD_SDK", "ad is requesting, please retry a little later!");
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m13705a(String str) {
        int i = this.f16582g.f16200M;
        C2989g.m13555a("IFLY_AD_SDK", "clickAd: actionType=" + i);
        if (!URLUtil.isValidUrl(str) || str.equals(C1380d.f5563a)) {
            C2989g.m13555a("IFLY_AD_SDK", "Invalid click url: " + str);
            return;
        }
        switch (i) {
            case 3:
                C2937d c2937dM13333a = C2937d.m13333a(this.f16576a.getApplicationContext());
                c2937dM13333a.m13367a((DialogListener) this.f16585j);
                c2937dM13333a.m13368a(this.f16580e.m13452c("download_alert"));
                c2937dM13333a.m13365a(this.f16576a, this.f16581f.f16233f, str);
                C2989g.m13555a("IFLY_AD_SDK", "AdView startDownload");
                break;
            default:
                C2978e.m13528a(this.f16576a, str, this.f16580e, this.f16581f.f16230c);
                break;
        }
        C2989g.m13555a("IFLY_AD_SDK", "点击监控");
        try {
            if (this.f16582g.f16197J != null && this.f16582g.f16197J.has("click_urls")) {
                C2992j.m13570a(this.f16582g.f16197J.optJSONArray("click_urls"), this.f16576a, 2);
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "html click:" + e.getMessage());
        }
        this.f16585j.onAdClick();
    }

    /* JADX INFO: renamed from: a */
    public void m13706a(String str, Object obj) {
        this.f16580e.m13447a(str, obj);
    }

    /* JADX INFO: renamed from: b */
    protected RelativeLayout.LayoutParams m13707b(int i, int i2) {
        return new RelativeLayout.LayoutParams(i, i2);
    }

    @Override // com.iflytek.voiceads.view.HandlerC3020b.a
    /* JADX INFO: renamed from: b */
    public void mo13708b() {
        this.f16590o.sendEmptyMessage(1);
        this.f16587l.m13733a(C2983a.c.end);
        try {
            if (this.f16582g.f16197J != null && this.f16582g.f16197J.has("impress_urls")) {
                JSONArray jSONArrayM13569a = C2992j.m13569a(this.f16580e.m13454e("auction_price"), this.f16582g.f16197J.optJSONArray("impress_urls"));
                if (jSONArrayM13569a != null) {
                    C2992j.m13570a(jSONArrayM13569a, this.f16576a, 1);
                } else {
                    C2989g.m13557b("IFLY_AD_SDK", "impArray null");
                }
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "Show:" + e.getMessage());
        }
        C2989g.m13555a("IFLY_AD_SDK", "procMsgShow successfully!");
    }

    @Override // com.iflytek.voiceads.view.HandlerC3020b.a
    /* JADX INFO: renamed from: b */
    public void mo13709b(Message message) {
        this.f16590o.sendEmptyMessage(2);
        C2989g.m13555a("IFLY_AD_SDK", "procMsgTimeout " + message.obj);
    }

    @Override // com.iflytek.voiceads.view.HandlerC3020b.a
    /* JADX INFO: renamed from: c */
    public void mo13710c() {
        this.f16585j.onAdClose();
        m13718i();
        this.f16576a = null;
    }

    @Override // com.iflytek.voiceads.view.HandlerC3020b.a
    /* JADX INFO: renamed from: c */
    public void mo13711c(Message message) {
        C2989g.m13555a("IFLY_AD_SDK", "procMsgEnd:" + message.obj);
        int errorCode = 0;
        if (message.obj != null) {
            AdError adError = new AdError(((Integer) message.obj).intValue());
            errorCode = adError.getErrorCode();
            this.f16589n.m13725a(1, adError);
        }
        if (70403 == errorCode || !this.f16580e.m13452c("banner_recycle")) {
            return;
        }
        mo13717h();
    }

    /* JADX INFO: renamed from: d */
    protected void m13712d() {
        if (C2983a.a.BANNER != this.f16583h) {
            requestFocus();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: d */
    protected synchronized void mo13713d(Message message) throws Exception {
        C2979f.m13529a(this.f16576a.getApplicationContext(), this.f16580e, this.f16592q);
    }

    /* JADX INFO: renamed from: e */
    protected int m13714e() {
        int iM13453d = this.f16580e.m13453d("banner_interval");
        if (iM13453d < 15 || iM13453d > 40) {
            return 30000;
        }
        return iM13453d * 1000;
    }

    /* JADX INFO: renamed from: f */
    protected boolean m13715f() {
        return this.f16580e.m13452c("banner_recycle");
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m13716g() {
        this.f16587l.m13730a(3, 70200);
    }

    /* JADX INFO: renamed from: h */
    protected synchronized void mo13717h() {
    }

    /* JADX INFO: renamed from: i */
    protected void m13718i() {
        this.f16587l.removeCallbacksAndMessages(null);
        this.f16588m.quit();
    }

    /* JADX INFO: renamed from: j */
    protected void mo13719j() {
    }

    /* JADX INFO: renamed from: k */
    protected abstract void mo13720k();

    /* JADX INFO: renamed from: l */
    public void m13721l() {
        mo13710c();
    }

    /* JADX INFO: renamed from: m */
    protected void m13722m() {
        if (m13697q() != C2983a.b.success) {
            int visibility = getVisibility();
            m13688a(C2983a.b.success);
            this.f16585j.onAdReceive();
            C2989g.m13555a("IFLY_AD_SDK", "onAdPageFinished:" + visibility);
        }
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                if (C2983a.a.INTERSTITIAL.equals(this.f16583h) && this.f16580e.m13452c("back_key_enable")) {
                    this.f16586k.onAdDestroy();
                    this.f16585j.onAdClose();
                    return true;
                }
                break;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 1:
                this.f16578c.m13435a(true);
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f16591p = i;
        C2989g.m13555a("IFLY_AD_SDK", "ad view visibility=" + this.f16591p);
        if (this.f16591p == 8 || this.f16591p == 4) {
            m13698r();
        }
        if (this.f16591p == 0) {
            m13699s();
        }
    }
}
