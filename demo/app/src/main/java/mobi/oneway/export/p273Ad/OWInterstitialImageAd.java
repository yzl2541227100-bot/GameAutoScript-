package mobi.oneway.export.p273Ad;

import android.app.Activity;
import mobi.oneway.export.AdListener.OWInterstitialImageAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.p275b.p276a.C3587a;
import mobi.oneway.export.p280e.C3610b;

/* JADX INFO: loaded from: classes2.dex */
public class OWInterstitialImageAd {

    /* JADX INFO: renamed from: a */
    private C3587a f19566a;

    /* JADX INFO: renamed from: b */
    private final AdType f19567b = AdType.interstitialimage;

    public OWInterstitialImageAd(final Activity activity, final String str, final OWInterstitialImageAdListener oWInterstitialImageAdListener) {
        OnewaySdk.checkSdkConfigured();
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWInterstitialImageAd.1
            @Override // java.lang.Runnable
            public void run() {
                OWInterstitialImageAd oWInterstitialImageAd = OWInterstitialImageAd.this;
                oWInterstitialImageAd.f19566a = new C3587a(oWInterstitialImageAd.f19567b, str);
                OWInterstitialImageAd.this.f19566a.m16687a(activity, oWInterstitialImageAdListener);
            }
        });
    }

    public void destory() {
        C3587a c3587a = this.f19566a;
        if (c3587a != null) {
            c3587a.m16691c();
            this.f19566a = null;
        }
    }

    public boolean isReady() {
        C3587a c3587a = this.f19566a;
        if (c3587a == null) {
            return false;
        }
        return c3587a.m16690b();
    }

    public void loadAd() {
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWInterstitialImageAd.2
            @Override // java.lang.Runnable
            public void run() {
                if (OWInterstitialImageAd.this.f19566a != null) {
                    OWInterstitialImageAd.this.f19566a.m16686a();
                }
            }
        });
    }

    public void setListener(final OWInterstitialImageAdListener oWInterstitialImageAdListener) {
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWInterstitialImageAd.3
            @Override // java.lang.Runnable
            public void run() {
                if (OWInterstitialImageAd.this.f19566a != null) {
                    OWInterstitialImageAd.this.f19566a.m16689a(oWInterstitialImageAdListener);
                }
            }
        });
    }

    public void show(Activity activity) {
        show(activity, null);
    }

    public void show(Activity activity, String str) {
        C3587a c3587a = this.f19566a;
        if (c3587a != null) {
            c3587a.m16688a(activity, str);
        }
    }
}
