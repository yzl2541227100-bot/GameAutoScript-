package cn.haorui.sdk.core.p002ad.reward;

/* JADX INFO: loaded from: classes.dex */
public interface RewardAdMediaListener {
    void onSkippedVideo();

    void onVideoCompleted();

    void onVideoError();

    void onVideoPause();

    void onVideoResume();

    void onVideoStart();
}
