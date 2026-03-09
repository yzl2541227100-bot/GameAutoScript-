package mobi.oneway.export.p273Ad;

import android.app.Activity;
import mobi.oneway.export.AdListener.OWInterstitialAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.p275b.p276a.C3587a;
import mobi.oneway.export.p280e.C3610b;

/* JADX INFO: loaded from: classes2.dex */
public class OWInterstitialAd {

    /* JADX INFO: renamed from: a */
    private C3587a f19557a;

    /* JADX INFO: renamed from: b */
    private final AdType f19558b = AdType.interstitial;

    public OWInterstitialAd(final Activity activity, final String str, final OWInterstitialAdListener oWInterstitialAdListener) {
        OnewaySdk.checkSdkConfigured();
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWInterstitialAd.1
            @Override // java.lang.Runnable
            public void run() {
                OWInterstitialAd oWInterstitialAd = OWInterstitialAd.this;
                oWInterstitialAd.f19557a = new C3587a(oWInterstitialAd.f19558b, str);
                OWInterstitialAd.this.f19557a.m16687a(activity, oWInterstitialAdListener);
            }
        });
    }

    public void destory() {
        C3587a c3587a = this.f19557a;
        if (c3587a != null) {
            c3587a.m16691c();
            this.f19557a = null;
        }
    }

    public boolean isReady() {
        C3587a c3587a = this.f19557a;
        if (c3587a == null) {
            return false;
        }
        return c3587a.m16690b();
    }

    public void loadAd() {
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWInterstitialAd.2
            @Override // java.lang.Runnable
            public void run() {
                if (OWInterstitialAd.this.f19557a != null) {
                    OWInterstitialAd.this.f19557a.m16686a();
                }
            }
        });
    }

    public void setListener(final OWInterstitialAdListener oWInterstitialAdListener) {
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWInterstitialAd.3
            @Override // java.lang.Runnable
            public void run() {
                if (OWInterstitialAd.this.f19557a != null) {
                    OWInterstitialAd.this.f19557a.m16689a(oWInterstitialAdListener);
                }
            }
        });
    }

    public void show(Activity activity) {
        show(activity, null);
    }

    public void show(Activity activity, String str) {
        C3587a c3587a = this.f19557a;
        if (c3587a != null) {
            c3587a.m16688a(activity, str);
        }
    }
}
