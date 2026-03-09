package mobi.oneway.export.p281f.p282a;

import java.util.List;
import mobi.oneway.export.AdListener.feed.OWFeedAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.EventType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.feed.IFeedAd;
import mobi.oneway.export.p275b.p277b.InterfaceC3593d;
import mobi.oneway.export.p281f.C3613a;

/* JADX INFO: renamed from: mobi.oneway.export.f.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3616c extends AbstractC3614a implements OWFeedAdListener {
    public C3616c(C3613a c3613a) {
        super(c3613a);
    }

    @Override // mobi.oneway.export.p281f.p282a.AbstractC3614a
    /* JADX INFO: renamed from: c */
    public AdType mo16852c() {
        return AdType.feed;
    }

    @Override // mobi.oneway.export.AdListener.feed.OWFeedAdListener
    public void onAdLoad(List<IFeedAd> list) {
        m16848a(EventType.ready);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16696a(this.f19739b, list);
        }
    }

    @Override // mobi.oneway.export.AdListener.feed.OWFeedAdListener
    public void onError(OnewaySdkError onewaySdkError, String str) {
        m16849a(onewaySdkError, str);
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16699a(this.f19739b, onewaySdkError, str);
        }
    }
}
