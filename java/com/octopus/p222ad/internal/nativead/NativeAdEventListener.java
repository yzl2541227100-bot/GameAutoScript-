package com.octopus.p222ad.internal.nativead;

/* JADX INFO: loaded from: classes2.dex */
public interface NativeAdEventListener {
    void onADExposed();

    void onAdClick();

    void onAdClose();

    void onAdRenderFailed(int i);
}
