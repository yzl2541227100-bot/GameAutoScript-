package mobi.oneway.export.p273Ad;

import android.app.Activity;
import mobi.oneway.export.AdListener.OWRewardedAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.p275b.p276a.C3587a;
import mobi.oneway.export.p280e.C3610b;

/* JADX INFO: loaded from: classes2.dex */
public class OWRewardedAd {

    /* JADX INFO: renamed from: a */
    private C3587a f19575a;

    /* JADX INFO: renamed from: b */
    private final AdType f19576b = AdType.rewarded;

    public OWRewardedAd(final Activity activity, final String str, final OWRewardedAdListener oWRewardedAdListener) {
        OnewaySdk.checkSdkConfigured();
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWRewardedAd.1
            @Override // java.lang.Runnable
            public void run() {
                OWRewardedAd oWRewardedAd = OWRewardedAd.this;
                oWRewardedAd.f19575a = new C3587a(oWRewardedAd.f19576b, str);
                OWRewardedAd.this.f19575a.m16687a(activity, oWRewardedAdListener);
            }
        });
    }

    public void destory() {
        C3587a c3587a = this.f19575a;
        if (c3587a != null) {
            c3587a.m16691c();
            this.f19575a = null;
        }
    }

    public boolean isReady() {
        C3587a c3587a = this.f19575a;
        if (c3587a == null) {
            return false;
        }
        return c3587a.m16690b();
    }

    public void loadAd() {
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWRewardedAd.2
            @Override // java.lang.Runnable
            public void run() {
                if (OWRewardedAd.this.f19575a != null) {
                    OWRewardedAd.this.f19575a.m16686a();
                }
            }
        });
    }

    public void setListener(final OWRewardedAdListener oWRewardedAdListener) {
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWRewardedAd.3
            @Override // java.lang.Runnable
            public void run() {
                if (OWRewardedAd.this.f19575a != null) {
                    OWRewardedAd.this.f19575a.m16689a(oWRewardedAdListener);
                }
            }
        });
    }

    public void show(Activity activity) {
        show(activity, null);
    }

    public void show(Activity activity, String str) {
        C3587a c3587a = this.f19575a;
        if (c3587a != null) {
            c3587a.m16688a(activity, str);
        }
    }
}
