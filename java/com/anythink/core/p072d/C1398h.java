package com.anythink.core.p072d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.C1373r;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1220am;
import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceC1312a;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p047c.C1141b;
import com.anythink.core.p072d.C1396f;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.d.h */
/* JADX INFO: loaded from: classes.dex */
public class C1398h {

    /* JADX INFO: renamed from: a */
    public static final String f6136a = "h";

    /* JADX INFO: renamed from: b */
    private static volatile C1398h f6137b;

    /* JADX INFO: renamed from: c */
    private Context f6138c;

    /* JADX INFO: renamed from: e */
    private final C1400j f6140e;

    /* JADX INFO: renamed from: d */
    private final C1401k f6139d = new C1401k();

    /* JADX INFO: renamed from: f */
    private final C1399i f6141f = new C1399i(this);

    /* JADX INFO: renamed from: com.anythink.core.d.h$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f6142a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f6143b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1396f f6144c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f6145d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f6146e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Map f6147f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f6148g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f6149h;

        /* JADX INFO: renamed from: com.anythink.core.d.h$1$1 */
        public class C46701 implements InterfaceRunnableC1313b {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean[] f6151a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ a f6152b;

            public C46701(boolean[] zArr, a aVar) {
                zArr = zArr;
                aVar = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = C1398h.f6136a;
                zArr[0] = true;
                aVar.mo2406a(c1396f);
            }
        }

