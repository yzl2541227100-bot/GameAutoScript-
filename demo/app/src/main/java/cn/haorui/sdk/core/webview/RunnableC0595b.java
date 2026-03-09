package cn.haorui.sdk.core.webview;

import android.os.SystemClock;
import android.text.TextUtils;
import cn.haorui.sdk.core.taskcenter.C0546b;
import cn.haorui.sdk.core.utils.HttpUtil;
import com.google.gson.Gson;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.util.List;

/* JADX INFO: renamed from: cn.haorui.sdk.core.webview.b */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0595b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0546b f345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Gson f346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f347c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f348d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TaskCenterJs f349e;

    public RunnableC0595b(TaskCenterJs taskCenterJs, C0546b c0546b, Gson gson, List list, List list2) {
        this.f349e = taskCenterJs;
        this.f345a = c0546b;
        this.f346b = gson;
        this.f347c = list;
        this.f348d = list2;
    }

    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z = false;
        while (true) {
            if (SystemClock.uptimeMillis() - jUptimeMillis > UMAmapConfig.AMAP_CACHE_WRITE_TIME && !z) {
                this.f345a.getClass();
                TaskCenterJs.m100a(this.f349e, "javascript:reportOpenApplication(" + this.f346b.toJson(this.f345a) + ")");
                List list = this.f347c;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (String str : this.f347c) {
                    if (!TextUtils.isEmpty(str)) {
                        HttpUtil.asyncGetTaskReport(str);
                    }
                }
                return;
            }
            TaskCenterWebActivity taskCenterWebActivity = this.f349e.f327a;
            if (taskCenterWebActivity.f341d && !taskCenterWebActivity.isFinishing()) {
                z = true;
            }
            if (z) {
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                TaskCenterJs taskCenterJs = this.f349e;
                long j = taskCenterJs.f331e;
                TaskCenterWebActivity taskCenterWebActivity2 = taskCenterJs.f327a;
                boolean z3 = taskCenterWebActivity2.f341d;
                if (jUptimeMillis2 <= j) {
                    if (!z3 || taskCenterWebActivity2.isFinishing()) {
                        break;
                    }
                } else if (z3 && !taskCenterWebActivity2.isFinishing()) {
                    this.f345a.getClass();
                    TaskCenterJs.m100a(this.f349e, "javascript:reportOpenApplication(" + this.f346b.toJson(this.f345a) + ")");
                    List list2 = this.f348d;
                    if (list2 == null || list2.size() <= 0) {
                        return;
                    }
                    for (String str2 : this.f348d) {
                        if (!TextUtils.isEmpty(str2)) {
                            HttpUtil.asyncGetTaskReport(str2);
                        }
                    }
                    return;
                }
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.f345a.getClass();
        TaskCenterJs.m100a(this.f349e, "javascript:reportOpenApplication(" + this.f346b.toJson(this.f345a) + ")");
        List list3 = this.f347c;
        if (list3 == null || list3.size() <= 0) {
            return;
        }
        for (String str3 : this.f347c) {
            if (!TextUtils.isEmpty(str3)) {
                HttpUtil.asyncGetTaskReport(str3);
            }
        }
    }
}
