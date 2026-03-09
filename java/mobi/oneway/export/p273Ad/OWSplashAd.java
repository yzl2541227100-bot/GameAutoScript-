package mobi.oneway.export.p273Ad;

import android.app.Activity;
import android.view.ViewGroup;
import mobi.oneway.export.AdListener.OWSplashAdListener;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.p275b.p276a.C3589c;
import mobi.oneway.export.p280e.C3610b;
import mobi.oneway.export.p280e.C3612d;

/* JADX INFO: loaded from: classes2.dex */
public class OWSplashAd {

    /* JADX INFO: renamed from: a */
    private C3589c f19584a;

    public OWSplashAd(String str) {
        this.f19584a = new C3589c(str);
    }

    public void show(Activity activity, ViewGroup viewGroup, OWSplashAdListener oWSplashAdListener) {
        show(activity, viewGroup, oWSplashAdListener, 0L);
    }

    public void show(final Activity activity, final ViewGroup viewGroup, final OWSplashAdListener oWSplashAdListener, final long j) {
        OnewaySdk.checkSdkConfigured();
        final Runnable runnable = new Runnable() { // from class: mobi.oneway.export.Ad.OWSplashAd.1
            @Override // java.lang.Runnable
            public void run() {
                OWSplashAd.this.f19584a.m16693a(activity, viewGroup, oWSplashAdListener, j);
            }
        };
        C3610b.m16807a().m16810a(runnable);
        new C3612d(new C3612d.a() { // from class: mobi.oneway.export.Ad.OWSplashAd.2
            @Override // mobi.oneway.export.p280e.C3612d.a
            public void timeout() {
                oWSplashAdListener.onAdError(OnewaySdkError.SHOW_ERROR, "Show splash ad timeout");
                C3610b.m16807a().m16812b(runnable);
            }
        }, j).start();
    }
}
