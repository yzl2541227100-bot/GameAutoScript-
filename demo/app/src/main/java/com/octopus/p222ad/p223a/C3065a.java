package com.octopus.p222ad.p223a;

import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.octopus.ad.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3065a {

    /* JADX INFO: renamed from: a */
    private Timer f16696a;

    /* JADX INFO: renamed from: b */
    private Handler f16697b;

    /* JADX INFO: renamed from: c */
    private long f16698c;

    /* JADX INFO: renamed from: d */
    private long f16699d;

    /* JADX INFO: renamed from: e */
    private long f16700e;

    /* JADX INFO: renamed from: f */
    private InterfaceC3066b f16701f;

    /* JADX INFO: renamed from: g */
    private EnumC3067c f16702g;

    private C3065a() {
        this.f16702g = EnumC3067c.FINISH;
        this.f16697b = new Handler();
    }

    public C3065a(long j, long j2) {
        this.f16702g = EnumC3067c.FINISH;
        m13846a(j);
        m13850b(j2);
        this.f16697b = new Handler();
    }

    /* JADX INFO: renamed from: a */
    private void m13846a(long j) {
        this.f16698c = j;
        this.f16700e = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m13848a(final boolean z) {
        if (this.f16696a != null) {
            m13853f();
            this.f16702g = EnumC3067c.FINISH;
            this.f16697b.post(new Runnable() { // from class: com.octopus.ad.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C3065a.this.f16701f != null) {
                        if (z) {
                            C3065a.this.f16701f.mo13862b();
                        } else {
                            C3065a.this.f16701f.mo13860a();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    private void m13850b(long j) {
        this.f16699d = j;
    }

    /* JADX INFO: renamed from: f */
    private void m13853f() {
        this.f16696a.cancel();
        this.f16696a.purge();
        this.f16696a = null;
    }

    /* JADX INFO: renamed from: a */
    public void m13854a() {
        if (this.f16696a == null) {
            EnumC3067c enumC3067c = this.f16702g;
            EnumC3067c enumC3067c2 = EnumC3067c.START;
            if (enumC3067c != enumC3067c2) {
                Timer timer = new Timer();
                this.f16696a = timer;
                timer.scheduleAtFixedRate(m13859e(), 0L, this.f16699d);
                this.f16702g = enumC3067c2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13855a(InterfaceC3066b interfaceC3066b) {
        this.f16701f = interfaceC3066b;
    }

    /* JADX INFO: renamed from: b */
    public void m13856b() {
        if (this.f16696a == null || this.f16702g != EnumC3067c.START) {
            return;
        }
        m13853f();
        this.f16702g = EnumC3067c.PAUSE;
    }

    /* JADX INFO: renamed from: c */
    public void m13857c() {
        if (this.f16702g == EnumC3067c.PAUSE) {
            m13854a();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m13858d() {
        m13848a(true);
    }

    /* JADX INFO: renamed from: e */
    public TimerTask m13859e() {
        return new TimerTask() { // from class: com.octopus.ad.a.a.2

            /* JADX INFO: renamed from: b */
            private long f16706b = -1;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (this.f16706b < 0) {
                    this.f16706b = scheduledExecutionTime() - (C3065a.this.f16698c - C3065a.this.f16700e);
                    C3065a.this.f16697b.post(new Runnable() { // from class: com.octopus.ad.a.a.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (C3065a.this.f16701f != null) {
                                C3065a.this.f16701f.mo13861a(C3065a.this.f16700e);
                            }
                        }
                    });
                    return;
                }
                C3065a c3065a = C3065a.this;
                c3065a.f16700e = c3065a.f16698c - (scheduledExecutionTime() - this.f16706b);
                C3065a.this.f16697b.post(new Runnable() { // from class: com.octopus.ad.a.a.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C3065a.this.f16701f != null) {
                            C3065a.this.f16701f.mo13861a(C3065a.this.f16700e);
                        }
                    }
                });
                if (C3065a.this.f16700e <= 0) {
                    C3065a.this.m13848a(false);
                }
            }
        };
    }
}
