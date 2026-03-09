package com.iflytek.voiceads.download.p212b;

import com.iflytek.voiceads.download.p212b.p213a.RunnableC2928a;
import com.iflytek.voiceads.download.p212b.p214b.RunnableC2930a;
import com.iflytek.voiceads.download.p216d.C2938a;
import com.iflytek.voiceads.download.p216d.C2939b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.b.d */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2932d implements RunnableC2928a.a, RunnableC2930a.a {

    /* JADX INFO: renamed from: a */
    private ExecutorService f16264a;

    /* JADX INFO: renamed from: b */
    private InterfaceC2927a f16265b;

    /* JADX INFO: renamed from: c */
    private C2938a f16266c;

    /* JADX INFO: renamed from: e */
    private a f16268e;

    /* JADX INFO: renamed from: g */
    private long f16270g;

    /* JADX INFO: renamed from: f */
    private long f16269f = System.currentTimeMillis();

    /* JADX INFO: renamed from: h */
    private volatile AtomicBoolean f16271h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    private List<RunnableC2930a> f16267d = new ArrayList();

    /* JADX INFO: renamed from: com.iflytek.voiceads.download.b.d$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo13309c(C2938a c2938a);

        /* JADX INFO: renamed from: d */
        void mo13310d(C2938a c2938a);
    }

    public C2932d(ExecutorService executorService, InterfaceC2927a interfaceC2927a, C2938a c2938a, a aVar) {
        this.f16264a = executorService;
        this.f16265b = interfaceC2927a;
        this.f16266c = c2938a;
        this.f16268e = aVar;
    }

    /* JADX INFO: renamed from: f */
    private void m13325f() {
        this.f16270g = 0L;
        Iterator<C2939b> it = this.f16266c.m13389j().iterator();
        while (it.hasNext()) {
            this.f16270g += it.next().m13398d();
        }
        this.f16266c.m13380b(this.f16270g);
    }

    /* JADX INFO: renamed from: a */
    public void m13326a() {
        if (this.f16266c.m13383d() <= 0) {
            this.f16264a.submit(new RunnableC2928a(this.f16265b, this.f16266c, this));
            return;
        }
        Iterator<C2939b> it = this.f16266c.m13389j().iterator();
        while (it.hasNext()) {
            RunnableC2930a runnableC2930a = new RunnableC2930a(it.next(), this.f16265b, this.f16266c, this);
            this.f16264a.submit(runnableC2930a);
            this.f16267d.add(runnableC2930a);
        }
        this.f16266c.m13371a(2);
        this.f16265b.mo13315a(this.f16266c);
    }

    @Override // com.iflytek.voiceads.download.p212b.p213a.RunnableC2928a.a
    /* JADX INFO: renamed from: a */
    public void mo13318a(long j, boolean z) {
        this.f16266c.m13377a(z);
        this.f16266c.m13372a(j);
        ArrayList arrayList = new ArrayList();
        if (z) {
            long jM13383d = this.f16266c.m13383d();
            long j2 = jM13383d / ((long) 2);
            int i = 0;
            while (i < 2) {
                long j3 = j2 * ((long) i);
                C2939b c2939b = new C2939b(this.f16266c.m13378b(), j3, i == 1 ? jM13383d : (j3 + j2) - 1);
                arrayList.add(c2939b);
                RunnableC2930a runnableC2930a = new RunnableC2930a(c2939b, this.f16265b, this.f16266c, this);
                this.f16264a.submit(runnableC2930a);
                this.f16267d.add(runnableC2930a);
                i++;
            }
        } else {
            C2939b c2939b2 = new C2939b(this.f16266c.m13378b(), 0L, this.f16266c.m13383d());
            arrayList.add(c2939b2);
            RunnableC2930a runnableC2930a2 = new RunnableC2930a(c2939b2, this.f16265b, this.f16266c, this);
            this.f16264a.submit(runnableC2930a2);
            this.f16267d.add(runnableC2930a2);
        }
        this.f16266c.m13376a(arrayList);
        this.f16266c.m13371a(2);
        this.f16265b.mo13315a(this.f16266c);
    }

    @Override // com.iflytek.voiceads.download.p212b.p213a.RunnableC2928a.a
    /* JADX INFO: renamed from: b */
    public void mo13319b() {
        this.f16268e.mo13310d(this.f16266c);
    }

    @Override // com.iflytek.voiceads.download.p212b.p214b.RunnableC2930a.a
    /* JADX INFO: renamed from: c */
    public void mo13322c() {
        if (this.f16271h.get()) {
            return;
        }
        synchronized (this) {
            if (!this.f16271h.get()) {
                this.f16271h.set(true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f16269f > 1000) {
                    m13325f();
                    this.f16265b.mo13315a(this.f16266c);
                    this.f16269f = jCurrentTimeMillis;
                }
                this.f16271h.set(false);
            }
        }
    }

    @Override // com.iflytek.voiceads.download.p212b.p214b.RunnableC2930a.a
    /* JADX INFO: renamed from: d */
    public void mo13323d() {
        m13325f();
        if (this.f16266c.m13384e() == this.f16266c.m13383d()) {
            this.f16266c.m13371a(4);
            this.f16265b.mo13315a(this.f16266c);
            if (this.f16268e != null) {
                this.f16268e.mo13309c(this.f16266c);
            }
        }
    }

    @Override // com.iflytek.voiceads.download.p212b.p214b.RunnableC2930a.a
    /* JADX INFO: renamed from: e */
    public void mo13324e() {
        this.f16268e.mo13310d(this.f16266c);
    }
}
