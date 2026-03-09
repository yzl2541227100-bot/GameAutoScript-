package cn.haorui.sdk.platform.p003hr.image;

import cn.haorui.sdk.core.loader.AdPlatformError;
import cn.haorui.sdk.core.p002ad.image.ImageAdListener;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HRRecyclerAdListenerAdapter implements RecyclerAdListener {
    private ImageAdListener internalAdListener;

    public HRRecyclerAdListenerAdapter(ImageAdListener imageAdListener) {
        this.internalAdListener = imageAdListener;
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdClosed() {
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdError() {
        ImageAdListener imageAdListener = this.internalAdListener;
        if (imageAdListener != null) {
            imageAdListener.onAdError();
        }
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdExposure() {
        ImageAdListener imageAdListener = this.internalAdListener;
        if (imageAdListener != null) {
            imageAdListener.onAdExposure();
        }
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdLoaded(List<RecyclerAdData> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<RecyclerAdData> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new HRImageAdDataAdapter(it.next()));
            }
            this.internalAdListener.onAdLoaded(arrayList);
        }
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdPlatformError(AdPlatformError adPlatformError) {
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdReady(List<RecyclerAdData> list) {
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoadListener
    public void onAdRenderFail(String str, int i) {
    }
}
