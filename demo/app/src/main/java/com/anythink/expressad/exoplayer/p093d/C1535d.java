package com.anythink.expressad.exoplayer.p093d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p093d.C1533b;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1534c;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1537f;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1540i;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1541j;
import com.anythink.expressad.exoplayer.p094e.p095a.C1557h;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.d */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(18)
public final class C1535d<T extends InterfaceC1540i> implements C1533b.c<T>, InterfaceC1538g<T> {

    /* JADX INFO: renamed from: a */
    public static final String f7963a = "PRCustomData";

    /* JADX INFO: renamed from: b */
    public static final int f7964b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f7965c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f7966d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f7967e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f7968f = 3;

    /* JADX INFO: renamed from: h */
    private static final String f7969h = "DefaultDrmSessionMgr";

    /* JADX INFO: renamed from: g */
    public volatile C1535d<T>.c f7970g;

    /* JADX INFO: renamed from: i */
    private final UUID f7971i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC1541j<T> f7972j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC1545n f7973k;

    /* JADX INFO: renamed from: l */
    private final HashMap<String, String> f7974l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC1534c.a f7975m;

    /* JADX INFO: renamed from: n */
    private final boolean f7976n;

    /* JADX INFO: renamed from: o */
    private final int f7977o;

    /* JADX INFO: renamed from: p */
    private final List<C1533b<T>> f7978p;

    /* JADX INFO: renamed from: q */
    private final List<C1533b<T>> f7979q;

    /* JADX INFO: renamed from: r */
    private Looper f7980r;

    /* JADX INFO: renamed from: s */
    private int f7981s;

    /* JADX INFO: renamed from: t */
    private byte[] f7982t;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.d$a */
    @Deprecated
    public interface a extends InterfaceC1534c {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.d$b */
    public class b implements InterfaceC1541j.f<T> {
        private b() {
        }

