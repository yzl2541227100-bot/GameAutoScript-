package mobi.oneway.export.p278c;

import java.io.File;
import mobi.oneway.export.p274a.C3581a;
import mobi.oneway.export.p279d.C3608f;
import mobi.oneway.export.p283g.C3636h;

/* JADX INFO: renamed from: mobi.oneway.export.c.b */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC3600b implements Runnable {

    /* JADX INFO: renamed from: a */
    private File f19659a;

    public RunnableC3600b(File file) {
        this.f19659a = file;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            new C3608f(C3581a.f19604e, C3581a.f19602c).m16766a(C3636h.m16971i(this.f19659a)).m16780c("POST").m16792n();
            this.f19659a.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
