package com.umeng.commonsdk.stateless;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.statistics.common.C3489e;
import java.io.File;

/* JADX INFO: renamed from: com.umeng.commonsdk.stateless.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3479d {

    /* JADX INFO: renamed from: a */
    public static final int f19122a = 273;

    /* JADX INFO: renamed from: b */
    private static Context f19123b = null;

    /* JADX INFO: renamed from: c */
    private static HandlerThread f19124c = null;

    /* JADX INFO: renamed from: d */
    private static Handler f19125d = null;

    /* JADX INFO: renamed from: f */
    private static final int f19127f = 512;

    /* JADX INFO: renamed from: g */
    private static IntentFilter f19128g;

    /* JADX INFO: renamed from: h */
    private static boolean f19129h;

    /* JADX INFO: renamed from: e */
    private static Object f19126e = new Object();

    /* JADX INFO: renamed from: i */
    private static BroadcastReceiver f19130i = new BroadcastReceiver() { // from class: com.umeng.commonsdk.stateless.d.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager;
            if (context == null || intent == null) {
                return;
            }
            try {
                if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    Context unused = C3479d.f19123b = context.getApplicationContext();
                    if (C3479d.f19123b != null && (connectivityManager = (ConnectivityManager) C3479d.f19123b.getSystemService("connectivity")) != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                            C3489e.m16329a("walle", "[stateless] net reveiver disconnected --->>>");
                            boolean unused2 = C3479d.f19129h = false;
                        } else {
                            boolean unused3 = C3479d.f19129h = true;
                            C3489e.m16329a("walle", "[stateless] net reveiver ok --->>>");
                            C3479d.m16233b(273);
                        }
                    }
                }
            } catch (Throwable th) {
                C3454e.m15904a(context, th);
            }
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x0077, DONT_GENERATE, TryCatch #1 {, blocks: (B:22:0x0075, B:21:0x0072, B:5:0x0008, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:12:0x0031, B:14:0x003b, B:16:0x004c, B:18:0x005c), top: B:27:0x0008, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3479d(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = com.umeng.commonsdk.stateless.C3479d.f19126e
            monitor-enter(r0)
            if (r7 == 0) goto L75
            android.content.Context r1 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L71
            com.umeng.commonsdk.stateless.C3479d.f19123b = r1     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L75
            android.os.HandlerThread r1 = com.umeng.commonsdk.stateless.C3479d.f19124c     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L75
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "SL-NetWorkSender"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L71
            com.umeng.commonsdk.stateless.C3479d.f19124c = r1     // Catch: java.lang.Throwable -> L71
            r1.start()     // Catch: java.lang.Throwable -> L71
            android.os.Handler r1 = com.umeng.commonsdk.stateless.C3479d.f19125d     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L31
            com.umeng.commonsdk.stateless.d$2 r1 = new com.umeng.commonsdk.stateless.d$2     // Catch: java.lang.Throwable -> L71
            android.os.HandlerThread r2 = com.umeng.commonsdk.stateless.C3479d.f19124c     // Catch: java.lang.Throwable -> L71
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L71
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L71
            com.umeng.commonsdk.stateless.C3479d.f19125d = r1     // Catch: java.lang.Throwable -> L71
        L31:
            android.content.Context r1 = com.umeng.commonsdk.stateless.C3479d.f19123b     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.checkPermission(r1, r2)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L75
            java.lang.String r1 = "walle"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "[stateless] begin register receiver"
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L71
            com.umeng.commonsdk.statistics.common.C3489e.m16329a(r1, r3)     // Catch: java.lang.Throwable -> L71
            android.content.IntentFilter r1 = com.umeng.commonsdk.stateless.C3479d.f19128g     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L75
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L71
            r1.<init>()     // Catch: java.lang.Throwable -> L71
            com.umeng.commonsdk.stateless.C3479d.f19128g = r1     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1.addAction(r3)     // Catch: java.lang.Throwable -> L71
            android.content.BroadcastReceiver r1 = com.umeng.commonsdk.stateless.C3479d.f19130i     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L75
            java.lang.String r1 = "walle"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = "[stateless] register receiver ok"
            r2[r5] = r3     // Catch: java.lang.Throwable -> L71
            com.umeng.commonsdk.statistics.common.C3489e.m16329a(r1, r2)     // Catch: java.lang.Throwable -> L71
            android.content.Context r1 = com.umeng.commonsdk.stateless.C3479d.f19123b     // Catch: java.lang.Throwable -> L71
            android.content.BroadcastReceiver r2 = com.umeng.commonsdk.stateless.C3479d.f19130i     // Catch: java.lang.Throwable -> L71
            android.content.IntentFilter r3 = com.umeng.commonsdk.stateless.C3479d.f19128g     // Catch: java.lang.Throwable -> L71
            r1.registerReceiver(r2, r3)     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r1 = move-exception
            com.umeng.commonsdk.proguard.C3454e.m15904a(r7, r1)     // Catch: java.lang.Throwable -> L77
        L75:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            return
        L77:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C3479d.<init>(android.content.Context):void");
    }

    /* JADX INFO: renamed from: a */
    public static void m16229a() {
        m16233b(512);
    }

    /* JADX INFO: renamed from: a */
    public static void m16230a(int i) {
        Handler handler;
        if (!f19129h || (handler = f19125d) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i;
        f19125d.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: b */
    public static void m16233b(int i) {
        Handler handler;
        try {
            if (!f19129h || (handler = f19125d) == null || handler.hasMessages(i)) {
                return;
            }
            C3489e.m16329a("walle", "[stateless] sendMsgOnce !!!!");
            Message messageObtainMessage = f19125d.obtainMessage();
            messageObtainMessage.what = i;
            f19125d.sendMessage(messageObtainMessage);
        } catch (Throwable th) {
            C3454e.m15904a(f19123b, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m16236e() {
        Context context;
        if (!f19129h || (context = f19123b) == null) {
            return;
        }
        try {
            File fileM16241a = C3481f.m16241a(context);
            if (fileM16241a == null || fileM16241a.getParentFile() == null || TextUtils.isEmpty(fileM16241a.getParentFile().getName())) {
                return;
            }
            C3480e c3480e = new C3480e(f19123b);
            String str = new String(Base64.decode(fileM16241a.getParentFile().getName(), 0));
            C3489e.m16329a("walle", "[stateless] handleProcessNext, pathUrl is " + str);
            byte[] bArrM16245a = null;
            try {
                bArrM16245a = C3481f.m16245a(fileM16241a.getAbsolutePath());
            } catch (Exception unused) {
            }
            if (!c3480e.m16239a(bArrM16245a, str)) {
                C3489e.m16329a("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                return;
            }
            C3489e.m16329a("walle", "[stateless] Send envelope file success, delete it.");
            File file = new File(fileM16241a.getAbsolutePath());
            if (!file.delete()) {
                C3489e.m16329a("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                file.delete();
            }
            m16233b(273);
        } catch (Throwable th) {
            C3454e.m15904a(f19123b, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static void m16237f() {
        if (f19128g != null) {
            BroadcastReceiver broadcastReceiver = f19130i;
            if (broadcastReceiver != null) {
                Context context = f19123b;
                if (context != null) {
                    context.unregisterReceiver(broadcastReceiver);
                }
                f19130i = null;
            }
            f19128g = null;
        }
        HandlerThread handlerThread = f19124c;
        if (handlerThread != null) {
            handlerThread.quit();
            if (f19124c != null) {
                f19124c = null;
            }
            if (f19125d != null) {
                f19125d = null;
            }
        }
    }
}
