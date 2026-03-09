package com.anythink.expressad.p073a.p074a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.expressad.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1406a {

    /* JADX INFO: renamed from: a */
    public static String f6261a = "mtg_retry_report=1";

    /* JADX INFO: renamed from: b */
    public static int f6262b = 10000;

    /* JADX INFO: renamed from: c */
    public static final int f6263c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f6264d = 2;

    /* JADX INFO: renamed from: e */
    public static int f6265e = 3;

    /* JADX INFO: renamed from: f */
    public static int f6266f = 50;

    /* JADX INFO: renamed from: g */
    public static int f6267g = 600000;

    /* JADX INFO: renamed from: h */
    public static int f6268h = 0;

    /* JADX INFO: renamed from: i */
    public static int f6269i = 1;

    /* JADX INFO: renamed from: j */
    public static int f6270j = 2;

    /* JADX INFO: renamed from: k */
    public static int f6271k = 3;

    /* JADX INFO: renamed from: l */
    public static int f6272l = 4;

    /* JADX INFO: renamed from: m */
    public static int f6273m = 5;

    /* JADX INFO: renamed from: n */
    private static String f6274n = "RetryReportControl";

    /* JADX INFO: renamed from: q */
    private static int f6275q;

    /* JADX INFO: renamed from: r */
    private static int f6276r;

    /* JADX INFO: renamed from: o */
    private ConcurrentHashMap<String, C1407b> f6277o;

    /* JADX INFO: renamed from: p */
    private C1408c f6278p;

    /* JADX INFO: renamed from: s */
    private BroadcastReceiver f6279s;

    /* JADX INFO: renamed from: t */
    private final Handler f6280t;

    /* JADX INFO: renamed from: com.anythink.expressad.a.a.a$1 */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                C1406a.this.f6280t.sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.a.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C1406a f6282a = new C1406a((byte) 0);

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.a.a.a$b */
    public static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C1406a.m5215a(C1406a.m5214a());
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    C1406a.m5214a().m5218a((String) obj, C1407b.f6283a);
                }
            }
        }
    }

    private C1406a() {
        this.f6277o = new ConcurrentHashMap<>();
        this.f6278p = new C1408c(f6266f);
        this.f6280t = new b(Looper.getMainLooper());
        C1486b.m6002a();
        C1773a.m8548c().m8558f();
        C1483a c1483aM6007b = C1486b.m6007b();
        f6265e = c1483aM6007b.m5947U();
        f6262b = c1483aM6007b.m5949W() * 1000;
        f6267g = c1483aM6007b.m5948V() * 1000;
        f6275q = c1483aM6007b.m5946T();
        f6276r = c1483aM6007b.m5945S();
        try {
            if (this.f6279s == null) {
                this.f6279s = new AnonymousClass1();
                Context contextM2148f = C1175n.m2059a().m2148f();
                if (contextM2148f != null) {
                    contextM2148f.registerReceiver(this.f6279s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ C1406a(byte b2) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C1406a m5214a() {
        return a.f6282a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5215a(C1406a c1406a) {
        C1408c c1408c = c1406a.f6278p;
        if (c1408c != null) {
            Iterator<String> it = c1408c.mo5248a().iterator();
            while (it.hasNext()) {
                c1406a.m5218a(it.next(), C1407b.f6284b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5217a(String str) {
        Message messageObtainMessage = this.f6280t.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.f6280t.sendMessageDelayed(messageObtainMessage, f6262b);
    }

    /* JADX INFO: renamed from: a */
    public void m5218a(String str, int i) {
        StringBuilder sb;
        String str2;
        C1408c c1408c = this.f6278p;
        if (c1408c != null) {
            C1407b c1407bMo5251b = c1408c.mo5251b(str);
            this.f6278p.mo5249a(str);
            if (c1407bMo5251b == null) {
                C1407b c1407b = this.f6277o.get(str);
                if (c1407b == null || System.currentTimeMillis() > c1407b.m5245h() + ((long) f6267g) || c1407b.m5244g() >= f6265e || i == C1407b.f6284b) {
                    return;
                }
                m5217a(str);
                return;
            }
            if (System.currentTimeMillis() > c1407bMo5251b.m5245h() + ((long) f6267g)) {
                if (i != C1407b.f6284b) {
                    return;
                } else {
                    return;
                }
            }
            c1407bMo5251b.m5231a(i);
            this.f6277o.put(str, c1407bMo5251b);
            if (C1890x.m9871b(str) == 0) {
                sb = new StringBuilder();
                sb.append(str);
                str2 = "?";
            } else {
                sb = new StringBuilder();
                sb.append(str);
                str2 = "&";
            }
            sb.append(str2);
            sb.append(f6261a);
            String string = sb.toString();
            C1405a.m5186a(C1175n.m2059a().m2148f(), c1407bMo5251b.m5243f(), c1407bMo5251b.m5242e(), string, c1407bMo5251b.m5235a(), c1407bMo5251b.m5239b(), c1407bMo5251b.m5241d());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5219a(String str, C1407b c1407b) {
        if (this.f6278p == null) {
            this.f6278p = new C1408c(f6266f);
        }
        this.f6278p.mo5250a(str, c1407b);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m5220a(int i) {
        return i == f6272l || i == f6271k;
    }

    /* JADX INFO: renamed from: b */
    private void m5222b() {
        C1408c c1408c = this.f6278p;
        if (c1408c != null) {
            Iterator<String> it = c1408c.mo5248a().iterator();
            while (it.hasNext()) {
                m5218a(it.next(), C1407b.f6284b);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m5223b(int i) {
        return i == f6269i || i == f6270j;
    }

    /* JADX INFO: renamed from: c */
    private void m5224c() {
        try {
            if (this.f6279s == null) {
                this.f6279s = new AnonymousClass1();
                Context contextM2148f = C1175n.m2059a().m2148f();
                if (contextM2148f != null) {
                    contextM2148f.registerReceiver(this.f6279s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m5225c(int i) {
        return m5220a(i) || m5223b(i) || i == f6273m;
    }

    /* JADX INFO: renamed from: d */
    private void m5226d() {
        Context contextM2148f;
        if (this.f6279s == null || (contextM2148f = C1175n.m2059a().m2148f()) == null) {
            return;
        }
        contextM2148f.unregisterReceiver(this.f6279s);
    }

    /* JADX INFO: renamed from: a */
    public final void m5227a(String str, String str2, C1781c c1781c, String str3, boolean z, boolean z3, int i) {
        if (!(m5220a(i) || m5223b(i) || i == f6273m) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f6261a, "").replace("&" + f6261a, "");
        if (this.f6277o == null) {
            this.f6277o = new ConcurrentHashMap<>();
        }
        C1407b c1407bRemove = this.f6277o.remove(strReplace);
        if (c1407bRemove == null) {
            c1407bRemove = new C1407b(str, str2);
            c1407bRemove.m5236b(i);
            c1407bRemove.m5234a(z);
            c1407bRemove.m5238b(z3);
            c1407bRemove.m5232a(c1781c);
            c1407bRemove.m5233a(str3);
        } else if (c1407bRemove.m5240c() != C1407b.f6284b) {
            c1407bRemove.m5237b(str2);
        }
        if ((m5220a(i) && f6275q != 0) || (m5223b(i) && f6276r != 0) || i == f6273m) {
            if (System.currentTimeMillis() >= c1407bRemove.m5245h() + ((long) f6267g)) {
                c1407bRemove.m5240c();
                int i2 = C1407b.f6283a;
                return;
            }
            if (this.f6278p == null) {
                this.f6278p = new C1408c(f6266f);
            }
            this.f6278p.mo5250a(strReplace, c1407bRemove);
            if (c1407bRemove.m5240c() != C1407b.f6283a || c1407bRemove.m5244g() > f6265e) {
                return;
            }
            m5217a(strReplace);
        }
    }
}
