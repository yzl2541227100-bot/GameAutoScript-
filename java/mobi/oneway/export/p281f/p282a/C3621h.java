package mobi.oneway.export.p281f.p282a;

import mobi.oneway.export.AdListener.OWSplashAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.EventType;
import mobi.oneway.export.enums.OnewayAdCloseType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.p275b.C3586a;
import mobi.oneway.export.p275b.p277b.InterfaceC3593d;
import mobi.oneway.export.p281f.C3613a;

/* JADX INFO: renamed from: mobi.oneway.export.f.a.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3621h extends AbstractC3614a implements OWSplashAdListener {
    public C3621h(C3613a c3613a) {
        super(c3613a);
    }

    @Override // mobi.oneway.export.p281f.p282a.AbstractC3614a
    /* JADX INFO: renamed from: c */
    public AdType mo16852c() {
        return AdType.splash;
    }

    @Override // mobi.oneway.export.AdListener.OWSplashAdListener
    public void onAdClick() {
        m16848a(EventType.click);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16702d(null);
        }
    }

    @Override // mobi.oneway.export.AdListener.OWSplashAdListener
    public void onAdError(OnewaySdkError onewaySdkError, String str) {
        m16849a(onewaySdkError, str);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16699a(this.f19739b, onewaySdkError, str);
        }
    }

    @Override // mobi.oneway.export.AdListener.OWSplashAdListener
    public void onAdFinish() {
        m16848a(EventType.end);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16698a((String) null, (OnewayAdCloseType) null, (String) null);
        }
    }

    @Override // mobi.oneway.export.AdListener.OWSplashAdListener
    public void onAdShow() {
        C3586a.m16671a().m16679a(C3586a.a.TYPE_SHOW, m16850b(), m16846a());
        m16848a(EventType.show);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16701c(null);
        }
    }
}
