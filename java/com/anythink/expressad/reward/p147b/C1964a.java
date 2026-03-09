package com.anythink.expressad.reward.p147b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p114c.C1778c;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p122b.C1810b;
import com.anythink.expressad.foundation.p138h.C1879m;
import com.anythink.expressad.foundation.p138h.C1888v;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.reward.p146a.C1961c;
import com.anythink.expressad.reward.p146a.C1962d;
import com.anythink.expressad.reward.p146a.InterfaceC1959a;
import com.anythink.expressad.reward.p146a.InterfaceC1960b;
import com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h;
import com.anythink.expressad.videocommon.C2314a;
import com.anythink.expressad.videocommon.p178b.C2325j;
import com.anythink.expressad.videocommon.p178b.C2328m;
import com.anythink.expressad.videocommon.p179c.C2332b;
import com.anythink.expressad.videocommon.p179c.C2333c;
import com.anythink.expressad.videocommon.p180d.InterfaceC2334a;
import com.anythink.expressad.videocommon.p181e.C2337a;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.expressad.reward.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C1964a implements InterfaceC1157i {

    /* JADX INFO: renamed from: A */
    private static final int f12291A = 9;

    /* JADX INFO: renamed from: E */
    private static final int f12292E = 16;

    /* JADX INFO: renamed from: F */
    private static final int f12293F = 18;

    /* JADX INFO: renamed from: G */
    private static final int f12294G = 17;

    /* JADX INFO: renamed from: H */
    private static final int f12295H = 1001001;

    /* JADX INFO: renamed from: I */
    private static final int f12296I = 1001002;

    /* JADX INFO: renamed from: a */
    public static final int f12299a = 1;

    /* JADX INFO: renamed from: b */
    public static String f12300b = null;

    /* JADX INFO: renamed from: i */
    private static final String f12302i = "RewardVideoController";

    /* JADX INFO: renamed from: j */
    private static final int f12303j = 8;

    /* JADX INFO: renamed from: z */
    private static final int f12304z = 8;

    /* JADX INFO: renamed from: B */
    private int f12305B;

    /* JADX INFO: renamed from: C */
    private int f12306C;

    /* JADX INFO: renamed from: D */
    private int f12307D;

    /* JADX INFO: renamed from: N */
    private boolean f12312N;

    /* JADX INFO: renamed from: V */
    private Queue<Integer> f12318V;

    /* JADX INFO: renamed from: W */
    private String f12319W;

    /* JADX INFO: renamed from: af */
    private List<C1781c> f12328af;

    /* JADX INFO: renamed from: ag */
    private List<C1781c> f12329ag;

    /* JADX INFO: renamed from: k */
    private Context f12335k;

    /* JADX INFO: renamed from: l */
    private int f12336l;

    /* JADX INFO: renamed from: m */
    private C1962d f12337m;

    /* JADX INFO: renamed from: n */
    private C2340d f12338n;

    /* JADX INFO: renamed from: o */
    private C2337a f12339o;

    /* JADX INFO: renamed from: p */
    private volatile InterfaceC2334a f12340p;

    /* JADX INFO: renamed from: q */
    private volatile c f12341q;

    /* JADX INFO: renamed from: r */
    private String f12342r;

    /* JADX INFO: renamed from: s */
    private String f12343s;

    /* JADX INFO: renamed from: t */
    private volatile String f12344t;

    /* JADX INFO: renamed from: u */
    private String f12345u;

    /* JADX INFO: renamed from: v */
    private String f12346v;

    /* JADX INFO: renamed from: T */
    private static Map<String, Integer> f12297T = new HashMap();

    /* JADX INFO: renamed from: c */
    public static Map<String, d> f12301c = new HashMap();

    /* JADX INFO: renamed from: U */
    private static ConcurrentHashMap<String, String> f12298U = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: w */
    private int f12347w = 0;

    /* JADX INFO: renamed from: y */
    private int f12349y = 2;

    /* JADX INFO: renamed from: J */
    private boolean f12308J = false;

    /* JADX INFO: renamed from: K */
    private boolean f12309K = false;

    /* JADX INFO: renamed from: L */
    private boolean f12310L = false;

    /* JADX INFO: renamed from: M */
    private boolean f12311M = false;

    /* JADX INFO: renamed from: O */
    private boolean f12313O = false;

    /* JADX INFO: renamed from: P */
    private ArrayList<Integer> f12314P = new ArrayList<>(7);

    /* JADX INFO: renamed from: Q */
    private boolean f12315Q = false;

    /* JADX INFO: renamed from: R */
    private volatile boolean f12316R = false;

    /* JADX INFO: renamed from: S */
    private final Object f12317S = new Object();

    /* JADX INFO: renamed from: X */
    private C1778c f12320X = null;

    /* JADX INFO: renamed from: Y */
    private volatile boolean f12321Y = true;

    /* JADX INFO: renamed from: Z */
    private volatile boolean f12322Z = false;

    /* JADX INFO: renamed from: aa */
    private volatile boolean f12323aa = false;

    /* JADX INFO: renamed from: ab */
    private volatile boolean f12324ab = false;

    /* JADX INFO: renamed from: ac */
    private volatile boolean f12325ac = false;

    /* JADX INFO: renamed from: ad */
    private volatile boolean f12326ad = false;

    /* JADX INFO: renamed from: ae */
    private volatile boolean f12327ae = false;

    /* JADX INFO: renamed from: d */
    public volatile boolean f12330d = false;

    /* JADX INFO: renamed from: e */
    public volatile boolean f12331e = false;

    /* JADX INFO: renamed from: f */
    public volatile boolean f12332f = false;

    /* JADX INFO: renamed from: g */
    public volatile boolean f12333g = false;

    /* JADX INFO: renamed from: h */
    public volatile boolean f12334h = false;

    /* JADX INFO: renamed from: x */
    private Handler f12348x = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.reward.b.a.1
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 8) {
                if (C1964a.this.f12328af == null || C1964a.this.f12328af.size() <= 0) {
                    return;
                }
                boolean z = (C1964a.this.f12329ag == null || C1964a.this.f12329ag.size() <= 0) ? false : !TextUtils.isEmpty(((C1781c) C1964a.this.f12329ag.get(0)).m8849ar());
                int iM8847ap = ((C1781c) C1964a.this.f12328af.get(0)).m8847ap();
                if (C1964a.this.f12337m != null && C1964a.this.f12337m.m10318a(C1964a.this.f12328af, z, iM8847ap)) {
                    if (C1964a.this.f12341q == null || !C1964a.this.f12312N) {
                        return;
                    }
                    c.m10393a(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
                    return;
                }
                if (C1964a.this.f12341q == null || !C1964a.this.f12312N) {
                    return;
                }
                C2314a.m11753c(C1964a.this.f12343s);
                C2314a.m11747b();
                c.m10392a(C1964a.this.f12341q, "load timeout");
                return;
            }
            if (i == 9) {
                if (C1964a.this.f12340p == null || !C1964a.this.f12312N) {
                    return;
                }
                Object obj = message.obj;
                Bundle data = message.getData();
                if (data != null && data.containsKey(C1404a.f6238y)) {
                    TextUtils.isEmpty(data.getString(C1404a.f6238y));
                }
                try {
                    if (C1964a.this.f12309K) {
                        C1964a.m10343b();
                    }
                    C1964a.this.f12340p.mo377b();
                    return;
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            if (i != C1964a.f12296I) {
                switch (i) {
                    case 16:
                    case 18:
                        if (C1964a.this.f12340p != null && C1964a.this.f12312N) {
                            Object obj2 = message.obj;
                            String string = obj2 instanceof String ? obj2.toString() : "";
                            C2314a.m11753c(C1964a.this.f12343s);
                            C2314a.m11747b();
                            try {
                                if (C1964a.this.f12309K) {
                                    C1964a.m10343b();
                                }
                                C1964a.this.f12340p.mo375a(string);
                            } catch (Exception e2) {
                                if (C1404a.f6209a) {
                                    e2.printStackTrace();
                                    return;
                                }
                                return;
                            }
                            break;
                        }
                        break;
                    case 17:
                        if (C1964a.this.f12340p != null && C1964a.this.f12312N) {
                            Object obj3 = message.obj;
                            Bundle data2 = message.getData();
                            if (data2 != null && data2.containsKey(C1404a.f6238y)) {
                                TextUtils.isEmpty(data2.getString(C1404a.f6238y));
                            }
                            try {
                                if (C1964a.this.f12309K) {
                                    C1964a.m10343b();
                                }
                                InterfaceC2334a unused = C1964a.this.f12340p;
                            } catch (Exception e3) {
                                if (C1404a.f6209a) {
                                    e3.printStackTrace();
                                    return;
                                }
                                return;
                            }
                            break;
                        }
                        break;
                }
                return;
            }
            int iM12074S = C1964a.this.f12338n != null ? C1964a.this.f12338n.m12074S() : 0;
            if (C1964a.this.f12337m == null) {
                c unused2 = C1964a.this.f12341q;
                return;
            }
            if (C1964a.this.f12337m.mo10203c()) {
                if (C1964a.this.f12341q != null) {
                    try {
                        CopyOnWriteArrayList<C1781c> copyOnWriteArrayListM10324f = C1964a.this.f12337m.m10324f();
                        if (copyOnWriteArrayListM10324f != null) {
                            copyOnWriteArrayListM10324f.size();
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    c.m10402b(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
                    return;
                }
                return;
            }
            if (!C1964a.this.f12337m.m10325f(false)) {
                if (!C1964a.this.f12337m.m10325f(true)) {
                    if (C1964a.this.f12341q != null) {
                        StringBuilder sb = new StringBuilder("load timeout task called for onVideoLoadFail after ");
                        sb.append(iM12074S);
                        sb.append(" s");
                        return;
                    }
                    return;
                }
                if (!C1964a.this.f12337m.mo10203c()) {
                    if (C1964a.this.f12341q != null) {
                        StringBuilder sb2 = new StringBuilder("load timeout task called for onVideoLoadFail after ");
                        sb2.append(iM12074S);
                        sb2.append(" s");
                    }
                    C1964a.this.f12337m.m10323e(true);
                    return;
                }
                if (C1964a.this.f12341q != null) {
                    C1964a.this.f12337m.m10321d(true);
                    try {
                        CopyOnWriteArrayList<C1781c> copyOnWriteArrayListM10324f2 = C1964a.this.f12337m.m10324f();
                        if (copyOnWriteArrayListM10324f2 != null) {
                            copyOnWriteArrayListM10324f2.size();
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    c.m10402b(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
                    return;
                }
                return;
            }
            if (C1964a.this.f12337m.mo10203c()) {
                if (C1964a.this.f12341q != null) {
                    C1964a.this.f12337m.m10321d(false);
                    try {
                        CopyOnWriteArrayList<C1781c> copyOnWriteArrayListM10324f3 = C1964a.this.f12337m.m10324f();
                        if (copyOnWriteArrayListM10324f3 != null) {
                            copyOnWriteArrayListM10324f3.size();
                        }
                    } catch (Throwable th3) {
                        th3.getMessage();
                    }
                    c.m10402b(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
                    return;
                }
                return;
            }
            C1964a.this.f12337m.m10323e(false);
            if (!C1964a.this.f12337m.m10325f(true)) {
                if (C1964a.this.f12341q != null) {
                    StringBuilder sb3 = new StringBuilder("load timeout task called for onVideoLoadFail after ");
                    sb3.append(iM12074S);
                    sb3.append("s exception");
                    return;
                }
                return;
            }
            if (!C1964a.this.f12337m.mo10203c()) {
                if (C1964a.this.f12341q != null) {
                    StringBuilder sb4 = new StringBuilder("load timeout task called for onVideoLoadFail after ");
                    sb4.append(iM12074S);
                    sb4.append("s exception");
                }
                C1964a.this.f12337m.m10323e(true);
                return;
            }
            if (C1964a.this.f12341q != null) {
                C1964a.this.f12337m.m10321d(true);
                try {
                    CopyOnWriteArrayList<C1781c> copyOnWriteArrayListM10324f4 = C1964a.this.f12337m.m10324f();
                    if (copyOnWriteArrayListM10324f4 != null) {
                        copyOnWriteArrayListM10324f4.size();
                    }
                } catch (Throwable th4) {
                    th4.getMessage();
                }
                c.m10402b(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
            }
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.reward.b.a$1 */
    public class AnonymousClass1 extends Handler {
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 8) {
                if (C1964a.this.f12328af == null || C1964a.this.f12328af.size() <= 0) {
                    return;
                }
                boolean z = (C1964a.this.f12329ag == null || C1964a.this.f12329ag.size() <= 0) ? false : !TextUtils.isEmpty(((C1781c) C1964a.this.f12329ag.get(0)).m8849ar());
                int iM8847ap = ((C1781c) C1964a.this.f12328af.get(0)).m8847ap();
                if (C1964a.this.f12337m != null && C1964a.this.f12337m.m10318a(C1964a.this.f12328af, z, iM8847ap)) {
                    if (C1964a.this.f12341q == null || !C1964a.this.f12312N) {
                        return;
                    }
                    c.m10393a(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
                    return;
                }
                if (C1964a.this.f12341q == null || !C1964a.this.f12312N) {
                    return;
                }
                C2314a.m11753c(C1964a.this.f12343s);
                C2314a.m11747b();
                c.m10392a(C1964a.this.f12341q, "load timeout");
                return;
            }
            if (i == 9) {
                if (C1964a.this.f12340p == null || !C1964a.this.f12312N) {
                    return;
                }
                Object obj = message.obj;
                Bundle data = message.getData();
                if (data != null && data.containsKey(C1404a.f6238y)) {
                    TextUtils.isEmpty(data.getString(C1404a.f6238y));
                }
                try {
                    if (C1964a.this.f12309K) {
                        C1964a.m10343b();
                    }
                    C1964a.this.f12340p.mo377b();
                    return;
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            if (i != C1964a.f12296I) {
                switch (i) {
                    case 16:
                    case 18:
                        if (C1964a.this.f12340p != null && C1964a.this.f12312N) {
                            Object obj2 = message.obj;
                            String string = obj2 instanceof String ? obj2.toString() : "";
                            C2314a.m11753c(C1964a.this.f12343s);
                            C2314a.m11747b();
                            try {
                                if (C1964a.this.f12309K) {
                                    C1964a.m10343b();
                                }
                                C1964a.this.f12340p.mo375a(string);
                            } catch (Exception e2) {
                                if (C1404a.f6209a) {
                                    e2.printStackTrace();
                                    return;
                                }
                                return;
                            }
                            break;
                        }
                        break;
                    case 17:
                        if (C1964a.this.f12340p != null && C1964a.this.f12312N) {
                            Object obj3 = message.obj;
                            Bundle data2 = message.getData();
                            if (data2 != null && data2.containsKey(C1404a.f6238y)) {
                                TextUtils.isEmpty(data2.getString(C1404a.f6238y));
                            }
                            try {
                                if (C1964a.this.f12309K) {
                                    C1964a.m10343b();
                                }
                                InterfaceC2334a unused = C1964a.this.f12340p;
                            } catch (Exception e3) {
                                if (C1404a.f6209a) {
                                    e3.printStackTrace();
                                    return;
                                }
                                return;
                            }
                            break;
                        }
                        break;
                }
                return;
            }
            int iM12074S = C1964a.this.f12338n != null ? C1964a.this.f12338n.m12074S() : 0;
            if (C1964a.this.f12337m == null) {
                c unused2 = C1964a.this.f12341q;
                return;
            }
            if (C1964a.this.f12337m.mo10203c()) {
                if (C1964a.this.f12341q != null) {
                    try {
                        CopyOnWriteArrayList<C1781c> copyOnWriteArrayListM10324f = C1964a.this.f12337m.m10324f();
                        if (copyOnWriteArrayListM10324f != null) {
                            copyOnWriteArrayListM10324f.size();
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    c.m10402b(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
                    return;
                }
                return;
            }
            if (!C1964a.this.f12337m.m10325f(false)) {
                if (!C1964a.this.f12337m.m10325f(true)) {
                    if (C1964a.this.f12341q != null) {
                        StringBuilder sb = new StringBuilder("load timeout task called for onVideoLoadFail after ");
                        sb.append(iM12074S);
                        sb.append(" s");
                        return;
                    }
                    return;
                }
                if (!C1964a.this.f12337m.mo10203c()) {
                    if (C1964a.this.f12341q != null) {
                        StringBuilder sb2 = new StringBuilder("load timeout task called for onVideoLoadFail after ");
                        sb2.append(iM12074S);
                        sb2.append(" s");
                    }
                    C1964a.this.f12337m.m10323e(true);
                    return;
                }
                if (C1964a.this.f12341q != null) {
                    C1964a.this.f12337m.m10321d(true);
                    try {
                        CopyOnWriteArrayList<C1781c> copyOnWriteArrayListM10324f2 = C1964a.this.f12337m.m10324f();
                        if (copyOnWriteArrayListM10324f2 != null) {
                            copyOnWriteArrayListM10324f2.size();
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    c.m10402b(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
                    return;
                }
                return;
            }
            if (C1964a.this.f12337m.mo10203c()) {
                if (C1964a.this.f12341q != null) {
                    C1964a.this.f12337m.m10321d(false);
                    try {
                        CopyOnWriteArrayList<C1781c> copyOnWriteArrayListM10324f3 = C1964a.this.f12337m.m10324f();
                        if (copyOnWriteArrayListM10324f3 != null) {
                            copyOnWriteArrayListM10324f3.size();
                        }
                    } catch (Throwable th3) {
                        th3.getMessage();
                    }
                    c.m10402b(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
                    return;
                }
                return;
            }
            C1964a.this.f12337m.m10323e(false);
            if (!C1964a.this.f12337m.m10325f(true)) {
                if (C1964a.this.f12341q != null) {
                    StringBuilder sb3 = new StringBuilder("load timeout task called for onVideoLoadFail after ");
                    sb3.append(iM12074S);
                    sb3.append("s exception");
                    return;
                }
                return;
            }
            if (!C1964a.this.f12337m.mo10203c()) {
                if (C1964a.this.f12341q != null) {
                    StringBuilder sb4 = new StringBuilder("load timeout task called for onVideoLoadFail after ");
                    sb4.append(iM12074S);
                    sb4.append("s exception");
                }
                C1964a.this.f12337m.m10323e(true);
                return;
            }
            if (C1964a.this.f12341q != null) {
                C1964a.this.f12337m.m10321d(true);
                try {
                    CopyOnWriteArrayList<C1781c> copyOnWriteArrayListM10324f4 = C1964a.this.f12337m.m10324f();
                    if (copyOnWriteArrayListM10324f4 != null) {
                        copyOnWriteArrayListM10324f4.size();
                    }
                } catch (Throwable th4) {
                    th4.getMessage();
                }
                c.m10402b(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.b.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        private InterfaceC1959a f12352b;

        /* JADX INFO: renamed from: c */
        private int f12353c = 1;

        /* JADX INFO: renamed from: d */
        private boolean f12354d = true;

        public a(InterfaceC1959a interfaceC1959a) {
            this.f12352b = interfaceC1959a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb = new StringBuilder("adSource=");
            sb.append(this.f12353c);
            sb.append(" CommonCancelTimeTask mIsDevCall:");
            sb.append(this.f12354d);
            C1964a.this.m10345b("v3 is timeout");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.b.a$b */
    public class b implements InterfaceC1960b {

        /* JADX INFO: renamed from: b */
        private InterfaceC1959a f12356b;

        /* JADX INFO: renamed from: c */
        private boolean f12357c = true;

        /* JADX INFO: renamed from: d */
        private Runnable f12358d;

        public b(InterfaceC1959a interfaceC1959a) {
            this.f12356b = interfaceC1959a;
        }

        /* JADX INFO: renamed from: c */
        private Runnable m10386c() {
            return this.f12358d;
        }

        @Override // com.anythink.expressad.reward.p146a.InterfaceC1960b
        /* JADX INFO: renamed from: a */
        public final void mo10205a() {
            if (this.f12358d != null) {
                C1964a.this.f12348x.removeCallbacks(this.f12358d);
            }
            if (C1964a.this.f12341q != null) {
                c.m10393a(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m10387a(Runnable runnable) {
            this.f12358d = runnable;
        }

        @Override // com.anythink.expressad.reward.p146a.InterfaceC1960b
        /* JADX INFO: renamed from: a */
        public final void mo10206a(String str) {
            if (this.f12358d != null) {
                C1964a.this.f12348x.removeCallbacks(this.f12358d);
            }
            InterfaceC1959a interfaceC1959a = this.f12356b;
            if (interfaceC1959a != null) {
                interfaceC1959a.mo10200a(null);
                this.f12356b = null;
            }
            if (C1964a.this.f12341q != null) {
                c.m10392a(C1964a.this.f12341q, str);
            }
        }

        @Override // com.anythink.expressad.reward.p146a.InterfaceC1960b
        /* JADX INFO: renamed from: b */
        public final void mo10207b() {
            if (this.f12358d != null) {
                C1964a.this.f12348x.removeCallbacks(this.f12358d);
            }
            if (C1964a.this.f12341q != null) {
                c.m10407c(C1964a.this.f12341q, C1964a.this.f12344t, C1964a.this.f12343s);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.b.a$c */
    public final class c {

        /* JADX INFO: renamed from: b */
        private static final String f12359b = "RewardVideoController_Listener";

        /* JADX INFO: renamed from: d */
        private static final int f12360d = 0;

        /* JADX INFO: renamed from: e */
        private static final int f12361e = 1;

        /* JADX INFO: renamed from: f */
        private static final int f12362f = 2;

        /* JADX INFO: renamed from: g */
        private static final int f12363g = 3;

        /* JADX INFO: renamed from: c */
        private WeakReference<InterfaceC2334a> f12365c;

        /* JADX INFO: renamed from: h */
        private volatile AtomicInteger f12366h;

        /* JADX INFO: renamed from: i */
        private Handler f12367i;

        /* JADX INFO: renamed from: j */
        private String f12368j;

        /* JADX INFO: renamed from: k */
        private List<C1781c> f12369k;

        /* JADX INFO: renamed from: l */
        private boolean f12370l;

        private c(InterfaceC2334a interfaceC2334a, Handler handler, String str) {
            this.f12365c = new WeakReference<>(interfaceC2334a);
            this.f12366h = new AtomicInteger(0);
            this.f12367i = handler;
            this.f12368j = str;
        }

        public /* synthetic */ c(C1964a c1964a, InterfaceC2334a interfaceC2334a, Handler handler, String str, byte b) {
            this(interfaceC2334a, handler, str);
        }

        /* JADX INFO: renamed from: a */
        private int m10388a() {
            return this.f12366h.get();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m10389a(c cVar) {
            return cVar.f12366h.get();
        }

        /* JADX INFO: renamed from: a */
        private void m10390a(int i) {
            this.f12366h.set(i);
        }

        /* JADX INFO: renamed from: a */
        private void m10391a(C1781c c1781c) {
            InterfaceC2334a interfaceC2334a;
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || (interfaceC2334a = weakReference.get()) == null) {
                return;
            }
            interfaceC2334a.mo374a(c1781c);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m10392a(c cVar, String str) {
            Handler handler = cVar.f12367i;
            if (handler != null) {
                handler.removeMessages(C1964a.f12296I);
            }
            StringBuilder sb = new StringBuilder("receive onVideoLoadFail,cur state: ");
            sb.append(cVar.f12366h.get());
            sb.append(" hasCalledVideoLoadFail: ");
            sb.append(C1964a.this.f12325ac);
            sb.append(C4196o4.OooO00o.OooO0Oo);
            sb.append(str);
            WeakReference<InterfaceC2334a> weakReference = cVar.f12365c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((cVar.f12366h.get() == 1 || cVar.f12366h.get() == 3) && cVar.f12367i != null) {
                C1964a.m10374s(C1964a.this);
                if (!C1964a.this.f12327ae || str.contains("resource load timeout")) {
                    C1964a.m10376u(C1964a.this);
                }
                if (C1964a.this.f12324ab) {
                    cVar.f12366h.set(2);
                }
                if (!C1964a.this.f12325ac || !C1964a.this.f12326ad || C1964a.this.f12324ab) {
                    StringBuilder sb2 = new StringBuilder("receive onVideoLoadFail,cur state: ");
                    sb2.append(cVar.f12366h.get());
                    sb2.append(" hasCalledVideoLoadFail: ");
                    sb2.append(C1964a.this.f12325ac);
                    sb2.append(C4196o4.OooO00o.OooO0Oo);
                    sb2.append(str);
                    sb2.append(" 无需响应");
                    return;
                }
                cVar.f12366h.set(2);
                StringBuilder sb3 = new StringBuilder("receive onVideoLoadFail,cur state: ");
                sb3.append(cVar.f12366h.get());
                sb3.append(" hasCalledVideoLoadFail: ");
                sb3.append(C1964a.this.f12325ac);
                sb3.append(C4196o4.OooO00o.OooO0Oo);
                sb3.append(str);
                sb3.append(" 响应");
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 16;
                cVar.f12367i.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m10393a(c cVar, String str, String str2) {
            Handler handler = cVar.f12367i;
            if (handler != null) {
                handler.removeMessages(C1964a.f12296I);
            }
            StringBuilder sb = new StringBuilder("receive onVideoLoadSuccess,cur state: ");
            sb.append(cVar.f12366h.get());
            sb.append(" hasCalledVideoLoadSuccess: ");
            sb.append(C1964a.this.f12324ab);
            WeakReference<InterfaceC2334a> weakReference = cVar.f12365c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((cVar.f12366h.get() == 1 || cVar.f12366h.get() == 3) && cVar.f12367i != null) {
                cVar.f12366h.set(2);
                if (C1964a.this.f12324ab) {
                    StringBuilder sb2 = new StringBuilder("receive onVideoLoadSuccess,cur state: ");
                    sb2.append(cVar.f12366h.get());
                    sb2.append(" hasCalledVideoLoadSuccess: ");
                    sb2.append(C1964a.this.f12324ab);
                    sb2.append(" 无需响应");
                    return;
                }
                StringBuilder sb3 = new StringBuilder("receive onVideoLoadSuccess,cur state: ");
                sb3.append(cVar.f12366h.get());
                sb3.append(" hasCalledVideoLoadSuccess: ");
                sb3.append(C1964a.this.f12324ab);
                sb3.append(" 响应");
                C1964a.m10372q(C1964a.this);
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(C1404a.f6238y, str);
                bundle.putString("unit_id", str2);
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                cVar.f12367i.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m10394a(String str) {
            Handler handler = this.f12367i;
            if (handler != null) {
                handler.removeMessages(C1964a.f12296I);
            }
            StringBuilder sb = new StringBuilder("receive onVideoLoadFail,cur state: ");
            sb.append(this.f12366h.get());
            sb.append(" hasCalledVideoLoadFail: ");
            sb.append(C1964a.this.f12325ac);
            sb.append(C4196o4.OooO00o.OooO0Oo);
            sb.append(str);
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f12366h.get() == 1 || this.f12366h.get() == 3) && this.f12367i != null) {
                C1964a.m10374s(C1964a.this);
                if (!C1964a.this.f12327ae || str.contains("resource load timeout")) {
                    C1964a.m10376u(C1964a.this);
                }
                if (C1964a.this.f12324ab) {
                    this.f12366h.set(2);
                }
                if (!C1964a.this.f12325ac || !C1964a.this.f12326ad || C1964a.this.f12324ab) {
                    StringBuilder sb2 = new StringBuilder("receive onVideoLoadFail,cur state: ");
                    sb2.append(this.f12366h.get());
                    sb2.append(" hasCalledVideoLoadFail: ");
                    sb2.append(C1964a.this.f12325ac);
                    sb2.append(C4196o4.OooO00o.OooO0Oo);
                    sb2.append(str);
                    sb2.append(" 无需响应");
                    return;
                }
                this.f12366h.set(2);
                StringBuilder sb3 = new StringBuilder("receive onVideoLoadFail,cur state: ");
                sb3.append(this.f12366h.get());
                sb3.append(" hasCalledVideoLoadFail: ");
                sb3.append(C1964a.this.f12325ac);
                sb3.append(C4196o4.OooO00o.OooO0Oo);
                sb3.append(str);
                sb3.append(" 响应");
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 16;
                this.f12367i.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m10395a(String str, String str2) {
            StringBuilder sb = new StringBuilder("receive onCampaignLoadSuccess,cur state: ");
            sb.append(this.f12366h.get());
            sb.append(" hasCalledCampaignLoadSuccess: ");
            sb.append(C1964a.this.f12323aa);
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f12366h.get() == 1 || this.f12366h.get() == 3) && this.f12367i != null) {
                if (C1964a.this.f12323aa) {
                    StringBuilder sb2 = new StringBuilder("receive onCampaignLoadSuccess,cur state: ");
                    sb2.append(this.f12366h.get());
                    sb2.append(" hasCalledCampaignLoadSuccess: ");
                    sb2.append(C1964a.this.f12323aa);
                    sb2.append(" 无需响应");
                    return;
                }
                StringBuilder sb3 = new StringBuilder("receive onCampaignLoadSuccess,cur state: ");
                sb3.append(this.f12366h.get());
                sb3.append(" hasCalledCampaignLoadSuccess: ");
                sb3.append(C1964a.this.f12323aa);
                sb3.append(" response");
                C1964a.m10370o(C1964a.this);
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(C1404a.f6238y, str);
                bundle.putString("unit_id", str2);
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f12367i.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m10396a(List<C1781c> list) {
            this.f12369k = list;
        }

        /* JADX INFO: renamed from: a */
        private void m10397a(boolean z) {
            this.f12370l = z;
        }

        /* JADX INFO: renamed from: a */
        private void m10398a(boolean z, String str, float f) {
            InterfaceC2334a interfaceC2334a;
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || (interfaceC2334a = weakReference.get()) == null) {
                return;
            }
            if (C1964a.this.f12309K) {
                C1964a.m10343b();
                C1964a.this.m10379a();
            }
            interfaceC2334a.mo376a(z, str, f);
        }

        /* JADX INFO: renamed from: b */
        private void m10399b() {
            InterfaceC2334a interfaceC2334a;
            C1964a.m10367l(C1964a.this);
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || (interfaceC2334a = weakReference.get()) == null) {
                return;
            }
            interfaceC2334a.mo379c();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m10400b(c cVar) {
            cVar.f12366h.set(1);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m10401b(c cVar, String str) {
            cVar.f12366h.set(2);
            if (cVar.f12367i != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                cVar.f12367i.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m10402b(c cVar, String str, String str2) {
            Handler handler = cVar.f12367i;
            if (handler != null) {
                handler.removeMessages(C1964a.f12296I);
            }
            StringBuilder sb = new StringBuilder("receive onVideoLoadSuccessForCache,cur state: ");
            sb.append(cVar.f12366h.get());
            sb.append(" hasCalledVideoLoadSuccess: ");
            sb.append(C1964a.this.f12324ab);
            WeakReference<InterfaceC2334a> weakReference = cVar.f12365c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((cVar.f12366h.get() == 1 || cVar.f12366h.get() == 3) && cVar.f12367i != null) {
                if (cVar.f12366h.get() == 1) {
                    cVar.f12366h.set(3);
                }
                if (C1964a.this.f12324ab) {
                    StringBuilder sb2 = new StringBuilder("receive onVideoLoadSuccessForCache,cur state: ");
                    sb2.append(cVar.f12366h.get());
                    sb2.append(" hasCalledVideoLoadSuccess: ");
                    sb2.append(C1964a.this.f12324ab);
                    sb2.append(" 无需响应");
                    return;
                }
                StringBuilder sb3 = new StringBuilder("receive onVideoLoadSuccessForCache,cur state: ");
                sb3.append(cVar.f12366h.get());
                sb3.append(" hasCalledVideoLoadSuccess: ");
                sb3.append(C1964a.this.f12324ab);
                sb3.append(" 响应");
                C1964a.m10372q(C1964a.this);
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(C1404a.f6238y, str);
                bundle.putString("unit_id", str2);
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                cVar.f12367i.sendMessage(messageObtain);
                if (C1964a.this.f12325ac) {
                    cVar.f12366h.set(2);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private void m10403b(String str) {
            this.f12366h.set(2);
            if (this.f12367i != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                this.f12367i.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m10404b(String str, String str2) {
            StringBuilder sb = new StringBuilder("receive onCampaignLoadSuccessForCache,cur state: ");
            sb.append(this.f12366h.get());
            sb.append(" hasCalledCampaignLoadSuccess: ");
            sb.append(C1964a.this.f12323aa);
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || weakReference.get() == null || this.f12367i == null) {
                return;
            }
            if (C1964a.this.f12323aa) {
                StringBuilder sb2 = new StringBuilder("receive onCampaignLoadSuccessForCache,cur state: ");
                sb2.append(this.f12366h.get());
                sb2.append(" hasCalledCampaignLoadSuccess: ");
                sb2.append(C1964a.this.f12323aa);
                sb2.append(" 无需响应");
                return;
            }
            StringBuilder sb3 = new StringBuilder("receive onCampaignLoadSuccessForCache,curstate: ");
            sb3.append(this.f12366h.get());
            sb3.append(" hasCalledCampaignLoadSuccess: ");
            sb3.append(C1964a.this.f12323aa);
            sb3.append(" response");
            C1964a.m10370o(C1964a.this);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putString(C1404a.f6238y, str);
            bundle.putString("unit_id", str2);
            messageObtain.setData(bundle);
            messageObtain.obj = str2;
            messageObtain.what = 17;
            this.f12367i.sendMessage(messageObtain);
        }

        /* JADX INFO: renamed from: c */
        private void m10406c() {
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference != null) {
                weakReference.get();
            }
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m10407c(c cVar, String str, String str2) {
            StringBuilder sb = new StringBuilder("receive onCampaignLoadSuccess,cur state: ");
            sb.append(cVar.f12366h.get());
            sb.append(" hasCalledCampaignLoadSuccess: ");
            sb.append(C1964a.this.f12323aa);
            WeakReference<InterfaceC2334a> weakReference = cVar.f12365c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((cVar.f12366h.get() == 1 || cVar.f12366h.get() == 3) && cVar.f12367i != null) {
                if (C1964a.this.f12323aa) {
                    StringBuilder sb2 = new StringBuilder("receive onCampaignLoadSuccess,cur state: ");
                    sb2.append(cVar.f12366h.get());
                    sb2.append(" hasCalledCampaignLoadSuccess: ");
                    sb2.append(C1964a.this.f12323aa);
                    sb2.append(" 无需响应");
                    return;
                }
                StringBuilder sb3 = new StringBuilder("receive onCampaignLoadSuccess,cur state: ");
                sb3.append(cVar.f12366h.get());
                sb3.append(" hasCalledCampaignLoadSuccess: ");
                sb3.append(C1964a.this.f12323aa);
                sb3.append(" response");
                C1964a.m10370o(C1964a.this);
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(C1404a.f6238y, str);
                bundle.putString("unit_id", str2);
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                cVar.f12367i.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: c */
        private void m10408c(String str) {
            if (this.f12367i != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                this.f12367i.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: c */
        private void m10409c(String str, String str2) {
            Handler handler = this.f12367i;
            if (handler != null) {
                handler.removeMessages(C1964a.f12296I);
            }
            StringBuilder sb = new StringBuilder("receive onVideoLoadSuccess,cur state: ");
            sb.append(this.f12366h.get());
            sb.append(" hasCalledVideoLoadSuccess: ");
            sb.append(C1964a.this.f12324ab);
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f12366h.get() == 1 || this.f12366h.get() == 3) && this.f12367i != null) {
                this.f12366h.set(2);
                if (C1964a.this.f12324ab) {
                    StringBuilder sb2 = new StringBuilder("receive onVideoLoadSuccess,cur state: ");
                    sb2.append(this.f12366h.get());
                    sb2.append(" hasCalledVideoLoadSuccess: ");
                    sb2.append(C1964a.this.f12324ab);
                    sb2.append(" 无需响应");
                    return;
                }
                StringBuilder sb3 = new StringBuilder("receive onVideoLoadSuccess,cur state: ");
                sb3.append(this.f12366h.get());
                sb3.append(" hasCalledVideoLoadSuccess: ");
                sb3.append(C1964a.this.f12324ab);
                sb3.append(" 响应");
                C1964a.m10372q(C1964a.this);
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(C1404a.f6238y, str);
                bundle.putString("unit_id", str2);
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f12367i.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: d */
        private void m10410d() {
            InterfaceC2334a interfaceC2334a;
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || (interfaceC2334a = weakReference.get()) == null) {
                return;
            }
            interfaceC2334a.mo380d();
        }

        /* JADX INFO: renamed from: d */
        private void m10411d(String str) {
            StringBuilder sb = new StringBuilder("receive onVideoLoadFailForCache,cur state: ");
            sb.append(this.f12366h.get());
            sb.append(" hasCalledVideoLoadFailedForCache: ");
            sb.append(C1964a.this.f12326ad);
            sb.append(C4196o4.OooO00o.OooO0Oo);
            sb.append(str);
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f12366h.get() == 1 || this.f12366h.get() == 3) && this.f12367i != null) {
                C1964a.m10376u(C1964a.this);
                if (str.contains("resource load timeout")) {
                    C1964a.m10374s(C1964a.this);
                }
                if (!C1964a.this.f12326ad || !C1964a.this.f12325ac || C1964a.this.f12324ab) {
                    StringBuilder sb2 = new StringBuilder("receive onVideoLoadFailForCache,cur state: ");
                    sb2.append(this.f12366h.get());
                    sb2.append(" hasCalledVideoLoadFailedForCache: ");
                    sb2.append(C1964a.this.f12326ad);
                    sb2.append(C4196o4.OooO00o.OooO0Oo);
                    sb2.append(str);
                    sb2.append(" 无需响应");
                    return;
                }
                this.f12366h.set(2);
                StringBuilder sb3 = new StringBuilder("receive hasCalledVideoLoadFailedForCache,cur state: ");
                sb3.append(this.f12366h.get());
                sb3.append(" hasCalledVideoLoadFailedForCache: ");
                sb3.append(C1964a.this.f12326ad);
                sb3.append(C4196o4.OooO00o.OooO0Oo);
                sb3.append(str);
                sb3.append(" 响应");
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 16;
                this.f12367i.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: d */
        private void m10412d(String str, String str2) {
            Handler handler = this.f12367i;
            if (handler != null) {
                handler.removeMessages(C1964a.f12296I);
            }
            StringBuilder sb = new StringBuilder("receive onVideoLoadSuccessForCache,cur state: ");
            sb.append(this.f12366h.get());
            sb.append(" hasCalledVideoLoadSuccess: ");
            sb.append(C1964a.this.f12324ab);
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f12366h.get() == 1 || this.f12366h.get() == 3) && this.f12367i != null) {
                if (this.f12366h.get() == 1) {
                    this.f12366h.set(3);
                }
                if (C1964a.this.f12324ab) {
                    StringBuilder sb2 = new StringBuilder("receive onVideoLoadSuccessForCache,cur state: ");
                    sb2.append(this.f12366h.get());
                    sb2.append(" hasCalledVideoLoadSuccess: ");
                    sb2.append(C1964a.this.f12324ab);
                    sb2.append(" 无需响应");
                    return;
                }
                StringBuilder sb3 = new StringBuilder("receive onVideoLoadSuccessForCache,cur state: ");
                sb3.append(this.f12366h.get());
                sb3.append(" hasCalledVideoLoadSuccess: ");
                sb3.append(C1964a.this.f12324ab);
                sb3.append(" 响应");
                C1964a.m10372q(C1964a.this);
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(C1404a.f6238y, str);
                bundle.putString("unit_id", str2);
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f12367i.sendMessage(messageObtain);
                if (C1964a.this.f12325ac) {
                    this.f12366h.set(2);
                }
            }
        }

        /* JADX INFO: renamed from: e */
        private void m10413e(String str) {
            InterfaceC2334a interfaceC2334a;
            C1964a.m10367l(C1964a.this);
            WeakReference<InterfaceC2334a> weakReference = this.f12365c;
            if (weakReference == null || (interfaceC2334a = weakReference.get()) == null) {
                return;
            }
            interfaceC2334a.mo378b(str);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.b.a$d */
    public final class d implements InterfaceC2067h {

        /* JADX INFO: renamed from: b */
        private C1964a f12372b;

        /* JADX INFO: renamed from: c */
        private int f12373c;

        /* JADX INFO: renamed from: d */
        private Handler f12374d;

        /* JADX INFO: renamed from: e */
        private int f12375e;

        public /* synthetic */ d(C1964a c1964a, C1964a c1964a2, Handler handler) {
            this(c1964a2, handler, (byte) 0);
        }

        private d(C1964a c1964a, Handler handler, byte b) {
            this.f12375e = 0;
            this.f12372b = c1964a;
            this.f12373c = 1;
            this.f12374d = handler;
        }

        /* JADX INFO: renamed from: d */
        private void m10414d() {
            C1964a.this.f12314P.clear();
            this.f12372b = null;
        }

        @Override // com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h
        /* JADX INFO: renamed from: a */
        public final void mo10415a() {
            C1964a.m10367l(C1964a.this);
            try {
                C1964a c1964a = this.f12372b;
                if (c1964a != null) {
                    c1964a.f12315Q = true;
                    if (this.f12372b.f12337m != null) {
                        this.f12372b.f12337m.f12171n = "";
                    }
                    if (this.f12372b.f12340p != null) {
                        if (C1964a.this.f12309K) {
                            C1964a.m10343b();
                        }
                        this.f12372b.f12340p.mo379c();
                        this.f12375e = 2;
                    }
                }
            } catch (Throwable th) {
                if (C1404a.f6209a) {
                    th.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h
        /* JADX INFO: renamed from: a */
        public final void mo10416a(C1781c c1781c) {
            try {
                C1964a c1964a = this.f12372b;
                if (c1964a == null || c1964a.f12340p == null) {
                    return;
                }
                try {
                    if (C1964a.this.f12309K) {
                        C1964a.m10343b();
                    }
                    this.f12372b.f12340p.mo374a(c1781c);
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                if (C1404a.f6209a) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h
        /* JADX INFO: renamed from: a */
        public final void mo10417a(String str) {
            C1964a.m10367l(C1964a.this);
            try {
                if (this.f12372b != null) {
                    if (C1964a.this.f12309K) {
                        C1964a.m10343b();
                    }
                    this.f12372b.f12315Q = false;
                    if (this.f12372b.f12340p != null) {
                        try {
                            if (C1964a.this.f12328af != null) {
                                C1964a.this.f12328af.size();
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            this.f12372b.f12340p.mo378b(str);
                        } catch (Exception e) {
                            if (C1404a.f6209a) {
                                e.printStackTrace();
                            }
                        }
                        this.f12375e = 4;
                    }
                }
            } catch (Exception e2) {
                this.f12375e = 0;
                if (C1404a.f6209a) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h
        /* JADX INFO: renamed from: a */
        public final void mo10418a(boolean z, int i) {
            try {
                C1964a c1964a = this.f12372b;
                if (c1964a == null || c1964a.f12340p == null) {
                    return;
                }
                this.f12372b.f12315Q = false;
                try {
                    InterfaceC2334a unused = this.f12372b.f12340p;
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                if (C1404a.f6209a) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h
        /* JADX INFO: renamed from: a */
        public final void mo10419a(boolean z, C2333c c2333c) {
            try {
                C1964a c1964a = this.f12372b;
                if (c1964a == null || c1964a.f12340p == null) {
                    return;
                }
                if (c2333c == null) {
                    c2333c = C2333c.m11967b(this.f12372b.f12346v);
                }
                if (C1964a.this.f12309K) {
                    C1964a.m10343b();
                    C1964a.this.m10379a();
                }
                this.f12372b.f12340p.mo376a(z, c2333c.m11969a(), c2333c.m11972b());
                this.f12375e = 7;
                this.f12372b.f12315Q = false;
                C1964a.this.f12314P.clear();
                this.f12372b = null;
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h
        /* JADX INFO: renamed from: b */
        public final void mo10420b() {
            try {
                C1964a c1964a = this.f12372b;
                if (c1964a == null || c1964a.f12340p == null) {
                    return;
                }
                try {
                    this.f12372b.f12340p.mo380d();
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.printStackTrace();
                    }
                }
                this.f12375e = 5;
            } catch (Exception e2) {
                if (C1404a.f6209a) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h
        /* JADX INFO: renamed from: c */
        public final void mo10421c() {
            try {
                C1964a c1964a = this.f12372b;
                if (c1964a == null || c1964a.f12340p == null) {
                    return;
                }
                try {
                    InterfaceC2334a unused = this.f12372b.f12340p;
                    C1800b.m9367a().m9383b("_2", 2);
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.printStackTrace();
                    }
                }
                this.f12375e = 6;
            } catch (Exception e2) {
                if (C1404a.f6209a) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m10330a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (!C1889w.m9868b(str) || (map = f12297T) == null || !map.containsKey(str) || (num = f12297T.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<C1781c> m10332a(String str, List<C1781c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (C1781c c1781c : list) {
                if (c1781c != null && str.equals(c1781c.m8794B())) {
                    arrayList.add(c1781c);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m10333a(int i, int i2, int i3) {
        this.f12305B = i;
        this.f12306C = i2;
        if (i2 == C1801a.f11132cu) {
            this.f12307D = i3 < 0 ? 5 : i3;
        }
        if (i2 == C1801a.f11131ct) {
            this.f12307D = i3 < 0 ? 80 : i3;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i == C1801a.f11129cr ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i2 == C1801a.f11131ct ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i3);
            C1486b.m6002a();
            C1486b.m6015e(this.f12343s, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10334a(Activity activity, String str, C1248m c1248m) {
        Map<String, Integer> mapM11991i;
        try {
            C2337a c2337a = this.f12339o;
            int iIntValue = (c2337a == null || (mapM11991i = c2337a.m11991i()) == null || !mapM11991i.containsKey("1")) ? 0 : mapM11991i.get("1").intValue();
            if (C1888v.m9864b(this.f12335k, this.f12344t + "_1", 0) != null) {
                this.f12336l = ((Integer) C1888v.m9864b(this.f12335k, this.f12344t + "_1", 0)).intValue();
            }
            if (this.f12337m == null) {
                m10362i();
            }
            C1962d c1962d = this.f12337m;
            if (c1962d != null && c1962d.mo10203c()) {
                if (this.f12336l >= iIntValue && iIntValue > 0) {
                    this.f12316R = false;
                    return;
                }
                d dVar = new d(this, this, this.f12348x);
                f12301c.put(this.f12343s, dVar);
                this.f12337m.m10314a(activity, dVar, str, this.f12342r, this.f12349y, this.f12345u, c1248m);
                return;
            }
            this.f12316R = false;
            if (this.f12340p != null) {
                try {
                    this.f12340p.mo378b("can't show because load is failed");
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.getLocalizedMessage();
            }
            if (this.f12340p != null) {
                try {
                    this.f12340p.mo378b("show exception");
                } catch (Exception unused) {
                    if (C1404a.f6209a) {
                        e2.printStackTrace();
                    }
                }
            }
            this.f12316R = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10336a(String str, int i) {
        try {
            if (f12297T == null || !C1889w.m9868b(str)) {
                return;
            }
            f12297T.put(str, Integer.valueOf(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10337a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            C1888v.m9861a(this.f12335k, "Anythink_ConfirmTitle" + this.f12343s, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            C1888v.m9861a(this.f12335k, "Anythink_ConfirmContent" + this.f12343s, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            C1888v.m9861a(this.f12335k, "Anythink_CancelText" + this.f12343s, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        C1888v.m9861a(this.f12335k, "Anythink_ConfirmText" + this.f12343s, str3.trim());
    }

    /* JADX INFO: renamed from: a */
    private static void m10338a(boolean z, boolean z3) {
        int i;
        try {
            Map<String, d> map = f12301c;
            if (map != null) {
                map.clear();
            }
            if (z) {
                i = C1801a.f11010aU;
                if (z3) {
                    C2314a.m11743a(i);
                } else {
                    C2314a.m11748b(i);
                }
            } else {
                i = 94;
                if (z3) {
                    C2314a.m11743a(i);
                }
                C2314a.m11748b(i);
            }
            C2314a.m11742a();
            C2314a.m11747b();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m10339a(boolean z, boolean z3, String str) {
        int i;
        try {
            Map<String, d> map = f12301c;
            if (map != null) {
                map.clear();
            }
            if (z) {
                i = C1801a.f11010aU;
                if (z3) {
                    C2314a.m11743a(i);
                } else {
                    C2314a.m11748b(i);
                }
            } else {
                i = 94;
                if (z3) {
                    C2314a.m11743a(i);
                }
                C2314a.m11748b(i);
            }
            C2314a.m11753c(str);
            C2314a.m11747b();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private C2332b m10341b(int i) {
        C2340d c2340d = this.f12338n;
        C2332b c2332b = null;
        if (c2340d != null) {
            int size = c2340d.m12065I().size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f12338n.m12065I().get(i2).m11963a() == i) {
                    c2332b = this.f12338n.m12065I().get(i2);
                }
            }
        }
        return c2332b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10343b() {
    }

    /* JADX INFO: renamed from: b */
    private void m10344b(C1782d c1782d) {
        try {
            m10350c(c1782d);
        } catch (Exception e) {
            try {
                m10345b("load mv api error:" + e.getMessage());
            } catch (Exception e2) {
                m10345b(C1810b.f11198b);
                if (C1404a.f6209a) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10345b(String str) {
        if (this.f12341q != null) {
            this.f12326ad = true;
            c.m10392a(this.f12341q, str);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m10346b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f12298U) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f12298U.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    private void m10347b(boolean z) {
        this.f12309K = z;
    }

    /* JADX INFO: renamed from: c */
    private static void m10349c() {
    }

    /* JADX INFO: renamed from: c */
    private void m10350c(C1782d c1782d) {
        try {
            C1962d c1962d = this.f12337m;
            if (c1962d == null || !this.f12343s.equals(c1962d.m10322e())) {
                C1962d c1962d2 = new C1962d(this.f12335k, this.f12344t, this.f12343s);
                this.f12337m = c1962d2;
                c1962d2.m10317a(this.f12308J);
                this.f12337m.m10319b(this.f12309K);
            }
            if (this.f12308J) {
                this.f12337m.m10313a(this.f12305B, this.f12306C, this.f12307D);
            }
            this.f12337m.m10312a(this.f12349y);
            this.f12337m.m10316a(this.f12338n);
            a aVar = new a(this.f12337m);
            b bVar = new b(this.f12337m);
            bVar.m10387a(aVar);
            this.f12337m.mo10200a(bVar);
            this.f12337m.m10315a(c1782d);
        } catch (Exception e) {
            m10345b(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    private void m10351c(boolean z) {
        this.f12313O = z;
    }

    /* JADX INFO: renamed from: d */
    private String m10353d() {
        C1962d c1962d = this.f12337m;
        return c1962d != null ? c1962d.m10320c(this.f12315Q) : "";
    }

    /* JADX INFO: renamed from: e */
    private static void m10354e() {
        C1879m.m9731a();
    }

    /* JADX INFO: renamed from: f */
    private void m10357f() {
        try {
            List<C2332b> listM12065I = this.f12338n.m12065I();
            if (listM12065I == null || listM12065I.size() <= 0) {
                return;
            }
            for (int i = 0; i < listM12065I.size(); i++) {
                C2332b c2332b = listM12065I.get(i);
                C1888v.m9861a(this.f12335k, this.f12344t + "_" + c2332b.m11963a(), 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m10359g() {
        int iIntValue;
        try {
            List<C2332b> listM12065I = this.f12338n.m12065I();
            if (this.f12339o == null) {
                this.f12339o = C2339c.m11994a().m12002b();
            }
            Map<String, Integer> mapM11991i = this.f12339o.m11991i();
            if (listM12065I == null || listM12065I.size() <= 0) {
                return true;
            }
            for (int i = 0; i < listM12065I.size(); i++) {
                C2332b c2332b = listM12065I.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append(c2332b.m11963a());
                if (mapM11991i.containsKey(sb.toString())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c2332b.m11963a());
                    iIntValue = mapM11991i.get(sb2.toString()).intValue();
                } else {
                    iIntValue = 0;
                }
                Object objM9864b = C1888v.m9864b(this.f12335k, this.f12344t + "_" + c2332b.m11963a(), 0);
                if ((objM9864b != null ? ((Integer) objM9864b).intValue() : 0) < iIntValue) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            return true;
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m10361h() {
        if (this.f12337m == null) {
            m10362i();
        }
        C1962d c1962d = this.f12337m;
        if (c1962d != null) {
            return c1962d.mo10203c();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    private void m10362i() {
        C1962d c1962d = new C1962d(this.f12335k, this.f12344t, this.f12343s);
        this.f12337m = c1962d;
        c1962d.m10317a(this.f12308J);
        this.f12337m.m10319b(this.f12309K);
        if (this.f12308J) {
            this.f12337m.m10313a(this.f12305B, this.f12306C, this.f12307D);
        }
        this.f12337m.m10316a(this.f12338n);
    }

    /* JADX INFO: renamed from: j */
    private boolean m10365j() {
        try {
            if (this.f12320X != null) {
                return false;
            }
            this.f12320X = C1778c.m8584a(C1175n.m2059a().m2148f());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m10367l(C1964a c1964a) {
        c1964a.f12316R = false;
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m10370o(C1964a c1964a) {
        c1964a.f12323aa = true;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m10372q(C1964a c1964a) {
        c1964a.f12324ab = true;
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m10374s(C1964a c1964a) {
        c1964a.f12325ac = true;
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m10376u(C1964a c1964a) {
        c1964a.f12326ad = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m10379a() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.f12315Q || (concurrentHashMap = f12298U) == null || concurrentHashMap.containsKey(m10353d())) {
            return;
        }
        f12298U.remove(m10353d());
    }

    /* JADX INFO: renamed from: a */
    public final void m10380a(int i) {
        this.f12349y = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:272:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10381a(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.anythink.core.common.p055f.C1248m r14) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.p147b.C1964a.m10381a(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, com.anythink.core.common.f.m):void");
    }

    /* JADX INFO: renamed from: a */
    public final void m10382a(C1782d c1782d) {
        if (c1782d == null) {
            c.m10401b(this.f12341q, C1810b.f11202f);
            return;
        }
        if (this.f12341q == null || c.m10389a(this.f12341q) != 3) {
            this.f12321Y = true;
            c.m10400b(this.f12341q);
        } else {
            this.f12321Y = false;
        }
        this.f12312N = true;
        this.f12348x.removeMessages(f12295H);
        this.f12324ab = false;
        this.f12323aa = false;
        this.f12325ac = false;
        this.f12326ad = false;
        C1961c.m10209a();
        try {
            this.f12338n = C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f12343s, this.f12308J);
            if (!TextUtils.isEmpty(this.f12344t)) {
                this.f12338n.m12084b(this.f12344t);
            }
            int iM12074S = this.f12338n.m12074S() * 1000;
            if (this.f12348x != null) {
                StringBuilder sb = new StringBuilder("start load timeout for ");
                sb.append(iM12074S);
                sb.append(" ms");
                this.f12348x.sendEmptyMessageDelayed(f12296I, iM12074S);
            }
            this.f12318V = this.f12338n.m12072Q();
            try {
                if (m10359g()) {
                    m10357f();
                }
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.printStackTrace();
                }
            }
            try {
                m10350c(c1782d);
            } catch (Exception e2) {
                try {
                    m10345b("load mv api error:" + e2.getMessage());
                } catch (Exception e3) {
                    m10345b(C1810b.f11198b);
                    if (C1404a.f6209a) {
                        e3.printStackTrace();
                    }
                }
            }
        } catch (Exception e4) {
            if (this.f12341q != null) {
                c.m10392a(this.f12341q, "load exception");
            }
            if (C1404a.f6209a) {
                e4.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10383a(InterfaceC2334a interfaceC2334a) {
        this.f12340p = interfaceC2334a;
        this.f12341q = new c(this, interfaceC2334a, this.f12348x, this.f12343s, (byte) 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m10384a(String str, String str2) {
        try {
            this.f12335k = C1175n.m2059a().m2148f();
            this.f12343s = str2;
            this.f12344t = str;
            this.f12339o = C2339c.m11994a().m12002b();
            C1879m.m9741b();
            C2328m.m11910a().m11916b();
            C2325j.m11884a().m11890b();
            C2339c.m11994a().m12001a(this.f12343s, this.f12308J);
            if (this.f12320X == null) {
                this.f12320X = C1778c.m8584a(C1175n.m2059a().m2148f());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10385a(boolean z) {
        this.f12308J = z;
    }

    @Override // com.anythink.core.common.p050a.InterfaceC1157i
    public boolean isReady() {
        try {
            m10365j();
            if (this.f12309K) {
                return false;
            }
            if (this.f12337m == null) {
                m10362i();
            }
            C1962d c1962d = this.f12337m;
            if (c1962d != null) {
                return c1962d.mo10203c();
            }
            return false;
        } catch (Throwable th) {
            if (!C1404a.f6209a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }
}
