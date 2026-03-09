package com.anythink.expressad.video.dynview.p166i.p169c;

import android.os.CountDownTimer;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.i.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2096b {

    /* JADX INFO: renamed from: a */
    private static final long f13261a = 1000;

    /* JADX INFO: renamed from: b */
    private long f13262b = 0;

    /* JADX INFO: renamed from: c */
    private long f13263c;

    /* JADX INFO: renamed from: d */
    private InterfaceC2095a f13264d;

    /* JADX INFO: renamed from: e */
    private a f13265e;

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.i.c.b$a */
    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        private InterfaceC2095a f13266a;

        public a(long j, long j2) {
            super(j, j2);
        }

        /* JADX INFO: renamed from: a */
        public final void m11208a(InterfaceC2095a interfaceC2095a) {
            this.f13266a = interfaceC2095a;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            InterfaceC2095a interfaceC2095a = this.f13266a;
            if (interfaceC2095a != null) {
                interfaceC2095a.mo11199a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            InterfaceC2095a interfaceC2095a = this.f13266a;
            if (interfaceC2095a != null) {
                interfaceC2095a.mo11200a(j);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m11201d() {
        a aVar = this.f13265e;
        if (aVar != null) {
            aVar.cancel();
            this.f13265e = null;
        }
        if (this.f13263c <= 0) {
            this.f13263c = this.f13262b + f13261a;
        }
        a aVar2 = new a(this.f13262b, this.f13263c);
        this.f13265e = aVar2;
        aVar2.m11208a(this.f13264d);
    }

    /* JADX INFO: renamed from: a */
    public final C2096b m11202a() {
        this.f13263c = f13261a;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2096b m11203a(long j) {
        this.f13262b = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2096b m11204a(InterfaceC2095a interfaceC2095a) {
        this.f13264d = interfaceC2095a;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m11205a(long j, InterfaceC2095a interfaceC2095a) {
        this.f13262b = j;
        this.f13264d = interfaceC2095a;
        m11201d();
        a aVar = this.f13265e;
        if (aVar != null) {
            aVar.start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11206b() {
        if (this.f13265e == null) {
            m11201d();
        }
        this.f13265e.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m11207c() {
        a aVar = this.f13265e;
        if (aVar != null) {
            aVar.cancel();
            this.f13265e = null;
        }
    }
}
