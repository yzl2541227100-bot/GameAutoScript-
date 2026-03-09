package com.anythink.expressad.video.signal.p176a;

import android.content.res.Configuration;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.signal.factory.C2309b;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2203k extends C2196d {

    /* JADX INFO: renamed from: k */
    private AnythinkContainerView f13951k;

    public C2203k(AnythinkContainerView anythinkContainerView) {
        this.f13951k = anythinkContainerView;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final void configurationChanged(int i, int i2, int i3) {
        super.configurationChanged(i, i2, i3);
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.configurationChanged(i, i2, i3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final boolean endCardShowing() {
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                return anythinkContainerView.endCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.endCardShowing();
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final void hideAlertWebview() {
        super.hideAlertWebview();
        AnythinkContainerView anythinkContainerView = this.f13951k;
        if (anythinkContainerView != null) {
            anythinkContainerView.hideAlertWebview();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void install(C1781c c1781c) {
        super.install(c1781c);
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.install(c1781c);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        AnythinkContainerView anythinkContainerView = this.f13951k;
        if (anythinkContainerView != null) {
            anythinkContainerView.ivRewardAdsWithoutVideo(str);
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final boolean miniCardLoaded() {
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                return anythinkContainerView.miniCardLoaded();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardLoaded();
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final boolean miniCardShowing() {
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                return anythinkContainerView.miniCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardShowing();
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void orientation(Configuration configuration) {
        super.orientation(configuration);
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.orientation(configuration);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2307f
    public final void preLoadData(C2309b c2309b) {
        super.preLoadData(c2309b);
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.preLoadData(c2309b);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void readyStatus(int i) {
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.readyStatus(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.readyStatus(i);
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final void resizeMiniCard(int i, int i2, int i3) {
        super.resizeMiniCard(i, i2, i3);
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.resizeMiniCard(i, i2, i3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final boolean showAlertWebView() {
        super.showAlertWebView();
        AnythinkContainerView anythinkContainerView = this.f13951k;
        if (anythinkContainerView != null) {
            return anythinkContainerView.showAlertWebView();
        }
        return false;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final void showEndcard(int i) {
        super.showEndcard(i);
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.showEndcard(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        super.showMiniCard(i, i2, i3, i4, i5);
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.showMiniCard(i, i2, i3, i4, i5);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final void showPlayableView() {
        super.showPlayableView();
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.showPlayableView();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2306e
    public final void showVideoClickView(int i) {
        super.showVideoClickView(i);
        AnythinkContainerView anythinkContainerView = this.f13951k;
        if (anythinkContainerView != null) {
            anythinkContainerView.showVideoClickView(i);
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.toggleCloseBtn(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2196d, com.anythink.expressad.video.signal.InterfaceC2311h
    public final void webviewshow() {
        super.webviewshow();
        try {
            AnythinkContainerView anythinkContainerView = this.f13951k;
            if (anythinkContainerView != null) {
                anythinkContainerView.webviewshow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
