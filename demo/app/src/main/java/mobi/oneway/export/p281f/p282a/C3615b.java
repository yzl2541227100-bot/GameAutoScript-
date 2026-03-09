package mobi.oneway.export.p281f.p282a;

import java.util.HashSet;
import java.util.Set;
import mobi.oneway.export.AdListener.feed.OWFeedAdEventListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.EventType;
import mobi.oneway.export.feed.IFeedAd;
import mobi.oneway.export.p275b.C3586a;
import mobi.oneway.export.p281f.C3613a;
import mobi.oneway.export.p281f.C3625e;

/* JADX INFO: renamed from: mobi.oneway.export.f.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3615b implements OWFeedAdEventListener {

    /* JADX INFO: renamed from: a */
    private static Set<String> f19743a = new HashSet();

    /* JADX INFO: renamed from: b */
    private static Set<String> f19744b = new HashSet();

    /* JADX INFO: renamed from: c */
    private C3625e f19745c;

    /* JADX INFO: renamed from: d */
    private OWFeedAdEventListener f19746d;

    /* JADX INFO: renamed from: e */
    private String f19747e;

    /* JADX INFO: renamed from: f */
    private String f19748f;

    public C3615b(C3613a c3613a, OWFeedAdEventListener oWFeedAdEventListener) {
        this.f19745c = new C3625e(AdType.feed, c3613a);
        this.f19746d = oWFeedAdEventListener;
        this.f19747e = c3613a.m16845g();
        this.f19748f = c3613a.m16844f();
    }

    @Override // mobi.oneway.export.AdListener.feed.OWFeedAdEventListener
    public void onClicked(IFeedAd iFeedAd) {
        String string = iFeedAd.toString();
        if (!f19744b.contains(string)) {
            this.f19745c.m16888a(EventType.click, null);
            f19744b.add(string);
        }
        OWFeedAdEventListener oWFeedAdEventListener = this.f19746d;
        if (oWFeedAdEventListener != null) {
            oWFeedAdEventListener.onClicked(iFeedAd);
        }
    }

    @Override // mobi.oneway.export.AdListener.feed.OWFeedAdEventListener
    public void onExposured(IFeedAd iFeedAd) {
        String string = iFeedAd.toString();
        if (!f19743a.contains(string)) {
            C3586a.m16671a().m16679a(C3586a.a.TYPE_SHOW, this.f19747e, this.f19748f);
            this.f19745c.m16888a(EventType.show, null);
            f19743a.add(string);
        }
        OWFeedAdEventListener oWFeedAdEventListener = this.f19746d;
        if (oWFeedAdEventListener != null) {
            oWFeedAdEventListener.onExposured(iFeedAd);
        }
    }
}
