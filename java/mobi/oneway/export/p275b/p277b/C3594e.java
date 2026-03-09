package mobi.oneway.export.p275b.p277b;

import java.util.List;
import mobi.oneway.export.AdListener.OWInteractiveAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.OnewayAdCloseType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.feed.IFeedAd;

/* JADX INFO: renamed from: mobi.oneway.export.b.b.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3594e extends AbstractC3591b<OWInteractiveAdListener> {
    public C3594e(AdType adType, List<String> list, long j) {
        super(adType, list, j);
    }

    @Override // mobi.oneway.export.p275b.p277b.AbstractC3591b
    /* JADX INFO: renamed from: a */
    public void mo16694a() {
        T t = this.f19643a;
        if (t != 0) {
            ((OWInteractiveAdListener) t).onAdReady();
        }
    }

    @Override // mobi.oneway.export.p275b.p277b.AbstractC3591b
    /* JADX INFO: renamed from: a */
    public void mo16695a(String str) {
        T t = this.f19643a;
        if (t != 0) {
            ((OWInteractiveAdListener) t).onSdkError(OnewaySdkError.LOAD_ERROR, str);
        }
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16696a(String str, List<IFeedAd> list) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16697a(String str, OnewayAdCloseType onewayAdCloseType) {
        T t = this.f19643a;
        if (t != 0) {
            ((OWInteractiveAdListener) t).onAdClose(str, onewayAdCloseType);
        }
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16698a(String str, OnewayAdCloseType onewayAdCloseType, String str2) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16699a(String str, OnewaySdkError onewaySdkError, String str2) {
        T t;
        m16718g(str);
        if (!m16716e() || (t = this.f19643a) == 0) {
            return;
        }
        ((OWInteractiveAdListener) t).onSdkError(onewaySdkError, str2);
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: b */
    public void mo16700b(String str) {
        T t;
        m16717f(str);
        if (!m16715d() || (t = this.f19643a) == 0) {
            return;
        }
        ((OWInteractiveAdListener) t).onAdReady();
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: c */
    public void mo16701c(String str) {
        m16712a(false);
        T t = this.f19643a;
        if (t != 0) {
            ((OWInteractiveAdListener) t).onAdShow(str);
        }
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: d */
    public void mo16702d(String str) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: e */
    public void mo16703e(String str) {
        T t = this.f19643a;
        if (t != 0) {
            ((OWInteractiveAdListener) t).onReward(str);
        }
    }
}
