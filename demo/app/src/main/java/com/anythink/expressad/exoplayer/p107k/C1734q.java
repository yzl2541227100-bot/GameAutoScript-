package com.anythink.expressad.exoplayer.p107k;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.q */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class C1734q {

    /* JADX INFO: renamed from: a */
    public static final int f9782a = -1000;

    /* JADX INFO: renamed from: b */
    public static final int f9783b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f9784c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f9785d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f9786e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f9787f = 4;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.q$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private C1734q() {
    }

    /* JADX INFO: renamed from: a */
    private static void m8226a(Context context, int i, @Nullable Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notification != null) {
            notificationManager.notify(i, notification);
        } else {
            notificationManager.cancel(i);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m8227a(Context context, String str, @StringRes int i, int i2) {
        if (C1717af.f9627a >= 26) {
            ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel(str, context.getString(i), i2));
        }
    }
}
