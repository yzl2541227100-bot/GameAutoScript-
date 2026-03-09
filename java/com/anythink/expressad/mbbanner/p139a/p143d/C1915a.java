package com.anythink.expressad.mbbanner.p139a.p143d;

import android.content.Context;
import android.os.Handler;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.mbbanner.p139a.p141b.C1906d;
import com.anythink.expressad.mbbanner.p139a.p141b.C1907e;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1909b;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1911d;
import com.anythink.expressad.mbbanner.p139a.p144e.C1918a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.p086d.C1489c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C1915a {

    /* JADX INFO: renamed from: a */
    private static final String f11776a = "a";

    /* JADX INFO: renamed from: h */
    private static volatile C1915a f11777h;

    /* JADX INFO: renamed from: b */
    private Context f11778b = C1175n.m2059a().m2148f();

    /* JADX INFO: renamed from: c */
    private C1918a f11779c = new C1918a();

    /* JADX INFO: renamed from: d */
    private Map<String, C1907e> f11780d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    private Map<String, Boolean> f11781e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    private Map<String, Handler> f11782f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    private Map<String, Integer> f11783g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.a$1 */
    public class AnonymousClass1 implements InterfaceC1911d {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1911d
        /* JADX INFO: renamed from: a */
        public final void mo9972a(String str) {
            synchronized (C1915a.m9974a()) {
                C1915a.this.f11781e.put(str, Boolean.FALSE);
            }
        }
    }

    private C1915a() {
    }

    /* JADX INFO: renamed from: a */
    public static C1915a m9974a() {
        if (f11777h == null) {
            synchronized (C1915a.class) {
                if (f11777h == null) {
                    f11777h = new C1915a();
                }
            }
        }
        return f11777h;
    }

    /* JADX INFO: renamed from: a */
    private void m9976a(String str, C1906d c1906d, InterfaceC1909b interfaceC1909b) {
        if (this.f11778b == null) {
            this.f11779c.m10064a(interfaceC1909b, "Banner Context == null!", str);
            return;
        }
        if (c1906d == null || interfaceC1909b == null) {
            this.f11779c.m10064a(interfaceC1909b, "Banner request parameters or callback empty!", str);
            return;
        }
        Map<String, Boolean> map = this.f11781e;
        if (map != null && map.containsKey(str) && this.f11781e.get(str).booleanValue()) {
            this.f11779c.m10064a(interfaceC1909b, "Current unit is loading!", str);
            return;
        }
        this.f11781e.put(str, Boolean.TRUE);
        new C1916b(this.f11778b, m9977b(str), interfaceC1909b, this.f11779c);
    }

    /* JADX INFO: renamed from: b */
    private C1907e m9977b(String str) {
        if (this.f11780d.containsKey(str)) {
            return this.f11780d.get(str);
        }
        String strM8558f = C1773a.m8548c().m8558f();
        C1486b.m6002a();
        C1489c c1489cM6011c = C1486b.m6011c(strM8558f, str);
        if (c1489cM6011c == null) {
            c1489cM6011c = C1489c.m6069c(str);
        }
        C1907e c1907e = new C1907e(str, "", c1489cM6011c.m6115t() * 1);
        this.f11780d.put(str, c1907e);
        return c1907e;
    }

    /* JADX INFO: renamed from: a */
    public final void m9978a(int i, String str) {
        int iIntValue = this.f11783g.containsKey(str) ? this.f11783g.get(str).intValue() : 0;
        if (i == 1) {
            if (this.f11782f.containsKey(str)) {
                this.f11782f.get(str).removeCallbacksAndMessages(null);
            }
            this.f11783g.put(str, Integer.valueOf(i));
            return;
        }
        if (i == 2) {
            if (iIntValue == 1) {
                if (this.f11782f.containsKey(str)) {
                    this.f11782f.get(str).removeCallbacksAndMessages(null);
                }
                this.f11783g.put(str, Integer.valueOf(i));
                return;
            }
            return;
        }
        if (i == 3) {
            if (iIntValue == 2 || iIntValue == 4) {
                this.f11783g.put(str, 1);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        if (iIntValue == 0) {
            this.f11783g.put(str, 0);
            return;
        }
        if (this.f11782f.containsKey(str)) {
            this.f11782f.get(str).removeCallbacksAndMessages(null);
        }
        this.f11783g.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public final void m9979a(String str) {
        if (this.f11782f.containsKey(str)) {
            this.f11782f.get(str).removeCallbacksAndMessages(null);
            this.f11782f.remove(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9980a(String str, C1782d c1782d, InterfaceC1909b interfaceC1909b) {
        synchronized (m9974a()) {
            Map<String, Boolean> map = this.f11781e;
            if (map != null && map.containsKey(str) && this.f11781e.get(str).booleanValue()) {
                this.f11779c.m10064a(interfaceC1909b, "Current unit is loading!", str);
                return;
            }
            this.f11781e.put(str, Boolean.TRUE);
            new C1916b(this.f11778b, m9977b(str), interfaceC1909b, this.f11779c).m9999a(str, c1782d, new InterfaceC1911d() { // from class: com.anythink.expressad.mbbanner.a.d.a.1
                public AnonymousClass1() {
                }

                @Override // com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1911d
                /* JADX INFO: renamed from: a */
                public final void mo9972a(String str2) {
                    synchronized (C1915a.m9974a()) {
                        C1915a.this.f11781e.put(str2, Boolean.FALSE);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9981b() {
        Map<String, C1907e> map = this.f11780d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f11781e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f11782f;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f11782f.clear();
        }
        Map<String, Integer> map4 = this.f11783g;
        if (map4 != null) {
            map4.clear();
        }
    }
}
