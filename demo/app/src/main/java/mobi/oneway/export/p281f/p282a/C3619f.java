package mobi.oneway.export.p281f.p282a;

import mobi.oneway.export.AdListener.OWInterstitialAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.EventType;
import mobi.oneway.export.enums.OnewayAdCloseType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.p275b.C3586a;
import mobi.oneway.export.p275b.p277b.InterfaceC3593d;
import mobi.oneway.export.p281f.C3613a;

/* JADX INFO: renamed from: mobi.oneway.export.f.a.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3619f extends AbstractC3614a implements OWInterstitialAdListener {
    public C3619f(C3613a c3613a) {
        super(c3613a);
    }

    @Override // mobi.oneway.export.p281f.p282a.AbstractC3614a
    /* JADX INFO: renamed from: c */
    public AdType mo16852c() {
        return AdType.interstitial;
    }

    @Override // mobi.oneway.export.AdListener.AdMonitor
    public void onAdClick(String str) {
        m16848a(EventType.click);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16702d(str);
        }
    }

    @Override // mobi.oneway.export.AdListener.AdMonitor
    public void onAdClose(String str, OnewayAdCloseType onewayAdCloseType) {
        m16848a(EventType.close);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16697a(str, onewayAdCloseType);
        }
    }

    @Override // mobi.oneway.export.AdListener.AdMonitor
    public void onAdFinish(String str, OnewayAdCloseType onewayAdCloseType, String str2) {
        m16848a(onewayAdCloseType == OnewayAdCloseType.SKIPPED ? EventType.skip : EventType.end);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16698a(str, onewayAdCloseType, str2);
        }
    }

    @Override // mobi.oneway.export.AdListener.AdMonitor
    public void onAdReady() {
        m16848a(EventType.ready);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16700b(this.f19739b);
        }
    }

    @Override // mobi.oneway.export.AdListener.AdMonitor
    public void onAdShow(String str) {
        C3586a.m16671a().m16679a(C3586a.a.TYPE_SHOW, m16850b(), m16846a());
        m16848a(EventType.show);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16701c(str);
        }
    }

    @Override // mobi.oneway.export.AdListener.AdMonitor
    public void onSdkError(OnewaySdkError onewaySdkError, String str) {
        m16849a(onewaySdkError, str);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16699a(this.f19739b, onewaySdkError, str);
        }
    }
}
