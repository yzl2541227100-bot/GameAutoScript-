package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.proto.C3524a;
import com.umeng.commonsdk.statistics.proto.C3525b;
import com.umeng.commonsdk.statistics.proto.C3526c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private final int f19203a = 10;

    /* JADX INFO: renamed from: b */
    private final int f19204b = 20;

    /* JADX INFO: renamed from: c */
    private final String f19205c;

    /* JADX INFO: renamed from: d */
    private List<C3524a> f19206d;

    /* JADX INFO: renamed from: e */
    private C3525b f19207e;

    public AbstractC3492a(String str) {
        this.f19205c = str;
    }

    /* JADX INFO: renamed from: g */
    private boolean m16365g() {
        C3525b c3525b = this.f19207e;
        String strM16496b = c3525b == null ? null : c3525b.m16496b();
        int iM16504h = c3525b == null ? 0 : c3525b.m16504h();
        String strM16366a = m16366a(mo16375f());
        if (strM16366a == null || strM16366a.equals(strM16496b)) {
            return false;
        }
        if (c3525b == null) {
            c3525b = new C3525b();
        }
        c3525b.m16493a(strM16366a);
        c3525b.m16492a(System.currentTimeMillis());
        c3525b.m16491a(iM16504h + 1);
        C3524a c3524a = new C3524a();
        c3524a.m16455a(this.f19205c);
        c3524a.m16460c(strM16366a);
        c3524a.m16457b(strM16496b);
        c3524a.m16454a(c3525b.m16501e());
        if (this.f19206d == null) {
            this.f19206d = new ArrayList(2);
        }
        this.f19206d.add(c3524a);
        if (this.f19206d.size() > 10) {
            this.f19206d.remove(0);
        }
        this.f19207e = c3525b;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public String m16366a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0 || "0".equals(strTrim) || "unknown".equals(strTrim.toLowerCase(Locale.US))) {
            return null;
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: a */
    public void m16367a(C3525b c3525b) {
        this.f19207e = c3525b;
    }

    /* JADX INFO: renamed from: a */
    public void m16368a(C3526c c3526c) {
        this.f19207e = c3526c.m16533c().get(this.f19205c);
        List<C3524a> listM16539h = c3526c.m16539h();
        if (listM16539h == null || listM16539h.size() <= 0) {
            return;
        }
        if (this.f19206d == null) {
            this.f19206d = new ArrayList();
        }
        for (C3524a c3524a : listM16539h) {
            if (this.f19205c.equals(c3524a.f19300a)) {
                this.f19206d.add(c3524a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16369a(List<C3524a> list) {
        this.f19206d = list;
    }

    /* JADX INFO: renamed from: a */
    public boolean m16370a() {
        return m16365g();
    }

    /* JADX INFO: renamed from: b */
    public String m16371b() {
        return this.f19205c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m16372c() {
        C3525b c3525b = this.f19207e;
        return c3525b == null || c3525b.m16504h() <= 20;
    }

    /* JADX INFO: renamed from: d */
    public C3525b m16373d() {
        return this.f19207e;
    }

    /* JADX INFO: renamed from: e */
    public List<C3524a> m16374e() {
        return this.f19206d;
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo16375f();
}
