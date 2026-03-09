package cn.haorui.sdk.core.utils;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.content.FileProvider;
import cn.haorui.sdk.C0384R;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.platform.p003hr.IAdSailAd;
import com.anythink.china.common.p033a.AbstractC1067a;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.p284io.IOUtils;
import p285z2.C4151mx;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes.dex */
public class DownloadWorker {
    private static final String ACTION_RECEIVER_INSTALL = "cn.adsail.sdk.INSTALL_APK_START";
    private static final int BUFFER_SIZE = 16384;
    private static final int MAX_RETRY_TIME = 10;
    private static final int MESSAGE_DOWNLOAD_URL = 101;
    private static final int MESSAGE_INIT = 100;
    private static final int NOTIFICATION_ID = 1;
    private static final String TAG = "Download.DownloadWorker";
    private static final long WEEK_TIME = 259200000;
    private Context context;
    private DownloadInfo currentDownloadInfo;
    private C4151mx defaultOkHttpClient;
    private Handler handler;
    private HandlerThread handlerThread;
    private NotificationManager manager;
    private static final DownloadWorker instance = new DownloadWorker();
    private static final AtomicInteger BASE_INCREASED_NOTIFICATION_ID = new AtomicInteger(10);
    private final Queue<DownloadInfo> taskList = new LinkedBlockingQueue();
    private final Map<String, DownloadInfo> taskCache = new ConcurrentHashMap();
    private String notificationTitle = null;

