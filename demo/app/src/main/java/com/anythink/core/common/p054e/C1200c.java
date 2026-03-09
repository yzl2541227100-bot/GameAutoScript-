package com.anythink.core.common.p054e;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATCountryCode;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p058h.C1280h;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.p072d.C1392b;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.anythink.core.common.e.c */
/* JADX INFO: loaded from: classes.dex */
public class C1200c {

    /* JADX INFO: renamed from: a */
    private static final String f3593a = "DomainManager";

    /* JADX INFO: renamed from: b */
    private static final String f3594b = "anythink_sdk";

    /* JADX INFO: renamed from: c */
    private static final String f3595c = "cdn_request_time_key";

    /* JADX INFO: renamed from: d */
    private static final String f3596d = "cur_using_domain_key";

    /* JADX INFO: renamed from: e */
    private static final String f3597e = "ru";

    /* JADX INFO: renamed from: f */
    private static final String f3598f = "api.";

    /* JADX INFO: renamed from: g */
    private static final int f3599g = 24;

    /* JADX INFO: renamed from: h */
    private static final String f3600h = "api.toponadss.com";

    /* JADX INFO: renamed from: i */
    private static final String f3601i = C1340d.m4030b("YXBpLmdldGZhc3Rpbi5jb20=");

    /* JADX INFO: renamed from: r */
    private static volatile C1200c f3602r;

    /* JADX INFO: renamed from: l */
    private volatile boolean f3605l;

    /* JADX INFO: renamed from: m */
    private volatile boolean f3606m;

    /* JADX INFO: renamed from: n */
    private volatile long f3607n;

    /* JADX INFO: renamed from: q */
    private volatile String f3610q;

    /* JADX INFO: renamed from: j */
    private final Object f3603j = new Object();

    /* JADX INFO: renamed from: k */
    private final List<String> f3604k = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: o */
    private volatile String f3608o = "";

    /* JADX INFO: renamed from: p */
    private volatile String f3609p = "";

    /* JADX INFO: renamed from: com.anythink.core.common.e.c$1 */
    public class AnonymousClass1 implements InterfaceC1283k {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3611a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3612b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f3613c;

