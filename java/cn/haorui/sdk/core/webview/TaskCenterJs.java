package cn.haorui.sdk.core.webview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.download.C0484a;
import cn.haorui.sdk.core.download.C0485b;
import cn.haorui.sdk.core.download.InterfaceC0491h;
import cn.haorui.sdk.core.download.RunnableC0487d;
import cn.haorui.sdk.core.taskcenter.C0545a;
import cn.haorui.sdk.core.taskcenter.C0546b;
import cn.haorui.sdk.core.taskcenter.C0547c;
import cn.haorui.sdk.core.taskcenter.C0548d;
import cn.haorui.sdk.core.taskcenter.C0549e;
import cn.haorui.sdk.core.taskcenter.C0550f;
import cn.haorui.sdk.core.taskcenter.DeeplinkResultBean;
import cn.haorui.sdk.core.taskcenter.DownloadAppBean;
import cn.haorui.sdk.core.taskcenter.DownloadPauseBean;
import cn.haorui.sdk.core.taskcenter.InstallApplicationBean;
import cn.haorui.sdk.core.taskcenter.TrackBean;
import cn.haorui.sdk.core.utils.HttpUtil;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TaskCenterJs {

    /* JADX INFO: renamed from: a */
    public TaskCenterWebActivity f327a;

    /* JADX INFO: renamed from: b */
    public WebView f328b;

    /* JADX INFO: renamed from: d */
    public InstallReceiver f330d;

    /* JADX INFO: renamed from: c */
    public Map<String, TrackBean> f329c = new HashMap();

    /* JADX INFO: renamed from: e */
    public long f331e = C1659a.f9130f;

    public class InstallReceiver extends BroadcastReceiver {
        public InstallReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                context.getPackageManager();
                if (!intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                    if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
                        intent.getData().getSchemeSpecificPart();
                        return;
                    }
                    return;
                }
                String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 0);
                if (TaskCenterJs.this.f329c.containsKey(schemeSpecificPart)) {
                    TrackBean trackBean = TaskCenterJs.this.f329c.get(schemeSpecificPart);
                    Gson gson = new Gson();
                    C0549e c0549e = new C0549e();
                    trackBean.getTaskId();
                    List<String> in_error = trackBean.getIn_error();
                    List<String> in_start = trackBean.getIn_start();
                    List<String> in_succ = trackBean.getIn_succ();
                    List<String> dn_succ = trackBean.getDn_succ();
                    if (trackBean.getIsAppStore()) {
                        if (dn_succ != null && dn_succ.size() > 0) {
                            for (String str : dn_succ) {
                                if (!TextUtils.isEmpty(str)) {
                                    HttpUtil.asyncGetTaskReport(str);
                                }
                            }
                        }
                        if (in_start != null && in_start.size() > 0) {
                            for (String str2 : in_start) {
                                if (!TextUtils.isEmpty(str2)) {
                                    HttpUtil.asyncGetTaskReport(str2);
                                }
                            }
                        }
                    }
                    if (intExtra == 1) {
                        if (in_error != null && in_error.size() > 0) {
                            for (String str3 : in_error) {
                                if (!TextUtils.isEmpty(str3)) {
                                    HttpUtil.asyncGetTaskReport(str3);
                                }
                            }
                        }
                    } else if (in_succ != null && in_succ.size() > 0) {
                        for (String str4 : in_succ) {
                            if (!TextUtils.isEmpty(str4)) {
                                HttpUtil.asyncGetTaskReport(str4);
                            }
                        }
                    }
                    String json = gson.toJson(c0549e);
                    TaskCenterJs.m100a(TaskCenterJs.this, "javascript:reportInstallApplication(" + json + ")");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.webview.TaskCenterJs$a */
    public class C0589a implements InterfaceC0491h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f333a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f334b;

        public C0589a(List list, List list2) {
            this.f333a = list;
            this.f334b = list2;
        }

        @Override // cn.haorui.sdk.core.download.InterfaceC0491h
        /* JADX INFO: renamed from: a */
        public void mo30a(C0485b c0485b) {
        }

        @Override // cn.haorui.sdk.core.download.InterfaceC0491h
        /* JADX INFO: renamed from: a */
        public void mo31a(C0485b c0485b, String str) {
            List list = this.f333a;
            if (list != null && list.size() > 0) {
                for (String str2 : this.f333a) {
                    if (!TextUtils.isEmpty(str2)) {
                        HttpUtil.asyncGetTaskReport(str2);
                    }
                }
            }
            TaskCenterJs.m99a(TaskCenterJs.this, c0485b);
        }

        @Override // cn.haorui.sdk.core.download.InterfaceC0491h
        /* JADX INFO: renamed from: a */
        public void mo32a(File file, C0485b c0485b) {
            List list = this.f334b;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (String str : this.f334b) {
                if (!TextUtils.isEmpty(str)) {
                    HttpUtil.asyncGetTaskReport(str);
                }
            }
        }

        @Override // cn.haorui.sdk.core.download.InterfaceC0491h
        /* JADX INFO: renamed from: b */
        public void mo33b(C0485b c0485b) {
            TaskCenterJs.m99a(TaskCenterJs.this, c0485b);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.webview.TaskCenterJs$b */
    public class RunnableC0590b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f336a;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.webview.TaskCenterJs$b$a */
        public class a implements ValueCallback<String> {
            public a(RunnableC0590b runnableC0590b) {
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
            }
        }

        public RunnableC0590b(String str) {
            this.f336a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = TaskCenterJs.this.f328b;
            if (webView == null || Build.VERSION.SDK_INT < 19) {
                return;
            }
            webView.evaluateJavascript(this.f336a, new a(this));
        }
    }

    public TaskCenterJs(TaskCenterWebActivity taskCenterWebActivity, WebView webView) {
        this.f327a = taskCenterWebActivity;
        this.f328b = webView;
        m101a(taskCenterWebActivity);
    }

    /* JADX INFO: renamed from: a */
    public static void m99a(TaskCenterJs taskCenterJs, C0485b c0485b) {
        taskCenterJs.getClass();
        long j = c0485b.f61i;
        int i = c0485b.f62j;
        C0548d c0548d = new C0548d();
        if (i != 1 && i == 2) {
        }
        taskCenterJs.m103a("javascript:reportDownloadApplicationProgress(" + new Gson().toJson(c0548d) + ")");
    }

    /* JADX INFO: renamed from: a */
    public static void m100a(TaskCenterJs taskCenterJs, String str) {
        taskCenterJs.f327a.runOnUiThread(taskCenterJs.new RunnableC0590b(str));
    }

    /* JADX INFO: renamed from: a */
    public void m101a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        InstallReceiver installReceiver = new InstallReceiver();
        this.f330d = installReceiver;
        context.registerReceiver(installReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public final void m102a(DownloadAppBean downloadAppBean) {
        try {
            downloadAppBean.getDownloadUrl();
            downloadAppBean.getAppName();
            String appPackageName = downloadAppBean.getAppPackageName();
            TrackBean trackBean = downloadAppBean.getTrackBean();
            List<String> dn_start = null;
            if (trackBean != null) {
                dn_start = trackBean.getDn_start();
                trackBean.getDn_error();
                trackBean.getDn_succ();
            } else {
                trackBean = new TrackBean();
            }
            trackBean.setTaskId(downloadAppBean.getTaskId());
            trackBean.setIsAppStore(true);
            this.f329c.put(appPackageName, trackBean);
            if (dn_start != null && dn_start.size() > 0) {
                for (String str : dn_start) {
                    if (!TextUtils.isEmpty(str)) {
                        HttpUtil.asyncGetTaskReport(str);
                    }
                }
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + appPackageName));
            intent.addFlags(268435456);
            this.f327a.startActivity(intent);
        } catch (Exception unused) {
            m104b(downloadAppBean);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m103a(String str) {
        this.f327a.runOnUiThread(new RunnableC0590b(str));
    }

    /* JADX INFO: renamed from: b */
    public final void m104b(DownloadAppBean downloadAppBean) {
        List<String> dn_error;
        List<String> dn_succ;
        String downloadUrl = downloadAppBean.getDownloadUrl();
        String appName = downloadAppBean.getAppName();
        String appPackageName = downloadAppBean.getAppPackageName();
        TrackBean trackBean = downloadAppBean.getTrackBean();
        List<String> dn_start = null;
        if (trackBean != null) {
            dn_start = trackBean.getDn_start();
            dn_error = trackBean.getDn_error();
            dn_succ = trackBean.getDn_succ();
        } else {
            trackBean = new TrackBean();
            dn_error = null;
            dn_succ = null;
        }
        if (dn_start != null && dn_start.size() > 0) {
            for (String str : dn_start) {
                if (!TextUtils.isEmpty(str)) {
                    HttpUtil.asyncGetTaskReport(str);
                }
            }
        }
        String taskId = downloadAppBean.getTaskId();
        trackBean.setTaskId(taskId);
        this.f329c.put(appPackageName, trackBean);
        if (TextUtils.isEmpty(downloadUrl)) {
            return;
        }
        C0484a c0484a = C0484a.a.f52a;
        RunnableC0487d runnableC0487d = c0484a.f49a.get(taskId);
        if (runnableC0487d == null) {
            runnableC0487d = new RunnableC0487d(downloadUrl, appName, appPackageName, taskId);
            c0484a.f49a.put(taskId, runnableC0487d);
        }
        runnableC0487d.f71e.put(runnableC0487d.f68b, new C0589a(dn_error, dn_succ));
        runnableC0487d.m28b();
    }

    @JavascriptInterface
    public void checkInstall(String str) {
        if (((C0545a) new Gson().fromJson(str, C0545a.class)) == null) {
            return;
        }
        new ArrayList();
        throw null;
    }

    @JavascriptInterface
    public void closeCurrentUI() {
        TaskCenterWebActivity taskCenterWebActivity = this.f327a;
        if (taskCenterWebActivity == null || taskCenterWebActivity.isFinishing()) {
            return;
        }
        this.f327a.finish();
    }

    @JavascriptInterface
    public void downloadApplication(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            DownloadAppBean downloadAppBean = (DownloadAppBean) new Gson().fromJson(str, DownloadAppBean.class);
            if (downloadAppBean != null) {
                if (downloadAppBean.getIs_appstore() == 1) {
                    m102a(downloadAppBean);
                } else {
                    m104b(downloadAppBean);
                }
            }
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public void downloadApplicationAction(String str) {
        try {
            Gson gson = new Gson();
            DownloadPauseBean downloadPauseBean = (DownloadPauseBean) gson.fromJson(str, DownloadPauseBean.class);
            if (downloadPauseBean != null) {
                downloadPauseBean.getDownloadUrl();
                downloadPauseBean.getHandleAction();
                String taskId = downloadPauseBean.getTaskId();
                downloadPauseBean.getAppPackageName();
                RunnableC0487d runnableC0487dM22b = C0484a.a.f52a.m22b(taskId);
                C0547c c0547c = new C0547c();
                if (runnableC0487dM22b != null) {
                    runnableC0487dM22b.m24a();
                }
                m103a("javascript:reportDownloadApplicationAction(" + gson.toJson(c0547c) + ")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public void installApplication(String str) {
        Uri uriFromFile;
        try {
            Gson gson = new Gson();
            InstallApplicationBean installApplicationBean = (InstallApplicationBean) gson.fromJson(str, InstallApplicationBean.class);
            if (installApplicationBean != null) {
                String taskId = installApplicationBean.getTaskId();
                String packageName = installApplicationBean.getPackageName();
                TrackBean trackBean = installApplicationBean.getTrackBean();
                List<String> in_start = null;
                if (trackBean != null) {
                    in_start = trackBean.getIn_start();
                } else {
                    trackBean = new TrackBean();
                }
                trackBean.setTaskId(taskId);
                this.f329c.put(packageName, trackBean);
                String downloadUrl = installApplicationBean.getDownloadUrl();
                if (TextUtils.isEmpty(downloadUrl)) {
                    return;
                }
                File file = new File(C0484a.a.f52a.f51c, downloadUrl.substring(downloadUrl.lastIndexOf("/")));
                if (!file.exists()) {
                    C0549e c0549e = new C0549e();
                    trackBean.getTaskId();
                    List<String> in_error = trackBean.getIn_error();
                    if (in_error != null && in_error.size() > 0) {
                        for (String str2 : in_error) {
                            if (!TextUtils.isEmpty(str2)) {
                                HttpUtil.asyncGetTaskReport(str2);
                            }
                        }
                    }
                    m103a("javascript:reportInstallApplication(" + gson.toJson(c0549e) + ")");
                    return;
                }
                if (in_start != null && in_start.size() > 0) {
                    for (String str3 : in_start) {
                        if (!TextUtils.isEmpty(str3)) {
                            HttpUtil.asyncGetTaskReport(str3);
                        }
                    }
                }
                TaskCenterWebActivity taskCenterWebActivity = this.f327a;
                Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
                intent.addFlags(268435456);
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.addFlags(1);
                    uriFromFile = FileProvider.getUriForFile(taskCenterWebActivity, taskCenterWebActivity.getPackageName() + ".HRFileProvider", file);
                } else {
                    uriFromFile = Uri.fromFile(file);
                }
                intent.setDataAndType(uriFromFile, "application/vnd.android.package-archive");
                taskCenterWebActivity.startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public void openApplication(String str) {
        List<String> dp_succ;
        List<String> list;
        Gson gson = new Gson();
        DeeplinkResultBean deeplinkResultBean = (DeeplinkResultBean) gson.fromJson(str, DeeplinkResultBean.class);
        String deepLink = deeplinkResultBean.getDeepLink();
        TrackBean trackBean = deeplinkResultBean.getTrackBean();
        this.f331e = deeplinkResultBean.getTime() * 1000;
        List<String> dp_start = null;
        if (trackBean != null) {
            dp_start = trackBean.getDp_start();
            List<String> dp_error = trackBean.getDp_error();
            dp_succ = trackBean.getDp_succ();
            list = dp_error;
        } else {
            dp_succ = null;
            list = null;
        }
        C0546b c0546b = new C0546b();
        deeplinkResultBean.getTaskId();
        deeplinkResultBean.getPackageName();
        if (dp_start != null && dp_start.size() > 0) {
            for (String str2 : dp_start) {
                if (!TextUtils.isEmpty(str2)) {
                    HttpUtil.asyncGetTaskReport(str2);
                }
            }
        }
        try {
            Intent uri = Intent.parseUri(deepLink, 0);
            uri.setAction("android.intent.action.VIEW");
            if (uri.resolveActivity(AdSdk.getContext().getPackageManager()) != null) {
                uri.setFlags(268435456);
            }
            this.f327a.startActivity(uri);
            new Thread(new RunnableC0595b(this, c0546b, gson, list, dp_succ)).start();
        } catch (Exception e) {
            e.printStackTrace();
            m103a("javascript:reportOpenApplication(" + gson.toJson(c0546b) + ")");
            if (list == null || list.size() <= 0) {
                return;
            }
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    HttpUtil.asyncGetTaskReport(str3);
                }
            }
        }
    }

    @JavascriptInterface
    public void openBrowser(String str) {
        try {
            if (((C0550f) new Gson().fromJson(str, C0550f.class)) != null && !TextUtils.isEmpty(null)) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(null));
                this.f327a.startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
