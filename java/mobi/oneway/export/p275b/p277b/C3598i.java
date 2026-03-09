package mobi.oneway.export.p275b.p277b;

import java.util.List;
import mobi.oneway.export.AdListener.OWSplashAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.OnewayAdCloseType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.feed.IFeedAd;

/* JADX INFO: renamed from: mobi.oneway.export.b.b.i */
/* JADX INFO: loaded from: classes2.dex */
public class C3598i extends AbstractC3591b<OWSplashAdListener> {
    public C3598i(AdType adType, List<String> list, long j) {
        super(adType, list, j);
    }

    @Override // mobi.oneway.export.p275b.p277b.AbstractC3591b
    /* JADX INFO: renamed from: a */
    public void mo16694a() {
    }

    @Override // mobi.oneway.export.p275b.p277b.AbstractC3591b
    /* JADX INFO: renamed from: a */
    public void mo16695a(String str) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16696a(String str, List<IFeedAd> list) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16697a(String str, OnewayAdCloseType onewayAdCloseType) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16698a(String str, OnewayAdCloseType onewayAdCloseType, String str2) {
        T t = this.f19643a;
        if (t != 0) {
            ((OWSplashAdListener) t).onAdFinish();
        }
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16699a(String str, OnewaySdkError onewaySdkError, String str2) {
        T t = this.f19643a;
        if (t != 0) {
            ((OWSplashAdListener) t).onAdError(onewaySdkError, str2);
        }
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: b */
    public void mo16700b(String str) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: c */
    public void mo16701c(String str) {
        T t = this.f19643a;
        if (t != 0) {
            ((OWSplashAdListener) t).onAdShow();
        }
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: d */
    public void mo16702d(String str) {
        T t = this.f19643a;
        if (t != 0) {
            ((OWSplashAdListener) t).onAdClick();
        }
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: e */
    public void mo16703e(String str) {
    }
}
