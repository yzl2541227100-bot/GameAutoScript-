package com.octopus.p222ad.internal.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.octopus.p222ad.internal.utilities.HTTPGet;
import com.octopus.p222ad.internal.utilities.HTTPResponse;
import com.octopus.p222ad.internal.utilities.HttpErrorCode;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.octopus.ad.internal.network.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3128c {

    /* JADX INFO: renamed from: a */
    private static C3128c f17393a;

    /* JADX INFO: renamed from: b */
    private ArrayList<a> f17394b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private Timer f17395c;

    /* JADX INFO: renamed from: d */
    private boolean f17396d;

    /* JADX INFO: renamed from: com.octopus.ad.internal.network.c$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public String f17401a;

        /* JADX INFO: renamed from: b */
        public int f17402b = 0;

        public a(String str) {
            this.f17401a = str;
        }
    }

    private C3128c(Context context) {
        if (context != null) {
            this.f17396d = context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3128c m14584a(Context context) {
        if (f17393a == null) {
            f17393a = new C3128c(context);
        }
        return f17393a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m14586a() {
        Timer timer = this.f17395c;
        if (timer != null) {
            timer.cancel();
            this.f17395c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m14588c(Context context) {
        if (this.f17395c == null) {
            final WeakReference weakReference = new WeakReference(context);
            Timer timer = new Timer();
            this.f17395c = timer;
            timer.scheduleAtFixedRate(new TimerTask() { // from class: com.octopus.ad.internal.network.c.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 != null) {
                        while (!C3128c.this.f17394b.isEmpty() && C3128c.this.m14590b(context2)) {
                            boolean z = false;
                            final a aVar = (a) C3128c.this.f17394b.remove(0);
                            if (aVar.f17402b < 3) {
                                new HTTPGet(z) { // from class: com.octopus.ad.internal.network.c.1.1
                                    @Override // com.octopus.p222ad.internal.utilities.HTTPGet
                                    public String getUrl() {
                                        return aVar.f17401a;
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // com.octopus.p222ad.internal.utilities.HTTPGet, android.os.AsyncTask
                                    public void onPostExecute(HTTPResponse hTTPResponse) {
                                        if (hTTPResponse == null || (!hTTPResponse.getSucceeded() && hTTPResponse.getErrorCode() == HttpErrorCode.CONNECTION_FAILURE)) {
                                            aVar.f17402b++;
                                            C3128c.this.f17394b.add(aVar);
                                        }
                                    }
                                }.execute(new Void[0]);
                            }
                        }
                        if (!C3128c.this.f17394b.isEmpty()) {
                            return;
                        }
                    }
                    C3128c.this.m14586a();
                }
            }, UMAmapConfig.AMAP_CACHE_WRITE_TIME, UMAmapConfig.AMAP_CACHE_WRITE_TIME);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m14589a(String str, Context context) {
        this.f17394b.add(new a(str));
        m14588c(context);
    }

    /* JADX INFO: renamed from: b */
    public boolean m14590b(Context context) {
        if (!this.f17396d) {
            return true;
        }
        if (context == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
