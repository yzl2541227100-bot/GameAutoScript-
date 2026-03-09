package mobi.oneway.export.p281f.p282a;

import mobi.oneway.export.AdListener.OWInteractiveAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.EventType;
import mobi.oneway.export.enums.OnewayAdCloseType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.p275b.C3586a;
import mobi.oneway.export.p275b.p277b.InterfaceC3593d;
import mobi.oneway.export.p281f.C3613a;

/* JADX INFO: renamed from: mobi.oneway.export.f.a.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3617d extends AbstractC3614a implements OWInteractiveAdListener {
    public C3617d(C3613a c3613a) {
        super(c3613a);
    }

    @Override // mobi.oneway.export.p281f.p282a.AbstractC3614a
    /* JADX INFO: renamed from: c */
    public AdType mo16852c() {
        return AdType.interactive;
    }

    @Override // mobi.oneway.export.AdListener.OWInteractiveAdListener
    public void onAdClose(String str, OnewayAdCloseType onewayAdCloseType) {
        m16848a(EventType.close);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16697a(str, onewayAdCloseType);
        }
    }

    @Override // mobi.oneway.export.AdListener.OWInteractiveAdListener
    public void onAdReady() {
        m16848a(EventType.ready);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16700b(this.f19739b);
        }
    }

    @Override // mobi.oneway.export.AdListener.OWInteractiveAdListener
    public void onAdShow(String str) {
        C3586a.m16671a().m16679a(C3586a.a.TYPE_SHOW, m16850b(), m16846a());
        m16848a(EventType.show);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16701c(str);
        }
    }

    @Override // mobi.oneway.export.AdListener.OWInteractiveAdListener
    public void onReward(String str) {
        m16848a(EventType.reward);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16703e(str);
        }
    }

    @Override // mobi.oneway.export.AdListener.OWInteractiveAdListener
    public void onSdkError(OnewaySdkError onewaySdkError, String str) {
        m16849a(onewaySdkError, str);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16699a(this.f19739b, onewaySdkError, str);
        }
    }
}
