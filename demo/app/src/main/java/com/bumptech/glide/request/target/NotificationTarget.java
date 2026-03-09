package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p285z2.C4305r2;
import p285z2.InterfaceC4526x1;

/* JADX INFO: loaded from: classes.dex */
public class NotificationTarget extends SimpleTarget<Bitmap> {
    private final Context context;
    private final Notification notification;
    private final int notificationId;
    private final String notificationTag;
    private final RemoteViews remoteViews;
    private final int viewId;

    public NotificationTarget(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.context = (Context) C4305r2.OooO0o0(context, "Context must not be null!");
        this.notification = (Notification) C4305r2.OooO0o0(notification, "Notification object can not be null!");
        this.remoteViews = (RemoteViews) C4305r2.OooO0o0(remoteViews, "RemoteViews object can not be null!");
        this.viewId = i3;
        this.notificationId = i4;
        this.notificationTag = str;
    }

    public NotificationTarget(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, null);
    }

    public NotificationTarget(Context context, int i, RemoteViews remoteViews, Notification notification, int i2, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, notification, i2, str);
    }

    private void update() {
        ((NotificationManager) C4305r2.OooO0Oo((NotificationManager) this.context.getSystemService("notification"))).notify(this.notificationTag, this.notificationId, this.notification);
    }

    public void onResourceReady(@NonNull Bitmap bitmap, @Nullable InterfaceC4526x1<? super Bitmap> interfaceC4526x1) {
        this.remoteViews.setImageViewBitmap(this.viewId, bitmap);
        update();
    }

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable InterfaceC4526x1 interfaceC4526x1) {
        onResourceReady((Bitmap) obj, (InterfaceC4526x1<? super Bitmap>) interfaceC4526x1);
    }
}
