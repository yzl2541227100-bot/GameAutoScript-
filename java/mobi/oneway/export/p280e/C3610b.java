package mobi.oneway.export.p280e;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: mobi.oneway.export.e.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3610b {

    /* JADX INFO: renamed from: a */
    private static List<Runnable> f19715a;

    /* JADX INFO: renamed from: c */
    private static C3610b f19716c;

    /* JADX INFO: renamed from: d */
    private static Handler f19717d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    private volatile boolean f19718b;

    private C3610b() {
    }

    /* JADX INFO: renamed from: a */
    public static C3610b m16807a() {
        if (f19716c == null) {
            f19716c = new C3610b();
        }
        return f19716c;
    }

    /* JADX INFO: renamed from: e */
    private static void m16808e() {
        List<Runnable> list = f19715a;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            f19717d.post(it.next());
        }
        f19715a.clear();
    }

    /* JADX INFO: renamed from: f */
    private void m16809f() {
        if (f19715a == null) {
            f19715a = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16810a(Runnable runnable) {
        try {
            if (this.f19718b) {
                f19717d.post(runnable);
            } else {
                m16809f();
                f19715a.add(runnable);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m16811b() {
        this.f19718b = false;
        m16809f();
    }

    /* JADX INFO: renamed from: b */
    public void m16812b(Runnable runnable) {
        try {
            f19715a.remove(runnable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public void m16813c() {
        this.f19718b = true;
        m16808e();
    }

    /* JADX INFO: renamed from: c */
    public void m16814c(Runnable runnable) {
        f19717d.post(runnable);
    }

    /* JADX INFO: renamed from: d */
    public boolean m16815d() {
        return this.f19718b;
    }
}
