package com.anythink.expressad.video.signal;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2306e extends InterfaceC2307f {

    /* JADX INFO: renamed from: d_ */
    public static final int f14293d_ = -1;

    /* JADX INFO: renamed from: e_ */
    public static final int f14294e_ = 1;

    /* JADX INFO: renamed from: f_ */
    public static final int f14295f_ = 2;

    /* JADX INFO: renamed from: g_ */
    public static final int f14296g_ = 1;

    /* JADX INFO: renamed from: h_ */
    public static final int f14297h_ = 2;

    /* JADX INFO: renamed from: i_ */
    public static final int f14298i_ = 3;

    /* JADX INFO: renamed from: j_ */
    public static final int f14299j_ = 4;

    /* JADX INFO: renamed from: k_ */
    public static final int f14300k_ = 5;

    /* JADX INFO: renamed from: l_ */
    public static final int f14301l_ = 100;

    void configurationChanged(int i, int i2, int i3);

    boolean endCardShowing();

    void handlerPlayableException(String str);

    void hideAlertWebview();

    void ivRewardAdsWithoutVideo(String str);

    boolean miniCardLoaded();

    boolean miniCardShowing();

    void readyStatus(int i);

    void resizeMiniCard(int i, int i2, int i3);

    boolean showAlertWebView();

    void showEndcard(int i);

    void showMiniCard(int i, int i2, int i3, int i4, int i5);

    void showPlayableView();

    void showVideoClickView(int i);

    void showVideoEndCover();
}
