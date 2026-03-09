package com.anythink.expressad.videocommon.p178b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.p050a.C1159k;
import com.anythink.core.common.p050a.C1160l;
import com.anythink.core.common.res.p070a.C1375a;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p126f.p130d.C1834b;
import com.anythink.expressad.foundation.p138h.C1879m;
import com.anythink.expressad.videocommon.p180d.InterfaceC2336c;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.c */
/* JADX INFO: loaded from: classes.dex */
public class C2318c implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final String f14372a = "2000077";

    /* JADX INFO: renamed from: b */
    public static final String f14373b = "CampaignDownLoadTask";

    /* JADX INFO: renamed from: d */
    private static final long f14374d = -510642107992871538L;

    /* JADX INFO: renamed from: e */
    private static final int f14375e = 1;

    /* JADX INFO: renamed from: f */
    private static final int f14376f = 2000;

    /* JADX INFO: renamed from: h */
    private static final int f14377h = 1;

    /* JADX INFO: renamed from: i */
    private static final int f14378i = 2;

    /* JADX INFO: renamed from: j */
    private static final int f14379j = 3;

    /* JADX INFO: renamed from: k */
    private static final int f14380k = 4;

    /* JADX INFO: renamed from: l */
    private static final int f14381l = 5;

    /* JADX INFO: renamed from: m */
    private static final String f14382m = "errorMsg";

    /* JADX INFO: renamed from: p */
    private static final int f14383p = 10010;

    /* JADX INFO: renamed from: A */
    private Object f14384A;

    /* JADX INFO: renamed from: B */
    private Class f14385B;

    /* JADX INFO: renamed from: C */
    private Object f14386C;

    /* JADX INFO: renamed from: D */
    private C1781c f14387D;

    /* JADX INFO: renamed from: E */
    private String f14388E;

    /* JADX INFO: renamed from: G */
    private Context f14390G;

    /* JADX INFO: renamed from: H */
    private long f14391H;

    /* JADX INFO: renamed from: I */
    private String f14392I;

    /* JADX INFO: renamed from: L */
    private String f14395L;

    /* JADX INFO: renamed from: O */
    private long f14398O;

    /* JADX INFO: renamed from: P */
    private InterfaceC2336c f14399P;

    /* JADX INFO: renamed from: Q */
    private InterfaceC2336c f14400Q;

    /* JADX INFO: renamed from: U */
    private String f14404U;

    /* JADX INFO: renamed from: V */
    private C1834b.a f14405V;

    /* JADX INFO: renamed from: Z */
    private int f14409Z;

    /* JADX INFO: renamed from: c */
    public C2317b f14410c;

    /* JADX INFO: renamed from: o */
    private boolean f14413o;

    /* JADX INFO: renamed from: q */
    private int f14414q;

    /* JADX INFO: renamed from: r */
    private String f14415r;

    /* JADX INFO: renamed from: s */
    private String f14416s;

    /* JADX INFO: renamed from: t */
    private Runnable f14417t;

    /* JADX INFO: renamed from: w */
    private InterfaceC2321f f14420w;

    /* JADX INFO: renamed from: x */
    private ExecutorService f14421x;

    /* JADX INFO: renamed from: y */
    private InterfaceC2330o f14422y;

    /* JADX INFO: renamed from: z */
    private Class f14423z;

    /* JADX INFO: renamed from: g */
    private boolean f14411g = false;

    /* JADX INFO: renamed from: n */
    private int f14412n = 1;

    /* JADX INFO: renamed from: u */
    private volatile int f14418u = 0;

    /* JADX INFO: renamed from: v */
    private CopyOnWriteArrayList<InterfaceC2321f> f14419v = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: F */
    private boolean f14389F = false;

    /* JADX INFO: renamed from: J */
    private long f14393J = 0;

    /* JADX INFO: renamed from: K */
    private int f14394K = 0;

    /* JADX INFO: renamed from: M */
    private boolean f14396M = false;

    /* JADX INFO: renamed from: N */
    private boolean f14397N = false;

    /* JADX INFO: renamed from: R */
    private int f14401R = 100;

    /* JADX INFO: renamed from: S */
    private boolean f14402S = false;

    /* JADX INFO: renamed from: T */
    private boolean f14403T = false;

    /* JADX INFO: renamed from: W */
    private int f14406W = 1;

    /* JADX INFO: renamed from: X */
    private InterfaceC2321f f14407X = new InterfaceC2321f() { // from class: com.anythink.expressad.videocommon.b.c.1
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.videocommon.p178b.InterfaceC2321f
        /* JADX INFO: renamed from: a */
        public final void mo11838a(long j, int i) {
            if (C2318c.this.f14389F) {
                return;
            }
            C2318c.m11788a(C2318c.this, j, i);
        }
    };

    /* JADX INFO: renamed from: Y */
    private Handler f14408Y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.videocommon.b.c.2
        public AnonymousClass2(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C2318c c2318c = C2318c.this;
                C2318c.m11788a(c2318c, c2318c.f14393J, C2318c.this.f14418u);
                return;
            }
            if (i == 2) {
                if (C2318c.this.f14418u != 2) {
                    C2318c.this.f14418u = 2;
                    C2318c c2318c2 = C2318c.this;
                    C2318c.m11788a(c2318c2, c2318c2.f14393J, C2318c.this.f14418u);
                    return;
                }
                return;
            }
            if (i == 3) {
                if (C2318c.this.f14418u == 4 || C2318c.this.f14418u == 2 || C2318c.this.f14418u == 5) {
                    return;
                }
                C2318c.this.f14418u = 4;
                C2318c c2318c3 = C2318c.this;
                C2318c.m11788a(c2318c3, c2318c3.f14393J, C2318c.this.f14418u);
                return;
            }
            if (i == 4) {
                C2318c.this.f14418u = 5;
                C2318c.m11797d(C2318c.this);
                C2318c c2318c4 = C2318c.this;
                C2318c.m11788a(c2318c4, c2318c4.f14393J, C2318c.this.f14418u);
                return;
            }
            if (i == 5) {
                C2318c.this.m11827h();
            } else if (i == C2318c.f14383p && message.obj != null) {
                C2318c.m11801s();
            }
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.c$1 */
    public class AnonymousClass1 implements InterfaceC2321f {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.videocommon.p178b.InterfaceC2321f
        /* JADX INFO: renamed from: a */
        public final void mo11838a(long j, int i) {
            if (C2318c.this.f14389F) {
                return;
            }
            C2318c.m11788a(C2318c.this, j, i);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.c$2 */
    public class AnonymousClass2 extends Handler {
        public AnonymousClass2(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C2318c c2318c = C2318c.this;
                C2318c.m11788a(c2318c, c2318c.f14393J, C2318c.this.f14418u);
                return;
            }
            if (i == 2) {
                if (C2318c.this.f14418u != 2) {
                    C2318c.this.f14418u = 2;
                    C2318c c2318c2 = C2318c.this;
                    C2318c.m11788a(c2318c2, c2318c2.f14393J, C2318c.this.f14418u);
                    return;
                }
                return;
            }
            if (i == 3) {
                if (C2318c.this.f14418u == 4 || C2318c.this.f14418u == 2 || C2318c.this.f14418u == 5) {
                    return;
                }
                C2318c.this.f14418u = 4;
                C2318c c2318c3 = C2318c.this;
                C2318c.m11788a(c2318c3, c2318c3.f14393J, C2318c.this.f14418u);
                return;
            }
            if (i == 4) {
                C2318c.this.f14418u = 5;
                C2318c.m11797d(C2318c.this);
                C2318c c2318c4 = C2318c.this;
                C2318c.m11788a(c2318c4, c2318c4.f14393J, C2318c.this.f14418u);
                return;
            }
            if (i == 5) {
                C2318c.this.m11827h();
            } else if (i == C2318c.f14383p && message.obj != null) {
                C2318c.m11801s();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.c$3 */
    public class AnonymousClass3 extends C1375a.a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.core.common.res.p070a.C1375a.a
        /* JADX INFO: renamed from: a */
        public final void mo223a(String str, String str2) {
            C2318c.m11789a(C2318c.this, "errorCode:" + str + ",errorMsg:" + str2);
        }

        @Override // com.anythink.core.common.res.p070a.C1375a.a
        /* JADX INFO: renamed from: a */
        public final boolean mo224a(int i, long j, long j2) {
            if (C2318c.this.f14391H != j2) {
                C2318c.this.f14391H = j2;
            }
            C2318c c2318c = C2318c.this;
            C2318c.m11788a(c2318c, j, c2318c.f14418u);
            if (i >= C2318c.this.f14401R) {
                C2318c.this.m11826g();
                C2318c.this.m11836q();
                return true;
            }
            if (C2318c.this.f14418u != 2 && C2318c.this.f14418u != 4) {
                return false;
            }
            int i2 = C2318c.this.f14418u == 4 ? 3 : 2;
            Message messageObtain = Message.obtain();
            messageObtain.what = i2;
            C2318c.this.f14408Y.sendMessage(messageObtain);
            return true;
        }
    }

    public C2318c(Context context, C1781c c1781c, ExecutorService executorService, String str) {
        this.f14413o = false;
        if (context == null && c1781c == null) {
            return;
        }
        this.f14398O = System.currentTimeMillis();
        this.f14390G = C1773a.m8548c().m8557e();
        this.f14387D = c1781c;
        this.f14388E = str;
        this.f14421x = executorService;
        if (c1781c != null) {
            this.f14392I = c1781c.m8811S();
        }
        this.f14404U = C1879m.m9748d(this.f14392I);
        C2316a.m11773a();
        this.f14395L = C2316a.m11774a(this.f14392I);
        this.f14413o = false;
        try {
            if (!TextUtils.isEmpty(this.f14392I) && this.f14412n != 3) {
                m11806x();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: A */
    private void m11779A() {
        try {
            if (this.f14423z == null || this.f14384A == null) {
                Class<?> cls = Class.forName("com.anythink.expressad.reward.b.a");
                this.f14423z = cls;
                this.f14384A = cls.newInstance();
                this.f14423z.getMethod("insertExcludeId", String.class, C1781c.class).invoke(this.f14384A, this.f14388E, this.f14387D);
            }
            if (this.f14385B == null || this.f14386C == null) {
                Class<?> cls2 = Class.forName("com.anythink.expressad.atnative.controller.NativeController");
                this.f14385B = cls2;
                this.f14386C = cls2.newInstance();
                this.f14385B.getMethod("insertExcludeId", String.class, C1781c.class).invoke(this.f14386C, this.f14388E, this.f14387D);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: B */
    private static void m11780B() {
    }

    /* JADX INFO: renamed from: C */
    private void m11781C() {
        String str;
        Message messageObtain = Message.obtain();
        messageObtain.what = f14383p;
        if (this.f14387D == null || TextUtils.isEmpty(this.f14388E) || TextUtils.isEmpty(this.f14387D.m8818Z()) || TextUtils.isEmpty(this.f14387D.m8811S())) {
            str = "";
        } else {
            str = "key=2000077&unit_id=" + this.f14388E + "&request_id=" + this.f14387D.m8818Z() + "&request_id_notice=" + this.f14387D.m8832aa() + "&package_name=" + C1773a.m8548c().m8552b() + "&app_id=" + C1773a.m8548c().m8558f() + "&video_url=" + URLEncoder.encode(this.f14387D.m8811S()) + "&process_size=" + this.f14393J + "&file_size=" + this.f14391H + "&ready_rate=" + this.f14401R + "&cd_rate=" + this.f14414q + "&cid=" + this.f14387D.m10146aZ() + "&type=" + this.f14418u;
        }
        messageObtain.obj = str;
        this.f14408Y.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: D */
    private static void m11782D() {
        C1773a.m8548c().m8557e();
    }

    /* JADX INFO: renamed from: E */
    private String m11783E() {
        if (this.f14387D == null || TextUtils.isEmpty(this.f14388E) || TextUtils.isEmpty(this.f14387D.m8818Z()) || TextUtils.isEmpty(this.f14387D.m8811S())) {
            return "";
        }
        return "key=2000077&unit_id=" + this.f14388E + "&request_id=" + this.f14387D.m8818Z() + "&request_id_notice=" + this.f14387D.m8832aa() + "&package_name=" + C1773a.m8548c().m8552b() + "&app_id=" + C1773a.m8548c().m8558f() + "&video_url=" + URLEncoder.encode(this.f14387D.m8811S()) + "&process_size=" + this.f14393J + "&file_size=" + this.f14391H + "&ready_rate=" + this.f14401R + "&cd_rate=" + this.f14414q + "&cid=" + this.f14387D.m10146aZ() + "&type=" + this.f14418u;
    }

    /* JADX INFO: renamed from: a */
    private static double m11784a(double d, double d2, int i) throws IllegalAccessException {
        if (i >= 0) {
            return new BigDecimal(Double.toString(d)).divide(new BigDecimal(Double.toString(d2)), i, 4).doubleValue();
        }
        throw new IllegalAccessException("Accuracy cannot be less than 0");
    }

    /* JADX INFO: renamed from: a */
    private void m11787a(long j, int i) {
        this.f14393J = j;
        int i2 = this.f14401R;
        if (100 * j >= ((long) i2) * this.f14391H && !this.f14402S && i != 4) {
            if (i2 == 100 && i != 5) {
                this.f14418u = 5;
                return;
            }
            m11804v();
        }
        if (this.f14389F) {
            CopyOnWriteArrayList<InterfaceC2321f> copyOnWriteArrayList = this.f14419v;
            if (copyOnWriteArrayList != null) {
                for (InterfaceC2321f interfaceC2321f : copyOnWriteArrayList) {
                    if (interfaceC2321f != null) {
                        interfaceC2321f.mo11838a(j, i);
                    }
                }
            }
            if (this.f14420w != null) {
                if (this.f14418u == 5 || this.f14418u == 4 || this.f14418u == 2 || this.f14418u == 6) {
                    this.f14420w.mo11838a(j, i);
                    this.f14420w = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11788a(C2318c c2318c, long j, int i) {
        c2318c.f14393J = j;
        int i2 = c2318c.f14401R;
        if (100 * j >= ((long) i2) * c2318c.f14391H && !c2318c.f14402S && i != 4) {
            if (i2 == 100 && i != 5) {
                c2318c.f14418u = 5;
                return;
            }
            c2318c.m11804v();
        }
        if (c2318c.f14389F) {
            CopyOnWriteArrayList<InterfaceC2321f> copyOnWriteArrayList = c2318c.f14419v;
            if (copyOnWriteArrayList != null) {
                for (InterfaceC2321f interfaceC2321f : copyOnWriteArrayList) {
                    if (interfaceC2321f != null) {
                        interfaceC2321f.mo11838a(j, i);
                    }
                }
            }
            if (c2318c.f14420w != null) {
                if (c2318c.f14418u == 5 || c2318c.f14418u == 4 || c2318c.f14418u == 2 || c2318c.f14418u == 6) {
                    c2318c.f14420w.mo11838a(j, i);
                    c2318c.f14420w = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11789a(C2318c c2318c, String str) {
        c2318c.f14394K++;
        try {
            Context context = c2318c.f14390G;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    if (!connectivityManager.getActiveNetworkInfo().isAvailable()) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (c2318c.f14394K <= 1) {
            c2318c.f14408Y.sendEmptyMessageDelayed(5, C1659a.f9130f);
            return;
        }
        c2318c.m11779A();
        InterfaceC2336c interfaceC2336c = c2318c.f14399P;
        if (interfaceC2336c != null) {
            interfaceC2336c.mo5461a(str, c2318c.f14392I);
        }
        InterfaceC2336c interfaceC2336c2 = c2318c.f14400Q;
        if (interfaceC2336c2 != null) {
            interfaceC2336c2.mo5461a(str, c2318c.f14392I);
        }
        c2318c.f14418u = 4;
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        c2318c.f14408Y.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: b */
    private void m11792b(InterfaceC2321f interfaceC2321f) {
        CopyOnWriteArrayList<InterfaceC2321f> copyOnWriteArrayList = this.f14419v;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(interfaceC2321f);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11793b(InterfaceC2336c interfaceC2336c) {
        this.f14400Q = interfaceC2336c;
    }

    /* JADX INFO: renamed from: b */
    private void m11794b(String str) {
        InterfaceC2336c interfaceC2336c = this.f14399P;
        if (interfaceC2336c != null) {
            interfaceC2336c.mo5461a(str, this.f14392I);
        }
        InterfaceC2336c interfaceC2336c2 = this.f14400Q;
        if (interfaceC2336c2 != null) {
            interfaceC2336c2.mo5461a(str, this.f14392I);
        }
        this.f14418u = 4;
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        this.f14408Y.sendMessage(messageObtain);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c */
    private void m11796c(String str) {
        this.f14394K++;
        try {
            Context context = this.f14390G;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    if (!connectivityManager.getActiveNetworkInfo().isAvailable()) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.f14394K <= 1) {
            this.f14408Y.sendEmptyMessageDelayed(5, C1659a.f9130f);
            return;
        }
        m11779A();
        InterfaceC2336c interfaceC2336c = this.f14399P;
        if (interfaceC2336c != null) {
            interfaceC2336c.mo5461a(str, this.f14392I);
        }
        InterfaceC2336c interfaceC2336c2 = this.f14400Q;
        if (interfaceC2336c2 != null) {
            interfaceC2336c2.mo5461a(str, this.f14392I);
        }
        this.f14418u = 4;
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        this.f14408Y.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m11797d(C2318c c2318c) {
        c2318c.f14411g = false;
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m11801s() {
        C1773a.m8548c().m8557e();
    }

    /* JADX INFO: renamed from: t */
    private void m11802t() {
        try {
            if (!TextUtils.isEmpty(this.f14392I) && this.f14412n != 3) {
                m11806x();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: u */
    private void m11803u() {
        if (this.f14410c == null) {
            C2317b c2317b = new C2317b(this.f14392I, this.f14401R, this.f14406W);
            this.f14410c = c2317b;
            c2317b.m11777a(new C1375a.a() { // from class: com.anythink.expressad.videocommon.b.c.3
                public AnonymousClass3() {
                }

                @Override // com.anythink.core.common.res.p070a.C1375a.a
                /* JADX INFO: renamed from: a */
                public final void mo223a(String str, String str2) {
                    C2318c.m11789a(C2318c.this, "errorCode:" + str + ",errorMsg:" + str2);
                }

                @Override // com.anythink.core.common.res.p070a.C1375a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo224a(int i, long j, long j2) {
                    if (C2318c.this.f14391H != j2) {
                        C2318c.this.f14391H = j2;
                    }
                    C2318c c2318c = C2318c.this;
                    C2318c.m11788a(c2318c, j, c2318c.f14418u);
                    if (i >= C2318c.this.f14401R) {
                        C2318c.this.m11826g();
                        C2318c.this.m11836q();
                        return true;
                    }
                    if (C2318c.this.f14418u != 2 && C2318c.this.f14418u != 4) {
                        return false;
                    }
                    int i2 = C2318c.this.f14418u == 4 ? 3 : 2;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i2;
                    C2318c.this.f14408Y.sendMessage(messageObtain);
                    return true;
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    private void m11804v() {
        if (this.f14402S) {
            return;
        }
        this.f14402S = true;
        InterfaceC2336c interfaceC2336c = this.f14399P;
        if (interfaceC2336c != null) {
            interfaceC2336c.mo5460a(this.f14392I);
        }
        InterfaceC2336c interfaceC2336c2 = this.f14400Q;
        if (interfaceC2336c2 != null) {
            interfaceC2336c2.mo5460a(this.f14392I);
        }
    }

    /* JADX INFO: renamed from: w */
    private boolean m11805w() {
        return this.f14389F;
    }

    /* JADX INFO: renamed from: x */
    private void m11806x() {
        C1159k c1159kM2002a;
        C2316a.m11773a();
        this.f14395L = C2316a.m11774a(this.f14392I);
        File file = new File(this.f14395L);
        if (file.length() > 0) {
            this.f14393J = file.length();
        } else {
            this.f14393J = 0L;
        }
        if (this.f14391H != 0 || (c1159kM2002a = C1160l.m1996a().m2002a(this.f14392I)) == null) {
            return;
        }
        this.f14391H = c1159kM2002a.m1993d();
    }

    /* JADX INFO: renamed from: y */
    private InterfaceC2321f m11807y() {
        return this.f14407X;
    }

    /* JADX INFO: renamed from: z */
    private static void m11808z() {
    }

    /* JADX INFO: renamed from: a */
    public final String m11809a() {
        return this.f14392I;
    }

    /* JADX INFO: renamed from: a */
    public final void m11810a(int i) {
        this.f14412n = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m11811a(C1781c c1781c) {
        this.f14387D = c1781c;
    }

    /* JADX INFO: renamed from: a */
    public final void m11812a(InterfaceC2321f interfaceC2321f) {
        this.f14420w = interfaceC2321f;
    }

    /* JADX INFO: renamed from: a */
    public final void m11813a(InterfaceC2336c interfaceC2336c) {
        this.f14399P = interfaceC2336c;
    }

    /* JADX INFO: renamed from: a */
    public final void m11814a(String str) {
        this.f14415r = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m11815a(boolean z) {
        if (!z) {
            this.f14413o = false;
        }
        this.f14403T = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m11816b(int i) {
        this.f14414q = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m11817b(boolean z) {
        this.f14397N = z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11818b() {
        return this.f14403T;
    }

    /* JADX INFO: renamed from: c */
    public final long m11819c() {
        return this.f14398O;
    }

    /* JADX INFO: renamed from: c */
    public final void m11820c(int i) {
        this.f14406W = i;
        new StringBuilder("mVideoCtnType:").append(this.f14406W);
    }

    /* JADX INFO: renamed from: d */
    public final void m11821d(int i) {
        this.f14401R = i;
        new StringBuilder("mReadyRate:").append(this.f14401R);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11822d() {
        return this.f14397N;
    }

    /* JADX INFO: renamed from: e */
    public final String m11823e() {
        return this.f14395L;
    }

    /* JADX INFO: renamed from: e */
    public final void m11824e(int i) {
        this.f14409Z = i;
    }

    /* JADX INFO: renamed from: f */
    public final long m11825f() {
        return this.f14391H;
    }

    /* JADX INFO: renamed from: g */
    public final void m11826g() {
        Message messageObtain = Message.obtain();
        this.f14418u = 5;
        messageObtain.what = 4;
        this.f14408Y.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: h */
    public final void m11827h() {
        if (TextUtils.isEmpty(this.f14392I)) {
            return;
        }
        if (this.f14418u == 5) {
            m11804v();
            return;
        }
        if (this.f14412n == 3) {
            m11826g();
            return;
        }
        if (this.f14401R == 0) {
            m11826g();
            return;
        }
        m11806x();
        m11803u();
        if (this.f14410c != null) {
            this.f14418u = 1;
            this.f14389F = true;
            this.f14410c.m11776a();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11828i() {
        m11806x();
        m11803u();
        if (this.f14410c != null) {
            this.f14418u = 1;
            this.f14389F = true;
            this.f14410c.m11778b();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11829j() {
        m11779A();
        this.f14418u = 4;
    }

    /* JADX INFO: renamed from: k */
    public final int m11830k() {
        return this.f14418u;
    }

    /* JADX INFO: renamed from: l */
    public final void m11831l() {
        this.f14418u = 0;
    }

    /* JADX INFO: renamed from: m */
    public final String m11832m() {
        if (this.f14412n == 3) {
            return "";
        }
        File file = new File(this.f14395L);
        try {
            return file.length() > 0 ? file.canRead() ? file.length() > 0 ? "" : "file length is 0 " : "file can not read " : "file is not exist ";
        } catch (Throwable th) {
            String message = th.getMessage();
            if (!C1404a.f6209a) {
                return message;
            }
            th.printStackTrace();
            return message;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C1781c m11833n() {
        return this.f14387D;
    }

    /* JADX INFO: renamed from: o */
    public final void m11834o() {
        if (this.f14419v != null) {
            this.f14419v = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final long m11835p() {
        return this.f14393J;
    }

    /* JADX INFO: renamed from: q */
    public final void m11836q() {
        String str;
        Message messageObtain = Message.obtain();
        messageObtain.what = f14383p;
        if (this.f14387D == null || TextUtils.isEmpty(this.f14388E) || TextUtils.isEmpty(this.f14387D.m8818Z()) || TextUtils.isEmpty(this.f14387D.m8811S())) {
            str = "";
        } else {
            str = "key=2000077&unit_id=" + this.f14388E + "&request_id=" + this.f14387D.m8818Z() + "&request_id_notice=" + this.f14387D.m8832aa() + "&package_name=" + C1773a.m8548c().m8552b() + "&app_id=" + C1773a.m8548c().m8558f() + "&video_url=" + URLEncoder.encode(this.f14387D.m8811S()) + "&process_size=" + this.f14393J + "&file_size=" + this.f14391H + "&ready_rate=" + this.f14401R + "&cd_rate=" + this.f14414q + "&cid=" + this.f14387D.m10146aZ() + "&type=" + this.f14418u;
        }
        messageObtain.obj = str;
        this.f14408Y.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: r */
    public final String m11837r() {
        return this.f14415r;
    }
}
