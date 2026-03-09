package com.anythink.china.common;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.anythink.china.common.p033a.C1072e;
import com.anythink.china.common.p033a.InterfaceC1074g;
import com.anythink.china.common.p035b.C1076a;
import com.anythink.china.common.p036c.C1080a;
import com.anythink.china.common.p036c.C1081b;
import com.anythink.china.common.service.ApkDownloadService;
import com.anythink.core.common.C1300k;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p057g.InterfaceC1264b;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.china.common.a */
/* JADX INFO: loaded from: classes.dex */
public class C1066a implements InterfaceC1074g {

    /* JADX INFO: renamed from: a */
    public static final String f2356a = "a";

    /* JADX INFO: renamed from: b */
    public static final String f2357b = "action_offer_download_start";

    /* JADX INFO: renamed from: c */
    public static final String f2358c = "action_offer_download_end";

    /* JADX INFO: renamed from: d */
    public static final String f2359d = "action_offer_install_start";

    /* JADX INFO: renamed from: e */
    public static final String f2360e = "action_offer_install_successful";

    /* JADX INFO: renamed from: f */
    public static final String f2361f = "receiver_extra_offer_id";

    /* JADX INFO: renamed from: g */
    public static final String f2362g = "receiver_extra_click_id";

    /* JADX INFO: renamed from: h */
    private static volatile C1066a f2363h;

    /* JADX INFO: renamed from: i */
    private Context f2364i;

    /* JADX INFO: renamed from: n */
    private ConcurrentHashMap<String, C1072e> f2369n;

    /* JADX INFO: renamed from: o */
    private ConcurrentHashMap<String, C1072e> f2370o;

    /* JADX INFO: renamed from: p */
    private ConcurrentHashMap<String, C1072e> f2371p;

    /* JADX INFO: renamed from: q */
    private Map<String, C1072e> f2372q;

    /* JADX INFO: renamed from: t */
    private BroadcastReceiver f2375t;

    /* JADX INFO: renamed from: u */
    private ApkDownloadService.BinderC1084a f2376u;

    /* JADX INFO: renamed from: v */
    private BroadcastReceiver f2377v;

    /* JADX INFO: renamed from: r */
    private final int f2373r = 1;

    /* JADX INFO: renamed from: s */
    private long f2374s = 604800000;

    /* JADX INFO: renamed from: w */
    private ServiceConnection f2378w = new ServiceConnection() { // from class: com.anythink.china.common.a.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = C1066a.f2356a;
            try {
                C1066a.this.f2376u = (ApkDownloadService.BinderC1084a) iBinder;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            String str = C1066a.f2356a;
            C1066a.this.f2376u = null;
        }
    };

