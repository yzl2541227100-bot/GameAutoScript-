package cn.haorui.sdk.core.exception;

import android.content.Context;
import androidx.annotation.NonNull;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.RequestUtil;
import com.umeng.commonsdk.proguard.C3471v;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p285z2.C3892fx;
import p285z2.C4225ox;
import p285z2.InterfaceC4047k3;

/* JADX INFO: renamed from: cn.haorui.sdk.core.exception.c */
/* JADX INFO: loaded from: classes.dex */
public class C0495c {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<String> f91a;

    /* JADX INFO: renamed from: b */
    public static boolean f92b;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.exception.c$a */
    public static class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a */
        public Context f93a;

        /* JADX INFO: renamed from: b */
        public boolean f94b;

        /* JADX INFO: renamed from: c */
        public Thread.UncaughtExceptionHandler f95c;

        public a(Context context, boolean z, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f93a = context;
            this.f94b = z;
            this.f95c = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
            try {
                C0495c.m34a(this.f93a, this.f94b, thread, th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f95c;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f91a = arrayList;
        f92b = true;
        arrayList.add("device_adid");
        arrayList.add("device_imsi");
        arrayList.add("device_imei");
        arrayList.add("device_geo_lon");
        arrayList.add("device_geo_lat");
        arrayList.add("device_battery_level");
        arrayList.add("device_mac");
        arrayList.add("secure");
        arrayList.add("device_apiLevel");
        arrayList.add("is_mobile");
        arrayList.add(C3471v.f18948ab);
        arrayList.add("device_oaid");
        arrayList.add("device_ssid");
        arrayList.add("device_wifi_mac");
    }

    /* JADX INFO: renamed from: a */
    public static void m34a(Context context, boolean z, Thread thread, Throwable th) {
        try {
            Map<String, String> params = RequestUtil.getParams(context, null, null, 0L, 0L);
            C3892fx.OooO00o oooO00o = new C3892fx.OooO00o();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (!f91a.contains(entry.getKey())) {
                    oooO00o.OooO00o(entry.getKey(), entry.getValue());
                }
            }
            oooO00o.OooO00o("thread", thread.getName());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            oooO00o.OooO00o("message", new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF-8")));
            oooO00o.OooO00o("env", z ? InterfaceC4047k3.o0000Ooo : "prod");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HttpUtil.doCommonRequest(new C4225ox.OooO00o().OooOOo0("https://e-zlsdk.1rtb.net/reports").OooOO0o(oooO00o.OooO0OO()).OooO0O0(), new C0494b(countDownLatch));
            countDownLatch.await(2L, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
