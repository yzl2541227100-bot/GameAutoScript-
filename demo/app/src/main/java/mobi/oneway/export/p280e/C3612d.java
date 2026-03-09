package mobi.oneway.export.p280e;

import com.anythink.expressad.exoplayer.C1575f;

/* JADX INFO: renamed from: mobi.oneway.export.e.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3612d extends Thread {

    /* JADX INFO: renamed from: a */
    private a f19720a;

    /* JADX INFO: renamed from: b */
    private long f19721b;

    /* JADX INFO: renamed from: c */
    private long f19722c;

    /* JADX INFO: renamed from: d */
    private boolean f19723d = false;

    /* JADX INFO: renamed from: mobi.oneway.export.e.d$a */
    public interface a {
        void timeout();
    }

    public C3612d(a aVar, long j) {
        this.f19721b = C1575f.f8394a;
        this.f19720a = aVar;
        if (j != 0) {
            this.f19721b = j;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        this.f19722c = System.currentTimeMillis();
        while (!C3610b.m16807a().m16815d() && !this.f19723d) {
            if (System.currentTimeMillis() - this.f19722c > this.f19721b) {
                this.f19723d = true;
                if (this.f19720a != null) {
                    C3610b.m16807a().m16814c(new Runnable() { // from class: mobi.oneway.export.e.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C3612d.this.f19720a.timeout();
                        }
                    });
                }
            }
        }
    }
}