    /* JADX INFO: renamed from: j */
    private List<C1072e> f2365j = Collections.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: k */
    private ConcurrentHashMap<String, C1072e> f2366k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l */
    private ConcurrentHashMap<String, C1072e> f2367l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: m */
    private ConcurrentHashMap<String, AbstractC1067a.a> f2368m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.anythink.china.common.a$3, reason: invalid class name */
    public class AnonymousClass3 implements AbstractC1067a.a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.china.common.p033a.AbstractC1067a.a
        /* JADX INFO: renamed from: a */
        public final void mo1464a(final C1072e c1072e, final long j) {
            Log.i(C1066a.f2356a, "onSuccess: " + c1072e.f2447c);
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.china.common.a.3.2
                @Override // java.lang.Runnable
                public final void run() {
                    C1066a.this.f2368m.remove(c1072e.f2458n);
                    C1066a.this.f2366k.remove(c1072e.f2458n);
                    if (C1066a.this.f2369n == null) {
                        C1066a.this.f2369n = new ConcurrentHashMap();
                    }
                    ConcurrentHashMap concurrentHashMap = C1066a.this.f2369n;
                    C1072e c1072e2 = c1072e;
                    concurrentHashMap.put(c1072e2.f2458n, c1072e2);
                    Intent intent = new Intent();
                    intent.setAction(C1066a.f2358c);
                    intent.setPackage(C1066a.this.f2364i.getPackageName());
                    intent.putExtra(C1066a.f2361f, c1072e.f2450f);
                    intent.putExtra(C1066a.f2362g, c1072e.f2457m);
                    C1300k.m3741a(C1066a.this.f2364i).m3746a(intent);
                    C1066a.this.mo1455b(c1072e);
                    C1076a.m1523a(C1066a.this.f2364i).m1535c(c1072e);
                    C1076a.m1523a(C1066a.this.f2364i).m1530a(c1072e);
                    C1072e c1072e3 = c1072e;
                    C1322e.m3914a(c1072e3.f2445a, c1072e3.f2450f, c1072e3.f2446b, 2, (String) null, j, c1072e3.f2452h);
                    C1066a.this.mo1454b();
                }
            });
        }

        @Override // com.anythink.china.common.p033a.AbstractC1067a.a
        /* JADX INFO: renamed from: a */
        public final void mo1465a(final C1072e c1072e, final long j, final long j2) {
            String str = C1066a.f2356a;
            new StringBuilder("onStartBefore: ").append(c1072e.f2446b);
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.china.common.a.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (j < j2) {
                        C1066a.this.m1438d("正在下载： " + c1072e.f2447c);
                        C1076a.m1523a(C1066a.this.f2364i).m1535c(c1072e);
                        C1076a.m1523a(C1066a.this.f2364i).m1531a(c1072e, j, j2);
                    }
                    Intent intent = new Intent();
                    intent.setAction(C1066a.f2357b);
                    intent.setPackage(C1066a.this.f2364i.getPackageName());
                    intent.putExtra(C1066a.f2361f, c1072e.f2450f);
                    intent.putExtra(C1066a.f2362g, c1072e.f2457m);
                    C1300k.m3741a(C1066a.this.f2364i).m3746a(intent);
                    C1072e c1072e2 = c1072e;
                    C1322e.m3914a(c1072e2.f2445a, c1072e2.f2450f, c1072e2.f2446b, 1, (String) null, 0L, j2);
                }
            });
        }

        @Override // com.anythink.china.common.p033a.AbstractC1067a.a
        /* JADX INFO: renamed from: a */
        public final void mo1466a(final C1072e c1072e, final long j, final long j2, final int i) {
            String str = C1066a.f2356a;
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.china.common.a.3.5
                @Override // java.lang.Runnable
                public final void run() {
                    C1066a.this.f2366k.remove(c1072e.f2458n);
                    C1076a.m1523a(C1066a.this.f2364i).m1535c(c1072e);
                    int i2 = i;
                    if (i2 == 2) {
                        Log.e(C1066a.f2356a, "(" + c1072e.f2447c + ") pause download");
                        C1076a.m1523a(C1066a.this.f2364i).m1531a(c1072e, j, j2);
                        C1066a.this.mo1454b();
                        return;
                    }
                    if (i2 == 3) {
                        Log.e(C1066a.f2356a, "(" + c1072e.f2447c + ") stop download");
                    }
                }
            });
        }

        @Override // com.anythink.china.common.p033a.AbstractC1067a.a
        /* JADX INFO: renamed from: a */
        public final void mo1467a(final C1072e c1072e, final String str) {
            Log.e(C1066a.f2356a, "(" + c1072e.f2447c + ") download fail: " + str);
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.china.common.a.3.4
                @Override // java.lang.Runnable
                public final void run() {
                    C1066a.this.m1438d("下载失败： " + c1072e.f2447c);
                    C1066a.this.f2368m.remove(c1072e.f2458n);
                    C1066a.this.f2366k.remove(c1072e.f2458n);
                    if (C1066a.this.f2372q == null) {
                        C1066a.this.f2372q = Collections.synchronizedMap(new HashMap());
                    }
                    Map map = C1066a.this.f2372q;
                    C1072e c1072e2 = c1072e;
                    map.put(c1072e2.f2458n, c1072e2);
                    C1076a.m1523a(C1066a.this.f2364i).m1535c(c1072e);
                    C1076a.m1523a(C1066a.this.f2364i).m1531a(c1072e, 0L, 100L);
                    C1072e c1072e3 = c1072e;
                    C1322e.m3914a(c1072e3.f2445a, c1072e3.f2450f, c1072e3.f2446b, 3, str, 0L, c1072e3.f2452h);
                    C1066a.this.mo1454b();
                }
            });
        }

        @Override // com.anythink.china.common.p033a.AbstractC1067a.a
        /* JADX INFO: renamed from: b */
        public final void mo1468b(final C1072e c1072e, final long j, final long j2) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.china.common.a.3.3
                @Override // java.lang.Runnable
                public final void run() {
                    C1076a.m1523a(C1066a.this.f2364i).m1531a(c1072e, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.common.a$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1066a.this.f2372q != null) {
                synchronized (C1066a.this.f2372q) {
                    Iterator it = C1066a.this.f2372q.entrySet().iterator();
                    while (it.hasNext()) {
                        C1072e c1072e = (C1072e) ((Map.Entry) it.next()).getValue();
                        Log.i(C1066a.f2356a, "(" + c1072e.f2447c + ") retry to download");
                        c1072e.m1509e();
                        C1066a.this.mo1461d(c1072e);
                        it.remove();
                    }
                }
            }
        }
    }

    private C1066a(Context context) {
        this.f2364i = context.getApplicationContext();
        String strM1543a = C1081b.m1543a();
        if (!TextUtils.isEmpty(strM1543a)) {
            File file = new File(strM1543a);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        try {
            this.f2377v = new BroadcastReceiver() { // from class: com.anythink.china.common.a.2
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    try {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                        if (connectivityManager == null || !C1345i.m4162a("android.permission.ACCESS_NETWORK_STATE", context2)) {
                            return;
                        }
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (C1345i.m4159a(context2) && activeNetworkInfo.getType() == 1) {
                            C1066a.m1433a(C1066a.this);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.f2364i.registerReceiver(this.f2377v, intentFilter);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1066a m1427a(Context context) {
        if (f2363h == null) {
            synchronized (C1066a.class) {
                if (f2363h == null) {
                    f2363h = new C1066a(context);
                }
            }
        }
        return f2363h;
    }

    /* JADX INFO: renamed from: a */
    private void m1431a(long j) {
        if (j > 0) {
            this.f2374s = j;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1432a(C1072e c1072e, boolean z) {
        InterfaceC1264b interfaceC1264b = c1072e.f2456l;
        if (interfaceC1264b != null) {
            interfaceC1264b.mo264a(c1072e.f2454j, c1072e.f2445a, c1072e.f2446b, z);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1433a(C1066a c1066a) {
        C1335b.m3998a().m4007a((Runnable) c1066a.new AnonymousClass4(), 2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m1438d(final String str) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.china.common.a.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Toast.makeText(C1066a.this.f2364i, str, 0).show();
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private void m1440e(C1072e c1072e) {
        this.f2366k.put(c1072e.f2458n, c1072e);
        this.f2368m.put(c1072e.f2458n, new AnonymousClass3());
        try {
            ApkDownloadService.BinderC1084a binderC1084a = this.f2376u;
            if (binderC1084a != null) {
                binderC1084a.mo1562a(c1072e.f2458n);
                return;
            }
            Intent intent = new Intent();
            intent.setClass(this.f2364i, ApkDownloadService.class);
            intent.putExtra(ApkDownloadService.f2503a, c1072e.f2458n);
            this.f2364i.bindService(intent, this.f2378w, 1);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m1441f(C1072e c1072e) {
        return C1081b.m1546a(c1072e.f2458n) + AbstractC1067a.f2406g;
    }

    /* JADX INFO: renamed from: g */
    private void m1443g() {
        C1335b.m3998a().m4007a((Runnable) new AnonymousClass4(), 2, true);
    }

    /* JADX INFO: renamed from: h */
    private void m1444h() {
        try {
            if (this.f2375t != null) {
                return;
            }
            this.f2375t = new C1075b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addDataScheme("package");
            this.f2364i.registerReceiver(this.f2375t, intentFilter);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    private void m1445i() {
        try {
            BroadcastReceiver broadcastReceiver = this.f2375t;
            if (broadcastReceiver != null) {
                this.f2364i.unregisterReceiver(broadcastReceiver);
                this.f2375t = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: a */
    public final int mo1446a() {
        return 1;
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: a */
    public final void mo1447a(Context context, C1248m c1248m, AbstractC1247l abstractC1247l, String str, String str2, Runnable runnable, InterfaceC1264b interfaceC1264b) {
        File[] fileArrListFiles;
        if (C1080a.m1540a(context, abstractC1247l.m3167F())) {
            C1080a.m1541b(context, abstractC1247l.m3167F());
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        C1072e c1072e = new C1072e();
        c1072e.f2458n = C1344h.m4134a(abstractC1247l);
        c1072e.f2445a = c1248m.f4323d;
        c1072e.f2450f = abstractC1247l.m3229t();
        c1072e.f2446b = str;
        c1072e.f2457m = str2;
        c1072e.f2449e = abstractC1247l.m3167F();
        c1072e.f2447c = abstractC1247l.m3233v();
        c1072e.f2454j = abstractC1247l;
        AbstractC1249n abstractC1249n = c1248m.f4333n;
        if (abstractC1249n != null) {
            c1072e.f2459o = abstractC1249n.m3354j() == 1;
            c1072e.f2461q = c1248m.f4333n.m3275P();
            c1072e.f2460p = c1248m.f4333n.m3273O();
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, 50.0f, context.getResources().getDisplayMetrics());
        c1072e.f2448d = C1378b.m4482a(context).m4493a(new C1381e(1, abstractC1247l.m3237x()), iApplyDimension, iApplyDimension);
        if (abstractC1247l.m3163D() != null) {
            String strM3163D = abstractC1247l.m3163D();
            String str3 = c1248m.f4323d;
            if (str3 == null) {
                str3 = "";
            }
            c1072e.f2455k = strM3163D.replaceAll("\\{req_id\\}", str3);
        }
        c1072e.f2456l = interfaceC1264b;
        ConcurrentHashMap<String, C1072e> concurrentHashMap = this.f2371p;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(c1072e.f2458n);
        }
        Map<String, C1072e> map = this.f2372q;
        if (map != null) {
            map.remove(c1072e.f2458n);
        }
        C1066a c1066aM1427a = m1427a(context);
        long jM3257G = c1248m.f4333n.m3257G();
        if (jM3257G > 0) {
            c1066aM1427a.f2374s = jM3257G;
        }
        C1066a c1066aM1427a2 = m1427a(context);
        try {
            String strM1543a = C1081b.m1543a();
            if (!TextUtils.isEmpty(strM1543a) && ((fileArrListFiles = new File(strM1543a).listFiles()) == null || fileArrListFiles.length != 0)) {
                ArrayList arrayList = new ArrayList();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = c1066aM1427a2.f2374s;
                for (File file : fileArrListFiles) {
                    if ((file.getName().endsWith(AbstractC1067a.f2406g) && C1080a.m1542b(c1066aM1427a2.f2364i, file)) || file.lastModified() + j < jCurrentTimeMillis) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Log.i(f2356a, "clean expired file -> " + ((File) arrayList.get(i)).getName());
                    ((File) arrayList.get(i)).delete();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        m1427a(context).mo1461d(c1072e);
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: a */
    public final void mo1448a(C1072e c1072e) {
        if (c1072e == null) {
            return;
        }
        if (this.f2366k.containsKey(c1072e.f2458n)) {
            File file = new File(C1081b.m1546a(c1072e.f2458n) + AbstractC1067a.f2404e);
            File file2 = new File(C1081b.m1546a(c1072e.f2458n) + ".log");
            if (file.exists() && file2.exists()) {
                Log.i(f2356a, "(" + c1072e.f2447c + ") is downloading, do nothing");
                StringBuilder sb = new StringBuilder("正在下载中： ");
                sb.append(c1072e.f2447c);
                m1438d(sb.toString());
                return;
            }
            this.f2366k.remove(c1072e.f2458n);
        }
        int size = this.f2365j.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(c1072e.f2458n, this.f2365j.get(i).f2458n)) {
                Log.i(f2356a, "(" + c1072e.f2447c + ") is waiting for downloading, do nothing");
                StringBuilder sb2 = new StringBuilder("等待下载： ");
                sb2.append(c1072e.f2447c);
                m1438d(sb2.toString());
                return;
            }
        }
        this.f2365j.add(c1072e);
        C1076a.m1523a(this.f2364i).m1535c(c1072e);
        C1076a.m1523a(this.f2364i).mo1532a(c1072e, 0L, 100L, true);
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: a */
    public final void mo1449a(String str, String str2) {
        C1072e c1072e;
        ConcurrentHashMap<String, C1072e> concurrentHashMap;
        ConcurrentHashMap<String, C1072e> concurrentHashMap2;
        Map<String, C1072e> map;
        try {
            if (str2.equals(C1072e.a.FAIL.toString()) && (map = this.f2372q) != null && map.containsKey(str)) {
                C1072e c1072e2 = this.f2372q.get(str);
                Log.i(f2356a, "(" + c1072e2.f2447c + ") onCleanNotification: download fail");
                C1076a.m1523a(this.f2364i).m1535c(c1072e2);
                this.f2372q.remove(str);
            }
            if (str2.equals(C1072e.a.FINISH.toString()) && (concurrentHashMap2 = this.f2369n) != null && concurrentHashMap2.containsKey(str)) {
                C1072e c1072e3 = this.f2369n.get(str);
                Log.i(f2356a, "(" + c1072e3.f2447c + ") onCleanNotification: download success");
                C1076a.m1523a(this.f2364i).m1535c(c1072e3);
                this.f2369n.remove(str);
            }
            if (str2.equals(C1072e.a.INSTALLED.toString()) && (concurrentHashMap = this.f2371p) != null && concurrentHashMap.containsKey(str)) {
                C1072e c1072e4 = this.f2371p.get(str);
                Log.i(f2356a, "(" + c1072e4.f2447c + ") onCleanNotification: install success");
                C1076a.m1523a(this.f2364i).m1535c(c1072e4);
                this.f2371p.remove(str);
            }
            if (!str2.equals(C1072e.a.PAUSE.toString()) || (c1072e = this.f2367l.get(str)) == null) {
                return;
            }
            ApkDownloadService.BinderC1084a binderC1084a = this.f2376u;
            if (binderC1084a != null) {
                binderC1084a.mo1565c(c1072e.f2458n);
            }
            this.f2367l.remove(str);
            Log.i(f2356a, "(" + c1072e.f2447c + ") onCleanNotification: stop download");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: a */
    public final void mo1450a(String str, String str2, int i) {
        C1072e c1072e;
        try {
            if (str2.equals(C1072e.a.FAIL.toString())) {
                Map<String, C1072e> map = this.f2372q;
                if (map != null) {
                    C1072e c1072eRemove = map.remove(str);
                    if (c1072eRemove == null) {
                        C1076a.m1523a(this.f2364i).m1529a(i);
                        return;
                    }
                    c1072eRemove.m1509e();
                    Log.i(f2356a, "(" + c1072eRemove.f2447c + ") onClickNotification: download fail to retry");
                    mo1461d(c1072eRemove);
                    return;
                }
                return;
            }
            if (str2.equals(C1072e.a.FINISH.toString())) {
                ConcurrentHashMap<String, C1072e> concurrentHashMap = this.f2369n;
                if (concurrentHashMap != null) {
                    C1072e c1072e2 = concurrentHashMap.get(str);
                    if (c1072e2 == null) {
                        C1076a.m1523a(this.f2364i).m1529a(i);
                        return;
                    }
                    Log.i(f2356a, "(" + c1072e2.f2447c + ") onClickNotification: start intall");
                    C1076a.m1523a(this.f2364i).m1535c(c1072e2);
                    C1076a.m1523a(this.f2364i).m1530a(c1072e2);
                    mo1455b(c1072e2);
                    return;
                }
                return;
            }
            if (str2.equals(C1072e.a.INSTALLED.toString())) {
                ConcurrentHashMap<String, C1072e> concurrentHashMap2 = this.f2371p;
                if (concurrentHashMap2 != null) {
                    C1072e c1072e3 = concurrentHashMap2.get(str);
                    if (c1072e3 == null) {
                        C1076a.m1523a(this.f2364i).m1529a(i);
                        return;
                    }
                    Log.i(f2356a, "(" + c1072e3.f2447c + ") onClickNotification: start open");
                    C1076a.m1523a(this.f2364i).m1535c(c1072e3);
                    m1432a(c1072e3, true);
                    return;
                }
                return;
            }
            if (str2.equals(C1072e.a.LOADING.toString())) {
                C1072e c1072e4 = this.f2366k.get(str);
                if (c1072e4 == null) {
                    C1076a.m1523a(this.f2364i).m1529a(i);
                    return;
                }
                if (!c1072e4.m1508d() || c1072e4.f2461q == 2) {
                    return;
                }
                Log.i(f2356a, "(" + c1072e4.f2447c + ") onClickNotification: pause download");
                ApkDownloadService.BinderC1084a binderC1084a = this.f2376u;
                if (binderC1084a != null) {
                    binderC1084a.mo1564b(c1072e4.f2458n);
                }
                this.f2367l.put(c1072e4.f2458n, c1072e4);
                return;
            }
            if (str2.equals(C1072e.a.PAUSE.toString())) {
                C1072e c1072e5 = this.f2367l.get(str);
                if (c1072e5 == null) {
                    C1076a.m1523a(this.f2364i).m1529a(i);
                    return;
                }
                Log.i(f2356a, "(" + c1072e5.f2447c + ") onClickNotification: resume download");
                mo1461d(c1072e5);
                return;
            }
            if (str2.equals(C1072e.a.IDLE.toString())) {
                synchronized (this.f2365j) {
                    Iterator<C1072e> it = this.f2365j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c1072e = null;
                            break;
                        }
                        C1072e next = it.next();
                        if (next.f2458n.equals(str)) {
                            if (next.f2461q == 2) {
                                return;
                            }
                            Log.i(f2356a, "(" + next.f2447c + ") onClickNotification: pause download");
                            this.f2365j.remove(next);
                            c1072e = next;
                        }
                    }
                    if (c1072e == null) {
                        C1076a.m1523a(this.f2364i).m1529a(i);
                        return;
                    }
                    c1072e.m1515k();
                    this.f2367l.put(c1072e.f2458n, c1072e);
                    C1076a.m1523a(this.f2364i).m1535c(c1072e);
                    C1076a.m1523a(this.f2364i).mo1532a(c1072e, 0L, 100L, true);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1451a(AbstractC1247l abstractC1247l) {
        String strM4134a = C1344h.m4134a(abstractC1247l);
        ConcurrentHashMap<String, C1072e> concurrentHashMap = this.f2366k;
        return concurrentHashMap != null && concurrentHashMap.containsKey(strM4134a);
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: a */
    public final boolean mo1452a(String str) {
        String str2 = C1081b.m1546a(str) + AbstractC1067a.f2406g;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return new File(str2).exists();
    }

    /* JADX INFO: renamed from: b */
    public final int m1453b(AbstractC1247l abstractC1247l) {
        String strM4134a = C1344h.m4134a(abstractC1247l);
        synchronized (this.f2365j) {
            for (int i = 0; i < this.f2365j.size(); i++) {
                C1072e c1072e = this.f2365j.get(i);
                if (c1072e != null && c1072e.f2458n.equals(strM4134a)) {
                    return 0;
                }
            }
            ConcurrentHashMap<String, C1072e> concurrentHashMap = this.f2366k;
            if (concurrentHashMap != null && concurrentHashMap.containsKey(strM4134a)) {
                return 0;
            }
            ConcurrentHashMap<String, C1072e> concurrentHashMap2 = this.f2367l;
            if (concurrentHashMap2 != null && concurrentHashMap2.containsKey(strM4134a)) {
                return 6;
            }
            ConcurrentHashMap<String, C1072e> concurrentHashMap3 = this.f2369n;
            if ((concurrentHashMap3 == null || !concurrentHashMap3.containsKey(strM4134a)) && !mo1452a(strM4134a)) {
                return C1080a.m1540a(this.f2364i, abstractC1247l.m3167F()) ? 5 : 1;
            }
            return 4;
        }
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: b */
    public final void mo1454b() {
        synchronized (this.f2365j) {
            int size = this.f2365j.size();
            if (size == 0) {
                return;
            }
            int size2 = this.f2366k.size();
            if (size2 > 0) {
                return;
            }
            int iMin = Math.min(1 - size2, size);
            for (int i = 0; i < iMin && this.f2365j.size() > 0; i++) {
                C1072e c1072eRemove = this.f2365j.remove(0);
                this.f2366k.put(c1072eRemove.f2458n, c1072eRemove);
                this.f2368m.put(c1072eRemove.f2458n, new AnonymousClass3());
                try {
                    ApkDownloadService.BinderC1084a binderC1084a = this.f2376u;
                    if (binderC1084a != null) {
                        binderC1084a.mo1562a(c1072eRemove.f2458n);
                    } else {
                        Intent intent = new Intent();
                        intent.setClass(this.f2364i, ApkDownloadService.class);
                        intent.putExtra(ApkDownloadService.f2503a, c1072eRemove.f2458n);
                        this.f2364i.bindService(intent, this.f2378w, 1);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: b */
    public final void mo1455b(C1072e c1072e) {
        Uri uriForFile;
        Intent intent = new Intent();
        intent.setAction(f2359d);
        intent.setPackage(this.f2364i.getPackageName());
        intent.putExtra(f2361f, c1072e.f2450f);
        intent.putExtra(f2362g, c1072e.f2457m);
        C1300k.m3741a(this.f2364i).m3746a(intent);
        if (this.f2370o == null) {
            this.f2370o = new ConcurrentHashMap<>();
        }
        if (TextUtils.isEmpty(c1072e.f2449e)) {
            String strM1441f = m1441f(c1072e);
            if (!TextUtils.isEmpty(strM1441f)) {
                c1072e.f2449e = C1080a.m1538a(this.f2364i, new File(strM1441f));
            }
        }
        this.f2370o.put(c1072e.f2449e, c1072e);
        try {
            if (this.f2375t == null) {
                this.f2375t = new C1075b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addDataScheme("package");
                this.f2364i.registerReceiver(this.f2375t, intentFilter);
            }
        } catch (Throwable unused) {
        }
        String strM1441f2 = m1441f(c1072e);
        if (TextUtils.isEmpty(strM1441f2)) {
            return;
        }
        new StringBuilder("install: ").append(c1072e.f2447c);
        File file = new File(strM1441f2);
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setFlags(268435456);
            if (Build.VERSION.SDK_INT >= 24) {
                intent2.addFlags(1);
                uriForFile = FileProvider.getUriForFile(this.f2364i, this.f2364i.getPackageName() + ".anythink.fileProvider", file);
            } else {
                uriForFile = Uri.parse("file://".concat(String.valueOf(strM1441f2)));
            }
            intent2.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            this.f2364i.startActivity(intent2);
            C1322e.m3914a(c1072e.f2445a, c1072e.f2450f, c1072e.f2446b, 4, (String) null, 0L, file.length());
        } catch (Throwable th) {
            th.printStackTrace();
            C1322e.m3914a(c1072e.f2445a, c1072e.f2450f, c1072e.f2446b, 10, th.getMessage(), 0L, file.length());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1456b(String str) {
        C1072e c1072e;
        try {
            if (this.f2370o.containsKey(str) && (c1072e = this.f2370o.get(str)) != null) {
                String strM1441f = m1441f(c1072e);
                if (!TextUtils.isEmpty(strM1441f)) {
                    new File(strM1441f).delete();
                }
                c1072e.m1517m();
                this.f2370o.remove(str);
                if (this.f2371p == null) {
                    this.f2371p = new ConcurrentHashMap<>();
                }
                this.f2371p.put(c1072e.f2458n, c1072e);
                ConcurrentHashMap<String, C1072e> concurrentHashMap = this.f2369n;
                if (concurrentHashMap != null) {
                    concurrentHashMap.remove(c1072e.f2458n);
                }
                C1076a.m1523a(this.f2364i).m1535c(c1072e);
                C1076a.m1523a(this.f2364i).mo1532a(c1072e, 0L, 100L, true);
                Intent intent = new Intent();
                intent.setAction(f2360e);
                intent.setPackage(this.f2364i.getPackageName());
                intent.putExtra(f2361f, c1072e.f2450f);
                intent.putExtra(f2362g, c1072e.f2457m);
                C1300k.m3741a(this.f2364i).m3746a(intent);
                C1322e.m3914a(c1072e.f2445a, c1072e.f2450f, c1072e.f2446b, 5, (String) null, 0L, 0L);
                if (this.f2370o.size() == 0) {
                    try {
                        BroadcastReceiver broadcastReceiver = this.f2375t;
                        if (broadcastReceiver != null) {
                            this.f2364i.unregisterReceiver(broadcastReceiver);
                            this.f2375t = null;
                        }
                    } catch (Throwable unused) {
                    }
                }
                m1432a(c1072e, false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1067a.a m1457c(String str) {
        return this.f2368m.get(str);
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: c */
    public final void mo1458c(C1072e c1072e) {
        Uri uriForFile;
        String strM1441f = m1441f(c1072e);
        if (TextUtils.isEmpty(strM1441f)) {
            return;
        }
        new StringBuilder("install: ").append(c1072e.f2447c);
        File file = new File(strM1441f);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            if (Build.VERSION.SDK_INT >= 24) {
                intent.addFlags(1);
                uriForFile = FileProvider.getUriForFile(this.f2364i, this.f2364i.getPackageName() + ".anythink.fileProvider", file);
            } else {
                uriForFile = Uri.parse("file://".concat(String.valueOf(strM1441f)));
            }
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            this.f2364i.startActivity(intent);
            C1322e.m3914a(c1072e.f2445a, c1072e.f2450f, c1072e.f2446b, 4, (String) null, 0L, file.length());
        } catch (Throwable th) {
            th.printStackTrace();
            C1322e.m3914a(c1072e.f2445a, c1072e.f2450f, c1072e.f2446b, 10, th.getMessage(), 0L, file.length());
        }
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: c */
    public final boolean mo1459c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f2364i.getPackageManager().canRequestPackageInstalls();
        }
        return true;
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    @TargetApi(26)
    /* JADX INFO: renamed from: d */
    public final void mo1460d() {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + this.f2364i.getPackageName()));
        intent.addFlags(268435456);
        this.f2364i.startActivity(intent);
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: d */
    public final void mo1461d(C1072e c1072e) {
        try {
            if (mo1452a(c1072e.f2458n)) {
                c1072e.m1516l();
                mo1455b(c1072e);
                return;
            }
            C1072e c1072e2 = this.f2367l.get(c1072e.f2458n);
            if (c1072e2 != null) {
                this.f2367l.remove(c1072e.f2458n);
                c1072e2.m1509e();
                mo1448a(c1072e2);
            } else {
                mo1448a(c1072e);
            }
            mo1454b();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.china.common.p033a.InterfaceC1074g
    /* JADX INFO: renamed from: e */
    public final void mo1462e() {
        try {
            String strM1543a = C1081b.m1543a();
            if (TextUtils.isEmpty(strM1543a)) {
                return;
            }
            File[] fileArrListFiles = new File(strM1543a).listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length != 0) {
                ArrayList arrayList = new ArrayList();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.f2374s;
                for (File file : fileArrListFiles) {
                    if ((file.getName().endsWith(AbstractC1067a.f2406g) && C1080a.m1542b(this.f2364i, file)) || file.lastModified() + j < jCurrentTimeMillis) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Log.i(f2356a, "clean expired file -> " + ((File) arrayList.get(i)).getName());
                    ((File) arrayList.get(i)).delete();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, C1072e> m1463f() {
        return this.f2366k;
    }
}
