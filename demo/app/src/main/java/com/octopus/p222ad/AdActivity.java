package com.octopus.p222ad;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Display;
import android.view.Menu;
import android.view.WindowManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.octopus.p222ad.internal.network.ServerResponse;
import com.octopus.p222ad.internal.p225a.C3074a;
import com.octopus.p222ad.internal.p225a.C3075b;
import com.octopus.p222ad.internal.p225a.C3076c;
import com.octopus.p222ad.internal.utilities.DeviceInfo;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.WebviewUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class AdActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public static boolean f16642a;

    /* JADX INFO: renamed from: b */
    public static Class f16643b = AdActivity.class;

    /* JADX INFO: renamed from: c */
    private InterfaceC3053a f16644c;

    /* JADX INFO: renamed from: com.octopus.ad.AdActivity$1 */
    public class RunnableC30511 implements Runnable {
        public RunnableC30511() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (i != 3) {
                i++;
                if (AdActivity.f16642a) {
                    AdActivity.f16642a = false;
                    AdActivity.this.finish();
                    i = 3;
                }
                SystemClock.sleep(500L);
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.AdActivity$2 */
    public static /* synthetic */ class C30522 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16646a;

        static {
            int[] iArr = new int[EnumC3054b.values().length];
            f16646a = iArr;
            try {
                iArr[EnumC3054b.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16646a[EnumC3054b.landscape.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16646a[EnumC3054b.portrait.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.AdActivity$a */
    public interface InterfaceC3053a {
        /* JADX INFO: renamed from: a */
        void mo13817a();

        /* JADX INFO: renamed from: b */
        void mo13818b();

        /* JADX INFO: renamed from: c */
        void mo13819c();

        /* JADX INFO: renamed from: d */
        void mo13820d();

        /* JADX INFO: renamed from: e */
        void mo13821e();

        /* JADX INFO: renamed from: f */
        WebView mo13822f();
    }

    /* JADX INFO: renamed from: com.octopus.ad.AdActivity$b */
    public enum EnumC3054b {
        portrait,
        landscape,
        none
    }

    /* JADX INFO: renamed from: a */
    public static Class m13811a() {
        return f16643b;
    }

    /* JADX INFO: renamed from: a */
    public static void m13812a(Activity activity) {
        m13816b(activity, activity.getResources().getConfiguration().orientation);
    }

    /* JADX INFO: renamed from: a */
    public static void m13813a(Activity activity, int i) {
        m13816b(activity, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m13814a(Activity activity, EnumC3054b enumC3054b) {
        int i = activity.getResources().getConfiguration().orientation;
        int i2 = C30522.f16646a[enumC3054b.ordinal()];
        if (i2 == 1) {
            activity.setRequestedOrientation(-1);
            return;
        }
        if (i2 == 2) {
            i = 2;
        } else if (i2 == 3) {
            i = 1;
        }
        m13816b(activity, i);
    }

    /* JADX INFO: renamed from: b */
    public static void m13815b(Activity activity) {
        activity.setRequestedOrientation(-1);
    }

    @TargetApi(9)
    /* JADX INFO: renamed from: b */
    private static void m13816b(Activity activity, int i) {
        String str = DeviceInfo.getInstance().model;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        boolean z = DeviceInfo.getInstance().brand.toUpperCase(locale).equals("AMAZON") && (upperCase.equals("KFTT") || upperCase.equals("KFJWI") || upperCase.equals("KFJWA"));
        Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
        if (i == 1) {
            int rotation = defaultDisplay.getRotation();
            if (rotation == 1 || rotation == 2) {
                activity.setRequestedOrientation(9);
                return;
            } else {
                activity.setRequestedOrientation(1);
                return;
            }
        }
        if (i == 2) {
            int rotation2 = defaultDisplay.getRotation();
            if (z ? rotation2 == 0 || rotation2 == 1 : !(rotation2 == 0 || rotation2 == 1)) {
                activity.setRequestedOrientation(8);
            } else {
                activity.setRequestedOrientation(0);
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        InterfaceC3053a interfaceC3053a = this.f16644c;
        if (interfaceC3053a != null) {
            interfaceC3053a.mo13818b();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        InterfaceC3053a c3076c;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("ACTIVITY_TYPE");
        if (TextUtils.isEmpty(stringExtra)) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.adactivity_no_type));
            finish();
        } else {
            if ("INTERSTITIAL".equals(stringExtra)) {
                c3076c = new C3075b(this);
            } else if ("BROWSER".equals(stringExtra)) {
                c3076c = new C3074a(this);
            } else if (ServerResponse.EXTRAS_KEY_MRAID.equals(stringExtra)) {
                c3076c = new C3076c(this);
            } else if ("DOWNLOADBROWSER".equals(stringExtra)) {
                C3074a c3074a = new C3074a(this);
                this.f16644c = c3074a;
                c3074a.mo13817a();
                new Thread(new Runnable() { // from class: com.octopus.ad.AdActivity.1
                    public RunnableC30511() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        int i = 0;
                        while (i != 3) {
                            i++;
                            if (AdActivity.f16642a) {
                                AdActivity.f16642a = false;
                                AdActivity.this.finish();
                                i = 3;
                            }
                            SystemClock.sleep(500L);
                        }
                    }
                }).start();
            }
            this.f16644c = c3076c;
            c3076c.mo13817a();
        }
        CookieSyncManager.createInstance(this);
        CookieSyncManager cookieSyncManager = CookieSyncManager.getInstance();
        if (cookieSyncManager != null) {
            cookieSyncManager.startSync();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        InterfaceC3053a interfaceC3053a = this.f16644c;
        if (interfaceC3053a != null) {
            interfaceC3053a.mo13819c();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        InterfaceC3053a interfaceC3053a = this.f16644c;
        if (interfaceC3053a != null) {
            WebviewUtil.onPause(interfaceC3053a.mo13822f());
        }
        CookieSyncManager cookieSyncManager = CookieSyncManager.getInstance();
        if (cookieSyncManager != null) {
            cookieSyncManager.stopSync();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        InterfaceC3053a interfaceC3053a = this.f16644c;
        if (interfaceC3053a != null) {
            WebviewUtil.onResume(interfaceC3053a.mo13822f());
        }
        CookieSyncManager cookieSyncManager = CookieSyncManager.getInstance();
        if (cookieSyncManager != null) {
            cookieSyncManager.startSync();
        }
        super.onResume();
    }
}
