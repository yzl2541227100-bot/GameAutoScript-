package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p285z2.InterfaceC4082l1;
import p285z2.InterfaceC4229p0;
import p285z2.InterfaceC4526x1;

/* JADX INFO: loaded from: classes.dex */
public interface Target<R> extends InterfaceC4229p0 {
    public static final int SIZE_ORIGINAL = Integer.MIN_VALUE;

    @Nullable
    InterfaceC4082l1 getRequest();

    void getSize(@NonNull SizeReadyCallback sizeReadyCallback);

    void onLoadCleared(@Nullable Drawable drawable);

    void onLoadFailed(@Nullable Drawable drawable);

    void onLoadStarted(@Nullable Drawable drawable);

    void onResourceReady(@NonNull R r, @Nullable InterfaceC4526x1<? super R> interfaceC4526x1);

    void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback);

    void setRequest(@Nullable InterfaceC4082l1 interfaceC4082l1);
}
