package cn.haorui.sdk.core.p002ad.reward;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.haorui.sdk.core.loader.C0496a;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RewardVideoAdListenerProxy extends C0496a<RewardVideoAd, RewardVideoAdListener> implements RewardVideoAdListener {
    public RewardVideoAdListenerProxy(@NonNull InterfaceC0508d interfaceC0508d, @Nullable RewardVideoAdListener rewardVideoAdListener) {
        super(interfaceC0508d, rewardVideoAdListener);
    }

    @Override // cn.haorui.sdk.core.p002ad.reward.RewardVideoAdListener
    public void onReward(Map<String, Object> map) {
        K k = this.listener;
        if (k != 0) {
            ((RewardVideoAdListener) k).onReward(map);
        }
    }

    @Override // cn.haorui.sdk.core.p002ad.reward.RewardVideoAdListener
    public void onVideoCached() {
        K k = this.listener;
        if (k != 0) {
            ((RewardVideoAdListener) k).onVideoCached();
        }
    }
}
