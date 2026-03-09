package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p285z2.C4379t2;
import p285z2.InterfaceC4082l1;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTarget<T> implements Target<T> {
    private final int height;

    @Nullable
    private InterfaceC4082l1 request;
    private final int width;

    public CustomTarget() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public CustomTarget(int i, int i2) {
        if (C4379t2.OooOo0O(i, i2)) {
            this.width = i;
            this.height = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    public final InterfaceC4082l1 getRequest() {
        return this.request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.width, this.height);
    }

    @Override // p285z2.InterfaceC4229p0
    public void onDestroy() {
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
    public final void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void setRequest(@Nullable InterfaceC4082l1 interfaceC4082l1) {
        this.request = interfaceC4082l1;
    }
}
