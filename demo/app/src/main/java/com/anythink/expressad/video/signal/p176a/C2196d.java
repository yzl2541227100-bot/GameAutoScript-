package com.anythink.expressad.video.signal.p176a;

import android.content.res.Configuration;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.video.signal.InterfaceC2306e;
import com.anythink.expressad.video.signal.InterfaceC2311h;
import com.anythink.expressad.video.signal.factory.C2309b;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C2196d implements InterfaceC2306e, InterfaceC2311h {

    /* JADX INFO: renamed from: j */
    public static final String f13922j = "DefaultJSContainerModule";

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void configurationChanged(int i, int i2, int i3) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public boolean endCardShowing() {
        return true;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e, com.anythink.expressad.video.signal.InterfaceC2311h
    public void handlerPlayableException(String str) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void hideAlertWebview() {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void install(C1781c c1781c) {
        new StringBuilder("install ,campaign=").append(c1781c);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void ivRewardAdsWithoutVideo(String str) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public boolean miniCardLoaded() {
        return false;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public boolean miniCardShowing() {
        return false;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void notifyCloseBtn(int i) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void orientation(Configuration configuration) {
        new StringBuilder("orientation ,config=").append(configuration);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(C2309b c2309b) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e, com.anythink.expressad.video.signal.InterfaceC2311h
    public void readyStatus(int i) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void resizeMiniCard(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("showMiniCard width = ");
        sb.append(i);
        sb.append(" height = ");
        sb.append(i2);
        sb.append(" radius = ");
        sb.append(i3);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public boolean showAlertWebView() {
        return false;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void showEndcard(int i) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        StringBuilder sb = new StringBuilder("showMiniCard top = ");
        sb.append(i);
        sb.append(" left = ");
        sb.append(i2);
        sb.append(" width = ");
        sb.append(i3);
        sb.append(" height = ");
        sb.append(i4);
        sb.append(" radius = ");
        sb.append(i5);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void showPlayableView() {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void showVideoClickView(int i) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2306e
    public void showVideoEndCover() {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void toggleCloseBtn(int i) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void webviewshow() {
    }
}
