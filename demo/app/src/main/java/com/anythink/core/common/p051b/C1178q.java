package com.anythink.core.common.p051b;

import android.content.Context;
import android.content.Intent;
import com.anythink.core.activity.AnyThinkGdprAuthActivity;
import com.anythink.core.api.ATGDPRAuthCallback;
import com.anythink.core.api.AdError;
import com.anythink.core.api.NetTrafficeCallback;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p058h.C1282j;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.b.q */
/* JADX INFO: loaded from: classes.dex */
public class C1178q {

    /* JADX INFO: renamed from: d */
    private static volatile C1178q f3437d;

    /* JADX INFO: renamed from: b */
    public Context f3439b;

    /* JADX INFO: renamed from: c */
    public int f3440c;

    /* JADX INFO: renamed from: a */
    public final int f3438a = -100;

    /* JADX INFO: renamed from: e */
    private ConcurrentHashMap<Integer, Boolean> f3441e = new ConcurrentHashMap<>(5);

    /* JADX INFO: renamed from: com.anythink.core.common.b.q$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATGDPRAuthCallback f3442a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f3443b;

        public AnonymousClass1(ATGDPRAuthCallback aTGDPRAuthCallback, Context context) {
            aTGDPRAuthCallback = aTGDPRAuthCallback;
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnyThinkGdprAuthActivity.mCallback = aTGDPRAuthCallback;
            Intent intent = new Intent(context, (Class<?>) AnyThinkGdprAuthActivity.class);
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.q$2 */
    public class AnonymousClass2 implements InterfaceC1283k {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ NetTrafficeCallback f3445a;

