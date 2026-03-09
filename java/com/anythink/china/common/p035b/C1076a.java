package com.anythink.china.common.p035b;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.anythink.china.common.NotificationBroadcaseReceiver;
import com.anythink.china.common.p033a.C1072e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.china.common.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C1076a implements InterfaceC1077b {

    /* JADX INFO: renamed from: a */
    public static final String f2472a = "a";

    /* JADX INFO: renamed from: b */
    public static final String f2473b = "anythink_action_notification_click";

    /* JADX INFO: renamed from: c */
    public static final String f2474c = "anythink_action_notification_cannel";

    /* JADX INFO: renamed from: d */
    public static final String f2475d = "anythink_broadcast_receiver_extra_url";

    /* JADX INFO: renamed from: e */
    public static final String f2476e = "anythink_broadcast_receiver_extra_unique_id";

    /* JADX INFO: renamed from: f */
    public static final String f2477f = "anythink_broadcast_receiver_extra_request_status";

    /* JADX INFO: renamed from: g */
    public static final String f2478g = "anythink_broadcast_receiver_extra_notification_id";

    /* JADX INFO: renamed from: j */
    private static volatile C1076a f2479j;

    /* JADX INFO: renamed from: h */
    public Map<String, C1078c> f2480h = new HashMap();

    /* JADX INFO: renamed from: i */
    private NotificationManager f2481i;

    /* JADX INFO: renamed from: k */
    private Context f2482k;

    /* JADX INFO: renamed from: l */
    private int f2483l;

    private C1076a(Context context) {
        this.f2482k = context;
        this.f2481i = mo1533b(context);
    }

    /* JADX INFO: renamed from: a */
    private static int m1522a(long j, long j2) {
        return (int) (((j * 1.0f) / j2) * 100.0f);
    }

    /* JADX INFO: renamed from: a */
    public static C1076a m1523a(Context context) {
        if (f2479j == null) {
            synchronized (C1076a.class) {
                if (f2479j == null) {
                    f2479j = new C1076a(context);
                }
            }
        }
        return f2479j;
    }

    /* JADX INFO: renamed from: a */
    private void m1524a(C1072e c1072e, NotificationCompat.Builder builder, C1078c c1078c) {
        C1072e.a aVar = c1078c.f2487d;
        if (aVar == null || aVar != c1072e.m1505a()) {
            c1078c.f2487d = c1072e.m1505a();
            Intent intent = new Intent(f2473b);
            intent.putExtra(f2476e, c1072e.f2458n);
            intent.putExtra(f2475d, c1072e.f2446b);
            intent.putExtra(f2477f, c1072e.m1505a().toString());
            intent.putExtra(f2478g, c1078c.f2484a);
            intent.setClass(this.f2482k, NotificationBroadcaseReceiver.class);
            int i = Build.VERSION.SDK_INT;
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f2482k, c1078c.f2484a, intent, i >= 31 ? 201326592 : 134217728);
            Intent intent2 = new Intent(f2474c);
            intent2.putExtra(f2476e, c1072e.f2458n);
            intent2.putExtra(f2475d, c1072e.f2446b);
            intent2.putExtra(f2477f, c1072e.m1505a().toString());
            intent2.putExtra(f2478g, c1078c.f2484a);
            intent2.setClass(this.f2482k, NotificationBroadcaseReceiver.class);
            builder.setContentIntent(broadcast).setDeleteIntent(PendingIntent.getBroadcast(this.f2482k, c1078c.f2484a, intent2, i < 31 ? 134217728 : 201326592));
        }
    }

    /* JADX INFO: renamed from: d */
    private void m1525d(C1072e c1072e) {
        mo1532a(c1072e, 0L, 100L, true);
    }

    /* JADX INFO: renamed from: e */
    private void m1526e(C1072e c1072e) {
        mo1532a(c1072e, 0L, 100L, true);
    }

    /* JADX INFO: renamed from: f */
    private C1078c m1527f(C1072e c1072e) {
        String str = c1072e.f2458n;
        C1078c c1078c = this.f2480h.get(str);
        if (c1078c != null) {
            return c1078c;
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.f2482k, str);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str, 3);
            notificationChannel.setSound(null, null);
            this.f2481i.createNotificationChannel(notificationChannel);
        }
        this.f2483l++;
        builder.setOngoing(true).setSound(null).setPriority(0).setOnlyAlertOnce(true).setAutoCancel(false);
        try {
            builder.setSmallIcon(this.f2482k.getPackageManager().getApplicationInfo(this.f2482k.getPackageName(), 128).icon);
        } catch (Throwable th) {
            th.printStackTrace();
            builder.setSmallIcon(C1345i.m4154a(this.f2482k, "core_icon_close", C1875i.f11528c));
        }
        builder.setContentTitle(c1072e.f2447c).setLargeIcon(c1072e.f2448d);
        C1078c c1078c2 = new C1078c();
        c1078c2.f2484a = this.f2483l;
        c1078c2.f2485b = builder;
        c1078c2.f2486c = -1;
        this.f2480h.put(str, c1078c2);
        return c1078c2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1528a() {
        try {
            NotificationManager notificationManager = this.f2481i;
            if (notificationManager != null) {
                notificationManager.cancelAll();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1529a(int i) {
        if (i < 0) {
            return;
        }
        try {
            this.f2481i.cancel(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1530a(C1072e c1072e) {
        mo1532a(c1072e, 100L, 100L, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m1531a(C1072e c1072e, long j, long j2) {
        mo1532a(c1072e, j, j2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0153 A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:92:0x000f, B:94:0x0013, B:95:0x001b, B:97:0x0025, B:108:0x00bc, B:112:0x00c8, B:145:0x014d, B:147:0x0153, B:148:0x0157, B:150:0x0169, B:152:0x0178, B:151:0x0171, B:116:0x00d8, B:119:0x00e4, B:128:0x0103, B:130:0x010b, B:135:0x0116, B:138:0x011f, B:140:0x0125, B:142:0x0129, B:143:0x0138, B:144:0x013d, B:99:0x002b, B:103:0x0070, B:107:0x00ad), top: B:164:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0169 A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:92:0x000f, B:94:0x0013, B:95:0x001b, B:97:0x0025, B:108:0x00bc, B:112:0x00c8, B:145:0x014d, B:147:0x0153, B:148:0x0157, B:150:0x0169, B:152:0x0178, B:151:0x0171, B:116:0x00d8, B:119:0x00e4, B:128:0x0103, B:130:0x010b, B:135:0x0116, B:138:0x011f, B:140:0x0125, B:142:0x0129, B:143:0x0138, B:144:0x013d, B:99:0x002b, B:103:0x0070, B:107:0x00ad), top: B:164:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0171 A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:92:0x000f, B:94:0x0013, B:95:0x001b, B:97:0x0025, B:108:0x00bc, B:112:0x00c8, B:145:0x014d, B:147:0x0153, B:148:0x0157, B:150:0x0169, B:152:0x0178, B:151:0x0171, B:116:0x00d8, B:119:0x00e4, B:128:0x0103, B:130:0x010b, B:135:0x0116, B:138:0x011f, B:140:0x0125, B:142:0x0129, B:143:0x0138, B:144:0x013d, B:99:0x002b, B:103:0x0070, B:107:0x00ad), top: B:164:0x000f, outer: #1 }] */
    @Override // com.anythink.china.common.p035b.InterfaceC1077b
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo1532a(com.anythink.china.common.p033a.C1072e r15, long r16, long r18, boolean r20) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.china.common.p035b.C1076a.mo1532a(com.anythink.china.common.a.e, long, long, boolean):void");
    }

    @Override // com.anythink.china.common.p035b.InterfaceC1077b
    /* JADX INFO: renamed from: b */
    public final NotificationManager mo1533b(Context context) {
        if (context == null) {
            return null;
        }
        return (NotificationManager) context.getSystemService("notification");
    }

    @Override // com.anythink.china.common.p035b.InterfaceC1077b
    /* JADX INFO: renamed from: b */
    public final String mo1534b(C1072e c1072e) {
        return c1072e.f2458n;
    }

    /* JADX INFO: renamed from: c */
    public final void m1535c(C1072e c1072e) {
        if (c1072e == null || TextUtils.isEmpty(c1072e.f2446b) || this.f2481i == null) {
            return;
        }
        try {
            this.f2481i.cancel(m1527f(c1072e).f2484a);
            this.f2480h.remove(c1072e.f2458n);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
