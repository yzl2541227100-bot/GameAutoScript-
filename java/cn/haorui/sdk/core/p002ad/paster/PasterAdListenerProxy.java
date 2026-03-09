package cn.haorui.sdk.core.p002ad.paster;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.haorui.sdk.core.loader.C0496a;
import cn.haorui.sdk.core.loader.InterfaceC0508d;

/* JADX INFO: loaded from: classes.dex */
public class PasterAdListenerProxy extends C0496a<PasterAd, PasterAdListener> implements PasterAdListener {
    public PasterAdListenerProxy(@NonNull InterfaceC0508d interfaceC0508d, @Nullable PasterAdListener pasterAdListener) {
        super(interfaceC0508d, pasterAdListener);
    }

    @Override // cn.haorui.sdk.core.p002ad.paster.PasterAdListener
    public void onVideoComplete() {
        ((PasterAdListener) this.listener).onVideoComplete();
    }

    @Override // cn.haorui.sdk.core.p002ad.paster.PasterAdListener
    public void onVideoError() {
        ((PasterAdListener) this.listener).onVideoError();
    }

    @Override // cn.haorui.sdk.core.p002ad.paster.PasterAdListener
    public void onVideoLoaded() {
        ((PasterAdListener) this.listener).onVideoLoaded();
    }
}
