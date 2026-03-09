package cn.haorui.sdk.core.download;

import android.os.Environment;
import cn.haorui.sdk.core.AdSdk;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: cn.haorui.sdk.core.download.a */
/* JADX INFO: loaded from: classes.dex */
public class C0484a {

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, RunnableC0487d> f49a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public C0490g f50b = new C0490g();

    /* JADX INFO: renamed from: c */
    public String f51c = AdSdk.getContext().getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + "/hrdownload";

    /* JADX INFO: renamed from: cn.haorui.sdk.core.download.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C0484a f52a = new C0484a();
    }

    /* JADX INFO: renamed from: b */
    public static C0484a m19b() {
        return a.f52a;
    }

    /* JADX INFO: renamed from: a */
    public String m20a() {
        return this.f51c;
    }

    /* JADX INFO: renamed from: a */
    public void m21a(String str) {
        RunnableC0487d runnableC0487d = this.f49a.get(str);
        if (runnableC0487d != null) {
            ThreadPoolExecutor threadPoolExecutor = runnableC0487d.f69c;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.remove(runnableC0487d);
            }
            Map<Object, InterfaceC0491h> map = runnableC0487d.f71e;
            if (map != null) {
                map.remove(runnableC0487d.f68b);
            }
            try {
                File file = new File(runnableC0487d.f67a.f58f);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f49a.remove(str);
    }

    /* JADX INFO: renamed from: b */
    public RunnableC0487d m22b(String str) {
        return this.f49a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public C0490g m23c() {
        return this.f50b;
    }
}
