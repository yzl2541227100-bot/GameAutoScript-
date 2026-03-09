package com.iflytek.voiceads.download;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.anythink.expressad.exoplayer.C1531d;
import com.iflytek.voiceads.download.p211a.InterfaceC2925b;
import com.iflytek.voiceads.download.p216d.C2938a;
import com.iflytek.voiceads.listener.DialogListener;
import com.iflytek.voiceads.utils.C2984b;
import com.iflytek.voiceads.utils.C2986d;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2992j;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.d */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2937d {

    /* JADX INFO: renamed from: j */
    private static C2937d f16279j;

    /* JADX INFO: renamed from: a */
    private Context f16280a;

    /* JADX INFO: renamed from: b */
    private Handler f16281b;

    /* JADX INFO: renamed from: e */
    private HandlerThread f16284e;

    /* JADX INFO: renamed from: f */
    private DialogListener f16285f;

    /* JADX INFO: renamed from: g */
    private boolean f16286g;

    /* JADX INFO: renamed from: k */
    private InterfaceC2925b f16289k;

    /* JADX INFO: renamed from: l */
    private NotificationManager f16290l;

    /* JADX INFO: renamed from: h */
    private final int f16287h = 0;

    /* JADX INFO: renamed from: i */
    private final int f16288i = C1531d.f7901b;

    /* JADX INFO: renamed from: n */
    private final String f16292n = AbstractC1067a.f2406g;

    /* JADX INFO: renamed from: o */
    private final BroadcastReceiver f16293o = new C2951o(this);

    /* JADX INFO: renamed from: p */
    private final int f16294p = 24;

    /* JADX INFO: renamed from: q */
    private final int f16295q = 26;

    /* JADX INFO: renamed from: m */
    private HashMap<Integer, Object> f16291m = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private HashMap<String, b> f16282c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private HashMap<String, b> f16283d = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.iflytek.voiceads.download.d$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo13369a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.iflytek.voiceads.download.d$b */
    class b {

        /* JADX INFO: renamed from: a */
        public String f16296a;

        /* JADX INFO: renamed from: b */
        public String f16297b;

        /* JADX INFO: renamed from: c */
        public String f16298c;

        /* JADX INFO: renamed from: d */
        public JSONArray f16299d;

        /* JADX INFO: renamed from: e */
        public JSONArray f16300e;

        /* JADX INFO: renamed from: f */
        public JSONArray f16301f;

        /* JADX INFO: renamed from: g */
        public JSONArray f16302g;

        /* JADX INFO: renamed from: h */
        public int f16303h;

        private b() {
        }

        /* synthetic */ b(C2937d c2937d, HandlerC2940e handlerC2940e) {
            this();
        }
    }

    private C2937d(Context context) {
        this.f16280a = context;
        this.f16290l = (NotificationManager) context.getSystemService("notification");
        m13335a();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C2937d m13333a(Context context) {
        if (f16279j == null) {
            f16279j = new C2937d(context);
        }
        return f16279j;
    }

    /* JADX INFO: renamed from: a */
    private void m13335a() {
        this.f16284e = new HandlerThread(C3902g6.OoooOO0);
        this.f16284e.start();
        this.f16281b = new HandlerC2940e(this, this.f16284e.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m13336a(int i) {
        try {
            if (!this.f16291m.containsKey(Integer.valueOf(i))) {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = this.f16280a.getApplicationInfo().targetSdkVersion;
                if (i2 < 26 || i3 < 26) {
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(this.f16280a);
                    builder.setContentTitle("准备下载").setWhen(System.currentTimeMillis()).setProgress(100, 0, false).setSmallIcon(R.drawable.stat_sys_download).setDefaults(16);
                    this.f16290l.notify(i, builder.build());
                    this.f16291m.put(Integer.valueOf(i), builder);
                } else {
                    Notification.Builder builder2 = new Notification.Builder(this.f16280a);
                    this.f16290l.createNotificationChannel(new NotificationChannel("iflyad", "iflyad", 2));
                    builder2.setContentTitle("准备下载").setChannelId("iflyad").setWhen(System.currentTimeMillis()).setProgress(100, 0, false).setSmallIcon(R.drawable.stat_sys_download).setDefaults(16);
                    this.f16290l.notify(i, builder2.build());
                    this.f16291m.put(Integer.valueOf(i), builder2);
                }
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "showNotification error " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m13337a(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        int i4 = this.f16280a.getApplicationInfo().targetSdkVersion;
        if (i3 < 26 || i4 < 26) {
            NotificationCompat.Builder builder = (NotificationCompat.Builder) this.f16291m.get(Integer.valueOf(i));
            if (builder != null) {
                builder.setContentTitle("正在下载").setContentText(i2 + "%").setProgress(100, i2, false);
                this.f16290l.notify(i, builder.build());
                return;
            }
            return;
        }
        Notification.Builder builder2 = (Notification.Builder) this.f16291m.get(Integer.valueOf(i));
        if (builder2 != null) {
            builder2.setContentTitle("正在下载").setContentText(i2 + "%").setProgress(100, i2, false);
            this.f16290l.notify(i, builder2.build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m13338a(Activity activity, a aVar) {
        if (activity == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage("确认下载？");
        builder.setPositiveButton("下载", new DialogInterfaceOnClickListenerC2946j(this, aVar));
        builder.setNegativeButton("取消", new DialogInterfaceOnClickListenerC2947k(this));
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC2948l(this));
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m13339a(Context context, File file) {
        if (context == null || file == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            int i = Build.VERSION.SDK_INT;
            int i2 = context.getApplicationInfo().targetSdkVersion;
            if (i < 24 || i2 < 24) {
                intent.setFlags(268435456);
                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            } else {
                if (i >= 26 && i2 >= 26 && !m13357b(context)) {
                    Intent intent2 = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                    if (context instanceof Activity) {
                        ((Activity) context).startActivityForResult(intent2, 0);
                    }
                }
                intent.addFlags(1);
                intent.setDataAndType(FileProvider.getUriForFile(context, this.f16280a.getPackageName() + ".fileprovider", file), "application/vnd.android.package-archive");
            }
            context.startActivity(intent);
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "installApp error " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m13340a(b bVar) {
        C2989g.m13555a("IFLY_AD_SDK", "start download ad");
        try {
            String str = C2933c.m13327a(this.f16280a) + File.separator + bVar.f16297b + AbstractC1067a.f2406g;
            File file = new File(str);
            if (file.exists() && C2984b.m13535a(this.f16280a, str)) {
                m13350a(bVar.f16299d);
                m13350a(bVar.f16300e);
                this.f16283d.put(bVar.f16297b, bVar);
                m13352b();
                m13361c(bVar.f16297b);
                m13339a(this.f16280a, file);
            } else {
                C2938a c2938aM13392a = new C2938a.a().m13391a(bVar.f16296a).m13393b(str).m13392a();
                this.f16289k = C2923a.m13299a(this.f16280a);
                c2938aM13392a.m13373a(new C2949m(this, bVar, str));
                this.f16282c.put(bVar.f16297b, bVar);
                this.f16289k.mo13306a(c2938aM13392a);
                m13350a(bVar.f16299d);
                C2989g.m13555a("IFLY_AD_SDK", "开始下载监控 下载地址：" + bVar.f16296a);
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "startDownloadAd error " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m13349a(String str) {
        C2989g.m13555a("IFLY_AD_SDK", "start download ad no trace");
        if (!TextUtils.isEmpty(str)) {
            try {
                String str2 = C2933c.m13327a(this.f16280a) + File.separator + C2986d.m13546a(str) + AbstractC1067a.f2406g;
                File file = new File(str2);
                if (file.exists() && C2984b.m13535a(this.f16280a, str2)) {
                    m13339a(this.f16280a, file);
                } else {
                    this.f16289k = C2923a.m13299a(this.f16280a);
                    C2938a c2938aM13392a = new C2938a.a().m13391a(str).m13393b(str2).m13392a();
                    c2938aM13392a.m13373a(new C2950n(this, str2));
                    this.f16289k.mo13306a(c2938aM13392a);
                    C2989g.m13555a("IFLY_AD_SDK", "下载地址：" + str);
                }
            } catch (Exception e) {
                C2989g.m13557b("IFLY_AD_SDK", "startDownloadAdNoTrace error " + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m13350a(JSONArray jSONArray) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    C2992j.m13571b(string);
                    C2989g.m13555a("IFLY_AD_SDK", "report url: " + string);
                } catch (JSONException e) {
                    C2989g.m13557b("IFLY_AD_SDK", "report url: " + e.getMessage());
                }
            }
        } else {
            C2989g.m13555a("IFLY_AD_SDK", "monitor: no valid url");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m13352b() {
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            this.f16280a.registerReceiver(this.f16293o, intentFilter);
            C2989g.m13555a("IFLY_AD_SDK", "注册广播");
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "注册广播");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m13353b(int i) {
        if (this.f16291m.containsKey(Integer.valueOf(i))) {
            this.f16290l.cancel(i);
            this.f16291m.remove(Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m13356b(String str) {
        C2989g.m13555a("IFLY_AD_SDK", "download finished");
        for (Map.Entry<String, b> entry : this.f16283d.entrySet()) {
            if (str.equals(entry.getValue().f16297b)) {
                entry.getValue().f16303h = 1;
                m13350a(entry.getValue().f16300e);
                C2989g.m13555a("IFLY_AD_SDK", "下载完成监控");
            }
        }
        C2989g.m13555a("IFLY_AD_SDK", "移除广播 start");
        this.f16281b.removeMessages(0);
        this.f16281b.sendEmptyMessageDelayed(0, 50000L);
    }

    /* JADX INFO: renamed from: b */
    private boolean m13357b(Context context) {
        if (context == null) {
            return false;
        }
        return context.getPackageManager().canRequestPackageInstalls();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m13358c() {
        try {
            this.f16280a.unregisterReceiver(this.f16293o);
            if (this.f16283d != null) {
                this.f16283d.clear();
            }
            C2989g.m13555a("IFLY_AD_SDK", "注销安装广播");
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "注销安装广播 error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m13361c(String str) {
        C2989g.m13555a("IFLY_AD_SDK", "start installation");
        for (Map.Entry<String, b> entry : this.f16283d.entrySet()) {
            if (str.equals(entry.getValue().f16297b)) {
                entry.getValue().f16303h = 1;
                m13350a(entry.getValue().f16301f);
                C2989g.m13555a("IFLY_AD_SDK", "开始安装监控");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[Catch: all -> 0x0072, TryCatch #0 {, blocks: (B:7:0x0007, B:8:0x000c, B:10:0x0014, B:12:0x0017, B:13:0x001e, B:14:0x0055, B:16:0x005f, B:18:0x0063, B:20:0x0067, B:32:0x00a2, B:34:0x00a9, B:28:0x007e, B:31:0x0084, B:26:0x0076), top: B:36:0x0003, inners: #1, #2 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m13365a(android.content.Context r5, com.iflytek.voiceads.p210d.C2920a r6, java.lang.Object... r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 == 0) goto L5
            if (r5 != 0) goto L7
        L5:
            monitor-exit(r4)
            return
        L7:
            java.lang.String r0 = "com.iflytek.voiceads.download.DownloadService"
            java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L72 java.lang.ClassNotFoundException -> L75
            com.iflytek.voiceads.download.d$b r1 = new com.iflytek.voiceads.download.d$b     // Catch: java.lang.Throwable -> L72
            r0 = 0
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L7e
            int r0 = r7.length     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            if (r0 <= 0) goto L7e
            r0 = 0
            r0 = r7[r0]     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            r1.f16296a = r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
        L1e:
            java.lang.String r0 = r1.f16296a     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            java.lang.String r0 = com.iflytek.voiceads.utils.C2986d.m13546a(r0)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            r1.f16297b = r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            java.lang.String r0 = r6.f16192E     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            r1.f16298c = r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            org.json.JSONObject r0 = r6.f16197J     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            java.lang.String r2 = "download_start_urls"
            org.json.JSONArray r0 = r0.optJSONArray(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            r1.f16299d = r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            org.json.JSONObject r0 = r6.f16197J     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            java.lang.String r2 = "download_complete_urls"
            org.json.JSONArray r0 = r0.optJSONArray(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            r1.f16300e = r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            org.json.JSONObject r0 = r6.f16197J     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            java.lang.String r2 = "install_start_urls"
            org.json.JSONArray r0 = r0.optJSONArray(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            r1.f16301f = r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            org.json.JSONObject r0 = r6.f16197J     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            java.lang.String r2 = "install_complete_urls"
            org.json.JSONArray r0 = r0.optJSONArray(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            r1.f16302g = r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            r0 = 0
            r1.f16303h = r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            java.util.HashMap<java.lang.String, com.iflytek.voiceads.download.d$b> r0 = r4.f16282c     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = r1.f16297b     // Catch: java.lang.Throwable -> L72
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L5
            boolean r0 = r4.f16286g     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto La2
            boolean r0 = r5 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto La2
            android.app.Activity r5 = (android.app.Activity) r5     // Catch: java.lang.Throwable -> L72
            com.iflytek.voiceads.download.f r0 = new com.iflytek.voiceads.download.f     // Catch: java.lang.Throwable -> L72
            r0.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> L72
            r5.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L72
            goto L5
        L72:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L75:
            r0 = move-exception
            java.lang.String r0 = "IFLY_AD_SDK"
            java.lang.String r1 = "service not found"
            com.iflytek.voiceads.utils.C2989g.m13557b(r0, r1)     // Catch: java.lang.Throwable -> L72
            goto L5
        L7e:
            java.lang.String r0 = r6.f16199L     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            r1.f16296a = r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L83
            goto L1e
        L83:
            r0 = move-exception
            java.lang.String r1 = "IFLY_AD_SDK"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r2.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = "parse downExpInfo"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L72
            com.iflytek.voiceads.utils.C2989g.m13557b(r1, r0)     // Catch: java.lang.Throwable -> L72
            goto L5
        La2:
            r4.m13340a(r1)     // Catch: java.lang.Throwable -> L72
            com.iflytek.voiceads.listener.DialogListener r0 = r4.f16285f     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L5
            com.iflytek.voiceads.listener.DialogListener r0 = r4.f16285f     // Catch: java.lang.Throwable -> L72
            r0.onConfirm()     // Catch: java.lang.Throwable -> L72
            r0 = 0
            r4.f16285f = r0     // Catch: java.lang.Throwable -> L72
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.voiceads.download.C2937d.m13365a(android.content.Context, com.iflytek.voiceads.d.a, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m13366a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                Class.forName("com.iflytek.voiceads.download.DownloadService");
                if (this.f16286g && (context instanceof Activity)) {
                    Activity activity = (Activity) context;
                    activity.runOnUiThread(new RunnableC2944h(this, activity, str));
                } else {
                    m13349a(str);
                    if (this.f16285f != null) {
                        this.f16285f.onConfirm();
                        this.f16285f = null;
                    }
                }
            } catch (ClassNotFoundException e) {
                C2989g.m13557b("IFLY_AD_SDK", "service not found");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13367a(DialogListener dialogListener) {
        this.f16285f = dialogListener;
    }

    /* JADX INFO: renamed from: a */
    public void m13368a(boolean z) {
        this.f16286g = z;
    }
}
