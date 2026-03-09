package com.octopus.p222ad;

/* JADX INFO: loaded from: classes2.dex */
public interface RewardVideoAdListener {
    void onRewardVideoAdClicked();

    void onRewardVideoAdClosed();

    void onRewardVideoAdComplete();

    void onRewardVideoAdFailedToLoad(int i);

    void onRewardVideoAdLoaded();

    void onRewardVideoAdShown();

    void onRewarded(RewardItem rewardItem);
}
