package com.octopus.p222ad;

import android.app.DownloadManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import androidx.multidex.MultiDexExtractor;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.anythink.core.common.p052c.C1192m;
import com.octopus.p222ad.internal.utilities.DownloadFactory;
import com.octopus.p222ad.internal.utilities.ReportEventUtil;
import com.octopus.p222ad.utils.C3215a;
import com.octopus.p222ad.utils.C3249b;
import com.octopus.p222ad.utils.p258b.C3253d;
import com.octopus.p222ad.utils.p258b.C3255f;
import java.io.File;
import java.util.HashMap;
import p285z2.C3902g6;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadService extends Service {

    /* JADX INFO: renamed from: g */
    private static DownloadFactory.Download f16655g;

    /* JADX INFO: renamed from: a */
    private long f16656a;

    /* JADX INFO: renamed from: b */
    private String f16657b;

    /* JADX INFO: renamed from: c */
    private DownloadManager f16658c;

    /* JADX INFO: renamed from: d */
    private C3058a f16659d;

    /* JADX INFO: renamed from: e */
    private C3059b f16660e;

    /* JADX INFO: renamed from: f */
    private C3060c f16661f;

    /* JADX INFO: renamed from: h */
    private HashMap<String, C3215a> f16662h;

    /* JADX INFO: renamed from: i */
    private HashMap<String, Boolean> f16663i;

    /* JADX INFO: renamed from: j */
    private HashMap<Long, String> f16664j;

    /* JADX INFO: renamed from: com.octopus.ad.DownloadService$1 */
    public class C30571 implements DownloadFactory.DownloadDelegate {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3215a f16665a;

        public C30571(C3215a c3215a) {
            c3215a = c3215a;
        }

        @Override // com.octopus.ad.internal.utilities.DownloadFactory.DownloadDelegate
        public boolean onCheck(File file) {
            return true;
        }

        @Override // com.octopus.ad.internal.utilities.DownloadFactory.DownloadDelegate
        public void onFail(int i) {
            C3255f.m14981a("DownloadService", "--appUpdate downloadApk onFail--");
            try {
                String strM14822a = c3215a.m14822a();
                if (TextUtils.isEmpty(strM14822a) || !strM14822a.contains("http")) {
                    return;
                }
                if (DownloadService.this.f16663i != null) {
                    DownloadService.this.f16663i.put(c3215a.m14824c(), Boolean.TRUE);
                }
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(strM14822a));
                intent.setFlags(268435456);
                DownloadService.this.startActivity(intent);
            } catch (Exception e) {
                C3255f.m14981a("DownloadService", "skip browser fail:" + e);
            }
        }

        @Override // com.octopus.ad.internal.utilities.DownloadFactory.DownloadDelegate
        public void onProgress(long j, long j2) {
        }

        @Override // com.octopus.ad.internal.utilities.DownloadFactory.DownloadDelegate
        public void onSuccess(File file) {
            C3255f.m14981a("DownloadService", "--appUpdate downloadApk onSuccess--");
            if (DownloadService.this.f16663i != null) {
                DownloadService.this.f16663i.put(c3215a.m14824c(), Boolean.FALSE);
            }
            DownloadService.this.m13827a(DownloadService.this.getApplicationContext(), -1L, c3215a);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.DownloadService$a */
    public class C3058a extends ContentObserver {
        public C3058a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            int[] iArr = {0, 0, 0};
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = DownloadService.this.f16658c.query(new DownloadManager.Query().setFilterById(DownloadService.this.f16656a));
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                        C3255f.m14981a("DownloadService", "onChange status：" + i);
                        if (i == 1) {
                            DownloadService.this.m13833b(C3249b.m14955a(DownloadService.this).m14960a());
                        }
                        iArr[0] = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("bytes_so_far"));
                        iArr[1] = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(C1192m.a.f3560f));
                        iArr[2] = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                        C3255f.m14981a("DownloadService", "progress：" + iArr[0] + "/" + iArr[1] + "");
                    }
                    if (cursorQuery == null) {
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (cursorQuery == null) {
                        return;
                    }
                }
                cursorQuery.close();
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.DownloadService$b */
    public class C3059b extends BroadcastReceiver {
        public C3059b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C3255f.m14981a("DownloadService", "onReceived...download finish...begin install！");
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            if (DownloadService.this.f16664j == null || DownloadService.this.f16662h == null) {
                return;
            }
            String str = (String) DownloadService.this.f16664j.get(Long.valueOf(longExtra));
            if (DownloadService.this.f16663i != null) {
                DownloadService.this.f16663i.put(str, Boolean.FALSE);
            }
            C3215a c3215a = (C3215a) DownloadService.this.f16662h.get(str);
            if (c3215a != null) {
                if (c3215a.m14829h() != null) {
                    ReportEventUtil.report(c3215a.m14829h().m13941c());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    context.getPackageManager().canRequestPackageInstalls();
                }
                DownloadService.this.m13827a(context, Long.valueOf(longExtra), c3215a);
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.DownloadService$c */
    public class C3060c extends BroadcastReceiver {
        public C3060c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                C3255f.m14981a("DownloadService", "Install Success:" + schemeSpecificPart);
                if (DownloadService.this.f16662h == null) {
                    return;
                }
                C3215a c3215a = (C3215a) DownloadService.this.f16662h.get(schemeSpecificPart);
                if (c3215a != null) {
                    File file = new File(c3215a.m14825d(), c3215a.m14823b());
                    if (file.exists()) {
                        file.delete();
                    }
                    if (c3215a.m14829h() != null) {
                        ReportEventUtil.report(c3215a.m14829h().m13945e());
                    }
                    DownloadService.this.f16662h.remove(schemeSpecificPart);
                }
            }
            if (DownloadService.this.f16662h == null || !DownloadService.this.f16662h.isEmpty()) {
                return;
            }
            DownloadService.this.stopSelf();
        }
    }

    /* JADX INFO: renamed from: a */
    private static File m13825a(Context context, long j) {
        Cursor cursorQuery;
        String path;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(C3902g6.OoooOO0);
        File file = null;
        if (j != -1) {
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(j);
            query.setFilterByStatus(8);
            if (downloadManager != null && (cursorQuery = downloadManager.query(query)) != null) {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"));
                    if (!TextUtils.isEmpty(string) && (path = Uri.parse(string).getPath()) != null) {
                        file = new File(path);
                    }
                }
                cursorQuery.close();
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: a */
    private void m13826a() {
        getContentResolver().registerContentObserver(Uri.parse("content://downloads/my_downloads"), true, this.f16659d);
        registerReceiver(this.f16660e, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_INSTALL");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        registerReceiver(this.f16661f, intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public void m13827a(Context context, Long l, C3215a c3215a) {
        Uri uriForFile;
        try {
            File file = new File(c3215a.m14825d(), c3215a.m14824c() + MultiDexExtractor.EXTRACTED_SUFFIX);
            if (file.exists()) {
                File file2 = new File(c3215a.m14825d(), c3215a.m14823b());
                file.renameTo(file2);
                C3255f.m14981a("DownloadService", "apkFile......raName:" + file2.exists());
            }
            Uri uriFromFile = null;
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.intent.action.VIEW");
            int i = Build.VERSION.SDK_INT;
            if (i < 23) {
                uriForFile = this.f16658c.getUriForDownloadedFile(l.longValue());
                if (uriForFile != null) {
                    uriForFile = Uri.parse(uriForFile.toString().replace(MultiDexExtractor.EXTRACTED_SUFFIX, AbstractC1067a.f2406g));
                    C3255f.m14981a("DownloadService", "uri......" + uriForFile);
                }
            } else if (i < 24) {
                File fileM13825a = m13825a(context, l.longValue());
                if (fileM13825a != null && (uriFromFile = Uri.fromFile(fileM13825a)) != null) {
                    uriFromFile = Uri.parse(uriFromFile.toString().replace(MultiDexExtractor.EXTRACTED_SUFFIX, AbstractC1067a.f2406g));
                    C3255f.m14981a("DownloadService", "uri......" + uriFromFile);
                }
                uriForFile = uriFromFile;
            } else {
                uriForFile = FileProvider.getUriForFile(context, this.f16657b, new File(c3215a.m14825d(), c3215a.m14823b()));
                intent.addFlags(3);
            }
            if (uriForFile != null) {
                intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                context.startActivity(intent);
                m13836c(c3215a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m13830a(C3215a c3215a) {
        String str;
        String str2;
        Uri uriForFile;
        Boolean bool = Boolean.TRUE;
        synchronized (this) {
            HashMap<String, Boolean> map = this.f16663i;
            if (map != null && map.get(c3215a.m14824c()) != null && this.f16663i.get(c3215a.m14824c()).booleanValue()) {
                C3255f.m14981a("DownloadService", "downloading..." + c3215a.m14824c() + "...please not repeat click");
                Toast.makeText(this, "正在下载…请勿重复点击", 0).show();
                return;
            }
            File file = new File(c3215a.m14825d(), c3215a.m14824c() + MultiDexExtractor.EXTRACTED_SUFFIX);
            if (file.exists()) {
                file.delete();
                C3255f.m14981a("DownloadService", "apkCacheFile......remove:" + file.exists());
            }
            File file2 = new File(c3215a.m14825d(), c3215a.m14823b());
            if (file2.exists()) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.addFlags(268435456);
                    intent.setAction("android.intent.action.VIEW");
                    if (Build.VERSION.SDK_INT < 24) {
                        uriForFile = Uri.fromFile(file2);
                    } else {
                        uriForFile = FileProvider.getUriForFile(this, c3215a.m14828g(), file2);
                        intent.addFlags(3);
                    }
                    if (uriForFile != null) {
                        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                        startActivity(intent);
                        m13836c(c3215a);
                    }
                } catch (Exception e) {
                    str = "octopus";
                    str2 = "apkFile.exists():" + e;
                    Log.d(str, str2);
                }
            } else {
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(c3215a.m14822a()));
                    request.setTitle(c3215a.m14826e());
                    request.setDescription(c3215a.m14827f());
                    request.setNotificationVisibility(1);
                    request.setDestinationUri(Uri.fromFile(file));
                    request.setMimeType("application/vnd.android.package-archive");
                    this.f16656a = this.f16658c.enqueue(request);
                    C3255f.m14982b("DownloadService", "mReqId:" + this.f16656a);
                    HashMap<Long, String> map2 = this.f16664j;
                    if (map2 != null) {
                        map2.put(Long.valueOf(this.f16656a), c3215a.m14824c());
                    }
                    HashMap<String, Boolean> map3 = this.f16663i;
                    if (map3 != null) {
                        map3.put(c3215a.m14824c(), bool);
                    }
                    Toast.makeText(this, "已开始下载…", 0).show();
                    C3255f.m14981a("DownloadService", "BEGIN_DOWNLOAD!");
                    if (c3215a.m14829h() != null) {
                        ReportEventUtil.report(c3215a.m14829h().m13939b());
                    }
                } catch (Exception e2) {
                    Log.d("octopus", "DownloadManager download fail:" + e2);
                    try {
                        if (!TextUtils.isEmpty(c3215a.m14822a()) && c3215a.m14822a().contains("http")) {
                            HashMap<String, Boolean> map4 = this.f16663i;
                            if (map4 != null) {
                                map4.put(c3215a.m14824c(), bool);
                            }
                            Intent intent2 = new Intent();
                            intent2.setAction("android.intent.action.VIEW");
                            intent2.setData(Uri.parse(c3215a.m14822a()));
                            intent2.setFlags(268435456);
                            startActivity(intent2);
                        }
                    } catch (Exception e3) {
                        str = "octopus";
                        str2 = "skip browser fail:" + e3;
                        Log.d(str, str2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m13832b() {
        getContentResolver().unregisterContentObserver(this.f16659d);
        unregisterReceiver(this.f16660e);
        unregisterReceiver(this.f16661f);
        C3255f.m14981a("DownloadService", "unregister()");
    }

    /* JADX INFO: renamed from: b */
    public void m13833b(C3215a c3215a) {
        if (c3215a == null) {
            return;
        }
        C3255f.m14981a("DownloadService", "--appUpdate downloadApk start--");
        DownloadFactory.Download downloadCreate = DownloadFactory.create();
        f16655g = downloadCreate;
        downloadCreate.register(new DownloadFactory.DownloadDelegate() { // from class: com.octopus.ad.DownloadService.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3215a f16665a;

            public C30571(C3215a c3215a2) {
                c3215a = c3215a2;
            }

            @Override // com.octopus.ad.internal.utilities.DownloadFactory.DownloadDelegate
            public boolean onCheck(File file) {
                return true;
            }

            @Override // com.octopus.ad.internal.utilities.DownloadFactory.DownloadDelegate
            public void onFail(int i) {
                C3255f.m14981a("DownloadService", "--appUpdate downloadApk onFail--");
                try {
                    String strM14822a = c3215a.m14822a();
                    if (TextUtils.isEmpty(strM14822a) || !strM14822a.contains("http")) {
                        return;
                    }
                    if (DownloadService.this.f16663i != null) {
                        DownloadService.this.f16663i.put(c3215a.m14824c(), Boolean.TRUE);
                    }
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(strM14822a));
                    intent.setFlags(268435456);
                    DownloadService.this.startActivity(intent);
                } catch (Exception e) {
                    C3255f.m14981a("DownloadService", "skip browser fail:" + e);
                }
            }

            @Override // com.octopus.ad.internal.utilities.DownloadFactory.DownloadDelegate
            public void onProgress(long j, long j2) {
            }

            @Override // com.octopus.ad.internal.utilities.DownloadFactory.DownloadDelegate
            public void onSuccess(File file) {
                C3255f.m14981a("DownloadService", "--appUpdate downloadApk onSuccess--");
                if (DownloadService.this.f16663i != null) {
                    DownloadService.this.f16663i.put(c3215a.m14824c(), Boolean.FALSE);
                }
                DownloadService.this.m13827a(DownloadService.this.getApplicationContext(), -1L, c3215a);
            }
        });
        f16655g.start(new DownloadFactory.Request(c3215a2.m14822a(), c3215a2.m14825d(), c3215a2.m14823b()));
    }

    /* JADX INFO: renamed from: c */
    private void m13835c() {
        String strM14828g;
        C3215a c3215aM14960a = C3249b.m14955a(this).m14960a();
        if (c3215aM14960a == null) {
            return;
        }
        HashMap<String, C3215a> map = this.f16662h;
        if (map != null) {
            map.put(c3215aM14960a.m14824c(), c3215aM14960a);
        }
        HashMap<String, Boolean> map2 = this.f16663i;
        if (map2 != null && map2.get(c3215aM14960a.m14824c()) == null) {
            C3255f.m14981a("DownloadService", "not have package status...");
            this.f16663i.put(c3215aM14960a.m14824c(), Boolean.FALSE);
        }
        if (TextUtils.isEmpty(c3215aM14960a.m14828g())) {
            strM14828g = getPackageName() + ".fileprovider";
        } else {
            strM14828g = c3215aM14960a.m14828g();
        }
        this.f16657b = strM14828g;
        C3253d.m14974a(c3215aM14960a.m14825d());
        m13830a(c3215aM14960a);
    }

    /* JADX INFO: renamed from: c */
    private void m13836c(C3215a c3215a) {
        C3255f.m14981a("DownloadService", "BEGIN_INSTALL!");
        if (c3215a.m14829h() != null) {
            ReportEventUtil.report(c3215a.m14829h().m13943d());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m13838d() {
        DownloadFactory.Download download = f16655g;
        if (download != null) {
            download.destroy();
        }
        if (this.f16663i != null) {
            this.f16663i = null;
        }
        if (this.f16662h != null) {
            this.f16662h = null;
        }
        if (this.f16664j != null) {
            this.f16664j = null;
        }
        C3249b.m14955a(this).m14966c();
        C3255f.m14981a("DownloadService", "releaseResources()");
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C3255f.m14981a("DownloadService", "DownloadService onCreate()");
        this.f16658c = (DownloadManager) getSystemService(C3902g6.OoooOO0);
        this.f16659d = new C3058a(new Handler());
        this.f16660e = new C3059b();
        this.f16661f = new C3060c();
        this.f16662h = new HashMap<>();
        this.f16663i = new HashMap<>();
        this.f16664j = new HashMap<>();
        m13826a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C3255f.m14981a("DownloadService", "DownloadService onDestroy()");
        m13832b();
        m13838d();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 1;
        }
        C3255f.m14981a("DownloadService", "DownloadService onStartCommand()");
        m13835c();
        return super.onStartCommand(intent, i, i2);
    }
}
