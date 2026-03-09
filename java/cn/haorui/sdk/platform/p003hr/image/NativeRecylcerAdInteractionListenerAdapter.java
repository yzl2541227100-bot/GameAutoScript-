package cn.haorui.sdk.platform.p003hr.image;

import cn.haorui.sdk.core.p002ad.image.ImageAdInteractionListener;
import cn.haorui.sdk.core.p002ad.recycler.RecylcerAdInteractionListener;

/* JADX INFO: loaded from: classes.dex */
public class NativeRecylcerAdInteractionListenerAdapter implements RecylcerAdInteractionListener {
    private ImageAdInteractionListener apiInteractionListener;

    public NativeRecylcerAdInteractionListenerAdapter(ImageAdInteractionListener imageAdInteractionListener) {
        this.apiInteractionListener = imageAdInteractionListener;
    }

    @Override // cn.haorui.sdk.core.loader.InteractionListener
    public void onAdClicked() {
        ImageAdInteractionListener imageAdInteractionListener = this.apiInteractionListener;
        if (imageAdInteractionListener != null) {
            imageAdInteractionListener.onAdClicked();
        }
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecylcerAdInteractionListener
    public void onAdClosed() {
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecylcerAdInteractionListener
    public void onAdRenderFailed() {
    }
}
