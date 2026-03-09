package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import p285z2.InterfaceC4082l1;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class BaseTarget<Z> implements Target<Z> {
    private InterfaceC4082l1 request;

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    public InterfaceC4082l1 getRequest() {
        return this.request;
    }

    @Override // p285z2.InterfaceC4229p0
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // p285z2.InterfaceC4229p0
    public void onStart() {
    }

    @Override // p285z2.InterfaceC4229p0
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void setRequest(@Nullable InterfaceC4082l1 interfaceC4082l1) {
        this.request = interfaceC4082l1;
    }
}
