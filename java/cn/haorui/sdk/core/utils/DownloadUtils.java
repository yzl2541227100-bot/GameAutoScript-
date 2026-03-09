package cn.haorui.sdk.core.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import cn.haorui.sdk.C0384R;
import cn.haorui.sdk.core.download.C0484a;
import cn.haorui.sdk.core.download.C0485b;
import cn.haorui.sdk.core.download.InterfaceC0491h;
import cn.haorui.sdk.core.download.RunnableC0487d;
import cn.haorui.sdk.core.utils.DownloadWorker;
import com.anythink.china.common.p033a.AbstractC1067a;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DownloadUtils {
    private static final String ACTION_RECEIVER_INSTALL = "com.hr.sdk.INSTALL_APK_START1";
    private static final String MESSAGES_CHANNEL = "ms_download";
    private static final String TAG = "DownloadUtils";
    private static Map<Integer, NotificationBean> notificationMap = new HashMap();
    private static int requestCode = 0;
    private RemoteViews contentView;
    private long currentTime;
    private Notification notification;
    private NotificationManager notificationManager;
    private long pastTime;
    private final String ACTION_DOWNLOAD_PAUSE = "ACTION_DOWNLOAD_PAUSE";
    private final String ACTION_DOWNLOAD_CACEL = "ACTION_DOWNLOAD_CACEL";
    private final String ACTION_DOWNLOAD_INSTALL = "ACTION_DOWNLOAD_INSTALL";
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public static class InstallSuccessReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    String action = intent.getAction();
                    LogUtil.m89i(DownloadUtils.TAG, "InstallSuccessReceiver." + action);
                    if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                        String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                        Iterator it = DownloadUtils.notificationMap.values().iterator();
                        while (it.hasNext()) {
                            NotificationBean notificationBean = (NotificationBean) it.next();
                            if (notificationBean != null) {
                                String packageName = notificationBean.getPackageName();
                                if (schemeSpecificPart != null && schemeSpecificPart.equals(packageName)) {
                                    String[] reportInstallSucc = notificationBean.getReportInstallSucc();
                                    if (reportInstallSucc != null) {
                                        LogUtil.m86d(DownloadUtils.TAG, "Report send dn_inst_succ");
                                        for (String str : reportInstallSucc) {
                                            if (!TextUtils.isEmpty(str)) {
                                                HttpUtil.asyncGetWithWebViewUA(context, str, new DefaultHttpGetWithNoHandlerCallback());
                                            }
                                        }
                                    }
                                    it.remove();
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class NotificationClickReceiver extends BroadcastReceiver {
        public NotificationClickReceiver() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0063  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r7, android.content.Intent r8) {
            /*
                Method dump skipped, instruction units count: 386
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.utils.DownloadUtils.NotificationClickReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.DownloadUtils$a */
    public class C0558a implements InterfaceC0491h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f234a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String[] f235b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f236c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f237d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f238e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String[] f239f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String[] f240g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String[] f241h;

        public C0558a(String str, String[] strArr, Context context, String str2, String str3, String[] strArr2, String[] strArr3, String[] strArr4) {
            this.f234a = str;
            this.f235b = strArr;
            this.f236c = context;
            this.f237d = str2;
            this.f238e = str3;
            this.f239f = strArr2;
            this.f240g = strArr3;
            this.f241h = strArr4;
        }

        @Override // cn.haorui.sdk.core.download.InterfaceC0491h
        /* JADX INFO: renamed from: a */
        public void mo30a(C0485b c0485b) {
            if (DownloadUtils.notificationMap == null) {
                Map unused = DownloadUtils.notificationMap = new HashMap();
            }
            if (DownloadUtils.notificationMap.containsKey(Integer.valueOf(DownloadUtils.this.getNotifyId(this.f234a)))) {
                return;
            }
            try {
                if (this.f235b != null) {
                    LogUtil.m86d(DownloadUtils.TAG, "Report send dn_start");
                    for (String str : this.f235b) {
                        if (!TextUtils.isEmpty(str)) {
                            HttpUtil.asyncGetWithWebViewUA(this.f236c, str, new DefaultHttpGetWithNoHandlerCallback());
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            NotificationBean notificationBean = new NotificationBean();
            notificationBean.setAppName(this.f237d);
            notificationBean.setPackageName(this.f238e);
            notificationBean.setReportDownloadStart(this.f235b);
            notificationBean.setReportDownloadSuccess(this.f239f);
            notificationBean.setReportInstallStart(this.f240g);
            notificationBean.setReportInstallSucc(this.f241h);
            DownloadUtils.notificationMap.put(Integer.valueOf(DownloadUtils.this.getNotifyId(this.f234a)), notificationBean);
            DownloadUtils.this.createNotification(this.f234a, this.f236c, this.f237d, this.f238e);
        }

        @Override // cn.haorui.sdk.core.download.InterfaceC0491h
        /* JADX INFO: renamed from: a */
        public void mo31a(C0485b c0485b, String str) {
            C0484a.a.f52a.m21a(this.f234a);
            if (DownloadUtils.this.notificationManager != null) {
                DownloadUtils.this.notificationManager.cancel(DownloadUtils.this.getNotifyId(this.f234a));
            }
            DownloadUtils.notificationMap.remove(Integer.valueOf(DownloadUtils.this.getNotifyId(this.f234a)));
        }

        @Override // cn.haorui.sdk.core.download.InterfaceC0491h
        /* JADX INFO: renamed from: a */
        public void mo32a(File file, C0485b c0485b) {
            DownloadUtils.this.onTaskSuccess(this.f236c, file, c0485b.f54b);
        }

        @Override // cn.haorui.sdk.core.download.InterfaceC0491h
        /* JADX INFO: renamed from: b */
        public void mo33b(C0485b c0485b) {
            int i = (int) (((c0485b.f61i * 1.0f) / c0485b.f60h) * 100.0f);
            if (i > 100) {
                i = 100;
            }
            int notifyId = DownloadUtils.this.getNotifyId(c0485b.f54b);
            if (DownloadUtils.notificationMap == null || !DownloadUtils.notificationMap.containsKey(Integer.valueOf(notifyId))) {
                C0484a.a.f52a.m21a(c0485b.f54b);
                if (DownloadUtils.this.notificationManager != null) {
                    DownloadUtils.this.notificationManager.cancel(notifyId);
                    return;
                }
                return;
            }
            if (DownloadUtils.this.notificationManager == null || DownloadUtils.this.contentView == null) {
                return;
            }
            DownloadUtils.this.contentView.setTextViewText(C0384R.id.notification_progressText, i + "%");
            DownloadUtils.this.contentView.setProgressBar(C0384R.id.notification_pregressBar, 100, i, false);
            DownloadUtils.this.notificationManager.notify(notifyId, ((NotificationBean) DownloadUtils.notificationMap.get(Integer.valueOf(notifyId))).getNotification());
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.DownloadUtils$b */
    public class RunnableC0559b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f243a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f244b;

        public RunnableC0559b(String str, Context context) {
            this.f243a = str;
            this.f244b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            int i;
            String[] reportDownloadSuccess;
            try {
                NotificationBean notificationBean = (NotificationBean) DownloadUtils.notificationMap.get(Integer.valueOf(DownloadUtils.this.getNotifyId(this.f243a)));
                if (notificationBean != null && (reportDownloadSuccess = notificationBean.getReportDownloadSuccess()) != null) {
                    LogUtil.m86d(DownloadUtils.TAG, "Report send dn_succ");
                    for (String str : reportDownloadSuccess) {
                        if (!TextUtils.isEmpty(str)) {
                            HttpUtil.asyncGetWithWebViewUA(this.f244b, str, new DefaultHttpGetWithNoHandlerCallback());
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(this.f244b, (Class<?>) DownloadWorker.InstallReceiver.class);
            intent.setAction(DownloadUtils.ACTION_RECEIVER_INSTALL);
            intent.setPackage(this.f244b.getPackageName());
            int notifyId = DownloadUtils.this.getNotifyId(this.f243a);
            if (Build.VERSION.SDK_INT >= 31) {
                context = this.f244b;
                i = 67108864;
            } else {
                context = this.f244b;
                i = 268435456;
            }
            PendingIntent.getBroadcast(context, notifyId, intent, i);
            DownloadUtils.this.contentView.setViewVisibility(C0384R.id.notification_cancel, 8);
            DownloadUtils.this.contentView.setViewVisibility(C0384R.id.notification_pause, 8);
            DownloadUtils.this.contentView.setTextViewText(C0384R.id.notification_progressText, "下载已完成，点击安装");
            if (DownloadUtils.notificationMap.containsKey(Integer.valueOf(notifyId))) {
                DownloadUtils.this.notificationManager.notify(notifyId, ((NotificationBean) DownloadUtils.notificationMap.get(Integer.valueOf(notifyId))).getNotification());
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.DownloadUtils$c */
    public static class C0560c {

        /* JADX INFO: renamed from: a */
        public static final DownloadUtils f246a = new DownloadUtils();
    }

    private void createMessageNotificationChannel(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.notificationManager.createNotificationChannel(new NotificationChannel(MESSAGES_CHANNEL, "正在下载应用" + str + "...", 4));
        }
    }

    public void createNotification(String str, Context context, String str2, String str3) {
        NotificationBean notificationBean;
        registerBroadcast(context, str3);
        this.notificationManager = (NotificationManager) context.getSystemService("notification");
        createMessageNotificationChannel(context, str2);
        NotificationCompat.Builder notificationBuilderByChannel = getNotificationBuilderByChannel(context);
        notificationBuilderByChannel.setContentTitle("正在下载应用" + str2 + "...");
        notificationBuilderByChannel.setSmallIcon(C0384R.mipmap.adsail_ic_launcher);
        notificationBuilderByChannel.setAutoCancel(true);
        this.notification = notificationBuilderByChannel.build();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C0384R.layout.adsail_notification_item);
        this.contentView = remoteViews;
        if (str2 == null) {
            str2 = "";
        }
        remoteViews.setTextViewText(C0384R.id.notification_title, "正在下载:" + str2 + "...");
        RemoteViews remoteViews2 = this.contentView;
        int i = C0384R.id.notification_cancel;
        remoteViews2.setViewVisibility(i, 0);
        RemoteViews remoteViews3 = this.contentView;
        int i2 = C0384R.id.notification_pause;
        remoteViews3.setViewVisibility(i2, 0);
        this.contentView.setTextViewText(C0384R.id.notification_progressText, "0%");
        this.contentView.setProgressBar(C0384R.id.notification_pregressBar, 100, 0, false);
        int notifyId = getNotifyId(str);
        requestCode = notifyId;
        Intent intent = new Intent();
        intent.setAction("ACTION_DOWNLOAD_PAUSE");
        intent.putExtra("notify_id", notifyId);
        intent.putExtra("notify_url", str);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = requestCode;
        this.contentView.setOnClickPendingIntent(i2, i3 >= 31 ? PendingIntent.getBroadcast(context, i4, intent, 201326592) : PendingIntent.getBroadcast(context, i4, intent, 134217728));
        Intent intent2 = new Intent();
        intent2.setAction("ACTION_DOWNLOAD_CACEL");
        intent2.putExtra("notify_id", notifyId);
        intent2.putExtra("notify_url", str);
        this.contentView.setOnClickPendingIntent(i, PendingIntent.getBroadcast(context, requestCode, intent2, i3 >= 31 ? 335544320 : 268435456));
        Intent intent3 = new Intent();
        intent3.setAction("ACTION_DOWNLOAD_INSTALL");
        intent3.putExtra("notify_id", notifyId);
        intent3.putExtra("notify_url", str);
        int i5 = requestCode;
        this.contentView.setOnClickPendingIntent(C0384R.id.notification_rootView, i3 >= 31 ? PendingIntent.getBroadcast(context, i5, intent3, 201326592) : PendingIntent.getBroadcast(context, i5, intent3, 134217728));
        if (notificationMap.containsKey(Integer.valueOf(notifyId)) && (notificationBean = notificationMap.get(Integer.valueOf(notifyId))) != null) {
            notificationBean.setNotification(this.notification);
            notificationMap.put(Integer.valueOf(notifyId), notificationBean);
        }
        Notification notification = this.notification;
        RemoteViews remoteViews4 = this.contentView;
        notification.contentView = remoteViews4;
        if (i3 >= 31) {
            notification.bigContentView = remoteViews4;
        }
        this.notificationManager.notify(notifyId, notification);
    }

    public static DownloadUtils getInstance() {
        return C0560c.f246a;
    }

    private NotificationCompat.Builder getNotificationBuilderByChannel(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return new NotificationCompat.Builder(context.getApplicationContext(), MESSAGES_CHANNEL);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setPriority(i >= 24 ? 4 : 1);
        return builder;
    }

    public int getNotifyId(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return Math.abs(str.hashCode() + 199);
    }

    public void install(Context context, String str) {
        Uri uriFromFile;
        String[] reportInstallStart;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.substring(str.lastIndexOf("/")).replace("/", "");
        String str2 = C0484a.a.f52a.f51c;
        try {
            strReplace = StringUtils.byte2hex(MessageDigest.getInstance("MD5").digest(str.getBytes())).toLowerCase() + AbstractC1067a.f2406g;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        File file = new File(str2, strReplace);
        if (!file.exists()) {
            LogUtil.m87e(TAG, "file not exists");
            return;
        }
        try {
            NotificationBean notificationBean = notificationMap.get(Integer.valueOf(getNotifyId(str)));
            if (notificationBean != null && (reportInstallStart = notificationBean.getReportInstallStart()) != null) {
                LogUtil.m86d(TAG, "Report send dn_inst_start");
                for (String str3 : reportInstallStart) {
                    if (!TextUtils.isEmpty(str3)) {
                        HttpUtil.asyncGetWithWebViewUA(context, str3, new DefaultHttpGetWithNoHandlerCallback());
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
        intent.addFlags(268435456);
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            uriFromFile = FileProvider.getUriForFile(context, context.getPackageName() + ".HRFileProvider", file);
        } else {
            uriFromFile = Uri.fromFile(file);
        }
        intent.setDataAndType(uriFromFile, "application/vnd.android.package-archive");
        context.startActivity(intent);
    }

    public void onTaskSuccess(Context context, File file, String str) {
        this.mHandler.post(new RunnableC0559b(str, context));
    }

    private void registerBroadcast(Context context, String str) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ACTION_DOWNLOAD_PAUSE");
        intentFilter.addAction("ACTION_DOWNLOAD_CACEL");
        intentFilter.addAction("ACTION_DOWNLOAD_INSTALL");
        context.registerReceiver(new NotificationClickReceiver(), intentFilter);
        try {
            IntentFilter intentFilter2 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addDataScheme("package");
            context.registerReceiver(new InstallSuccessReceiver(), intentFilter2);
        } catch (Exception e) {
            LogUtil.m91w(TAG, "Failed registerReceiver InstallSuccessReceiver");
            e.printStackTrace();
        }
    }

    public void startDownload(Context context, String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0484a c0484a = C0484a.a.f52a;
        RunnableC0487d runnableC0487d = c0484a.f49a.get(str);
        if (runnableC0487d == null) {
            runnableC0487d = new RunnableC0487d(str, str2, "", str);
            c0484a.f49a.put(str, runnableC0487d);
        }
        RunnableC0487d runnableC0487d2 = runnableC0487d;
        runnableC0487d2.f71e.put(runnableC0487d2.f68b, new C0558a(str, strArr, context, str2, str3, strArr2, strArr3, strArr4));
        runnableC0487d2.m28b();
    }
}
