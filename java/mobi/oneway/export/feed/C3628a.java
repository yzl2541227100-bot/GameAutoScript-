package mobi.oneway.export.feed;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import mobi.oneway.export.AdListener.feed.OWFeedAdEventListener;
import mobi.oneway.export.AdListener.feed.OWFeedVideoAdListener;
import mobi.oneway.export.p281f.C3613a;
import mobi.oneway.export.p281f.p282a.C3615b;

/* JADX INFO: renamed from: mobi.oneway.export.feed.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3628a implements IFeedAd {

    /* JADX INFO: renamed from: a */
    private IFeedAd f19778a;

    /* JADX INFO: renamed from: b */
    private C3613a f19779b;

    public C3628a(IFeedAd iFeedAd, C3613a c3613a) {
        this.f19778a = iFeedAd;
        this.f19779b = c3613a;
    }

    @Override // mobi.oneway.export.feed.IFeedAd
    public String getIconImage() {
        return this.f19778a.getIconImage();
    }

    @Override // mobi.oneway.export.feed.IFeedAd
    public List<String> getImages() {
        return this.f19778a.getImages();
    }

    @Override // mobi.oneway.export.feed.IFeedAd
    public String getTitle() {
        return this.f19778a.getTitle();
    }

    @Override // mobi.oneway.export.feed.IFeedAd
    public int getType() {
        return this.f19778a.getType();
    }

    @Override // mobi.oneway.export.feed.IFeedAd
    public View getVideoView() {
        return this.f19778a.getVideoView();
    }

    @Override // mobi.oneway.export.feed.IFeedAd
    public void handleAdEvent(ViewGroup viewGroup, OWFeedAdEventListener oWFeedAdEventListener) {
        this.f19778a.handleAdEvent(viewGroup, new C3615b(this.f19779b, oWFeedAdEventListener));
    }

    @Override // mobi.oneway.export.feed.IFeedAd
    public void setVideoAdListener(OWFeedVideoAdListener oWFeedVideoAdListener) {
    }
}
