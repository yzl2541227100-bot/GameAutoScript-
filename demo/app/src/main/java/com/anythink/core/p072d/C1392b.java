package com.anythink.core.p072d;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.C1179c;
import com.anythink.core.common.C1305l;
import com.anythink.core.common.C1372q;
import com.anythink.core.common.C1389w;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1182c;
import com.anythink.core.common.p052c.C1183d;
import com.anythink.core.common.p054e.C1200c;
import com.anythink.core.common.p055f.C1226as;
import com.anythink.core.common.p058h.C1276d;
import com.anythink.core.common.p058h.C1279g;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p060i.C1293e;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C1392b {

    /* JADX INFO: renamed from: a */
    public static final String f5838a = "b";

    /* JADX INFO: renamed from: c */
    private static volatile C1392b f5839c;

    /* JADX INFO: renamed from: d */
    private static volatile C1391a f5840d;

    /* JADX INFO: renamed from: e */
    private Context f5842e;

    /* JADX INFO: renamed from: h */
    private String f5845h;

    /* JADX INFO: renamed from: g */
    private Object f5844g = new Object();

    /* JADX INFO: renamed from: f */
    private boolean f5843f = false;

    /* JADX INFO: renamed from: b */
    public List<a> f5841b = Collections.synchronizedList(new ArrayList(3));

    /* JADX INFO: renamed from: com.anythink.core.d.b$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f5846a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5847b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f5848c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C1391a f5849d;

        public AnonymousClass1(Context context, String str, JSONObject jSONObject, C1391a c1391a) {
            context = context;
            str = str;
            jSONObject = jSONObject;
            c1391a = c1391a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1183d.m2215a(C1182c.m2210a(context)).m2224a(str, jSONObject.toString(), C1392b.this.f5845h);
            C1355s.m4235a(context, C1169h.f3065p, C1169h.v.f3274l, c1391a.m4728Y());
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.d.b$2 */
    public class AnonymousClass2 implements InterfaceC1283k {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5851a;

        public AnonymousClass2(String str) {
            str = str;
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadCanceled(int i) {
            C1392b.m4854b(C1392b.this);
            C1392b.this.m4859e();
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadError(int i, String str, AdError adError) {
            C1392b.m4854b(C1392b.this);
            String str2 = C1392b.f5838a;
            C1392b.this.m4859e();
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadFinish(int i, Object obj) {
            C1392b.m4854b(C1392b.this);
            C1392b c1392b = C1392b.this;
            C1392b.m4850a(c1392b, c1392b.f5842e, obj, str);
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadStart(int i) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.d.b$3 */
    public class AnonymousClass3 implements InterfaceC1283k {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f5853a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5854b;

        public AnonymousClass3(Context context, String str) {
            context = context;
            str = str;
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadCanceled(int i) {
            C1392b.this.m4859e();
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadError(int i, String str, AdError adError) {
            C1392b.this.m4859e();
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadFinish(int i, Object obj) {
            C1392b.m4850a(C1392b.this, context, obj, str);
        }

        @Override // com.anythink.core.common.p058h.InterfaceC1283k
        public final void onLoadStart(int i) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.d.b$4 */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1305l.m3759a().m3761a(C1392b.f5840d.m4766k());
            C1293e.m3713a().m3718a(C1392b.f5840d);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.d.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m4867a();

        /* JADX INFO: renamed from: b */
        void m4868b();
    }

    private C1392b(Context context) {
        this.f5842e = context;
        this.f5845h = C1200c.m2314a().m2336b() ? C1169h.v.f3264b : C1169h.v.f3263a;
    }

    /* JADX INFO: renamed from: a */
    public static long m4842a() {
        if (f5840d == null || f5840d.m4715L() == 0) {
            return 51200L;
        }
        return f5840d.m4715L();
    }

    /* JADX INFO: renamed from: a */
    private C1391a m4843a(Context context, String str) {
        C1226as c1226as;
        List<C1226as> listM2225a = C1183d.m2215a(C1182c.m2210a(context)).m2225a(str, this.f5845h);
        if (listM2225a != null && listM2225a.size() > 0 && (c1226as = listM2225a.get(0)) != null) {
            try {
                C1391a c1391aM4641a = C1391a.m4641a(new JSONObject(c1226as.m2649d()));
                if (c1391aM4641a != null) {
                    c1391aM4641a.m4732a(Long.parseLong(c1226as.m2643a()));
                }
                return c1391aM4641a;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private C1391a m4844a(Context context, String str, JSONObject jSONObject) {
        try {
            C1391a c1391aM4865b = m4845a(context).m4865b(str);
            if (!c1391aM4865b.m4712I()) {
                c1391aM4865b.m4872a(jSONObject, null);
            }
        } catch (Throwable unused) {
        }
        C1391a c1391aM4641a = C1391a.m4641a(jSONObject);
        c1391aM4641a.m4732a(System.currentTimeMillis());
        C1335b.m3998a().m4005a(new Runnable() { // from class: com.anythink.core.d.b.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f5846a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f5847b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ JSONObject f5848c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C1391a f5849d;

            public AnonymousClass1(Context context2, String str2, JSONObject jSONObject2, C1391a c1391aM4641a2) {
                context = context2;
                str = str2;
                jSONObject = jSONObject2;
                c1391a = c1391aM4641a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1183d.m2215a(C1182c.m2210a(context)).m2224a(str, jSONObject.toString(), C1392b.this.f5845h);
                C1355s.m4235a(context, C1169h.f3065p, C1169h.v.f3274l, c1391a.m4728Y());
            }
        });
        return c1391aM4641a2;
    }

    /* JADX INFO: renamed from: a */
    public static C1392b m4845a(Context context) {
        if (f5839c == null) {
            synchronized (C1392b.class) {
                if (f5839c == null) {
                    f5839c = new C1392b(context);
                }
            }
        }
        return f5839c;
    }

    /* JADX INFO: renamed from: a */
    private static void m4847a(Context context, C1391a c1391a) {
        if (c1391a == null) {
            return;
        }
        String strM4771p = c1391a.m4771p();
        if (TextUtils.isEmpty(strM4771p)) {
            return;
        }
        C1378b.m4482a(context).m4495a(new C1381e(3, strM4771p), (C1378b.a) null);
    }

    /* JADX INFO: renamed from: a */
    private void m4848a(Context context, Object obj, String str) {
        if (obj instanceof JSONObject) {
            C1391a c1391aM4844a = m4844a(context, str, (JSONObject) obj);
            if (c1391aM4844a != null) {
                f5840d = c1391aM4844a;
                String strM4776u = c1391aM4844a.m4776u();
                if (!TextUtils.isEmpty(strM4776u) && TextUtils.isEmpty(C1175n.m2059a().m2178y())) {
                    C1175n.m2059a().m2156j(strM4776u);
                }
                C1372q.m4390a(context).m4394a(f5840d);
                C1391a c1391a = f5840d;
                if (c1391a != null) {
                    String strM4771p = c1391a.m4771p();
                    if (!TextUtils.isEmpty(strM4771p)) {
                        C1378b.m4482a(context).m4495a(new C1381e(3, strM4771p), (C1378b.a) null);
                    }
                }
                C1335b.m3998a().m4005a(new AnonymousClass4());
                C1389w.m4583a().m4622a(f5840d.m4753b());
                C1179c.m2193a().m2195a(f5840d.m4757d());
            }
            m4859e();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4849a(a aVar) {
        synchronized (this.f5844g) {
            if (this.f5844g != null) {
                this.f5841b.add(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4850a(C1392b c1392b, Context context, Object obj, String str) {
        if (obj instanceof JSONObject) {
            C1391a c1391aM4844a = c1392b.m4844a(context, str, (JSONObject) obj);
            if (c1391aM4844a != null) {
                f5840d = c1391aM4844a;
                String strM4776u = c1391aM4844a.m4776u();
                if (!TextUtils.isEmpty(strM4776u) && TextUtils.isEmpty(C1175n.m2059a().m2178y())) {
                    C1175n.m2059a().m2156j(strM4776u);
                }
                C1372q.m4390a(context).m4394a(f5840d);
                C1391a c1391a = f5840d;
                if (c1391a != null) {
                    String strM4771p = c1391a.m4771p();
                    if (!TextUtils.isEmpty(strM4771p)) {
                        C1378b.m4482a(context).m4495a(new C1381e(3, strM4771p), (C1378b.a) null);
                    }
                }
                C1335b.m3998a().m4005a(c1392b.new AnonymousClass4());
                C1389w.m4583a().m4622a(f5840d.m4753b());
                C1179c.m2193a().m2195a(f5840d.m4757d());
            }
            c1392b.m4859e();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4851a(JSONObject jSONObject) {
        JSONObject jSONObjectM4751ar;
        try {
            C1391a c1391aM4865b = m4865b(C1175n.m2059a().m2165o());
            if (c1391aM4865b == null || (jSONObjectM4751ar = c1391aM4865b.m4751ar()) == null) {
                return;
            }
            jSONObject.put("a_c", jSONObjectM4751ar);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4852b(Context context) {
        this.f5842e = context;
    }

    /* JADX INFO: renamed from: b */
    private void m4853b(a aVar) {
        synchronized (this.f5844g) {
            if (aVar != null) {
                this.f5841b.remove(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m4854b(C1392b c1392b) {
        c1392b.f5843f = false;
        return false;
    }

    /* JADX INFO: renamed from: d */
    private Context m4857d() {
        return this.f5842e;
    }

    /* JADX INFO: renamed from: e */
    public void m4859e() {
        synchronized (this.f5844g) {
            Iterator<a> it = this.f5841b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f5841b.clear();
        }
    }

    /* JADX INFO: renamed from: f */
    private static C1391a m4860f() {
        C1391a c1391a = new C1391a();
        c1391a.f5738b = true;
        c1391a.m4724U();
        c1391a.m4754b("0");
        c1391a.m4732a(0L);
        c1391a.m4734aa();
        c1391a.m4737ad();
        c1391a.m4739af();
        c1391a.m4755c("");
        c1391a.m4742ai();
        c1391a.m4744ak();
        c1391a.m4758d("");
        c1391a.m4722S();
        c1391a.m4716M();
        c1391a.m4708E();
        c1391a.m4710G();
        c1391a.m4733a("[\"com.anythink\"]");
        c1391a.m4704A();
        c1391a.m4768m();
        return c1391a;
    }

    /* JADX INFO: renamed from: g */
    private boolean m4861g() {
        return this.f5843f;
    }

    /* JADX INFO: renamed from: h */
    private static void m4862h() {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4863a(String str, String str2) {
        if (this.f5843f) {
            return;
        }
        this.f5843f = true;
        new C1276d(this.f5842e, str, str2, f5840d.m4874av()).mo3639a(0, (InterfaceC1283k) new InterfaceC1283k() { // from class: com.anythink.core.d.b.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f5851a;

            public AnonymousClass2(String str3) {
                str = str3;
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadCanceled(int i) {
                C1392b.m4854b(C1392b.this);
                C1392b.this.m4859e();
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadError(int i, String str3, AdError adError) {
                C1392b.m4854b(C1392b.this);
                String str22 = C1392b.f5838a;
                C1392b.this.m4859e();
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadFinish(int i, Object obj) {
                C1392b.m4854b(C1392b.this);
                C1392b c1392b = C1392b.this;
                C1392b.m4850a(c1392b, c1392b.f5842e, obj, str);
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadStart(int i) {
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4864a(String str) {
        C1391a c1391aM4865b = m4865b(str);
        if (c1391aM4865b != null) {
            C1395e c1395eM4730a = c1391aM4865b.m4730a();
            long jM4723T = c1391aM4865b.m4723T();
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = c1391aM4865b.m4717N() + jM4723T <= jCurrentTimeMillis;
            boolean z3 = c1395eM4730a != null && c1391aM4865b.m4717N() + c1395eM4730a.m4898a() <= jCurrentTimeMillis;
            boolean z4 = c1391aM4865b.f5739c != null ? !r11.equals(r4) : C1175n.m2059a().m2159l() != null;
            if (!z && !z3 && !z4) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C1391a m4865b(String str) {
        if (f5840d == null) {
            synchronized (this) {
                if (f5840d == null) {
                    try {
                        if (this.f5842e == null) {
                            this.f5842e = C1175n.m2059a().m2148f();
                        }
                        f5840d = m4843a(this.f5842e, str);
                    } catch (Throwable unused) {
                    }
                    if (f5840d == null) {
                        C1391a c1391a = new C1391a();
                        c1391a.f5738b = true;
                        c1391a.m4724U();
                        c1391a.m4754b("0");
                        c1391a.m4732a(0L);
                        c1391a.m4734aa();
                        c1391a.m4737ad();
                        c1391a.m4739af();
                        c1391a.m4755c("");
                        c1391a.m4742ai();
                        c1391a.m4744ak();
                        c1391a.m4758d("");
                        c1391a.m4722S();
                        c1391a.m4716M();
                        c1391a.m4708E();
                        c1391a.m4710G();
                        c1391a.m4733a("[\"com.anythink\"]");
                        c1391a.m4704A();
                        c1391a.m4768m();
                        f5840d = c1391a;
                    }
                }
            }
        }
        return f5840d;
    }

    /* JADX INFO: renamed from: b */
    public final void m4866b() {
        C1175n c1175nM2059a = C1175n.m2059a();
        String strM2165o = c1175nM2059a.m2165o();
        String strM2167p = c1175nM2059a.m2167p();
        Context context = this.f5842e;
        if (context == null || TextUtils.isEmpty(strM2165o) || TextUtils.isEmpty(strM2167p)) {
            return;
        }
        C1391a c1391aM4865b = m4865b(strM2165o);
        Map<String, String> map = new HashMap<>();
        if (!c1391aM4865b.f5738b) {
            map = c1391aM4865b.m4874av();
        }
        new C1279g(context, strM2165o, strM2167p, map).mo3639a(0, (InterfaceC1283k) new InterfaceC1283k() { // from class: com.anythink.core.d.b.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f5853a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f5854b;

            public AnonymousClass3(Context context2, String strM2165o2) {
                context = context2;
                str = strM2165o2;
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadCanceled(int i) {
                C1392b.this.m4859e();
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadError(int i, String str, AdError adError) {
                C1392b.this.m4859e();
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadFinish(int i, Object obj) {
                C1392b.m4850a(C1392b.this, context, obj, str);
            }

            @Override // com.anythink.core.common.p058h.InterfaceC1283k
            public final void onLoadStart(int i) {
            }
        });
    }
}
