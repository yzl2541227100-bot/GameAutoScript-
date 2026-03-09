package com.anythink.nativead.unitgroup;

import android.content.Context;
import android.view.View;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IATAdvertiserInfoOperate;
import com.anythink.core.common.p051b.InterfaceC1173l;
import com.anythink.core.common.p051b.InterfaceC1174m;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.nativead.api.ATNativePrepareInfo;

/* JADX INFO: renamed from: com.anythink.nativead.unitgroup.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2372a extends BaseAd {
    private static final String TAG = "a";
    public C1243h mAdTrackingInfo;
    public ATEventInterface mDownloadListener;
    private InterfaceC1173l mNativeEventListener;
    private ATNativePrepareInfo nativePrepareInfo;
    public final int NETWORK_UNKNOW = -1;
    public String mAdSourceType = "0";
    public int mNetworkType = -1;

    public abstract void bindDislikeListener(View.OnClickListener onClickListener);

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public abstract View getAdIconView();

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public abstract View getAdMediaView(Object... objArr);

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdType() {
        return this.mAdSourceType;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public IATAdvertiserInfoOperate getAdvertiserInfoOperate() {
        return null;
    }

    @Override // com.anythink.core.api.BaseAd
    public final C1243h getDetail() {
        return this.mAdTrackingInfo;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadProgress() {
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        return 0;
    }

    public final ATNativePrepareInfo getNativePrepareInfo() {
        return this.nativePrepareInfo;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public View getShakeView(int i, int i2, ATShakeViewListener aTShakeViewListener) {
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public View getSlideView(int i, int i2, int i3, ATShakeViewListener aTShakeViewListener) {
        return null;
    }

    public abstract boolean isNativeExpress();

    public final void notifyAdClicked() {
        InterfaceC1173l interfaceC1173l = this.mNativeEventListener;
        if (interfaceC1173l != null) {
            interfaceC1173l.onAdClicked(null);
        }
    }

    public final void notifyAdDislikeClick() {
        InterfaceC1173l interfaceC1173l = this.mNativeEventListener;
        if (interfaceC1173l != null) {
            interfaceC1173l.onAdDislikeButtonClick();
        }
    }

    public final void notifyAdImpression() {
        InterfaceC1173l interfaceC1173l = this.mNativeEventListener;
        if (interfaceC1173l != null) {
            interfaceC1173l.onAdImpressed();
        }
    }

    public final void notifyAdVideoEnd() {
        InterfaceC1173l interfaceC1173l = this.mNativeEventListener;
        if (interfaceC1173l != null) {
            interfaceC1173l.onAdVideoEnd();
        }
    }

    public final void notifyAdVideoPlayProgress(int i) {
        InterfaceC1173l interfaceC1173l = this.mNativeEventListener;
        if (interfaceC1173l != null) {
            interfaceC1173l.onAdVideoProgress(i);
        }
    }

    public final void notifyAdVideoStart() {
        InterfaceC1173l interfaceC1173l = this.mNativeEventListener;
        if (interfaceC1173l != null) {
            interfaceC1173l.onAdVideoStart();
        }
    }

    public final void notifyAdVideoVideoPlayFail(String str, String str2) {
        StringBuilder sb = new StringBuilder("notifyAdVideoVideoPlayFail...");
        sb.append(str);
        sb.append(",");
        sb.append(str2);
        InterfaceC1173l interfaceC1173l = this.mNativeEventListener;
        if (interfaceC1173l == null || !(interfaceC1173l instanceof InterfaceC1174m)) {
            return;
        }
        ((InterfaceC1174m) interfaceC1173l).mo1069a(str, str2);
    }

    public final void notifyDeeplinkCallback(boolean z) {
        InterfaceC1173l interfaceC1173l = this.mNativeEventListener;
        if (interfaceC1173l != null) {
            interfaceC1173l.onDeeplinkCallback(z);
        }
    }

    public final void notifyDownloadConfirm(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        InterfaceC1173l interfaceC1173l = this.mNativeEventListener;
        if (interfaceC1173l != null) {
            interfaceC1173l.onDownloadConfirmCallback(context, view, aTNetworkConfirmInfo);
        }
    }

    public abstract void onPause();

    public abstract void onResume();

    public abstract void pauseVideo();

    public abstract void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo);

    public abstract void resumeVideo();

    public final void setDownloadListener(ATEventInterface aTEventInterface) {
        this.mDownloadListener = aTEventInterface;
    }

    @Override // com.anythink.core.api.BaseAd
    public void setNativeEventListener(InterfaceC1173l interfaceC1173l) {
        this.mNativeEventListener = interfaceC1173l;
    }

    public final void setNativePrepareInfo(ATNativePrepareInfo aTNativePrepareInfo) {
        this.nativePrepareInfo = aTNativePrepareInfo;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setTrackingInfo(C1243h c1243h) {
        this.mAdTrackingInfo = c1243h;
    }
}