        public AnonymousClass1(String str, b bVar, C1396f c1396f, String str2, String str3, Map map, int i, boolean z) {
            str = str;
            bVar = bVar;
            c1396f = c1396f;
            str = str2;
            str = str3;
            map = map;
            i = i;
            z = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C46701 c46701;
            a aVar = new a(str, bVar);
            C1396f c1396f = c1396f;
            String strM5083aa = c1396f != null ? c1396f.m5083aa() : "";
            Map<String, Object> mapM2143d = C1175n.m2059a().m2143d(str);
            C1220am c1220am = new C1220am(str, str, str, strM5083aa, mapM2143d, map);
            c1220am.m2591a(i);
            String str = C1398h.f6136a;
            StringBuilder sb = new StringBuilder("requestStrategy() >>> placeId: ");
            sb.append(str);
            sb.append(" fistReqPlaceStrategyFlag: ");
            sb.append(i);
            sb.append(" oldStrategyType: ");
            C1396f c1396f2 = c1396f;
            sb.append(c1396f2 != null ? Integer.valueOf(c1396f2.m5076aR()) : null);
            C1396f c1396f3 = c1396f;
            if (c1396f3 == null) {
                C1399i unused = C1398h.this.f6141f;
                C1399i.m5157a(C1398h.this.f6138c, c1220am, new C1397g(C1398h.this, c1220am, aVar, null));
                return;
            }
            c1220am.m2592a(c1396f3.m4874av());
            if (z) {
                C1399i unused2 = C1398h.this.f6141f;
                C1399i.m5157a(C1398h.this.f6138c, c1220am, new C1397g(C1398h.this, c1220am, aVar, c1396f));
                return;
            }
            if (c1396f.m5068aJ()) {
                aVar.mo2406a(c1396f);
                c1220am.m2592a((Map<String, String>) null);
                C1399i unused3 = C1398h.this.f6141f;
                C1399i.m5157a(C1398h.this.f6138c, c1220am, new C1397g(C1398h.this, c1220am, aVar, c1396f));
                return;
            }
            if (c1396f.m5070aL()) {
                aVar.mo2406a(c1396f);
                aVar.f6159b = null;
            }
            C1396f c1396fM5150e = C1398h.this.m5150e(str);
            if (c1396fM5150e == null) {
                c1220am.m2592a((Map<String, String>) null);
                C1399i unused4 = C1398h.this.f6141f;
                C1399i.m5157a(C1398h.this.f6138c, c1220am, new C1397g(C1398h.this, c1220am, aVar, c1396f));
                return;
            }
            c1220am.m2592a(c1396fM5150e.m4874av());
            if (!((mapM2143d.equals(c1396fM5150e.m5052X()) ^ true) || c1396fM5150e.m5081aW() || C1373r.m4395a().m4399c(C1398h.this.f6138c, str))) {
                aVar.mo2406a(c1396f);
                return;
            }
            boolean[] zArr = new boolean[1];
            long jM5091ai = c1396fM5150e.m5091ai();
            InterfaceC1312a interfaceC1312aM3806a = C1315d.m3806a();
            if (jM5091ai == 0) {
                zArr[0] = true;
                aVar.mo2406a(c1396f);
                c46701 = null;
            } else {
                C46701 c467012 = new InterfaceRunnableC1313b() { // from class: com.anythink.core.d.h.1.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ boolean[] f6151a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ a f6152b;

                    public C46701(boolean[] zArr2, a aVar2) {
                        zArr = zArr2;
                        aVar = aVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2 = C1398h.f6136a;
                        zArr[0] = true;
                        aVar.mo2406a(c1396f);
                    }
                };
                interfaceC1312aM3806a.mo3800a(c467012, jM5091ai, false);
                c46701 = c467012;
            }
            C1141b.m1860a().m1866b(str);
            C1399i unused5 = C1398h.this.f6141f;
            C1399i.m5157a(C1398h.this.f6138c, c1220am, new C1397g(C1398h.this, c1220am, aVar2, c1396f, interfaceC1312aM3806a, c46701, zArr2));
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.d.h$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1396f f6154a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f6155b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1220am f6156c;

        public AnonymousClass2(C1396f c1396f, String str, C1220am c1220am) {
            c1396f = c1396f;
            str = str;
            c1220am = c1220am;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (c1396f.m5053Y() == 1) {
                C1373r.m4395a().m4397a(C1398h.this.f6138c, str);
            }
            if (!c1396f.m5069aK()) {
                C1398h.this.f6140e.m5168b(c1220am.m2590a(), str, 2);
                return;
            }
            c1220am.m2591a(1);
            C1396f c1396fM5149d = C1398h.this.m5149d(str);
            if (c1396fM5149d != null) {
                c1220am.m2592a(c1396fM5149d.m4874av());
            } else {
                c1220am.m2592a((Map<String, String>) null);
            }
            C1398h.this.f6141f.m5158a(C1398h.this.f6138c, c1220am);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.d.h$a */
    public static class a implements b {

        /* JADX INFO: renamed from: a */
        private final String f6158a;

        /* JADX INFO: renamed from: b */
        private b f6159b;

        /* JADX INFO: renamed from: c */
        private volatile boolean f6160c = false;

        public a(String str, b bVar) {
            this.f6158a = str;
            this.f6159b = bVar;
        }

        @Override // com.anythink.core.p072d.C1398h.b
        /* JADX INFO: renamed from: a */
        public final void mo2405a(AdError adError) {
            if (this.f6159b == null || this.f6160c) {
                return;
            }
            this.f6160c = true;
            this.f6159b.mo2405a(adError);
        }

        @Override // com.anythink.core.p072d.C1398h.b
        /* JADX INFO: renamed from: a */
        public final void mo2406a(C1396f c1396f) {
            if (this.f6159b == null || this.f6160c) {
                return;
            }
            C1398h.m5135a(C1175n.m2059a().m2148f()).m5147b(this.f6158a, c1396f.m5076aR());
            String str = C1398h.f6136a;
            this.f6160c = true;
            this.f6159b.mo2406a(c1396f);
        }

        @Override // com.anythink.core.p072d.C1398h.b
        /* JADX INFO: renamed from: b */
        public final void mo2407b(C1396f c1396f) {
            b bVar = this.f6159b;
            if (bVar != null) {
                bVar.mo2407b(c1396f);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.d.h$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2405a(AdError adError);

        /* JADX INFO: renamed from: a */
        void mo2406a(C1396f c1396f);

        /* JADX INFO: renamed from: b */
        void mo2407b(C1396f c1396f);
    }

    private C1398h(Context context) {
        this.f6138c = context;
        this.f6140e = new C1400j(context);
    }

    /* JADX INFO: renamed from: a */
    public static C1398h m5135a(Context context) {
        if (f6137b == null) {
            synchronized (C1398h.class) {
                if (f6137b == null) {
                    f6137b = new C1398h(context);
                }
            }
        }
        return f6137b;
    }

    /* JADX INFO: renamed from: a */
    private void m5136a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        C1396f c1396fM5139a;
        JSONObject jSONObjectM5067aI;
        if (jSONObject != null) {
            if (jSONObject2 == null && TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (jSONObject2 != null) {
                    jSONObject.put(C1396f.a.f6065aa, jSONObject2);
                } else {
                    if (TextUtils.isEmpty(str) || (c1396fM5139a = m5139a(str)) == null || (jSONObjectM5067aI = c1396fM5139a.m5067aI()) == null) {
                        return;
                    }
                    jSONObject.put(C1396f.a.f6065aa, jSONObjectM5067aI);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1396f m5139a(String str) {
        return this.f6140e.m5167b(C1175n.m2059a().m2165o(), str);
    }

    /* JADX INFO: renamed from: a */
    public final C1396f m5140a(String str, int i) {
        return this.f6140e.m5164a(C1175n.m2059a().m2165o(), str, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m5141a() {
        Context context = this.f6138c;
        if (context != null) {
            try {
                context.getSharedPreferences(C1169h.f3040E, 0).edit().clear().apply();
            } catch (Error | Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5142a(C1396f c1396f, String str, String str2, String str3, Map<String, Object> map, b bVar, int i) {
        m5143a(c1396f, str, str2, str3, map, bVar, i, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m5143a(C1396f c1396f, String str, String str2, String str3, Map<String, Object> map, b bVar, int i, boolean z) {
        C1335b.m3998a().m4006a((Runnable) new Runnable() { // from class: com.anythink.core.d.h.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f6142a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ b f6143b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C1396f f6144c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f6145d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ String f6146e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Map f6147f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ int f6148g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ boolean f6149h;

            /* JADX INFO: renamed from: com.anythink.core.d.h$1$1 */
            public class C46701 implements InterfaceRunnableC1313b {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean[] f6151a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ a f6152b;

                public C46701(boolean[] zArr2, a aVar2) {
                    zArr = zArr2;
                    aVar = aVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = C1398h.f6136a;
                    zArr[0] = true;
                    aVar.mo2406a(c1396f);
                }
            }

            public AnonymousClass1(String str32, b bVar2, C1396f c1396f2, String str4, String str22, Map map2, int i2, boolean z3) {
                str = str32;
                bVar = bVar2;
                c1396f = c1396f2;
                str = str4;
                str = str22;
                map = map2;
                i = i2;
                z = z3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C46701 c46701;
                a aVar2 = new a(str, bVar);
                C1396f c1396f2 = c1396f;
                String strM5083aa = c1396f2 != null ? c1396f2.m5083aa() : "";
                Map<String, Object> mapM2143d = C1175n.m2059a().m2143d(str);
                C1220am c1220am = new C1220am(str, str, str, strM5083aa, mapM2143d, map);
                c1220am.m2591a(i);
                String str4 = C1398h.f6136a;
                StringBuilder sb = new StringBuilder("requestStrategy() >>> placeId: ");
                sb.append(str);
                sb.append(" fistReqPlaceStrategyFlag: ");
                sb.append(i);
                sb.append(" oldStrategyType: ");
                C1396f c1396f22 = c1396f;
                sb.append(c1396f22 != null ? Integer.valueOf(c1396f22.m5076aR()) : null);
                C1396f c1396f3 = c1396f;
                if (c1396f3 == null) {
                    C1399i unused = C1398h.this.f6141f;
                    C1399i.m5157a(C1398h.this.f6138c, c1220am, new C1397g(C1398h.this, c1220am, aVar2, null));
                    return;
                }
                c1220am.m2592a(c1396f3.m4874av());
                if (z) {
                    C1399i unused2 = C1398h.this.f6141f;
                    C1399i.m5157a(C1398h.this.f6138c, c1220am, new C1397g(C1398h.this, c1220am, aVar2, c1396f));
                    return;
                }
                if (c1396f.m5068aJ()) {
                    aVar2.mo2406a(c1396f);
                    c1220am.m2592a((Map<String, String>) null);
                    C1399i unused3 = C1398h.this.f6141f;
                    C1399i.m5157a(C1398h.this.f6138c, c1220am, new C1397g(C1398h.this, c1220am, aVar2, c1396f));
                    return;
                }
                if (c1396f.m5070aL()) {
                    aVar2.mo2406a(c1396f);
                    aVar2.f6159b = null;
                }
                C1396f c1396fM5150e = C1398h.this.m5150e(str);
                if (c1396fM5150e == null) {
                    c1220am.m2592a((Map<String, String>) null);
                    C1399i unused4 = C1398h.this.f6141f;
                    C1399i.m5157a(C1398h.this.f6138c, c1220am, new C1397g(C1398h.this, c1220am, aVar2, c1396f));
                    return;
                }
                c1220am.m2592a(c1396fM5150e.m4874av());
                if (!((mapM2143d.equals(c1396fM5150e.m5052X()) ^ true) || c1396fM5150e.m5081aW() || C1373r.m4395a().m4399c(C1398h.this.f6138c, str))) {
                    aVar2.mo2406a(c1396f);
                    return;
                }
                boolean[] zArr2 = new boolean[1];
                long jM5091ai = c1396fM5150e.m5091ai();
                InterfaceC1312a interfaceC1312aM3806a = C1315d.m3806a();
                if (jM5091ai == 0) {
                    zArr2[0] = true;
                    aVar2.mo2406a(c1396f);
                    c46701 = null;
                } else {
                    C46701 c467012 = new InterfaceRunnableC1313b() { // from class: com.anythink.core.d.h.1.1

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ boolean[] f6151a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ a f6152b;

                        public C46701(boolean[] zArr22, a aVar22) {
                            zArr = zArr22;
                            aVar = aVar22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str22 = C1398h.f6136a;
                            zArr[0] = true;
                            aVar.mo2406a(c1396f);
                        }
                    };
                    interfaceC1312aM3806a.mo3800a(c467012, jM5091ai, false);
                    c46701 = c467012;
                }
                C1141b.m1860a().m1866b(str);
                C1399i unused5 = C1398h.this.f6141f;
                C1399i.m5157a(C1398h.this.f6138c, c1220am, new C1397g(C1398h.this, c1220am, aVar22, c1396f, interfaceC1312aM3806a, c46701, zArr22));
            }
        }, 2);
    }

    /* JADX INFO: renamed from: a */
    public final void m5144a(Object obj, C1220am c1220am, b bVar, boolean[] zArr, C1396f c1396f) {
        if (!(obj instanceof JSONObject) || c1220am == null) {
            if (bVar != null) {
                if (c1396f == null) {
                    bVar.mo2405a(ErrorCode.getErrorCode(ErrorCode.placeStrategyError, "", "Placement LoadParams error."));
                    return;
                } else {
                    bVar.mo2406a(c1396f);
                    return;
                }
            }
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        try {
            jSONObject.put(C1396f.a.f6067ac, System.currentTimeMillis());
            C1396f c1396fM5140a = m5140a(c1220am.m2594c(), jSONObject.optInt(C1396f.a.f6086av, 0));
            if (c1396fM5140a != null) {
                c1396fM5140a.m4872a(jSONObject, c1220am.m2594c());
            }
        } catch (Throwable th) {
            Log.e(f6136a, "parse place strategy error:" + th.getMessage());
        }
        C1396f c1396fM4919a = C1396f.m4919a(c1220am.m2594c(), jSONObject);
        String strM2594c = c1220am.m2594c();
        if (c1396fM4919a != null) {
            if (c1396fM4919a.m5092aj() != 1) {
                jSONObject = null;
            }
            m5145a(strM2594c, c1396fM4919a, jSONObject, c1396fM4919a.m5076aR());
            int iM2598g = c1220am.m2598g();
            StringBuilder sb = new StringBuilder("handlePlaceStrategyResult() >>> fistReqPlaceStrategyFlag: ");
            sb.append(iM2598g);
            sb.append(" strategyType: ");
            sb.append(c1396fM4919a.m5076aR());
            if (iM2598g == 3 && c1396fM4919a.m5070aL()) {
                c1220am.m2591a(2);
                c1220am.m2592a((Map<String, String>) null);
                this.f6141f.m5158a(this.f6138c, c1220am);
            } else if (c1396fM4919a.m5071aM()) {
                C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.d.h.2

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ C1396f f6154a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ String f6155b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ C1220am f6156c;

                    public AnonymousClass2(C1396f c1396fM4919a2, String strM2594c2, C1220am c1220am2) {
                        c1396f = c1396fM4919a2;
                        str = strM2594c2;
                        c1220am = c1220am2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (c1396f.m5053Y() == 1) {
                            C1373r.m4395a().m4397a(C1398h.this.f6138c, str);
                        }
                        if (!c1396f.m5069aK()) {
                            C1398h.this.f6140e.m5168b(c1220am.m2590a(), str, 2);
                            return;
                        }
                        c1220am.m2591a(1);
                        C1396f c1396fM5149d = C1398h.this.m5149d(str);
                        if (c1396fM5149d != null) {
                            c1220am.m2592a(c1396fM5149d.m4874av());
                        } else {
                            c1220am.m2592a((Map<String, String>) null);
                        }
                        C1398h.this.f6141f.m5158a(C1398h.this.f6138c, c1220am);
                    }
                });
            }
        }
        if (zArr != null && zArr.length > 0 && zArr[0]) {
            if (bVar == null || c1396fM4919a2 == null) {
                return;
            }
            bVar.mo2407b(c1396fM4919a2);
            return;
        }
        if (bVar != null) {
            if (c1396fM4919a2 != null) {
                bVar.mo2406a(c1396fM4919a2);
            } else {
                bVar.mo2405a(ErrorCode.getErrorCode(ErrorCode.placeStrategyError, "", "Placement Service error."));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5145a(String str, C1396f c1396f, JSONObject jSONObject, int i) {
        this.f6140e.m5166a(C1175n.m2059a().m2165o(), str, c1396f, jSONObject, i);
    }

    /* JADX INFO: renamed from: b */
    public final C1396f m5146b(String str) {
        return m5139a(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m5147b(String str, int i) {
        this.f6140e.m5165a(str, i);
    }

    /* JADX INFO: renamed from: c */
    public final C1396f m5148c(String str) {
        return this.f6140e.m5163a(C1175n.m2059a().m2165o(), str);
    }

    /* JADX INFO: renamed from: d */
    public final C1396f m5149d(String str) {
        return this.f6140e.m5164a(C1175n.m2059a().m2165o(), str, 2);
    }

    /* JADX INFO: renamed from: e */
    public final C1396f m5150e(String str) {
        return this.f6140e.m5164a(C1175n.m2059a().m2165o(), str, 0);
    }

    /* JADX INFO: renamed from: f */
    public final C1396f m5151f(String str) {
        String strM2165o = C1175n.m2059a().m2165o();
        if (this.f6140e.m5164a(C1175n.m2059a().m2165o(), str, 0) != null) {
            this.f6140e.m5168b(strM2165o, str, 1);
            return null;
        }
        C1396f c1396fM5164a = this.f6140e.m5164a(strM2165o, str, 1);
        if (c1396fM5164a == null) {
            c1396fM5164a = this.f6139d.m5172b(str);
        }
        if (c1396fM5164a != null) {
            m5145a(str, c1396fM5164a, null, 1);
        }
        return c1396fM5164a;
    }

    /* JADX INFO: renamed from: g */
    public final void m5152g(String str) {
        this.f6140e.m5169c(C1175n.m2059a().m2165o(), str);
    }

    /* JADX INFO: renamed from: h */
    public final void m5153h(String str) {
        this.f6139d.m5171a(str);
    }
}
