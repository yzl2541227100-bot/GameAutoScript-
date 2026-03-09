package com.anythink.china.common.p033a;

import android.graphics.Bitmap;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p057g.InterfaceC1264b;

/* JADX INFO: renamed from: com.anythink.china.common.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1072e {

    /* JADX INFO: renamed from: a */
    public String f2445a;

    /* JADX INFO: renamed from: b */
    public String f2446b;

    /* JADX INFO: renamed from: c */
    public String f2447c;

    /* JADX INFO: renamed from: d */
    public Bitmap f2448d;

    /* JADX INFO: renamed from: e */
    public String f2449e;

    /* JADX INFO: renamed from: f */
    public String f2450f;

    /* JADX INFO: renamed from: g */
    public long f2451g;

    /* JADX INFO: renamed from: h */
    public long f2452h;

    /* JADX INFO: renamed from: i */
    public long f2453i;

    /* JADX INFO: renamed from: j */
    public AbstractC1247l f2454j;

    /* JADX INFO: renamed from: k */
    public String f2455k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1264b f2456l;

    /* JADX INFO: renamed from: m */
    public String f2457m;

    /* JADX INFO: renamed from: n */
    public String f2458n;

    /* JADX INFO: renamed from: p */
    public int f2460p;

    /* JADX INFO: renamed from: q */
    public int f2461q;

    /* JADX INFO: renamed from: o */
    public boolean f2459o = false;

    /* JADX INFO: renamed from: r */
    private volatile a f2462r = a.IDLE;

    /* JADX INFO: renamed from: com.anythink.china.common.a.e$a */
    public enum a {
        IDLE,
        LOADING,
        PAUSE,
        STOP,
        FINISH,
        FAIL,
        INSTALLED
    }

    /* JADX INFO: renamed from: o */
    private boolean m1504o() {
        return this.f2462r == a.STOP;
    }

    /* JADX INFO: renamed from: a */
    public final a m1505a() {
        return this.f2462r;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1506b() {
        return this.f2462r == a.IDLE;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1507c() {
        return this.f2462r == a.PAUSE;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1508d() {
        return this.f2462r == a.LOADING;
    }

    /* JADX INFO: renamed from: e */
    public final void m1509e() {
        this.f2462r = a.IDLE;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1510f() {
        return this.f2462r == a.INSTALLED;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1511g() {
        return this.f2462r == a.FINISH;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1512h() {
        return this.f2462r == a.FAIL;
    }

    /* JADX INFO: renamed from: i */
    public final void m1513i() {
        AbstractC1247l abstractC1247l = this.f2454j;
        if (abstractC1247l != null) {
            abstractC1247l.m3212l(4);
        }
        this.f2462r = a.LOADING;
    }

    /* JADX INFO: renamed from: j */
    public final void m1514j() {
        AbstractC1247l abstractC1247l = this.f2454j;
        if (abstractC1247l != null) {
            abstractC1247l.m3212l(7);
        }
        this.f2462r = a.STOP;
    }

    /* JADX INFO: renamed from: k */
    public final void m1515k() {
        AbstractC1247l abstractC1247l = this.f2454j;
        if (abstractC1247l != null) {
            abstractC1247l.m3212l(7);
        }
        this.f2462r = a.PAUSE;
    }

    /* JADX INFO: renamed from: l */
    public final void m1516l() {
        AbstractC1247l abstractC1247l = this.f2454j;
        if (abstractC1247l != null) {
            abstractC1247l.m3212l(5);
        }
        this.f2462r = a.FINISH;
    }

    /* JADX INFO: renamed from: m */
    public final void m1517m() {
        AbstractC1247l abstractC1247l = this.f2454j;
        if (abstractC1247l != null) {
            abstractC1247l.m3212l(2);
        }
        this.f2462r = a.INSTALLED;
    }

    /* JADX INFO: renamed from: n */
    public final void m1518n() {
        AbstractC1247l abstractC1247l = this.f2454j;
        if (abstractC1247l != null) {
            abstractC1247l.m3212l(6);
        }
        this.f2462r = a.FAIL;
    }
}
