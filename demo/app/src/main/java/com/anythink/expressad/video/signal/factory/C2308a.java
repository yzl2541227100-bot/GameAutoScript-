package com.anythink.expressad.video.signal.factory;

import com.anythink.expressad.video.signal.InterfaceC2192a;
import com.anythink.expressad.video.signal.InterfaceC2208b;
import com.anythink.expressad.video.signal.InterfaceC2209c;
import com.anythink.expressad.video.signal.InterfaceC2306e;
import com.anythink.expressad.video.signal.InterfaceC2310g;
import com.anythink.expressad.video.signal.InterfaceC2312i;
import com.anythink.expressad.video.signal.InterfaceC2313j;
import com.anythink.expressad.video.signal.p176a.C2193a;
import com.anythink.expressad.video.signal.p176a.C2194b;
import com.anythink.expressad.video.signal.p176a.C2195c;
import com.anythink.expressad.video.signal.p176a.C2196d;
import com.anythink.expressad.video.signal.p176a.C2197e;
import com.anythink.expressad.video.signal.p176a.C2198f;
import com.anythink.expressad.video.signal.p176a.C2199g;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.factory.a */
/* JADX INFO: loaded from: classes.dex */
public class C2308a implements IJSFactory {

    /* JADX INFO: renamed from: a */
    public InterfaceC2192a f14302a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2209c f14303b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2313j f14304c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2310g f14305d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2306e f14306e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2312i f14307f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2208b f14308g;

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2192a getActivityProxy() {
        if (this.f14302a == null) {
            this.f14302a = new C2193a();
        }
        return this.f14302a;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2312i getIJSRewardVideoV1() {
        if (this.f14307f == null) {
            this.f14307f = new C2198f();
        }
        return this.f14307f;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2208b getJSBTModule() {
        if (this.f14308g == null) {
            this.f14308g = new C2194b();
        }
        return this.f14308g;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2209c getJSCommon() {
        if (this.f14303b == null) {
            this.f14303b = new C2195c();
        }
        return this.f14303b;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2306e getJSContainerModule() {
        if (this.f14306e == null) {
            this.f14306e = new C2196d();
        }
        return this.f14306e;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2310g getJSNotifyProxy() {
        if (this.f14305d == null) {
            this.f14305d = new C2197e();
        }
        return this.f14305d;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2313j getJSVideoModule() {
        if (this.f14304c == null) {
            this.f14304c = new C2199g();
        }
        return this.f14304c;
    }
}
