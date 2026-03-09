package mobi.oneway.export.p273Ad;

import android.app.Activity;
import mobi.oneway.export.AdListener.OWInteractiveAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.p275b.p276a.C3587a;
import mobi.oneway.export.p280e.C3610b;

/* JADX INFO: loaded from: classes2.dex */
public class OWInteractiveAd {

    /* JADX INFO: renamed from: a */
    private C3587a f19548a;

    /* JADX INFO: renamed from: b */
    private final AdType f19549b = AdType.interactive;

    public OWInteractiveAd(final Activity activity, final String str, final OWInteractiveAdListener oWInteractiveAdListener) {
        OnewaySdk.checkSdkConfigured();
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWInteractiveAd.1
            @Override // java.lang.Runnable
            public void run() {
                OWInteractiveAd oWInteractiveAd = OWInteractiveAd.this;
                oWInteractiveAd.f19548a = new C3587a(oWInteractiveAd.f19549b, str);
                OWInteractiveAd.this.f19548a.m16687a(activity, oWInteractiveAdListener);
            }
        });
    }

    public void destory() {
        C3587a c3587a = this.f19548a;
        if (c3587a != null) {
            c3587a.m16691c();
            this.f19548a = null;
        }
    }

    public boolean isReady() {
        C3587a c3587a = this.f19548a;
        if (c3587a == null) {
            return false;
        }
        return c3587a.m16690b();
    }

    public void loadAd() {
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWInteractiveAd.2
            @Override // java.lang.Runnable
            public void run() {
                if (OWInteractiveAd.this.f19548a != null) {
                    OWInteractiveAd.this.f19548a.m16686a();
                }
            }
        });
    }

    public void setListener(final OWInteractiveAdListener oWInteractiveAdListener) {
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWInteractiveAd.3
            @Override // java.lang.Runnable
            public void run() {
                if (OWInteractiveAd.this.f19548a != null) {
                    OWInteractiveAd.this.f19548a.m16689a(oWInteractiveAdListener);
                }
            }
        });
    }

    public void show(Activity activity) {
        show(activity, null);
    }

    public void show(Activity activity, String str) {
        C3587a c3587a = this.f19548a;
        if (c3587a != null) {
            c3587a.m16688a(activity, str);
        }
    }
}
