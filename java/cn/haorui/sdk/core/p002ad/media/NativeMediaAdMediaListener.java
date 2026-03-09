package cn.haorui.sdk.core.p002ad.media;

/* JADX INFO: loaded from: classes.dex */
public interface NativeMediaAdMediaListener {
    void onADButtonClicked();

    void onFullScreenChanged(boolean z);

    void onReplayButtonClicked();

    void onVideoComplete();

    void onVideoPause();

    void onVideoReady(long j);

    void onVideoStart();
}
