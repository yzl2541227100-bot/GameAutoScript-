package mobi.oneway.export.p280e;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.webkit.WebView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.basead.p010a.C0732e;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.anythink.expressad.exoplayer.C1575f;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.expressad.videocommon.p181e.C2338b;
import com.didi.virtualapk.PluginManager;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import mobi.oneway.export.C3580a;
import mobi.oneway.export.C3585b;
import mobi.oneway.export.enums.PluginErrorType;
import mobi.oneway.export.p274a.C3581a;
import mobi.oneway.export.p274a.C3582b;
import mobi.oneway.export.p275b.C3586a;
import mobi.oneway.export.p279d.C3608f;
import mobi.oneway.export.p281f.C3623c;
import mobi.oneway.export.p281f.C3624d;
import mobi.oneway.export.p281f.C3626f;
import mobi.oneway.export.p281f.C3627g;
import mobi.oneway.export.p283g.C3634f;
import mobi.oneway.export.p283g.C3635g;
import mobi.oneway.export.p283g.C3636h;
import mobi.oneway.export.p283g.C3642n;
import mobi.oneway.export.p283g.C3644p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.e.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3609a extends Thread {

    /* JADX INFO: renamed from: a */
    private String f19705a;

    /* JADX INFO: renamed from: b */
    private PluginManager f19706b;

    /* JADX INFO: renamed from: c */
    private C3627g f19707c;

    /* JADX INFO: renamed from: g */
    private Timer f19711g;

    /* JADX INFO: renamed from: h */
    private TimerTask f19712h;

    /* JADX INFO: renamed from: d */
    private boolean f19708d = false;

    /* JADX INFO: renamed from: f */
    private final long f19710f = C1575f.f8394a;

    /* JADX INFO: renamed from: e */
    private CountDownLatch f19709e = new CountDownLatch(1);

    /* JADX INFO: renamed from: mobi.oneway.export.e.a$1 */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        try {
                            int iMyPid = Process.myPid();
                            Context contextM16650a = C3582b.m16650a();
                            String str = contextM16650a.getPackageName() + iMyPid;
                            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) contextM16650a.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses()) {
                                if (runningAppProcessInfo.pid == iMyPid) {
                                    str = runningAppProcessInfo.processName;
                                }
                            }
                            WebView.setDataDirectorySuffix(str);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    new WebView(C3582b.m16650a());
                    if (C3609a.this.f19709e == null) {
                        return;
                    }
                } catch (Throwable th) {
                    if (C3609a.this.f19709e != null) {
                        C3609a.this.f19709e.countDown();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (C3609a.this.f19709e == null) {
                    return;
                }
            }
            C3609a.this.f19709e.countDown();
        }
    }

    /* JADX INFO: renamed from: mobi.oneway.export.e.a$2 */
    public class AnonymousClass2 extends TimerTask {
        public AnonymousClass2() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3610b.m16807a().m16813c();
        }
    }

    public C3609a(String str) {
        this.f19705a = str;
        try {
            m16804c();
            this.f19706b = PluginManager.getInstance(C3582b.m16650a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private String m16795a(String str) {
        return C3582b.m16650a().getDir("plugin", 0).getPath() + File.separator + str;
    }

    /* JADX INFO: renamed from: a */
    private String m16796a(JSONArray jSONArray, int i) {
        if (jSONArray == null) {
            return "";
        }
        try {
            if (jSONArray.length() <= 0) {
                return "";
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (i == jSONObject.optInt("adp")) {
                    return jSONObject.getString(C2338b.f14609u);
                }
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private C3627g m16798a() {
        m16805d();
        if (this.f19707c == null && !this.f19708d) {
            this.f19708d = true;
            ClassLoader classLoaderM16665a = C3585b.m16665a();
            if (classLoaderM16665a != null) {
                try {
                    Class<?> clsLoadClass = classLoaderM16665a.loadClass(C3581a.f19611l);
                    C3627g c3627g = new C3627g();
                    this.f19707c = c3627g;
                    c3627g.m16894a(clsLoadClass);
                    this.f19707c.m16892a(1);
                    this.f19707c.m16895a(classLoaderM16665a);
                    this.f19707c.m16898b(C3582b.m16654b());
                } catch (Exception e) {
                    C3611c.m16816a(PluginErrorType.shell_error_reflectClass, C3635g.m16943a((Throwable) e));
                }
            }
        }
        m16806e();
        return this.f19707c;
    }

    /* JADX INFO: renamed from: a */
    private C3627g m16799a(JSONObject jSONObject, JSONArray jSONArray) {
        return jSONObject.optInt("adp") == 1 ? m16798a() : m16802b(jSONObject, jSONArray);
    }

    /* JADX INFO: renamed from: a */
    private void m16800a(JSONArray jSONArray) {
        C3624d.m16879a(jSONArray.toString());
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                C3624d.m16880a(new C3623c(jSONObjectOptJSONObject));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m16801a(JSONObject jSONObject) {
        C3586a c3586aM16671a = C3586a.m16671a();
        c3586aM16671a.m16680a(jSONObject.optBoolean("cacheAd"));
        c3586aM16671a.m16677a(jSONObject.optInt("reqExpireTime"));
    }

    /* JADX INFO: renamed from: b */
    private C3627g m16802b(JSONObject jSONObject, JSONArray jSONArray) {
        m16805d();
        int iOptInt = jSONObject.optInt("adp");
        String strOptString = jSONObject.optString("apkpkg");
        String strOptString2 = jSONObject.optString("verison");
        String strOptString3 = jSONObject.optString("adcl");
        try {
            this.f19706b.loadPlugin(new File(m16795a(iOptInt + AbstractC1067a.f2406g)));
            ClassLoader classLoader = this.f19706b.getLoadedPlugin(strOptString).getClassLoader();
            Class<?> clsLoadClass = classLoader.loadClass(strOptString3);
            String strM16796a = m16796a(jSONArray, iOptInt);
            C3627g c3627g = new C3627g();
            c3627g.m16895a(classLoader);
            c3627g.m16892a(iOptInt);
            c3627g.m16894a(clsLoadClass);
            c3627g.m16896a(strOptString2);
            c3627g.m16893a(System.currentTimeMillis());
            c3627g.m16898b(strM16796a);
            return c3627g;
        } catch (Exception e) {
            e.printStackTrace();
            m16806e();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m16803b() {
        C3627g c3627gM16798a = m16798a();
        if (c3627gM16798a != null) {
            C3624d.m16881a(c3627gM16798a);
        }
        C3610b.m16807a().m16813c();
    }

    /* JADX INFO: renamed from: c */
    private void m16804c() {
        C3610b.m16807a().m16814c(new Runnable() { // from class: mobi.oneway.export.e.a.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                int iMyPid = Process.myPid();
                                Context contextM16650a = C3582b.m16650a();
                                String str = contextM16650a.getPackageName() + iMyPid;
                                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) contextM16650a.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses()) {
                                    if (runningAppProcessInfo.pid == iMyPid) {
                                        str = runningAppProcessInfo.processName;
                                    }
                                }
                                WebView.setDataDirectorySuffix(str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        new WebView(C3582b.m16650a());
                        if (C3609a.this.f19709e == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        if (C3609a.this.f19709e != null) {
                            C3609a.this.f19709e.countDown();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    if (C3609a.this.f19709e == null) {
                        return;
                    }
                }
                C3609a.this.f19709e.countDown();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    private void m16805d() {
        m16806e();
        this.f19712h = new TimerTask() { // from class: mobi.oneway.export.e.a.2
            public AnonymousClass2() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                C3610b.m16807a().m16813c();
            }
        };
        Timer timer = new Timer();
        this.f19711g = timer;
        timer.schedule(this.f19712h, C1575f.f8394a);
    }

    /* JADX INFO: renamed from: e */
    private void m16806e() {
        TimerTask timerTask = this.f19712h;
        if (timerTask != null) {
            timerTask.cancel();
            this.f19712h = null;
        }
        Timer timer = this.f19711g;
        if (timer != null) {
            timer.cancel();
            this.f19711g = null;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        super.run();
        try {
            CountDownLatch countDownLatch = this.f19709e;
            if (countDownLatch != null) {
                countDownLatch.await(C1575f.f8394a, TimeUnit.MILLISECONDS);
            }
            JSONObject jSONObjectM16791m = new C3608f(C3581a.f19605f, C3581a.f19600a).m16767a("publishId", (Object) this.f19705a).m16767a("shellVersion", (Object) C3580a.f19599f).m16767a("dmd", (Object) Build.MODEL).m16767a("dmk", (Object) Build.BRAND).m16767a("ip", (Object) C3642n.m16999a(C3582b.m16650a())).m16767a("osv", (Object) Build.VERSION.RELEASE).m16767a("osl", Integer.valueOf(Build.VERSION.SDK_INT)).m16767a("ts", Long.valueOf(System.currentTimeMillis())).m16767a("osi", (Object) C3626f.m16890a()).m16767a("pkg", (Object) C3582b.m16650a().getPackageName()).m16767a("did", (Object) C3634f.m16929a()).m16767a("aid", (Object) C3634f.m16935e()).m16791m();
            boolean zOptBoolean = jSONObjectM16791m.optBoolean("upgrade");
            boolean zOptBoolean2 = jSONObjectM16791m.optBoolean(C0732e.f588a);
            String strOptString = jSONObjectM16791m.optString("appToken");
            String strOptString2 = jSONObjectM16791m.optString(C1485b.f7040bH);
            JSONArray jSONArrayOptJSONArray = jSONObjectM16791m.optJSONArray("plugins");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectM16791m.optJSONArray("appIdConfigs");
            JSONArray jSONArrayOptJSONArray3 = jSONObjectM16791m.optJSONArray("placements");
            C3582b.m16655b(strOptString);
            C3582b.m16653a(zOptBoolean2);
            C3582b.m16656c(strOptString2);
            if (zOptBoolean && jSONArrayOptJSONArray.length() != 0) {
                m16800a(jSONArrayOptJSONArray3);
                m16801a(jSONObjectM16791m);
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString3 = jSONObject.optString("hash");
                    int iOptInt = jSONObject.optInt("adp");
                    String strOptString4 = jSONObject.optString(C1781c.f10246am);
                    File file = new File(m16795a(iOptInt == 1 ? C3581a.f19609j : iOptInt + AbstractC1067a.f2406g));
                    String upperCase = C3636h.m16965e(file) ? C3644p.m17002a(file).toUpperCase() : null;
                    if (upperCase == null || !upperCase.equalsIgnoreCase(strOptString3)) {
                        byte[] bArrM16790l = new C3608f(strOptString4).m16762a(2000).m16790l();
                        if (C3644p.m17004a(bArrM16790l).toUpperCase().equalsIgnoreCase(strOptString3)) {
                            C3636h.m16950a(file, bArrM16790l);
                        }
                    }
                    C3627g c3627gM16799a = m16799a(jSONObject, jSONArrayOptJSONArray2);
                    if (c3627gM16799a != null) {
                        C3624d.m16881a(c3627gM16799a);
                    }
                }
                C3610b.m16807a().m16813c();
                return;
            }
            m16803b();
        } catch (IOException e) {
            e.printStackTrace();
            m16803b();
        } catch (JSONException e2) {
            e2.printStackTrace();
            m16803b();
        } catch (Exception e3) {
            e3.printStackTrace();
            m16803b();
        }
    }
}
