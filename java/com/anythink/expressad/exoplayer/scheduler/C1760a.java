package com.anythink.expressad.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.scheduler.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1760a {

    /* JADX INFO: renamed from: a */
    public static final int f10037a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f10038b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f10039c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f10040d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f10041e = 4;

    /* JADX INFO: renamed from: f */
    private static final int f10042f = 8;

    /* JADX INFO: renamed from: g */
    private static final int f10043g = 16;

    /* JADX INFO: renamed from: h */
    private static final int f10044h = 7;

    /* JADX INFO: renamed from: i */
    private static final String f10045i = "Requirements";

    /* JADX INFO: renamed from: j */
    private static final String[] f10046j = null;

    /* JADX INFO: renamed from: k */
    private final int f10047k;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.scheduler.a$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C1760a(int i) {
        this.f10047k = i;
    }

    private C1760a(int i, boolean z, boolean z3) {
        this(i | (z ? 16 : 0) | (z3 ? 8 : 0));
    }

    /* JADX INFO: renamed from: a */
    private static boolean m8477a(ConnectivityManager connectivityManager) {
        if (C1717af.f9627a < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return !(networkCapabilities == null || !networkCapabilities.hasCapability(16));
    }

    /* JADX INFO: renamed from: a */
    private static boolean m8478a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (C1717af.f9627a >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m8479b(android.content.Context r9) {
        /*
            r8 = this;
            int r0 = r8.f10047k
            r1 = 7
            r0 = r0 & r1
            r2 = 1
            if (r0 != 0) goto L8
            return r2
        L8:
            java.lang.String r3 = "connectivity"
            java.lang.Object r9 = r9.getSystemService(r3)
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9
            android.net.NetworkInfo r3 = r9.getActiveNetworkInfo()
            r4 = 0
            if (r3 == 0) goto L7a
            boolean r5 = r3.isConnected()
            if (r5 != 0) goto L1e
            goto L7a
        L1e:
            int r5 = com.anythink.expressad.exoplayer.p107k.C1717af.f9627a
            r6 = 23
            r7 = 16
            if (r5 >= r6) goto L28
        L26:
            r6 = 1
            goto L42
        L28:
            android.net.Network r6 = r9.getActiveNetwork()
            if (r6 == 0) goto L41
            android.net.NetworkCapabilities r6 = r9.getNetworkCapabilities(r6)
            if (r6 == 0) goto L3d
            boolean r6 = r6.hasCapability(r7)
            if (r6 != 0) goto L3b
            goto L3d
        L3b:
            r6 = 0
            goto L3e
        L3d:
            r6 = 1
        L3e:
            if (r6 != 0) goto L41
            goto L26
        L41:
            r6 = 0
        L42:
            if (r6 != 0) goto L45
            return r4
        L45:
            if (r0 != r2) goto L48
            return r2
        L48:
            r6 = 3
            if (r0 != r6) goto L53
            boolean r9 = r3.isRoaming()
            if (r9 != 0) goto L52
            return r2
        L52:
            return r4
        L53:
            if (r5 < r7) goto L5a
            boolean r9 = r9.isActiveNetworkMetered()
            goto L69
        L5a:
            int r9 = r3.getType()
            if (r9 == r2) goto L68
            if (r9 == r1) goto L68
            r1 = 9
            if (r9 == r1) goto L68
            r9 = 1
            goto L69
        L68:
            r9 = 0
        L69:
            r1 = 2
            if (r0 != r1) goto L70
            if (r9 != 0) goto L6f
            return r2
        L6f:
            return r4
        L70:
            r1 = 4
            if (r0 != r1) goto L74
            return r9
        L74:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.scheduler.C1760a.m8479b(android.content.Context):boolean");
    }

    /* JADX INFO: renamed from: c */
    private boolean m8480c(Context context) {
        if (!m8485b()) {
            return true;
        }
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* JADX INFO: renamed from: d */
    private boolean m8481d(Context context) {
        if (!m8486c()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i = C1717af.f9627a;
        return i >= 23 ? !powerManager.isDeviceIdleMode() : i >= 20 ? !powerManager.isInteractive() : !powerManager.isScreenOn();
    }

    /* JADX INFO: renamed from: e */
    private static void m8482e() {
    }

    /* JADX INFO: renamed from: a */
    public final int m8483a() {
        return this.f10047k & 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d5 A[RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m8484a(android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.scheduler.C1760a.m8484a(android.content.Context):boolean");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8485b() {
        return (this.f10047k & 16) != 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8486c() {
        return (this.f10047k & 8) != 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m8487d() {
        return this.f10047k;
    }

    public final String toString() {
        return super.toString();
    }
}
