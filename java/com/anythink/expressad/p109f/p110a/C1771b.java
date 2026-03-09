package com.anythink.expressad.p109f.p110a;

import android.os.CountDownTimer;

/* JADX INFO: renamed from: com.anythink.expressad.f.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1771b {

    /* JADX INFO: renamed from: a */
    private static final long f10118a = 1000;

    /* JADX INFO: renamed from: b */
    private long f10119b = 0;

    /* JADX INFO: renamed from: c */
    private long f10120c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1770a f10121d;

    /* JADX INFO: renamed from: e */
    private a f10122e;

    /* JADX INFO: renamed from: com.anythink.expressad.f.a.b$a */
    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        private InterfaceC1770a f10123a;

        public a(long j, long j2) {
            super(j, j2);
        }

        /* JADX INFO: renamed from: a */
        public final void m8535a(InterfaceC1770a interfaceC1770a) {
            this.f10123a = interfaceC1770a;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: a */
    private C1771b m8529a(long j) {
        if (j < 0) {
            j = f10118a;
        }
        this.f10120c = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    private C1771b m8530a(InterfaceC1770a interfaceC1770a) {
        this.f10121d = interfaceC1770a;
        return this;
    }

    /* JADX INFO: renamed from: a */
    private void m8531a() {
        a aVar = this.f10122e;
        if (aVar != null) {
            aVar.cancel();
            this.f10122e = null;
        }
        if (this.f10120c <= 0) {
            this.f10120c = this.f10119b + f10118a;
        }
        a aVar2 = new a(this.f10119b, this.f10120c);
        this.f10122e = aVar2;
        aVar2.m8535a(this.f10121d);
    }

    /* JADX INFO: renamed from: b */
    private C1771b m8532b(long j) {
        this.f10119b = j;
        return this;
    }

    /* JADX INFO: renamed from: b */
    private void m8533b() {
        a aVar = this.f10122e;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f10122e = null;
            }
            if (this.f10120c <= 0) {
                this.f10120c = this.f10119b + f10118a;
            }
            a aVar2 = new a(this.f10119b, this.f10120c);
            this.f10122e = aVar2;
            aVar2.m8535a(this.f10121d);
        }
        this.f10122e.start();
    }

    /* JADX INFO: renamed from: c */
    private void m8534c() {
        a aVar = this.f10122e;
        if (aVar != null) {
            aVar.cancel();
            this.f10122e = null;
        }
    }
}