        public /* synthetic */ b(C1535d c1535d, byte b) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j.f
        /* JADX INFO: renamed from: a */
        public final void mo6763a(byte[] bArr, int i) {
            if (C1535d.this.f7981s == 0) {
                C1535d.this.f7970g.obtainMessage(i, bArr).sendToTarget();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.d$c */
    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (C1533b c1533b : C1535d.this.f7978p) {
                if (c1533b.m6724b(bArr)) {
                    c1533b.m6720a(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.d$d */
    public static final class d extends Exception {
        private d(UUID uuid) {
            super("Media does not support uuid: ".concat(String.valueOf(uuid)));
        }

        public /* synthetic */ d(UUID uuid, byte b) {
            this(uuid);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.d$e */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    private C1535d(UUID uuid, InterfaceC1541j<T> interfaceC1541j, InterfaceC1545n interfaceC1545n, HashMap<String, String> map) {
        this(uuid, (InterfaceC1541j) interfaceC1541j, interfaceC1545n, map, false, 3);
    }

    @Deprecated
    private C1535d(UUID uuid, InterfaceC1541j<T> interfaceC1541j, InterfaceC1545n interfaceC1545n, HashMap<String, String> map, Handler handler, InterfaceC1534c interfaceC1534c) {
        this(uuid, interfaceC1541j, interfaceC1545n, map);
        if (handler == null || interfaceC1534c == null) {
            return;
        }
        m6760a(handler, interfaceC1534c);
    }

    @Deprecated
    private C1535d(UUID uuid, InterfaceC1541j<T> interfaceC1541j, InterfaceC1545n interfaceC1545n, HashMap<String, String> map, Handler handler, InterfaceC1534c interfaceC1534c, boolean z) {
        this(uuid, interfaceC1541j, interfaceC1545n, map, z);
        if (handler == null || interfaceC1534c == null) {
            return;
        }
        m6760a(handler, interfaceC1534c);
    }

    @Deprecated
    private C1535d(UUID uuid, InterfaceC1541j<T> interfaceC1541j, InterfaceC1545n interfaceC1545n, HashMap<String, String> map, Handler handler, InterfaceC1534c interfaceC1534c, boolean z, int i) {
        this(uuid, interfaceC1541j, interfaceC1545n, map, z, i);
        if (handler == null || interfaceC1534c == null) {
            return;
        }
        m6760a(handler, interfaceC1534c);
    }

    private C1535d(UUID uuid, InterfaceC1541j<T> interfaceC1541j, InterfaceC1545n interfaceC1545n, HashMap<String, String> map, boolean z) {
        this(uuid, interfaceC1541j, interfaceC1545n, map, z, 3);
    }

    private C1535d(UUID uuid, InterfaceC1541j<T> interfaceC1541j, InterfaceC1545n interfaceC1545n, HashMap<String, String> map, boolean z, int i) {
        C1711a.m8005a(uuid);
        C1711a.m8005a(interfaceC1541j);
        C1711a.m8011a(!C1500b.f7469bi.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7971i = uuid;
        this.f7972j = interfaceC1541j;
        this.f7973k = interfaceC1545n;
        this.f7974l = map;
        this.f7975m = new InterfaceC1534c.a();
        this.f7976n = z;
        this.f7977o = i;
        byte b2 = 0;
        this.f7981s = 0;
        this.f7978p = new ArrayList();
        this.f7979q = new ArrayList();
        if (z) {
            interfaceC1541j.mo6783a("sessionSharing", "enable");
        }
        interfaceC1541j.mo6781a(new b(this, b2));
    }

    /* JADX INFO: renamed from: a */
    private static C1535d<C1542k> m6744a(InterfaceC1545n interfaceC1545n, String str) {
        HashMap map;
        if (TextUtils.isEmpty(str)) {
            map = null;
        } else {
            map = new HashMap();
            map.put(f7963a, str);
        }
        return m6748a(C1500b.f7472bl, interfaceC1545n, (HashMap<String, String>) map);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    private static C1535d<C1542k> m6745a(InterfaceC1545n interfaceC1545n, String str, Handler handler, InterfaceC1534c interfaceC1534c) {
        HashMap map;
        if (TextUtils.isEmpty(str)) {
            map = null;
        } else {
            map = new HashMap();
            map.put(f7963a, str);
        }
        C1535d<C1542k> c1535dM6748a = m6748a(C1500b.f7472bl, interfaceC1545n, (HashMap<String, String>) map);
        if (handler != null && interfaceC1534c != null) {
            c1535dM6748a.m6760a(handler, interfaceC1534c);
        }
        return c1535dM6748a;
    }

    /* JADX INFO: renamed from: a */
    private static C1535d<C1542k> m6746a(InterfaceC1545n interfaceC1545n, HashMap<String, String> map) {
        return m6748a(C1500b.f7471bk, interfaceC1545n, map);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    private static C1535d<C1542k> m6747a(InterfaceC1545n interfaceC1545n, HashMap<String, String> map, Handler handler, InterfaceC1534c interfaceC1534c) {
        C1535d<C1542k> c1535dM6748a = m6748a(C1500b.f7471bk, interfaceC1545n, map);
        if (handler != null && interfaceC1534c != null) {
            c1535dM6748a.m6760a(handler, interfaceC1534c);
        }
        return c1535dM6748a;
    }

    /* JADX INFO: renamed from: a */
    private static C1535d<C1542k> m6748a(UUID uuid, InterfaceC1545n interfaceC1545n, HashMap<String, String> map) {
        return new C1535d<>(uuid, (InterfaceC1541j) C1543l.m6803a(uuid), interfaceC1545n, map, false, 3);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    private static C1535d<C1542k> m6749a(UUID uuid, InterfaceC1545n interfaceC1545n, HashMap<String, String> map, Handler handler, InterfaceC1534c interfaceC1534c) {
        C1535d<C1542k> c1535dM6748a = m6748a(uuid, interfaceC1545n, map);
        if (handler != null && interfaceC1534c != null) {
            c1535dM6748a.m6760a(handler, interfaceC1534c);
        }
        return c1535dM6748a;
    }

    /* JADX INFO: renamed from: a */
    private static C1536e.a m6750a(C1536e c1536e, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c1536e.f7986b);
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= c1536e.f7986b) {
                break;
            }
            C1536e.a aVarM6768a = c1536e.m6768a(i);
            if (!aVarM6768a.m6775a(uuid) && (!C1500b.f7470bj.equals(uuid) || !aVarM6768a.m6775a(C1500b.f7469bi))) {
                z3 = false;
            }
            if (z3 && (aVarM6768a.f7991c != null || z)) {
                arrayList.add(aVarM6768a);
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (C1500b.f7471bk.equals(uuid)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C1536e.a aVar = (C1536e.a) arrayList.get(i2);
                int iM6939b = aVar.m6774a() ? C1557h.m6939b(aVar.f7991c) : -1;
                int i3 = C1717af.f9627a;
                if (i3 < 23 && iM6939b == 0) {
                    return aVar;
                }
                if (i3 >= 23 && iM6939b == 1) {
                    return aVar;
                }
            }
        }
        return (C1536e.a) arrayList.get(0);
    }

    /* JADX INFO: renamed from: a */
    private String m6751a(String str) {
        return this.f7972j.mo6780a(str);
    }

    /* JADX INFO: renamed from: a */
    private void m6753a(int i, byte[] bArr) {
        C1711a.m8012b(this.f7978p.isEmpty());
        if (i == 1 || i == 3) {
            C1711a.m8005a(bArr);
        }
        this.f7981s = i;
        this.f7982t = bArr;
    }

    /* JADX INFO: renamed from: a */
    private void m6754a(InterfaceC1534c interfaceC1534c) {
        this.f7975m.m6740a(interfaceC1534c);
    }

    /* JADX INFO: renamed from: a */
    private void m6755a(String str, String str2) {
        this.f7972j.mo6783a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m6756a(String str, byte[] bArr) {
        this.f7972j.mo6784a(str, bArr);
    }

    /* JADX INFO: renamed from: b */
    private byte[] m6758b(String str) {
        return this.f7972j.mo6791b(str);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1538g
    /* JADX INFO: renamed from: a */
    public final InterfaceC1537f<T> mo6759a(Looper looper, C1536e c1536e) {
        C1536e.a aVar;
        Looper looper2 = this.f7980r;
        byte b2 = 0;
        C1711a.m8012b(looper2 == null || looper2 == looper);
        if (this.f7978p.isEmpty()) {
            this.f7980r = looper;
            if (this.f7970g == null) {
                this.f7970g = new c(looper);
            }
        }
        C1533b<T> c1533b = null;
        if (this.f7982t == null) {
            C1536e.a aVarM6750a = m6750a(c1536e, this.f7971i, false);
            if (aVarM6750a == null) {
                d dVar = new d(this.f7971i, b2);
                this.f7975m.m6741a(dVar);
                return new C1539h(new InterfaceC1537f.a(dVar));
            }
            aVar = aVarM6750a;
        } else {
            aVar = null;
        }
        if (this.f7976n) {
            byte[] bArr = aVar != null ? aVar.f7991c : null;
            Iterator<C1533b<T>> it = this.f7978p.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1533b<T> next = it.next();
                if (next.m6722a(bArr)) {
                    c1533b = next;
                    break;
                }
            }
        } else if (!this.f7978p.isEmpty()) {
            c1533b = this.f7978p.get(0);
        }
        if (c1533b == null) {
            C1533b<T> c1533b2 = new C1533b<>(this.f7971i, this.f7972j, this, aVar, this.f7981s, this.f7982t, this.f7974l, this.f7973k, looper, this.f7975m, this.f7977o);
            this.f7978p.add(c1533b2);
            c1533b = c1533b2;
        }
        c1533b.m6719a();
        return c1533b;
    }

    @Override // com.anythink.expressad.exoplayer.p093d.C1533b.c
    /* JADX INFO: renamed from: a */
    public final void mo6735a() {
        Iterator<C1533b<T>> it = this.f7979q.iterator();
        while (it.hasNext()) {
            it.next().m6726d();
        }
        this.f7979q.clear();
    }

    /* JADX INFO: renamed from: a */
    public final void m6760a(Handler handler, InterfaceC1534c interfaceC1534c) {
        this.f7975m.m6739a(handler, interfaceC1534c);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.C1533b.c
    /* JADX INFO: renamed from: a */
    public final void mo6736a(C1533b<T> c1533b) {
        this.f7979q.add(c1533b);
        if (this.f7979q.size() == 1) {
            c1533b.m6725c();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1538g
    /* JADX INFO: renamed from: a */
    public final void mo6761a(InterfaceC1537f<T> interfaceC1537f) {
        if (interfaceC1537f instanceof C1539h) {
            return;
        }
        C1533b<T> c1533b = (C1533b) interfaceC1537f;
        if (c1533b.m6723b()) {
            this.f7978p.remove(c1533b);
            if (this.f7979q.size() > 1 && this.f7979q.get(0) == c1533b) {
                this.f7979q.get(1).m6725c();
            }
            this.f7979q.remove(c1533b);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p093d.C1533b.c
    /* JADX INFO: renamed from: a */
    public final void mo6737a(Exception exc) {
        Iterator<C1533b<T>> it = this.f7979q.iterator();
        while (it.hasNext()) {
            it.next().m6721a(exc);
        }
        this.f7979q.clear();
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1538g
    /* JADX INFO: renamed from: a */
    public final boolean mo6762a(@NonNull C1536e c1536e) {
        if (this.f7982t != null) {
            return true;
        }
        if (m6750a(c1536e, this.f7971i, true) == null) {
            if (c1536e.f7986b != 1 || !c1536e.m6768a(0).m6775a(C1500b.f7469bi)) {
                return false;
            }
            Log.w(f7969h, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f7971i);
        }
        String str = c1536e.f7985a;
        if (str == null || C1500b.f7464bd.equals(str)) {
            return true;
        }
        return !(C1500b.f7465be.equals(str) || C1500b.f7467bg.equals(str) || C1500b.f7466bf.equals(str)) || C1717af.f9627a >= 25;
    }
}
