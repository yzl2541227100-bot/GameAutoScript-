package com.anythink.expressad.foundation.p120g.p135g;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.g.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1861a implements Runnable {

    /* JADX INFO: renamed from: b */
    public static long f11465b;

    /* JADX INFO: renamed from: c */
    public a f11466c = a.READY;

    /* JADX INFO: renamed from: d */
    public b f11467d;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.g.a$a */
    public enum a {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.g.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo5268a(a aVar);
    }

    public AbstractRunnableC1861a() {
        f11465b++;
    }

    /* JADX INFO: renamed from: a */
    private void m9642a(a aVar) {
        this.f11466c = aVar;
        b bVar = this.f11467d;
        if (bVar != null) {
            bVar.mo5268a(aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9643a(b bVar) {
        this.f11467d = bVar;
    }

    /* JADX INFO: renamed from: d */
    private a m9644d() {
        return this.f11466c;
    }

    /* JADX INFO: renamed from: e */
    public static long m9645e() {
        return f11465b;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5269a();

    /* JADX INFO: renamed from: b */
    public abstract void mo5270b();

    /* JADX INFO: renamed from: c */
    public abstract void mo5271c();

    /* JADX INFO: renamed from: f */
    public final void m9646f() {
        a aVar = this.f11466c;
        a aVar2 = a.CANCEL;
        if (aVar != aVar2) {
            m9642a(aVar2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9647g() {
        a aVar = this.f11466c;
        if (aVar == a.PAUSE || aVar == a.CANCEL || aVar == a.FINISH) {
            return;
        }
        m9642a(a.RUNNING);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f11466c == a.READY) {
                m9642a(a.RUNNING);
                mo5269a();
                m9642a(a.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
