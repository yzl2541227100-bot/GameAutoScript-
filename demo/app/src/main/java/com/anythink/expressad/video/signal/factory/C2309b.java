package com.anythink.expressad.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.p154bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.signal.InterfaceC2192a;
import com.anythink.expressad.video.signal.InterfaceC2208b;
import com.anythink.expressad.video.signal.InterfaceC2209c;
import com.anythink.expressad.video.signal.InterfaceC2306e;
import com.anythink.expressad.video.signal.InterfaceC2310g;
import com.anythink.expressad.video.signal.InterfaceC2312i;
import com.anythink.expressad.video.signal.InterfaceC2313j;
import com.anythink.expressad.video.signal.p176a.C2200h;
import com.anythink.expressad.video.signal.p176a.C2201i;
import com.anythink.expressad.video.signal.p176a.C2202j;
import com.anythink.expressad.video.signal.p176a.C2203k;
import com.anythink.expressad.video.signal.p176a.C2204l;
import com.anythink.expressad.video.signal.p176a.C2205m;
import com.anythink.expressad.video.signal.p176a.C2206n;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.factory.b */
/* JADX INFO: loaded from: classes.dex */
public class C2309b extends C2308a {

    /* JADX INFO: renamed from: h */
    private Activity f14309h;

    /* JADX INFO: renamed from: i */
    private WebView f14310i;

    /* JADX INFO: renamed from: j */
    private AnythinkVideoView f14311j;

    /* JADX INFO: renamed from: k */
    private AnythinkContainerView f14312k;

    /* JADX INFO: renamed from: l */
    private C1781c f14313l;

    /* JADX INFO: renamed from: m */
    private AnythinkBTContainer f14314m;

    /* JADX INFO: renamed from: n */
    private List<C1781c> f14315n;

    /* JADX INFO: renamed from: o */
    private InterfaceC2209c.a f14316o;

    /* JADX INFO: renamed from: p */
    private String f14317p;

    public C2309b(Activity activity) {
        this.f14309h = activity;
    }

    private C2309b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, C1781c c1781c) {
        this.f14309h = activity;
        this.f14310i = webView;
        this.f14311j = anythinkVideoView;
        this.f14312k = anythinkContainerView;
        this.f14313l = c1781c;
    }

    public C2309b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, C1781c c1781c, InterfaceC2209c.a aVar) {
        this.f14309h = activity;
        this.f14310i = webView;
        this.f14311j = anythinkVideoView;
        this.f14312k = anythinkContainerView;
        this.f14313l = c1781c;
        this.f14316o = aVar;
        this.f14317p = anythinkVideoView.getUnitId();
    }

    public C2309b(Activity activity, AnythinkBTContainer anythinkBTContainer, WebView webView) {
        this.f14309h = activity;
        this.f14314m = anythinkBTContainer;
        this.f14310i = webView;
    }

    /* JADX INFO: renamed from: a */
    public final void m11737a(C2202j c2202j) {
        this.f14303b = c2202j;
    }

    /* JADX INFO: renamed from: a */
    public final void m11738a(List<C1781c> list) {
        this.f14315n = list;
    }

    @Override // com.anythink.expressad.video.signal.factory.C2308a, com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2192a getActivityProxy() {
        WebView webView = this.f14310i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f14302a == null) {
            this.f14302a = new C2200h(webView);
        }
        return this.f14302a;
    }

    @Override // com.anythink.expressad.video.signal.factory.C2308a, com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2312i getIJSRewardVideoV1() {
        Activity activity;
        AnythinkContainerView anythinkContainerView = this.f14312k;
        if (anythinkContainerView == null || (activity = this.f14309h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f14307f == null) {
            this.f14307f = new C2205m(activity, anythinkContainerView);
        }
        return this.f14307f;
    }

    @Override // com.anythink.expressad.video.signal.factory.C2308a, com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2208b getJSBTModule() {
        if (this.f14309h == null || this.f14314m == null) {
            return super.getJSBTModule();
        }
        if (this.f14308g == null) {
            this.f14308g = new C2201i(this.f14309h, this.f14314m);
        }
        return this.f14308g;
    }

    @Override // com.anythink.expressad.video.signal.factory.C2308a, com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2209c getJSCommon() {
        List<C1781c> list;
        if (this.f14309h == null || this.f14313l == null) {
            return super.getJSCommon();
        }
        if (this.f14303b == null) {
            this.f14303b = new C2202j(this.f14309h, this.f14313l);
        }
        if (this.f14313l.m8887k() == 5 && (list = this.f14315n) != null) {
            InterfaceC2209c interfaceC2209c = this.f14303b;
            if (interfaceC2209c instanceof C2202j) {
                ((C2202j) interfaceC2209c).m11612a(list);
            }
        }
        this.f14303b.mo11552a(this.f14309h);
        this.f14303b.mo11556a(this.f14317p);
        this.f14303b.mo11554a(this.f14316o);
        return this.f14303b;
    }

    @Override // com.anythink.expressad.video.signal.factory.C2308a, com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2306e getJSContainerModule() {
        AnythinkContainerView anythinkContainerView = this.f14312k;
        if (anythinkContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f14306e == null) {
            this.f14306e = new C2203k(anythinkContainerView);
        }
        return this.f14306e;
    }

    @Override // com.anythink.expressad.video.signal.factory.C2308a, com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2310g getJSNotifyProxy() {
        WebView webView = this.f14310i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f14305d == null) {
            this.f14305d = new C2204l(webView);
        }
        return this.f14305d;
    }

    @Override // com.anythink.expressad.video.signal.factory.C2308a, com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2313j getJSVideoModule() {
        AnythinkVideoView anythinkVideoView = this.f14311j;
        if (anythinkVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f14304c == null) {
            this.f14304c = new C2206n(anythinkVideoView);
        }
        return this.f14304c;
    }
}