        public AnonymousClass2(NetTrafficeCallback netTrafficeCallback) {
            netTrafficeCallback = netTrafficeCallback;
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadCanceled(int i) {
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadError(int i, String str, AdError adError) {
            NetTrafficeCallback netTrafficeCallback = netTrafficeCallback;
            if (netTrafficeCallback != null) {
                netTrafficeCallback.onErrorCallback(adError.printStackTrace());
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadFinish(int i, Object obj) {
            try {
                if (!(obj instanceof JSONObject)) {
                    NetTrafficeCallback netTrafficeCallback = netTrafficeCallback;
                    if (netTrafficeCallback != null) {
                        netTrafficeCallback.onErrorCallback("There is no result.");
                        return;
                    }
                    return;
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (!jSONObject.has("is_eu")) {
                    NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                    if (netTrafficeCallback2 != null) {
                        netTrafficeCallback2.onErrorCallback("There is no result.");
                        return;
                    }
                    return;
                }
                if (jSONObject.optInt("is_eu") == 1) {
                    NetTrafficeCallback netTrafficeCallback3 = netTrafficeCallback;
                    if (netTrafficeCallback3 != null) {
                        netTrafficeCallback3.onResultCallback(true);
                        return;
                    }
                    return;
                }
                NetTrafficeCallback netTrafficeCallback4 = netTrafficeCallback;
                if (netTrafficeCallback4 != null) {
                    netTrafficeCallback4.onResultCallback(false);
                }
            } catch (Throwable unused) {
                NetTrafficeCallback netTrafficeCallback5 = netTrafficeCallback;
                if (netTrafficeCallback5 != null) {
                    netTrafficeCallback5.onErrorCallback("Internal error");
                }
            }
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadStart(int i) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.q$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f3447a;

        public AnonymousClass3(int i) {
            i = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1178q.this.m2191c(i)) {
                return;
            }
            C1178q c1178qM2182a = C1178q.m2182a(C1175n.m2059a().m2148f());
            C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
            if (c1178qM2182a.f3440c == 2 && c1391aM4865b.m4728Y() == 1 && c1391aM4865b.m4714K() == 0) {
                C1322e.m3872a(1, c1178qM2182a.f3440c, c1391aM4865b.m4728Y(), i);
            }
            if (c1178qM2182a.f3440c == 1 && c1391aM4865b.m4726W() == 0 && c1391aM4865b.m4728Y() == 0) {
                C1322e.m3872a(2, c1178qM2182a.f3440c, c1391aM4865b.m4728Y(), i);
            }
            C1178q.this.f3441e.put(Integer.valueOf(i), Boolean.TRUE);
        }
    }

    private C1178q(Context context) {
        this.f3440c = 2;
        if (context != null) {
            this.f3439b = context.getApplicationContext();
        }
        this.f3440c = C1355s.m4238b(this.f3439b, C1169h.f3065p, C1169h.v.f3268f, 2);
    }

    /* JADX INFO: renamed from: a */
    public static C1178q m2182a(Context context) {
        if (f3437d == null) {
            synchronized (C1178q.class) {
                if (f3437d == null) {
                    f3437d = new C1178q(context);
                }
            }
        }
        return f3437d;
    }

    /* JADX INFO: renamed from: a */
    public final int m2184a() {
        return this.f3440c;
    }

    /* JADX INFO: renamed from: a */
    public final void m2185a(int i) {
        this.f3440c = i;
        C1355s.m4235a(this.f3439b, C1169h.f3065p, C1169h.v.f3268f, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m2186a(Context context, ATGDPRAuthCallback aTGDPRAuthCallback) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.b.q.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATGDPRAuthCallback f3442a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Context f3443b;

            public AnonymousClass1(ATGDPRAuthCallback aTGDPRAuthCallback2, Context context2) {
                aTGDPRAuthCallback = aTGDPRAuthCallback2;
                context = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnyThinkGdprAuthActivity.mCallback = aTGDPRAuthCallback;
                Intent intent = new Intent(context, (Class<?>) AnyThinkGdprAuthActivity.class);
                intent.setFlags(268435456);
                context.startActivity(intent);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m2187a(NetTrafficeCallback netTrafficeCallback) {
        int iM4238b = C1355s.m4238b(this.f3439b, C1169h.f3065p, C1169h.v.f3274l, -100);
        if (iM4238b == -100) {
            new C1282j().mo3639a(0, (InterfaceC1283k) new InterfaceC1283k() { // from class: com.anythink.core.common.b.q.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ NetTrafficeCallback f3445a;

                public AnonymousClass2(NetTrafficeCallback netTrafficeCallback2) {
                    netTrafficeCallback = netTrafficeCallback2;
                }

                @Override // com.anythink.core.common.p058h.InterfaceC1283k
                public final void onLoadCanceled(int i) {
                }

                @Override // com.anythink.core.common.p058h.InterfaceC1283k
                public final void onLoadError(int i, String str, AdError adError) {
                    NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                    if (netTrafficeCallback2 != null) {
                        netTrafficeCallback2.onErrorCallback(adError.printStackTrace());
                    }
                }

                @Override // com.anythink.core.common.p058h.InterfaceC1283k
                public final void onLoadFinish(int i, Object obj) {
                    try {
                        if (!(obj instanceof JSONObject)) {
                            NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                            if (netTrafficeCallback2 != null) {
                                netTrafficeCallback2.onErrorCallback("There is no result.");
                                return;
                            }
                            return;
                        }
                        JSONObject jSONObject = (JSONObject) obj;
                        if (!jSONObject.has("is_eu")) {
                            NetTrafficeCallback netTrafficeCallback22 = netTrafficeCallback;
                            if (netTrafficeCallback22 != null) {
                                netTrafficeCallback22.onErrorCallback("There is no result.");
                                return;
                            }
                            return;
                        }
                        if (jSONObject.optInt("is_eu") == 1) {
                            NetTrafficeCallback netTrafficeCallback3 = netTrafficeCallback;
                            if (netTrafficeCallback3 != null) {
                                netTrafficeCallback3.onResultCallback(true);
                                return;
                            }
                            return;
                        }
                        NetTrafficeCallback netTrafficeCallback4 = netTrafficeCallback;
                        if (netTrafficeCallback4 != null) {
                            netTrafficeCallback4.onResultCallback(false);
                        }
                    } catch (Throwable unused) {
                        NetTrafficeCallback netTrafficeCallback5 = netTrafficeCallback;
                        if (netTrafficeCallback5 != null) {
                            netTrafficeCallback5.onErrorCallback("Internal error");
                        }
                    }
                }

                @Override // com.anythink.core.common.p058h.InterfaceC1283k
                public final void onLoadStart(int i) {
                }
            });
            return;
        }
        if (iM4238b == 1) {
            if (netTrafficeCallback2 != null) {
                netTrafficeCallback2.onResultCallback(true);
            }
        } else if (netTrafficeCallback2 != null) {
            netTrafficeCallback2.onResultCallback(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2188b(int i) {
        C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.b.q.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f3447a;

            public AnonymousClass3(int i2) {
                i = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (C1178q.this.m2191c(i)) {
                    return;
                }
                C1178q c1178qM2182a = C1178q.m2182a(C1175n.m2059a().m2148f());
                C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
                if (c1178qM2182a.f3440c == 2 && c1391aM4865b.m4728Y() == 1 && c1391aM4865b.m4714K() == 0) {
                    C1322e.m3872a(1, c1178qM2182a.f3440c, c1391aM4865b.m4728Y(), i);
                }
                if (c1178qM2182a.f3440c == 1 && c1391aM4865b.m4726W() == 0 && c1391aM4865b.m4728Y() == 0) {
                    C1322e.m3872a(2, c1178qM2182a.f3440c, c1391aM4865b.m4728Y(), i);
                }
                C1178q.this.f3441e.put(Integer.valueOf(i), Boolean.TRUE);
            }
        }, 13, true);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2189b() {
        C1391a c1391aM4865b = C1392b.m4845a(this.f3439b).m4865b(C1175n.m2059a().m2165o());
        if (c1391aM4865b == null || c1391aM4865b.m4712I()) {
            return this.f3440c != 1;
        }
        if (c1391aM4865b.m4728Y() == 0) {
            return true;
        }
        int iM4725V = this.f3440c;
        if (c1391aM4865b.m4726W() == 1) {
            iM4725V = c1391aM4865b.m4725V();
        }
        return iM4725V == 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2190c() {
        C1391a c1391aM4865b = C1392b.m4845a(this.f3439b).m4865b(C1175n.m2059a().m2165o());
        return (c1391aM4865b == null || c1391aM4865b.m4712I()) ? this.f3440c != 1 : this.f3440c == 2 ? c1391aM4865b.m4728Y() == 0 : c1391aM4865b.m4726W() == 1 ? c1391aM4865b.m4725V() == 0 : this.f3440c == 0 || c1391aM4865b.m4728Y() == 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2191c(int i) {
        return this.f3441e.get(Integer.valueOf(i)) != null && this.f3441e.get(Integer.valueOf(i)).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2192d() {
        return C1355s.m4238b(this.f3439b, C1169h.f3065p, C1169h.v.f3274l, -100) == 1;
    }
}
