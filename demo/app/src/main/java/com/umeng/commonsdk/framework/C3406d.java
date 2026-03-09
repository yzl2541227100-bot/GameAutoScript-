package com.umeng.commonsdk.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.proguard.C3459j;
import com.umeng.commonsdk.proguard.C3470u;
import com.umeng.commonsdk.statistics.C3490d;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ImLatent;
import java.io.File;

/* JADX INFO: renamed from: com.umeng.commonsdk.framework.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3406d {

    /* JADX INFO: renamed from: a */
    private static HandlerThread f18628a = null;

    /* JADX INFO: renamed from: b */
    private static Handler f18629b = null;

    /* JADX INFO: renamed from: c */
    private static Handler f18630c = null;

    /* JADX INFO: renamed from: d */
    private static final int f18631d = 273;

    /* JADX INFO: renamed from: e */
    private static final int f18632e = 512;

    /* JADX INFO: renamed from: f */
    private static final int f18633f = 769;

    /* JADX INFO: renamed from: g */
    private static a f18634g;

    /* JADX INFO: renamed from: h */
    private static ConnectivityManager f18635h;

    /* JADX INFO: renamed from: i */
    private static NetworkInfo f18636i;

    /* JADX INFO: renamed from: j */
    private static IntentFilter f18637j;

    /* JADX INFO: renamed from: k */
    private static StatTracer f18638k;

    /* JADX INFO: renamed from: l */
    private static ImLatent f18639l;

    /* JADX INFO: renamed from: m */
    private static boolean f18640m;

    /* JADX INFO: renamed from: n */
    private static BroadcastReceiver f18641n = new BroadcastReceiver() { // from class: com.umeng.commonsdk.framework.d.1

        /* JADX INFO: renamed from: com.umeng.commonsdk.framework.d$1$1 */
        public class RunnableC47191 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f18642a;

            public RunnableC47191(Context context) {
                context = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3459j.m15929d(context);
            }
        }

        /* JADX INFO: renamed from: com.umeng.commonsdk.framework.d$1$2 */
        public class AnonymousClass2 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f18644a;

            public AnonymousClass2(Context context) {
                context = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C3470u.m16038a(context);
                } catch (Throwable th) {
                    C3454e.m15904a(context, th);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            new Thread(new Runnable() { // from class: com.umeng.commonsdk.framework.d.1.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f18642a;

                public RunnableC47191(Context context2) {
                    context = context2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C3459j.m15929d(context);
                }
            }).start();
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Context contextM15665a = C3405c.m15665a();
                ConnectivityManager unused = C3406d.f18635h = (ConnectivityManager) contextM15665a.getSystemService("connectivity");
                try {
                    NetworkInfo unused2 = C3406d.f18636i = C3406d.f18635h.getActiveNetworkInfo();
                    if (C3406d.f18636i == null || !C3406d.f18636i.isAvailable()) {
                        C3489e.m16338c("--->>> network disconnected.");
                        boolean unused3 = C3406d.f18640m = false;
                    } else {
                        C3489e.m16338c("--->>> network isAvailable, check if there are any files to send.");
                        boolean unused4 = C3406d.f18640m = true;
                        C3406d.m15680c(273);
                        if (C3406d.f18636i.getType() == 1) {
                            C3489e.m16338c("--->>> wifi connection available, send uop packet now.");
                            new Thread(new Runnable() { // from class: com.umeng.commonsdk.framework.d.1.2

                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ Context f18644a;

                                public AnonymousClass2(Context contextM15665a2) {
                                    context = contextM15665a2;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        C3470u.m16038a(context);
                                    } catch (Throwable th) {
                                        C3454e.m15904a(context, th);
                                    }
                                }
                            }).start();
                        }
                    }
                } catch (Throwable th) {
                    C3454e.m15904a(contextM15665a2, th);
                }
            }
        }
    };

    /* JADX INFO: renamed from: com.umeng.commonsdk.framework.d$1 */
    public static class AnonymousClass1 extends BroadcastReceiver {

        /* JADX INFO: renamed from: com.umeng.commonsdk.framework.d$1$1 */
        public class RunnableC47191 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f18642a;

            public RunnableC47191(Context context2) {
                context = context2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3459j.m15929d(context);
            }
        }

        /* JADX INFO: renamed from: com.umeng.commonsdk.framework.d$1$2 */
        public class AnonymousClass2 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f18644a;

            public AnonymousClass2(Context contextM15665a2) {
                context = contextM15665a2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C3470u.m16038a(context);
                } catch (Throwable th) {
                    C3454e.m15904a(context, th);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context2, Intent intent) {
            new Thread(new Runnable() { // from class: com.umeng.commonsdk.framework.d.1.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f18642a;

                public RunnableC47191(Context context22) {
                    context = context22;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C3459j.m15929d(context);
                }
            }).start();
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Context contextM15665a2 = C3405c.m15665a();
                ConnectivityManager unused = C3406d.f18635h = (ConnectivityManager) contextM15665a2.getSystemService("connectivity");
                try {
                    NetworkInfo unused2 = C3406d.f18636i = C3406d.f18635h.getActiveNetworkInfo();
                    if (C3406d.f18636i == null || !C3406d.f18636i.isAvailable()) {
                        C3489e.m16338c("--->>> network disconnected.");
                        boolean unused3 = C3406d.f18640m = false;
                    } else {
                        C3489e.m16338c("--->>> network isAvailable, check if there are any files to send.");
                        boolean unused4 = C3406d.f18640m = true;
                        C3406d.m15680c(273);
                        if (C3406d.f18636i.getType() == 1) {
                            C3489e.m16338c("--->>> wifi connection available, send uop packet now.");
                            new Thread(new Runnable() { // from class: com.umeng.commonsdk.framework.d.1.2

                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ Context f18644a;

                                public AnonymousClass2(Context contextM15665a22) {
                                    context = contextM15665a22;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        C3470u.m16038a(context);
                                    } catch (Throwable th) {
                                        C3454e.m15904a(context, th);
                                    }
                                }
                            }).start();
                        }
                    }
                } catch (Throwable th) {
                    C3454e.m15904a(contextM15665a22, th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.framework.d$2 */
    public class AnonymousClass2 extends Handler {
        public AnonymousClass2(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 273) {
                C3489e.m16332b("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                C3406d.m15687j();
            } else {
                if (i != 512) {
                    return;
                }
                C3406d.m15686i();
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.framework.d$a */
    public static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if ((i & 8) != 8) {
                return;
            }
            C3489e.m16332b("--->>> envelope file created >>> " + str);
            C3406d.m15680c(273);
        }
    }

    public C3406d(Context context, Handler handler) {
        f18630c = handler;
        if (f18628a == null) {
            HandlerThread handlerThread = new HandlerThread("NetWorkSender");
            f18628a = handlerThread;
            handlerThread.start();
            if (f18634g == null) {
                a aVar = new a(C3404b.m15660h(context));
                f18634g = aVar;
                aVar.startWatching();
                C3489e.m16332b("--->>> FileMonitor has already started!");
            }
            Context contextM15665a = C3405c.m15665a();
            if (DeviceConfig.checkPermission(contextM15665a, "android.permission.ACCESS_NETWORK_STATE") && f18637j == null) {
                IntentFilter intentFilter = new IntentFilter();
                f18637j = intentFilter;
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                BroadcastReceiver broadcastReceiver = f18641n;
                if (broadcastReceiver != null) {
                    contextM15665a.registerReceiver(broadcastReceiver, f18637j);
                }
            }
            if (f18638k == null) {
                StatTracer statTracer = StatTracer.getInstance(context);
                f18638k = statTracer;
                f18639l = ImLatent.getService(context, statTracer);
            }
            if (f18629b == null) {
                f18629b = new Handler(f18628a.getLooper()) { // from class: com.umeng.commonsdk.framework.d.2
                    public AnonymousClass2(Looper looper) {
                        super(looper);
                    }

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        int i = message.what;
                        if (i == 273) {
                            C3489e.m16332b("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                            C3406d.m15687j();
                        } else {
                            if (i != 512) {
                                return;
                            }
                            C3406d.m15686i();
                        }
                    }
                };
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15672a() {
        m15680c(512);
    }

    /* JADX INFO: renamed from: a */
    private static void m15674a(int i, int i2) {
        Handler handler;
        if (!f18640m || (handler = f18630c) == null) {
            return;
        }
        handler.removeMessages(i);
        Message messageObtainMessage = f18630c.obtainMessage();
        messageObtainMessage.what = i;
        f18630c.sendMessageDelayed(messageObtainMessage, i2);
    }

    /* JADX INFO: renamed from: a */
    private static void m15675a(int i, long j) {
        Handler handler;
        if (!f18640m || (handler = f18629b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i;
        f18629b.sendMessageDelayed(messageObtainMessage, j);
    }

    /* JADX INFO: renamed from: b */
    public static void m15677b() {
        m15678b(273);
    }

    /* JADX INFO: renamed from: b */
    private static void m15678b(int i) {
        Handler handler;
        if (!f18640m || (handler = f18629b) == null || handler.hasMessages(i)) {
            return;
        }
        Message messageObtainMessage = f18629b.obtainMessage();
        messageObtainMessage.what = i;
        f18629b.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: c */
    public static void m15679c() {
        m15674a(f18633f, 3000);
    }

    /* JADX INFO: renamed from: c */
    public static void m15680c(int i) {
        Handler handler;
        if (!f18640m || (handler = f18629b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i;
        f18629b.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: h */
    private static void m15685h() {
        if (f18628a != null) {
            f18628a = null;
        }
        if (f18629b != null) {
            f18629b = null;
        }
        if (f18630c != null) {
            f18630c = null;
        }
        if (f18639l != null) {
            f18639l = null;
        }
        if (f18638k != null) {
            f18638k = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m15686i() {
        a aVar = f18634g;
        if (aVar != null) {
            aVar.stopWatching();
            f18634g = null;
        }
        if (f18637j != null) {
            if (f18641n != null) {
                C3405c.m15665a().unregisterReceiver(f18641n);
                f18641n = null;
            }
            f18637j = null;
        }
        C3489e.m16332b("--->>> handleQuit: Quit sender thread.");
        HandlerThread handlerThread = f18628a;
        if (handlerThread != null) {
            handlerThread.quit();
            m15685h();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m15687j() {
        C3489e.m16332b("--->>> handleProcessNext: Enter...");
        if (f18640m) {
            Context contextM15665a = C3405c.m15665a();
            try {
                if (C3404b.m15654c(contextM15665a) > 0) {
                    C3489e.m16332b("--->>> The envelope file exists.");
                    if (C3404b.m15654c(contextM15665a) > 100) {
                        C3489e.m16332b("--->>> Number of envelope files is greater than 100, remove old files first.");
                        C3404b.m15656d(contextM15665a);
                    }
                    File fileM15657e = C3404b.m15657e(contextM15665a);
                    if (fileM15657e != null) {
                        C3489e.m16332b("--->>> Ready to send envelope file [" + fileM15657e.getPath() + "].");
                        C3490d c3490d = new C3490d(contextM15665a);
                        ImLatent imLatent = f18639l;
                        if (imLatent != null && imLatent.isLatentActivite()) {
                            f18639l.latentDeactivite();
                            long delayTime = f18639l.getDelayTime();
                            if (delayTime > 0) {
                                C3489e.m16338c("start lacency policy, wait [" + delayTime + "] milliseconds .");
                                try {
                                    Thread.sleep(delayTime * 1000);
                                } catch (Throwable th) {
                                    C3454e.m15904a(contextM15665a, th);
                                }
                            }
                        }
                        if (!c3490d.m16363a(fileM15657e)) {
                            C3489e.m16332b("--->>> Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                        C3489e.m16332b("--->>> Send envelope file success, delete it.");
                        if (!C3404b.m15650a(fileM15657e)) {
                            C3489e.m16332b("--->>> Failed to delete already processed file. We try again after delete failed.");
                            C3404b.m15650a(fileM15657e);
                        }
                        m15680c(273);
                        return;
                    }
                }
                C3489e.m16332b("--->>> The envelope file not exists, start auto process for module cache data.");
                m15679c();
            } catch (Throwable th2) {
                C3454e.m15904a(contextM15665a, th2);
            }
        }
    }
}
