package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.proguard.C3412ad;
import com.umeng.commonsdk.proguard.C3418aj;
import com.umeng.commonsdk.statistics.C3483b;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.proto.C3524a;
import com.umeng.commonsdk.statistics.proto.C3526c;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3496e {

    /* JADX INFO: renamed from: a */
    public static final long f19214a = 86400000;

    /* JADX INFO: renamed from: b */
    public static C3496e f19215b;

    /* JADX INFO: renamed from: j */
    private static Object f19216j = new Object();

    /* JADX INFO: renamed from: d */
    private File f19218d;

    /* JADX INFO: renamed from: f */
    private long f19220f;

    /* JADX INFO: renamed from: i */
    private a f19223i;

    /* JADX INFO: renamed from: c */
    private final String f19217c = "umeng_it.cache";

    /* JADX INFO: renamed from: e */
    private C3526c f19219e = null;

    /* JADX INFO: renamed from: h */
    private Set<AbstractC3492a> f19222h = new HashSet();

    /* JADX INFO: renamed from: g */
    private long f19221g = 86400000;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private Context f19224a;

        /* JADX INFO: renamed from: b */
        private Set<String> f19225b = new HashSet();

        public a(Context context) {
            this.f19224a = context;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m16388a() {
            if (!this.f19225b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = this.f19225b.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(',');
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.f19224a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        /* JADX INFO: renamed from: a */
        public synchronized boolean m16389a(String str) {
            return !this.f19225b.contains(str);
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m16390b() {
            String[] strArrSplit;
            String string = PreferenceWrapper.getDefault(this.f19224a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null) {
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f19225b.add(str);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m16391b(String str) {
            this.f19225b.add(str);
        }

        /* JADX INFO: renamed from: c */
        public void m16392c(String str) {
            this.f19225b.remove(str);
        }
    }

    public C3496e(Context context) {
        this.f19223i = null;
        this.f19218d = new File(context.getFilesDir(), "umeng_it.cache");
        a aVar = new a(context);
        this.f19223i = aVar;
        aVar.m16390b();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C3496e m16376a(Context context) {
        if (f19215b == null) {
            C3496e c3496e = new C3496e(context);
            f19215b = c3496e;
            c3496e.m16378a(new C3497f(context));
            f19215b.m16378a(new C3493b(context));
            f19215b.m16378a(new C3510s(context));
            f19215b.m16378a(new C3495d(context));
            f19215b.m16378a(new C3494c(context));
            f19215b.m16378a(new C3499h(context));
            f19215b.m16378a(new C3502k());
            f19215b.m16378a(new C3511t(context));
            C3509r c3509r = new C3509r(context);
            if (!TextUtils.isEmpty(c3509r.mo16375f())) {
                f19215b.m16378a(c3509r);
            }
            C3501j c3501j = new C3501j(context);
            if (c3501j.m16415g()) {
                f19215b.m16378a(c3501j);
                f19215b.m16378a(new C3500i(context));
                c3501j.m16417i();
            }
            f19215b.m16378a(new C3508q(context));
            f19215b.m16378a(new C3505n(context));
            f19215b.m16378a(new C3507p(context));
            f19215b.m16378a(new C3506o(context));
            f19215b.m16378a(new C3504m(context));
            f19215b.m16378a(new C3503l(context));
            f19215b.m16386e();
        }
        return f19215b;
    }

    /* JADX INFO: renamed from: a */
    private void m16377a(C3526c c3526c) {
        byte[] bArrM15741a;
        synchronized (f19216j) {
            if (c3526c != null) {
                try {
                    synchronized (this) {
                        bArrM15741a = new C3418aj().m15741a(c3526c);
                    }
                    if (bArrM15741a != null) {
                        HelperUtils.writeFile(this.f19218d, bArrM15741a);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m16378a(AbstractC3492a abstractC3492a) {
        if (this.f19223i.m16389a(abstractC3492a.m16371b())) {
            return this.f19222h.add(abstractC3492a);
        }
        if (!C3483b.f19146f) {
            return false;
        }
        MLog.m16287w("invalid domain: " + abstractC3492a.m16371b());
        return false;
    }

    /* JADX INFO: renamed from: g */
    private synchronized void m16379g() {
        C3526c c3526c = new C3526c();
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (AbstractC3492a abstractC3492a : this.f19222h) {
            if (abstractC3492a.m16372c()) {
                if (abstractC3492a.m16373d() != null) {
                    map.put(abstractC3492a.m16371b(), abstractC3492a.m16373d());
                }
                if (abstractC3492a.m16374e() != null && !abstractC3492a.m16374e().isEmpty()) {
                    arrayList.addAll(abstractC3492a.m16374e());
                }
            }
        }
        c3526c.m16526a(arrayList);
        c3526c.m16527a(map);
        synchronized (this) {
            this.f19219e = c3526c;
        }
    }

    /* JADX INFO: renamed from: h */
    private C3526c m16380h() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (f19216j) {
            if (!this.f19218d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f19218d);
            } catch (Exception e) {
                e = e;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
                HelperUtils.safeClose(fileInputStream);
                throw th;
            }
            try {
                try {
                    byte[] streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                    C3526c c3526c = new C3526c();
                    new C3412ad().m15727a(c3526c, streamToByteArray);
                    HelperUtils.safeClose(fileInputStream);
                    return c3526c;
                } catch (Throwable th3) {
                    th = th3;
                    HelperUtils.safeClose(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                HelperUtils.safeClose(fileInputStream);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m16381a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f19220f >= this.f19221g) {
            boolean z = false;
            for (AbstractC3492a abstractC3492a : this.f19222h) {
                if (abstractC3492a.m16372c() && abstractC3492a.m16370a()) {
                    z = true;
                    if (!abstractC3492a.m16372c()) {
                        this.f19223i.m16391b(abstractC3492a.m16371b());
                    }
                }
            }
            if (z) {
                m16379g();
                this.f19223i.m16388a();
                m16387f();
            }
            this.f19220f = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16382a(long j) {
        this.f19221g = j;
    }

    /* JADX INFO: renamed from: b */
    public synchronized C3526c m16383b() {
        return this.f19219e;
    }

    /* JADX INFO: renamed from: c */
    public String m16384c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m16385d() {
        boolean z = false;
        for (AbstractC3492a abstractC3492a : this.f19222h) {
            if (abstractC3492a.m16372c() && abstractC3492a.m16374e() != null && !abstractC3492a.m16374e().isEmpty()) {
                abstractC3492a.m16369a((List<C3524a>) null);
                z = true;
            }
        }
        if (z) {
            this.f19219e.m16532b(false);
            m16387f();
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m16386e() {
        C3526c c3526cM16380h = m16380h();
        if (c3526cM16380h == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f19222h.size());
        synchronized (this) {
            this.f19219e = c3526cM16380h;
            for (AbstractC3492a abstractC3492a : this.f19222h) {
                abstractC3492a.m16368a(this.f19219e);
                if (!abstractC3492a.m16372c()) {
                    arrayList.add(abstractC3492a);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f19222h.remove((AbstractC3492a) it.next());
            }
            m16379g();
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m16387f() {
        C3526c c3526c = this.f19219e;
        if (c3526c != null) {
            m16377a(c3526c);
        }
    }
}
