package cn.haorui.sdk.platform.p003hr;

import android.content.Context;
import cn.haorui.sdk.core.loader.InteractionListener;
import cn.haorui.sdk.core.p002ad.AdSlot;
import cn.haorui.sdk.core.p002ad.AdType;
import cn.haorui.sdk.core.p002ad.IAd;

/* JADX INFO: loaded from: classes.dex */
public interface IAdSailAd<T extends InteractionListener> extends IAd<T> {
    AdSlot getAdSlot();

    AdType getAdType();

    Context getContext();

    int getInteractionType();
}
