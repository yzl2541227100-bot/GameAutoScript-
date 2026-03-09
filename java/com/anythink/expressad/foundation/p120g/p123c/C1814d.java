package com.anythink.expressad.foundation.p120g.p123c;

import android.util.Log;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p138h.C1884r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.c.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1814d {

    /* JADX INFO: renamed from: a */
    private static final String f11235a = "AnythinkDirManager";

    /* JADX INFO: renamed from: d */
    private static C1814d f11236d;

    /* JADX INFO: renamed from: b */
    private AbstractC1816f f11237b;

    /* JADX INFO: renamed from: c */
    private ArrayList<a> f11238c = new ArrayList<>();

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.c.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public EnumC1811a f11239a;

        /* JADX INFO: renamed from: b */
        public File f11240b;

        public a(EnumC1811a enumC1811a, File file) {
            this.f11239a = enumC1811a;
            this.f11240b = file;
        }
    }

    private C1814d(AbstractC1816f abstractC1816f) {
        this.f11237b = abstractC1816f;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C1814d m9403a() {
        if (f11236d == null && C1773a.m8548c().m8557e() != null) {
            C1884r.m9787a(C1773a.m8548c().m8557e());
        }
        if (f11236d == null) {
            Log.e(f11235a, "mDirectoryManager == null");
        }
        return f11236d;
    }

    /* JADX INFO: renamed from: a */
    public static File m9404a(EnumC1811a enumC1811a) {
        try {
            if (m9403a() == null || m9403a().f11238c == null || m9403a().f11238c.size() <= 0) {
                return null;
            }
            for (a aVar : m9403a().f11238c) {
                if (aVar.f11239a.equals(enumC1811a)) {
                    return aVar.f11240b;
                }
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m9405a(AbstractC1816f abstractC1816f) {
        if (f11236d == null) {
            f11236d = new C1814d(abstractC1816f);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m9406a(C1815e c1815e) {
        String strM9416b;
        C1815e c1815eM9417c = c1815e.m9417c();
        if (c1815eM9417c == null) {
            strM9416b = c1815e.m9416b();
        } else {
            File fileM9404a = m9404a(c1815eM9417c.m9411a());
            if (fileM9404a == null) {
                return false;
            }
            strM9416b = fileM9404a.getAbsolutePath() + File.separator + c1815e.m9416b();
        }
        File file = new File(strM9416b);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f11238c.add(new a(c1815e.m9411a(), file));
        List<C1815e> listM9418d = c1815e.m9418d();
        if (listM9418d != null) {
            Iterator<C1815e> it = listM9418d.iterator();
            while (it.hasNext()) {
                if (!m9406a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static String m9407b(EnumC1811a enumC1811a) {
        File fileM9404a = m9404a(enumC1811a);
        if (fileM9404a != null) {
            return fileM9404a.getAbsolutePath();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9408b() {
        return m9406a(this.f11237b.m9420b());
    }
}