    public static class InstallReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !DownloadWorker.ACTION_RECEIVER_INSTALL.equals(intent.getAction())) {
                return;
            }
            DownloadInfo downloadInfoFindDownloadInfo = DownloadWorker.getInstance().findDownloadInfo(intent.getStringExtra("key"));
            if (downloadInfoFindDownloadInfo != null) {
                downloadInfoFindDownloadInfo.onInstallStart();
                context.startActivity(DownloadWorker.buildInstallApkIntent(context, new File(downloadInfoFindDownloadInfo.downloadFile)));
            }
        }
    }

    public static class InstallSuccessReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                LogUtil.m89i(DownloadWorker.TAG, "InstallSuccessReceiver." + action);
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    DownloadWorker.getInstance().reportInstallSuccess(intent.getData().getSchemeSpecificPart());
                }
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.DownloadWorker$a */
    public class HandlerC0561a extends Handler {
        public HandlerC0561a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            int i = message.what;
            if (i == 100) {
                LogUtil.m89i(DownloadWorker.TAG, "Init start.");
                synchronized (DownloadWorker.this.taskList) {
                    DownloadWorker.prepareSdkDownloadDirectory();
                    try {
                        IntentFilter intentFilter = new IntentFilter(DownloadWorker.ACTION_RECEIVER_INSTALL);
                        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                        DownloadWorker.this.context.registerReceiver(new InstallReceiver(), intentFilter);
                    } catch (Exception e) {
                        LogUtil.m91w(DownloadWorker.TAG, "Failed registerReceiver InstallReceiver");
                        e.printStackTrace();
                    }
                    try {
                        IntentFilter intentFilter2 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter2.addDataScheme("package");
                        DownloadWorker.this.context.registerReceiver(new InstallSuccessReceiver(), intentFilter2);
                    } catch (Exception e2) {
                        LogUtil.m91w(DownloadWorker.TAG, "Failed registerReceiver InstallSuccessReceiver");
                        e2.printStackTrace();
                    }
                    DownloadWorker.this.taskList.clear();
                    DownloadWorker.this.taskCache.clear();
                    DownloadWorker.this.currentDownloadInfo = null;
                }
                LogUtil.m89i(DownloadWorker.TAG, "Init ok. " + DownloadWorker.this.taskList.size());
            } else if (i == 101) {
                LogUtil.m89i(DownloadWorker.TAG, "Start work.");
                DownloadWorker.this.handleMessageDownload();
                LogUtil.m89i(DownloadWorker.TAG, "Queue clear.");
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.DownloadWorker$b */
    public static class C0562b implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(AbstractC1067a.f2406g);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.DownloadWorker$c */
    public static class C0563c implements FileFilter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f248a;

        public C0563c(long j) {
            this.f248a = j;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.lastModified() + DownloadWorker.WEEK_TIME < this.f248a;
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.DownloadWorker$d */
    public class C0564d extends Thread {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0564d(String str, String str2) {
            super(str);
            this.f249a = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r9 = this;
                cn.haorui.sdk.core.utils.DownloadWorker r0 = cn.haorui.sdk.core.utils.DownloadWorker.getInstance()
                java.lang.String r1 = r9.f249a
                java.util.List r0 = r0.findDownloadInfoByPackageName(r1)
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto La3
                java.lang.Object r1 = r0.next()
                cn.haorui.sdk.core.utils.DownloadInfo r1 = (cn.haorui.sdk.core.utils.DownloadInfo) r1
                boolean r2 = r1.installStartReported
                if (r2 == 0) goto Le
                r1.onInstallSucc()
                boolean r2 = r1.hasNotifiedOpen
                if (r2 != 0) goto L9a
                r2 = 1
                r1.hasNotifiedOpen = r2
                java.lang.String r2 = r1.deeplinkUrl
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                r3 = 268435456(0x10000000, float:2.524355E-29)
                if (r2 != 0) goto L4f
                java.lang.String r2 = r1.deeplinkUrl     // Catch: java.lang.Throwable -> L4b
                r4 = 0
                android.content.Intent r2 = android.content.Intent.parseUri(r2, r4)     // Catch: java.lang.Throwable -> L4b
                android.content.Context r4 = cn.haorui.sdk.core.AdSdk.getContext()     // Catch: java.lang.Throwable -> L4b
                android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L4b
                android.content.ComponentName r4 = r2.resolveActivity(r4)     // Catch: java.lang.Throwable -> L4b
                if (r4 == 0) goto L4f
                r2.setFlags(r3)     // Catch: java.lang.Throwable -> L4b
                goto L63
            L4b:
                r2 = move-exception
                r2.printStackTrace()
            L4f:
                android.content.Context r2 = cn.haorui.sdk.core.AdSdk.getContext()     // Catch: java.lang.Throwable -> L5e
                android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L5e
                java.lang.String r4 = r9.f249a     // Catch: java.lang.Throwable -> L5e
                android.content.Intent r2 = r2.getLaunchIntentForPackage(r4)     // Catch: java.lang.Throwable -> L5e
                goto L63
            L5e:
                r2 = move-exception
                r2.printStackTrace()
                r2 = 0
            L63:
                if (r2 == 0) goto L9a
                int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L96
                r5 = 31
                if (r4 < r5) goto L7b
                cn.haorui.sdk.core.utils.DownloadWorker r3 = cn.haorui.sdk.core.utils.DownloadWorker.this     // Catch: java.lang.Throwable -> L96
                android.content.Context r3 = cn.haorui.sdk.core.utils.DownloadWorker.access$100(r3)     // Catch: java.lang.Throwable -> L96
                int r4 = r1.notificationId     // Catch: java.lang.Throwable -> L96
                r5 = 67108864(0x4000000, float:1.5046328E-36)
                android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L96
            L79:
                r7 = r2
                goto L88
            L7b:
                cn.haorui.sdk.core.utils.DownloadWorker r4 = cn.haorui.sdk.core.utils.DownloadWorker.this     // Catch: java.lang.Throwable -> L96
                android.content.Context r4 = cn.haorui.sdk.core.utils.DownloadWorker.access$100(r4)     // Catch: java.lang.Throwable -> L96
                int r5 = r1.notificationId     // Catch: java.lang.Throwable -> L96
                android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r4, r5, r2, r3)     // Catch: java.lang.Throwable -> L96
                goto L79
            L88:
                cn.haorui.sdk.core.utils.DownloadWorker r3 = cn.haorui.sdk.core.utils.DownloadWorker.this     // Catch: java.lang.Throwable -> L96
                java.lang.String r4 = r1.displayName     // Catch: java.lang.Throwable -> L96
                java.lang.String r5 = "安装已完成，点击打开"
                int r6 = r1.notificationId     // Catch: java.lang.Throwable -> L96
                r8 = 1
                r3.updateNotification(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L96
                goto Le
            L96:
                r2 = move-exception
                r2.printStackTrace()
            L9a:
                cn.haorui.sdk.core.utils.DownloadWorker r2 = cn.haorui.sdk.core.utils.DownloadWorker.this
                int r1 = r1.notificationId
                r2.cancelNotification(r1)
                goto Le
            La3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.utils.DownloadWorker.C0564d.run():void");
        }
    }

    private DownloadWorker() {
        this.manager = null;
        Context context = AdSdk.getContext();
        this.context = context;
        try {
            AppStoreUtil.registerBroadCast(context.getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.defaultOkHttpClient = new C4151mx.OooO0O0().OooO0Oo();
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.handlerThread = handlerThread;
        handlerThread.start();
        HandlerC0561a handlerC0561a = new HandlerC0561a(this.handlerThread.getLooper());
        this.handler = handlerC0561a;
        handlerC0561a.sendEmptyMessage(100);
        this.manager = (NotificationManager) this.context.getSystemService("notification");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent buildInstallApkIntent(Context context, File file) {
        Uri uriFromFile;
        Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
        if (Build.VERSION.SDK_INT >= 24) {
            uriFromFile = FileProvider.getUriForFile(context, context.getPackageName() + ".HRFileProvider", file);
            intent.addFlags(268435457);
        } else {
            intent.setFlags(268435456);
            uriFromFile = Uri.fromFile(file);
        }
        intent.setDataAndType(uriFromFile, "application/vnd.android.package-archive");
        return intent;
    }

    private void buildNotificationTitle(boolean z) {
        if (this.currentDownloadInfo == null) {
            return;
        }
        this.notificationTitle = this.taskList.isEmpty() ? z ? this.context.getString(C0384R.string.adsail_notification_title_wait, this.currentDownloadInfo.getDisplayName()) : this.context.getString(C0384R.string.adsail_notification_title, this.currentDownloadInfo.getDisplayName()) : z ? this.context.getString(C0384R.string.adsail_notification_title_more_wait, this.currentDownloadInfo.getDisplayName(), Integer.valueOf(this.taskList.size() + 1)) : this.context.getString(C0384R.string.adsail_notification_title_more, this.currentDownloadInfo.getDisplayName(), Integer.valueOf(this.taskList.size() + 1));
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static File getDownloadDirectory() {
        File file = new File(AdSdk.getContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "adsail_sdk");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static DownloadWorker getInstance() {
        return instance;
    }

    public static File[] getLocalApkFiles() {
        File downloadDirectory = getDownloadDirectory();
        if (downloadDirectory.exists()) {
            return downloadDirectory.listFiles(new C0562b());
        }
        return null;
    }

    public static String getPackageNameFromFile(Context context, String str) {
        PackageInfo packageArchiveInfo;
        if (str == null || (packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 1)) == null) {
            return null;
        }
        return packageArchiveInfo.applicationInfo.packageName;
    }

    private long getSizeFromRange(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str.substring(str.lastIndexOf(47) + 1).trim());
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:11|(4:12|93|13|(2:121|18)(1:119))|17|21|(2:112|23)(4:24|91|25|(4:106|27|115|114)(1:113))|29|101|30|31|(12:33|103|34|95|35|38|52|(2:53|(5:55|(1:57)|58|(3:60|61|124)(2:62|123)|63)(1:122))|64|(1:66)|67|(2:110|69)(4:108|70|90|116))(2:43|(13:45|99|46|111|(1:48)(1:49)|50|51|52|(3:53|(0)(0)|63)|64|(0)|67|(0)(0))(5:107|76|77|84|118))|114) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02ec, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02ed, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02ef, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02f0, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0263 A[EDGE_INSN: B:122:0x0263->B:64:0x0263 BREAK  A[LOOP:2: B:53:0x01fd->B:63:0x0259], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0203 A[Catch: all -> 0x01b9, Exception -> 0x01be, TryCatch #8 {Exception -> 0x01be, all -> 0x01b9, blocks: (B:34:0x01a0, B:35:0x01a7, B:52:0x01eb, B:53:0x01fd, B:55:0x0203, B:57:0x0212, B:58:0x022e, B:60:0x023a), top: B:103:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleMessageDownload() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.utils.DownloadWorker.handleMessageDownload():void");
    }

    private static void installApk(Context context, File file) {
        LogUtil.m89i(TAG, "Install apk " + file.getAbsolutePath());
        context.startActivity(buildInstallApkIntent(context, file));
    }

    public static void installApk(DownloadInfo downloadInfo) {
        downloadInfo.onInstallStart();
        installApk(AdSdk.getContext(), new File(downloadInfo.downloadFile));
    }

    public static synchronized boolean isAppInFront(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningTasks(1);
        if (!runningTasks.isEmpty()) {
            if (runningTasks.get(0).topActivity.getPackageName().equals(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    private void onNewTask() {
    }

    private void onTaskFailed() {
        DownloadInfo downloadInfo = this.currentDownloadInfo;
        this.currentDownloadInfo = null;
        retry(downloadInfo);
    }

    private void onTaskSuccess() {
        Context context;
        int i;
        int i2;
        Intent intent = new Intent(this.context, (Class<?>) InstallReceiver.class);
        intent.putExtra("key", this.currentDownloadInfo.key);
        intent.setAction(ACTION_RECEIVER_INSTALL);
        intent.setPackage(this.context.getPackageName());
        if (Build.VERSION.SDK_INT >= 31) {
            context = this.context;
            i = this.currentDownloadInfo.notificationId;
            i2 = 67108864;
        } else {
            context = this.context;
            i = this.currentDownloadInfo.notificationId;
            i2 = 268435456;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, i2);
        DownloadInfo downloadInfo = this.currentDownloadInfo;
        updateNotification(downloadInfo.displayName, "下载已完成，点击安装", downloadInfo.notificationId, broadcast, false);
        if (isAppInFront(this.context)) {
            installApk(this.currentDownloadInfo);
        }
        this.currentDownloadInfo = null;
    }

    private DownloadInfo poll() {
        DownloadInfo downloadInfoPoll;
        synchronized (this.taskList) {
            downloadInfoPoll = this.taskList.poll();
        }
        return downloadInfoPoll;
    }

    public static void prepareSdkDownloadDirectory() {
        File downloadDirectory = getDownloadDirectory();
        if (!downloadDirectory.exists()) {
            downloadDirectory.mkdirs();
        }
        LogUtil.m89i(TAG, "directory prepared.");
        File[] fileArrListFiles = downloadDirectory.listFiles(new C0563c(System.currentTimeMillis()));
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportInstallSuccess(String str) {
        new C0564d("Download.InstallSuccess", str).start();
    }

    private void retry(DownloadInfo downloadInfo) {
        int i = downloadInfo.retryTime + 1;
        downloadInfo.retryTime = i;
        if (i >= 10) {
            updateNotification(downloadInfo.displayName, "下载失败", BASE_INCREASED_NOTIFICATION_ID.getAndIncrement(), null, true);
            LogUtil.m91w(TAG, "Stop retry. url: " + downloadInfo.downloadFile);
            this.taskCache.remove(downloadInfo.key);
            return;
        }
        synchronized (this.taskList) {
            this.taskList.offer(downloadInfo);
            this.handler.removeMessages(101);
            this.handler.sendEmptyMessage(101);
        }
        LogUtil.m89i(TAG, "Retry. url: " + downloadInfo.downloadFile);
    }

    public void cancelNotification(int i) {
        NotificationManager notificationManager = this.manager;
        if (notificationManager == null) {
            return;
        }
        notificationManager.cancel(i);
    }

    public void directInstall(IAdSailAd iAdSailAd, DownloadInfo downloadInfo) {
        this.taskCache.put(iAdSailAd.toString(), downloadInfo);
        downloadInfo.onDownloadStart();
        downloadInfo.onDownloaded();
        installApk(downloadInfo);
    }

    public void download(IAdSailAd iAdSailAd, DownloadInfo downloadInfo) {
        synchronized (this.taskList) {
            downloadInfo.notificationId = BASE_INCREASED_NOTIFICATION_ID.getAndIncrement();
            this.taskList.offer(downloadInfo);
            this.taskCache.put(iAdSailAd.toString(), downloadInfo);
            buildNotificationTitle(false);
            onNewTask();
            LogUtil.m89i(TAG, "New download. size: " + this.taskList.size() + IOUtils.LINE_SEPARATOR_WINDOWS + downloadInfo);
            this.handler.removeMessages(101);
            this.handler.sendEmptyMessage(101);
        }
    }

    public DownloadInfo findDownloadInfo(String str) {
        try {
            if (this.taskCache.containsKey(str)) {
                return this.taskCache.get(str);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<DownloadInfo> findDownloadInfoByPackageName(String str) {
        ArrayList arrayList = new ArrayList();
        for (DownloadInfo downloadInfo : this.taskCache.values()) {
            String packageNameFromFile = downloadInfo.packageName;
            if (TextUtils.isEmpty(packageNameFromFile)) {
                packageNameFromFile = getPackageNameFromFile(this.context, downloadInfo.downloadFile);
                downloadInfo.packageName = packageNameFromFile;
            }
            if (TextUtils.equals(str, packageNameFromFile)) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    public Notification updateNotification(String str, String str2, int i, int i2) {
        return updateNotification(str, str2, i, i2, 1, null, true);
    }

    public Notification updateNotification(String str, String str2, int i, int i2, int i3, PendingIntent pendingIntent, boolean z) {
        String str3;
        if (!AdSdk.adConfig().enableNotify() || this.manager == null) {
            return null;
        }
        Notification.Builder builder = new Notification.Builder(this.context);
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("cn.adsail.sdk", "下载进度通知", 4));
            builder.setChannelId("cn.adsail.sdk");
        }
        if (i != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(C4196o4.OooO00o.OooO0Oo);
            sb.append(i);
            if (i2 == -1) {
                str3 = "";
            } else {
                str3 = "/" + i2;
            }
            sb.append(str3);
            sb.append("KB");
            str2 = sb.toString();
            builder.setProgress(i2, i, false);
        }
        if (pendingIntent != null) {
            builder.setContentIntent(pendingIntent);
        }
        builder.setContentTitle(str).setContentText(str2).setAutoCancel(z).setWhen(System.currentTimeMillis()).setOnlyAlertOnce(true).setPriority(0).setDefaults(-1).setSmallIcon(this.context.getApplicationInfo().icon);
        Notification notificationBuild = builder.build();
        this.manager.notify(i3, notificationBuild);
        return notificationBuild;
    }

    public Notification updateNotification(String str, String str2, int i, PendingIntent pendingIntent, boolean z) {
        return updateNotification(str, str2, -1, -1, i, pendingIntent, z);
    }
}
