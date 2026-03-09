package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.res.C1380d;
import com.anythink.expressad.atsignalcommon.base.BaseWebView;
import com.anythink.expressad.atsignalcommon.base.C1450b;
import com.anythink.expressad.foundation.p138h.C1886t;

/* JADX INFO: loaded from: classes.dex */
public class WindVaneWebView extends BaseWebView {

    /* JADX INFO: renamed from: a */
    private Object f6745a;

    /* JADX INFO: renamed from: b */
    private Object f6746b;

    /* JADX INFO: renamed from: c */
    private String f6747c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1464e f6748d;

    /* JADX INFO: renamed from: f */
    public C1474o f6749f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1463d f6750g;

    /* JADX INFO: renamed from: h */
    public C1468i f6751h;

    /* JADX INFO: renamed from: i */
    private String f6752i;

    /* JADX INFO: renamed from: j */
    private boolean f6753j;

    /* JADX INFO: renamed from: k */
    private float f6754k;

    /* JADX INFO: renamed from: l */
    private float f6755l;

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView$1 */
    public class RunnableC14591 implements Runnable {
        public RunnableC14591() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            WindVaneWebView.m5672a(WindVaneWebView.this);
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.f6753j = false;
        this.f6754k = 0.0f;
        this.f6755l = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6753j = false;
        this.f6754k = 0.0f;
        this.f6755l = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6753j = false;
        this.f6754k = 0.0f;
        this.f6755l = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m5672a(WindVaneWebView windVaneWebView) {
        windVaneWebView.f6753j = true;
        return true;
    }

    @Override // com.anythink.expressad.atsignalcommon.base.BaseWebView
    /* JADX INFO: renamed from: a */
    public final void mo5622a() {
        super.mo5622a();
        getSettings().setSavePassword(false);
        try {
            getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        } catch (Throwable unused) {
            getSettings().setUserAgentString(C1341e.m4073i() + " WindVane/3.0.2");
        }
        if (this.f6749f == null) {
            this.f6749f = new C1474o(this);
        }
        setWebViewChromeClient(this.f6749f);
        C1475p c1475p = new C1475p();
        this.mWebViewClient = c1475p;
        setWebViewClient(c1475p);
        if (this.f6750g == null) {
            InterfaceC1463d c1472m = new C1472m(this.f6673e);
            this.f6750g = c1472m;
            setSignalCommunication(c1472m);
        }
        this.f6751h = new C1468i(this.f6673e, this);
    }

    public void clearWebView() {
        if (this.f6753j) {
            return;
        }
        loadUrl(C1380d.f5563a);
    }

    public String getCampaignId() {
        return this.f6747c;
    }

    public Object getJsObject(String str) {
        C1468i c1468i = this.f6751h;
        if (c1468i == null) {
            return null;
        }
        return c1468i.m5698a(str);
    }

    public Object getMraidObject() {
        return this.f6746b;
    }

    public Object getObject() {
        return this.f6745a;
    }

    public String getRid() {
        return this.f6752i;
    }

    public InterfaceC1463d getSignalCommunication() {
        return this.f6750g;
    }

    public InterfaceC1464e getWebViewListener() {
        return this.f6748d;
    }

    public boolean isDestroyed() {
        return this.f6753j;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1450b c1450b = this.mWebViewClient;
        if (c1450b != null && (c1450b.m5626b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f6754k = motionEvent.getRawX();
                    this.f6755l = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f6754k;
                    float y = motionEvent.getY() - this.f6755l;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48.0f) && ((rawX <= 0.0f || rawX <= 48.0f) && ((y >= 0.0f || (-1.0f) * y <= 48.0f) && (y <= 0.0f || y <= 48.0f)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        if (this.f6751h == null) {
            return;
        }
        C1468i.m5696a(cls);
    }

    public void release() {
        try {
            removeAllViews();
            setDownloadListener(null);
            this.f6745a = null;
            if (C1886t.m9855j(getContext()) != 0) {
                C1175n.m2059a().m2118a(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView.1
                    public RunnableC14591() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.m5672a(WindVaneWebView.this);
                        WindVaneWebView.this.destroy();
                    }
                }, r0 * 1000);
            } else {
                this.f6753j = true;
                destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        C1468i c1468i = this.f6751h;
        if (c1468i != null) {
            c1468i.m5699a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        C1468i c1468i = this.f6751h;
        if (c1468i != null) {
            c1468i.m5700a(obj);
        }
    }

    public void setCampaignId(String str) {
        this.f6747c = str;
    }

    public void setMraidObject(Object obj) {
        this.f6746b = obj;
    }

    public void setObject(Object obj) {
        this.f6745a = obj;
    }

    public void setRid(String str) {
        this.f6752i = str;
    }

    public void setSignalCommunication(InterfaceC1463d interfaceC1463d) {
        this.f6750g = interfaceC1463d;
        interfaceC1463d.mo5677a(this);
    }

    public void setWebViewChromeClient(C1474o c1474o) {
        this.f6749f = c1474o;
        setWebChromeClient(c1474o);
    }

    public void setWebViewListener(InterfaceC1464e interfaceC1464e) {
        this.f6748d = interfaceC1464e;
        C1474o c1474o = this.f6749f;
        if (c1474o != null) {
            c1474o.m5714a(interfaceC1464e);
        }
        C1450b c1450b = this.mWebViewClient;
        if (c1450b != null) {
            c1450b.m5625a(interfaceC1464e);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }
}
