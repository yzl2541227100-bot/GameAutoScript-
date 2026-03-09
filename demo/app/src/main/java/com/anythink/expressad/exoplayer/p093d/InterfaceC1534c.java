package com.anythink.expressad.exoplayer.p093d;

import android.os.Handler;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1534c {

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final CopyOnWriteArrayList<C4674a> f7951a = new CopyOnWriteArrayList<>();

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.c$a$a, reason: collision with other inner class name */
        public static final class C4674a {

            /* JADX INFO: renamed from: a */
            public final Handler f7961a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC1534c f7962b;

            public C4674a(Handler handler, InterfaceC1534c interfaceC1534c) {
                this.f7961a = handler;
                this.f7962b = interfaceC1534c;
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m6738a() {
            for (C4674a c4674a : this.f7951a) {
                final InterfaceC1534c interfaceC1534c = c4674a.f7962b;
                c4674a.f7961a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.d.c.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1534c.mo6190d();
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m6739a(Handler handler, InterfaceC1534c interfaceC1534c) {
            C1711a.m8010a((handler == null || interfaceC1534c == null) ? false : true);
            this.f7951a.add(new C4674a(handler, interfaceC1534c));
        }

        /* JADX INFO: renamed from: a */
        public final void m6740a(InterfaceC1534c interfaceC1534c) {
            for (C4674a c4674a : this.f7951a) {
                if (c4674a.f7962b == interfaceC1534c) {
                    this.f7951a.remove(c4674a);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m6741a(final Exception exc) {
            for (C4674a c4674a : this.f7951a) {
                final InterfaceC1534c interfaceC1534c = c4674a.f7962b;
                c4674a.f7961a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.d.c.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1534c.mo6176a(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m6742b() {
            for (C4674a c4674a : this.f7951a) {
                final InterfaceC1534c interfaceC1534c = c4674a.f7962b;
                c4674a.f7961a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.d.c.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1534c.mo6192e();
                    }
                });
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m6743c() {
            for (C4674a c4674a : this.f7951a) {
                final InterfaceC1534c interfaceC1534c = c4674a.f7962b;
                c4674a.f7961a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.d.c.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1534c.mo6193f();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo6176a(Exception exc);

    /* JADX INFO: renamed from: d */
    void mo6190d();

    /* JADX INFO: renamed from: e */
    void mo6192e();

    /* JADX INFO: renamed from: f */
    void mo6193f();
}