        public AnonymousClass1(Context context, String str, String str2) {
            context = context;
            str = str;
            str = str2;
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadCanceled(int i) {
            C1200c.m2325b(C1200c.this);
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadError(int i, String str, AdError adError) {
            C1200c c1200c = C1200c.this;
            c1200c.m2321a(c1200c.f3604k, "", str, str);
            C1200c.m2325b(C1200c.this);
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadFinish(int i, Object obj) {
            C1200c.m2316a(C1200c.this, context);
            if (obj != null) {
                String str = C1200c.f3598f + obj.toString();
                C1200c c1200c = C1200c.this;
                c1200c.m2321a(c1200c.f3604k, str, str, str);
            } else {
                C1200c c1200c2 = C1200c.this;
                c1200c2.m2321a(c1200c2.f3604k, "", str, str);
            }
            C1200c.m2325b(C1200c.this);
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadStart(int i) {
        }
    }

    private C1200c() {
        String[] strArr;
        this.f3610q = "";
        if (ATSDK.isCnSDK() || (strArr = C1199b.f3592a) == null || strArr.length <= 0) {
            return;
        }
        List listAsList = Arrays.asList(strArr);
        String country = Locale.getDefault().getCountry();
        if (listAsList.contains(country)) {
            this.f3610q = country;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1200c m2314a() {
        if (f3602r == null) {
            synchronized (C1200c.class) {
                f3602r = new C1200c();
            }
        }
        return f3602r;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2316a(C1200c c1200c, Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1200c.f3607n = jCurrentTimeMillis;
        C1355s.m4236a(context, "anythink_sdk", f3595c, jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: a */
    private void m2318a(String str, String str2) {
        C1322e.m3935c(this.f3609p, str, str2, String.valueOf(m2326c(C1175n.m2059a().m2148f())));
    }

    /* JADX INFO: renamed from: a */
    private void m2319a(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f3609p = list.get(0);
        m2327c(this.f3609p);
    }

    /* JADX INFO: renamed from: a */
    private void m2320a(List<String> list, String str, String str2) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            m2328c(list, str);
        }
        String str3 = list.get(0);
        if (str3.equals(str)) {
            return;
        }
        m2327c(str3);
        m2331e();
        m2318a(str3, str2);
        C1355s.m4237a(C1175n.m2059a().m2148f(), "anythink_sdk", f3596d, str3);
    }

    /* JADX INFO: renamed from: a */
    public void m2321a(List<String> list, String str, String str2, String str3) {
        boolean zM2322a = m2322a(list, str2);
        m2329d("handleSwitchDomain() >>> isCanSwitch = ".concat(String.valueOf(zM2322a)));
        if (zM2322a) {
            if (TextUtils.isEmpty(str)) {
                m2320a(list, str2, str3);
                return;
            }
            if (str.equals(str2)) {
                m2328c(list, str2);
            } else {
                m2324b(list, str);
            }
            m2320a(list, str2, str3);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2322a(List<String> list, String str) {
        if (TextUtils.isEmpty(str) || list.size() <= 0) {
            return false;
        }
        String str2 = list.get(0);
        m2329d("isCanSwitchDomain() >>> firstDomain = " + str2 + " failedDomain = " + str);
        return str.equals(str2);
    }

    /* JADX INFO: renamed from: b */
    private void m2323b(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f3607n = jCurrentTimeMillis;
        C1355s.m4236a(context, "anythink_sdk", f3595c, jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: b */
    private static void m2324b(List<String> list, String str) {
        if (TextUtils.isEmpty(str) || list == null) {
            return;
        }
        int iIndexOf = list.indexOf(str);
        if (iIndexOf > 0) {
            list.remove(str);
            list.add(0, str);
        } else if (iIndexOf < 0) {
            list.add(0, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m2325b(C1200c c1200c) {
        c1200c.f3606m = false;
        return false;
    }

    /* JADX INFO: renamed from: c */
    private Long m2326c(Context context) {
        long jLongValue = this.f3607n;
        if (jLongValue == 0) {
            jLongValue = C1355s.m4232a(context, "anythink_sdk", f3595c, (Long) 0L).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    /* JADX INFO: renamed from: c */
    private void m2327c(String str) {
        this.f3608o = str;
        m2329d("setCurrentDomain() >>> currentDomain = ".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: c */
    private static void m2328c(List<String> list, String str) {
        if (TextUtils.isEmpty(str) || list == null) {
            return;
        }
        int iIndexOf = list.indexOf(str);
        if (iIndexOf >= 0 && iIndexOf < list.size() - 1) {
            list.remove(str);
            list.add(str);
        } else if (iIndexOf < 0) {
            list.add(str);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m2329d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" threadId = ");
        sb.append(Thread.currentThread().getId());
    }

    /* JADX INFO: renamed from: d */
    private static boolean m2330d() {
        String language;
        try {
            language = Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            language = "";
        }
        return language.equalsIgnoreCase("ru");
    }

    /* JADX INFO: renamed from: e */
    private static void m2331e() {
        C1392b.m4845a(C1175n.m2059a().m2148f()).m4866b();
    }

    /* JADX INFO: renamed from: f */
    private static void m2332f() {
    }

    /* JADX INFO: renamed from: a */
    public final String m2333a(String str) {
        if (ATSDK.isCnSDK()) {
            return str;
        }
        try {
            String str2 = this.f3608o;
            return TextUtils.isEmpty(str2) ? str : str.replace(new URL(str).getHost(), str2);
        } catch (Exception e) {
            m2329d("replaceUrlDomain() >> exception:" + e.getMessage());
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0053  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2334a(android.content.Context r7) {
        /*
            r6 = this;
            boolean r0 = com.anythink.core.api.ATSDK.isCnSDK()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 == 0) goto Lf
            android.content.Context r7 = r7.getApplicationContext()
        Lf:
            boolean r0 = r6.f3605l
            if (r0 == 0) goto L14
            return
        L14:
            r0 = 1
            r6.f3605l = r0
            java.util.List<java.lang.String> r0 = r6.f3604k
            boolean r1 = m2330d()
            java.lang.String r2 = "api.anythinktech.com"
            if (r1 != 0) goto L24
            r0.add(r2)
        L24:
            java.lang.String r1 = "api.toponadss.com"
            r0.add(r1)
            java.lang.String r3 = "anythink_sdk"
            java.lang.String r4 = "cur_using_domain_key"
            java.lang.String r5 = ""
            java.lang.String r7 = com.anythink.core.common.p066o.C1355s.m4239b(r7, r3, r4, r5)
            boolean r3 = r6.m2336b()
            if (r3 == 0) goto L53
            r0.clear()
            java.lang.String r3 = com.anythink.core.common.p054e.C1198a.f3575a
            r0.add(r3)
            java.lang.String r3 = com.anythink.core.common.p054e.C1200c.f3601i
            r0.add(r3)
            boolean r2 = android.text.TextUtils.equals(r7, r2)
            if (r2 != 0) goto L54
            boolean r1 = android.text.TextUtils.equals(r7, r1)
            if (r1 == 0) goto L53
            goto L54
        L53:
            r5 = r7
        L54:
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "initDomain() >>> curUseDomain = "
            java.lang.String r7 = r1.concat(r7)
            m2329d(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L6e
            m2324b(r0, r5)
            r6.m2319a(r0)
            return
        L6e:
            r6.m2319a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p054e.C1200c.m2334a(android.content.Context):void");
    }

    /* JADX INFO: renamed from: b */
    public final void m2335b(String str) {
        if (ATSDK.isCnSDK()) {
            return;
        }
        m2329d("tryGetDomainFromCdn() >>> start isTrying = " + this.f3606m + " url = " + str);
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (TextUtils.isEmpty(str) || this.f3606m || !C1345i.m4159a(contextM2148f)) {
            return;
        }
        String host = "";
        try {
            host = new URL(str).getHost();
        } catch (Exception e) {
            m2329d("tryGetDomainFromCdn() >>> " + e.getMessage());
        }
        synchronized (this.f3603j) {
            if (this.f3606m) {
                return;
            }
            this.f3606m = true;
            this.f3607n = m2326c(contextM2148f).longValue();
            if (this.f3607n > 0) {
                long jCurrentTimeMillis = (System.currentTimeMillis() - this.f3607n) / 3600000;
                if (jCurrentTimeMillis < 24) {
                    m2329d("tryGetDomainFromCdn() >>> intervalTime = ".concat(String.valueOf(jCurrentTimeMillis)));
                    m2321a(this.f3604k, "", host, str);
                    this.f3606m = false;
                    return;
                }
            }
            new C1280h().mo3639a(0, (InterfaceC1283k) new InterfaceC1283k() { // from class: com.anythink.core.common.e.c.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f3611a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f3612b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f3613c;

                public AnonymousClass1(Context contextM2148f2, String host2, String str2) {
                    context = contextM2148f2;
                    str = host2;
                    str = str2;
                }

                @Override // com.anythink.core.common.p058h.InterfaceC1283k
                public final void onLoadCanceled(int i) {
                    C1200c.m2325b(C1200c.this);
                }

                @Override // com.anythink.core.common.p058h.InterfaceC1283k
                public final void onLoadError(int i, String str2, AdError adError) {
                    C1200c c1200c = C1200c.this;
                    c1200c.m2321a(c1200c.f3604k, "", str, str);
                    C1200c.m2325b(C1200c.this);
                }

                @Override // com.anythink.core.common.p058h.InterfaceC1283k
                public final void onLoadFinish(int i, Object obj) {
                    C1200c.m2316a(C1200c.this, context);
                    if (obj != null) {
                        String str2 = C1200c.f3598f + obj.toString();
                        C1200c c1200c = C1200c.this;
                        c1200c.m2321a(c1200c.f3604k, str2, str, str);
                    } else {
                        C1200c c1200c2 = C1200c.this;
                        c1200c2.m2321a(c1200c2.f3604k, "", str, str);
                    }
                    C1200c.m2325b(C1200c.this);
                }

                @Override // com.anythink.core.common.p058h.InterfaceC1283k
                public final void onLoadStart(int i) {
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2336b() {
        if (TextUtils.isEmpty(this.f3610q)) {
            return false;
        }
        return ATCountryCode.INDIA.equalsIgnoreCase(this.f3610q);
    }

    /* JADX INFO: renamed from: c */
    public final String m2337c() {
        return m2336b() ? C1169h.e.f3135s : C1169h.e.f3134r;
    }
}
