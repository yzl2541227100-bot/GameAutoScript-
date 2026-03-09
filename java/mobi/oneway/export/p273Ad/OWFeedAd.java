package mobi.oneway.export.p273Ad;

import android.content.Context;
import mobi.oneway.export.AdListener.feed.OWFeedAdListener;
import mobi.oneway.export.p275b.p276a.C3588b;
import mobi.oneway.export.p280e.C3610b;

/* JADX INFO: loaded from: classes2.dex */
public class OWFeedAd {

    /* JADX INFO: renamed from: a */
    private C3588b f19545a;

    public OWFeedAd(Context context, String str) {
        OnewaySdk.checkSdkConfigured();
        this.f19545a = new C3588b(context, str);
    }

    public void load(final OWFeedAdListener oWFeedAdListener) {
        C3610b.m16807a().m16810a(new Runnable() { // from class: mobi.oneway.export.Ad.OWFeedAd.1
            @Override // java.lang.Runnable
            public void run() {
                OWFeedAd.this.f19545a.m16692a(oWFeedAdListener);
            }
        });
    }
}
